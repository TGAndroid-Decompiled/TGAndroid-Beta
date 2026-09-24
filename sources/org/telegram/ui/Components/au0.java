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
public final class au0 extends vl0 {
    public final Context f22752c;
    public final gg.c2 e;
    public zt0 f22753f;
    public final TLRPC.Chat f22754n;
    public final jv0 f22756s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f22755r = 0;

    public au0(jv0 jv0Var, Context context) {
        this.f22756s = jv0Var;
        this.f22752c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9671a = new yt0(this);
        this.f22754n = jv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42946a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.e;
        int size = c2Var.f9675g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) c2Var.f9675g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f22753f != null) {
            Utilities.searchQueue.cancelRunnable(this.f22753f);
            this.f22753f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f22754n)) {
            j3 = this.f22754n.f18321id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            cu0[] cu0VarArr = this.f22756s.f25519k0;
            if (i10 >= cu0VarArr.length) {
                break;
            }
            if (cu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f22756s.f25519k0[i10].f23391w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zt0 zt0Var = new zt0(this, str, 0);
            this.f22753f = zt0Var;
            dispatchQueue.postRunnable(zt0Var, 300L);
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
        int size = this.e.f9675g.size();
        this.h = size;
        if (size > 0) {
            jv0 jv0Var = this.f22756s;
            if (jv0Var.V0) {
                cu0 cu0Var = jv0Var.f25519k0[0];
                if (cu0Var.F == 7 && cu0Var.h.getAdapter() != this) {
                    jv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        jv0 jv0Var = this.f22756s;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.c2 c2Var = this.e;
        c2Var.f9675g.size();
        String str = c2Var.f9681n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(jv0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f42946a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.f22756s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f22752c, jv0Var.F1, true);
        b5Var.setBackgroundColor(jv0Var.h0(org.telegram.ui.ActionBar.h6.f19045d6));
        b5Var.setDelegate(new yt0(this));
        return new s4.c1(b5Var);
    }
}
