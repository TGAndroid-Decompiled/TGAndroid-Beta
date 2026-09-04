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
public final class ot0 extends kl0 {
    public final Context f29181c;
    public final hg.b2 f29182e;
    public nt0 f29183f;
    public final TLRPC.Chat f29184n;
    public final xu0 f29186s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f29185r = 0;

    public ot0(xu0 xu0Var, Context context) {
        this.f29186s = xu0Var;
        this.f29181c = context;
        hg.b2 b2Var = new hg.b2(true);
        this.f29182e = b2Var;
        b2Var.f10979a = new mt0(this);
        this.f29184n = xu0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        hg.b2 b2Var = this.f29182e;
        int size = b2Var.f10984g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) b2Var.f10984g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f29183f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29183f);
            this.f29183f = null;
        }
        this.d.clear();
        this.f29182e.f(null, null);
        hg.b2 b2Var = this.f29182e;
        if (ChatObject.isChannel(this.f29184n)) {
            j3 = this.f29184n.f19869id;
        } else {
            j3 = 0;
        }
        b2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f29186s.f32702k0;
            if (i10 >= qt0VarArr.length) {
                break;
            }
            if (qt0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f29186s.f32702k0[i10].f29823w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nt0 nt0Var = new nt0(this, str, 0);
            this.f29183f = nt0Var;
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
        int size = this.f29182e.f10984g.size();
        this.h = size;
        if (size > 0) {
            xu0 xu0Var = this.f29186s;
            if (xu0Var.V0) {
                qt0 qt0Var = xu0Var.f32702k0[0];
                if (qt0Var.F == 7 && qt0Var.h.getAdapter() != this) {
                    xu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        xu0 xu0Var = this.f29186s;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        hg.b2 b2Var = this.f29182e;
        b2Var.f10984g.size();
        String str = b2Var.f10990n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(xu0Var.h0(org.telegram.ui.ActionBar.j6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        xu0 xu0Var = this.f29186s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f29181c, xu0Var.F1, true);
        a5Var.setBackgroundColor(xu0Var.h0(org.telegram.ui.ActionBar.j6.f20663d6));
        a5Var.setDelegate(new mt0(this));
        return new s4.c1(a5Var);
    }
}
