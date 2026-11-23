package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jd implements Runnable {
    public final int f36385a = 0;
    public final Object f36386b;
    public final boolean f36387c;
    public final int d;
    public final int f36388e;
    public final boolean f36389f;
    public final Long h;
    public final String f36390n;
    public final Object f36391r;
    public final Object f36392s;
    public final Object f36393w;

    public jd(hg hgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f36391r = hgVar;
        this.f36386b = obj;
        this.f36392s = efVar;
        this.f36387c = z10;
        this.d = i7;
        this.f36388e = i10;
        this.f36389f = z11;
        this.h = l10;
        this.f36390n = str;
        this.f36393w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.fj threadMessage2;
        org.telegram.messenger.d20 d20Var;
        CharSequence charSequence;
        org.telegram.messenger.fj threadMessage3;
        String str;
        org.telegram.messenger.fj threadMessage4;
        String str2;
        switch (this.f36385a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f36391r, (TLRPC.Document) this.f36392s, this.f36390n, (org.telegram.messenger.bj) this.f36393w, this.f36387c, this.d, this.f36388e, this.f36386b, this.h, this.f36389f);
                return;
            default:
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f36392s;
                ChatActivityEnterView chatActivityEnterView = ((hg) this.f36391r).f35730a;
                boolean z11 = chatActivityEnterView.f32756p4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.S1(false, true, false, true);
                }
                mg mgVar = chatActivityEnterView.P3;
                org.telegram.messenger.bw bwVar = null;
                if (mgVar != null) {
                    storyItem = mgVar.Y0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f36386b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f36387c;
                int i7 = this.d;
                int i10 = this.f36388e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f36390n;
                Object obj2 = this.f36393w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (efVar != null) {
                        d20Var = efVar.f27978s;
                    } else {
                        d20Var = null;
                    }
                    if (d20Var != null && efVar != null) {
                        d20Var.f23605s = true;
                        boolean c10 = d20Var.c();
                        d20Var.f23605s = false;
                        d20Var.f23606t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f36389f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!efVar.f27963b && (str2 = efVar.h) != null) {
                            obj3.f28311c = str2;
                            if (efVar.c()) {
                                obj3.f28330y = efVar.clone();
                            }
                        } else {
                            String str4 = efVar.I;
                            if (str4 != null) {
                                obj3.f28311c = str4;
                            }
                        }
                        obj3.f28312e = efVar.f27964c;
                        obj3.f28313f = efVar.f27967g;
                        obj3.f28314g = efVar.f27965e;
                        obj3.f28322p = efVar.d();
                        obj3.f28321o = efVar.f27963b;
                        obj3.f28323q = efVar.j();
                        obj3.f28331z = efVar.f27972m;
                        obj3.A = efVar.P;
                        CharSequence charSequence2 = efVar.f27962a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f28315i = efVar.f27973n;
                        obj3.f28316j = efVar.f27977r;
                        obj3.h = efVar.f27982x;
                        obj3.f28317k = efVar.f27978s;
                        obj3.f28324r = efVar.L;
                        obj3.f28326t = org.telegram.messenger.zy.h(efVar.f27962a);
                        obj3.f28327u = efVar.M;
                        obj3.f28328w = efVar.N;
                        obj3.f28329x = efVar.c();
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
                            charSequence = efVar.f27962a;
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
                        C.u0(document, str3, j10, charSequence, d20Var, fjVar3, threadMessage3, storyItem2, rmVar2, null, z14, i11, i10, false, obj2, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                            org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23343a).C4(obj2, document);
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
                                org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23343a).C4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f28490id);
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
                            chatActivityEnterView.R1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    mgVar2.G(null, z10, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.f36391r = chatActivityEnterView;
        this.f36392s = document;
        this.f36390n = str;
        this.f36393w = bjVar;
        this.f36387c = z10;
        this.d = i7;
        this.f36388e = i10;
        this.f36386b = obj;
        this.h = l10;
        this.f36389f = z11;
    }
}
