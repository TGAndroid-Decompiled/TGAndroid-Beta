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
public final class r30 extends sl0 {
    public final Context f30582c;
    public final v30 d;

    public r30(v30 v30Var, Context context) {
        this.d = v30Var;
        this.f30582c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f31788c0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i10 = m1Var.f5879f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31799o0;
    }

    @Override
    public final int j(int i10) {
        v30 v30Var = this.d;
        if ((i10 >= v30Var.f31793h0 && i10 < v30Var.f31794i0) || (i10 >= v30Var.f31796k0 && i10 < v30Var.f31797l0)) {
            return 0;
        }
        if (i10 == v30Var.f31791f0) {
            return 1;
        }
        if (i10 != v30Var.m0 && i10 != v30Var.f31795j0) {
            v30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == v30Var.f31792g0) {
                return 4;
            }
            if (i10 != v30Var.f31798n0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j10;
        int i12;
        v30 v30Var = this.d;
        ArrayList arrayList = v30Var.U;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (i10 == v30Var.m0) {
                        u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == v30Var.f31795j0) {
                        if (v30Var.f31790e0) {
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
            if (i10 == v30Var.f31791f0) {
                if ((!v30Var.Z || v30Var.f31786a0) && v30Var.m0 == -1 && !arrayList.isEmpty()) {
                    z4 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z4);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        int i14 = v30Var.f31793h0;
        if (i10 >= i14 && i10 < v30Var.f31794i0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = v30Var.f31796k0;
            if (i10 >= i15 && i10 < v30Var.f31797l0) {
                tLObject = (TLObject) v30Var.V.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < v30Var.f31793h0 || i10 >= (i11 = v30Var.f31794i0)) {
            i11 = v30Var.f31797l0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f20990id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.h3) v30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            b5Var.setCustomImageVisible(v30Var.f31788c0.contains(Long.valueOf(user.f20990id)));
            if (i10 != i11 - 1) {
                z4 = true;
            }
            b5Var.b(user, null, null, z4);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.f30582c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? u00Var = new u00(context, null);
                            u00Var.setViewType(6);
                            u00Var.setIsSingleCell(true);
                            u00Var.f(org.telegram.ui.ActionBar.k6.f21705fg, org.telegram.ui.ActionBar.k6.Rg, org.telegram.ui.ActionBar.k6.f21776jg);
                            b5Var = u00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                    u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21776jg, false));
                    u3Var.setTextColor(org.telegram.ui.ActionBar.k6.Qg);
                    b5Var = u3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.k6.f21885pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.k6.f21724gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f30582c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21848ng, false));
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21813lg, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21885pg, false);
            b5Var2.E = w02;
            b5Var2.F = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.f21724gg);
            b5Var = b5Var2;
        }
        return new f2.m1(b5Var);
    }
}
