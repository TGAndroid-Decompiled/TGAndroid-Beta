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
public final class ki0 implements org.telegram.ui.Components.ok0 {
    public final org.telegram.ui.ActionBar.p2 f35544a;
    public final ui0 f35545b;

    public ki0(ui0 ui0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35545b = ui0Var;
        this.f35544a = p2Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
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
            ui0 ui0Var = this.f35545b;
            ii0 ii0Var = ui0Var.f38828b0;
            gi0 gi0Var = ui0Var.X;
            int i10 = ui0Var.f38829c;
            if (ii0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && q0Var4.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Cells.s1 s1Var = ui0Var.N;
                if (s1Var != null) {
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = q0Var4.f14094c;
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
                            org.telegram.ui.Cells.s1 s1Var2 = ui0Var.N;
                            j10 = j11;
                            MessageObject.GroupedMessages l10 = ui0Var.l(messageObject);
                            if (ui0Var.K.size() > 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            s1Var2.X3(messageObject, l10, z14, false, false, false);
                            ii0 ii0Var2 = ui0Var.f38828b0;
                            if (z13) {
                                q0Var3 = null;
                            } else {
                                q0Var3 = q0Var4;
                            }
                            ii0Var2.setSelectedReactionAnimated(q0Var3);
                            if (ui0Var.f38828b0.getReactionsWindow() != null && ui0Var.f38828b0.getReactionsWindow().f13969m != null) {
                                mg.z zVar = ui0Var.f38828b0.getReactionsWindow().f13969m;
                                if (z13) {
                                    q0Var4 = null;
                                }
                                zVar.setSelectedReaction(q0Var4);
                                ui0Var.f38828b0.getReactionsWindow().f13960a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        gi0Var.c();
                        if (!z13) {
                            gi0Var.o(ui0Var.N, 0, false, false);
                        }
                        if (z11) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        hi0 hi0Var = ui0Var.U;
                        if (hi0Var != null) {
                            hi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        ui0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (ui0Var.f38837i0 != null) {
                    long j13 = q0Var4.f14094c;
                    if (j13 == ui0Var.F) {
                        ui0Var.F = 0L;
                        z12 = true;
                    } else {
                        ui0Var.F = j13;
                        z12 = false;
                    }
                    hi0 hi0Var2 = ui0Var.U;
                    if (hi0Var2 != null) {
                        hi0Var2.setEffect(ui0Var.F);
                    }
                    ui0Var.m(ui0Var.F);
                    if (!z11) {
                        if (ui0Var.F == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(ui0Var.F);
                        }
                        org.telegram.ui.Components.j5 j5Var = ui0Var.G;
                        if (j5Var != null) {
                            if (ui0Var.F != 0 && effect != null) {
                                j5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                j5Var.g(null, true);
                            }
                        }
                        ii0 ii0Var3 = ui0Var.f38828b0;
                        if (z12) {
                            q0Var2 = null;
                        } else {
                            q0Var2 = q0Var4;
                        }
                        ii0Var3.setSelectedReactionAnimated(q0Var2);
                        if (ui0Var.f38828b0.getReactionsWindow() != null && ui0Var.f38828b0.getReactionsWindow().f13969m != null) {
                            mg.z zVar2 = ui0Var.f38828b0.getReactionsWindow().f13969m;
                            if (z12) {
                                q0Var4 = null;
                            }
                            zVar2.setSelectedReaction(q0Var4);
                            ui0Var.f38828b0.getReactionsWindow().f13960a.invalidate();
                        }
                    }
                    gi0Var.c();
                    if (!z12) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = ui0Var.F;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ui0Var.X.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z11 && (p2Var = this.f35544a) != null) {
                    new org.telegram.ui.Components.qc(ui0Var.D, ui0Var.f38827b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ji0(0, p2Var))).j();
                }
                ui0Var.E.invalidate();
            }
        }
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
