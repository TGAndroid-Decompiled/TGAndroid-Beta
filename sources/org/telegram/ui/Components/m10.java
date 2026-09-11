package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m10 implements View.OnLongClickListener {
    public final int f28345a;
    public final Object f28346b;

    public m10(Object obj, int i10) {
        this.f28345a = i10;
        this.f28346b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f28345a;
        Object obj = this.f28346b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.M0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, fragmentContextView.f23992p0));
                org.telegram.ui.ActionBar.b1 b1Var2 = fragmentContextView.H;
                b1Var2.N = fragmentContextView.h instanceof org.telegram.ui.co;
                b1Var2.F.setShader(null);
                b1Var2.h = null;
                Bitmap bitmap = b1Var2.f20305f;
                if (bitmap != null) {
                    bitmap.recycle();
                    b1Var2.f20305f = null;
                }
                fragmentContextView.F.B(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                fragmentContextView.F.N();
                fragmentContextView.q(false);
                fragmentContextView.F.setDimMenu(0.3f);
                fragmentContextView.F.M(fragmentContextView.H, null);
                fragmentContextView.F.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.M0;
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
                sd0 sd0Var = (sd0) obj;
                sd0Var.f30261r.setText("");
                di.l9.a(sd0Var.f30262s, true);
                Drawable drawable = sd0Var.f30255a;
                if (drawable instanceof dc0) {
                    ((dc0) drawable).y();
                }
                return true;
            default:
                return hq0.n((hq0) obj);
        }
    }
}
