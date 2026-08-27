package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class fy extends FrameLayout {
    public static final int H = 0;
    public boolean A;
    public zw B;
    public pf.k C;
    public boolean D;
    public final jw E;
    public final jw F;
    public final gy G;

    public cy f38225a;

    public b6.a f38226b;

    public kw f38227c;
    public ow d;

    public f2.f0 f38228e;

    public ey f38229f;
    public int h;

    public nw f38230n;

    public c2.x f38231r;

    public int f38232s;
    public int v;

    public org.telegram.ui.Components.h00 f38233w;

    public iw f38234x;

    public org.telegram.ui.Components.gk0 f38235y;

    public fy(Context context, gy gyVar) {
        super(context);
        this.G = gyVar;
        this.E = new jw(this, 1);
        this.F = new jw(this, 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f38225a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f38232s;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.n2) this.G).isPaused) {
            return;
        }
        jw jwVar = this.F;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(jwVar);
            this.f38225a.setItemAnimator(this.f38234x);
            jwVar.run();
        } else {
            if (this.D) {
                return;
            }
            this.D = true;
            if (!this.f38234x.k()) {
                this.f38225a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(jwVar, 36L);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        fy fyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            gy gyVar = this.G;
            if (gyVar.f38511c3 && (fyVar = gyVar.f38498a0[0]) == this) {
                gyVar.f38604v0.g(Math.abs(fyVar.getTranslationX()) / gyVar.f38498a0[0].getMeasuredWidth(), gyVar.f38498a0[1].h);
            }
            gyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            this.G.m3();
        }
        super.setTranslationY(f10);
    }
}
