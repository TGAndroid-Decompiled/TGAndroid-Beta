package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
public final class lk0 implements View.OnTouchListener {
    public final int f48996a;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f48996a) {
            case 0:
                List list = kl0.f48672h1;
                return true;
            case 1:
                int i7 = PopupNotificationActivity.f42961c0;
                return true;
            default:
                HashSet hashSet = u91.f51834r1;
                return true;
        }
    }
}
