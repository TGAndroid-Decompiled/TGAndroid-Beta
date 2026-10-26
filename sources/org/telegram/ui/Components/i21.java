package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class i21 implements aa1 {
    public final ThemeEditorView f29169a;

    public i21(ThemeEditorView themeEditorView) {
        this.f29169a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f29169a;
            if (i10 < themeEditorView.e.size()) {
                org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.y6.x0(h7Var.f22695i, h7Var.e, false);
                h7Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.f26336n.f26338b.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f26336n;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.x6 x6Var = this.f29169a.f26337o;
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Nd);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Od);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Pd);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Qd);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Rd);
        org.telegram.ui.ActionBar.y6.f23422h0 = null;
        x6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.y6.f23387f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.y6.u1(x6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.y6.f23387f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.y6.f23331c0 = i10;
            org.telegram.ui.ActionBar.y6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.y6.f23350d0 = i11;
            org.telegram.ui.ActionBar.y6.f23311b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.y6.f23369e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.y6.i(drawable);
            }
            org.telegram.ui.ActionBar.y6.h(org.telegram.ui.ActionBar.y6.f23369e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.y6.f23387f0 = null;
        org.telegram.ui.ActionBar.y6.f23369e0 = null;
        org.telegram.ui.ActionBar.y6.u1(x6Var, false, false, false);
        org.telegram.ui.ActionBar.y6.r1(true);
    }
}
