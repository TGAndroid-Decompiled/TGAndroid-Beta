package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z21 extends s61 {
    public final org.telegram.ui.l20 f30688f3;
    public final d6 f30689g3;
    public final d6 f30690h3;
    public final RectF f30691i3;
    public final Paint j3;
    public final d6 f30692k3;
    public Drawable f30693l3;
    public int f30694m3;
    public final Paint f30695n3;
    public final l31 f30696o3;

    public z21(l31 l31Var, Context context, int i10, y21 y21Var, q21 q21Var, q21 q21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, y21Var, q21Var, q21Var2, f6Var);
        this.f30696o3 = l31Var;
        this.f30688f3 = new org.telegram.ui.l20();
        qr qrVar = qr.h;
        this.f30689g3 = new d6(this, 320L, qrVar);
        this.f30690h3 = new d6(this, 320L, qrVar);
        this.f30691i3 = new RectF();
        this.j3 = new Paint(1);
        this.f30692k3 = new d6(this, 420L, qrVar);
        this.f30695n3 = new Paint(1);
    }

    @Override
    public final Integer X0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float e = this.f30689g3.e(canScrollHorizontally(-1));
        float e7 = this.f30690h3.e(canScrollHorizontally(1));
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i11 <= 0 && e7 <= 0.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f13 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof g31) {
                g31 g31Var = (g31) childAt;
                if (g31Var.f24246s) {
                    if (width > g31Var.getX()) {
                        width = g31Var.getX();
                        RecyclerView.S(g31Var);
                    }
                    if (f13 < g31Var.getX() + g31Var.getWidth()) {
                        f13 = g31Var.getX() + g31Var.getWidth();
                        RecyclerView.S(g31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f29207p2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            Paint paint = this.f30695n3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f30693l3 == null) {
                this.f30693l3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19060b9, f6Var);
            if (this.f30694m3 != v02) {
                Drawable drawable = this.f30693l3;
                this.f30694m3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f30693l3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f30693l3.draw(canvas2);
        } else {
            f7 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        l31 l31Var = this.f30696o3;
        long j3 = l31Var.H;
        long j10 = l31Var.V;
        d6 d6Var = this.f30692k3;
        if (j3 != j10) {
            l31Var.I = j3;
            d6Var.d(0.0f, true);
        }
        l31Var.H = l31Var.V;
        g31 g31Var2 = null;
        g31 g31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof g31) {
                g31 g31Var4 = (g31) childAt2;
                if (!g31Var4.f24248x) {
                    i10 = i11;
                    if (g31Var4.getTopicId() == l31Var.V) {
                        g31Var2 = g31Var4;
                    }
                    f12 = e7;
                    if (g31Var4.getTopicId() == l31Var.I) {
                        g31Var3 = g31Var4;
                    }
                    i13++;
                    i11 = i10;
                    e7 = f12;
                }
            }
            f12 = e7;
            i10 = i11;
            i13++;
            i11 = i10;
            e7 = f12;
        }
        float f14 = e7;
        int i14 = i11;
        if (g31Var2 != null) {
            float x10 = g31Var2.getX() + AndroidUtilities.dp(f10);
            float y3 = g31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (g31Var2.getX() + g31Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (g31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f30691i3;
            rectF2.set(x10, y3, x11, y10);
            if (g31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(g31Var3.getX() + AndroidUtilities.dp(f10), g31Var3.getY() + AndroidUtilities.dp(4.0f), (g31Var3.getX() + g31Var3.getWidth()) - AndroidUtilities.dp(f10), (g31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, d6Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), 31);
            Paint paint2 = this.j3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.l20 l20Var = this.f30688f3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                l20Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (f14 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                l20Var.b(canvas2, rectF5, 2, f14);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
