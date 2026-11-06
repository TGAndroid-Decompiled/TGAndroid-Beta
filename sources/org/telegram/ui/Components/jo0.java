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
public final class jo0 extends oj0 {
    public int G;
    public io0 H;
    public int J;
    public final mo0 K;
    public final Context f35043c;
    public final ho0 f35044e;
    public go0 f35045f;
    public go0 h;
    public String f35046n;
    public int f35047r;
    public int f35048s;
    public int f35049w;
    public ArrayList d = new ArrayList();
    public int f35050x = -1;
    public int f35051y = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public jo0(mo0 mo0Var, Context context) {
        this.K = mo0Var;
        this.f35043c = context;
        ?? z1Var = new jg.z1(false);
        this.f35044e = z1Var;
        z1Var.f16989a = new n(this);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56931f;
        if (i7 != 1 && i7 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f35046n)) {
            return;
        }
        this.f35046n = str;
        if (this.f35045f != null) {
            Utilities.f21335g.a(this.f35045f);
            this.f35045f = null;
        }
        go0 go0Var = this.h;
        if (go0Var != null) {
            org.telegram.messenger.g0.r(go0Var);
            this.h = null;
        }
        this.d.clear();
        this.f35044e.f(null, null);
        this.f35044e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.K.K0(true);
        if (TextUtils.isEmpty(str)) {
            mo0.J0(this.K);
            this.f35047r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i7 = this.f35047r + 1;
            this.f35047r = i7;
            this.K.I1.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21335g;
            go0 go0Var2 = new go0(this, str, i7, 0);
            this.f35045f = go0Var2;
            p5Var.d(go0Var2, 300L);
        }
        this.K.K0(false);
    }

    @Override
    public final int b() {
        this.G = 0;
        this.f35050x = -1;
        this.f35051y = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f35046n)) {
            int i7 = this.G;
            this.D = i7;
            this.G = i7 + 2;
            this.f35050x = i7 + 1;
            mo0 mo0Var = this.K;
            if (mo0Var.f36088w2.size() > 0) {
                int i10 = this.G;
                int i11 = i10 + 1;
                this.G = i11;
                this.f35051y = i10;
                this.E = i11;
                this.G = mo0Var.f36088w2.size() + i11;
            }
            int i12 = this.G;
            int i13 = i12 + 1;
            this.G = i13;
            this.F = i12;
            this.J = i13;
            return i13;
        }
        int i14 = this.G;
        int i15 = i14 + 1;
        this.G = i15;
        this.D = i14;
        int size = this.f35044e.d.size() + this.d.size() + i15;
        this.G = size;
        if (size == 1) {
            this.D = -1;
            this.G = 0;
            this.J = 0;
            return 0;
        }
        int i16 = size + 1;
        this.G = i16;
        this.F = size;
        this.J = i16;
        return i16;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.F) {
            return 4;
        }
        if (i7 == this.D) {
            return 1;
        }
        if (i7 == this.f35050x) {
            return 2;
        }
        if (i7 == this.f35051y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f35046n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        String str;
        String str2;
        long j10;
        int A1;
        boolean z9;
        boolean z10;
        TLObject tLObject;
        String str3;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j11;
        boolean z11;
        boolean z12;
        int A12;
        mo0 mo0Var = this.K;
        a0.h hVar = mo0Var.M1;
        int i10 = d1Var.f56931f;
        View view = d1Var.f56927a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((pj0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f35046n);
        TLObject tLObject2 = null;
        String m10 = null;
        ho0 ho0Var = this.f35044e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i11 = this.E;
            if (i11 >= 0 && i7 >= i11) {
                TLObject tLObject3 = ((jg.g0) mo0Var.f36088w2.get(i7 - i11)).f16724a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f27101id;
                    m10 = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f26952id;
                    m10 = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(mo0Var.f28612a).a2(Long.valueOf(tL_encryptedChat2.user_id));
                        if (a22 != null) {
                            j11 = a22.f27101id;
                            m10 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                        }
                    }
                    j11 = 0;
                }
                String str4 = ho0Var.f16991c;
                if (!TextUtils.isEmpty(str4) && m10 != null && (A12 = org.telegram.messenger.g0.A1(m10.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m10);
                    spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.k6.f28088q6, mo0Var.I0), A12, str4.length() + A12, 33);
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
                g6Var.x(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i7 < b() - 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g6Var.M = z12;
                return;
            }
            String str5 = str3;
            if (view instanceof org.telegram.ui.Cells.d7) {
                org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
                if (hVar.h(j11) >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d7Var.c(j11, z11, str5);
                return;
            }
            return;
        }
        int i12 = i7 - 1;
        if (i12 < this.d.size()) {
            bo0 bo0Var = (bo0) this.d.get(i12);
            j10 = bo0Var.f32241a.f26956id;
            str2 = bo0Var.d;
        } else {
            i12 -= this.d.size();
            tLObject2 = (TLObject) ho0Var.d.get(i12);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j3 = user2.f27101id;
                str = org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j3 = -chat2.f26952id;
                str = chat2.title;
            }
            String str6 = ho0Var.f16991c;
            if (!TextUtils.isEmpty(str6) && str != null && (A1 = org.telegram.messenger.g0.A1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new xz(org.telegram.ui.ActionBar.k6.f28088q6, mo0Var.I0), A1, str6.length() + A1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j10 = j3;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var2 = (org.telegram.ui.Cells.g6) view;
            g6Var2.x(tLObject4, null, str2, null, false, false);
            if (i12 < b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            g6Var2.M = z10;
            return;
        }
        String str7 = str2;
        if (view instanceof org.telegram.ui.Cells.d7) {
            org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) view;
            if (hVar.h(j10) >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            d7Var2.c(j10, z9, str7);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        float f10;
        mo0 mo0Var = this.K;
        Context context = this.f35043c;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            View view = new View(context);
                            if (mo0Var.Z1 && mo0Var.f36059g2[1] != null) {
                                f10 = 109.0f;
                            } else {
                                f10 = 56.0f;
                            }
                            view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(f10)));
                            x3Var = view;
                        } else {
                            View d7Var = new org.telegram.ui.Cells.d7(0, context, mo0Var.I0);
                            d7Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(100.0f)));
                            x3Var = d7Var;
                        }
                    } else {
                        x3Var = new bi.ec(23, context, this);
                    }
                } else {
                    org.telegram.ui.Cells.x3 x3Var2 = new org.telegram.ui.Cells.x3(context, mo0Var.I0);
                    x3Var2.setTextColor(org.telegram.ui.ActionBar.k6.f27887f7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27868e7, x3Var2, mo0Var.I0);
                    x3Var2.setText(org.telegram.messenger.hd.M0(2131746369, null));
                    x3Var = x3Var2;
                }
            } else {
                org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(6, context, mo0Var.I0);
                e61Var.setItemAnimator(null);
                e61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(11);
                b0Var.j1(0);
                e61Var.setLayoutManager(b0Var);
                io0 io0Var = new io0(this, context, mo0Var.f28612a, mo0Var.I0);
                this.H = io0Var;
                e61Var.setAdapter(io0Var);
                e61Var.setOnItemClickListener(new k(this, 12));
                x3Var = e61Var;
            }
        } else {
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, mo0Var.I0);
            g6Var.E0 = true;
            g6Var.f29155l0 = true;
            x3Var = g6Var;
        }
        return new v4.d1(x3Var);
    }
}
