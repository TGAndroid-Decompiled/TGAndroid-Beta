package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class k01 implements c81 {
    public final ThemeEditorView f27681a;

    public k01(ThemeEditorView themeEditorView) {
        this.f27681a = themeEditorView;
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f27681a;
            if (i10 < themeEditorView.e.size()) {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.t6.x0(c7Var.f20238i, c7Var.e, false);
                c7Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.f24219n.f24221i1.c(x02);
                }
                i10++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f24219n;
                int i11 = ThemeEditorView.EditorAlert.D1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.s6 s6Var = this.f27681a.f24220o;
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Be);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Ce);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.De);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Ee);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Fe);
        org.telegram.ui.ActionBar.t6.f20997h0 = null;
        s6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.t6.f20961f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.t6.x1(s6Var, false, false, false);
            int[] q6 = org.telegram.messenger.i0.q(org.telegram.ui.ActionBar.t6.f20961f0);
            int i10 = q6[0];
            org.telegram.ui.ActionBar.t6.f20905c0 = i10;
            org.telegram.ui.ActionBar.t6.X = i10;
            int i11 = q6[1];
            org.telegram.ui.ActionBar.t6.f20924d0 = i11;
            org.telegram.ui.ActionBar.t6.f20886b0 = i11;
            org.telegram.ui.ActionBar.t6.i();
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.t6.f20943e0);
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14831z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.t6.f20961f0 = null;
        org.telegram.ui.ActionBar.t6.f20943e0 = null;
        org.telegram.ui.ActionBar.t6.x1(s6Var, false, false, false);
        org.telegram.ui.ActionBar.t6.u1(true);
    }
}
