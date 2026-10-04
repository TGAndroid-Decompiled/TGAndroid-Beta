package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class bt0 extends org.telegram.ui.Components.zq0 {
    public final FrameLayout X0;
    public final boolean Y0;
    public final PhotoViewer Z0;

    public bt0(PhotoViewer photoViewer, Context context, yn ynVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, ynVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.Z0 = photoViewer;
        this.X0 = frameLayout;
        this.Y0 = z10;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q21(this, this.X0, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Y0) {
            AndroidUtilities.runOnUIThread(new nl0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.Z0;
        photoViewer.f33891d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f34079y.getSystemService("window")).updateViewLayout(photoViewer.f33918g0, photoViewer.f33891d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
