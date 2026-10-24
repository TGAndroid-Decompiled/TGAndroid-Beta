package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class np implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final ImageReceiver F;
    public TLRPC.Chat G;
    public TLRPC.TL_forumTopic H;
    public long I;
    public AnimatorSet J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public float Q;
    public boolean R;
    public float S;
    public final View T;
    public long U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public ti Y;
    public long Z;
    public int f39927a;
    public View f39928a0;
    public int f39929b;
    public boolean f39930b0;
    public int f39931c;
    public final org.telegram.ui.Components.cr f39932c0;
    public float d;
    public final int[] f39933d0;
    public final Paint e;
    public final int f39934e0;
    public final TextPaint f39935f;
    public final int f39936f0;
    public final int f39937g0;
    public final TextPaint h;
    public final long f39938h0;
    public final long f39939i0;
    public final org.telegram.ui.ActionBar.g6 f39940j0;
    public org.telegram.ui.Components.p5 f39941k0;
    public og.c f39942l0;
    public int m0;
    public final Paint f39943n;
    public int f39944n0;
    public final Path f39945r;
    public StaticLayout f39946s;
    public StaticLayout v;
    public StaticLayout f39947w;
    public int f39948x;
    public int f39949y;

    public np(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f39935f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f39943n = paint2;
        this.f39945r = new Path();
        this.I = 0L;
        this.f39930b0 = true;
        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(null, true, null);
        this.f39932c0 = crVar;
        this.f39933d0 = new int[3];
        this.T = view;
        this.f39934e0 = i10;
        this.f39939i0 = j10;
        this.f39936f0 = i11;
        this.f39937g0 = i12;
        this.f39938h0 = j11;
        this.X = MessagesController.getInstance(i10).isForum(j10);
        this.f39940j0 = g6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        crVar.f25458z = 3;
        crVar.I = 1;
        crVar.f25441g = true;
        crVar.d = d("paintChatActionBackground");
        crVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j11;
        int i12;
        int[] iArr2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
            iArr[2] = i11;
        }
        if (i11 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i11);
            if (dialogFilter != null) {
                dialogs = dialogFilter.dialogs;
            } else {
                return null;
            }
        } else {
            dialogs = messagesController.getDialogs(i10);
        }
        if (dialogs != null) {
            for (int i13 = 0; i13 < dialogs.size(); i13++) {
                TLRPC.Dialog dialog = dialogs.get(i13);
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f20348id));
                if (chat != null && dialog.f20348id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f20348id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f17862id;
                        if (i11 != i15) {
                            long j12 = j10;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c11 = c(j12, i16, i15, false, iArr3);
                            j11 = j12;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c11 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c11;
                            }
                        } else {
                            j11 = j10;
                            i12 = i10;
                            iArr2 = iArr;
                        }
                        i14++;
                        i10 = i12;
                        j10 = j11;
                        iArr = iArr2;
                    }
                }
                long j13 = j10;
                int i17 = i10;
                int[] iArr4 = iArr;
                for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
                    int keyAt = messagesController.dialogsByFolder.keyAt(i18);
                    if (i17 != keyAt && (c10 = c(j13, keyAt, 0, false, iArr4)) != null) {
                        if (iArr4 != null) {
                            iArr4[0] = 1;
                        }
                        return c10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(android.graphics.Canvas r43, org.telegram.ui.nj r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np.a(android.graphics.Canvas, org.telegram.ui.nj, float, float):void");
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xk, this.f39940j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.v != null) {
            float f7 = this.K;
            if (f7 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f7) * alpha2 * this.S));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.f39931c - this.f39949y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f39947w != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float dp = ((1.0f - this.K) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f39947w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f39931c - this.E) / 2.0f, dp);
                this.f39947w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.g6 g6Var = this.f39940j0;
        if (g6Var != null) {
            paint = g6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.U0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f39934e0).dialogs_dict.f(this.Z)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.f39932c0.c(i12, true);
            if (i12 <= 0) {
                z10 = false;
            }
            this.f39930b0 = z10;
            View view = this.f39928a0;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final boolean e() {
        if (this.S > 0.0f && !this.R) {
            return true;
        }
        return false;
    }

    public final void f() {
        View view;
        this.F.onAttachedToWindow();
        org.telegram.ui.Components.p5 p5Var = this.f39941k0;
        if (p5Var != null && (view = this.f39928a0) != null) {
            p5Var.a(view);
        }
        NotificationCenter.getInstance(this.f39934e0).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f39326b;

                {
                    this.f39326b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f39326b;
                            npVar.getClass();
                            npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.T.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f39326b;
                            npVar2.getClass();
                            npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f39326b;
                            npVar3.getClass();
                            npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f39326b;
                            npVar4.getClass();
                            npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f39326b;
                            npVar5.getClass();
                            npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.zr.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f39326b;

                {
                    this.f39326b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f39326b;
                            npVar.getClass();
                            npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.T.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f39326b;
                            npVar2.getClass();
                            npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f39326b;
                            npVar3.getClass();
                            npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f39326b;
                            npVar4.getClass();
                            npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f39326b;
                            npVar5.getClass();
                            npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33340j;
            ofFloat2.setInterpolator(zrVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f39326b;

                {
                    this.f39326b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f39326b;
                            npVar.getClass();
                            npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.T.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f39326b;
                            npVar2.getClass();
                            npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f39326b;
                            npVar3.getClass();
                            npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f39326b;
                            npVar4.getClass();
                            npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f39326b;
                            npVar5.getClass();
                            npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(zrVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final np f39326b;

                {
                    this.f39326b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            np npVar = this.f39326b;
                            npVar.getClass();
                            npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.T.invalidate();
                            return;
                        case 1:
                            np npVar2 = this.f39326b;
                            npVar2.getClass();
                            npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            np npVar3 = this.f39326b;
                            npVar3.getClass();
                            npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            np npVar4 = this.f39326b;
                            npVar4.getClass();
                            npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            np npVar5 = this.f39326b;
                            npVar5.getClass();
                            npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(zrVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.addListener(new ai.ne(16, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.J.playTogether(ofFloat, animatorSet3);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.K, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final np f39326b;

            {
                this.f39326b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        np npVar = this.f39326b;
                        npVar.getClass();
                        npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        npVar.T.invalidate();
                        return;
                    case 1:
                        np npVar2 = this.f39326b;
                        npVar2.getClass();
                        npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        np npVar3 = this.f39326b;
                        npVar3.getClass();
                        npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        np npVar4 = this.f39326b;
                        npVar4.getClass();
                        npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        np npVar5 = this.f39326b;
                        npVar5.getClass();
                        npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        npVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.zr.f33337f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.J = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.J.start();
    }

    public final void h() {
        boolean z10;
        boolean z11 = false;
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.f39939i0, this.f39936f0, this.f39937g0, true, this.f39933d0);
        if (c10 != null) {
            this.Z = c10.f20348id;
            int[] iArr = this.f39933d0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z10;
            this.f39927a = iArr[1];
            this.f39929b = iArr[2];
            this.R = false;
            int i10 = this.f39934e0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.f20348id));
            this.G = chat;
            if (chat == null) {
                this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.f20348id));
            }
            org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
            f9Var.k(i10, this.G);
            this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", f9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c10.f20348id, 0, null);
            int i11 = c10.unread_count;
            this.f39932c0.c(i11, false);
            if (i11 > 0) {
                z11 = true;
            }
            this.f39930b0 = z11;
            return;
        }
        this.G = null;
        this.W = false;
        this.R = true;
    }

    public final void i(TLRPC.Chat chat) {
        boolean z10;
        int i10;
        if (chat == null) {
            h();
            return;
        }
        this.Z = -chat.f20344id;
        int[] iArr = this.f39933d0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        this.f39927a = iArr[1];
        this.f39929b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat2 = this.G;
        int i11 = this.f39934e0;
        f9Var.k(i11, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", f9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f20344id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f20344id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.f39932c0.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.f39930b0 = z11;
        this.V = true;
        this.H = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.p5 p5Var;
        View view;
        View view2;
        org.telegram.ui.Components.p5 p5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.V = false;
        this.W = false;
        og.c cVar = null;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        int i10 = this.f39934e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f39939i0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f20396id != this.f39938h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i12 = tL_forumTopic.f20396id;
            org.telegram.ui.ActionBar.g6 g6Var = this.f39940j0;
            if (i12 == 1) {
                View view3 = this.f39928a0;
                if (view3 != null && (p5Var2 = this.f39941k0) != null) {
                    p5Var2.o(view3);
                }
                this.f39941k0 = null;
                Context context = this.T.getContext();
                int i13 = org.telegram.ui.ActionBar.k6.Ac;
                og.c c10 = og.d.c(context, 1.0f, org.telegram.ui.ActionBar.k6.w0(i13, g6Var), true);
                if (c10 != null) {
                    cVar = c10;
                }
                this.f39942l0 = cVar;
                this.m0 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
                imageReceiver.setImageBitmap(c10);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.p5 p5Var3 = this.f39941k0;
                if (p5Var3 == null || p5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.p5 p5Var4 = this.f39941k0;
                    if (p5Var4 != null && (view = this.f39928a0) != null) {
                        p5Var4.o(view);
                    }
                    org.telegram.ui.Components.p5 p5Var5 = new org.telegram.ui.Components.p5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f39941k0 = p5Var5;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21278ic, g6Var);
                    this.f39944n0 = w02;
                    p5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.p5 p5Var6 = this.f39941k0;
                if (p5Var6 != null && (view2 = this.f39928a0) != null) {
                    p5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.f39928a0;
                if (view4 != null && (p5Var = this.f39941k0) != null) {
                    p5Var.o(view4);
                }
                this.f39941k0 = null;
                imageReceiver.setImageBitmap(og.d.e(tL_forumTopic));
            }
            int i14 = tL_forumTopic.unread_count;
            this.f39932c0.c(i14, false);
            if (i14 > 0) {
                z10 = true;
            }
            this.f39930b0 = z10;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
