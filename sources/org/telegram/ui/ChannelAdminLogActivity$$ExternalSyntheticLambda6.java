package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelAdminLogActivity f$0;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda6(ChannelAdminLogActivity channelAdminLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelAdminLogActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final ChannelAdminLogActivity channelAdminLogActivity = this.f$0;
                channelAdminLogActivity.getClass();
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    channelAdminLogActivity.lambda$loadMessages$3(tL_channels_adminLogResults);
                                    break;
                                default:
                                    channelAdminLogActivity.lambda$reloadLastMessages$0(tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                final ChannelAdminLogActivity channelAdminLogActivity2 = this.f$0;
                channelAdminLogActivity2.getClass();
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i2 = 1;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    channelAdminLogActivity2.lambda$loadMessages$3(tL_channels_adminLogResults2);
                                    break;
                                default:
                                    channelAdminLogActivity2.lambda$reloadLastMessages$0(tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                }
                break;
            case 2:
                ChannelAdminLogActivity channelAdminLogActivity3 = this.f$0;
                channelAdminLogActivity3.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (arrayList.get(i3) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i3));
                        }
                    }
                    channelAdminLogActivity3.getMessagesController().putUsers(arrayList2, false);
                }
                break;
            case 3:
                ChannelAdminLogActivity channelAdminLogActivity4 = this.f$0;
                channelAdminLogActivity4.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(7, channelAdminLogActivity4, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(this.f$0, tL_error, tLObject, 8));
                break;
        }
    }
}
