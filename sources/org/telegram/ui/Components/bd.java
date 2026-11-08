package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class bd implements Runnable {
    public final int f32154a = 0;
    public final Object f32155b;
    public final boolean f32156c;
    public final int d;
    public final int f32157e;
    public final boolean f32158f;
    public final Long h;
    public final String f32159n;
    public final Object f32160r;
    public final Object f32161s;
    public final Object f32162w;

    public bd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, Long l10, String str, Object obj2) {
        this.f32160r = pfVar;
        this.f32155b = obj;
        this.f32161s = gfVar;
        this.f32156c = z9;
        this.d = i7;
        this.f32157e = i10;
        this.f32158f = z10;
        this.h = l10;
        this.f32159n = str;
        this.f32162w = obj2;
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
        switch (this.f32154a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f32160r, (TLRPC.Document) this.f32161s, this.f32159n, (org.telegram.messenger.ej) this.f32162w, this.f32156c, this.d, this.f32157e, this.f32155b, this.h, this.f32158f);
                return;
            default:
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f32161s;
                ChatActivityEnterView chatActivityEnterView = ((pf) this.f32160r).f36916a;
                boolean z10 = chatActivityEnterView.f31164z3;
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
                Object obj = this.f32155b;
                boolean z12 = obj instanceof TLRPC.Document;
                boolean z13 = this.f32156c;
                int i7 = this.d;
                int i10 = this.f32157e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f32159n;
                Object obj2 = this.f32162w;
                if (z12) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (gfVar != null) {
                        j20Var = gfVar.f26860s;
                    } else {
                        j20Var = null;
                    }
                    if (j20Var != null && gfVar != null) {
                        j20Var.f23489s = true;
                        boolean c10 = j20Var.c();
                        j20Var.f23489s = false;
                        j20Var.f23490t = true;
                        z11 = c10;
                    }
                    boolean z14 = this.f32158f;
                    if (z11) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!gfVar.f26845b && (str2 = gfVar.h) != null) {
                            obj3.f22512c = str2;
                            if (gfVar.c()) {
                                obj3.f22531y = gfVar.clone();
                            }
                        } else {
                            String str4 = gfVar.I;
                            if (str4 != null) {
                                obj3.f22512c = str4;
                            }
                        }
                        obj3.f22513e = gfVar.f26846c;
                        obj3.f22514f = gfVar.f26849g;
                        obj3.f22515g = gfVar.f26847e;
                        obj3.f22523p = gfVar.d();
                        obj3.f22522o = gfVar.f26845b;
                        obj3.f22524q = gfVar.j();
                        obj3.f22532z = gfVar.f26854m;
                        obj3.A = gfVar.P;
                        CharSequence charSequence2 = gfVar.f26844a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f22516i = gfVar.f26855n;
                        obj3.f22517j = gfVar.f26859r;
                        obj3.h = gfVar.f26864x;
                        obj3.f22518k = gfVar.f26860s;
                        obj3.f22525r = gfVar.L;
                        obj3.f22527t = org.telegram.messenger.gz.h(gfVar.f26844a);
                        obj3.f22528u = gfVar.M;
                        obj3.f22529w = gfVar.N;
                        obj3.f22530x = gfVar.c();
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
                            charSequence = gfVar.f26844a;
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
                            org.telegram.messenger.qp.s1(chatActivityEnterView.R.f21765a).t4(obj2, document);
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
                                org.telegram.messenger.qp.s1(chatActivityEnterView.R.f21765a).t4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f26954id);
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
        this.f32160r = chatActivityEnterView;
        this.f32161s = document;
        this.f32159n = str;
        this.f32162w = ejVar;
        this.f32156c = z9;
        this.d = i7;
        this.f32157e = i10;
        this.f32155b = obj;
        this.h = l10;
        this.f32158f = z10;
    }
}
