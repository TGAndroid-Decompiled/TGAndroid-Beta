package org.telegram.ui.Components.chat;

import androidx.recyclerview.widget.RecyclerView;

public class ChatListViewPaddingsAnimator {
    private int currentAdditionalHeight;
    private final RecyclerView recyclerView;

    public ChatListViewPaddingsAnimator(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public void setPaddings(int i, float f, int i2) {
        int i3 = this.currentAdditionalHeight;
        if (i3 != 0) {
            this.currentAdditionalHeight = 0;
            this.recyclerView.requestLayout();
        } else if (i3 < 0) {
            this.currentAdditionalHeight = 0;
            this.recyclerView.requestLayout();
        }
        int i4 = (int) f;
        int paddingTop = this.recyclerView.getPaddingTop();
        int paddingBottom = this.recyclerView.getPaddingBottom();
        if (paddingTop == i && paddingBottom == i4) {
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, this.recyclerView.getPaddingRight(), i4);
    }

    public int getCurrentAdditionalHeight() {
        return this.currentAdditionalHeight;
    }
}
