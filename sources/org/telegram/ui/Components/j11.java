package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class j11 {

    public final int f29538a;

    public final View f29539b;

    public final org.telegram.ui.ActionBar.c6 f29540c;
    public final boolean d;

    public pz0 f29541e;

    public final ImageReceiver f29543g;
    public k5 h;

    public int f29545j;

    public int f29546k;

    public boolean f29547l;

    public boolean f29548m;

    public final Paint f29549n;

    public final Path f29550o;

    public final RectF f29551p;

    public final nc f29552q;

    public Runnable f29553r;

    public long f29554s;

    public final y8 f29542f = new y8((org.telegram.ui.ActionBar.c6) null);

    public final Path f29544i = new Path();

    public j11(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f29549n = paint;
        Path path = new Path();
        this.f29550o = path;
        this.f29551p = new RectF();
        this.f29538a = i10;
        this.f29539b = view;
        this.f29540c = c6Var;
        this.d = z10;
        this.f29552q = new nc(view);
        this.f29543g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.f29543g.onAttachedToWindow();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a(this.f29539b);
        }
    }

    public final void b() {
        this.f29543g.onDetachedFromWindow();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.o(this.f29539b);
        }
    }

    public final void c(Canvas canvas, int i10, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        pz0 pz0Var = this.f29541e;
        if (pz0Var == null) {
            return;
        }
        pz0Var.f31708p = i10 - AndroidUtilities.dp(144.66f);
        float fL = this.f29541e.l() + AndroidUtilities.dp(48.66f);
        float f16 = i10;
        float f17 = (f16 - fL) / 2.0f;
        int i11 = this.f29546k;
        int i12 = (int) fL;
        boolean z11 = this.d;
        Path path = this.f29544i;
        if (i11 == i12 && this.f29545j == i10 && this.f29548m == z10 && this.f29547l == z11) {
            f15 = fL;
            f14 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            f14 = 2.0f;
            rectF.set(f17, AndroidUtilities.dp(4.5f), f17 + fL, AndroidUtilities.dp(28.5f));
            if (z10) {
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (z11) {
                float f18 = f16 / 2.0f;
                float fDp = f18 - AndroidUtilities.dp(1.833f);
                while (fDp > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), fDp, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    fDp -= AndroidUtilities.dp(8.33f);
                    f16 = f16;
                    fL = fL;
                }
                float f19 = f16;
                f15 = fL;
                int iDp = AndroidUtilities.dp(1.833f);
                while (true) {
                    f18 += iDp;
                    if (f18 >= f19) {
                        break;
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f18, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f18, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    iDp = AndroidUtilities.dp(8.33f);
                }
            } else {
                f15 = fL;
            }
            this.f29546k = i12;
            this.f29545j = i10;
            this.f29547l = z11;
            this.f29548m = z10;
        }
        canvas.save();
        float f20 = f10 / f14;
        canvas.translate(f20, f11);
        org.telegram.ui.ActionBar.c6 c6Var = this.f29540c;
        Paint paintT0 = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var);
        int alpha = paintT0.getAlpha();
        paintT0.setAlpha((int) (alpha * f13 * f12));
        canvas.drawPath(path, paintT0);
        paintT0.setAlpha(alpha);
        if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
            Paint paintT1 = org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var);
            int alpha2 = paintT1.getAlpha();
            paintT1.setAlpha((int) (alpha2 * f13 * f12));
            canvas.drawPath(path, paintT1);
            paintT1.setAlpha(alpha2);
        }
        canvas.restore();
        float f21 = f20 + f17;
        float f22 = f21 + f15;
        this.f29551p.set(f21 - AndroidUtilities.dp(4.0f), f11 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f11);
        if (z10) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f11), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f11));
                this.h.setAlpha((int) (255.0f * f13));
                this.h.draw(canvas);
            } else {
                float fDp2 = AndroidUtilities.dp(2.66f) + f21;
                float fDp3 = AndroidUtilities.dp(6.5f) + f11;
                float fDp4 = AndroidUtilities.dp(20.0f);
                float fDp5 = AndroidUtilities.dp(20.0f);
                ImageReceiver imageReceiver = this.f29543g;
                imageReceiver.setImageCoords(fDp2, fDp3, fDp4, fDp5);
                imageReceiver.setAlpha(f13);
                imageReceiver.draw(canvas);
            }
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23150ic, c6Var);
            this.f29541e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f11, f13, iV0, canvas);
            canvas.save();
            canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f11);
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.75f * f13, iV0);
            Paint paint = this.f29549n;
            paint.setColor(iL1);
            paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
            canvas.drawPath(this.f29550o, paint);
            canvas.restore();
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        Runnable runnable;
        if (this.f29541e != null) {
            if (this.f29551p.contains(motionEvent.getX(), motionEvent.getY() - (z10 ? this.f29539b.getPaddingTop() : 0))) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        nc ncVar = this.f29552q;
        if (action == 0) {
            ncVar.c(z11);
        } else if (motionEvent.getAction() == 2) {
            if (ncVar.h && !z11) {
                ncVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ncVar.h && (runnable = this.f29553r) != null) {
                runnable.run();
            }
            ncVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
        }
        return ncVar.h;
    }

    public final void e(org.telegram.ui.Cells.a1 a1Var) {
        this.f29553r = a1Var;
    }

    public final boolean f(MessageObject messageObject) {
        k5 k5Var = this.h;
        View view = this.f29539b;
        if (k5Var != null) {
            k5Var.o(view);
            this.h = null;
        }
        this.f29546k = 0;
        this.f29554s = 0L;
        if (messageObject == null) {
            this.f29541e = null;
            this.f29554s = 0L;
        } else {
            int i10 = this.f29538a;
            boolean zIsMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.f29543g;
            if (zIsMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.f29554s = monoForumTopicId;
                if (userOrChat == null) {
                    this.f29541e = null;
                    return false;
                }
                y8 y8Var = this.f29542f;
                y8Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, y8Var);
                this.f29541e = new pz0(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.f29554s = topicId;
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (tL_forumTopicFindTopic == null) {
                    this.f29541e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(wf.c.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.f29540c), false));
                } else if (tL_forumTopicFindTopic.icon_emoji_id != 0) {
                    this.h = new k5(0, i10, tL_forumTopicFindTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(wf.c.e(tL_forumTopicFindTopic));
                }
                this.f29541e = new pz0(tL_forumTopicFindTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        return this.f29541e != null;
    }
}
