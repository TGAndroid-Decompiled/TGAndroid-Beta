package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p11 extends View {
    public static final String[] f40627s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40628a;
    public m11 f40629b;
    public m11 f40630c;
    public final PointF d;
    public boolean f40631e;
    public boolean f40632f;
    public float h;
    public long f40633n;
    public boolean f40634r;

    public p11(ProfileActivity profileActivity, m11 m11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40634r = false;
        this.f40628a = profileActivity;
        this.f40629b = m11Var;
    }

    public final boolean a() {
        m11 m11Var = this.f40629b;
        if (!m11Var.f39735b || this.h < 1.0f) {
            return false;
        }
        if (m11Var.f39736c.getLottieAnimation() != null) {
            this.f40629b.f39736c.getLottieAnimation().N(0, false, false);
            this.f40629b.f39736c.getLottieAnimation().H(true);
        }
        this.f40634r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(m11 m11Var) {
        if (this.f40629b != m11Var && m11Var != null) {
            ArrayList arrayList = m11Var.f39737e;
            if (this.f40634r) {
                this.f40630c = m11Var;
                return;
            }
            if (this.f40632f) {
                for (int i10 = 0; i10 < this.f40629b.f39737e.size(); i10++) {
                    ((o11) this.f40629b.f39737e.get(i10)).setParentView(null);
                }
                this.f40632f = false;
            }
            m11 m11Var2 = this.f40629b;
            ArrayList arrayList2 = m11Var2.f39741j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && m11Var2.f39740i) {
                m11Var2.b(true);
                m11Var2.f39740i = false;
            }
            this.f40629b = m11Var;
            if (!this.f40632f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((o11) arrayList.get(i11)).setParentView(this);
                }
                this.f40632f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40629b.f39741j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40632f) {
            for (int i10 = 0; i10 < this.f40629b.f39737e.size(); i10++) {
                ((o11) this.f40629b.f39737e.get(i10)).setParentView(null);
            }
            this.f40632f = false;
        }
        m11 m11Var = this.f40629b;
        ArrayList arrayList = m11Var.f39741j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && m11Var.f39740i) {
            m11Var.b(true);
            m11Var.f39740i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40629b.f39735b) {
            boolean z10 = true;
            if (!this.f40632f) {
                for (int i10 = 0; i10 < this.f40629b.f39737e.size(); i10++) {
                    ((o11) this.f40629b.f39737e.get(i10)).setParentView(this);
                }
                this.f40632f = true;
                if (!this.f40631e) {
                    this.f40631e = true;
                    post(new nz0(this, 4));
                }
            }
            if (!this.f40634r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40633n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40633n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40628a;
            ez0 ez0Var = profileActivity.f34211a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= ez0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ez0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f21931a;
                        pointF.set(nVar.getX() + childAt.getX() + ez0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + ez0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = fz.f();
            this.f40629b.f39736c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40629b.f39736c.draw(canvas);
            this.f40629b.f39736c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40629b.d.size() - 1;
            while (size >= 0) {
                o11 o11Var = (o11) this.f40629b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f40629b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float u10 = com.google.android.gms.internal.vision.e2.u(f13, this.f40629b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((u10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.hs.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                o11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                o11Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f40634r = false;
                b(this.f40630c);
                this.f40630c = null;
                return;
            }
            invalidate();
        }
    }
}
