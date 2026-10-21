package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class r10 implements org.telegram.ui.ActionBar.q0, ne.k, org.telegram.ui.ActionBar.a2, xv0 {
    public final FragmentContextView f29780a;

    public r10(FragmentContextView fragmentContextView) {
        this.f29780a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.Q0;
        this.f29780a.k(sharingLocationInfo);
    }

    @Override
    public void e(ne.l lVar) {
        FragmentContextView fragmentContextView = this.f29780a;
        ne.l lVar2 = fragmentContextView.O0;
        float f7 = 1.0f - lVar2.f17406a.d.f17399c.f17407a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f17393a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            mh.c cVar = ((d20) obj).f25314b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.f29780a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (n2Var instanceof org.telegram.ui.cy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f24228n.a());
    }

    @Override
    public void j(int i10) {
        float[] fArr = FragmentContextView.Q0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.Q0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f29780a;
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
