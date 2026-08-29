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
public final class ai0 implements org.telegram.ui.Components.ek0 {
    public final org.telegram.ui.ActionBar.o2 f36555a;
    public final ki0 f36556b;

    public ai0(ki0 ki0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36556b = ki0Var;
        this.f36555a = o2Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        kg.q0 q0Var2;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z14;
        long j10;
        boolean z15;
        kg.q0 q0Var3;
        kg.q0 q0Var4 = q0Var;
        if (q0Var4 != null) {
            ki0 ki0Var = this.f36556b;
            yh0 yh0Var = ki0Var.f39873a0;
            wh0 wh0Var = ki0Var.W;
            int i10 = ki0Var.f39876c;
            if (yh0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && q0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.s1 s1Var = ki0Var.M;
                if (s1Var != null) {
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = q0Var4.f13823c;
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
                            org.telegram.ui.Cells.s1 s1Var2 = ki0Var.M;
                            j10 = j11;
                            MessageObject.GroupedMessages l10 = ki0Var.l(messageObject);
                            if (ki0Var.J.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            s1Var2.X3(messageObject, l10, z15, false, false, false);
                            yh0 yh0Var2 = ki0Var.f39873a0;
                            if (z14) {
                                q0Var3 = null;
                            } else {
                                q0Var3 = q0Var4;
                            }
                            yh0Var2.setSelectedReactionAnimated(q0Var3);
                            if (ki0Var.f39873a0.getReactionsWindow() != null && ki0Var.f39873a0.getReactionsWindow().f13691m != null) {
                                kg.z zVar = ki0Var.f39873a0.getReactionsWindow().f13691m;
                                if (z14) {
                                    q0Var4 = null;
                                }
                                zVar.setSelectedReaction(q0Var4);
                                ki0Var.f39873a0.getReactionsWindow().f13681a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        wh0Var.c();
                        if (!z14) {
                            wh0Var.o(ki0Var.M, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        xh0 xh0Var = ki0Var.T;
                        if (xh0Var != null) {
                            xh0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        ki0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (ki0Var.f39884h0 != null) {
                    long j13 = q0Var4.f13823c;
                    if (j13 == ki0Var.E) {
                        ki0Var.E = 0L;
                        z13 = true;
                    } else {
                        ki0Var.E = j13;
                        z13 = false;
                    }
                    xh0 xh0Var2 = ki0Var.T;
                    if (xh0Var2 != null) {
                        xh0Var2.setEffect(ki0Var.E);
                    }
                    ki0Var.m(ki0Var.E);
                    if (!z12) {
                        if (ki0Var.E == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(ki0Var.E);
                        }
                        org.telegram.ui.Components.n5 n5Var = ki0Var.F;
                        if (n5Var != null) {
                            if (ki0Var.E != 0 && effect != null) {
                                n5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                n5Var.g(null, true);
                            }
                        }
                        yh0 yh0Var3 = ki0Var.f39873a0;
                        if (z13) {
                            q0Var2 = null;
                        } else {
                            q0Var2 = q0Var4;
                        }
                        yh0Var3.setSelectedReactionAnimated(q0Var2);
                        if (ki0Var.f39873a0.getReactionsWindow() != null && ki0Var.f39873a0.getReactionsWindow().f13691m != null) {
                            kg.z zVar2 = ki0Var.f39873a0.getReactionsWindow().f13691m;
                            if (z13) {
                                q0Var4 = null;
                            }
                            zVar2.setSelectedReaction(q0Var4);
                            ki0Var.f39873a0.getReactionsWindow().f13681a.invalidate();
                        }
                    }
                    wh0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = ki0Var.E;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ki0Var.W.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (o2Var = this.f36555a) != null) {
                    new org.telegram.ui.Components.tc(ki0Var.C, ki0Var.f39874b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new zh0(0, o2Var))).j();
                }
                ki0Var.D.invalidate();
            }
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
