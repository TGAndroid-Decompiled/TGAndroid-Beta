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
public final class tu0 extends qm0 {
    public final Context f31220c;
    public final gg.b2 f31221e;
    public su0 f31222f;
    public final TLRPC.Chat f31223n;
    public final cw0 f31225s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f31224r = 0;

    public tu0(cw0 cw0Var, Context context) {
        this.f31225s = cw0Var;
        this.f31220c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.f31221e = b2Var;
        b2Var.f10532a = new ru0(this);
        this.f31223n = cw0Var.D1.g();
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.f31221e;
        int size = b2Var.f10537g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) b2Var.f10537g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f31222f != null) {
            Utilities.searchQueue.cancelRunnable(this.f31222f);
            this.f31222f = null;
        }
        this.d.clear();
        this.f31221e.f(null, null);
        gg.b2 b2Var = this.f31221e;
        if (ChatObject.isChannel(this.f31223n)) {
            j3 = this.f31223n.f20042id;
        } else {
            j3 = 0;
        }
        b2Var.g(null, true, false, true, false, j3, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            vu0[] vu0VarArr = this.f31225s.f25450k0;
            if (i10 >= vu0VarArr.length) {
                break;
            }
            if (vu0VarArr[i10].F == 7 && !TextUtils.isEmpty(str)) {
                this.f31225s.f25450k0[i10].f32521w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            su0 su0Var = new su0(this, str, 0);
            this.f31222f = su0Var;
            dispatchQueue.postRunnable(su0Var, 300L);
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
        int size = this.f31221e.f10537g.size();
        this.h = size;
        if (size > 0) {
            cw0 cw0Var = this.f31225s;
            if (cw0Var.V0) {
                vu0 vu0Var = cw0Var.f25450k0[0];
                if (vu0Var.F == 7 && vu0Var.h.getAdapter() != this) {
                    cw0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        cw0 cw0Var = this.f31225s;
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        gg.b2 b2Var = this.f31221e;
        b2Var.f10537g.size();
        String str = b2Var.f10543n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(cw0Var.h0(org.telegram.ui.ActionBar.i6.q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var = this.f31225s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f31220c, cw0Var.F1, true);
        b5Var.setBackgroundColor(cw0Var.h0(org.telegram.ui.ActionBar.i6.f20801d6));
        b5Var.setDelegate(new ru0(this));
        return new s4.d1(b5Var);
    }
}
