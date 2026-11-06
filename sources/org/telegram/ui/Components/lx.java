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
public final class lx extends oj0 {
    public fq E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final gy L;
    public final Context f35780c;
    public final boolean d;
    public final nx f35781e;
    public final int f35782f;
    public int h;
    public TLRPC.User f35783n;
    public String f35784r;
    public boolean f35785s;
    public boolean f35786w;
    public String f35787x;
    public final ArrayList f35788y = new ArrayList();
    public final HashMap D = new HashMap();
    public int I = -1;
    public int J = -1;

    public lx(gy gyVar, Context context, boolean z9, int i7) {
        nx nxVar;
        this.L = gyVar;
        this.f35780c = context;
        this.d = z9;
        this.f35782f = i7;
        if (z9) {
            nxVar = null;
        } else {
            nxVar = new nx(gyVar, context);
        }
        this.f35781e = nxVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z9, boolean z10, boolean z11, String str3, TLObject tLObject) {
        boolean z12;
        if (str != null && str.equals(this.f35787x)) {
            this.h = 0;
            if (z11 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z9, z10, false);
                return;
            }
            HashMap hashMap = this.D;
            boolean z13 = this.d;
            ArrayList arrayList = this.f35788y;
            gy gyVar = this.L;
            if (!z13 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                gyVar.f34066o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = gyVar.f34059l0;
                lx lxVar = gyVar.f34064n0;
                if (!hashMap2.containsKey(str3)) {
                    gyVar.f34059l0.put(str3, messages_botresults);
                }
                if (!z11 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.yr.a0(gyVar.f34032c1).v1(str3, messages_botresults);
                }
                this.f35784r = messages_botresults.next_offset;
                int i7 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f26951id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f26951id, botInlineResult);
                        i7++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f35784r)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.f35785s = z12;
                if (i7 != 0) {
                    if (z10 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z13) {
                            if (size != 0) {
                                int i11 = this.H;
                                lxVar.getClass();
                                g(i11 + size);
                                int i12 = this.H;
                                lxVar.getClass();
                                o(i12 + size + 1, i7);
                            } else {
                                int i13 = this.H;
                                lxVar.getClass();
                                o(i13, i7 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            lxVar.getClass();
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
                if (gyVar.f34047h0.getAdapter() != this) {
                    gyVar.f34047h0.setAdapter(this);
                }
                if (z10 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    gyVar.f34050i0.h1(0, 0);
                    gyVar.E(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z9, final boolean z10, final boolean z11) {
        int i7 = this.h;
        gy gyVar = this.L;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(gyVar.f34032c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f35787x = str;
        this.f35786w = z10;
        nx nxVar = this.f35781e;
        if (nxVar != null) {
            nxVar.a(z10);
        }
        int i10 = gyVar.f34032c1;
        HashMap hashMap = gyVar.f34059l0;
        kv kvVar = gyVar.f34047h0;
        mv mvVar = gyVar.f34066o0;
        int i11 = gyVar.f34032c1;
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
                    mvVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z13 && TextUtils.isEmpty(str2)) {
            mvVar.e(true);
        }
        this.f35783n = (TLRPC.User) f22;
        final String l10 = com.google.android.recaptcha.internal.a.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final lx lxVar = lx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z14 = z9;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final String str5 = l10;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        lx.this.E(str3, str4, z14, z15, z16, str5, tLObject);
                    }
                });
            }
        };
        if (!z11 && !z13 && z10 && TextUtils.isEmpty(str2)) {
            this.f35788y.clear();
            this.D.clear();
            if (kvVar.getAdapter() != this) {
                kvVar.setAdapter(this);
            }
            f();
            gyVar.f34050i0.h1(0, 0);
            gyVar.E(2);
        }
        if (z11 && hashMap.containsKey(l10)) {
            E(str, str2, z9, z10, true, l10, (TLObject) hashMap.get(l10));
        } else if (gyVar.f34056k0.f36702a.contains(l10)) {
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
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.qp.s1(i11).q1(this.f35783n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z9) {
        long j3;
        if (!this.d) {
            int i7 = this.h;
            gy gyVar = this.L;
            if (i7 != 0) {
                if (i7 >= 0) {
                    ConnectionsManager.getInstance(gyVar.f34032c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f35786w = false;
            nx nxVar = this.f35781e;
            if (nxVar != null) {
                nxVar.a(false);
            }
            fq fqVar = this.E;
            if (fqVar != null) {
                org.telegram.messenger.g0.r(fqVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f35787x = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                nw nwVar = gyVar.f34069p0;
                kv kvVar = gyVar.f34047h0;
                int currentPosition = nwVar.getCurrentPosition();
                if (currentPosition != gyVar.f34076r0 && currentPosition != gyVar.f34080s0) {
                    H((String) org.telegram.messenger.qp.s1(gyVar.f34032c1).f24736b4.get(currentPosition - gyVar.f34083t0));
                    return;
                }
                v4.g0 adapter = kvVar.getAdapter();
                lx lxVar = gyVar.f34064n0;
                if (adapter != lxVar) {
                    kvVar.setAdapter(lxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f35787x = lowerCase;
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
        if (this.f35786w && TextUtils.equals(this.f35787x, str)) {
            this.L.f34050i0.h1(0, 0);
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
        ArrayList arrayList = this.f35788y;
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
        if (!z9 && this.f35788y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f35782f) != 0) {
            gy gyVar = this.L;
            if (i7 == Integer.MAX_VALUE) {
                this.H = gyVar.f34051i1.size();
            } else {
                kv kvVar = gyVar.f34047h0;
                mx mxVar = gyVar.f34050i0;
                if (kvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = gyVar.f34047h0.getMeasuredWidth();
                    int i10 = mxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.H = 0;
                    int size = gyVar.f34051i1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) gyVar.f34051i1.get(i14);
                        mt0 C1 = jy.C1(mxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f36086a / C1.f36087b) * L) / measuredWidth) * i10));
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
        if (d1Var.f56955f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) d1Var.f56951a;
        int i10 = this.J;
        if (i10 >= 0 && i7 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.f35788y.get(i7 - i10), this.f35783n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f34051i1.get(i7);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        if (i7 != 0) {
            gy gyVar = this.L;
            if (i7 != 1) {
                if (i7 != 2) {
                    ViewGroup.LayoutParams o0Var = new v4.o0(-1, -2);
                    View view = this.f35781e;
                    view.setLayoutParams(o0Var);
                    j8Var = view;
                } else {
                    org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(this.f35780c, false, false, gyVar.Z1, gyVar.f34052i2);
                    j8Var2.a(0, org.telegram.messenger.hd.M0(2131750835, null));
                    v4.o0 o0Var2 = new v4.o0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    j8Var2.setLayoutParams(o0Var2);
                    j8Var = j8Var2;
                }
            } else {
                View view2 = new View(gyVar.getContext());
                view2.setLayoutParams(new v4.o0(-1, gyVar.f34028b1));
                j8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.f35780c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            j8Var = h2Var;
        }
        return new v4.d1(j8Var);
    }
}
