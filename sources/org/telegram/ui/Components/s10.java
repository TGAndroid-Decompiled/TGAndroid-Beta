package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class s10 implements View.OnLongClickListener {
    public final int f30410a;
    public final Object f30411b;

    public s10(Object obj, int i10) {
        this.f30410a = i10;
        this.f30411b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30410a;
        Object obj = this.f30411b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.k6.G8;
                org.telegram.ui.ActionBar.r6.i(i11, a1Var, fragmentContextView.f24378q0);
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.I;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.sn;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f20718f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f20718f = null;
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
                ne0 ne0Var = (ne0) obj;
                ne0Var.f28894r.setText("");
                ei.x8.a(ne0Var.f28895s, true);
                Drawable drawable = ne0Var.f28881a;
                if (drawable instanceof wc0) {
                    ((wc0) drawable).x();
                }
                return true;
            default:
                return hr0.n((hr0) obj);
        }
    }
}
