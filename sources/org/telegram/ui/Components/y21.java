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
public final class y21 {
    public final int f32550a;
    public final View f32551b;
    public final org.telegram.ui.ActionBar.d6 f32552c;
    public final boolean d;
    public f11 e;
    public final ImageReceiver f32554g;
    public r5 h;
    public int f32556j;
    public int f32557k;
    public boolean f32558l;
    public boolean f32559m;
    public final Paint f32560n;
    public final Path f32561o;
    public final RectF f32562p;
    public final yc f32563q;
    public Runnable f32564r;
    public long f32565s;
    public final h9 f32553f = new h9((org.telegram.ui.ActionBar.d6) null);
    public final Path f32555i = new Path();

    public y21(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f32560n = paint;
        Path path = new Path();
        this.f32561o = path;
        this.f32562p = new RectF();
        this.f32550a = i10;
        this.f32551b = view;
        this.f32552c = d6Var;
        this.d = z10;
        this.f32563q = new yc(view);
        this.f32554g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f32554g.onAttachedToWindow();
        r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.a(this.f32551b);
        }
    }

    public final void b() {
        this.f32554g.onDetachedFromWindow();
        r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.o(this.f32551b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        f11 f11Var = this.e;
        if (f11Var != null) {
            f11Var.f26031p = i10 - AndroidUtilities.dp(144.66f);
            float l4 = this.e.l() + AndroidUtilities.dp(48.66f);
            float f15 = i10;
            float f16 = (f15 - l4) / 2.0f;
            int i11 = this.f32557k;
            int i12 = (int) l4;
            boolean z11 = this.d;
            Path path = this.f32555i;
            if (i11 == i12 && this.f32556j == i10 && this.f32559m == z10 && this.f32558l == z11) {
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
                this.f32557k = i12;
                this.f32556j = i10;
                this.f32558l = z11;
                this.f32559m = z10;
            }
            canvas.save();
            float f20 = f7 / f13;
            canvas.translate(f20, f10);
            org.telegram.ui.ActionBar.d6 d6Var = this.f32552c;
            Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintChatActionBackground", d6Var);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (d6Var != null ? d6Var.s() : org.telegram.ui.ActionBar.h6.b1()) {
                Paint U02 = org.telegram.ui.ActionBar.h6.U0("paintChatActionBackgroundDarken", d6Var);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f16;
            float f22 = f21 + f14;
            this.f32562p.set(f21 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f10);
            if (z10) {
                r5 r5Var = this.h;
                if (r5Var != null) {
                    r5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f32554g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f10, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas);
                }
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21084ic, d6Var);
                this.e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, w02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
                int m12 = org.telegram.ui.ActionBar.h6.m1(0.75f * f12, w02);
                Paint paint = this.f32560n;
                paint.setColor(m12);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f32561o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y21.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(MessageObject messageObject) {
        r5 r5Var = this.h;
        View view = this.f32551b;
        if (r5Var != null) {
            r5Var.o(view);
            this.h = null;
        }
        this.f32557k = 0;
        this.f32565s = 0L;
        if (messageObject == null) {
            this.e = null;
            this.f32565s = 0L;
        } else {
            int i10 = this.f32550a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f32554g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f32565s = monoForumTopicId;
                if (userOrChat == null) {
                    this.e = null;
                    return false;
                }
                h9 h9Var = this.f32553f;
                h9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, h9Var);
                this.e = new f11(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f32565s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(og.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21325v8, this.f32552c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new r5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(og.d.e(findTopic));
                }
                this.e = new f11(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.e == null) {
            return false;
        }
        return true;
    }
}
