package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class n10 implements View.OnLongClickListener {
    public final int f26321a;
    public final Object f26322b;

    public n10(Object obj, int i10) {
        this.f26321a = i10;
        this.f26322b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f26321a;
        Object obj = this.f26322b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.O0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, fragmentContextView.f22023p0));
                org.telegram.ui.ActionBar.b1 b1Var2 = fragmentContextView.H;
                b1Var2.N = fragmentContextView.h instanceof org.telegram.ui.xn;
                b1Var2.F.setShader(null);
                b1Var2.h = null;
                Bitmap bitmap = b1Var2.f18522f;
                if (bitmap != null) {
                    bitmap.recycle();
                    b1Var2.f18522f = null;
                }
                fragmentContextView.F.B(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                fragmentContextView.F.N();
                fragmentContextView.r(false);
                fragmentContextView.F.setDimMenu(0.3f);
                fragmentContextView.F.M(fragmentContextView.H, null);
                fragmentContextView.F.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.O0;
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
                sd0Var.f27918r.setText("");
                ci.j9.a(sd0Var.f27919s, true);
                Drawable drawable = sd0Var.f27913a;
                if (drawable instanceof bc0) {
                    ((bc0) drawable).y();
                }
                return true;
            default:
                return hq0.n((hq0) obj);
        }
    }
}
