package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class uc implements Runnable {
    public final int f30894a = 0;
    public final Object f30895b;
    public final boolean f30896c;
    public final int d;
    public final int e;
    public final boolean f30897f;
    public final Long h;
    public final String f30898n;
    public final Object f30899r;
    public final Object f30900s;
    public final Object f30901w;

    public uc(lf lfVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.f30899r = lfVar;
        this.f30895b = obj;
        this.f30900s = efVar;
        this.f30896c = z10;
        this.d = i10;
        this.e = i11;
        this.f30897f = z11;
        this.h = l4;
        this.f30898n = str;
        this.f30901w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.jj threadMessage;
        org.telegram.messenger.jj threadMessage2;
        org.telegram.messenger.x20 x20Var;
        CharSequence charSequence;
        org.telegram.messenger.jj threadMessage3;
        String str;
        org.telegram.messenger.jj threadMessage4;
        String str2;
        switch (this.f30894a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f30899r, (TLRPC.Document) this.f30900s, this.f30898n, (org.telegram.messenger.fj) this.f30901w, this.f30896c, this.d, this.e, this.f30895b, this.h, this.f30897f);
                return;
            default:
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.f30900s;
                ChatActivityEnterView chatActivityEnterView = ((lf) this.f30899r).f28100a;
                boolean z11 = chatActivityEnterView.f23823z3;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.B();
                    }
                    chatActivityEnterView.l1(false, true, false, true);
                }
                sf sfVar = chatActivityEnterView.Z2;
                org.telegram.messenger.sw swVar = null;
                if (sfVar != null) {
                    storyItem = sfVar.P0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f30895b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f30896c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str3 = this.f30898n;
                Object obj2 = this.f30901w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (efVar != null) {
                        x20Var = efVar.f19521s;
                    } else {
                        x20Var = null;
                    }
                    if (x20Var != null && efVar != null) {
                        x20Var.f19200s = true;
                        boolean c10 = x20Var.c();
                        x20Var.f19200s = false;
                        x20Var.f19201t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f30897f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!efVar.f19507b && (str2 = efVar.h) != null) {
                            obj3.f17515c = str2;
                            if (efVar.c()) {
                                obj3.f17533y = efVar.clone();
                            }
                        } else {
                            String str4 = efVar.I;
                            if (str4 != null) {
                                obj3.f17515c = str4;
                            }
                        }
                        obj3.e = efVar.f19508c;
                        obj3.f17516f = efVar.f19510g;
                        obj3.f17517g = efVar.e;
                        obj3.f17525p = efVar.d();
                        obj3.f17524o = efVar.f19507b;
                        obj3.f17526q = efVar.i();
                        obj3.f17534z = efVar.f19515m;
                        obj3.A = efVar.P;
                        CharSequence charSequence2 = efVar.f19506a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f17518i = efVar.f19516n;
                        obj3.f17519j = efVar.f19520r;
                        obj3.h = efVar.f19525x;
                        obj3.f17520k = efVar.f19521s;
                        obj3.f17527r = efVar.L;
                        obj3.f17529t = org.telegram.messenger.qz.h(efVar.f19506a);
                        obj3.f17530u = efVar.M;
                        obj3.f17531w = efVar.N;
                        obj3.f17532x = efVar.c();
                        arrayList.add(obj3);
                        efVar.e();
                        org.telegram.messenger.c a2 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
                        org.telegram.messenger.jj jjVar2 = chatActivityEnterView.Z1;
                        if (unVar != null) {
                            swVar = unVar.P8();
                        }
                        org.telegram.messenger.qz.X(a2, arrayList, j10, jjVar, threadMessage4, null, knVar, false, false, jjVar2, null, z14, i12, i11, false, null, swVar, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i12 = i12;
                    } else {
                        org.telegram.messenger.qz C = org.telegram.messenger.qz.C(chatActivityEnterView.Q);
                        long j11 = chatActivityEnterView.Q2;
                        if (efVar != null) {
                            charSequence = efVar.f19506a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.jj jjVar3 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
                        if (unVar != null) {
                            swVar = unVar.P8();
                        }
                        C.u0(document, str3, j11, charSequence, x20Var, jjVar3, threadMessage3, storyItem2, knVar2, null, z14, i12, i11, false, obj2, swVar, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.vp.r1(chatActivityEnterView.R.f14863a).q4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                                org.telegram.messenger.vp.r1(chatActivityEnterView.R.f14863a).q4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f19791id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.R;
                            long j12 = chatActivityEnterView.Q2;
                            org.telegram.messenger.jj jjVar4 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.kn knVar3 = chatActivityEnterView.V2;
                            if (unVar != null) {
                                swVar = unVar.P8();
                            }
                            org.telegram.messenger.qz.S(i12, j12, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, jjVar4, threadMessage2, swVar, botInlineResult, null, unVar2, knVar3, z10);
                            i12 = i12;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.qz C2 = org.telegram.messenger.qz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.Q2;
                            org.telegram.messenger.jj jjVar5 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.kn knVar4 = chatActivityEnterView.V2;
                            if (unVar != null) {
                                swVar = unVar.P8();
                            }
                            C2.v0(document2, str3, j13, jjVar5, threadMessage, storyItem3, knVar4, null, z10, i12, i11, false, obj2, swVar, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
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

    public uc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.fj fjVar, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.f30899r = chatActivityEnterView;
        this.f30900s = document;
        this.f30898n = str;
        this.f30901w = fjVar;
        this.f30896c = z10;
        this.d = i10;
        this.e = i11;
        this.f30895b = obj;
        this.h = l4;
        this.f30897f = z11;
    }
}
