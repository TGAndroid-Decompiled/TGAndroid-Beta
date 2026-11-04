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
public final class jx extends sj0 {
    public cl F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final ey M;
    public final Context f35206c;
    public final boolean d;
    public final lx f35207e;
    public final int f35208f;
    public int h;
    public TLRPC.User f35209n;
    public String f35210r;
    public boolean f35211s;
    public boolean f35212w;
    public String f35213x;
    public final ArrayList f35214y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public jx(ey eyVar, Context context, boolean z10, int i3) {
        lx lxVar;
        this.M = eyVar;
        this.f35206c = context;
        this.d = z10;
        this.f35208f = i3;
        if (z10) {
            lxVar = null;
        } else {
            lxVar = new lx(eyVar, context);
        }
        this.f35207e = lxVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f35213x)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.E;
            boolean z14 = this.d;
            ArrayList arrayList = this.f35214y;
            ey eyVar = this.M;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                eyVar.f33564p0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = eyVar.m0;
                jx jxVar = eyVar.f33561o0;
                if (!hashMap2.containsKey(str3)) {
                    eyVar.m0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.qr.a0(eyVar.f33529d1).v1(str3, messages_botresults);
                }
                this.f35210r = messages_botresults.next_offset;
                int i3 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f26999id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f26999id, botInlineResult);
                        i3++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f35210r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f35211s = z13;
                if (i3 != 0) {
                    if (z11 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i11 = this.I;
                                jxVar.getClass();
                                g(i11 + size);
                                int i12 = this.I;
                                jxVar.getClass();
                                o(i12 + size + 1, i3);
                            } else {
                                int i13 = this.I;
                                jxVar.getClass();
                                o(i13, i3 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            jxVar.getClass();
                            o(size, i3);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    f();
                }
            } else {
                f();
            }
            if (!z14) {
                if (eyVar.f33545i0.getAdapter() != this) {
                    eyVar.f33545i0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    eyVar.f33548j0.h1(0, 0);
                    eyVar.E(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i3 = this.h;
        ey eyVar = this.M;
        if (i3 != 0) {
            if (i3 >= 0) {
                ConnectionsManager.getInstance(eyVar.f33529d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f35213x = str;
        this.f35212w = z11;
        lx lxVar = this.f35207e;
        if (lxVar != null) {
            lxVar.a(z11);
        }
        int i10 = eyVar.f33529d1;
        HashMap hashMap = eyVar.m0;
        jv jvVar = eyVar.f33545i0;
        lv lvVar = eyVar.f33564p0;
        int i11 = eyVar.f33529d1;
        TLObject f22 = org.telegram.messenger.hp.s1(i10).f2(org.telegram.messenger.hp.s1(i11).L3);
        boolean z13 = f22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.hp.s1(i11).L3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new w1(this, 4));
                }
                if (!z14) {
                    lvVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            lvVar.e(true);
        }
        this.f35209n = (TLRPC.User) f22;
        final String k10 = com.google.android.recaptcha.internal.a.k("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final jx jxVar = jx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = k10;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        jx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f35214y.clear();
            this.E.clear();
            if (jvVar.getAdapter() != this) {
                jvVar.setAdapter(this);
            }
            f();
            eyVar.f33548j0.h1(0, 0);
            eyVar.E(2);
        }
        if (z12 && hashMap.containsKey(k10)) {
            E(str, str2, z10, z11, true, k10, (TLObject) hashMap.get(k10));
        } else if (eyVar.f33553l0.f36264a.contains(k10)) {
        } else {
            if (z12) {
                this.h = -1;
                org.telegram.messenger.qr.a0(i11).M(k10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.hp.s1(i11).q1(this.f35209n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j10;
        if (!this.d) {
            int i3 = this.h;
            ey eyVar = this.M;
            if (i3 != 0) {
                if (i3 >= 0) {
                    ConnectionsManager.getInstance(eyVar.f33529d1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f35212w = false;
            lx lxVar = this.f35207e;
            if (lxVar != null) {
                lxVar.a(false);
            }
            cl clVar = this.F;
            if (clVar != null) {
                org.telegram.messenger.g0.r(clVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f35213x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                mw mwVar = eyVar.f33567q0;
                jv jvVar = eyVar.f33545i0;
                int currentPosition = mwVar.getCurrentPosition();
                if (currentPosition != eyVar.f33575s0 && currentPosition != eyVar.f33578t0) {
                    H((String) org.telegram.messenger.hp.s1(eyVar.f33529d1).f22977c4.get(currentPosition - eyVar.f33581u0));
                    return;
                }
                u4.h0 adapter = jvVar.getAdapter();
                jx jxVar = eyVar.f33561o0;
                if (adapter != jxVar) {
                    jvVar.setAdapter(jxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f35213x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                cl clVar2 = new cl(19, this, str);
                this.F = clVar2;
                if (z10) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                org.telegram.messenger.g0.i3(clVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.f35212w && TextUtils.equals(this.f35213x, str)) {
            this.M.f33548j0.h1(0, 0);
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
        ArrayList arrayList = this.f35214y;
        if (!arrayList.isEmpty()) {
            if (z10 && this.I > 0) {
                int i3 = this.H;
                this.H = i3 + 1;
                this.J = i3;
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
    public final int d(int i3) {
        boolean z10 = this.d;
        if (z10 && i3 == this.J) {
            return 2;
        }
        if (!z10 && this.f35214y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i3;
        if (this.d && (i3 = this.f35208f) != 0) {
            ey eyVar = this.M;
            if (i3 == Integer.MAX_VALUE) {
                this.I = eyVar.f33549j1.size();
            } else {
                jv jvVar = eyVar.f33545i0;
                kx kxVar = eyVar.f33548j0;
                if (jvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = eyVar.f33545i0.getMeasuredWidth();
                    int i10 = kxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = eyVar.f33549j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) eyVar.f33549j1.get(i14);
                        lt0 C1 = hy.C1(kxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f35877a / C1.f35878b) * L) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.I += i12;
                            i13++;
                            if (i13 == i3) {
                                break;
                            }
                            i11 = i10;
                            i12 = 0;
                        }
                        i12++;
                        i11 -= min;
                    }
                    if (i13 < i3) {
                        this.I += i12;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f55544f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) d1Var.f55540a;
        int i10 = this.K;
        if (i10 >= 0 && i3 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.f35214y.get(i3 - i10), this.f35209n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.f33549j1.get(i3);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.i8 i8Var;
        if (i3 != 0) {
            ey eyVar = this.M;
            if (i3 != 1) {
                if (i3 != 2) {
                    ViewGroup.LayoutParams p0Var = new u4.p0(-1, -2);
                    View view = this.f35207e;
                    view.setLayoutParams(p0Var);
                    i8Var = view;
                } else {
                    org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(this.f35206c, false, false, eyVar.f33520a2, eyVar.f33550j2);
                    i8Var2.a(0, org.telegram.messenger.bd.M0(2131750835, null));
                    u4.p0 p0Var2 = new u4.p0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    i8Var2.setLayoutParams(p0Var2);
                    i8Var = i8Var2;
                }
            } else {
                View view2 = new View(eyVar.getContext());
                view2.setLayoutParams(new u4.p0(-1, eyVar.f33527c1));
                i8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.f35206c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            i8Var = h2Var;
        }
        return new u4.d1(i8Var);
    }
}
