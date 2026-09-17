package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e51 extends FrameLayout {
    public float f35935a;
    public final boolean f35936b;
    public final boolean f35937c;
    public boolean d;
    public int f35938e;
    public final o1.j f35939f;
    public final o1.k h;
    public final t0 f35940n;
    public final SecretMediaViewer f35941r;

    public e51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35941r = secretMediaViewer;
        this.f35935a = 1.0f;
        this.f35936b = true;
        this.f35937c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f35939f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16825u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.f35940n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35939f.f16824a = 0.0f;
        this.f35938e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f35941r;
        c51 c51Var = secretMediaViewer.f34113y;
        if (c51Var != null) {
            f7 = ((float) c51Var.n()) / ((float) secretMediaViewer.f34113y.p());
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
        if (this.f35935a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f35941r;
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
