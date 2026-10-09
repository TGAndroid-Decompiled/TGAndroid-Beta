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
public final class x70 extends pm0 {
    public final d80 f32762c;

    public x70(d80 d80Var) {
        this.f32762c = d80Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47662f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        d80 d80Var = this.f32762c;
        if (d80Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) d80Var.f25632n0.get(i10 - d80Var.Y);
            if (DialogObject.isUserDialog(dialog.f20042id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) d80Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20042id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) d80Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20042id));
        }
        return (TLObject) d80Var.f25624e0.get(i10 - d80Var.Y);
    }

    @Override
    public final int h() {
        return this.f32762c.f25622c0;
    }

    @Override
    public final int j(int i10) {
        d80 d80Var = this.f32762c;
        if (i10 == d80Var.X) {
            return 1;
        }
        d80Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= d80Var.Y && i10 < d80Var.Z) {
            return 3;
        }
        if (i10 == d80Var.f25621b0) {
            return 4;
        }
        if (i10 == d80Var.f25620a0) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        int i11 = d1Var.f47662f;
        View view = d1Var.f47658a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f20185id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20038id;
                } else {
                    j3 = 0;
                }
                d80 d80Var = this.f32762c;
                boolean z12 = false;
                if (i10 != d80Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f20185id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f20038id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = d80Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (d80Var.f25625f0.h(j10) >= 0) {
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            d80 d80Var = this.f32762c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.i6.f20981n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        w70 w70Var = new w70(context, null, 0, null, 0);
                        w70Var.setLayoutParams(new s4.q0(-1, -1));
                        w70Var.f24802e.setVisibility(8);
                        org.telegram.ui.gu guVar = d80Var.m0;
                        vh.n nVar = w70Var.d;
                        if (guVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        w70Var.setAnimateLayoutChange(true);
                        y4Var = w70Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (d80Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(1, 0, context, z10);
            }
        } else {
            y4Var = new ci.bb(this, context, 18);
        }
        return new s4.d1(y4Var);
    }
}
