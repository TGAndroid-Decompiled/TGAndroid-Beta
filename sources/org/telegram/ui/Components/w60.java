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
public final class w60 extends rl0 {
    public final c70 f30247c;

    public w60(c70 c70Var) {
        this.f30247c = c70Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        c70 c70Var = this.f30247c;
        if (c70Var.f23872j0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) c70Var.f23873k0.get(i10 - c70Var.V);
            if (DialogObject.isUserDialog(dialog.f19188id)) {
                i12 = ((org.telegram.ui.ActionBar.g3) c70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f19188id));
            }
            i11 = ((org.telegram.ui.ActionBar.g3) c70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19188id));
        }
        return (TLObject) c70Var.f23864b0.get(i10 - c70Var.V);
    }

    @Override
    public final int h() {
        return this.f30247c.Z;
    }

    @Override
    public final int j(int i10) {
        c70 c70Var = this.f30247c;
        if (i10 == c70Var.U) {
            return 1;
        }
        c70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= c70Var.V && i10 < c70Var.W) {
            return 3;
        }
        if (i10 == c70Var.Y) {
            return 4;
        }
        if (i10 == c70Var.X) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        long j10;
        boolean z4;
        long j11;
        boolean z10;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19331id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19184id;
                } else {
                    j10 = 0;
                }
                c70 c70Var = this.f30247c;
                boolean z11 = false;
                if (i10 != c70Var.W) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                g4Var.e(E, null, null, z4);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f19331id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f19184id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = c70Var.Q;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (c70Var.f23865c0.h(j11) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j10 == j11) {
                        z11 = true;
                    }
                    g4Var.c(z10, z11);
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
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z4;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            c70 c70Var = this.f30247c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.j6.f20084n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        v60 v60Var = new v60(context, null, 0, null, 0);
                        v60Var.setLayoutParams(new f2.w0(-1, -1));
                        v60Var.e.setVisibility(8);
                        org.telegram.ui.fu fuVar = c70Var.f23872j0;
                        ih.s sVar = v60Var.d;
                        if (fuVar != null) {
                            sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            sVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        v60Var.setAnimateLayoutChange(true);
                        y4Var = v60Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (c70Var.f23872j0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z4);
            }
        } else {
            y4Var = new eg.h0(this, context, 13);
        }
        return new f2.l1(y4Var);
    }
}
