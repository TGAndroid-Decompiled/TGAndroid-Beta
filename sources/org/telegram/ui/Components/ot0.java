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
    public final Context f29881c;
    public final uf.k1 f29882e;
    public nt0 f29883f;
    public final TLRPC.Chat f29884n;
    public final yu0 f29886s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f29885r = 0;

    public ot0(yu0 yu0Var, Context context) {
        this.f29886s = yu0Var;
        this.f29881c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.f29882e = k1Var;
        k1Var.f48654a = new mt0(this);
        this.f29884n = yu0Var.A1.g();
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        uf.k1 k1Var = this.f29882e;
        int size = k1Var.f48659g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) k1Var.f48659g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z4) {
        long j10;
        if (this.f29883f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29883f);
            this.f29883f = null;
        }
        this.d.clear();
        this.f29882e.f(null, null);
        uf.k1 k1Var = this.f29882e;
        if (ChatObject.isChannel(this.f29884n)) {
            j10 = this.f29884n.f20845id;
        } else {
            j10 = 0;
        }
        k1Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f29886s.f33625h0;
            if (i10 >= qt0VarArr.length) {
                break;
            }
            if (qt0VarArr[i10].C == 7 && !TextUtils.isEmpty(str)) {
                this.f29886s.f33625h0[i10].f30524w.e(true, z4);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nt0 nt0Var = new nt0(this, str, 0);
            this.f29883f = nt0Var;
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
        int size = this.f29882e.f48659g.size();
        this.h = size;
        if (size > 0) {
            yu0 yu0Var = this.f29886s;
            if (yu0Var.S0) {
                qt0 qt0Var = yu0Var.f33625h0[0];
                if (qt0Var.C == 7 && qt0Var.h.getAdapter() != this) {
                    yu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        yu0 yu0Var = this.f29886s;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = p2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        uf.k1 k1Var = this.f29882e;
        k1Var.f48659g.size();
        String str = k1Var.f48665n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(yu0Var.h0(org.telegram.ui.ActionBar.k6.f21896q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f29886s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f29881c, yu0Var.C1, true);
        b5Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.k6.f21661d6));
        b5Var.setDelegate(new mt0(this));
        return new f2.m1(b5Var);
    }
}
