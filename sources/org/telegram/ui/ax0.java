package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ax0 extends View {
    public static final String[] f44106s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f44107a;
    public xw0 f44108b;
    public xw0 f44109c;
    public final PointF d;
    public boolean f44110e;
    public boolean f44111f;
    public float h;
    public long f44112n;
    public boolean f44113r;

    public ax0(ProfileActivity profileActivity, xw0 xw0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f44113r = false;
        this.f44107a = profileActivity;
        this.f44108b = xw0Var;
    }

    public final boolean a() {
        xw0 xw0Var = this.f44108b;
        if (!xw0Var.f52001b || this.h < 1.0f) {
            return false;
        }
        if (xw0Var.f52002c.B() != null) {
            this.f44108b.f52002c.B().N(0, false, false);
            this.f44108b.f52002c.B().H(true);
        }
        this.f44113r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(xw0 xw0Var) {
        if (this.f44108b != xw0Var && xw0Var != null) {
            ArrayList arrayList = xw0Var.f52003e;
            if (this.f44113r) {
                this.f44109c = xw0Var;
                return;
            }
            if (this.f44111f) {
                for (int i7 = 0; i7 < this.f44108b.f52003e.size(); i7++) {
                    ((zw0) this.f44108b.f52003e.get(i7)).H0(null);
                }
                this.f44111f = false;
            }
            xw0 xw0Var2 = this.f44108b;
            ArrayList arrayList2 = xw0Var2.f52007j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && xw0Var2.f52006i) {
                xw0Var2.b(true);
                xw0Var2.f52006i = false;
            }
            this.f44108b = xw0Var;
            if (!this.f44111f) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((zw0) arrayList.get(i10)).H0(this);
                }
                this.f44111f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44108b.f52007j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f44111f) {
            for (int i7 = 0; i7 < this.f44108b.f52003e.size(); i7++) {
                ((zw0) this.f44108b.f52003e.get(i7)).H0(null);
            }
            this.f44111f = false;
        }
        xw0 xw0Var = this.f44108b;
        ArrayList arrayList = xw0Var.f52007j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && xw0Var.f52006i) {
            xw0Var.b(true);
            xw0Var.f52006i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44108b.f52001b) {
            boolean z9 = true;
            if (!this.f44111f) {
                for (int i7 = 0; i7 < this.f44108b.f52003e.size(); i7++) {
                    ((zw0) this.f44108b.f52003e.get(i7)).H0(this);
                }
                this.f44111f = true;
                if (!this.f44110e) {
                    this.f44110e = true;
                    post(new ru0(this, 5));
                }
            }
            if (!this.f44113r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f44112n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f44112n = currentTimeMillis;
            ProfileActivity profileActivity = this.f44107a;
            qu0 qu0Var = profileActivity.f41687a;
            int i10 = profileActivity.T2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= qu0Var.getChildCount()) {
                        break;
                    }
                    View childAt = qu0Var.getChildAt(i11);
                    if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.x8)) {
                        xh.l lVar = ((org.telegram.ui.Cells.x8) childAt).f30900a;
                        pointF.set(lVar.getX() + childAt.getX() + qu0Var.getX() + org.telegram.messenger.g0.L(12.0f), (lVar.getMeasuredHeight() / 2.0f) + lVar.getY() + childAt.getY() + qu0Var.getY());
                        break;
                    }
                    i11++;
                }
            }
            float f11 = ix.f();
            this.f44108b.f52002c.y0((getWidth() - org.telegram.messenger.g0.L(f11)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.g0.L(f11) * 0.5f)), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            xw0 xw0Var = null;
            this.f44108b.f52002c.h(canvas, null);
            this.f44108b.f52002c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.g0.L(110.0f);
            int size = this.f44108b.d.size() - 1;
            while (size >= 0) {
                zw0 zw0Var = (zw0) this.f44108b.d.get(size);
                float f12 = size;
                float s5 = org.telegram.messenger.g0.s(this.h, f12, this.f44108b.d.size(), 1.8f);
                float f13 = L;
                boolean z10 = z9;
                float f14 = f13 * 0.88f;
                float w10 = com.google.android.recaptcha.internal.a.w(f14, this.f44108b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = f10;
                float f17 = pointF.y;
                float f18 = ((w10 - f15) * s5) + (f14 * f12) + f15;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.xq.h.getInterpolation(Utilities.i(s5 / 0.4f, 1.0f, 0.0f));
                float f19 = (f13 / f16) * interpolation;
                float f20 = f13 * interpolation;
                zw0Var.y0(f18 - f19, (f17 - ((f17 + f13) * ((float) Math.pow(d, 2.0d)))) - f19, f20, f20);
                zw0Var.h(canvas, null);
                size--;
                xw0Var = null;
                pointF = pointF2;
                z9 = z10;
                f10 = f16;
            }
            xw0 xw0Var2 = xw0Var;
            if (this.h >= 1.0f) {
                this.f44113r = false;
                b(this.f44109c);
                this.f44109c = xw0Var2;
                return;
            }
            invalidate();
        }
    }
}
