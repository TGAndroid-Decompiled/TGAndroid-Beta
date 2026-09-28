package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class o10 implements View.OnLongClickListener {
    public final int f26905a;
    public final Object f26906b;

    public o10(Object obj, int i10) {
        this.f26905a = i10;
        this.f26906b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f26905a;
        Object obj = this.f26906b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.P0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, fragmentContextView.f22275p0));
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.H;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.wn;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f18746f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f18746f = null;
                }
                fragmentContextView.F.B(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                fragmentContextView.F.N();
                fragmentContextView.r(false);
                fragmentContextView.F.setDimMenu(0.3f);
                fragmentContextView.F.M(fragmentContextView.H, null);
                fragmentContextView.F.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.P0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController mediaController = MediaController.getInstance();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.V), false);
                        }
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                ee0 ee0Var = (ee0) obj;
                ee0Var.f23998r.setText("");
                ci.j9.a(ee0Var.f23999s, true);
                Drawable drawable = ee0Var.f23993a;
                if (drawable instanceof oc0) {
                    ((oc0) drawable).y();
                }
                return true;
            default:
                return wq0.n((wq0) obj);
        }
    }
}
