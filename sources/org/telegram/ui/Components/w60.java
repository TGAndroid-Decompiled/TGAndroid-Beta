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
public final class w60 extends ll0 {
    public final c70 f29555c;

    public w60(c70 c70Var) {
        this.f29555c = c70Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        int i11;
        int i12;
        c70 c70Var = this.f29555c;
        if (c70Var.m0 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) c70Var.f22963n0.get(i10 - c70Var.Y);
            if (DialogObject.isUserDialog(dialog.f18087id)) {
                i12 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
                return MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.f18087id));
            }
            i11 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            return MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.f18087id));
        }
        return (TLObject) c70Var.f22955e0.get(i10 - c70Var.Y);
    }

    @Override
    public final int h() {
        return this.f29555c.f22953c0;
    }

    @Override
    public final int j(int i10) {
        c70 c70Var = this.f29555c;
        if (i10 == c70Var.X) {
            return 1;
        }
        c70Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= c70Var.Y && i10 < c70Var.Z) {
            return 3;
        }
        if (i10 == c70Var.f22952b0) {
            return 4;
        }
        if (i10 == c70Var.f22951a0) {
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
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                TLObject E = E(i10);
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f18230id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18083id;
                } else {
                    j3 = 0;
                }
                c70 c70Var = this.f29555c;
                boolean z12 = false;
                if (i10 != c70Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f18230id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f18083id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.i iVar = c70Var.T;
                    if (iVar != null && iVar.h(j10) >= 0) {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (c70Var.f22956f0.h(j10) >= 0) {
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
            c70 c70Var = this.f29555c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(context);
                        y4Var2.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                        int i11 = org.telegram.ui.ActionBar.h6.f18972n5;
                        y4Var2.a(i11, i11);
                        y4Var = y4Var2;
                    } else {
                        v60 v60Var = new v60(context, null, 0, null, 0);
                        v60Var.setLayoutParams(new s4.p0(-1, -1));
                        v60Var.e.setVisibility(8);
                        org.telegram.ui.eu euVar = c70Var.m0;
                        vh.o oVar = v60Var.d;
                        if (euVar != null) {
                            oVar.setText(LocaleController.getString(R.string.FilterNoChats));
                        } else {
                            oVar.setText(LocaleController.getString(R.string.NoContacts));
                        }
                        v60Var.setAnimateLayoutChange(true);
                        y4Var = v60Var;
                    }
                } else {
                    y4Var = new View(context);
                }
            } else {
                if (c70Var.m0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var = new org.telegram.ui.Cells.g4(context, 1, 0, z10);
            }
        } else {
            y4Var = new ci.bb(this, context, 18);
        }
        return new s4.c1(y4Var);
    }
}
