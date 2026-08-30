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
import org.telegram.ui.jb1;
public final class hq0 extends rl0 {
    public int D;
    public gq0 E;
    public int G;
    public final lq0 H;
    public final Context f25469c;
    public final fq0 e;
    public eq0 f25470f;
    public eq0 h;
    public String f25471n;
    public int f25472r;
    public int f25473s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f25474w = -1;
    public int f25475x = -1;
    public int f25476y = -1;
    public int B = -1;
    public int C = -1;
    public boolean F = false;

    public hq0(lq0 lq0Var, Context context) {
        this.H = lq0Var;
        this.f25469c = context;
        ?? k1Var = new tf.k1(false);
        this.e = k1Var;
        k1Var.f44769a = new qk0(this, 1);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f25471n)) {
            return;
        }
        this.f25471n = str;
        if (this.f25470f != null) {
            Utilities.searchQueue.cancelRunnable(this.f25470f);
            this.f25470f = null;
        }
        eq0 eq0Var = this.h;
        if (eq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(eq0Var);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.H.K0(true);
        if (TextUtils.isEmpty(str)) {
            lq0.F0(this.H);
            this.f25472r = -1;
            this.F = false;
        } else {
            this.F = true;
            int i10 = this.f25472r + 1;
            this.f25472r = i10;
            this.H.N.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            eq0 eq0Var2 = new eq0(this, str, i10, 0);
            this.f25470f = eq0Var2;
            dispatchQueue.postRunnable(eq0Var2, 300L);
        }
        this.H.K0(false);
    }

    @Override
    public final int h() {
        this.D = 0;
        this.f25474w = -1;
        this.f25475x = -1;
        this.B = -1;
        this.C = -1;
        if (TextUtils.isEmpty(this.f25471n)) {
            int i10 = this.D;
            this.f25476y = i10;
            this.D = i10 + 2;
            this.f25474w = i10 + 1;
            lq0 lq0Var = this.H;
            if (lq0Var.B0.size() > 0) {
                int i11 = this.D;
                int i12 = i11 + 1;
                this.D = i12;
                this.f25475x = i11;
                this.B = i12;
                this.D = lq0Var.B0.size() + i12;
            }
            int i13 = this.D;
            int i14 = i13 + 1;
            this.D = i14;
            this.C = i13;
            this.G = i14;
            return i14;
        }
        int i15 = this.D;
        int i16 = i15 + 1;
        this.D = i16;
        this.f25476y = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.D = size;
        if (size == 1) {
            this.f25476y = -1;
            this.D = 0;
            this.G = 0;
            return 0;
        }
        int i17 = size + 1;
        this.D = i17;
        this.C = size;
        this.G = i17;
        return i17;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.C) {
            return 4;
        }
        if (i10 == this.f25476y) {
            return 1;
        }
        if (i10 == this.f25474w) {
            return 2;
        }
        if (i10 == this.f25475x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f25471n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z4;
        boolean z10;
        TLObject tLObject2;
        String str3;
        boolean z11;
        boolean z12;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        lq0 lq0Var = this.H;
        a0.h hVar = lq0Var.R;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((sl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f25471n);
        String str4 = null;
        fq0 fq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.B;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((tf.y) lq0Var.B0.get(i10 - i13)).f44880a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f19331id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f19184id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f19331id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = fq0Var.f44771c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.j6.f20140q6;
                    f6Var2 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new e10(i14, f6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
                if (i10 < h() - 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h6Var.J = z12;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.e7) {
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                if (hVar.h(j12) >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e7Var.c(j12, z11, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            zp0 zp0Var = (zp0) this.d.get(i15);
            j11 = zp0Var.f31426a.f19188id;
            str2 = zp0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) fq0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f19331id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f19184id;
                str = chat2.title;
            }
            String str7 = fq0Var.f44771c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.j6.f20140q6;
                f6Var = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new e10(i16, f6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
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
            if (i15 < h() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h6Var2.J = z10;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.e7) {
            org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) view;
            if (hVar.h(j11) >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            e7Var2.c(j11, z4, str8);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.u3 u3Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        float f10;
        Context context = this.f25469c;
        lq0 lq0Var = this.H;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
            h6Var.B0 = true;
            h6Var.f21145i0 = true;
            u3Var = h6Var;
        } else if (i10 == 2) {
            f6Var2 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            jb1 jb1Var = new jb1(context, 5, f6Var2);
            jb1Var.setItemAnimator(null);
            jb1Var.setLayoutAnimation(null);
            org.telegram.ui.k kVar = new org.telegram.ui.k(9);
            kVar.j1(0);
            jb1Var.setLayoutManager(kVar);
            i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
            f6Var3 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            gq0 gq0Var = new gq0(this, context, i11, f6Var3);
            this.E = gq0Var;
            jb1Var.setAdapter(gq0Var);
            jb1Var.setOnItemClickListener(new k(this, 12));
            u3Var = jb1Var;
        } else if (i10 == 3) {
            f6Var4 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var2 = new org.telegram.ui.Cells.u3(context, f6Var4);
            u3Var2.setTextColor(org.telegram.ui.ActionBar.j6.f19943f7);
            u3Var2.setBackgroundColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19924e7));
            u3Var2.setText(LocaleController.getString(R.string.Recent));
            u3Var = u3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                f6Var5 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
                View e7Var = new org.telegram.ui.Cells.e7(context, 0, f6Var5);
                e7Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
                u3Var = e7Var;
            } else {
                View view = new View(context);
                if (lq0Var.f26848e0 && lq0Var.f26856l0[1] != null) {
                    f10 = 109.0f;
                } else {
                    f10 = 56.0f;
                }
                view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(f10)));
                u3Var = view;
            }
        } else {
            u3Var = new eg.h0(this, context, 17);
        }
        return new f2.l1(u3Var);
    }
}
