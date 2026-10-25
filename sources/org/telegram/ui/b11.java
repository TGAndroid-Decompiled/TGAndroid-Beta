package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b11 extends View {
    public static final String[] f37941s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f37942a;
    public y01 f37943b;
    public y01 f37944c;
    public final PointF d;
    public boolean e;
    public boolean f37945f;
    public float h;
    public long f37946n;
    public boolean f37947r;

    public b11(ProfileActivity profileActivity, y01 y01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f37947r = false;
        this.f37942a = profileActivity;
        this.f37943b = y01Var;
    }

    public final boolean a() {
        y01 y01Var = this.f37943b;
        if (!y01Var.f45917b || this.h < 1.0f) {
            return false;
        }
        if (y01Var.f45918c.getLottieAnimation() != null) {
            this.f37943b.f45918c.getLottieAnimation().N(0, false, false);
            this.f37943b.f45918c.getLottieAnimation().H(true);
        }
        this.f37947r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(y01 y01Var) {
        if (this.f37943b != y01Var && y01Var != null) {
            ArrayList arrayList = y01Var.e;
            if (this.f37947r) {
                this.f37944c = y01Var;
                return;
            }
            if (this.f37945f) {
                for (int i10 = 0; i10 < this.f37943b.e.size(); i10++) {
                    ((a11) this.f37943b.e.get(i10)).setParentView(null);
                }
                this.f37945f = false;
            }
            y01 y01Var2 = this.f37943b;
            ArrayList arrayList2 = y01Var2.f45922j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && y01Var2.f45921i) {
                y01Var2.b(true);
                y01Var2.f45921i = false;
            }
            this.f37943b = y01Var;
            if (!this.f37945f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((a11) arrayList.get(i11)).setParentView(this);
                }
                this.f37945f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37943b.f45922j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37945f) {
            for (int i10 = 0; i10 < this.f37943b.e.size(); i10++) {
                ((a11) this.f37943b.e.get(i10)).setParentView(null);
            }
            this.f37945f = false;
        }
        y01 y01Var = this.f37943b;
        ArrayList arrayList = y01Var.f45922j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && y01Var.f45921i) {
            y01Var.b(true);
            y01Var.f45921i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37943b.f45917b) {
            boolean z10 = true;
            if (!this.f37945f) {
                for (int i10 = 0; i10 < this.f37943b.e.size(); i10++) {
                    ((a11) this.f37943b.e.get(i10)).setParentView(this);
                }
                this.f37945f = true;
                if (!this.e) {
                    this.e = true;
                    post(new my0(this, 6));
                }
            }
            if (!this.f37947r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f37946n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f37946n = currentTimeMillis;
            ProfileActivity profileActivity = this.f37942a;
            py0 py0Var = profileActivity.f35945a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= py0Var.getChildCount()) {
                        break;
                    }
                    View childAt = py0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.g9)) {
                        xh.n nVar = ((org.telegram.ui.Cells.g9) childAt).f24170a;
                        pointF.set(nVar.getX() + childAt.getX() + py0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + py0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = oy.f();
            this.f37943b.f45918c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f37943b.f45918c.draw(canvas);
            this.f37943b.f45918c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f37943b.d.size() - 1;
            while (size >= 0) {
                a11 a11Var = (a11) this.f37943b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f37943b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float f14 = c3.h0.f(f13, this.f37943b.d.size() - 1, getWidth(), f7);
                float f15 = pointF.x;
                float f16 = f7;
                float f17 = pointF.y;
                float f18 = ((f14 - f15) * cascade) + (f13 * f11) + f15;
                float interpolation = org.telegram.ui.Components.ds.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f19 = (f12 / f16) * interpolation;
                float f20 = f12 * interpolation;
                a11Var.setImageCoords(f18 - f19, (f17 - ((f17 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f19, f20, f20);
                a11Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f16;
            }
            if (this.h >= 1.0f) {
                this.f37947r = false;
                b(this.f37944c);
                this.f37944c = null;
                return;
            }
            invalidate();
        }
    }
}
