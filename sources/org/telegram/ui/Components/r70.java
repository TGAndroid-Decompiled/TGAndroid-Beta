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
public final class r70 extends lm0 {
    public final x70 f30113c;

    public r70(x70 x70Var) {
        this.f30113c = x70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        x70 x70Var = this.f30113c;
        if (x70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) x70Var.f32463n0.get(i10 - x70Var.Y);
            if (DialogObject.isUserDialog(dialog.f20347id)) {
                i12 = ((org.telegram.ui.ActionBar.h3) x70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20347id));
            }
            i11 = ((org.telegram.ui.ActionBar.h3) x70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20347id));
        }
        return (TLObject) x70Var.f32455e0.get(i10 - x70Var.Y);
    }

    @Override
    public final int h() {
        return this.f30113c.f32453c0;
    }

    @Override
    public final int j(int i10) {
        x70 x70Var = this.f30113c;
        if (i10 == x70Var.X) {
            return 1;
        }
        x70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= x70Var.Y && i10 < x70Var.Z) {
            return 3;
        }
        if (i10 == x70Var.f32452b0) {
            return 4;
        }
        if (i10 == x70Var.f32451a0) {
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
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                TLObject E = E(i10);
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f20490id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20343id;
                } else {
                    j10 = 0;
                }
                x70 x70Var = this.f30113c;
                boolean z12 = false;
                if (i10 != x70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f20490id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f20343id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = x70Var.T;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        f4Var.c(true, false);
                        f4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (x70Var.f32456f0.h(j11) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j10 == j11) {
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.x4 x4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            x70 x70Var = this.f30113c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.k6.f21365n5;
                        x4Var2.a(i11, i11);
                        x4Var = x4Var2;
                    } else {
                        q70 q70Var = new q70(0, 0, context, null, null);
                        q70Var.setLayoutParams(new s4.o0(-1, -1));
                        q70Var.e.setVisibility(8);
                        org.telegram.ui.xt xtVar = x70Var.m0;
                        wh.n nVar = q70Var.d;
                        if (xtVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        q70Var.setAnimateLayoutChange(true);
                        x4Var = q70Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (x70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x4Var = new org.telegram.ui.Cells.f4(context, 1, 0, z10);
            }
        } else {
            x4Var = new ai.jc(this, context, 18);
        }
        return new s4.b1(x4Var);
    }
}
