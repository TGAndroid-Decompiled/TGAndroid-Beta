package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public class y2 extends org.telegram.ui.Components.ma implements org.telegram.ui.ActionBar.c6 {
    public m41 S1;
    public final ViewGroup T1;
    public final Paint U1;
    public float V1;

    public y2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, h6Var);
        this.U1 = new Paint();
        this.f35908u1 = 0.1f;
        this.T1 = viewGroup;
        pj0 pj0Var = this.n1;
        int i7 = this.f28705t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.S1.O(false);
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new d(this, 5), this.I0);
        this.S1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public void T0(float f10) {
        this.V1 = f10;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.f28672b.getY() + f10) + this.f28704s0, this.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22561m)) - this.E.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z9;
        float f10;
        float width;
        org.telegram.ui.ActionBar.m2 m2Var = this.f28675c;
        float height = m2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.f22562n, this.f28672b.getY() + this.V1 + this.f28704s0);
        if (max >= height) {
            return;
        }
        if (this.f28672b.getWidth() < m2Var.getWidth()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = this.f28672b.getX() + this.f28705t0;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10;
        if (z9) {
            width = (this.f28672b.getX() + this.f28672b.getWidth()) - this.f28705t0;
        } else {
            width = m2Var.getWidth();
        }
        canvas.drawRect(f11, max, width, height, this.U1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27834a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
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
        this.U1.setColor(d12);
        v0(d12);
        O(d12);
        ViewGroup viewGroup = this.T1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
