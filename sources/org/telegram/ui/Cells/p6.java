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
import org.telegram.messenger.qd;
import org.telegram.messenger.rd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final j6.o E;
    public final org.telegram.ui.Components.u5 F;
    public final org.telegram.ui.Components.u5 G;
    public final org.telegram.ui.Components.u5 H;
    public final org.telegram.ui.Components.g6 I;
    public final y f30862a;
    public final int f30863b;
    public int f30864c;
    public final int d;
    public final org.telegram.ui.ActionBar.j5 f30865e;
    public final org.telegram.ui.ActionBar.j5 f30866f;
    public final ImageView h;
    public long f30867n;
    public final RectF f30868r;
    public final boolean f30869s;
    public final boolean f30870w;
    public final org.telegram.ui.ActionBar.e6 f30871x;
    public boolean f30872y;

    public p6(android.content.Context r22, org.telegram.ui.ActionBar.e6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p6.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j3;
        qd h = rd.f(this.d).h(this.f30867n);
        if (h != null) {
            if (this.f30870w) {
                String M0 = hd.M0(2131744838, null);
                TLRPC.Message message = h.h.f23819k;
                int i7 = message.edit_date;
                if (i7 != 0) {
                    j3 = i7;
                } else {
                    j3 = message.date;
                }
                b(M0, hd.D(j3));
                return;
            }
            b(hd.M0(2131745394, null), hd.M0(2131745393, null));
            return;
        }
        b(hd.M0(2131745618, null), hd.M0(2131745613, null));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f30863b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public final void b(String str, String str2) {
        this.f30866f.l(str, false);
        this.f30865e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30868r != null) {
            j6.o oVar = this.E;
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.i3(oVar, 1000L);
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
        int i7;
        Paint W0;
        float L;
        int i10;
        boolean z10 = this.f30872y;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30871x;
        if (z10 && (W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", e6Var)) != null) {
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
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
        if (!this.f30870w) {
            int i11 = this.d;
            qd h = rd.f(i11).h(this.f30867n);
            org.telegram.ui.Components.u5 u5Var = this.F;
            float f12 = u5Var.f39900c;
            int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
            org.telegram.ui.Components.u5 u5Var2 = this.G;
            if (h != null && (i7 = h.f26080c) >= currentTime && h.d != Integer.MAX_VALUE) {
                f12 = Math.abs(i7 - currentTime) / h.d;
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
            if (hd.f24104a0) {
                this.f30868r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            } else {
                this.f30868r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            }
            canvas2.save();
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas2.scale(T1, T1, this.f30868r.centerX(), this.f30868r.centerY());
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.jj, e6Var);
            org.telegram.ui.ActionBar.j6.f28992l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.j6.f28992l2.getAlpha();
            float f15 = alpha;
            org.telegram.ui.ActionBar.j6.f28992l2.setAlpha((int) (0.2f * f15 * f13));
            canvas2.drawArc(this.f30868r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.f28992l2);
            org.telegram.ui.ActionBar.j6.f28992l2.setAlpha((int) (f15 * f13));
            canvas.drawArc(this.f30868r, -90.0f, u5Var.e(false, f14) * (-360.0f), false, org.telegram.ui.ActionBar.j6.f28992l2);
            org.telegram.ui.ActionBar.j6.f28992l2.setAlpha(alpha);
            org.telegram.ui.Components.g6 g6Var = this.I;
            if (h != null) {
                g6Var.t(hd.C(Math.abs(h.f26080c - currentTime)), true, true);
            }
            int length = g6Var.f34840i.length();
            if (length > 4) {
                f10 = 0.75f;
            } else if (length > 3) {
                f10 = 0.85f;
            } else {
                f10 = 1.0f;
            }
            float e11 = this.H.e(false, f10);
            canvas.scale(e11, e11, this.f30868r.centerX(), this.f30868r.centerY());
            g6Var.u(w02);
            g6Var.C = (int) (f13 * 255.0f);
            RectF rectF = this.f30868r;
            RectF rectF2 = this.f30868r;
            g6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
    }

    public void setDialogId(long j3) {
        this.f30867n = j3;
        if (this.f30869s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f10;
        float f11;
        if (rd.f(this.d).h(this.f30867n) == null) {
            float f12 = 0.5f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f30866f.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.f30865e.setAlpha(f11);
            if (z10) {
                f12 = 1.0f;
            }
            this.h.setAlpha(f12);
        }
        if (this.f30869s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        int w02;
        try {
            if (this.f30862a != null && (i7 = this.f30863b) >= 0 && (w02 = org.telegram.ui.ActionBar.j6.w0(i7, this.f30871x)) != this.f30864c) {
                this.f30864c = w02;
                org.telegram.ui.ActionBar.j6.H1(this.f30862a, w02, false);
                org.telegram.ui.ActionBar.j6.H1(this.f30862a, w02, true);
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
