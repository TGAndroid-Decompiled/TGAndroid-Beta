package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class oz0 implements l71 {
    public final ThemeEditorView f38198a;

    public oz0(ThemeEditorView themeEditorView) {
        this.f38198a = themeEditorView;
    }

    @Override
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f38198a;
            if (i7 < themeEditorView.f33148e.size()) {
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) themeEditorView.f33148e.get(i7);
                int x02 = org.telegram.ui.ActionBar.n6.x0(w6Var.f30160i, w6Var.f30157e, false);
                w6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.f33156n.f33158m1.c(x02);
                }
                i7++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f33156n;
                int i10 = ThemeEditorView.EditorAlert.H1;
                editorAlert.M0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.m6 m6Var = this.f38198a.f33157o;
        org.telegram.ui.ActionBar.n6.lm.delete(org.telegram.ui.ActionBar.n6.Ee);
        org.telegram.ui.ActionBar.n6.lm.delete(org.telegram.ui.ActionBar.n6.Fe);
        org.telegram.ui.ActionBar.n6.lm.delete(org.telegram.ui.ActionBar.n6.Ge);
        org.telegram.ui.ActionBar.n6.lm.delete(org.telegram.ui.ActionBar.n6.He);
        org.telegram.ui.ActionBar.n6.lm.delete(org.telegram.ui.ActionBar.n6.Ie);
        org.telegram.ui.ActionBar.n6.f29464h0 = null;
        m6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.n6.f29428f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.n6.x1(m6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.n6.f29428f0);
            int i7 = q10[0];
            org.telegram.ui.ActionBar.n6.f29372c0 = i7;
            org.telegram.ui.ActionBar.n6.X = i7;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.n6.f29391d0 = i10;
            org.telegram.ui.ActionBar.n6.f29353b0 = i10;
            org.telegram.ui.ActionBar.n6.i();
            org.telegram.ui.ActionBar.n6.h(org.telegram.ui.ActionBar.n6.f29409e0);
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.B4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.n6.f29428f0 = null;
        org.telegram.ui.ActionBar.n6.f29409e0 = null;
        org.telegram.ui.ActionBar.n6.x1(m6Var, false, false, false);
        org.telegram.ui.ActionBar.n6.u1(true);
    }
}
