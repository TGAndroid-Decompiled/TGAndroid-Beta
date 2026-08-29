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
public final class l30 extends il0 {
    public final Context f30220c;
    public final p30 d;

    public l30(p30 p30Var, Context context) {
        this.d = p30Var;
        this.f30220c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (!(view instanceof org.telegram.ui.Cells.z4) || !this.d.f31564b0.contains(Long.valueOf(((org.telegram.ui.Cells.z4) view).getUserId()))) {
            int i10 = n1Var.f6436f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31575n0;
    }

    @Override
    public final int j(int i10) {
        p30 p30Var = this.d;
        if ((i10 >= p30Var.f31569g0 && i10 < p30Var.f31570h0) || (i10 >= p30Var.f31572j0 && i10 < p30Var.f31573k0)) {
            return 0;
        }
        if (i10 == p30Var.f31567e0) {
            return 1;
        }
        if (i10 != p30Var.f31574l0 && i10 != p30Var.f31571i0) {
            p30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == p30Var.f31568f0) {
                return 4;
            }
            if (i10 != p30Var.m0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j10;
        int i12;
        p30 p30Var = this.d;
        ArrayList arrayList = p30Var.T;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                    if (i10 == p30Var.f31574l0) {
                        s3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == p30Var.f31571i0) {
                        if (p30Var.f31566d0) {
                            s3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
                            return;
                        } else {
                            s3Var.setText(LocaleController.getString(R.string.GroupContacts));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
            if (i10 == p30Var.f31567e0) {
                if ((!p30Var.Y || p30Var.Z) && p30Var.f31574l0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                w4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
        z4Var.setTag(Integer.valueOf(i10));
        int i14 = p30Var.f31569g0;
        if (i10 >= i14 && i10 < p30Var.f31570h0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = p30Var.f31572j0;
            if (i10 >= i15 && i10 < p30Var.f31573k0) {
                tLObject = (TLObject) p30Var.U.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < p30Var.f31569g0 || i10 >= (i11 = p30Var.f31570h0)) {
            i11 = p30Var.f31573k0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f22539id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.f3) p30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            z4Var.setCustomImageVisible(p30Var.f31564b0.contains(Long.valueOf(user.f22539id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            z4Var.b(user, null, null, z10);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z4 z4Var;
        if (i10 != 0) {
            Context context = this.f30220c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            z4Var = new View(context);
                        } else {
                            ?? p00Var = new p00(context, null);
                            p00Var.setViewType(6);
                            p00Var.setIsSingleCell(true);
                            p00Var.f(org.telegram.ui.ActionBar.g6.f23108fg, org.telegram.ui.ActionBar.g6.Rg, org.telegram.ui.ActionBar.g6.f23180jg);
                            z4Var = p00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                        z4Var = view;
                    }
                } else {
                    ?? s3Var = new org.telegram.ui.Cells.s3(context, null);
                    s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180jg, false));
                    s3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                    z4Var = s3Var;
                }
            } else {
                ?? w4Var = new org.telegram.ui.Cells.w4(context);
                int i11 = org.telegram.ui.ActionBar.g6.f23286pg;
                w4Var.a(i11, i11);
                w4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f23126gg);
                z4Var = w4Var;
            }
        } else {
            org.telegram.ui.Cells.z4 z4Var2 = new org.telegram.ui.Cells.z4(6, 2, this.f30220c, null, false);
            z4Var2.setCustomRightImage(R.drawable.msg_invited);
            z4Var2.setNameColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215lg, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23286pg, false);
            z4Var2.D = w02;
            z4Var2.E = w03;
            z4Var2.setDividerColor(org.telegram.ui.ActionBar.g6.f23126gg);
            z4Var = z4Var2;
        }
        return new f2.n1(z4Var);
    }
}
