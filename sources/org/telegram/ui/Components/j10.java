package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class j10 implements org.telegram.ui.ActionBar.r0, le.k, org.telegram.ui.ActionBar.a2, av0 {
    public final FragmentContextView f27300a;

    public j10(FragmentContextView fragmentContextView) {
        this.f27300a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.M0;
        this.f27300a.k(sharingLocationInfo);
    }

    @Override
    public void e(le.l lVar) {
        FragmentContextView fragmentContextView = this.f27300a;
        le.l lVar2 = fragmentContextView.K0;
        float f7 = 1.0f - lVar2.f15395a.d.f15386c.f15396a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f15379a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            mh.c cVar = ((u10) obj).f30768b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.f27300a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (n2Var instanceof org.telegram.ui.uy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f23989n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.M0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.M0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f27300a;
                float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.V);
                float f7 = fArr2[i10];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.V, f7);
                if (playbackSpeed != f7) {
                    fragmentContextView.l(playbackSpeed, f7, false);
                }
            }
        }
    }

    @Override
    public void c() {
    }
}
