package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class l10 implements org.telegram.ui.ActionBar.q0, le.l, org.telegram.ui.ActionBar.z1, nv0 {
    public final FragmentContextView f25902a;

    public l10(FragmentContextView fragmentContextView) {
        this.f25902a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.O0;
        this.f25902a.k(sharingLocationInfo);
    }

    @Override
    public void c(le.m mVar) {
        FragmentContextView fragmentContextView = this.f25902a;
        le.m mVar2 = fragmentContextView.M0;
        float f7 = 1.0f - mVar2.f14223a.d.f14216c.f14224a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = mVar2.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f14210a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((w10) obj).f29824b;
            cVar.setAlpha(hVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        FragmentContextView fragmentContextView = this.f25902a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (m2Var instanceof org.telegram.ui.qy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(m2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f22271n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.O0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.O0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f25902a;
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
    public void a() {
    }
}
