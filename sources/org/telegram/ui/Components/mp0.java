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
public final class mp0 extends tk0 {
    public int G;
    public lp0 H;
    public int J;
    public final pp0 K;
    public final Context f28527c;
    public final kp0 e;
    public jp0 f28528f;
    public jp0 h;
    public String f28529n;
    public int f28530r;
    public int f28531s;
    public int f28532w;
    public ArrayList d = new ArrayList();
    public int f28533x = -1;
    public int f28534y = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public mp0(pp0 pp0Var, Context context) {
        this.K = pp0Var;
        this.f28527c = context;
        ?? m1Var = new zf.m1(false);
        this.e = m1Var;
        m1Var.f55593a = new m2.t(this, 13);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f28529n)) {
            return;
        }
        this.f28529n = str;
        if (this.f28528f != null) {
            Utilities.f14523g.a(this.f28528f);
            this.f28528f = null;
        }
        jp0 jp0Var = this.h;
        if (jp0Var != null) {
            org.telegram.messenger.i0.r(jp0Var);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.K.K0(true);
        if (TextUtils.isEmpty(str)) {
            pp0.J0(this.K);
            this.f28530r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f28530r + 1;
            this.f28530r = i10;
            this.K.I1.e(true, true);
            org.telegram.messenger.r5 r5Var = Utilities.f14523g;
            jp0 jp0Var2 = new jp0(this, str, i10, 0);
            this.f28528f = jp0Var2;
            r5Var.d(jp0Var2, 300L);
        }
        this.K.K0(false);
    }

    @Override
    public final int b() {
        this.G = 0;
        this.f28533x = -1;
        this.f28534y = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f28529n)) {
            int i10 = this.G;
            this.D = i10;
            this.G = i10 + 2;
            this.f28533x = i10 + 1;
            pp0 pp0Var = this.K;
            if (pp0Var.f29503w2.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f28534y = i11;
                this.E = i12;
                this.G = pp0Var.f29503w2.size() + i12;
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
        this.D = i15;
        int size = this.e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.D = -1;
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
    public final int d(int i10) {
        if (i10 == this.F) {
            return 4;
        }
        if (i10 == this.D) {
            return 1;
        }
        if (i10 == this.f28533x) {
            return 2;
        }
        if (i10 == this.f28534y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f28529n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
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
        pp0 pp0Var = this.K;
        a0.h hVar = pp0Var.M1;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 != 0 && i11 != 5) {
            if (i11 == 2) {
                ((uk0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f28529n);
        TLObject tLObject2 = null;
        String m10 = null;
        kp0 kp0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i12 = this.E;
            if (i12 >= 0 && i10 >= i12) {
                TLObject tLObject3 = ((zf.y) pp0Var.f29503w2.get(i10 - i12)).f55696a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j12 = user.f19943id;
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j12 = -chat.f19794id;
                    m10 = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(pp0Var.f21584a).Z1(Long.valueOf(tL_encryptedChat2.user_id));
                        if (Z1 != null) {
                            j12 = Z1.f19943id;
                            m10 = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
                        }
                    }
                    j12 = 0;
                }
                String str4 = kp0Var.f55595c;
                if (!TextUtils.isEmpty(str4) && m10 != null && (A12 = org.telegram.messenger.i0.A1(m10.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m10);
                    spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, pp0Var.I0), A12, str4.length() + A12, 33);
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
            if (view instanceof org.telegram.ui.Cells.k6) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                k6Var.z(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i10 < b() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                k6Var.M = z13;
                return;
            }
            String str5 = str3;
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                if (hVar.h(j12) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h7Var.c(j12, z12, str5);
                return;
            }
            return;
        }
        int i13 = i10 - 1;
        if (i13 < this.d.size()) {
            ep0 ep0Var = (ep0) this.d.get(i13);
            j11 = ep0Var.f25898a.f19798id;
            str2 = ep0Var.d;
        } else {
            i13 -= this.d.size();
            tLObject2 = (TLObject) kp0Var.d.get(i13);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j10 = user2.f19943id;
                str = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j10 = -chat2.f19794id;
                str = chat2.title;
            }
            String str6 = kp0Var.f55595c;
            if (!TextUtils.isEmpty(str6) && str != null && (A1 = org.telegram.messenger.i0.A1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, pp0Var.I0), A1, str6.length() + A1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j11 = j10;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof org.telegram.ui.Cells.k6) {
            org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) view;
            k6Var2.z(tLObject4, null, str2, null, false, false);
            if (i13 < b() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var2.M = z11;
            return;
        }
        String str7 = str2;
        if (view instanceof org.telegram.ui.Cells.h7) {
            org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) view;
            if (hVar.h(j11) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h7Var2.c(j11, z10, str7);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        float f7;
        pp0 pp0Var = this.K;
        Context context = this.f28527c;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            View view = new View(context);
                            if (pp0Var.Z1 && pp0Var.f29473g2[1] != null) {
                                f7 = 109.0f;
                            } else {
                                f7 = 56.0f;
                            }
                            view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(f7)));
                            z3Var = view;
                        } else {
                            View h7Var = new org.telegram.ui.Cells.h7(0, context, pp0Var.I0);
                            h7Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
                            z3Var = h7Var;
                        }
                    } else {
                        z3Var = new bi.t0(this, context, 18);
                    }
                } else {
                    org.telegram.ui.Cells.z3 z3Var2 = new org.telegram.ui.Cells.z3(context, pp0Var.I0);
                    z3Var2.setTextColor(org.telegram.ui.ActionBar.t6.f7);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.e7, z3Var2, pp0Var.I0);
                    z3Var2.setText(org.telegram.messenger.dd.L0(2131746385, null));
                    z3Var = z3Var2;
                }
            } else {
                org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(4, context, pp0Var.I0);
                u71Var.setItemAnimator(null);
                u71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(10);
                fVar.j1(0);
                u71Var.setLayoutManager(fVar);
                lp0 lp0Var = new lp0(this, context, pp0Var.f21584a, pp0Var.I0);
                this.H = lp0Var;
                u71Var.setAdapter(lp0Var);
                u71Var.setOnItemClickListener(new k(this, 12));
                z3Var = u71Var;
            }
        } else {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, pp0Var.I0);
            k6Var.E0 = true;
            k6Var.f22136l0 = true;
            z3Var = k6Var;
        }
        return new s4.c1(z3Var);
    }
}
