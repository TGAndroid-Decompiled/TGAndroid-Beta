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
public final class t11 {
    public final int f32803a;
    public final View f32804b;
    public final org.telegram.ui.ActionBar.c6 f32805c;
    public final boolean d;
    public zz0 f32806e;
    public final ImageReceiver f32808g;
    public p5 h;
    public int f32810j;
    public int f32811k;
    public boolean f32812l;
    public boolean f32813m;
    public final Paint f32814n;
    public final Path f32815o;
    public final RectF f32816p;
    public final uc f32817q;
    public Runnable f32818r;
    public long f32819s;
    public final e9 f32807f = new e9((org.telegram.ui.ActionBar.c6) null);
    public final Path f32809i = new Path();

    public t11(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f32814n = paint;
        Path path = new Path();
        this.f32815o = path;
        this.f32816p = new RectF();
        this.f32803a = i10;
        this.f32804b = view;
        this.f32805c = c6Var;
        this.d = z10;
        this.f32817q = new uc(view);
        this.f32808g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f32808g.onAttachedToWindow();
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.a(this.f32804b);
        }
    }

    public final void b() {
        this.f32808g.onDetachedFromWindow();
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.o(this.f32804b);
        }
    }

    public final void c(Canvas canvas, int i10, float f9, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        zz0 zz0Var = this.f32806e;
        if (zz0Var != null) {
            zz0Var.f35473p = i10 - AndroidUtilities.dp(144.66f);
            float l10 = this.f32806e.l() + AndroidUtilities.dp(48.66f);
            float f15 = i10;
            float f16 = (f15 - l10) / 2.0f;
            int i11 = this.f32811k;
            int i12 = (int) l10;
            boolean z11 = this.d;
            Path path = this.f32809i;
            if (i11 == i12 && this.f32810j == i10 && this.f32813m == z10 && this.f32812l == z11) {
                f14 = l10;
                f13 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                f13 = 2.0f;
                rectF.set(f16, AndroidUtilities.dp(4.5f), f16 + l10, AndroidUtilities.dp(28.5f));
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
                        l10 = l10;
                    }
                    float f18 = f15;
                    f14 = l10;
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
                    f14 = l10;
                }
                this.f32811k = i12;
                this.f32810j = i10;
                this.f32812l = z11;
                this.f32813m = z10;
            }
            canvas.save();
            float f19 = f9 / f13;
            canvas.translate(f19, f10);
            org.telegram.ui.ActionBar.c6 c6Var = this.f32805c;
            Paint T0 = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var);
            int alpha = T0.getAlpha();
            T0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, T0);
            T0.setAlpha(alpha);
            if (c6Var != null ? c6Var.l0() : org.telegram.ui.ActionBar.g6.a1()) {
                Paint T02 = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var);
                int alpha2 = T02.getAlpha();
                T02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, T02);
                T02.setAlpha(alpha2);
            }
            canvas.restore();
            float f20 = f19 + f16;
            float f21 = f20 + f14;
            this.f32816p.set(f20 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, AndroidUtilities.dp(32.0f) + f10);
            if (z10) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f20), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f20), (int) (AndroidUtilities.dp(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f32808g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f20, AndroidUtilities.dp(6.5f) + f10, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas);
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, c6Var);
                this.f32806e.c(f20 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, v02, canvas);
                canvas.save();
                canvas.translate(f21 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
                int l1 = org.telegram.ui.ActionBar.g6.l1(0.75f * f12, v02);
                Paint paint = this.f32814n;
                paint.setColor(l1);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f32815o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t11.d(android.view.MotionEvent, boolean):boolean");
    }

    public final void e(org.telegram.ui.Cells.a1 a1Var) {
        this.f32818r = a1Var;
    }

    public final boolean f(MessageObject messageObject) {
        p5 p5Var = this.h;
        View view = this.f32804b;
        if (p5Var != null) {
            p5Var.o(view);
            this.h = null;
        }
        this.f32811k = 0;
        this.f32819s = 0L;
        if (messageObject == null) {
            this.f32806e = null;
            this.f32819s = 0L;
        } else {
            int i10 = this.f32803a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f32808g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f32819s = monoForumTopicId;
                if (userOrChat == null) {
                    this.f32806e = null;
                    return false;
                }
                e9 e9Var = this.f32807f;
                e9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, e9Var);
                this.f32806e = new zz0(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f32819s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.f32806e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(yf.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, this.f32805c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new p5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(yf.d.e(findTopic));
                }
                this.f32806e = new zz0(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.f32806e == null) {
            return false;
        }
        return true;
    }
}
