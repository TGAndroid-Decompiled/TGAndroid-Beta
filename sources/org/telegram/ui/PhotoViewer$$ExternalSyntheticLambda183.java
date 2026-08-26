package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PhotoViewer$$ExternalSyntheticLambda183 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public PhotoViewer$$ExternalSyntheticLambda183(DialogsActivity.AnonymousClass30 anonymousClass30, AlertDialog alertDialog, long j, BaseFragment[] baseFragmentArr) {
        this.f$0 = anonymousClass30;
        this.f$1 = alertDialog;
        this.f$3 = j;
        this.f$2 = baseFragmentArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$25((String) this.f$1, (MediaController.PhotoEntry) this.f$2, this.f$3, (Bitmap) obj);
                break;
            default:
                ((DialogsActivity.AnonymousClass30) this.f$0).lambda$didFinishChatCreation$10((AlertDialog) this.f$1, this.f$3, (BaseFragment[]) this.f$2, (Runnable) obj);
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda183(PhotoViewer photoViewer, String str, MediaController.PhotoEntry photoEntry, long j) {
        this.f$0 = photoViewer;
        this.f$1 = str;
        this.f$2 = photoEntry;
        this.f$3 = j;
    }
}
