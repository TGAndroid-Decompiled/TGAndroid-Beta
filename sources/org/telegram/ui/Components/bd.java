package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class bd implements Runnable {
    public final int f32099a = 0;
    public final Object f32100b;
    public final boolean f32101c;
    public final int d;
    public final int f32102e;
    public final boolean f32103f;
    public final Long h;
    public final String f32104n;
    public final Object f32105r;
    public final Object f32106s;
    public final Object f32107w;

    public bd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, Long l10, String str, Object obj2) {
        this.f32105r = pfVar;
        this.f32100b = obj;
        this.f32106s = gfVar;
        this.f32101c = z9;
        this.d = i7;
        this.f32102e = i10;
        this.f32103f = z10;
        this.h = l10;
        this.f32104n = str;
        this.f32107w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z9;
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.ij threadMessage2;
        org.telegram.messenger.j20 j20Var;
        CharSequence charSequence;
        org.telegram.messenger.ij threadMessage3;
        String str;
        org.telegram.messenger.ij threadMessage4;
        String str2;
        switch (this.f32099a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f32105r, (TLRPC.Document) this.f32106s, this.f32104n, (org.telegram.messenger.ej) this.f32107w, this.f32101c, this.d, this.f32102e, this.f32100b, this.h, this.f32103f);
                return;
            default:
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f32106s;
                ChatActivityEnterView chatActivityEnterView = ((pf) this.f32105r).f36874a;
                boolean z10 = chatActivityEnterView.f31159z3;
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                boolean z11 = false;
                if (z10) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.A();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                wf wfVar = chatActivityEnterView.Z2;
                org.telegram.messenger.hw hwVar = null;
                if (wfVar != null) {
                    storyItem = wfVar.T0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f32100b;
                boolean z12 = obj instanceof TLRPC.Document;
                boolean z13 = this.f32101c;
                int i7 = this.d;
                int i10 = this.f32102e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f32104n;
                Object obj2 = this.f32107w;
                if (z12) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (gfVar != null) {
                        j20Var = gfVar.f26839s;
                    } else {
                        j20Var = null;
                    }
                    if (j20Var != null && gfVar != null) {
                        j20Var.f23461s = true;
                        boolean c10 = j20Var.c();
                        j20Var.f23461s = false;
                        j20Var.f23462t = true;
                        z11 = c10;
                    }
                    boolean z14 = this.f32103f;
                    if (z11) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!gfVar.f26824b && (str2 = gfVar.h) != null) {
                            obj3.f22486c = str2;
                            if (gfVar.c()) {
                                obj3.f22505y = gfVar.clone();
                            }
                        } else {
                            String str4 = gfVar.I;
                            if (str4 != null) {
                                obj3.f22486c = str4;
                            }
                        }
                        obj3.f22487e = gfVar.f26825c;
                        obj3.f22488f = gfVar.f26828g;
                        obj3.f22489g = gfVar.f26826e;
                        obj3.f22497p = gfVar.d();
                        obj3.f22496o = gfVar.f26824b;
                        obj3.f22498q = gfVar.j();
                        obj3.f22506z = gfVar.f26833m;
                        obj3.A = gfVar.P;
                        CharSequence charSequence2 = gfVar.f26823a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f22490i = gfVar.f26834n;
                        obj3.f22491j = gfVar.f26838r;
                        obj3.h = gfVar.f26843x;
                        obj3.f22492k = gfVar.f26839s;
                        obj3.f22499r = gfVar.L;
                        obj3.f22501t = org.telegram.messenger.gz.h(gfVar.f26823a);
                        obj3.f22502u = gfVar.M;
                        obj3.f22503w = gfVar.N;
                        obj3.f22504x = gfVar.c();
                        arrayList.add(obj3);
                        gfVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j3 = chatActivityEnterView.Q2;
                        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.qm qmVar = chatActivityEnterView.V2;
                        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.Z1;
                        if (anVar != null) {
                            hwVar = anVar.W8();
                        }
                        org.telegram.messenger.gz.X(a10, arrayList, j3, ijVar, threadMessage4, null, qmVar, false, false, ijVar2, null, z13, i11, i10, false, null, hwVar, chatActivityEnterView.S4, z14, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z9 = z13;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        if (gfVar != null) {
                            charSequence = gfVar.f26823a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.ij ijVar3 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.qm qmVar2 = chatActivityEnterView.V2;
                        if (anVar != null) {
                            hwVar = anVar.W8();
                        }
                        C.u0(document, str3, j10, charSequence, j20Var, ijVar3, threadMessage3, storyItem2, qmVar2, null, z13, i11, i10, false, obj2, hwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z14);
                        z9 = z13;
                        i11 = i11;
                        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.qp.s1(chatActivityEnterView.R.f21723a).t4(obj2, document);
                        }
                    }
                } else {
                    z9 = z13;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.m5.C(chatActivityEnterView.Q2)) {
                                org.telegram.messenger.qp.s1(chatActivityEnterView.R.f21723a).t4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f26950id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.an anVar2 = chatActivityEnterView.P2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.R;
                            long j11 = chatActivityEnterView.Q2;
                            org.telegram.messenger.ij ijVar4 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.qm qmVar3 = chatActivityEnterView.V2;
                            if (anVar != null) {
                                hwVar = anVar.W8();
                            }
                            org.telegram.messenger.gz.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, ijVar4, threadMessage2, hwVar, botInlineResult, null, anVar2, qmVar3, z9);
                            i11 = i11;
                            z9 = z9;
                        } else {
                            org.telegram.messenger.gz C2 = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.Q2;
                            org.telegram.messenger.ij ijVar5 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.qm qmVar4 = chatActivityEnterView.V2;
                            if (anVar != null) {
                                hwVar = anVar.W8();
                            }
                            C2.v0(document2, str3, j12, ijVar5, threadMessage, storyItem3, qmVar4, null, z9, i11, i10, false, obj2, hwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                        }
                    }
                }
                wf wfVar2 = chatActivityEnterView.Z2;
                if (wfVar2 != null) {
                    wfVar2.F(null, z9, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public bd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, Long l10, boolean z10) {
        this.f32105r = chatActivityEnterView;
        this.f32106s = document;
        this.f32104n = str;
        this.f32107w = ejVar;
        this.f32101c = z9;
        this.d = i7;
        this.f32102e = i10;
        this.f32100b = obj;
        this.h = l10;
        this.f32103f = z10;
    }
}
