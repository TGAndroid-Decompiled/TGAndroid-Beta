package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class gt0 extends org.telegram.ui.Components.vq0 {
    public final FrameLayout f33938b1;
    public final boolean f33939c1;
    public final PhotoViewer f33940d1;

    public gt0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f33940d1 = photoViewer;
        this.f33938b1 = frameLayout;
        this.f33939c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h21(this, this.f33938b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f33939c1) {
            AndroidUtilities.runOnUIThread(new sl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f33940d1;
        photoViewer.f31172d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31359y.getSystemService("window")).updateViewLayout(photoViewer.f31198g0, photoViewer.f31172d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
