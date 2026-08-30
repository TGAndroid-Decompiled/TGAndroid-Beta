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
public final class d21 {
    public final int f24107a;
    public final View f24108b;
    public final org.telegram.ui.ActionBar.f6 f24109c;
    public final boolean d;
    public k01 e;
    public final ImageReceiver f24111g;
    public l5 h;
    public int f24113j;
    public int f24114k;
    public boolean f24115l;
    public boolean f24116m;
    public final Paint f24117n;
    public final Path f24118o;
    public final RectF f24119p;
    public final rc f24120q;
    public Runnable f24121r;
    public long f24122s;
    public final z8 f24110f = new z8((org.telegram.ui.ActionBar.f6) null);
    public final Path f24112i = new Path();

    public d21(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.f24117n = paint;
        Path path = new Path();
        this.f24118o = path;
        this.f24119p = new RectF();
        this.f24107a = i10;
        this.f24108b = view;
        this.f24109c = f6Var;
        this.d = z4;
        this.f24120q = new rc(view);
        this.f24111g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f24111g.onAttachedToWindow();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.a(this.f24108b);
        }
    }

    public final void b() {
        this.f24111g.onDetachedFromWindow();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.o(this.f24108b);
        }
    }

    public final void c(Canvas canvas, int i10, float f10, float f11, float f12, float f13, boolean z4) {
        float f14;
        float f15;
        k01 k01Var = this.e;
        if (k01Var != null) {
            k01Var.f26094p = i10 - AndroidUtilities.dp(144.66f);
            float l10 = this.e.l() + AndroidUtilities.dp(48.66f);
            float f16 = i10;
            float f17 = (f16 - l10) / 2.0f;
            int i11 = this.f24114k;
            int i12 = (int) l10;
            boolean z10 = this.d;
            Path path = this.f24112i;
            if (i11 == i12 && this.f24113j == i10 && this.f24116m == z4 && this.f24115l == z10) {
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
                this.f24114k = i12;
                this.f24113j = i10;
                this.f24115l = z10;
                this.f24116m = z4;
            }
            canvas.save();
            float f20 = f10 / f14;
            canvas.translate(f20, f11);
            org.telegram.ui.ActionBar.f6 f6Var = this.f24109c;
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var);
            int alpha = T0.getAlpha();
            T0.setAlpha((int) (alpha * f13 * f12));
            canvas.drawPath(path, T0);
            T0.setAlpha(alpha);
            if (f6Var != null ? f6Var.m0() : org.telegram.ui.ActionBar.j6.a1()) {
                Paint T02 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", f6Var);
                int alpha2 = T02.getAlpha();
                T02.setAlpha((int) (alpha2 * f13 * f12));
                canvas.drawPath(path, T02);
                T02.setAlpha(alpha2);
            }
            canvas.restore();
            float f21 = f20 + f17;
            float f22 = f21 + f15;
            this.f24119p.set(f21 - AndroidUtilities.dp(4.0f), f11 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f11);
            if (z4) {
                l5 l5Var = this.h;
                if (l5Var != null) {
                    l5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f11), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f11));
                    this.h.setAlpha((int) (255.0f * f13));
                    this.h.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = this.f24111g;
                    imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f11, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                    imageReceiver.setAlpha(f13);
                    imageReceiver.draw(canvas);
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, f6Var);
                this.e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f11, f13, v02, canvas);
                canvas.save();
                canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f11);
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.75f * f13, v02);
                Paint paint = this.f24117n;
                paint.setColor(l1);
                paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                canvas.drawPath(this.f24118o, paint);
                canvas.restore();
            }
        }
    }

    public final boolean d(android.view.MotionEvent r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d21.d(android.view.MotionEvent, boolean):boolean");
    }

    public final void e(org.telegram.ui.Cells.a1 a1Var) {
        this.f24121r = a1Var;
    }

    public final boolean f(MessageObject messageObject) {
        l5 l5Var = this.h;
        View view = this.f24108b;
        if (l5Var != null) {
            l5Var.o(view);
            this.h = null;
        }
        this.f24114k = 0;
        this.f24122s = 0L;
        if (messageObject == null) {
            this.e = null;
            this.f24122s = 0L;
        } else {
            int i10 = this.f24107a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f24111g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f24122s = monoForumTopicId;
                if (userOrChat == null) {
                    this.e = null;
                    return false;
                }
                z8 z8Var = this.f24110f;
                z8Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, z8Var);
                this.e = new k01(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f24122s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(ag.f.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, this.f24109c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new l5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(ag.f.e(findTopic));
                }
                this.e = new k01(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        if (this.e == null) {
            return false;
        }
        return true;
    }
}
