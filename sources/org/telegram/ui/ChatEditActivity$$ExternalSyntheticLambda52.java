package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Stars.BotStarsController;

public final class ChatEditActivity$$ExternalSyntheticLambda52 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ChatEditActivity$$ExternalSyntheticLambda52(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                chatEditActivity.donePressed = false;
                chatEditActivity.progressDialog = null;
                chatEditActivity.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 1:
                ((ChangeUsernameActivity) this.f$0).lambda$saveName$11(this.f$1);
                break;
            case 2:
                ChatActivity.this.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 3:
                ((ChatActivityEnterView) this.f$0).parentFragment.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 4:
                ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(this.f$1, true);
                break;
            case 5:
                ((GroupCallActivity) this.f$0).accountInstance.getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 6:
                ((LanguageSelectActivity) this.f$0).lambda$createView$2(this.f$1);
                break;
            case 7:
                ((LocationActivity) this.f$0).getConnectionsManager().cancelRequest(this.f$1, true);
                break;
            case 8:
                ConnectionsManager.getInstance(((BotStarsController) this.f$0).currentAccount).cancelRequest(this.f$1, true);
                break;
            default:
                ((ThemeSetUrlActivity) this.f$0).lambda$saveTheme$13(this.f$1);
                break;
        }
    }
}
