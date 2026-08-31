package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f25441a;
    public final Object f25442b;

    public b1(Object obj, int i10) {
        this.f25441a = i10;
        this.f25442b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f25441a;
        Object obj = this.f25442b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ng) obj).run();
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
                ((mi) obj).f29106w2 = false;
                return;
            case 5:
                xt.i((xt) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.J0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                pn0.E = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((jn0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((c11) obj).d;
                themeEditorView.f25062l = null;
                if (themeEditorView.f25054b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f25053a, themeEditorView.f25058g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f25053a, themeEditorView.f25058g);
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
