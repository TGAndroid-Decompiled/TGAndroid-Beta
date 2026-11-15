package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class f5 extends ReplacementSpan {
    public final Paint f46983a;
    public final ImageReceiver f46984b;
    public final org.telegram.ui.Components.t8 f46985c;
    public float d;
    public final int f46986e;
    public View f46987f;
    public boolean h;
    public final e5 f46988n;
    public float f46989r;
    public int f46990s;
    public boolean f46991w;

    public f5(int i7, View view) {
        this(18.0f, i7, view);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.q8 q8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (f5 f5Var : (f5[]) spannable.getSpans(0, spannable.length(), f5.class)) {
                f5Var.d(q8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        org.telegram.ui.Components.t8 t8Var = this.f46985c;
        t8Var.q(chat);
        this.f46984b.i0(chat, t8Var, null);
    }

    public final void c(long j3) {
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f46986e;
        if (i7 >= 0) {
            e(org.telegram.messenger.np.s1(i10).a2(Long.valueOf(j3)));
        } else {
            b(org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f46987f;
        if (view2 != view) {
            e5 e5Var = this.f46988n;
            ImageReceiver imageReceiver = this.f46984b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f46987f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f46987f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f46987f = view;
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
            int i14 = this.f46990s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f46983a;
            if (i14 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f46990s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.j6.r1(this.f46990s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.g0.L(this.d) / 2.0f) + 0.0f + f10, ((i11 + i13) / 2.0f) + this.f46989r, org.telegram.messenger.g0.L(this.d) / 2.0f, paint2);
        }
        float f12 = 0.0f + f10;
        float f13 = (i11 + i13) / 2.0f;
        ImageReceiver imageReceiver = this.f46984b;
        imageReceiver.y0(f12, (f13 + this.f46989r) - (org.telegram.messenger.g0.L(this.d) / 2.0f), org.telegram.messenger.g0.L(this.d), org.telegram.messenger.g0.L(this.d));
        if (this.f46991w) {
            f11 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f11);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.t8 t8Var = this.f46985c;
        t8Var.r(user);
        this.f46984b.i0(user, t8Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.d);
    }

    public f5(float f10, int i7, View view) {
        this.h = true;
        this.f46988n = new e5(this, 0);
        this.f46990s = 255;
        this.f46991w = true;
        this.f46986e = i7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f46984b = imageReceiver;
        imageReceiver.K0 = true;
        this.f46985c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        imageReceiver.J0(org.telegram.messenger.g0.L(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f46983a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        d(view);
    }
}
