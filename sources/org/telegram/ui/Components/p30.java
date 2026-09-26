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
public final class p30 extends wl0 {
    public final Context f27208c;
    public final t30 d;

    public p30(t30 t30Var, Context context) {
        this.d = t30Var;
        this.f27208c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42959a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42959a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f28437f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i10 = c1Var.f42962f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f28448r0;
    }

    @Override
    public final int j(int i10) {
        t30 t30Var = this.d;
        if ((i10 >= t30Var.f28442k0 && i10 < t30Var.f28443l0) || (i10 >= t30Var.f28444n0 && i10 < t30Var.f28445o0)) {
            return 0;
        }
        if (i10 == t30Var.f28440i0) {
            return 1;
        }
        if (i10 != t30Var.f28446p0 && i10 != t30Var.m0) {
            t30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == t30Var.f28441j0) {
                return 4;
            }
            if (i10 != t30Var.f28447q0) {
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
        t30 t30Var = this.d;
        ArrayList arrayList = t30Var.X;
        int i13 = c1Var.f42962f;
        View view = c1Var.f42959a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                    if (i10 == t30Var.f28446p0) {
                        v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == t30Var.m0) {
                        if (t30Var.f28439h0) {
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
            if (i10 == t30Var.f28440i0) {
                if ((!t30Var.f28434c0 || t30Var.f28435d0) && t30Var.f28446p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        int i14 = t30Var.f28442k0;
        if (i10 >= i14 && i10 < t30Var.f28443l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = t30Var.f28444n0;
            if (i10 >= i15 && i10 < t30Var.f28445o0) {
                tLObject = (TLObject) t30Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < t30Var.f28442k0 || i10 >= (i11 = t30Var.f28443l0)) {
            i11 = t30Var.f28445o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f18482id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.e3) t30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
        if (user != null) {
            b5Var.setCustomImageVisible(t30Var.f28437f0.contains(Long.valueOf(user.f18482id)));
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
            Context context = this.f27208c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? v00Var = new v00(context, null);
                            v00Var.setViewType(6);
                            v00Var.setIsSingleCell(true);
                            v00Var.f(org.telegram.ui.ActionBar.h6.f19103fg, org.telegram.ui.ActionBar.h6.Rg, org.telegram.ui.ActionBar.h6.f19176jg);
                            b5Var = v00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                    v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19176jg, false));
                    v3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                    b5Var = v3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.h6.f19288pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.h6.f19121gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f27208c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19250ng, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19214lg, false);
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19288pg, false);
            b5Var2.H = w02;
            b5Var2.I = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.h6.f19121gg);
            b5Var = b5Var2;
        }
        return new s4.c1(b5Var);
    }
}
