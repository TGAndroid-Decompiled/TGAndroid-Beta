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
import org.telegram.ui.xa1;
public final class er0 extends lm0 {
    public int G;
    public dr0 H;
    public int J;
    public final ir0 K;
    public final Context f26053c;
    public final cr0 e;
    public br0 f26054f;
    public br0 h;
    public String f26055n;
    public int f26056r;
    public int f26057s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f26058w = -1;
    public int f26059x = -1;
    public int f26060y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public er0(ir0 ir0Var, Context context) {
        this.K = ir0Var;
        this.f26053c = context;
        ?? a2Var = new hg.a2(false);
        this.e = a2Var;
        a2Var.f11819a = new ki.t1(this, 18);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f26055n)) {
            return;
        }
        this.f26055n = str;
        if (this.f26054f != null) {
            Utilities.searchQueue.cancelRunnable(this.f26054f);
            this.f26054f = null;
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
        this.K.P0(true);
        if (TextUtils.isEmpty(str)) {
            ir0.O0(this.K);
            this.f26056r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f26056r + 1;
            this.f26056r = i10;
            this.K.R.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            br0 br0Var2 = new br0(this, str, i10, 0);
            this.f26054f = br0Var2;
            dispatchQueue.postRunnable(br0Var2, 300L);
        }
        this.K.P0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f26058w = -1;
        this.f26059x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f26055n)) {
            int i10 = this.G;
            this.f26060y = i10;
            this.G = i10 + 2;
            this.f26058w = i10 + 1;
            ir0 ir0Var = this.K;
            if (ir0Var.F0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f26059x = i11;
                this.E = i12;
                this.G = ir0Var.F0.size() + i12;
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
        this.f26060y = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f26060y = -1;
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
        if (i10 == this.f26060y) {
            return 1;
        }
        if (i10 == this.f26058w) {
            return 2;
        }
        if (i10 == this.f26059x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f26055n)) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        boolean z10;
        boolean z11;
        TLObject tLObject2;
        String str3;
        boolean z12;
        boolean z13;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ir0 ir0Var = this.K;
        a0.h hVar = ir0Var.V;
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((mm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f26055n);
        String str4 = null;
        cr0 cr0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j12 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((hg.g0) ir0Var.F0.get(i10 - i13)).f11893a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f20490id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f20343id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j12 = user2.f20490id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = cr0Var.f11821c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.k6.q6;
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new m10(i14, g6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
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
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g7Var.c(j12, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            wq0 wq0Var = (wq0) this.d.get(i15);
            j11 = wq0Var.f32330a.f20347id;
            str2 = wq0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) cr0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j10 = user3.f20490id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j10 = -chat2.f20343id;
                str = chat2.title;
            }
            String str7 = cr0Var.f11821c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.k6.q6;
                g6Var = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new m10(i16, g6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
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
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7Var2.c(j11, z10, str8);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.u3 u3Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        float f7;
        Context context = this.f26053c;
        ir0 ir0Var = this.K;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, g6Var);
            i6Var.E0 = true;
            i6Var.f22519l0 = true;
            u3Var = i6Var;
        } else if (i10 == 2) {
            g6Var2 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            xa1 xa1Var = new xa1(context, 6, g6Var2);
            xa1Var.setItemAnimator(null);
            xa1Var.setLayoutAnimation(null);
            hg.a0 a0Var = new hg.a0(11);
            a0Var.j1(0);
            xa1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            g6Var3 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            dr0 dr0Var = new dr0(this, context, i11, g6Var3);
            this.H = dr0Var;
            xa1Var.setAdapter(dr0Var);
            xa1Var.setOnItemClickListener(new j(this, 12));
            u3Var = xa1Var;
        } else if (i10 == 3) {
            g6Var4 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var2 = new org.telegram.ui.Cells.u3(context, g6Var4);
            u3Var2.setTextColor(org.telegram.ui.ActionBar.k6.f7);
            int i12 = org.telegram.ui.ActionBar.k6.e7;
            g6Var5 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.i(i12, u3Var2, g6Var5);
            u3Var2.setText(LocaleController.getString(R.string.Recent));
            u3Var = u3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                g6Var6 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
                View g7Var = new org.telegram.ui.Cells.g7(context, 0, g6Var6);
                g7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
                u3Var = g7Var;
            } else {
                View view = new View(context);
                if (ir0Var.f27420i0 && ir0Var.f27427p0[1] != null) {
                    f7 = 109.0f;
                } else {
                    f7 = 56.0f;
                }
                view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(f7)));
                u3Var = view;
            }
        } else {
            u3Var = new ai.jc(this, context, 22);
        }
        return new s4.b1(u3Var);
    }
}
