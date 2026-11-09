package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class f5 extends ReplacementSpan {
    public final Paint f45575a;
    public final ImageReceiver f45576b;
    public final org.telegram.ui.Components.w8 f45577c;
    public float d;
    public final int f45578e;
    public View f45579f;
    public boolean h;
    public final e5 f45580n;
    public float f45581r;
    public int f45582s;
    public boolean f45583w;

    public f5(int i7, View view) {
        this(18.0f, i7, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.r8 r8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (f5 f5Var : (f5[]) spannable.getSpans(0, spannable.length(), f5.class)) {
                f5Var.d(r8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.w8 w8Var = this.f45577c;
        w8Var.q(chat);
        this.f45576b.i0(chat, w8Var, null);
    }

    public final void c(long j3) {
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f45578e;
        if (i7 >= 0) {
            e(org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(j3)));
        } else {
            b(org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f45579f;
        if (view2 != view) {
            e5 e5Var = this.f45580n;
            ImageReceiver imageReceiver = this.f45576b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f45579f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f45579f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f45579f = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = 1.0f;
        if (this.h) {
            int i14 = this.f45582s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f45575a;
            if (i14 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f45582s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.l6.r1(this.f45582s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.g0.L(this.d) / 2.0f) + 0.0f + f10, ((i11 + i13) / 2.0f) + this.f45581r, org.telegram.messenger.g0.L(this.d) / 2.0f, paint2);
        }
        float f12 = 0.0f + f10;
        float f13 = (i11 + i13) / 2.0f;
        ImageReceiver imageReceiver = this.f45576b;
        imageReceiver.y0(f12, (f13 + this.f45581r) - (org.telegram.messenger.g0.L(this.d) / 2.0f), org.telegram.messenger.g0.L(this.d), org.telegram.messenger.g0.L(this.d));
        if (this.f45583w) {
            f11 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f11);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.w8 w8Var = this.f45577c;
        w8Var.r(user);
        this.f45576b.i0(user, w8Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.d);
    }

    public f5(float f10, int i7, View view) {
        this.h = true;
        this.f45580n = new e5(this, 0);
        this.f45582s = 255;
        this.f45583w = true;
        this.f45578e = i7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f45576b = imageReceiver;
        imageReceiver.J0 = true;
        this.f45577c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        imageReceiver.J0(org.telegram.messenger.g0.L(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f45575a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        d(view);
    }
}
