package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class oz0 extends FrameLayout {
    public float f48568a;
    public final boolean f48569b;
    public final boolean f48570c;
    public boolean d;
    public int f48571e;
    public final r1.f f48572f;
    public final r1.g h;
    public final q0 f48573n;
    public final SecretMediaViewer f48574r;

    public oz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f48574r = secretMediaViewer;
        this.f48568a = 1.0f;
        this.f48569b = true;
        this.f48570c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f48572f = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54280m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new cb0(this, 5));
        this.h = gVar;
        this.f48573n = new q0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48572f.f54262a = 0.0f;
        this.f48571e = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f48574r;
        mp0 mp0Var = secretMediaViewer.D;
        if (mp0Var != null) {
            f10 = ((float) mp0Var.S()) / ((float) secretMediaViewer.D.U());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.O.h(false, f10);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oz0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48568a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f48574r;
        if (secretMediaViewer.O.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
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
