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
import org.telegram.ui.wa1;
public final class zp0 extends il0 {
    public int C;
    public yp0 D;
    public int F;
    public final dq0 G;
    public final Context f35389c;
    public final xp0 f35390e;
    public vp0 f35391f;
    public vp0 h;
    public String f35392n;
    public int f35393r;
    public int f35394s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f35395w = -1;
    public int f35396x = -1;
    public int f35397y = -1;
    public int A = -1;
    public int B = -1;
    public boolean E = false;

    public zp0(dq0 dq0Var, Context context) {
        this.G = dq0Var;
        this.f35389c = context;
        ?? k1Var = new rf.k1(false);
        this.f35390e = k1Var;
        k1Var.f47277a = new nh.d6(this, 10);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f35392n)) {
            return;
        }
        this.f35392n = str;
        if (this.f35391f != null) {
            Utilities.searchQueue.cancelRunnable(this.f35391f);
            this.f35391f = null;
        }
        vp0 vp0Var = this.h;
        if (vp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vp0Var);
            this.h = null;
        }
        this.d.clear();
        this.f35390e.f(null, null);
        this.f35390e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.G.K0(true);
        if (TextUtils.isEmpty(str)) {
            dq0.F0(this.G);
            this.f35393r = -1;
            this.E = false;
        } else {
            this.E = true;
            int i10 = this.f35393r + 1;
            this.f35393r = i10;
            this.G.M.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            vp0 vp0Var2 = new vp0(this, str, i10, 0);
            this.f35391f = vp0Var2;
            dispatchQueue.postRunnable(vp0Var2, 300L);
        }
        this.G.K0(false);
    }

    @Override
    public final int h() {
        this.C = 0;
        this.f35395w = -1;
        this.f35396x = -1;
        this.A = -1;
        this.B = -1;
        if (TextUtils.isEmpty(this.f35392n)) {
            int i10 = this.C;
            this.f35397y = i10;
            this.C = i10 + 2;
            this.f35395w = i10 + 1;
            dq0 dq0Var = this.G;
            if (dq0Var.A0.size() > 0) {
                int i11 = this.C;
                int i12 = i11 + 1;
                this.C = i12;
                this.f35396x = i11;
                this.A = i12;
                this.C = dq0Var.A0.size() + i12;
            }
            int i13 = this.C;
            int i14 = i13 + 1;
            this.C = i14;
            this.B = i13;
            this.F = i14;
            return i14;
        }
        int i15 = this.C;
        int i16 = i15 + 1;
        this.C = i16;
        this.f35397y = i15;
        int size = this.f35390e.d.size() + this.d.size() + i16;
        this.C = size;
        if (size == 1) {
            this.f35397y = -1;
            this.C = 0;
            this.F = 0;
            return 0;
        }
        int i17 = size + 1;
        this.C = i17;
        this.B = size;
        this.F = i17;
        return i17;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.B) {
            return 4;
        }
        if (i10 == this.f35397y) {
            return 1;
        }
        if (i10 == this.f35395w) {
            return 2;
        }
        if (i10 == this.f35396x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f35392n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
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
        dq0 dq0Var = this.G;
        a0.h hVar = dq0Var.Q;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((jl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f35392n);
        String str4 = null;
        xp0 xp0Var = this.f35390e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.A;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((rf.z) dq0Var.A0.get(i10 - i13)).f47408a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f22539id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f22392id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f22539id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = xp0Var.f47279c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.g6.q6;
                    c6Var2 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new a10(i14, c6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                f6Var.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
                if (i10 < h() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f6Var.I = z13;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.c7) {
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c7Var.c(j12, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            qp0 qp0Var = (qp0) this.d.get(i15);
            j11 = qp0Var.f32026a.f22396id;
            str2 = qp0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) xp0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f22539id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f22392id;
                str = chat2.title;
            }
            String str7 = xp0Var.f47279c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.g6.q6;
                c6Var = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new a10(i16, c6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                tLObject = tLObject4;
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
                tLObject = tLObject4;
            }
            j11 = j10;
        }
        if (view instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var2 = (org.telegram.ui.Cells.f6) view;
            f6Var2.t(tLObject, null, str2, null, false, false);
            if (i15 < h() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            f6Var2.I = z11;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.c7) {
            org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) view;
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c7Var2.c(j11, z10, str8);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.s3 s3Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        float f9;
        Context context = this.f35389c;
        dq0 dq0Var = this.G;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, c6Var);
            f6Var.A0 = true;
            f6Var.f24327h0 = true;
            s3Var = f6Var;
        } else if (i10 == 2) {
            c6Var2 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            wa1 wa1Var = new wa1(context, 5, c6Var2);
            wa1Var.setItemAnimator(null);
            wa1Var.setLayoutAnimation(null);
            org.telegram.ui.k kVar = new org.telegram.ui.k(9);
            kVar.j1(0);
            wa1Var.setLayoutManager(kVar);
            i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            c6Var3 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            yp0 yp0Var = new yp0(this, context, i11, c6Var3);
            this.D = yp0Var;
            wa1Var.setAdapter(yp0Var);
            wa1Var.setOnItemClickListener(new k(this, 12));
            s3Var = wa1Var;
        } else if (i10 == 3) {
            c6Var4 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            org.telegram.ui.Cells.s3 s3Var2 = new org.telegram.ui.Cells.s3(context, c6Var4);
            s3Var2.setTextColor(org.telegram.ui.ActionBar.g6.f23100f7);
            s3Var2.setBackgroundColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23081e7));
            s3Var2.setText(LocaleController.getString(R.string.Recent));
            s3Var = s3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                c6Var5 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
                View c7Var = new org.telegram.ui.Cells.c7(context, 0, c6Var5);
                c7Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
                s3Var = c7Var;
            } else {
                View view = new View(context);
                if (dq0Var.f27832d0 && dq0Var.f27841k0[1] != null) {
                    f9 = 109.0f;
                } else {
                    f9 = 56.0f;
                }
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(f9)));
                s3Var = view;
            }
        } else {
            s3Var = new cg.h0(this, context, 19);
        }
        return new f2.n1(s3Var);
    }
}
