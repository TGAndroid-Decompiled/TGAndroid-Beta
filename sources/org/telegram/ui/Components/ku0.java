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
public final class ku0 extends hm0 {
    public final Context f27972c;
    public final hg.a2 e;
    public ju0 f27973f;
    public final TLRPC.Chat f27974n;
    public final tv0 f27976s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27975r = 0;

    public ku0(tv0 tv0Var, Context context) {
        this.f27976s = tv0Var;
        this.f27972c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.e = a2Var;
        a2Var.f11794a = new iu0(this);
        this.f27974n = tv0Var.D1.g();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45910a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.e;
        int size = a2Var.f11798g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) a2Var.f11798g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f27973f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27973f);
            this.f27973f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        hg.a2 a2Var = this.e;
        if (ChatObject.isChannel(this.f27974n)) {
            j10 = this.f27974n.f20275id;
        } else {
            j10 = 0;
        }
        a2Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f27976s.f30710k0;
            if (i10 >= mu0VarArr.length) {
                break;
            }
            if (mu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f27976s.f30710k0[i10].f28613w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ju0 ju0Var = new ju0(this, str, 0);
            this.f27973f = ju0Var;
            dispatchQueue.postRunnable(ju0Var, 300L);
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
        int size = this.e.f11798g.size();
        this.h = size;
        if (size > 0) {
            tv0 tv0Var = this.f27976s;
            if (tv0Var.V0) {
                mu0 mu0Var = tv0Var.f30710k0[0];
                if (mu0Var.F == 7 && mu0Var.h.getAdapter() != this) {
                    tv0Var.o1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        tv0 tv0Var = this.f27976s;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30734v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        hg.a2 a2Var = this.e;
        a2Var.f11798g.size();
        String str = a2Var.f11804n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(tv0Var.i0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = b1Var.f45910a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        tv0 tv0Var = this.f27976s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f27972c, tv0Var.F1, true);
        a5Var.setBackgroundColor(tv0Var.i0(org.telegram.ui.ActionBar.h6.f20989d6));
        a5Var.setDelegate(new iu0(this));
        return new s4.b1(a5Var);
    }
}
