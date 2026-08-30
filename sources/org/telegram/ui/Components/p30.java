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
public final class p30 extends rl0 {
    public final Context f27726c;
    public final t30 d;

    public p30(t30 t30Var, Context context) {
        this.d = t30Var;
        this.f27726c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f28880c0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i10 = l1Var.f5788f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f28891o0;
    }

    @Override
    public final int j(int i10) {
        t30 t30Var = this.d;
        if ((i10 >= t30Var.f28885h0 && i10 < t30Var.f28886i0) || (i10 >= t30Var.f28888k0 && i10 < t30Var.f28889l0)) {
            return 0;
        }
        if (i10 == t30Var.f28883f0) {
            return 1;
        }
        if (i10 != t30Var.m0 && i10 != t30Var.f28887j0) {
            t30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == t30Var.f28884g0) {
                return 4;
            }
            if (i10 != t30Var.f28890n0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j10;
        int i12;
        t30 t30Var = this.d;
        ArrayList arrayList = t30Var.U;
        int i13 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (i10 == t30Var.m0) {
                        u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == t30Var.f28887j0) {
                        if (t30Var.f28882e0) {
                            u3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
                            return;
                        } else {
                            u3Var.setText(LocaleController.getString(R.string.GroupContacts));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i10 == t30Var.f28883f0) {
                if ((!t30Var.Z || t30Var.f28878a0) && t30Var.m0 == -1 && !arrayList.isEmpty()) {
                    z4 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z4);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        int i14 = t30Var.f28885h0;
        if (i10 >= i14 && i10 < t30Var.f28886i0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = t30Var.f28888k0;
            if (i10 >= i15 && i10 < t30Var.f28889l0) {
                tLObject = (TLObject) t30Var.V.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < t30Var.f28885h0 || i10 >= (i11 = t30Var.f28886i0)) {
            i11 = t30Var.f28889l0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f19331id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.g3) t30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            b5Var.setCustomImageVisible(t30Var.f28880c0.contains(Long.valueOf(user.f19331id)));
            if (i10 != i11 - 1) {
                z4 = true;
            }
            b5Var.b(user, null, null, z4);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.f27726c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? t00Var = new t00(context, null);
                            t00Var.setViewType(6);
                            t00Var.setIsSingleCell(true);
                            t00Var.f(org.telegram.ui.ActionBar.j6.f19951fg, org.telegram.ui.ActionBar.j6.Rg, org.telegram.ui.ActionBar.j6.f20022jg);
                            b5Var = t00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                    u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20022jg, false));
                    u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                    b5Var = u3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.j6.f20131pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19970gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f27726c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20094ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20059lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20131pg, false);
            b5Var2.E = w02;
            b5Var2.F = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.f19970gg);
            b5Var = b5Var2;
        }
        return new f2.l1(b5Var);
    }
}
