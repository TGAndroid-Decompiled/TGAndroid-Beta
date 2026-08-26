package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda67 implements ContactAddActivity.ContactAddActivityDelegate, MessagesStorage.BooleanCallback {
    public final ProfileActivity f$0;
    public final TLRPC.User f$1;

    public ProfileActivity$$ExternalSyntheticLambda67(ProfileActivity profileActivity, TLRPC.User user) {
        this.f$0 = profileActivity;
        this.f$1 = user;
    }

    @Override
    public void didAddToContacts() {
        this.f$0.lambda$openAddToContact$119(this.f$1);
    }

    @Override
    public void run(boolean z) {
        this.f$0.lambda$onBlockContactClicked$51(this.f$1, z);
    }
}
