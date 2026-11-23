package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fp0 extends org.telegram.ui.Components.ap0 {
    public final FrameLayout V2;
    public final boolean W2;
    public final PhotoViewer X2;

    public fp0(PhotoViewer photoViewer, Context context, bn bnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, bnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.X2 = photoViewer;
        this.V2 = frameLayout;
        this.W2 = z10;
    }

    @Override
    public final void L() {
        super.L();
        if (this.W2) {
            org.telegram.messenger.g0.h3(new hf0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.X2;
        photoViewer.f43243e0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f43271h0, photoViewer.f43243e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.lp0(this, this.V2, hVar, i7, 16), 250L);
    }
}
