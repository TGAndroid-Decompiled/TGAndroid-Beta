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
public final class z3 implements p10 {
    public final int f28349a;
    public final Object f28350b;
    public final Object f28351c;

    public z3(int i7, Object obj, Object obj2) {
        this.f28349a = i7;
        this.f28350b = obj;
        this.f28351c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z10;
        switch (this.f28349a) {
            case 0:
                f4 f4Var = (f4) this.f28350b;
                org.telegram.ui.Components.hp hpVar = (org.telegram.ui.Components.hp) this.f28351c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.g3(new w3(22, hpVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    tr messagesStorage = f4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new rq(7, messagesStorage, arrayList3));
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
                    g0.g3(new fn(f4Var, tl_chatThemes, arrayList5, arrayList2, hpVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    g0.g3(new w3(23, f4Var, hpVar));
                    return;
                } else {
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f28351c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!((CancellationToken) this.f28350b).isCancellationRequested()) {
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
                final u9 u9Var = (u9) this.f28350b;
                final p10 p10Var = (p10) this.f28351c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = u9Var.f27242e;
                if (tL_StarGiftAuctionState != null) {
                    u9Var.getMessagesController().f4(tL_StarGiftAuctionState.users, false);
                    u9Var.getMessagesController().Z3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f28721id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f28721id, Boolean.TRUE);
                    u9Var.j(tL_StarGiftAuctionState.gift.f28721id, new w10() {
                        @Override
                        public final void a(Object obj3) {
                            u9 u9Var2 = u9.this;
                            u9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            u9Var2.d(tL_StarGiftAuctionState2.gift.f28721id).f26660c = (ArrayList) obj3;
                            u9Var2.f(tL_StarGiftAuctionState2.gift.f28721id, tL_StarGiftAuctionState2);
                            p10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    u9Var.f(tL_StarGiftAuctionState.gift.f28721id, tL_StarGiftAuctionState);
                }
                p10Var.a(tL_StarGiftAuctionState, tL_error3);
                return;
            case 3:
                mp mpVar = (mp) this.f28350b;
                li.h0 h0Var = (li.h0) this.f28351c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    mpVar.Z3(peerLinkRequests.chats, false);
                    mpVar.f4(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i11);
                        i11++;
                        long j3 = -n5.o(communityPeerRequest.peer);
                        if (mpVar.P0(j3) == null) {
                            mpVar.b3(0, j3, true);
                        }
                    }
                    h0Var.a(peerLinkRequests, null);
                    return;
                }
                h0Var.a(null, tL_error4);
                return;
            case 4:
                mp mpVar2 = (mp) this.f28350b;
                hi.c7 c7Var = (hi.c7) this.f28351c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    mpVar2.Z3(messages_chats.chats, false);
                    mpVar2.W7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                c7Var.a(arrayList);
                return;
            case 5:
                mp mpVar3 = (mp) this.f28350b;
                org.telegram.ui.Components.qr qrVar = (org.telegram.ui.Components.qr) this.f28351c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    mpVar3.Z3(participantJoinedChats.chats, false);
                    mpVar3.f4(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList7.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (mpVar3.P0(longValue) == null) {
                            mpVar3.b3(0, longValue, true);
                        }
                    }
                }
                qrVar.a(participantJoinedChats, tL_error6);
                return;
            case 6:
                p10 p10Var2 = (p10) this.f28351c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) this.f28350b).dismiss();
                if (tL_error7 != null) {
                    p10Var2.a(null, tL_error7.text);
                    return;
                } else {
                    p10Var2.a(passkey, null);
                    return;
                }
            default:
                b10 b10Var = (b10) this.f28351c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                f10 f10Var = ((e10) this.f28350b).f23758i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error8 == null) {
                    z10 = true;
                } else {
                    f10Var.getClass();
                    z10 = false;
                }
                b10Var.a(Boolean.valueOf(z10));
                f10Var.getClass();
                return;
        }
    }
}
