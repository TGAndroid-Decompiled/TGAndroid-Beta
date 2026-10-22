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
public final class w30 extends im0 {
    public final Context f31962c;
    public final a40 d;

    public w30(a40 a40Var, Context context) {
        this.d = a40Var;
        this.f31962c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45920a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.f45920a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.f24492f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i10 = b1Var.f45923f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f24503r0;
    }

    @Override
    public final int j(int i10) {
        a40 a40Var = this.d;
        if ((i10 >= a40Var.f24497k0 && i10 < a40Var.f24498l0) || (i10 >= a40Var.f24499n0 && i10 < a40Var.f24500o0)) {
            return 0;
        }
        if (i10 == a40Var.f24495i0) {
            return 1;
        }
        if (i10 != a40Var.f24501p0 && i10 != a40Var.m0) {
            a40Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == a40Var.f24496j0) {
                return 4;
            }
            if (i10 != a40Var.f24502q0) {
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
        a40 a40Var = this.d;
        ArrayList arrayList = a40Var.X;
        int i13 = b1Var.f45923f;
        View view = b1Var.f45920a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (i10 == a40Var.f24501p0) {
                        u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == a40Var.m0) {
                        if (a40Var.f24494h0) {
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
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i10 == a40Var.f24495i0) {
                if ((!a40Var.f24489c0 || a40Var.f24490d0) && a40Var.f24501p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i10));
        int i14 = a40Var.f24497k0;
        if (i10 >= i14 && i10 < a40Var.f24498l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = a40Var.f24499n0;
            if (i10 >= i15 && i10 < a40Var.f24500o0) {
                tLObject = (TLObject) a40Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < a40Var.f24497k0 || i10 >= (i11 = a40Var.f24498l0)) {
            i11 = a40Var.f24500o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f20426id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.f3) a40Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        if (user != null) {
            a5Var.setCustomImageVisible(a40Var.f24492f0.contains(Long.valueOf(user.f20426id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            a5Var.b(user, null, null, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.f31962c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? b10Var = new b10(context, null);
                            b10Var.setViewType(6);
                            b10Var.setIsSingleCell(true);
                            b10Var.f(org.telegram.ui.ActionBar.h6.fg, org.telegram.ui.ActionBar.h6.Rg, org.telegram.ui.ActionBar.h6.f21110jg);
                            a5Var = b10Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                        a5Var = view;
                    }
                } else {
                    ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                    u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21110jg, false));
                    u3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                    a5Var = u3Var;
                }
            } else {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i11 = org.telegram.ui.ActionBar.h6.f21221pg;
                x4Var.a(i11, i11);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.h6.f21056gg);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(6, 2, this.f31962c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21186ng, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21147lg, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21221pg, false);
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.h6.f21056gg);
            a5Var = a5Var2;
        }
        return new s4.b1(a5Var);
    }
}
