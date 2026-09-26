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
public final class h70 extends wl0 {
    public final n70 f24692c;

    public h70(n70 n70Var) {
        this.f24692c = n70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        n70 n70Var = this.f24692c;
        if (n70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) n70Var.f26700n0.get(i10 - n70Var.Y);
            if (DialogObject.isUserDialog(dialog.f18339id)) {
                i12 = ((org.telegram.ui.ActionBar.e3) n70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f18339id));
            }
            i11 = ((org.telegram.ui.ActionBar.e3) n70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18339id));
        }
        return (TLObject) n70Var.f26692e0.get(i10 - n70Var.Y);
    }

    @Override
    public final int h() {
        return this.f24692c.f26690c0;
    }

    @Override
    public final int j(int i10) {
        n70 n70Var = this.f24692c;
        if (i10 == n70Var.X) {
            return 1;
        }
        n70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= n70Var.Y && i10 < n70Var.Z) {
            return 3;
        }
        if (i10 == n70Var.f26689b0) {
            return 4;
        }
        if (i10 == n70Var.f26688a0) {
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
        int i11 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18482id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18335id;
                } else {
                    j3 = 0;
                }
                n70 n70Var = this.f24692c;
                boolean z12 = false;
                if (i10 != n70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f18482id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f18335id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = n70Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (n70Var.f26693f0.h(j10) >= 0) {
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            n70 n70Var = this.f24692c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.h6.f19242n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        g70 g70Var = new g70(context, null, 0, null, 0);
                        g70Var.setLayoutParams(new s4.p0(-1, -1));
                        g70Var.e.setVisibility(8);
                        org.telegram.ui.du duVar = n70Var.m0;
                        vh.n nVar = g70Var.d;
                        if (duVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        g70Var.setAnimateLayoutChange(true);
                        y4Var = g70Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (n70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z10);
            }
        } else {
            y4Var = new ci.bb(this, context, 18);
        }
        return new s4.c1(y4Var);
    }
}
