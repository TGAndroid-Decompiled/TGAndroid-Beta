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
public final class ot0 extends ql0 {
    public final Context f27646c;
    public final tf.j1 e;
    public nt0 f27647f;
    public final TLRPC.Chat f27648n;
    public final yu0 f27650s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27649r = 0;

    public ot0(yu0 yu0Var, Context context) {
        this.f27650s = yu0Var;
        this.f27646c = context;
        tf.j1 j1Var = new tf.j1(true);
        this.e = j1Var;
        j1Var.f44819a = new mt0(this);
        this.f27648n = yu0Var.A1.g();
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        tf.j1 j1Var = this.e;
        int size = j1Var.f44823g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) j1Var.f44823g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z4) {
        long j10;
        if (this.f27647f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27647f);
            this.f27647f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        tf.j1 j1Var = this.e;
        if (ChatObject.isChannel(this.f27648n)) {
            j10 = this.f27648n.f19159id;
        } else {
            j10 = 0;
        }
        j1Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f27650s.f31131h0;
            if (i10 >= qt0VarArr.length) {
                break;
            }
            if (qt0VarArr[i10].C == 7 && !TextUtils.isEmpty(str)) {
                this.f27650s.f31131h0[i10].f28263w.e(true, z4);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nt0 nt0Var = new nt0(this, str, 0);
            this.f27647f = nt0Var;
            dispatchQueue.postRunnable(nt0Var, 300L);
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
        int size = this.e.f44823g.size();
        this.h = size;
        if (size > 0) {
            yu0 yu0Var = this.f27650s;
            if (yu0Var.S0) {
                qt0 qt0Var = yu0Var.f31131h0[0];
                if (qt0Var.C == 7 && qt0Var.h.getAdapter() != this) {
                    yu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        yu0 yu0Var = this.f27650s;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        tf.j1 j1Var = this.e;
        j1Var.f44823g.size();
        String str = j1Var.f44829n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(yu0Var.h0(org.telegram.ui.ActionBar.j6.f20115q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f27650s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f27646c, yu0Var.C1, true);
        a5Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.f19881d6));
        a5Var.setDelegate(new mt0(this));
        return new f2.l1(a5Var);
    }
}
