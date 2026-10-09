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
public final class su0 extends pm0 {
    public final Context f30894c;
    public final gg.b2 f30895e;
    public ru0 f30896f;
    public final TLRPC.Chat f30897n;
    public final bw0 f30899s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f30898r = 0;

    public su0(bw0 bw0Var, Context context) {
        this.f30899s = bw0Var;
        this.f30894c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.f30895e = b2Var;
        b2Var.f10532a = new qu0(this);
        this.f30897n = bw0Var.D1.g();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.f30895e;
        int size = b2Var.f10537g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) b2Var.f10537g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f30896f != null) {
            Utilities.searchQueue.cancelRunnable(this.f30896f);
            this.f30896f = null;
        }
        this.d.clear();
        this.f30895e.f(null, null);
        gg.b2 b2Var = this.f30895e;
        if (ChatObject.isChannel(this.f30897n)) {
            j3 = this.f30897n.f20038id;
        } else {
            j3 = 0;
        }
        b2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.f30899s.f25142k0;
            if (i10 >= uu0VarArr.length) {
                break;
            }
            if (uu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f30899s.f25142k0[i10].f31627w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ru0 ru0Var = new ru0(this, str, 0);
            this.f30896f = ru0Var;
            dispatchQueue.postRunnable(ru0Var, 300L);
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
        int size = this.f30895e.f10537g.size();
        this.h = size;
        if (size > 0) {
            bw0 bw0Var = this.f30899s;
            if (bw0Var.V0) {
                uu0 uu0Var = bw0Var.f25142k0[0];
                if (uu0Var.F == 7 && uu0Var.h.getAdapter() != this) {
                    bw0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        bw0 bw0Var = this.f30899s;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.b2 b2Var = this.f30895e;
        b2Var.f10537g.size();
        String str = b2Var.f10543n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(bw0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.f30899s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f30894c, bw0Var.F1, true);
        b5Var.setBackgroundColor(bw0Var.h0(org.telegram.ui.ActionBar.i6.f20797d6));
        b5Var.setDelegate(new qu0(this));
        return new s4.d1(b5Var);
    }
}
