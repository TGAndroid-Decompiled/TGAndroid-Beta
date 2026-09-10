package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d1 implements DialogInterface.OnDismissListener {
    public final int f22270a;
    public final Object f22271b;

    public d1(Object obj, int i10) {
        this.f22270a = i10;
        this.f22271b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f22270a;
        Object obj = this.f22271b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.vg) obj).run();
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
                ((yi) obj).f29432z2 = false;
                return;
            case 5:
                fu.i((fu) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.M0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                rn0.H = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((ln0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((l11) obj).d;
                themeEditorView.f21302l = null;
                if (themeEditorView.f21295b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f21294a, themeEditorView.f21298g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f21294a, themeEditorView.f21298g);
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
