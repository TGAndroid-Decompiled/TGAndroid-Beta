package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22799a;
    public final Object f22800b;

    public b1(Object obj, int i10) {
        this.f22799a = i10;
        this.f22800b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22799a;
        Object obj = this.f22800b;
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
                ((vi) obj).f29162z2 = false;
                return;
            case 5:
                bu.i((bu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.O0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                wn0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((qn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((o11) obj).d;
                themeEditorView.f22454l = null;
                if (themeEditorView.f22447b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22446a, themeEditorView.f22450g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22446a, themeEditorView.f22450g);
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
