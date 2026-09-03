package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class c11 implements r81 {
    public final ThemeEditorView f25735a;

    public c11(ThemeEditorView themeEditorView) {
        this.f25735a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f25735a;
            if (i10 < themeEditorView.f25057c.size()) {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) themeEditorView.f25057c.get(i10);
                int w02 = org.telegram.ui.ActionBar.k6.w0(m6Var.f22148j, m6Var.f22145f, false);
                m6Var.f22147i = w02;
                if (i10 == 0) {
                    themeEditorView.f25064l.f25066b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f25064l;
                int i11 = ThemeEditorView.EditorAlert.J;
                editorAlert.K(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        org.telegram.ui.ActionBar.j6 j6Var = this.f25735a.f25065m;
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Nd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Od);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Pd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Qd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Rd);
        org.telegram.ui.ActionBar.k6.f21728h0 = null;
        j6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.k6.f21692f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.k6.r1(j6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.f21692f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.k6.f21638c0 = i10;
            org.telegram.ui.ActionBar.k6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.k6.f21655d0 = i11;
            org.telegram.ui.ActionBar.k6.f21619b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.k6.f21674e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.k6.i(drawable);
            }
            org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.f21674e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.k6.f21692f0 = null;
        org.telegram.ui.ActionBar.k6.f21674e0 = null;
        org.telegram.ui.ActionBar.k6.r1(j6Var, false, false, false);
        org.telegram.ui.ActionBar.k6.o1(true);
    }
}
