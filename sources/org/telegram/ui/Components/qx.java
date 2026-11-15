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
public final class qx extends tj0 {
    public vs F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final ly M;
    public final Context f38780c;
    public final boolean d;
    public final sx f38781e;
    public final int f38782f;
    public int h;
    public TLRPC.User f38783n;
    public String f38784r;
    public boolean f38785s;
    public boolean f38786w;
    public String f38787x;
    public final ArrayList f38788y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public qx(ly lyVar, Context context, boolean z10, int i7) {
        sx sxVar;
        this.M = lyVar;
        this.f38780c = context;
        this.d = z10;
        this.f38782f = i7;
        if (z10) {
            sxVar = null;
        } else {
            sxVar = new sx(lyVar, context);
        }
        this.f38781e = sxVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f38787x)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.E;
            boolean z14 = this.d;
            ArrayList arrayList = this.f38788y;
            ly lyVar = this.M;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                lyVar.f36975p0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = lyVar.m0;
                qx qxVar = lyVar.f36972o0;
                if (!hashMap2.containsKey(str3)) {
                    lyVar.m0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.vr.a0(lyVar.f36941d1).v1(str3, messages_botresults);
                }
                this.f38784r = messages_botresults.next_offset;
                int i7 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f28049id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f28049id, botInlineResult);
                        i7++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f38784r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f38785s = z13;
                if (i7 != 0) {
                    if (z11 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i11 = this.I;
                                qxVar.getClass();
                                g(i11 + size);
                                int i12 = this.I;
                                qxVar.getClass();
                                o(i12 + size + 1, i7);
                            } else {
                                int i13 = this.I;
                                qxVar.getClass();
                                o(i13, i7 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            qxVar.getClass();
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
                if (lyVar.f36956i0.getAdapter() != this) {
                    lyVar.f36956i0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    lyVar.f36959j0.h1(0, 0);
                    lyVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        ly lyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(lyVar.f36941d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f38787x = str;
        this.f38786w = z11;
        sx sxVar = this.f38781e;
        if (sxVar != null) {
            sxVar.a(z11);
        }
        int i10 = lyVar.f36941d1;
        HashMap hashMap = lyVar.m0;
        qv qvVar = lyVar.f36956i0;
        sv svVar = lyVar.f36975p0;
        int i11 = lyVar.f36941d1;
        TLObject f22 = org.telegram.messenger.np.s1(i10).f2(org.telegram.messenger.np.s1(i11).L3);
        boolean z13 = f22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.np.s1(i11).L3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new v1(this, 4));
                }
                if (!z14) {
                    svVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            svVar.e(true);
        }
        this.f38783n = (TLRPC.User) f22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final qx qxVar = qx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        qx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f38788y.clear();
            this.E.clear();
            if (qvVar.getAdapter() != this) {
                qvVar.setAdapter(this);
            }
            f();
            lyVar.f36959j0.h1(0, 0);
            lyVar.F(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
        } else if (lyVar.f36965l0.f39827a.contains(l10)) {
        } else {
            if (z12) {
                this.h = -1;
                org.telegram.messenger.vr.a0(i11).M(l10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.s1(i11).q1(this.f38783n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i7 = this.h;
            ly lyVar = this.M;
            if (i7 != 0) {
                if (i7 >= 0) {
                    ConnectionsManager.getInstance(lyVar.f36941d1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f38786w = false;
            sx sxVar = this.f38781e;
            if (sxVar != null) {
                sxVar.a(false);
            }
            vs vsVar = this.F;
            if (vsVar != null) {
                org.telegram.messenger.g0.r(vsVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f38787x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                tw twVar = lyVar.f36978q0;
                qv qvVar = lyVar.f36956i0;
                int currentPosition = twVar.getCurrentPosition();
                if (currentPosition != lyVar.f36986s0 && currentPosition != lyVar.f36989t0) {
                    H((String) org.telegram.messenger.np.s1(lyVar.f36941d1).f25252c4.get(currentPosition - lyVar.f36992u0));
                    return;
                }
                v4.h0 adapter = qvVar.getAdapter();
                qx qxVar = lyVar.f36972o0;
                if (adapter != qxVar) {
                    qvVar.setAdapter(qxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f38787x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                vs vsVar2 = new vs(8, this, str);
                this.F = vsVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(vsVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.f38786w && TextUtils.equals(this.f38787x, str)) {
            this.M.f36959j0.h1(0, 0);
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
        ArrayList arrayList = this.f38788y;
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
        if (!z10 && this.f38788y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f38782f) != 0) {
            ly lyVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = lyVar.f36960j1.size();
            } else {
                qv qvVar = lyVar.f36956i0;
                rx rxVar = lyVar.f36959j0;
                if (qvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = lyVar.f36956i0.getMeasuredWidth();
                    int i10 = rxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = lyVar.f36960j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) lyVar.f36960j1.get(i14);
                        nt0 C1 = oy.C1(rxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f37702a / C1.f37703b) * L) / measuredWidth) * i10));
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
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f58539f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) e1Var.f58535a;
        int i10 = this.K;
        if (i10 >= 0 && i7 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.f38788y.get(i7 - i10), this.f38783n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.f36960j1.get(i7);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i8 i8Var;
        if (i7 != 0) {
            ly lyVar = this.M;
            if (i7 != 1) {
                if (i7 != 2) {
                    ViewGroup.LayoutParams p0Var = new v4.p0(-1, -2);
                    View view = this.f38781e;
                    view.setLayoutParams(p0Var);
                    i8Var = view;
                } else {
                    org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(this.f38780c, false, false, lyVar.f36931a2, lyVar.f36961j2);
                    i8Var2.a(0, org.telegram.messenger.hd.M0(2131750834, null));
                    v4.p0 p0Var2 = new v4.p0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    i8Var2.setLayoutParams(p0Var2);
                    i8Var = i8Var2;
                }
            } else {
                View view2 = new View(lyVar.getContext());
                view2.setLayoutParams(new v4.p0(-1, lyVar.f36938c1));
                i8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.f38780c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            i8Var = h2Var;
        }
        return new v4.e1(i8Var);
    }
}
