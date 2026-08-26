package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;

public final class ChatAttachAlertQuickRepliesLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final BoolAnimator animatorFadeVisible;
    public final EmptyTextProgressView emptyView;
    public final FrameLayout frameLayout;
    public final AnonymousClass3 layoutManager;
    public final ShareAdapter listAdapter;
    public final StarGiftPreviewSheet.AnonymousClass6 listView;
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
        public final View getSectionHeaderView(int i, View view) {
            return null;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
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
                    super.notifyDataSetChanged();
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
            if (viewHolder.getItemViewType() == 0) {
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                Object item = getItem(i, i2);
                boolean z = true;
                if (i == 1 && i2 == getCountForSection(i) - 1) {
                    z = false;
                }
                if (item instanceof QuickRepliesController.QuickReply) {
                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) item;
                    quickReplyView.set(quickReply, null, z);
                    quickReplyView.checkBox.setChecked(ChatAttachAlertQuickRepliesLayout.this.selectedReplies.contains(Integer.valueOf(quickReply.id)), false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View quickReplyView;
            Context context = this.mContext;
            if (i == 0) {
                quickReplyView = new QuickRepliesActivity.QuickReplyView(context, false, ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).resourcesProvider);
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
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public final void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertQuickRepliesLayout.this.updateEmptyView();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                ArrayList arrayList = this.searchResult;
                boolean z = i != arrayList.size();
                int i2 = i - 1;
                Object obj = (i2 < 0 || i2 >= arrayList.size()) ? null : arrayList.get(i2);
                if (obj instanceof QuickRepliesController.QuickReply) {
                    QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj;
                    quickReplyView.set(quickReply, this.lastQuery, z);
                    quickReplyView.checkBox.setChecked(ChatAttachAlertQuickRepliesLayout.this.selectedReplies.contains(Integer.valueOf(quickReply.id)), false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View quickReplyView;
            Context context = this.mContext;
            if (i == 0) {
                quickReplyView = new QuickRepliesActivity.QuickReplyView(context, false, ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertQuickRepliesLayout.this).resourcesProvider);
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

        public final void search(String str) {
            ArrayList arrayList = this.searchResult;
            arrayList.clear();
            this.lastQuery = str;
            String strTranslitSafe = AndroidUtilities.translitSafe(str);
            if (strTranslitSafe.startsWith("/")) {
                strTranslitSafe = strTranslitSafe.substring(1);
            }
            QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(UserConfig.selectedAccount);
            int i = 0;
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
            ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = ChatAttachAlertQuickRepliesLayout.this;
            RecyclerView.Adapter adapter = chatAttachAlertQuickRepliesLayout.listView.getAdapter();
            ShareSearchAdapter shareSearchAdapter = chatAttachAlertQuickRepliesLayout.searchAdapter;
            if (adapter != shareSearchAdapter) {
                chatAttachAlertQuickRepliesLayout.listView.setAdapter(shareSearchAdapter);
            }
            super.notifyDataSetChanged();
            chatAttachAlertQuickRepliesLayout.updateEmptyView();
        }
    }

    public abstract class UserCell extends FrameLayout {
    }

    public ChatAttachAlertQuickRepliesLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.animatorFadeVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.selectedReplies = new HashSet();
        this.searchAdapter = new ShareSearchAdapter(context);
        ChatAttachAlert.SearchFadeView searchFadeView = new ChatAttachAlert.SearchFadeView(context, Theme.key_windowBackgroundWhite, resourcesProvider);
        searchFadeView.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        ChatAttachAlert.AttachSearchField attachSearchField = new ChatAttachAlert.AttachSearchField(context, this.parentAlert, resourcesProvider);
        this.searchField = attachSearchField;
        attachSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        attachSearchField.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string = editable.toString();
                boolean zIsEmpty = string.isEmpty();
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
                            chatAttachAlertQuickRepliesLayout.layoutManager.scrollToPositionWithOffset(0, -currentTop);
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
                    shareSearchAdapter.search(string);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
        StarGiftPreviewSheet.AnonymousClass6 anonymousClass6 = new StarGiftPreviewSheet.AnonymousClass6(this, context, resourcesProvider, 1);
        this.listView = anonymousClass6;
        anonymousClass6.setSections();
        this.iBlur3Capture = anonymousClass6;
        this.iBlur3CaptureView = anonymousClass6;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        NotificationCenter.getGlobalInstance().listen(anonymousClass6, NotificationCenter.emojiLoaded, new DialogCell$$ExternalSyntheticLambda6(this, 4));
        anonymousClass6.setClipToPadding(false);
        ?? r1 = new FillLastLinearLayoutManager(getContext(), AndroidUtilities.dp(9.0f), anonymousClass6) {
            @Override
            public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public final int calculateDyToMakeVisible(View view, int i2) {
                        return super.calculateDyToMakeVisible(view, i2) - ((ChatAttachAlertQuickRepliesLayout.this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f));
                    }

                    @Override
                    public final int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = r1;
        anonymousClass6.setLayoutManager(r1);
        r1.setBind(false);
        anonymousClass6.setHorizontalScrollBarEnabled(false);
        anonymousClass6.setVerticalScrollBarEnabled(false);
        anonymousClass6.setClipToPadding(false);
        addView(anonymousClass6, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ShareAdapter shareAdapter = new ShareAdapter(context);
        this.listAdapter = shareAdapter;
        anonymousClass6.setAdapter(shareAdapter);
        anonymousClass6.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        anonymousClass6.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 2));
        anonymousClass6.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = ChatAttachAlertQuickRepliesLayout.this;
                ((ChatAttachAlert.AttachAlertLayout) chatAttachAlertQuickRepliesLayout).parentAlert.updateLayout(chatAttachAlertQuickRepliesLayout, true, i2);
                chatAttachAlertQuickRepliesLayout.updateEmptyViewPosition();
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, layoutParamsCreateFrame2);
        updateEmptyView();
    }

    public int getCurrentTop() {
        StarGiftPreviewSheet.AnonymousClass6 anonymousClass6 = this.listView;
        if (anonymousClass6.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = anonymousClass6.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass6.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = anonymousClass6.getPaddingTop();
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
        StarGiftPreviewSheet.AnonymousClass6 anonymousClass6 = this.listView;
        if (anonymousClass6.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = anonymousClass6.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass6.findContainingViewHolder(childAt);
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
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                StarGiftPreviewSheet.AnonymousClass6 anonymousClass6 = this.f$0.listView;
                if (anonymousClass6 != null) {
                    int childCount = anonymousClass6.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        anonymousClass6.getChildAt(i);
                    }
                }
            }

            @Override
            public final void onAnimationProgress(float f) {
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_dialogTextGray2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusTextView"}, null, null, -1, themeDescriptionDelegate, i));
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

    public final void lambda$new$2(QuickRepliesController.QuickReply quickReply) {
        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(UserConfig.selectedAccount);
        long dialogId = this.parentAlert.getDialogId();
        if (quickReply != null) {
            TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
            int i = quickRepliesController.currentAccount;
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(dialogId);
            tL_messages_sendQuickReplyMessages.peer = inputPeer;
            if (inputPeer != null) {
                tL_messages_sendQuickReplyMessages.shortcut_id = quickReply.id;
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                messagesStorage.getStorageQueue().postRunnable(new Theme$$ExternalSyntheticLambda17(13, quickRepliesController, messagesStorage, quickReply, tL_messages_sendQuickReplyMessages));
            }
        }
        this.parentAlert.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$3(int i) {
        Object item;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
        if (adapter == shareSearchAdapter) {
            int i2 = i - 1;
            if (i2 < 0) {
                shareSearchAdapter.getClass();
            } else if (i2 < shareSearchAdapter.searchResult.size()) {
                item = shareSearchAdapter.searchResult.get(i2);
            }
            item = null;
        } else {
            ShareAdapter shareAdapter = this.listAdapter;
            int sectionForPosition = shareAdapter.getSectionForPosition(i);
            int positionInSectionForPosition = shareAdapter.getPositionInSectionForPosition(i);
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return;
            } else {
                item = shareAdapter.getItem(sectionForPosition, positionInSectionForPosition);
            }
        }
        if (item instanceof QuickRepliesController.QuickReply) {
            if (UserConfig.getInstance(this.parentAlert.currentAccount).isPremium()) {
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), ((QuickRepliesController.QuickReply) item).getMessagesCount(), new GiftSheet$$ExternalSyntheticLambda4(6, this, (QuickRepliesController.QuickReply) item));
            } else if (this.parentAlert.baseFragment != null) {
                new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.parentAlert.currentAccount, true, 31, false, null).show();
            }
        }
    }

    @Override
    public final void onDestroy() {
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
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
        if (this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            this.parentAlert.setAllowNestedScroll(false);
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
            this.parentAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp + AndroidUtilities.statusBarHeight, 0, this.listPaddingBottom);
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        scrollToPositionWithOffset(0, 0);
    }

    @Override
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public final boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
        return false;
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
