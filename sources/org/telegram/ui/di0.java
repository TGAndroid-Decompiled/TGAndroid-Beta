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
public final class di0 implements org.telegram.ui.Components.bl0 {
    public final org.telegram.ui.ActionBar.n2 f36208a;
    public final ni0 f36209b;

    public di0(ni0 ni0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f36209b = ni0Var;
        this.f36208a = n2Var;
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
            ni0 ni0Var = this.f36209b;
            bi0 bi0Var = ni0Var.f39455e0;
            zh0 zh0Var = ni0Var.f39449a0;
            int i10 = ni0Var.f39452c;
            if (bi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = ni0Var.Q;
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
                            org.telegram.ui.Cells.u1 u1Var2 = ni0Var.Q;
                            j10 = j11;
                            MessageObject.GroupedMessages l4 = ni0Var.l(messageObject);
                            if (ni0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            bi0 bi0Var2 = ni0Var.f39455e0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            bi0Var2.setSelectedReactionAnimated(i1Var3);
                            if (ni0Var.f39455e0.getReactionsWindow() != null && ni0Var.f39455e0.getReactionsWindow().f879m != null) {
                                ah.n0 n0Var = ni0Var.f39455e0.getReactionsWindow().f879m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                ni0Var.f39455e0.getReactionsWindow().f870a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        zh0Var.c();
                        if (!z14) {
                            zh0Var.n(ni0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ai0 ai0Var = ni0Var.X;
                        if (ai0Var != null) {
                            ai0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        ni0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (ni0Var.f39463l0 != null) {
                    long j13 = i1Var4.f784c;
                    if (j13 == ni0Var.I) {
                        ni0Var.I = 0L;
                        z13 = true;
                    } else {
                        ni0Var.I = j13;
                        z13 = false;
                    }
                    ai0 ai0Var2 = ni0Var.X;
                    if (ai0Var2 != null) {
                        ai0Var2.setEffect(ni0Var.I);
                    }
                    ni0Var.m(ni0Var.I);
                    if (!z12) {
                        if (ni0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(ni0Var.I);
                        }
                        org.telegram.ui.Components.p5 p5Var = ni0Var.J;
                        if (p5Var != null) {
                            if (ni0Var.I != 0 && effect != null) {
                                p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                p5Var.g(null, true);
                            }
                        }
                        bi0 bi0Var3 = ni0Var.f39455e0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        bi0Var3.setSelectedReactionAnimated(i1Var2);
                        if (ni0Var.f39455e0.getReactionsWindow() != null && ni0Var.f39455e0.getReactionsWindow().f879m != null) {
                            ah.n0 n0Var2 = ni0Var.f39455e0.getReactionsWindow().f879m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            ni0Var.f39455e0.getReactionsWindow().f870a.invalidate();
                        }
                    }
                    zh0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = ni0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ni0Var.f39449a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f36208a) != null) {
                    new org.telegram.ui.Components.xc(ni0Var.G, ni0Var.f39450b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ci0(0, n2Var))).j();
                }
                ni0Var.H.invalidate();
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
