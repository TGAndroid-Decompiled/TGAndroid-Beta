package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class f5 extends ReplacementSpan {
    public final Paint f47678a;
    public final ImageReceiver f47679b;
    public final org.telegram.ui.Components.a9 f47680c;
    public float d;
    public final int f47681e;
    public View f47682f;
    public boolean h;
    public final e5 f47683n;
    public float f47684r;
    public int f47685s;
    public boolean f47686w;

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
        org.telegram.ui.Components.a9 a9Var = this.f47680c;
        a9Var.q(chat);
        this.f47679b.j0(chat, a9Var, null);
    }

    public final void c(long j3) {
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f47681e;
        if (i7 >= 0) {
            e(org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(j3)));
        } else {
            b(org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f47682f;
        if (view2 != view) {
            e5 e5Var = this.f47683n;
            ImageReceiver imageReceiver = this.f47679b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f47682f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.S();
                }
            }
            View view3 = this.f47682f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.Q();
            }
            this.f47682f = view;
            imageReceiver.I0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = 1.0f;
        if (this.h) {
            int i14 = this.f47685s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f47678a;
            if (i14 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f47685s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.n6.r1(this.f47685s / 255.0f, 855638016));
            }
            canvas.drawCircle((org.telegram.messenger.g0.L(this.d) / 2.0f) + 0.0f + f10, ((i11 + i13) / 2.0f) + this.f47684r, org.telegram.messenger.g0.L(this.d) / 2.0f, paint2);
        }
        float f12 = 0.0f + f10;
        float f13 = (i11 + i13) / 2.0f;
        ImageReceiver imageReceiver = this.f47679b;
        imageReceiver.z0(f12, (f13 + this.f47684r) - (org.telegram.messenger.g0.L(this.d) / 2.0f), org.telegram.messenger.g0.L(this.d), org.telegram.messenger.g0.L(this.d));
        if (this.f47686w) {
            f11 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f11);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        org.telegram.ui.Components.a9 a9Var = this.f47680c;
        a9Var.r(user);
        this.f47679b.j0(user, a9Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.d);
    }

    public f5(float f10, int i7, View view) {
        this.h = true;
        this.f47683n = new e5(this, 0);
        this.f47685s = 255;
        this.f47686w = true;
        this.f47681e = i7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f47679b = imageReceiver;
        imageReceiver.K0 = true;
        this.f47680c = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        imageReceiver.K0(org.telegram.messenger.g0.L(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f47678a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        d(view);
    }
}
