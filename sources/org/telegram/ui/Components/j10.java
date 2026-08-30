package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class j10 implements org.telegram.ui.ActionBar.s0, xd.i, org.telegram.ui.ActionBar.c2, bv0 {
    public final FragmentContextView f25852a;

    public j10(FragmentContextView fragmentContextView) {
        this.f25852a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.J0;
        this.f25852a.k(sharingLocationInfo);
    }

    @Override
    public void e(xd.j jVar) {
        FragmentContextView fragmentContextView = this.f25852a;
        xd.j jVar2 = fragmentContextView.H0;
        float f10 = 1.0f - jVar2.f46912a.d.f46905c.f46913a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.f46899a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            yg.c cVar = ((u10) obj).f29088b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        FragmentContextView fragmentContextView = this.f25852a;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        if (p2Var instanceof org.telegram.ui.oy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(p2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f23039n.a());
    }

    @Override
    public void l(int i10) {
        float[] fArr = FragmentContextView.J0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.J0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f25852a;
                float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.S);
                float f10 = fArr2[i10];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.S, f10);
                if (playbackSpeed != f10) {
                    fragmentContextView.l(playbackSpeed, f10, false);
                }
            }
        }
    }

    @Override
    public void a() {
    }
}
