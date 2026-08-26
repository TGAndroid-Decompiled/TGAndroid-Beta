package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TooManyCommunitiesHintCell;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class TooManyCommunitiesActivity extends BaseFragment {
    public Adapter adapter;
    public int buttonAnimation;
    public final int buttonHeight;
    public TopicsFragment.AnonymousClass14 buttonLayout;
    public TextView buttonTextView;
    public EmptyTextProgressView emptyView;
    public ValueAnimator enterAnimator;
    public float enterProgress;
    public TooManyCommunitiesHintCell hintCell;
    public final ArrayList inactiveChats;
    public final ArrayList inactiveChatsSignatures;
    public RecyclerListView listView;
    public final TopicsFragment$$ExternalSyntheticLambda9 onItemClickListener;
    public final TodoItemMenu$$ExternalSyntheticLambda3 onItemLongClickListener;
    public RadialProgressView progressBar;
    public SearchAdapter searchAdapter;
    public RecyclerListView searchListView;
    public FrameLayout searchViewContainer;
    public final HashSet selectedIds;
    public final LaunchActivity.AnonymousClass18 showProgressRunnable;
    public int type;

    public final class AnonymousClass6 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final TooManyCommunitiesActivity this$0;

        public AnonymousClass6(TooManyCommunitiesActivity tooManyCommunitiesActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = tooManyCommunitiesActivity;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    TooManyCommunitiesActivity tooManyCommunitiesActivity = this.this$0;
                    tooManyCommunitiesActivity.buttonAnimation = 0;
                    tooManyCommunitiesActivity.buttonLayout.setVisibility(8);
                    break;
                case 1:
                    this.this$0.buttonAnimation = 0;
                    break;
                default:
                    this.this$0.progressBar.setVisibility(8);
                    break;
            }
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public int endPaddingPosition;
        public int headerPosition;
        public int inactiveChatsEndRow;
        public int inactiveChatsStartRow;
        public int rowCount;
        public int shadowPosition;

        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            if (i == this.shadowPosition) {
                return 2;
            }
            if (i == this.headerPosition) {
                return 3;
            }
            return i == this.endPaddingPosition ? 5 : 4;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() >= this.inactiveChatsStartRow && viewHolder.getAdapterPosition() < this.inactiveChatsEndRow;
        }

        @Override
        public final void notifyDataSetChanged() {
            updateRows$2();
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = this.headerPosition;
            TooManyCommunitiesActivity tooManyCommunitiesActivity = TooManyCommunitiesActivity.this;
            View view = viewHolder.itemView;
            if (i < i2 || i2 <= 0) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(tooManyCommunitiesActivity.enterProgress);
            }
            if (getItemViewType(i) == 4) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                TLRPC.Chat chat = (TLRPC.Chat) tooManyCommunitiesActivity.inactiveChats.get(i - this.inactiveChatsStartRow);
                String str = (String) tooManyCommunitiesActivity.inactiveChatsSignatures.get(i - this.inactiveChatsStartRow);
                String str2 = chat.title;
                boolean z = i != this.inactiveChatsEndRow - 1;
                groupCreateUserCell.setObject(chat, str2, str);
                groupCreateUserCell.drawDivider = z;
                groupCreateUserCell.setChecked(tooManyCommunitiesActivity.selectedIds.contains(Long.valueOf(chat.id)), false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            String string;
            View groupCreateUserCell;
            if (i == 1) {
                TooManyCommunitiesHintCell tooManyCommunitiesHintCell = new TooManyCommunitiesHintCell(viewGroup.getContext());
                TooManyCommunitiesActivity tooManyCommunitiesActivity = TooManyCommunitiesActivity.this;
                tooManyCommunitiesActivity.hintCell = tooManyCommunitiesHintCell;
                int i2 = tooManyCommunitiesActivity.type;
                if (i2 == 0) {
                    string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
                } else {
                    string = i2 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
                }
                tooManyCommunitiesActivity.hintCell.setMessageText(string);
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(16.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.dp(23.0f);
                tooManyCommunitiesActivity.hintCell.setLayoutParams(layoutParams);
                groupCreateUserCell = tooManyCommunitiesHintCell;
            } else if (i == 2) {
                View shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), (Object) null);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(viewGroup.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.fullSize = true;
                shadowSectionCell.setBackground(combinedDrawable);
                groupCreateUserCell = shadowSectionCell;
            } else if (i != 3) {
                groupCreateUserCell = i != 5 ? new GroupCreateUserCell(1, 0, viewGroup.getContext(), null, false, false) : new EmptyCell(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                HeaderCell headerCell = new HeaderCell(viewGroup.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 8, false);
                headerCell.setHeight(54);
                headerCell.setText(LocaleController.getString(R.string.InactiveChats));
                groupCreateUserCell = headerCell;
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        public final void updateRows$2() {
            this.headerPosition = -1;
            this.inactiveChatsStartRow = -1;
            this.inactiveChatsEndRow = -1;
            this.endPaddingPosition = -1;
            this.rowCount = 2;
            this.shadowPosition = 1;
            TooManyCommunitiesActivity tooManyCommunitiesActivity = TooManyCommunitiesActivity.this;
            if (tooManyCommunitiesActivity.inactiveChats.isEmpty()) {
                return;
            }
            int i = this.rowCount;
            int i2 = i + 1;
            this.headerPosition = i;
            int i3 = i + 2;
            this.rowCount = i3;
            this.inactiveChatsStartRow = i2;
            int size = (tooManyCommunitiesActivity.inactiveChats.size() - 1) + i3;
            this.inactiveChatsEndRow = size;
            this.rowCount = size + 1;
            this.endPaddingPosition = size;
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int lastSearchId;
        public final ArrayList searchResults = new ArrayList();
        public final ArrayList searchResultsSignatures = new ArrayList();
        public TooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0 searchRunnable;

        public SearchAdapter() {
        }

        @Override
        public final int getItemCount() {
            return this.searchResults.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList arrayList = this.searchResults;
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
            String str = (String) this.searchResultsSignatures.get(i);
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            String str2 = chat.title;
            boolean z = i != arrayList.size() - 1;
            groupCreateUserCell.setObject(chat, str2, str);
            groupCreateUserCell.drawDivider = z;
            groupCreateUserCell.setChecked(TooManyCommunitiesActivity.this.selectedIds.contains(Long.valueOf(chat.id)), false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new GroupCreateUserCell(1, 0, viewGroup.getContext(), null, false, false));
        }
    }

    public TooManyCommunitiesActivity(int i) {
        super(null);
        this.inactiveChats = new ArrayList();
        this.inactiveChatsSignatures = new ArrayList();
        this.selectedIds = new HashSet();
        this.buttonHeight = AndroidUtilities.dp(64.0f);
        int i2 = 22;
        this.showProgressRunnable = new LaunchActivity.AnonymousClass18(this, i2);
        this.onItemClickListener = new TopicsFragment$$ExternalSyntheticLambda9(this, i2);
        this.onItemLongClickListener = new TodoItemMenu$$ExternalSyntheticLambda3(this, 3);
        this.arguments = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(i, "type");
    }

    @Override
    public final View createView(Context context) {
        int i = 9;
        this.type = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 29));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new OKLCH() {
            public boolean expanded = false;

            public final class AnonymousClass1 extends AnimatorListenerAdapter {
                public final int $r8$classId;
                public final AnonymousClass3 this$1;

                public AnonymousClass1(AnonymousClass3 anonymousClass3, int i) {
                    this.$r8$classId = i;
                    this.this$1 = anonymousClass3;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (this.$r8$classId) {
                        case 0:
                            TooManyCommunitiesActivity.this.searchViewContainer.setVisibility(8);
                            break;
                        default:
                            TooManyCommunitiesActivity.this.listView.setVisibility(8);
                            break;
                    }
                }
            }

            @Override
            public final void onSearchCollapse() {
                TooManyCommunitiesActivity tooManyCommunitiesActivity = TooManyCommunitiesActivity.this;
                if (tooManyCommunitiesActivity.listView.getVisibility() != 0) {
                    tooManyCommunitiesActivity.listView.setVisibility(0);
                    tooManyCommunitiesActivity.listView.setAlpha(0.0f);
                }
                tooManyCommunitiesActivity.emptyView.setVisibility(8);
                Adapter adapter = tooManyCommunitiesActivity.adapter;
                adapter.updateRows$2();
                adapter.mObservable.notifyChanged();
                tooManyCommunitiesActivity.listView.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
                tooManyCommunitiesActivity.searchViewContainer.animate().alpha(0.0f).setDuration(150L).setListener(new AnonymousClass1(this, 0)).start();
                this.expanded = false;
            }

            @Override
            public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
                String string = editTextBoldCursor.getText().toString();
                SearchAdapter searchAdapter = TooManyCommunitiesActivity.this.searchAdapter;
                if (searchAdapter.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(searchAdapter.searchRunnable);
                    searchAdapter.searchRunnable = null;
                }
                if (TextUtils.isEmpty(string)) {
                    searchAdapter.searchResults.clear();
                    searchAdapter.searchResultsSignatures.clear();
                    searchAdapter.mObservable.notifyChanged();
                    TooManyCommunitiesActivity.this.emptyView.setVisibility(8);
                } else {
                    int i2 = searchAdapter.lastSearchId + 1;
                    searchAdapter.lastSearchId = i2;
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    TooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0 tooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0 = new TooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, string, i2, 0);
                    searchAdapter.searchRunnable = tooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0;
                    dispatchQueue.postRunnable(tooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0, 300L);
                }
                if (this.expanded || TextUtils.isEmpty(string)) {
                    if (this.expanded && TextUtils.isEmpty(string)) {
                        onSearchCollapse();
                        return;
                    }
                    return;
                }
                if (TooManyCommunitiesActivity.this.searchViewContainer.getVisibility() != 0) {
                    TooManyCommunitiesActivity.this.searchViewContainer.setVisibility(0);
                    TooManyCommunitiesActivity.this.searchViewContainer.setAlpha(0.0f);
                }
                TooManyCommunitiesActivity.this.listView.animate().alpha(0.0f).setDuration(150L).setListener(new AnonymousClass1(this, 1)).start();
                TooManyCommunitiesActivity.this.searchAdapter.searchResultsSignatures.clear();
                TooManyCommunitiesActivity.this.searchAdapter.searchResults.clear();
                TooManyCommunitiesActivity.this.searchAdapter.mObservable.notifyChanged();
                TooManyCommunitiesActivity.this.searchViewContainer.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
                this.expanded = true;
            }
        };
        int i2 = R.string.Search;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(i2));
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(i2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        zzku.m(recyclerListView);
        RecyclerListView recyclerListView2 = this.listView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.listView.setClipToPadding(false);
        RecyclerListView recyclerListView3 = this.listView;
        TopicsFragment$$ExternalSyntheticLambda9 topicsFragment$$ExternalSyntheticLambda9 = this.onItemClickListener;
        recyclerListView3.setOnItemClickListener(topicsFragment$$ExternalSyntheticLambda9);
        RecyclerListView recyclerListView4 = this.listView;
        TodoItemMenu$$ExternalSyntheticLambda3 todoItemMenu$$ExternalSyntheticLambda3 = this.onItemLongClickListener;
        recyclerListView4.setOnItemLongClickListener(todoItemMenu$$ExternalSyntheticLambda3);
        RecyclerListView recyclerListView5 = new RecyclerListView(context, null);
        this.searchListView = recyclerListView5;
        zzku.m(recyclerListView5);
        RecyclerListView recyclerListView6 = this.searchListView;
        SearchAdapter searchAdapter = new SearchAdapter();
        this.searchAdapter = searchAdapter;
        recyclerListView6.setAdapter(searchAdapter);
        this.searchListView.setOnItemClickListener(topicsFragment$$ExternalSyntheticLambda9);
        this.searchListView.setOnItemLongClickListener(todoItemMenu$$ExternalSyntheticLambda3);
        this.searchListView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 17));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setShowAtCenter(true);
        this.emptyView.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.showTextView();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.progressBar = radialProgressView;
        frameLayout.addView(radialProgressView, LayoutHelper.createFrame(-2.0f, -2));
        this.adapter.updateRows$2();
        this.progressBar.setVisibility(8);
        frameLayout.addView(this.listView);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.searchViewContainer = frameLayout2;
        frameLayout2.addView(this.searchListView);
        this.searchViewContainer.addView(this.emptyView);
        this.searchViewContainer.setVisibility(8);
        frameLayout.addView(this.searchViewContainer);
        Adapter adapter2 = this.adapter;
        adapter2.updateRows$2();
        adapter2.mObservable.notifyChanged();
        this.enterProgress = 0.0f;
        AndroidUtilities.runOnUIThread(this.showProgressRunnable, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new RichMediaUploader$$ExternalSyntheticLambda0(this, i));
        View view = this.fragmentView;
        int i3 = Theme.key_windowBackgroundWhite;
        view.setBackgroundColor(Theme.getColor(null, i3, false));
        TopicsFragment.AnonymousClass14 anonymousClass14 = new TopicsFragment.AnonymousClass14(context, i);
        this.buttonLayout = anonymousClass14;
        anonymousClass14.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.buttonTextView = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
        frameLayout.addView(this.buttonLayout, LayoutHelper.createFrame(-1, 64, 80));
        this.buttonLayout.setBackgroundColor(Theme.getColor(null, i3, false));
        this.buttonLayout.addView(this.buttonTextView, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.buttonLayout.setVisibility(8);
        this.buttonTextView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(20, this);
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar, 64, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        int i2 = Theme.key_chats_nameMessage_threeLines;
        arrayList.add(new ThemeDescription(this.hintCell, 0, new Class[]{TooManyCommunitiesHintCell.class}, new String[]{"imageView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.hintCell, 0, new Class[]{TooManyCommunitiesHintCell.class}, new String[]{"headerTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.hintCell, 0, new Class[]{TooManyCommunitiesHintCell.class}, new String[]{"messageTextView"}, null, null, -1, null, Theme.key_chats_message));
        View view = this.fragmentView;
        int i3 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.buttonLayout, 1, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i4 = Theme.key_groupcreate_sectionText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        int i5 = Theme.key_checkbox;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        int i6 = Theme.key_checkboxDisabled;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, i6));
        int i7 = Theme.key_checkboxCheck;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, i7));
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i8));
        int i9 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, i9));
        Drawable[] drawableArr = Theme.avatarDrawables;
        int i10 = Theme.key_avatar_text;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, drawableArr, null, i10));
        arrayList.add(new ThemeDescription(this.searchListView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.searchListView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.searchListView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.searchListView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.searchListView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.searchListView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{GroupCreateUserCell.class}, null, drawableArr, null, i10));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.buttonTextView, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_featuredStickers_addButton));
        TextView textView = this.buttonTextView;
        int i11 = Theme.key_featuredStickers_addButtonPressed;
        arrayList.add(new ThemeDescription(textView, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i11));
        arrayList.add(new ThemeDescription(this.progressBar, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i11));
        arrayList.add(new ThemeDescription(this.hintCell, 0, new Class[]{TooManyCommunitiesHintCell.class}, new String[]{"imageLayout"}, null, null, -1, null, Theme.key_text_RedRegular));
        return arrayList;
    }
}
