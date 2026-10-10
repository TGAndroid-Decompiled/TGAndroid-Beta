package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p11 extends View {
    public static final String[] f40673s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40674a;
    public m11 f40675b;
    public m11 f40676c;
    public final PointF d;
    public boolean f40677e;
    public boolean f40678f;
    public float h;
    public long f40679n;
    public boolean f40680r;

    public p11(ProfileActivity profileActivity, m11 m11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40680r = false;
        this.f40674a = profileActivity;
        this.f40675b = m11Var;
    }

    public final boolean a() {
        m11 m11Var = this.f40675b;
        if (!m11Var.f39781b || this.h < 1.0f) {
            return false;
        }
        if (m11Var.f39782c.getLottieAnimation() != null) {
            this.f40675b.f39782c.getLottieAnimation().N(0, false, false);
            this.f40675b.f39782c.getLottieAnimation().H(true);
        }
        this.f40680r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(m11 m11Var) {
        if (this.f40675b != m11Var && m11Var != null) {
            ArrayList arrayList = m11Var.f39783e;
            if (this.f40680r) {
                this.f40676c = m11Var;
                return;
            }
            if (this.f40678f) {
                for (int i10 = 0; i10 < this.f40675b.f39783e.size(); i10++) {
                    ((o11) this.f40675b.f39783e.get(i10)).setParentView(null);
                }
                this.f40678f = false;
            }
            m11 m11Var2 = this.f40675b;
            ArrayList arrayList2 = m11Var2.f39787j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && m11Var2.f39786i) {
                m11Var2.b(true);
                m11Var2.f39786i = false;
            }
            this.f40675b = m11Var;
            if (!this.f40678f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((o11) arrayList.get(i11)).setParentView(this);
                }
                this.f40678f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40675b.f39787j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40678f) {
            for (int i10 = 0; i10 < this.f40675b.f39783e.size(); i10++) {
                ((o11) this.f40675b.f39783e.get(i10)).setParentView(null);
            }
            this.f40678f = false;
        }
        m11 m11Var = this.f40675b;
        ArrayList arrayList = m11Var.f39787j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && m11Var.f39786i) {
            m11Var.b(true);
            m11Var.f39786i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40675b.f39781b) {
            boolean z10 = true;
            if (!this.f40678f) {
                for (int i10 = 0; i10 < this.f40675b.f39783e.size(); i10++) {
                    ((o11) this.f40675b.f39783e.get(i10)).setParentView(this);
                }
                this.f40678f = true;
                if (!this.f40677e) {
                    this.f40677e = true;
                    post(new nz0(this, 4));
                }
            }
            if (!this.f40680r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40679n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40679n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40674a;
            ez0 ez0Var = profileActivity.f34249a;
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
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f21935a;
                        pointF.set(nVar.getX() + childAt.getX() + ez0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + ez0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = fz.f();
            this.f40675b.f39782c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40675b.f39782c.draw(canvas);
            this.f40675b.f39782c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40675b.d.size() - 1;
            while (size >= 0) {
                o11 o11Var = (o11) this.f40675b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f40675b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float u10 = com.google.android.gms.internal.vision.e2.u(f13, this.f40675b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((u10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.is.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                o11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                o11Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f40680r = false;
                b(this.f40676c);
                this.f40676c = null;
                return;
            }
            invalidate();
        }
    }
}
