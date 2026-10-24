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
public final class fi0 implements org.telegram.ui.Components.el0 {
    public final org.telegram.ui.ActionBar.o2 f37341a;
    public final pi0 f37342b;

    public fi0(pi0 pi0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f37342b = pi0Var;
        this.f37341a = o2Var;
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
            pi0 pi0Var = this.f37342b;
            di0 di0Var = pi0Var.f40555d0;
            bi0 bi0Var = pi0Var.Z;
            int i10 = pi0Var.f40553c;
            if (di0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && i1Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = pi0Var.P;
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
                            org.telegram.ui.Cells.t1 t1Var2 = pi0Var.P;
                            j10 = j11;
                            MessageObject.GroupedMessages k10 = pi0Var.k(messageObject);
                            if (pi0Var.M.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.W3(messageObject, k10, z15, false, false, false);
                            di0 di0Var2 = pi0Var.f40555d0;
                            if (z14) {
                                i1Var3 = null;
                            } else {
                                i1Var3 = i1Var4;
                            }
                            di0Var2.setSelectedReactionAnimated(i1Var3);
                            if (pi0Var.f40555d0.getReactionsWindow() != null && pi0Var.f40555d0.getReactionsWindow().f878m != null) {
                                ah.n0 n0Var = pi0Var.f40555d0.getReactionsWindow().f878m;
                                if (z14) {
                                    i1Var4 = null;
                                }
                                n0Var.setSelectedReaction(i1Var4);
                                pi0Var.f40555d0.getReactionsWindow().f869a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        bi0Var.c();
                        if (!z14) {
                            bi0Var.n(pi0Var.P, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ci0 ci0Var = pi0Var.W;
                        if (ci0Var != null) {
                            ci0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        pi0Var.l(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (pi0Var.f40563k0 != null) {
                    long j13 = i1Var4.f783c;
                    if (j13 == pi0Var.H) {
                        pi0Var.H = 0L;
                        z13 = true;
                    } else {
                        pi0Var.H = j13;
                        z13 = false;
                    }
                    ci0 ci0Var2 = pi0Var.W;
                    if (ci0Var2 != null) {
                        ci0Var2.setEffect(pi0Var.H);
                    }
                    pi0Var.l(pi0Var.H);
                    if (!z12) {
                        if (pi0Var.H == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(pi0Var.H);
                        }
                        org.telegram.ui.Components.n5 n5Var = pi0Var.I;
                        if (n5Var != null) {
                            if (pi0Var.H != 0 && effect != null) {
                                n5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                n5Var.g(null, true);
                            }
                        }
                        di0 di0Var3 = pi0Var.f40555d0;
                        if (z13) {
                            i1Var2 = null;
                        } else {
                            i1Var2 = i1Var4;
                        }
                        di0Var3.setSelectedReactionAnimated(i1Var2);
                        if (pi0Var.f40555d0.getReactionsWindow() != null && pi0Var.f40555d0.getReactionsWindow().f878m != null) {
                            ah.n0 n0Var2 = pi0Var.f40555d0.getReactionsWindow().f878m;
                            if (z13) {
                                i1Var4 = null;
                            }
                            n0Var2.setSelectedReaction(i1Var4);
                            pi0Var.f40555d0.getReactionsWindow().f869a.invalidate();
                        }
                    }
                    bi0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = pi0Var.H;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        pi0Var.Z.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (o2Var = this.f37341a) != null) {
                    new org.telegram.ui.Components.vc(pi0Var.F, pi0Var.f40551b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ei0(0, o2Var))).j();
                }
                pi0Var.G.invalidate();
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
