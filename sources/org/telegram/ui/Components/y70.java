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
public final class y70 extends rm0 {
    public final e80 f33104c;

    public y70(e80 e80Var) {
        this.f33104c = e80Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        e80 e80Var = this.f33104c;
        if (e80Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) e80Var.f25910n0.get(i10 - e80Var.Y);
            if (DialogObject.isUserDialog(dialog.f20036id)) {
                i12 = ((org.telegram.ui.ActionBar.e3) e80Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20036id));
            }
            i11 = ((org.telegram.ui.ActionBar.e3) e80Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20036id));
        }
        return (TLObject) e80Var.f25902e0.get(i10 - e80Var.Y);
    }

    @Override
    public final int h() {
        return this.f33104c.f25900c0;
    }

    @Override
    public final int j(int i10) {
        e80 e80Var = this.f33104c;
        if (i10 == e80Var.X) {
            return 1;
        }
        e80Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= e80Var.Y && i10 < e80Var.Z) {
            return 3;
        }
        if (i10 == e80Var.f25899b0) {
            return 4;
        }
        if (i10 == e80Var.f25898a0) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f20179id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20032id;
                } else {
                    j3 = 0;
                }
                e80 e80Var = this.f33104c;
                boolean z12 = false;
                if (i10 != e80Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f20179id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f20032id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = e80Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (e80Var.f25903f0.h(j10) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j3 == j10) {
                        z12 = true;
                    }
                    g4Var.c(z11, z12);
                    g4Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            e80 e80Var = this.f33104c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.h6.f20970n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        x70 x70Var = new x70(context, null, 0, null, 0);
                        x70Var.setLayoutParams(new s4.q0(-1, -1));
                        x70Var.f25351e.setVisibility(8);
                        org.telegram.ui.fu fuVar = e80Var.m0;
                        vh.n nVar = x70Var.d;
                        if (fuVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        x70Var.setAnimateLayoutChange(true);
                        y4Var = x70Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (e80Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(1, 0, context, z10);
            }
        } else {
            y4Var = new ci.bb(this, context, 18);
        }
        return new s4.d1(y4Var);
    }
}
