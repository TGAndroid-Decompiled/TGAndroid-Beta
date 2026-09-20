package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22834a;
    public final Object f22835b;

    public b1(Object obj, int i10) {
        this.f22834a = i10;
        this.f22835b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22834a;
        Object obj = this.f22835b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ug) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((e4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((vi) obj).f29164z2 = false;
                return;
            case 5:
                bu.i((bu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.O0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                un0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((on0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((m11) obj).d;
                themeEditorView.f22438l = null;
                if (themeEditorView.f22431b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22430a, themeEditorView.f22434g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22430a, themeEditorView.f22434g);
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
