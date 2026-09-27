package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j11 extends View {
    public static final String[] f34558s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f34559a;
    public g11 f34560b;
    public g11 f34561c;
    public final PointF d;
    public boolean e;
    public boolean f34562f;
    public float h;
    public long f34563n;
    public boolean f34564r;

    public j11(ProfileActivity profileActivity, g11 g11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f34564r = false;
        this.f34559a = profileActivity;
        this.f34560b = g11Var;
    }

    public final boolean a() {
        g11 g11Var = this.f34560b;
        if (!g11Var.f33700b || this.h < 1.0f) {
            return false;
        }
        if (g11Var.f33701c.getLottieAnimation() != null) {
            this.f34560b.f33701c.getLottieAnimation().N(0, false, false);
            this.f34560b.f33701c.getLottieAnimation().H(true);
        }
        this.f34564r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(g11 g11Var) {
        if (this.f34560b != g11Var && g11Var != null) {
            ArrayList arrayList = g11Var.e;
            if (this.f34564r) {
                this.f34561c = g11Var;
                return;
            }
            if (this.f34562f) {
                for (int i10 = 0; i10 < this.f34560b.e.size(); i10++) {
                    ((i11) this.f34560b.e.get(i10)).setParentView(null);
                }
                this.f34562f = false;
            }
            g11 g11Var2 = this.f34560b;
            ArrayList arrayList2 = g11Var2.f33705j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && g11Var2.f33704i) {
                g11Var2.b(true);
                g11Var2.f33704i = false;
            }
            this.f34560b = g11Var;
            if (!this.f34562f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((i11) arrayList.get(i11)).setParentView(this);
                }
                this.f34562f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34560b.f33705j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34562f) {
            for (int i10 = 0; i10 < this.f34560b.e.size(); i10++) {
                ((i11) this.f34560b.e.get(i10)).setParentView(null);
            }
            this.f34562f = false;
        }
        g11 g11Var = this.f34560b;
        ArrayList arrayList = g11Var.f33705j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && g11Var.f33704i) {
            g11Var.b(true);
            g11Var.f33704i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34560b.f33700b) {
            if (!this.f34562f) {
                for (int i10 = 0; i10 < this.f34560b.e.size(); i10++) {
                    ((i11) this.f34560b.e.get(i10)).setParentView(this);
                }
                this.f34562f = true;
                if (!this.e) {
                    this.e = true;
                    post(new xz0(this, 3));
                }
            }
            if (!this.f34564r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f34563n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f34563n = currentTimeMillis;
            ProfileActivity profileActivity = this.f34559a;
            yy0 yy0Var = profileActivity.f31526a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= yy0Var.getChildCount()) {
                        break;
                    }
                    View childAt = yy0Var.getChildAt(i12);
                    if (i11 == RecyclerView.S(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f20108a;
                        pointF.set(nVar.getX() + childAt.getX() + yy0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + yy0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = fz.f();
            this.f34560b.f33701c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f34560b.f33701c.draw(canvas);
            this.f34560b.f33701c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f34560b.d.size() - 1;
            while (size >= 0) {
                i11 i11Var = (i11) this.f34560b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f34560b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f34560b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.sr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                i11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                i11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f34564r = false;
                b(this.f34561c);
                this.f34561c = null;
                return;
            }
            invalidate();
        }
    }
}
