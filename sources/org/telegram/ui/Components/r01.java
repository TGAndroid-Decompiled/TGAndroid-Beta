package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class r01 implements f81 {
    public final ThemeEditorView f32155a;

    public r01(ThemeEditorView themeEditorView) {
        this.f32155a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f32155a;
            if (i10 < themeEditorView.f26567c.size()) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) themeEditorView.f26567c.get(i10);
                int w02 = org.telegram.ui.ActionBar.g6.w0(i6Var.f23539j, i6Var.f23536f, false);
                i6Var.f23538i = w02;
                if (i10 == 0) {
                    themeEditorView.f26574l.f26576b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f26574l;
                int i11 = ThemeEditorView.EditorAlert.I;
                editorAlert.K(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f32155a.f26575m;
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Nd);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Od);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Pd);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Qd);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Rd);
        org.telegram.ui.ActionBar.g6.f23128h0 = null;
        f6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.g6.f23093f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.g6.r1(f6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.f23093f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.g6.f23040c0 = i10;
            org.telegram.ui.ActionBar.g6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.g6.f23056d0 = i11;
            org.telegram.ui.ActionBar.g6.f23021b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.g6.f23074e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.g6.i(drawable);
            }
            org.telegram.ui.ActionBar.g6.h(org.telegram.ui.ActionBar.g6.f23074e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.g6.f23093f0 = null;
        org.telegram.ui.ActionBar.g6.f23074e0 = null;
        org.telegram.ui.ActionBar.g6.r1(f6Var, false, false, false);
        org.telegram.ui.ActionBar.g6.o1(true);
    }
}
