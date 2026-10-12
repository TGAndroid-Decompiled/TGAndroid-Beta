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
public final class yu0 extends vm0 {
    public final Context f33176c;
    public final gg.b2 f33177e;
    public xu0 f33178f;
    public final TLRPC.Chat f33179n;
    public final hw0 f33181s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f33180r = 0;

    public yu0(hw0 hw0Var, Context context) {
        this.f33181s = hw0Var;
        this.f33176c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.f33177e = b2Var;
        b2Var.f10530a = new wu0(this);
        this.f33179n = hw0Var.D1.g();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.f33177e;
        int size = b2Var.f10535g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) b2Var.f10535g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f33178f != null) {
            Utilities.searchQueue.cancelRunnable(this.f33178f);
            this.f33178f = null;
        }
        this.d.clear();
        this.f33177e.f(null, null);
        gg.b2 b2Var = this.f33177e;
        if (ChatObject.isChannel(this.f33179n)) {
            j3 = this.f33179n.f19803id;
        } else {
            j3 = 0;
        }
        b2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            av0[] av0VarArr = this.f33181s.f26933k0;
            if (i10 >= av0VarArr.length) {
                break;
            }
            if (av0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f33181s.f26933k0[i10].f24490w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xu0 xu0Var = new xu0(this, str, 0);
            this.f33178f = xu0Var;
            dispatchQueue.postRunnable(xu0Var, 300L);
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
        int size = this.f33177e.f10535g.size();
        this.h = size;
        if (size > 0) {
            hw0 hw0Var = this.f33181s;
            if (hw0Var.V0) {
                av0 av0Var = hw0Var.f26933k0[0];
                if (av0Var.F == 7 && av0Var.h.getAdapter() != this) {
                    hw0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        hw0 hw0Var = this.f33181s;
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.b2 b2Var = this.f33177e;
        b2Var.f10535g.size();
        String str = b2Var.f10541n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(hw0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        hw0 hw0Var = this.f33181s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f33176c, hw0Var.F1, true);
        b5Var.setBackgroundColor(hw0Var.h0(org.telegram.ui.ActionBar.h6.f20560d6));
        b5Var.setDelegate(new wu0(this));
        return new s4.d1(b5Var);
    }
}
