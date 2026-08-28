package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class nc extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f40692a;
    public final va1 f40693b;
    public final f2.m0 f40694c;
    public final int d;
    public int f40695e;

    public nc(int i9, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.d = i9;
        this.f40692a = b6Var;
        va1 va1Var = new va1(activity, 3, b6Var);
        this.f40693b = va1Var;
        va1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        va1Var.setClipToPadding(false);
        va1Var.setAdapter(new lc(this, activity, b6Var, i9));
        f2.m0 m0Var = new f2.m0();
        this.f40694c = m0Var;
        m0Var.j1(0);
        va1Var.setLayoutManager(m0Var);
        addView(va1Var, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i10 = 0;
        if (peerColors != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= peerColors.colors.size()) {
                    break;
                } else if (peerColors.colors.get(i11).f19651id == i9) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 != this.f40695e) {
            this.f40695e = i10;
            if (!z10) {
                this.f40694c.h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f40693b, (d5.d) new kc(0, this, z10));
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
