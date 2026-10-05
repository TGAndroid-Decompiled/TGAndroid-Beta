package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class p10 implements View.OnLongClickListener {
    public final int f29568a;
    public final Object f29569b;

    public p10(Object obj, int i10) {
        this.f29568a = i10;
        this.f29569b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f29568a;
        Object obj = this.f29569b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.P0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, fragmentContextView.f24186p0));
                org.telegram.ui.ActionBar.b1 b1Var2 = fragmentContextView.H;
                b1Var2.N = fragmentContextView.h instanceof org.telegram.ui.yn;
                b1Var2.F.setShader(null);
                b1Var2.h = null;
                Bitmap bitmap = b1Var2.f20498f;
                if (bitmap != null) {
                    bitmap.recycle();
                    b1Var2.f20498f = null;
                }
                fragmentContextView.F.B(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
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
                ee0Var.f26132r.setText("");
                ci.i9.a(ee0Var.f26133s, true);
                Drawable drawable = ee0Var.f26126a;
                if (drawable instanceof pc0) {
                    ((pc0) drawable).y();
                }
                return true;
            default:
                return br0.q((br0) obj);
        }
    }
}
