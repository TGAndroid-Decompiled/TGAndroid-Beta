package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class m11 implements b91 {
    public final ThemeEditorView f25146a;

    public m11(ThemeEditorView themeEditorView) {
        this.f25146a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f25146a;
            if (i10 < themeEditorView.f21296c.size()) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) themeEditorView.f21296c.get(i10);
                int w02 = org.telegram.ui.ActionBar.j6.w0(l6Var.f18460j, l6Var.f18457f, false);
                l6Var.f18459i = w02;
                if (i10 == 0) {
                    themeEditorView.f21302l.f21304b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f21302l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f25146a.f21303m;
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Nd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Od);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Pd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Qd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Rd);
        org.telegram.ui.ActionBar.j6.f17993h0 = null;
        i6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.j6.f17958f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.j6.f17958f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.j6.f17904c0 = i10;
            org.telegram.ui.ActionBar.j6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.j6.f17922d0 = i11;
            org.telegram.ui.ActionBar.j6.f17885b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.j6.f17940e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.j6.i(drawable);
            }
            org.telegram.ui.ActionBar.j6.h(org.telegram.ui.ActionBar.j6.f17940e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.j6.f17958f0 = null;
        org.telegram.ui.ActionBar.j6.f17940e0 = null;
        org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
        org.telegram.ui.ActionBar.j6.o1(true);
    }
}
