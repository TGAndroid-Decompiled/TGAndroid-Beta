package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class qb implements org.telegram.ui.Components.mk0 {
    public final int f41737a = 1;
    public final long f41738b;
    public final Context f41739c;
    public final KeyEvent.Callback d;
    public final Object f41740e;
    public final Object f41741f;

    public qb(xb xbVar, Context context, long j10, org.telegram.ui.ActionBar.b6 b6Var, s91 s91Var) {
        this.d = xbVar;
        this.f41739c = context;
        this.f41738b = j10;
        this.f41740e = b6Var;
        this.f41741f = s91Var;
    }

    @Override
    public final void a(int i9, View view) {
        switch (this.f41737a) {
            case 0:
                xb xbVar = (xb) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f41740e;
                s91 s91Var = (s91) this.f41741f;
                boolean z10 = view instanceof gg.b;
                long j10 = this.f41738b;
                boolean z11 = false;
                if (z10) {
                    gg.b bVar = (gg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        gh.oa.e1(this.f41739c, xbVar.f44446b, j10, boost, b6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(s91Var.getParentActivity(), s91Var.getResourceProvider());
                                obVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                obVar.f31343b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                obVar.f31343b.setSingleLine(false);
                                obVar.f31343b.setMaxLines(2);
                                org.telegram.ui.Components.gc.g(s91Var, obVar, 2750).j();
                            } else if (!z13 && !z12) {
                                s91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-xbVar.F.f22380id);
                            int i10 = boost.date;
                            tL_payments_checkedGiftCode.date = i10;
                            tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                            int i11 = boost.expires - i10;
                            tL_payments_checkedGiftCode.days = i11 / 86400;
                            tL_payments_checkedGiftCode.months = (i11 / 30) / 86400;
                            if (boost.unclaimed) {
                                tL_payments_checkedGiftCode.to_id = -1L;
                                tL_payments_checkedGiftCode.flags = -1;
                            } else {
                                tL_payments_checkedGiftCode.boost = boost;
                            }
                            new bg.l1(s91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.p8) {
                    bg.a0.m(s91Var, b6Var, j10, null);
                }
                if (view instanceof gg.c) {
                    bg.a0.m(s91Var, b6Var, j10, ((gg.c) view).getPrepaidGiveaway());
                }
                if (((wb) xbVar.f44454x.get(i9)).f48814a == 9) {
                    if (xbVar.f44455y == 1) {
                        z11 = true;
                    }
                    xbVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f41739c;
                org.telegram.ui.Components.k60.L((org.telegram.ui.Components.k60) this.d, this.f41738b, (org.telegram.ui.ActionBar.o2) this.f41740e, (a0.h) this.f41741f, context, i9);
                return;
        }
    }

    public qb(org.telegram.ui.Components.k60 k60Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context) {
        this.d = k60Var;
        this.f41738b = j10;
        this.f41740e = o2Var;
        this.f41741f = hVar;
        this.f41739c = context;
    }
}
