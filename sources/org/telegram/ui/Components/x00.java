package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class x00 implements View.OnLongClickListener {
    public final int f34482a;
    public final Object f34483b;

    public x00(Object obj, int i9) {
        this.f34482a = i9;
        this.f34483b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i9 = this.f34482a;
        Object obj = this.f34483b;
        switch (i9) {
            case 0:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                final float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                fragmentContextView.D.d(playbackSpeed, false);
                org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.D;
                int i10 = org.telegram.ui.ActionBar.f6.G8;
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, fragmentContextView.f26390l0));
                org.telegram.ui.ActionBar.c1 c1Var2 = fragmentContextView.D;
                c1Var2.J = fragmentContextView.h instanceof org.telegram.ui.qn;
                c1Var2.B.setShader(null);
                c1Var2.h = null;
                Bitmap bitmap = c1Var2.f22822f;
                if (bitmap != null) {
                    bitmap.recycle();
                    c1Var2.f22822f = null;
                }
                fragmentContextView.B.B(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                fragmentContextView.B.N();
                fragmentContextView.q(false);
                fragmentContextView.B.setDimMenu(0.3f);
                fragmentContextView.B.M(fragmentContextView.D, null);
                fragmentContextView.B.setOnMenuDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        float[] fArr2 = FragmentContextView.I0;
                        if (!((Boolean) obj2).booleanValue()) {
                            MediaController mediaController = MediaController.getInstance();
                            FragmentContextView fragmentContextView2 = FragmentContextView.this;
                            fragmentContextView2.l(playbackSpeed, mediaController.getPlaybackSpeed(fragmentContextView2.R), false);
                        }
                    }
                });
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 1:
                yc0 yc0Var = (yc0) obj;
                yc0Var.f34946r.setText("");
                kh.z8.a(yc0Var.f34947s, true);
                Drawable drawable = yc0Var.f34940a;
                if (drawable instanceof jb0) {
                    ((jb0) drawable).y();
                }
                return true;
            default:
                return rp0.n((rp0) obj);
        }
    }
}
