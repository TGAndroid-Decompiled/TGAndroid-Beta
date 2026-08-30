package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ks0 extends org.telegram.ui.Components.lq0 {
    public final FrameLayout Y0;
    public final boolean Z0;
    public final PhotoViewer f35806a1;

    public ks0(PhotoViewer photoViewer, Context context, xn xnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z4) {
        super(context, xnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f35806a1 = photoViewer;
        this.Y0 = frameLayout;
        this.Z0 = z4;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ct(this, this.Y0, hVar, i10, 8), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Z0) {
            AndroidUtilities.runOnUIThread(new el0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f35806a1;
        photoViewer.f31696a0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31913y.getSystemService("window")).updateViewLayout(photoViewer.f31723d0, photoViewer.f31696a0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
