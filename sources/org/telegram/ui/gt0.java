package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class gt0 extends org.telegram.ui.Components.uq0 {
    public final FrameLayout f33974b1;
    public final boolean f33975c1;
    public final PhotoViewer f33976d1;

    public gt0(PhotoViewer photoViewer, Context context, zn znVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, znVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.f33976d1 = photoViewer;
        this.f33974b1 = frameLayout;
        this.f33975c1 = z10;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g21(this, this.f33974b1, iVar, i10, 9), 250L);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f33975c1) {
            AndroidUtilities.runOnUIThread(new sl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.f33976d1;
        photoViewer.f31212d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.f31399y.getSystemService("window")).updateViewLayout(photoViewer.f31238g0, photoViewer.f31212d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
