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
public final class pb implements org.telegram.ui.Components.zk0 {
    public final int f41347a = 1;
    public final long f41348b;
    public final Context f41349c;
    public final KeyEvent.Callback d;
    public final Object f41350e;
    public final Object f41351f;

    public pb(wb wbVar, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, t91 t91Var) {
        this.d = wbVar;
        this.f41349c = context;
        this.f41348b = j10;
        this.f41350e = c6Var;
        this.f41351f = t91Var;
    }

    @Override
    public final void c(int i10, View view) {
        switch (this.f41347a) {
            case 0:
                wb wbVar = (wb) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f41350e;
                t91 t91Var = (t91) this.f41351f;
                boolean z10 = view instanceof jg.b;
                long j10 = this.f41348b;
                boolean z11 = false;
                if (z10) {
                    jg.b bVar = (jg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        jh.ia.e1(this.f41349c, wbVar.f43917b, j10, boost, c6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(t91Var.getParentActivity(), t91Var.getResourceProvider());
                                ubVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ubVar.f33185b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ubVar.f33185b.setSingleLine(false);
                                ubVar.f33185b.setMaxLines(2);
                                org.telegram.ui.Components.mc.g(t91Var, ubVar, 2750).j();
                            } else if (!z13 && !z12) {
                                t91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-wbVar.F.f22392id);
                            int i11 = boost.date;
                            tL_payments_checkedGiftCode.date = i11;
                            tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                            int i12 = boost.expires - i11;
                            tL_payments_checkedGiftCode.days = i12 / 86400;
                            tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                            if (boost.unclaimed) {
                                tL_payments_checkedGiftCode.to_id = -1L;
                                tL_payments_checkedGiftCode.flags = -1;
                            } else {
                                tL_payments_checkedGiftCode.boost = boost;
                            }
                            new eg.f1(t91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.m8) {
                    eg.y.m(t91Var, c6Var, j10, null);
                }
                if (view instanceof jg.c) {
                    eg.y.m(t91Var, c6Var, j10, ((jg.c) view).getPrepaidGiveaway());
                }
                if (((vb) wbVar.f43925x.get(i10)).f50845a == 9) {
                    if (wbVar.f43926y == 1) {
                        z11 = true;
                    }
                    wbVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f41349c;
                org.telegram.ui.Components.x60.L((org.telegram.ui.Components.x60) this.d, this.f41348b, (org.telegram.ui.ActionBar.o2) this.f41350e, (a0.h) this.f41351f, context, i10);
                return;
        }
    }

    public pb(org.telegram.ui.Components.x60 x60Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context) {
        this.d = x60Var;
        this.f41348b = j10;
        this.f41350e = o2Var;
        this.f41351f = hVar;
        this.f41349c = context;
    }
}
