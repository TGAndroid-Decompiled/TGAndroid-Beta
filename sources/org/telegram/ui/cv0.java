package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class cv0 implements org.telegram.messenger.r20 {
    public final int f36424a = 0;
    public final boolean f36425b;
    public final String f36426c;
    public final org.telegram.messenger.vs d;
    public final Object e;
    public final Object f36427f;
    public final Object f36428g;

    public cv0(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.d = profileActivity;
        this.e = channelParticipant;
        this.f36427f = user;
        this.f36428g = chatParticipant;
        this.f36425b = z10;
        this.f36426c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i10 = this.f36424a;
        Object obj2 = this.f36428g;
        Object obj3 = this.f36427f;
        Object obj4 = this.e;
        org.telegram.messenger.vs vsVar = this.d;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) vsVar;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj2;
                Integer num = (Integer) obj;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                boolean z11 = this.f36425b;
                if (channelParticipant != null) {
                    profileActivity.O4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.O4(num.intValue(), user, chatParticipant, null, null, this.f36426c, z11);
                    return;
                }
            default:
                g31 g31Var = (g31) vsVar;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i11 = g31Var.V;
                boolean z12 = this.f36425b;
                String str = this.f36426c;
                if (z12) {
                    ArrayList s02 = org.telegram.messenger.vi.b0(i11).s0(5);
                    for (int i12 = 0; i12 < s02.size(); i12++) {
                        if (((TLRPC.TL_messages_stickerSet) s02.get(i12)).documents != null && (arrayList2 = ((TLRPC.TL_messages_stickerSet) s02.get(i12)).documents) != null) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                String V = org.telegram.messenger.kj.V(arrayList2.get(i13), null, null);
                                long j10 = arrayList2.get(i13).f19800id;
                                if (V != null && !linkedHashSet.contains(Long.valueOf(j10)) && str.contains(V.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = org.telegram.messenger.vi.b0(i11).f18674s0[1];
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        if ((arrayList4.get(i14) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i14)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) arrayList4.get(i14)).documents) != null) {
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                String V2 = org.telegram.messenger.kj.V(arrayList.get(i15), null, null);
                                long j11 = arrayList.get(i15).f19800id;
                                if (V2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str.contains(V2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i11);
                String[] strArr = g31.f37284b2;
                f1.a aVar = new f1.a(g31Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (g31Var.W == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b02.V(strArr, str, false, aVar, true, z10, false, false, 30);
                return;
        }
    }

    public cv0(g31 g31Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.d = g31Var;
        this.f36425b = z10;
        this.e = linkedHashSet;
        this.f36426c = str;
        this.f36427f = hashMap;
        this.f36428g = arrayList;
    }
}
