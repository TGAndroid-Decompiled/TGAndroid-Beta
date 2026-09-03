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
public final class y60 extends rl0 {
    public final e70 f33399c;

    public y60(e70 e70Var) {
        this.f33399c = e70Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        e70 e70Var = this.f33399c;
        if (e70Var.f26476j0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) e70Var.f26477k0.get(i10 - e70Var.V);
            if (DialogObject.isUserDialog(dialog.f20849id)) {
                i12 = ((org.telegram.ui.ActionBar.h3) e70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20849id));
            }
            i11 = ((org.telegram.ui.ActionBar.h3) e70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20849id));
        }
        return (TLObject) e70Var.f26468b0.get(i10 - e70Var.V);
    }

    @Override
    public final int h() {
        return this.f33399c.Z;
    }

    @Override
    public final int j(int i10) {
        e70 e70Var = this.f33399c;
        if (i10 == e70Var.U) {
            return 1;
        }
        e70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= e70Var.V && i10 < e70Var.W) {
            return 3;
        }
        if (i10 == e70Var.Y) {
            return 4;
        }
        if (i10 == e70Var.X) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        long j10;
        boolean z4;
        long j11;
        boolean z10;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f20992id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20845id;
                } else {
                    j10 = 0;
                }
                e70 e70Var = this.f33399c;
                boolean z11 = false;
                if (i10 != e70Var.W) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                g4Var.e(E, null, null, z4);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f20992id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f20845id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = e70Var.Q;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (e70Var.f26469c0.h(j11) >= 0) {
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
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z4;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            e70 e70Var = this.f33399c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.k6.f21840n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        x60 x60Var = new x60(context, null, 0, null, 0);
                        x60Var.setLayoutParams(new f2.x0(-1, -1));
                        x60Var.f34033e.setVisibility(8);
                        org.telegram.ui.gu guVar = e70Var.f26476j0;
                        jh.s sVar = x60Var.d;
                        if (guVar != null) {
                            sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            sVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        x60Var.setAnimateLayoutChange(true);
                        y4Var = x60Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (e70Var.f26476j0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z4);
            }
        } else {
            y4Var = new fg.h0(this, context, 13);
        }
        return new f2.m1(y4Var);
    }
}
