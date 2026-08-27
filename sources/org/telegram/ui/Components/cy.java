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

public final class cy extends yk0 {
    public xq A;
    public boolean B;
    public int C;
    public int D;
    public boolean G;
    public final yy H;

    public final Context f27562c;
    public final boolean d;

    public final ey f27563e;

    public final int f27564f;
    public int h;

    public TLRPC.User f27565n;

    public String f27566r;

    public boolean f27567s;
    public boolean v;

    public String f27568w;

    public final ArrayList f27569x = new ArrayList();

    public final HashMap f27570y = new HashMap();
    public int E = -1;
    public int F = -1;

    public cy(yy yyVar, Context context, boolean z10, int i10) {
        this.H = yyVar;
        this.f27562c = context;
        this.d = z10;
        this.f27564f = i10;
        this.f27563e = z10 ? null : new ey(yyVar, context);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        if (str == null || !str.equals(this.f27568w)) {
            return;
        }
        this.h = 0;
        if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            F(str, str2, z10, z11, false);
            return;
        }
        HashMap map = this.f27570y;
        boolean z13 = this.d;
        ArrayList arrayList = this.f27569x;
        yy yyVar = this.H;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            map.clear();
            yyVar.f35010k0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap map2 = yyVar.f35001h0;
            cy cyVar = yyVar.f35007j0;
            if (!map2.containsKey(str3)) {
                yyVar.f35001h0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(yyVar.Y0).saveBotCache(str3, messages_botresults);
            }
            this.f27566r = messages_botresults.next_offset;
            int i10 = 0;
            for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                if (!map.containsKey(botInlineResult.f22378id)) {
                    botInlineResult.query_id = messages_botresults.query_id;
                    arrayList.add(botInlineResult);
                    map.put(botInlineResult.f22378id, botInlineResult);
                    i10++;
                }
            }
            this.f27567s = size == arrayList.size() || TextUtils.isEmpty(this.f27566r);
            if (i10 != 0) {
                if (z11 && size == 0) {
                    l();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            m(size);
                        }
                        cyVar.getClass();
                        s(size, i10);
                    } else if (size != 0) {
                        int i12 = this.D;
                        cyVar.getClass();
                        m(i12 + size);
                        int i13 = this.D;
                        cyVar.getClass();
                        s(i13 + size + 1, i10);
                    } else {
                        int i14 = this.D;
                        cyVar.getClass();
                        s(i14, i10 + 1);
                    }
                }
            } else if (arrayList.isEmpty()) {
                l();
            }
        } else {
            l();
        }
        if (z13) {
            return;
        }
        if (yyVar.f34987d0.getAdapter() != this) {
            yyVar.f34987d0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            yyVar.f34991e0.h1(0, 0);
            yyVar.H(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        yy yyVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(yyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f27568w = str;
        this.v = z11;
        ey eyVar = this.f27563e;
        if (eyVar != null) {
            eyVar.a(z11);
        }
        int i11 = yyVar.Y0;
        HashMap map = yyVar.f35001h0;
        yv yvVar = yyVar.f34987d0;
        bw bwVar = yyVar.f35010k0;
        int i12 = yyVar.Y0;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.B) {
                    this.B = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new w1(this, 5));
                }
                if (z14) {
                    return;
                }
                bwVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            bwVar.e(true);
        }
        this.f27565n = (TLRPC.User) userOrChat;
        final String strN = i0.a.n("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final cy cyVar = this.f35396a;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = strN;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        cyVar.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f27569x.clear();
            this.f27570y.clear();
            if (yvVar.getAdapter() != this) {
                yvVar.setAdapter(this);
            }
            l();
            yyVar.f34991e0.h1(0, 0);
            yyVar.H(2);
        }
        if (z12 && map.containsKey(strN)) {
            E(str, str2, z10, z11, true, strN, (TLObject) map.get(strN));
            return;
        }
        if (yyVar.f34998g0.f28465a.contains(strN)) {
            return;
        }
        if (z12) {
            this.h = -1;
            MessagesStorage.getInstance(i12).getBotCache(strN, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f27565n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i10 = this.h;
        yy yyVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(yyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.v = false;
        ey eyVar = this.f27563e;
        if (eyVar != null) {
            eyVar.a(false);
        }
        xq xqVar = this.A;
        if (xqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xqVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.f27568w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            xq xqVar2 = new xq(12, this, str);
            this.A = xqVar2;
            AndroidUtilities.runOnUIThread(xqVar2, z10 ? 300L : 0L);
            return;
        }
        this.f27568w = null;
        if (this.G) {
            F("", "", true, true, true);
            return;
        }
        dx dxVar = yyVar.f35013l0;
        yv yvVar = yyVar.f34987d0;
        int currentPosition = dxVar.getCurrentPosition();
        if (currentPosition != yyVar.f35018n0 && currentPosition != yyVar.f35021o0) {
            H(MessagesController.getInstance(yyVar.Y0).gifSearchEmojies.get(currentPosition - yyVar.f35024p0));
            return;
        }
        f2.q0 adapter = yvVar.getAdapter();
        cy cyVar = yyVar.f35007j0;
        if (adapter != cyVar) {
            yvVar.setAdapter(cyVar);
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f27568w, str)) {
            this.H.f34991e0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.E = -1;
        this.F = -1;
        this.C = 0;
        boolean z10 = this.d;
        if (z10) {
            this.C = this.D;
        }
        ArrayList arrayList = this.f27569x;
        if (arrayList.isEmpty()) {
            if (z10) {
                return;
            }
            this.C++;
            return;
        }
        if (z10 && this.D > 0) {
            int i10 = this.C;
            this.C = i10 + 1;
            this.E = i10;
        }
        int i11 = this.C;
        this.F = i11;
        this.C = arrayList.size() + i11;
    }

    @Override
    public final int h() {
        return this.C;
    }

    @Override
    public final int j(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.E) {
            return 2;
        }
        return (z10 || !this.f27569x.isEmpty()) ? 0 : 3;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f27564f) != 0) {
            yy yyVar = this.H;
            if (i10 == Integer.MAX_VALUE) {
                this.D = yyVar.f34992e1.size();
            } else {
                yv yvVar = yyVar.f34987d0;
                dy dyVar = yyVar.f34991e0;
                if (yvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = yyVar.f34987d0.getMeasuredWidth();
                    int i11 = dyVar.J;
                    int iDp = AndroidUtilities.dp(100.0f);
                    this.D = 0;
                    int size = yyVar.f34992e1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) yyVar.f34992e1.get(i15);
                        tu0 tu0VarC1 = bz.C1(dyVar.F1(document, document.attributes));
                        int iMin = Math.min(i11, (int) Math.floor((((tu0VarC1.f32893a / tu0VarC1.f32894b) * iDp) / measuredWidth) * i11));
                        if (i12 < iMin) {
                            this.D += i13;
                            i14++;
                            if (i14 == i10) {
                                break;
                            }
                            i12 = i11;
                            i13 = 0;
                        }
                        i13++;
                        i12 -= iMin;
                    }
                    if (i14 < i10) {
                        this.D += i13;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f != 0) {
            return;
        }
        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) o1Var.f5789a;
        int i11 = this.F;
        if (i11 >= 0 && i10 >= i11) {
            d2Var.e((TLRPC.BotInlineResult) this.f27569x.get(i10 - i11), this.f27565n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.H.f34992e1.get(i10);
        d2Var.getClass();
        d2Var.d(0, document, "gif" + document);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            yy yyVar = this.H;
            if (i10 == 1) {
                View view2 = new View(yyVar.getContext());
                view2.setLayoutParams(new f2.y0(-1, yyVar.X0));
                view = view2;
            } else if (i10 != 2) {
                f2.y0 y0Var = new f2.y0(-1, -2);
                ey eyVar = this.f27563e;
                eyVar.setLayoutParams(y0Var);
                view = eyVar;
            } else {
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.f27562c, false, false, yyVar.V1, yyVar.f34993e2);
                j8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
                f2.y0 y0Var2 = new f2.y0(-1, -2);
                ((ViewGroup.MarginLayoutParams) y0Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                j8Var.setLayoutParams(y0Var2);
                view = j8Var;
            }
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f27562c);
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            view = d2Var;
        }
        return new lk0(view);
    }
}
