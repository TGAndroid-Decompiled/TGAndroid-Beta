package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class gt0 extends org.telegram.ui.Components.hq0 {
    public final FrameLayout f33946b1;
    public final boolean f33947c1;
    public final PhotoViewer f33948d1;

    public gt0(PhotoViewer photoViewer, Context context, bo boVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, boVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f33948d1 = photoViewer;
        this.f33946b1 = frameLayout;
        this.f33947c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s11(this, this.f33946b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f33947c1) {
            AndroidUtilities.runOnUIThread(new pl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f33948d1;
        photoViewer.f30925d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31112y.getSystemService("window")).updateViewLayout(photoViewer.f30951g0, photoViewer.f30925d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
