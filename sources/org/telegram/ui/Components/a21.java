package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class a21 implements q91 {
    public final ThemeEditorView f23423a;

    public a21(ThemeEditorView themeEditorView) {
        this.f23423a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f23423a;
            if (i10 < themeEditorView.f23330c.size()) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) themeEditorView.f23330c.get(i10);
                int x02 = org.telegram.ui.ActionBar.g6.x0(i6Var.f20378j, i6Var.f20375f, false);
                i6Var.f20377i = x02;
                if (i10 == 0) {
                    themeEditorView.f23336l.f23338b.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f23336l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.M(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f23423a.f23337m;
        org.telegram.ui.ActionBar.g6.ul.delete(org.telegram.ui.ActionBar.g6.Nd);
        org.telegram.ui.ActionBar.g6.ul.delete(org.telegram.ui.ActionBar.g6.Od);
        org.telegram.ui.ActionBar.g6.ul.delete(org.telegram.ui.ActionBar.g6.Pd);
        org.telegram.ui.ActionBar.g6.ul.delete(org.telegram.ui.ActionBar.g6.Qd);
        org.telegram.ui.ActionBar.g6.ul.delete(org.telegram.ui.ActionBar.g6.Rd);
        org.telegram.ui.ActionBar.g6.f19967h0 = null;
        f6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.g6.f19931f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.g6.s1(f6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.f19931f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.g6.f19876c0 = i10;
            org.telegram.ui.ActionBar.g6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.g6.f19895d0 = i11;
            org.telegram.ui.ActionBar.g6.f19856b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.g6.f19912e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.g6.i(drawable);
            }
            org.telegram.ui.ActionBar.g6.h(org.telegram.ui.ActionBar.g6.f19912e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.g6.f19931f0 = null;
        org.telegram.ui.ActionBar.g6.f19912e0 = null;
        org.telegram.ui.ActionBar.g6.s1(f6Var, false, false, false);
        org.telegram.ui.ActionBar.g6.p1(true);
    }
}
