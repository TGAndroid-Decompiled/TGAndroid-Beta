package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.md;
import org.telegram.messenger.nd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final mg.c2 D;
    public final org.telegram.ui.Components.t5 E;
    public final org.telegram.ui.Components.t5 F;
    public final org.telegram.ui.Components.t5 G;
    public final org.telegram.ui.Components.e6 H;
    public final y f23132a;
    public final int f23133b;
    public int f23134c;
    public final int d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final org.telegram.ui.ActionBar.u5 f23135f;
    public final ImageView h;
    public long f23136n;
    public final RectF f23137r;
    public final boolean f23138s;
    public final boolean f23139w;
    public final org.telegram.ui.ActionBar.p6 f23140x;
    public boolean f23141y;

    public u6(android.content.Context r22, org.telegram.ui.ActionBar.p6 r23, boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u6.<init>(android.content.Context, org.telegram.ui.ActionBar.p6, boolean, boolean):void");
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        long j10;
        md h = nd.f(this.d).h(this.f23136n);
        if (h != null) {
            if (this.f23139w) {
                String L0 = cd.L0(2131744856, null);
                TLRPC.Message message = h.h.f16337k;
                int i10 = message.edit_date;
                if (i10 != 0) {
                    j10 = i10;
                } else {
                    j10 = message.date;
                }
                b(L0, cd.D(j10));
                return;
            }
            b(cd.L0(2131745412, null), cd.L0(2131745411, null));
            return;
        }
        b(cd.L0(2131745635, null), cd.L0(2131745630, null));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.f23133b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public final void b(String str, String str2) {
        this.f23135f.l(str, false);
        this.e.l(str2, false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23137r != null) {
            mg.c2 c2Var = this.D;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.h3(c2Var, 1000L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.D);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e;
        float f7;
        int i10;
        Paint W0;
        float L;
        int i11;
        boolean z10 = this.f23141y;
        org.telegram.ui.ActionBar.p6 p6Var = this.f23140x;
        if (z10 && (W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var)) != null) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(73.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i11 = org.telegram.messenger.i0.L(73.0f);
            } else {
                i11 = 0;
            }
            float f10 = L;
            canvas2 = canvas;
            canvas2.drawRect(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight(), W0);
        } else {
            canvas2 = canvas;
        }
        if (!this.f23139w) {
            int i12 = this.d;
            md h = nd.f(i12).h(this.f23136n);
            org.telegram.ui.Components.t5 t5Var = this.E;
            float f11 = t5Var.f30445c;
            int currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
            org.telegram.ui.Components.t5 t5Var2 = this.F;
            if (h != null && (i10 = h.f16942c) >= currentTime && h.d != Integer.MAX_VALUE) {
                f11 = Math.abs(i10 - currentTime) / h.d;
                e = t5Var2.d(true);
            } else {
                t5Var2.getClass();
                e = t5Var2.e(false, 0.0f);
            }
            float f12 = e;
            float f13 = f11;
            if (f12 <= 0.0f) {
                return;
            }
            if (cd.X) {
                this.f23137r.set(org.telegram.messenger.i0.L(13.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(43.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.i0.L(15.0f));
            } else {
                this.f23137r.set(getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(15.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(13.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.i0.L(15.0f));
            }
            canvas2.save();
            float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, f12);
            canvas2.scale(T1, T1, this.f23137r.centerX(), this.f23137r.centerY());
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.gj, p6Var);
            org.telegram.ui.ActionBar.t6.f21073l2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.t6.f21073l2.getAlpha();
            float f14 = alpha;
            org.telegram.ui.ActionBar.t6.f21073l2.setAlpha((int) (0.2f * f14 * f12));
            canvas2.drawArc(this.f23137r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.t6.f21073l2);
            org.telegram.ui.ActionBar.t6.f21073l2.setAlpha((int) (f14 * f12));
            canvas.drawArc(this.f23137r, -90.0f, t5Var.e(false, f13) * (-360.0f), false, org.telegram.ui.ActionBar.t6.f21073l2);
            org.telegram.ui.ActionBar.t6.f21073l2.setAlpha(alpha);
            org.telegram.ui.Components.e6 e6Var = this.H;
            if (h != null) {
                e6Var.t(cd.C(Math.abs(h.f16942c - currentTime)), true, true);
            }
            int length = e6Var.f25700i.length();
            if (length > 4) {
                f7 = 0.75f;
            } else if (length > 3) {
                f7 = 0.85f;
            } else {
                f7 = 1.0f;
            }
            float e7 = this.G.e(false, f7);
            canvas.scale(e7, e7, this.f23137r.centerX(), this.f23137r.centerY());
            e6Var.u(w02);
            e6Var.B = (int) (f12 * 255.0f);
            RectF rectF = this.f23137r;
            RectF rectF2 = this.f23137r;
            e6Var.setBounds((int) rectF.left, (int) (rectF.centerY() - org.telegram.messenger.i0.L(13.0f)), (int) rectF2.right, (int) (rectF2.centerY() + org.telegram.messenger.i0.L(12.0f)));
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
    }

    public void setDialogId(long j10) {
        this.f23136n = j10;
        if (this.f23138s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        float f7;
        float f10;
        if (nd.f(this.d).h(this.f23136n) == null) {
            float f11 = 0.5f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            this.f23135f.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            this.e.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            }
            this.h.setAlpha(f11);
        }
        if (this.f23138s) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        int w02;
        try {
            if (this.f23132a != null && (i10 = this.f23133b) >= 0 && (w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.f23140x)) != this.f23134c) {
                this.f23134c = w02;
                org.telegram.ui.ActionBar.t6.H1(this.f23132a, w02, false);
                org.telegram.ui.ActionBar.t6.H1(this.f23132a, w02, true);
                ImageView imageView = this.h;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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
