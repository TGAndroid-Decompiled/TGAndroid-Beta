package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class oy0 extends View {
    public static final String[] f40392s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40393a;
    public ly0 f40394b;
    public ly0 f40395c;
    public final PointF d;
    public boolean e;
    public boolean f40396f;
    public float h;
    public long f40397n;
    public boolean f40398r;

    public oy0(ProfileActivity profileActivity, ly0 ly0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40398r = false;
        this.f40393a = profileActivity;
        this.f40394b = ly0Var;
    }

    public final boolean a() {
        ly0 ly0Var = this.f40394b;
        if (!ly0Var.f39437b || this.h < 1.0f) {
            return false;
        }
        if (ly0Var.f39438c.B() != null) {
            this.f40394b.f39438c.B().N(0, false, false);
            this.f40394b.f39438c.B().H(true);
        }
        this.f40398r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ly0 ly0Var) {
        if (this.f40394b != ly0Var && ly0Var != null) {
            ArrayList arrayList = ly0Var.e;
            if (this.f40398r) {
                this.f40395c = ly0Var;
                return;
            }
            if (this.f40396f) {
                for (int i10 = 0; i10 < this.f40394b.e.size(); i10++) {
                    ((ny0) this.f40394b.e.get(i10)).H0(null);
                }
                this.f40396f = false;
            }
            ly0 ly0Var2 = this.f40394b;
            ArrayList arrayList2 = ly0Var2.f39442j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && ly0Var2.f39441i) {
                ly0Var2.b(true);
                ly0Var2.f39441i = false;
            }
            this.f40394b = ly0Var;
            if (!this.f40396f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((ny0) arrayList.get(i11)).H0(this);
                }
                this.f40396f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40394b.f39442j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40396f) {
            for (int i10 = 0; i10 < this.f40394b.e.size(); i10++) {
                ((ny0) this.f40394b.e.get(i10)).H0(null);
            }
            this.f40396f = false;
        }
        ly0 ly0Var = this.f40394b;
        ArrayList arrayList = ly0Var.f39442j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ly0Var.f39441i) {
            ly0Var.b(true);
            ly0Var.f39441i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40394b.f39437b) {
            boolean z10 = true;
            if (!this.f40396f) {
                for (int i10 = 0; i10 < this.f40394b.e.size(); i10++) {
                    ((ny0) this.f40394b.e.get(i10)).H0(this);
                }
                this.f40396f = true;
                if (!this.e) {
                    this.e = true;
                    post(new wv0(this, 7));
                }
            }
            if (!this.f40398r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f40397n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40397n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40393a;
            bw0 bw0Var = profileActivity.f33772a;
            int i11 = profileActivity.T2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= bw0Var.getChildCount()) {
                        break;
                    }
                    View childAt = bw0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.z8)) {
                        nh.p pVar = ((org.telegram.ui.Cells.z8) childAt).f23648a;
                        pointF.set(pVar.getX() + childAt.getX() + bw0Var.getX() + org.telegram.messenger.i0.L(12.0f), (pVar.getMeasuredHeight() / 2.0f) + pVar.getY() + childAt.getY() + bw0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = ly.f();
            this.f40394b.f39438c.y0((getWidth() - org.telegram.messenger.i0.L(f10)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.i0.L(f10) * 0.5f)), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            ly0 ly0Var = null;
            this.f40394b.f39438c.h(canvas, null);
            this.f40394b.f39438c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.i0.L(110.0f);
            int size = this.f40394b.d.size() - 1;
            while (size >= 0) {
                ny0 ny0Var = (ny0) this.f40394b.d.get(size);
                float f11 = size;
                float s10 = org.telegram.messenger.i0.s(this.h, f11, this.f40394b.d.size(), 1.8f);
                float f12 = L;
                boolean z11 = z10;
                float f13 = f12 * 0.88f;
                float g10 = c3.i0.g(f13, this.f40394b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((g10 - f14) * s10) + (f13 * f11) + f14;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.gr.h.getInterpolation(Utilities.i(s10 / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                ny0Var.y0(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(d, 2.0d)))) - f18, f19, f19);
                ny0Var.h(canvas, null);
                size--;
                ly0Var = null;
                pointF = pointF2;
                z10 = z11;
                f7 = f15;
            }
            ly0 ly0Var2 = ly0Var;
            if (this.h >= 1.0f) {
                this.f40398r = false;
                b(this.f40395c);
                this.f40395c = ly0Var2;
                return;
            }
            invalidate();
        }
    }
}
