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
public final class ii0 implements org.telegram.ui.Components.ok0 {
    public final org.telegram.ui.ActionBar.p2 f35126a;
    public final si0 f35127b;

    public ii0(si0 si0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35127b = si0Var;
        this.f35126a = p2Var;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        TLRPC.TL_availableEffect effect;
        mg.q0 q0Var2;
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z13;
        long j10;
        boolean z14;
        mg.q0 q0Var3;
        mg.q0 q0Var4 = q0Var;
        if (q0Var4 != null) {
            si0 si0Var = this.f35127b;
            gi0 gi0Var = si0Var.f38353b0;
            ei0 ei0Var = si0Var.X;
            int i10 = si0Var.f38354c;
            if (gi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && q0Var4.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = si0Var.N;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = q0Var4.f14106c;
                        if (j12 == j11) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z13 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j12;
                            z13 = false;
                        }
                        if (!z11) {
                            org.telegram.ui.Cells.t1 t1Var2 = si0Var.N;
                            j10 = j11;
                            MessageObject.GroupedMessages l10 = si0Var.l(messageObject);
                            if (si0Var.K.size() > 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            t1Var2.X3(messageObject, l10, z14, false, false, false);
                            gi0 gi0Var2 = si0Var.f38353b0;
                            if (z13) {
                                q0Var3 = null;
                            } else {
                                q0Var3 = q0Var4;
                            }
                            gi0Var2.setSelectedReactionAnimated(q0Var3);
                            if (si0Var.f38353b0.getReactionsWindow() != null && si0Var.f38353b0.getReactionsWindow().f13981m != null) {
                                mg.z zVar = si0Var.f38353b0.getReactionsWindow().f13981m;
                                if (z13) {
                                    q0Var4 = null;
                                }
                                zVar.setSelectedReaction(q0Var4);
                                si0Var.f38353b0.getReactionsWindow().f13972a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        ei0Var.c();
                        if (!z13) {
                            ei0Var.o(si0Var.N, 0, false, false);
                        }
                        if (z11) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        fi0 fi0Var = si0Var.U;
                        if (fi0Var != null) {
                            fi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        si0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (si0Var.f38362i0 != null) {
                    long j13 = q0Var4.f14106c;
                    if (j13 == si0Var.F) {
                        si0Var.F = 0L;
                        z12 = true;
                    } else {
                        si0Var.F = j13;
                        z12 = false;
                    }
                    fi0 fi0Var2 = si0Var.U;
                    if (fi0Var2 != null) {
                        fi0Var2.setEffect(si0Var.F);
                    }
                    si0Var.m(si0Var.F);
                    if (!z11) {
                        if (si0Var.F == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(si0Var.F);
                        }
                        org.telegram.ui.Components.j5 j5Var = si0Var.G;
                        if (j5Var != null) {
                            if (si0Var.F != 0 && effect != null) {
                                j5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                j5Var.g(null, true);
                            }
                        }
                        gi0 gi0Var3 = si0Var.f38353b0;
                        if (z12) {
                            q0Var2 = null;
                        } else {
                            q0Var2 = q0Var4;
                        }
                        gi0Var3.setSelectedReactionAnimated(q0Var2);
                        if (si0Var.f38353b0.getReactionsWindow() != null && si0Var.f38353b0.getReactionsWindow().f13981m != null) {
                            mg.z zVar2 = si0Var.f38353b0.getReactionsWindow().f13981m;
                            if (z12) {
                                q0Var4 = null;
                            }
                            zVar2.setSelectedReaction(q0Var4);
                            si0Var.f38353b0.getReactionsWindow().f13972a.invalidate();
                        }
                    }
                    ei0Var.c();
                    if (!z12) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = si0Var.F;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        si0Var.X.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z11 && (p2Var = this.f35126a) != null) {
                    new org.telegram.ui.Components.qc(si0Var.D, si0Var.f38352b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new hi0(0, p2Var))).j();
                }
                si0Var.E.invalidate();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
