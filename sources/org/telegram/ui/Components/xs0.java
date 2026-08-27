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

public final class xs0 extends yk0 {

    public final Context f34692c;

    public final pf.j1 f34693e;

    public ws0 f34694f;

    public final TLRPC.Chat f34695n;

    public final hu0 f34697s;
    public ArrayList d = new ArrayList();
    public int h = 0;

    public int f34696r = 0;

    public xs0(hu0 hu0Var, Context context) {
        this.f34697s = hu0Var;
        this.f34692c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.f34693e = j1Var;
        j1Var.f45836a = new vs0(this);
        this.f34695n = hu0Var.f29165z1.g();
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        pf.j1 j1Var = this.f34693e;
        int size = j1Var.f45841g.size();
        if (i10 < 0 || i10 >= size) {
            return null;
        }
        return (TLObject) j1Var.f45841g.get(i10);
    }

    public final void F(String str, boolean z10) {
        if (this.f34694f != null) {
            Utilities.searchQueue.cancelRunnable(this.f34694f);
            this.f34694f = null;
        }
        this.d.clear();
        this.f34693e.f(null, null);
        this.f34693e.g(null, true, false, true, false, ChatObject.isChannel(this.f34695n) ? this.f34695n.f22380id : 0L, false, 2, 0);
        l();
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f34697s.f29122g0;
            if (i10 >= zs0VarArr.length) {
                break;
            }
            if (zs0VarArr[i10].B == 7 && !TextUtils.isEmpty(str)) {
                this.f34697s.f29122g0[i10].f35342w.e(true, z10);
            }
            i10++;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ws0 ws0Var = new ws0(this, str, 0);
        this.f34694f = ws0Var;
        dispatchQueue.postRunnable(ws0Var, 300L);
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
        int size = this.f34693e.f45841g.size();
        this.h = size;
        if (size > 0) {
            hu0 hu0Var = this.f34697s;
            if (hu0Var.R0) {
                zs0 zs0Var = hu0Var.f29122g0[0];
                if (zs0Var.B == 7 && zs0Var.h.getAdapter() != this) {
                    hu0Var.m1(false);
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.User user;
        SpannableStringBuilder spannableStringBuilder;
        hu0 hu0Var = this.f34697s;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        TLObject tLObjectE = E(i10);
        if (tLObjectE instanceof TLRPC.ChannelParticipant) {
            user = n2Var.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObjectE).peer)));
        } else if (!(tLObjectE instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = n2Var.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObjectE).user_id));
        }
        UserObject.getPublicUsername(user);
        pf.j1 j1Var = this.f34693e;
        j1Var.f45841g.size();
        String str = j1Var.f45847n;
        if (str != null) {
            String userName = UserObject.getUserName(user);
            spannableStringBuilder = new SpannableStringBuilder(userName);
            int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (iIndexOfIgnoreCase != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(hu0Var.h0(org.telegram.ui.ActionBar.g6.q6)), iIndexOfIgnoreCase, str.length() + iIndexOfIgnoreCase, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.setTag(Integer.valueOf(i10));
            y4Var.b(user, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.f34697s;
        org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(9, 5, this.f34692c, hu0Var.B1, true);
        y4Var.setBackgroundColor(hu0Var.h0(org.telegram.ui.ActionBar.g6.f23053d6));
        y4Var.setDelegate(new vs0(this));
        return new lk0(y4Var);
    }
}
