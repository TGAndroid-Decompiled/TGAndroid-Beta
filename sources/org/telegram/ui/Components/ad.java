package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ad implements Runnable {
    public final int f31817a = 0;
    public final Object f31818b;
    public final boolean f31819c;
    public final int d;
    public final int f31820e;
    public final boolean f31821f;
    public final Long h;
    public final String f31822n;
    public final Object f31823r;
    public final Object f31824s;
    public final Object f31825w;

    public ad(of ofVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, Long l10, String str, Object obj2) {
        this.f31823r = ofVar;
        this.f31818b = obj;
        this.f31824s = gfVar;
        this.f31819c = z9;
        this.d = i7;
        this.f31820e = i10;
        this.f31821f = z10;
        this.h = l10;
        this.f31822n = str;
        this.f31825w = obj2;
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
        switch (this.f31817a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f31823r, (TLRPC.Document) this.f31824s, this.f31822n, (org.telegram.messenger.ej) this.f31825w, this.f31819c, this.d, this.f31820e, this.f31818b, this.h, this.f31821f);
                return;
            default:
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f31824s;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f31823r).f36599a;
                boolean z10 = chatActivityEnterView.f31180z3;
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                boolean z11 = false;
                if (z10) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.A();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                vf vfVar = chatActivityEnterView.Z2;
                org.telegram.messenger.hw hwVar = null;
                if (vfVar != null) {
                    storyItem = vfVar.T0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f31818b;
                boolean z12 = obj instanceof TLRPC.Document;
                boolean z13 = this.f31819c;
                int i7 = this.d;
                int i10 = this.f31820e;
                Long l10 = this.h;
                int i11 = i7;
                String str3 = this.f31822n;
                Object obj2 = this.f31825w;
                if (z12) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (gfVar != null) {
                        j20Var = gfVar.f26864s;
                    } else {
                        j20Var = null;
                    }
                    if (j20Var != null && gfVar != null) {
                        j20Var.f23493s = true;
                        boolean c10 = j20Var.c();
                        j20Var.f23493s = false;
                        j20Var.f23494t = true;
                        z11 = c10;
                    }
                    boolean z14 = this.f31821f;
                    if (z11) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!gfVar.f26849b && (str2 = gfVar.h) != null) {
                            obj3.f22516c = str2;
                            if (gfVar.c()) {
                                obj3.f22535y = gfVar.clone();
                            }
                        } else {
                            String str4 = gfVar.I;
                            if (str4 != null) {
                                obj3.f22516c = str4;
                            }
                        }
                        obj3.f22517e = gfVar.f26850c;
                        obj3.f22518f = gfVar.f26853g;
                        obj3.f22519g = gfVar.f26851e;
                        obj3.f22527p = gfVar.d();
                        obj3.f22526o = gfVar.f26849b;
                        obj3.f22528q = gfVar.j();
                        obj3.f22536z = gfVar.f26858m;
                        obj3.A = gfVar.P;
                        CharSequence charSequence2 = gfVar.f26848a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f22520i = gfVar.f26859n;
                        obj3.f22521j = gfVar.f26863r;
                        obj3.h = gfVar.f26868x;
                        obj3.f22522k = gfVar.f26864s;
                        obj3.f22529r = gfVar.L;
                        obj3.f22531t = org.telegram.messenger.gz.h(gfVar.f26848a);
                        obj3.f22532u = gfVar.M;
                        obj3.f22533w = gfVar.N;
                        obj3.f22534x = gfVar.c();
                        arrayList.add(obj3);
                        gfVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j3 = chatActivityEnterView.Q2;
                        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.sm smVar = chatActivityEnterView.V2;
                        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.Z1;
                        if (cnVar != null) {
                            hwVar = cnVar.X8();
                        }
                        org.telegram.messenger.gz.X(a10, arrayList, j3, ijVar, threadMessage4, null, smVar, false, false, ijVar2, null, z13, i11, i10, false, null, hwVar, chatActivityEnterView.S4, z14, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z9 = z13;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        if (gfVar != null) {
                            charSequence = gfVar.f26848a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.ij ijVar3 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.sm smVar2 = chatActivityEnterView.V2;
                        if (cnVar != null) {
                            hwVar = cnVar.X8();
                        }
                        C.u0(document, str3, j10, charSequence, j20Var, ijVar3, threadMessage3, storyItem2, smVar2, null, z13, i11, i10, false, obj2, hwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z14);
                        z9 = z13;
                        i11 = i11;
                        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.qp.s1(chatActivityEnterView.R.f21770a).t4(obj2, document);
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
                                org.telegram.messenger.qp.s1(chatActivityEnterView.R.f21770a).t4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f26958id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.R;
                            long j11 = chatActivityEnterView.Q2;
                            org.telegram.messenger.ij ijVar4 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.sm smVar3 = chatActivityEnterView.V2;
                            if (cnVar != null) {
                                hwVar = cnVar.X8();
                            }
                            org.telegram.messenger.gz.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, ijVar4, threadMessage2, hwVar, botInlineResult, null, cnVar2, smVar3, z9);
                            i11 = i11;
                            z9 = z9;
                        } else {
                            org.telegram.messenger.gz C2 = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.Q2;
                            org.telegram.messenger.ij ijVar5 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.sm smVar4 = chatActivityEnterView.V2;
                            if (cnVar != null) {
                                hwVar = cnVar.X8();
                            }
                            C2.v0(document2, str3, j12, ijVar5, threadMessage, storyItem3, smVar4, null, z9, i11, i10, false, obj2, hwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                        }
                    }
                }
                vf vfVar2 = chatActivityEnterView.Z2;
                if (vfVar2 != null) {
                    vfVar2.F(null, z9, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public ad(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, Long l10, boolean z10) {
        this.f31823r = chatActivityEnterView;
        this.f31824s = document;
        this.f31822n = str;
        this.f31825w = ejVar;
        this.f31819c = z9;
        this.d = i7;
        this.f31820e = i10;
        this.f31818b = obj;
        this.h = l10;
        this.f31821f = z10;
    }
}
