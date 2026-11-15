package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class p1 extends WebView {
    public final q1 f50084a;

    public p1(q1 q1Var, Context context) {
        super(context);
        this.f50084a = q1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q1 q1Var = this.f50084a;
        q1Var.f50426s = true;
        TL_iv.pageBlockEmbed pageblockembed = q1Var.f50427w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                q1Var.f50429y.f47312g0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
