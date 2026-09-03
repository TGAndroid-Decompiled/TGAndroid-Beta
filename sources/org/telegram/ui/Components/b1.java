package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f25454a;
    public final Object f25455b;

    public b1(Object obj, int i10) {
        this.f25454a = i10;
        this.f25455b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f25454a;
        Object obj = this.f25455b;
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
                ((mi) obj).f29124w2 = false;
                return;
            case 5:
                xt.i((xt) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.J0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                on0.E = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((in0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((b11) obj).d;
                themeEditorView.f25064l = null;
                if (themeEditorView.f25056b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f25055a, themeEditorView.f25060g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f25055a, themeEditorView.f25060g);
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
