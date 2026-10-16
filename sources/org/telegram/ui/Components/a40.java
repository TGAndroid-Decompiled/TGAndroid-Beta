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
public final class a40 extends lm0 {
    public final Context f23122c;
    public final e40 d;

    public a40(e40 e40Var, Context context) {
        this.d = e40Var;
        this.f23122c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f24291f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i10 = b1Var.f44841f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f24302r0;
    }

    @Override
    public final int j(int i10) {
        e40 e40Var = this.d;
        if ((i10 >= e40Var.f24296k0 && i10 < e40Var.f24297l0) || (i10 >= e40Var.f24298n0 && i10 < e40Var.f24299o0)) {
            return 0;
        }
        if (i10 == e40Var.f24294i0) {
            return 1;
        }
        if (i10 != e40Var.f24300p0 && i10 != e40Var.m0) {
            e40Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == e40Var.f24295j0) {
                return 4;
            }
            if (i10 != e40Var.f24301q0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j10;
        int i12;
        e40 e40Var = this.d;
        ArrayList arrayList = e40Var.X;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                    if (i10 == e40Var.f24300p0) {
                        v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == e40Var.m0) {
                        if (e40Var.f24293h0) {
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
            if (i10 == e40Var.f24294i0) {
                if ((!e40Var.f24288c0 || e40Var.f24289d0) && e40Var.f24300p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        int i14 = e40Var.f24296k0;
        if (i10 >= i14 && i10 < e40Var.f24297l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = e40Var.f24298n0;
            if (i10 >= i15 && i10 < e40Var.f24299o0) {
                tLObject = (TLObject) e40Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < e40Var.f24296k0 || i10 >= (i11 = e40Var.f24297l0)) {
            i11 = e40Var.f24299o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f19063id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.e3) e40Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            b5Var.setCustomImageVisible(e40Var.f24291f0.contains(Long.valueOf(user.f19063id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            b5Var.b(user, null, null, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.f23122c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? f10Var = new f10(context, null);
                            f10Var.setViewType(6);
                            f10Var.setIsSingleCell(true);
                            f10Var.f(org.telegram.ui.ActionBar.g6.fg, org.telegram.ui.ActionBar.g6.Rg, org.telegram.ui.ActionBar.g6.f19718jg);
                            b5Var = f10Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                    v3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19718jg, false));
                    v3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                    b5Var = v3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.g6.f19829pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f19664gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f23122c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19794ng, false));
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19755lg, false);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19829pg, false);
            b5Var2.H = x02;
            b5Var2.I = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.g6.f19664gg);
            b5Var = b5Var2;
        }
        return new s4.b1(b5Var);
    }
}
