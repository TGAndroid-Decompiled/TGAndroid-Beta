package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y30 extends lm0 {
    public final Context f34920c;
    public final c40 d;

    public y30(c40 c40Var, Context context) {
        this.d = c40Var;
        this.f34920c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (!(view instanceof org.telegram.ui.Cells.f5) || !this.d.f27062f0.contains(Long.valueOf(((org.telegram.ui.Cells.f5) view).getUserId()))) {
            int i10 = e1Var.f47741f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f27073r0;
    }

    @Override
    public final int j(int i10) {
        c40 c40Var = this.d;
        if ((i10 >= c40Var.f27067k0 && i10 < c40Var.f27068l0) || (i10 >= c40Var.f27069n0 && i10 < c40Var.f27070o0)) {
            return 0;
        }
        if (i10 == c40Var.f27065i0) {
            return 1;
        }
        if (i10 != c40Var.f27071p0 && i10 != c40Var.m0) {
            c40Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == c40Var.f27066j0) {
                return 4;
            }
            if (i10 != c40Var.f27072q0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j10;
        int i12;
        c40 c40Var = this.d;
        ArrayList arrayList = c40Var.X;
        int i13 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                    if (i10 == c40Var.f27071p0) {
                        z3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == c40Var.m0) {
                        if (c40Var.f27064h0) {
                            z3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
                            return;
                        } else {
                            z3Var.setText(LocaleController.getString(R.string.GroupContacts));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
            if (i10 == c40Var.f27065i0) {
                if ((!c40Var.f27059c0 || c40Var.f27060d0) && c40Var.f27071p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                c5Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
        f5Var.setTag(Integer.valueOf(i10));
        int i14 = c40Var.f27067k0;
        if (i10 >= i14 && i10 < c40Var.f27068l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = c40Var.f27069n0;
            if (i10 >= i15 && i10 < c40Var.f27070o0) {
                tLObject = (TLObject) c40Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < c40Var.f27067k0 || i10 >= (i11 = c40Var.f27068l0)) {
            i11 = c40Var.f27070o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f22176id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.k3) c40Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            f5Var.setCustomImageVisible(c40Var.f27062f0.contains(Long.valueOf(user.f22176id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            f5Var.c(user, null, null, z10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.f5 f5Var;
        if (i10 != 0) {
            Context context = this.f34920c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            f5Var = new View(context);
                        } else {
                            ?? c10Var = new c10(context, null);
                            c10Var.setViewType(6);
                            c10Var.setIsSingleCell(true);
                            c10Var.e(org.telegram.ui.ActionBar.y6.f23402fg, org.telegram.ui.ActionBar.y6.Rg, org.telegram.ui.ActionBar.y6.f23474jg);
                            f5Var = c10Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                        f5Var = view;
                    }
                } else {
                    ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23474jg, z3Var, null);
                    z3Var.setTextColor(org.telegram.ui.ActionBar.y6.Qg);
                    f5Var = z3Var;
                }
            } else {
                ?? c5Var = new org.telegram.ui.Cells.c5(context);
                int i11 = org.telegram.ui.ActionBar.y6.f23588pg;
                c5Var.a(i11, i11);
                c5Var.setDividerColor(org.telegram.ui.ActionBar.y6.gg);
                f5Var = c5Var;
            }
        } else {
            org.telegram.ui.Cells.f5 f5Var2 = new org.telegram.ui.Cells.f5(6, 2, this.f34920c, null, false);
            f5Var2.setCustomRightImage(R.drawable.msg_invited);
            f5Var2.setNameColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23550ng, false));
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23511lg, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23588pg, false);
            f5Var2.O = true;
            f5Var2.H = x02;
            f5Var2.I = x03;
            f5Var2.setDividerColor(org.telegram.ui.ActionBar.y6.gg);
            f5Var = f5Var2;
        }
        return new s4.e1(f5Var);
    }
}
