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
public final class fz extends qm0 {
    public bs E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final b00 L;
    public final Context f26585c;
    public final boolean d;
    public final hz f26586e;
    public final int f26587f;
    public int h;
    public TLRPC.User f26588n;
    public String f26589r;
    public boolean f26590s;
    public boolean v;
    public String f26591w;
    public final ArrayList f26592x = new ArrayList();
    public final HashMap f26593y = new HashMap();
    public int I = -1;
    public int J = -1;

    public fz(b00 b00Var, Context context, boolean z10, int i10) {
        hz hzVar;
        this.L = b00Var;
        this.f26585c = context;
        this.d = z10;
        this.f26587f = i10;
        if (z10) {
            hzVar = null;
        } else {
            hzVar = new hz(b00Var, context);
        }
        this.f26586e = hzVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f26591w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f26593y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f26592x;
            b00 b00Var = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                b00Var.f24767o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = b00Var.f24759l0;
                fz fzVar = b00Var.f24764n0;
                if (!hashMap2.containsKey(str3)) {
                    b00Var.f24759l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(b00Var.f24731c1).saveBotCache(str3, messages_botresults);
                }
                this.f26589r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f20066id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f20066id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f26589r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f26590s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                fzVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                fzVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                fzVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            fzVar.getClass();
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
                if (b00Var.f24747h0.getAdapter() != this) {
                    b00Var.f24747h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    b00Var.f24750i0.h1(0, 0);
                    b00Var.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        b00 b00Var = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(b00Var.f24731c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f26591w = str;
        this.v = z11;
        hz hzVar = this.f26586e;
        if (hzVar != null) {
            hzVar.a(z11);
        }
        int i11 = b00Var.f24731c1;
        HashMap hashMap = b00Var.f24759l0;
        dx dxVar = b00Var.f24747h0;
        gx gxVar = b00Var.f24767o0;
        int i12 = b00Var.f24731c1;
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
                    gxVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            gxVar.e(true);
        }
        this.f26588n = (TLRPC.User) userOrChat;
        final String j3 = com.google.android.gms.internal.vision.e2.j("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final fz fzVar = fz.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        fz.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f26592x.clear();
            this.f26593y.clear();
            if (dxVar.getAdapter() != this) {
                dxVar.setAdapter(this);
            }
            l();
            b00Var.f24750i0.h1(0, 0);
            b00Var.F(2);
        }
        if (z12 && hashMap.containsKey(j3)) {
            E(str, str2, z10, z11, true, j3, (TLObject) hashMap.get(j3));
        } else if (b00Var.f24756k0.f27531a.contains(j3)) {
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
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f26588n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i10 = this.h;
            b00 b00Var = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(b00Var.f24731c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            hz hzVar = this.f26586e;
            if (hzVar != null) {
                hzVar.a(false);
            }
            bs bsVar = this.E;
            if (bsVar != null) {
                AndroidUtilities.cancelRunOnUIThread(bsVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f26591w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                iy iyVar = b00Var.f24770p0;
                dx dxVar = b00Var.f24747h0;
                int currentPosition = iyVar.getCurrentPosition();
                if (currentPosition != b00Var.f24777r0 && currentPosition != b00Var.f24781s0) {
                    H(MessagesController.getInstance(b00Var.f24731c1).gifSearchEmojies.get(currentPosition - b00Var.f24784t0));
                    return;
                }
                s4.i0 adapter = dxVar.getAdapter();
                fz fzVar = b00Var.f24764n0;
                if (adapter != fzVar) {
                    dxVar.setAdapter(fzVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f26591w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                bs bsVar2 = new bs(11, this, str);
                this.E = bsVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(bsVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f26591w, str)) {
            this.L.f24750i0.h1(0, 0);
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
        ArrayList arrayList = this.f26592x;
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
        if (!z10 && this.f26592x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f26587f) != 0) {
            b00 b00Var = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = b00Var.f24751i1.size();
            } else {
                dx dxVar = b00Var.f24747h0;
                gz gzVar = b00Var.f24750i0;
                if (dxVar.getMeasuredWidth() != 0) {
                    int measuredWidth = b00Var.f24747h0.getMeasuredWidth();
                    int i11 = gzVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = b00Var.f24751i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) b00Var.f24751i1.get(i15);
                        nw0 C1 = e00.C1(gzVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f29302a / C1.f29303b) * dp) / measuredWidth) * i11));
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
        if (d1Var.f47786f != 0) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) d1Var.f47782a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            f2Var.e((TLRPC.BotInlineResult) this.f26592x.get(i10 - i11), this.f26588n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f24751i1.get(i10);
        f2Var.getClass();
        f2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        if (i10 != 0) {
            b00 b00Var = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams q0Var = new s4.q0(-1, -2);
                    View view = this.f26586e;
                    view.setLayoutParams(q0Var);
                    o8Var = view;
                } else {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f26585c, false, false, b00Var.Z1, b00Var.f24752i2);
                    o8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.q0 q0Var2 = new s4.q0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    o8Var2.setLayoutParams(q0Var2);
                    o8Var = o8Var2;
                }
            } else {
                View view2 = new View(b00Var.getContext());
                view2.setLayoutParams(new s4.q0(-1, b00Var.f24727b1));
                o8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(this.f26585c);
            f2Var.setIsKeyboard(true);
            f2Var.setCanPreviewGif(true);
            o8Var = f2Var;
        }
        return new s4.d1(o8Var);
    }
}
