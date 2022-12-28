package org.telegram.p009ui;

import org.telegram.p009ui.ProfileActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ProfileActivity$30$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final ProfileActivity$30$$ExternalSyntheticLambda0 INSTANCE = new ProfileActivity$30$$ExternalSyntheticLambda0();

    private ProfileActivity$30$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ProfileActivity.C392930.lambda$onEmojiSelected$0(tLObject, tLRPC$TL_error);
    }
}
