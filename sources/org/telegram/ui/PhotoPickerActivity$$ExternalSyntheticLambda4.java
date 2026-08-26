package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PhotoPickerActivity$$ExternalSyntheticLambda4 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final int f$2;
    public final boolean f$3;
    public final TLRPC.User f$4;

    public PhotoPickerActivity$$ExternalSyntheticLambda4(MessagesController messagesController, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.f$0 = messagesController;
        this.f$2 = i;
        this.f$1 = chat;
        this.f$4 = user;
        this.f$3 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.f$0;
                photoPickerActivity.getClass();
                AndroidUtilities.runOnUIThread(new PhotoPickerActivity$$ExternalSyntheticLambda9(photoPickerActivity, (String) this.f$1, this.f$2, tLObject, this.f$3, this.f$4));
                break;
            default:
                ((MessagesController) this.f$0).lambda$pinMessage$130(this.f$2, (TLRPC.Chat) this.f$1, this.f$4, this.f$3, tLObject, tL_error);
                break;
        }
    }

    public PhotoPickerActivity$$ExternalSyntheticLambda4(PhotoPickerActivity photoPickerActivity, String str, int i, boolean z, TLRPC.User user) {
        this.f$0 = photoPickerActivity;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = user;
    }
}
