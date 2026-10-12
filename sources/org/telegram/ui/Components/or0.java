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
import org.telegram.ui.hc1;
public final class or0 extends vm0 {
    public int G;
    public nr0 H;
    public int J;
    public final sr0 K;
    public final Context f29276c;
    public final mr0 f29277e;
    public lr0 f29278f;
    public lr0 h;
    public String f29279n;
    public int f29280r;
    public int f29281s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f29282w = -1;
    public int f29283x = -1;
    public int f29284y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public or0(sr0 sr0Var, Context context) {
        this.K = sr0Var;
        this.f29276c = context;
        ?? b2Var = new gg.b2(false);
        this.f29277e = b2Var;
        b2Var.f10530a = new l2.g(this, 13);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47901f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f29279n)) {
            return;
        }
        this.f29279n = str;
        if (this.f29278f != null) {
            Utilities.searchQueue.cancelRunnable(this.f29278f);
            this.f29278f = null;
        }
        lr0 lr0Var = this.h;
        if (lr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lr0Var);
            this.h = null;
        }
        this.d.clear();
        this.f29277e.f(null, null);
        this.f29277e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.K.L0(true);
        if (TextUtils.isEmpty(str)) {
            sr0.G0(this.K);
            this.f29280r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f29280r + 1;
            this.f29280r = i10;
            this.K.Q.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            lr0 lr0Var2 = new lr0(this, str, i10, 0);
            this.f29278f = lr0Var2;
            dispatchQueue.postRunnable(lr0Var2, 300L);
        }
        this.K.L0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f29282w = -1;
        this.f29283x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f29279n)) {
            int i10 = this.G;
            this.f29284y = i10;
            this.G = i10 + 2;
            this.f29282w = i10 + 1;
            sr0 sr0Var = this.K;
            if (sr0Var.E0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f29283x = i11;
                this.E = i12;
                this.G = sr0Var.E0.size() + i12;
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
        this.f29284y = i15;
        int size = this.f29277e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f29284y = -1;
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
        if (i10 == this.f29284y) {
            return 1;
        }
        if (i10 == this.f29282w) {
            return 2;
        }
        if (i10 == this.f29283x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f29279n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        long j3;
        String str;
        String str2;
        TLObject tLObject;
        long j10;
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
        sr0 sr0Var = this.K;
        a0.i iVar = sr0Var.U;
        int i12 = d1Var.f47901f;
        View view = d1Var.f47897a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((wm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f29279n);
        String str4 = null;
        mr0 mr0Var = this.f29277e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j11 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((gg.g0) sr0Var.E0.get(i10 - i13)).f10607a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f19950id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f19803id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.e3) sr0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j11 = user2.f19950id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = mr0Var.f10532c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.h6.q6;
                    c6Var2 = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new x10(i14, c6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
                if (iVar.h(j11) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f7Var.c(j11, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            gr0 gr0Var = (gr0) this.d.get(i15);
            j10 = gr0Var.f26499a.f19807id;
            str2 = gr0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) mr0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j3 = user3.f19950id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j3 = -chat2.f19803id;
                str = chat2.title;
            }
            String str7 = mr0Var.f10532c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.h6.q6;
                c6Var = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new x10(i16, c6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                tLObject = tLObject4;
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
                tLObject = tLObject4;
            }
            j10 = j3;
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
            if (iVar.h(j10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7Var2.c(j10, z10, str8);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.v3 v3Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        float f7;
        Context context = this.f29276c;
        sr0 sr0Var = this.K;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, c6Var);
            i6Var.E0 = true;
            i6Var.f22018l0 = true;
            v3Var = i6Var;
        } else if (i10 == 2) {
            c6Var2 = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
            hc1 hc1Var = new hc1(context, 6, c6Var2);
            hc1Var.setItemAnimator(null);
            hc1Var.setLayoutAnimation(null);
            gg.a0 a0Var = new gg.a0(11);
            a0Var.j1(0);
            hc1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.e3) sr0Var).currentAccount;
            c6Var3 = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
            nr0 nr0Var = new nr0(this, context, i11, c6Var3);
            this.H = nr0Var;
            hc1Var.setAdapter(nr0Var);
            hc1Var.setOnItemClickListener(new j(this, 12));
            v3Var = hc1Var;
        } else if (i10 == 3) {
            c6Var4 = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
            org.telegram.ui.Cells.v3 v3Var2 = new org.telegram.ui.Cells.v3(context, c6Var4);
            v3Var2.setTextColor(org.telegram.ui.ActionBar.h6.f7);
            v3Var2.setBackgroundColor(sr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.e7));
            v3Var2.setText(LocaleController.getString(R.string.Recent));
            v3Var = v3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                c6Var5 = ((org.telegram.ui.ActionBar.e3) sr0Var).resourcesProvider;
                View f7Var = new org.telegram.ui.Cells.f7(context, 0, c6Var5);
                f7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
                v3Var = f7Var;
            } else {
                View view = new View(context);
                if (sr0Var.f30643h0 && sr0Var.f30650o0[1] != null) {
                    f7 = 109.0f;
                } else {
                    f7 = 56.0f;
                }
                view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(f7)));
                v3Var = view;
            }
        } else {
            v3Var = new ci.bb(this, context, 22);
        }
        return new s4.d1(v3Var);
    }
}
