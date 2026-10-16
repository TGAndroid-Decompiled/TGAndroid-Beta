package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class mt0 extends org.telegram.ui.Components.ir0 {
    public final FrameLayout f38068b1;
    public final boolean f38069c1;
    public final PhotoViewer f38070d1;

    public mt0(PhotoViewer photoViewer, Context context, fo foVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, foVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f38070d1 = photoViewer;
        this.f38068b1 = frameLayout;
        this.f38069c1 = z10;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n21(this, this.f38068b1, hVar, i10, 10), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f38069c1) {
            AndroidUtilities.runOnUIThread(new xk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f38070d1;
        photoViewer.f31919d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f32107y.getSystemService("window")).updateViewLayout(photoViewer.f31945g0, photoViewer.f31919d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
