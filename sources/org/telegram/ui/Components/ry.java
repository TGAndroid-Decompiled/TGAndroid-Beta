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
public final class ry extends wl0 {
    public ww E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final mz L;
    public final Context f28080c;
    public final boolean d;
    public final ty e;
    public final int f28081f;
    public int h;
    public TLRPC.User f28082n;
    public String f28083r;
    public boolean f28084s;
    public boolean v;
    public String f28085w;
    public final ArrayList f28086x = new ArrayList();
    public final HashMap f28087y = new HashMap();
    public int I = -1;
    public int J = -1;

    public ry(mz mzVar, Context context, boolean z10, int i10) {
        ty tyVar;
        this.L = mzVar;
        this.f28080c = context;
        this.d = z10;
        this.f28081f = i10;
        if (z10) {
            tyVar = null;
        } else {
            tyVar = new ty(mzVar, context);
        }
        this.e = tyVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        boolean z13;
        if (str != null && str.equals(this.f28085w)) {
            this.h = 0;
            if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z10, z11, false);
                return;
            }
            HashMap hashMap = this.f28087y;
            boolean z14 = this.d;
            ArrayList arrayList = this.f28086x;
            mz mzVar = this.L;
            if (!z14 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                mzVar.f26583o0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = mzVar.f26575l0;
                ry ryVar = mzVar.f26580n0;
                if (!hashMap2.containsKey(str3)) {
                    mzVar.f26575l0.put(str3, messages_botresults);
                }
                if (!z12 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(mzVar.f26548c1).saveBotCache(str3, messages_botresults);
                }
                this.f28083r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f18333id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f18333id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f28083r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.f28084s = z13;
                if (i10 != 0) {
                    if (z11 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z14) {
                            if (size != 0) {
                                int i12 = this.H;
                                ryVar.getClass();
                                m(i12 + size);
                                int i13 = this.H;
                                ryVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.H;
                                ryVar.getClass();
                                s(i14, i10 + 1);
                            }
                        } else {
                            if (size != 0) {
                                m(size);
                            }
                            ryVar.getClass();
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
                if (mzVar.f26563h0.getAdapter() != this) {
                    mzVar.f26563h0.setAdapter(this);
                }
                if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    mzVar.f26566i0.h1(0, 0);
                    mzVar.F(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        mz mzVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(mzVar.f26548c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f28085w = str;
        this.v = z11;
        ty tyVar = this.e;
        if (tyVar != null) {
            tyVar.a(z11);
        }
        int i11 = mzVar.f26548c1;
        HashMap hashMap = mzVar.f26575l0;
        ow owVar = mzVar.f26563h0;
        rw rwVar = mzVar.f26583o0;
        int i12 = mzVar.f26548c1;
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
                    rwVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            rwVar.e(true);
        }
        this.f28082n = (TLRPC.User) userOrChat;
        final String j3 = com.google.android.gms.internal.vision.e2.j("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ry ryVar = ry.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ry.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.f28086x.clear();
            this.f28087y.clear();
            if (owVar.getAdapter() != this) {
                owVar.setAdapter(this);
            }
            l();
            mzVar.f26566i0.h1(0, 0);
            mzVar.F(2);
        }
        if (z12 && hashMap.containsKey(j3)) {
            E(str, str2, z10, z11, true, j3, (TLObject) hashMap.get(j3));
        } else if (mzVar.f26572k0.f28933a.contains(j3)) {
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
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f28082n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z10) {
        long j3;
        if (!this.d) {
            int i10 = this.h;
            mz mzVar = this.L;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(mzVar.f26548c1).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            ty tyVar = this.e;
            if (tyVar != null) {
                tyVar.a(false);
            }
            ww wwVar = this.E;
            if (wwVar != null) {
                AndroidUtilities.cancelRunOnUIThread(wwVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f28085w = null;
                if (this.K) {
                    F("", "", true, true, true);
                    return;
                }
                tx txVar = mzVar.f26586p0;
                ow owVar = mzVar.f26563h0;
                int currentPosition = txVar.getCurrentPosition();
                if (currentPosition != mzVar.f26593r0 && currentPosition != mzVar.f26597s0) {
                    H(MessagesController.getInstance(mzVar.f26548c1).gifSearchEmojies.get(currentPosition - mzVar.f26600t0));
                    return;
                }
                s4.h0 adapter = owVar.getAdapter();
                ry ryVar = mzVar.f26580n0;
                if (adapter != ryVar) {
                    owVar.setAdapter(ryVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f28085w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                ww wwVar2 = new ww(5, this, str);
                this.E = wwVar2;
                if (z10) {
                    j3 = 300;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(wwVar2, j3);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f28085w, str)) {
            this.L.f26566i0.h1(0, 0);
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
        ArrayList arrayList = this.f28086x;
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
        if (!z10 && this.f28086x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f28081f) != 0) {
            mz mzVar = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = mzVar.f26567i1.size();
            } else {
                ow owVar = mzVar.f26563h0;
                sy syVar = mzVar.f26566i0;
                if (owVar.getMeasuredWidth() != 0) {
                    int measuredWidth = mzVar.f26563h0.getMeasuredWidth();
                    int i11 = syVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = mzVar.f26567i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) mzVar.f26567i1.get(i15);
                        vv0 C1 = pz.C1(syVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f29774a / C1.f29775b) * dp) / measuredWidth) * i11));
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
        if (c1Var.f42962f != 0) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) c1Var.f42959a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            f2Var.e((TLRPC.BotInlineResult) this.f28086x.get(i10 - i11), this.f28082n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.f26567i1.get(i10);
        f2Var.getClass();
        f2Var.d(0, document, "gif" + document);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        if (i10 != 0) {
            mz mzVar = this.L;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams p0Var = new s4.p0(-1, -2);
                    View view = this.e;
                    view.setLayoutParams(p0Var);
                    o8Var = view;
                } else {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(this.f28080c, false, false, mzVar.Z1, mzVar.f26568i2);
                    o8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    s4.p0 p0Var2 = new s4.p0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    o8Var2.setLayoutParams(p0Var2);
                    o8Var = o8Var2;
                }
            } else {
                View view2 = new View(mzVar.getContext());
                view2.setLayoutParams(new s4.p0(-1, mzVar.f26544b1));
                o8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(this.f28080c);
            f2Var.setIsKeyboard(true);
            f2Var.setCanPreviewGif(true);
            o8Var = f2Var;
        }
        return new s4.c1(o8Var);
    }
}
