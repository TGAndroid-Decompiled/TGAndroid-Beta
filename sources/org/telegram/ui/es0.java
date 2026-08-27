package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

public final class es0 extends org.telegram.ui.Components.sp0 {
    public final FrameLayout X0;
    public final boolean Y0;
    public final PhotoViewer Z0;

    public es0(PhotoViewer photoViewer, Context context, rn rnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, rnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.Z0 = photoViewer;
        this.X0 = frameLayout;
        this.Y0 = z10;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new xs(this, this.X0, hVar, i10, 8), 250L);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Y0) {
            AndroidUtilities.runOnUIThread(new zk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.Z0;
        photoViewer.Z.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f35800y.getSystemService("window")).updateViewLayout(photoViewer.f35601c0, photoViewer.Z);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
