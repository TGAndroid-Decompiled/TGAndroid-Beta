package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m01 extends View {
    public static final String[] f40276s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40277a;
    public j01 f40278b;
    public j01 f40279c;
    public final PointF d;
    public boolean f40280e;
    public boolean f40281f;
    public float h;
    public long f40282n;
    public boolean f40283r;

    public m01(ProfileActivity profileActivity, j01 j01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40283r = false;
        this.f40277a = profileActivity;
        this.f40278b = j01Var;
    }

    public final boolean a() {
        j01 j01Var = this.f40278b;
        if (!j01Var.f39330b || this.h < 1.0f) {
            return false;
        }
        if (j01Var.f39331c.getLottieAnimation() != null) {
            this.f40278b.f39331c.getLottieAnimation().L(0, false, false);
            this.f40278b.f39331c.getLottieAnimation().F(true);
        }
        this.f40283r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(j01 j01Var) {
        if (this.f40278b != j01Var && j01Var != null) {
            ArrayList arrayList = j01Var.f39332e;
            if (this.f40283r) {
                this.f40279c = j01Var;
                return;
            }
            if (this.f40281f) {
                for (int i9 = 0; i9 < this.f40278b.f39332e.size(); i9++) {
                    ((l01) this.f40278b.f39332e.get(i9)).setParentView(null);
                }
                this.f40281f = false;
            }
            j01 j01Var2 = this.f40278b;
            ArrayList arrayList2 = j01Var2.f39336j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && j01Var2.f39335i) {
                j01Var2.b(true);
                j01Var2.f39335i = false;
            }
            this.f40278b = j01Var;
            if (!this.f40281f) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((l01) arrayList.get(i10)).setParentView(this);
                }
                this.f40281f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40278b.f39336j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40281f) {
            for (int i9 = 0; i9 < this.f40278b.f39332e.size(); i9++) {
                ((l01) this.f40278b.f39332e.get(i9)).setParentView(null);
            }
            this.f40281f = false;
        }
        j01 j01Var = this.f40278b;
        ArrayList arrayList = j01Var.f39336j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && j01Var.f39335i) {
            j01Var.b(true);
            j01Var.f39335i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40278b.f39330b) {
            if (!this.f40281f) {
                for (int i9 = 0; i9 < this.f40278b.f39332e.size(); i9++) {
                    ((l01) this.f40278b.f39332e.get(i9)).setParentView(this);
                }
                this.f40281f = true;
                if (!this.f40280e) {
                    this.f40280e = true;
                    post(new ky0(this, 4));
                }
            }
            if (!this.f40283r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40282n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40282n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40277a;
            by0 by0Var = profileActivity.f35918a;
            int i10 = profileActivity.Q2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= by0Var.getChildCount()) {
                        break;
                    }
                    View childAt = by0Var.getChildAt(i11);
                    if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.z8)) {
                        dh.u uVar = ((org.telegram.ui.Cells.z8) childAt).f26035a;
                        pointF.set(uVar.getX() + childAt.getX() + by0Var.getX() + AndroidUtilities.dp(12.0f), (uVar.getMeasuredHeight() / 2.0f) + uVar.getY() + childAt.getY() + by0Var.getY());
                        break;
                    }
                    i11++;
                }
            }
            float f11 = py.f();
            this.f40278b.f39331c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40278b.f39331c.draw(canvas);
            this.f40278b.f39331c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40278b.d.size() - 1;
            while (size >= 0) {
                l01 l01Var = (l01) this.f40278b.d.get(size);
                float f12 = size;
                float cascade = AndroidUtilities.cascade(this.h, f12, this.f40278b.d.size(), 1.8f);
                float f13 = dp;
                float f14 = 0.88f * f13;
                float d = e2.c.d(f14, this.f40278b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = pointF.y;
                float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                float interpolation = org.telegram.ui.Components.gr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f13 / 2.0f) * interpolation;
                float f19 = f13 * interpolation;
                l01Var.setImageCoords(f17 - f18, (f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                l01Var.draw(canvas);
                size--;
                f10 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f40283r = false;
                b(this.f40279c);
                this.f40279c = null;
                return;
            }
            invalidate();
        }
    }
}
