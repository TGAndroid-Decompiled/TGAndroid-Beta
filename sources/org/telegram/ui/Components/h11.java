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
public final class h11 {
    public final int f28930a;
    public final View f28931b;
    public final org.telegram.ui.ActionBar.b6 f28932c;
    public final boolean d;
    public nz0 f28933e;
    public final ImageReceiver f28935g;
    public k5 h;
    public int f28937j;
    public int f28938k;
    public boolean f28939l;
    public boolean f28940m;
    public final Paint f28941n;
    public final Path f28942o;
    public final RectF f28943p;
    public final pc f28944q;
    public Runnable f28945r;
    public long f28946s;
    public final z8 f28934f = new z8((org.telegram.ui.ActionBar.b6) null);
    public final Path f28936i = new Path();

    public h11(int i9, View view, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f28941n = paint;
        Path path = new Path();
        this.f28942o = path;
        this.f28943p = new RectF();
        this.f28930a = i9;
        this.f28931b = view;
        this.f28932c = b6Var;
        this.d = z10;
        this.f28944q = new pc(view);
        this.f28935g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f28935g.onAttachedToWindow();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a(this.f28931b);
        }
    }

    public final void b() {
        this.f28935g.onDetachedFromWindow();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.o(this.f28931b);
        }
    }

    public final void c(Canvas canvas, int i9, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        nz0 nz0Var = this.f28933e;
        if (nz0Var != null) {
            nz0Var.f31234p = i9 - AndroidUtilities.dp(144.66f);
            float l10 = this.f28933e.l() + AndroidUtilities.dp(48.66f);
            float f16 = i9;
            float f17 = (f16 - l10) / 2.0f;
            int i10 = this.f28938k;
            int i11 = (int) l10;
            boolean z11 = this.d;
            Path path = this.f28936i;
            if (i10 == i11 && this.f28937j == i9 && this.f28940m == z10 && this.f28939l == z11) {
                f15 = l10;
                f14 = 2.0f;
            } else {
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                f14 = 2.0f;
                rectF.set(f17, AndroidUtilities.dp(4.5f), f17 + l10, AndroidUtilities.dp(28.5f));
                if (z10) {
                    path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                }
                if (z11) {
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
                this.f28938k = i11;
                this.f28937j = i9;
                this.f28939l = z11;
                this.f28940m = z10;
            }
            canvas.save();
            float f20 = f10 / f14;
            canvas.translate(f20, f11);
            org.telegram.ui.ActionBar.b6 b6Var = this.f28932c;
            Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var);
            int alpha = T0.getAlpha();
            T0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, T0);
            T0.setAlpha(alpha);
            if (b6Var != null ? b6Var.t0() : org.telegram.ui.ActionBar.f6.a1()) {
                Paint T02 = org.telegram.ui.ActionBar.f6.T0("paintChatActionBackgroundDarken", b6Var);
                int alpha2 = T02.getAlpha();
                T02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, T02);
                T02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f17;
            float f22 = f21 + f15;
            this.f28943p.set(f21 - AndroidUtilities.dp(4.0f), f11 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f11);
            if (z10) {
                k5 k5Var = this.h;
                if (k5Var != null) {
                    k5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f11), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f28935g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f11, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.draw(canvas);
                }
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, b6Var);
                this.f28933e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f11, f13, v02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f11);
                int l1 = org.telegram.ui.ActionBar.f6.l1(0.75f * f13, v02);
                Paint paint = this.f28941n;
                paint.setColor(l1);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f28942o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.d(android.view.MotionEvent, boolean):boolean");
    }

    public final void e(org.telegram.ui.Cells.b1 b1Var) {
        this.f28945r = b1Var;
    }

    public final boolean f(MessageObject messageObject) {
        k5 k5Var = this.h;
        View view = this.f28931b;
        if (k5Var != null) {
            k5Var.o(view);
            this.h = null;
        }
        this.f28938k = 0;
        this.f28946s = 0L;
        if (messageObject == null) {
            this.f28933e = null;
            this.f28946s = 0L;
        } else {
            int i9 = this.f28930a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i9).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f28935g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(monoForumTopicId);
                this.f28946s = monoForumTopicId;
                if (userOrChat == null) {
                    this.f28933e = null;
                    return false;
                }
                z8 z8Var = this.f28934f;
                z8Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, z8Var);
                this.f28933e = new nz0(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f28946s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i9).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.f28933e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(vf.c.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, this.f28932c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new k5(0, i9, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(vf.c.e(findTopic));
                }
                this.f28933e = new nz0(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.f28933e == null) {
            return false;
        }
        return true;
    }
}
