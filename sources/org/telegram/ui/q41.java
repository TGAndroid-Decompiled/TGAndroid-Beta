package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q41 extends FrameLayout {
    public float f37299a;
    public final boolean f37300b;
    public final boolean f37301c;
    public boolean d;
    public int e;
    public final kb.a f37302f;
    public final o1.j h;
    public final w0 f37303n;
    public final SecretMediaViewer f37304r;

    public q41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f37304r = secretMediaViewer;
        this.f37299a = 1.0f;
        this.f37300b = true;
        this.f37301c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f37302f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f16178u = ai.m(0.0f, 750.0f, 1.0f);
        jVar.b(new nd0(this, 5));
        this.h = jVar;
        this.f37303n = new w0("progress", 6);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37302f.f10259a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        super.onLayout(z4, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.f37304r;
        o41 o41Var = secretMediaViewer.f32249y;
        if (o41Var != null) {
            f10 = ((float) o41Var.n()) / ((float) secretMediaViewer.f32249y.p());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.N.h(f10, false);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q41.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f37299a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f37304r;
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
