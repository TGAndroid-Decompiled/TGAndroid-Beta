package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f24511a;
    public final Object f24512b;

    public b1(Object obj, int i10) {
        this.f24511a = i10;
        this.f24512b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24511a;
        Object obj = this.f24512b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.wg) obj).run();
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
                ((aj) obj).C2 = false;
                return;
            case 5:
                il ilVar = (il) obj;
                ilVar.Q0 = null;
                ilVar.P.post(new cl(ilVar, 2));
                return;
            case 6:
                uu.i((uu) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.Q0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                to0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((no0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((j21) obj).d;
                themeEditorView.f24136l = null;
                if (themeEditorView.f24128b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24127a, themeEditorView.f24132g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24127a, themeEditorView.f24132g);
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
