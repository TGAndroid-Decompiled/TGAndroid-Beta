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
public final class gt0 extends il0 {
    public final Context f28980c;
    public final rf.k1 f28981e;
    public ft0 f28982f;
    public final TLRPC.Chat f28983n;
    public final qu0 f28985s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f28984r = 0;

    public gt0(qu0 qu0Var, Context context) {
        this.f28985s = qu0Var;
        this.f28980c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.f28981e = k1Var;
        k1Var.f47277a = new et0(this);
        this.f28983n = qu0Var.f32113z1.g();
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        rf.k1 k1Var = this.f28981e;
        int size = k1Var.f47282g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) k1Var.f47282g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f28982f != null) {
            Utilities.searchQueue.cancelRunnable(this.f28982f);
            this.f28982f = null;
        }
        this.d.clear();
        this.f28981e.f(null, null);
        rf.k1 k1Var = this.f28981e;
        if (ChatObject.isChannel(this.f28983n)) {
            j10 = this.f28983n.f22392id;
        } else {
            j10 = 0;
        }
        k1Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.f28985s.f32070g0;
            if (i10 >= it0VarArr.length) {
                break;
            }
            if (it0VarArr[i10].B == 7 && !TextUtils.isEmpty(str)) {
                this.f28985s.f32070g0[i10].f29471w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ft0 ft0Var = new ft0(this, str, 0);
            this.f28982f = ft0Var;
            dispatchQueue.postRunnable(ft0Var, 300L);
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
        int size = this.f28981e.f47282g.size();
        this.h = size;
        if (size > 0) {
            qu0 qu0Var = this.f28985s;
            if (qu0Var.R0) {
                it0 it0Var = qu0Var.f32070g0[0];
                if (it0Var.B == 7 && it0Var.h.getAdapter() != this) {
                    qu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        qu0 qu0Var = this.f28985s;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        rf.k1 k1Var = this.f28981e;
        k1Var.f47282g.size();
        String str = k1Var.f47288n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(qu0Var.h0(org.telegram.ui.ActionBar.g6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
            z4Var.setTag(Integer.valueOf(i10));
            z4Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = this.f28985s;
        org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(9, 5, this.f28980c, qu0Var.B1, true);
        z4Var.setBackgroundColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.f23062d6));
        z4Var.setDelegate(new et0(this));
        return new f2.n1(z4Var);
    }
}
