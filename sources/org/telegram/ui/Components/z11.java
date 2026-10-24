package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class z11 implements r91 {
    public final ThemeEditorView f33127a;

    public z11(ThemeEditorView themeEditorView) {
        this.f33127a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f33127a;
            if (i10 < themeEditorView.e.size()) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.f21864i, t6Var.e, false);
                t6Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.f24544n.f24546b.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24544n;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.j6 j6Var = this.f33127a.f24545o;
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Nd);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Od);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Pd);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Qd);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Rd);
        org.telegram.ui.ActionBar.k6.f21250h0 = null;
        j6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.k6.f21214f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.k6.u1(j6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.f21214f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.k6.f21159c0 = i10;
            org.telegram.ui.ActionBar.k6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.k6.f21178d0 = i11;
            org.telegram.ui.ActionBar.k6.f21139b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.k6.f21195e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.k6.i(drawable);
            }
            org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.f21195e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.k6.f21214f0 = null;
        org.telegram.ui.ActionBar.k6.f21195e0 = null;
        org.telegram.ui.ActionBar.k6.u1(j6Var, false, false, false);
        org.telegram.ui.ActionBar.k6.r1(true);
    }
}
