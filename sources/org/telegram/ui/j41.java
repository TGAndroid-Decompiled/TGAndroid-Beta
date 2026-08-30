package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j41 extends FrameLayout {
    public float f35231a;
    public final boolean f35232b;
    public final boolean f35233c;
    public boolean d;
    public int e;
    public final kb.a f35234f;
    public final o1.j h;
    public final u0 f35235n;
    public final SecretMediaViewer f35236r;

    public j41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35236r = secretMediaViewer;
        this.f35231a = 1.0f;
        this.f35232b = true;
        this.f35233c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f35234f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f16198u = yh.n(0.0f, 750.0f, 1.0f);
        jVar.b(new ld0(this, 5));
        this.h = jVar;
        this.f35235n = new u0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35234f.f10279a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        super.onLayout(z4, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f35236r;
        h41 h41Var = secretMediaViewer.f32275y;
        if (h41Var != null) {
            f10 = ((float) h41Var.n()) / ((float) secretMediaViewer.f32275y.p());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.N.h(f10, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35231a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f35236r;
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
