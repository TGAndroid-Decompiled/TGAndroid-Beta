package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class fz0 implements a71 {
    public final ThemeEditorView f33701a;

    public fz0(ThemeEditorView themeEditorView) {
        this.f33701a = themeEditorView;
    }

    @Override
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.f33701a;
            if (i7 < themeEditorView.f31586e.size()) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) themeEditorView.f31586e.get(i7);
                int x02 = org.telegram.ui.ActionBar.m6.x0(v6Var.f28634i, v6Var.f28631e, false);
                v6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.f31594n.l1.c(x02);
                }
                i7++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.f31594n;
                int i10 = ThemeEditorView.EditorAlert.G1;
                editorAlert.L0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z9) {
        org.telegram.ui.ActionBar.l6 l6Var = this.f33701a.f31595o;
        org.telegram.ui.ActionBar.m6.im.delete(org.telegram.ui.ActionBar.m6.Be);
        org.telegram.ui.ActionBar.m6.im.delete(org.telegram.ui.ActionBar.m6.Ce);
        org.telegram.ui.ActionBar.m6.im.delete(org.telegram.ui.ActionBar.m6.De);
        org.telegram.ui.ActionBar.m6.im.delete(org.telegram.ui.ActionBar.m6.Ee);
        org.telegram.ui.ActionBar.m6.im.delete(org.telegram.ui.ActionBar.m6.Fe);
        org.telegram.ui.ActionBar.m6.f27958h0 = null;
        l6Var.v(null);
        if (bitmap != null) {
            org.telegram.ui.ActionBar.m6.f27922f0 = new BitmapDrawable(bitmap);
            org.telegram.ui.ActionBar.m6.x1(l6Var, false, false, false);
            int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.m6.f27922f0);
            int i7 = q10[0];
            org.telegram.ui.ActionBar.m6.f27866c0 = i7;
            org.telegram.ui.ActionBar.m6.X = i7;
            int i10 = q10[1];
            org.telegram.ui.ActionBar.m6.f27885d0 = i10;
            org.telegram.ui.ActionBar.m6.f27847b0 = i10;
            org.telegram.ui.ActionBar.m6.i();
            org.telegram.ui.ActionBar.m6.h(org.telegram.ui.ActionBar.m6.f27903e0);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25126z4, new Object[0]);
            return;
        }
        org.telegram.ui.ActionBar.m6.f27922f0 = null;
        org.telegram.ui.ActionBar.m6.f27903e0 = null;
        org.telegram.ui.ActionBar.m6.x1(l6Var, false, false, false);
        org.telegram.ui.ActionBar.m6.u1(true);
    }
}
