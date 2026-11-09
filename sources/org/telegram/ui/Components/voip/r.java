package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.s3;
import org.telegram.ui.e40;
import org.telegram.ui.h40;
public abstract class r extends FrameLayout {
    public int f39579a;
    public h40 f39580b;
    public y f39581c;
    public s3 d;
    public boolean f39582e;
    public final boolean f39583f;

    public r(Context context, boolean z9) {
        super(context);
        this.f39583f = z9;
    }

    public float getItemHeight() {
        int measuredHeight;
        h40 h40Var = this.f39580b;
        if (h40Var != null) {
            measuredHeight = h40Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public s3 getParticipant() {
        return this.d;
    }

    public y getRenderer() {
        return this.f39581c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39582e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39582e = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f39583f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f39580b.F(), 1073741824));
            return;
        }
        if (e40.f45184w5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int A = org.telegram.messenger.camera.q.A(14.0f, 2, org.telegram.messenger.g0.f22563q.x);
        if (e40.f45184w5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = A + i11;
        if (e40.f45185x5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(y yVar) {
        this.f39581c = yVar;
    }
}
