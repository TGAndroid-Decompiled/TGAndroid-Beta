package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ps0 extends org.telegram.ui.Components.ir0 {
    public final FrameLayout f40537e1;
    public final boolean f40538f1;
    public final PhotoViewer f40539g1;

    public ps0(PhotoViewer photoViewer, Context context, sn snVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, snVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f40539g1 = photoViewer;
        this.f40537e1 = frameLayout;
        this.f40538f1 = z10;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0(this, this.f40537e1, hVar, i10, 12), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f40538f1) {
            AndroidUtilities.runOnUIThread(new oj0(this, 18), 50L);
        }
        PhotoViewer photoViewer = this.f40539g1;
        photoViewer.f33571d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33759y.getSystemService("window")).updateViewLayout(photoViewer.f33597g0, photoViewer.f33571d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
