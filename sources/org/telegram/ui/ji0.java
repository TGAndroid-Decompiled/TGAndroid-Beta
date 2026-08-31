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
public final class ji0 implements org.telegram.ui.Components.qk0 {
    public final org.telegram.ui.ActionBar.p2 f38167a;
    public final ti0 f38168b;

    public ji0(ti0 ti0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f38168b = ti0Var;
        this.f38167a = p2Var;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        TLRPC.TL_availableEffect effect;
        ng.q0 q0Var2;
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z13;
        long j10;
        boolean z14;
        ng.q0 q0Var3;
        ng.q0 q0Var4 = q0Var;
        if (q0Var4 != null) {
            ti0 ti0Var = this.f38168b;
            hi0 hi0Var = ti0Var.f41627b0;
            fi0 fi0Var = ti0Var.X;
            int i10 = ti0Var.f41628c;
            if (hi0Var != null) {
                if (!UserConfig.getInstance(i10).isPremium() && q0Var4.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = ti0Var.N;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = q0Var4.f16176c;
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
                            org.telegram.ui.Cells.t1 t1Var2 = ti0Var.N;
                            j10 = j11;
                            MessageObject.GroupedMessages l10 = ti0Var.l(messageObject);
                            if (ti0Var.K.size() > 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            t1Var2.X3(messageObject, l10, z14, false, false, false);
                            hi0 hi0Var2 = ti0Var.f41627b0;
                            if (z13) {
                                q0Var3 = null;
                            } else {
                                q0Var3 = q0Var4;
                            }
                            hi0Var2.setSelectedReactionAnimated(q0Var3);
                            if (ti0Var.f41627b0.getReactionsWindow() != null && ti0Var.f41627b0.getReactionsWindow().f16043m != null) {
                                ng.z zVar = ti0Var.f41627b0.getReactionsWindow().f16043m;
                                if (z13) {
                                    q0Var4 = null;
                                }
                                zVar.setSelectedReaction(q0Var4);
                                ti0Var.f41627b0.getReactionsWindow().f16033a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        fi0Var.c();
                        if (!z13) {
                            fi0Var.o(ti0Var.N, 0, false, false);
                        }
                        if (z11) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        gi0 gi0Var = ti0Var.U;
                        if (gi0Var != null) {
                            gi0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        ti0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (ti0Var.f41637i0 != null) {
                    long j13 = q0Var4.f16176c;
                    if (j13 == ti0Var.F) {
                        ti0Var.F = 0L;
                        z12 = true;
                    } else {
                        ti0Var.F = j13;
                        z12 = false;
                    }
                    gi0 gi0Var2 = ti0Var.U;
                    if (gi0Var2 != null) {
                        gi0Var2.setEffect(ti0Var.F);
                    }
                    ti0Var.m(ti0Var.F);
                    if (!z11) {
                        if (ti0Var.F == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i10).getEffect(ti0Var.F);
                        }
                        org.telegram.ui.Components.j5 j5Var = ti0Var.G;
                        if (j5Var != null) {
                            if (ti0Var.F != 0 && effect != null) {
                                j5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                j5Var.g(null, true);
                            }
                        }
                        hi0 hi0Var3 = ti0Var.f41627b0;
                        if (z12) {
                            q0Var2 = null;
                        } else {
                            q0Var2 = q0Var4;
                        }
                        hi0Var3.setSelectedReactionAnimated(q0Var2);
                        if (ti0Var.f41627b0.getReactionsWindow() != null && ti0Var.f41627b0.getReactionsWindow().f16043m != null) {
                            ng.z zVar2 = ti0Var.f41627b0.getReactionsWindow().f16043m;
                            if (z12) {
                                q0Var4 = null;
                            }
                            zVar2.setSelectedReaction(q0Var4);
                            ti0Var.f41627b0.getReactionsWindow().f16033a.invalidate();
                        }
                    }
                    fi0Var.c();
                    if (!z12) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = ti0Var.F;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        ti0Var.X.d(null, 0, null, new MessageObject(i10, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z11 && (p2Var = this.f38167a) != null) {
                    new org.telegram.ui.Components.qc(ti0Var.D, ti0Var.f41626b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ii0(0, p2Var))).j();
                }
                ti0Var.E.invalidate();
            }
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
