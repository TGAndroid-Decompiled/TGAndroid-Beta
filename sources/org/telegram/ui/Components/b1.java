package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f24742a;
    public final Object f24743b;

    public b1(Object obj, int i10) {
        this.f24742a = i10;
        this.f24743b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24742a;
        Object obj = this.f24743b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ug) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((f4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((xi) obj).f32879z2 = false;
                return;
            case 5:
                eu.i((eu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.P0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                ao0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((un0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((w11) obj).d;
                themeEditorView.f24356l = null;
                if (themeEditorView.f24348b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24347a, themeEditorView.f24352g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24347a, themeEditorView.f24352g);
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
