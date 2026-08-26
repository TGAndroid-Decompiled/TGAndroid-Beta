package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class HorizontalRoundTabsLayout extends HorizontalScrollView {
    private static final RectF tmpRect = new RectF();
    private boolean accent;
    private final Paint bgPaint;
    private final Path clipPath;
    private final Path clipPath2;
    public final LinearLayout linearLayout;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectedIndex;
    private final AnimatedFloat selectorEndX;
    private final AnimatedFloat selectorStartX;
    private final TextPaint textPaint;

    public static final class Factory extends UItem.UItemFactory<HorizontalRoundTabsLayout> {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        public static UItem as(int i, ArrayList<CharSequence> arrayList, Utilities.Callback2<Integer, HorizontalRoundTabsLayout> callback2) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.intValue = i;
            uItemOfFactory.object = arrayList;
            uItemOfFactory.object2 = callback2;
            return uItemOfFactory;
        }

        public static void lambda$bindView$0(UItem uItem, HorizontalRoundTabsLayout horizontalRoundTabsLayout, int i) {
            ((Utilities.Callback2) uItem.object2).run(Integer.valueOf(i), horizontalRoundTabsLayout);
        }

        @Override
        public void bindView(View view, final UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            final HorizontalRoundTabsLayout horizontalRoundTabsLayout = (HorizontalRoundTabsLayout) view;
            horizontalRoundTabsLayout.setTabs((ArrayList) uItem.object, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i) {
                    HorizontalRoundTabsLayout.Factory.lambda$bindView$0(uItem, horizontalRoundTabsLayout, i);
                }
            });
            horizontalRoundTabsLayout.setSelectedIndex(uItem.intValue, false);
        }

        @Override
        public HorizontalRoundTabsLayout createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new HorizontalRoundTabsLayout(context, resourcesProvider);
        }
    }

    public static class RoundTabView extends View {
        private Text text;

        public RoundTabView(Context context) {
            super(context);
            setDrawingCacheEnabled(false);
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
            this.text.draw(canvas, (getMeasuredWidth() - this.text.getWidth()) / 2.0f, getMeasuredHeight() / 2.0f);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(this.text.getWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(this.text.getHeight()), AndroidUtilities.dp(26.0f)), 1073741824));
        }

        public void setText(Text text) {
            this.text = text;
        }
    }

    public HorizontalRoundTabsLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.bgPaint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.clipPath = new Path();
        this.clipPath2 = new Path();
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createScroll(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        final int i = 0;
        AnimatedFloat animatedFloat = new AnimatedFloat(new Runnable(this) {
            public final HorizontalRoundTabsLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    default:
                        this.f$0.lambda$new$1();
                        break;
                }
            }
        });
        this.selectorStartX = animatedFloat;
        animatedFloat.setDuration(180L);
        final int i2 = 1;
        AnimatedFloat animatedFloat2 = new AnimatedFloat(new Runnable(this) {
            public final HorizontalRoundTabsLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    default:
                        this.f$0.lambda$new$1();
                        break;
                }
            }
        });
        this.selectorEndX = animatedFloat2;
        animatedFloat2.setDuration(180L);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public void lambda$new$0() {
        invalidate();
        this.linearLayout.invalidate();
        for (int i = 0; i < this.linearLayout.getChildCount(); i++) {
            this.linearLayout.getChildAt(i).invalidate();
        }
    }

    public void lambda$new$1() {
        invalidate();
        this.linearLayout.invalidate();
        for (int i = 0; i < this.linearLayout.getChildCount(); i++) {
            this.linearLayout.getChildAt(i).invalidate();
        }
    }

    public void lambda$setTabs$2(int i, MessagesStorage.IntCallback intCallback, View view) {
        this.selectedIndex = i;
        this.selectorStartX.set(view.getLeft(), false);
        this.selectorEndX.set(view.getRight(), false);
        intCallback.run(i);
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        RectF rectF = tmpRect;
        rectF.set(this.selectorStartX.getValue(), 0.0f, this.selectorEndX.getValue(), getMeasuredHeight());
        this.clipPath.rewind();
        Path path = this.clipPath;
        float fDp = AndroidUtilities.dp(13.0f);
        float fDp2 = AndroidUtilities.dp(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fDp, fDp2, direction);
        this.clipPath.close();
        this.clipPath2.rewind();
        this.clipPath2.addRect(0.0f, 0.0f, this.linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        this.clipPath2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        this.clipPath2.close();
        this.bgPaint.setColor(this.accent ? Theme.multAlpha(0.1f, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)) : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider) & 520093695);
        canvas.drawPath(this.clipPath, this.bgPaint);
        this.textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
        canvas.save();
        canvas.clipPath(this.clipPath2);
        super.dispatchDraw(canvas);
        canvas.restore();
        this.textPaint.setColor(this.accent ? Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider) : Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider));
        canvas.save();
        canvas.clipPath(this.clipPath);
        for (int i = 0; i < this.linearLayout.getChildCount(); i++) {
            View childAt = this.linearLayout.getChildAt(i);
            RectF rectF2 = tmpRect;
            if (rectF2.right >= childAt.getLeft() && rectF2.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setSelectedIndex(this.selectedIndex, false);
    }

    public void setAccent(boolean z) {
        this.accent = z;
    }

    public void setSelectedIndex(int i, boolean z) {
        this.selectedIndex = i;
        boolean z2 = !z;
        this.selectorStartX.set(this.linearLayout.getChildAt(i).getLeft(), z2);
        this.selectorEndX.set(this.linearLayout.getChildAt(i).getRight(), z2);
    }

    public void setTabs(ArrayList<CharSequence> arrayList, MessagesStorage.IntCallback intCallback) {
        this.linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = arrayList.get(i);
            RoundTabView roundTabView = new RoundTabView(getContext());
            roundTabView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda134(this, i, intCallback, 3));
            roundTabView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-2, -2);
            if (i < arrayList.size() - 1) {
                layoutParamsCreateLinear.rightMargin = AndroidUtilities.dp(4.0f);
            }
            roundTabView.setText(new Text(charSequence, this.textPaint));
            this.linearLayout.addView(roundTabView, layoutParamsCreateLinear);
        }
    }
}
