package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class it0 extends org.telegram.ui.Components.sr0 {
    public final FrameLayout f38995b1;
    public final boolean f38996c1;
    public final PhotoViewer f38997d1;

    public it0(PhotoViewer photoViewer, Context context, eo eoVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, eoVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f38997d1 = photoViewer;
        this.f38995b1 = frameLayout;
        this.f38996c1 = z10;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w21(this, this.f38995b1, iVar, i10, 10), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f38996c1) {
            AndroidUtilities.runOnUIThread(new uk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f38997d1;
        photoViewer.f33733d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33921y.getSystemService("window")).updateViewLayout(photoViewer.f33760g0, photoViewer.f33733d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
