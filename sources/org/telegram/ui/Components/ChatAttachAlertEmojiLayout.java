package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;

public final class ChatAttachAlertEmojiLayout extends ChatAttachAlert.AttachAlertLayout {
    public final EmojiView emojiView;
    public final RecyclerListView gridView;
    public final LinearLayoutManager layoutManager;
    public final boolean sticker;
    public final HorizontalScrollView tabsView;

    public ChatAttachAlertEmojiLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context, resourcesProvider, chatAttachAlert);
        this.sticker = z;
        this.occupyNavigationBar = true;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        boolean z2 = !z;
        EmojiView emojiView = new EmojiView(baseFragment, z2, z, false, getContext(), true, null, null, false, resourcesProvider, false, true);
        this.emojiView = emojiView;
        emojiView.shouldLightenBackground = false;
        emojiView.setAllow(z2, z, false, false);
        emojiView.mForceHideBackspaceButton = true;
        EmojiView.AnonymousClass26 anonymousClass26 = emojiView.backspaceButton;
        if (anonymousClass26 != null) {
            anonymousClass26.setVisibility(8);
        }
        emojiView.mForceHideSettingsButton = true;
        ImageView imageView = emojiView.stickerSettingsButton;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        emojiView.disableStickerEditor = true;
        addView(emojiView, LayoutHelper.createFrame(-1.0f, -1));
        HorizontalScrollView tabsForType = emojiView.getTabsForType(z2 ? 1 : 0);
        this.tabsView = tabsForType;
        RecyclerListView listViewForType = emojiView.getListViewForType(z2 ? 1 : 0);
        this.gridView = listViewForType;
        listViewForType.addOnScrollListener(new ChatActivity.AnonymousClass53(this, 19));
        this.layoutManager = (LinearLayoutManager) listViewForType.getLayoutManager();
        tabsForType.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public int getCurrentItemTop() {
        RecyclerListView recyclerListView = this.gridView;
        if (recyclerListView.getChildCount() <= 0) {
            recyclerListView.setTopGlowOffset(recyclerListView.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = recyclerListView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        recyclerListView.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.gridView.getPaddingTop();
    }

    @Override
    public final int needsActionBar() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.tabsView.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
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
        int iDp2 = AndroidUtilities.dp(36.0f) + iDp;
        RecyclerListView recyclerListView = this.gridView;
        if (recyclerListView.getPaddingTop() != iDp2) {
            recyclerListView.setPadding(AndroidUtilities.dp(6.0f), iDp2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        try {
            chatAttachAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        chatAttachAlert.actionBar.setTitle(LocaleController.getString(this.sticker ? R.string.SelectSticker : R.string.SelectEmoji));
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override
    public final void scrollToTop() {
        this.gridView.smoothScrollToPosition(0);
    }

    public void setDelegate(EmojiView.EmojiViewDelegate emojiViewDelegate) {
        this.emojiView.setDelegate(emojiViewDelegate);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }
}
