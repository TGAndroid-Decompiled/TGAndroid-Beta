package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22767a;
    public final Object f22768b;

    public b1(Object obj, int i10) {
        this.f22767a = i10;
        this.f22768b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22767a;
        Object obj = this.f22768b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.rg) obj).run();
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
                ((xi) obj).f30336z2 = false;
                return;
            case 5:
                eu.i((eu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.P0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                xn0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((rn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((o11) obj).d;
                themeEditorView.f22461l = null;
                if (themeEditorView.f22454b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22453a, themeEditorView.f22457g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22453a, themeEditorView.f22457g);
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
