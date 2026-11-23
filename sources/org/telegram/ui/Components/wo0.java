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
public final class wo0 extends dk0 {
    public int H;
    public vo0 I;
    public int K;
    public final zo0 L;
    public final Context f41690c;
    public final uo0 f41691e;
    public to0 f41692f;
    public to0 h;
    public String f41693n;
    public int f41694r;
    public int f41695s;
    public int f41696w;
    public ArrayList d = new ArrayList();
    public int f41697x = -1;
    public int f41698y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public wo0(zo0 zo0Var, Context context) {
        this.L = zo0Var;
        this.f41690c = context;
        ?? z1Var = new jg.z1(false);
        this.f41691e = z1Var;
        z1Var.f17823a = new org.telegram.ui.ActionBar.i5(this);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 1 && i7 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f41693n)) {
            return;
        }
        this.f41693n = str;
        if (this.f41692f != null) {
            Utilities.f22879g.a(this.f41692f);
            this.f41692f = null;
        }
        to0 to0Var = this.h;
        if (to0Var != null) {
            org.telegram.messenger.g0.r(to0Var);
            this.h = null;
        }
        this.d.clear();
        this.f41691e.f(null, null);
        this.f41691e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.L.L0(true);
        if (TextUtils.isEmpty(str)) {
            zo0.K0(this.L);
            this.f41694r = -1;
            this.J = false;
        } else {
            this.J = true;
            int i7 = this.f41694r + 1;
            this.f41694r = i7;
            this.L.M1.e(true, true);
            org.telegram.messenger.q5 q5Var = Utilities.f22879g;
            to0 to0Var2 = new to0(this, str, i7, 0);
            this.f41692f = to0Var2;
            q5Var.d(to0Var2, 300L);
        }
        this.L.L0(false);
    }

    @Override
    public final int b() {
        this.H = 0;
        this.f41697x = -1;
        this.f41698y = -1;
        this.F = -1;
        this.G = -1;
        if (TextUtils.isEmpty(this.f41693n)) {
            int i7 = this.H;
            this.E = i7;
            this.H = i7 + 2;
            this.f41697x = i7 + 1;
            zo0 zo0Var = this.L;
            if (zo0Var.A2.size() > 0) {
                int i10 = this.H;
                int i11 = i10 + 1;
                this.H = i11;
                this.f41698y = i10;
                this.F = i11;
                this.H = zo0Var.A2.size() + i11;
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
        int size = this.f41691e.d.size() + this.d.size() + i15;
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
        if (i7 == this.f41697x) {
            return 2;
        }
        if (i7 == this.f41698y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f41693n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
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
        zo0 zo0Var = this.L;
        a0.h hVar = zo0Var.Q1;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((ek0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f41693n);
        TLObject tLObject2 = null;
        String m10 = null;
        uo0 uo0Var = this.f41691e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i11 = this.F;
            if (i11 >= 0 && i7 >= i11) {
                TLObject tLObject3 = ((jg.g0) zo0Var.A2.get(i7 - i11)).f17556a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f28641id;
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f28492id;
                    m10 = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(zo0Var.f30223a).c2(Long.valueOf(tL_encryptedChat2.user_id));
                        if (c22 != null) {
                            j11 = c22.f28641id;
                            m10 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
                        }
                    }
                    j11 = 0;
                }
                String str4 = uo0Var.f17825c;
                if (!TextUtils.isEmpty(str4) && m10 != null && (A12 = org.telegram.messenger.g0.A1(m10.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m10);
                    spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29691q6, zo0Var.J0), A12, str4.length() + A12, 33);
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
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                g6Var.z(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i7 < b() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                g6Var.N = z13;
                return;
            }
            String str5 = str3;
            if (view instanceof org.telegram.ui.Cells.d7) {
                org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
                if (hVar.h(j11) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d7Var.c(j11, z12, str5);
                return;
            }
            return;
        }
        int i12 = i7 - 1;
        if (i12 < this.d.size()) {
            oo0 oo0Var = (oo0) this.d.get(i12);
            j10 = oo0Var.f38236a.f28496id;
            str2 = oo0Var.d;
        } else {
            i12 -= this.d.size();
            tLObject2 = (TLObject) uo0Var.d.get(i12);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j3 = user2.f28641id;
                str = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j3 = -chat2.f28492id;
                str = chat2.title;
            }
            String str6 = uo0Var.f17825c;
            if (!TextUtils.isEmpty(str6) && str != null && (A1 = org.telegram.messenger.g0.A1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29691q6, zo0Var.J0), A1, str6.length() + A1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j10 = j3;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var2 = (org.telegram.ui.Cells.g6) view;
            g6Var2.z(tLObject4, null, str2, null, false, false);
            if (i12 < b() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            g6Var2.N = z11;
            return;
        }
        String str7 = str2;
        if (view instanceof org.telegram.ui.Cells.d7) {
            org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) view;
            if (hVar.h(j10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d7Var2.c(j10, z10, str7);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        float f10;
        zo0 zo0Var = this.L;
        Context context = this.f41690c;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            View view = new View(context);
                            if (zo0Var.d2 && zo0Var.f42979k2[1] != null) {
                                f10 = 109.0f;
                            } else {
                                f10 = 56.0f;
                            }
                            view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(f10)));
                            y3Var = view;
                        } else {
                            View d7Var = new org.telegram.ui.Cells.d7(0, context, zo0Var.J0);
                            d7Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
                            y3Var = d7Var;
                        }
                    } else {
                        y3Var = new bi.o3(24, context, this);
                    }
                } else {
                    org.telegram.ui.Cells.y3 y3Var2 = new org.telegram.ui.Cells.y3(context, zo0Var.J0);
                    y3Var2.setTextColor(org.telegram.ui.ActionBar.n6.f29490f7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29471e7, y3Var2, zo0Var.J0);
                    y3Var2.setText(org.telegram.messenger.gd.N0(2131746174, null));
                    y3Var = y3Var2;
                }
            } else {
                org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(6, context, zo0Var.J0);
                d61Var.setItemAnimator(null);
                d61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(11);
                b0Var.j1(0);
                d61Var.setLayoutManager(b0Var);
                vo0 vo0Var = new vo0(this, context, zo0Var.f30223a, zo0Var.J0);
                this.I = vo0Var;
                d61Var.setAdapter(vo0Var);
                d61Var.setOnItemClickListener(new n(this, 12));
                y3Var = d61Var;
            }
        } else {
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, zo0Var.J0);
            g6Var.F0 = true;
            g6Var.m0 = true;
            y3Var = g6Var;
        }
        return new v4.f1(y3Var);
    }
}
