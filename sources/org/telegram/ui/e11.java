package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e11 extends View {
    public static final String[] f36328s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f36329a;
    public b11 f36330b;
    public b11 f36331c;
    public final PointF d;
    public boolean f36332e;
    public boolean f36333f;
    public float h;
    public long f36334n;
    public boolean f36335r;

    public e11(ProfileActivity profileActivity, b11 b11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f36335r = false;
        this.f36329a = profileActivity;
        this.f36330b = b11Var;
    }

    public final boolean a() {
        b11 b11Var = this.f36330b;
        if (!b11Var.f35316b || this.h < 1.0f) {
            return false;
        }
        if (b11Var.f35317c.getLottieAnimation() != null) {
            this.f36330b.f35317c.getLottieAnimation().L(0, false, false);
            this.f36330b.f35317c.getLottieAnimation().F(true);
        }
        this.f36335r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(b11 b11Var) {
        if (this.f36330b != b11Var && b11Var != null) {
            ArrayList arrayList = b11Var.f35318e;
            if (this.f36335r) {
                this.f36331c = b11Var;
                return;
            }
            if (this.f36333f) {
                for (int i10 = 0; i10 < this.f36330b.f35318e.size(); i10++) {
                    ((d11) this.f36330b.f35318e.get(i10)).setParentView(null);
                }
                this.f36333f = false;
            }
            b11 b11Var2 = this.f36330b;
            ArrayList arrayList2 = b11Var2.f35322j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && b11Var2.f35321i) {
                b11Var2.b(true);
                b11Var2.f35321i = false;
            }
            this.f36330b = b11Var;
            if (!this.f36333f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((d11) arrayList.get(i11)).setParentView(this);
                }
                this.f36333f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36330b.f35322j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36333f) {
            for (int i10 = 0; i10 < this.f36330b.f35318e.size(); i10++) {
                ((d11) this.f36330b.f35318e.get(i10)).setParentView(null);
            }
            this.f36333f = false;
        }
        b11 b11Var = this.f36330b;
        ArrayList arrayList = b11Var.f35322j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && b11Var.f35321i) {
            b11Var.b(true);
            b11Var.f35321i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36330b.f35316b) {
            if (!this.f36333f) {
                for (int i10 = 0; i10 < this.f36330b.f35318e.size(); i10++) {
                    ((d11) this.f36330b.f35318e.get(i10)).setParentView(this);
                }
                this.f36333f = true;
                if (!this.f36332e) {
                    this.f36332e = true;
                    post(new sz0(this, 3));
                }
            }
            if (!this.f36335r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f36334n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f36334n = currentTimeMillis;
            ProfileActivity profileActivity = this.f36329a;
            ty0 ty0Var = profileActivity.f34560a;
            int i11 = profileActivity.R2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= ty0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ty0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.y8)) {
                        jh.s sVar = ((org.telegram.ui.Cells.y8) childAt).f24452a;
                        pointF.set(sVar.getX() + childAt.getX() + ty0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + ty0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f11 = cz.f();
            this.f36330b.f35317c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f36330b.f35317c.draw(canvas);
            this.f36330b.f35317c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f36330b.d.size() - 1;
            while (size >= 0) {
                d11 d11Var = (d11) this.f36330b.d.get(size);
                float f12 = size;
                float cascade = AndroidUtilities.cascade(this.h, f12, this.f36330b.d.size(), 1.8f);
                float f13 = dp;
                float f14 = 0.88f * f13;
                float d = e2.c.d(f14, this.f36330b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = pointF.y;
                float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                float interpolation = org.telegram.ui.Components.pr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f13 / 2.0f) * interpolation;
                float f19 = f13 * interpolation;
                d11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                d11Var.draw(canvas);
                size--;
                f10 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f36335r = false;
                b(this.f36331c);
                this.f36331c = null;
                return;
            }
            invalidate();
        }
    }
}
