package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class h01 implements v71 {

    public final ThemeEditorView f28890a;

    public h01(ThemeEditorView themeEditorView) {
        this.f28890a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f28890a;
            if (i10 >= themeEditorView.f26552c.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f26559l;
                int i11 = ThemeEditorView.EditorAlert.I;
                editorAlert.L(true);
                return;
            } else {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) themeEditorView.f26552c.get(i10);
                int iW0 = org.telegram.ui.ActionBar.g6.w0(i6Var.f23520j, i6Var.f23517f, false);
                i6Var.f23519i = iW0;
                if (i10 == 0) {
                    themeEditorView.f26559l.f26561b.c(iW0);
                }
                i10++;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) throws Throwable {
        org.telegram.ui.ActionBar.f6 f6Var = this.f28890a.f26560m;
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Nd);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Od);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Pd);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Qd);
        org.telegram.ui.ActionBar.g6.rl.delete(org.telegram.ui.ActionBar.g6.Rd);
        org.telegram.ui.ActionBar.g6.f23119h0 = null;
        f6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.g6.f23084f0 = null;
            org.telegram.ui.ActionBar.g6.f23066e0 = null;
            org.telegram.ui.ActionBar.g6.r1(f6Var, false, false, false);
            org.telegram.ui.ActionBar.g6.o1(true);
            return;
        }
        org.telegram.ui.ActionBar.g6.f23084f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.g6.r1(f6Var, false, false, false);
        int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.f23084f0);
        int i10 = iArrCalcDrawableColor[0];
        org.telegram.ui.ActionBar.g6.f23030c0 = i10;
        org.telegram.ui.ActionBar.g6.X = i10;
        int i11 = iArrCalcDrawableColor[1];
        org.telegram.ui.ActionBar.g6.f23047d0 = i11;
        org.telegram.ui.ActionBar.g6.f23011b0 = i11;
        Drawable drawable = org.telegram.ui.ActionBar.g6.f23066e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.g6.i(drawable);
        }
        org.telegram.ui.ActionBar.g6.h(org.telegram.ui.ActionBar.g6.f23066e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
