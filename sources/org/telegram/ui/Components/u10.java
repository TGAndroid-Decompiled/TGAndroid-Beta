package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class u10 implements View.OnLongClickListener {
    public final int f31056a;
    public final Object f31057b;

    public u10(Object obj, int i10) {
        this.f31056a = i10;
        this.f31057b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f31056a;
        Object obj = this.f31057b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.k6.G8;
                org.telegram.ui.ActionBar.r6.i(i11, a1Var, fragmentContextView.f24377q0);
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.I;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.sn;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f20717f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f20717f = null;
                }
                fragmentContextView.G.B(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                fragmentContextView.G.N();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.M(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController mediaController = MediaController.getInstance();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.W), false);
                        }
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                pe0 pe0Var = (pe0) obj;
                pe0Var.f29538r.setText("");
                ei.x8.a(pe0Var.f29539s, true);
                Drawable drawable = pe0Var.f29525a;
                if (drawable instanceof yc0) {
                    ((yc0) drawable).x();
                }
                return true;
            default:
                return ir0.n((ir0) obj);
        }
    }
}
