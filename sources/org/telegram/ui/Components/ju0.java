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
public final class ju0 extends hm0 {
    public final Context f27599c;
    public final hg.a2 e;
    public iu0 f27600f;
    public final TLRPC.Chat f27601n;
    public final sv0 f27603s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f27602r = 0;

    public ju0(sv0 sv0Var, Context context) {
        this.f27603s = sv0Var;
        this.f27599c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.e = a2Var;
        a2Var.f11793a = new hu0(this);
        this.f27601n = sv0Var.D1.g();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45938a;
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
        int size = a2Var.f11797g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) a2Var.f11797g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f27600f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27600f);
            this.f27600f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        hg.a2 a2Var = this.e;
        if (ChatObject.isChannel(this.f27601n)) {
            j10 = this.f27601n.f20272id;
        } else {
            j10 = 0;
        }
        a2Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.f27603s.f30364k0;
            if (i10 >= lu0VarArr.length) {
                break;
            }
            if (lu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f27603s.f30364k0[i10].f28334w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            iu0 iu0Var = new iu0(this, str, 0);
            this.f27600f = iu0Var;
            dispatchQueue.postRunnable(iu0Var, 300L);
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
        int size = this.e.f11797g.size();
        this.h = size;
        if (size > 0) {
            sv0 sv0Var = this.f27603s;
            if (sv0Var.V0) {
                lu0 lu0Var = sv0Var.f30364k0[0];
                if (lu0Var.F == 7 && lu0Var.h.getAdapter() != this) {
                    sv0Var.o1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        sv0 sv0Var = this.f27603s;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
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
        a2Var.f11797g.size();
        String str = a2Var.f11803n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(sv0Var.i0(org.telegram.ui.ActionBar.h6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = b1Var.f45938a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i10));
            a5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        sv0 sv0Var = this.f27603s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(9, 5, this.f27599c, sv0Var.F1, true);
        a5Var.setBackgroundColor(sv0Var.i0(org.telegram.ui.ActionBar.h6.f20986d6));
        a5Var.setDelegate(new hu0(this));
        return new s4.b1(a5Var);
    }
}
