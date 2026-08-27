package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class n01 extends View {

    public static final String[] f40619s = {"🎉", "🎆", "🎈"};

    public final ProfileActivity f40620a;

    public k01 f40621b;

    public k01 f40622c;
    public final PointF d;

    public boolean f40623e;

    public boolean f40624f;
    public float h;

    public long f40625n;

    public boolean f40626r;

    public n01(ProfileActivity profileActivity, k01 k01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40626r = false;
        this.f40620a = profileActivity;
        this.f40621b = k01Var;
    }

    public final boolean a() {
        k01 k01Var = this.f40621b;
        if (!k01Var.f39553b || this.h < 1.0f) {
            return false;
        }
        if (k01Var.f39554c.getLottieAnimation() != null) {
            this.f40621b.f39554c.getLottieAnimation().L(0, false, false);
            this.f40621b.f39554c.getLottieAnimation().F(true);
        }
        this.f40626r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(k01 k01Var) {
        if (this.f40621b == k01Var || k01Var == null) {
            return;
        }
        ArrayList arrayList = k01Var.f39555e;
        if (this.f40626r) {
            this.f40622c = k01Var;
            return;
        }
        if (this.f40624f) {
            for (int i10 = 0; i10 < this.f40621b.f39555e.size(); i10++) {
                ((m01) this.f40621b.f39555e.get(i10)).setParentView(null);
            }
            this.f40624f = false;
        }
        k01 k01Var2 = this.f40621b;
        ArrayList arrayList2 = k01Var2.f39559j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && k01Var2.f39558i) {
            k01Var2.b(true);
            k01Var2.f39558i = false;
        }
        this.f40621b = k01Var;
        if (this.f40624f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((m01) arrayList.get(i11)).setParentView(this);
        }
        this.f40624f = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40621b.f39559j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40624f) {
            for (int i10 = 0; i10 < this.f40621b.f39555e.size(); i10++) {
                ((m01) this.f40621b.f39555e.get(i10)).setParentView(null);
            }
            this.f40624f = false;
        }
        k01 k01Var = this.f40621b;
        ArrayList arrayList = k01Var.f39559j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && k01Var.f39558i) {
            k01Var.b(true);
            k01Var.f39558i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40621b.f39553b) {
            if (!this.f40624f) {
                for (int i10 = 0; i10 < this.f40621b.f39555e.size(); i10++) {
                    ((m01) this.f40621b.f39555e.get(i10)).setParentView(this);
                }
                this.f40624f = true;
                if (!this.f40623e) {
                    this.f40623e = true;
                    post(new ky0(this, 4));
                }
            }
            if (this.f40626r) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(jCurrentTimeMillis - this.f40625n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.f40625n = jCurrentTimeMillis;
                ProfileActivity profileActivity = this.f40620a;
                by0 by0Var = profileActivity.f35921a;
                int i11 = profileActivity.Q2;
                PointF pointF = this.d;
                float f10 = 2.0f;
                if (i11 >= 0) {
                    for (int i12 = 0; i12 < by0Var.getChildCount(); i12++) {
                        View childAt = by0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.v8)) {
                            eh.s sVar = ((org.telegram.ui.Cells.v8) childAt).f25814a;
                            pointF.set(sVar.getX() + childAt.getX() + by0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + by0Var.getY());
                            break;
                        }
                    }
                }
                float f11 = sy.f();
                this.f40621b.f39554c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.f40621b.f39554c.draw(canvas);
                this.f40621b.f39554c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int iDp = AndroidUtilities.dp(110.0f);
                int size = this.f40621b.d.size() - 1;
                while (size >= 0) {
                    m01 m01Var = (m01) this.f40621b.d.get(size);
                    float f12 = size;
                    float fCascade = AndroidUtilities.cascade(this.h, f12, this.f40621b.d.size(), 1.8f);
                    float f13 = iDp;
                    float f14 = 0.88f * f13;
                    float fW = com.google.android.recaptcha.internal.a.w(f14, this.f40621b.d.size() - 1, getWidth(), f10);
                    float f15 = pointF.x;
                    float f16 = pointF.y;
                    float f17 = ((fW - f15) * fCascade) + (f14 * f12) + f15;
                    float fPow = f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.er.h.getInterpolation(Utilities.clamp(fCascade / 0.4f, 1.0f, 0.0f));
                    float f18 = (f13 / 2.0f) * interpolation;
                    float f19 = f13 * interpolation;
                    m01Var.setImageCoords(f17 - f18, fPow - f18, f19, f19);
                    m01Var.draw(canvas);
                    size--;
                    f10 = 2.0f;
                }
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.f40626r = false;
                b(this.f40622c);
                this.f40622c = null;
            }
        }
    }
}
