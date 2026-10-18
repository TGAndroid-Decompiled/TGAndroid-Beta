package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class os0 extends org.telegram.ui.Components.dr0 {
    public final FrameLayout f39859b1;
    public final boolean f39860c1;
    public final PhotoViewer f39861d1;

    public os0(PhotoViewer photoViewer, Context context, sn snVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, snVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f39861d1 = photoViewer;
        this.f39859b1 = frameLayout;
        this.f39860c1 = z10;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.az0(this, this.f39859b1, hVar, i10, 11), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f39860c1) {
            AndroidUtilities.runOnUIThread(new ek0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f39861d1;
        photoViewer.f33257d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33445y.getSystemService("window")).updateViewLayout(photoViewer.f33283g0, photoViewer.f33257d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
