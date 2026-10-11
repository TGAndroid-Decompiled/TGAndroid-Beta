package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
public final class a20 implements org.telegram.ui.ActionBar.q0, me.k, org.telegram.ui.ActionBar.z1, gw0 {
    public final FragmentContextView f24416a;

    public a20(FragmentContextView fragmentContextView) {
        this.f24416a = fragmentContextView;
    }

    @Override
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.Q0;
        this.f24416a.k(sharingLocationInfo);
    }

    @Override
    public void c(me.l lVar) {
        FragmentContextView fragmentContextView = this.f24416a;
        me.l lVar2 = fragmentContextView.O0;
        float f7 = 1.0f - lVar2.f16392a.d.f16383c.f16393a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16376a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((m20) obj).f28516b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        FragmentContextView fragmentContextView = this.f24416a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (m2Var instanceof org.telegram.ui.sy) {
            for (int i11 = 0; i11 < 4; i11++) {
                LocationController.getInstance(i11).removeAllLocationSharings();
            }
            return;
        }
        LocationController.getInstance(m2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.f24171n.a());
    }

    @Override
    public void m(int i10) {
        float[] fArr = FragmentContextView.Q0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.Q0;
            if (i10 < 6) {
                MediaController mediaController = MediaController.getInstance();
                FragmentContextView fragmentContextView = this.f24416a;
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
