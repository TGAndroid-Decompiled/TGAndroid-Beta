package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class lw extends ImageView {

    public final yy f30476a;

    public lw(yy yyVar, Context context) {
        super(context);
        this.f30476a = yyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xx xxVar;
        int action = motionEvent.getAction();
        yy yyVar = this.f30476a;
        if (action == 0) {
            yyVar.L1 = true;
            yyVar.M1 = false;
            AndroidUtilities.runOnUIThread(new xl(yyVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            yyVar.L1 = false;
            if (!yyVar.M1 && (xxVar = yyVar.f35025p1) != null && xxVar.k()) {
                try {
                    yyVar.f35051x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
