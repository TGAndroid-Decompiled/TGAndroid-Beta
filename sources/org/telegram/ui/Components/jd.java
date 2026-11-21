package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jd implements Runnable {
    public final int f36474a = 0;
    public final Object f36475b;
    public final boolean f36476c;
    public final int d;
    public final int f36477e;
    public final boolean f36478f;
    public final Long h;
    public final String f36479n;
    public final Object f36480r;
    public final Object f36481s;
    public final Object f36482w;

    public jd(ig igVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f36480r = igVar;
        this.f36475b = obj;
        this.f36481s = efVar;
        this.f36476c = z10;
        this.d = i7;
        this.f36477e = i10;
        this.f36478f = z11;
        this.h = l10;
        this.f36479n = str;
        this.f36482w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.fj threadMessage2;
        org.telegram.messenger.e20 e20Var;
        CharSequence charSequence;
        org.telegram.messenger.fj threadMessage3;
        String str;
        org.telegram.messenger.fj threadMessage4;
        String str2;
        switch (this.f36474a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f36480r, (TLRPC.Document) this.f36481s, this.f36479n, (org.telegram.messenger.bj) this.f36482w, this.f36476c, this.d, this.f36477e, this.f36475b, this.h, this.f36478f);
                return;
            default:
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f36481s;
                ChatActivityEnterView chatActivityEnterView = ((ig) this.f36480r).f36252a;
                boolean z11 = chatActivityEnterView.f32689p4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.Q1(false, true, false, true);
                }
                ng ngVar = chatActivityEnterView.P3;
                org.telegram.messenger.bw bwVar = null;
                if (ngVar != null) {
                    storyItem = ngVar.c1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f36475b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f36476c;
                int i7 = this.d;
                int i10 = this.f36477e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f36479n;
                Object obj2 = this.f36482w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (efVar != null) {
                        e20Var = efVar.f27890s;
                    } else {
                        e20Var = null;
                    }
                    if (e20Var != null && efVar != null) {
                        e20Var.f23680s = true;
                        boolean c10 = e20Var.c();
                        e20Var.f23680s = false;
                        e20Var.f23681t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f36478f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!efVar.f27875b && (str2 = efVar.h) != null) {
                            obj3.f28239c = str2;
                            if (efVar.c()) {
                                obj3.f28258y = efVar.clone();
                            }
                        } else {
                            String str4 = efVar.I;
                            if (str4 != null) {
                                obj3.f28239c = str4;
                            }
                        }
                        obj3.f28240e = efVar.f27876c;
                        obj3.f28241f = efVar.f27879g;
                        obj3.f28242g = efVar.f27877e;
                        obj3.f28250p = efVar.d();
                        obj3.f28249o = efVar.f27875b;
                        obj3.f28251q = efVar.j();
                        obj3.f28259z = efVar.f27884m;
                        obj3.A = efVar.P;
                        CharSequence charSequence2 = efVar.f27874a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f28243i = efVar.f27885n;
                        obj3.f28244j = efVar.f27889r;
                        obj3.h = efVar.f27894x;
                        obj3.f28245k = efVar.f27890s;
                        obj3.f28252r = efVar.L;
                        obj3.f28254t = org.telegram.messenger.zy.h(efVar.f27874a);
                        obj3.f28255u = efVar.M;
                        obj3.f28256w = efVar.N;
                        obj3.f28257x = efVar.c();
                        arrayList.add(obj3);
                        efVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.G3;
                        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
                        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.P2;
                        if (bnVar != null) {
                            bwVar = bnVar.Y8();
                        }
                        org.telegram.messenger.zy.X(a10, arrayList, j3, fjVar, threadMessage4, null, rmVar, false, false, fjVar2, null, z14, i11, i10, false, null, bwVar, chatActivityEnterView.P6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.G3;
                        if (efVar != null) {
                            charSequence = efVar.f27874a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.fj fjVar3 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
                        if (bnVar != null) {
                            bwVar = bnVar.Y8();
                        }
                        C.u0(document, str3, j10, charSequence, e20Var, fjVar3, threadMessage3, storyItem2, rmVar2, null, z14, i11, i10, false, obj2, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                            org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23246a).C4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                                org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23246a).C4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f28429id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j11 = chatActivityEnterView.G3;
                            org.telegram.messenger.fj fjVar4 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.rm rmVar3 = chatActivityEnterView.L3;
                            if (bnVar != null) {
                                bwVar = bnVar.Y8();
                            }
                            org.telegram.messenger.zy.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, fjVar4, threadMessage2, bwVar, botInlineResult, null, bnVar2, rmVar3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.zy C2 = org.telegram.messenger.zy.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.G3;
                            org.telegram.messenger.fj fjVar5 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.rm rmVar4 = chatActivityEnterView.L3;
                            if (bnVar != null) {
                                bwVar = bnVar.Y8();
                            }
                            C2.v0(document2, str3, j12, fjVar5, threadMessage, storyItem3, rmVar4, null, z10, i11, i10, false, obj2, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
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

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.f36480r = chatActivityEnterView;
        this.f36481s = document;
        this.f36479n = str;
        this.f36482w = bjVar;
        this.f36476c = z10;
        this.d = i7;
        this.f36477e = i10;
        this.f36475b = obj;
        this.h = l10;
        this.f36478f = z11;
    }
}
