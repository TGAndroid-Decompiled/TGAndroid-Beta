package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;

public class HeaderCell extends FrameLayout {
    private final boolean animated;
    private AnimatedTextView animatedTextView;
    protected int bottomMargin;
    private int height;
    public int id;
    protected int padding;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private SimpleTextView textView2;

    public HeaderCell(Context context) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, 18, 7, 0, false, false, null);
    }

    public float getAnimatedWidth() {
        return this.animatedTextView.getDrawable().getCurrentWidth();
    }

    public TextView getTextView() {
        return this.textView;
    }

    public SimpleTextView getTextView2() {
        return this.textView2;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setHeading(true);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
            }
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i) {
        float f = i;
        ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f);
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView != null) {
            ((FrameLayout.LayoutParams) simpleTextView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f);
        }
    }

    public void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        if (z2) {
            this.textView.animate().alpha(z ? 1.0f : 0.5f).start();
        } else {
            this.textView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public void setHeight(int i) {
        this.height = i;
        int iDp = AndroidUtilities.dp(i) - ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).topMargin;
        if (this.textView.getMinHeight() != iDp) {
            this.textView.setMinHeight(iDp);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.animatedTextView.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView == null) {
            return;
        }
        simpleTextView.setText(charSequence);
    }

    public void setTextColor(int i) {
        TextView textView = this.textView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        AnimatedTextView animatedTextView = this.animatedTextView;
        if (animatedTextView != null) {
            animatedTextView.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        if (this.animated) {
            this.animatedTextView.setTextSize(AndroidUtilities.dp(f));
        } else {
            this.textView.setTextSize(1, f);
        }
    }

    public void setTopMargin(int i) {
        ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).topMargin = AndroidUtilities.dp(i);
        setHeight(this.height);
    }

    public void setText(CharSequence charSequence, boolean z) {
        if (this.animated) {
            this.animatedTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.animatedTextView.setText(charSequence, z);
        } else {
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.textView.setText(charSequence);
        }
    }

    public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, 18, 7, 0, false, false, resourcesProvider);
    }

    public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.5f));
        } else {
            this.textView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public HeaderCell(Context context, int i) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, i, 7, 0, false, false, null);
    }

    public HeaderCell(Context context, int i, int i2, int i3, boolean z) {
        this(context, i, i2, i3, 0, z, false, null);
    }

    public HeaderCell(Context context, int i, int i2, int i3, int i4, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.height = 40;
        this.resourcesProvider = resourcesProvider;
        this.padding = i2;
        this.bottomMargin = i4;
        this.animated = z2;
        if (z2) {
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext());
            this.animatedTextView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.animatedTextView.setTypeface(AndroidUtilities.bold());
            this.animatedTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.animatedTextView.setTag(Integer.valueOf(i));
            this.animatedTextView.getDrawable().setHacks(true, true, false);
            float f = i2;
            addView(this.animatedTextView, LayoutHelper.createFrame(-1, this.height - i3, (LocaleController.isRTL ? 5 : 3) | 48, f, i3, f, z ? 0.0f : i4));
        } else {
            TextView textView = new TextView(getContext());
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.textView.setMinHeight(AndroidUtilities.dp(this.height - i3));
            this.textView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.textView.setTag(Integer.valueOf(i));
            float f2 = i2;
            addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f2, i3, f2, z ? 0.0f : i4));
        }
        if (z) {
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            this.textView2 = simpleTextView;
            simpleTextView.setTextSize(13);
            this.textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f3 = i2;
            addView(this.textView2, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f3, 21.0f, f3, i4));
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        new ViewCompat.AnonymousClass1(2131296684, Boolean.class, 0, 28, 2).set(this, Boolean.TRUE);
    }
}
