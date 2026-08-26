package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.StoriesController;

public final class LocationActivity$$ExternalSyntheticLambda44 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public LocationActivity$$ExternalSyntheticLambda44(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LocationActivity locationActivity = (LocationActivity) this.f$0;
                locationActivity.getClass();
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(locationActivity, tLObject, this.f$1, 21));
                }
                break;
            case 1:
                ((ContactsController) this.f$0).lambda$loadContacts$28(this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((LocationController) this.f$0).lambda$loadLiveLocations$26(this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((SavedMessagesController) this.f$0).lambda$hasSavedMessages$15(this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((SecretChatHelper) this.f$0).lambda$declineSecretChat$20(this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((SendMessagesHelper) this.f$0).lambda$sendGame$47(this.f$1, tLObject, tL_error);
                break;
            default:
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(storiesController, this.f$1, tLObject, 26));
                break;
        }
    }
}
