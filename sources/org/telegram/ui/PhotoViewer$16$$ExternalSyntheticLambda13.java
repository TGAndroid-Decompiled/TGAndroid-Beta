package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;

public final class PhotoViewer$16$$ExternalSyntheticLambda13 implements Utilities.Callback {
    public final int $r8$classId;
    public final ActionBar.ActionBarMenuOnItemClick f$0;
    public final boolean f$1;

    public PhotoViewer$16$$ExternalSyntheticLambda13(ActionBar.ActionBarMenuOnItemClick actionBarMenuOnItemClick, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarMenuOnItemClick;
        this.f$1 = z;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$1(this.f$1, uri);
                break;
            case 1:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$3(this.f$1, uri);
                break;
            default:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$9(this.f$1, uri);
                break;
        }
    }
}
