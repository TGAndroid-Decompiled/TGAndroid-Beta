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
public final class gu0 extends yl0 {
    public final Context f26926c;
    public final gg.c2 f26927e;
    public fu0 f26928f;
    public final TLRPC.Chat f26929n;
    public final pv0 f26931s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f26930r = 0;

    public gu0(pv0 pv0Var, Context context) {
        this.f26931s = pv0Var;
        this.f26926c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.f26927e = c2Var;
        c2Var.f10532a = new eu0(this);
        this.f26929n = pv0Var.D1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46531a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.f26927e;
        int size = c2Var.f10537g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) c2Var.f10537g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f26928f != null) {
            Utilities.searchQueue.cancelRunnable(this.f26928f);
            this.f26928f = null;
        }
        this.d.clear();
        this.f26927e.f(null, null);
        gg.c2 c2Var = this.f26927e;
        if (ChatObject.isChannel(this.f26929n)) {
            j3 = this.f26929n.f20042id;
        } else {
            j3 = 0;
        }
        c2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            iu0[] iu0VarArr = this.f26931s.f29782k0;
            if (i10 >= iu0VarArr.length) {
                break;
            }
            if (iu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f26931s.f29782k0[i10].f27509w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fu0 fu0Var = new fu0(this, str, 0);
            this.f26928f = fu0Var;
            dispatchQueue.postRunnable(fu0Var, 300L);
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
        int size = this.f26927e.f10537g.size();
        this.h = size;
        if (size > 0) {
            pv0 pv0Var = this.f26931s;
            if (pv0Var.V0) {
                iu0 iu0Var = pv0Var.f29782k0[0];
                if (iu0Var.F == 7 && iu0Var.h.getAdapter() != this) {
                    pv0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        pv0 pv0Var = this.f26931s;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29806v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.c2 c2Var = this.f26927e;
        c2Var.f10537g.size();
        String str = c2Var.f10543n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(pv0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f46531a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        pv0 pv0Var = this.f26931s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f26926c, pv0Var.F1, true);
        b5Var.setBackgroundColor(pv0Var.h0(org.telegram.ui.ActionBar.i6.f20822d6));
        b5Var.setDelegate(new eu0(this));
        return new s4.c1(b5Var);
    }
}
