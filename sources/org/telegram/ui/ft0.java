package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ft0 extends org.telegram.ui.Components.hq0 {
    public final FrameLayout f36492b1;
    public final boolean f36493c1;
    public final PhotoViewer f36494d1;

    public ft0(PhotoViewer photoViewer, Context context, co coVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, coVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f36494d1 = photoViewer;
        this.f36492b1 = frameLayout;
        this.f36493c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r11(this, this.f36492b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f36493c1) {
            AndroidUtilities.runOnUIThread(new rl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f36494d1;
        photoViewer.f33566d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33754y.getSystemService("window")).updateViewLayout(photoViewer.f33593g0, photoViewer.f33566d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
