package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class a1 implements DialogInterface.OnDismissListener {

    public final int f26589a;

    public final Object f26590b;

    public a1(Object obj, int i10) {
        this.f26589a = i10;
        this.f26590b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26589a;
        Object obj = this.f26590b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.lg) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((z3) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).H0 = null;
                break;
            case 4:
                ((gi) obj).f28701v2 = false;
                break;
            case 5:
                lt.i((lt) obj);
                break;
            case 6:
                float[] fArr = FragmentContextView.I0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                um0.D = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                AndroidUtilities.hideKeyboard((om0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((g01) obj).d;
                themeEditorView.f26559l = null;
                if (themeEditorView.f26551b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f26550a, themeEditorView.f26555g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f26550a, themeEditorView.f26555g);
                        themeEditorView.d();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
