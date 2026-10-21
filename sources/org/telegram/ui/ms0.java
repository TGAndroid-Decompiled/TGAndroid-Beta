package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class ms0 extends org.telegram.ui.Components.fr0 {
    public final FrameLayout f39344c1;
    public final boolean f39345d1;
    public final PhotoViewer f39346e1;

    public ms0(PhotoViewer photoViewer, Context context, qn qnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, qnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f39346e1 = photoViewer;
        this.f39344c1 = frameLayout;
        this.f39345d1 = z10;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cz0(this, this.f39344c1, hVar, i10, 11), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f39345d1) {
            AndroidUtilities.runOnUIThread(new ck0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f39346e1;
        photoViewer.f33270d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f33458y.getSystemService("window")).updateViewLayout(photoViewer.f33296g0, photoViewer.f33270d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
