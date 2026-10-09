package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class c20 implements View.OnLongClickListener {
    public final int f25210a;
    public final Object f25211b;

    public c20(Object obj, int i10) {
        this.f25210a = i10;
        this.f25211b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f25210a;
        Object obj = this.f25211b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, fragmentContextView.f24183q0));
                org.telegram.ui.ActionBar.b1 b1Var2 = fragmentContextView.I;
                b1Var2.N = fragmentContextView.h instanceof org.telegram.ui.zn;
                b1Var2.F.setShader(null);
                b1Var2.h = null;
                Bitmap bitmap = b1Var2.f20494f;
                if (bitmap != null) {
                    bitmap.recycle();
                    b1Var2.f20494f = null;
                }
                fragmentContextView.G.B(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                fragmentContextView.G.N();
                fragmentContextView.r(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.M(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.Q0;
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
                te0 te0Var = (te0) obj;
                te0Var.f31168r.setText("");
                ci.j9.a(te0Var.f31169s, true);
                Drawable drawable = te0Var.f31158a;
                if (drawable instanceof cd0) {
                    ((cd0) drawable).y();
                }
                return true;
            default:
                return mr0.p((mr0) obj);
        }
    }
}
