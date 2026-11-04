package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class zc implements Runnable {
    public final int f41018a = 0;
    public final Object f41019b;
    public final boolean f41020c;
    public final int d;
    public final int f41021e;
    public final boolean f41022f;
    public final Long h;
    public final String f41023n;
    public final Object f41024r;
    public final Object f41025s;
    public final Object f41026w;

    public zc(nf nfVar, Object obj, org.telegram.messenger.ye yeVar, boolean z10, int i3, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.f41024r = nfVar;
        this.f41019b = obj;
        this.f41025s = yeVar;
        this.f41020c = z10;
        this.d = i3;
        this.f41021e = i10;
        this.f41022f = z11;
        this.h = l10;
        this.f41023n = str;
        this.f41026w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z10;
        org.telegram.messenger.zi threadMessage;
        org.telegram.messenger.zi threadMessage2;
        org.telegram.messenger.b20 b20Var;
        CharSequence charSequence;
        org.telegram.messenger.zi threadMessage3;
        String str;
        org.telegram.messenger.zi threadMessage4;
        String str2;
        switch (this.f41018a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.f41024r, (TLRPC.Document) this.f41025s, this.f41023n, (org.telegram.messenger.vi) this.f41026w, this.f41020c, this.d, this.f41021e, this.f41019b, this.h, this.f41022f);
                return;
            default:
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) this.f41025s;
                ChatActivityEnterView chatActivityEnterView = ((nf) this.f41024r).f36497a;
                boolean z11 = chatActivityEnterView.A3;
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.S1 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.m1(false, true, false, true);
                }
                uf ufVar = chatActivityEnterView.f31087a3;
                org.telegram.messenger.zv zvVar = null;
                if (ufVar != null) {
                    storyItem = ufVar.R0();
                } else {
                    storyItem = null;
                }
                Object obj = this.f41019b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.f41020c;
                int i3 = this.d;
                int i10 = this.f41021e;
                Long l10 = this.h;
                int i11 = i3;
                String str3 = this.f41023n;
                Object obj2 = this.f41026w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (yeVar != null) {
                        b20Var = yeVar.f25325s;
                    } else {
                        b20Var = null;
                    }
                    if (b20Var != null && yeVar != null) {
                        b20Var.f21726s = true;
                        boolean c2 = b20Var.c();
                        b20Var.f21726s = false;
                        b20Var.f21727t = true;
                        z12 = c2;
                    }
                    boolean z15 = this.f41022f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj3 = new Object();
                        if (!yeVar.f25310b && (str2 = yeVar.h) != null) {
                            obj3.f26477c = str2;
                            if (yeVar.c()) {
                                obj3.f26496y = yeVar.clone();
                            }
                        } else {
                            String str4 = yeVar.I;
                            if (str4 != null) {
                                obj3.f26477c = str4;
                            }
                        }
                        obj3.f26478e = yeVar.f25311c;
                        obj3.f26479f = yeVar.f25314g;
                        obj3.f26480g = yeVar.f25312e;
                        obj3.f26488p = yeVar.d();
                        obj3.f26487o = yeVar.f25310b;
                        obj3.f26489q = yeVar.j();
                        obj3.f26497z = yeVar.f25319m;
                        obj3.A = yeVar.P;
                        CharSequence charSequence2 = yeVar.f25309a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj3.d = str;
                        obj3.f26481i = yeVar.f25320n;
                        obj3.f26482j = yeVar.f25324r;
                        obj3.h = yeVar.f25329x;
                        obj3.f26483k = yeVar.f25325s;
                        obj3.f26490r = yeVar.L;
                        obj3.f26492t = org.telegram.messenger.yy.h(yeVar.f25309a);
                        obj3.f26493u = yeVar.M;
                        obj3.f26494w = yeVar.N;
                        obj3.f26495x = yeVar.c();
                        arrayList.add(obj3);
                        yeVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.R2;
                        org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
                        org.telegram.messenger.zi ziVar2 = chatActivityEnterView.f31086a2;
                        if (wmVar != null) {
                            zvVar = wmVar.W8();
                        }
                        org.telegram.messenger.yy.X(a10, arrayList, j10, ziVar, threadMessage4, null, mmVar, false, false, ziVar2, null, z14, i11, i10, false, null, zvVar, chatActivityEnterView.T4, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.yy C = org.telegram.messenger.yy.C(chatActivityEnterView.R);
                        long j11 = chatActivityEnterView.R2;
                        if (yeVar != null) {
                            charSequence = yeVar.f25309a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        org.telegram.messenger.zi ziVar3 = chatActivityEnterView.U2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        org.telegram.ui.mm mmVar2 = chatActivityEnterView.W2;
                        if (wmVar != null) {
                            zvVar = wmVar.W8();
                        }
                        C.u0(document, str3, j11, charSequence, b20Var, ziVar3, threadMessage3, storyItem2, mmVar2, null, z14, i11, i10, false, obj2, zvVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.li.b0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.R2)) {
                            org.telegram.messenger.hp.s1(chatActivityEnterView.S.f21919a).t4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.li.b0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.m5.C(chatActivityEnterView.R2)) {
                                org.telegram.messenger.hp.s1(chatActivityEnterView.S.f21919a).t4(obj2, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.f26999id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j12 = chatActivityEnterView.R2;
                            org.telegram.messenger.zi ziVar4 = chatActivityEnterView.U2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.mm mmVar3 = chatActivityEnterView.W2;
                            if (wmVar != null) {
                                zvVar = wmVar.W8();
                            }
                            org.telegram.messenger.yy.S(i11, j12, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, ziVar4, threadMessage2, zvVar, botInlineResult, null, wmVar2, mmVar3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.yy C2 = org.telegram.messenger.yy.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.R2;
                            org.telegram.messenger.zi ziVar5 = chatActivityEnterView.U2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            org.telegram.ui.mm mmVar4 = chatActivityEnterView.W2;
                            if (wmVar != null) {
                                zvVar = wmVar.W8();
                            }
                            C2.v0(document2, str3, j13, ziVar5, threadMessage, storyItem3, mmVar4, null, z10, i11, i10, false, obj2, zvVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.S1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                uf ufVar2 = chatActivityEnterView.f31087a3;
                if (ufVar2 != null) {
                    ufVar2.G(null, z10, i11, 0, 0L);
                    return;
                }
                return;
        }
    }

    public zc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.vi viVar, boolean z10, int i3, int i10, Object obj, Long l10, boolean z11) {
        this.f41024r = chatActivityEnterView;
        this.f41025s = document;
        this.f41023n = str;
        this.f41026w = viVar;
        this.f41020c = z10;
        this.d = i3;
        this.f41021e = i10;
        this.f41019b = obj;
        this.h = l10;
        this.f41022f = z11;
    }
}
