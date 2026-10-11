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
public final class uu0 extends rm0 {
    public final Context f31565c;
    public final gg.b2 f31566e;
    public tu0 f31567f;
    public final TLRPC.Chat f31568n;
    public final dw0 f31570s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f31569r = 0;

    public uu0(dw0 dw0Var, Context context) {
        this.f31570s = dw0Var;
        this.f31565c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.f31566e = b2Var;
        b2Var.f10531a = new su0(this);
        this.f31568n = dw0Var.D1.g();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.f31566e;
        int size = b2Var.f10536g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) b2Var.f10536g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f31567f != null) {
            Utilities.searchQueue.cancelRunnable(this.f31567f);
            this.f31567f = null;
        }
        this.d.clear();
        this.f31566e.f(null, null);
        gg.b2 b2Var = this.f31566e;
        if (ChatObject.isChannel(this.f31568n)) {
            j3 = this.f31568n.f20032id;
        } else {
            j3 = 0;
        }
        b2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            wu0[] wu0VarArr = this.f31570s.f25711k0;
            if (i10 >= wu0VarArr.length) {
                break;
            }
            if (wu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f31570s.f25711k0[i10].f32746w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            tu0 tu0Var = new tu0(this, str, 0);
            this.f31567f = tu0Var;
            dispatchQueue.postRunnable(tu0Var, 300L);
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
        int size = this.f31566e.f10536g.size();
        this.h = size;
        if (size > 0) {
            dw0 dw0Var = this.f31570s;
            if (dw0Var.V0) {
                wu0 wu0Var = dw0Var.f25711k0[0];
                if (wu0Var.F == 7 && wu0Var.h.getAdapter() != this) {
                    dw0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        dw0 dw0Var = this.f31570s;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.b2 b2Var = this.f31566e;
        b2Var.f10536g.size();
        String str = b2Var.f10542n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dw0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        dw0 dw0Var = this.f31570s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f31565c, dw0Var.F1, true);
        b5Var.setBackgroundColor(dw0Var.h0(org.telegram.ui.ActionBar.h6.f20786d6));
        b5Var.setDelegate(new su0(this));
        return new s4.d1(b5Var);
    }
}
