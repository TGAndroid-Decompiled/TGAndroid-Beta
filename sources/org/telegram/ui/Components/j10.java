package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class j10 implements org.telegram.ui.ActionBar.r0, le.k, org.telegram.ui.ActionBar.a2, mv0 {
    public final FragmentContextView f25166a;

    public j10(FragmentContextView fragmentContextView) {
        this.f25166a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.O0;
        this.f25166a.k(sharingLocationInfo);
    }

    @Override
    public void c(le.l lVar) {
        FragmentContextView fragmentContextView = this.f25166a;
        le.l lVar2 = fragmentContextView.M0;
        float f7 = 1.0f - lVar2.f14192a.d.f14185c.f14193a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f14179a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((u10) obj).f28512b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.f25166a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (n2Var instanceof org.telegram.ui.uy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f22270n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.O0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.O0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f25166a;
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
