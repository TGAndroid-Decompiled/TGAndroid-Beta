package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class qz0 implements o71 {
    public final ThemeEditorView f39021a;

    public qz0(ThemeEditorView themeEditorView) {
        this.f39021a = themeEditorView;
    }

    @Override
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f39021a;
            if (i7 < themeEditorView.f33184e.size()) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) themeEditorView.f33184e.get(i7);
                int x02 = org.telegram.ui.ActionBar.m6.x0(v6Var.f30144i, v6Var.f30141e, false);
                v6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.f33192n.f33194m1.c(x02);
                }
                i7++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f33192n;
                int i10 = ThemeEditorView.EditorAlert.H1;
                editorAlert.M0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.l6 l6Var = this.f39021a.f33193o;
        org.telegram.ui.ActionBar.m6.lm.delete(org.telegram.ui.ActionBar.m6.Ee);
        org.telegram.ui.ActionBar.m6.lm.delete(org.telegram.ui.ActionBar.m6.Fe);
        org.telegram.ui.ActionBar.m6.lm.delete(org.telegram.ui.ActionBar.m6.Ge);
        org.telegram.ui.ActionBar.m6.lm.delete(org.telegram.ui.ActionBar.m6.He);
        org.telegram.ui.ActionBar.m6.lm.delete(org.telegram.ui.ActionBar.m6.Ie);
        org.telegram.ui.ActionBar.m6.f29449h0 = null;
        l6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.m6.f29413f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.m6.x1(l6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.m6.f29413f0);
            int i7 = q10[0];
            org.telegram.ui.ActionBar.m6.f29357c0 = i7;
            org.telegram.ui.ActionBar.m6.X = i7;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.m6.f29376d0 = i10;
            org.telegram.ui.ActionBar.m6.f29338b0 = i10;
            org.telegram.ui.ActionBar.m6.i();
            org.telegram.ui.ActionBar.m6.h(org.telegram.ui.ActionBar.m6.f29394e0);
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.C4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.m6.f29413f0 = null;
        org.telegram.ui.ActionBar.m6.f29394e0 = null;
        org.telegram.ui.ActionBar.m6.x1(l6Var, false, false, false);
        org.telegram.ui.ActionBar.m6.u1(true);
    }
}
