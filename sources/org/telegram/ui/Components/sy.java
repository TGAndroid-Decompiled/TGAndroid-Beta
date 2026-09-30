package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy extends yl0 {
    public xw E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final nz L;
    public final Context f28362c;
    public final boolean d;
    public final uy e;
    public final int f28363f;
    public int h;
    public TLRPC.User f28364n;
    public String f28365r;
    public boolean f28366s;
    public boolean v;
    public String f28367w;
    public final ArrayList f28368x = new ArrayList();
    public final HashMap f28369y = new HashMap();
    public int I = -1;
    public int J = -1;

    public sy(nz nzVar, Context context, boolean z10, int i10) {
        uy uyVar;
        this.L = nzVar;
        this.f28362c = context;
        this.d = z10;
        this.f28363f = i10;
        if (z10) {
            uyVar = null;
        } else {
            uyVar = new uy(nzVar, context);
        }
        this.e = uyVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f28367w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f28369y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f28368x;
            nz nzVar = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                nzVar.f26853o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = nzVar.f26845l0;
                sy syVar = nzVar.f26850n0;
                if (!hashMap2.containsKey(str3)) {
                    nzVar.f26845l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(nzVar.f26818c1).saveBotCache(str3, messages_botresults);
                }
                this.f28365r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f18350id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f18350id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f28365r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f28366s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                syVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                syVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                syVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            syVar.getClass();
                            s(size, i10);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    l();
                }
            } else {
                l();
            }
            if (!z14) {
                if (nzVar.f26833h0.getAdapter() != this) {
                    nzVar.f26833h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    nzVar.f26836i0.h1(0, 0);
                    nzVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        nz nzVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(nzVar.f26818c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f28367w = str;
        this.v = z11;
        uy uyVar = this.e;
        if (uyVar != null) {
            uyVar.a(z11);
        }
        int i11 = nzVar.f26818c1;
        HashMap hashMap = nzVar.f26845l0;
        pw pwVar = nzVar.f26833h0;
        sw swVar = nzVar.f26853o0;
        int i12 = nzVar.f26818c1;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new y1(this, 5));
                }
                if (!z14) {
                    swVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            swVar.e(true);
        }
        this.f28364n = (TLRPC.User) userOrChat;
        final String j3 = com.google.android.gms.internal.vision.e2.j("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final sy syVar = sy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        sy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f28368x.clear();
            this.f28369y.clear();
            if (pwVar.getAdapter() != this) {
                pwVar.setAdapter(this);
            }
            l();
            nzVar.f26836i0.h1(0, 0);
            nzVar.F(2);
        }
        if (z12 && hashMap.containsKey(j3)) {
            E(str, str2, z10, z11, true, j3, (TLObject) hashMap.get(j3));
        } else if (nzVar.f26842k0.f29740a.contains(j3)) {
        } else {
            if (z12) {
                this.h = -1;
                MessagesStorage.getInstance(i12).getBotCache(j3, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f28364n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i10 = this.h;
            nz nzVar = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(nzVar.f26818c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            uy uyVar = this.e;
            if (uyVar != null) {
                uyVar.a(false);
            }
            xw xwVar = this.E;
            if (xwVar != null) {
                AndroidUtilities.cancelRunOnUIThread(xwVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f28367w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                ux uxVar = nzVar.f26856p0;
                pw pwVar = nzVar.f26833h0;
                int currentPosition = uxVar.getCurrentPosition();
                if (currentPosition != nzVar.f26863r0 && currentPosition != nzVar.f26867s0) {
                    H(MessagesController.getInstance(nzVar.f26818c1).gifSearchEmojies.get(currentPosition - nzVar.f26870t0));
                    return;
                }
                s4.h0 adapter = pwVar.getAdapter();
                sy syVar = nzVar.f26850n0;
                if (adapter != syVar) {
                    pwVar.setAdapter(syVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f28367w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                xw xwVar2 = new xw(5, this, str);
                this.E = xwVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(xwVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f28367w, str)) {
            this.L.f26836i0.h1(0, 0);
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
        ArrayList arrayList = this.f28368x;
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
    public final int h() {
        return this.G;
    }

    @Override
    public final int j(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.I) {
            return 2;
        }
        if (!z10 && this.f28368x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f28363f) != 0) {
            nz nzVar = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = nzVar.f26837i1.size();
            } else {
                pw pwVar = nzVar.f26833h0;
                ty tyVar = nzVar.f26836i0;
                if (pwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = nzVar.f26833h0.getMeasuredWidth();
                    int i11 = tyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = nzVar.f26837i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) nzVar.f26837i1.get(i15);
                        xv0 C1 = qz.C1(tyVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f30521a / C1.f30522b) * dp) / measuredWidth) * i11));
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
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f43071f != 0) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) c1Var.f43068a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            f2Var.e((TLRPC.BotInlineResult) this.f28368x.get(i10 - i11), this.f28364n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f26837i1.get(i10);
        f2Var.getClass();
        f2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        if (i10 != 0) {
            nz nzVar = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams p0Var = new s4.p0(-1, -2);
                    View view = this.e;
                    view.setLayoutParams(p0Var);
                    o8Var = view;
                } else {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f28362c, false, false, nzVar.Z1, nzVar.f26838i2);
                    o8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.p0 p0Var2 = new s4.p0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    o8Var2.setLayoutParams(p0Var2);
                    o8Var = o8Var2;
                }
            } else {
                View view2 = new View(nzVar.getContext());
                view2.setLayoutParams(new s4.p0(-1, nzVar.f26814b1));
                o8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(this.f28362c);
            f2Var.setIsKeyboard(true);
            f2Var.setCanPreviewGif(true);
            o8Var = f2Var;
        }
        return new s4.c1(o8Var);
    }
}
