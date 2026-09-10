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
public final class x30 extends ul0 {
    public final Context f28928c;
    public final b40 d;

    public x30(b40 b40Var, Context context) {
        this.d = b40Var;
        this.f28928c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f21709f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i10 = c1Var.f41613f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f21720r0;
    }

    @Override
    public final int j(int i10) {
        b40 b40Var = this.d;
        if ((i10 >= b40Var.f21714k0 && i10 < b40Var.f21715l0) || (i10 >= b40Var.f21716n0 && i10 < b40Var.f21717o0)) {
            return 0;
        }
        if (i10 == b40Var.f21712i0) {
            return 1;
        }
        if (i10 != b40Var.f21718p0 && i10 != b40Var.m0) {
            b40Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == b40Var.f21713j0) {
                return 4;
            }
            if (i10 != b40Var.f21719q0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j3;
        int i12;
        b40 b40Var = this.d;
        ArrayList arrayList = b40Var.X;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (i10 == b40Var.f21718p0) {
                        u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == b40Var.m0) {
                        if (b40Var.f21711h0) {
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
            if (i10 == b40Var.f21712i0) {
                if ((!b40Var.f21706c0 || b40Var.f21707d0) && b40Var.f21718p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        int i14 = b40Var.f21714k0;
        if (i10 >= i14 && i10 < b40Var.f21715l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = b40Var.f21716n0;
            if (i10 >= i15 && i10 < b40Var.f21717o0) {
                tLObject = (TLObject) b40Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < b40Var.f21714k0 || i10 >= (i11 = b40Var.f21715l0)) {
            i11 = b40Var.f21717o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f17342id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.h3) b40Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
        if (user != null) {
            b5Var.setCustomImageVisible(b40Var.f21709f0.contains(Long.valueOf(user.f17342id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            b5Var.b(user, null, null, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.f28928c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? a10Var = new a10(context, null);
                            a10Var.setViewType(6);
                            a10Var.setIsSingleCell(true);
                            a10Var.f(org.telegram.ui.ActionBar.j6.f17972fg, org.telegram.ui.ActionBar.j6.Rg, org.telegram.ui.ActionBar.j6.f18045jg);
                            b5Var = a10Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                    u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18045jg, false));
                    u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                    b5Var = u3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.j6.f18153pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.j6.f17990gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f28928c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18083lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18153pg, false);
            b5Var2.H = w02;
            b5Var2.I = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.f17990gg);
            b5Var = b5Var2;
        }
        return new s4.c1(b5Var);
    }
}
