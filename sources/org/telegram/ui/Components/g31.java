package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g31 {
    public final int f26570a;
    public final View f26571b;
    public final org.telegram.ui.ActionBar.e6 f26572c;
    public final boolean d;
    public l11 f26573e;
    public final ImageReceiver f26575g;
    public s5 h;
    public int f26577j;
    public int f26578k;
    public boolean f26579l;
    public boolean f26580m;
    public final Paint f26581n;
    public final Path f26582o;
    public final RectF f26583p;
    public final bd f26584q;
    public Runnable f26585r;
    public long f26586s;
    public final j9 f26574f = new j9((org.telegram.ui.ActionBar.e6) null);
    public final Path f26576i = new Path();

    public g31(int i10, View view, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f26581n = paint;
        Path path = new Path();
        this.f26582o = path;
        this.f26583p = new RectF();
        this.f26570a = i10;
        this.f26571b = view;
        this.f26572c = e6Var;
        this.d = z10;
        this.f26584q = new bd(view);
        this.f26575g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f26575g.onAttachedToWindow();
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.a(this.f26571b);
        }
    }

    public final void b() {
        this.f26575g.onDetachedFromWindow();
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.o(this.f26571b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        l11 l11Var = this.f26573e;
        if (l11Var != null) {
            l11Var.f28233p = i10 - AndroidUtilities.dp(144.66f);
            float l4 = this.f26573e.l() + AndroidUtilities.dp(48.66f);
            float f15 = i10;
            float f16 = (f15 - l4) / 2.0f;
            int i11 = this.f26578k;
            int i12 = (int) l4;
            boolean z11 = this.d;
            Path path = this.f26576i;
            if (i11 == i12 && this.f26577j == i10 && this.f26580m == z10 && this.f26579l == z11) {
                f14 = l4;
                f13 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                f13 = 2.0f;
                rectF.set(f16, AndroidUtilities.dp(4.5f), f16 + l4, AndroidUtilities.dp(28.5f));
                if (z10) {
                    path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                }
                if (z11) {
                    float f17 = f15 / 2.0f;
                    float f18 = 1.833f;
                    float dp = f17 - AndroidUtilities.dp(1.833f);
                    while (dp > 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), dp, AndroidUtilities.dp(17.5f));
                        path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                        dp -= AndroidUtilities.dp(8.33f);
                        f18 = f18;
                        f15 = f15;
                        l4 = l4;
                    }
                    float f19 = f15;
                    f14 = l4;
                    int dp2 = AndroidUtilities.dp(f18);
                    while (true) {
                        f17 += dp2;
                        if (f17 >= f19) {
                            break;
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(f17, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f17, AndroidUtilities.dp(17.5f));
                        path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                        dp2 = AndroidUtilities.dp(8.33f);
                    }
                } else {
                    f14 = l4;
                }
                this.f26578k = i12;
                this.f26577j = i10;
                this.f26579l = z11;
                this.f26580m = z10;
            }
            canvas.save();
            float f20 = f7 / f13;
            canvas.translate(f20, f10);
            org.telegram.ui.ActionBar.e6 e6Var = this.f26572c;
            Paint U0 = org.telegram.ui.ActionBar.i6.U0("paintChatActionBackground", e6Var);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (e6Var != null ? e6Var.k0() : org.telegram.ui.ActionBar.i6.b1()) {
                Paint U02 = org.telegram.ui.ActionBar.i6.U0("paintChatActionBackgroundDarken", e6Var);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f16;
            float f22 = f21 + f14;
            this.f26583p.set(f21 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f10);
            if (z10) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f26575g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f10, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas);
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20894ic, e6Var);
                this.f26573e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, w02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
                int m12 = org.telegram.ui.ActionBar.i6.m1(0.75f * f12, w02);
                Paint paint = this.f26581n;
                paint.setColor(m12);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f26582o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g31.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(MessageObject messageObject) {
        s5 s5Var = this.h;
        View view = this.f26571b;
        if (s5Var != null) {
            s5Var.o(view);
            this.h = null;
        }
        this.f26578k = 0;
        this.f26586s = 0L;
        if (messageObject == null) {
            this.f26573e = null;
            this.f26586s = 0L;
        } else {
            int i10 = this.f26570a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f26575g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f26586s = monoForumTopicId;
                if (userOrChat == null) {
                    this.f26573e = null;
                    return false;
                }
                j9 j9Var = this.f26574f;
                j9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, j9Var);
                this.f26573e = new l11(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f26586s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.f26573e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(ng.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21130v8, this.f26572c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new s5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(ng.d.e(findTopic));
                }
                this.f26573e = new l11(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.f26573e == null) {
            return false;
        }
        return true;
    }
}
