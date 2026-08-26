package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatActivity$$ExternalSyntheticLambda68 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final boolean[] f$0;

    public ChatActivity$$ExternalSyntheticLambda68(boolean[] zArr, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$parseMarkdownAsync$364(this.f$0, dialogInterface);
                break;
            default:
                LaunchActivity.lambda$runLinkRequest$82(this.f$0, dialogInterface);
                break;
        }
    }
}
