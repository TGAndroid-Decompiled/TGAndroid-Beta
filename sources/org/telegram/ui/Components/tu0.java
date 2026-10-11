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
public final class tu0 extends qm0 {
    public final Context f31339c;
    public final gg.b2 f31340e;
    public su0 f31341f;
    public final TLRPC.Chat f31342n;
    public final cw0 f31344s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f31343r = 0;

    public tu0(cw0 cw0Var, Context context) {
        this.f31344s = cw0Var;
        this.f31339c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.f31340e = b2Var;
        b2Var.f10531a = new ru0(this);
        this.f31342n = cw0Var.D1.g();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47782a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.f31340e;
        int size = b2Var.f10536g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) b2Var.f10536g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f31341f != null) {
            Utilities.searchQueue.cancelRunnable(this.f31341f);
            this.f31341f = null;
        }
        this.d.clear();
        this.f31340e.f(null, null);
        gg.b2 b2Var = this.f31340e;
        if (ChatObject.isChannel(this.f31342n)) {
            j3 = this.f31342n.f20068id;
        } else {
            j3 = 0;
        }
        b2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            vu0[] vu0VarArr = this.f31344s.f25512k0;
            if (i10 >= vu0VarArr.length) {
                break;
            }
            if (vu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f31344s.f25512k0[i10].f32558w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            su0 su0Var = new su0(this, str, 0);
            this.f31341f = su0Var;
            dispatchQueue.postRunnable(su0Var, 300L);
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
        int size = this.f31340e.f10536g.size();
        this.h = size;
        if (size > 0) {
            cw0 cw0Var = this.f31344s;
            if (cw0Var.V0) {
                vu0 vu0Var = cw0Var.f25512k0[0];
                if (vu0Var.F == 7 && vu0Var.h.getAdapter() != this) {
                    cw0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        cw0 cw0Var = this.f31344s;
        org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.b2 b2Var = this.f31340e;
        b2Var.f10536g.size();
        String str = b2Var.f10542n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(cw0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f47782a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var = this.f31344s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f31339c, cw0Var.F1, true);
        b5Var.setBackgroundColor(cw0Var.h0(org.telegram.ui.ActionBar.h6.f20822d6));
        b5Var.setDelegate(new ru0(this));
        return new s4.d1(b5Var);
    }
}
