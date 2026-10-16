package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class v10 implements org.telegram.ui.ActionBar.q0, ne.k, org.telegram.ui.ActionBar.z1, aw0 {
    public final FragmentContextView f29532a;

    public v10(FragmentContextView fragmentContextView) {
        this.f29532a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.Q0;
        this.f29532a.k(sharingLocationInfo);
    }

    @Override
    public void e(ne.l lVar) {
        FragmentContextView fragmentContextView = this.f29532a;
        ne.l lVar2 = fragmentContextView.O0;
        float f7 = 1.0f - lVar2.f16026a.d.f16019c.f16027a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16013a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            mh.c cVar = ((h20) obj).f25159b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        FragmentContextView fragmentContextView = this.f29532a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (m2Var instanceof org.telegram.ui.yy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(m2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f22869n.a());
    }

    @Override
    public void k(int i10) {
        float[] fArr = FragmentContextView.Q0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.Q0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f29532a;
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
    public void c() {
    }
}
