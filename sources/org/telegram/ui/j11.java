package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j11 extends View {
    public static final String[] f37554s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f37555a;
    public g11 f37556b;
    public g11 f37557c;
    public final PointF d;
    public boolean f37558e;
    public boolean f37559f;
    public float h;
    public long f37560n;
    public boolean f37561r;

    public j11(ProfileActivity profileActivity, g11 g11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f37561r = false;
        this.f37555a = profileActivity;
        this.f37556b = g11Var;
    }

    public final boolean a() {
        g11 g11Var = this.f37556b;
        if (!g11Var.f36472b || this.h < 1.0f) {
            return false;
        }
        if (g11Var.f36473c.getLottieAnimation() != null) {
            this.f37556b.f36473c.getLottieAnimation().N(0, false, false);
            this.f37556b.f36473c.getLottieAnimation().H(true);
        }
        this.f37561r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(g11 g11Var) {
        if (this.f37556b != g11Var && g11Var != null) {
            ArrayList arrayList = g11Var.f36474e;
            if (this.f37561r) {
                this.f37557c = g11Var;
                return;
            }
            if (this.f37559f) {
                for (int i10 = 0; i10 < this.f37556b.f36474e.size(); i10++) {
                    ((i11) this.f37556b.f36474e.get(i10)).setParentView(null);
                }
                this.f37559f = false;
            }
            g11 g11Var2 = this.f37556b;
            ArrayList arrayList2 = g11Var2.f36478j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && g11Var2.f36477i) {
                g11Var2.b(true);
                g11Var2.f36477i = false;
            }
            this.f37556b = g11Var;
            if (!this.f37559f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((i11) arrayList.get(i11)).setParentView(this);
                }
                this.f37559f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37556b.f36478j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37559f) {
            for (int i10 = 0; i10 < this.f37556b.f36474e.size(); i10++) {
                ((i11) this.f37556b.f36474e.get(i10)).setParentView(null);
            }
            this.f37559f = false;
        }
        g11 g11Var = this.f37556b;
        ArrayList arrayList = g11Var.f36478j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && g11Var.f36477i) {
            g11Var.b(true);
            g11Var.f36477i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37556b.f36472b) {
            if (!this.f37559f) {
                for (int i10 = 0; i10 < this.f37556b.f36474e.size(); i10++) {
                    ((i11) this.f37556b.f36474e.get(i10)).setParentView(this);
                }
                this.f37559f = true;
                if (!this.f37558e) {
                    this.f37558e = true;
                    post(new hz0(this, 4));
                }
            }
            if (!this.f37561r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f37560n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f37560n = currentTimeMillis;
            ProfileActivity profileActivity = this.f37555a;
            yy0 yy0Var = profileActivity.f34208a;
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
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f21892a;
                        pointF.set(nVar.getX() + childAt.getX() + yy0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + yy0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = gz.f();
            this.f37556b.f36473c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f37556b.f36473c.draw(canvas);
            this.f37556b.f36473c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f37556b.d.size() - 1;
            while (size >= 0) {
                i11 i11Var = (i11) this.f37556b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f37556b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f37556b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.tr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                i11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                i11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f37561r = false;
                b(this.f37557c);
                this.f37557c = null;
                return;
            }
            invalidate();
        }
    }
}
