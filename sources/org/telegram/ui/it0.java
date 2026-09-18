package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class it0 extends org.telegram.ui.Components.iq0 {
    public final FrameLayout f34687b1;
    public final boolean f34688c1;
    public final PhotoViewer f34689d1;

    public it0(PhotoViewer photoViewer, Context context, bo boVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, boVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f34689d1 = photoViewer;
        this.f34687b1 = frameLayout;
        this.f34688c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t11(this, this.f34687b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f34688c1) {
            AndroidUtilities.runOnUIThread(new sl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f34689d1;
        photoViewer.f30945d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31132y.getSystemService("window")).updateViewLayout(photoViewer.f30971g0, photoViewer.f30945d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
