package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class n11 implements d91 {
    public final ThemeEditorView f26649a;

    public n11(ThemeEditorView themeEditorView) {
        this.f26649a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f26649a;
            if (i10 < themeEditorView.f22433c.size()) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) themeEditorView.f22433c.get(i10);
                int w02 = org.telegram.ui.ActionBar.h6.w0(j6Var.f19520j, j6Var.f19517f, false);
                j6Var.f19519i = w02;
                if (i10 == 0) {
                    themeEditorView.f22439l.f22441b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f22439l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f26649a.f22440m;
        org.telegram.ui.ActionBar.h6.rl.delete(org.telegram.ui.ActionBar.h6.Nd);
        org.telegram.ui.ActionBar.h6.rl.delete(org.telegram.ui.ActionBar.h6.Od);
        org.telegram.ui.ActionBar.h6.rl.delete(org.telegram.ui.ActionBar.h6.Pd);
        org.telegram.ui.ActionBar.h6.rl.delete(org.telegram.ui.ActionBar.h6.Qd);
        org.telegram.ui.ActionBar.h6.rl.delete(org.telegram.ui.ActionBar.h6.Rd);
        org.telegram.ui.ActionBar.h6.f19124h0 = null;
        g6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.h6.f19089f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.h6.r1(g6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.h6.f19089f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.h6.f19035c0 = i10;
            org.telegram.ui.ActionBar.h6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.h6.f19053d0 = i11;
            org.telegram.ui.ActionBar.h6.f19016b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.h6.f19072e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.h6.i(drawable);
            }
            org.telegram.ui.ActionBar.h6.h(org.telegram.ui.ActionBar.h6.f19072e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.h6.f19089f0 = null;
        org.telegram.ui.ActionBar.h6.f19072e0 = null;
        org.telegram.ui.ActionBar.h6.r1(g6Var, false, false, false);
        org.telegram.ui.ActionBar.h6.o1(true);
    }
}
