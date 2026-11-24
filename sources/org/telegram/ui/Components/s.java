package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class s implements etc {
    public final ThemeEditorView a;

    public s(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override
    public final void a() {
        int i = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i < themeEditorView.e.size()) {
                cnb cnbVar = (cnb) themeEditorView.e.get(i);
                int w0 = cmb.w0(cnbVar.i, cnbVar.e, false);
                cnbVar.h = w0;
                if (i == 0) {
                    themeEditorView.n.l1.c(w0);
                }
                i++;
            } else {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i2 = ThemeEditorView.EditorAlert.G1;
                editorAlert.F0(true);
                return;
            }
        }
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z) {
        bmb bmbVar = this.a.o;
        cmb.km.delete(cmb.De);
        cmb.km.delete(cmb.Ee);
        cmb.km.delete(cmb.Fe);
        cmb.km.delete(cmb.Ge);
        cmb.km.delete(cmb.He);
        cmb.g0 = null;
        bmbVar.v(null);
        if (bitmap != null) {
            cmb.e0 = new BitmapDrawable(bitmap);
            cmb.v1(bmbVar, false, false, false);
            int[] q = gm.q(cmb.e0);
            int i = q[0];
            cmb.b0 = i;
            cmb.W = i;
            int i2 = q[1];
            cmb.c0 = i2;
            cmb.a0 = i2;
            cmb.h();
            cmb.g(cmb.d0);
            nm7.e().k(nm7.D4, new Object[0]);
            return;
        }
        cmb.e0 = null;
        cmb.d0 = null;
        cmb.v1(bmbVar, false, false, false);
        cmb.s1(true);
    }
}
