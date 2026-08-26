package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.web.HttpGetFileTask;

public final class PhotoViewer$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;

    public PhotoViewer$6$$ExternalSyntheticLambda0(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f$0, this.f$1).commit();
                break;
            case 1:
                ((ArticleViewer) this.f$0).actionBar.backButtonDrawable.setRotation(this.f$1, true);
                break;
            case 2:
                Bulletin.AnonymousClass1 anonymousClass1 = (Bulletin.AnonymousClass1) this.f$0;
                if (anonymousClass1.layout.getTranslationX() == this.f$1) {
                    Bulletin.this.hide();
                }
                break;
            case 3:
                PrivateVideoPreviewDialogNew.AnonymousClass1 anonymousClass2 = (PrivateVideoPreviewDialogNew.AnonymousClass1) this.f$0;
                VoIPFragment.AnonymousClass24 anonymousClass24 = anonymousClass2.this$0;
                if (this.f$1 > 0.0f) {
                    int i = anonymousClass24.realCurrentPage;
                    if (i < 2) {
                        anonymousClass24.setCurrentPage(i + 1, true);
                    }
                } else {
                    int i2 = anonymousClass24.realCurrentPage;
                    if (i2 > 0) {
                        anonymousClass24.setCurrentPage(i2 - 1, true);
                    }
                }
                anonymousClass2.lockDragging = false;
                break;
            case 4:
                InviteContactsActivity.this.scrollView.smoothScrollTo(0, (int) this.f$1);
                break;
            default:
                ((HttpGetFileTask) this.f$0).progressCallback.run(Float.valueOf(this.f$1));
                break;
        }
    }
}
