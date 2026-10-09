package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e51 extends FrameLayout {
    public float f37157a;
    public final boolean f37158b;
    public final boolean f37159c;
    public boolean d;
    public int f37160e;
    public final o1.j f37161f;
    public final o1.k h;
    public final t0 f37162n;
    public final SecretMediaViewer f37163r;

    public e51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f37163r = secretMediaViewer;
        this.f37157a = 1.0f;
        this.f37158b = true;
        this.f37159c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f37161f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16938u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        kVar.b(new sd0(this, 5));
        this.h = kVar;
        this.f37162n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37161f.f16937a = 0.0f;
        this.f37160e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f37163r;
        c51 c51Var = secretMediaViewer.f34467y;
        if (c51Var != null) {
            f7 = ((float) c51Var.n()) / ((float) secretMediaViewer.f34467y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37157a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f37163r;
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
