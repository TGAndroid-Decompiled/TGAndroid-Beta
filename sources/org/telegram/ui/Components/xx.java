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
public final class xx extends dk0 {
    public fw F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final ty M;
    public final Context f42213c;
    public final boolean d;
    public final zx f42214e;
    public final int f42215f;
    public int h;
    public TLRPC.User f42216n;
    public String f42217r;
    public boolean f42218s;
    public boolean f42219w;
    public String f42220x;
    public final ArrayList f42221y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public xx(ty tyVar, Context context, boolean z10, int i7) {
        zx zxVar;
        this.M = tyVar;
        this.f42213c = context;
        this.d = z10;
        this.f42215f = i7;
        if (z10) {
            zxVar = null;
        } else {
            zxVar = new zx(tyVar, context);
        }
        this.f42214e = zxVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f42220x)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.E;
            boolean z14 = this.d;
            ArrayList arrayList = this.f42221y;
            ty tyVar = this.M;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                tyVar.f40108p0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = tyVar.m0;
                xx xxVar = tyVar.f40105o0;
                if (!hashMap2.containsKey(str3)) {
                    tyVar.m0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    org.telegram.messenger.ur.a0(tyVar.f40074d1).v1(str3, messages_botresults);
                }
                this.f42217r = messages_botresults.next_offset;
                int i7 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f28396id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f28396id, botInlineResult);
                        i7++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f42217r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f42218s = z13;
                if (i7 != 0) {
                    if (z11 && size == 0) {
                        f();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i11 = this.I;
                                xxVar.getClass();
                                g(i11 + size);
                                int i12 = this.I;
                                xxVar.getClass();
                                o(i12 + size + 1, i7);
                            } else {
                                int i13 = this.I;
                                xxVar.getClass();
                                o(i13, i7 + 1);
                            }
                        } else {
                            if (size != 0) {
                                g(size);
                            }
                            xxVar.getClass();
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
                if (tyVar.f40089i0.getAdapter() != this) {
                    tyVar.f40089i0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    tyVar.f40092j0.h1(0, 0);
                    tyVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        ty tyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(tyVar.f40074d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f42220x = str;
        this.f42219w = z11;
        zx zxVar = this.f42214e;
        if (zxVar != null) {
            zxVar.a(z11);
        }
        int i10 = tyVar.f40074d1;
        HashMap hashMap = tyVar.m0;
        xv xvVar = tyVar.f40089i0;
        zv zvVar = tyVar.f40108p0;
        int i11 = tyVar.f40074d1;
        TLObject h22 = org.telegram.messenger.np.u1(i10).h2(org.telegram.messenger.np.u1(i11).N3);
        boolean z13 = h22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.np.u1(i11).N3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new f2(this, 4));
                }
                if (!z14) {
                    zvVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            zvVar.e(true);
        }
        this.f42216n = (TLRPC.User) h22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final xx xxVar = xx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        xx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f42221y.clear();
            this.E.clear();
            if (xvVar.getAdapter() != this) {
                xvVar.setAdapter(this);
            }
            f();
            tyVar.f40092j0.h1(0, 0);
            tyVar.F(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
        } else if (tyVar.f40098l0.f33647a.contains(l10)) {
        } else {
            if (z12) {
                this.h = -1;
                org.telegram.messenger.ur.a0(i11).M(l10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.u1(i11).s1(this.f42216n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i7 = this.h;
            ty tyVar = this.M;
            if (i7 != 0) {
                if (i7 >= 0) {
                    ConnectionsManager.getInstance(tyVar.f40074d1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.f42219w = false;
            zx zxVar = this.f42214e;
            if (zxVar != null) {
                zxVar.a(false);
            }
            fw fwVar = this.F;
            if (fwVar != null) {
                org.telegram.messenger.g0.r(fwVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f42220x = null;
                if (this.L) {
                    F("", "", true, true, true);
                    return;
                }
                bx bxVar = tyVar.f40111q0;
                xv xvVar = tyVar.f40089i0;
                int currentPosition = bxVar.getCurrentPosition();
                if (currentPosition != tyVar.f40119s0 && currentPosition != tyVar.f40122t0) {
                    H((String) org.telegram.messenger.np.u1(tyVar.f40074d1).f25799e4.get(currentPosition - tyVar.f40125u0));
                    return;
                }
                v4.h0 adapter = xvVar.getAdapter();
                xx xxVar = tyVar.f40105o0;
                if (adapter != xxVar) {
                    xvVar.setAdapter(xxVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f42220x = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                fw fwVar2 = new fw(4, this, str);
                this.F = fwVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(fwVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.f42219w && TextUtils.equals(this.f42220x, str)) {
            this.M.f40092j0.h1(0, 0);
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
        ArrayList arrayList = this.f42221y;
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
        if (!z10 && this.f42221y.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f42215f) != 0) {
            ty tyVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = tyVar.f40093j1.size();
            } else {
                xv xvVar = tyVar.f40089i0;
                yx yxVar = tyVar.f40092j0;
                if (xvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = tyVar.f40089i0.getMeasuredWidth();
                    int i10 = yxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = tyVar.f40093j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) tyVar.f40093j1.get(i14);
                        yt0 C1 = wy.C1(yxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f42506a / C1.f42507b) * L) / measuredWidth) * i10));
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
        if (e1Var.f59115f != 0) {
            return;
        }
        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) e1Var.f59111a;
        int i10 = this.K;
        if (i10 >= 0 && i7 >= i10) {
            i2Var.e((TLRPC.BotInlineResult) this.f42221y.get(i7 - i10), this.f42216n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.f40093j1.get(i7);
        i2Var.getClass();
        i2Var.d(0, "gif" + document, document);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.k8 k8Var;
        if (i7 != 0) {
            ty tyVar = this.M;
            if (i7 != 1) {
                if (i7 != 2) {
                    ViewGroup.LayoutParams p0Var = new v4.p0(-1, -2);
                    View view = this.f42214e;
                    view.setLayoutParams(p0Var);
                    k8Var = view;
                } else {
                    org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f42213c, false, false, tyVar.f40064a2, tyVar.f40094j2);
                    k8Var2.a(0, org.telegram.messenger.hd.N0(2131750822, null));
                    v4.p0 p0Var2 = new v4.p0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                    ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                    k8Var2.setLayoutParams(p0Var2);
                    k8Var = k8Var2;
                }
            } else {
                View view2 = new View(tyVar.getContext());
                view2.setLayoutParams(new v4.p0(-1, tyVar.f40071c1));
                k8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(this.f42213c);
            i2Var.setIsKeyboard(true);
            i2Var.setCanPreviewGif(true);
            k8Var = i2Var;
        }
        return new v4.e1(k8Var);
    }
}
