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
public final class j5 extends ReplacementSpan {
    public final Paint f40459a;
    public final ImageReceiver f40460b;
    public final org.telegram.ui.Components.j9 f40461c;
    public float d;
    public final int e;
    public View f40462f;
    public boolean h;
    public final i5 f40463n;
    public float f40464r;
    public int f40465s;
    public boolean v;

    public j5(int i10, View view) {
        this(view, 18.0f, i10);
    }

    public static void a(CharSequence charSequence, org.telegram.ui.Cells.a9 a9Var) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (j5 j5Var : (j5[]) spannable.getSpans(0, spannable.length(), j5.class)) {
                j5Var.d(a9Var);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        int i10 = this.e;
        org.telegram.ui.Components.j9 j9Var = this.f40461c;
        j9Var.k(i10, chat);
        this.f40460b.setForUserOrChat(chat, j9Var);
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
        View view2 = this.f40462f;
        if (view2 != view) {
            i5 i5Var = this.f40463n;
            ImageReceiver imageReceiver = this.f40460b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(i5Var);
                if (this.f40462f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f40462f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f40462f = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(i5Var);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = 1.0f;
        if (this.h) {
            int i15 = this.f40465s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.f40459a;
            if (i15 != alpha) {
                int alpha2 = paint.getAlpha();
                this.f40465s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.y6.o1(this.f40465s / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.d) / 2.0f) + 0.0f + f7, ((i12 + i14) / 2.0f) + this.f40464r, AndroidUtilities.dp(this.d) / 2.0f, paint2);
        }
        float f11 = 0.0f + f7;
        float f12 = (i12 + i14) / 2.0f;
        ImageReceiver imageReceiver = this.f40460b;
        imageReceiver.setImageCoords(f11, (f12 + this.f40464r) - (AndroidUtilities.dp(this.d) / 2.0f), AndroidUtilities.dp(this.d), AndroidUtilities.dp(this.d));
        if (this.v) {
            f10 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f10);
        imageReceiver.draw(canvas);
    }

    public final void e(TLRPC.User user) {
        int i10 = this.e;
        org.telegram.ui.Components.j9 j9Var = this.f40461c;
        j9Var.m(i10, user);
        this.f40460b.setForUserOrChat(user, j9Var);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.d);
    }

    public j5(View view, float f7, int i10) {
        this.h = true;
        this.f40463n = new i5(this, 0);
        this.f40465s = 255;
        this.v = true;
        this.e = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f40460b = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.f40461c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
        this.d = f7;
        Paint paint = new Paint(1);
        this.f40459a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        d(view);
    }
}
