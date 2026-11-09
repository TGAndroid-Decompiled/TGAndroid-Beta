package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class gz0 implements b71 {
    public final ThemeEditorView f34107a;

    public gz0(ThemeEditorView themeEditorView) {
        this.f34107a = themeEditorView;
    }

    @Override
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f34107a;
            if (i7 < themeEditorView.f31575e.size()) {
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) themeEditorView.f31575e.get(i7);
                int x02 = org.telegram.ui.ActionBar.l6.x0(u6Var.f28606i, u6Var.f28603e, false);
                u6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.f31583n.f31585i1.c(x02);
                }
                i7++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f31583n;
                int i10 = ThemeEditorView.EditorAlert.D1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        org.telegram.ui.ActionBar.k6 k6Var = this.f34107a.f31584o;
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Be);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Ce);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.De);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Ee);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Fe);
        org.telegram.ui.ActionBar.l6.f27933h0 = null;
        k6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.l6.f27897f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.l6.x1(k6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.l6.f27897f0);
            int i7 = q10[0];
            org.telegram.ui.ActionBar.l6.f27841c0 = i7;
            org.telegram.ui.ActionBar.l6.X = i7;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.l6.f27860d0 = i10;
            org.telegram.ui.ActionBar.l6.f27822b0 = i10;
            org.telegram.ui.ActionBar.l6.i();
            org.telegram.ui.ActionBar.l6.h(org.telegram.ui.ActionBar.l6.f27878e0);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25122z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.l6.f27897f0 = null;
        org.telegram.ui.ActionBar.l6.f27878e0 = null;
        org.telegram.ui.ActionBar.l6.x1(k6Var, false, false, false);
        org.telegram.ui.ActionBar.l6.u1(true);
    }
}
