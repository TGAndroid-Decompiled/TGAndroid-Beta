package org.telegram.ui.Stars;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class StarsController$GiftsCollections$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final StarsController.GiftsCollections f$0;

    public StarsController$GiftsCollections$$ExternalSyntheticLambda0(StarsController.GiftsCollections giftsCollections, int i) {
        this.$r8$classId = i;
        this.f$0 = giftsCollections;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final StarsController.GiftsCollections giftsCollections = this.f$0;
                giftsCollections.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        StarsController.GiftsCollections giftsCollections2 = giftsCollections;
                        int i2 = i;
                        giftsCollections2.getClass();
                        switch (i2) {
                            case 0:
                                boolean z = tLObject2 instanceof TL_stars.TL_starGiftCollections;
                                long j = giftsCollections2.dialogId;
                                int i3 = giftsCollections2.currentAccount;
                                if (z) {
                                    ArrayList arrayList = giftsCollections2.collections;
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    giftsCollections2.refilterCollections();
                                    int size = arrayList.size();
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj = arrayList.get(i4);
                                        i4++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        int i5 = tL_starGiftCollection.collection_id;
                                        HashMap map = giftsCollections2.gifts;
                                        if (((StarsController.GiftsList) map.get(Integer.valueOf(i5))) == null) {
                                            StarsController.GiftsList giftsList = new StarsController.GiftsList(i3, j, false);
                                            int i6 = tL_starGiftCollection.collection_id;
                                            giftsList.isCollection = true;
                                            giftsList.collectionId = i6;
                                            map.put(Integer.valueOf(i6), giftsList);
                                        }
                                    }
                                    giftsCollections2.loaded = true;
                                    giftsCollections2.loading = false;
                                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections2);
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    giftsCollections2.refilterCollections();
                                    giftsCollections2.loaded = true;
                                    giftsCollections2.loading = false;
                                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections2);
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iIndexOf = giftsCollections2.indexOf(tL_starGiftCollection2.collection_id);
                                    if (iIndexOf >= 0) {
                                        giftsCollections2.collections.set(iIndexOf, tL_starGiftCollection2);
                                    }
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iIndexOf2 = giftsCollections2.indexOf(tL_starGiftCollection3.collection_id);
                                    if (iIndexOf2 >= 0) {
                                        giftsCollections2.collections.set(iIndexOf2, tL_starGiftCollection3);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final StarsController.GiftsCollections giftsCollections2 = this.f$0;
                giftsCollections2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        StarsController.GiftsCollections giftsCollections3 = giftsCollections2;
                        int i3 = i2;
                        giftsCollections3.getClass();
                        switch (i3) {
                            case 0:
                                boolean z = tLObject2 instanceof TL_stars.TL_starGiftCollections;
                                long j = giftsCollections3.dialogId;
                                int i4 = giftsCollections3.currentAccount;
                                if (z) {
                                    ArrayList arrayList = giftsCollections3.collections;
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    giftsCollections3.refilterCollections();
                                    int size = arrayList.size();
                                    int i5 = 0;
                                    while (i5 < size) {
                                        Object obj = arrayList.get(i5);
                                        i5++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        int i6 = tL_starGiftCollection.collection_id;
                                        HashMap map = giftsCollections3.gifts;
                                        if (((StarsController.GiftsList) map.get(Integer.valueOf(i6))) == null) {
                                            StarsController.GiftsList giftsList = new StarsController.GiftsList(i4, j, false);
                                            int i7 = tL_starGiftCollection.collection_id;
                                            giftsList.isCollection = true;
                                            giftsList.collectionId = i7;
                                            map.put(Integer.valueOf(i7), giftsList);
                                        }
                                    }
                                    giftsCollections3.loaded = true;
                                    giftsCollections3.loading = false;
                                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections3);
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    giftsCollections3.refilterCollections();
                                    giftsCollections3.loaded = true;
                                    giftsCollections3.loading = false;
                                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections3);
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iIndexOf = giftsCollections3.indexOf(tL_starGiftCollection2.collection_id);
                                    if (iIndexOf >= 0) {
                                        giftsCollections3.collections.set(iIndexOf, tL_starGiftCollection2);
                                    }
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iIndexOf2 = giftsCollections3.indexOf(tL_starGiftCollection3.collection_id);
                                    if (iIndexOf2 >= 0) {
                                        giftsCollections3.collections.set(iIndexOf2, tL_starGiftCollection3);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final StarsController.GiftsCollections giftsCollections3 = this.f$0;
                giftsCollections3.getClass();
                final int i3 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        StarsController.GiftsCollections giftsCollections4 = giftsCollections3;
                        int i4 = i3;
                        giftsCollections4.getClass();
                        switch (i4) {
                            case 0:
                                boolean z = tLObject2 instanceof TL_stars.TL_starGiftCollections;
                                long j = giftsCollections4.dialogId;
                                int i5 = giftsCollections4.currentAccount;
                                if (z) {
                                    ArrayList arrayList = giftsCollections4.collections;
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    giftsCollections4.refilterCollections();
                                    int size = arrayList.size();
                                    int i6 = 0;
                                    while (i6 < size) {
                                        Object obj = arrayList.get(i6);
                                        i6++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        int i7 = tL_starGiftCollection.collection_id;
                                        HashMap map = giftsCollections4.gifts;
                                        if (((StarsController.GiftsList) map.get(Integer.valueOf(i7))) == null) {
                                            StarsController.GiftsList giftsList = new StarsController.GiftsList(i5, j, false);
                                            int i8 = tL_starGiftCollection.collection_id;
                                            giftsList.isCollection = true;
                                            giftsList.collectionId = i8;
                                            map.put(Integer.valueOf(i8), giftsList);
                                        }
                                    }
                                    giftsCollections4.loaded = true;
                                    giftsCollections4.loading = false;
                                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections4);
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    giftsCollections4.refilterCollections();
                                    giftsCollections4.loaded = true;
                                    giftsCollections4.loading = false;
                                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections4);
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iIndexOf = giftsCollections4.indexOf(tL_starGiftCollection2.collection_id);
                                    if (iIndexOf >= 0) {
                                        giftsCollections4.collections.set(iIndexOf, tL_starGiftCollection2);
                                    }
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iIndexOf2 = giftsCollections4.indexOf(tL_starGiftCollection3.collection_id);
                                    if (iIndexOf2 >= 0) {
                                        giftsCollections4.collections.set(iIndexOf2, tL_starGiftCollection3);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
