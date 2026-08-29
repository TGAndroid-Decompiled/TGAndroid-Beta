package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g5 extends ReplacementSpan {
    public final Paint f38454a;
    public final ImageReceiver f38455b;
    public final org.telegram.ui.Components.e9 f38456c;
    public float d;
    public final int f38457e;
    public View f38458f;
    public boolean h;
    public final f5 f38459n;
    public float f38460r;
    public int f38461s;
    public boolean v;

    public g5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.q8 q8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (g5 g5Var : (g5[]) spannable.getSpans(0, spannable.length(), g5.class)) {
                g5Var.d(q8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.f38457e;
        org.telegram.ui.Components.e9 e9Var = this.f38456c;
        e9Var.k(i10, chat);
        this.f38455b.setForUserOrChat(chat, e9Var);
    }

    public final void c(long j10) {
        int i10 = this.f38457e;
        if (j10 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f38458f;
        if (view2 != view) {
            f5 f5Var = this.f38459n;
            ImageReceiver imageReceiver = this.f38455b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(f5Var);
                if (this.f38458f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f38458f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f38458f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(f5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float f10 = 1.0f;
        if (this.h) {
            int i15 = this.f38461s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f38454a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f38461s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.f38461s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f9, ((i12 + i14) / 2.0f) + this.f38460r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f9;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f38455b;
        imageReceiver.setImageCoords(f11, (f12 + this.f38460r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.f38457e;
        org.telegram.ui.Components.e9 e9Var = this.f38456c;
        e9Var.m(i10, user);
        this.f38455b.setForUserOrChat(user, e9Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public g5(View view, float f9, int i10) {
        this.h = true;
        this.f38459n = new f5(this, 0);
        this.f38461s = 255;
        this.v = true;
        this.f38457e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f38455b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f38456c = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f9));
        this.d = f9;
        Paint paint = new Paint(1);
        this.f38454a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
