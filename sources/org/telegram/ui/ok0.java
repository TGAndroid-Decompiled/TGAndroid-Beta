package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
public final class ok0 implements View.OnTouchListener {
    public final int f50581a;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f50581a) {
            case 0:
                List list = ml0.f49851h1;
                return true;
            case 1:
                int i7 = PopupNotificationActivity.f43406c0;
                return true;
            default:
                HashSet hashSet = y91.f54049s1;
                return true;
        }
    }
}
