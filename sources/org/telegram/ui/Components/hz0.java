package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class hz0 implements b71 {
    public final ThemeEditorView f35379a;

    public hz0(ThemeEditorView themeEditorView) {
        this.f35379a = themeEditorView;
    }

    @Override
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f35379a;
            if (i7 < themeEditorView.f32751e.size()) {
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) themeEditorView.f32751e.get(i7);
                int x02 = org.telegram.ui.ActionBar.j6.x0(s6Var.f29603i, s6Var.f29600e, false);
                s6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.f32759n.f32761m1.c(x02);
                }
                i7++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f32759n;
                int i10 = ThemeEditorView.EditorAlert.H1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f35379a.f32760o;
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Ee);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Fe);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Ge);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.He);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Ie);
        org.telegram.ui.ActionBar.j6.f28917h0 = null;
        i6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.j6.f28881f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.j6.x1(i6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.j6.f28881f0);
            int i7 = q10[0];
            org.telegram.ui.ActionBar.j6.f28825c0 = i7;
            org.telegram.ui.ActionBar.j6.X = i7;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.j6.f28844d0 = i10;
            org.telegram.ui.ActionBar.j6.f28806b0 = i10;
            org.telegram.ui.ActionBar.j6.i();
            org.telegram.ui.ActionBar.j6.h(org.telegram.ui.ActionBar.j6.f28862e0);
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25618z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.j6.f28881f0 = null;
        org.telegram.ui.ActionBar.j6.f28862e0 = null;
        org.telegram.ui.ActionBar.j6.x1(i6Var, false, false, false);
        org.telegram.ui.ActionBar.j6.u1(true);
    }
}
