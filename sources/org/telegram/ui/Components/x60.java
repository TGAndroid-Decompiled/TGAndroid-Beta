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
public final class x60 extends ql0 {
    public final d70 f30518c;

    public x60(d70 d70Var) {
        this.f30518c = d70Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        d70 d70Var = this.f30518c;
        if (d70Var.f24197j0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) d70Var.f24198k0.get(i10 - d70Var.V);
            if (DialogObject.isUserDialog(dialog.f19163id)) {
                i12 = ((org.telegram.ui.ActionBar.g3) d70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f19163id));
            }
            i11 = ((org.telegram.ui.ActionBar.g3) d70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19163id));
        }
        return (TLObject) d70Var.f24189b0.get(i10 - d70Var.V);
    }

    @Override
    public final int h() {
        return this.f30518c.Z;
    }

    @Override
    public final int j(int i10) {
        d70 d70Var = this.f30518c;
        if (i10 == d70Var.U) {
            return 1;
        }
        d70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= d70Var.V && i10 < d70Var.W) {
            return 3;
        }
        if (i10 == d70Var.Y) {
            return 4;
        }
        if (i10 == d70Var.X) {
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
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                TLObject E = E(i10);
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19306id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19159id;
                } else {
                    j10 = 0;
                }
                d70 d70Var = this.f30518c;
                boolean z11 = false;
                if (i10 != d70Var.W) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                f4Var.e(E, null, null, z4);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f19306id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f19159id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = d70Var.Q;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        f4Var.c(true, false);
                        f4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (d70Var.f24190c0.h(j11) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j10 == j11) {
                        z11 = true;
                    }
                    f4Var.c(z10, z11);
                    f4Var.setCheckBoxEnabled(true);
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
        org.telegram.ui.Cells.x4 x4Var;
        boolean z4;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            d70 d70Var = this.f30518c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.j6.f20059n5;
                        x4Var2.a(i11, i11);
                        x4Var = x4Var2;
                    } else {
                        w60 w60Var = new w60(context, null, 0, null, 0);
                        w60Var.setLayoutParams(new f2.w0(-1, -1));
                        w60Var.e.setVisibility(8);
                        org.telegram.ui.hu huVar = d70Var.f24197j0;
                        ih.s sVar = w60Var.d;
                        if (huVar != null) {
                            sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            sVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        w60Var.setAnimateLayoutChange(true);
                        x4Var = w60Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (d70Var.f24197j0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                x4Var = new org.telegram.ui.Cells.f4(context, 1, 0, z4);
            }
        } else {
            x4Var = new eg.h0(this, context, 13);
        }
        return new f2.l1(x4Var);
    }
}
