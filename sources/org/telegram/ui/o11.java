package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o11 extends View {
    public static final String[] f40415s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40416a;
    public l11 f40417b;
    public l11 f40418c;
    public final PointF d;
    public boolean f40419e;
    public boolean f40420f;
    public float h;
    public long f40421n;
    public boolean f40422r;

    public o11(ProfileActivity profileActivity, l11 l11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40422r = false;
        this.f40416a = profileActivity;
        this.f40417b = l11Var;
    }

    public final boolean a() {
        l11 l11Var = this.f40417b;
        if (!l11Var.f39515b || this.h < 1.0f) {
            return false;
        }
        if (l11Var.f39516c.getLottieAnimation() != null) {
            this.f40417b.f39516c.getLottieAnimation().N(0, false, false);
            this.f40417b.f39516c.getLottieAnimation().H(true);
        }
        this.f40422r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(l11 l11Var) {
        if (this.f40417b != l11Var && l11Var != null) {
            ArrayList arrayList = l11Var.f39517e;
            if (this.f40422r) {
                this.f40418c = l11Var;
                return;
            }
            if (this.f40420f) {
                for (int i10 = 0; i10 < this.f40417b.f39517e.size(); i10++) {
                    ((n11) this.f40417b.f39517e.get(i10)).setParentView(null);
                }
                this.f40420f = false;
            }
            l11 l11Var2 = this.f40417b;
            ArrayList arrayList2 = l11Var2.f39521j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && l11Var2.f39520i) {
                l11Var2.b(true);
                l11Var2.f39520i = false;
            }
            this.f40417b = l11Var;
            if (!this.f40420f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((n11) arrayList.get(i11)).setParentView(this);
                }
                this.f40420f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40417b.f39521j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40420f) {
            for (int i10 = 0; i10 < this.f40417b.f39517e.size(); i10++) {
                ((n11) this.f40417b.f39517e.get(i10)).setParentView(null);
            }
            this.f40420f = false;
        }
        l11 l11Var = this.f40417b;
        ArrayList arrayList = l11Var.f39521j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && l11Var.f39520i) {
            l11Var.b(true);
            l11Var.f39520i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40417b.f39515b) {
            boolean z10 = true;
            if (!this.f40420f) {
                for (int i10 = 0; i10 < this.f40417b.f39517e.size(); i10++) {
                    ((n11) this.f40417b.f39517e.get(i10)).setParentView(this);
                }
                this.f40420f = true;
                if (!this.f40419e) {
                    this.f40419e = true;
                    post(new mz0(this, 4));
                }
            }
            if (!this.f40422r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40421n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40421n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40416a;
            dz0 dz0Var = profileActivity.f34273a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= dz0Var.getChildCount()) {
                        break;
                    }
                    View childAt = dz0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f21959a;
                        pointF.set(nVar.getX() + childAt.getX() + dz0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + dz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = ez.f();
            this.f40417b.f39516c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40417b.f39516c.draw(canvas);
            this.f40417b.f39516c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40417b.d.size() - 1;
            while (size >= 0) {
                n11 n11Var = (n11) this.f40417b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f40417b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float u10 = com.google.android.gms.internal.vision.e2.u(f13, this.f40417b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((u10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.is.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                n11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                n11Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f40422r = false;
                b(this.f40418c);
                this.f40418c = null;
                return;
            }
            invalidate();
        }
    }
}
