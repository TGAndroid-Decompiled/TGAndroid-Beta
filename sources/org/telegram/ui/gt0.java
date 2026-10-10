package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class gt0 extends org.telegram.ui.Components.nr0 {
    public final FrameLayout f38149b1;
    public final boolean f38150c1;
    public final PhotoViewer f38151d1;

    public gt0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f38151d1 = photoViewer;
        this.f38149b1 = frameLayout;
        this.f38150c1 = z10;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r21(this, this.f38149b1, iVar, i10, 10), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f38150c1) {
            AndroidUtilities.runOnUIThread(new tk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f38151d1;
        photoViewer.f33932d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f34120y.getSystemService("window")).updateViewLayout(photoViewer.f33959g0, photoViewer.f33932d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
