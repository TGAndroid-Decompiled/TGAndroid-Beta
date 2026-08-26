package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class BottomSheetLayouted extends BottomSheetWithRecyclerListView {
    public ButtonWithCounterView button;
    public FrameLayout buttonContainer;
    public final LinearLayout layout;

    public class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public int getItemCount() {
            return 1;
        }

        @Override
        public int getItemViewType(int i) {
            return i;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(BottomSheetLayouted.this.layout);
        }
    }

    public static class SpaceView extends View {
        private int height;

        public SpaceView(Context context) {
            super(context);
            this.height = 0;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
        }

        public void setHeight(int i, int i2) {
            if (this.height != i) {
                this.height = i;
                requestLayout();
            }
        }
    }

    public BottomSheetLayouted(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.layout = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new Adapter();
    }

    public void createButton() {
        float f = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
        this.buttonContainer.addView(view, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, this.resourcesProvider);
        this.button = buttonWithCounterView;
        float f2 = f + 16.0f;
        this.buttonContainer.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, f2, 16.0f, f2, 16.0f));
        this.containerView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 87));
        RecyclerListView recyclerListView = this.recyclerListView;
        recyclerListView.setPadding(recyclerListView.getPaddingLeft(), this.recyclerListView.getPaddingTop(), this.recyclerListView.getPaddingRight(), AndroidUtilities.dp(80.0f) + this.recyclerListView.getPaddingBottom());
    }

    @Override
    public CharSequence getTitle() {
        return null;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.actionBar.setTitle(charSequence);
    }
}
