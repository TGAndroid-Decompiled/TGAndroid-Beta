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
public final class ei0 implements org.telegram.ui.Components.bl0 {
    public final org.telegram.ui.ActionBar.n2 f36548a;
    public final oi0 f36549b;

    public ei0(oi0 oi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f36549b = oi0Var;
        this.f36548a = n2Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        ah.i1 i1Var2;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z14;
        long j10;
        boolean z15;
        ah.i1 i1Var3;
        ah.i1 i1Var4 = i1Var;
        if (i1Var4 != null) {
            oi0 oi0Var = this.f36549b;
            ci0 ci0Var = oi0Var.f39794e0;
            ai0 ai0Var = oi0Var.f39788a0;
            int i10 = oi0Var.f39791c;
            if (ci0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = oi0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = i1Var4.f784c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = oi0Var.Q;
                            j10 = j11;
                            MessageObject.GroupedMessages l4 = oi0Var.l(messageObject);
                            if (oi0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            ci0 ci0Var2 = oi0Var.f39794e0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            ci0Var2.setSelectedReactionAnimated(i1Var3);
                            if (oi0Var.f39794e0.getReactionsWindow() != null && oi0Var.f39794e0.getReactionsWindow().f879m != null) {
                                ah.n0 n0Var = oi0Var.f39794e0.getReactionsWindow().f879m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                oi0Var.f39794e0.getReactionsWindow().f870a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        ai0Var.c();
                        if (!z14) {
                            ai0Var.n(oi0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        bi0 bi0Var = oi0Var.X;
                        if (bi0Var != null) {
                            bi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        oi0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (oi0Var.f39802l0 != null) {
                    long j13 = i1Var4.f784c;
                    if (j13 == oi0Var.I) {
                        oi0Var.I = 0L;
                        z13 = true;
                    } else {
                        oi0Var.I = j13;
                        z13 = false;
                    }
                    bi0 bi0Var2 = oi0Var.X;
                    if (bi0Var2 != null) {
                        bi0Var2.setEffect(oi0Var.I);
                    }
                    oi0Var.m(oi0Var.I);
                    if (!z12) {
                        if (oi0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(oi0Var.I);
                        }
                        org.telegram.ui.Components.p5 p5Var = oi0Var.J;
                        if (p5Var != null) {
                            if (oi0Var.I != 0 && effect != null) {
                                p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                p5Var.g(null, true);
                            }
                        }
                        ci0 ci0Var3 = oi0Var.f39794e0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        ci0Var3.setSelectedReactionAnimated(i1Var2);
                        if (oi0Var.f39794e0.getReactionsWindow() != null && oi0Var.f39794e0.getReactionsWindow().f879m != null) {
                            ah.n0 n0Var2 = oi0Var.f39794e0.getReactionsWindow().f879m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            oi0Var.f39794e0.getReactionsWindow().f870a.invalidate();
                        }
                    }
                    ai0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = oi0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        oi0Var.f39788a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f36548a) != null) {
                    new org.telegram.ui.Components.xc(oi0Var.G, oi0Var.f39789b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new di0(0, n2Var))).j();
                }
                oi0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void q() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
