package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class v11 implements i91 {
    public final ThemeEditorView f31149a;

    public v11(ThemeEditorView themeEditorView) {
        this.f31149a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f31149a;
            if (i10 < themeEditorView.f24392c.size()) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) themeEditorView.f24392c.get(i10);
                int x02 = org.telegram.ui.ActionBar.h6.x0(j6Var.f21465j, j6Var.f21462f, false);
                j6Var.f21464i = x02;
                if (i10 == 0) {
                    themeEditorView.f24398l.f24400b.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24398l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.M(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f31149a.f24399m;
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Nd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Od);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Pd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Qd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Rd);
        org.telegram.ui.ActionBar.h6.f21059h0 = null;
        g6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.h6.f21023f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.h6.s1(g6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.h6.f21023f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.h6.f20968c0 = i10;
            org.telegram.ui.ActionBar.h6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.h6.f20987d0 = i11;
            org.telegram.ui.ActionBar.h6.f20948b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.h6.f21004e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.h6.i(drawable);
            }
            org.telegram.ui.ActionBar.h6.h(org.telegram.ui.ActionBar.h6.f21004e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.h6.f21023f0 = null;
        org.telegram.ui.ActionBar.h6.f21004e0 = null;
        org.telegram.ui.ActionBar.h6.s1(g6Var, false, false, false);
        org.telegram.ui.ActionBar.h6.p1(true);
    }
}
