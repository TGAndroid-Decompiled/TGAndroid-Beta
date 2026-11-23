package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ux extends dk0 {
    public bt F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final qy M;
    public final Context f40491c;
    public final boolean d;
    public final wx f40492e;
    public final int f40493f;
    public int h;
    public TLRPC.User f40494n;
    public String f40495r;
    public boolean f40496s;
    public boolean f40497w;
    public String f40498x;
    public final ArrayList f40499y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public ux(qy qyVar, Context context, boolean z10, int i7) {
        wx wxVar;
        this.M = qyVar;
        this.f40491c = context;
        this.d = z10;
        this.f40493f = i7;
        if (z10) {
            wxVar = null;
        } else {
            wxVar = new wx(qyVar, context);
        }
        this.f40492e = wxVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f40498x)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.E;
            boolean z14 = this.d;
            ArrayList arrayList = this.f40499y;
            qy qyVar = this.M;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                qyVar.f39081p0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = qyVar.m0;
                ux uxVar = qyVar.f39078o0;
                if (!hashMap2.containsKey(str3)) {
                    qyVar.m0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.tr.a0(qyVar.f39047d1).v1(str3, messages_botresults);
                }
                this.f40495r = messages_botresults.next_offset;
                int i7 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f28490id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f28490id, botInlineResult);
                        i7++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f40495r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f40496s = z13;
                if (i7 != 0) {
                    if (z11 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i11 = this.I;
                                uxVar.getClass();
                                g(i11 + size);
                                int i12 = this.I;
                                uxVar.getClass();
                                o(i12 + size + 1, i7);
                            } else {
                                int i13 = this.I;
                                uxVar.getClass();
                                o(i13, i7 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            uxVar.getClass();
                            o(size, i7);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    f();
                }
            } else {
                f();
            }
            if (!z14) {
                if (qyVar.f39062i0.getAdapter() != this) {
                    qyVar.f39062i0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    qyVar.f39065j0.h1(0, 0);
                    qyVar.E(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        qy qyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(qyVar.f39047d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f40498x = str;
        this.f40497w = z11;
        wx wxVar = this.f40492e;
        if (wxVar != null) {
            wxVar.a(z11);
        }
        int i10 = qyVar.f39047d1;
        HashMap hashMap = qyVar.m0;
        vv vvVar = qyVar.f39062i0;
        xv xvVar = qyVar.f39081p0;
        int i11 = qyVar.f39047d1;
        TLObject h22 = org.telegram.messenger.mp.u1(i10).h2(org.telegram.messenger.mp.u1(i11).N3);
        boolean z13 = h22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.mp.u1(i11).N3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new e2(this, 4));
                }
                if (!z14) {
                    xvVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            xvVar.e(true);
        }
        this.f40494n = (TLRPC.User) h22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ux uxVar = ux.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        ux.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f40499y.clear();
            this.E.clear();
            if (vvVar.getAdapter() != this) {
                vvVar.setAdapter(this);
            }
            f();
            qyVar.f39065j0.h1(0, 0);
            qyVar.E(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
        } else if (qyVar.f39071l0.f42229a.contains(l10)) {
        } else {
            if (z12) {
                this.h = -1;
                org.telegram.messenger.tr.a0(i11).M(l10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.mp.u1(i11).s1(this.f40494n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i7 = this.h;
            qy qyVar = this.M;
            if (i7 != 0) {
                if (i7 >= 0) {
                    ConnectionsManager.getInstance(qyVar.f39047d1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f40497w = false;
            wx wxVar = this.f40492e;
            if (wxVar != null) {
                wxVar.a(false);
            }
            bt btVar = this.F;
            if (btVar != null) {
                org.telegram.messenger.g0.r(btVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f40498x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                yw ywVar = qyVar.f39084q0;
                vv vvVar = qyVar.f39062i0;
                int currentPosition = ywVar.getCurrentPosition();
                if (currentPosition != qyVar.f39092s0 && currentPosition != qyVar.f39095t0) {
                    H((String) org.telegram.messenger.mp.u1(qyVar.f39047d1).f25731e4.get(currentPosition - qyVar.f39098u0));
                    return;
                }
                v4.i0 adapter = vvVar.getAdapter();
                ux uxVar = qyVar.f39078o0;
                if (adapter != uxVar) {
                    vvVar.setAdapter(uxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f40498x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                bt btVar2 = new bt(8, this, str);
                this.F = btVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(btVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.f40497w && TextUtils.equals(this.f40498x, str)) {
            this.M.f39065j0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.J = -1;
        this.K = -1;
        this.H = 0;
        boolean z10 = this.d;
        if (z10) {
            this.H = this.I;
        }
        ArrayList arrayList = this.f40499y;
        if (!arrayList.isEmpty()) {
            if (z10 && this.I > 0) {
                int i7 = this.H;
                this.H = i7 + 1;
                this.J = i7;
            }
            int i10 = this.H;
            this.K = i10;
            this.H = arrayList.size() + i10;
        } else if (!z10) {
            this.H++;
        }
    }

    @Override
    public final int b() {
        return this.H;
    }

    @Override
    public final int d(int i7) {
        boolean z10 = this.d;
        if (z10 && i7 == this.J) {
            return 2;
        }
        if (!z10 && this.f40499y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f40493f) != 0) {
            qy qyVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = qyVar.f39066j1.size();
            } else {
                vv vvVar = qyVar.f39062i0;
                vx vxVar = qyVar.f39065j0;
                if (vvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = qyVar.f39062i0.getMeasuredWidth();
                    int i10 = vxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = qyVar.f39066j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) qyVar.f39066j1.get(i14);
                        xt0 C1 = ty.C1(vxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f42189a / C1.f42190b) * L) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.I += i12;
                            i13++;
                            if (i13 == i7) {
                                break;
                            }
                            i11 = i10;
                            i12 = 0;
                        }
                        i12++;
                        i11 -= min;
                    }
                    if (i13 < i7) {
                        this.I += i12;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f59249f != 0) {
            return;
        }
        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) f1Var.f59245a;
        int i10 = this.K;
        if (i10 >= 0 && i7 >= i10) {
            i2Var.e((TLRPC.BotInlineResult) this.f40499y.get(i7 - i10), this.f40494n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.f39066j1.get(i7);
        i2Var.getClass();
        i2Var.d(0, "gif" + document, document);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        if (i7 != 0) {
            qy qyVar = this.M;
            if (i7 != 1) {
                if (i7 != 2) {
                    ViewGroup.LayoutParams q0Var = new v4.q0(-1, -2);
                    View view = this.f40492e;
                    view.setLayoutParams(q0Var);
                    j8Var = view;
                } else {
                    org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f40491c, false, false, qyVar.f39037a2, qyVar.f39067j2);
                    j8Var2.a(0, org.telegram.messenger.gd.N0(2131750822, null));
                    v4.q0 q0Var2 = new v4.q0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    j8Var2.setLayoutParams(q0Var2);
                    j8Var = j8Var2;
                }
            } else {
                View view2 = new View(qyVar.getContext());
                view2.setLayoutParams(new v4.q0(-1, qyVar.f39044c1));
                j8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(this.f40491c);
            i2Var.setIsKeyboard(true);
            i2Var.setCanPreviewGif(true);
            j8Var = i2Var;
        }
        return new v4.f1(j8Var);
    }
}
