package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jd implements Runnable {
    public final int f36469a = 0;
    public final Object f36470b;
    public final boolean f36471c;
    public final int d;
    public final int f36472e;
    public final boolean f36473f;
    public final Long h;
    public final String f36474n;
    public final Object f36475r;
    public final Object f36476s;
    public final Object f36477w;

    public jd(ig igVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f36475r = igVar;
        this.f36470b = obj;
        this.f36476s = ffVar;
        this.f36471c = z10;
        this.d = i7;
        this.f36472e = i10;
        this.f36473f = z11;
        this.h = l10;
        this.f36474n = str;
        this.f36477w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        org.telegram.messenger.f20 f20Var;
        CharSequence charSequence;
        org.telegram.messenger.gj threadMessage3;
        String str;
        org.telegram.messenger.gj threadMessage4;
        String str2;
        switch (this.f36469a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f36475r, (TLRPC.Document) this.f36476s, this.f36474n, (org.telegram.messenger.cj) this.f36477w, this.f36471c, this.d, this.f36472e, this.f36470b, this.h, this.f36473f);
                return;
            default:
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.f36476s;
                ChatActivityEnterView chatActivityEnterView = ((ig) this.f36475r).f36246a;
                boolean z11 = chatActivityEnterView.f32692p4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.Q1(false, true, false, true);
                }
                ng ngVar = chatActivityEnterView.P3;
                org.telegram.messenger.cw cwVar = null;
                if (ngVar != null) {
                    storyItem = ngVar.c1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f36470b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f36471c;
                int i7 = this.d;
                int i10 = this.f36472e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f36474n;
                Object obj2 = this.f36477w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (ffVar != null) {
                        f20Var = ffVar.f28074s;
                    } else {
                        f20Var = null;
                    }
                    if (f20Var != null && ffVar != null) {
                        f20Var.f23844s = true;
                        boolean c10 = f20Var.c();
                        f20Var.f23844s = false;
                        f20Var.f23845t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f36473f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!ffVar.f28059b && (str2 = ffVar.h) != null) {
                            obj3.f28407c = str2;
                            if (ffVar.c()) {
                                obj3.f28426y = ffVar.clone();
                            }
                        } else {
                            String str4 = ffVar.I;
                            if (str4 != null) {
                                obj3.f28407c = str4;
                            }
                        }
                        obj3.f28408e = ffVar.f28060c;
                        obj3.f28409f = ffVar.f28063g;
                        obj3.f28410g = ffVar.f28061e;
                        obj3.f28418p = ffVar.d();
                        obj3.f28417o = ffVar.f28059b;
                        obj3.f28419q = ffVar.j();
                        obj3.f28427z = ffVar.f28068m;
                        obj3.A = ffVar.P;
                        CharSequence charSequence2 = ffVar.f28058a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f28411i = ffVar.f28069n;
                        obj3.f28412j = ffVar.f28073r;
                        obj3.h = ffVar.f28078x;
                        obj3.f28413k = ffVar.f28074s;
                        obj3.f28420r = ffVar.L;
                        obj3.f28422t = org.telegram.messenger.az.h(ffVar.f28058a);
                        obj3.f28423u = ffVar.M;
                        obj3.f28424w = ffVar.N;
                        obj3.f28425x = ffVar.c();
                        arrayList.add(obj3);
                        ffVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.G3;
                        org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
                        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.P2;
                        if (bnVar != null) {
                            cwVar = bnVar.Y8();
                        }
                        org.telegram.messenger.az.X(a10, arrayList, j3, gjVar, threadMessage4, null, rmVar, false, false, gjVar2, null, z14, i11, i10, false, null, cwVar, chatActivityEnterView.P6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.az C = org.telegram.messenger.az.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.G3;
                        if (ffVar != null) {
                            charSequence = ffVar.f28058a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.gj gjVar3 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
                        if (bnVar != null) {
                            cwVar = bnVar.Y8();
                        }
                        C.u0(document, str3, j10, charSequence, f20Var, gjVar3, threadMessage3, storyItem2, rmVar2, null, z14, i11, i10, false, obj2, cwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.si.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                            org.telegram.messenger.np.u1(chatActivityEnterView.S.f23202a).C4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.si.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                                org.telegram.messenger.np.u1(chatActivityEnterView.S.f23202a).C4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f28432id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j11 = chatActivityEnterView.G3;
                            org.telegram.messenger.gj gjVar4 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.rm rmVar3 = chatActivityEnterView.L3;
                            if (bnVar != null) {
                                cwVar = bnVar.Y8();
                            }
                            org.telegram.messenger.az.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, gjVar4, threadMessage2, cwVar, botInlineResult, null, bnVar2, rmVar3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.az C2 = org.telegram.messenger.az.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.G3;
                            org.telegram.messenger.gj gjVar5 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.rm rmVar4 = chatActivityEnterView.L3;
                            if (bnVar != null) {
                                cwVar = bnVar.Y8();
                            }
                            C2.v0(document2, str3, j12, gjVar5, threadMessage, storyItem3, rmVar4, null, z10, i11, i10, false, obj2, cwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.P1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                ng ngVar2 = chatActivityEnterView.P3;
                if (ngVar2 != null) {
                    ngVar2.H(null, z10, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.f36475r = chatActivityEnterView;
        this.f36476s = document;
        this.f36474n = str;
        this.f36477w = cjVar;
        this.f36471c = z10;
        this.d = i7;
        this.f36472e = i10;
        this.f36470b = obj;
        this.h = l10;
        this.f36473f = z11;
    }
}
