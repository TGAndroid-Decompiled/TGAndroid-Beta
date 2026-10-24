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
public final class p70 extends km0 {
    public final v70 f29503c;

    public p70(v70 v70Var) {
        this.f29503c = v70Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        v70 v70Var = this.f29503c;
        if (v70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) v70Var.f31358n0.get(i10 - v70Var.Y);
            if (DialogObject.isUserDialog(dialog.f20348id)) {
                i12 = ((org.telegram.ui.ActionBar.h3) v70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f20348id));
            }
            i11 = ((org.telegram.ui.ActionBar.h3) v70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f20348id));
        }
        return (TLObject) v70Var.f31350e0.get(i10 - v70Var.Y);
    }

    @Override
    public final int h() {
        return this.f29503c.f31348c0;
    }

    @Override
    public final int j(int i10) {
        v70 v70Var = this.f29503c;
        if (i10 == v70Var.X) {
            return 1;
        }
        v70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= v70Var.Y && i10 < v70Var.Z) {
            return 3;
        }
        if (i10 == v70Var.f31347b0) {
            return 4;
        }
        if (i10 == v70Var.f31346a0) {
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
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                TLObject E = E(i10);
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f20491id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20344id;
                } else {
                    j10 = 0;
                }
                v70 v70Var = this.f29503c;
                boolean z12 = false;
                if (i10 != v70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f20491id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f20344id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = v70Var.T;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        f4Var.c(true, false);
                        f4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (v70Var.f31351f0.h(j11) >= 0) {
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
            v70 v70Var = this.f29503c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.k6.f21366n5;
                        x4Var2.a(i11, i11);
                        x4Var = x4Var2;
                    } else {
                        o70 o70Var = new o70(0, 0, context, null, null);
                        o70Var.setLayoutParams(new s4.o0(-1, -1));
                        o70Var.e.setVisibility(8);
                        org.telegram.ui.xt xtVar = v70Var.m0;
                        wh.n nVar = o70Var.d;
                        if (xtVar != null) {
                            nVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            nVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        o70Var.setAnimateLayoutChange(true);
                        x4Var = o70Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (v70Var.m0 != null) {
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
