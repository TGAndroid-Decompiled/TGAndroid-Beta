package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f23502a;
    public final Object f23503b;

    public b1(Object obj, int i10) {
        this.f23502a = i10;
        this.f23503b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23502a;
        Object obj = this.f23503b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.pg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((a4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).I0 = null;
                return;
            case 4:
                ((li) obj).f26750w2 = false;
                return;
            case 5:
                ut.i((ut) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.J0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                nn0.E = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((hn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((b11) obj).d;
                themeEditorView.f23174l = null;
                if (themeEditorView.f23167b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f23166a, themeEditorView.f23170g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f23166a, themeEditorView.f23170g);
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
