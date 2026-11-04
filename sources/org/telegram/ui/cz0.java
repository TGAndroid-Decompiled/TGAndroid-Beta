package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class cz0 extends FrameLayout {
    public float f44497a;
    public final boolean f44498b;
    public final boolean f44499c;
    public boolean d;
    public int f44500e;
    public final q1.f f44501f;
    public final q1.g h;
    public final r0 f44502n;
    public final SecretMediaViewer f44503r;

    public cz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f44503r = secretMediaViewer;
        this.f44497a = 1.0f;
        this.f44498b = true;
        this.f44499c = true;
        q1.f fVar = new q1.f(0.0f);
        this.f44501f = fVar;
        q1.g gVar = new q1.g(fVar);
        gVar.f53653m = org.telegram.ui.Cells.f1.s(0.0f, 750.0f, 1.0f);
        gVar.b(new wa0(this, 5));
        this.h = gVar;
        this.f44502n = new r0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44501f.f53635a = 0.0f;
        this.f44500e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i3, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f44503r;
        bp0 bp0Var = secretMediaViewer.E;
        if (bp0Var != null) {
            f10 = ((float) bp0Var.S()) / ((float) secretMediaViewer.E.U());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.P.h(false, f10);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cz0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44497a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f44503r;
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
