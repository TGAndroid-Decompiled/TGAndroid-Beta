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
public final class v60 extends ll0 {
    public final b70 f28638c;

    public v60(b70 b70Var) {
        this.f28638c = b70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42705f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        b70 b70Var = this.f28638c;
        if (b70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) b70Var.f22637n0.get(i10 - b70Var.Y);
            if (DialogObject.isUserDialog(dialog.f18125id)) {
                i12 = ((org.telegram.ui.ActionBar.g3) b70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f18125id));
            }
            i11 = ((org.telegram.ui.ActionBar.g3) b70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18125id));
        }
        return (TLObject) b70Var.f22629e0.get(i10 - b70Var.Y);
    }

    @Override
    public final int h() {
        return this.f28638c.f22627c0;
    }

    @Override
    public final int j(int i10) {
        b70 b70Var = this.f28638c;
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
        if (i10 == b70Var.f22626b0) {
            return 4;
        }
        if (i10 == b70Var.f22625a0) {
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
        int i11 = c1Var.f42705f;
        View view = c1Var.f42702a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                TLObject E = E(i10);
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18268id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18121id;
                } else {
                    j3 = 0;
                }
                b70 b70Var = this.f28638c;
                boolean z12 = false;
                if (i10 != b70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f18268id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f18121id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = b70Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        f4Var.c(true, false);
                        f4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (b70Var.f22630f0.h(j10) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j3 == j10) {
                        z12 = true;
                    }
                    f4Var.c(z11, z12);
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.x4 x4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            b70 b70Var = this.f28638c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.j6.f19047n5;
                        x4Var2.a(i11, i11);
                        x4Var = x4Var2;
                    } else {
                        u60 u60Var = new u60(context, null, 0, null, 0);
                        u60Var.setLayoutParams(new s4.p0(-1, -1));
                        u60Var.e.setVisibility(8);
                        org.telegram.ui.gu guVar = b70Var.m0;
                        vh.o oVar = u60Var.d;
                        if (guVar != null) {
                            oVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            oVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        u60Var.setAnimateLayoutChange(true);
                        x4Var = u60Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (b70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x4Var = new org.telegram.ui.Cells.f4(context, 1, 0, z10);
            }
        } else {
            x4Var = new ci.eb(this, context, 18);
        }
        return new s4.c1(x4Var);
    }
}
