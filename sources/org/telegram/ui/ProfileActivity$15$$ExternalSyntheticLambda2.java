package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$15$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final ProfileActivity.AnonymousClass15 f$0;

    public ProfileActivity$15$$ExternalSyntheticLambda2(ProfileActivity.AnonymousClass15 anonymousClass15, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass15;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity.AnonymousClass15 anonymousClass15 = this.f$0;
                anonymousClass15.getClass();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ProfileActivity.this.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ProfileActivity$15$$ExternalSyntheticLambda2(anonymousClass15, 1));
                break;
            default:
                ProfileActivity.this.getMessagesController().loadAppConfig();
                break;
        }
    }
}
