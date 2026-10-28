package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class su0 extends mm0 {
    public final Context f32684c;
    public final ig.a2 e;
    public ru0 f32685f;
    public final TLRPC.Chat f32686n;
    public final bw0 f32688s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f32687r = 0;

    public su0(bw0 bw0Var, Context context) {
        this.f32688s = bw0Var;
        this.f32684c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.e = a2Var;
        a2Var.f13987a = new qu0(this);
        this.f32686n = bw0Var.F1.g();
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        ig.a2 a2Var = this.e;
        int size = a2Var.f13991g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) a2Var.f13991g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f32685f != null) {
            Utilities.searchQueue.cancelRunnable(this.f32685f);
            this.f32685f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        ig.a2 a2Var = this.e;
        if (ChatObject.isChannel(this.f32686n)) {
            j10 = this.f32686n.f22028id;
        } else {
            j10 = 0;
        }
        a2Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.f32688s.m0;
            if (i10 >= uu0VarArr.length) {
                break;
            }
            if (uu0VarArr[i10].E == 7 && !TextUtils.isEmpty(str)) {
                this.f32688s.m0[i10].v.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            ru0 ru0Var = new ru0(this, str, 0);
            this.f32685f = ru0Var;
            dispatchQueue2.postRunnable(ru0Var, 300L);
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
        int size = this.e.f13991g.size();
        this.h = size;
        if (size > 0) {
            bw0 bw0Var = this.f32688s;
            if (bw0Var.X0) {
                uu0 uu0Var = bw0Var.m0[0];
                if (uu0Var.E == 7 && uu0Var.h.getAdapter() != this) {
                    bw0Var.v1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        bw0 bw0Var = this.f32688s;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = r2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = r2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        ig.a2 a2Var = this.e;
        a2Var.f13991g.size();
        String str = a2Var.f13997n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23598q6, bw0Var.H1), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
            f5Var.setTag(Integer.valueOf(i10));
            f5Var.c(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.f32688s;
        org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(9, 5, this.f32684c, bw0Var.H1, true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, f5Var, bw0Var.H1);
        f5Var.setDelegate(new qu0(this));
        return new s4.e1(f5Var);
    }
}
