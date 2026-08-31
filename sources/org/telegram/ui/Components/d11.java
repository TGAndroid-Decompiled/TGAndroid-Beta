package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class d11 implements s81 {
    public final ThemeEditorView f26159a;

    public d11(ThemeEditorView themeEditorView) {
        this.f26159a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f26159a;
            if (i10 < themeEditorView.f25055c.size()) {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) themeEditorView.f25055c.get(i10);
                int w02 = org.telegram.ui.ActionBar.k6.w0(m6Var.f22146j, m6Var.f22143f, false);
                m6Var.f22145i = w02;
                if (i10 == 0) {
                    themeEditorView.f25062l.f25064b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f25062l;
                int i11 = ThemeEditorView.EditorAlert.J;
                editorAlert.K(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        org.telegram.ui.ActionBar.j6 j6Var = this.f26159a.f25063m;
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Nd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Od);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Pd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Qd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Rd);
        org.telegram.ui.ActionBar.k6.f21726h0 = null;
        j6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.k6.f21690f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.k6.r1(j6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.f21690f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.k6.f21636c0 = i10;
            org.telegram.ui.ActionBar.k6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.k6.f21653d0 = i11;
            org.telegram.ui.ActionBar.k6.f21617b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.k6.f21672e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.k6.i(drawable);
            }
            org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.f21672e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.k6.f21690f0 = null;
        org.telegram.ui.ActionBar.k6.f21672e0 = null;
        org.telegram.ui.ActionBar.k6.r1(j6Var, false, false, false);
        org.telegram.ui.ActionBar.k6.o1(true);
    }
}
