package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class u00 implements org.telegram.ui.ActionBar.s0, td.i, org.telegram.ui.ActionBar.b2, hu0 {
    public final FragmentContextView f32872a;

    public u00(FragmentContextView fragmentContextView) {
        this.f32872a = fragmentContextView;
    }

    @Override
    public void c(td.j jVar) {
        FragmentContextView fragmentContextView = this.f32872a;
        td.j jVar2 = fragmentContextView.G0;
        float f10 = 1.0f - jVar2.f47799a.d.f47790c.f47800a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f47783a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            tg.d dVar = ((f10) obj).f28229b;
            dVar.setAlpha(eVar.c());
            dVar.setScaleX(lerp);
            dVar.setScaleY(lerp);
        }
    }

    @Override
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.I0;
        this.f32872a.k(sharingLocationInfo);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        FragmentContextView fragmentContextView = this.f32872a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (o2Var instanceof org.telegram.ui.dy) {
            for (int i10 = 0; i10 < 4; i10++) {
                LocationController.getInstance(i10).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(o2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f26391n.a());
    }

    @Override
    public void i(int i9) {
        float[] fArr = FragmentContextView.I0;
        if (i9 >= 0) {
            float[] fArr2 = FragmentContextView.I0;
            if (i9 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f32872a;
                float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.R);
                float f10 = fArr2[i9];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
                if (playbackSpeed != f10) {
                    fragmentContextView.l(playbackSpeed, f10, false);
                }
            }
        }
    }

    @Override
    public void b() {
    }
}
