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
    public final int f34291a = 1;
    public final long f34292b;
    public final Context f34293c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f34294f;

    public bc(hc hcVar, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, hb1 hb1Var) {
        this.d = hcVar;
        this.f34293c = context;
        this.f34292b = j10;
        this.e = c6Var;
        this.f34294f = hb1Var;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f34291a) {
            case 0:
                hc hcVar = (hc) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                hb1 hb1Var = (hb1) this.f34294f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.f34292b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        zh.p7.f1(this.f34293c, hcVar.f36511b, j10, boost, c6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(hb1Var.getParentActivity(), hb1Var.getResourceProvider());
                                acVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                acVar.f23192b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                acVar.f23192b.setSingleLine(false);
                                acVar.f23192b.setMaxLines(2);
                                org.telegram.ui.Components.sc.g(hb1Var, acVar, 2750).j();
                            } else if (!z13 && !z12) {
                                hb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-hcVar.J.f18916id);
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
                if (((gc) hcVar.f36518x.get(i10)).f42904a == 9) {
                    if (hcVar.f36519y == 1) {
                        z11 = true;
                    }
                    hcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.z70.N((org.telegram.ui.Components.z70) this.d, this.f34292b, (org.telegram.ui.ActionBar.m2) this.e, (a0.h) this.f34294f, this.f34293c, i10);
                return;
        }
    }

    public bc(org.telegram.ui.Components.z70 z70Var, long j10, org.telegram.ui.ActionBar.m2 m2Var, a0.h hVar, Context context) {
        this.d = z70Var;
        this.f34292b = j10;
        this.e = m2Var;
        this.f34294f = hVar;
        this.f34293c = context;
    }
}
