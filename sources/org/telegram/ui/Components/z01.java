package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class z01 implements o81 {
    public final ThemeEditorView f30436a;

    public z01(ThemeEditorView themeEditorView) {
        this.f30436a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f30436a;
            if (i10 < themeEditorView.f22208c.size()) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.f22208c.get(i10);
                int w02 = org.telegram.ui.ActionBar.i6.w0(k6Var.f19355j, k6Var.f19352f, false);
                k6Var.f19354i = w02;
                if (i10 == 0) {
                    themeEditorView.f22214l.f22216b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f22214l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f30436a.f22215m;
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Nd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Od);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Pd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Qd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Rd);
        org.telegram.ui.ActionBar.i6.f18899h0 = null;
        h6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.i6.f18864f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.i6.r1(h6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.i6.f18864f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.i6.f18810c0 = i10;
            org.telegram.ui.ActionBar.i6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.i6.f18828d0 = i11;
            org.telegram.ui.ActionBar.i6.f18791b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.i6.f18847e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.i6.i(drawable);
            }
            org.telegram.ui.ActionBar.i6.h(org.telegram.ui.ActionBar.i6.f18847e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.i6.f18864f0 = null;
        org.telegram.ui.ActionBar.i6.f18847e0 = null;
        org.telegram.ui.ActionBar.i6.r1(h6Var, false, false, false);
        org.telegram.ui.ActionBar.i6.o1(true);
    }
}
