package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public final class GraySectionCell extends FrameLayout implements Theme.Colorable {
    public int layerHeight;
    public boolean noBackground;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass1 rightTextView;
    public final FrameLayout.LayoutParams rightTextViewLayoutParams;
    public final AnimatedEmojiSpan.TextViewEmojis textView;

    public final class AnonymousClass1 extends AnimatedTextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public GraySectionCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.layerHeight = 32;
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(Theme.getColor(Theme.key_graySection, resourcesProvider));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(getContext());
        this.textView = textViewEmojis;
        textViewEmojis.setTextSize(1, 14.0f);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_graySectionText;
        textViewEmojis.setTextColor(Theme.getColor(i2, resourcesProvider));
        textViewEmojis.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f = i;
        addView(textViewEmojis, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), true, true, true);
        this.rightTextView = anonymousClass1;
        anonymousClass1.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = anonymousClass1.drawable;
        animatedTextDrawable.moveAmplitude = 0.9f;
        animatedTextDrawable.animateDuration = 420L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        anonymousClass1.setTextSize(AndroidUtilities.dp(14.0f));
        anonymousClass1.setTextColor(Theme.getColor(i2, resourcesProvider));
        anonymousClass1.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f, 0.0f, f, 0.0f);
        this.rightTextViewLayoutParams = layoutParamsCreateFrame;
        addView(anonymousClass1, layoutParamsCreateFrame);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        new ViewCompat.AnonymousClass1(2131296684, Boolean.class, 0, 28, 2).set(this, Boolean.TRUE);
    }

    public static void createThemeDescriptions(ArrayList arrayList, RecyclerListView recyclerListView) {
        int i = Theme.key_graySectionText;
        arrayList.add(new ThemeDescription(recyclerListView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(recyclerListView, 0, new Class[]{GraySectionCell.class}, new String[]{"rightTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(recyclerListView, 16, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.layerHeight), 1073741824));
    }

    public void setLayerHeight(int i) {
        this.layerHeight = i;
        requestLayout();
    }

    public void setNoBackground(boolean z) {
        this.noBackground = z;
        updateColors$1();
    }

    public void setRightText(CharSequence charSequence) {
        AnonymousClass1 anonymousClass1 = this.rightTextView;
        anonymousClass1.setText(charSequence, true, true);
        anonymousClass1.setVisibility(0);
    }

    public void setRightTextMargin(int i) {
        FrameLayout.LayoutParams layoutParams = this.rightTextViewLayoutParams;
        float f = i;
        layoutParams.leftMargin = AndroidUtilities.dp(f);
        layoutParams.rightMargin = AndroidUtilities.dp(f);
        this.rightTextView.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
        AnonymousClass1 anonymousClass1 = this.rightTextView;
        anonymousClass1.setVisibility(8);
        anonymousClass1.setOnClickListener(null);
    }

    public void setTextColor(int i) {
        int color = Theme.getColor(i, this.resourcesProvider);
        this.textView.setTextColor(color);
        this.rightTextView.setTextColor(color);
    }

    @Override
    public final void updateColors$1() {
        boolean z = this.noBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        setBackgroundColor(z ? 0 : Theme.getColor(Theme.key_graySection, resourcesProvider));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
        int i = Theme.key_graySectionText;
        textViewEmojis.setTextColor(Theme.getColor(i, resourcesProvider));
        this.rightTextView.setTextColor(Theme.getColor(i, resourcesProvider));
    }

    public final void setRightText(CharSequence charSequence, View.OnClickListener onClickListener) {
        AnonymousClass1 anonymousClass1 = this.rightTextView;
        anonymousClass1.setText(charSequence, true, true);
        anonymousClass1.setOnClickListener(onClickListener);
        anonymousClass1.setVisibility(0);
    }

    public final void setText(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.textView.setText(charSequence);
        AnonymousClass1 anonymousClass1 = this.rightTextView;
        anonymousClass1.setText(charSequence2, false, true);
        anonymousClass1.setOnClickListener(onClickListener);
        anonymousClass1.setVisibility(0);
    }
}
