package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SettingsActivity$$ExternalSyntheticLambda26 implements RequestDelegate {
    public final int $r8$classId;
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda26(SettingsActivity settingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                SettingsActivity settingsActivity = this.f$0;
                settingsActivity.getClass();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                settingsActivity.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new SettingsActivity$$ExternalSyntheticLambda26(settingsActivity, 1));
                break;
            default:
                this.f$0.getMessagesController().loadAppConfig();
                break;
        }
    }
}
