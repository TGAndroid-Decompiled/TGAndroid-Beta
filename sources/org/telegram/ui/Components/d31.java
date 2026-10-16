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
public final class d31 {
    public final int f23960a;
    public final View f23961b;
    public final org.telegram.ui.ActionBar.c6 f23962c;
    public final boolean d;
    public i11 e;
    public final ImageReceiver f23964g;
    public s5 h;
    public int f23966j;
    public int f23967k;
    public boolean f23968l;
    public boolean f23969m;
    public final Paint f23970n;
    public final Path f23971o;
    public final RectF f23972p;
    public final ad f23973q;
    public Runnable f23974r;
    public long f23975s;
    public final k9 f23963f = new k9((org.telegram.ui.ActionBar.c6) null);
    public final Path f23965i = new Path();

    public d31(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f23970n = paint;
        Path path = new Path();
        this.f23971o = path;
        this.f23972p = new RectF();
        this.f23960a = i10;
        this.f23961b = view;
        this.f23962c = c6Var;
        this.d = z10;
        this.f23973q = new ad(view);
        this.f23964g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f23964g.onAttachedToWindow();
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.a(this.f23961b);
        }
    }

    public final void b() {
        this.f23964g.onDetachedFromWindow();
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.o(this.f23961b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        i11 i11Var = this.e;
        if (i11Var != null) {
            i11Var.f25465p = i10 - AndroidUtilities.dp(144.66f);
            float l4 = this.e.l() + AndroidUtilities.dp(48.66f);
            float f15 = i10;
            float f16 = (f15 - l4) / 2.0f;
            int i11 = this.f23967k;
            int i12 = (int) l4;
            boolean z11 = this.d;
            Path path = this.f23965i;
            if (i11 == i12 && this.f23966j == i10 && this.f23969m == z10 && this.f23968l == z11) {
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
                this.f23967k = i12;
                this.f23966j = i10;
                this.f23968l = z11;
                this.f23969m = z10;
            }
            canvas.save();
            float f20 = f7 / f13;
            canvas.translate(f20, f10);
            org.telegram.ui.ActionBar.c6 c6Var = this.f23962c;
            Paint U0 = org.telegram.ui.ActionBar.g6.U0("paintChatActionBackground", c6Var);
            int alpha = U0.getAlpha();
            U0.setAlpha((int) (alpha * f12 * f11));
            canvas.drawPath(path, U0);
            U0.setAlpha(alpha);
            if (c6Var != null ? c6Var.m0() : org.telegram.ui.ActionBar.g6.b1()) {
                Paint U02 = org.telegram.ui.ActionBar.g6.U0("paintChatActionBackgroundDarken", c6Var);
                int alpha2 = U02.getAlpha();
                U02.setAlpha((int) (alpha2 * f12 * f11));
                canvas.drawPath(path, U02);
                U02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f16;
            float f22 = f21 + f14;
            this.f23972p.set(f21 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f10);
            if (z10) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f10));
                    this.h.setAlpha((int) (255.0f * f12));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f23964g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f10, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas);
                }
                int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19695ic, c6Var);
                this.e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, w02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
                int m12 = org.telegram.ui.ActionBar.g6.m1(0.75f * f12, w02);
                Paint paint = this.f23970n;
                paint.setColor(m12);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f23971o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d31.d(android.view.MotionEvent, boolean):boolean");
    }

    public final boolean e(MessageObject messageObject) {
        s5 s5Var = this.h;
        View view = this.f23961b;
        if (s5Var != null) {
            s5Var.o(view);
            this.h = null;
        }
        this.f23967k = 0;
        this.f23975s = 0L;
        if (messageObject == null) {
            this.e = null;
            this.f23975s = 0L;
        } else {
            int i10 = this.f23960a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f23964g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f23975s = monoForumTopicId;
                if (userOrChat == null) {
                    this.e = null;
                    return false;
                }
                k9 k9Var = this.f23963f;
                k9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, k9Var);
                this.e = new i11(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f23975s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(og.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19935v8, this.f23962c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new s5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(og.d.e(findTopic));
                }
                this.e = new i11(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.e == null) {
            return false;
        }
        return true;
    }
}
