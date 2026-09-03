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
public final class qy extends rl0 {
    public eo B;
    public boolean C;
    public int D;
    public int E;
    public boolean H;
    public final mz I;
    public final Context f30549c;
    public final boolean d;
    public final sy f30550e;
    public final int f30551f;
    public int h;
    public TLRPC.User f30552n;
    public String f30553r;
    public boolean f30554s;
    public boolean v;
    public String f30555w;
    public final ArrayList f30556x = new ArrayList();
    public final HashMap f30557y = new HashMap();
    public int F = -1;
    public int G = -1;

    public qy(mz mzVar, Context context, boolean z4, int i10) {
        sy syVar;
        this.I = mzVar;
        this.f30549c = context;
        this.d = z4;
        this.f30551f = i10;
        if (z4) {
            syVar = null;
        } else {
            syVar = new sy(mzVar, context);
        }
        this.f30550e = syVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    public final void E(String str, String str2, boolean z4, boolean z10, boolean z11, String str3, TLObject tLObject) {
        boolean z12;
        if (str != null && str.equals(this.f30555w)) {
            this.h = 0;
            if (z11 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                F(str, str2, z4, z10, false);
                return;
            }
            HashMap hashMap = this.f30557y;
            boolean z13 = this.d;
            ArrayList arrayList = this.f30556x;
            mz mzVar = this.I;
            if (!z13 && TextUtils.isEmpty(str2)) {
                arrayList.clear();
                hashMap.clear();
                mzVar.f29302l0.e(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = arrayList.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                HashMap hashMap2 = mzVar.f29293i0;
                qy qyVar = mzVar.f29299k0;
                if (!hashMap2.containsKey(str3)) {
                    mzVar.f29293i0.put(str3, messages_botresults);
                }
                if (!z11 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(mzVar.Z0).saveBotCache(str3, messages_botresults);
                }
                this.f30553r = messages_botresults.next_offset;
                int i10 = 0;
                for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                    if (!hashMap.containsKey(botInlineResult.f20843id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        arrayList.add(botInlineResult);
                        hashMap.put(botInlineResult.f20843id, botInlineResult);
                        i10++;
                    }
                }
                if (size != arrayList.size() && !TextUtils.isEmpty(this.f30553r)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.f30554s = z12;
                if (i10 != 0) {
                    if (z10 && size == 0) {
                        l();
                    } else {
                        I();
                        if (z13) {
                            if (size != 0) {
                                int i12 = this.E;
                                qyVar.getClass();
                                m(i12 + size);
                                int i13 = this.E;
                                qyVar.getClass();
                                s(i13 + size + 1, i10);
                            } else {
                                int i14 = this.E;
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
            if (!z13) {
                if (mzVar.f29280e0.getAdapter() != this) {
                    mzVar.f29280e0.setAdapter(this);
                }
                if (z10 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    mzVar.f29284f0.h1(0, 0);
                    mzVar.G(2);
                }
            }
        }
    }

    public final void F(final String str, final String str2, final boolean z4, final boolean z10, final boolean z11) {
        int i10 = this.h;
        mz mzVar = this.I;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(mzVar.Z0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.f30555w = str;
        this.v = z10;
        sy syVar = this.f30550e;
        if (syVar != null) {
            syVar.a(z10);
        }
        int i11 = mzVar.Z0;
        HashMap hashMap = mzVar.f29293i0;
        lw lwVar = mzVar.f29280e0;
        ow owVar = mzVar.f29302l0;
        int i12 = mzVar.Z0;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z12 = userOrChat instanceof TLRPC.User;
        boolean z13 = this.d;
        if (!z12) {
            if (z4) {
                if (!this.C) {
                    this.C = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new y1(this, 5));
                }
                if (!z13) {
                    owVar.e(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!z13 && TextUtils.isEmpty(str2)) {
            owVar.e(true);
        }
        this.f30552n = (TLRPC.User) userOrChat;
        final String k10 = e2.c.k("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final qy qyVar = qy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z14 = z4;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final String str5 = k10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        qy.this.E(str3, str4, z14, z15, z16, str5, tLObject);
                    }
                });
            }
        };
        if (!z11 && !z13 && z10 && TextUtils.isEmpty(str2)) {
            this.f30556x.clear();
            this.f30557y.clear();
            if (lwVar.getAdapter() != this) {
                lwVar.setAdapter(this);
            }
            l();
            mzVar.f29284f0.h1(0, 0);
            mzVar.G(2);
        }
        if (z11 && hashMap.containsKey(k10)) {
            E(str, str2, z4, z10, true, k10, (TLObject) hashMap.get(k10));
        } else if (mzVar.f29290h0.f31439a.contains(k10)) {
        } else {
            if (z11) {
                this.h = -1;
                MessagesStorage.getInstance(i12).getBotCache(k10, requestDelegate);
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.f30552n);
            tL_messages_getInlineBotResults.offset = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
        }
    }

    public final void G(String str, boolean z4) {
        long j10;
        if (!this.d) {
            int i10 = this.h;
            mz mzVar = this.I;
            if (i10 != 0) {
                if (i10 >= 0) {
                    ConnectionsManager.getInstance(mzVar.Z0).cancelRequest(this.h, true);
                }
                this.h = 0;
            }
            this.v = false;
            sy syVar = this.f30550e;
            if (syVar != null) {
                syVar.a(false);
            }
            eo eoVar = this.B;
            if (eoVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eoVar);
            }
            if (TextUtils.isEmpty(str)) {
                this.f30555w = null;
                if (this.H) {
                    F("", "", true, true, true);
                    return;
                }
                rx rxVar = mzVar.m0;
                lw lwVar = mzVar.f29280e0;
                int currentPosition = rxVar.getCurrentPosition();
                if (currentPosition != mzVar.f29310o0 && currentPosition != mzVar.f29313p0) {
                    H(MessagesController.getInstance(mzVar.Z0).gifSearchEmojies.get(currentPosition - mzVar.f29316q0));
                    return;
                }
                f2.p0 adapter = lwVar.getAdapter();
                qy qyVar = mzVar.f29299k0;
                if (adapter != qyVar) {
                    lwVar.setAdapter(qyVar);
                    return;
                }
                return;
            }
            String lowerCase = str.toLowerCase();
            this.f30555w = lowerCase;
            if (!TextUtils.isEmpty(lowerCase)) {
                eo eoVar2 = new eo(16, this, str);
                this.B = eoVar2;
                if (z4) {
                    j10 = 300;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(eoVar2, j10);
            }
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.f30555w, str)) {
            this.I.f29284f0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.F = -1;
        this.G = -1;
        this.D = 0;
        boolean z4 = this.d;
        if (z4) {
            this.D = this.E;
        }
        ArrayList arrayList = this.f30556x;
        if (!arrayList.isEmpty()) {
            if (z4 && this.E > 0) {
                int i10 = this.D;
                this.D = i10 + 1;
                this.F = i10;
            }
            int i11 = this.D;
            this.G = i11;
            this.D = arrayList.size() + i11;
        } else if (!z4) {
            this.D++;
        }
    }

    @Override
    public final int h() {
        return this.D;
    }

    @Override
    public final int j(int i10) {
        boolean z4 = this.d;
        if (z4 && i10 == this.F) {
            return 2;
        }
        if (!z4 && this.f30556x.isEmpty()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f30551f) != 0) {
            mz mzVar = this.I;
            if (i10 == Integer.MAX_VALUE) {
                this.E = mzVar.f29285f1.size();
            } else {
                lw lwVar = mzVar.f29280e0;
                ry ryVar = mzVar.f29284f0;
                if (lwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = mzVar.f29280e0.getMeasuredWidth();
                    int i11 = ryVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.E = 0;
                    int size = mzVar.f29285f1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) mzVar.f29285f1.get(i15);
                        jv0 C1 = pz.C1(ryVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.f28201a / C1.f28202b) * dp) / measuredWidth) * i11));
                        if (i12 < min) {
                            this.E += i13;
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
                        this.E += i13;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f5879f != 0) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) m1Var.f5875a;
        int i11 = this.G;
        if (i11 >= 0 && i10 >= i11) {
            e2Var.e((TLRPC.BotInlineResult) this.f30556x.get(i10 - i11), this.f30552n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.I.f29285f1.get(i10);
        e2Var.getClass();
        e2Var.d(0, document, "gif" + document);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        if (i10 != 0) {
            mz mzVar = this.I;
            if (i10 != 1) {
                if (i10 != 2) {
                    ViewGroup.LayoutParams x0Var = new f2.x0(-1, -2);
                    View view = this.f30550e;
                    view.setLayoutParams(x0Var);
                    m8Var = view;
                } else {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(this.f30549c, false, false, mzVar.W1, mzVar.f29286f2);
                    m8Var2.b(0, LocaleController.getString(R.string.FeaturedGifs));
                    f2.x0 x0Var2 = new f2.x0(-1, -2);
                    ((ViewGroup.MarginLayoutParams) x0Var2).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                    m8Var2.setLayoutParams(x0Var2);
                    m8Var = m8Var2;
                }
            } else {
                View view2 = new View(mzVar.getContext());
                view2.setLayoutParams(new f2.x0(-1, mzVar.Y0));
                m8Var = view2;
            }
        } else {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(this.f30549c);
            e2Var.setIsKeyboard(true);
            e2Var.setCanPreviewGif(true);
            m8Var = e2Var;
        }
        return new f2.m1(m8Var);
    }
}
