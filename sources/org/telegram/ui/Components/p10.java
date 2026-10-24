package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class p10 implements org.telegram.ui.ActionBar.q0, ne.k, org.telegram.ui.ActionBar.z1, zv0 {
    public final FragmentContextView f29447a;

    public p10(FragmentContextView fragmentContextView) {
        this.f29447a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.W0;
        this.f29447a.k(sharingLocationInfo);
    }

    @Override
    public void e(ne.l lVar) {
        FragmentContextView fragmentContextView = this.f29447a;
        ne.l lVar2 = fragmentContextView.U0;
        float f7 = 1.0f - lVar2.f17469a.d.f17462c.f17470a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f17456a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            mh.c cVar = ((b20) obj).f24879b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        FragmentContextView fragmentContextView = this.f29447a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (o2Var instanceof org.telegram.ui.ey) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(o2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f24374n.a());
    }

    @Override
    public void h(int i10) {
        float[] fArr = FragmentContextView.W0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f29447a;
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
    public void a() {
    }
}
