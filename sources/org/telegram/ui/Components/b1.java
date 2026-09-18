package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22532a;
    public final Object f22533b;

    public b1(Object obj, int i10) {
        this.f22532a = i10;
        this.f22533b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22532a;
        Object obj = this.f22533b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.wg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((d4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((vi) obj).f28811z2 = false;
                return;
            case 5:
                bu.i((bu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.O0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                jn0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((dn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((z01) obj).d;
                themeEditorView.f22230l = null;
                if (themeEditorView.f22223b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22222a, themeEditorView.f22226g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22222a, themeEditorView.f22226g);
                        themeEditorView.d();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
