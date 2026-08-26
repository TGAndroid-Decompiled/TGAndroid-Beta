package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class BottomSheetLayouted extends BottomSheetWithRecyclerListView {
    public ButtonWithCounterView button;
    public FrameLayout buttonContainer;
    public final LinearLayout layout;

    public final class SpaceView extends View {
        public int height;

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
        }
    }

    public BottomSheetLayouted(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.layout = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new MessageSeenView.AnonymousClass3(this, 2);
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.actionBar.setTitle(charSequence);
    }
}
