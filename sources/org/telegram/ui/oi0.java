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
public final class oi0 implements org.telegram.ui.Components.rk0 {
    public final org.telegram.ui.ActionBar.o2 f36215a;
    public final yi0 f36216b;

    public oi0(yi0 yi0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36216b = yi0Var;
        this.f36215a = o2Var;
    }

    @Override
    public final void i(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.p0 p0Var2;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.p0 p0Var3;
        zg.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            yi0 yi0Var = this.f36216b;
            mi0 mi0Var = yi0Var.f40228e0;
            ki0 ki0Var = yi0Var.f40222a0;
            int i10 = yi0Var.f40225c;
            if (mi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = yi0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = p0Var4.f49443c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = yi0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = yi0Var.l(messageObject);
                            if (yi0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            mi0 mi0Var2 = yi0Var.f40228e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            mi0Var2.setSelectedReactionAnimated(p0Var3);
                            if (yi0Var.f40228e0.getReactionsWindow() != null && yi0Var.f40228e0.getReactionsWindow().f49308m != null) {
                                zg.y yVar = yi0Var.f40228e0.getReactionsWindow().f49308m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                yVar.setSelectedReaction(p0Var4);
                                yi0Var.f40228e0.getReactionsWindow().f49299a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        ki0Var.c();
                        if (!z14) {
                            ki0Var.o(yi0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        li0 li0Var = yi0Var.X;
                        if (li0Var != null) {
                            li0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        yi0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (yi0Var.f40236l0 != null) {
                    long j12 = p0Var4.f49443c;
                    if (j12 == yi0Var.I) {
                        yi0Var.I = 0L;
                        z13 = true;
                    } else {
                        yi0Var.I = j12;
                        z13 = false;
                    }
                    li0 li0Var2 = yi0Var.X;
                    if (li0Var2 != null) {
                        li0Var2.setEffect(yi0Var.I);
                    }
                    yi0Var.m(yi0Var.I);
                    if (!z12) {
                        if (yi0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(yi0Var.I);
                        }
                        org.telegram.ui.Components.o5 o5Var = yi0Var.J;
                        if (o5Var != null) {
                            if (yi0Var.I != 0 && effect != null) {
                                o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                o5Var.g(null, true);
                            }
                        }
                        mi0 mi0Var3 = yi0Var.f40228e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        mi0Var3.setSelectedReactionAnimated(p0Var2);
                        if (yi0Var.f40228e0.getReactionsWindow() != null && yi0Var.f40228e0.getReactionsWindow().f49308m != null) {
                            zg.y yVar2 = yi0Var.f40228e0.getReactionsWindow().f49308m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            yVar2.setSelectedReaction(p0Var4);
                            yi0Var.f40228e0.getReactionsWindow().f49299a.invalidate();
                        }
                    }
                    ki0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = yi0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        yi0Var.f40222a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (o2Var = this.f36215a) != null) {
                    new org.telegram.ui.Components.xc(yi0Var.G, yi0Var.f40223b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ni0(0, o2Var))).j();
                }
                yi0Var.H.invalidate();
            }
        }
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
    public final boolean t() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
