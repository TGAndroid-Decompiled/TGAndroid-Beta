package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class gt0 extends org.telegram.ui.Components.mr0 {
    public final FrameLayout f38105b1;
    public final boolean f38106c1;
    public final PhotoViewer f38107d1;

    public gt0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f38107d1 = photoViewer;
        this.f38105b1 = frameLayout;
        this.f38106c1 = z10;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.x21(this, this.f38105b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f38106c1) {
            AndroidUtilities.runOnUIThread(new tk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f38107d1;
        photoViewer.f33894d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f34082y.getSystemService("window")).updateViewLayout(photoViewer.f33921g0, photoViewer.f33894d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
