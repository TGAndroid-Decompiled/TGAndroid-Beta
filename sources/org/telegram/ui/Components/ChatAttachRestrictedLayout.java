package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.ChatActivity;

public final class ChatAttachRestrictedLayout extends ChatAttachAlert.AttachAlertLayout {
    public final AppIconsSelectorCell.AnonymousClass1 adapter;
    public int gridExtraSpace;
    public final int id;
    public final RecyclerListView listView;
    public final EmptyTextProgressView progressView;

    public ChatAttachRestrictedLayout(int i, Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
        this.id = i;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, resourcesProvider);
        this.progressView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoPhotos));
        emptyTextProgressView.setOnTouchListener(null);
        emptyTextProgressView.setTextSize(16);
        addView(emptyTextProgressView, LayoutHelper.createFrame(-2.0f, -1));
        emptyTextProgressView.setLottie(R.raw.media_forbidden, 150, 150);
        TLRPC.Chat chat = this.parentAlert.getChat();
        if (i == 1) {
            emptyTextProgressView.setText(ChatObject.getRestrictedErrorText(chat, 7));
        } else if (i == 3) {
            emptyTextProgressView.setText(ChatObject.getRestrictedErrorText(chat, 18));
        } else if (i == 4) {
            emptyTextProgressView.setText(ChatObject.getRestrictedErrorText(chat, 19));
        } else {
            emptyTextProgressView.setText(ChatObject.getRestrictedErrorText(chat, 22));
        }
        emptyTextProgressView.showTextView();
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider);
        this.listView = recyclerListView;
        recyclerListView.setSectionsType(2);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerListView.setClipToPadding(false);
        AppIconsSelectorCell.AnonymousClass1 anonymousClass1 = new AppIconsSelectorCell.AnonymousClass1(this, 4);
        this.adapter = anonymousClass1;
        recyclerListView.setAdapter(anonymousClass1);
        recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        recyclerListView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 22));
        addView(recyclerListView, LayoutHelper.createFrame(-1.0f, -1));
    }

    @Override
    public int getCurrentItemTop() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = recyclerListView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && holder != null && holder.getAdapterPosition() == 0) {
            i = top;
        }
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            top = i;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        EmptyTextProgressView emptyTextProgressView = this.progressView;
        emptyTextProgressView.setTranslationY(((measuredHeight - emptyTextProgressView.getMeasuredHeight()) / 2) + top);
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
    public final void onPreMeasure(int i, int i2) {
        int i3;
        int iMax = Math.max(0, i2 - ActionBar.getCurrentActionBarHeight());
        if (this.gridExtraSpace != iMax) {
            this.gridExtraSpace = iMax;
            this.adapter.mObservable.notifyChanged();
        }
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
        int i4 = iDp >= 0 ? iDp : 0;
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView.getPaddingTop() != i4) {
            recyclerListView.setPadding(AndroidUtilities.dp(6.0f), i4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
        }
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }
}
