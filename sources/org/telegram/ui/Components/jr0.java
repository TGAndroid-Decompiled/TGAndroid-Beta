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
public final class jr0 extends mm0 {
    public int G;
    public ir0 H;
    public int J;
    public final nr0 K;
    public final Context f29749c;
    public final hr0 e;
    public gr0 f29750f;
    public gr0 h;
    public String f29751n;
    public int f29752r;
    public int f29753s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f29754w = -1;
    public int f29755x = -1;
    public int f29756y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public jr0(nr0 nr0Var, Context context) {
        this.K = nr0Var;
        this.f29749c = context;
        ?? a2Var = new ig.a2(false);
        this.e = a2Var;
        a2Var.f13987a = new li.e3(this, 11);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f29751n)) {
            return;
        }
        this.f29751n = str;
        if (this.f29750f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29750f);
            this.f29750f = null;
        }
        gr0 gr0Var = this.h;
        if (gr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gr0Var);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.K.M0(true);
        if (TextUtils.isEmpty(str)) {
            nr0.C0(this.K);
            this.f29752r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f29752r + 1;
            this.f29752r = i10;
            this.K.R.e(true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            gr0 gr0Var2 = new gr0(this, str, i10, 0);
            this.f29750f = gr0Var2;
            dispatchQueue2.postRunnable(gr0Var2, 300L);
        }
        this.K.M0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f29754w = -1;
        this.f29755x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f29751n)) {
            int i10 = this.G;
            this.f29756y = i10;
            this.G = i10 + 2;
            this.f29754w = i10 + 1;
            nr0 nr0Var = this.K;
            if (nr0Var.F0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f29755x = i11;
                this.E = i12;
                this.G = nr0Var.F0.size() + i12;
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
        this.f29756y = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f29756y = -1;
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
        if (i10 == this.f29756y) {
            return 1;
        }
        if (i10 == this.f29754w) {
            return 2;
        }
        if (i10 == this.f29755x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f29751n)) {
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
        nr0 nr0Var = this.K;
        a0.h hVar = nr0Var.V;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((nm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f29751n);
        String str4 = null;
        hr0 hr0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((ig.h0) nr0Var.F0.get(i10 - i13)).f14063a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f22177id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f22028id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f22177id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = hr0Var.f13989c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.y6.f23598q6;
                    u6Var2 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
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
            br0 br0Var = (br0) this.d.get(i15);
            j11 = br0Var.f26898a.f22032id;
            str2 = br0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) hr0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f22177id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f22028id;
                str = chat2.title;
            }
            String str7 = hr0Var.f13989c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.y6.f23598q6;
                u6Var = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
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
        Context context = this.f29749c;
        nr0 nr0Var = this.K;
        if (i10 == 0) {
            u6Var = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
            m6Var.E0 = true;
            m6Var.f24466l0 = true;
            z3Var = m6Var;
        } else if (i10 == 2) {
            u6Var2 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
            org.telegram.ui.bb1 bb1Var = new org.telegram.ui.bb1(context, 6, u6Var2);
            bb1Var.setItemAnimator(null);
            bb1Var.setLayoutAnimation(null);
            ig.a0 a0Var = new ig.a0(11);
            a0Var.k1(0);
            bb1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
            u6Var3 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
            ir0 ir0Var = new ir0(this, context, i11, u6Var3);
            this.H = ir0Var;
            bb1Var.setAdapter(ir0Var);
            bb1Var.setOnItemClickListener(new j(this, 12));
            z3Var = bb1Var;
        } else if (i10 == 3) {
            u6Var4 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
            org.telegram.ui.Cells.z3 z3Var2 = new org.telegram.ui.Cells.z3(context, u6Var4);
            z3Var2.setTextColor(org.telegram.ui.ActionBar.y6.f7);
            int i12 = org.telegram.ui.ActionBar.y6.f23377e7;
            u6Var5 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i12, z3Var2, u6Var5);
            z3Var2.setText(LocaleController.getString(R.string.Recent));
            z3Var = z3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                u6Var6 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
                View k7Var = new org.telegram.ui.Cells.k7(context, 0, u6Var6);
                k7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
                z3Var = k7Var;
            } else {
                View view = new View(context);
                if (nr0Var.f31041i0 && nr0Var.f31048p0[1] != null) {
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
