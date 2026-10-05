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
public final class pi0 implements org.telegram.ui.Components.rk0 {
    public final org.telegram.ui.ActionBar.n2 f39595a;
    public final zi0 f39596b;

    public pi0(zi0 zi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39596b = zi0Var;
        this.f39595a = n2Var;
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.m0 m0Var2;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.m0 m0Var3;
        zg.m0 m0Var4 = m0Var;
        if (m0Var4 != null) {
            zi0 zi0Var = this.f39596b;
            ni0 ni0Var = zi0Var.f43810e0;
            li0 li0Var = zi0Var.f43803a0;
            int i10 = zi0Var.f43806c;
            if (ni0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && m0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = zi0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = m0Var4.f53469c;
                        if (j11 == j10) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z14 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j11;
                            z14 = false;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.u1 u1Var2 = zi0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = zi0Var.l(messageObject);
                            if (zi0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            ni0 ni0Var2 = zi0Var.f43810e0;
                            if (z14) {
                                m0Var3 = null;
                            } else {
                                m0Var3 = m0Var4;
                            }
                            ni0Var2.setSelectedReactionAnimated(m0Var3);
                            if (zi0Var.f43810e0.getReactionsWindow() != null && zi0Var.f43810e0.getReactionsWindow().f53560m != null) {
                                zg.v vVar = zi0Var.f43810e0.getReactionsWindow().f53560m;
                                if (z14) {
                                    m0Var4 = null;
                                }
                                vVar.setSelectedReaction(m0Var4);
                                zi0Var.f43810e0.getReactionsWindow().f53550a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        li0Var.c();
                        if (!z14) {
                            li0Var.o(zi0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        mi0 mi0Var = zi0Var.X;
                        if (mi0Var != null) {
                            mi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        zi0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (zi0Var.f43818l0 != null) {
                    long j12 = m0Var4.f53469c;
                    if (j12 == zi0Var.I) {
                        zi0Var.I = 0L;
                        z13 = true;
                    } else {
                        zi0Var.I = j12;
                        z13 = false;
                    }
                    mi0 mi0Var2 = zi0Var.X;
                    if (mi0Var2 != null) {
                        mi0Var2.setEffect(zi0Var.I);
                    }
                    zi0Var.m(zi0Var.I);
                    if (!z12) {
                        if (zi0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(zi0Var.I);
                        }
                        org.telegram.ui.Components.o5 o5Var = zi0Var.J;
                        if (o5Var != null) {
                            if (zi0Var.I != 0 && effect != null) {
                                o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                o5Var.g(null, true);
                            }
                        }
                        ni0 ni0Var3 = zi0Var.f43810e0;
                        if (z13) {
                            m0Var2 = null;
                        } else {
                            m0Var2 = m0Var4;
                        }
                        ni0Var3.setSelectedReactionAnimated(m0Var2);
                        if (zi0Var.f43810e0.getReactionsWindow() != null && zi0Var.f43810e0.getReactionsWindow().f53560m != null) {
                            zg.v vVar2 = zi0Var.f43810e0.getReactionsWindow().f53560m;
                            if (z13) {
                                m0Var4 = null;
                            }
                            vVar2.setSelectedReaction(m0Var4);
                            zi0Var.f43810e0.getReactionsWindow().f53550a.invalidate();
                        }
                    }
                    li0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = zi0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        zi0Var.f43803a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f39595a) != null) {
                    new org.telegram.ui.Components.yc(zi0Var.G, zi0Var.f43804b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new oi0(0, n2Var))).j();
                }
                zi0Var.H.invalidate();
            }
        }
    }

    @Override
    public final void I() {
    }

    @Override
    public final void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
