package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class v10 implements View.OnLongClickListener {
    public final int f27783a;
    public final Object f27784b;

    public v10(Object obj, int i10) {
        this.f27783a = i10;
        this.f27784b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f27783a;
        Object obj = this.f27784b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.M0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, fragmentContextView.f21137p0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.H;
                c1Var2.N = fragmentContextView.h instanceof org.telegram.ui.eo;
                c1Var2.F.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f17601f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f17601f = null;
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
                be0 be0Var = (be0) obj;
                be0Var.f21813r.setText("");
                bi.oa.a(be0Var.f21814s, true);
                Drawable drawable = be0Var.f21808a;
                if (drawable instanceof lc0) {
                    ((lc0) drawable).y();
                }
                return true;
            default:
                return sq0.n((sq0) obj);
        }
    }
}
