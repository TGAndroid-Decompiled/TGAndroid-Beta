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
public final class jy extends il0 {
    public gt A;
    public boolean B;
    public int C;
    public int D;
    public boolean G;
    public final fz H;
    public final Context f29845c;
    public final boolean d;
    public final ly f29846e;
    public final int f29847f;
    public int h;
    public TLRPC.User f29848n;
    public String f29849r;
    public boolean f29850s;
    public boolean v;
    public String f29851w;
    public final ArrayList f29852x = new ArrayList();
    public final HashMap f29853y = new HashMap();
    public int E = -1;
    public int F = -1;

    public jy(fz fzVar, Context context, boolean z10, int i10) {
        ly lyVar;
        this.H = fzVar;
        this.f29845c = context;
        this.d = z10;
        this.f29847f = i10;
        if (z10) {
            lyVar = null;
        } else {
            lyVar = new ly(fzVar, context);
        }
        this.f29846e = lyVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f29851w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f29853y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f29852x;
            fz fzVar = this.H;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                fzVar.f28608k0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = fzVar.f28599h0;
                jy jyVar = fzVar.f28605j0;
                if (!hashMap2.containsKey(str3)) {
                    fzVar.f28599h0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(fzVar.Y0).saveBotCache(str3, messages_botresults);
                }
                this.f29849r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f22390id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f22390id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f29849r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f29850s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.D;
                                jyVar.getClass();
                                m(i12 + size);
                                int i13 = this.D;
                                jyVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.D;
                                jyVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            jyVar.getClass();
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
                if (fzVar.f28585d0.getAdapter() != this) {
                    fzVar.f28585d0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    fzVar.f28589e0.h1(0, 0);
                    fzVar.G(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        fz fzVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(fzVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f29851w = str;
        this.v = z11;
        ly lyVar = this.f29846e;
        if (lyVar != null) {
            lyVar.a(z11);
        }
        int i11 = fzVar.Y0;
        HashMap hashMap = fzVar.f28599h0;
        fw fwVar = fzVar.f28585d0;
        iw iwVar = fzVar.f28608k0;
        int i12 = fzVar.Y0;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.B) {
                    this.B = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new a2(this, 5));
                }
                if (!z14) {
                    iwVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            iwVar.e(true);
        }
        this.f29848n = (TLRPC.User) userOrChat;
        final String n10 = j7.l1.n("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final jy jyVar = jy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = n10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        jy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f29852x.clear();
            this.f29853y.clear();
            if (fwVar.getAdapter() != this) {
                fwVar.setAdapter(this);
            }
            l();
            fzVar.f28589e0.h1(0, 0);
            fzVar.G(2);
        }
        if (z12 && hashMap.containsKey(n10)) {
            E(str, str2, z10, z11, true, n10, (TLObject) hashMap.get(n10));
        } else if (fzVar.f28596g0.f30779a.contains(n10)) {
        } else {
            if (z12) {
                this.h = -1;
                MessagesStorage.getInstance(i12).getBotCache(n10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f29848n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j10;
        if (!this.d) {
            int i10 = this.h;
            fz fzVar = this.H;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(fzVar.Y0).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            ly lyVar = this.f29846e;
            if (lyVar != null) {
                lyVar.a(false);
            }
            gt gtVar = this.A;
            if (gtVar != null) {
                AndroidUtilities.cancelRunOnUIThread(gtVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f29851w = null;
                if (this.G) {
                    F("", "", true, true, true);
                    return;
                }
                kx kxVar = fzVar.f28611l0;
                fw fwVar = fzVar.f28585d0;
                int currentPosition = kxVar.getCurrentPosition();
                if (currentPosition != fzVar.f28616n0 && currentPosition != fzVar.f28619o0) {
                    H(MessagesController.getInstance(fzVar.Y0).gifSearchEmojies.get(currentPosition - fzVar.f28622p0));
                    return;
                }
                f2.p0 adapter = fwVar.getAdapter();
                jy jyVar = fzVar.f28605j0;
                if (adapter != jyVar) {
                    fwVar.setAdapter(jyVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f29851w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                gt gtVar2 = new gt(9, this, str);
                this.A = gtVar2;
                if (z10) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(gtVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f29851w, str)) {
            this.H.f28589e0.h1(0, 0);
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
        ArrayList arrayList = this.f29852x;
        if (!arrayList.isEmpty()) {
            if (z10 && this.D > 0) {
                int i10 = this.C;
                this.C = i10 + 1;
                this.E = i10;
            }
            int i11 = this.C;
            this.F = i11;
            this.C = arrayList.size() + i11;
        } else if (!z10) {
            this.C++;
        }
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
        if (!z10 && this.f29852x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f29847f) != 0) {
            fz fzVar = this.H;
            if (i10 == Integer.MAX_VALUE) {
                this.D = fzVar.f28590e1.size();
            } else {
                fw fwVar = fzVar.f28585d0;
                ky kyVar = fzVar.f28589e0;
                if (fwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = fzVar.f28585d0.getMeasuredWidth();
                    int i11 = kyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.D = 0;
                    int size = fzVar.f28590e1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) fzVar.f28590e1.get(i15);
                        bv0 C1 = iz.C1(kyVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f27238a / C1.f27239b) * dp) / measuredWidth) * i11));
                        if (i12 < min) {
                            this.D += i13;
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
                        this.D += i13;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f6436f != 0) {
            return;
        }
        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) n1Var.f6432a;
        int i11 = this.F;
        if (i11 >= 0 && i10 >= i11) {
            d2Var.e((TLRPC.BotInlineResult) this.f29852x.get(i10 - i11), this.f29848n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.H.f28590e1.get(i10);
        d2Var.getClass();
        d2Var.d(0, document, "gif" + document);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k8 k8Var;
        if (i10 != 0) {
            fz fzVar = this.H;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams x0Var = new f2.x0(-1, -2);
                    View view = this.f29846e;
                    view.setLayoutParams(x0Var);
                    k8Var = view;
                } else {
                    org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(this.f29845c, false, false, fzVar.V1, fzVar.f28591e2);
                    k8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    f2.x0 x0Var2 = new f2.x0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) x0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    k8Var2.setLayoutParams(x0Var2);
                    k8Var = k8Var2;
                }
            } else {
                View view2 = new View(fzVar.getContext());
                view2.setLayoutParams(new f2.x0(-1, fzVar.X0));
                k8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f29845c);
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            k8Var = d2Var;
        }
        return new f2.n1(k8Var);
    }
}
