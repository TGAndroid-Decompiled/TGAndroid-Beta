package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h51 extends FrameLayout {
    public float f33278a;
    public final boolean f33279b;
    public final boolean f33280c;
    public boolean d;
    public int e;
    public final o1.j f33281f;
    public final o1.k h;
    public final t0 f33282n;
    public final SecretMediaViewer f33283r;

    public h51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f33283r = secretMediaViewer;
        this.f33278a = 1.0f;
        this.f33279b = true;
        this.f33280c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f33281f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f14134u = org.telegram.ui.Cells.r6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.f33282n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33281f.f14133a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f33283r;
        f51 f51Var = secretMediaViewer.f30602y;
        if (f51Var != null) {
            f7 = ((float) f51Var.n()) / ((float) secretMediaViewer.f30602y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33278a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f33283r;
        if (secretMediaViewer.Q.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.R.invalidate();
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
