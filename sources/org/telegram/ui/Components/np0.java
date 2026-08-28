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
import org.telegram.ui.va1;
public final class np0 extends vk0 {
    public int C;
    public mp0 D;
    public int F;
    public final rp0 G;
    public final Context f31145c;
    public final lp0 f31146e;
    public kp0 f31147f;
    public kp0 h;
    public String f31148n;
    public int f31149r;
    public int f31150s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f31151w = -1;
    public int f31152x = -1;
    public int f31153y = -1;
    public int A = -1;
    public int B = -1;
    public boolean E = false;

    public np0(rp0 rp0Var, Context context) {
        this.G = rp0Var;
        this.f31145c = context;
        ?? v1Var = new of.v1(false);
        this.f31146e = v1Var;
        v1Var.f19524a = new n5.a0(this, 10);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 1 && i9 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f31148n)) {
            return;
        }
        this.f31148n = str;
        if (this.f31147f != null) {
            Utilities.searchQueue.cancelRunnable(this.f31147f);
            this.f31147f = null;
        }
        kp0 kp0Var = this.h;
        if (kp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kp0Var);
            this.h = null;
        }
        this.d.clear();
        this.f31146e.f(null, null);
        this.f31146e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.G.K0(true);
        if (TextUtils.isEmpty(str)) {
            rp0.E0(this.G);
            this.f31149r = -1;
            this.E = false;
        } else {
            this.E = true;
            int i9 = this.f31149r + 1;
            this.f31149r = i9;
            this.G.M.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kp0 kp0Var2 = new kp0(this, str, i9, 0);
            this.f31147f = kp0Var2;
            dispatchQueue.postRunnable(kp0Var2, 300L);
        }
        this.G.K0(false);
    }

    @Override
    public final int h() {
        this.C = 0;
        this.f31151w = -1;
        this.f31152x = -1;
        this.A = -1;
        this.B = -1;
        if (TextUtils.isEmpty(this.f31148n)) {
            int i9 = this.C;
            this.f31153y = i9;
            this.C = i9 + 2;
            this.f31151w = i9 + 1;
            rp0 rp0Var = this.G;
            if (rp0Var.A0.size() > 0) {
                int i10 = this.C;
                int i11 = i10 + 1;
                this.C = i11;
                this.f31152x = i10;
                this.A = i11;
                this.C = rp0Var.A0.size() + i11;
            }
            int i12 = this.C;
            int i13 = i12 + 1;
            this.C = i13;
            this.B = i12;
            this.F = i13;
            return i13;
        }
        int i14 = this.C;
        int i15 = i14 + 1;
        this.C = i15;
        this.f31153y = i14;
        int size = this.f31146e.d.size() + this.d.size() + i15;
        this.C = size;
        if (size == 1) {
            this.f31153y = -1;
            this.C = 0;
            this.F = 0;
            return 0;
        }
        int i16 = size + 1;
        this.C = i16;
        this.B = size;
        this.F = i16;
        return i16;
    }

    @Override
    public final int j(int i9) {
        if (i9 == this.B) {
            return 4;
        }
        if (i9 == this.f31153y) {
            return 1;
        }
        if (i9 == this.f31151w) {
            return 2;
        }
        if (i9 == this.f31152x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f31148n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.b6 b6Var;
        boolean z10;
        boolean z11;
        TLObject tLObject2;
        String str3;
        boolean z12;
        boolean z13;
        int i10;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        rp0 rp0Var = this.G;
        a0.h hVar = rp0Var.Q;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i11 != 0 && i11 != 5) {
            if (i11 == 2) {
                ((wk0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f31148n);
        String str4 = null;
        lp0 lp0Var = this.f31146e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i12 = this.A;
            long j12 = 0;
            if (i12 >= 0 && i9 >= i12) {
                TLObject tLObject3 = ((of.e0) rp0Var.A0.get(i9 - i12)).f19279a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f22527id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f22380id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f22527id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = lp0Var.f19526c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i13 = org.telegram.ui.ActionBar.f6.f23229q6;
                    b6Var2 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new p00(i13, b6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
                if (i9 < h() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                h6Var.I = z13;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.e7) {
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e7Var.c(j12, z12, str6);
                return;
            }
            return;
        }
        int i14 = i9 - 1;
        if (i14 < this.d.size()) {
            fp0 fp0Var = (fp0) this.d.get(i14);
            j11 = fp0Var.f28539a.f22384id;
            str2 = fp0Var.d;
            tLObject = null;
        } else {
            i14 -= this.d.size();
            TLObject tLObject4 = (TLObject) lp0Var.d.get(i14);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f22527id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f22380id;
                str = chat2.title;
            }
            String str7 = lp0Var.f19526c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i15 = org.telegram.ui.ActionBar.f6.f23229q6;
                b6Var = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new p00(i15, b6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                tLObject = tLObject4;
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
                tLObject = tLObject4;
            }
            j11 = j10;
        }
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.t(tLObject, null, str2, null, false, false);
            if (i14 < h() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            h6Var2.I = z11;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.e7) {
            org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) view;
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e7Var2.c(j11, z10, str8);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.Cells.v3 v3Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        float f10;
        Context context = this.f31145c;
        rp0 rp0Var = this.G;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, b6Var);
            h6Var.A0 = true;
            h6Var.f24447h0 = true;
            v3Var = h6Var;
        } else if (i9 == 2) {
            b6Var2 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            va1 va1Var = new va1(context, 6, b6Var2);
            va1Var.setItemAnimator(null);
            va1Var.setLayoutAnimation(null);
            of.y yVar = new of.y(10);
            yVar.j1(0);
            va1Var.setLayoutManager(yVar);
            i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            b6Var3 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            mp0 mp0Var = new mp0(this, context, i10, b6Var3);
            this.D = mp0Var;
            va1Var.setAdapter(mp0Var);
            va1Var.setOnItemClickListener(new j(this, 12));
            v3Var = va1Var;
        } else if (i9 == 3) {
            b6Var4 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            org.telegram.ui.Cells.v3 v3Var2 = new org.telegram.ui.Cells.v3(context, b6Var4);
            v3Var2.setTextColor(org.telegram.ui.ActionBar.f6.f23038f7);
            v3Var2.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23020e7));
            v3Var2.setText(LocaleController.getString(R.string.Recent));
            v3Var = v3Var2;
        } else if (i9 != 4) {
            if (i9 == 5) {
                b6Var5 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
                View e7Var = new org.telegram.ui.Cells.e7(context, 0, b6Var5);
                e7Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(100.0f)));
                v3Var = e7Var;
            } else {
                View view = new View(context);
                if (rp0Var.f32246d0 && rp0Var.f32255k0[1] != null) {
                    f10 = 109.0f;
                } else {
                    f10 = 56.0f;
                }
                view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(f10)));
                v3Var = view;
            }
        } else {
            v3Var = new fh.l2(this, context, 21);
        }
        return new f2.q1(v3Var);
    }
}
