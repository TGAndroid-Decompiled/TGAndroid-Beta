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
public final class lo0 extends sj0 {
    public int H;
    public ko0 I;
    public int K;
    public final oo0 L;
    public final Context f35799c;
    public final jo0 f35800e;
    public io0 f35801f;
    public io0 h;
    public String f35802n;
    public int f35803r;
    public int f35804s;
    public int f35805w;
    public ArrayList d = new ArrayList();
    public int f35806x = -1;
    public int f35807y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public lo0(oo0 oo0Var, Context context) {
        this.L = oo0Var;
        this.f35799c = context;
        ?? v1Var = new kg.v1(false);
        this.f35800e = v1Var;
        v1Var.f17206a = new y00(this);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 1 && i3 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f35802n)) {
            return;
        }
        this.f35802n = str;
        if (this.f35801f != null) {
            Utilities.f21389g.a(this.f35801f);
            this.f35801f = null;
        }
        io0 io0Var = this.h;
        if (io0Var != null) {
            org.telegram.messenger.g0.r(io0Var);
            this.h = null;
        }
        this.d.clear();
        this.f35800e.f(null, null);
        this.f35800e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.L.K0(true);
        if (TextUtils.isEmpty(str)) {
            oo0.J0(this.L);
            this.f35803r = -1;
            this.J = false;
        } else {
            this.J = true;
            int i3 = this.f35803r + 1;
            this.f35803r = i3;
            this.L.J1.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21389g;
            io0 io0Var2 = new io0(this, str, i3, 0);
            this.f35801f = io0Var2;
            p5Var.e(io0Var2, 300L);
        }
        this.L.K0(false);
    }

    @Override
    public final int b() {
        this.H = 0;
        this.f35806x = -1;
        this.f35807y = -1;
        this.F = -1;
        this.G = -1;
        if (TextUtils.isEmpty(this.f35802n)) {
            int i3 = this.H;
            this.E = i3;
            this.H = i3 + 2;
            this.f35806x = i3 + 1;
            oo0 oo0Var = this.L;
            if (oo0Var.f36910x2.size() > 0) {
                int i10 = this.H;
                int i11 = i10 + 1;
                this.H = i11;
                this.f35807y = i10;
                this.F = i11;
                this.H = oo0Var.f36910x2.size() + i11;
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
        int size = this.f35800e.d.size() + this.d.size() + i15;
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
    public final int d(int i3) {
        if (i3 == this.G) {
            return 4;
        }
        if (i3 == this.E) {
            return 1;
        }
        if (i3 == this.f35806x) {
            return 2;
        }
        if (i3 == this.f35807y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f35802n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        String str;
        String str2;
        long j11;
        int A1;
        boolean z10;
        boolean z11;
        TLObject tLObject;
        String str3;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j12;
        boolean z12;
        boolean z13;
        int A12;
        oo0 oo0Var = this.L;
        a0.h hVar = oo0Var.N1;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((tj0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f35802n);
        TLObject tLObject2 = null;
        String m10 = null;
        jo0 jo0Var = this.f35800e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i11 = this.F;
            if (i11 >= 0 && i3 >= i11) {
                TLObject tLObject3 = ((kg.d0) oo0Var.f36910x2.get(i3 - i11)).f16946a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f27150id;
                    m10 = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f27001id;
                    m10 = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(oo0Var.f28583a).a2(Long.valueOf(tL_encryptedChat2.user_id));
                        if (a22 != null) {
                            j12 = a22.f27150id;
                            m10 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                        }
                    }
                    j12 = 0;
                }
                String str4 = jo0Var.f17208c;
                if (!TextUtils.isEmpty(str4) && m10 != null && (A12 = org.telegram.messenger.g0.A1(m10.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m10);
                    spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28121q6, oo0Var.J0), A12, str4.length() + A12, 33);
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
                j12 = 0;
            }
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                f6Var.x(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i3 < b() - 2) {
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
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c7Var.c(j12, z12, str5);
                return;
            }
            return;
        }
        int i12 = i3 - 1;
        if (i12 < this.d.size()) {
            do0 do0Var = (do0) this.d.get(i12);
            j11 = do0Var.f33172a.f27005id;
            str2 = do0Var.d;
        } else {
            i12 -= this.d.size();
            tLObject2 = (TLObject) jo0Var.d.get(i12);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j10 = user2.f27150id;
                str = org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j10 = -chat2.f27001id;
                str = chat2.title;
            }
            String str6 = jo0Var.f17208c;
            if (!TextUtils.isEmpty(str6) && str != null && (A1 = org.telegram.messenger.g0.A1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28121q6, oo0Var.J0), A1, str6.length() + A1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j11 = j10;
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
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c7Var2.c(j11, z10, str7);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        float f10;
        oo0 oo0Var = this.L;
        Context context = this.f35799c;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            View view = new View(context);
                            if (oo0Var.f36875a2 && oo0Var.f36881h2[1] != null) {
                                f10 = 109.0f;
                            } else {
                                f10 = 56.0f;
                            }
                            view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(f10)));
                            x3Var = view;
                        } else {
                            View c7Var = new org.telegram.ui.Cells.c7(0, context, oo0Var.J0);
                            c7Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
                            x3Var = c7Var;
                        }
                    } else {
                        x3Var = new ai.x2(24, context, this);
                    }
                } else {
                    org.telegram.ui.Cells.x3 x3Var2 = new org.telegram.ui.Cells.x3(context, oo0Var.J0);
                    x3Var2.setTextColor(org.telegram.ui.ActionBar.k6.f27918f7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27899e7, x3Var2, oo0Var.J0);
                    x3Var2.setText(org.telegram.messenger.bd.M0(2131746378, null));
                    x3Var = x3Var2;
                }
            } else {
                org.telegram.ui.u51 u51Var = new org.telegram.ui.u51(6, context, oo0Var.J0);
                u51Var.setItemAnimator(null);
                u51Var.setLayoutAnimation(null);
                kg.y yVar = new kg.y(11);
                yVar.j1(0);
                u51Var.setLayoutManager(yVar);
                ko0 ko0Var = new ko0(this, context, oo0Var.f28583a, oo0Var.J0);
                this.I = ko0Var;
                u51Var.setAdapter(ko0Var);
                u51Var.setOnItemClickListener(new k(this, 12));
                x3Var = u51Var;
            }
        } else {
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, oo0Var.J0);
            f6Var.F0 = true;
            f6Var.m0 = true;
            x3Var = f6Var;
        }
        return new u4.d1(x3Var);
    }
}
