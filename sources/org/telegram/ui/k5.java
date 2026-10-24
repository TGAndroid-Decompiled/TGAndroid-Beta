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
public final class k5 extends ReplacementSpan {
    public final Paint f38788a;
    public final ImageReceiver f38789b;
    public final org.telegram.ui.Components.f9 f38790c;
    public float d;
    public final int e;
    public View f38791f;
    public boolean h;
    public final j5 f38792n;
    public float f38793r;
    public int f38794s;
    public boolean v;

    public k5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.w8 w8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (k5 k5Var : (k5[]) spannable.getSpans(0, spannable.length(), k5.class)) {
                k5Var.d(w8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.e;
        org.telegram.ui.Components.f9 f9Var = this.f38790c;
        f9Var.k(i10, chat);
        this.f38789b.setForUserOrChat(chat, f9Var);
    }

    public final void c(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.e;
        if (i10 >= 0) {
            e(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)));
        } else {
            b(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f38791f;
        if (view2 != view) {
            j5 j5Var = this.f38792n;
            ImageReceiver imageReceiver = this.f38789b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(j5Var);
                if (this.f38791f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f38791f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f38791f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(j5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = 1.0f;
        if (this.h) {
            int i15 = this.f38794s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f38788a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f38794s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.o1(this.f38794s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.f38793r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f7;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f38789b;
        imageReceiver.setImageCoords(f11, (f12 + this.f38793r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.e;
        org.telegram.ui.Components.f9 f9Var = this.f38790c;
        f9Var.m(i10, user);
        this.f38789b.setForUserOrChat(user, f9Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public k5(View view, float f7, int i10) {
        this.h = true;
        this.f38792n = new j5(this, 0);
        this.f38794s = 255;
        this.v = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f38789b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f38790c = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.f38788a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
