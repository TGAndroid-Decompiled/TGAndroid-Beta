package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class p1 extends WebView {
    public final q1 f48586a;

    public p1(q1 q1Var, Context context) {
        super(context);
        this.f48586a = q1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q1 q1Var = this.f48586a;
        q1Var.f48860s = true;
        TL_iv.pageBlockEmbed pageblockembed = q1Var.f48861w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                q1Var.f48863y.f45888f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
