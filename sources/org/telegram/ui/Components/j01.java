package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class j01 implements b81 {
    public final ThemeEditorView f27186a;

    public j01(ThemeEditorView themeEditorView) {
        this.f27186a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f27186a;
            if (i10 < themeEditorView.e.size()) {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.t6.x0(c7Var.f20237i, c7Var.e, false);
                c7Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.f24218n.f24220i1.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24218n;
                int i11 = ThemeEditorView.EditorAlert.D1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.s6 s6Var = this.f27186a.f24219o;
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Be);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Ce);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.De);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Ee);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Fe);
        org.telegram.ui.ActionBar.t6.f20996h0 = null;
        s6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.t6.f20960f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.t6.x1(s6Var, false, false, false);
            int[] q6 = org.telegram.messenger.i0.q(org.telegram.ui.ActionBar.t6.f20960f0);
            int i10 = q6[0];
            org.telegram.ui.ActionBar.t6.f20904c0 = i10;
            org.telegram.ui.ActionBar.t6.X = i10;
            int i11 = q6[1];
            org.telegram.ui.ActionBar.t6.f20923d0 = i11;
            org.telegram.ui.ActionBar.t6.f20885b0 = i11;
            org.telegram.ui.ActionBar.t6.i();
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.t6.f20942e0);
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19735z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.t6.f20960f0 = null;
        org.telegram.ui.ActionBar.t6.f20942e0 = null;
        org.telegram.ui.ActionBar.t6.x1(s6Var, false, false, false);
        org.telegram.ui.ActionBar.t6.u1(true);
    }
}
