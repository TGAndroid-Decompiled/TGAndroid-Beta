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
public final class q30 extends ql0 {
    public final Context f28059c;
    public final u30 d;

    public q30(u30 u30Var, Context context) {
        this.d = u30Var;
        this.f28059c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.f29095c0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i10 = l1Var.f5777f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f29106o0;
    }

    @Override
    public final int j(int i10) {
        u30 u30Var = this.d;
        if ((i10 >= u30Var.f29100h0 && i10 < u30Var.f29101i0) || (i10 >= u30Var.f29103k0 && i10 < u30Var.f29104l0)) {
            return 0;
        }
        if (i10 == u30Var.f29098f0) {
            return 1;
        }
        if (i10 != u30Var.m0 && i10 != u30Var.f29102j0) {
            u30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == u30Var.f29099g0) {
                return 4;
            }
            if (i10 != u30Var.f29105n0) {
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
        u30 u30Var = this.d;
        ArrayList arrayList = u30Var.U;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z4 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
                    if (i10 == u30Var.m0) {
                        t3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == u30Var.f29102j0) {
                        if (u30Var.f29097e0) {
                            t3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
                            return;
                        } else {
                            t3Var.setText(LocaleController.getString(R.string.GroupContacts));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i10 == u30Var.f29098f0) {
                if ((!u30Var.Z || u30Var.f29093a0) && u30Var.m0 == -1 && !arrayList.isEmpty()) {
                    z4 = true;
                }
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z4);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i10));
        int i14 = u30Var.f29100h0;
        if (i10 >= i14 && i10 < u30Var.f29101i0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = u30Var.f29103k0;
            if (i10 >= i15 && i10 < u30Var.f29104l0) {
                tLObject = (TLObject) u30Var.V.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < u30Var.f29100h0 || i10 >= (i11 = u30Var.f29101i0)) {
            i11 = u30Var.f29104l0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f19306id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.g3) u30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            a5Var.setCustomImageVisible(u30Var.f29095c0.contains(Long.valueOf(user.f19306id)));
            if (i10 != i11 - 1) {
                z4 = true;
            }
            a5Var.b(user, null, null, z4);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.f28059c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? u00Var = new u00(context, null);
                            u00Var.setViewType(6);
                            u00Var.setIsSingleCell(true);
                            u00Var.f(org.telegram.ui.ActionBar.j6.f19926fg, org.telegram.ui.ActionBar.j6.Rg, org.telegram.ui.ActionBar.j6.f19997jg);
                            a5Var = u00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                        a5Var = view;
                    }
                } else {
                    ?? t3Var = new org.telegram.ui.Cells.t3(context, null);
                    t3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19997jg, false));
                    t3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                    a5Var = t3Var;
                }
            } else {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i11 = org.telegram.ui.ActionBar.j6.f20106pg;
                x4Var.a(i11, i11);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19945gg);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(6, 2, this.f28059c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20034lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20106pg, false);
            a5Var2.E = w02;
            a5Var2.F = w03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.f19945gg);
            a5Var = a5Var2;
        }
        return new f2.l1(a5Var);
    }
}
