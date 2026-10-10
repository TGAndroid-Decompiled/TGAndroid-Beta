package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f24768a;
    public final Object f24769b;

    public b1(Object obj, int i10) {
        this.f24768a = i10;
        this.f24769b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24768a;
        Object obj = this.f24769b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.tg) obj).run();
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
                ((yi) obj).C2 = false;
                return;
            case 5:
                gl glVar = (gl) obj;
                glVar.Q0 = null;
                glVar.P.post(new al(glVar, 2));
                return;
            case 6:
                su.i((su) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.Q0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                oo0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((io0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((e21) obj).d;
                themeEditorView.f24362l = null;
                if (themeEditorView.f24354b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24353a, themeEditorView.f24358g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24353a, themeEditorView.f24358g);
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
