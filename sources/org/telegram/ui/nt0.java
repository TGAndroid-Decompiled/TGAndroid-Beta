package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class nt0 extends org.telegram.ui.Components.jr0 {
    public final FrameLayout f38795b1;
    public final boolean f38796c1;
    public final PhotoViewer f38797d1;

    public nt0(PhotoViewer photoViewer, Context context, fo foVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, foVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f38797d1 = photoViewer;
        this.f38795b1 = frameLayout;
        this.f38796c1 = z10;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m21(this, this.f38795b1, hVar, i10, 10), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f38796c1) {
            AndroidUtilities.runOnUIThread(new yk0(this, 17), 50L);
        }
        PhotoViewer photoViewer = this.f38797d1;
        photoViewer.f32217d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f32405y.getSystemService("window")).updateViewLayout(photoViewer.f32243g0, photoViewer.f32217d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
