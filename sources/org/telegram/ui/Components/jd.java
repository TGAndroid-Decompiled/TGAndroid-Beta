package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jd implements Runnable {
    public final int f36407a = 0;
    public final Object f36408b;
    public final boolean f36409c;
    public final int d;
    public final int f36410e;
    public final boolean f36411f;
    public final Long h;
    public final String f36412n;
    public final Object f36413r;
    public final Object f36414s;
    public final Object f36415w;

    public jd(fg fgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f36413r = fgVar;
        this.f36408b = obj;
        this.f36414s = efVar;
        this.f36409c = z10;
        this.d = i7;
        this.f36410e = i10;
        this.f36411f = z11;
        this.h = l10;
        this.f36412n = str;
        this.f36415w = obj2;
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
        switch (this.f36407a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f36413r, (TLRPC.Document) this.f36414s, this.f36412n, (org.telegram.messenger.bj) this.f36415w, this.f36409c, this.d, this.f36410e, this.f36408b, this.h, this.f36411f);
                return;
            default:
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f36414s;
                ChatActivityEnterView chatActivityEnterView = ((fg) this.f36413r).f35077a;
                boolean z11 = chatActivityEnterView.f32646n4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.F2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.M1(false, true, false, true);
                }
                kg kgVar = chatActivityEnterView.N3;
                org.telegram.messenger.bw bwVar = null;
                if (kgVar != null) {
                    storyItem = kgVar.c1();
                } else {
                    storyItem = null;
                }
                Object obj = this.f36408b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f36409c;
                int i7 = this.d;
                int i10 = this.f36410e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f36412n;
                Object obj2 = this.f36415w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (efVar != null) {
                        e20Var = efVar.f27862s;
                    } else {
                        e20Var = null;
                    }
                    if (e20Var != null && efVar != null) {
                        e20Var.f23652s = true;
                        boolean c10 = e20Var.c();
                        e20Var.f23652s = false;
                        e20Var.f23653t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f36411f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!efVar.f27847b && (str2 = efVar.h) != null) {
                            obj3.f28211c = str2;
                            if (efVar.c()) {
                                obj3.f28230y = efVar.clone();
                            }
                        } else {
                            String str4 = efVar.I;
                            if (str4 != null) {
                                obj3.f28211c = str4;
                            }
                        }
                        obj3.f28212e = efVar.f27848c;
                        obj3.f28213f = efVar.f27851g;
                        obj3.f28214g = efVar.f27849e;
                        obj3.f28222p = efVar.d();
                        obj3.f28221o = efVar.f27847b;
                        obj3.f28223q = efVar.j();
                        obj3.f28231z = efVar.f27856m;
                        obj3.A = efVar.P;
                        CharSequence charSequence2 = efVar.f27846a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f28215i = efVar.f27857n;
                        obj3.f28216j = efVar.f27861r;
                        obj3.h = efVar.f27866x;
                        obj3.f28217k = efVar.f27862s;
                        obj3.f28224r = efVar.L;
                        obj3.f28226t = org.telegram.messenger.zy.h(efVar.f27846a);
                        obj3.f28227u = efVar.M;
                        obj3.f28228w = efVar.N;
                        obj3.f28229x = efVar.c();
                        arrayList.add(obj3);
                        efVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.E3;
                        org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
                        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.N2;
                        if (bnVar != null) {
                            bwVar = bnVar.Y8();
                        }
                        org.telegram.messenger.zy.X(a10, arrayList, j3, fjVar, threadMessage4, null, rmVar, false, false, fjVar2, null, z14, i11, i10, false, null, bwVar, chatActivityEnterView.N6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.E3;
                        if (efVar != null) {
                            charSequence = efVar.f27846a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.fj fjVar3 = chatActivityEnterView.H3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.rm rmVar2 = chatActivityEnterView.J3;
                        if (bnVar != null) {
                            bwVar = bnVar.Y8();
                        }
                        C.u0(document, str3, j10, charSequence, e20Var, fjVar3, threadMessage3, storyItem2, rmVar2, null, z14, i11, i10, false, obj2, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.n5.C(chatActivityEnterView.E3)) {
                            org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23218a).C4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.n5.C(chatActivityEnterView.E3)) {
                                org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23218a).C4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f28401id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j11 = chatActivityEnterView.E3;
                            org.telegram.messenger.fj fjVar4 = chatActivityEnterView.H3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.rm rmVar3 = chatActivityEnterView.J3;
                            if (bnVar != null) {
                                bwVar = bnVar.Y8();
                            }
                            org.telegram.messenger.zy.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, fjVar4, threadMessage2, bwVar, botInlineResult, null, bnVar2, rmVar3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.zy C2 = org.telegram.messenger.zy.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.E3;
                            org.telegram.messenger.fj fjVar5 = chatActivityEnterView.H3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.rm rmVar4 = chatActivityEnterView.J3;
                            if (bnVar != null) {
                                bwVar = bnVar.Y8();
                            }
                            C2.v0(document2, str3, j12, fjVar5, threadMessage, storyItem3, rmVar4, null, z10, i11, i10, false, obj2, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.F2 != 0) {
                            chatActivityEnterView.L1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                kg kgVar2 = chatActivityEnterView.N3;
                if (kgVar2 != null) {
                    kgVar2.H(null, z10, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.f36413r = chatActivityEnterView;
        this.f36414s = document;
        this.f36412n = str;
        this.f36415w = bjVar;
        this.f36409c = z10;
        this.d = i7;
        this.f36410e = i10;
        this.f36408b = obj;
        this.h = l10;
        this.f36411f = z11;
    }
}
