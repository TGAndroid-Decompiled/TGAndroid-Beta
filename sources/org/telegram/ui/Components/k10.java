package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class k10 implements org.telegram.ui.ActionBar.r0, le.l, org.telegram.ui.ActionBar.a2, bv0 {
    public final FragmentContextView f25458a;

    public k10(FragmentContextView fragmentContextView) {
        this.f25458a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.O0;
        this.f25458a.k(sharingLocationInfo);
    }

    @Override
    public void c(le.m mVar) {
        FragmentContextView fragmentContextView = this.f25458a;
        le.m mVar2 = fragmentContextView.M0;
        float f7 = 1.0f - mVar2.f13985a.d.f13978c.f13986a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = mVar2.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f13972a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((v10) obj).f28620b;
            cVar.setAlpha(hVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.f25458a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (n2Var instanceof org.telegram.ui.ry) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f22020n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.O0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.O0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f25458a;
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
