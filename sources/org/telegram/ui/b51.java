package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b51 extends FrameLayout {
    public float f32053a;
    public final boolean f32054b;
    public final boolean f32055c;
    public boolean d;
    public int e;
    public final o1.j f32056f;
    public final o1.k h;
    public final s0 f32057n;
    public final SecretMediaViewer f32058r;

    public b51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f32058r = secretMediaViewer;
        this.f32053a = 1.0f;
        this.f32054b = true;
        this.f32055c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f32056f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15351u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.f32057n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32056f.f15350a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f32058r;
        z41 z41Var = secretMediaViewer.f31490y;
        if (z41Var != null) {
            f7 = ((float) z41Var.n()) / ((float) secretMediaViewer.f31490y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32053a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f32058r;
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
