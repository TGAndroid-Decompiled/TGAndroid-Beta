package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class dx0 extends View {
    public static final String[] f47060s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f47061a;
    public ax0 f47062b;
    public ax0 f47063c;
    public final PointF d;
    public boolean f47064e;
    public boolean f47065f;
    public float h;
    public long f47066n;
    public boolean f47067r;

    public dx0(ProfileActivity profileActivity, ax0 ax0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f47067r = false;
        this.f47061a = profileActivity;
        this.f47062b = ax0Var;
    }

    public final boolean a() {
        ax0 ax0Var = this.f47062b;
        if (!ax0Var.f45724b || this.h < 1.0f) {
            return false;
        }
        if (ax0Var.f45725c.B() != null) {
            this.f47062b.f45725c.B().N(0, false, false);
            this.f47062b.f45725c.B().H(true);
        }
        this.f47067r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ax0 ax0Var) {
        if (this.f47062b != ax0Var && ax0Var != null) {
            ArrayList arrayList = ax0Var.f45726e;
            if (this.f47067r) {
                this.f47063c = ax0Var;
                return;
            }
            if (this.f47065f) {
                for (int i7 = 0; i7 < this.f47062b.f45726e.size(); i7++) {
                    ((cx0) this.f47062b.f45726e.get(i7)).H0(null);
                }
                this.f47065f = false;
            }
            ax0 ax0Var2 = this.f47062b;
            ArrayList arrayList2 = ax0Var2.f45730j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && ax0Var2.f45729i) {
                ax0Var2.b(true);
                ax0Var2.f45729i = false;
            }
            this.f47062b = ax0Var;
            if (!this.f47065f) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((cx0) arrayList.get(i10)).H0(this);
                }
                this.f47065f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47062b.f45730j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f47065f) {
            for (int i7 = 0; i7 < this.f47062b.f45726e.size(); i7++) {
                ((cx0) this.f47062b.f45726e.get(i7)).H0(null);
            }
            this.f47065f = false;
        }
        ax0 ax0Var = this.f47062b;
        ArrayList arrayList = ax0Var.f45730j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ax0Var.f45729i) {
            ax0Var.b(true);
            ax0Var.f45729i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47062b.f45724b) {
            boolean z10 = true;
            if (!this.f47065f) {
                for (int i7 = 0; i7 < this.f47062b.f45726e.size(); i7++) {
                    ((cx0) this.f47062b.f45726e.get(i7)).H0(this);
                }
                this.f47065f = true;
                if (!this.f47064e) {
                    this.f47064e = true;
                    post(new ru0(this, 5));
                }
            }
            if (!this.f47067r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f47066n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f47066n = currentTimeMillis;
            ProfileActivity profileActivity = this.f47061a;
            qu0 qu0Var = profileActivity.f43553a;
            int i10 = profileActivity.V2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= qu0Var.getChildCount()) {
                        break;
                    }
                    View childAt = qu0Var.getChildAt(i11);
                    if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.y8)) {
                        xh.l lVar = ((org.telegram.ui.Cells.y8) childAt).f32515a;
                        pointF.set(lVar.getX() + childAt.getX() + qu0Var.getX() + org.telegram.messenger.g0.L(12.0f), (lVar.getMeasuredHeight() / 2.0f) + lVar.getY() + childAt.getY() + qu0Var.getY());
                        break;
                    }
                    i11++;
                }
            }
            float f11 = nx.f();
            this.f47062b.f45725c.y0((getWidth() - org.telegram.messenger.g0.L(f11)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.g0.L(f11) * 0.5f)), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            ax0 ax0Var = null;
            this.f47062b.f45725c.h(canvas, null);
            this.f47062b.f45725c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.g0.L(110.0f);
            int size = this.f47062b.d.size() - 1;
            while (size >= 0) {
                cx0 cx0Var = (cx0) this.f47062b.d.get(size);
                float f12 = size;
                float s5 = org.telegram.messenger.g0.s(this.h, f12, this.f47062b.d.size(), 1.8f);
                float f13 = L;
                boolean z11 = z10;
                float f14 = f13 * 0.88f;
                float w10 = com.google.android.gms.internal.vision.e2.w(f14, this.f47062b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = f10;
                float f17 = pointF.y;
                float f18 = ((w10 - f15) * s5) + (f14 * f12) + f15;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.nr.h.getInterpolation(Utilities.i(s5 / 0.4f, 1.0f, 0.0f));
                float f19 = (f13 / f16) * interpolation;
                float f20 = f13 * interpolation;
                cx0Var.y0(f18 - f19, (f17 - ((f17 + f13) * ((float) Math.pow(d, 2.0d)))) - f19, f20, f20);
                cx0Var.h(canvas, null);
                size--;
                ax0Var = null;
                pointF = pointF2;
                z10 = z11;
                f10 = f16;
            }
            ax0 ax0Var2 = ax0Var;
            if (this.h >= 1.0f) {
                this.f47067r = false;
                b(this.f47063c);
                this.f47063c = ax0Var2;
                return;
            }
            invalidate();
        }
    }
}
