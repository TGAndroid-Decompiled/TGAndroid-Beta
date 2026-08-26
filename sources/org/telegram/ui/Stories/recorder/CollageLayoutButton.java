package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;

public final class CollageLayoutButton extends ToggleButton2 {

    public final class CollageLayoutListView extends FrameLayout {
        public final ArticleViewer.PageLayout.AnonymousClass1 listView;
        public Utilities.Callback onLayoutClick;
        public CollageLayout selectedLayout;
        public boolean visible;
        public ValueAnimator visibleAnimator;
        public float visibleProgress;

        public final class Button extends ToggleButton2 {
            public int position;
        }

        public CollageLayoutListView(final Activity activity, final FlashViews flashViews) {
            super(activity);
            ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = new ArticleViewer.PageLayout.AnonymousClass1(this, activity);
            this.listView = anonymousClass1;
            anonymousClass1.setAdapter(new RecyclerView.Adapter() {
                @Override
                public final int getItemCount() {
                    return CollageLayout.getLayouts().size();
                }

                @Override
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    Button button = (Button) viewHolder.itemView;
                    CollageLayout collageLayout = (CollageLayout) CollageLayout.getLayouts().get(i);
                    boolean z = i == button.position;
                    button.setDrawable(new MotionPhotoDrawable(collageLayout, false));
                    button.setSelected(collageLayout.equals(CollageLayoutListView.this.selectedLayout), z);
                    button.position = i;
                }

                @Override
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    Button button = new Button(activity);
                    button.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
                    button.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
                    return new RecyclerListView.Holder(button);
                }

                @Override
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    Button button = (Button) viewHolder.itemView;
                    FlashViews flashViews2 = flashViews;
                    button.setInvert(flashViews2.invert);
                    flashViews2.invertableViews.add(button);
                    int i = button.position;
                    if (i < 0 || i >= CollageLayout.getLayouts().size()) {
                        return;
                    }
                    CollageLayout collageLayout = (CollageLayout) CollageLayout.getLayouts().get(button.position);
                    button.setDrawable(new MotionPhotoDrawable(collageLayout, false));
                    button.setSelected(collageLayout.equals(CollageLayoutListView.this.selectedLayout), false);
                }

                @Override
                public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                    flashViews.invertableViews.remove((Button) viewHolder.itemView);
                }
            });
            anonymousClass1.setLayoutManager(new LinearLayoutManager(0, false));
            anonymousClass1.setClipToPadding(false);
            anonymousClass1.setVisibility(8);
            anonymousClass1.setWillNotDraw(false);
            anonymousClass1.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 15));
            addView(anonymousClass1, LayoutHelper.createFrame(56.0f, -1));
        }

        public void setOnLayoutClick(Utilities.Callback<CollageLayout> callback) {
            this.onLayoutClick = callback;
        }

        public void setSelected(CollageLayout collageLayout) {
            this.selectedLayout = collageLayout;
            AndroidUtilities.updateVisibleRows(this.listView);
        }

        public final void setVisible(boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.visibleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.visible == z) {
                return;
            }
            this.visible = z;
            ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = this.listView;
            if (!z2) {
                this.visibleProgress = z ? 1.0f : 0.0f;
                anonymousClass1.invalidate();
                anonymousClass1.setVisibility(z ? 0 : 8);
                return;
            }
            anonymousClass1.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.visibleProgress, z ? 1.0f : 0.0f);
            this.visibleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 6));
            this.visibleAnimator.addListener(new TodoItemMenu.AnonymousClass15(8, this, z));
            this.visibleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.visibleAnimator.setDuration(340L);
            this.visibleAnimator.start();
        }
    }
}
