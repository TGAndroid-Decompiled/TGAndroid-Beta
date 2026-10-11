package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ft0 extends org.telegram.ui.Components.nr0 {
    public final FrameLayout f37801b1;
    public final boolean f37802c1;
    public final PhotoViewer f37803d1;

    public ft0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f37803d1 = photoViewer;
        this.f37801b1 = frameLayout;
        this.f37802c1 = z10;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r21(this, this.f37801b1, iVar, i10, 10), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f37802c1) {
            AndroidUtilities.runOnUIThread(new sk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f37803d1;
        photoViewer.f33956d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f34144y.getSystemService("window")).updateViewLayout(photoViewer.f33983g0, photoViewer.f33956d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
