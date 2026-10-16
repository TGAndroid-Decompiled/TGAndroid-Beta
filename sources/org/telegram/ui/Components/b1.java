package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f23351a;
    public final Object f23352b;

    public b1(Object obj, int i10) {
        this.f23351a = i10;
        this.f23352b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23351a;
        Object obj = this.f23352b;
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
                cl clVar = (cl) obj;
                clVar.Q0 = null;
                clVar.P.post(new wk(clVar, 2));
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
                ThemeEditorView themeEditorView = ((a21) obj).d;
                themeEditorView.f23036l = null;
                if (themeEditorView.f23029b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f23028a, themeEditorView.f23032g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f23028a, themeEditorView.f23032g);
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
