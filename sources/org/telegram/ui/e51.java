package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e51 extends FrameLayout {
    public float f35962a;
    public final boolean f35963b;
    public final boolean f35964c;
    public boolean d;
    public int f35965e;
    public final o1.j f35966f;
    public final o1.k h;
    public final t0 f35967n;
    public final SecretMediaViewer f35968r;

    public e51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35968r = secretMediaViewer;
        this.f35962a = 1.0f;
        this.f35963b = true;
        this.f35964c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f35966f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16852u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.f35967n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35966f.f16851a = 0.0f;
        this.f35965e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f35968r;
        c51 c51Var = secretMediaViewer.f34140y;
        if (c51Var != null) {
            f7 = ((float) c51Var.n()) / ((float) secretMediaViewer.f34140y.p());
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
        if (this.f35962a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f35968r;
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
