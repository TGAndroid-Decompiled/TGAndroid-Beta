package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class f21 implements v91 {
    public final ThemeEditorView f26261a;

    public f21(ThemeEditorView themeEditorView) {
        this.f26261a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f26261a;
            if (i10 < themeEditorView.f24355c.size()) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.f24355c.get(i10);
                int x02 = org.telegram.ui.ActionBar.i6.x0(k6Var.f21352j, k6Var.f21349f, false);
                k6Var.f21351i = x02;
                if (i10 == 0) {
                    themeEditorView.f24362l.f24364b.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24362l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.M(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f26261a.f24363m;
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Nd);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Od);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Pd);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Qd);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Rd);
        org.telegram.ui.ActionBar.i6.f20867h0 = null;
        h6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.i6.f20832f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.i6.s1(h6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.i6.f20832f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.i6.f20778c0 = i10;
            org.telegram.ui.ActionBar.i6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.i6.f20795d0 = i11;
            org.telegram.ui.ActionBar.i6.f20758b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.i6.f20815e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.i6.i(drawable);
            }
            org.telegram.ui.ActionBar.i6.h(org.telegram.ui.ActionBar.i6.f20815e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.i6.f20832f0 = null;
        org.telegram.ui.ActionBar.i6.f20815e0 = null;
        org.telegram.ui.ActionBar.i6.s1(h6Var, false, false, false);
        org.telegram.ui.ActionBar.i6.p1(true);
    }
}
