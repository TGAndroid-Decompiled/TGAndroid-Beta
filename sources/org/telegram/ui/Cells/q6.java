package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.rd;
import org.telegram.messenger.sd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final m.f3 D;
    public final org.telegram.ui.Components.w5 E;
    public final org.telegram.ui.Components.w5 F;
    public final org.telegram.ui.Components.w5 G;
    public final org.telegram.ui.Components.i6 H;
    public final y f30140a;
    public final int f30141b;
    public int f30142c;
    public final int d;
    public final org.telegram.ui.ActionBar.k5 f30143e;
    public final org.telegram.ui.ActionBar.k5 f30144f;
    public final ImageView h;
    public long f30145n;
    public final RectF f30146r;
    public final boolean f30147s;
    public final boolean f30148w;
    public final org.telegram.ui.ActionBar.f6 f30149x;
    public boolean f30150y;

    public q6(android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q6.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j3;
        rd h = sd.f(this.d).h(this.f30145n);
        if (h != null) {
            if (this.f30148w) {
                String M0 = hd.M0(2131744839, null);
                TLRPC.Message message = h.h.f23244k;
                int i7 = message.edit_date;
                if (i7 != 0) {
                    j3 = i7;
                } else {
                    j3 = message.date;
                }
                b(M0, hd.D(j3));
                return;
            }
            b(hd.M0(2131745395, null), hd.M0(2131745394, null));
            return;
        }
        b(hd.M0(2131745619, null), hd.M0(2131745614, null));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f30141b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public final void b(String str, String str2) {
        this.f30144f.l(str, false);
        this.f30143e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30146r != null) {
            m.f3 f3Var = this.D;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.i3(f3Var, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.D);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10;
        float f10;
        int i7;
        Paint W0;
        float L;
        int i10;
        boolean z9 = this.f30150y;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30149x;
        if (z9 && (W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var)) != null) {
            if (hd.f22878a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f22878a0) {
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
        if (!this.f30148w) {
            int i11 = this.d;
            rd h = sd.f(i11).h(this.f30145n);
            org.telegram.ui.Components.w5 w5Var = this.E;
            float f12 = w5Var.f39855c;
            int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
            org.telegram.ui.Components.w5 w5Var2 = this.F;
            if (h != null && (i7 = h.f25275c) >= currentTime && h.d != Integer.MAX_VALUE) {
                f12 = Math.abs(i7 - currentTime) / h.d;
                e10 = w5Var2.d(true);
            } else {
                w5Var2.getClass();
                e10 = w5Var2.e(false, 0.0f);
            }
            float f13 = e10;
            float f14 = f12;
            if (f13 <= 0.0f) {
                return;
            }
            if (hd.f22878a0) {
                this.f30146r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            } else {
                this.f30146r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            }
            canvas2.save();
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas2.scale(T1, T1, this.f30146r.centerX(), this.f30146r.centerY());
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, f6Var);
            org.telegram.ui.ActionBar.k6.f27992l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.f27992l2.getAlpha();
            float f15 = alpha;
            org.telegram.ui.ActionBar.k6.f27992l2.setAlpha((int) (0.2f * f15 * f13));
            canvas2.drawArc(this.f30146r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.f27992l2);
            org.telegram.ui.ActionBar.k6.f27992l2.setAlpha((int) (f15 * f13));
            canvas.drawArc(this.f30146r, -90.0f, w5Var.e(false, f14) * (-360.0f), false, org.telegram.ui.ActionBar.k6.f27992l2);
            org.telegram.ui.ActionBar.k6.f27992l2.setAlpha(alpha);
            org.telegram.ui.Components.i6 i6Var = this.H;
            if (h != null) {
                i6Var.t(hd.C(Math.abs(h.f25275c - currentTime)), true, true);
            }
            int length = i6Var.f34514i.length();
            if (length > 4) {
                f10 = 0.75f;
            } else if (length > 3) {
                f10 = 0.85f;
            } else {
                f10 = 1.0f;
            }
            float e11 = this.G.e(false, f10);
            canvas.scale(e11, e11, this.f30146r.centerX(), this.f30146r.centerY());
            i6Var.u(w02);
            i6Var.B = (int) (f13 * 255.0f);
            RectF rectF = this.f30146r;
            RectF rectF2 = this.f30146r;
            i6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
    }

    public void setDialogId(long j3) {
        this.f30145n = j3;
        if (this.f30147s) {
            a();
        }
    }

    public void setHasLocation(boolean z9) {
        float f10;
        float f11;
        if (sd.f(this.d).h(this.f30145n) == null) {
            float f12 = 0.5f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f30144f.setAlpha(f10);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.f30143e.setAlpha(f11);
            if (z9) {
                f12 = 1.0f;
            }
            this.h.setAlpha(f12);
        }
        if (this.f30147s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        int w02;
        try {
            if (this.f30140a != null && (i7 = this.f30141b) >= 0 && (w02 = org.telegram.ui.ActionBar.k6.w0(i7, this.f30149x)) != this.f30142c) {
                this.f30142c = w02;
                org.telegram.ui.ActionBar.k6.H1(this.f30140a, w02, false);
                org.telegram.ui.ActionBar.k6.H1(this.f30140a, w02, true);
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
        if (drawable != this.H && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
