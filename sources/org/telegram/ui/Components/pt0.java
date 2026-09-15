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
public final class pt0 extends kl0 {
    public final Context f27142c;
    public final gg.c2 e;
    public ot0 f27143f;
    public final TLRPC.Chat f27144n;
    public final yu0 f27146s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27145r = 0;

    public pt0(yu0 yu0Var, Context context) {
        this.f27146s = yu0Var;
        this.f27142c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9685a = new nt0(this);
        this.f27144n = yu0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.e;
        int size = c2Var.f9689g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) c2Var.f9689g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f27143f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27143f);
            this.f27143f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f27144n)) {
            j3 = this.f27144n.f18112id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f27146s.f30368k0;
            if (i10 >= rt0VarArr.length) {
                break;
            }
            if (rt0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f27146s.f30368k0[i10].f27690w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ot0 ot0Var = new ot0(this, str, 0);
            this.f27143f = ot0Var;
            dispatchQueue.postRunnable(ot0Var, 300L);
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
        int size = this.e.f9689g.size();
        this.h = size;
        if (size > 0) {
            yu0 yu0Var = this.f27146s;
            if (yu0Var.V0) {
                rt0 rt0Var = yu0Var.f30368k0[0];
                if (rt0Var.F == 7 && rt0Var.h.getAdapter() != this) {
                    yu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        yu0 yu0Var = this.f27146s;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
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
        c2Var.f9689g.size();
        String str = c2Var.f9695n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(yu0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f27146s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f27142c, yu0Var.F1, true);
        a5Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.i6.f18836d6));
        a5Var.setDelegate(new nt0(this));
        return new s4.c1(a5Var);
    }
}
