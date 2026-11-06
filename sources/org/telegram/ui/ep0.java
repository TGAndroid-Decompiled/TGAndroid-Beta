package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ep0 extends org.telegram.ui.Components.mo0 {
    public final FrameLayout R2;
    public final boolean S2;
    public final PhotoViewer T2;

    public ep0(PhotoViewer photoViewer, Context context, an anVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z9) {
        super(context, anVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.T2 = photoViewer;
        this.R2 = frameLayout;
        this.S2 = z9;
    }

    @Override
    public final void K() {
        super.K();
        if (this.S2) {
            org.telegram.messenger.g0.i3(new ef0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.T2;
        photoViewer.f41372d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.f41400g0, photoViewer.f41372d0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.pp0(this, this.R2, hVar, i7, 14), 250L);
    }
}
