package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class di0 implements org.telegram.ui.Components.el0 {
    public final org.telegram.ui.ActionBar.r2 f38892a;
    public final ni0 f38893b;

    public di0(ni0 ni0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f38893b = ni0Var;
        this.f38892a = r2Var;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        bh.x0 x0Var2;
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z14;
        long j10;
        boolean z15;
        bh.x0 x0Var3;
        bh.x0 x0Var4 = x0Var;
        if (x0Var4 != null) {
            ni0 ni0Var = this.f38893b;
            bi0 bi0Var = ni0Var.f41907d0;
            zh0 zh0Var = ni0Var.Z;
            int i10 = ni0Var.f41905c;
            if (bi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && x0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.s1 s1Var = ni0Var.P;
                if (s1Var != null) {
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = x0Var4.f4207c;
                        if (j12 == j11) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z14 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j12;
                            z14 = false;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.s1 s1Var2 = ni0Var.P;
                            j10 = j11;
                            MessageObject.GroupedMessages k10 = ni0Var.k(messageObject);
                            if (ni0Var.M.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            s1Var2.Z3(messageObject, k10, z15, false, false, false);
                            bi0 bi0Var2 = ni0Var.f41907d0;
                            if (z14) {
                                x0Var3 = null;
                            } else {
                                x0Var3 = x0Var4;
                            }
                            bi0Var2.setSelectedReactionAnimated(x0Var3);
                            if (ni0Var.f41907d0.getReactionsWindow() != null && ni0Var.f41907d0.getReactionsWindow().f4056m != null) {
                                bh.d0 d0Var = ni0Var.f41907d0.getReactionsWindow().f4056m;
                                if (z14) {
                                    x0Var4 = null;
                                }
                                d0Var.setSelectedReaction(x0Var4);
                                ni0Var.f41907d0.getReactionsWindow().f4047a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        zh0Var.c();
                        if (!z14) {
                            zh0Var.n(ni0Var.P, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ai0 ai0Var = ni0Var.W;
                        if (ai0Var != null) {
                            ai0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        ni0Var.l(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (ni0Var.f41915k0 != null) {
                    long j13 = x0Var4.f4207c;
                    if (j13 == ni0Var.H) {
                        ni0Var.H = 0L;
                        z13 = true;
                    } else {
                        ni0Var.H = j13;
                        z13 = false;
                    }
                    ai0 ai0Var2 = ni0Var.W;
                    if (ai0Var2 != null) {
                        ai0Var2.setEffect(ni0Var.H);
                    }
                    ni0Var.l(ni0Var.H);
                    if (!z12) {
                        if (ni0Var.H == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(ni0Var.H);
                        }
                        org.telegram.ui.Components.r5 r5Var = ni0Var.I;
                        if (r5Var != null) {
                            if (ni0Var.H != 0 && effect != null) {
                                r5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                r5Var.g(null, true);
                            }
                        }
                        bi0 bi0Var3 = ni0Var.f41907d0;
                        if (z13) {
                            x0Var2 = null;
                        } else {
                            x0Var2 = x0Var4;
                        }
                        bi0Var3.setSelectedReactionAnimated(x0Var2);
                        if (ni0Var.f41907d0.getReactionsWindow() != null && ni0Var.f41907d0.getReactionsWindow().f4056m != null) {
                            bh.d0 d0Var2 = ni0Var.f41907d0.getReactionsWindow().f4056m;
                            if (z13) {
                                x0Var4 = null;
                            }
                            d0Var2.setSelectedReaction(x0Var4);
                            ni0Var.f41907d0.getReactionsWindow().f4047a.invalidate();
                        }
                    }
                    zh0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = ni0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ni0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (r2Var = this.f38892a) != null) {
                    new org.telegram.ui.Components.wc(ni0Var.F, ni0Var.f41903b).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ci0(0, r2Var))).j();
                }
                ni0Var.G.invalidate();
            }
        }
    }

    @Override
    public final void m() {
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
