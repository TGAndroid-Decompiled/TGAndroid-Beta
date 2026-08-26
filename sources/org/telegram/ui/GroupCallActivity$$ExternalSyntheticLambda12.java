package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.GroupCallGridCell;

public final class GroupCallActivity$$ExternalSyntheticLambda12 implements ActionBarMenuItem.ActionBarMenuItemDelegate, RecyclerListView.OnItemLongClickListener, OnApplyWindowInsetsListener, NativeInstance.AudioLevelsCallback, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda12(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets$4(windowInsetsCompat);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        GroupCallActivity.AnonymousClass63 anonymousClass63;
        GroupCallActivity groupCallActivity = this.f$0;
        groupCallActivity.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (anonymousClass63 = groupCallActivity.scrimPopupWindow) != null && anonymousClass63.isShowing()) {
            groupCallActivity.scrimPopupWindow.dismiss();
        }
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f$0.lambda$new$10(fArr, iArr);
    }

    @Override
    public boolean onItemClick(int i, View view) {
        switch (this.$r8$classId) {
            case 1:
                GroupCallActivity groupCallActivity = this.f$0;
                if (groupCallActivity.showMenuForCell(view)) {
                    try {
                        groupCallActivity.listView.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                GroupCallActivity groupCallActivity2 = this.f$0;
                if (!groupCallActivity2.isRtmpStream()) {
                    if (view instanceof GroupCallGridCell) {
                        return groupCallActivity2.showMenuForCell(view);
                    }
                    if (view instanceof GroupCallUserCell) {
                        groupCallActivity2.updateItems$1$1();
                        RLottieImageView rLottieImageView = ((GroupCallUserCell) view).muteButton;
                        if (rLottieImageView.isEnabled()) {
                            rLottieImageView.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
