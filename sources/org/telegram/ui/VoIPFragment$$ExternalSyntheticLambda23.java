package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class VoIPFragment$$ExternalSyntheticLambda23 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public VoIPFragment$$ExternalSyntheticLambda23(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPFragment) this.f$0).lambda$updateViewState$30((boolean[]) this.f$1, dialogInterface);
                break;
            case 1:
                ((SelectAnimatedEmojiDialog.SelectStatusDurationDialog) this.f$0).lambda$new$5((boolean[]) this.f$1, dialogInterface);
                break;
            case 2:
                ((ExternalActionActivity) this.f$0).lambda$handleIntent$8((TLRPC.TL_error) this.f$1, dialogInterface);
                break;
            case 3:
                ((LaunchActivity) this.f$0).lambda$showAlertDialog$141((AlertDialog) this.f$1, dialogInterface);
                break;
            case 4:
                PeerColorActivity.lambda$buy$8((boolean[]) this.f$1, (Utilities.Callback) this.f$0, dialogInterface);
                break;
            default:
                WebAppDisclaimerAlert.lambda$show$4((boolean[]) this.f$1, (Runnable) this.f$0, dialogInterface);
                break;
        }
    }

    public VoIPFragment$$ExternalSyntheticLambda23(int i, Object obj, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$1 = zArr;
        this.f$0 = obj;
    }
}
