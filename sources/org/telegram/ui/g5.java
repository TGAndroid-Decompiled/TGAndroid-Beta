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
    public final Paint f33852a;
    public final ImageReceiver f33853b;
    public final org.telegram.ui.Components.f9 f33854c;
    public float d;
    public final int e;
    public View f33855f;
    public boolean h;
    public final f5 f33856n;
    public float f33857r;
    public int f33858s;
    public boolean v;

    public g5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.w8 w8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (g5 g5Var : (g5[]) spannable.getSpans(0, spannable.length(), g5.class)) {
                g5Var.d(w8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.e;
        org.telegram.ui.Components.f9 f9Var = this.f33854c;
        f9Var.k(i10, chat);
        this.f33853b.setForUserOrChat(chat, f9Var);
    }

    public final void c(long j3) {
        int i10 = this.e;
        if (j3 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f33855f;
        if (view2 != view) {
            f5 f5Var = this.f33856n;
            ImageReceiver imageReceiver = this.f33853b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(f5Var);
                if (this.f33855f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f33855f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f33855f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(f5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = 1.0f;
        if (this.h) {
            int i15 = this.f33858s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f33852a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f33858s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.f33858s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.f33857r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f7;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f33853b;
        imageReceiver.setImageCoords(f11, (f12 + this.f33857r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.e;
        org.telegram.ui.Components.f9 f9Var = this.f33854c;
        f9Var.m(i10, user);
        this.f33853b.setForUserOrChat(user, f9Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public g5(View view, float f7, int i10) {
        this.h = true;
        this.f33856n = new f5(this, 0);
        this.f33858s = 255;
        this.v = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f33853b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f33854c = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.f33852a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
