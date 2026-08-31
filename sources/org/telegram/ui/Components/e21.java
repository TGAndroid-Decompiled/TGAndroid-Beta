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
public final class e21 {
    public final int f26379a;
    public final View f26380b;
    public final org.telegram.ui.ActionBar.g6 f26381c;
    public final boolean d;
    public l01 f26382e;
    public final ImageReceiver f26384g;
    public l5 h;
    public int f26386j;
    public int f26387k;
    public boolean f26388l;
    public boolean f26389m;
    public final Paint f26390n;
    public final Path f26391o;
    public final RectF f26392p;
    public final rc f26393q;
    public Runnable f26394r;
    public long f26395s;
    public final z8 f26383f = new z8((org.telegram.ui.ActionBar.g6) null);
    public final Path f26385i = new Path();

    public e21(int i10, View view, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.f26390n = paint;
        Path path = new Path();
        this.f26391o = path;
        this.f26392p = new RectF();
        this.f26379a = i10;
        this.f26380b = view;
        this.f26381c = g6Var;
        this.d = z4;
        this.f26393q = new rc(view);
        this.f26384g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f26384g.onAttachedToWindow();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.a(this.f26380b);
        }
    }

    public final void b() {
        this.f26384g.onDetachedFromWindow();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.o(this.f26380b);
        }
    }

    public final void c(Canvas canvas, int i10, float f10, float f11, float f12, float f13, boolean z4) {
        float f14;
        float f15;
        l01 l01Var = this.f26382e;
        if (l01Var != null) {
            l01Var.f28532p = i10 - AndroidUtilities.dp(144.66f);
            float l10 = this.f26382e.l() + AndroidUtilities.dp(48.66f);
            float f16 = i10;
            float f17 = (f16 - l10) / 2.0f;
            int i11 = this.f26387k;
            int i12 = (int) l10;
            boolean z10 = this.d;
            Path path = this.f26385i;
            if (i11 == i12 && this.f26386j == i10 && this.f26389m == z4 && this.f26388l == z10) {
                f15 = l10;
                f14 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                f14 = 2.0f;
                rectF.set(f17, AndroidUtilities.dp(4.5f), f17 + l10, AndroidUtilities.dp(28.5f));
                if (z4) {
                    path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                }
                if (z10) {
                    float f18 = f16 / 2.0f;
                    float dp = f18 - AndroidUtilities.dp(1.833f);
                    while (dp > 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), dp, AndroidUtilities.dp(17.5f));
                        path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                        dp -= AndroidUtilities.dp(8.33f);
                        f16 = f16;
                        l10 = l10;
                    }
                    float f19 = f16;
                    f15 = l10;
                    int dp2 = AndroidUtilities.dp(1.833f);
                    while (true) {
                        f18 += dp2;
                        if (f18 >= f19) {
                            break;
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(f18, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f18, AndroidUtilities.dp(17.5f));
                        path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                        dp2 = AndroidUtilities.dp(8.33f);
                    }
                } else {
                    f15 = l10;
                }
                this.f26387k = i12;
                this.f26386j = i10;
                this.f26388l = z10;
                this.f26389m = z4;
            }
            canvas.save();
            float f20 = f10 / f14;
            canvas.translate(f20, f11);
            org.telegram.ui.ActionBar.g6 g6Var = this.f26381c;
            Paint T0 = org.telegram.ui.ActionBar.k6.T0("paintChatActionBackground", g6Var);
            int alpha = T0.getAlpha();
            T0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, T0);
            T0.setAlpha(alpha);
            if (g6Var != null ? g6Var.o0() : org.telegram.ui.ActionBar.k6.a1()) {
                Paint T02 = org.telegram.ui.ActionBar.k6.T0("paintChatActionBackgroundDarken", g6Var);
                int alpha2 = T02.getAlpha();
                T02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, T02);
                T02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f17;
            float f22 = f21 + f15;
            this.f26392p.set(f21 - AndroidUtilities.dp(4.0f), f11 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f11);
            if (z4) {
                l5 l5Var = this.h;
                if (l5Var != null) {
                    l5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f11), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f26384g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f11, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.draw(canvas);
                }
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ic, g6Var);
                this.f26382e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f11, f13, v02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f11);
                int l1 = org.telegram.ui.ActionBar.k6.l1(0.75f * f13, v02);
                Paint paint = this.f26390n;
                paint.setColor(l1);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f26391o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e21.d(android.view.MotionEvent, boolean):boolean");
    }

    public final void e(org.telegram.ui.Cells.a1 a1Var) {
        this.f26394r = a1Var;
    }

    public final boolean f(MessageObject messageObject) {
        l5 l5Var = this.h;
        View view = this.f26380b;
        if (l5Var != null) {
            l5Var.o(view);
            this.h = null;
        }
        this.f26387k = 0;
        this.f26395s = 0L;
        if (messageObject == null) {
            this.f26382e = null;
            this.f26395s = 0L;
        } else {
            int i10 = this.f26379a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f26384g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f26395s = monoForumTopicId;
                if (userOrChat == null) {
                    this.f26382e = null;
                    return false;
                }
                z8 z8Var = this.f26383f;
                z8Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, z8Var);
                this.f26382e = new l01(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f26395s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.f26382e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(bg.e.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, this.f26381c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new l5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(bg.e.e(findTopic));
                }
                this.f26382e = new l01(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.f26382e == null) {
            return false;
        }
        return true;
    }
}
