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
public final class xo0 extends dk0 {
    public int H;
    public wo0 I;
    public int K;
    public final ap0 L;
    public final Context f42177c;
    public final vo0 f42178e;
    public uo0 f42179f;
    public uo0 h;
    public String f42180n;
    public int f42181r;
    public int f42182s;
    public int f42183w;
    public ArrayList d = new ArrayList();
    public int f42184x = -1;
    public int f42185y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public xo0(ap0 ap0Var, Context context) {
        this.L = ap0Var;
        this.f42177c = context;
        ?? z1Var = new jg.z1(false);
        this.f42178e = z1Var;
        z1Var.f17755a = new org.telegram.ui.Cells.c5(this);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 1 && i7 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f42180n)) {
            return;
        }
        this.f42180n = str;
        if (this.f42179f != null) {
            Utilities.f22812g.a(this.f42179f);
            this.f42179f = null;
        }
        uo0 uo0Var = this.h;
        if (uo0Var != null) {
            org.telegram.messenger.g0.r(uo0Var);
            this.h = null;
        }
        this.d.clear();
        this.f42178e.f(null, null);
        this.f42178e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.L.L0(true);
        if (TextUtils.isEmpty(str)) {
            ap0.K0(this.L);
            this.f42181r = -1;
            this.J = false;
        } else {
            this.J = true;
            int i7 = this.f42181r + 1;
            this.f42181r = i7;
            this.L.M1.e(true, true);
            org.telegram.messenger.q5 q5Var = Utilities.f22812g;
            uo0 uo0Var2 = new uo0(this, str, i7, 0);
            this.f42179f = uo0Var2;
            q5Var.d(uo0Var2, 300L);
        }
        this.L.L0(false);
    }

    @Override
    public final int b() {
        this.H = 0;
        this.f42184x = -1;
        this.f42185y = -1;
        this.F = -1;
        this.G = -1;
        if (TextUtils.isEmpty(this.f42180n)) {
            int i7 = this.H;
            this.E = i7;
            this.H = i7 + 2;
            this.f42184x = i7 + 1;
            ap0 ap0Var = this.L;
            if (ap0Var.A2.size() > 0) {
                int i10 = this.H;
                int i11 = i10 + 1;
                this.H = i11;
                this.f42185y = i10;
                this.F = i11;
                this.H = ap0Var.A2.size() + i11;
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
        int size = this.f42178e.d.size() + this.d.size() + i15;
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
        if (i7 == this.f42184x) {
            return 2;
        }
        if (i7 == this.f42185y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f42180n)) {
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
        ap0 ap0Var = this.L;
        a0.h hVar = ap0Var.Q1;
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((ek0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f42180n);
        TLObject tLObject2 = null;
        String m10 = null;
        vo0 vo0Var = this.f42178e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i11 = this.F;
            if (i11 >= 0 && i7 >= i11) {
                TLObject tLObject3 = ((jg.g0) ap0Var.A2.get(i7 - i11)).f17488a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f28583id;
                    m10 = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f28434id;
                    m10 = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User c22 = org.telegram.messenger.np.u1(ap0Var.f30173a).c2(Long.valueOf(tL_encryptedChat2.user_id));
                        if (c22 != null) {
                            j11 = c22.f28583id;
                            m10 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
                        }
                    }
                    j11 = 0;
                }
                String str4 = vo0Var.f17757c;
                if (!TextUtils.isEmpty(str4) && m10 != null && (A12 = org.telegram.messenger.g0.A1(m10.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m10);
                    spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29621q6, ap0Var.J0), A12, str4.length() + A12, 33);
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
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.x(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i7 < b() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                h6Var.N = z13;
                return;
            }
            String str5 = str3;
            if (view instanceof org.telegram.ui.Cells.e7) {
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                if (hVar.h(j11) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e7Var.c(j11, z12, str5);
                return;
            }
            return;
        }
        int i12 = i7 - 1;
        if (i12 < this.d.size()) {
            po0 po0Var = (po0) this.d.get(i12);
            j10 = po0Var.f38646a.f28438id;
            str2 = po0Var.d;
        } else {
            i12 -= this.d.size();
            tLObject2 = (TLObject) vo0Var.d.get(i12);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j3 = user2.f28583id;
                str = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j3 = -chat2.f28434id;
                str = chat2.title;
            }
            String str6 = vo0Var.f17757c;
            if (!TextUtils.isEmpty(str6) && str != null && (A1 = org.telegram.messenger.g0.A1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29621q6, ap0Var.J0), A1, str6.length() + A1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j10 = j3;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.x(tLObject4, null, str2, null, false, false);
            if (i12 < b() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            h6Var2.N = z11;
            return;
        }
        String str7 = str2;
        if (view instanceof org.telegram.ui.Cells.e7) {
            org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) view;
            if (hVar.h(j10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e7Var2.c(j10, z10, str7);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        float f10;
        ap0 ap0Var = this.L;
        Context context = this.f42177c;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            View view = new View(context);
                            if (ap0Var.d2 && ap0Var.f33571k2[1] != null) {
                                f10 = 109.0f;
                            } else {
                                f10 = 56.0f;
                            }
                            view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(f10)));
                            y3Var = view;
                        } else {
                            View e7Var = new org.telegram.ui.Cells.e7(0, context, ap0Var.J0);
                            e7Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
                            y3Var = e7Var;
                        }
                    } else {
                        y3Var = new bi.m3(24, context, this);
                    }
                } else {
                    org.telegram.ui.Cells.y3 y3Var2 = new org.telegram.ui.Cells.y3(context, ap0Var.J0);
                    y3Var2.setTextColor(org.telegram.ui.ActionBar.m6.f29420f7);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29401e7, y3Var2, ap0Var.J0);
                    y3Var2.setText(org.telegram.messenger.hd.N0(2131746174, null));
                    y3Var = y3Var2;
                }
            } else {
                org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(6, context, ap0Var.J0);
                f61Var.setItemAnimator(null);
                f61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(11);
                b0Var.j1(0);
                f61Var.setLayoutManager(b0Var);
                wo0 wo0Var = new wo0(this, context, ap0Var.f30173a, ap0Var.J0);
                this.I = wo0Var;
                f61Var.setAdapter(wo0Var);
                f61Var.setOnItemClickListener(new o(this, 12));
                y3Var = f61Var;
            }
        } else {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, ap0Var.J0);
            h6Var.F0 = true;
            h6Var.m0 = true;
            y3Var = h6Var;
        }
        return new v4.f1(y3Var);
    }
}
