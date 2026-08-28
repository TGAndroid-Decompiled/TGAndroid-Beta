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
public final class x20 extends vk0 {
    public final Context f34495c;
    public final b30 d;

    public x20(b30 b30Var, Context context) {
        this.d = b30Var;
        this.f34495c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f27018b0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i9 = q1Var.f5505f;
            if (i9 == 0 || i9 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f27029n0;
    }

    @Override
    public final int j(int i9) {
        b30 b30Var = this.d;
        if ((i9 >= b30Var.f27023g0 && i9 < b30Var.f27024h0) || (i9 >= b30Var.f27026j0 && i9 < b30Var.f27027k0)) {
            return 0;
        }
        if (i9 == b30Var.f27021e0) {
            return 1;
        }
        if (i9 != b30Var.f27028l0 && i9 != b30Var.f27025i0) {
            b30Var.getClass();
            if (i9 == 0) {
                return 3;
            }
            if (i9 == b30Var.f27022f0) {
                return 4;
            }
            if (i9 != b30Var.m0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLObject tLObject;
        int i10;
        long j10;
        int i11;
        b30 b30Var = this.d;
        ArrayList arrayList = b30Var.T;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                    if (i9 == b30Var.f27028l0) {
                        v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i9 == b30Var.f27025i0) {
                        if (b30Var.f27020d0) {
                            v3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
                            return;
                        } else {
                            v3Var.setText(LocaleController.getString(R.string.GroupContacts));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i9 == b30Var.f27021e0) {
                if ((!b30Var.Y || b30Var.Z) && b30Var.f27028l0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i9));
        int i13 = b30Var.f27023g0;
        if (i9 >= i13 && i9 < b30Var.f27024h0) {
            tLObject = (TLObject) arrayList.get(i9 - i13);
        } else {
            int i14 = b30Var.f27026j0;
            if (i9 >= i14 && i9 < b30Var.f27027k0) {
                tLObject = (TLObject) b30Var.U.get(i9 - i14);
            } else {
                tLObject = null;
            }
        }
        if (i9 < b30Var.f27023g0 || i9 >= (i10 = b30Var.f27024h0)) {
            i10 = b30Var.f27027k0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f22527id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) b30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        if (user != null) {
            b5Var.setCustomImageVisible(b30Var.f27018b0.contains(Long.valueOf(user.f22527id)));
            if (i9 != i10 - 1) {
                z10 = true;
            }
            b5Var.b(user, null, null, z10);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i9 != 0) {
            Context context = this.f34495c;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? e00Var = new e00(context, null);
                            e00Var.setViewType(6);
                            e00Var.setIsSingleCell(true);
                            e00Var.f(org.telegram.ui.ActionBar.f6.f23046fg, org.telegram.ui.ActionBar.f6.Rg, org.telegram.ui.ActionBar.f6.f23118jg);
                            b5Var = e00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                    v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23118jg, false));
                    v3Var.setTextColor(org.telegram.ui.ActionBar.f6.Qg);
                    b5Var = v3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i10 = org.telegram.ui.ActionBar.f6.f23220pg;
                y4Var.a(i10, i10);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.f6.f23065gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f34495c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23154lg, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23220pg, false);
            b5Var2.D = w02;
            b5Var2.E = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.f6.f23065gg);
            b5Var = b5Var2;
        }
        return new f2.q1(b5Var);
    }
}
