package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class jz0 extends FrameLayout {
    public float f48475a;
    public final boolean f48476b;
    public final boolean f48477c;
    public boolean d;
    public int f48478e;
    public final r1.f f48479f;
    public final r1.g h;
    public final q0 f48480n;
    public final SecretMediaViewer f48481r;

    public jz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f48481r = secretMediaViewer;
        this.f48475a = 1.0f;
        this.f48476b = true;
        this.f48477c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f48479f = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f55748m = org.telegram.ui.Cells.y0.n(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 5));
        this.h = gVar;
        this.f48480n = new q0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48479f.f55730a = 0.0f;
        this.f48478e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i7, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f48481r;
        ip0 ip0Var = secretMediaViewer.E;
        if (ip0Var != null) {
            f10 = ((float) ip0Var.S()) / ((float) secretMediaViewer.E.U());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.P.h(false, f10);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jz0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48475a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f48481r;
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
