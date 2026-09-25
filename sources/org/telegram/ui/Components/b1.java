package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22837a;
    public final Object f22838b;

    public b1(Object obj, int i10) {
        this.f22837a = i10;
        this.f22838b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22837a;
        Object obj = this.f22838b;
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
                ((wi) obj).f30072z2 = false;
                return;
            case 5:
                cu.i((cu) obj);
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
                ThemeEditorView themeEditorView = ((l11) obj).d;
                themeEditorView.f22440l = null;
                if (themeEditorView.f22433b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22432a, themeEditorView.f22436g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22432a, themeEditorView.f22436g);
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
