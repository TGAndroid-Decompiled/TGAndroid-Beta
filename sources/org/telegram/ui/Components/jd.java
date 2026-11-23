package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jd implements Runnable {
    public final int f36427a = 0;
    public final Object f36428b;
    public final boolean f36429c;
    public final int d;
    public final int f36430e;
    public final boolean f36431f;
    public final Long h;
    public final String f36432n;
    public final Object f36433r;
    public final Object f36434s;
    public final Object f36435w;

    public jd(hg hgVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f36433r = hgVar;
        this.f36428b = obj;
        this.f36434s = ffVar;
        this.f36429c = z10;
        this.d = i7;
        this.f36430e = i10;
        this.f36431f = z11;
        this.h = l10;
        this.f36432n = str;
        this.f36435w = obj2;
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
        switch (this.f36427a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f36433r, (TLRPC.Document) this.f36434s, this.f36432n, (org.telegram.messenger.cj) this.f36435w, this.f36429c, this.d, this.f36430e, this.f36428b, this.h, this.f36431f);
                return;
            default:
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.f36434s;
                ChatActivityEnterView chatActivityEnterView = ((hg) this.f36433r).f35830a;
                boolean z11 = chatActivityEnterView.f32658p4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.Q1(false, true, false, true);
                }
                mg mgVar = chatActivityEnterView.P3;
                org.telegram.messenger.cw cwVar = null;
                if (mgVar != null) {
                    storyItem = mgVar.c1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f36428b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f36429c;
                int i7 = this.d;
                int i10 = this.f36430e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f36432n;
                Object obj2 = this.f36435w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (ffVar != null) {
                        f20Var = ffVar.f28038s;
                    } else {
                        f20Var = null;
                    }
                    if (f20Var != null && ffVar != null) {
                        f20Var.f23808s = true;
                        boolean c10 = f20Var.c();
                        f20Var.f23808s = false;
                        f20Var.f23809t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f36431f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!ffVar.f28023b && (str2 = ffVar.h) != null) {
                            obj3.f28371c = str2;
                            if (ffVar.c()) {
                                obj3.f28390y = ffVar.clone();
                            }
                        } else {
                            String str4 = ffVar.I;
                            if (str4 != null) {
                                obj3.f28371c = str4;
                            }
                        }
                        obj3.f28372e = ffVar.f28024c;
                        obj3.f28373f = ffVar.f28027g;
                        obj3.f28374g = ffVar.f28025e;
                        obj3.f28382p = ffVar.d();
                        obj3.f28381o = ffVar.f28023b;
                        obj3.f28383q = ffVar.j();
                        obj3.f28391z = ffVar.f28032m;
                        obj3.A = ffVar.P;
                        CharSequence charSequence2 = ffVar.f28022a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f28375i = ffVar.f28033n;
                        obj3.f28376j = ffVar.f28037r;
                        obj3.h = ffVar.f28042x;
                        obj3.f28377k = ffVar.f28038s;
                        obj3.f28384r = ffVar.L;
                        obj3.f28386t = org.telegram.messenger.az.h(ffVar.f28022a);
                        obj3.f28387u = ffVar.M;
                        obj3.f28388w = ffVar.N;
                        obj3.f28389x = ffVar.c();
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
                            charSequence = ffVar.f28022a;
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
                            org.telegram.messenger.np.u1(chatActivityEnterView.S.f23166a).C4(obj2, document);
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
                                org.telegram.messenger.np.u1(chatActivityEnterView.S.f23166a).C4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f28396id);
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
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    mgVar2.H(null, z10, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.f36433r = chatActivityEnterView;
        this.f36434s = document;
        this.f36432n = str;
        this.f36435w = cjVar;
        this.f36429c = z10;
        this.d = i7;
        this.f36430e = i10;
        this.f36428b = obj;
        this.h = l10;
        this.f36431f = z11;
    }
}
