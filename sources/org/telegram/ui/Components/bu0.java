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
public final class bu0 extends wl0 {
    public final Context f23103c;
    public final gg.c2 e;
    public au0 f23104f;
    public final TLRPC.Chat f23105n;
    public final kv0 f23107s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f23106r = 0;

    public bu0(kv0 kv0Var, Context context) {
        this.f23107s = kv0Var;
        this.f23103c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9671a = new zt0(this);
        this.f23105n = kv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42959a;
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
        if (this.f23104f != null) {
            Utilities.searchQueue.cancelRunnable(this.f23104f);
            this.f23104f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f23105n)) {
            j3 = this.f23105n.f18335id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            du0[] du0VarArr = this.f23107s.f25842k0;
            if (i10 >= du0VarArr.length) {
                break;
            }
            if (du0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f23107s.f25842k0[i10].f23759w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            au0 au0Var = new au0(this, str, 0);
            this.f23104f = au0Var;
            dispatchQueue.postRunnable(au0Var, 300L);
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
            kv0 kv0Var = this.f23107s;
            if (kv0Var.V0) {
                du0 du0Var = kv0Var.f25842k0[0];
                if (du0Var.F == 7 && du0Var.h.getAdapter() != this) {
                    kv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        kv0 kv0Var = this.f23107s;
        org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(kv0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f42959a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        kv0 kv0Var = this.f23107s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f23103c, kv0Var.F1, true);
        b5Var.setBackgroundColor(kv0Var.h0(org.telegram.ui.ActionBar.h6.f19059d6));
        b5Var.setDelegate(new zt0(this));
        return new s4.c1(b5Var);
    }
}
