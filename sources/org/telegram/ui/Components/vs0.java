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
public final class vs0 extends vk0 {
    public final Context f33997c;
    public final of.v1 f33998e;
    public us0 f33999f;
    public final TLRPC.Chat f34000n;
    public final eu0 f34002s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f34001r = 0;

    public vs0(eu0 eu0Var, Context context) {
        this.f34002s = eu0Var;
        this.f33997c = context;
        of.v1 v1Var = new of.v1(true);
        this.f33998e = v1Var;
        v1Var.f19524a = new ts0(this);
        this.f34000n = eu0Var.f28180z1.g();
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final TLObject E(int i9) {
        of.v1 v1Var = this.f33998e;
        int size = v1Var.f19529g.size();
        if (i9 >= 0 && i9 < size) {
            return (TLObject) v1Var.f19529g.get(i9);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f33999f != null) {
            Utilities.searchQueue.cancelRunnable(this.f33999f);
            this.f33999f = null;
        }
        this.d.clear();
        this.f33998e.f(null, null);
        of.v1 v1Var = this.f33998e;
        if (ChatObject.isChannel(this.f34000n)) {
            j10 = this.f34000n.f22380id;
        } else {
            j10 = 0;
        }
        v1Var.g(null, true, false, true, false, j10, false, 2, 0);
        l();
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f34002s.f28137g0;
            if (i9 >= xs0VarArr.length) {
                break;
            }
            if (xs0VarArr[i9].B == 7 && !TextUtils.isEmpty(str)) {
                this.f34002s.f28137g0[i9].f34763w.e(true, z10);
            }
            i9++;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            us0 us0Var = new us0(this, str, 0);
            this.f33999f = us0Var;
            dispatchQueue.postRunnable(us0Var, 300L);
        }
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i9) {
        return 22;
    }

    @Override
    public final void l() {
        int size = this.f33998e.f19529g.size();
        this.h = size;
        if (size > 0) {
            eu0 eu0Var = this.f34002s;
            if (eu0Var.R0) {
                xs0 xs0Var = eu0Var.f28137g0[0];
                if (xs0Var.B == 7 && xs0Var.h.getAdapter() != this) {
                    eu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        eu0 eu0Var = this.f34002s;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        TLObject E = E(i9);
        if (E instanceof TLRPC.ChannelParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            user = o2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        UserObject.getPublicUsername(user);
        of.v1 v1Var = this.f33998e;
        v1Var.f19529g.size();
        String str = v1Var.f19535n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (indexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(eu0Var.h0(org.telegram.ui.ActionBar.f6.f23229q6)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i9));
            b5Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.f34002s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(9, 5, this.f33997c, eu0Var.B1, true);
        b5Var.setBackgroundColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.f23001d6));
        b5Var.setDelegate(new ts0(this));
        return new f2.q1(b5Var);
    }
}
