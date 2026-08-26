package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class DialogsActivity$14$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity.ViewPage f$0;

    public DialogsActivity$14$$ExternalSyntheticLambda1(DialogsActivity.ViewPage viewPage, int i) {
        this.$r8$classId = i;
        this.f$0 = viewPage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dialogsAdapter.notifyDataSetChanged();
                break;
            case 1:
                DialogsActivity.ViewPage viewPage = this.f$0;
                DialogsActivity.DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
                if (dialogsRecyclerView != null && dialogsRecyclerView.getScrollState() == 0 && viewPage.listView.getChildCount() > 0 && viewPage.listView.getLayoutManager() != null) {
                    int i = viewPage.dialogsType;
                    int i2 = 1;
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    boolean z = i == 0 && dialogsActivity.hasHiddenArchive() && viewPage.archivePullViewState == 2;
                    float f = dialogsActivity.scrollYOffset;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) viewPage.listView.getLayoutManager();
                    View view = null;
                    int top = Integer.MAX_VALUE;
                    int i3 = -1;
                    for (int i4 = 0; i4 < viewPage.listView.getChildCount(); i4++) {
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(viewPage.listView.getChildAt(i4));
                        View childAt = viewPage.listView.getChildAt(i4);
                        if (childAdapterPosition != -1 && childAt != null && childAt.getTop() < top) {
                            top = childAt.getTop();
                            i3 = childAdapterPosition;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top2 = view.getTop() - viewPage.listView.getPaddingTop();
                        if (dialogsActivity.hasStories) {
                            f = 0.0f;
                        }
                        if (viewPage.listView.getScrollState() != 1) {
                            if (z && i3 == 0 && ((viewPage.listView.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f < 0.0f) {
                                top2 = f;
                            } else {
                                i2 = i3;
                            }
                            linearLayoutManager.scrollToPositionWithOffset(i2, (int) top2);
                        }
                    }
                    break;
                }
                break;
            default:
                DialogsActivity.ViewPage viewPage2 = this.f$0;
                viewPage2.dialogsAdapter.updateList(viewPage2.saveScrollPositionRunnable);
                DialogsActivity.this.invalidateScrollY = true;
                DialogsActivity.DialogsRecyclerView dialogsRecyclerView2 = viewPage2.listView;
                dialogsRecyclerView2.updateDialogsOnNextDraw = true;
                viewPage2.updating = false;
                dialogsRecyclerView2.invalidate();
                break;
        }
    }
}
