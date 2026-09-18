package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e51 extends FrameLayout {
    public float f33287a;
    public final boolean f33288b;
    public final boolean f33289c;
    public boolean d;
    public int e;
    public final o1.j f33290f;
    public final o1.k h;
    public final s0 f33291n;
    public final SecretMediaViewer f33292r;

    public e51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f33292r = secretMediaViewer;
        this.f33287a = 1.0f;
        this.f33288b = true;
        this.f33289c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f33290f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15361u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new vd0(this, 5));
        this.h = kVar;
        this.f33291n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33290f.f15360a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f33292r;
        c51 c51Var = secretMediaViewer.f31507y;
        if (c51Var != null) {
            f7 = ((float) c51Var.n()) / ((float) secretMediaViewer.f31507y.p());
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
        if (this.f33287a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f33292r;
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
