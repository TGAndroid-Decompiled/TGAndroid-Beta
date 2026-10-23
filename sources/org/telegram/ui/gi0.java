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
public final class gi0 implements org.telegram.ui.Components.fl0 {
    public final org.telegram.ui.ActionBar.o2 f37609a;
    public final qi0 f37610b;

    public gi0(qi0 qi0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f37610b = qi0Var;
        this.f37609a = o2Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        ah.i1 i1Var2;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z14;
        long j10;
        boolean z15;
        ah.i1 i1Var3;
        ah.i1 i1Var4 = i1Var;
        if (i1Var4 != null) {
            qi0 qi0Var = this.f37610b;
            ei0 ei0Var = qi0Var.f40824d0;
            ci0 ci0Var = qi0Var.Z;
            int i10 = qi0Var.f40822c;
            if (ei0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = qi0Var.P;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = i1Var4.f783c;
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
                            org.telegram.ui.Cells.t1 t1Var2 = qi0Var.P;
                            j10 = j11;
                            MessageObject.GroupedMessages k10 = qi0Var.k(messageObject);
                            if (qi0Var.M.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.W3(messageObject, k10, z15, false, false, false);
                            ei0 ei0Var2 = qi0Var.f40824d0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            ei0Var2.setSelectedReactionAnimated(i1Var3);
                            if (qi0Var.f40824d0.getReactionsWindow() != null && qi0Var.f40824d0.getReactionsWindow().f878m != null) {
                                ah.n0 n0Var = qi0Var.f40824d0.getReactionsWindow().f878m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                qi0Var.f40824d0.getReactionsWindow().f869a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        ci0Var.c();
                        if (!z14) {
                            ci0Var.n(qi0Var.P, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        di0 di0Var = qi0Var.W;
                        if (di0Var != null) {
                            di0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        qi0Var.l(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (qi0Var.f40832k0 != null) {
                    long j13 = i1Var4.f783c;
                    if (j13 == qi0Var.H) {
                        qi0Var.H = 0L;
                        z13 = true;
                    } else {
                        qi0Var.H = j13;
                        z13 = false;
                    }
                    di0 di0Var2 = qi0Var.W;
                    if (di0Var2 != null) {
                        di0Var2.setEffect(qi0Var.H);
                    }
                    qi0Var.l(qi0Var.H);
                    if (!z12) {
                        if (qi0Var.H == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(qi0Var.H);
                        }
                        org.telegram.ui.Components.p5 p5Var = qi0Var.I;
                        if (p5Var != null) {
                            if (qi0Var.H != 0 && effect != null) {
                                p5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                p5Var.g(null, true);
                            }
                        }
                        ei0 ei0Var3 = qi0Var.f40824d0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        ei0Var3.setSelectedReactionAnimated(i1Var2);
                        if (qi0Var.f40824d0.getReactionsWindow() != null && qi0Var.f40824d0.getReactionsWindow().f878m != null) {
                            ah.n0 n0Var2 = qi0Var.f40824d0.getReactionsWindow().f878m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            qi0Var.f40824d0.getReactionsWindow().f869a.invalidate();
                        }
                    }
                    ci0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = qi0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        qi0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (o2Var = this.f37609a) != null) {
                    new org.telegram.ui.Components.xc(qi0Var.F, qi0Var.f40820b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new fi0(0, o2Var))).j();
                }
                qi0Var.G.invalidate();
            }
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void u() {
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
