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
public final class yt0 extends ul0 {
    public final Context f29494c;
    public final fg.d2 e;
    public xt0 f29495f;
    public final TLRPC.Chat f29496n;
    public final iv0 f29498s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f29497r = 0;

    public yt0(iv0 iv0Var, Context context) {
        this.f29498s = iv0Var;
        this.f29494c = context;
        fg.d2 d2Var = new fg.d2(true);
        this.e = d2Var;
        d2Var.f7979a = new wt0(this);
        this.f29496n = iv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        fg.d2 d2Var = this.e;
        int size = d2Var.f7983g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) d2Var.f7983g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f29495f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29495f);
            this.f29495f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        fg.d2 d2Var = this.e;
        if (ChatObject.isChannel(this.f29496n)) {
            j3 = this.f29496n.f17195id;
        } else {
            j3 = 0;
        }
        d2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.f29498s.f24107k0;
            if (i10 >= au0VarArr.length) {
                break;
            }
            if (au0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f29498s.f24107k0[i10].f21597w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xt0 xt0Var = new xt0(this, str, 0);
            this.f29495f = xt0Var;
            dispatchQueue.postRunnable(xt0Var, 300L);
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
        int size = this.e.f7983g.size();
        this.h = size;
        if (size > 0) {
            iv0 iv0Var = this.f29498s;
            if (iv0Var.V0) {
                au0 au0Var = iv0Var.f24107k0[0];
                if (au0Var.F == 7 && au0Var.h.getAdapter() != this) {
                    iv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        iv0 iv0Var = this.f29498s;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        fg.d2 d2Var = this.e;
        d2Var.f7983g.size();
        String str = d2Var.f7989n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(iv0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        iv0 iv0Var = this.f29498s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f29494c, iv0Var.F1, true);
        b5Var.setBackgroundColor(iv0Var.h0(org.telegram.ui.ActionBar.j6.f17928d6));
        b5Var.setDelegate(new wt0(this));
        return new s4.c1(b5Var);
    }
}
