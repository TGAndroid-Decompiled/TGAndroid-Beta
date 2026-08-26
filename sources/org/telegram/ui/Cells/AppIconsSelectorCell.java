package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LauncherIconController;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public final class AppIconsSelectorCell extends RecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList availableIcons;
    public final int currentAccount;
    public final LinearLayoutManager linearLayoutManager;

    public final class AnonymousClass2 extends RecyclerView.ItemDecoration {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass2(KeyEvent.Callback callback, int i) {
            this.$r8$classId = i;
            this.this$0 = callback;
        }

        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 0:
                    int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
                    if (adapterPosition == 0) {
                        rect.left = AndroidUtilities.dp(18.0f);
                    }
                    AppIconsSelectorCell appIconsSelectorCell = (AppIconsSelectorCell) this.this$0;
                    if (adapterPosition != appIconsSelectorCell.getAdapter().getItemCount() - 1) {
                        int itemCount = appIconsSelectorCell.getAdapter().getItemCount();
                        if (itemCount != 4) {
                            rect.right = AndroidUtilities.dp(24.0f);
                        } else {
                            rect.right = OKLCH.m$3(58.0f, itemCount, appIconsSelectorCell.getWidth() - AndroidUtilities.dp(36.0f)) / (itemCount - 1);
                        }
                    } else {
                        rect.right = AndroidUtilities.dp(18.0f);
                    }
                    break;
                case 1:
                    super.getItemOffsets(rect, view, recyclerView, state);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    SelectorBottomSheet selectorBottomSheet = (SelectorBottomSheet) this.this$0;
                    if (childAdapterPosition == selectorBottomSheet.items.size()) {
                        rect.bottom = selectorBottomSheet.listPaddingTop;
                    }
                    break;
                default:
                    rect.right = ((EmojiBottomSheet.GifPage) this.this$0).layoutManager.isLastInRow(recyclerView.getChildAdapterPosition(view)) ? 0 : AndroidUtilities.dp(4.0f);
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends LinearSmoothScroller {
        @Override
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return AndroidUtilities.dp(16.0f) + (i3 - i);
        }

        @Override
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return super.calculateSpeedPerPixel(displayMetrics) * 3.0f;
        }
    }

    public class AdaptiveIconImageView extends ImageView {
        public int backgroundOuterPadding;
        public Drawable foreground;
        public int outerPadding;
        public final Path path;

        public AdaptiveIconImageView(Context context) {
            super(context);
            this.path = new Path();
            this.outerPadding = AndroidUtilities.dp(5.0f);
            this.backgroundOuterPadding = AndroidUtilities.dp(42.0f);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.path);
            canvas.scale((this.backgroundOuterPadding / getWidth()) + 1.0f, (this.backgroundOuterPadding / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            super.draw(canvas);
            canvas.restore();
            Drawable drawable = this.foreground;
            if (drawable != null) {
                int i = -this.outerPadding;
                drawable.setBounds(i, i, getWidth() + this.outerPadding, getHeight() + this.outerPadding);
                this.foreground.draw(canvas);
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            Path path = this.path;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
        }

        public void setBackgroundOuterPadding(int i) {
            this.backgroundOuterPadding = i;
        }

        public void setForeground(int i) {
            this.foreground = getContext().getDrawable(i);
            invalidate();
        }

        public void setOuterPadding(int i) {
            this.outerPadding = i;
        }

        public void setPadding(int i) {
            setPadding(i, i, i, i);
        }
    }

    public final class IconHolderView extends LinearLayout {
        public static final int $r8$clinit = 0;
        public final Paint fillPaint;
        public final AdaptiveIconImageView iconView;
        public final Paint outlinePaint;
        public float progress;
        public final TextView titleView;

        public IconHolderView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            Paint paint2 = new Paint(1);
            this.fillPaint = paint2;
            setOrientation(1);
            setWillNotDraw(false);
            AdaptiveIconImageView adaptiveIconImageView = new AdaptiveIconImageView(context);
            this.iconView = adaptiveIconImageView;
            adaptiveIconImageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            addView(adaptiveIconImageView, LayoutHelper.createLinear(58, 58, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setSingleLine();
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 4, 0, 0));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
            paint2.setColor(-1);
        }

        @Override
        public final void draw(Canvas canvas) {
            Paint paint = this.outlinePaint;
            float strokeWidth = paint.getStrokeWidth();
            RectF rectF = AndroidUtilities.rectTmp;
            AdaptiveIconImageView adaptiveIconImageView = this.iconView;
            rectF.set(adaptiveIconImageView.getLeft() + strokeWidth, adaptiveIconImageView.getTop() + strokeWidth, adaptiveIconImageView.getRight() - strokeWidth, adaptiveIconImageView.getBottom() - strokeWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.fillPaint);
            super.draw(canvas);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }

        public final void setProgress(float f) {
            this.progress = f;
            TextView textView = this.titleView;
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false);
            int i = Theme.key_windowBackgroundWhiteValueText;
            textView.setTextColor(ColorUtils.blendARGB(f, color, Theme.getColor(null, i, false)));
            Paint paint = this.outlinePaint;
            paint.setColor(ColorUtils.blendARGB(f, ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_switchTrack, false), 63), Theme.getColor(null, i, false)));
            paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f))));
            invalidate();
        }

        public final void setSelected(boolean z, boolean z2) {
            int i = 2;
            float f = z ? 1.0f : 0.0f;
            float f2 = this.progress;
            if (f == f2 && z2) {
                return;
            }
            if (!z2) {
                setProgress(f);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(250L);
            duration.setInterpolator(Easings.easeInOutQuad);
            duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, i));
            duration.start();
        }
    }

    public AppIconsSelectorCell(Context context, BaseFragment baseFragment, int i) {
        super(context);
        this.availableIcons = new ArrayList();
        this.currentAccount = i;
        setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        setFocusable(false);
        lambda$onCellEnter$52(null);
        setLayoutAnimation(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.linearLayoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setAdapter(new RecyclerView.Adapter() {
            @Override
            public final int getItemCount() {
                return AppIconsSelectorCell.this.availableIcons.size();
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                IconHolderView iconHolderView = (IconHolderView) viewHolder.itemView;
                LauncherIconController.LauncherIcon launcherIcon = (LauncherIconController.LauncherIcon) AppIconsSelectorCell.this.availableIcons.get(i2);
                iconHolderView.iconView.setImageResource(launcherIcon.background);
                TextView textView = iconHolderView.titleView;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!launcherIcon.premium || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(launcherIcon.title));
                } else {
                    SpannableString spannableString = new SpannableString(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("d "), launcherIcon.title));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_premiumlock);
                    coloredImageSpan.setTopOffset(1);
                    coloredImageSpan.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                iconHolderView.setSelected(LauncherIconController.isEnabled(launcherIcon), false);
                AdaptiveIconImageView adaptiveIconImageView = iconHolderView.iconView;
                int iDp = AndroidUtilities.dp(18.0f);
                adaptiveIconImageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, Theme.getColor(null, Theme.key_listSelector, false), -16777216));
                adaptiveIconImageView.setForeground(launcherIcon.foreground);
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                return new RecyclerListView.Holder(new IconHolderView(viewGroup.getContext()));
            }
        });
        addItemDecoration(new AnonymousClass2(this, 0));
        setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda6(this, baseFragment, context, 1));
        updateIconsVisibility();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.premiumStatusChangedGlobal) {
            updateIconsVisibility();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateItemDecorations();
    }

    public final void updateIconsVisibility() {
        ArrayList arrayList = this.availableIcons;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(LauncherIconController.LauncherIcon.values()));
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            int i = 0;
            while (i < arrayList.size()) {
                if (((LauncherIconController.LauncherIcon) arrayList.get(i)).premium) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        getAdapter().notifyDataSetChanged();
        invalidateItemDecorations();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (LauncherIconController.isEnabled((LauncherIconController.LauncherIcon) arrayList.get(i2))) {
                this.linearLayoutManager.scrollToPositionWithOffset(i2, AndroidUtilities.dp(16.0f));
                return;
            }
        }
    }
}
