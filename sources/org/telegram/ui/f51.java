package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f51 extends FrameLayout {
    public float f33521a;
    public final boolean f33522b;
    public final boolean f33523c;
    public boolean d;
    public int e;
    public final o1.j f33524f;
    public final o1.k h;
    public final s0 f33525n;
    public final SecretMediaViewer f33526r;

    public f51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f33526r = secretMediaViewer;
        this.f33521a = 1.0f;
        this.f33522b = true;
        this.f33523c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f33524f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15537u = org.telegram.ui.Cells.c1.m(0.0f, 750.0f, 1.0f);
        kVar.b(new vd0(this, 5));
        this.h = kVar;
        this.f33525n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33524f.f15536a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f33526r;
        d51 d51Var = secretMediaViewer.f31795y;
        if (d51Var != null) {
            f7 = ((float) d51Var.n()) / ((float) secretMediaViewer.f31795y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33521a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f33526r;
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
