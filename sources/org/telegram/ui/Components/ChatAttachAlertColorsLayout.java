package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.PeerColorActivity;

public final class ChatAttachAlertColorsLayout extends ChatAttachAlert.AttachAlertLayout {
    public final BottomSheetWithRecyclerListView.AnonymousClass8 adapter;
    public final ChatActivity.AnonymousClass34 gridView;
    public int itemSize;
    public int itemsPerRow;
    public final StickersAlert.AnonymousClass7 layoutManager;
    public Consumer wallpaperConsumer;

    public ChatAttachAlertColorsLayout(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
        this.itemSize = AndroidUtilities.dp(80.0f);
        this.itemsPerRow = 3;
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, resourcesProvider, 8);
        this.gridView = anonymousClass34;
        BottomSheetWithRecyclerListView.AnonymousClass8 anonymousClass8 = new BottomSheetWithRecyclerListView.AnonymousClass8(this, context);
        this.adapter = anonymousClass8;
        anonymousClass34.setAdapter(anonymousClass8);
        anonymousClass34.setClipToPadding(false);
        anonymousClass34.setItemAnimator(null);
        anonymousClass34.setLayoutAnimation(null);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        anonymousClass34.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow, this.resourcesProvider));
        addView(anonymousClass34, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass34.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 16));
        int i = 1;
        StickersAlert.AnonymousClass7 anonymousClass7 = new StickersAlert.AnonymousClass7(this, this.itemSize, i);
        this.layoutManager = anonymousClass7;
        anonymousClass7.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, i);
        anonymousClass34.setLayoutManager(anonymousClass7);
    }

    @Override
    public int getCurrentItemTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.gridView;
        if (anonymousClass34.getChildCount() <= 0) {
            anonymousClass34.setTopGlowOffset(anonymousClass34.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        anonymousClass34.setTopGlowOffset(top);
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
    public final void onPreMeasure(int i, int i2) {
        int i3;
        if (AndroidUtilities.isTablet()) {
            this.itemsPerRow = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.itemsPerRow = 4;
            } else {
                this.itemsPerRow = 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
        int iDp = ((i - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(10.0f)) / this.itemsPerRow;
        int i4 = this.itemSize;
        BottomSheetWithRecyclerListView.AnonymousClass8 anonymousClass8 = this.adapter;
        if (i4 != iDp) {
            this.itemSize = iDp;
            anonymousClass8.mObservable.notifyChanged();
        }
        this.layoutManager.setSpanCount(Math.max(1, ((this.itemsPerRow - 1) * AndroidUtilities.dp(5.0f)) + (this.itemsPerRow * iDp)));
        int iCeil = (int) Math.ceil((((ArrayList) anonymousClass8.val$adapter).size() - 1) / this.itemsPerRow);
        Math.max(0, ((i2 - ((AndroidUtilities.dp(5.0f) * (iCeil - 1)) + (iDp * iCeil))) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(60.0f));
        if (AndroidUtilities.isTablet()) {
            i3 = (i2 / 5) * 2;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i3 = (int) (i2 / 3.5f);
            } else {
                i3 = (i2 / 5) * 2;
            }
        }
        int iDp2 = i3 - AndroidUtilities.dp(52.0f);
        int i5 = iDp2 >= 0 ? iDp2 : 0;
        ChatActivity.AnonymousClass34 anonymousClass34 = this.gridView;
        if (anonymousClass34.getPaddingTop() != i5) {
            anonymousClass34.setPadding(AndroidUtilities.dp(6.0f), i5, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        try {
            chatAttachAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        chatAttachAlert.actionBar.setTitle(LocaleController.getString(R.string.SelectColor));
        StickersAlert.AnonymousClass7 anonymousClass7 = this.layoutManager;
        anonymousClass7.scrollToPositionWithOffset(0, 0, anonymousClass7.mShouldReverseLayout);
    }

    @Override
    public final void scrollToTop() {
        this.gridView.smoothScrollToPosition(0);
    }

    public void setDelegate(Consumer consumer) {
        this.wallpaperConsumer = consumer;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }
}
