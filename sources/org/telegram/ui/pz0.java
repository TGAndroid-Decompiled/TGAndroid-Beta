package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class pz0 extends FrameLayout {
    public float f48884a;
    public final boolean f48885b;
    public final boolean f48886c;
    public boolean d;
    public int f48887e;
    public final r1.f f48888f;
    public final r1.g h;
    public final q0 f48889n;
    public final SecretMediaViewer f48890r;

    public pz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f48890r = secretMediaViewer;
        this.f48884a = 1.0f;
        this.f48885b = true;
        this.f48886c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f48888f = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54279m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new db0(this, 5));
        this.h = gVar;
        this.f48889n = new q0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48888f.f54261a = 0.0f;
        this.f48887e = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f48890r;
        np0 np0Var = secretMediaViewer.D;
        if (np0Var != null) {
            f10 = ((float) np0Var.S()) / ((float) secretMediaViewer.D.U());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.O.h(false, f10);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pz0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48884a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f48890r;
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
