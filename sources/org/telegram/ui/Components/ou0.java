package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
    public final Context f29315c;
    public final hg.a2 e;
    public nu0 f29316f;
    public final TLRPC.Chat f29317n;
    public final xv0 f29319s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f29318r = 0;

    public ou0(xv0 xv0Var, Context context) {
        this.f29319s = xv0Var;
        this.f29315c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.e = a2Var;
        a2Var.f11819a = new mu0(this);
        this.f29317n = xv0Var.D1.g();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.e;
        int size = a2Var.f11823g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) a2Var.f11823g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f29316f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29316f);
            this.f29316f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        hg.a2 a2Var = this.e;
        if (ChatObject.isChannel(this.f29317n)) {
            j10 = this.f29317n.f20343id;
        } else {
            j10 = 0;
        }
        a2Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f29319s.f32687k0;
            if (i10 >= qu0VarArr.length) {
                break;
            }
            if (qu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f29319s.f32687k0[i10].f30006w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nu0 nu0Var = new nu0(this, str, 0);
            this.f29316f = nu0Var;
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
        int size = this.e.f11823g.size();
        this.h = size;
        if (size > 0) {
            xv0 xv0Var = this.f29319s;
            if (xv0Var.V0) {
                qu0 qu0Var = xv0Var.f32687k0[0];
                if (qu0Var.F == 7 && qu0Var.h.getAdapter() != this) {
                    xv0Var.p1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        xv0 xv0Var = this.f29319s;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        hg.a2 a2Var = this.e;
        a2Var.f11823g.size();
        String str = a2Var.f11829n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new m10(org.telegram.ui.ActionBar.k6.q6, xv0Var.F1), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.c(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.f29319s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f29315c, xv0Var.F1, true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, a5Var, xv0Var.F1);
        a5Var.setDelegate(new mu0(this));
        return new s4.b1(a5Var);
    }
}
