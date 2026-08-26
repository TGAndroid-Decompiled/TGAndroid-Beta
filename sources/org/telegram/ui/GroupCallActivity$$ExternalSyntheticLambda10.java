package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.RecyclerListView;

public final class GroupCallActivity$$ExternalSyntheticLambda10 implements ActionBarPopupWindow.OnDispatchKeyEventListener, ActionBarMenuItem.ActionBarMenuItemDelegate, RecyclerListView.OnItemLongClickListener, OnApplyWindowInsetsListener, NativeInstance.AudioLevelsCallback {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda10(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$showMenuForCell$74(keyEvent);
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.lambda$new$32(i);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f$0.lambda$new$10(iArr, fArr, zArr);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 2:
                return this.f$0.lambda$new$38(view, i);
            default:
                return this.f$0.lambda$new$25(view, i);
        }
    }
}
