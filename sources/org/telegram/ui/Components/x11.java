package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;
public final class x11 implements m91 {
    public final ThemeEditorView f32695a;

    public x11(ThemeEditorView themeEditorView) {
        this.f32695a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f32695a;
            if (i10 < themeEditorView.f24348c.size()) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.f24348c.get(i10);
                int w02 = org.telegram.ui.ActionBar.i6.w0(k6Var.f21340j, k6Var.f21337f, false);
                k6Var.f21339i = w02;
                if (i10 == 0) {
                    themeEditorView.f24355l.f24357b.c(w02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24355l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.J(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f32695a.f24356m;
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Nd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Od);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Pd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Qd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Rd);
        org.telegram.ui.ActionBar.i6.f20884h0 = null;
        h6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.i6.f20848f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.i6.r1(h6Var, false, false, false);
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.i6.f20848f0);
            int i10 = calcDrawableColor[0];
            org.telegram.ui.ActionBar.i6.f20793c0 = i10;
            org.telegram.ui.ActionBar.i6.X = i10;
            int i11 = calcDrawableColor[1];
            org.telegram.ui.ActionBar.i6.f20811d0 = i11;
            org.telegram.ui.ActionBar.i6.f20774b0 = i11;
            Drawable drawable = org.telegram.ui.ActionBar.i6.f20831e0;
            if (drawable != null) {
                org.telegram.ui.ActionBar.i6.i(drawable);
            }
            org.telegram.ui.ActionBar.i6.h(org.telegram.ui.ActionBar.i6.f20831e0);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.i6.f20848f0 = null;
        org.telegram.ui.ActionBar.i6.f20831e0 = null;
        org.telegram.ui.ActionBar.i6.r1(h6Var, false, false, false);
        org.telegram.ui.ActionBar.i6.o1(true);
    }
}
