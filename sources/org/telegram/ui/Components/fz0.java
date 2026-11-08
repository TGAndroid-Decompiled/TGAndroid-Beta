package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class fz0 implements a71 {
    public final ThemeEditorView f33734a;

    public fz0(ThemeEditorView themeEditorView) {
        this.f33734a = themeEditorView;
    }

    @Override
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f33734a;
            if (i7 < themeEditorView.f31570e.size()) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.f31570e.get(i7);
                int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.f28541i, t6Var.f28538e, false);
                t6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.f31578n.f31580i1.c(x02);
                }
                i7++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f31578n;
                int i10 = ThemeEditorView.EditorAlert.D1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        org.telegram.ui.ActionBar.j6 j6Var = this.f33734a.f31579o;
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Be);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Ce);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.De);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Ee);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Fe);
        org.telegram.ui.ActionBar.k6.f27920h0 = null;
        j6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.k6.f27884f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.k6.x1(j6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.k6.f27884f0);
            int i7 = q10[0];
            org.telegram.ui.ActionBar.k6.f27828c0 = i7;
            org.telegram.ui.ActionBar.k6.X = i7;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.k6.f27847d0 = i10;
            org.telegram.ui.ActionBar.k6.f27809b0 = i10;
            org.telegram.ui.ActionBar.k6.i();
            org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.f27865e0);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25122z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.k6.f27884f0 = null;
        org.telegram.ui.ActionBar.k6.f27865e0 = null;
        org.telegram.ui.ActionBar.k6.x1(j6Var, false, false, false);
        org.telegram.ui.ActionBar.k6.u1(true);
    }
}
