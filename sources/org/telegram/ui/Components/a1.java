package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a1 implements DialogInterface.OnDismissListener {
    public final int f26616a;
    public final Object f26617b;

    public a1(Object obj, int i9) {
        this.f26616a = i9;
        this.f26617b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i9 = this.f26616a;
        Object obj = this.f26617b;
        switch (i9) {
            case 0:
                ((org.telegram.ui.jg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((z3) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).H0 = null;
                return;
            case 4:
                ((ki) obj).f30165v2 = false;
                return;
            case 5:
                mt.i((mt) obj);
                return;
            case 6:
                float[] fArr = FragmentContextView.I0;
                ((FragmentContextView) obj).c(false);
                return;
            case 7:
                sm0.D = null;
                ((View) obj).requestFocus();
                return;
            case 8:
                AndroidUtilities.hideKeyboard((mm0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((e01) obj).d;
                themeEditorView.f26563l = null;
                if (themeEditorView.f26555b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f26554a, themeEditorView.f26559g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f26554a, themeEditorView.f26559g);
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
