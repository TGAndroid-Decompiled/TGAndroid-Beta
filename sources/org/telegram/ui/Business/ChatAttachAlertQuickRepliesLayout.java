package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.MessageEnterTransitionContainer;
import org.telegram.ui.UsersSelectActivity;

public final class ChatAttachAlertQuickRepliesLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final BoolAnimator animatorFadeVisible;
    public final EmptyTextProgressView emptyView;
    public final FrameLayout frameLayout;
    public final ChatAttachAlertPollLayout.AnonymousClass4 layoutManager;
    public final ShareAdapter listAdapter;
    public final ChatActivity.AnonymousClass34 listView;
    public final ShareSearchAdapter searchAdapter;
    public final ChatAttachAlert.AttachSearchField searchField;
    public final HashSet selectedReplies;

    public final class ShareAdapter extends RecyclerListView.SectionsAdapter {
        public final int currentAccount;
        public final Context mContext;
        public final ArrayList replies;

        public ShareAdapter(Context context) {
            ArrayList arrayList = new ArrayList();
            this.replies = arrayList;
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            this.mContext = context;
            QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(i);
            ArrayList arrayList2 = quickRepliesController.filtered;
            arrayList2.clear();
            int i2 = 0;
            while (true) {
                ArrayList arrayList3 = quickRepliesController.replies;
                if (i2 >= arrayList3.size()) {
                    arrayList.addAll(arrayList2);
                    return;
                } else {
                    if (!QuickRepliesController.isSpecial(((QuickRepliesController.QuickReply) arrayList3.get(i2)).name)) {
                        arrayList2.add((QuickRepliesController.QuickReply) arrayList3.get(i2));
                    }
                    i2++;
                }
            }
        }

        @Override
        public final int getCountForSection(int i) {
            if (i == 0 || i == 2) {
                return 1;
            }
            return this.replies.size();
        }

        @Override
        public final Object getItem(int i, int i2) {
            if (i != 0 && i2 >= 0) {
                ArrayList arrayList = this.replies;
                if (i2 < arrayList.size()) {
                    return arrayList.get(i2);
                }
            }
            return null;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            return i == 2 ? 2 : 0;
        }

        @Override
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            return 3;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            return null;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            return (i == 0 || i == 2 || i2 >= this.replies.size()) ? false : true;
        }

        @Override
        public final void notifyDataSetChanged() {
            ArrayList arrayList = this.replies;
            arrayList.clear();
            QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
            ArrayList arrayList2 = quickRepliesController.filtered;
            arrayList2.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList3 = quickRepliesController.replies;
                if (i >= arrayList3.size()) {
                    arrayList.addAll(arrayList2);
                    update(false);
                    ChatAttachAlertQuickRepliesLayout.this.updateEmptyView();
                    return;
                } else {
                    if (!QuickRepliesController.isSpecial(((QuickRepliesController.QuickReply) arrayList3.get(i)).name)) {
                        arrayList2.add((QuickRepliesController.QuickReply) arrayList3.get(i));
                    }
                    i++;
                }
            }
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 0) {
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                Object item = getItem(i, i2);
                boolean z = true;
                if (i == 1 && i2 == getCountForSection(i) - 1) {
                    z = false;
                }
                if (item instanceof QuickRepliesController.QuickReply) {
                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) item;
                    quickReplyView.set(quickReply, null, z);
                    quickReplyView.checkBox.checkBoxBase.setChecked(-1, ChatAttachAlertQuickRepliesLayout.this.selectedReplies.contains(Integer.valueOf(quickReply.id)), false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View quickReplyView;
            Context context = this.mContext;
            if (i == 0) {
                quickReplyView = new QuickRepliesActivity.QuickReplyView(context, ChatAttachAlertQuickRepliesLayout.this.resourcesProvider, false);
            } else if (i != 1) {
                quickReplyView = new View(context);
                quickReplyView.setTag(-33024);
            } else {
                quickReplyView = new View(context);
                quickReplyView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                quickReplyView.setTag(-33024);
            }
            return new RecyclerListView.Holder(quickReplyView);
        }
    }

    public final class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        public String lastQuery;
        public final Context mContext;
        public final ArrayList searchResult = new ArrayList();

        public ShareSearchAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return this.searchResult.size() + 2;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == this.searchResult.size() + 1 ? 2 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            ChatAttachAlertQuickRepliesLayout.this.updateEmptyView();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 0) {
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                ArrayList arrayList = this.searchResult;
                boolean z = i != arrayList.size();
                int i2 = i - 1;
                Object obj = (i2 < 0 || i2 >= arrayList.size()) ? null : arrayList.get(i2);
                if (obj instanceof QuickRepliesController.QuickReply) {
                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj;
                    quickReplyView.set(quickReply, this.lastQuery, z);
                    quickReplyView.checkBox.checkBoxBase.setChecked(-1, ChatAttachAlertQuickRepliesLayout.this.selectedReplies.contains(Integer.valueOf(quickReply.id)), false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View quickReplyView;
            Context context = this.mContext;
            if (i == 0) {
                quickReplyView = new QuickRepliesActivity.QuickReplyView(context, ChatAttachAlertQuickRepliesLayout.this.resourcesProvider, false);
            } else if (i != 1) {
                quickReplyView = new View(context);
                quickReplyView.setTag(-33024);
            } else {
                quickReplyView = new View(context);
                quickReplyView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                quickReplyView.setTag(-33024);
            }
            return new RecyclerListView.Holder(quickReplyView);
        }
    }

    public abstract class UserCell extends FrameLayout {
    }

    public ChatAttachAlertQuickRepliesLayout(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
        this.animatorFadeVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.selectedReplies = new HashSet();
        this.searchAdapter = new ShareSearchAdapter(context);
        MessageEnterTransitionContainer messageEnterTransitionContainer = new MessageEnterTransitionContainer(context, Theme.key_windowBackgroundWhite, resourcesProvider);
        messageEnterTransitionContainer.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        ChatAttachAlert.AttachSearchField attachSearchField = new ChatAttachAlert.AttachSearchField(context, resourcesProvider, this.parentAlert);
        this.searchField = attachSearchField;
        attachSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string = editable.toString();
                boolean zIsEmpty = string.isEmpty();
                int i = 0;
                ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = ChatAttachAlertQuickRepliesLayout.this;
                if (zIsEmpty) {
                    RecyclerView.Adapter adapter = chatAttachAlertQuickRepliesLayout.listView.getAdapter();
                    ShareAdapter shareAdapter = chatAttachAlertQuickRepliesLayout.listAdapter;
                    if (adapter != shareAdapter) {
                        int currentTop = chatAttachAlertQuickRepliesLayout.getCurrentTop();
                        chatAttachAlertQuickRepliesLayout.emptyView.showTextView();
                        chatAttachAlertQuickRepliesLayout.listView.setAdapter(shareAdapter);
                        shareAdapter.notifyDataSetChanged();
                        if (currentTop > 0) {
                            ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = chatAttachAlertQuickRepliesLayout.layoutManager;
                            anonymousClass4.scrollToPositionWithOffset(0, -currentTop, anonymousClass4.mShouldReverseLayout);
                        }
                    }
                } else {
                    EmptyTextProgressView emptyTextProgressView = chatAttachAlertQuickRepliesLayout.emptyView;
                    if (emptyTextProgressView != null) {
                        emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
                    }
                }
                ShareSearchAdapter shareSearchAdapter = chatAttachAlertQuickRepliesLayout.searchAdapter;
                if (shareSearchAdapter != null) {
                    ArrayList arrayList = shareSearchAdapter.searchResult;
                    arrayList.clear();
                    shareSearchAdapter.lastQuery = string;
                    String strTranslitSafe = AndroidUtilities.translitSafe(string);
                    if (strTranslitSafe.startsWith("/")) {
                        strTranslitSafe = strTranslitSafe.substring(1);
                    }
                    QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(UserConfig.selectedAccount);
                    while (true) {
                        ArrayList arrayList2 = quickRepliesController.replies;
                        if (i >= arrayList2.size()) {
                            break;
                        }
                        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) arrayList2.get(i);
                        if (!QuickRepliesController.isSpecial(quickReply.name)) {
                            String strTranslitSafe2 = AndroidUtilities.translitSafe(quickReply.name);
                            if (strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                                arrayList.add(quickReply);
                            }
                        }
                        i++;
                    }
                    ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout2 = ChatAttachAlertQuickRepliesLayout.this;
                    RecyclerView.Adapter adapter2 = chatAttachAlertQuickRepliesLayout2.listView.getAdapter();
                    ShareSearchAdapter shareSearchAdapter2 = chatAttachAlertQuickRepliesLayout2.searchAdapter;
                    if (adapter2 != shareSearchAdapter2) {
                        chatAttachAlertQuickRepliesLayout2.listView.setAdapter(shareSearchAdapter2);
                    }
                    shareSearchAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = attachSearchField.editText;
        anonymousClass4.addTextChangedListener(textWatcher);
        anonymousClass4.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(messageEnterTransitionContainer, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(attachSearchField, layoutParamsCreateFrame);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, resourcesProvider);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, resourcesProvider, 2);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        this.iBlur3Capture = anonymousClass34;
        this.iBlur3CaptureView = anonymousClass34;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        NotificationCenter.getGlobalInstance().listen(anonymousClass34, NotificationCenter.emojiLoaded, new DialogCell$$ExternalSyntheticLambda6(this, 5));
        anonymousClass34.setClipToPadding(false);
        getContext();
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass5 = new ChatAttachAlertPollLayout.AnonymousClass4(this, AndroidUtilities.dp(9.0f), anonymousClass34, 1);
        this.layoutManager = anonymousClass5;
        anonymousClass34.setLayoutManager(anonymousClass5);
        anonymousClass5.bind = false;
        anonymousClass34.setHorizontalScrollBarEnabled(false);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        anonymousClass34.setClipToPadding(false);
        addView(anonymousClass34, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ShareAdapter shareAdapter = new ShareAdapter(context);
        this.listAdapter = shareAdapter;
        anonymousClass34.setAdapter(shareAdapter);
        anonymousClass34.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow, this.resourcesProvider));
        anonymousClass34.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 4));
        anonymousClass34.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 6));
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, layoutParamsCreateFrame2);
        updateEmptyView();
    }

    public int getCurrentTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = anonymousClass34.getPaddingTop();
        if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override
    public int getCurrentItemTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        BoolAnimator boolAnimator = this.animatorFadeVisible;
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            boolAnimator.setValue(true, true);
            top = i;
        } else {
            boolAnimator.setValue(false, true);
        }
        this.frameLayout.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 2);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_dialogTextGray2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusTextView"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public final void onDestroy() {
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition();
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            chatAttachAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                iDp = (i2 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    iDp = (int) (i2 / 3.5f);
                } else {
                    iDp = (i2 / 5) * 2;
                }
            }
            chatAttachAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp + AndroidUtilities.statusBarHeight, 0, this.listPaddingBottom);
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(0, 0, anonymousClass4.mShouldReverseLayout);
    }

    @Override
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        ChatAttachAlert.AttachSearchField attachSearchField = this.searchField;
        if (attachSearchField != null) {
            attachSearchField.setupBlurredBackground(blurredBackgroundDrawableViewFactory.create(attachSearchField, BlurredBackgroundProviderImpl.attachMenuSearch(this.resourcesProvider), false));
        }
    }

    public final void updateEmptyView() {
        this.emptyView.setVisibility(this.listView.getAdapter().getItemCount() == 2 ? 0 : 8);
        updateEmptyViewPosition();
    }

    public final void updateEmptyViewPosition() {
        View childAt;
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            emptyTextProgressView.setTranslationY((childAt.getTop() + (emptyTextProgressView.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }
}
