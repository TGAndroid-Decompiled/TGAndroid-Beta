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
public final class r60 extends il0 {
    public final x60 f32226c;

    public r60(x60 x60Var) {
        this.f32226c = x60Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        x60 x60Var = this.f32226c;
        if (x60Var.f34612i0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) x60Var.f34613j0.get(i10 - x60Var.U);
            if (DialogObject.isUserDialog(dialog.f22396id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) x60Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f22396id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) x60Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f22396id));
        }
        return (TLObject) x60Var.f34604a0.get(i10 - x60Var.U);
    }

    @Override
    public final int h() {
        return this.f32226c.Y;
    }

    @Override
    public final int j(int i10) {
        x60 x60Var = this.f32226c;
        if (i10 == x60Var.T) {
            return 1;
        }
        x60Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= x60Var.U && i10 < x60Var.V) {
            return 3;
        }
        if (i10 == x60Var.X) {
            return 4;
        }
        if (i10 == x60Var.W) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                TLObject E = E(i10);
                Object object = e4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22539id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22392id;
                } else {
                    j10 = 0;
                }
                x60 x60Var = this.f32226c;
                boolean z12 = false;
                if (i10 != x60Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f22539id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f22392id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = x60Var.P;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        e4Var.c(true, false);
                        e4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (x60Var.f34605b0.h(j11) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j10 == j11) {
                        z12 = true;
                    }
                    e4Var.c(z11, z12);
                    e4Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w4 w4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            x60 x60Var = this.f32226c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.w4 w4Var2 = new org.telegram.ui.Cells.w4(context);
                        w4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.g6.f23240n5;
                        w4Var2.a(i11, i11);
                        w4Var = w4Var2;
                    } else {
                        q60 q60Var = new q60(context, null, 0, null, 0);
                        q60Var.setLayoutParams(new f2.x0(-1, -1));
                        q60Var.f32122e.setVisibility(8);
                        org.telegram.ui.xt xtVar = x60Var.f34612i0;
                        gh.s sVar = q60Var.d;
                        if (xtVar != null) {
                            sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            sVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        q60Var.setAnimateLayoutChange(true);
                        w4Var = q60Var;
                    }
                } else {
                    w4Var = new View(context);
                }
            } else {
                if (x60Var.f34612i0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w4Var = new org.telegram.ui.Cells.e4(context, 1, 0, z10);
            }
        } else {
            w4Var = new cg.h0(this, context, 15);
        }
        return new f2.n1(w4Var);
    }
}
