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
public final class mi0 implements org.telegram.ui.Components.fk0 {
    public final org.telegram.ui.ActionBar.n2 f35298a;
    public final wi0 f35299b;

    public mi0(wi0 wi0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35299b = wi0Var;
        this.f35298a = n2Var;
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.p0 p0Var2;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.p0 p0Var3;
        zg.p0 p0Var4 = p0Var;
        if (p0Var4 != null) {
            wi0 wi0Var = this.f35299b;
            ki0 ki0Var = wi0Var.f39003e0;
            ii0 ii0Var = wi0Var.f38997a0;
            int i10 = wi0Var.f39000c;
            if (ki0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && p0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = wi0Var.Q;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = p0Var4.f49070c;
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
                            org.telegram.ui.Cells.t1 t1Var2 = wi0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = wi0Var.l(messageObject);
                            if (wi0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.X3(messageObject, l4, z15, false, false, false);
                            ki0 ki0Var2 = wi0Var.f39003e0;
                            if (z14) {
                                p0Var3 = null;
                            } else {
                                p0Var3 = p0Var4;
                            }
                            ki0Var2.setSelectedReactionAnimated(p0Var3);
                            if (wi0Var.f39003e0.getReactionsWindow() != null && wi0Var.f39003e0.getReactionsWindow().f48936m != null) {
                                zg.y yVar = wi0Var.f39003e0.getReactionsWindow().f48936m;
                                if (z14) {
                                    p0Var4 = null;
                                }
                                yVar.setSelectedReaction(p0Var4);
                                wi0Var.f39003e0.getReactionsWindow().f48927a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        ii0Var.c();
                        if (!z14) {
                            ii0Var.o(wi0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ji0 ji0Var = wi0Var.X;
                        if (ji0Var != null) {
                            ji0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        wi0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (wi0Var.f39011l0 != null) {
                    long j12 = p0Var4.f49070c;
                    if (j12 == wi0Var.I) {
                        wi0Var.I = 0L;
                        z13 = true;
                    } else {
                        wi0Var.I = j12;
                        z13 = false;
                    }
                    ji0 ji0Var2 = wi0Var.X;
                    if (ji0Var2 != null) {
                        ji0Var2.setEffect(wi0Var.I);
                    }
                    wi0Var.m(wi0Var.I);
                    if (!z12) {
                        if (wi0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(wi0Var.I);
                        }
                        org.telegram.ui.Components.o5 o5Var = wi0Var.J;
                        if (o5Var != null) {
                            if (wi0Var.I != 0 && effect != null) {
                                o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                o5Var.g(null, true);
                            }
                        }
                        ki0 ki0Var3 = wi0Var.f39003e0;
                        if (z13) {
                            p0Var2 = null;
                        } else {
                            p0Var2 = p0Var4;
                        }
                        ki0Var3.setSelectedReactionAnimated(p0Var2);
                        if (wi0Var.f39003e0.getReactionsWindow() != null && wi0Var.f39003e0.getReactionsWindow().f48936m != null) {
                            zg.y yVar2 = wi0Var.f39003e0.getReactionsWindow().f48936m;
                            if (z13) {
                                p0Var4 = null;
                            }
                            yVar2.setSelectedReaction(p0Var4);
                            wi0Var.f39003e0.getReactionsWindow().f48927a.invalidate();
                        }
                    }
                    ii0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = wi0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        wi0Var.f38997a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (n2Var = this.f35298a) != null) {
                    new org.telegram.ui.Components.xc(wi0Var.G, wi0Var.f38998b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new li0(0, n2Var))).j();
                }
                wi0Var.H.invalidate();
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
    public final boolean q() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
