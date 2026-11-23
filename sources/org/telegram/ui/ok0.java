package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
public final class ok0 implements View.OnTouchListener {
    public final int f50595a;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f50595a) {
            case 0:
                List list = ml0.f49865h1;
                return true;
            case 1:
                int i7 = PopupNotificationActivity.f43416c0;
                return true;
            default:
                HashSet hashSet = y91.f54074s1;
                return true;
        }
    }
}
