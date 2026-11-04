package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h5 extends ReplacementSpan {
    public final Paint f45810a;
    public final ImageReceiver f45811b;
    public final org.telegram.ui.Components.u8 f45812c;
    public float d;
    public final int f45813e;
    public View f45814f;
    public boolean h;
    public final g5 f45815n;
    public float f45816r;
    public int f45817s;
    public boolean f45818w;

    public h5(int i3, View view) {
        this(18.0f, i3, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.q8 q8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (h5 h5Var : (h5[]) spannable.getSpans(0, spannable.length(), h5.class)) {
                h5Var.d(q8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.u8 u8Var = this.f45812c;
        u8Var.q(chat);
        this.f45811b.i0(chat, u8Var, null);
    }

    public final void c(long j10) {
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.f45813e;
        if (i3 >= 0) {
            e(org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(j10)));
        } else {
            b(org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f45814f;
        if (view2 != view) {
            g5 g5Var = this.f45815n;
            ImageReceiver imageReceiver = this.f45811b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(g5Var);
                if (this.f45814f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f45814f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f45814f = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(g5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = 1.0f;
        if (this.h) {
            int i14 = this.f45817s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f45810a;
            if (i14 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f45817s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(this.f45817s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.g0.L(this.d) / 2.0f) + 0.0f + f10, ((i11 + i13) / 2.0f) + this.f45816r, org.telegram.messenger.g0.L(this.d) / 2.0f, paint2);
        }
        float f12 = 0.0f + f10;
        float f13 = (i11 + i13) / 2.0f;
        ImageReceiver imageReceiver = this.f45811b;
        imageReceiver.y0(f12, (f13 + this.f45816r) - (org.telegram.messenger.g0.L(this.d) / 2.0f), org.telegram.messenger.g0.L(this.d), org.telegram.messenger.g0.L(this.d));
        if (this.f45818w) {
            f11 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f11);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.u8 u8Var = this.f45812c;
        u8Var.r(user);
        this.f45811b.i0(user, u8Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.d);
    }

    public h5(float f10, int i3, View view) {
        this.h = true;
        this.f45815n = new g5(this, 0);
        this.f45817s = 255;
        this.f45818w = true;
        this.f45813e = i3;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f45811b = imageReceiver;
        imageReceiver.K0 = true;
        this.f45812c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        imageReceiver.J0(org.telegram.messenger.g0.L(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f45810a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        d(view);
    }
}
