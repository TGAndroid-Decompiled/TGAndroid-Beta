package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;
public final class i extends WebView {
    public final j a;

    public i(j jVar, Activity activity) {
        super(activity);
        this.a = jVar;
        setFocusable(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j jVar = this.a;
        jVar.s = true;
        TL_iv.pageBlockEmbed pageblockembed = jVar.w;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                jVar.y.g0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
