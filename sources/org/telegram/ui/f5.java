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
public final class f5 extends ReplacementSpan {
    public final Paint f38136a;
    public final ImageReceiver f38137b;
    public final org.telegram.ui.Components.z8 f38138c;
    public float d;
    public final int f38139e;
    public View f38140f;
    public boolean h;
    public final e5 f38141n;
    public float f38142r;
    public int f38143s;
    public boolean v;

    public f5(int i9, View view) {
        this(view, 18.0f, i9);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.t8 t8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (f5 f5Var : (f5[]) spannable.getSpans(0, spannable.length(), f5.class)) {
                f5Var.d(t8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i9 = this.f38139e;
        org.telegram.ui.Components.z8 z8Var = this.f38138c;
        z8Var.k(i9, chat);
        this.f38137b.setForUserOrChat(chat, z8Var);
    }

    public final void c(long j10) {
        int i9 = this.f38139e;
        if (j10 >= 0) {
            e(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
        } else {
            b(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)));
        }
    }

    public final void d(View view) {
        View view2 = this.f38140f;
        if (view2 != view) {
            e5 e5Var = this.f38141n;
            ImageReceiver imageReceiver = this.f38137b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f38140f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f38140f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f38140f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = 1.0f;
        if (this.h) {
            int i14 = this.f38143s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f38136a;
            if (i14 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f38143s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(this.f38143s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f10, ((i11 + i13) / 2.0f) + this.f38142r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f12 = 0.0f + f10;
        float f13 = (i11 + i13) / 2.0f;
        ImageReceiver imageReceiver = this.f38137b;
        imageReceiver.setImageCoords(f12, (f13 + this.f38142r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f11 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f11);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i9 = this.f38139e;
        org.telegram.ui.Components.z8 z8Var = this.f38138c;
        z8Var.m(i9, user);
        this.f38137b.setForUserOrChat(user, z8Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public f5(View view, float f10, int i9) {
        this.h = true;
        this.f38141n = new e5(this, 0);
        this.f38143s = 255;
        this.v = true;
        this.f38139e = i9;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f38137b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f38138c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
        this.d = f10;
        Paint paint = new Paint(1);
        this.f38136a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
