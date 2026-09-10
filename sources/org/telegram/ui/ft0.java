package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ft0 extends org.telegram.ui.Components.sq0 {
    public final FrameLayout f32912b1;
    public final boolean f32913c1;
    public final PhotoViewer f32914d1;

    public ft0(PhotoViewer photoViewer, Context context, eo eoVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, eoVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f32914d1 = photoViewer;
        this.f32912b1 = frameLayout;
        this.f32913c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g21(this, this.f32912b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f32913c1) {
            AndroidUtilities.runOnUIThread(new ql0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f32914d1;
        photoViewer.f30040d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f30227y.getSystemService("window")).updateViewLayout(photoViewer.f30066g0, photoViewer.f30040d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
