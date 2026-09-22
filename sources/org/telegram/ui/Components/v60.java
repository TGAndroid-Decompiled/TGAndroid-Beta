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
public final class v60 extends kl0 {
    public final b70 f28636c;

    public v60(b70 b70Var) {
        this.f28636c = b70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        b70 b70Var = this.f28636c;
        if (b70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) b70Var.f22679n0.get(i10 - b70Var.Y);
            if (DialogObject.isUserDialog(dialog.f18113id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) b70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f18113id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) b70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18113id));
        }
        return (TLObject) b70Var.f22671e0.get(i10 - b70Var.Y);
    }

    @Override
    public final int h() {
        return this.f28636c.f22669c0;
    }

    @Override
    public final int j(int i10) {
        b70 b70Var = this.f28636c;
        if (i10 == b70Var.X) {
            return 1;
        }
        b70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= b70Var.Y && i10 < b70Var.Z) {
            return 3;
        }
        if (i10 == b70Var.f22668b0) {
            return 4;
        }
        if (i10 == b70Var.f22667a0) {
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
        int i11 = c1Var.f42674f;
        View view = c1Var.f42671a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18256id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18109id;
                } else {
                    j3 = 0;
                }
                b70 b70Var = this.f28636c;
                boolean z12 = false;
                if (i10 != b70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f18256id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f18109id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = b70Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (b70Var.f22672f0.h(j10) >= 0) {
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
            b70 b70Var = this.f28636c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.i6.f19017n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        u60 u60Var = new u60(context, null, 0, null, 0);
                        u60Var.setLayoutParams(new s4.p0(-1, -1));
                        u60Var.e.setVisibility(8);
                        org.telegram.ui.hu huVar = b70Var.m0;
                        vh.o oVar = u60Var.d;
                        if (huVar != null) {
                            oVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            oVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        u60Var.setAnimateLayoutChange(true);
                        y4Var = u60Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (b70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z10);
            }
        } else {
            y4Var = new ci.eb(this, context, 18);
        }
        return new s4.c1(y4Var);
    }
}
