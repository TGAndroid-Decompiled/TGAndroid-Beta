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
public final class hu0 extends yl0 {
    public final Context f27328c;
    public final gg.c2 f27329e;
    public gu0 f27330f;
    public final TLRPC.Chat f27331n;
    public final qv0 f27333s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27332r = 0;

    public hu0(qv0 qv0Var, Context context) {
        this.f27333s = qv0Var;
        this.f27328c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.f27329e = c2Var;
        c2Var.f10532a = new fu0(this);
        this.f27331n = qv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46538a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.f27329e;
        int size = c2Var.f10537g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) c2Var.f10537g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f27330f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27330f);
            this.f27330f = null;
        }
        this.d.clear();
        this.f27329e.f(null, null);
        gg.c2 c2Var = this.f27329e;
        if (ChatObject.isChannel(this.f27331n)) {
            j3 = this.f27331n.f20047id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            ju0[] ju0VarArr = this.f27333s.f30239k0;
            if (i10 >= ju0VarArr.length) {
                break;
            }
            if (ju0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f27333s.f30239k0[i10].f27979w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            gu0 gu0Var = new gu0(this, str, 0);
            this.f27330f = gu0Var;
            dispatchQueue.postRunnable(gu0Var, 300L);
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
        int size = this.f27329e.f10537g.size();
        this.h = size;
        if (size > 0) {
            qv0 qv0Var = this.f27333s;
            if (qv0Var.V0) {
                ju0 ju0Var = qv0Var.f30239k0[0];
                if (ju0Var.F == 7 && ju0Var.h.getAdapter() != this) {
                    qv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        qv0 qv0Var = this.f27333s;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.c2 c2Var = this.f27329e;
        c2Var.f10537g.size();
        String str = c2Var.f10543n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(qv0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f46538a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var = this.f27333s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f27328c, qv0Var.F1, true);
        b5Var.setBackgroundColor(qv0Var.h0(org.telegram.ui.ActionBar.i6.f20827d6));
        b5Var.setDelegate(new fu0(this));
        return new s4.c1(b5Var);
    }
}
