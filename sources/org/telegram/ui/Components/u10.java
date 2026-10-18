package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class u10 implements View.OnLongClickListener {
    public final int f30861a;
    public final Object f30862b;

    public u10(Object obj, int i10) {
        this.f30861a = i10;
        this.f30862b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30861a;
        Object obj = this.f30862b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, fragmentContextView.f24235q0));
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.I;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.sn;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f20648f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f20648f = null;
                }
                fragmentContextView.G.B(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
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
                le0 le0Var = (le0) obj;
                le0Var.f28224r.setText("");
                ei.x8.a(le0Var.f28225s, true);
                Drawable drawable = le0Var.f28211a;
                if (drawable instanceof wc0) {
                    ((wc0) drawable).x();
                }
                return true;
            default:
                return dr0.o((dr0) obj);
        }
    }
}
