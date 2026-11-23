package org.telegram.messenger;

import android.util.LongSparseArray;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;
public final class z3 implements r10 {
    public final int f28288a;
    public final Object f28289b;
    public final Object f28290c;

    public z3(int i7, Object obj, Object obj2) {
        this.f28288a = i7;
        this.f28289b = obj;
        this.f28290c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z10;
        switch (this.f28288a) {
            case 0:
                f4 f4Var = (f4) this.f28289b;
                org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) this.f28290c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.g3(new w3(22, kpVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    ur messagesStorage = f4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new sq(7, messagesStorage, arrayList3));
                    f4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                    f4Var.getMessagesController().f4(tl_chatThemes.users, false);
                    f4Var.getMessagesController().Z3(tl_chatThemes.chats, false);
                    ArrayList<TLRPC.ChatTheme> arrayList4 = tl_chatThemes.themes;
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.ChatTheme chatTheme = arrayList4.get(i7);
                        i7++;
                        TLRPC.ChatTheme chatTheme2 = chatTheme;
                        if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                            arrayList2.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList2.size());
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(f4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList2.get(i10));
                        s3Var.p(0, null);
                        s3Var.p(1, null);
                        s3Var.n(0, null);
                        s3Var.n(1, null);
                        arrayList5.add(s3Var);
                    }
                    g0.g3(new gn(f4Var, tl_chatThemes, arrayList5, arrayList2, kpVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    g0.g3(new w3(23, f4Var, kpVar));
                    return;
                } else {
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f28290c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!((CancellationToken) this.f28289b).isCancellationRequested()) {
                    if (auth_authorization != null && tL_error2 == null) {
                        taskCompletionSource.trySetResult(auth_authorization);
                        return;
                    } else {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error2));
                        return;
                    }
                }
                return;
            case 2:
                final v9 v9Var = (v9) this.f28289b;
                final r10 r10Var = (r10) this.f28290c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = v9Var.f27337e;
                if (tL_StarGiftAuctionState != null) {
                    v9Var.getMessagesController().f4(tL_StarGiftAuctionState.users, false);
                    v9Var.getMessagesController().Z3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f28663id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f28663id, Boolean.TRUE);
                    v9Var.j(tL_StarGiftAuctionState.gift.f28663id, new y10() {
                        @Override
                        public final void a(Object obj3) {
                            v9 v9Var2 = v9.this;
                            v9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            v9Var2.d(tL_StarGiftAuctionState2.gift.f28663id).f26773c = (ArrayList) obj3;
                            v9Var2.f(tL_StarGiftAuctionState2.gift.f28663id, tL_StarGiftAuctionState2);
                            r10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    v9Var.f(tL_StarGiftAuctionState.gift.f28663id, tL_StarGiftAuctionState);
                }
                r10Var.a(tL_StarGiftAuctionState, tL_error3);
                return;
            case 3:
                np npVar = (np) this.f28289b;
                li.i0 i0Var = (li.i0) this.f28290c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    npVar.Z3(peerLinkRequests.chats, false);
                    npVar.f4(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i11);
                        i11++;
                        long j3 = -n5.o(communityPeerRequest.peer);
                        if (npVar.P0(j3) == null) {
                            npVar.b3(0, j3, true);
                        }
                    }
                    i0Var.a(peerLinkRequests, null);
                    return;
                }
                i0Var.a(null, tL_error4);
                return;
            case 4:
                np npVar2 = (np) this.f28289b;
                hi.s6 s6Var = (hi.s6) this.f28290c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    npVar2.Z3(messages_chats.chats, false);
                    npVar2.W7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                s6Var.a(arrayList);
                return;
            case 5:
                np npVar3 = (np) this.f28289b;
                org.telegram.ui.Components.tr trVar = (org.telegram.ui.Components.tr) this.f28290c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    npVar3.Z3(participantJoinedChats.chats, false);
                    npVar3.f4(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList7.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (npVar3.P0(longValue) == null) {
                            npVar3.b3(0, longValue, true);
                        }
                    }
                }
                trVar.a(participantJoinedChats, tL_error6);
                return;
            case 6:
                r10 r10Var2 = (r10) this.f28290c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) this.f28289b).dismiss();
                if (tL_error7 != null) {
                    r10Var2.a(null, tL_error7.text);
                    return;
                } else {
                    r10Var2.a(passkey, null);
                    return;
                }
            default:
                d10 d10Var = (d10) this.f28290c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                h10 h10Var = ((g10) this.f28289b).f24066i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error8 == null) {
                    z10 = true;
                } else {
                    h10Var.getClass();
                    z10 = false;
                }
                d10Var.a(Boolean.valueOf(z10));
                h10Var.getClass();
                return;
        }
    }
}
