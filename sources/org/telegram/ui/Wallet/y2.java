package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public class y2 extends org.telegram.ui.Components.ma implements org.telegram.ui.ActionBar.z5 {
    public f41 Q1;
    public final ViewGroup R1;
    public final Paint S1;
    public float T1;

    public y2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.S1 = new Paint();
        this.f36108s1 = 0.1f;
        this.R1 = viewGroup;
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        updateColors();
        this.Q1.O(false);
    }

    @Override
    public final void E0(int i3) {
        super.E0(i3);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new d(this, 5), this.J0);
        this.Q1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public void T0(float f10) {
        this.T1 = f10;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.f28586b.getY() + f10) + this.f28617t0, this.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22602m)) - this.F.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z10;
        float f10;
        float width;
        org.telegram.ui.ActionBar.j2 j2Var = this.f28589c;
        float height = j2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.f22603n, this.f28586b.getY() + this.T1 + this.f28617t0);
        if (max >= height) {
            return;
        }
        if (this.f28586b.getWidth() < j2Var.getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = this.f28586b.getX() + this.f28618u0;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10;
        if (z10) {
            width = (this.f28586b.getX() + this.f28586b.getWidth()) - this.f28618u0;
        } else {
            width = j2Var.getWidth();
        }
        canvas.drawRect(f11, max, width, height, this.S1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
    }

    @Override
    public void show() {
        boolean z10;
        if (getWindow() != null) {
            org.telegram.messenger.g0.S(getWindow());
        }
        super.show();
        int d12 = d1();
        E0(d12);
        if (org.telegram.messenger.g0.B(d12) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.n3(this, z10);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int d12 = d1();
        this.S1.setColor(d12);
        v0(d12);
        O(d12);
        ViewGroup viewGroup = this.R1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
