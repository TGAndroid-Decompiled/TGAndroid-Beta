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
public final class xy extends lm0 {
    public so E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final sz L;
    public final Context f34848c;
    public final boolean d;
    public final zy e;
    public final int f34849f;
    public int h;
    public TLRPC.User f34850n;
    public String f34851r;
    public boolean f34852s;
    public boolean v;
    public String f34853w;
    public final ArrayList f34854x = new ArrayList();
    public final HashMap f34855y = new HashMap();
    public int I = -1;
    public int J = -1;

    public xy(sz szVar, Context context, boolean z10, int i10) {
        zy zyVar;
        this.L = szVar;
        this.f34848c = context;
        this.d = z10;
        this.f34849f = i10;
        if (z10) {
            zyVar = null;
        } else {
            zyVar = new zy(szVar, context);
        }
        this.e = zyVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        sz szVar = this.L;
        uw uwVar = szVar.f32734h0;
        HashMap hashMap = szVar.f32746l0;
        xy xyVar = szVar.f32751n0;
        if (str != null && str.equals(this.f34853w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap2 = this.f34855y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f34854x;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap2.clear();
                szVar.f32754o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(szVar.f32719c1).saveBotCache(str3, messages_botresults);
                }
                this.f34851r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap2.containsKey(botInlineResult.f22025id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap2.put(botInlineResult.f22025id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f34851r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f34852s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                xyVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                xyVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                xyVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            xyVar.getClass();
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
                if (uwVar.getAdapter() != this) {
                    uwVar.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    szVar.f32737i0.h1(0, 0);
                    szVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        sz szVar = this.L;
        HashMap hashMap = szVar.f32746l0;
        uw uwVar = szVar.f32734h0;
        ww wwVar = szVar.f32754o0;
        int i10 = szVar.f32719c1;
        int i11 = this.h;
        if (i11 != 0) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f34853w = str;
        this.v = z11;
        zy zyVar = this.e;
        if (zyVar != null) {
            zyVar.a(z11);
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(MessagesController.getInstance(i10).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i10).gifSearchBot;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new b2(this, 5));
                }
                if (!z14) {
                    wwVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            wwVar.e(true);
        }
        this.f34850n = (TLRPC.User) userOrChat;
        final String m10 = c3.h0.m("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final xy xyVar = xy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = m10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        xy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f34854x.clear();
            this.f34855y.clear();
            if (uwVar.getAdapter() != this) {
                uwVar.setAdapter(this);
            }
            l();
            szVar.f32737i0.h1(0, 0);
            szVar.F(2);
        }
        if (z12 && hashMap.containsKey(m10)) {
            E(str, str2, z10, z11, true, m10, (TLObject) hashMap.get(m10));
        } else if (szVar.f32743k0.f26710a.contains(m10)) {
        } else {
            if (z12) {
                this.h = -1;
                MessagesStorage.getInstance(i10).getBotCache(m10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f34850n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j10;
        sz szVar = this.L;
        uw uwVar = szVar.f32734h0;
        int i10 = szVar.f32719c1;
        if (!this.d) {
            int i11 = this.h;
            if (i11 != 0) {
                if (i11 >= 0) {
                    ConnectionsManager.getInstance(i10).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            zy zyVar = this.e;
            if (zyVar != null) {
                zyVar.a(false);
            }
            so soVar = this.E;
            if (soVar != null) {
                AndroidUtilities.cancelRunOnUIThread(soVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f34853w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                int currentPosition = szVar.f32757p0.getCurrentPosition();
                if (currentPosition != szVar.f32764r0 && currentPosition != szVar.f32768s0) {
                    H(MessagesController.getInstance(i10).gifSearchEmojies.get(currentPosition - szVar.f32771t0));
                    return;
                }
                s4.h0 adapter = uwVar.getAdapter();
                xy xyVar = szVar.f32751n0;
                if (adapter != xyVar) {
                    uwVar.setAdapter(xyVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f34853w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                so soVar2 = new so(17, this, str);
                this.E = soVar2;
                if (z10) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(soVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f34853w, str)) {
            this.L.f32737i0.h1(0, 0);
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
        ArrayList arrayList = this.f34854x;
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
        if (!z10 && this.f34854x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        sz szVar = this.L;
        uw uwVar = szVar.f32734h0;
        if (this.d && (i10 = this.f34849f) != 0) {
            if (i10 == Integer.MAX_VALUE) {
                this.H = szVar.f32738i1.size();
            } else {
                yy yyVar = szVar.f32737i0;
                if (uwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = uwVar.getMeasuredWidth();
                    int i11 = yyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = szVar.f32738i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) szVar.f32738i1.get(i15);
                        qw0 D1 = vz.D1(yyVar.G1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((D1.f32054a / D1.f32055b) * dp) / measuredWidth) * i11));
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
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f47741f != 0) {
            return;
        }
        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) e1Var.f47738a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            d2Var.e((TLRPC.BotInlineResult) this.f34854x.get(i10 - i11), this.f34850n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f32738i1.get(i10);
        d2Var.getClass();
        d2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        if (i10 != 0) {
            sz szVar = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams q0Var = new s4.q0(-1, -2);
                    View view = this.e;
                    view.setLayoutParams(q0Var);
                    s8Var = view;
                } else {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(this.f34848c, false, false, szVar.Z1, szVar.f32739i2);
                    s8Var2.a(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.q0 q0Var2 = new s4.q0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    s8Var2.setLayoutParams(q0Var2);
                    s8Var = s8Var2;
                }
            } else {
                View view2 = new View(szVar.getContext());
                view2.setLayoutParams(new s4.q0(-1, szVar.f32715b1));
                s8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f34848c);
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            s8Var = d2Var;
        }
        return new s4.e1(s8Var);
    }
}
