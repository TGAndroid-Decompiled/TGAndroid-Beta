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
public final class y70 extends qm0 {
    public final e80 f33121c;

    public y70(e80 e80Var) {
        this.f33121c = e80Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        e80 e80Var = this.f33121c;
        if (e80Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) e80Var.f25952n0.get(i10 - e80Var.Y);
            if (DialogObject.isUserDialog(dialog.f20046id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) e80Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20046id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) e80Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20046id));
        }
        return (TLObject) e80Var.f25944e0.get(i10 - e80Var.Y);
    }

    @Override
    public final int h() {
        return this.f33121c.f25942c0;
    }

    @Override
    public final int j(int i10) {
        e80 e80Var = this.f33121c;
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
        if (i10 == e80Var.f25941b0) {
            return 4;
        }
        if (i10 == e80Var.f25940a0) {
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
        int i11 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f20189id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20042id;
                } else {
                    j3 = 0;
                }
                e80 e80Var = this.f33121c;
                boolean z12 = false;
                if (i10 != e80Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f20189id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f20042id;
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
                    if (e80Var.f25945f0.h(j10) >= 0) {
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
            e80 e80Var = this.f33121c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.i6.f20985n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        x70 x70Var = new x70(context, null, 0, null, 0);
                        x70Var.setLayoutParams(new s4.q0(-1, -1));
                        x70Var.f25085e.setVisibility(8);
                        org.telegram.ui.gu guVar = e80Var.m0;
                        vh.n nVar = x70Var.d;
                        if (guVar != null) {
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
