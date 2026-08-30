package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class c11 implements r81 {
    public final ThemeEditorView f23807a;

    public c11(ThemeEditorView themeEditorView) {
        this.f23807a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f23807a;
            if (i10 < themeEditorView.f23195c.size()) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) themeEditorView.f23195c.get(i10);
                int w02 = org.telegram.ui.ActionBar.j6.w0(l6Var.f20437j, l6Var.f20434f, false);
                l6Var.f20436i = w02;
                if (i10 == 0) {
                    themeEditorView.f23201l.f23203b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f23201l;
                int i11 = ThemeEditorView.EditorAlert.J;
                editorAlert.K(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z4) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f23807a.f23202m;
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Nd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Od);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Pd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Qd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Rd);
        org.telegram.ui.ActionBar.j6.f19972h0 = null;
        i6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.j6.f19936f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.j6.f19936f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.j6.f19883c0 = i10;
            org.telegram.ui.ActionBar.j6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.j6.f19900d0 = i11;
            org.telegram.ui.ActionBar.j6.f19864b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.j6.f19918e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.j6.i(drawable);
            }
            org.telegram.ui.ActionBar.j6.h(org.telegram.ui.ActionBar.j6.f19918e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.j6.f19936f0 = null;
        org.telegram.ui.ActionBar.j6.f19918e0 = null;
        org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
        org.telegram.ui.ActionBar.j6.o1(true);
    }
}
