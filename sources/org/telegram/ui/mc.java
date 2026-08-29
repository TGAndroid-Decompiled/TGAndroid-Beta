package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class mc extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f40519a;
    public final wa1 f40520b;
    public final f2.j0 f40521c;
    public final int d;
    public int f40522e;

    public mc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = i10;
        this.f40519a = c6Var;
        wa1 wa1Var = new wa1(activity, 2, c6Var);
        this.f40520b = wa1Var;
        wa1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        wa1Var.setClipToPadding(false);
        wa1Var.setAdapter(new kc(this, activity, c6Var, i10));
        f2.j0 j0Var = new f2.j0();
        this.f40521c = j0Var;
        j0Var.j1(0);
        wa1Var.setLayoutManager(j0Var);
        addView(wa1Var, i7.f6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i12).f19622id == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.f40522e) {
            this.f40522e = i11;
            if (!z10) {
                this.f40521c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f40520b, (f5.d) new jc(0, this, z10));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z10 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z10 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
