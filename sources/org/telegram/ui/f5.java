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
    public final Paint f37573a;
    public final ImageReceiver f37574b;
    public final org.telegram.ui.Components.j9 f37575c;
    public float d;
    public final int f37576e;
    public View f37577f;
    public boolean h;
    public final e5 f37578n;
    public float f37579r;
    public int f37580s;
    public boolean v;

    public f5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.w8 w8Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (f5 f5Var : (f5[]) spannable.getSpans(0, spannable.length(), f5.class)) {
                f5Var.d(w8Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.f37576e;
        org.telegram.ui.Components.j9 j9Var = this.f37575c;
        j9Var.k(i10, chat);
        this.f37574b.setForUserOrChat(chat, j9Var);
    }

    public final void c(long j3) {
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f37576e;
        if (i10 >= 0) {
            e(MessagesController.getInstance(i11).getUser(Long.valueOf(j3)));
        } else {
            b(MessagesController.getInstance(i11).getChat(Long.valueOf(-j3)));
        }
    }

    public final void d(View view) {
        View view2 = this.f37577f;
        if (view2 != view) {
            e5 e5Var = this.f37578n;
            ImageReceiver imageReceiver = this.f37574b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f37577f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f37577f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f37577f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = 1.0f;
        if (this.h) {
            int i15 = this.f37580s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f37573a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f37580s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.h6.m1(this.f37580s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.f37579r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f7;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f37574b;
        imageReceiver.setImageCoords(f11, (f12 + this.f37579r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.f37576e;
        org.telegram.ui.Components.j9 j9Var = this.f37575c;
        j9Var.m(i10, user);
        this.f37574b.setForUserOrChat(user, j9Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public f5(View view, float f7, int i10) {
        this.h = true;
        this.f37578n = new e5(this, 0);
        this.f37580s = 255;
        this.v = true;
        this.f37576e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f37574b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f37575c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.f37573a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
