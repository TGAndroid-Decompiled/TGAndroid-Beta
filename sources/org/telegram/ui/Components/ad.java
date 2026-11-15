package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ad implements Runnable {
    public final int f32957a = 0;
    public final Object f32958b;
    public final boolean f32959c;
    public final int d;
    public final int f32960e;
    public final boolean f32961f;
    public final Long h;
    public final String f32962n;
    public final Object f32963r;
    public final Object f32964s;
    public final Object f32965w;

    public ad(wf wfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f32963r = wfVar;
        this.f32958b = obj;
        this.f32964s = ffVar;
        this.f32959c = z10;
        this.d = i7;
        this.f32960e = i10;
        this.f32961f = z11;
        this.h = l10;
        this.f32962n = str;
        this.f32965w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        org.telegram.messenger.g20 g20Var;
        CharSequence charSequence;
        org.telegram.messenger.gj threadMessage3;
        String str;
        org.telegram.messenger.gj threadMessage4;
        String str2;
        switch (this.f32957a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f32963r, (TLRPC.Document) this.f32964s, this.f32962n, (org.telegram.messenger.cj) this.f32965w, this.f32959c, this.d, this.f32960e, this.f32958b, this.h, this.f32961f);
                return;
            default:
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.f32964s;
                ChatActivityEnterView chatActivityEnterView = ((wf) this.f32963r).f41331a;
                boolean z11 = chatActivityEnterView.f32210h4;
                org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.f32333z2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.E1(false, true, false, true);
                }
                cg cgVar = chatActivityEnterView.H3;
                org.telegram.messenger.fw fwVar = null;
                if (cgVar != null) {
                    storyItem = cgVar.c1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f32958b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f32959c;
                int i7 = this.d;
                int i10 = this.f32960e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f32962n;
                Object obj2 = this.f32965w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (ffVar != null) {
                        g20Var = ffVar.f27723s;
                    } else {
                        g20Var = null;
                    }
                    if (g20Var != null && ffVar != null) {
                        g20Var.f23650s = true;
                        boolean c10 = g20Var.c();
                        g20Var.f23650s = false;
                        g20Var.f23651t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f32961f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!ffVar.f27708b && (str2 = ffVar.h) != null) {
                            obj3.f23189c = str2;
                            if (ffVar.c()) {
                                obj3.f23208y = ffVar.clone();
                            }
                        } else {
                            String str4 = ffVar.I;
                            if (str4 != null) {
                                obj3.f23189c = str4;
                            }
                        }
                        obj3.f23190e = ffVar.f27709c;
                        obj3.f23191f = ffVar.f27712g;
                        obj3.f23192g = ffVar.f27710e;
                        obj3.f23200p = ffVar.d();
                        obj3.f23199o = ffVar.f27708b;
                        obj3.f23201q = ffVar.j();
                        obj3.f23209z = ffVar.f27717m;
                        obj3.A = ffVar.P;
                        CharSequence charSequence2 = ffVar.f27707a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f23193i = ffVar.f27718n;
                        obj3.f23194j = ffVar.f27722r;
                        obj3.h = ffVar.f27727x;
                        obj3.f23195k = ffVar.f27723s;
                        obj3.f23202r = ffVar.L;
                        obj3.f23204t = org.telegram.messenger.ez.h(ffVar.f27707a);
                        obj3.f23205u = ffVar.M;
                        obj3.f23206w = ffVar.N;
                        obj3.f23207x = ffVar.c();
                        arrayList.add(obj3);
                        ffVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.f32327y3;
                        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
                        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.H2;
                        if (anVar != null) {
                            fwVar = anVar.Y8();
                        }
                        org.telegram.messenger.ez.X(a10, arrayList, j3, gjVar, threadMessage4, null, qmVar, false, false, gjVar2, null, z14, i11, i10, false, null, fwVar, chatActivityEnterView.f32251n6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.ez C = org.telegram.messenger.ez.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.f32327y3;
                        if (ffVar != null) {
                            charSequence = ffVar.f27707a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.gj gjVar3 = chatActivityEnterView.B3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.qm qmVar2 = chatActivityEnterView.D3;
                        if (anVar != null) {
                            fwVar = anVar.Y8();
                        }
                        C.u0(document, str3, j10, charSequence, g20Var, gjVar3, threadMessage3, storyItem2, qmVar2, null, z14, i11, i10, false, obj2, fwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.si.b0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.f32327y3)) {
                            org.telegram.messenger.np.s1(chatActivityEnterView.S.f22778a).t4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.si.b0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.m5.C(chatActivityEnterView.f32327y3)) {
                                org.telegram.messenger.np.s1(chatActivityEnterView.S.f22778a).t4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f28049id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.an anVar2 = chatActivityEnterView.f32319x3;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j11 = chatActivityEnterView.f32327y3;
                            org.telegram.messenger.gj gjVar4 = chatActivityEnterView.B3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.qm qmVar3 = chatActivityEnterView.D3;
                            if (anVar != null) {
                                fwVar = anVar.Y8();
                            }
                            org.telegram.messenger.ez.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, gjVar4, threadMessage2, fwVar, botInlineResult, null, anVar2, qmVar3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.ez C2 = org.telegram.messenger.ez.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.f32327y3;
                            org.telegram.messenger.gj gjVar5 = chatActivityEnterView.B3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.qm qmVar4 = chatActivityEnterView.D3;
                            if (anVar != null) {
                                fwVar = anVar.Y8();
                            }
                            C2.v0(document2, str3, j12, gjVar5, threadMessage, storyItem3, qmVar4, null, z10, i11, i10, false, obj2, fwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.f32333z2 != 0) {
                            chatActivityEnterView.D1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                cg cgVar2 = chatActivityEnterView.H3;
                if (cgVar2 != null) {
                    cgVar2.M(null, z10, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public ad(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.f32963r = chatActivityEnterView;
        this.f32964s = document;
        this.f32962n = str;
        this.f32965w = cjVar;
        this.f32959c = z10;
        this.d = i7;
        this.f32960e = i10;
        this.f32958b = obj;
        this.h = l10;
        this.f32961f = z11;
    }
}
