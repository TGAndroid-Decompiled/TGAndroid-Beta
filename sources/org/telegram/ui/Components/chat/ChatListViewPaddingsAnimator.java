package org.telegram.ui.Components.chat;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public class ChatListViewPaddingsAnimator {
    private int currentAdditionalHeight;
    private final RecyclerView recyclerView;

    public ChatListViewPaddingsAnimator(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public void setPaddings(int i, float f, int i2, boolean z) {
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
        final int i5 = paddingTop - i;
        if (z && i5 != 0) {
            AndroidUtilities.doOnLayout(this.recyclerView, new Runnable() {
                @Override
                public final void run() {
                    ChatListViewPaddingsAnimator.this.lambda$setPaddings$0(i5);
                }
            });
        }
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, this.recyclerView.getPaddingRight(), i4);
    }

    public void lambda$setPaddings$0(int i) {
        try {
            this.recyclerView.scrollBy(0, i);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public int getCurrentAdditionalHeight() {
        return this.currentAdditionalHeight;
    }
}
