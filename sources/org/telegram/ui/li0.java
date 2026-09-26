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
public final class li0 implements org.telegram.ui.Components.qk0 {
    public final org.telegram.ui.ActionBar.m2 f35365a;
    public final vi0 f35366b;

    public li0(vi0 vi0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f35366b = vi0Var;
        this.f35365a = m2Var;
    }

    @Override
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        zg.o0 o0Var2;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z14;
        long j3;
        boolean z15;
        zg.o0 o0Var3;
        zg.o0 o0Var4 = o0Var;
        if (o0Var4 != null) {
            vi0 vi0Var = this.f35366b;
            ji0 ji0Var = vi0Var.f38732e0;
            hi0 hi0Var = vi0Var.f38726a0;
            int i10 = vi0Var.f38729c;
            if (ji0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && o0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.u1 u1Var = vi0Var.Q;
                if (u1Var != null) {
                    MessageObject messageObject = u1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j10 = message.effect;
                        long j11 = o0Var4.f49394c;
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
                            org.telegram.ui.Cells.u1 u1Var2 = vi0Var.Q;
                            j3 = j10;
                            MessageObject.GroupedMessages l4 = vi0Var.l(messageObject);
                            if (vi0Var.N.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            u1Var2.X3(messageObject, l4, z15, false, false, false);
                            ji0 ji0Var2 = vi0Var.f38732e0;
                            if (z14) {
                                o0Var3 = null;
                            } else {
                                o0Var3 = o0Var4;
                            }
                            ji0Var2.setSelectedReactionAnimated(o0Var3);
                            if (vi0Var.f38732e0.getReactionsWindow() != null && vi0Var.f38732e0.getReactionsWindow().f49253m != null) {
                                zg.x xVar = vi0Var.f38732e0.getReactionsWindow().f49253m;
                                if (z14) {
                                    o0Var4 = null;
                                }
                                xVar.setSelectedReaction(o0Var4);
                                vi0Var.f38732e0.getReactionsWindow().f49244a.invalidate();
                            }
                        } else {
                            j3 = j10;
                        }
                        hi0Var.c();
                        if (!z14) {
                            hi0Var.o(vi0Var.Q, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j3;
                            if (j3 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        ii0 ii0Var = vi0Var.X;
                        if (ii0Var != null) {
                            ii0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        vi0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (vi0Var.f38740l0 != null) {
                    long j12 = o0Var4.f49394c;
                    if (j12 == vi0Var.I) {
                        vi0Var.I = 0L;
                        z13 = true;
                    } else {
                        vi0Var.I = j12;
                        z13 = false;
                    }
                    ii0 ii0Var2 = vi0Var.X;
                    if (ii0Var2 != null) {
                        ii0Var2.setEffect(vi0Var.I);
                    }
                    vi0Var.m(vi0Var.I);
                    if (!z12) {
                        if (vi0Var.I == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(vi0Var.I);
                        }
                        org.telegram.ui.Components.o5 o5Var = vi0Var.J;
                        if (o5Var != null) {
                            if (vi0Var.I != 0 && effect != null) {
                                o5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                o5Var.g(null, true);
                            }
                        }
                        ji0 ji0Var3 = vi0Var.f38732e0;
                        if (z13) {
                            o0Var2 = null;
                        } else {
                            o0Var2 = o0Var4;
                        }
                        ji0Var3.setSelectedReactionAnimated(o0Var2);
                        if (vi0Var.f38732e0.getReactionsWindow() != null && vi0Var.f38732e0.getReactionsWindow().f49253m != null) {
                            zg.x xVar2 = vi0Var.f38732e0.getReactionsWindow().f49253m;
                            if (z13) {
                                o0Var4 = null;
                            }
                            xVar2.setSelectedReaction(o0Var4);
                            vi0Var.f38732e0.getReactionsWindow().f49244a.invalidate();
                        }
                    }
                    hi0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j13 = vi0Var.I;
                        tL_message.effect = j13;
                        if (j13 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        vi0Var.f38726a0.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (m2Var = this.f35365a) != null) {
                    new org.telegram.ui.Components.xc(vi0Var.G, vi0Var.f38727b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ki0(0, m2Var))).j();
                }
                vi0Var.H.invalidate();
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
    public final boolean p() {
        return false;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
