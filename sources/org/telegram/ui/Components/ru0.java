package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ru0 extends lm0 {
    public final Context f32335c;
    public final ig.a2 e;
    public qu0 f32336f;
    public final TLRPC.Chat f32337n;
    public final aw0 f32339s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f32338r = 0;

    public ru0(aw0 aw0Var, Context context) {
        this.f32339s = aw0Var;
        this.f32335c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.e = a2Var;
        a2Var.f13988a = new pu0(this);
        this.f32337n = aw0Var.F1.g();
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        ig.a2 a2Var = this.e;
        int size = a2Var.f13992g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) a2Var.f13992g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f32336f != null) {
            Utilities.searchQueue.cancelRunnable(this.f32336f);
            this.f32336f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        ig.a2 a2Var = this.e;
        if (ChatObject.isChannel(this.f32337n)) {
            j10 = this.f32337n.f22027id;
        } else {
            j10 = 0;
        }
        a2Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            tu0[] tu0VarArr = this.f32339s.m0;
            if (i10 >= tu0VarArr.length) {
                break;
            }
            if (tu0VarArr[i10].E == 7 && !TextUtils.isEmpty(str)) {
                this.f32339s.m0[i10].v.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            qu0 qu0Var = new qu0(this, str, 0);
            this.f32336f = qu0Var;
            dispatchQueue2.postRunnable(qu0Var, 300L);
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
        int size = this.e.f13992g.size();
        this.h = size;
        if (size > 0) {
            aw0 aw0Var = this.f32339s;
            if (aw0Var.X0) {
                tu0 tu0Var = aw0Var.m0[0];
                if (tu0Var.E == 7 && tu0Var.h.getAdapter() != this) {
                    aw0Var.v1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        aw0 aw0Var = this.f32339s;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26704x1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = r2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = r2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        ig.a2 a2Var = this.e;
        a2Var.f13992g.size();
        String str = a2Var.f13998n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23597q6, aw0Var.H1), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
            f5Var.setTag(Integer.valueOf(i10));
            f5Var.c(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        aw0 aw0Var = this.f32339s;
        org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(9, 5, this.f32335c, aw0Var.H1, true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, f5Var, aw0Var.H1);
        f5Var.setDelegate(new pu0(this));
        return new s4.e1(f5Var);
    }
}
