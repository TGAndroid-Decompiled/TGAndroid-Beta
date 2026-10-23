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
public final class ci0 implements org.telegram.ui.Components.cl0 {
    public final org.telegram.ui.ActionBar.n2 f35994a;
    public final mi0 f35995b;

    public ci0(mi0 mi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35995b = mi0Var;
        this.f35994a = n2Var;
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
            mi0 mi0Var = this.f35995b;
            ai0 ai0Var = mi0Var.f39265d0;
            yh0 yh0Var = mi0Var.Z;
            int i10 = mi0Var.f39263c;
            if (ai0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = mi0Var.P;
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
                            org.telegram.ui.Cells.u1 u1Var2 = mi0Var.P;
                            j10 = j11;
                            MessageObject.GroupedMessages k10 = mi0Var.k(messageObject);
                            if (mi0Var.M.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, k10, z15, false, false, false);
                            ai0 ai0Var2 = mi0Var.f39265d0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            ai0Var2.setSelectedReactionAnimated(i1Var3);
                            if (mi0Var.f39265d0.getReactionsWindow() != null && mi0Var.f39265d0.getReactionsWindow().f877m != null) {
                                ah.n0 n0Var = mi0Var.f39265d0.getReactionsWindow().f877m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                mi0Var.f39265d0.getReactionsWindow().f868a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        yh0Var.c();
                        if (!z14) {
                            yh0Var.n(mi0Var.P, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        zh0 zh0Var = mi0Var.W;
                        if (zh0Var != null) {
                            zh0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        mi0Var.l(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (mi0Var.f39273k0 != null) {
                    long j13 = i1Var4.f782c;
                    if (j13 == mi0Var.H) {
                        mi0Var.H = 0L;
                        z13 = true;
                    } else {
                        mi0Var.H = j13;
                        z13 = false;
                    }
                    zh0 zh0Var2 = mi0Var.W;
                    if (zh0Var2 != null) {
                        zh0Var2.setEffect(mi0Var.H);
                    }
                    mi0Var.l(mi0Var.H);
                    if (!z12) {
                        if (mi0Var.H == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(mi0Var.H);
                        }
                        org.telegram.ui.Components.p5 p5Var = mi0Var.I;
                        if (p5Var != null) {
                            if (mi0Var.H != 0 && effect != null) {
                                p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                p5Var.g(null, true);
                            }
                        }
                        ai0 ai0Var3 = mi0Var.f39265d0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        ai0Var3.setSelectedReactionAnimated(i1Var2);
                        if (mi0Var.f39265d0.getReactionsWindow() != null && mi0Var.f39265d0.getReactionsWindow().f877m != null) {
                            ah.n0 n0Var2 = mi0Var.f39265d0.getReactionsWindow().f877m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            mi0Var.f39265d0.getReactionsWindow().f868a.invalidate();
                        }
                    }
                    yh0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = mi0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        mi0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f35994a) != null) {
                    new org.telegram.ui.Components.xc(mi0Var.F, mi0Var.f39261b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new bi0(0, n2Var))).j();
                }
                mi0Var.G.invalidate();
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
