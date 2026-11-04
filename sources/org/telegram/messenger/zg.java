package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg implements RequestDelegate {
    public final int f26806a;
    public final li f26807b;

    public zg(li liVar, int i3) {
        this.f26806a = i3;
        this.f26807b = liVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26806a) {
            case 0:
                li liVar = this.f26807b;
                if (tL_error != null) {
                    g0.h3(new xf(liVar, 10));
                    return;
                }
                liVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                g0.h3(new xf(liVar, 11));
                return;
            case 1:
                final li liVar2 = this.f26807b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        li liVar3 = liVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar4 = liVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar4.getUserConfig().f22839e0 = tL_messages_stickerSet.set.short_name;
                                    liVar4.getUserConfig().f22844i0 = System.currentTimeMillis();
                                    liVar4.getUserConfig().v(false);
                                    liVar4.s1(liVar4.getUserConfig().f22839e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (liVar4.currentAccount == h10.f22829t0) {
                                            liVar4.l1(ac.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                liVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar3.getMessagesStorage().f24934a.c(new xf(liVar3, 12));
                                    liVar3.f24025g0[0].clear();
                                    hs.f(liVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar5 = liVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar5.getUserConfig().f22841f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar5.getUserConfig().f22845j0 = System.currentTimeMillis();
                                    liVar5.getUserConfig().v(false);
                                    liVar5.s1(liVar5.getUserConfig().f22841f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                liVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar2;
                                    liVar6.getUserConfig().f22836c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().f22842g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().f22836c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                liVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar3.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar2;
                                    liVar7.getUserConfig().f22837d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().f22843h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().f22837d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                g0.h3(new fg(this.f26807b, tL_error, tLObject, 0));
                return;
            case 3:
                final li liVar3 = this.f26807b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        li liVar32 = liVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar4 = liVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar4.getUserConfig().f22839e0 = tL_messages_stickerSet.set.short_name;
                                    liVar4.getUserConfig().f22844i0 = System.currentTimeMillis();
                                    liVar4.getUserConfig().v(false);
                                    liVar4.s1(liVar4.getUserConfig().f22839e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (liVar4.currentAccount == h10.f22829t0) {
                                            liVar4.l1(ac.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                liVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().f24934a.c(new xf(liVar32, 12));
                                    liVar32.f24025g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar5 = liVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar5.getUserConfig().f22841f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar5.getUserConfig().f22845j0 = System.currentTimeMillis();
                                    liVar5.getUserConfig().v(false);
                                    liVar5.s1(liVar5.getUserConfig().f22841f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                liVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar3;
                                    liVar6.getUserConfig().f22836c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().f22842g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().f22836c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar3;
                                    liVar7.getUserConfig().f22837d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().f22843h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().f22837d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                final li liVar4 = this.f26807b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        li liVar32 = liVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().f22839e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().f22844i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().f22839e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (liVar42.currentAccount == h10.f22829t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                liVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().f24934a.c(new xf(liVar32, 12));
                                    liVar32.f24025g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar5 = liVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar5.getUserConfig().f22841f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar5.getUserConfig().f22845j0 = System.currentTimeMillis();
                                    liVar5.getUserConfig().v(false);
                                    liVar5.s1(liVar5.getUserConfig().f22841f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                liVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar4;
                                    liVar6.getUserConfig().f22836c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().f22842g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().f22836c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar4;
                                    liVar7.getUserConfig().f22837d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().f22843h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().f22837d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                final li liVar5 = this.f26807b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        li liVar32 = liVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().f22839e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().f22844i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().f22839e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (liVar42.currentAccount == h10.f22829t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                liVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().f24934a.c(new xf(liVar32, 12));
                                    liVar32.f24025g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar52 = liVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar52.getUserConfig().f22841f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar52.getUserConfig().f22845j0 = System.currentTimeMillis();
                                    liVar52.getUserConfig().v(false);
                                    liVar52.s1(liVar52.getUserConfig().f22841f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                liVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar5;
                                    liVar6.getUserConfig().f22836c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().f22842g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().f22836c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar5;
                                    liVar7.getUserConfig().f22837d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().f22843h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().f22837d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    g0.h3(new uf(this.f26807b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    return;
                }
                return;
            case 7:
                final li liVar6 = this.f26807b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        li liVar32 = liVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().f22839e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().f22844i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().f22839e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (liVar42.currentAccount == h10.f22829t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                liVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().f24934a.c(new xf(liVar32, 12));
                                    liVar32.f24025g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar52 = liVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar52.getUserConfig().f22841f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar52.getUserConfig().f22845j0 = System.currentTimeMillis();
                                    liVar52.getUserConfig().v(false);
                                    liVar52.s1(liVar52.getUserConfig().f22841f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                liVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar62 = liVar6;
                                    liVar62.getUserConfig().f22836c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar62.getUserConfig().f22842g0 = System.currentTimeMillis();
                                    liVar62.getUserConfig().v(false);
                                    liVar62.s1(liVar62.getUserConfig().f22836c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar62.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar6;
                                    liVar7.getUserConfig().f22837d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().f22843h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().f22837d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                final li liVar7 = this.f26807b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        li liVar32 = liVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().f22839e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().f22844i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().f22839e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (liVar42.currentAccount == h10.f22829t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                liVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().f24934a.c(new xf(liVar32, 12));
                                    liVar32.f24025g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar52 = liVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar52.getUserConfig().f22841f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar52.getUserConfig().f22845j0 = System.currentTimeMillis();
                                    liVar52.getUserConfig().v(false);
                                    liVar52.s1(liVar52.getUserConfig().f22841f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                liVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar62 = liVar7;
                                    liVar62.getUserConfig().f22836c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar62.getUserConfig().f22842g0 = System.currentTimeMillis();
                                    liVar62.getUserConfig().v(false);
                                    liVar62.s1(liVar62.getUserConfig().f22836c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar62.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar72 = liVar7;
                                    liVar72.getUserConfig().f22837d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar72.getUserConfig().f22843h0 = System.currentTimeMillis();
                                    liVar72.getUserConfig().v(false);
                                    liVar72.s1(liVar72.getUserConfig().f22837d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar72.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                li liVar8 = this.f26807b;
                liVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    liVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
