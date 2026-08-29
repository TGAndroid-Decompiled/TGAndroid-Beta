package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d1 implements DialogInterface.OnDismissListener {
    public final int f27628a;
    public final Object f27629b;

    public d1(Object obj, int i10) {
        this.f27628a = i10;
        this.f27629b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f27628a;
        Object obj = this.f27629b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ig) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((d4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).H0 = null;
                return;
            case 4:
                ((ni) obj).f31056v2 = false;
                return;
            case 5:
                st.i((st) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.I0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                en0.D = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((ym0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((q01) obj).d;
                themeEditorView.f26574l = null;
                if (themeEditorView.f26566b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f26565a, themeEditorView.f26570g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f26565a, themeEditorView.f26570g);
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
