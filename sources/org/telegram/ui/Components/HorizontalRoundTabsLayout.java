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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.QrActivity;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;

public final class HorizontalRoundTabsLayout extends HorizontalScrollView {
    public static final RectF tmpRect = new RectF();
    public boolean accent;
    public final Paint bgPaint;
    public final Path clipPath;
    public final Path clipPath2;
    public final LinearLayout linearLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public int selectedIndex;
    public final AnimatedFloat selectorEndX;
    public final AnimatedFloat selectorStartX;
    public final TextPaint textPaint;

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
                        HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.f$0;
                        horizontalRoundTabsLayout.invalidate();
                        LinearLayout linearLayout2 = horizontalRoundTabsLayout.linearLayout;
                        linearLayout2.invalidate();
                        for (int i2 = 0; i2 < linearLayout2.getChildCount(); i2++) {
                            linearLayout2.getChildAt(i2).invalidate();
                        }
                        break;
                    default:
                        HorizontalRoundTabsLayout horizontalRoundTabsLayout2 = this.f$0;
                        horizontalRoundTabsLayout2.invalidate();
                        LinearLayout linearLayout3 = horizontalRoundTabsLayout2.linearLayout;
                        linearLayout3.invalidate();
                        for (int i3 = 0; i3 < linearLayout3.getChildCount(); i3++) {
                            linearLayout3.getChildAt(i3).invalidate();
                        }
                        break;
                }
            }
        });
        this.selectorStartX = animatedFloat;
        animatedFloat.transitionDuration = 180L;
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
                        HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.f$0;
                        horizontalRoundTabsLayout.invalidate();
                        LinearLayout linearLayout2 = horizontalRoundTabsLayout.linearLayout;
                        linearLayout2.invalidate();
                        for (int i3 = 0; i3 < linearLayout2.getChildCount(); i3++) {
                            linearLayout2.getChildAt(i3).invalidate();
                        }
                        break;
                    default:
                        HorizontalRoundTabsLayout horizontalRoundTabsLayout2 = this.f$0;
                        horizontalRoundTabsLayout2.invalidate();
                        LinearLayout linearLayout3 = horizontalRoundTabsLayout2.linearLayout;
                        linearLayout3.invalidate();
                        for (int i4 = 0; i4 < linearLayout3.getChildCount(); i4++) {
                            linearLayout3.getChildAt(i4).invalidate();
                        }
                        break;
                }
            }
        });
        this.selectorEndX = animatedFloat2;
        animatedFloat2.transitionDuration = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = tmpRect;
        rectF.set(this.selectorStartX.getValue(), 0.0f, this.selectorEndX.getValue(), getMeasuredHeight());
        Path path = this.clipPath;
        path.rewind();
        float fDp = AndroidUtilities.dp(13.0f);
        float fDp2 = AndroidUtilities.dp(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fDp, fDp2, direction);
        path.close();
        Path path2 = this.clipPath2;
        path2.rewind();
        LinearLayout linearLayout = this.linearLayout;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        Paint paint = this.bgPaint;
        boolean z = this.accent;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(z ? Theme.multAlpha(0.1f, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)) : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider) & 520093695);
        canvas.drawPath(path, paint);
        TextPaint textPaint = this.textPaint;
        textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.accent ? Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider) : Theme.getColor(Theme.key_chats_nameArchived, resourcesProvider));
        canvas.save();
        canvas.clipPath(path);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (rectF.right >= childAt.getLeft() && rectF.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setSelectedIndex(this.selectedIndex, false);
    }

    public void setAccent(boolean z) {
        this.accent = z;
    }

    public final void setSelectedIndex(int i, boolean z) {
        this.selectedIndex = i;
        LinearLayout linearLayout = this.linearLayout;
        boolean z2 = !z;
        this.selectorStartX.set(linearLayout.getChildAt(i).getLeft(), z2);
        this.selectorEndX.set(linearLayout.getChildAt(i).getRight(), z2);
    }

    public final void setTabs(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.linearLayout;
        linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i);
            QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(getContext());
            anonymousClass2.setDrawingCacheEnabled(false);
            anonymousClass2.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(this, i, intCallback, 8));
            anonymousClass2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-2, -2);
            if (i < arrayList.size() - 1) {
                layoutParamsCreateLinear.rightMargin = AndroidUtilities.dp(4.0f);
            }
            anonymousClass2.this$0 = new Text(charSequence, this.textPaint);
            linearLayout.addView(anonymousClass2, layoutParamsCreateLinear);
        }
    }
}
