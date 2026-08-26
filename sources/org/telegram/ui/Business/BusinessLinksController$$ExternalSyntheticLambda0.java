package org.telegram.ui.Business;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class BusinessLinksController$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final BusinessLinksController f$0;

    public BusinessLinksController$$ExternalSyntheticLambda0(BusinessLinksController businessLinksController, int i) {
        this.$r8$classId = i;
        this.f$0 = businessLinksController;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final BusinessLinksController businessLinksController = this.f$0;
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        BusinessLinksController businessLinksController2 = businessLinksController;
                        int i2 = i;
                        businessLinksController2.getClass();
                        switch (i2) {
                            case 0:
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    ArrayList arrayList = businessLinksController2.links;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    int i3 = businessLinksController2.currentAccount;
                                    MessagesController.getInstance(i3).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i3).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i3).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    businessLinksController2.saveToCache();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                businessLinksController2.loading = false;
                                businessLinksController2.loaded = true;
                                break;
                            default:
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    businessLinksController2.links.add(tL_businessChatLink);
                                    int i4 = businessLinksController2.currentAccount;
                                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    businessLinksController2.saveToCache();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final BusinessLinksController businessLinksController2 = this.f$0;
                businessLinksController2.getClass();
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        BusinessLinksController businessLinksController3 = businessLinksController2;
                        int i3 = i2;
                        businessLinksController3.getClass();
                        switch (i3) {
                            case 0:
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    ArrayList arrayList = businessLinksController3.links;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    int i4 = businessLinksController3.currentAccount;
                                    MessagesController.getInstance(i4).putUsers(businesschatlinks.users, false);
                                    MessagesController.getInstance(i4).putChats(businesschatlinks.chats, false);
                                    MessagesStorage.getInstance(i4).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    businessLinksController3.saveToCache();
                                } else {
                                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                                }
                                businessLinksController3.loading = false;
                                businessLinksController3.loaded = true;
                                break;
                            default:
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    businessLinksController3.links.add(tL_businessChatLink);
                                    int i5 = businessLinksController3.currentAccount;
                                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
                                    businessLinksController3.saveToCache();
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
