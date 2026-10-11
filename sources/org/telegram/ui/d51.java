package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d51 extends FrameLayout {
    public float f36936a;
    public final boolean f36937b;
    public final boolean f36938c;
    public boolean d;
    public int f36939e;
    public final o1.j f36940f;
    public final o1.k h;
    public final s0 f36941n;
    public final SecretMediaViewer f36942r;

    public d51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f36942r = secretMediaViewer;
        this.f36936a = 1.0f;
        this.f36937b = true;
        this.f36938c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f36940f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f17024u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        kVar.b(new rd0(this, 5));
        this.h = kVar;
        this.f36941n = new s0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36940f.f17023a = 0.0f;
        this.f36939e = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f36942r;
        b51 b51Var = secretMediaViewer.f34529y;
        if (b51Var != null) {
            f7 = ((float) b51Var.n()) / ((float) secretMediaViewer.f34529y.p());
        } else {
            f7 = 0.0f;
        }
        secretMediaViewer.Q.h(f7, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d51.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36936a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f36942r;
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
