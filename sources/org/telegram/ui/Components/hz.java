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
public final class hz extends vm0 {
    public jt E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final d00 L;
    public final Context f26973c;
    public final boolean d;
    public final jz f26974e;
    public final int f26975f;
    public int h;
    public TLRPC.User f26976n;
    public String f26977r;
    public boolean f26978s;
    public boolean v;
    public String f26979w;
    public final ArrayList f26980x = new ArrayList();
    public final HashMap f26981y = new HashMap();
    public int I = -1;
    public int J = -1;

    public hz(d00 d00Var, Context context, boolean z10, int i10) {
        jz jzVar;
        this.L = d00Var;
        this.f26973c = context;
        this.d = z10;
        this.f26975f = i10;
        if (z10) {
            jzVar = null;
        } else {
            jzVar = new jz(d00Var, context);
        }
        this.f26974e = jzVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f26979w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f26981y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f26980x;
            d00 d00Var = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                d00Var.f25108o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = d00Var.f25100l0;
                hz hzVar = d00Var.f25105n0;
                if (!hashMap2.containsKey(str3)) {
                    d00Var.f25100l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(d00Var.f25072c1).saveBotCache(str3, messages_botresults);
                }
                this.f26977r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f19801id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f19801id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f26977r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f26978s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                hzVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                hzVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                hzVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            hzVar.getClass();
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
                if (d00Var.f25088h0.getAdapter() != this) {
                    d00Var.f25088h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    d00Var.f25091i0.h1(0, 0);
                    d00Var.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        d00 d00Var = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(d00Var.f25072c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f26979w = str;
        this.v = z11;
        jz jzVar = this.f26974e;
        if (jzVar != null) {
            jzVar.a(z11);
        }
        int i11 = d00Var.f25072c1;
        HashMap hashMap = d00Var.f25100l0;
        fx fxVar = d00Var.f25088h0;
        ix ixVar = d00Var.f25108o0;
        int i12 = d00Var.f25072c1;
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
                    ixVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            ixVar.e(true);
        }
        this.f26976n = (TLRPC.User) userOrChat;
        final String j3 = com.google.android.gms.internal.vision.e2.j("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final hz hzVar = hz.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        hz.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f26980x.clear();
            this.f26981y.clear();
            if (fxVar.getAdapter() != this) {
                fxVar.setAdapter(this);
            }
            l();
            d00Var.f25091i0.h1(0, 0);
            d00Var.F(2);
        }
        if (z12 && hashMap.containsKey(j3)) {
            E(str, str2, z10, z11, true, j3, (TLObject) hashMap.get(j3));
        } else if (d00Var.f25097k0.f27950a.contains(j3)) {
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
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f26976n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i10 = this.h;
            d00 d00Var = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(d00Var.f25072c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            jz jzVar = this.f26974e;
            if (jzVar != null) {
                jzVar.a(false);
            }
            jt jtVar = this.E;
            if (jtVar != null) {
                AndroidUtilities.cancelRunOnUIThread(jtVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f26979w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                ky kyVar = d00Var.f25111p0;
                fx fxVar = d00Var.f25088h0;
                int currentPosition = kyVar.getCurrentPosition();
                if (currentPosition != d00Var.f25118r0 && currentPosition != d00Var.f25122s0) {
                    H(MessagesController.getInstance(d00Var.f25072c1).gifSearchEmojies.get(currentPosition - d00Var.f25125t0));
                    return;
                }
                s4.i0 adapter = fxVar.getAdapter();
                hz hzVar = d00Var.f25105n0;
                if (adapter != hzVar) {
                    fxVar.setAdapter(hzVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f26979w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                jt jtVar2 = new jt(10, this, str);
                this.E = jtVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(jtVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f26979w, str)) {
            this.L.f25091i0.h1(0, 0);
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
        ArrayList arrayList = this.f26980x;
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
        if (!z10 && this.f26980x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f26975f) != 0) {
            d00 d00Var = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = d00Var.f25092i1.size();
            } else {
                fx fxVar = d00Var.f25088h0;
                iz izVar = d00Var.f25091i0;
                if (fxVar.getMeasuredWidth() != 0) {
                    int measuredWidth = d00Var.f25088h0.getMeasuredWidth();
                    int i11 = izVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = d00Var.f25092i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) d00Var.f25092i1.get(i15);
                        sw0 C1 = g00.C1(izVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f30699a / C1.f30700b) * dp) / measuredWidth) * i11));
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
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47901f != 0) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) d1Var.f47897a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            f2Var.e((TLRPC.BotInlineResult) this.f26980x.get(i10 - i11), this.f26976n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f25092i1.get(i10);
        f2Var.getClass();
        f2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        if (i10 != 0) {
            d00 d00Var = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams q0Var = new s4.q0(-1, -2);
                    View view = this.f26974e;
                    view.setLayoutParams(q0Var);
                    o8Var = view;
                } else {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f26973c, false, false, d00Var.Z1, d00Var.f25093i2);
                    o8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.q0 q0Var2 = new s4.q0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    o8Var2.setLayoutParams(q0Var2);
                    o8Var = o8Var2;
                }
            } else {
                View view2 = new View(d00Var.getContext());
                view2.setLayoutParams(new s4.q0(-1, d00Var.f25068b1));
                o8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(this.f26973c);
            f2Var.setIsKeyboard(true);
            f2Var.setCanPreviewGif(true);
            o8Var = f2Var;
        }
        return new s4.d1(o8Var);
    }
}
