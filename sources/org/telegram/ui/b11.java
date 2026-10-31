package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class b11 extends FrameLayout {
    public float f35942a;
    public final boolean f35943b;
    public final boolean f35944c;
    public boolean d;
    public int e;
    public final o1.i f35945f;
    public final o1.j h;
    public final s0 f35946n;
    public final SecretMediaViewer f35947r;

    public b11(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35947r = secretMediaViewer;
        this.f35942a = 1.0f;
        this.f35943b = true;
        this.f35944c = true;
        o1.i iVar = new o1.i(0.0f);
        this.f35945f = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.f13957m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, 1.0f);
        jVar.b(new jc0(this, 5));
        this.h = jVar;
        this.f35946n = new s0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35945f.f13940a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f35947r;
        uq0 uq0Var = secretMediaViewer.D;
        if (uq0Var != null) {
            f7 = ((float) uq0Var.S()) / ((float) secretMediaViewer.D.U());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.O.h(false, f7);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b11.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35942a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f35947r;
        if (secretMediaViewer.O.e(motionEvent.getX() - org.telegram.messenger.i0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.P.invalidate();
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
