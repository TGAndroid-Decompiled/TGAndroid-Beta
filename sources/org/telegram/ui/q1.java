package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class q1 extends WebView {
    public final r1 f40835a;

    public q1(r1 r1Var, Context context) {
        super(context);
        this.f40835a = r1Var;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r1 r1Var = this.f40835a;
        r1Var.f41111s = true;
        TL_iv.pageBlockEmbed pageblockembed = r1Var.f41112w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                r1Var.f41114y.f37732f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
