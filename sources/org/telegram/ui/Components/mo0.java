package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mo0 extends tj0 {
    public int H;
    public lo0 I;
    public int K;
    public final po0 L;
    public final Context f37333c;
    public final ko0 f37334e;
    public jo0 f37335f;
    public jo0 h;
    public String f37336n;
    public int f37337r;
    public int f37338s;
    public int f37339w;
    public ArrayList d = new ArrayList();
    public int f37340x = -1;
    public int f37341y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public mo0(po0 po0Var, Context context) {
        this.L = po0Var;
        this.f37333c = context;
        ?? z1Var = new jg.z1(false);
        this.f37334e = z1Var;
        z1Var.f17344a = new cf(this);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 1 && i7 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f37336n)) {
            return;
        }
        this.f37336n = str;
        if (this.f37335f != null) {
            Utilities.f22418g.a(this.f37335f);
            this.f37335f = null;
        }
        jo0 jo0Var = this.h;
        if (jo0Var != null) {
            org.telegram.messenger.g0.r(jo0Var);
            this.h = null;
        }
        this.d.clear();
        this.f37334e.f(null, null);
        this.f37334e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.L.K0(true);
        if (TextUtils.isEmpty(str)) {
            po0.J0(this.L);
            this.f37337r = -1;
            this.J = false;
        } else {
            this.J = true;
            int i7 = this.f37337r + 1;
            this.f37337r = i7;
            this.L.M1.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f22418g;
            jo0 jo0Var2 = new jo0(this, str, i7, 0);
            this.f37335f = jo0Var2;
            p5Var.d(jo0Var2, 300L);
        }
        this.L.K0(false);
    }

    @Override
    public final int b() {
        this.H = 0;
        this.f37340x = -1;
        this.f37341y = -1;
        this.F = -1;
        this.G = -1;
        if (TextUtils.isEmpty(this.f37336n)) {
            int i7 = this.H;
            this.E = i7;
            this.H = i7 + 2;
            this.f37340x = i7 + 1;
            po0 po0Var = this.L;
            if (po0Var.A2.size() > 0) {
                int i10 = this.H;
                int i11 = i10 + 1;
                this.H = i11;
                this.f37341y = i10;
                this.F = i11;
                this.H = po0Var.A2.size() + i11;
            }
            int i12 = this.H;
            int i13 = i12 + 1;
            this.H = i13;
            this.G = i12;
            this.K = i13;
            return i13;
        }
        int i14 = this.H;
        int i15 = i14 + 1;
        this.H = i15;
        this.E = i14;
        int size = this.f37334e.d.size() + this.d.size() + i15;
        this.H = size;
        if (size == 1) {
            this.E = -1;
            this.H = 0;
            this.K = 0;
            return 0;
        }
        int i16 = size + 1;
        this.H = i16;
        this.G = size;
        this.K = i16;
        return i16;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.G) {
            return 4;
        }
        if (i7 == this.E) {
            return 1;
        }
        if (i7 == this.f37340x) {
            return 2;
        }
        if (i7 == this.f37341y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f37336n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        String str;
        String str2;
        long j10;
        int A1;
        boolean z10;
        boolean z11;
        TLObject tLObject;
        String str3;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j11;
        boolean z12;
        boolean z13;
        int A12;
        po0 po0Var = this.L;
        a0.h hVar = po0Var.Q1;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((uj0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f37336n);
        TLObject tLObject2 = null;
        String m10 = null;
        ko0 ko0Var = this.f37334e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i11 = this.F;
            if (i11 >= 0 && i7 >= i11) {
                TLObject tLObject3 = ((jg.g0) po0Var.A2.get(i7 - i11)).f17077a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f28200id;
                    m10 = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f28051id;
                    m10 = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User a22 = org.telegram.messenger.np.s1(po0Var.f29679a).a2(Long.valueOf(tL_encryptedChat2.user_id));
                        if (a22 != null) {
                            j11 = a22.f28200id;
                            m10 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                        }
                    }
                    j11 = 0;
                }
                String str4 = ko0Var.f17346c;
                if (!TextUtils.isEmpty(str4) && m10 != null && (A12 = org.telegram.messenger.g0.A1(m10.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m10);
                    spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.f29089q6, po0Var.J0), A12, str4.length() + A12, 33);
                    tLObject = tLObject3;
                    str3 = spannableStringBuilder;
                } else {
                    tLObject = tLObject3;
                    str3 = m10;
                }
                tL_encryptedChat = tL_encryptedChat2;
            } else {
                tLObject = null;
                str3 = null;
                tL_encryptedChat = null;
                j11 = 0;
            }
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                f6Var.x(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i7 < b() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f6Var.N = z13;
                return;
            }
            String str5 = str3;
            if (view instanceof org.telegram.ui.Cells.c7) {
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                if (hVar.h(j11) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c7Var.c(j11, z12, str5);
                return;
            }
            return;
        }
        int i12 = i7 - 1;
        if (i12 < this.d.size()) {
            eo0 eo0Var = (eo0) this.d.get(i12);
            j10 = eo0Var.f34384a.f28055id;
            str2 = eo0Var.d;
        } else {
            i12 -= this.d.size();
            tLObject2 = (TLObject) ko0Var.d.get(i12);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j3 = user2.f28200id;
                str = org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j3 = -chat2.f28051id;
                str = chat2.title;
            }
            String str6 = ko0Var.f17346c;
            if (!TextUtils.isEmpty(str6) && str != null && (A1 = org.telegram.messenger.g0.A1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new b00(org.telegram.ui.ActionBar.j6.f29089q6, po0Var.J0), A1, str6.length() + A1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j10 = j3;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var2 = (org.telegram.ui.Cells.f6) view;
            f6Var2.x(tLObject4, null, str2, null, false, false);
            if (i12 < b() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            f6Var2.N = z11;
            return;
        }
        String str7 = str2;
        if (view instanceof org.telegram.ui.Cells.c7) {
            org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) view;
            if (hVar.h(j10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c7Var2.c(j10, z10, str7);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        float f10;
        po0 po0Var = this.L;
        Context context = this.f37333c;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            View view = new View(context);
                            if (po0Var.d2 && po0Var.f38349k2[1] != null) {
                                f10 = 109.0f;
                            } else {
                                f10 = 56.0f;
                            }
                            view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(f10)));
                            x3Var = view;
                        } else {
                            View c7Var = new org.telegram.ui.Cells.c7(0, context, po0Var.J0);
                            c7Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
                            x3Var = c7Var;
                        }
                    } else {
                        x3Var = new bi.o2(24, context, this);
                    }
                } else {
                    org.telegram.ui.Cells.x3 x3Var2 = new org.telegram.ui.Cells.x3(context, po0Var.J0);
                    x3Var2.setTextColor(org.telegram.ui.ActionBar.j6.f28888f7);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28869e7, x3Var2, po0Var.J0);
                    x3Var2.setText(org.telegram.messenger.hd.M0(2131746370, null));
                    x3Var = x3Var2;
                }
            } else {
                org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(6, context, po0Var.J0);
                b61Var.setItemAnimator(null);
                b61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(11);
                b0Var.j1(0);
                b61Var.setLayoutManager(b0Var);
                lo0 lo0Var = new lo0(this, context, po0Var.f29679a, po0Var.J0);
                this.I = lo0Var;
                b61Var.setAdapter(lo0Var);
                b61Var.setOnItemClickListener(new j(this, 12));
                x3Var = b61Var;
            }
        } else {
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, po0Var.J0);
            f6Var.F0 = true;
            f6Var.m0 = true;
            x3Var = f6Var;
        }
        return new v4.e1(x3Var);
    }
}
