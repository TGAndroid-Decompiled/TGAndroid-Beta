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
public final class a31 extends t61 {
    public final org.telegram.ui.l20 f22479f3;
    public final e6 f22480g3;
    public final e6 f22481h3;
    public final RectF f22482i3;
    public final Paint j3;
    public final e6 f22483k3;
    public Drawable f22484l3;
    public int f22485m3;
    public final Paint f22486n3;
    public final m31 f22487o3;

    public a31(m31 m31Var, Context context, int i10, z21 z21Var, r21 r21Var, r21 r21Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, z21Var, r21Var, r21Var2, e6Var);
        this.f22487o3 = m31Var;
        this.f22479f3 = new org.telegram.ui.l20();
        qr qrVar = qr.h;
        this.f22480g3 = new e6(this, 320L, qrVar);
        this.f22481h3 = new e6(this, 320L, qrVar);
        this.f22482i3 = new RectF();
        this.j3 = new Paint(1);
        this.f22483k3 = new e6(this, 420L, qrVar);
        this.f22486n3 = new Paint(1);
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
        float e = this.f22480g3.e(canScrollHorizontally(-1));
        float e7 = this.f22481h3.e(canScrollHorizontally(1));
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
            if (childAt instanceof h31) {
                h31 h31Var = (h31) childAt;
                if (h31Var.f24544s) {
                    if (width > h31Var.getX()) {
                        width = h31Var.getX();
                        RecyclerView.S(h31Var);
                    }
                    if (f13 < h31Var.getX() + h31Var.getWidth()) {
                        f13 = h31Var.getX() + h31Var.getWidth();
                        RecyclerView.S(h31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f30090p2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            Paint paint = this.f22486n3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f22484l3 == null) {
                this.f22484l3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19028b9, e6Var);
            if (this.f22485m3 != v02) {
                Drawable drawable = this.f22484l3;
                this.f22485m3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f22484l3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f22484l3.draw(canvas2);
        } else {
            f7 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        m31 m31Var = this.f22487o3;
        long j3 = m31Var.H;
        long j10 = m31Var.V;
        e6 e6Var2 = this.f22483k3;
        if (j3 != j10) {
            m31Var.I = j3;
            e6Var2.d(0.0f, true);
        }
        m31Var.H = m31Var.V;
        h31 h31Var2 = null;
        h31 h31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof h31) {
                h31 h31Var4 = (h31) childAt2;
                if (!h31Var4.f24546x) {
                    i10 = i11;
                    if (h31Var4.getTopicId() == m31Var.V) {
                        h31Var2 = h31Var4;
                    }
                    f12 = e7;
                    if (h31Var4.getTopicId() == m31Var.I) {
                        h31Var3 = h31Var4;
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
        if (h31Var2 != null) {
            float x10 = h31Var2.getX() + AndroidUtilities.dp(f10);
            float y3 = h31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (h31Var2.getX() + h31Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (h31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f22482i3;
            rectF2.set(x10, y3, x11, y10);
            if (h31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(h31Var3.getX() + AndroidUtilities.dp(f10), h31Var3.getY() + AndroidUtilities.dp(4.0f), (h31Var3.getX() + h31Var3.getWidth()) - AndroidUtilities.dp(f10), (h31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, e6Var2.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var), 31);
            Paint paint2 = this.j3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.l20 l20Var = this.f22479f3;
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
