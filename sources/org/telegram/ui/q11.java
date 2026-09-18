package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q11 extends View {
    public static final String[] f36656s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f36657a;
    public n11 f36658b;
    public n11 f36659c;
    public final PointF d;
    public boolean e;
    public boolean f36660f;
    public float h;
    public long f36661n;
    public boolean f36662r;

    public q11(ProfileActivity profileActivity, n11 n11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f36662r = false;
        this.f36657a = profileActivity;
        this.f36658b = n11Var;
    }

    public final boolean a() {
        n11 n11Var = this.f36658b;
        if (!n11Var.f35799b || this.h < 1.0f) {
            return false;
        }
        if (n11Var.f35800c.getLottieAnimation() != null) {
            this.f36658b.f35800c.getLottieAnimation().N(0, false, false);
            this.f36658b.f35800c.getLottieAnimation().H(true);
        }
        this.f36662r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(n11 n11Var) {
        if (this.f36658b != n11Var && n11Var != null) {
            ArrayList arrayList = n11Var.e;
            if (this.f36662r) {
                this.f36659c = n11Var;
                return;
            }
            if (this.f36660f) {
                for (int i10 = 0; i10 < this.f36658b.e.size(); i10++) {
                    ((p11) this.f36658b.e.get(i10)).setParentView(null);
                }
                this.f36660f = false;
            }
            n11 n11Var2 = this.f36658b;
            ArrayList arrayList2 = n11Var2.f35804j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && n11Var2.f35803i) {
                n11Var2.b(true);
                n11Var2.f35803i = false;
            }
            this.f36658b = n11Var;
            if (!this.f36660f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((p11) arrayList.get(i11)).setParentView(this);
                }
                this.f36660f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36658b.f35804j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36660f) {
            for (int i10 = 0; i10 < this.f36658b.e.size(); i10++) {
                ((p11) this.f36658b.e.get(i10)).setParentView(null);
            }
            this.f36660f = false;
        }
        n11 n11Var = this.f36658b;
        ArrayList arrayList = n11Var.f35804j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && n11Var.f35803i) {
            n11Var.b(true);
            n11Var.f35803i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36658b.f35799b) {
            if (!this.f36660f) {
                for (int i10 = 0; i10 < this.f36658b.e.size(); i10++) {
                    ((p11) this.f36658b.e.get(i10)).setParentView(this);
                }
                this.f36660f = true;
                if (!this.e) {
                    this.e = true;
                    post(new e01(this, 3));
                }
            }
            if (!this.f36662r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f36661n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f36661n = currentTimeMillis;
            ProfileActivity profileActivity = this.f36657a;
            fz0 fz0Var = profileActivity.f31482a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= fz0Var.getChildCount()) {
                        break;
                    }
                    View childAt = fz0Var.getChildAt(i12);
                    if (i11 == RecyclerView.S(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.o oVar = ((org.telegram.ui.Cells.c9) childAt).f20070a;
                        pointF.set(oVar.getX() + childAt.getX() + fz0Var.getX() + AndroidUtilities.dp(12.0f), (oVar.getMeasuredHeight() / 2.0f) + oVar.getY() + childAt.getY() + fz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = gz.f();
            this.f36658b.f35800c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f36658b.f35800c.draw(canvas);
            this.f36658b.f35800c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f36658b.d.size() - 1;
            while (size >= 0) {
                p11 p11Var = (p11) this.f36658b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f36658b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f36658b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.qr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                p11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                p11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f36662r = false;
                b(this.f36659c);
                this.f36659c = null;
                return;
            }
            invalidate();
        }
    }
}
