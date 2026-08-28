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
public final class e60 extends vk0 {
    public final k60 f27962c;

    public e60(k60 k60Var) {
        this.f27962c = k60Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 3 || i9 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i9) {
        int i10;
        int i11;
        k60 k60Var = this.f27962c;
        if (k60Var.f29982i0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) k60Var.f29983j0.get(i9 - k60Var.U);
            if (DialogObject.isUserDialog(dialog.f22384id)) {
                i11 = ((org.telegram.ui.ActionBar.f3) k60Var).currentAccount;
                return MessagesController.getInstance(i11).getUser(Long.valueOf(dialog.f22384id));
            }
            i10 = ((org.telegram.ui.ActionBar.f3) k60Var).currentAccount;
            return MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22384id));
        }
        return (TLObject) k60Var.f29974a0.get(i9 - k60Var.U);
    }

    @Override
    public final int h() {
        return this.f27962c.Y;
    }

    @Override
    public final int j(int i9) {
        k60 k60Var = this.f27962c;
        if (i9 == k60Var.T) {
            return 1;
        }
        k60Var.getClass();
        if (i9 == 0) {
            return 2;
        }
        if (i9 >= k60Var.U && i9 < k60Var.V) {
            return 3;
        }
        if (i9 == k60Var.X) {
            return 4;
        }
        if (i9 == k60Var.W) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i9);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f22527id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22380id;
                } else {
                    j10 = 0;
                }
                k60 k60Var = this.f27962c;
                boolean z12 = false;
                if (i9 != k60Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f22527id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f22380id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = k60Var.P;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (k60Var.f29975b0.h(j11) >= 0) {
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
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.y4 y4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i9 != 2) {
            k60 k60Var = this.f27962c;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i10 = org.telegram.ui.ActionBar.f6.f23178n5;
                        y4Var2.a(i10, i10);
                        y4Var = y4Var2;
                    } else {
                        d60 d60Var = new d60(context, null, 0, null, 0);
                        d60Var.setLayoutParams(new f2.a1(-1, -1));
                        d60Var.f28885e.setVisibility(8);
                        org.telegram.ui.wt wtVar = k60Var.f29982i0;
                        dh.u uVar = d60Var.d;
                        if (wtVar != null) {
                            uVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            uVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        d60Var.setAnimateLayoutChange(true);
                        y4Var = d60Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (k60Var.f29982i0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z10);
            }
        } else {
            y4Var = new fh.l2(this, context, 17);
        }
        return new f2.q1(y4Var);
    }
}
