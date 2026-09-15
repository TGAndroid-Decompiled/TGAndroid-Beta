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
public final class n30 extends kl0 {
    public final Context f26308c;
    public final r30 d;

    public n30(r30 r30Var, Context context) {
        this.d = r30Var;
        this.f26308c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.f27534f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i10 = c1Var.f42678f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f27545r0;
    }

    @Override
    public final int j(int i10) {
        r30 r30Var = this.d;
        if ((i10 >= r30Var.f27539k0 && i10 < r30Var.f27540l0) || (i10 >= r30Var.f27541n0 && i10 < r30Var.f27542o0)) {
            return 0;
        }
        if (i10 == r30Var.f27537i0) {
            return 1;
        }
        if (i10 != r30Var.f27543p0 && i10 != r30Var.m0) {
            r30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == r30Var.f27538j0) {
                return 4;
            }
            if (i10 != r30Var.f27544q0) {
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
        r30 r30Var = this.d;
        ArrayList arrayList = r30Var.X;
        int i13 = c1Var.f42678f;
        View view = c1Var.f42675a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (i10 == r30Var.f27543p0) {
                        u3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == r30Var.m0) {
                        if (r30Var.f27536h0) {
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
            if (i10 == r30Var.f27537i0) {
                if ((!r30Var.f27531c0 || r30Var.f27532d0) && r30Var.f27543p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                x4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i10));
        int i14 = r30Var.f27539k0;
        if (i10 >= i14 && i10 < r30Var.f27540l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = r30Var.f27541n0;
            if (i10 >= i15 && i10 < r30Var.f27542o0) {
                tLObject = (TLObject) r30Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < r30Var.f27539k0 || i10 >= (i11 = r30Var.f27540l0)) {
            i11 = r30Var.f27542o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f18259id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.f3) r30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
        if (user != null) {
            a5Var.setCustomImageVisible(r30Var.f27534f0.contains(Long.valueOf(user.f18259id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            a5Var.b(user, null, null, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.f26308c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? t00Var = new t00(context, null);
                            t00Var.setViewType(6);
                            t00Var.setIsSingleCell(true);
                            t00Var.f(org.telegram.ui.ActionBar.i6.f18880fg, org.telegram.ui.ActionBar.i6.Rg, org.telegram.ui.ActionBar.i6.f18954jg);
                            a5Var = t00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                        a5Var = view;
                    }
                } else {
                    ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                    u3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18954jg, false));
                    u3Var.setTextColor(org.telegram.ui.ActionBar.i6.Qg);
                    a5Var = u3Var;
                }
            } else {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i11 = org.telegram.ui.ActionBar.i6.f19065pg;
                x4Var.a(i11, i11);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.i6.f18899gg);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(6, 2, this.f26308c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19028ng, false));
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18992lg, false);
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19065pg, false);
            a5Var2.H = w02;
            a5Var2.I = w03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.i6.f18899gg);
            a5Var = a5Var2;
        }
        return new s4.c1(a5Var);
    }
}
