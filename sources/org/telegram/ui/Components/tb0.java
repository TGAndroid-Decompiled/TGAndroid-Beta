package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tb0 implements Runnable {
    public final int f30774a;
    public final jc0 f30775b;
    public final Context f30776c;

    public tb0(jc0 jc0Var, Context context, int i10) {
        this.f30774a = i10;
        this.f30775b = jc0Var;
        this.f30776c = context;
    }

    @Override
    public final void run() {
        switch (this.f30774a) {
            case 0:
                jc0 jc0Var = this.f30775b;
                jc0Var.f27674c0.a(false);
                AndroidUtilities.runOnUIThread(new tb0(jc0Var, this.f30776c, 1));
                return;
            default:
                Context context = this.f30776c;
                if (AndroidUtilities.isContextSafe(context)) {
                    new sg.y0(context, 43, this.f30775b.f27674c0.F).show();
                    return;
                }
                return;
        }
    }
}
