package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements DialogInterface.OnDismissListener {
    public final int f24742a;
    public final Object f24743b;

    public b1(Object obj, int i10) {
        this.f24742a = i10;
        this.f24743b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24742a;
        Object obj = this.f24743b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.sg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((h4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((yi) obj).C2 = false;
                return;
            case 5:
                gl glVar = (gl) obj;
                glVar.Q0 = null;
                glVar.P.post(new al(glVar, 2));
                return;
            case 6:
                su.i((su) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.Q0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                po0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((jo0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((f21) obj).d;
                themeEditorView.f24350l = null;
                if (themeEditorView.f24342b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.f24341a, themeEditorView.f24346g);
                    try {
                        themeEditorView.h.addView(themeEditorView.f24341a, themeEditorView.f24346g);
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
