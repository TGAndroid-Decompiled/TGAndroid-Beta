package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.pd;
import org.telegram.messenger.qd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final j6.o E;
    public final org.telegram.ui.Components.d6 F;
    public final org.telegram.ui.Components.d6 G;
    public final org.telegram.ui.Components.d6 H;
    public final org.telegram.ui.Components.n6 I;
    public final y f31729a;
    public final int f31730b;
    public int f31731c;
    public final int d;
    public final org.telegram.ui.ActionBar.m5 f31732e;
    public final org.telegram.ui.ActionBar.m5 f31733f;
    public final ImageView h;
    public long f31734n;
    public final RectF f31735r;
    public final boolean f31736s;
    public final boolean f31737w;
    public final org.telegram.ui.ActionBar.h6 f31738x;
    public boolean f31739y;

    public r6(android.content.Context r22, org.telegram.ui.ActionBar.h6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r6.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j3;
        pd h = qd.f(this.d).h(this.f31734n);
        if (h != null) {
            if (this.f31737w) {
                String N0 = gd.N0(2131744597, null);
                TLRPC.Message message = h.h.f23993k;
                int i7 = message.edit_date;
                if (i7 != 0) {
                    j3 = i7;
                } else {
                    j3 = message.date;
                }
                b(N0, gd.D(j3));
                return;
            }
            b(gd.N0(2131745198, null), gd.N0(2131745197, null));
            return;
        }
        b(gd.N0(2131745422, null), gd.N0(2131745417, null));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f31730b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public final void b(String str, String str2) {
        this.f31733f.l(str, false);
        this.f31732e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31735r != null) {
            j6.o oVar = this.E;
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.h3(oVar, 1000L);
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
        boolean z10 = this.f31739y;
        org.telegram.ui.ActionBar.h6 h6Var = this.f31738x;
        if (z10 && (W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var)) != null) {
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
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
        if (!this.f31737w) {
            int i11 = this.d;
            pd h = qd.f(i11).h(this.f31734n);
            org.telegram.ui.Components.d6 d6Var = this.F;
            float f12 = d6Var.f34391c;
            int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
            org.telegram.ui.Components.d6 d6Var2 = this.G;
            if (h != null && (i7 = h.f26255c) >= currentTime && h.d != Integer.MAX_VALUE) {
                f12 = Math.abs(i7 - currentTime) / h.d;
                e10 = d6Var2.d(true);
            } else {
                d6Var2.getClass();
                e10 = d6Var2.e(false, 0.0f);
            }
            float f13 = e10;
            float f14 = f12;
            if (f13 <= 0.0f) {
                return;
            }
            if (gd.f24241a0) {
                this.f31735r.set(org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            } else {
                this.f31735r.set(getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(15.0f));
            }
            canvas2.save();
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas2.scale(T1, T1, this.f31735r.centerX(), this.f31735r.centerY());
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.jj, h6Var);
            org.telegram.ui.ActionBar.m6.f29521l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.m6.f29521l2.getAlpha();
            float f15 = alpha;
            org.telegram.ui.ActionBar.m6.f29521l2.setAlpha((int) (0.2f * f15 * f13));
            canvas2.drawArc(this.f31735r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.m6.f29521l2);
            org.telegram.ui.ActionBar.m6.f29521l2.setAlpha((int) (f15 * f13));
            canvas.drawArc(this.f31735r, -90.0f, d6Var.e(false, f14) * (-360.0f), false, org.telegram.ui.ActionBar.m6.f29521l2);
            org.telegram.ui.ActionBar.m6.f29521l2.setAlpha(alpha);
            org.telegram.ui.Components.n6 n6Var = this.I;
            if (h != null) {
                n6Var.t(gd.C(Math.abs(h.f26255c - currentTime)), true, true);
            }
            int length = n6Var.f37798i.length();
            if (length > 4) {
                f10 = 0.75f;
            } else if (length > 3) {
                f10 = 0.85f;
            } else {
                f10 = 1.0f;
            }
            float e11 = this.H.e(false, f10);
            canvas.scale(e11, e11, this.f31735r.centerX(), this.f31735r.centerY());
            n6Var.u(w02);
            n6Var.C = (int) (f13 * 255.0f);
            RectF rectF = this.f31735r;
            RectF rectF2 = this.f31735r;
            n6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - org.telegram.messenger.g0.L(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.g0.L(12.0f)));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
    }

    public void setDialogId(long j3) {
        this.f31734n = j3;
        if (this.f31736s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f10;
        float f11;
        if (qd.f(this.d).h(this.f31734n) == null) {
            float f12 = 0.5f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.f31733f.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.f31732e.setAlpha(f11);
            if (z10) {
                f12 = 1.0f;
            }
            this.h.setAlpha(f12);
        }
        if (this.f31736s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        int w02;
        try {
            if (this.f31729a != null && (i7 = this.f31730b) >= 0 && (w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.f31738x)) != this.f31731c) {
                this.f31731c = w02;
                org.telegram.ui.ActionBar.m6.H1(this.f31729a, w02, false);
                org.telegram.ui.ActionBar.m6.H1(this.f31729a, w02, true);
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
