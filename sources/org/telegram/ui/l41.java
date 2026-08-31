package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l41 extends FrameLayout {
    public float f38630a;
    public final boolean f38631b;
    public final boolean f38632c;
    public boolean d;
    public int f38633e;
    public final kb.a f38634f;
    public final o1.j h;
    public final u0 f38635n;
    public final SecretMediaViewer f38636r;

    public l41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f38636r = secretMediaViewer;
        this.f38630a = 1.0f;
        this.f38631b = true;
        this.f38632c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f38634f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f16336u = yh.n(0.0f, 750.0f, 1.0f);
        jVar.b(new md0(this, 5));
        this.h = jVar;
        this.f38635n = new u0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38634f.f11044a = 0.0f;
        this.f38633e = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        super.onLayout(z4, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f38636r;
        j41 j41Var = secretMediaViewer.f34811y;
        if (j41Var != null) {
            f10 = ((float) j41Var.n()) / ((float) secretMediaViewer.f34811y.p());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.N.h(f10, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38630a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f38636r;
        if (secretMediaViewer.N.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.O.invalidate();
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
