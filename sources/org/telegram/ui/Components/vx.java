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
public final class vx extends bk0 {
    public dw F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final ry M;
    public final Context f41471c;
    public final boolean d;
    public final xx f41472e;
    public final int f41473f;
    public int h;
    public TLRPC.User f41474n;
    public String f41475r;
    public boolean f41476s;
    public boolean f41477w;
    public String f41478x;
    public final ArrayList f41479y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public vx(ry ryVar, Context context, boolean z10, int i7) {
        xx xxVar;
        this.M = ryVar;
        this.f41471c = context;
        this.d = z10;
        this.f41473f = i7;
        if (z10) {
            xxVar = null;
        } else {
            xxVar = new xx(ryVar, context);
        }
        this.f41472e = xxVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f41478x)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.E;
            boolean z14 = this.d;
            ArrayList arrayList = this.f41479y;
            ry ryVar = this.M;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                ryVar.f39379p0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = ryVar.m0;
                vx vxVar = ryVar.f39376o0;
                if (!hashMap2.containsKey(str3)) {
                    ryVar.m0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.tr.a0(ryVar.f39345d1).v1(str3, messages_botresults);
                }
                this.f41475r = messages_botresults.next_offset;
                int i7 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f28401id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f28401id, botInlineResult);
                        i7++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f41475r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f41476s = z13;
                if (i7 != 0) {
                    if (z11 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i11 = this.I;
                                vxVar.getClass();
                                g(i11 + size);
                                int i12 = this.I;
                                vxVar.getClass();
                                o(i12 + size + 1, i7);
                            } else {
                                int i13 = this.I;
                                vxVar.getClass();
                                o(i13, i7 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            vxVar.getClass();
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
                if (ryVar.f39360i0.getAdapter() != this) {
                    ryVar.f39360i0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    ryVar.f39363j0.h1(0, 0);
                    ryVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        ry ryVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(ryVar.f39345d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f41478x = str;
        this.f41477w = z11;
        xx xxVar = this.f41472e;
        if (xxVar != null) {
            xxVar.a(z11);
        }
        int i10 = ryVar.f39345d1;
        HashMap hashMap = ryVar.m0;
        vv vvVar = ryVar.f39360i0;
        xv xvVar = ryVar.f39379p0;
        int i11 = ryVar.f39345d1;
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
        this.f41474n = (TLRPC.User) h22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final vx vxVar = vx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        vx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f41479y.clear();
            this.E.clear();
            if (vvVar.getAdapter() != this) {
                vvVar.setAdapter(this);
            }
            f();
            ryVar.f39363j0.h1(0, 0);
            ryVar.F(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
        } else if (ryVar.f39369l0.f42661a.contains(l10)) {
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
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.mp.u1(i11).s1(this.f41474n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i7 = this.h;
            ry ryVar = this.M;
            if (i7 != 0) {
                if (i7 >= 0) {
                    ConnectionsManager.getInstance(ryVar.f39345d1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f41477w = false;
            xx xxVar = this.f41472e;
            if (xxVar != null) {
                xxVar.a(false);
            }
            dw dwVar = this.F;
            if (dwVar != null) {
                org.telegram.messenger.g0.r(dwVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f41478x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                zw zwVar = ryVar.f39382q0;
                vv vvVar = ryVar.f39360i0;
                int currentPosition = zwVar.getCurrentPosition();
                if (currentPosition != ryVar.f39390s0 && currentPosition != ryVar.f39393t0) {
                    H((String) org.telegram.messenger.mp.u1(ryVar.f39345d1).f25636e4.get(currentPosition - ryVar.f39396u0));
                    return;
                }
                v4.i0 adapter = vvVar.getAdapter();
                vx vxVar = ryVar.f39376o0;
                if (adapter != vxVar) {
                    vvVar.setAdapter(vxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f41478x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                dw dwVar2 = new dw(4, this, str);
                this.F = dwVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(dwVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.f41477w && TextUtils.equals(this.f41478x, str)) {
            this.M.f39363j0.h1(0, 0);
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
        ArrayList arrayList = this.f41479y;
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
        if (!z10 && this.f41479y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f41473f) != 0) {
            ry ryVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = ryVar.f39364j1.size();
            } else {
                vv vvVar = ryVar.f39360i0;
                wx wxVar = ryVar.f39363j0;
                if (vvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = ryVar.f39360i0.getMeasuredWidth();
                    int i10 = wxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = ryVar.f39364j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) ryVar.f39364j1.get(i14);
                        vt0 C1 = uy.C1(wxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f41433a / C1.f41434b) * L) / measuredWidth) * i10));
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
        if (f1Var.f59127f != 0) {
            return;
        }
        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) f1Var.f59123a;
        int i10 = this.K;
        if (i10 >= 0 && i7 >= i10) {
            i2Var.e((TLRPC.BotInlineResult) this.f41479y.get(i7 - i10), this.f41474n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.f39364j1.get(i7);
        i2Var.getClass();
        i2Var.d(0, "gif" + document, document);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.k8 k8Var;
        if (i7 != 0) {
            ry ryVar = this.M;
            if (i7 != 1) {
                if (i7 != 2) {
                    ViewGroup.LayoutParams q0Var = new v4.q0(-1, -2);
                    View view = this.f41472e;
                    view.setLayoutParams(q0Var);
                    k8Var = view;
                } else {
                    org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f41471c, false, false, ryVar.f39335a2, ryVar.f39365j2);
                    k8Var2.a(0, org.telegram.messenger.gd.M0(2131750823, null));
                    v4.q0 q0Var2 = new v4.q0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    k8Var2.setLayoutParams(q0Var2);
                    k8Var = k8Var2;
                }
            } else {
                View view2 = new View(ryVar.getContext());
                view2.setLayoutParams(new v4.q0(-1, ryVar.f39342c1));
                k8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(this.f41471c);
            i2Var.setIsKeyboard(true);
            i2Var.setCanPreviewGif(true);
            k8Var = i2Var;
        }
        return new v4.f1(k8Var);
    }
}
