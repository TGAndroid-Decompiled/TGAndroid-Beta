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
public final class cu0 extends xl0 {
    public final Context f23444c;
    public final gg.c2 e;
    public bu0 f23445f;
    public final TLRPC.Chat f23446n;
    public final lv0 f23448s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f23447r = 0;

    public cu0(lv0 lv0Var, Context context) {
        this.f23448s = lv0Var;
        this.f23444c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9690a = new au0(this);
        this.f23446n = lv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42995a;
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
        if (this.f23445f != null) {
            Utilities.searchQueue.cancelRunnable(this.f23445f);
            this.f23445f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f23446n)) {
            j3 = this.f23446n.f18343id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            eu0[] eu0VarArr = this.f23448s.f26210k0;
            if (i10 >= eu0VarArr.length) {
                break;
            }
            if (eu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f23448s.f26210k0[i10].f24045w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            bu0 bu0Var = new bu0(this, str, 0);
            this.f23445f = bu0Var;
            dispatchQueue.postRunnable(bu0Var, 300L);
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
            lv0 lv0Var = this.f23448s;
            if (lv0Var.V0) {
                eu0 eu0Var = lv0Var.f26210k0[0];
                if (eu0Var.F == 7 && eu0Var.h.getAdapter() != this) {
                    lv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        lv0 lv0Var = this.f23448s;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(lv0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f42995a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
            c5Var.setTag(Integer.valueOf(i10));
            c5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = this.f23448s;
        org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(9, 5, this.f23444c, lv0Var.F1, true);
        c5Var.setBackgroundColor(lv0Var.h0(org.telegram.ui.ActionBar.j6.f19109d6));
        c5Var.setDelegate(new au0(this));
        return new s4.c1(c5Var);
    }
}
