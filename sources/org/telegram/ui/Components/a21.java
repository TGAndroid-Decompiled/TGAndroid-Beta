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
public final class a21 {
    public final int f24234a;
    public final View f24235b;
    public final org.telegram.ui.ActionBar.f6 f24236c;
    public final boolean d;
    public f01 f24237e;
    public final ImageReceiver f24239g;
    public q5 h;
    public int f24241j;
    public int f24242k;
    public boolean f24243l;
    public boolean f24244m;
    public final Paint f24245n;
    public final Path f24246o;
    public final RectF f24247p;
    public final zc f24248q;
    public Runnable f24249r;
    public long f24250s;
    public final i9 f24238f = new i9((org.telegram.ui.ActionBar.f6) null);
    public final Path f24240i = new Path();

    public a21(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f24245n = paint;
        Path path = new Path();
        this.f24246o = path;
        this.f24247p = new RectF();
        this.f24234a = i10;
        this.f24235b = view;
        this.f24236c = f6Var;
        this.d = z10;
        this.f24248q = new zc(view);
        this.f24239g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f24239g.onAttachedToWindow();
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.a(this.f24235b);
        }
    }

    public final void b() {
        this.f24239g.onDetachedFromWindow();
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.o(this.f24235b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        f01 f01Var = this.f24237e;
        if (f01Var != null) {
            f01Var.f25858p = i10 - AndroidUtilities.dp(144.66f);
            float l4 = this.f24237e.l() + AndroidUtilities.dp(48.66f);
            float f15 = i10;
            float f16 = (f15 - l4) / 2.0f;
            int i11 = this.f24242k;
            int i12 = (int) l4;
            boolean z11 = this.d;
            Path path = this.f24240i;
            if (i11 == i12 && this.f24241j == i10 && this.f24244m == z10 && this.f24243l == z11) {
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
                    float dp = f17 - AndroidUtilities.dp(1.833f);
                    while (dp > 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), dp, AndroidUtilities.dp(17.5f));
                        path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                        dp -= AndroidUtilities.dp(8.33f);
                        f15 = f15;
                        l4 = l4;
                    }
                    float f18 = f15;
                    f14 = l4;
                    int dp2 = AndroidUtilities.dp(1.833f);
                    while (true) {
                        f17 += dp2;
                        if (f17 >= f18) {
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
                this.f24242k = i12;
                this.f24241j = i10;
                this.f24243l = z11;
                this.f24244m = z10;
            }
            canvas.save();
            float f19 = f7 / f13;
            canvas.translate(f19, f10);
            org.telegram.ui.ActionBar.f6 f6Var = this.f24236c;
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var);
            int alpha = T0.getAlpha();
            T0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, T0);
            T0.setAlpha(alpha);
            if (f6Var != null ? f6Var.o0() : org.telegram.ui.ActionBar.j6.a1()) {
                Paint T02 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", f6Var);
                int alpha2 = T02.getAlpha();
                T02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, T02);
                T02.setAlpha(alpha2);
            }
            canvas.restore();
            float f20 = f19 + f16;
            float f21 = f20 + f14;
            this.f24247p.set(f20 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, AndroidUtilities.dp(32.0f) + f10);
            if (z10) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f20), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f20), (int) (AndroidUtilities.dp(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f24239g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f20, AndroidUtilities.dp(6.5f) + f10, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas);
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, f6Var);
                this.f24237e.c(f20 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, v02, canvas);
                canvas.save();
                canvas.translate(f21 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.75f * f12, v02);
                Paint paint = this.f24245n;
                paint.setColor(l1);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f24246o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a21.d(android.view.MotionEvent, boolean):boolean");
    }

    public final void e(org.telegram.ui.Cells.b1 b1Var) {
        this.f24249r = b1Var;
    }

    public final boolean f(MessageObject messageObject) {
        q5 q5Var = this.h;
        View view = this.f24235b;
        if (q5Var != null) {
            q5Var.o(view);
            this.h = null;
        }
        this.f24242k = 0;
        this.f24250s = 0L;
        if (messageObject == null) {
            this.f24237e = null;
            this.f24250s = 0L;
        } else {
            int i10 = this.f24234a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f24239g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f24250s = monoForumTopicId;
                if (userOrChat == null) {
                    this.f24237e = null;
                    return false;
                }
                i9 i9Var = this.f24238f;
                i9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, i9Var);
                this.f24237e = new f01(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f24250s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.f24237e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(og.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20992v8, this.f24236c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new q5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(og.d.e(findTopic));
                }
                this.f24237e = new f01(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.f24237e == null) {
            return false;
        }
        return true;
    }
}
