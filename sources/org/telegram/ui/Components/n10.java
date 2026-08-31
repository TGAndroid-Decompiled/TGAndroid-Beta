package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class n10 implements View.OnLongClickListener {
    public final int f29363a;
    public final Object f29364b;

    public n10(Object obj, int i10) {
        this.f29363a = i10;
        this.f29364b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f29363a;
        Object obj = this.f29364b;
        switch (i10) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.J0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.S);
                fragmentContextView.E.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.E;
                int i11 = org.telegram.ui.ActionBar.k6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, fragmentContextView.m0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.E;
                c1Var2.K = fragmentContextView.h instanceof org.telegram.ui.xn;
                c1Var2.C.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f21228f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f21228f = null;
                }
                fragmentContextView.C.B(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                fragmentContextView.C.N();
                fragmentContextView.q(false);
                fragmentContextView.C.setDimMenu(0.3f);
                fragmentContextView.C.M(fragmentContextView.E, null);
                fragmentContextView.C.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.J0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController mediaController = MediaController.getInstance();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.S), false);
                        }
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                xd0 xd0Var = (xd0) obj;
                xd0Var.f33048r.setText("");
                td0.a(xd0Var.f33049s, true);
                Drawable drawable = xd0Var.f33042a;
                if (drawable instanceof fc0) {
                    ((fc0) drawable).y();
                }
                return true;
            default:
                return mq0.n((mq0) obj);
        }
    }
}
