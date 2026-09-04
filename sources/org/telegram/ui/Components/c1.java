package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c1 implements DialogInterface.OnDismissListener {
    public final int f24839a;
    public final Object f24840b;

    public c1(Object obj, int i10) {
        this.f24839a = i10;
        this.f24840b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24839a;
        Object obj = this.f24840b;
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
                ((vi) obj).f31345z2 = false;
                return;
            case 5:
                zt.i((zt) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.M0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                hn0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((bn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((x01) obj).d;
                themeEditorView.f24169l = null;
                if (themeEditorView.f24161b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24160a, themeEditorView.f24165g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24160a, themeEditorView.f24165g);
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
