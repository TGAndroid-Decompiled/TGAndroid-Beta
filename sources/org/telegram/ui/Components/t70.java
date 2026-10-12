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
    public final a80 f29288c;

    public t70(a80 a80Var) {
        this.f29288c = a80Var;
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
        a80 a80Var = this.f29288c;
        if (a80Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) a80Var.f23478n0.get(i10 - a80Var.Y);
            if (DialogObject.isUserDialog(dialog.f19220id)) {
                i12 = ((org.telegram.ui.ActionBar.e3) a80Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f19220id));
            }
            i11 = ((org.telegram.ui.ActionBar.e3) a80Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f19220id));
        }
        return (TLObject) a80Var.f23470e0.get(i10 - a80Var.Y);
    }

    @Override
    public final int h() {
        return this.f29288c.f23468c0;
    }

    @Override
    public final int j(int i10) {
        a80 a80Var = this.f29288c;
        if (i10 == a80Var.X) {
            return 1;
        }
        a80Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= a80Var.Y && i10 < a80Var.Z) {
            return 3;
        }
        if (i10 == a80Var.f23467b0) {
            return 4;
        }
        if (i10 == a80Var.f23466a0) {
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
                    j10 = ((TLRPC.User) object).f19363id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19216id;
                } else {
                    j10 = 0;
                }
                a80 a80Var = this.f29288c;
                boolean z12 = false;
                if (i10 != a80Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f19363id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f19216id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = a80Var.T;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (a80Var.f23471f0.h(j11) >= 0) {
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
            a80 a80Var = this.f29288c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.g6.f20083n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        s70 s70Var = new s70(context, null, 0, null, 0);
                        s70Var.setLayoutParams(new s4.o0(-1, -1));
                        s70Var.e.setVisibility(8);
                        org.telegram.ui.mu muVar = a80Var.m0;
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
                if (a80Var.m0 != null) {
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
