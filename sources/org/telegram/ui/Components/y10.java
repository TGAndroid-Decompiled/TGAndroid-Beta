package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class y10 implements View.OnLongClickListener {
    public final int f31448a;
    public final Object f31449b;

    public y10(Object obj, int i10) {
        this.f31448a = i10;
        this.f31449b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f31448a;
        Object obj = this.f31449b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                fragmentContextView.I.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, fragmentContextView.f23173q0));
                org.telegram.ui.ActionBar.a1 a1Var2 = fragmentContextView.I;
                a1Var2.N = fragmentContextView.h instanceof org.telegram.ui.fo;
                a1Var2.F.setShader(null);
                a1Var2.h = null;
                Bitmap bitmap = a1Var2.f19631f;
                if (bitmap != null) {
                    bitmap.recycle();
                    a1Var2.f19631f = null;
                }
                fragmentContextView.G.B(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
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
                re0 re0Var = (re0) obj;
                re0Var.f28820r.setText("");
                di.i9.a(re0Var.f28821s, true);
                Drawable drawable = re0Var.f28811a;
                if (drawable instanceof cd0) {
                    ((cd0) drawable).y();
                }
                return true;
            default:
                return jr0.o((jr0) obj);
        }
    }
}
