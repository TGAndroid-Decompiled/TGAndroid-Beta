package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class p1 extends WebView {
    public final q1 f50700a;

    public p1(q1 q1Var, Context context) {
        super(context);
        this.f50700a = q1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q1 q1Var = this.f50700a;
        q1Var.f51030s = true;
        TL_iv.pageBlockEmbed pageblockembed = q1Var.f51031w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                q1Var.f51033y.f47959g0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
