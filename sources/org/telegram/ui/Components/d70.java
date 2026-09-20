package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d70 extends ul0 {
    public final j70 f23510c;

    public d70(j70 j70Var) {
        this.f23510c = j70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42977f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        j70 j70Var = this.f23510c;
        if (j70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) j70Var.f25261n0.get(i10 - j70Var.Y);
            if (DialogObject.isUserDialog(dialog.f18332id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) j70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f18332id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) j70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18332id));
        }
        return (TLObject) j70Var.f25253e0.get(i10 - j70Var.Y);
    }

    @Override
    public final int h() {
        return this.f23510c.f25251c0;
    }

    @Override
    public final int j(int i10) {
        j70 j70Var = this.f23510c;
        if (i10 == j70Var.X) {
            return 1;
        }
        j70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= j70Var.Y && i10 < j70Var.Z) {
            return 3;
        }
        if (i10 == j70Var.f25250b0) {
            return 4;
        }
        if (i10 == j70Var.f25249a0) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i10);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18475id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18328id;
                } else {
                    j3 = 0;
                }
                j70 j70Var = this.f23510c;
                boolean z12 = false;
                if (i10 != j70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f18475id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f18328id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = j70Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (j70Var.f25254f0.h(j10) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j3 == j10) {
                        z12 = true;
                    }
                    h4Var.c(z11, z12);
                    h4Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z4 z4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            j70 j70Var = this.f23510c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.z4 z4Var2 = new org.telegram.ui.Cells.z4(context);
                        z4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.j6.f19278n5;
                        z4Var2.a(i11, i11);
                        z4Var = z4Var2;
                    } else {
                        c70 c70Var = new c70(context, null, 0, null, 0);
                        c70Var.setLayoutParams(new s4.p0(-1, -1));
                        c70Var.e.setVisibility(8);
                        org.telegram.ui.fu fuVar = j70Var.m0;
                        vh.o oVar = c70Var.d;
                        if (fuVar != null) {
                            oVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            oVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        c70Var.setAnimateLayoutChange(true);
                        z4Var = c70Var;
                    }
                } else {
                    z4Var = new View(context);
                }
            } else {
                if (j70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z4Var = new org.telegram.ui.Cells.h4(context, 1, 0, z10);
            }
        } else {
            z4Var = new ci.eb(this, context, 18);
        }
        return new s4.c1(z4Var);
    }
}
