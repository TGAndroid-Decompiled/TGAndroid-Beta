package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

public final class x00 implements org.telegram.ui.ActionBar.r0, ud.i, org.telegram.ui.ActionBar.a2, ku0 {

    public final FragmentContextView f34411a;

    public x00(FragmentContextView fragmentContextView) {
        this.f34411a = fragmentContextView;
    }

    @Override
    public void c(ud.j jVar) {
        FragmentContextView fragmentContextView = this.f34411a;
        ud.j<ud.e> jVar2 = fragmentContextView.G0;
        float f10 = 1.0f - jVar2.f48521a.d.f48512c.f48522a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        for (ud.e eVar : jVar2) {
            float fC = eVar.c();
            Object obj = eVar.f48505a;
            float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, fC);
            ug.d dVar = ((i10) obj).f29199b;
            dVar.setAlpha(eVar.c());
            dVar.setScaleX(fLerp);
            dVar.setScaleY(fLerp);
        }
    }

    @Override
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.I0;
        this.f34411a.k(sharingLocationInfo);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.f34411a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (!(n2Var instanceof org.telegram.ui.gy)) {
            LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f26387n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override
    public void h(int i10) {
        float[] fArr = FragmentContextView.I0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.I0;
            if (i10 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.f34411a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.R);
            float f10 = fArr2[i10];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
            if (playbackSpeed != f10) {
                fragmentContextView.l(playbackSpeed, f10, false);
            }
        }
    }

    @Override
    public void b() {
    }
}
