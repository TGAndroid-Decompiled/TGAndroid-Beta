package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class x11 implements k91 {
    public final ThemeEditorView f32306a;

    public x11(ThemeEditorView themeEditorView) {
        this.f32306a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f32306a;
            if (i10 < themeEditorView.f24389c.size()) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) themeEditorView.f24389c.get(i10);
                int x02 = org.telegram.ui.ActionBar.h6.x0(j6Var.f21462j, j6Var.f21459f, false);
                j6Var.f21461i = x02;
                if (i10 == 0) {
                    themeEditorView.f24395l.f24397b.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24395l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.M(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f32306a.f24396m;
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Nd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Od);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Pd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Qd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Rd);
        org.telegram.ui.ActionBar.h6.f21056h0 = null;
        g6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.h6.f21020f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.h6.s1(g6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.h6.f21020f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.h6.f20965c0 = i10;
            org.telegram.ui.ActionBar.h6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.h6.f20984d0 = i11;
            org.telegram.ui.ActionBar.h6.f20945b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.h6.f21001e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.h6.i(drawable);
            }
            org.telegram.ui.ActionBar.h6.h(org.telegram.ui.ActionBar.h6.f21001e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.h6.f21020f0 = null;
        org.telegram.ui.ActionBar.h6.f21001e0 = null;
        org.telegram.ui.ActionBar.h6.s1(g6Var, false, false, false);
        org.telegram.ui.ActionBar.h6.p1(true);
    }
}
