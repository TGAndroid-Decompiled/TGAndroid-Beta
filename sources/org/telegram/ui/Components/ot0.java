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
public final class ot0 extends rl0 {
    public final Context f27661c;
    public final tf.k1 e;
    public nt0 f27662f;
    public final TLRPC.Chat f27663n;
    public final yu0 f27665s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27664r = 0;

    public ot0(yu0 yu0Var, Context context) {
        this.f27665s = yu0Var;
        this.f27661c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.e = k1Var;
        k1Var.f44769a = new mt0(this);
        this.f27663n = yu0Var.A1.g();
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        tf.k1 k1Var = this.e;
        int size = k1Var.f44773g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) k1Var.f44773g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z4) {
        long j10;
        if (this.f27662f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27662f);
            this.f27662f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        tf.k1 k1Var = this.e;
        if (ChatObject.isChannel(this.f27663n)) {
            j10 = this.f27663n.f19184id;
        } else {
            j10 = 0;
        }
        k1Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f27665s.f31120h0;
            if (i10 >= qt0VarArr.length) {
                break;
            }
            if (qt0VarArr[i10].C == 7 && !TextUtils.isEmpty(str)) {
                this.f27665s.f31120h0[i10].f28244w.e(true, z4);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nt0 nt0Var = new nt0(this, str, 0);
            this.f27662f = nt0Var;
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
        int size = this.e.f44773g.size();
        this.h = size;
        if (size > 0) {
            yu0 yu0Var = this.f27665s;
            if (yu0Var.S0) {
                qt0 qt0Var = yu0Var.f31120h0[0];
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
        yu0 yu0Var = this.f27665s;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        tf.k1 k1Var = this.e;
        k1Var.f44773g.size();
        String str = k1Var.f44779n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(yu0Var.h0(org.telegram.ui.ActionBar.j6.f20140q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f27665s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f27661c, yu0Var.C1, true);
        b5Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.f19906d6));
        b5Var.setDelegate(new mt0(this));
        return new f2.l1(b5Var);
    }
}
