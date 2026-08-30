package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f23531a;
    public final Object f23532b;

    public b1(Object obj, int i10) {
        this.f23531a = i10;
        this.f23532b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23531a;
        Object obj = this.f23532b;
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
                ((li) obj).f26754w2 = false;
                return;
            case 5:
                vt.i((vt) obj);
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
                themeEditorView.f23201l = null;
                if (themeEditorView.f23194b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f23193a, themeEditorView.f23197g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f23193a, themeEditorView.f23197g);
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
