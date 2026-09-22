package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c51 extends FrameLayout {
    public float f32671a;
    public final boolean f32672b;
    public final boolean f32673c;
    public boolean d;
    public int e;
    public final o1.j f32674f;
    public final o1.k h;
    public final s0 f32675n;
    public final SecretMediaViewer f32676r;

    public c51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f32676r = secretMediaViewer;
        this.f32671a = 1.0f;
        this.f32672b = true;
        this.f32673c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f32674f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15349u = org.telegram.ui.Cells.q3.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.f32675n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32674f.f15348a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f32676r;
        a51 a51Var = secretMediaViewer.f31487y;
        if (a51Var != null) {
            f7 = ((float) a51Var.n()) / ((float) secretMediaViewer.f31487y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32671a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f32676r;
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
