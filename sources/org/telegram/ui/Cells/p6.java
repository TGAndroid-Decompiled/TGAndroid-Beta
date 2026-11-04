package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.kd;
import org.telegram.messenger.ld;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final mi.b0 E;
    public final org.telegram.ui.Components.u5 F;
    public final org.telegram.ui.Components.u5 G;
    public final org.telegram.ui.Components.u5 H;
    public final org.telegram.ui.Components.g6 I;
    public final y f29801a;
    public final int f29802b;
    public int f29803c;
    public final int d;
    public final org.telegram.ui.ActionBar.k5 f29804e;
    public final org.telegram.ui.ActionBar.k5 f29805f;
    public final ImageView h;
    public long f29806n;
    public final RectF f29807r;
    public final boolean f29808s;
    public final boolean f29809w;
    public final org.telegram.ui.ActionBar.e6 f29810x;
    public boolean f29811y;

    public p6(android.content.Context r22, org.telegram.ui.ActionBar.e6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p6.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j10;
        kd h = ld.f(this.d).h(this.f29806n);
        if (h != null) {
            if (this.f29809w) {
                String M0 = bd.M0(2131744848, null);
                TLRPC.Message message = h.h.f26868k;
                int i3 = message.edit_date;
                if (i3 != 0) {
                    j10 = i3;
                } else {
                    j10 = message.date;
                }
                b(M0, bd.D(j10));
                return;
            }
            b(bd.M0(2131745404, null), bd.M0(2131745403, null));
            return;
        }
        b(bd.M0(2131745628, null), bd.M0(2131745623, null));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i3 = this.f29802b;
        if (i3 >= 0) {
            hashSet.add(Integer.valueOf(i3));
        }
    }

    public final void b(String str, String str2) {
        this.f29805f.l(str, false);
        this.f29804e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29807r != null) {
            mi.b0 b0Var = this.E;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.E);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10;
        float f10;
        int i3;
        Paint W0;
        float L;
        int i10;
        boolean z10 = this.f29811y;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29810x;
        if (z10 && (W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var)) != null) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(73.0f);
            } else {
                i10 = 0;
            }
            float f11 = L;
            canvas2 = canvas;
            canvas2.drawRect(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight(), W0);
        } else {
            canvas2 = canvas;
        }
        if (!this.f29809w) {
            int i11 = this.d;
            kd h = ld.f(i11).h(this.f29806n);
            org.telegram.ui.Components.u5 u5Var = this.F;
            float f12 = u5Var.f38645c;
            int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
            org.telegram.ui.Components.u5 u5Var2 = this.G;
            if (h != null && (i3 = h.f23812c) >= currentTime && h.d != Integer.MAX_VALUE) {
                f12 = Math.abs(i3 - currentTime) / h.d;
                e10 = u5Var2.d(true);
            } else {
                u5Var2.getClass();
                e10 = u5Var2.e(false, 0.0f);
            }
            float f13 = e10;
            float f14 = f12;
            if (f13 <= 0.0f) {
                return;
            }
            if (bd.f21784a0) {
                this.f29807r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            } else {
                this.f29807r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            }
            canvas2.save();
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas2.scale(T1, T1, this.f29807r.centerX(), this.f29807r.centerY());
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, e6Var);
            org.telegram.ui.ActionBar.k6.f28022l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.f28022l2.getAlpha();
            float f15 = alpha;
            org.telegram.ui.ActionBar.k6.f28022l2.setAlpha((int) (0.2f * f15 * f13));
            canvas2.drawArc(this.f29807r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.f28022l2);
            org.telegram.ui.ActionBar.k6.f28022l2.setAlpha((int) (f15 * f13));
            canvas.drawArc(this.f29807r, -90.0f, u5Var.e(false, f14) * (-360.0f), false, org.telegram.ui.ActionBar.k6.f28022l2);
            org.telegram.ui.ActionBar.k6.f28022l2.setAlpha(alpha);
            org.telegram.ui.Components.g6 g6Var = this.I;
            if (h != null) {
                g6Var.t(bd.C(Math.abs(h.f23812c - currentTime)), true, true);
            }
            int length = g6Var.f33989i.length();
            if (length > 4) {
                f10 = 0.75f;
            } else if (length > 3) {
                f10 = 0.85f;
            } else {
                f10 = 1.0f;
            }
            float e11 = this.H.e(false, f10);
            canvas.scale(e11, e11, this.f29807r.centerX(), this.f29807r.centerY());
            g6Var.u(w02);
            g6Var.B = (int) (f13 * 255.0f);
            RectF rectF = this.f29807r;
            RectF rectF2 = this.f29807r;
            g6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.f29806n = j10;
        if (this.f29808s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f10;
        float f11;
        if (ld.f(this.d).h(this.f29806n) == null) {
            float f12 = 0.5f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f29805f.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.f29804e.setAlpha(f11);
            if (z10) {
                f12 = 1.0f;
            }
            this.h.setAlpha(f12);
        }
        if (this.f29808s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int i3;
        int w02;
        try {
            if (this.f29801a != null && (i3 = this.f29802b) >= 0 && (w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.f29810x)) != this.f29803c) {
                this.f29803c = w02;
                org.telegram.ui.ActionBar.k6.H1(this.f29801a, w02, false);
                org.telegram.ui.ActionBar.k6.H1(this.f29801a, w02, true);
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
