package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public class ChatAttachAlertEmojiLayout extends ChatAttachAlert.AttachAlertLayout {
    public int currentItemTop;
    private final EmojiView emojiView;
    private final RecyclerListView gridView;
    private final LinearLayoutManager layoutManager;
    private final boolean sticker;
    private final View tabsView;

    @Override
    public int needsActionBar() {
        return 1;
    }

    public ChatAttachAlertEmojiLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(chatAttachAlert, context, resourcesProvider);
        this.currentItemTop = 0;
        this.sticker = z;
        this.occupyNavigationBar = true;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        boolean z2 = !z;
        EmojiView emojiView = new EmojiView(baseFragment, z2, z, false, getContext(), true, null, null, false, resourcesProvider, false, true);
        this.emojiView = emojiView;
        emojiView.shouldLightenBackground = false;
        emojiView.setAllow(z2, z, false, false);
        emojiView.forceHideBackspaceButton();
        emojiView.forceHideSettingsButton();
        emojiView.setDisableStickerEditor();
        addView(emojiView, LayoutHelper.createFrame(-1, -1.0f));
        this.tabsView = emojiView.getTabsForType(z2 ? 1 : 0);
        RecyclerListView listViewForType = emojiView.getListViewForType(z2 ? 1 : 0);
        this.gridView = listViewForType;
        listViewForType.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout = ChatAttachAlertEmojiLayout.this;
                chatAttachAlertEmojiLayout.parentAlert.updateLayout(chatAttachAlertEmojiLayout, true, i2);
                ChatAttachAlertEmojiLayout.this.checkTopTabPosition();
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                RecyclerListView.Holder holder;
                if (i == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    ActionBarMenuItem actionBarMenuItem = ChatAttachAlertEmojiLayout.this.parentAlert.selectedMenuItem;
                    int iDp2 = iDp + (actionBarMenuItem != null ? AndroidUtilities.dp(actionBarMenuItem.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = ChatAttachAlertEmojiLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertEmojiLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp2) + backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || (holder = (RecyclerListView.Holder) ChatAttachAlertEmojiLayout.this.gridView.findViewHolderForAdapterPosition(0)) == null || holder.itemView.getTop() <= AndroidUtilities.dp(7.0f)) {
                        return;
                    }
                    ChatAttachAlertEmojiLayout.this.gridView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(7.0f));
                }
            }
        });
        this.layoutManager = (LinearLayoutManager) listViewForType.getLayoutManager();
        checkTopTabPosition();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkTopTabPosition();
    }

    public void setDelegate(EmojiView.EmojiViewDelegate emojiViewDelegate) {
        this.emojiView.setDelegate(emojiViewDelegate);
    }

    @Override
    public void scrollToTop() {
        this.gridView.smoothScrollToPosition(0);
    }

    @Override
    public int getListTopPadding() {
        return this.gridView.getPaddingTop();
    }

    @Override
    public int getCurrentItemTop() {
        if (this.gridView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.gridView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.currentItemTop = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        this.gridView.setTopGlowOffset(top);
        this.currentItemTop = top;
        return top;
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int i3;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            i3 = (i2 / 5) * 2;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
            } else {
                i3 = (i2 / 5) * 2;
            }
        }
        int iDp = i3 - AndroidUtilities.dp(52.0f);
        if (iDp < 0) {
            iDp = 0;
        }
        int iDp2 = iDp + AndroidUtilities.dp(36.0f);
        if (this.gridView.getPaddingTop() != iDp2) {
            this.gridView.setPadding(AndroidUtilities.dp(6.0f), iDp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }

    public void checkTopTabPosition() {
        this.tabsView.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        try {
            this.parentAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        this.parentAlert.actionBar.setTitle(LocaleController.getString(this.sticker ? R.string.SelectSticker : R.string.SelectEmoji));
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }
}
