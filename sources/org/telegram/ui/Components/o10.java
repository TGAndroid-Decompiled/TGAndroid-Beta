package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class o10 implements View.OnLongClickListener {
    public final int f26939a;
    public final Object f26940b;

    public o10(Object obj, int i10) {
        this.f26939a = i10;
        this.f26940b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f26939a;
        Object obj = this.f26940b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.P0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                fragmentContextView.H.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.H;
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, fragmentContextView.f22277p0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.H;
                c1Var2.N = fragmentContextView.h instanceof org.telegram.ui.xn;
                c1Var2.F.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f18789f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f18789f = null;
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
                ce0 ce0Var = (ce0) obj;
                ce0Var.f23308r.setText("");
                ci.i9.a(ce0Var.f23309s, true);
                Drawable drawable = ce0Var.f23303a;
                if (drawable instanceof nc0) {
                    ((nc0) drawable).y();
                }
                return true;
            default:
                return vq0.q((vq0) obj);
        }
    }
}
