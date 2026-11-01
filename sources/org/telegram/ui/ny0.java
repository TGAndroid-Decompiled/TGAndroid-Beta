package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ny0 extends View {
    public static final String[] f39984s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f39985a;
    public ky0 f39986b;
    public ky0 f39987c;
    public final PointF d;
    public boolean e;
    public boolean f39988f;
    public float h;
    public long f39989n;
    public boolean f39990r;

    public ny0(ProfileActivity profileActivity, ky0 ky0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f39990r = false;
        this.f39985a = profileActivity;
        this.f39986b = ky0Var;
    }

    public final boolean a() {
        ky0 ky0Var = this.f39986b;
        if (!ky0Var.f39027b || this.h < 1.0f) {
            return false;
        }
        if (ky0Var.f39028c.B() != null) {
            this.f39986b.f39028c.B().N(0, false, false);
            this.f39986b.f39028c.B().H(true);
        }
        this.f39990r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ky0 ky0Var) {
        if (this.f39986b != ky0Var && ky0Var != null) {
            ArrayList arrayList = ky0Var.e;
            if (this.f39990r) {
                this.f39987c = ky0Var;
                return;
            }
            if (this.f39988f) {
                for (int i10 = 0; i10 < this.f39986b.e.size(); i10++) {
                    ((my0) this.f39986b.e.get(i10)).H0(null);
                }
                this.f39988f = false;
            }
            ky0 ky0Var2 = this.f39986b;
            ArrayList arrayList2 = ky0Var2.f39032j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && ky0Var2.f39031i) {
                ky0Var2.b(true);
                ky0Var2.f39031i = false;
            }
            this.f39986b = ky0Var;
            if (!this.f39988f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((my0) arrayList.get(i11)).H0(this);
                }
                this.f39988f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39986b.f39032j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39988f) {
            for (int i10 = 0; i10 < this.f39986b.e.size(); i10++) {
                ((my0) this.f39986b.e.get(i10)).H0(null);
            }
            this.f39988f = false;
        }
        ky0 ky0Var = this.f39986b;
        ArrayList arrayList = ky0Var.f39032j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ky0Var.f39031i) {
            ky0Var.b(true);
            ky0Var.f39031i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39986b.f39027b) {
            boolean z10 = true;
            if (!this.f39988f) {
                for (int i10 = 0; i10 < this.f39986b.e.size(); i10++) {
                    ((my0) this.f39986b.e.get(i10)).H0(this);
                }
                this.f39988f = true;
                if (!this.e) {
                    this.e = true;
                    post(new vv0(this, 7));
                }
            }
            if (!this.f39990r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f39989n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f39989n = currentTimeMillis;
            ProfileActivity profileActivity = this.f39985a;
            aw0 aw0Var = profileActivity.f33779a;
            int i11 = profileActivity.T2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= aw0Var.getChildCount()) {
                        break;
                    }
                    View childAt = aw0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.z8)) {
                        nh.p pVar = ((org.telegram.ui.Cells.z8) childAt).f23649a;
                        pointF.set(pVar.getX() + childAt.getX() + aw0Var.getX() + org.telegram.messenger.i0.L(12.0f), (pVar.getMeasuredHeight() / 2.0f) + pVar.getY() + childAt.getY() + aw0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = ky.f();
            this.f39986b.f39028c.y0((getWidth() - org.telegram.messenger.i0.L(f10)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.i0.L(f10) * 0.5f)), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            ky0 ky0Var = null;
            this.f39986b.f39028c.h(canvas, null);
            this.f39986b.f39028c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.i0.L(110.0f);
            int size = this.f39986b.d.size() - 1;
            while (size >= 0) {
                my0 my0Var = (my0) this.f39986b.d.get(size);
                float f11 = size;
                float s10 = org.telegram.messenger.i0.s(this.h, f11, this.f39986b.d.size(), 1.8f);
                float f12 = L;
                boolean z11 = z10;
                float f13 = f12 * 0.88f;
                float g10 = c3.i0.g(f13, this.f39986b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((g10 - f14) * s10) + (f13 * f11) + f14;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.gr.h.getInterpolation(Utilities.i(s10 / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                my0Var.y0(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(d, 2.0d)))) - f18, f19, f19);
                my0Var.h(canvas, null);
                size--;
                ky0Var = null;
                pointF = pointF2;
                z10 = z11;
                f7 = f15;
            }
            ky0 ky0Var2 = ky0Var;
            if (this.h >= 1.0f) {
                this.f39990r = false;
                b(this.f39987c);
                this.f39987c = ky0Var2;
                return;
            }
            invalidate();
        }
    }
}
