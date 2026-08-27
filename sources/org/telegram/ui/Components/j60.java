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

public final class j60 extends yk0 {

    public final p60 f29637c;

    public j60(p60 p60Var) {
        this.f29637c = p60Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        p60 p60Var = this.f29637c;
        if (p60Var.f31522i0 == null) {
            return (TLObject) p60Var.f31514a0.get(i10 - p60Var.U);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) p60Var.f31523j0.get(i10 - p60Var.U);
        return DialogObject.isUserDialog(dialog.f22384id) ? MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) p60Var).currentAccount).getUser(Long.valueOf(dialog.f22384id)) : MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) p60Var).currentAccount).getChat(Long.valueOf(-dialog.f22384id));
    }

    @Override
    public final int h() {
        return this.f29637c.Y;
    }

    @Override
    public final int j(int i10) {
        p60 p60Var = this.f29637c;
        if (i10 == p60Var.T) {
            return 1;
        }
        p60Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= p60Var.U && i10 < p60Var.V) {
            return 3;
        }
        if (i10 == p60Var.X) {
            return 4;
        }
        return i10 == p60Var.W ? 5 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        long j10;
        long j11;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 2) {
            view.requestLayout();
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        TLObject tLObjectE = E(i10);
        Object object = d4Var.getObject();
        if (object instanceof TLRPC.User) {
            j10 = ((TLRPC.User) object).f22527id;
        } else {
            j10 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).f22380id : 0L;
        }
        p60 p60Var = this.f29637c;
        d4Var.e(tLObjectE, null, null, i10 != p60Var.V);
        if (tLObjectE instanceof TLRPC.User) {
            j11 = ((TLRPC.User) tLObjectE).f22527id;
        } else {
            j11 = tLObjectE instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObjectE).f22380id : 0L;
        }
        if (j11 != 0) {
            a0.h hVar = p60Var.P;
            if (hVar == null || hVar.h(j11) < 0) {
                d4Var.c(p60Var.f31515b0.h(j11) >= 0, j10 == j11);
                d4Var.setCheckBoxEnabled(true);
            } else {
                d4Var.c(true, false);
                d4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s0Var;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            p60 p60Var = this.f29637c;
            if (i10 == 3) {
                s0Var = new org.telegram.ui.Cells.d4(context, 1, 0, p60Var.f31522i0 != null);
            } else if (i10 == 4) {
                s0Var = new View(context);
            } else if (i10 != 5) {
                org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
                v4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, true);
                int i11 = org.telegram.ui.ActionBar.g6.f23233n5;
                v4Var.a(i11, i11);
                s0Var = v4Var;
            } else {
                i60 i60Var = new i60(context, null, 0, null, 0);
                i60Var.setLayoutParams(new f2.y0(-1, -1));
                i60Var.f29506e.setVisibility(8);
                org.telegram.ui.zt ztVar = p60Var.f31522i0;
                eh.s sVar = i60Var.d;
                if (ztVar != null) {
                    sVar.setText(LocaleController.getString(R.string.FilterNoChats));
                } else {
                    sVar.setText(LocaleController.getString(R.string.NoContacts));
                }
                i60Var.setAnimateLayoutChange(true);
                s0Var = i60Var;
            }
        } else {
            s0Var = new ag.s0(this, context, 17);
        }
        return new lk0(s0Var);
    }
}
