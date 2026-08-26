package org.telegram.ui.Stars;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class BotStarsController$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final BotStarsController f$0;

    public BotStarsController$$ExternalSyntheticLambda2(BotStarsController botStarsController, int i) {
        this.$r8$classId = i;
        this.f$0 = botStarsController;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final BotStarsController botStarsController = this.f$0;
                botStarsController.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                BotStarsController botStarsController2 = botStarsController;
                                botStarsController2.getClass();
                                botStarsController2.adminedChannels = new ArrayList();
                                botStarsController2.loadingAdminedChannels = false;
                                TLObject tLObject2 = tLObject;
                                boolean z = tLObject2 instanceof TLRPC.messages_Chats;
                                int i2 = botStarsController2.currentAccount;
                                if (z) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    MessagesController.getInstance(i2).putChats(messages_chats.chats, false);
                                    botStarsController2.adminedChannels.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                            default:
                                BotStarsController botStarsController3 = botStarsController;
                                botStarsController3.getClass();
                                botStarsController3.adminedBots = new ArrayList();
                                botStarsController3.loadingAdminedBots = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof Vector) {
                                    Vector vector = (Vector) tLObject3;
                                    for (int i3 = 0; i3 < vector.objects.size(); i3++) {
                                        botStarsController3.adminedBots.add((TLRPC.User) vector.objects.get(i3));
                                    }
                                    MessagesController.getInstance(botStarsController3.currentAccount).putUsers(botStarsController3.adminedBots, false);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final BotStarsController botStarsController2 = this.f$0;
                botStarsController2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                BotStarsController botStarsController3 = botStarsController2;
                                botStarsController3.getClass();
                                botStarsController3.adminedChannels = new ArrayList();
                                botStarsController3.loadingAdminedChannels = false;
                                TLObject tLObject2 = tLObject;
                                boolean z = tLObject2 instanceof TLRPC.messages_Chats;
                                int i3 = botStarsController3.currentAccount;
                                if (z) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    MessagesController.getInstance(i3).putChats(messages_chats.chats, false);
                                    botStarsController3.adminedChannels.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                            default:
                                BotStarsController botStarsController4 = botStarsController2;
                                botStarsController4.getClass();
                                botStarsController4.adminedBots = new ArrayList();
                                botStarsController4.loadingAdminedBots = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof Vector) {
                                    Vector vector = (Vector) tLObject3;
                                    for (int i4 = 0; i4 < vector.objects.size(); i4++) {
                                        botStarsController4.adminedBots.add((TLRPC.User) vector.objects.get(i4));
                                    }
                                    MessagesController.getInstance(botStarsController4.currentAccount).putUsers(botStarsController4.adminedBots, false);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
