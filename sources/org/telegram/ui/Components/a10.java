package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

public final class a10 implements View.OnLongClickListener {

    public final int f26591a;

    public final Object f26592b;

    public a10(Object obj, int i10) {
        this.f26591a = i10;
        this.f26592b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f26591a;
        Object obj = this.f26592b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                fragmentContextView.D.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.D;
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, fragmentContextView.f26386l0));
                org.telegram.ui.ActionBar.b1 b1Var2 = fragmentContextView.D;
                b1Var2.J = fragmentContextView.h instanceof org.telegram.ui.rn;
                b1Var2.B.setShader(null);
                b1Var2.h = null;
                Bitmap bitmap = b1Var2.f22798f;
                if (bitmap != null) {
                    bitmap.recycle();
                    b1Var2.f22798f = null;
                }
                fragmentContextView.B.B(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                fragmentContextView.B.N();
                fragmentContextView.q(false);
                fragmentContextView.B.setDimMenu(0.3f);
                fragmentContextView.B.M(fragmentContextView.D, null);
                fragmentContextView.B.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.I0;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        MediaController mediaController = MediaController.getInstance();
                        FragmentContextView fragmentContextView2 = fragmentContextView;
                        fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.R), false);
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                dd0 dd0Var = (dd0) obj;
                dd0Var.f27723r.setText("");
                lh.w8.a(dd0Var.f27724s, true);
                Drawable drawable = dd0Var.f27717a;
                if (drawable instanceof nb0) {
                    ((nb0) drawable).y();
                }
                return true;
            default:
                return sp0.n((sp0) obj);
        }
    }
}
