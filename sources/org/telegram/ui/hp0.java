package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hp0 extends org.telegram.ui.Components.mo0 {
    public final FrameLayout U2;
    public final boolean V2;
    public final PhotoViewer W2;

    public hp0(PhotoViewer photoViewer, Context context, cn cnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z9) {
        super(context, cnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z9;
    }

    @Override
    public final void K() {
        super.K();
        if (this.V2) {
            org.telegram.messenger.g0.i3(new hf0(this, 20), 50L);
        }
        PhotoViewer photoViewer = this.W2;
        photoViewer.f41373d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.f41401g0, photoViewer.f41373d0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.pp0(this, this.U2, hVar, i7, 14), 250L);
    }
}
