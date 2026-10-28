package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class t10 implements org.telegram.ui.ActionBar.r0, oe.k, org.telegram.ui.ActionBar.b2, ew0 {
    public final FragmentContextView f32805a;

    public t10(FragmentContextView fragmentContextView) {
        this.f32805a = fragmentContextView;
    }

    @Override
    public void b(oe.l lVar) {
        FragmentContextView fragmentContextView = this.f32805a;
        oe.l lVar2 = fragmentContextView.U0;
        float f7 = 1.0f - lVar2.f19349a.d.f19342c.f19350a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f19336a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            nh.c cVar = ((f20) obj).f27983b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.W0;
        this.f32805a.k(sharingLocationInfo);
    }

    @Override
    public void g(int i10) {
        float[] fArr = FragmentContextView.W0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f32805a;
                float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.W);
                float f7 = fArr2[i10];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.W, f7);
                if (playbackSpeed != f7) {
                    fragmentContextView.l(playbackSpeed, f7, false);
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        FragmentContextView fragmentContextView = this.f32805a;
        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
        if (r2Var instanceof org.telegram.ui.ey) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(r2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f26168n.a());
    }

    @Override
    public void a() {
    }
}
