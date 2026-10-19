package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ms0 extends org.telegram.ui.Components.er0 {
    public final FrameLayout f39338c1;
    public final boolean f39339d1;
    public final PhotoViewer f39340e1;

    public ms0(PhotoViewer photoViewer, Context context, qn qnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, qnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f39340e1 = photoViewer;
        this.f39338c1 = frameLayout;
        this.f39339d1 = z10;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bz0(this, this.f39338c1, hVar, i10, 11), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f39339d1) {
            AndroidUtilities.runOnUIThread(new ck0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f39340e1;
        photoViewer.f33263d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33451y.getSystemService("window")).updateViewLayout(photoViewer.f33289g0, photoViewer.f33263d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
