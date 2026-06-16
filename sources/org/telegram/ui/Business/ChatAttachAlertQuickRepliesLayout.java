package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;

public class ChatAttachAlertQuickRepliesLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private final BoolAnimator animatorFadeVisible;
    private final EmptyTextProgressView emptyView;
    private final View fadeView;
    private final FrameLayout frameLayout;
    private final FillLastLinearLayoutManager layoutManager;
    private final ShareAdapter listAdapter;
    private final RecyclerListView listView;
    private final ShareSearchAdapter searchAdapter;
    private final FragmentSearchField searchField;
    private final HashSet selectedReplies;

    public static class UserCell extends FrameLayout {
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public void onDestroy() {
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
    }

    @Override
    public boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
        return false;
    }

    public ChatAttachAlertQuickRepliesLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.animatorFadeVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.selectedReplies = new HashSet();
        this.searchAdapter = new ShareSearchAdapter(context);
        ChatAttachAlert.SearchFadeView searchFadeView = new ChatAttachAlert.SearchFadeView(context, Theme.key_windowBackgroundWhite, resourcesProvider);
        this.fadeView = searchFadeView;
        searchFadeView.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        ChatAttachAlert.AttachSearchField attachSearchField = new ChatAttachAlert.AttachSearchField(context, this.parentAlert, resourcesProvider);
        this.searchField = attachSearchField;
        attachSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        attachSearchField.editText.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String string = editable.toString();
                if (!string.isEmpty()) {
                    if (ChatAttachAlertQuickRepliesLayout.this.emptyView != null) {
                        ChatAttachAlertQuickRepliesLayout.this.emptyView.setText(LocaleController.getString(R.string.NoResult));
                    }
                } else if (ChatAttachAlertQuickRepliesLayout.this.listView.getAdapter() != ChatAttachAlertQuickRepliesLayout.this.listAdapter) {
                    int currentTop = ChatAttachAlertQuickRepliesLayout.this.getCurrentTop();
                    ChatAttachAlertQuickRepliesLayout.this.emptyView.showTextView();
                    ChatAttachAlertQuickRepliesLayout.this.listView.setAdapter(ChatAttachAlertQuickRepliesLayout.this.listAdapter);
                    ChatAttachAlertQuickRepliesLayout.this.listAdapter.notifyDataSetChanged();
                    if (currentTop > 0) {
                        ChatAttachAlertQuickRepliesLayout.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                    }
                }
                if (ChatAttachAlertQuickRepliesLayout.this.searchAdapter != null) {
                    ChatAttachAlertQuickRepliesLayout.this.searchAdapter.search(string);
                }
            }
        });
        attachSearchField.editText.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(searchFadeView, LayoutHelper.createFrameMatchParent());
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(attachSearchField, layoutParamsCreateFrame);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null, resourcesProvider);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) ((((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).parentAlert.scrollOffsetY[0] + AndroidUtilities.dp(30.0f)) + (!((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).parentAlert.inBubbleMode ? AndroidUtilities.statusBarHeight : 0)));
            }

            @Override
            public void onScrolled(int i, int i2) {
                super.onScrolled(i, i2);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.iBlur3Capture = recyclerListView;
        this.iBlur3CaptureView = recyclerListView;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        NotificationCenter.getGlobalInstance().listen(recyclerListView, NotificationCenter.emojiLoaded, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$new$1((Object[]) obj);
            }
        });
        recyclerListView.setClipToPadding(false);
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(getContext(), 1, false, AndroidUtilities.dp(9.0f), recyclerListView) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i2) {
                        return super.calculateDyToMakeVisible(view, i2) - ((ChatAttachAlertQuickRepliesLayout.this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f));
                    }

                    @Override
                    protected int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        fillLastLinearLayoutManager.setBind(false);
        recyclerListView.setHorizontalScrollBarEnabled(false);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ShareAdapter shareAdapter = new ShareAdapter(context);
        this.listAdapter = shareAdapter;
        recyclerListView.setAdapter(shareAdapter);
        recyclerListView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                this.f$0.lambda$new$3(view, i);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).parentAlert.updateLayout(ChatAttachAlertQuickRepliesLayout.this, true, i2);
                ChatAttachAlertQuickRepliesLayout.this.updateEmptyViewPosition();
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, layoutParamsCreateFrame2);
        updateEmptyView();
    }

    public void lambda$new$1(Object[] objArr) {
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatAttachAlertQuickRepliesLayout.lambda$new$0((View) obj);
            }
        });
    }

    public static void lambda$new$0(View view) {
        if (view instanceof QuickRepliesActivity.QuickReplyView) {
            ((QuickRepliesActivity.QuickReplyView) view).invalidateEmojis();
        }
    }

    public void lambda$new$3(View view, int i) {
        final Object item;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
        if (adapter == shareSearchAdapter) {
            item = shareSearchAdapter.getItem(i);
        } else {
            int sectionForPosition = this.listAdapter.getSectionForPosition(i);
            int positionInSectionForPosition = this.listAdapter.getPositionInSectionForPosition(i);
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return;
            } else {
                item = this.listAdapter.getItem(sectionForPosition, positionInSectionForPosition);
            }
        }
        if (item instanceof QuickRepliesController.QuickReply) {
            if (!UserConfig.getInstance(this.parentAlert.currentAccount).isPremium()) {
                if (this.parentAlert.baseFragment != null) {
                    new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.parentAlert.currentAccount, true, 31, false, null).show();
                }
            } else {
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), ((QuickRepliesController.QuickReply) item).getMessagesCount(), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$2(item, (Long) obj);
                    }
                });
            }
        }
    }

    public void lambda$new$2(Object obj, Long l) {
        QuickRepliesController.getInstance(UserConfig.selectedAccount).sendQuickReplyTo(this.parentAlert.getDialogId(), (QuickRepliesController.QuickReply) obj);
        this.parentAlert.lambda$new$0();
    }

    public void setupBlurredSearchField(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        FragmentSearchField fragmentSearchField = this.searchField;
        if (fragmentSearchField != null) {
            fragmentSearchField.setupBlurredBackground(blurredBackgroundDrawableViewFactory.create(fragmentSearchField, BlurredBackgroundProviderImpl.attachMenuSearch(this.resourcesProvider)));
        }
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            this.animatorFadeVisible.setValue(false, true);
        } else {
            this.animatorFadeVisible.setValue(true, true);
            top = i;
        }
        this.frameLayout.setTranslationY(top);
        return top + AndroidUtilities.dp(12.0f);
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(4.0f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    public void onPreMeasure(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout.onPreMeasure(int, int):void");
    }

    public int getCurrentTop() {
        if (this.listView.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.listView.getPaddingTop();
        if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition();
    }

    public void updateEmptyViewPosition() {
        View childAt;
        if (this.emptyView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            this.emptyView.setTranslationY(((r1.getMeasuredHeight() - getMeasuredHeight()) + childAt.getTop()) / 2);
        }
    }

    public void updateEmptyView() {
        this.emptyView.setVisibility(this.listView.getAdapter().getItemCount() == 2 ? 0 : 8);
        updateEmptyViewPosition();
    }

    public class ShareAdapter extends RecyclerListView.SectionsAdapter {
        private int currentAccount;
        private Context mContext;
        private ArrayList replies;

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public int getSectionCount() {
            return 3;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            return null;
        }

        public ShareAdapter(Context context) {
            ArrayList arrayList = new ArrayList();
            this.replies = arrayList;
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            this.mContext = context;
            arrayList.addAll(QuickRepliesController.getInstance(i).getFilteredReplies());
        }

        @Override
        public Object getItem(int i, int i2) {
            if (i != 0 && i2 >= 0 && i2 < this.replies.size()) {
                return this.replies.get(i2);
            }
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return (i == 0 || i == getSectionCount() - 1 || i2 >= this.replies.size()) ? false : true;
        }

        @Override
        public int getCountForSection(int i) {
            if (i == 0 || i == getSectionCount() - 1) {
                return 1;
            }
            return this.replies.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View quickReplyView;
            if (i == 0) {
                quickReplyView = new QuickRepliesActivity.QuickReplyView(this.mContext, false, ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).resourcesProvider);
            } else if (i == 1) {
                quickReplyView = new View(this.mContext);
                quickReplyView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                quickReplyView.setTag(-33024);
            } else {
                quickReplyView = new View(this.mContext);
                quickReplyView.setTag(-33024);
            }
            return new RecyclerListView.Holder(quickReplyView);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 0) {
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                Object item = getItem(i, i2);
                boolean z = true;
                if (i == getSectionCount() - 2 && i2 == getCountForSection(i) - 1) {
                    z = false;
                }
                if (item instanceof QuickRepliesController.QuickReply) {
                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) item;
                    quickReplyView.set(quickReply, null, z);
                    quickReplyView.setChecked(ChatAttachAlertQuickRepliesLayout.this.selectedReplies.contains(Integer.valueOf(quickReply.id)), false);
                }
            }
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            return i == getSectionCount() - 1 ? 2 : 0;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public void notifyDataSetChanged() {
            this.replies.clear();
            this.replies.addAll(QuickRepliesController.getInstance(this.currentAccount).getFilteredReplies());
            super.notifyDataSetChanged();
            ChatAttachAlertQuickRepliesLayout.this.updateEmptyView();
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        public String lastQuery;
        private Context mContext;
        private ArrayList searchResult = new ArrayList();
        private Runnable searchRunnable;

        public ShareSearchAdapter(Context context) {
            this.mContext = context;
        }

        public void search(java.lang.String r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout.ShareSearchAdapter.search(java.lang.String):void");
        }

        @Override
        public int getItemCount() {
            return this.searchResult.size() + 2;
        }

        public Object getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.searchResult.size()) {
                return null;
            }
            return this.searchResult.get(i2);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View quickReplyView;
            if (i == 0) {
                quickReplyView = new QuickRepliesActivity.QuickReplyView(this.mContext, false, ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).resourcesProvider);
            } else if (i == 1) {
                quickReplyView = new View(this.mContext);
                quickReplyView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                quickReplyView.setTag(-33024);
            } else {
                quickReplyView = new View(this.mContext);
                quickReplyView.setTag(-33024);
            }
            return new RecyclerListView.Holder(quickReplyView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                boolean z = i != getItemCount() + (-2);
                Object item = getItem(i);
                if (item instanceof QuickRepliesController.QuickReply) {
                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) item;
                    quickReplyView.set(quickReply, this.lastQuery, z);
                    quickReplyView.setChecked(ChatAttachAlertQuickRepliesLayout.this.selectedReplies.contains(Integer.valueOf(quickReply.id)), false);
                }
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertQuickRepliesLayout.this.updateEmptyView();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$4();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_dialogTextGray2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$4() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.listView.getChildAt(i);
            }
        }
    }
}
