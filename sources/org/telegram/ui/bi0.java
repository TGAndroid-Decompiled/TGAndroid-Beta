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
public final class bi0 implements org.telegram.ui.Components.bl0 {
    public final org.telegram.ui.ActionBar.n2 f35661a;
    public final li0 f35662b;

    public bi0(li0 li0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35662b = li0Var;
        this.f35661a = n2Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
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
            li0 li0Var = this.f35662b;
            zh0 zh0Var = li0Var.f38937e0;
            xh0 xh0Var = li0Var.f38931a0;
            int i10 = li0Var.f38934c;
            if (zh0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = li0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = i1Var4.f782c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = li0Var.Q;
                            j10 = j11;
                            MessageObject.GroupedMessages l4 = li0Var.l(messageObject);
                            if (li0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            zh0 zh0Var2 = li0Var.f38937e0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            zh0Var2.setSelectedReactionAnimated(i1Var3);
                            if (li0Var.f38937e0.getReactionsWindow() != null && li0Var.f38937e0.getReactionsWindow().f877m != null) {
                                ah.n0 n0Var = li0Var.f38937e0.getReactionsWindow().f877m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                li0Var.f38937e0.getReactionsWindow().f868a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        xh0Var.c();
                        if (!z14) {
                            xh0Var.n(li0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        yh0 yh0Var = li0Var.X;
                        if (yh0Var != null) {
                            yh0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        li0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (li0Var.f38945l0 != null) {
                    long j13 = i1Var4.f782c;
                    if (j13 == li0Var.I) {
                        li0Var.I = 0L;
                        z13 = true;
                    } else {
                        li0Var.I = j13;
                        z13 = false;
                    }
                    yh0 yh0Var2 = li0Var.X;
                    if (yh0Var2 != null) {
                        yh0Var2.setEffect(li0Var.I);
                    }
                    li0Var.m(li0Var.I);
                    if (!z12) {
                        if (li0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(li0Var.I);
                        }
                        org.telegram.ui.Components.p5 p5Var = li0Var.J;
                        if (p5Var != null) {
                            if (li0Var.I != 0 && effect != null) {
                                p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                p5Var.g(null, true);
                            }
                        }
                        zh0 zh0Var3 = li0Var.f38937e0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        zh0Var3.setSelectedReactionAnimated(i1Var2);
                        if (li0Var.f38937e0.getReactionsWindow() != null && li0Var.f38937e0.getReactionsWindow().f877m != null) {
                            ah.n0 n0Var2 = li0Var.f38937e0.getReactionsWindow().f877m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            li0Var.f38937e0.getReactionsWindow().f868a.invalidate();
                        }
                    }
                    xh0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = li0Var.I;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        li0Var.f38931a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f35661a) != null) {
                    new org.telegram.ui.Components.xc(li0Var.G, li0Var.f38932b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ai0(0, n2Var))).j();
                }
                li0Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void v() {
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
