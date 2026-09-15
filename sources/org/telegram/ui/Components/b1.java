package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f22559a;
    public final Object f22560b;

    public b1(Object obj, int i10) {
        this.f22559a = i10;
        this.f22560b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22559a;
        Object obj = this.f22560b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ug) obj).run();
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
                ((vi) obj).f28816z2 = false;
                return;
            case 5:
                bu.i((bu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.M0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                in0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((cn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((y01) obj).d;
                themeEditorView.f22217l = null;
                if (themeEditorView.f22210b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f22209a, themeEditorView.f22213g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f22209a, themeEditorView.f22213g);
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
