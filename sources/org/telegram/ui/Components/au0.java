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
public final class au0 extends ul0 {
    public final Context f22767c;
    public final gg.c2 e;
    public zt0 f22768f;
    public final TLRPC.Chat f22769n;
    public final jv0 f22771s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f22770r = 0;

    public au0(jv0 jv0Var, Context context) {
        this.f22771s = jv0Var;
        this.f22767c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9690a = new yt0(this);
        this.f22769n = jv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
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
        if (this.f22768f != null) {
            Utilities.searchQueue.cancelRunnable(this.f22768f);
            this.f22768f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f22769n)) {
            j3 = this.f22769n.f18328id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            cu0[] cu0VarArr = this.f22771s.f25504k0;
            if (i10 >= cu0VarArr.length) {
                break;
            }
            if (cu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f22771s.f25504k0[i10].f23409w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zt0 zt0Var = new zt0(this, str, 0);
            this.f22768f = zt0Var;
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
        int size = this.e.f9694g.size();
        this.h = size;
        if (size > 0) {
            jv0 jv0Var = this.f22771s;
            if (jv0Var.V0) {
                cu0 cu0Var = jv0Var.f25504k0[0];
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
        jv0 jv0Var = this.f22771s;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(jv0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
            c5Var.setTag(Integer.valueOf(i10));
            c5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.f22771s;
        org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(9, 5, this.f22767c, jv0Var.F1, true);
        c5Var.setBackgroundColor(jv0Var.h0(org.telegram.ui.ActionBar.j6.f19094d6));
        c5Var.setDelegate(new yt0(this));
        return new s4.c1(c5Var);
    }
}
