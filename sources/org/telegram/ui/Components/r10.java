package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class r10 implements org.telegram.ui.ActionBar.s0, le.k, org.telegram.ui.ActionBar.c2, lv0 {
    public final FragmentContextView f26549a;

    public r10(FragmentContextView fragmentContextView) {
        this.f26549a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.M0;
        this.f26549a.k(sharingLocationInfo);
    }

    @Override
    public void e(le.l lVar) {
        FragmentContextView fragmentContextView = this.f26549a;
        le.l lVar2 = fragmentContextView.K0;
        float f7 = 1.0f - lVar2.f12892a.d.f12885c.f12893a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f12879a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            kh.c cVar = ((d20) obj).f22276b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        FragmentContextView fragmentContextView = this.f26549a;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        if (p2Var instanceof org.telegram.ui.wy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(p2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f21134n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.M0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.M0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f26549a;
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
