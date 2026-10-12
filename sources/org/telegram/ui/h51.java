package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h51 extends FrameLayout {
    public float f38248a;
    public final boolean f38249b;
    public final boolean f38250c;
    public boolean d;
    public int f38251e;
    public final o1.j f38252f;
    public final o1.k h;
    public final t0 f38253n;
    public final SecretMediaViewer f38254r;

    public h51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f38254r = secretMediaViewer;
        this.f38248a = 1.0f;
        this.f38249b = true;
        this.f38250c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f38252f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16690u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.f38253n = new t0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38252f.f16689a = 0.0f;
        this.f38251e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f38254r;
        e51 e51Var = secretMediaViewer.f34304y;
        if (e51Var != null) {
            f7 = ((float) e51Var.n()) / ((float) secretMediaViewer.f34304y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38248a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f38254r;
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
