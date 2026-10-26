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
public final class l31 {
    public final int f30038a;
    public final View f30039b;
    public final org.telegram.ui.ActionBar.u6 f30040c;
    public final boolean d;
    public q11 e;
    public final ImageReceiver f30042g;
    public t5 h;
    public pg.c f30043i;
    public int f30045k;
    public int f30046l;
    public boolean f30047m;
    public boolean f30048n;
    public final Paint f30049o;
    public final Path f30050p;
    public final RectF f30051q;
    public final xc f30052r;
    public Runnable f30053s;
    public long f30054t;
    public final j9 f30041f = new j9((org.telegram.ui.ActionBar.u6) null);
    public final Path f30044j = new Path();

    public l31(int i10, View view, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f30049o = paint;
        Path path = new Path();
        this.f30050p = path;
        this.f30051q = new RectF();
        this.f30038a = i10;
        this.f30039b = view;
        this.f30040c = u6Var;
        this.d = z10;
        this.f30052r = new xc(view);
        this.f30042g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f30042g.onAttachedToWindow();
        t5 t5Var = this.h;
        if (t5Var != null) {
            t5Var.a(this.f30039b);
        }
    }

    public final void b() {
        this.f30042g.onDetachedFromWindow();
        t5 t5Var = this.h;
        if (t5Var != null) {
            t5Var.o(this.f30039b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        q11 q11Var = this.e;
        if (q11Var != null) {
            q11Var.f31800p = i10 - AndroidUtilities.dp(144.66f);
            float l4 = this.e.l() + AndroidUtilities.dp(48.66f);
            float f15 = i10;
            float f16 = (f15 - l4) / 2.0f;
            int i11 = this.f30046l;
            int i12 = (int) l4;
            boolean z11 = this.d;
            Path path = this.f30044j;
            if (i11 == i12 && this.f30045k == i10 && this.f30048n == z10 && this.f30047m == z11) {
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
                this.f30046l = i12;
                this.f30045k = i10;
                this.f30047m = z11;
                this.f30048n = z10;
            }
            canvas.save();
            float f20 = f7 / f13;
            canvas.translate(f20, f10);
            org.telegram.ui.ActionBar.u6 u6Var = this.f30040c;
            Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintChatActionBackground", u6Var);
            int alpha = V0.getAlpha();
            V0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, V0);
            V0.setAlpha(alpha);
            if (u6Var != null ? u6Var.f() : org.telegram.ui.ActionBar.y6.c1()) {
                Paint V02 = org.telegram.ui.ActionBar.y6.V0("paintChatActionBackgroundDarken", u6Var);
                int alpha2 = V02.getAlpha();
                V02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, V02);
                V02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f16;
            float f22 = f21 + f14;
            this.f30051q.set(f21 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f10);
            if (z10) {
                t5 t5Var = this.h;
                if (t5Var != null) {
                    t5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    pg.c cVar = this.f30043i;
                    if (cVar != null) {
                        cVar.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, u6Var));
                    }
                    ImageReceiver imageReceiver = this.f30042g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f10, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas);
                }
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23453ic, u6Var);
                this.e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, w02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.75f * f12, w02);
                Paint paint = this.f30049o;
                paint.setColor(o12);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f30050p, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l31.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(MessageObject messageObject) {
        t5 t5Var = this.h;
        View view = this.f30039b;
        if (t5Var != null) {
            t5Var.o(view);
            this.h = null;
        }
        this.f30046l = 0;
        this.f30054t = 0L;
        this.f30043i = null;
        if (messageObject == null) {
            this.e = null;
            this.f30054t = 0L;
        } else {
            int i10 = this.f30038a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f30042g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f30054t = monoForumTopicId;
                if (userOrChat == null) {
                    this.e = null;
                    return false;
                }
                j9 j9Var = this.f30041f;
                j9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, j9Var);
                this.e = new q11(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f30054t = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.e = null;
                    return false;
                }
                if (topicId == 1) {
                    pg.c c10 = pg.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, this.f30040c), false);
                    this.f30043i = c10;
                    imageReceiver.setImageBitmap(c10);
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new t5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(pg.d.e(findTopic));
                }
                this.e = new q11(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.e == null) {
            return false;
        }
        return true;
    }
}
