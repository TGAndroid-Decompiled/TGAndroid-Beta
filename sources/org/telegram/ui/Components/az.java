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
public final class az extends lm0 {
    public sk E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final wz L;
    public final Context f23639c;
    public final boolean d;
    public final cz e;
    public final int f23640f;
    public int h;
    public TLRPC.User f23641n;
    public String f23642r;
    public boolean f23643s;
    public boolean v;
    public String f23644w;
    public final ArrayList f23645x = new ArrayList();
    public final HashMap f23646y = new HashMap();
    public int I = -1;
    public int J = -1;

    public az(wz wzVar, Context context, boolean z10, int i10) {
        cz czVar;
        this.L = wzVar;
        this.f23639c = context;
        this.d = z10;
        this.f23640f = i10;
        if (z10) {
            czVar = null;
        } else {
            czVar = new cz(wzVar, context);
        }
        this.e = czVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f23644w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f23646y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f23645x;
            wz wzVar = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                wzVar.f31049o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = wzVar.f31041l0;
                az azVar = wzVar.f31046n0;
                if (!hashMap2.containsKey(str3)) {
                    wzVar.f31041l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(wzVar.f31014c1).saveBotCache(str3, messages_botresults);
                }
                this.f23642r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f19214id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f19214id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f23642r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f23643s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                azVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                azVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                azVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            azVar.getClass();
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
                if (wzVar.f31029h0.getAdapter() != this) {
                    wzVar.f31029h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    wzVar.f31032i0.h1(0, 0);
                    wzVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        wz wzVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(wzVar.f31014c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f23644w = str;
        this.v = z11;
        cz czVar = this.e;
        if (czVar != null) {
            czVar.a(z11);
        }
        int i11 = wzVar.f31014c1;
        HashMap hashMap = wzVar.f31041l0;
        yw ywVar = wzVar.f31029h0;
        bx bxVar = wzVar.f31049o0;
        int i12 = wzVar.f31014c1;
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
                    bxVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            bxVar.e(true);
        }
        this.f23641n = (TLRPC.User) userOrChat;
        final String k10 = com.google.android.gms.internal.play_billing.k3.k("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final az azVar = az.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = k10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        az.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f23645x.clear();
            this.f23646y.clear();
            if (ywVar.getAdapter() != this) {
                ywVar.setAdapter(this);
            }
            l();
            wzVar.f31032i0.h1(0, 0);
            wzVar.F(2);
        }
        if (z12 && hashMap.containsKey(k10)) {
            E(str, str2, z10, z11, true, k10, (TLObject) hashMap.get(k10));
        } else if (wzVar.f31038k0.f24508a.contains(k10)) {
        } else {
            if (z12) {
                this.h = -1;
                MessagesStorage.getInstance(i12).getBotCache(k10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f23641n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j10;
        if (!this.d) {
            int i10 = this.h;
            wz wzVar = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(wzVar.f31014c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            cz czVar = this.e;
            if (czVar != null) {
                czVar.a(false);
            }
            sk skVar = this.E;
            if (skVar != null) {
                AndroidUtilities.cancelRunOnUIThread(skVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f23644w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                dy dyVar = wzVar.f31052p0;
                yw ywVar = wzVar.f31029h0;
                int currentPosition = dyVar.getCurrentPosition();
                if (currentPosition != wzVar.f31059r0 && currentPosition != wzVar.f31063s0) {
                    H(MessagesController.getInstance(wzVar.f31014c1).gifSearchEmojies.get(currentPosition - wzVar.f31066t0));
                    return;
                }
                s4.g0 adapter = ywVar.getAdapter();
                az azVar = wzVar.f31046n0;
                if (adapter != azVar) {
                    ywVar.setAdapter(azVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f23644w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                sk skVar2 = new sk(23, this, str);
                this.E = skVar2;
                if (z10) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(skVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f23644w, str)) {
            this.L.f31032i0.h1(0, 0);
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
        ArrayList arrayList = this.f23645x;
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
        if (!z10 && this.f23645x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f23640f) != 0) {
            wz wzVar = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = wzVar.f31033i1.size();
            } else {
                yw ywVar = wzVar.f31029h0;
                bz bzVar = wzVar.f31032i0;
                if (ywVar.getMeasuredWidth() != 0) {
                    int measuredWidth = wzVar.f31029h0.getMeasuredWidth();
                    int i11 = bzVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = wzVar.f31033i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) wzVar.f31033i1.get(i15);
                        iw0 C1 = zz.C1(bzVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f26116a / C1.f26117b) * dp) / measuredWidth) * i11));
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
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f44841f != 0) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) b1Var.f44838a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            f2Var.e((TLRPC.BotInlineResult) this.f23645x.get(i10 - i11), this.f23641n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f31033i1.get(i10);
        f2Var.getClass();
        f2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        if (i10 != 0) {
            wz wzVar = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams o0Var = new s4.o0(-1, -2);
                    View view = this.e;
                    view.setLayoutParams(o0Var);
                    o8Var = view;
                } else {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f23639c, false, false, wzVar.Z1, wzVar.f31034i2);
                    o8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.o0 o0Var2 = new s4.o0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    o8Var2.setLayoutParams(o0Var2);
                    o8Var = o8Var2;
                }
            } else {
                View view2 = new View(wzVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, wzVar.f31010b1));
                o8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(this.f23639c);
            f2Var.setIsKeyboard(true);
            f2Var.setCanPreviewGif(true);
            o8Var = f2Var;
        }
        return new s4.b1(o8Var);
    }
}
