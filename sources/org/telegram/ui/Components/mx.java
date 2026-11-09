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
public final class mx extends pj0 {
    public fq E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final hy L;
    public final Context f36159c;
    public final boolean d;
    public final ox f36160e;
    public final int f36161f;
    public int h;
    public TLRPC.User f36162n;
    public String f36163r;
    public boolean f36164s;
    public boolean f36165w;
    public String f36166x;
    public final ArrayList f36167y = new ArrayList();
    public final HashMap D = new HashMap();
    public int I = -1;
    public int J = -1;

    public mx(hy hyVar, Context context, boolean z9, int i7) {
        ox oxVar;
        this.L = hyVar;
        this.f36159c = context;
        this.d = z9;
        this.f36161f = i7;
        if (z9) {
            oxVar = null;
        } else {
            oxVar = new ox(hyVar, context);
        }
        this.f36160e = oxVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z9, boolean z10, boolean z11, String str3, TLObject tLObject) {
        boolean z12;
        if (str != null && str.equals(this.f36166x)) {
            this.h = 0;
            if (z11 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z9, z10, false);
                return;
            }
            HashMap hashMap = this.D;
            boolean z13 = this.d;
            ArrayList arrayList = this.f36167y;
            hy hyVar = this.L;
            if (!z13 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                hyVar.f34449o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = hyVar.f34442l0;
                mx mxVar = hyVar.f34447n0;
                if (!hashMap2.containsKey(str3)) {
                    hyVar.f34442l0.put(str3, messages_botresults);
                }
                if (!z11 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.yr.a0(hyVar.f34415c1).v1(str3, messages_botresults);
                }
                this.f36163r = messages_botresults.next_offset;
                int i7 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f26954id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f26954id, botInlineResult);
                        i7++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f36163r)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.f36164s = z12;
                if (i7 != 0) {
                    if (z10 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z13) {
                            if (size != 0) {
                                int i11 = this.H;
                                mxVar.getClass();
                                g(i11 + size);
                                int i12 = this.H;
                                mxVar.getClass();
                                o(i12 + size + 1, i7);
                            } else {
                                int i13 = this.H;
                                mxVar.getClass();
                                o(i13, i7 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            mxVar.getClass();
                            o(size, i7);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    f();
                }
            } else {
                f();
            }
            if (!z13) {
                if (hyVar.f34430h0.getAdapter() != this) {
                    hyVar.f34430h0.setAdapter(this);
                }
                if (z10 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    hyVar.f34433i0.h1(0, 0);
                    hyVar.E(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z9, final boolean z10, final boolean z11) {
        int i7 = this.h;
        hy hyVar = this.L;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(hyVar.f34415c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f36166x = str;
        this.f36165w = z10;
        ox oxVar = this.f36160e;
        if (oxVar != null) {
            oxVar.a(z10);
        }
        int i10 = hyVar.f34415c1;
        HashMap hashMap = hyVar.f34442l0;
        lv lvVar = hyVar.f34430h0;
        nv nvVar = hyVar.f34449o0;
        int i11 = hyVar.f34415c1;
        TLObject f22 = org.telegram.messenger.qp.s1(i10).f2(org.telegram.messenger.qp.s1(i11).K3);
        boolean z12 = f22 instanceof TLRPC.User;
        boolean z13 = this.d;
        if (!z12) {
            if (z9) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.qp.s1(i11).K3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new x1(this, 4));
                }
                if (!z13) {
                    nvVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z13 && TextUtils.isEmpty(str2)) {
            nvVar.e(true);
        }
        this.f36162n = (TLRPC.User) f22;
        final String l10 = com.google.android.recaptcha.internal.a.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final mx mxVar = mx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z14 = z9;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final String str5 = l10;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        mx.this.E(str3, str4, z14, z15, z16, str5, tLObject);
                    }
                });
            }
        };
        if (!z11 && !z13 && z10 && TextUtils.isEmpty(str2)) {
            this.f36167y.clear();
            this.D.clear();
            if (lvVar.getAdapter() != this) {
                lvVar.setAdapter(this);
            }
            f();
            hyVar.f34433i0.h1(0, 0);
            hyVar.E(2);
        }
        if (z11 && hashMap.containsKey(l10)) {
            E(str, str2, z9, z10, true, l10, (TLObject) hashMap.get(l10));
        } else if (hyVar.f34439k0.f37119a.contains(l10)) {
        } else {
            if (z11) {
                this.h = -1;
                org.telegram.messenger.yr.a0(i11).M(l10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.qp.s1(i11).q1(this.f36162n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z9) {
        long j3;
        if (!this.d) {
            int i7 = this.h;
            hy hyVar = this.L;
            if (i7 != 0) {
                if (i7 >= 0) {
                    ConnectionsManager.getInstance(hyVar.f34415c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f36165w = false;
            ox oxVar = this.f36160e;
            if (oxVar != null) {
                oxVar.a(false);
            }
            fq fqVar = this.E;
            if (fqVar != null) {
                org.telegram.messenger.g0.r(fqVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f36166x = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                ow owVar = hyVar.f34452p0;
                lv lvVar = hyVar.f34430h0;
                int currentPosition = owVar.getCurrentPosition();
                if (currentPosition != hyVar.f34459r0 && currentPosition != hyVar.f34463s0) {
                    H((String) org.telegram.messenger.qp.s1(hyVar.f34415c1).f24743b4.get(currentPosition - hyVar.f34466t0));
                    return;
                }
                v4.g0 adapter = lvVar.getAdapter();
                mx mxVar = hyVar.f34447n0;
                if (adapter != mxVar) {
                    lvVar.setAdapter(mxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f36166x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                fq fqVar2 = new fq(14, this, str);
                this.E = fqVar2;
                if (z9) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(fqVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.f36165w && TextUtils.equals(this.f36166x, str)) {
            this.L.f34433i0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.I = -1;
        this.J = -1;
        this.G = 0;
        boolean z9 = this.d;
        if (z9) {
            this.G = this.H;
        }
        ArrayList arrayList = this.f36167y;
        if (!arrayList.isEmpty()) {
            if (z9 && this.H > 0) {
                int i7 = this.G;
                this.G = i7 + 1;
                this.I = i7;
            }
            int i10 = this.G;
            this.J = i10;
            this.G = arrayList.size() + i10;
        } else if (!z9) {
            this.G++;
        }
    }

    @Override
    public final int b() {
        return this.G;
    }

    @Override
    public final int d(int i7) {
        boolean z9 = this.d;
        if (z9 && i7 == this.I) {
            return 2;
        }
        if (!z9 && this.f36167y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f36161f) != 0) {
            hy hyVar = this.L;
            if (i7 == Integer.MAX_VALUE) {
                this.H = hyVar.f34434i1.size();
            } else {
                lv lvVar = hyVar.f34430h0;
                nx nxVar = hyVar.f34433i0;
                if (lvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = hyVar.f34430h0.getMeasuredWidth();
                    int i10 = nxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.H = 0;
                    int size = hyVar.f34434i1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) hyVar.f34434i1.get(i14);
                        ot0 C1 = ky.C1(nxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f36801a / C1.f36802b) * L) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.H += i12;
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
                        this.H += i12;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f57060f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) d1Var.f57056a;
        int i10 = this.J;
        if (i10 >= 0 && i7 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.f36167y.get(i7 - i10), this.f36162n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f34434i1.get(i7);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        if (i7 != 0) {
            hy hyVar = this.L;
            if (i7 != 1) {
                if (i7 != 2) {
                    ViewGroup.LayoutParams o0Var = new v4.o0(-1, -2);
                    View view = this.f36160e;
                    view.setLayoutParams(o0Var);
                    j8Var = view;
                } else {
                    org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f36159c, false, false, hyVar.Z1, hyVar.f34435i2);
                    j8Var2.a(0, org.telegram.messenger.id.M0(2131750834, null));
                    v4.o0 o0Var2 = new v4.o0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    j8Var2.setLayoutParams(o0Var2);
                    j8Var = j8Var2;
                }
            } else {
                View view2 = new View(hyVar.getContext());
                view2.setLayoutParams(new v4.o0(-1, hyVar.f34411b1));
                j8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.f36159c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            j8Var = h2Var;
        }
        return new v4.d1(j8Var);
    }
}
