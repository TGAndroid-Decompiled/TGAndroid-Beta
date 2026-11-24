package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;
public final class s implements crc {
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
                blb blbVar = (blb) themeEditorView.e.get(i);
                int w0 = bkb.w0(blbVar.i, blbVar.e, false);
                blbVar.h = w0;
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
        akb akbVar = this.a.o;
        bkb.km.delete(bkb.De);
        bkb.km.delete(bkb.Ee);
        bkb.km.delete(bkb.Fe);
        bkb.km.delete(bkb.Ge);
        bkb.km.delete(bkb.He);
        bkb.g0 = null;
        akbVar.v(null);
        if (bitmap != null) {
            bkb.e0 = new BitmapDrawable(bitmap);
            bkb.v1(akbVar, false, false, false);
            int[] q = gl.q(bkb.e0);
            int i = q[0];
            bkb.b0 = i;
            bkb.W = i;
            int i2 = q[1];
            bkb.c0 = i2;
            bkb.a0 = i2;
            bkb.h();
            bkb.g(bkb.d0);
            kk7.e().k(kk7.B4, new Object[0]);
            return;
        }
        bkb.e0 = null;
        bkb.d0 = null;
        bkb.v1(akbVar, false, false, false);
        bkb.s1(true);
    }
}
