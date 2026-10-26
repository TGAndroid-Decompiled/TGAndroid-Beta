package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir0 extends lm0 {
    public int G;
    public hr0 H;
    public int J;
    public final mr0 K;
    public final Context f29364c;
    public final gr0 e;
    public fr0 f29365f;
    public fr0 h;
    public String f29366n;
    public int f29367r;
    public int f29368s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f29369w = -1;
    public int f29370x = -1;
    public int f29371y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public ir0(mr0 mr0Var, Context context) {
        this.K = mr0Var;
        this.f29364c = context;
        ?? a2Var = new ig.a2(false);
        this.e = a2Var;
        a2Var.f13988a = new li.e3(this, 11);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f29366n)) {
            return;
        }
        this.f29366n = str;
        if (this.f29365f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29365f);
            this.f29365f = null;
        }
        fr0 fr0Var = this.h;
        if (fr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.K.M0(true);
        if (TextUtils.isEmpty(str)) {
            mr0.C0(this.K);
            this.f29367r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f29367r + 1;
            this.f29367r = i10;
            this.K.R.e(true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            fr0 fr0Var2 = new fr0(this, str, i10, 0);
            this.f29365f = fr0Var2;
            dispatchQueue2.postRunnable(fr0Var2, 300L);
        }
        this.K.M0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f29369w = -1;
        this.f29370x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f29366n)) {
            int i10 = this.G;
            this.f29371y = i10;
            this.G = i10 + 2;
            this.f29369w = i10 + 1;
            mr0 mr0Var = this.K;
            if (mr0Var.F0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f29370x = i11;
                this.E = i12;
                this.G = mr0Var.F0.size() + i12;
            }
            int i13 = this.G;
            int i14 = i13 + 1;
            this.G = i14;
            this.F = i13;
            this.J = i14;
            return i14;
        }
        int i15 = this.G;
        int i16 = i15 + 1;
        this.G = i16;
        this.f29371y = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f29371y = -1;
            this.G = 0;
            this.J = 0;
            return 0;
        }
        int i17 = size + 1;
        this.G = i17;
        this.F = size;
        this.J = i17;
        return i17;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.F) {
            return 4;
        }
        if (i10 == this.f29371y) {
            return 1;
        }
        if (i10 == this.f29369w) {
            return 2;
        }
        if (i10 == this.f29370x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f29366n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.u6 u6Var;
        boolean z10;
        boolean z11;
        TLObject tLObject2;
        String str3;
        boolean z12;
        boolean z13;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        mr0 mr0Var = this.K;
        a0.h hVar = mr0Var.V;
        int i12 = e1Var.f47741f;
        View view = e1Var.f47738a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((mm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f29366n);
        String str4 = null;
        gr0 gr0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((ig.h0) mr0Var.F0.get(i10 - i13)).f14064a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f22176id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f22027id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f22176id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = gr0Var.f13990c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.y6.f23597q6;
                    u6Var2 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new p10(i14, u6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
                    tLObject2 = tLObject3;
                    str3 = spannableStringBuilder;
                } else {
                    tLObject2 = tLObject3;
                    str3 = str4;
                }
            } else {
                tLObject2 = null;
                str3 = null;
            }
            TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
            if (view instanceof org.telegram.ui.Cells.m6) {
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                m6Var.s(tLObject2, tL_encryptedChat2, str3, null, false, false);
                if (i10 < h() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                m6Var.M = z13;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k7Var.c(j12, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            ar0 ar0Var = (ar0) this.d.get(i15);
            j11 = ar0Var.f26601a.f22031id;
            str2 = ar0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) gr0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f22176id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f22027id;
                str = chat2.title;
            }
            String str7 = gr0Var.f13990c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.y6.f23597q6;
                u6Var = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new p10(i16, u6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                tLObject = tLObject4;
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
                tLObject = tLObject4;
            }
            j11 = j10;
        }
        if (view instanceof org.telegram.ui.Cells.m6) {
            org.telegram.ui.Cells.m6 m6Var2 = (org.telegram.ui.Cells.m6) view;
            m6Var2.s(tLObject, null, str2, null, false, false);
            if (i15 < h() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            m6Var2.M = z11;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.k7) {
            org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) view;
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var2.c(j11, z10, str8);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Cells.z3 z3Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        float f7;
        Context context = this.f29364c;
        mr0 mr0Var = this.K;
        if (i10 == 0) {
            u6Var = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
            m6Var.E0 = true;
            m6Var.f24464l0 = true;
            z3Var = m6Var;
        } else if (i10 == 2) {
            u6Var2 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(context, 6, u6Var2);
            za1Var.setItemAnimator(null);
            za1Var.setLayoutAnimation(null);
            ig.a0 a0Var = new ig.a0(11);
            a0Var.k1(0);
            za1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
            u6Var3 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            hr0 hr0Var = new hr0(this, context, i11, u6Var3);
            this.H = hr0Var;
            za1Var.setAdapter(hr0Var);
            za1Var.setOnItemClickListener(new j(this, 12));
            z3Var = za1Var;
        } else if (i10 == 3) {
            u6Var4 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.Cells.z3 z3Var2 = new org.telegram.ui.Cells.z3(context, u6Var4);
            z3Var2.setTextColor(org.telegram.ui.ActionBar.y6.f7);
            int i12 = org.telegram.ui.ActionBar.y6.f23376e7;
            u6Var5 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i12, z3Var2, u6Var5);
            z3Var2.setText(LocaleController.getString(R.string.Recent));
            z3Var = z3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                u6Var6 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
                View k7Var = new org.telegram.ui.Cells.k7(context, 0, u6Var6);
                k7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
                z3Var = k7Var;
            } else {
                View view = new View(context);
                if (mr0Var.f30710i0 && mr0Var.f30717p0[1] != null) {
                    f7 = 109.0f;
                } else {
                    f7 = 56.0f;
                }
                view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(f7)));
                z3Var = view;
            }
        } else {
            z3Var = new bi.cc(this, context, 22);
        }
        return new s4.e1(z3Var);
    }
}
