package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq0 extends org.telegram.ui.Components.op0 {
    public final FrameLayout R2;
    public final boolean S2;
    public final PhotoViewer T2;

    public oq0(PhotoViewer photoViewer, Context context, un unVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, unVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.T2 = photoViewer;
        this.R2 = frameLayout;
        this.S2 = z10;
    }

    @Override
    public final void L() {
        super.L();
        if (this.S2) {
            org.telegram.messenger.i0.h3(new mg0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.T2;
        photoViewer.f33461d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.f33487g0, photoViewer.f33461d0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.c11(this, this.R2, hVar, i10, 9), 250L);
    }
}
