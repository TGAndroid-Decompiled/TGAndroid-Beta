package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class lz0 extends FrameLayout {
    public float f47577a;
    public final boolean f47578b;
    public final boolean f47579c;
    public boolean d;
    public int f47580e;
    public final r1.f f47581f;
    public final r1.g h;
    public final q0 f47582n;
    public final SecretMediaViewer f47583r;

    public lz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f47583r = secretMediaViewer;
        this.f47577a = 1.0f;
        this.f47578b = true;
        this.f47579c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f47581f = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54150m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 5));
        this.h = gVar;
        this.f47582n = new q0("progress", 7);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47581f.f54132a = 0.0f;
        this.f47580e = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.f47583r;
        jp0 jp0Var = secretMediaViewer.D;
        if (jp0Var != null) {
            f10 = ((float) jp0Var.S()) / ((float) secretMediaViewer.D.U());
        } else {
            f10 = 0.0f;
        }
        secretMediaViewer.O.h(false, f10);
    }

    @Override
    public final void onMeasure(int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lz0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f47577a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.f47583r;
        if (secretMediaViewer.O.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.P.invalidate();
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
