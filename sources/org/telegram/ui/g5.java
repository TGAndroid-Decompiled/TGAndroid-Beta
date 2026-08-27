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

    public final Paint f38315a;

    public final ImageReceiver f38316b;

    public final org.telegram.ui.Components.y8 f38317c;
    public float d;

    public final int f38318e;

    public View f38319f;
    public boolean h;

    public final f5 f38320n;

    public float f38321r;

    public int f38322s;
    public boolean v;

    public g5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.p8 p8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (g5 g5Var : (g5[]) spannable.getSpans(0, spannable.length(), g5.class)) {
                g5Var.d(p8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.f38318e;
        org.telegram.ui.Components.y8 y8Var = this.f38317c;
        y8Var.k(i10, chat);
        this.f38316b.setForUserOrChat(chat, y8Var);
    }

    public final void c(long j10) {
        int i10 = this.f38318e;
        if (j10 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f38319f;
        if (view2 == view) {
            return;
        }
        f5 f5Var = this.f38320n;
        ImageReceiver imageReceiver = this.f38316b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(f5Var);
            if (this.f38319f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.f38319f;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        this.f38319f = view;
        imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(f5Var);
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (this.h) {
            int i15 = this.f38322s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f38315a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f38322s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.f38322s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f10, ((i12 + i14) / 2.0f) + this.f38321r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f10;
        float fDp = (((i12 + i14) / 2.0f) + this.f38321r) - (AndroidUtilities.dp(this.d) / 2.0f);
        float fDp2 = AndroidUtilities.dp(this.d);
        float fDp3 = AndroidUtilities.dp(this.d);
        ImageReceiver imageReceiver = this.f38316b;
        imageReceiver.setImageCoords(f11, fDp, fDp2, fDp3);
        imageReceiver.setAlpha(this.v ? paint.getAlpha() / 255.0f : 1.0f);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.f38318e;
        org.telegram.ui.Components.y8 y8Var = this.f38317c;
        y8Var.m(i10, user);
        this.f38316b.setForUserOrChat(user, y8Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public g5(View view, float f10, int i10) {
        this.h = true;
        this.f38320n = new f5(this, 0);
        this.f38322s = 255;
        this.v = true;
        this.f38318e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f38316b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f38317c = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f38315a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
