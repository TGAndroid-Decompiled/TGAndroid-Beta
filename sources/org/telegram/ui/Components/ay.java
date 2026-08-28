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
public final class ay extends vk0 {
    public zq A;
    public boolean B;
    public int C;
    public int D;
    public boolean G;
    public final wy H;
    public final Context f26917c;
    public final boolean d;
    public final dy f26918e;
    public final int f26919f;
    public int h;
    public TLRPC.User f26920n;
    public String f26921r;
    public boolean f26922s;
    public boolean v;
    public String f26923w;
    public final ArrayList f26924x = new ArrayList();
    public final HashMap f26925y = new HashMap();
    public int E = -1;
    public int F = -1;

    public ay(wy wyVar, Context context, boolean z10, int i9) {
        dy dyVar;
        this.H = wyVar;
        this.f26917c = context;
        this.d = z10;
        this.f26919f = i9;
        if (z10) {
            dyVar = null;
        } else {
            dyVar = new dy(wyVar, context);
        }
        this.f26918e = dyVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f26923w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f26925y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f26924x;
            wy wyVar = this.H;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                wyVar.f34417k0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = wyVar.f34408h0;
                ay ayVar = wyVar.f34414j0;
                if (!hashMap2.containsKey(str3)) {
                    wyVar.f34408h0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(wyVar.Y0).saveBotCache(str3, messages_botresults);
                }
                this.f26921r = messages_botresults.next_offset;
                int i9 = 0;
                for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                    if (!hashMap.containsKey(botInlineResult.f22378id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f22378id, botInlineResult);
                        i9++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f26921r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f26922s = z13;
                if (i9 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i11 = this.D;
                                ayVar.getClass();
                                m(i11 + size);
                                int i12 = this.D;
                                ayVar.getClass();
                                s(i12 + size + 1, i9);
                            } else {
                                int i13 = this.D;
                                ayVar.getClass();
                                s(i13, i9 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            ayVar.getClass();
                            s(size, i9);
                        }
                    }
                } else if (arrayList.isEmpty()) {
                    l();
                }
            } else {
                l();
            }
            if (!z14) {
                if (wyVar.f34394d0.getAdapter() != this) {
                    wyVar.f34394d0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    wyVar.f34398e0.h1(0, 0);
                    wyVar.G(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i9 = this.h;
        wy wyVar = this.H;
        if (i9 != 0) {
            if (i9 >= 0) {
                ConnectionsManager.getInstance(wyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f26923w = str;
        this.v = z11;
        dy dyVar = this.f26918e;
        if (dyVar != null) {
            dyVar.a(z11);
        }
        int i10 = wyVar.Y0;
        HashMap hashMap = wyVar.f34408h0;
        zv zvVar = wyVar.f34394d0;
        cw cwVar = wyVar.f34417k0;
        int i11 = wyVar.Y0;
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(MessagesController.getInstance(i11).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.B) {
                    this.B = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i11).gifSearchBot;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new w1(this, 5));
                }
                if (!z14) {
                    cwVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            cwVar.e(true);
        }
        this.f26920n = (TLRPC.User) userOrChat;
        final String o6 = j3.r0.o("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ay ayVar = ay.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = o6;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ay.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f26924x.clear();
            this.f26925y.clear();
            if (zvVar.getAdapter() != this) {
                zvVar.setAdapter(this);
            }
            l();
            wyVar.f34398e0.h1(0, 0);
            wyVar.G(2);
        }
        if (z12 && hashMap.containsKey(o6)) {
            E(str, str2, z10, z11, true, o6, (TLObject) hashMap.get(o6));
        } else if (wyVar.f34405g0.f28216a.contains(o6)) {
        } else {
            if (z12) {
                this.h = -1;
                MessagesStorage.getInstance(i11).getBotCache(o6, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i11).getInputUser(this.f26920n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j10;
        if (!this.d) {
            int i9 = this.h;
            wy wyVar = this.H;
            if (i9 != 0) {
                if (i9 >= 0) {
                    ConnectionsManager.getInstance(wyVar.Y0).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            dy dyVar = this.f26918e;
            if (dyVar != null) {
                dyVar.a(false);
            }
            zq zqVar = this.A;
            if (zqVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zqVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f26923w = null;
                if (this.G) {
                    F("", "", true, true, true);
                    return;
                }
                dx dxVar = wyVar.f34420l0;
                zv zvVar = wyVar.f34394d0;
                int currentPosition = dxVar.getCurrentPosition();
                if (currentPosition != wyVar.f34425n0 && currentPosition != wyVar.f34428o0) {
                    H(MessagesController.getInstance(wyVar.Y0).gifSearchEmojies.get(currentPosition - wyVar.f34431p0));
                    return;
                }
                f2.r0 adapter = zvVar.getAdapter();
                ay ayVar = wyVar.f34414j0;
                if (adapter != ayVar) {
                    zvVar.setAdapter(ayVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f26923w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                zq zqVar2 = new zq(12, this, str);
                this.A = zqVar2;
                if (z10) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(zqVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f26923w, str)) {
            this.H.f34398e0.h1(0, 0);
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
        ArrayList arrayList = this.f26924x;
        if (!arrayList.isEmpty()) {
            if (z10 && this.D > 0) {
                int i9 = this.C;
                this.C = i9 + 1;
                this.E = i9;
            }
            int i10 = this.C;
            this.F = i10;
            this.C = arrayList.size() + i10;
        } else if (!z10) {
            this.C++;
        }
    }

    @Override
    public final int h() {
        return this.C;
    }

    @Override
    public final int j(int i9) {
        boolean z10 = this.d;
        if (z10 && i9 == this.E) {
            return 2;
        }
        if (!z10 && this.f26924x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i9;
        if (this.d && (i9 = this.f26919f) != 0) {
            wy wyVar = this.H;
            if (i9 == Integer.MAX_VALUE) {
                this.D = wyVar.f34399e1.size();
            } else {
                zv zvVar = wyVar.f34394d0;
                cy cyVar = wyVar.f34398e0;
                if (zvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = wyVar.f34394d0.getMeasuredWidth();
                    int i10 = cyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.D = 0;
                    int size = wyVar.f34399e1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) wyVar.f34399e1.get(i14);
                        qu0 C1 = zy.C1(cyVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.f32026a / C1.f32027b) * dp) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.D += i12;
                            i13++;
                            if (i13 == i9) {
                                break;
                            }
                            i11 = i10;
                            i12 = 0;
                        }
                        i12++;
                        i11 -= min;
                    }
                    if (i13 < i9) {
                        this.D += i12;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f5505f != 0) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) q1Var.f5501a;
        int i10 = this.F;
        if (i10 >= 0 && i9 >= i10) {
            e2Var.e((TLRPC.BotInlineResult) this.f26924x.get(i9 - i10), this.f26920n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.H.f34399e1.get(i9);
        e2Var.getClass();
        e2Var.d(0, document, "gif" + document);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.m8 m8Var;
        if (i9 != 0) {
            wy wyVar = this.H;
            if (i9 != 1) {
                if (i9 != 2) {
                    ViewGroup.LayoutParams a1Var = new f2.a1(-1, -2);
                    View view = this.f26918e;
                    view.setLayoutParams(a1Var);
                    m8Var = view;
                } else {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(this.f26917c, false, false, wyVar.V1, wyVar.f34400e2);
                    m8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    f2.a1 a1Var2 = new f2.a1(-1, -2);
                    ((ViewGroup.MarginLayoutParams) a1Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    m8Var2.setLayoutParams(a1Var2);
                    m8Var = m8Var2;
                }
            } else {
                View view2 = new View(wyVar.getContext());
                view2.setLayoutParams(new f2.a1(-1, wyVar.X0));
                m8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(this.f26917c);
            e2Var.setIsKeyboard(true);
            e2Var.setCanPreviewGif(true);
            m8Var = e2Var;
        }
        return new f2.q1(m8Var);
    }
}
