package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ft0 extends org.telegram.ui.Components.or0 {
    public final FrameLayout f37767b1;
    public final boolean f37768c1;
    public final PhotoViewer f37769d1;

    public ft0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f37769d1 = photoViewer;
        this.f37767b1 = frameLayout;
        this.f37768c1 = z10;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s21(this, this.f37767b1, iVar, i10, 10), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f37768c1) {
            AndroidUtilities.runOnUIThread(new sk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f37769d1;
        photoViewer.f33922d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f34110y.getSystemService("window")).updateViewLayout(photoViewer.f33949g0, photoViewer.f33922d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
