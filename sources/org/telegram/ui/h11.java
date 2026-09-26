package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h11 extends View {
    public static final String[] f34095s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f34096a;
    public e11 f34097b;
    public e11 f34098c;
    public final PointF d;
    public boolean e;
    public boolean f34099f;
    public float h;
    public long f34100n;
    public boolean f34101r;

    public h11(ProfileActivity profileActivity, e11 e11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f34101r = false;
        this.f34096a = profileActivity;
        this.f34097b = e11Var;
    }

    public final boolean a() {
        e11 e11Var = this.f34097b;
        if (!e11Var.f33254b || this.h < 1.0f) {
            return false;
        }
        if (e11Var.f33255c.getLottieAnimation() != null) {
            this.f34097b.f33255c.getLottieAnimation().N(0, false, false);
            this.f34097b.f33255c.getLottieAnimation().H(true);
        }
        this.f34101r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(e11 e11Var) {
        if (this.f34097b != e11Var && e11Var != null) {
            ArrayList arrayList = e11Var.e;
            if (this.f34101r) {
                this.f34098c = e11Var;
                return;
            }
            if (this.f34099f) {
                for (int i10 = 0; i10 < this.f34097b.e.size(); i10++) {
                    ((g11) this.f34097b.e.get(i10)).setParentView(null);
                }
                this.f34099f = false;
            }
            e11 e11Var2 = this.f34097b;
            ArrayList arrayList2 = e11Var2.f33259j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && e11Var2.f33258i) {
                e11Var2.b(true);
                e11Var2.f33258i = false;
            }
            this.f34097b = e11Var;
            if (!this.f34099f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((g11) arrayList.get(i11)).setParentView(this);
                }
                this.f34099f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34097b.f33259j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34099f) {
            for (int i10 = 0; i10 < this.f34097b.e.size(); i10++) {
                ((g11) this.f34097b.e.get(i10)).setParentView(null);
            }
            this.f34099f = false;
        }
        e11 e11Var = this.f34097b;
        ArrayList arrayList = e11Var.f33259j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && e11Var.f33258i) {
            e11Var.b(true);
            e11Var.f33258i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34097b.f33254b) {
            if (!this.f34099f) {
                for (int i10 = 0; i10 < this.f34097b.e.size(); i10++) {
                    ((g11) this.f34097b.e.get(i10)).setParentView(this);
                }
                this.f34099f = true;
                if (!this.e) {
                    this.e = true;
                    post(new vz0(this, 3));
                }
            }
            if (!this.f34101r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f34100n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f34100n = currentTimeMillis;
            ProfileActivity profileActivity = this.f34096a;
            wy0 wy0Var = profileActivity.f31523a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= wy0Var.getChildCount()) {
                        break;
                    }
                    View childAt = wy0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f20106a;
                        pointF.set(nVar.getX() + childAt.getX() + wy0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + wy0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = cz.f();
            this.f34097b.f33255c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f34097b.f33255c.draw(canvas);
            this.f34097b.f33255c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f34097b.d.size() - 1;
            while (size >= 0) {
                g11 g11Var = (g11) this.f34097b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f34097b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f34097b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.sr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                g11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                g11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f34101r = false;
                b(this.f34098c);
                this.f34098c = null;
                return;
            }
            invalidate();
        }
    }
}
