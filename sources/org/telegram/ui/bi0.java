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
public final class bi0 implements org.telegram.ui.Components.tj0 {
    public final org.telegram.ui.ActionBar.o2 f36865a;
    public final li0 f36866b;

    public bi0(li0 li0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36866b = li0Var;
        this.f36865a = o2Var;
    }

    @Override
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        TLRPC.TL_availableEffect effect;
        hg.r0 r0Var2;
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z14;
        long j10;
        boolean z15;
        hg.r0 r0Var3;
        hg.r0 r0Var4 = r0Var;
        if (r0Var4 != null) {
            li0 li0Var = this.f36866b;
            zh0 zh0Var = li0Var.f40148a0;
            xh0 xh0Var = li0Var.W;
            int i9 = li0Var.f40151c;
            if (zh0Var != null) {
                if (!UserConfig.getInstance(i9).isPremium() && r0Var4.d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.ui.Cells.t1 t1Var = li0Var.M;
                if (t1Var != null) {
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        long j11 = message.effect;
                        long j12 = r0Var4.f10715c;
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
                            org.telegram.ui.Cells.t1 t1Var2 = li0Var.M;
                            j10 = j11;
                            MessageObject.GroupedMessages l10 = li0Var.l(messageObject);
                            if (li0Var.J.size() > 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            t1Var2.X3(messageObject, l10, z15, false, false, false);
                            zh0 zh0Var2 = li0Var.f40148a0;
                            if (z14) {
                                r0Var3 = null;
                            } else {
                                r0Var3 = r0Var4;
                            }
                            zh0Var2.setSelectedReactionAnimated(r0Var3);
                            if (li0Var.f40148a0.getReactionsWindow() != null && li0Var.f40148a0.getReactionsWindow().f10584m != null) {
                                hg.z zVar = li0Var.f40148a0.getReactionsWindow().f10584m;
                                if (z14) {
                                    r0Var4 = null;
                                }
                                zVar.setSelectedReaction(r0Var4);
                                li0Var.f40148a0.getReactionsWindow().f10574a.invalidate();
                            }
                        } else {
                            j10 = j11;
                        }
                        xh0Var.c();
                        if (!z14) {
                            xh0Var.o(li0Var.M, 0, false, false);
                        }
                        if (z12) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j10;
                            if (j10 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        yh0 yh0Var = li0Var.T;
                        if (yh0Var != null) {
                            yh0Var.setEffect(messageObject.messageOwner.effect);
                        }
                        li0Var.m(messageObject.messageOwner.effect);
                    } else {
                        return;
                    }
                } else if (li0Var.f40159h0 != null) {
                    long j13 = r0Var4.f10715c;
                    if (j13 == li0Var.E) {
                        li0Var.E = 0L;
                        z13 = true;
                    } else {
                        li0Var.E = j13;
                        z13 = false;
                    }
                    yh0 yh0Var2 = li0Var.T;
                    if (yh0Var2 != null) {
                        yh0Var2.setEffect(li0Var.E);
                    }
                    li0Var.m(li0Var.E);
                    if (!z12) {
                        if (li0Var.E == 0) {
                            effect = null;
                        } else {
                            effect = MessagesController.getInstance(i9).getEffect(li0Var.E);
                        }
                        org.telegram.ui.Components.i5 i5Var = li0Var.F;
                        if (i5Var != null) {
                            if (li0Var.E != 0 && effect != null) {
                                i5Var.g(Emoji.getEmojiDrawable(effect.emoticon), true);
                            } else {
                                i5Var.g(null, true);
                            }
                        }
                        zh0 zh0Var3 = li0Var.f40148a0;
                        if (z13) {
                            r0Var2 = null;
                        } else {
                            r0Var2 = r0Var4;
                        }
                        zh0Var3.setSelectedReactionAnimated(r0Var2);
                        if (li0Var.f40148a0.getReactionsWindow() != null && li0Var.f40148a0.getReactionsWindow().f10584m != null) {
                            hg.z zVar2 = li0Var.f40148a0.getReactionsWindow().f10584m;
                            if (z13) {
                                r0Var4 = null;
                            }
                            zVar2.setSelectedReaction(r0Var4);
                            li0Var.f40148a0.getReactionsWindow().f10574a.invalidate();
                        }
                    }
                    xh0Var.c();
                    if (!z13) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j14 = li0Var.E;
                        tL_message.effect = j14;
                        if (j14 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        li0Var.W.d(null, 0, null, new MessageObject(i9, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z12 && (o2Var = this.f36865a) != null) {
                    new org.telegram.ui.Components.oc(li0Var.C, li0Var.f40149b).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new ai0(0, o2Var))).j();
                }
                li0Var.D.invalidate();
            }
        }
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void t() {
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
