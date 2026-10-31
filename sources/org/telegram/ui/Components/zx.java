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
public final class zx extends sk0 {
    public at E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final vy L;
    public final Context f33251c;
    public final boolean d;
    public final cy e;
    public final int f33252f;
    public int h;
    public TLRPC.User f33253n;
    public String f33254r;
    public boolean f33255s;
    public boolean f33256w;
    public String f33257x;
    public final ArrayList f33258y = new ArrayList();
    public final HashMap D = new HashMap();
    public int I = -1;
    public int J = -1;

    public zx(vy vyVar, Context context, boolean z10, int i10) {
        cy cyVar;
        this.L = vyVar;
        this.f33251c = context;
        this.d = z10;
        this.f33252f = i10;
        if (z10) {
            cyVar = null;
        } else {
            cyVar = new cy(vyVar, context);
        }
        this.e = cyVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f33257x)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.D;
            boolean z14 = this.d;
            ArrayList arrayList = this.f33258y;
            vy vyVar = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                vyVar.f31900o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = vyVar.f31892l0;
                zx zxVar = vyVar.f31897n0;
                if (!hashMap2.containsKey(str3)) {
                    vyVar.f31892l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.hs.a0(vyVar.f31865c1).v1(str3, messages_botresults);
                }
                this.f33254r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f19791id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f19791id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f33254r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f33255s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                zxVar.getClass();
                                g(i12 + size);
                                int i13 = this.H;
                                zxVar.getClass();
                                o(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                zxVar.getClass();
                                o(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            zxVar.getClass();
                            o(size, i10);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    f();
                }
            } else {
                f();
            }
            if (!z14) {
                if (vyVar.f31880h0.getAdapter() != this) {
                    vyVar.f31880h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    vyVar.f31883i0.h1(0, 0);
                    vyVar.G(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        vy vyVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(vyVar.f31865c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f33257x = str;
        this.f33256w = z11;
        cy cyVar = this.e;
        if (cyVar != null) {
            cyVar.a(z11);
        }
        int i11 = vyVar.f31865c1;
        HashMap hashMap = vyVar.f31892l0;
        wv wvVar = vyVar.f31880h0;
        yv yvVar = vyVar.f31900o0;
        int i12 = vyVar.f31865c1;
        TLObject e22 = org.telegram.messenger.vp.r1(i11).e2(org.telegram.messenger.vp.r1(i12).M3);
        boolean z13 = e22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.vp.r1(i12).M3;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new x1(this, 4));
                }
                if (!z14) {
                    yvVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            yvVar.e(true);
        }
        this.f33253n = (TLRPC.User) e22;
        final String n10 = c3.i0.n("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final zx zxVar = zx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = n10;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        zx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f33258y.clear();
            this.D.clear();
            if (wvVar.getAdapter() != this) {
                wvVar.setAdapter(this);
            }
            f();
            vyVar.f31883i0.h1(0, 0);
            vyVar.G(2);
        }
        if (z12 && hashMap.containsKey(n10)) {
            E(str, str2, z10, z11, true, n10, (TLObject) hashMap.get(n10));
        } else if (vyVar.f31889k0.f25563a.contains(n10)) {
        } else {
            if (z12) {
                this.h = -1;
                org.telegram.messenger.hs.a0(i12).M(n10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.vp.r1(i12).p1(this.f33253n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j10;
        if (!this.d) {
            int i10 = this.h;
            vy vyVar = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(vyVar.f31865c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f33256w = false;
            cy cyVar = this.e;
            if (cyVar != null) {
                cyVar.a(false);
            }
            at atVar = this.E;
            if (atVar != null) {
                org.telegram.messenger.i0.r(atVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f33257x = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                cx cxVar = vyVar.f31903p0;
                wv wvVar = vyVar.f31880h0;
                int currentPosition = cxVar.getCurrentPosition();
                if (currentPosition != vyVar.f31910r0 && currentPosition != vyVar.f31914s0) {
                    H((String) org.telegram.messenger.vp.r1(vyVar.f31865c1).f18766d4.get(currentPosition - vyVar.f31917t0));
                    return;
                }
                s4.g0 adapter = wvVar.getAdapter();
                zx zxVar = vyVar.f31897n0;
                if (adapter != zxVar) {
                    wvVar.setAdapter(zxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f33257x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                at atVar2 = new at(8, this, str);
                this.E = atVar2;
                if (z10) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                org.telegram.messenger.i0.h3(atVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.f33256w && TextUtils.equals(this.f33257x, str)) {
            this.L.f31883i0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.I = -1;
        this.J = -1;
        this.G = 0;
        boolean z10 = this.d;
        if (z10) {
            this.G = this.H;
        }
        ArrayList arrayList = this.f33258y;
        if (!arrayList.isEmpty()) {
            if (z10 && this.H > 0) {
                int i10 = this.G;
                this.G = i10 + 1;
                this.I = i10;
            }
            int i11 = this.G;
            this.J = i11;
            this.G = arrayList.size() + i11;
        } else if (!z10) {
            this.G++;
        }
    }

    @Override
    public final int b() {
        return this.G;
    }

    @Override
    public final int d(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.I) {
            return 2;
        }
        if (!z10 && this.f33258y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i10;
        if (this.d && (i10 = this.f33252f) != 0) {
            vy vyVar = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = vyVar.f31884i1.size();
            } else {
                wv wvVar = vyVar.f31880h0;
                ay ayVar = vyVar.f31883i0;
                if (wvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = vyVar.f31880h0.getMeasuredWidth();
                    int i11 = ayVar.J;
                    int L = org.telegram.messenger.i0.L(100.0f);
                    this.H = 0;
                    int size = vyVar.f31884i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) vyVar.f31884i1.get(i15);
                        pu0 C1 = yy.C1(ayVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f29435a / C1.f29436b) * L) / measuredWidth) * i11));
                        if (i12 < min) {
                            this.H += i13;
                            i14++;
                            if (i14 == i10) {
                                break;
                            }
                            i12 = i11;
                            i13 = 0;
                        }
                        i13++;
                        i12 -= min;
                    }
                    if (i14 < i10) {
                        this.H += i13;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f47901f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) c1Var.f47898a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            h2Var.e((TLRPC.BotInlineResult) this.f33258y.get(i10 - i11), this.f33253n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f31884i1.get(i10);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        if (i10 != 0) {
            vy vyVar = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams o0Var = new s4.o0(-1, -2);
                    View view = this.e;
                    view.setLayoutParams(o0Var);
                    n8Var = view;
                } else {
                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(this.f33251c, false, false, vyVar.Z1, vyVar.f31885i2);
                    n8Var2.a(0, org.telegram.messenger.cd.L0(2131750835, null));
                    s4.o0 o0Var2 = new s4.o0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = org.telegram.messenger.i0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = org.telegram.messenger.i0.L(5.5f);
                    n8Var2.setLayoutParams(o0Var2);
                    n8Var = n8Var2;
                }
            } else {
                View view2 = new View(vyVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, vyVar.f31861b1));
                n8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.f33251c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            n8Var = h2Var;
        }
        return new s4.c1(n8Var);
    }
}
