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
public final class i5 extends ReplacementSpan {
    public final Paint f37542a;
    public final ImageReceiver f37543b;
    public final org.telegram.ui.Components.z8 f37544c;
    public float d;
    public final int f37545e;
    public View f37546f;
    public boolean h;
    public final h5 f37547n;
    public float f37548r;
    public int f37549s;
    public boolean v;

    public i5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.s8 s8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (i5 i5Var : (i5[]) spannable.getSpans(0, spannable.length(), i5.class)) {
                i5Var.d(s8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.f37545e;
        org.telegram.ui.Components.z8 z8Var = this.f37544c;
        z8Var.k(i10, chat);
        this.f37543b.setForUserOrChat(chat, z8Var);
    }

    public final void c(long j10) {
        int i10 = this.f37545e;
        if (j10 >= 0) {
            e(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            b(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f37546f;
        if (view2 != view) {
            h5 h5Var = this.f37547n;
            ImageReceiver imageReceiver = this.f37543b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(h5Var);
                if (this.f37546f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f37546f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f37546f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(h5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11 = 1.0f;
        if (this.h) {
            int i15 = this.f37549s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f37542a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f37549s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.l1(this.f37549s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f10, ((i12 + i14) / 2.0f) + this.f37548r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f12 = 0.0f + f10;
        float f13 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f37543b;
        imageReceiver.setImageCoords(f12, (f13 + this.f37548r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f11 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f11);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.f37545e;
        org.telegram.ui.Components.z8 z8Var = this.f37544c;
        z8Var.m(i10, user);
        this.f37543b.setForUserOrChat(user, z8Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public i5(View view, float f10, int i10) {
        this.h = true;
        this.f37547n = new h5(this, 0);
        this.f37549s = 255;
        this.v = true;
        this.f37545e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f37543b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f37544c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f37542a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
