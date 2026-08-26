package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda177 implements AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate {
    public final int $r8$classId;
    public final Runnable f$0;

    public ChatActivity$$ExternalSyntheticLambda177(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            case 1:
                this.f$0.run();
                break;
            case 2:
                alertDialog.dismiss();
                Runnable runnable = this.f$0;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 3:
                this.f$0.run();
                break;
            case 4:
                this.f$0.run();
                break;
            case 5:
                Runnable runnable2 = this.f$0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 6:
                Runnable runnable3 = this.f$0;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
            case 7:
                this.f$0.run();
                break;
            case 8:
                Runnable runnable4 = this.f$0;
                if (runnable4 != null) {
                    runnable4.run();
                }
                break;
            default:
                this.f$0.run();
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 9:
                this.f$0.run();
                break;
            case 10:
                this.f$0.run();
                break;
            case 11:
                this.f$0.run();
                break;
            case 12:
                this.f$0.run();
                break;
            case 13:
                this.f$0.run();
                break;
            default:
                this.f$0.run();
                break;
        }
        return true;
    }
}
