package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l51 extends FrameLayout {
    public float f37847a;
    public final boolean f37848b;
    public final boolean f37849c;
    public boolean d;
    public int e;
    public final o1.j f37850f;
    public final o1.k h;
    public final v0 f37851n;
    public final SecretMediaViewer f37852r;

    public l51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f37852r = secretMediaViewer;
        this.f37847a = 1.0f;
        this.f37848b = true;
        this.f37849c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f37850f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16468u = org.telegram.ui.Cells.d0.k(0.0f, 750.0f, 1.0f);
        kVar.b(new yd0(this, 5));
        this.h = kVar;
        this.f37851n = new v0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37850f.f16467a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f37852r;
        j51 j51Var = secretMediaViewer.f32781y;
        if (j51Var != null) {
            f7 = ((float) j51Var.n()) / ((float) secretMediaViewer.f32781y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37847a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f37852r;
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
