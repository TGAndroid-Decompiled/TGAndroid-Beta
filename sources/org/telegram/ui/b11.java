package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class b11 extends FrameLayout {
    public float f35901a;
    public final boolean f35902b;
    public final boolean f35903c;
    public boolean d;
    public int e;
    public final o1.i f35904f;
    public final o1.j h;
    public final s0 f35905n;
    public final SecretMediaViewer f35906r;

    public b11(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35906r = secretMediaViewer;
        this.f35901a = 1.0f;
        this.f35902b = true;
        this.f35903c = true;
        o1.i iVar = new o1.i(0.0f);
        this.f35904f = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.f13958m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, 1.0f);
        jVar.b(new ic0(this, 5));
        this.h = jVar;
        this.f35905n = new s0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35904f.f13941a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f35906r;
        sq0 sq0Var = secretMediaViewer.D;
        if (sq0Var != null) {
            f7 = ((float) sq0Var.S()) / ((float) secretMediaViewer.D.U());
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
        if (this.f35901a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f35906r;
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
