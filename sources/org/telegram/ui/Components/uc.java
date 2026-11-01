package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class uc implements Runnable {
    public final int f30928a = 0;
    public final Object f30929b;
    public final boolean f30930c;
    public final int d;
    public final int e;
    public final boolean f30931f;
    public final Long h;
    public final String f30932n;
    public final Object f30933r;
    public final Object f30934s;
    public final Object f30935w;

    public uc(lf lfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.f30933r = lfVar;
        this.f30929b = obj;
        this.f30934s = ffVar;
        this.f30930c = z10;
        this.d = i10;
        this.e = i11;
        this.f30931f = z11;
        this.h = l4;
        this.f30932n = str;
        this.f30935w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.kj threadMessage;
        org.telegram.messenger.kj threadMessage2;
        org.telegram.messenger.y20 y20Var;
        CharSequence charSequence;
        org.telegram.messenger.kj threadMessage3;
        String str;
        org.telegram.messenger.kj threadMessage4;
        String str2;
        switch (this.f30928a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f30933r, (TLRPC.Document) this.f30934s, this.f30932n, (org.telegram.messenger.gj) this.f30935w, this.f30930c, this.d, this.e, this.f30929b, this.h, this.f30931f);
                return;
            default:
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.f30934s;
                ChatActivityEnterView chatActivityEnterView = ((lf) this.f30933r).f28144a;
                boolean z11 = chatActivityEnterView.f23824z3;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.B();
                    }
                    chatActivityEnterView.l1(false, true, false, true);
                }
                sf sfVar = chatActivityEnterView.Z2;
                org.telegram.messenger.tw twVar = null;
                if (sfVar != null) {
                    storyItem = sfVar.P0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f30929b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f30930c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str3 = this.f30932n;
                Object obj2 = this.f30935w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (ffVar != null) {
                        y20Var = ffVar.f14617s;
                    } else {
                        y20Var = null;
                    }
                    if (y20Var != null && ffVar != null) {
                        y20Var.f19543s = true;
                        boolean c10 = y20Var.c();
                        y20Var.f19543s = false;
                        y20Var.f19544t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f30931f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!ffVar.f14603b && (str2 = ffVar.h) != null) {
                            obj3.f17850c = str2;
                            if (ffVar.c()) {
                                obj3.f17868y = ffVar.clone();
                            }
                        } else {
                            String str4 = ffVar.I;
                            if (str4 != null) {
                                obj3.f17850c = str4;
                            }
                        }
                        obj3.e = ffVar.f14604c;
                        obj3.f17851f = ffVar.f14606g;
                        obj3.f17852g = ffVar.e;
                        obj3.f17860p = ffVar.d();
                        obj3.f17859o = ffVar.f14603b;
                        obj3.f17861q = ffVar.i();
                        obj3.f17869z = ffVar.f14611m;
                        obj3.A = ffVar.P;
                        CharSequence charSequence2 = ffVar.f14602a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f17853i = ffVar.f14612n;
                        obj3.f17854j = ffVar.f14616r;
                        obj3.h = ffVar.f14621x;
                        obj3.f17855k = ffVar.f14617s;
                        obj3.f17862r = ffVar.L;
                        obj3.f17864t = org.telegram.messenger.rz.h(ffVar.f14602a);
                        obj3.f17865u = ffVar.M;
                        obj3.f17866w = ffVar.N;
                        obj3.f17867x = ffVar.c();
                        arrayList.add(obj3);
                        ffVar.e();
                        org.telegram.messenger.c a2 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
                        org.telegram.messenger.kj kjVar2 = chatActivityEnterView.Z1;
                        if (unVar != null) {
                            twVar = unVar.T8();
                        }
                        org.telegram.messenger.rz.X(a2, arrayList, j10, kjVar, threadMessage4, null, knVar, false, false, kjVar2, null, z14, i12, i11, false, null, twVar, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i12 = i12;
                    } else {
                        org.telegram.messenger.rz C = org.telegram.messenger.rz.C(chatActivityEnterView.Q);
                        long j11 = chatActivityEnterView.Q2;
                        if (ffVar != null) {
                            charSequence = ffVar.f14602a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.kj kjVar3 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
                        if (unVar != null) {
                            twVar = unVar.T8();
                        }
                        C.u0(document, str3, j11, charSequence, y20Var, kjVar3, threadMessage3, storyItem2, knVar2, null, z14, i12, i11, false, obj2, twVar, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        org.telegram.messenger.vi.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.wp.r1(chatActivityEnterView.R.f15043a).q4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.vi.b0(chatActivityEnterView.Q).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                                org.telegram.messenger.wp.r1(chatActivityEnterView.R.f15043a).q4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f19792id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.R;
                            long j12 = chatActivityEnterView.Q2;
                            org.telegram.messenger.kj kjVar4 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.kn knVar3 = chatActivityEnterView.V2;
                            if (unVar != null) {
                                twVar = unVar.T8();
                            }
                            org.telegram.messenger.rz.S(i12, j12, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, kjVar4, threadMessage2, twVar, botInlineResult, null, unVar2, knVar3, z10);
                            i12 = i12;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.rz C2 = org.telegram.messenger.rz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.Q2;
                            org.telegram.messenger.kj kjVar5 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.kn knVar4 = chatActivityEnterView.V2;
                            if (unVar != null) {
                                twVar = unVar.T8();
                            }
                            C2.v0(document2, str3, j13, kjVar5, threadMessage, storyItem3, knVar4, null, z10, i12, i11, false, obj2, twVar, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.k1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.B();
                        }
                    }
                }
                sf sfVar2 = chatActivityEnterView.Z2;
                if (sfVar2 != null) {
                    sfVar2.E(null, z10, i12, 0, 0L);
                    return;
                }
                return;
        }
    }

    public uc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.gj gjVar, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.f30933r = chatActivityEnterView;
        this.f30934s = document;
        this.f30932n = str;
        this.f30935w = gjVar;
        this.f30930c = z10;
        this.d = i10;
        this.e = i11;
        this.f30929b = obj;
        this.h = l4;
        this.f30931f = z11;
    }
}
