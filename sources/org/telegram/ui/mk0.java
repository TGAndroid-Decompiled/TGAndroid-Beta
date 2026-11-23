package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
public final class mk0 implements View.OnTouchListener {
    public final int f50074a;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f50074a) {
            case 0:
                List list = kl0.f49451h1;
                return true;
            case 1:
                int i7 = PopupNotificationActivity.f43532c0;
                return true;
            default:
                HashSet hashSet = w91.f53215s1;
                return true;
        }
    }
}
