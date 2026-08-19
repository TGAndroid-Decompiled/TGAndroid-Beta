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

    public void setPaddings(int i, float f, boolean z) {
        int i2 = this.currentAdditionalHeight;
        if (i2 != 0 || i2 < 0) {
            this.currentAdditionalHeight = 0;
            this.recyclerView.requestLayout();
        }
        int i3 = (int) f;
        int paddingTop = this.recyclerView.getPaddingTop();
        int paddingBottom = this.recyclerView.getPaddingBottom();
        if (paddingTop == i && paddingBottom == i3) {
            return;
        }
        final int i4 = paddingTop - i;
        if (z && i4 != 0) {
            boolean zCanScrollVertically = this.recyclerView.canScrollVertically(1);
            boolean zCanScrollVertically2 = this.recyclerView.canScrollVertically(-1);
            if ((i4 >= 0 || zCanScrollVertically) && (i4 <= 0 || zCanScrollVertically2)) {
                AndroidUtilities.doOnLayout(this.recyclerView, new Runnable() {
                    @Override
                    public final void run() {
                        ChatListViewPaddingsAnimator.m2949$r8$lambda$fxkL3v1ztfbD0K8IGhfI5mu4(this.f$0, i4);
                    }
                });
            }
        }
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, this.recyclerView.getPaddingRight(), i3);
    }

    public static void m2949$r8$lambda$fxkL3v1ztfbD0K8IGhfI5mu4(ChatListViewPaddingsAnimator chatListViewPaddingsAnimator, int i) {
        chatListViewPaddingsAnimator.getClass();
        try {
            chatListViewPaddingsAnimator.recyclerView.scrollBy(0, i);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }
}
