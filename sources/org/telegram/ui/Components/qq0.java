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
import org.telegram.ui.wb1;
public final class qq0 extends vl0 {
    public int G;
    public pq0 H;
    public int J;
    public final uq0 K;
    public final Context f27741c;
    public final oq0 e;
    public nq0 f27742f;
    public nq0 h;
    public String f27743n;
    public int f27744r;
    public int f27745s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f27746w = -1;
    public int f27747x = -1;
    public int f27748y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public qq0(uq0 uq0Var, Context context) {
        this.K = uq0Var;
        this.f27741c = context;
        ?? c2Var = new gg.c2(false);
        this.e = c2Var;
        c2Var.f9671a = new n2.e(this, 10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42963f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f27743n)) {
            return;
        }
        this.f27743n = str;
        if (this.f27742f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27742f);
            this.f27742f = null;
        }
        nq0 nq0Var = this.h;
        if (nq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.K.K0(true);
        if (TextUtils.isEmpty(str)) {
            uq0.F0(this.K);
            this.f27744r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f27744r + 1;
            this.f27744r = i10;
            this.K.Q.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nq0 nq0Var2 = new nq0(this, str, i10, 0);
            this.f27742f = nq0Var2;
            dispatchQueue.postRunnable(nq0Var2, 300L);
        }
        this.K.K0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f27746w = -1;
        this.f27747x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f27743n)) {
            int i10 = this.G;
            this.f27748y = i10;
            this.G = i10 + 2;
            this.f27746w = i10 + 1;
            uq0 uq0Var = this.K;
            if (uq0Var.E0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f27747x = i11;
                this.E = i12;
                this.G = uq0Var.E0.size() + i12;
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
        this.f27748y = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f27748y = -1;
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
        if (i10 == this.f27748y) {
            return 1;
        }
        if (i10 == this.f27746w) {
            return 2;
        }
        if (i10 == this.f27747x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f27743n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        long j3;
        String str;
        String str2;
        TLObject tLObject;
        long j10;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean z10;
        boolean z11;
        TLObject tLObject2;
        String str3;
        boolean z12;
        boolean z13;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        uq0 uq0Var = this.K;
        a0.i iVar = uq0Var.U;
        int i12 = c1Var.f42963f;
        View view = c1Var.f42960a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((wl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f27743n);
        String str4 = null;
        oq0 oq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j11 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((gg.h0) uq0Var.E0.get(i10 - i13)).f9735a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f18482id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f18335id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j11 = user2.f18482id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = oq0Var.f9673c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.h6.q6;
                    d6Var2 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new f10(i14, d6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
                i6Var.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
                if (i10 < h() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i6Var.M = z13;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                if (iVar.h(j11) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g7Var.c(j11, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            iq0 iq0Var = (iq0) this.d.get(i15);
            j10 = iq0Var.f25149a.f18339id;
            str2 = iq0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) oq0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j3 = user3.f18482id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j3 = -chat2.f18335id;
                str = chat2.title;
            }
            String str7 = oq0Var.f9673c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.h6.q6;
                d6Var = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new f10(i16, d6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
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
            i6Var2.t(tLObject, null, str2, null, false, false);
            if (i15 < h() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var2.M = z11;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.g7) {
            org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) view;
            if (iVar.h(j10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7Var2.c(j10, z10, str8);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Cells.v3 v3Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        float f7;
        Context context = this.f27741c;
        uq0 uq0Var = this.K;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
            i6Var.E0 = true;
            i6Var.f20442l0 = true;
            v3Var = i6Var;
        } else if (i10 == 2) {
            d6Var2 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            wb1 wb1Var = new wb1(context, 6, d6Var2);
            wb1Var.setItemAnimator(null);
            wb1Var.setLayoutAnimation(null);
            gg.b0 b0Var = new gg.b0(11);
            b0Var.j1(0);
            wb1Var.setLayoutManager(b0Var);
            i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
            d6Var3 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            pq0 pq0Var = new pq0(this, context, i11, d6Var3);
            this.H = pq0Var;
            wb1Var.setAdapter(pq0Var);
            wb1Var.setOnItemClickListener(new j(this, 12));
            v3Var = wb1Var;
        } else if (i10 == 3) {
            d6Var4 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            org.telegram.ui.Cells.v3 v3Var2 = new org.telegram.ui.Cells.v3(context, d6Var4);
            v3Var2.setTextColor(org.telegram.ui.ActionBar.h6.f7);
            v3Var2.setBackgroundColor(uq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.e7));
            v3Var2.setText(LocaleController.getString(R.string.Recent));
            v3Var = v3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                d6Var5 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
                View g7Var = new org.telegram.ui.Cells.g7(context, 0, d6Var5);
                g7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
                v3Var = g7Var;
            } else {
                View view = new View(context);
                if (uq0Var.f28883h0 && uq0Var.f28890o0[1] != null) {
                    f7 = 109.0f;
                } else {
                    f7 = 56.0f;
                }
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(f7)));
                v3Var = view;
            }
        } else {
            v3Var = new ci.bb(this, context, 22);
        }
        return new s4.c1(v3Var);
    }
}
