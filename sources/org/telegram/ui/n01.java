package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n01 extends View {
    public static final String[] f40667s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40668a;
    public k01 f40669b;
    public k01 f40670c;
    public final PointF d;
    public boolean f40671e;
    public boolean f40672f;
    public float h;
    public long f40673n;
    public boolean f40674r;

    public n01(ProfileActivity profileActivity, k01 k01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40674r = false;
        this.f40668a = profileActivity;
        this.f40669b = k01Var;
    }

    public final boolean a() {
        k01 k01Var = this.f40669b;
        if (!k01Var.f39719b || this.h < 1.0f) {
            return false;
        }
        if (k01Var.f39720c.getLottieAnimation() != null) {
            this.f40669b.f39720c.getLottieAnimation().L(0, false, false);
            this.f40669b.f39720c.getLottieAnimation().F(true);
        }
        this.f40674r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(k01 k01Var) {
        if (this.f40669b != k01Var && k01Var != null) {
            ArrayList arrayList = k01Var.f39721e;
            if (this.f40674r) {
                this.f40670c = k01Var;
                return;
            }
            if (this.f40672f) {
                for (int i10 = 0; i10 < this.f40669b.f39721e.size(); i10++) {
                    ((m01) this.f40669b.f39721e.get(i10)).setParentView(null);
                }
                this.f40672f = false;
            }
            k01 k01Var2 = this.f40669b;
            ArrayList arrayList2 = k01Var2.f39725j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && k01Var2.f39724i) {
                k01Var2.b(true);
                k01Var2.f39724i = false;
            }
            this.f40669b = k01Var;
            if (!this.f40672f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((m01) arrayList.get(i11)).setParentView(this);
                }
                this.f40672f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40669b.f39725j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40672f) {
            for (int i10 = 0; i10 < this.f40669b.f39721e.size(); i10++) {
                ((m01) this.f40669b.f39721e.get(i10)).setParentView(null);
            }
            this.f40672f = false;
        }
        k01 k01Var = this.f40669b;
        ArrayList arrayList = k01Var.f39725j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && k01Var.f39724i) {
            k01Var.b(true);
            k01Var.f39724i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40669b.f39719b) {
            if (!this.f40672f) {
                for (int i10 = 0; i10 < this.f40669b.f39721e.size(); i10++) {
                    ((m01) this.f40669b.f39721e.get(i10)).setParentView(this);
                }
                this.f40672f = true;
                if (!this.f40671e) {
                    this.f40671e = true;
                    post(new ky0(this, 4));
                }
            }
            if (!this.f40674r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40673n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40673n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40668a;
            by0 by0Var = profileActivity.f35984a;
            int i11 = profileActivity.Q2;
            PointF pointF = this.d;
            float f9 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= by0Var.getChildCount()) {
                        break;
                    }
                    View childAt = by0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.w8)) {
                        gh.s sVar = ((org.telegram.ui.Cells.w8) childAt).f25875a;
                        pointF.set(sVar.getX() + childAt.getX() + by0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + by0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = ry.f();
            this.f40669b.f39720c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40669b.f39720c.draw(canvas);
            this.f40669b.f39720c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40669b.d.size() - 1;
            while (size >= 0) {
                m01 m01Var = (m01) this.f40669b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f40669b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float w10 = com.google.android.recaptcha.internal.a.w(f13, this.f40669b.d.size() - 1, getWidth(), f9);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((w10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.jr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                m01Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                m01Var.draw(canvas);
                size--;
                f9 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f40674r = false;
                b(this.f40670c);
                this.f40670c = null;
                return;
            }
            invalidate();
        }
    }
}
