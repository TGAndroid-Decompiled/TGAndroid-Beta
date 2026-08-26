package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;

public final class TopicsFragment$$ExternalSyntheticLambda21 implements View.OnTouchListener {
    public final int $r8$classId;

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                HashSet hashSet = TopicsFragment.settingsPreloaded;
                break;
            default:
                int[][] iArr = WallpapersListActivity.defaultColorsLight;
                break;
        }
        return true;
    }
}
