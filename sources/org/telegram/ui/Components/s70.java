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
public final class s70 extends lm0 {
    public final y70 f32446c;

    public s70(y70 y70Var) {
        this.f32446c = y70Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        y70 y70Var = this.f32446c;
        if (y70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) y70Var.f34953n0.get(i10 - y70Var.Y);
            if (DialogObject.isUserDialog(dialog.f22031id)) {
                i12 = ((org.telegram.ui.ActionBar.k3) y70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f22031id));
            }
            i11 = ((org.telegram.ui.ActionBar.k3) y70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f22031id));
        }
        return (TLObject) y70Var.f34945e0.get(i10 - y70Var.Y);
    }

    @Override
    public final int h() {
        return this.f32446c.f34943c0;
    }

    @Override
    public final int j(int i10) {
        y70 y70Var = this.f32446c;
        if (i10 == y70Var.X) {
            return 1;
        }
        y70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= y70Var.Y && i10 < y70Var.Z) {
            return 3;
        }
        if (i10 == y70Var.f34942b0) {
            return 4;
        }
        if (i10 == y70Var.f34941a0) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i11 = e1Var.f47738f;
        View view = e1Var.f47735a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                TLObject E = E(i10);
                Object object = k4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22174id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22027id;
                } else {
                    j10 = 0;
                }
                y70 y70Var = this.f32446c;
                boolean z12 = false;
                if (i10 != y70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f22174id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f22027id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = y70Var.T;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        k4Var.c(true, false);
                        k4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (y70Var.f34946f0.h(j11) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j10 == j11) {
                        z12 = true;
                    }
                    k4Var.c(z11, z12);
                    k4Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.c5 c5Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            y70 y70Var = this.f32446c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.c5 c5Var2 = new org.telegram.ui.Cells.c5(context);
                        c5Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.y6.f23537n5;
                        c5Var2.a(i11, i11);
                        c5Var = c5Var2;
                    } else {
                        r70 r70Var = new r70(0, 0, context, null, null);
                        r70Var.setLayoutParams(new s4.q0(-1, -1));
                        r70Var.e.setVisibility(8);
                        org.telegram.ui.qt qtVar = y70Var.m0;
                        xh.n nVar = r70Var.d;
                        if (qtVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        r70Var.setAnimateLayoutChange(true);
                        c5Var = r70Var;
                    }
                } else {
                    c5Var = new View(context);
                }
            } else {
                if (y70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c5Var = new org.telegram.ui.Cells.k4(context, 1, 0, z10);
            }
        } else {
            c5Var = new bi.cc(this, context, 18);
        }
        return new s4.e1(c5Var);
    }
}
