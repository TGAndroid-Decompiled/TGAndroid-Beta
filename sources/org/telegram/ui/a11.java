package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a11 extends View {
    public static final String[] f34978s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f34979a;
    public x01 f34980b;
    public x01 f34981c;
    public final PointF d;
    public boolean f34982e;
    public boolean f34983f;
    public float h;
    public long f34984n;
    public boolean f34985r;

    public a11(ProfileActivity profileActivity, x01 x01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f34985r = false;
        this.f34979a = profileActivity;
        this.f34980b = x01Var;
    }

    public final boolean a() {
        x01 x01Var = this.f34980b;
        if (!x01Var.f42922b || this.h < 1.0f) {
            return false;
        }
        if (x01Var.f42923c.getLottieAnimation() != null) {
            this.f34980b.f42923c.getLottieAnimation().L(0, false, false);
            this.f34980b.f42923c.getLottieAnimation().F(true);
        }
        this.f34985r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(x01 x01Var) {
        if (this.f34980b != x01Var && x01Var != null) {
            ArrayList arrayList = x01Var.f42924e;
            if (this.f34985r) {
                this.f34981c = x01Var;
                return;
            }
            if (this.f34983f) {
                for (int i10 = 0; i10 < this.f34980b.f42924e.size(); i10++) {
                    ((z01) this.f34980b.f42924e.get(i10)).setParentView(null);
                }
                this.f34983f = false;
            }
            x01 x01Var2 = this.f34980b;
            ArrayList arrayList2 = x01Var2.f42928j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && x01Var2.f42927i) {
                x01Var2.b(true);
                x01Var2.f42927i = false;
            }
            this.f34980b = x01Var;
            if (!this.f34983f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((z01) arrayList.get(i11)).setParentView(this);
                }
                this.f34983f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34980b.f42928j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34983f) {
            for (int i10 = 0; i10 < this.f34980b.f42924e.size(); i10++) {
                ((z01) this.f34980b.f42924e.get(i10)).setParentView(null);
            }
            this.f34983f = false;
        }
        x01 x01Var = this.f34980b;
        ArrayList arrayList = x01Var.f42928j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && x01Var.f42927i) {
            x01Var.b(true);
            x01Var.f42927i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34980b.f42922b) {
            if (!this.f34983f) {
                for (int i10 = 0; i10 < this.f34980b.f42924e.size(); i10++) {
                    ((z01) this.f34980b.f42924e.get(i10)).setParentView(this);
                }
                this.f34983f = true;
                if (!this.f34982e) {
                    this.f34982e = true;
                    post(new xy0(this, 4));
                }
            }
            if (!this.f34985r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f34984n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f34984n = currentTimeMillis;
            ProfileActivity profileActivity = this.f34979a;
            oy0 oy0Var = profileActivity.f34560a;
            int i11 = profileActivity.R2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= oy0Var.getChildCount()) {
                        break;
                    }
                    View childAt = oy0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.y8)) {
                        jh.s sVar = ((org.telegram.ui.Cells.y8) childAt).f24450a;
                        pointF.set(sVar.getX() + childAt.getX() + oy0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + oy0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f11 = cz.f();
            this.f34980b.f42923c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f34980b.f42923c.draw(canvas);
            this.f34980b.f42923c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f34980b.d.size() - 1;
            while (size >= 0) {
                z01 z01Var = (z01) this.f34980b.d.get(size);
                float f12 = size;
                float cascade = AndroidUtilities.cascade(this.h, f12, this.f34980b.d.size(), 1.8f);
                float f13 = dp;
                float f14 = 0.88f * f13;
                float d = e2.c.d(f14, this.f34980b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = pointF.y;
                float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                float interpolation = org.telegram.ui.Components.pr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f13 / 2.0f) * interpolation;
                float f19 = f13 * interpolation;
                z01Var.setImageCoords(f17 - f18, (f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                z01Var.draw(canvas);
                size--;
                f10 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f34985r = false;
                b(this.f34981c);
                this.f34981c = null;
                return;
            }
            invalidate();
        }
    }
}
