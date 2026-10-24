package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class os0 extends org.telegram.ui.Components.hr0 {
    public final FrameLayout f40248e1;
    public final boolean f40249f1;
    public final PhotoViewer f40250g1;

    public os0(PhotoViewer photoViewer, Context context, sn snVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, snVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f40250g1 = photoViewer;
        this.f40248e1 = frameLayout;
        this.f40249f1 = z10;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ez0(this, this.f40248e1, hVar, i10, 12), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f40249f1) {
            AndroidUtilities.runOnUIThread(new nj0(this, 18), 50L);
        }
        PhotoViewer photoViewer = this.f40250g1;
        photoViewer.f33573d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33761y.getSystemService("window")).updateViewLayout(photoViewer.f33599g0, photoViewer.f33573d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
