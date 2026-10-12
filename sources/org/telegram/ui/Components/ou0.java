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
public final class ou0 extends lm0 {
    public final Context f28059c;
    public final hg.a2 e;
    public nu0 f28060f;
    public final TLRPC.Chat f28061n;
    public final xv0 f28063s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f28062r = 0;

    public ou0(xv0 xv0Var, Context context) {
        this.f28063s = xv0Var;
        this.f28059c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.e = a2Var;
        a2Var.f10484a = new mu0(this);
        this.f28061n = xv0Var.D1.g();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.e;
        int size = a2Var.f10488g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) a2Var.f10488g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f28060f != null) {
            Utilities.searchQueue.cancelRunnable(this.f28060f);
            this.f28060f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        hg.a2 a2Var = this.e;
        if (ChatObject.isChannel(this.f28061n)) {
            j10 = this.f28061n.f19216id;
        } else {
            j10 = 0;
        }
        a2Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f28063s.f31364k0;
            if (i10 >= qu0VarArr.length) {
                break;
            }
            if (qu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f28063s.f31364k0[i10].f28682w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nu0 nu0Var = new nu0(this, str, 0);
            this.f28060f = nu0Var;
            dispatchQueue.postRunnable(nu0Var, 300L);
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
        int size = this.e.f10488g.size();
        this.h = size;
        if (size > 0) {
            xv0 xv0Var = this.f28063s;
            if (xv0Var.V0) {
                qu0 qu0Var = xv0Var.f31364k0[0];
                if (qu0Var.F == 7 && qu0Var.h.getAdapter() != this) {
                    xv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        xv0 xv0Var = this.f28063s;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        hg.a2 a2Var = this.e;
        a2Var.f10488g.size();
        String str = a2Var.f10494n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(xv0Var.h0(org.telegram.ui.ActionBar.g6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.f28063s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f28059c, xv0Var.F1, true);
        b5Var.setBackgroundColor(xv0Var.h0(org.telegram.ui.ActionBar.g6.f19901d6));
        b5Var.setDelegate(new mu0(this));
        return new s4.b1(b5Var);
    }
}
