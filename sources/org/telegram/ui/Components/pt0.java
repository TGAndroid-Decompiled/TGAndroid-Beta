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
public final class pt0 extends sl0 {
    public final Context f30198c;
    public final uf.k1 f30199e;
    public ot0 f30200f;
    public final TLRPC.Chat f30201n;
    public final zu0 f30203s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f30202r = 0;

    public pt0(zu0 zu0Var, Context context) {
        this.f30203s = zu0Var;
        this.f30198c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.f30199e = k1Var;
        k1Var.f48618a = new nt0(this);
        this.f30201n = zu0Var.A1.g();
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        uf.k1 k1Var = this.f30199e;
        int size = k1Var.f48623g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) k1Var.f48623g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z4) {
        long j10;
        if (this.f30200f != null) {
            Utilities.searchQueue.cancelRunnable(this.f30200f);
            this.f30200f = null;
        }
        this.d.clear();
        this.f30199e.f(null, null);
        uf.k1 k1Var = this.f30199e;
        if (ChatObject.isChannel(this.f30201n)) {
            j10 = this.f30201n.f20843id;
        } else {
            j10 = 0;
        }
        k1Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f30203s.f33980h0;
            if (i10 >= rt0VarArr.length) {
                break;
            }
            if (rt0VarArr[i10].C == 7 && !TextUtils.isEmpty(str)) {
                this.f30203s.f33980h0[i10].f30852w.e(true, z4);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ot0 ot0Var = new ot0(this, str, 0);
            this.f30200f = ot0Var;
            dispatchQueue.postRunnable(ot0Var, 300L);
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
        int size = this.f30199e.f48623g.size();
        this.h = size;
        if (size > 0) {
            zu0 zu0Var = this.f30203s;
            if (zu0Var.S0) {
                rt0 rt0Var = zu0Var.f33980h0[0];
                if (rt0Var.C == 7 && rt0Var.h.getAdapter() != this) {
                    zu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        zu0 zu0Var = this.f30203s;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        uf.k1 k1Var = this.f30199e;
        k1Var.f48623g.size();
        String str = k1Var.f48629n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(zu0Var.h0(org.telegram.ui.ActionBar.k6.f21894q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.f30203s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f30198c, zu0Var.C1, true);
        b5Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.f21659d6));
        b5Var.setDelegate(new nt0(this));
        return new f2.m1(b5Var);
    }
}
