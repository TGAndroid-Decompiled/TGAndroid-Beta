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
public final class t70 extends lm0 {
    public final z70 f28985c;

    public t70(z70 z70Var) {
        this.f28985c = z70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        z70 z70Var = this.f28985c;
        if (z70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) z70Var.f31485n0.get(i10 - z70Var.Y);
            if (DialogObject.isUserDialog(dialog.f18920id)) {
                i12 = ((org.telegram.ui.ActionBar.e3) z70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f18920id));
            }
            i11 = ((org.telegram.ui.ActionBar.e3) z70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18920id));
        }
        return (TLObject) z70Var.f31477e0.get(i10 - z70Var.Y);
    }

    @Override
    public final int h() {
        return this.f28985c.f31475c0;
    }

    @Override
    public final int j(int i10) {
        z70 z70Var = this.f28985c;
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
        if (i10 == z70Var.f31474b0) {
            return 4;
        }
        if (i10 == z70Var.f31473a0) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19063id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f18916id;
                } else {
                    j10 = 0;
                }
                z70 z70Var = this.f28985c;
                boolean z12 = false;
                if (i10 != z70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f19063id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f18916id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = z70Var.T;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (z70Var.f31478f0.h(j11) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j10 == j11) {
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            z70 z70Var = this.f28985c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.g6.f19783n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        s70 s70Var = new s70(context, null, 0, null, 0);
                        s70Var.setLayoutParams(new s4.o0(-1, -1));
                        s70Var.e.setVisibility(8);
                        org.telegram.ui.mu muVar = z70Var.m0;
                        wh.n nVar = s70Var.d;
                        if (muVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        s70Var.setAnimateLayoutChange(true);
                        y4Var = s70Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (z70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(1, 0, context, z10);
            }
        } else {
            y4Var = new di.ab(this, context, 18);
        }
        return new s4.b1(y4Var);
    }
}
