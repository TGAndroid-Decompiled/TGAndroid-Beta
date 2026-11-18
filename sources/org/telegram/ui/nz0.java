package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class nz0 extends FrameLayout {
    public float f50355a;
    public final boolean f50356b;
    public final boolean f50357c;
    public boolean d;
    public int f50358e;
    public final r1.f f50359f;
    public final r1.g h;
    public final q0 f50360n;
    public final SecretMediaViewer f50361r;

    public nz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f50361r = secretMediaViewer;
        this.f50355a = 1.0f;
        this.f50356b = true;
        this.f50357c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f50359f = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        gVar.b(new bb0(this, 5));
        this.h = gVar;
        this.f50360n = new q0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50359f.f56305a = 0.0f;
        this.f50358e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i7, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f50361r;
        lp0 lp0Var = secretMediaViewer.E;
        if (lp0Var != null) {
            f10 = ((float) lp0Var.S()) / ((float) secretMediaViewer.E.U());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.P.h(false, f10);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nz0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f50355a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f50361r;
        if (secretMediaViewer.P.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.Q.invalidate();
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
