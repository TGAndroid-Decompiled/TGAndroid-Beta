package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class n11 implements d91 {
    public final ThemeEditorView f26541a;

    public n11(ThemeEditorView themeEditorView) {
        this.f26541a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f26541a;
            if (i10 < themeEditorView.f22432c.size()) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) themeEditorView.f22432c.get(i10);
                int w02 = org.telegram.ui.ActionBar.j6.w0(l6Var.f19612j, l6Var.f19609f, false);
                l6Var.f19611i = w02;
                if (i10 == 0) {
                    themeEditorView.f22438l.f22440b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f22438l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f26541a.f22439m;
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Nd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Od);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Pd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Qd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Rd);
        org.telegram.ui.ActionBar.j6.f19160h0 = null;
        i6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.j6.f19124f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.j6.f19124f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.j6.f19070c0 = i10;
            org.telegram.ui.ActionBar.j6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.j6.f19088d0 = i11;
            org.telegram.ui.ActionBar.j6.f19051b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.j6.f19107e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.j6.i(drawable);
            }
            org.telegram.ui.ActionBar.j6.h(org.telegram.ui.ActionBar.j6.f19107e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.j6.f19124f0 = null;
        org.telegram.ui.ActionBar.j6.f19107e0 = null;
        org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
        org.telegram.ui.ActionBar.j6.o1(true);
    }
}
