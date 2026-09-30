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
public final class du0 extends yl0 {
    public final Context f23729c;
    public final gg.c2 e;
    public cu0 f23730f;
    public final TLRPC.Chat f23731n;
    public final mv0 f23733s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f23732r = 0;

    public du0(mv0 mv0Var, Context context) {
        this.f23733s = mv0Var;
        this.f23729c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.e = c2Var;
        c2Var.f9683a = new bu0(this);
        this.f23731n = mv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f43068a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.e;
        int size = c2Var.f9687g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) c2Var.f9687g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f23730f != null) {
            Utilities.searchQueue.cancelRunnable(this.f23730f);
            this.f23730f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        gg.c2 c2Var = this.e;
        if (ChatObject.isChannel(this.f23731n)) {
            j3 = this.f23731n.f18352id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f23733s.f26425k0;
            if (i10 >= fu0VarArr.length) {
                break;
            }
            if (fu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f23733s.f26425k0[i10].f24358w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            cu0 cu0Var = new cu0(this, str, 0);
            this.f23730f = cu0Var;
            dispatchQueue.postRunnable(cu0Var, 300L);
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
        int size = this.e.f9687g.size();
        this.h = size;
        if (size > 0) {
            mv0 mv0Var = this.f23733s;
            if (mv0Var.V0) {
                fu0 fu0Var = mv0Var.f26425k0[0];
                if (fu0Var.F == 7 && fu0Var.h.getAdapter() != this) {
                    mv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        mv0 mv0Var = this.f23733s;
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = m2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.c2 c2Var = this.e;
        c2Var.f9687g.size();
        String str = c2Var.f9693n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(mv0Var.h0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f43068a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        mv0 mv0Var = this.f23733s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f23729c, mv0Var.F1, true);
        b5Var.setBackgroundColor(mv0Var.h0(org.telegram.ui.ActionBar.h6.f19076d6));
        b5Var.setDelegate(new bu0(this));
        return new s4.c1(b5Var);
    }
}
