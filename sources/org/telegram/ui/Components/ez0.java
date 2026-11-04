package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class ez0 implements s61 {
    public final ThemeEditorView f33612a;

    public ez0(ThemeEditorView themeEditorView) {
        this.f33612a = themeEditorView;
    }

    @Override
    public final void a() {
        int i3 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f33612a;
            if (i3 < themeEditorView.f31644e.size()) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.f31644e.get(i3);
                int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.f28662i, t6Var.f28659e, false);
                t6Var.h = x02;
                if (i3 == 0) {
                    themeEditorView.f31652n.f31654j1.c(x02);
                }
                i3++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f31652n;
                int i10 = ThemeEditorView.EditorAlert.E1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.j6 j6Var = this.f33612a.f31653o;
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Be);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Ce);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.De);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Ee);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Fe);
        org.telegram.ui.ActionBar.k6.f27949h0 = null;
        j6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.k6.f27911f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.k6.x1(j6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.k6.f27911f0);
            int i3 = q10[0];
            org.telegram.ui.ActionBar.k6.f27856c0 = i3;
            org.telegram.ui.ActionBar.k6.X = i3;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.k6.f27872d0 = i10;
            org.telegram.ui.ActionBar.k6.f27836b0 = i10;
            org.telegram.ui.ActionBar.k6.i();
            org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.f27892e0);
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23351z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.k6.f27911f0 = null;
        org.telegram.ui.ActionBar.k6.f27892e0 = null;
        org.telegram.ui.ActionBar.k6.x1(j6Var, false, false, false);
        org.telegram.ui.ActionBar.k6.u1(true);
    }
}
