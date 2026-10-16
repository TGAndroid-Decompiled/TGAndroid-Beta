package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kc1;
public final class er0 extends lm0 {
    public int G;
    public dr0 H;
    public int J;
    public final ir0 K;
    public final Context f24457c;
    public final cr0 e;
    public br0 f24458f;
    public br0 h;
    public String f24459n;
    public int f24460r;
    public int f24461s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f24462w = -1;
    public int f24463x = -1;
    public int f24464y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public er0(ir0 ir0Var, Context context) {
        this.K = ir0Var;
        this.f24457c = context;
        ?? a2Var = new hg.a2(false);
        this.e = a2Var;
        a2Var.f10488a = new ji.w4(this, 16);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f24459n)) {
            return;
        }
        this.f24459n = str;
        if (this.f24458f != null) {
            Utilities.searchQueue.cancelRunnable(this.f24458f);
            this.f24458f = null;
        }
        br0 br0Var = this.h;
        if (br0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(br0Var);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.K.L0(true);
        if (TextUtils.isEmpty(str)) {
            ir0.G0(this.K);
            this.f24460r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f24460r + 1;
            this.f24460r = i10;
            this.K.Q.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            br0 br0Var2 = new br0(this, str, i10, 0);
            this.f24458f = br0Var2;
            dispatchQueue.postRunnable(br0Var2, 300L);
        }
        this.K.L0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f24462w = -1;
        this.f24463x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f24459n)) {
            int i10 = this.G;
            this.f24464y = i10;
            this.G = i10 + 2;
            this.f24462w = i10 + 1;
            ir0 ir0Var = this.K;
            if (ir0Var.E0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f24463x = i11;
                this.E = i12;
                this.G = ir0Var.E0.size() + i12;
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
        this.f24464y = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f24464y = -1;
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
        if (i10 == this.f24464y) {
            return 1;
        }
        if (i10 == this.f24462w) {
            return 2;
        }
        if (i10 == this.f24463x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f24459n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean z10;
        boolean z11;
        TLObject tLObject2;
        String str3;
        boolean z12;
        boolean z13;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        ir0 ir0Var = this.K;
        a0.h hVar = ir0Var.U;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((mm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f24459n);
        String str4 = null;
        cr0 cr0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((hg.g0) ir0Var.E0.get(i10 - i13)).f10562a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f19063id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f18916id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f19063id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = cr0Var.f10490c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.g6.q6;
                    c6Var2 = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new q10(i14, c6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i6Var.u(tLObject2, tL_encryptedChat2, str3, null, false, false);
                if (i10 < h() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i6Var.M = z13;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f7Var.c(j12, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            wq0 wq0Var = (wq0) this.d.get(i15);
            j11 = wq0Var.f30635a.f18920id;
            str2 = wq0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) cr0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f19063id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f18916id;
                str = chat2.title;
            }
            String str7 = cr0Var.f10490c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.g6.q6;
                c6Var = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new q10(i16, c6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                tLObject = tLObject4;
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
                tLObject = tLObject4;
            }
            j11 = j10;
        }
        if (view instanceof org.telegram.ui.Cells.i6) {
            org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) view;
            i6Var2.u(tLObject, null, str2, null, false, false);
            if (i15 < h() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var2.M = z11;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.f7) {
            org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) view;
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7Var2.c(j11, z10, str8);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.v3 v3Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        float f7;
        Context context = this.f24457c;
        ir0 ir0Var = this.K;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, c6Var);
            i6Var.E0 = true;
            i6Var.f21022l0 = true;
            v3Var = i6Var;
        } else if (i10 == 2) {
            c6Var2 = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
            kc1 kc1Var = new kc1(context, 6, c6Var2);
            kc1Var.setItemAnimator(null);
            kc1Var.setLayoutAnimation(null);
            hg.a0 a0Var = new hg.a0(11);
            a0Var.j1(0);
            kc1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
            c6Var3 = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
            dr0 dr0Var = new dr0(this, context, i11, c6Var3);
            this.H = dr0Var;
            kc1Var.setAdapter(dr0Var);
            kc1Var.setOnItemClickListener(new j(this, 12));
            v3Var = kc1Var;
        } else if (i10 == 3) {
            c6Var4 = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
            org.telegram.ui.Cells.v3 v3Var2 = new org.telegram.ui.Cells.v3(context, c6Var4);
            v3Var2.setTextColor(org.telegram.ui.ActionBar.g6.f7);
            v3Var2.setBackgroundColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.g6.e7));
            v3Var2.setText(LocaleController.getString(R.string.Recent));
            v3Var = v3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                c6Var5 = ((org.telegram.ui.ActionBar.e3) ir0Var).resourcesProvider;
                View f7Var = new org.telegram.ui.Cells.f7(context, 0, c6Var5);
                f7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
                v3Var = f7Var;
            } else {
                View view = new View(context);
                if (ir0Var.f25750h0 && ir0Var.f25757o0[1] != null) {
                    f7 = 109.0f;
                } else {
                    f7 = 56.0f;
                }
                view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(f7)));
                v3Var = view;
            }
        } else {
            v3Var = new di.ab(this, context, 22);
        }
        return new s4.b1(v3Var);
    }
}
