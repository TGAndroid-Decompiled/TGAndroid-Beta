package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f01 implements t71 {
    public final ThemeEditorView f28225a;

    public f01(ThemeEditorView themeEditorView) {
        this.f28225a = themeEditorView;
    }

    @Override
    public final void a() {
        int i9 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f28225a;
            if (i9 < themeEditorView.f26556c.size()) {
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) themeEditorView.f26556c.get(i9);
                int w02 = org.telegram.ui.ActionBar.f6.w0(h6Var.f23501j, h6Var.f23498f, false);
                h6Var.f23500i = w02;
                if (i9 == 0) {
                    themeEditorView.f26563l.f26565b.c(w02);
                }
                i9++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f26563l;
                int i10 = ThemeEditorView.EditorAlert.I;
                editorAlert.K(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f28225a.f26564m;
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Nd);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Od);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Pd);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Qd);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Rd);
        org.telegram.ui.ActionBar.f6.f23067h0 = null;
        e6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.f6.f23031f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.f6.r1(e6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.f6.f23031f0);
            int i9 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.f6.f22977c0 = i9;
            org.telegram.ui.ActionBar.f6.X = i9;
            int i10 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.f6.f22995d0 = i10;
            org.telegram.ui.ActionBar.f6.f22959b0 = i10;
            Drawable drawable = org.telegram.ui.ActionBar.f6.f23013e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.f6.i(drawable);
            }
            org.telegram.ui.ActionBar.f6.h(org.telegram.ui.ActionBar.f6.f23013e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.f6.f23031f0 = null;
        org.telegram.ui.ActionBar.f6.f23013e0 = null;
        org.telegram.ui.ActionBar.f6.r1(e6Var, false, false, false);
        org.telegram.ui.ActionBar.f6.o1(true);
    }
}
