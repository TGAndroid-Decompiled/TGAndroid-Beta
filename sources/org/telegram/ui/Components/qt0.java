package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qt0 extends ll0 {
    public final Context f27400c;
    public final gg.c2 e;
    public pt0 f27401f;
    public final TLRPC.Chat f27402n;
    public final zu0 f27404s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27403r = 0;

    public qt0(zu0 zu0Var, Context context) {
        this.f27404s = zu0Var;
        this.f27400c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9690a = new ot0(this);
        this.f27402n = zu0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42697a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.e;
        int size = c2Var.f9694g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) c2Var.f9694g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f27401f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27401f);
            this.f27401f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f27402n)) {
            j3 = this.f27402n.f18121id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            st0[] st0VarArr = this.f27404s.f30632k0;
            if (i10 >= st0VarArr.length) {
                break;
            }
            if (st0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f27404s.f30632k0[i10].f27924w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            pt0 pt0Var = new pt0(this, str, 0);
            this.f27401f = pt0Var;
            dispatchQueue.postRunnable(pt0Var, 300L);
        }
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        return 22;
    }

    @Override
    public final void l() {
        int size = this.e.f9694g.size();
        this.h = size;
        if (size > 0) {
            zu0 zu0Var = this.f27404s;
            if (zu0Var.V0) {
                st0 st0Var = zu0Var.f30632k0[0];
                if (st0Var.F == 7 && st0Var.h.getAdapter() != this) {
                    zu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        zu0 zu0Var = this.f27404s;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.c2 c2Var = this.e;
        c2Var.f9694g.size();
        String str = c2Var.f9700n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(zu0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f42697a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.f27404s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f27400c, zu0Var.F1, true);
        a5Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.j6.f18862d6));
        a5Var.setDelegate(new ot0(this));
        return new s4.c1(a5Var);
    }
}
