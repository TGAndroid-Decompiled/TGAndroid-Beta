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
public final class qy extends vl0 {
    public vw E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final lz L;
    public final Context f27785c;
    public final boolean d;
    public final sy e;
    public final int f27786f;
    public int h;
    public TLRPC.User f27787n;
    public String f27788r;
    public boolean f27789s;
    public boolean v;
    public String f27790w;
    public final ArrayList f27791x = new ArrayList();
    public final HashMap f27792y = new HashMap();
    public int I = -1;
    public int J = -1;

    public qy(lz lzVar, Context context, boolean z10, int i10) {
        sy syVar;
        this.L = lzVar;
        this.f27785c = context;
        this.d = z10;
        this.f27786f = i10;
        if (z10) {
            syVar = null;
        } else {
            syVar = new sy(lzVar, context);
        }
        this.e = syVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f27790w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f27792y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f27791x;
            lz lzVar = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                lzVar.f26272o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = lzVar.f26264l0;
                qy qyVar = lzVar.f26269n0;
                if (!hashMap2.containsKey(str3)) {
                    lzVar.f26264l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(lzVar.f26237c1).saveBotCache(str3, messages_botresults);
                }
                this.f27788r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f18334id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f18334id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f27788r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f27789s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                qyVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                qyVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                qyVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            qyVar.getClass();
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
                if (lzVar.f26252h0.getAdapter() != this) {
                    lzVar.f26252h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    lzVar.f26255i0.h1(0, 0);
                    lzVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        lz lzVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(lzVar.f26237c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f27790w = str;
        this.v = z11;
        sy syVar = this.e;
        if (syVar != null) {
            syVar.a(z11);
        }
        int i11 = lzVar.f26237c1;
        HashMap hashMap = lzVar.f26264l0;
        nw nwVar = lzVar.f26252h0;
        qw qwVar = lzVar.f26272o0;
        int i12 = lzVar.f26237c1;
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
                    qwVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            qwVar.e(true);
        }
        this.f27787n = (TLRPC.User) userOrChat;
        final String j3 = com.google.android.gms.internal.vision.e2.j("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final qy qyVar = qy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        qy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f27791x.clear();
            this.f27792y.clear();
            if (nwVar.getAdapter() != this) {
                nwVar.setAdapter(this);
            }
            l();
            lzVar.f26255i0.h1(0, 0);
            lzVar.F(2);
        }
        if (z12 && hashMap.containsKey(j3)) {
            E(str, str2, z10, z11, true, j3, (TLObject) hashMap.get(j3));
        } else if (lzVar.f26261k0.f28646a.contains(j3)) {
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
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f27787n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i10 = this.h;
            lz lzVar = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(lzVar.f26237c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            sy syVar = this.e;
            if (syVar != null) {
                syVar.a(false);
            }
            vw vwVar = this.E;
            if (vwVar != null) {
                AndroidUtilities.cancelRunOnUIThread(vwVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f27790w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                sx sxVar = lzVar.f26275p0;
                nw nwVar = lzVar.f26252h0;
                int currentPosition = sxVar.getCurrentPosition();
                if (currentPosition != lzVar.f26282r0 && currentPosition != lzVar.f26286s0) {
                    H(MessagesController.getInstance(lzVar.f26237c1).gifSearchEmojies.get(currentPosition - lzVar.f26289t0));
                    return;
                }
                s4.h0 adapter = nwVar.getAdapter();
                qy qyVar = lzVar.f26269n0;
                if (adapter != qyVar) {
                    nwVar.setAdapter(qyVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f27790w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                vw vwVar2 = new vw(5, this, str);
                this.E = vwVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(vwVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f27790w, str)) {
            this.L.f26255i0.h1(0, 0);
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
        ArrayList arrayList = this.f27791x;
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
        if (!z10 && this.f27791x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f27786f) != 0) {
            lz lzVar = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = lzVar.f26256i1.size();
            } else {
                nw nwVar = lzVar.f26252h0;
                ry ryVar = lzVar.f26255i0;
                if (nwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = lzVar.f26252h0.getMeasuredWidth();
                    int i11 = ryVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = lzVar.f26256i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) lzVar.f26256i1.get(i15);
                        uv0 C1 = oz.C1(ryVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f28933a / C1.f28934b) * dp) / measuredWidth) * i11));
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
        if (c1Var.f42964f != 0) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) c1Var.f42961a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            f2Var.e((TLRPC.BotInlineResult) this.f27791x.get(i10 - i11), this.f27787n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f26256i1.get(i10);
        f2Var.getClass();
        f2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        if (i10 != 0) {
            lz lzVar = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams p0Var = new s4.p0(-1, -2);
                    View view = this.e;
                    view.setLayoutParams(p0Var);
                    o8Var = view;
                } else {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f27785c, false, false, lzVar.Z1, lzVar.f26257i2);
                    o8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.p0 p0Var2 = new s4.p0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    o8Var2.setLayoutParams(p0Var2);
                    o8Var = o8Var2;
                }
            } else {
                View view2 = new View(lzVar.getContext());
                view2.setLayoutParams(new s4.p0(-1, lzVar.f26233b1));
                o8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(this.f27785c);
            f2Var.setIsKeyboard(true);
            f2Var.setCanPreviewGif(true);
            o8Var = f2Var;
        }
        return new s4.c1(o8Var);
    }
}
