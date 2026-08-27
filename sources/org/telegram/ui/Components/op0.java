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
import org.telegram.ui.ta1;

public final class op0 extends yk0 {
    public int C;
    public np0 D;
    public int F;
    public final sp0 G;

    public final Context f31374c;

    public final mp0 f31375e;

    public kp0 f31376f;
    public kp0 h;

    public String f31377n;

    public int f31378r;

    public int f31379s;
    public int v;
    public ArrayList d = new ArrayList();

    public int f31380w = -1;

    public int f31381x = -1;

    public int f31382y = -1;
    public int A = -1;
    public int B = -1;
    public boolean E = false;

    public op0(sp0 sp0Var, Context context) {
        this.G = sp0Var;
        this.f31374c = context;
        mp0 mp0Var = new mp0(false);
        this.f31375e = mp0Var;
        mp0Var.f45836a = new n2.b0(this, 12);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.f31377n)) {
            this.f31377n = str;
            if (this.f31376f != null) {
                Utilities.searchQueue.cancelRunnable(this.f31376f);
                this.f31376f = null;
            }
            kp0 kp0Var = this.h;
            if (kp0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(kp0Var);
                this.h = null;
            }
            this.d.clear();
            this.f31375e.f(null, null);
            this.f31375e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.G.K0(true);
            if (TextUtils.isEmpty(str)) {
                sp0.F0(this.G);
                this.f31378r = -1;
                this.E = false;
            } else {
                this.E = true;
                int i10 = this.f31378r + 1;
                this.f31378r = i10;
                this.G.M.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                kp0 kp0Var2 = new kp0(this, str, i10, 0);
                this.f31376f = kp0Var2;
                dispatchQueue.postRunnable(kp0Var2, 300L);
            }
            this.G.K0(false);
        }
    }

    @Override
    public final int h() {
        this.C = 0;
        this.f31380w = -1;
        this.f31381x = -1;
        this.A = -1;
        this.B = -1;
        if (!TextUtils.isEmpty(this.f31377n)) {
            int i10 = this.C;
            int i11 = i10 + 1;
            this.C = i11;
            this.f31382y = i10;
            int size = this.f31375e.d.size() + this.d.size() + i11;
            this.C = size;
            if (size == 1) {
                this.f31382y = -1;
                this.C = 0;
                this.F = 0;
                return 0;
            }
            int i12 = size + 1;
            this.C = i12;
            this.B = size;
            this.F = i12;
            return i12;
        }
        int i13 = this.C;
        this.f31382y = i13;
        this.C = i13 + 2;
        this.f31380w = i13 + 1;
        sp0 sp0Var = this.G;
        if (sp0Var.A0.size() > 0) {
            int i14 = this.C;
            int i15 = i14 + 1;
            this.C = i15;
            this.f31381x = i14;
            this.A = i15;
            this.C = sp0Var.A0.size() + i15;
        }
        int i16 = this.C;
        int i17 = i16 + 1;
        this.C = i17;
        this.B = i16;
        this.F = i17;
        return i17;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.B) {
            return 4;
        }
        if (i10 == this.f31382y) {
            return 1;
        }
        if (i10 == this.f31380w) {
            return 2;
        }
        if (i10 == this.f31381x) {
            return 3;
        }
        return TextUtils.isEmpty(this.f31377n) ? 0 : 5;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLObject tLObject;
        long j10;
        String name;
        CharSequence charSequence;
        long j11;
        int iIndexOfIgnoreCase;
        TLObject tLObject2;
        CharSequence charSequence2;
        int iIndexOfIgnoreCase2;
        sp0 sp0Var = this.G;
        a0.h hVar = sp0Var.Q;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0 && i11 != 5) {
            if (i11 == 2) {
                ((zk0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f31377n);
        String name2 = null;
        mp0 mp0Var = this.f31375e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!zIsEmpty) {
            int size = i10 - 1;
            if (size < this.d.size()) {
                fp0 fp0Var = (fp0) this.d.get(size);
                j11 = fp0Var.f28428a.f22384id;
                charSequence = fp0Var.d;
                tLObject = null;
            } else {
                size -= this.d.size();
                tLObject = (TLObject) mp0Var.d.get(size);
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    j10 = user.f22527id;
                    name = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    j10 = -chat.f22380id;
                    name = chat.title;
                }
                String str = mp0Var.f45838c;
                if (TextUtils.isEmpty(str) || name == null || (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(name.toString(), str)) == -1) {
                    charSequence = name;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
                    spannableStringBuilder.setSpan(new s00(org.telegram.ui.ActionBar.g6.q6, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider), iIndexOfIgnoreCase, str.length() + iIndexOfIgnoreCase, 33);
                    charSequence = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                e6Var.u(tLObject, null, charSequence, null, false, false);
                e6Var.I = size < h() + (-2);
                return;
            } else {
                CharSequence charSequence3 = charSequence;
                if (view instanceof org.telegram.ui.Cells.b7) {
                    ((org.telegram.ui.Cells.b7) view).c(j11, hVar.h(j11) >= 0, charSequence3);
                    return;
                }
                return;
            }
        }
        int i12 = this.A;
        long j12 = 0;
        if (i12 < 0 || i10 < i12) {
            tLObject2 = null;
            charSequence2 = null;
        } else {
            TLObject tLObject3 = ((pf.y) sp0Var.A0.get(i10 - i12)).f45967a;
            if (tLObject3 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject3;
                j12 = user2.f22527id;
                name2 = ContactsController.formatName(user2.first_name, user2.last_name);
            } else if (tLObject3 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                j12 = -chat2.f22380id;
                name2 = chat2.title;
            } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                TLRPC.User user3 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.f22527id;
                    name2 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str2 = mp0Var.f45838c;
            if (TextUtils.isEmpty(str2) || name2 == null || (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(name2.toString(), str2)) == -1) {
                tLObject2 = tLObject3;
                charSequence2 = name2;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(name2);
                spannableStringBuilder2.setSpan(new s00(org.telegram.ui.ActionBar.g6.q6, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider), iIndexOfIgnoreCase2, str2.length() + iIndexOfIgnoreCase2, 33);
                tLObject2 = tLObject3;
                charSequence2 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.u(tLObject2, tL_encryptedChat2, charSequence2, null, false, false);
            e6Var2.I = i10 < h() + (-2);
        } else {
            CharSequence charSequence4 = charSequence2;
            if (view instanceof org.telegram.ui.Cells.b7) {
                ((org.telegram.ui.Cells.b7) view).c(j12, hVar.h(j12) >= 0, charSequence4);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s0Var;
        Context context = this.f31374c;
        sp0 sp0Var = this.G;
        if (i10 == 0) {
            org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider);
            e6Var.A0 = true;
            e6Var.f24276h0 = true;
            s0Var = e6Var;
        } else if (i10 == 2) {
            ta1 ta1Var = new ta1(context, 5, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider);
            ta1Var.setItemAnimator(null);
            ta1Var.setLayoutAnimation(null);
            org.telegram.ui.j jVar = new org.telegram.ui.j(9);
            jVar.j1(0);
            ta1Var.setLayoutManager(jVar);
            np0 np0Var = new np0(this, context, ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider);
            this.D = np0Var;
            ta1Var.setAdapter(np0Var);
            ta1Var.setOnItemClickListener(new j(this, 12));
            s0Var = ta1Var;
        } else if (i10 == 3) {
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider);
            s3Var.setTextColor(org.telegram.ui.ActionBar.g6.f23091f7);
            s3Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23073e7));
            s3Var.setText(LocaleController.getString(R.string.Recent));
            s0Var = s3Var;
        } else if (i10 == 4) {
            s0Var = new ag.s0(this, context, 21);
        } else if (i10 != 5) {
            View view = new View(context);
            view.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp((!sp0Var.f32524d0 || sp0Var.f32533k0[1] == null) ? 56.0f : 109.0f)));
            s0Var = view;
        } else {
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, 0, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider);
            b7Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(100.0f)));
            s0Var = b7Var;
        }
        return new lk0(s0Var);
    }
}
