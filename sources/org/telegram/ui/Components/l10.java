package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class l10 implements org.telegram.ui.ActionBar.s0, le.l, org.telegram.ui.ActionBar.b2, ov0 {
    public final FragmentContextView f25906a;

    public l10(FragmentContextView fragmentContextView) {
        this.f25906a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.P0;
        this.f25906a.k(sharingLocationInfo);
    }

    @Override
    public void c(le.m mVar) {
        FragmentContextView fragmentContextView = this.f25906a;
        le.m mVar2 = fragmentContextView.N0;
        float f7 = 1.0f - mVar2.f14225a.d.f14218c.f14226a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = mVar2.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f14212a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((x10) obj).f30233b;
            cVar.setAlpha(hVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        FragmentContextView fragmentContextView = this.f25906a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (o2Var instanceof org.telegram.ui.ty) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(o2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f22274n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.P0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.P0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f25906a;
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
