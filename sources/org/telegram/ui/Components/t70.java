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
public final class t70 extends mm0 {
    public final z70 f32875c;

    public t70(z70 z70Var) {
        this.f32875c = z70Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        z70 z70Var = this.f32875c;
        if (z70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) z70Var.f35273n0.get(i10 - z70Var.Y);
            if (DialogObject.isUserDialog(dialog.f22032id)) {
                i12 = ((org.telegram.ui.ActionBar.k3) z70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f22032id));
            }
            i11 = ((org.telegram.ui.ActionBar.k3) z70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f22032id));
        }
        return (TLObject) z70Var.f35265e0.get(i10 - z70Var.Y);
    }

    @Override
    public final int h() {
        return this.f32875c.f35263c0;
    }

    @Override
    public final int j(int i10) {
        z70 z70Var = this.f32875c;
        if (i10 == z70Var.X) {
            return 1;
        }
        z70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= z70Var.Y && i10 < z70Var.Z) {
            return 3;
        }
        if (i10 == z70Var.f35262b0) {
            return 4;
        }
        if (i10 == z70Var.f35261a0) {
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
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                TLObject E = E(i10);
                Object object = k4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22177id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22028id;
                } else {
                    j10 = 0;
                }
                z70 z70Var = this.f32875c;
                boolean z12 = false;
                if (i10 != z70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f22177id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f22028id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = z70Var.T;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        k4Var.c(true, false);
                        k4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (z70Var.f35266f0.h(j11) >= 0) {
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
            z70 z70Var = this.f32875c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.c5 c5Var2 = new org.telegram.ui.Cells.c5(context);
                        c5Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.y6.f23540n5;
                        c5Var2.a(i11, i11);
                        c5Var = c5Var2;
                    } else {
                        s70 s70Var = new s70(0, 0, context, null, null);
                        s70Var.setLayoutParams(new s4.q0(-1, -1));
                        s70Var.e.setVisibility(8);
                        org.telegram.ui.st stVar = z70Var.m0;
                        xh.n nVar = s70Var.d;
                        if (stVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        s70Var.setAnimateLayoutChange(true);
                        c5Var = s70Var;
                    }
                } else {
                    c5Var = new View(context);
                }
            } else {
                if (z70Var.m0 != null) {
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
