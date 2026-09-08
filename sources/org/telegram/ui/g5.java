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
    public final Paint f36588a;
    public final ImageReceiver f36589b;
    public final org.telegram.ui.Components.i9 f36590c;
    public float d;
    public final int f36591e;
    public View f36592f;
    public boolean h;
    public final f5 f36593n;
    public float f36594r;
    public int f36595s;
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
        int i10 = this.f36591e;
        org.telegram.ui.Components.i9 i9Var = this.f36590c;
        i9Var.k(i10, chat);
        this.f36589b.setForUserOrChat(chat, i9Var);
    }

    public final void c(long j3) {
        int i10 = this.f36591e;
        if (j3 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f36592f;
        if (view2 != view) {
            f5 f5Var = this.f36593n;
            ImageReceiver imageReceiver = this.f36589b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(f5Var);
                if (this.f36592f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f36592f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f36592f = view;
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
            int i15 = this.f36595s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f36588a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f36595s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.f36595s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.f36594r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f7;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f36589b;
        imageReceiver.setImageCoords(f11, (f12 + this.f36594r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.f36591e;
        org.telegram.ui.Components.i9 i9Var = this.f36590c;
        i9Var.m(i10, user);
        this.f36589b.setForUserOrChat(user, i9Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public g5(View view, float f7, int i10) {
        this.h = true;
        this.f36593n = new f5(this, 0);
        this.f36595s = 255;
        this.v = true;
        this.f36591e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f36589b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f36590c = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.f36588a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
