package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class e5 extends ReplacementSpan {
    public final Paint f36919a;
    public final ImageReceiver f36920b;
    public final org.telegram.ui.Components.r8 f36921c;
    public float d;
    public final int e;
    public View f36922f;
    public boolean h;
    public final d5 f36923n;
    public float f36924r;
    public int f36925s;
    public boolean f36926w;

    public e5(int i10, View view) {
        this(18.0f, i10, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.t8 t8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (e5 e5Var : (e5[]) spannable.getSpans(0, spannable.length(), e5.class)) {
                e5Var.d(t8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.r8 r8Var = this.f36921c;
        r8Var.q(chat);
        this.f36920b.i0(chat, r8Var, null);
    }

    public final void c(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.e;
        if (i10 >= 0) {
            e(org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(j10)));
        } else {
            b(org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f36922f;
        if (view2 != view) {
            d5 d5Var = this.f36923n;
            ImageReceiver imageReceiver = this.f36920b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(d5Var);
                if (this.f36922f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f36922f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f36922f = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(d5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = 1.0f;
        if (this.h) {
            int i15 = this.f36925s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f36919a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f36925s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.f36925s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.i0.L(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.f36924r, org.telegram.messenger.i0.L(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f7;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f36920b;
        imageReceiver.y0(f11, (f12 + this.f36924r) - (org.telegram.messenger.i0.L(this.d) / 2.0f), org.telegram.messenger.i0.L(this.d), org.telegram.messenger.i0.L(this.d));
        if (this.f36926w) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.r8 r8Var = this.f36921c;
        r8Var.r(user);
        this.f36920b.i0(user, r8Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(this.d);
    }

    public e5(float f7, int i10, View view) {
        this.h = true;
        this.f36923n = new d5(this, 0);
        this.f36925s = 255;
        this.f36926w = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f36920b = imageReceiver;
        imageReceiver.J0 = true;
        this.f36921c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        imageReceiver.J0(org.telegram.messenger.i0.L(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.f36919a = paint;
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), 855638016);
        d(view);
    }
}
