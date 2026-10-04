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
public final class j70 extends yl0 {
    public final p70 f27615c;

    public j70(p70 p70Var) {
        this.f27615c = p70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46527f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        p70 p70Var = this.f27615c;
        if (p70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) p70Var.f29541n0.get(i10 - p70Var.Y);
            if (DialogObject.isUserDialog(dialog.f20041id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) p70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20041id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) p70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20041id));
        }
        return (TLObject) p70Var.f29533e0.get(i10 - p70Var.Y);
    }

    @Override
    public final int h() {
        return this.f27615c.f29531c0;
    }

    @Override
    public final int j(int i10) {
        p70 p70Var = this.f27615c;
        if (i10 == p70Var.X) {
            return 1;
        }
        p70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= p70Var.Y && i10 < p70Var.Z) {
            return 3;
        }
        if (i10 == p70Var.f29530b0) {
            return 4;
        }
        if (i10 == p70Var.f29529a0) {
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
        int i11 = c1Var.f46527f;
        View view = c1Var.f46523a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f20184id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20037id;
                } else {
                    j3 = 0;
                }
                p70 p70Var = this.f27615c;
                boolean z12 = false;
                if (i10 != p70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f20184id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f20037id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = p70Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (p70Var.f29534f0.h(j10) >= 0) {
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
            p70 p70Var = this.f27615c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.i6.f21002n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        i70 i70Var = new i70(context, null, 0, null, 0);
                        i70Var.setLayoutParams(new s4.p0(-1, -1));
                        i70Var.f31194e.setVisibility(8);
                        org.telegram.ui.bu buVar = p70Var.m0;
                        vh.n nVar = i70Var.d;
                        if (buVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        i70Var.setAnimateLayoutChange(true);
                        y4Var = i70Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (p70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z10);
            }
        } else {
            y4Var = new ci.ab(this, context, 18);
        }
        return new s4.c1(y4Var);
    }
}
