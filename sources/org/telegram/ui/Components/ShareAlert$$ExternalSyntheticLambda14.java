package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;

public final class ShareAlert$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final ShareAlert f$0;

    public ShareAlert$$ExternalSyntheticLambda14(ShareAlert shareAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = shareAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ShareAlert shareAlert = this.f$0;
                shareAlert.updateSearchAdapter = true;
                FragmentSearchField fragmentSearchField = shareAlert.searchView;
                fragmentSearchField.editText.setText("");
                AndroidUtilities.showKeyboard(fragmentSearchField.editText);
                break;
            default:
                QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1 = new QrActivity$5$$ExternalSyntheticLambda1(4);
                ShareAlert shareAlert2 = this.f$0;
                if (!shareAlert2.isKeyboardVisible()) {
                    qrActivity$5$$ExternalSyntheticLambda1.run();
                } else {
                    FragmentSearchField fragmentSearchField2 = shareAlert2.searchView;
                    if (fragmentSearchField2 != null) {
                        AndroidUtilities.hideKeyboard(fragmentSearchField2.editText);
                    }
                    AndroidUtilities.runOnUIThread(qrActivity$5$$ExternalSyntheticLambda1, 300L);
                }
                break;
        }
    }
}
