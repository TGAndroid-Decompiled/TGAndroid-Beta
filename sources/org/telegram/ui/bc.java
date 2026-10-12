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
public final class bc implements org.telegram.ui.Components.am0 {
    public final int f34506a = 1;
    public final long f34507b;
    public final Context f34508c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f34509f;

    public bc(ic icVar, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, hb1 hb1Var) {
        this.d = icVar;
        this.f34508c = context;
        this.f34507b = j10;
        this.e = c6Var;
        this.f34509f = hb1Var;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f34506a) {
            case 0:
                ic icVar = (ic) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                hb1 hb1Var = (hb1) this.f34509f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.f34507b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        zh.p7.f1(this.f34508c, icVar.f37086b, j10, boost, c6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(hb1Var.getParentActivity(), hb1Var.getResourceProvider());
                                acVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                acVar.f23513b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                acVar.f23513b.setSingleLine(false);
                                acVar.f23513b.setMaxLines(2);
                                org.telegram.ui.Components.sc.g(hb1Var, acVar, 2750).j();
                            } else if (!z13 && !z12) {
                                hb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-icVar.J.f19216id);
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
                            new ug.c0(hb1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ug.n.n(hb1Var, c6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.n.n(hb1Var, c6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((hc) icVar.f37093x.get(i10)).f43203a == 9) {
                    if (icVar.f37094y == 1) {
                        z11 = true;
                    }
                    icVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.a80.N((org.telegram.ui.Components.a80) this.d, this.f34507b, (org.telegram.ui.ActionBar.m2) this.e, (a0.h) this.f34509f, this.f34508c, i10);
                return;
        }
    }

    public bc(org.telegram.ui.Components.a80 a80Var, long j10, org.telegram.ui.ActionBar.m2 m2Var, a0.h hVar, Context context) {
        this.d = a80Var;
        this.f34507b = j10;
        this.e = m2Var;
        this.f34509f = hVar;
        this.f34508c = context;
    }
}
