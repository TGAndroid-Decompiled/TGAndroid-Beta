package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a1 implements DialogInterface.OnDismissListener {
    public final int f24582a;
    public final Object f24583b;

    public a1(Object obj, int i10) {
        this.f24582a = i10;
        this.f24583b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24582a;
        Object obj = this.f24583b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.kg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((e5) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((f4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((ti) obj).F2 = false;
                return;
            case 5:
                al alVar = (al) obj;
                alVar.T0 = null;
                alVar.S.post(new uk(alVar, 2));
                return;
            case 6:
                iu.i((iu) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                jo0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((do0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((z11) obj).d;
                themeEditorView.f24543n = null;
                if (themeEditorView.d != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.f24539j, themeEditorView.f24535c, themeEditorView.f24538i);
                    try {
                        themeEditorView.f24539j.addView(themeEditorView.f24535c, themeEditorView.f24538i);
                        themeEditorView.e();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
