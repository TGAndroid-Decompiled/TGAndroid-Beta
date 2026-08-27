package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class oc extends FrameLayout {

    public final org.telegram.ui.ActionBar.c6 f41057a;

    public final ta1 f41058b;

    public final f2.k0 f41059c;
    public final int d;

    public int f41060e;

    public oc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = i10;
        this.f41057a = c6Var;
        ta1 ta1Var = new ta1(activity, 2, c6Var);
        this.f41058b = ta1Var;
        ta1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        ta1Var.setClipToPadding(false);
        ta1Var.setAdapter(new mc(this, activity, c6Var, i10));
        f2.k0 k0Var = new f2.k0();
        this.f41059c = k0Var;
        k0Var.j1(0);
        ta1Var.setLayoutManager(k0Var);
        addView(ta1Var, h7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            for (int i12 = 0; i12 < peerColors.colors.size(); i12++) {
                if (peerColors.colors.get(i12).f19624id == i10) {
                    i11 = i12;
                    break;
                }
            }
        }
        if (i11 != this.f41060e) {
            this.f41060e = i11;
            if (!z10) {
                this.f41059c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f41058b, (d5.d) new lc(0, this, z10));
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
