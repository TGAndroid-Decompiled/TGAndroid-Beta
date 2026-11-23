package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class bx0 extends View {
    public static final String[] f46655s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f46656a;
    public yw0 f46657b;
    public yw0 f46658c;
    public final PointF d;
    public boolean f46659e;
    public boolean f46660f;
    public float h;
    public long f46661n;
    public boolean f46662r;

    public bx0(ProfileActivity profileActivity, yw0 yw0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f46662r = false;
        this.f46656a = profileActivity;
        this.f46657b = yw0Var;
    }

    public final boolean a() {
        yw0 yw0Var = this.f46657b;
        if (!yw0Var.f54438b || this.h < 1.0f) {
            return false;
        }
        if (yw0Var.f54439c.C() != null) {
            this.f46657b.f54439c.C().N(0, false, false);
            this.f46657b.f54439c.C().H(true);
        }
        this.f46662r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(yw0 yw0Var) {
        if (this.f46657b != yw0Var && yw0Var != null) {
            ArrayList arrayList = yw0Var.f54440e;
            if (this.f46662r) {
                this.f46658c = yw0Var;
                return;
            }
            if (this.f46660f) {
                for (int i7 = 0; i7 < this.f46657b.f54440e.size(); i7++) {
                    ((ax0) this.f46657b.f54440e.get(i7)).I0(null);
                }
                this.f46660f = false;
            }
            yw0 yw0Var2 = this.f46657b;
            ArrayList arrayList2 = yw0Var2.f54444j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && yw0Var2.f54443i) {
                yw0Var2.b(true);
                yw0Var2.f54443i = false;
            }
            this.f46657b = yw0Var;
            if (!this.f46660f) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((ax0) arrayList.get(i10)).I0(this);
                }
                this.f46660f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46657b.f54444j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f46660f) {
            for (int i7 = 0; i7 < this.f46657b.f54440e.size(); i7++) {
                ((ax0) this.f46657b.f54440e.get(i7)).I0(null);
            }
            this.f46660f = false;
        }
        yw0 yw0Var = this.f46657b;
        ArrayList arrayList = yw0Var.f54444j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && yw0Var.f54443i) {
            yw0Var.b(true);
            yw0Var.f54443i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46657b.f54438b) {
            boolean z10 = true;
            if (!this.f46660f) {
                for (int i7 = 0; i7 < this.f46657b.f54440e.size(); i7++) {
                    ((ax0) this.f46657b.f54440e.get(i7)).I0(this);
                }
                this.f46660f = true;
                if (!this.f46659e) {
                    this.f46659e = true;
                    post(new qu0(this, 5));
                }
            }
            if (!this.f46662r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f46661n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f46661n = currentTimeMillis;
            ProfileActivity profileActivity = this.f46656a;
            pu0 pu0Var = profileActivity.f43634a;
            int i10 = profileActivity.V2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= pu0Var.getChildCount()) {
                        break;
                    }
                    View childAt = pu0Var.getChildAt(i11);
                    if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.x8)) {
                        xh.l lVar = ((org.telegram.ui.Cells.x8) childAt).f32430a;
                        pointF.set(lVar.getX() + childAt.getX() + pu0Var.getX() + org.telegram.messenger.g0.L(12.0f), (lVar.getMeasuredHeight() / 2.0f) + lVar.getY() + childAt.getY() + pu0Var.getY());
                        break;
                    }
                    i11++;
                }
            }
            float f11 = mx.f();
            this.f46657b.f54439c.z0((getWidth() - org.telegram.messenger.g0.L(f11)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.g0.L(f11) * 0.5f)), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            yw0 yw0Var = null;
            this.f46657b.f54439c.h(canvas, null);
            this.f46657b.f54439c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.g0.L(110.0f);
            int size = this.f46657b.d.size() - 1;
            while (size >= 0) {
                ax0 ax0Var = (ax0) this.f46657b.d.get(size);
                float f12 = size;
                float s5 = org.telegram.messenger.g0.s(this.h, f12, this.f46657b.d.size(), 1.8f);
                float f13 = L;
                boolean z11 = z10;
                float f14 = f13 * 0.88f;
                float w10 = com.google.android.gms.internal.vision.e2.w(f14, this.f46657b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = f10;
                float f17 = pointF.y;
                float f18 = ((w10 - f15) * s5) + (f14 * f12) + f15;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.kr.h.getInterpolation(Utilities.i(s5 / 0.4f, 1.0f, 0.0f));
                float f19 = (f13 / f16) * interpolation;
                float f20 = f13 * interpolation;
                ax0Var.z0(f18 - f19, (f17 - ((f17 + f13) * ((float) Math.pow(d, 2.0d)))) - f19, f20, f20);
                ax0Var.h(canvas, null);
                size--;
                yw0Var = null;
                pointF = pointF2;
                z10 = z11;
                f10 = f16;
            }
            yw0 yw0Var2 = yw0Var;
            if (this.h >= 1.0f) {
                this.f46662r = false;
                b(this.f46658c);
                this.f46658c = yw0Var2;
                return;
            }
            invalidate();
        }
    }
}
