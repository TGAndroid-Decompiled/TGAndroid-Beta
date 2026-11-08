package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public class z2 extends org.telegram.ui.Components.na implements org.telegram.ui.ActionBar.a6 {
    public l41 P1;
    public final ViewGroup Q1;
    public final Paint R1;
    public float S1;

    public z2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, f6Var);
        this.R1 = new Paint();
        this.f36282r1 = 0.1f;
        this.Q1 = viewGroup;
        pj0 pj0Var = this.f36277k1;
        int i7 = this.f28649t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.P1.O(false);
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.f28616a, 0, true, new d(this, 5), this.I0);
        this.P1 = l41Var;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public void T0(float f10) {
        this.S1 = f10;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.f28619b.getY() + f10) + this.f28648s0, this.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22557m)) - this.E.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z9;
        float f10;
        float width;
        org.telegram.ui.ActionBar.l2 l2Var = this.f28622c;
        float height = l2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.f22558n, this.f28619b.getY() + this.S1 + this.f28648s0);
        if (max >= height) {
            return;
        }
        if (this.f28619b.getWidth() < l2Var.getWidth()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = this.f28619b.getX() + this.f28649t0;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10;
        if (z9) {
            width = (this.f28619b.getX() + this.f28619b.getWidth()) - this.f28649t0;
        } else {
            width = l2Var.getWidth();
        }
        canvas.drawRect(f11, max, width, height, this.R1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27796a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, this.I0);
    }

    @Override
    public void show() {
        boolean z9;
        if (getWindow() != null) {
            org.telegram.messenger.g0.S(getWindow());
        }
        super.show();
        int d12 = d1();
        E0(d12);
        if (org.telegram.messenger.g0.B(d12) > 0.721f) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.messenger.g0.n3(this, z9);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int d12 = d1();
        this.R1.setColor(d12);
        v0(d12);
        O(d12);
        ViewGroup viewGroup = this.Q1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
