package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cp0 extends org.telegram.ui.Components.po0 {
    public final FrameLayout V2;
    public final boolean W2;
    public final PhotoViewer X2;

    public cp0(PhotoViewer photoViewer, Context context, an anVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, anVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.X2 = photoViewer;
        this.V2 = frameLayout;
        this.W2 = z10;
    }

    @Override
    public final void L() {
        super.L();
        if (this.W2) {
            org.telegram.messenger.g0.i3(new ef0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.X2;
        photoViewer.f42753e0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f42781h0, photoViewer.f42753e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.sp0(this, this.V2, hVar, i7, 14), 250L);
    }
}
