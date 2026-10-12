package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f23665a;
    public final Object f23666b;

    public b1(Object obj, int i10) {
        this.f23665a = i10;
        this.f23666b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23665a;
        Object obj = this.f23666b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.xg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((h4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((vi) obj).C2 = false;
                return;
            case 5:
                dl dlVar = (dl) obj;
                dlVar.Q0 = null;
                dlVar.P.post(new xk(dlVar, 2));
                return;
            case 6:
                nu.i((nu) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.Q0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                ko0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((eo0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((z11) obj).d;
                themeEditorView.f23336l = null;
                if (themeEditorView.f23329b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f23328a, themeEditorView.f23332g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f23328a, themeEditorView.f23332g);
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
