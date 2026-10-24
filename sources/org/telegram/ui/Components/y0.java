package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements DialogInterface.OnDismissListener {
    public final int f32762a;
    public final Object f32763b;

    public y0(Object obj, int i10) {
        this.f32762a = i10;
        this.f32763b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f32762a;
        Object obj = this.f32763b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.kg) obj).run();
                return;
            case 1:
                AndroidUtilities.hideKeyboard((c5) obj);
                return;
            case 2:
                AndroidUtilities.hideKeyboard((e4) obj);
                return;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                return;
            case 4:
                ((ri) obj).F2 = false;
                return;
            case 5:
                yk ykVar = (yk) obj;
                ykVar.T0 = null;
                ykVar.S.post(new sk(ykVar, 2));
                return;
            case 6:
                gu.i((gu) obj);
                return;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                return;
            case 8:
                io0.H = null;
                ((View) obj).requestFocus();
                return;
            case 9:
                AndroidUtilities.hideKeyboard((co0) obj);
                return;
            default:
                ThemeEditorView themeEditorView = ((y11) obj).d;
                themeEditorView.f24544n = null;
                if (themeEditorView.d != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.f24540j, themeEditorView.f24536c, themeEditorView.f24539i);
                    try {
                        themeEditorView.f24540j.addView(themeEditorView.f24536c, themeEditorView.f24539i);
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
