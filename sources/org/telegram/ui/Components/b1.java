package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22529a;
    public final Object f22530b;

    public b1(Object obj, int i10) {
        this.f22529a = i10;
        this.f22530b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22529a;
        Object obj = this.f22530b;
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
                ((vi) obj).f28808z2 = false;
                return;
            case 5:
                bu.i((bu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.M0;
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
                themeEditorView.f22227l = null;
                if (themeEditorView.f22220b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22219a, themeEditorView.f22223g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22219a, themeEditorView.f22223g);
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
