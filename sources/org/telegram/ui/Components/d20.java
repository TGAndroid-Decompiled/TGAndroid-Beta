package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class d20 implements View.OnLongClickListener {
    public final int f25409a;
    public final Object f25410b;

    public d20(Object obj, int i10) {
        this.f25409a = i10;
        this.f25410b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f25409a;
        Object obj = this.f25410b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, fragmentContextView.f24175q0));
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.I;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.zn;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f20456f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f20456f = null;
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
                ue0 ue0Var = (ue0) obj;
                ue0Var.f31413r.setText("");
                ci.j9.a(ue0Var.f31414s, true);
                Drawable drawable = ue0Var.f31403a;
                if (drawable instanceof dd0) {
                    ((dd0) drawable).y();
                }
                return true;
            default:
                return or0.p((or0) obj);
        }
    }
}
