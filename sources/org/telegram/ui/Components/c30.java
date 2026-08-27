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

public final class c30 extends yk0 {

    public final Context f27312c;
    public final g30 d;

    public c30(g30 g30Var, Context context) {
        this.d = g30Var;
        this.f27312c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if ((view instanceof org.telegram.ui.Cells.y4) && this.d.f28514b0.contains(Long.valueOf(((org.telegram.ui.Cells.y4) view).getUserId()))) {
            return false;
        }
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 1;
    }

    @Override
    public final int h() {
        return this.d.f28525n0;
    }

    @Override
    public final int j(int i10) {
        g30 g30Var = this.d;
        if ((i10 >= g30Var.f28519g0 && i10 < g30Var.f28520h0) || (i10 >= g30Var.f28522j0 && i10 < g30Var.f28523k0)) {
            return 0;
        }
        if (i10 == g30Var.f28517e0) {
            return 1;
        }
        if (i10 == g30Var.f28524l0 || i10 == g30Var.f28521i0) {
            return 2;
        }
        g30Var.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == g30Var.f28518f0) {
            return 4;
        }
        return i10 == g30Var.m0 ? 5 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLObject tLObject;
        int i11;
        long peerId;
        g30 g30Var = this.d;
        ArrayList arrayList = g30Var.T;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = false;
        if (i12 == 0) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.setTag(Integer.valueOf(i10));
            int i13 = g30Var.f28519g0;
            if (i10 < i13 || i10 >= g30Var.f28520h0) {
                int i14 = g30Var.f28522j0;
                tLObject = (i10 < i14 || i10 >= g30Var.f28523k0) ? null : (TLObject) g30Var.U.get(i10 - i14);
            } else {
                tLObject = (TLObject) arrayList.get(i10 - i13);
            }
            if (i10 < g30Var.f28519g0 || i10 >= (i11 = g30Var.f28520h0)) {
                i11 = g30Var.f28523k0;
            }
            if (tLObject instanceof TLRPC.TL_contact) {
                peerId = ((TLRPC.TL_contact) tLObject).user_id;
            } else if (tLObject instanceof TLRPC.User) {
                peerId = ((TLRPC.User) tLObject).f22527id;
            } else {
                peerId = tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
            }
            TLRPC.User user = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) g30Var).currentAccount).getUser(Long.valueOf(peerId));
            if (user != null) {
                y4Var.setCustomImageVisible(g30Var.f28514b0.contains(Long.valueOf(user.f22527id)));
                y4Var.b(user, null, null, i10 != i11 - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
            if (i10 == g30Var.f28517e0) {
                if ((!g30Var.Y || g30Var.Z) && g30Var.f28524l0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                v4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        if (i12 != 2) {
            return;
        }
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        if (i10 == g30Var.f28524l0) {
            s3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
        } else if (i10 == g30Var.f28521i0) {
            if (g30Var.f28516d0) {
                s3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
            } else {
                s3Var.setText(LocaleController.getString(R.string.GroupContacts));
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f27312c;
            if (i10 == 1) {
                org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
                int i11 = org.telegram.ui.ActionBar.g6.f23275pg;
                v4Var.a(i11, i11);
                v4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f23117gg);
                view = v4Var;
            } else if (i10 == 2) {
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, null);
                s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23172jg, false));
                s3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                view = s3Var;
            } else if (i10 == 3) {
                View view2 = new View(context);
                view2.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
                view = view2;
            } else if (i10 != 5) {
                view = new View(context);
            } else {
                h00 h00Var = new h00(context, null);
                h00Var.setViewType(6);
                h00Var.setIsSingleCell(true);
                h00Var.f(org.telegram.ui.ActionBar.g6.f23099fg, org.telegram.ui.ActionBar.g6.Rg, org.telegram.ui.ActionBar.g6.f23172jg);
                view = h00Var;
            }
        } else {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(6, 2, this.f27312c, null, false);
            y4Var.setCustomRightImage(R.drawable.msg_invited);
            y4Var.setNameColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23207lg, false);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false);
            y4Var.D = iW0;
            y4Var.E = iW1;
            y4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f23117gg);
            view = y4Var;
        }
        return new lk0(view);
    }
}
