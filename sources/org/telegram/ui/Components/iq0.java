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
import org.telegram.ui.kb1;
public final class iq0 extends sl0 {
    public int D;
    public hq0 E;
    public int G;
    public final mq0 H;
    public final Context f27883c;
    public final gq0 f27884e;
    public fq0 f27885f;
    public fq0 h;
    public String f27886n;
    public int f27887r;
    public int f27888s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f27889w = -1;
    public int f27890x = -1;
    public int f27891y = -1;
    public int B = -1;
    public int C = -1;
    public boolean F = false;

    public iq0(mq0 mq0Var, Context context) {
        this.H = mq0Var;
        this.f27883c = context;
        ?? k1Var = new uf.k1(false);
        this.f27884e = k1Var;
        k1Var.f48618a = new androidx.biometric.f0(this, 29);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f27886n)) {
            return;
        }
        this.f27886n = str;
        if (this.f27885f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27885f);
            this.f27885f = null;
        }
        fq0 fq0Var = this.h;
        if (fq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fq0Var);
            this.h = null;
        }
        this.d.clear();
        this.f27884e.f(null, null);
        this.f27884e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.H.K0(true);
        if (TextUtils.isEmpty(str)) {
            mq0.F0(this.H);
            this.f27887r = -1;
            this.F = false;
        } else {
            this.F = true;
            int i10 = this.f27887r + 1;
            this.f27887r = i10;
            this.H.N.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fq0 fq0Var2 = new fq0(this, str, i10, 0);
            this.f27885f = fq0Var2;
            dispatchQueue.postRunnable(fq0Var2, 300L);
        }
        this.H.K0(false);
    }

    @Override
    public final int h() {
        this.D = 0;
        this.f27889w = -1;
        this.f27890x = -1;
        this.B = -1;
        this.C = -1;
        if (TextUtils.isEmpty(this.f27886n)) {
            int i10 = this.D;
            this.f27891y = i10;
            this.D = i10 + 2;
            this.f27889w = i10 + 1;
            mq0 mq0Var = this.H;
            if (mq0Var.B0.size() > 0) {
                int i11 = this.D;
                int i12 = i11 + 1;
                this.D = i12;
                this.f27890x = i11;
                this.B = i12;
                this.D = mq0Var.B0.size() + i12;
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
        this.f27891y = i15;
        int size = this.f27884e.d.size() + this.d.size() + i16;
        this.D = size;
        if (size == 1) {
            this.f27891y = -1;
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
        if (i10 == this.f27891y) {
            return 1;
        }
        if (i10 == this.f27889w) {
            return 2;
        }
        if (i10 == this.f27890x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f27886n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.g6 g6Var;
        boolean z4;
        boolean z10;
        TLObject tLObject2;
        String str3;
        boolean z11;
        boolean z12;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        mq0 mq0Var = this.H;
        a0.h hVar = mq0Var.R;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((tl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f27886n);
        String str4 = null;
        gq0 gq0Var = this.f27884e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.B;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((uf.y) mq0Var.B0.get(i10 - i13)).f48739a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f20990id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f20843id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f20990id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = gq0Var.f48620c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.k6.f21894q6;
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new f10(i14, g6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
            aq0 aq0Var = (aq0) this.d.get(i15);
            j11 = aq0Var.f25319a.f20847id;
            str2 = aq0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) gq0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f20990id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f20843id;
                str = chat2.title;
            }
            String str7 = gq0Var.f48620c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.k6.f21894q6;
                g6Var = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new f10(i16, g6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
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
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.u3 u3Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        float f10;
        Context context = this.f27883c;
        mq0 mq0Var = this.H;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, g6Var);
            h6Var.B0 = true;
            h6Var.f22900i0 = true;
            u3Var = h6Var;
        } else if (i10 == 2) {
            g6Var2 = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
            kb1 kb1Var = new kb1(context, 5, g6Var2);
            kb1Var.setItemAnimator(null);
            kb1Var.setLayoutAnimation(null);
            org.telegram.ui.k kVar = new org.telegram.ui.k(9);
            kVar.j1(0);
            kb1Var.setLayoutManager(kVar);
            i11 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
            g6Var3 = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
            hq0 hq0Var = new hq0(this, context, i11, g6Var3);
            this.E = hq0Var;
            kb1Var.setAdapter(hq0Var);
            kb1Var.setOnItemClickListener(new k(this, 12));
            u3Var = kb1Var;
        } else if (i10 == 3) {
            g6Var4 = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var2 = new org.telegram.ui.Cells.u3(context, g6Var4);
            u3Var2.setTextColor(org.telegram.ui.ActionBar.k6.f21697f7);
            u3Var2.setBackgroundColor(mq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21678e7));
            u3Var2.setText(LocaleController.getString(R.string.Recent));
            u3Var = u3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                g6Var5 = ((org.telegram.ui.ActionBar.h3) mq0Var).resourcesProvider;
                View e7Var = new org.telegram.ui.Cells.e7(context, 0, g6Var5);
                e7Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
                u3Var = e7Var;
            } else {
                View view = new View(context);
                if (mq0Var.f29203e0 && mq0Var.f29211l0[1] != null) {
                    f10 = 109.0f;
                } else {
                    f10 = 56.0f;
                }
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(f10)));
                u3Var = view;
            }
        } else {
            u3Var = new fg.h0(this, context, 17);
        }
        return new f2.m1(u3Var);
    }
}
