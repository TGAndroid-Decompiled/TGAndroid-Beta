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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;
public class HeaderCell extends FrameLayout {
    private boolean animated;
    private AnimatedTextView animatedTextView;
    protected int bottomMargin;
    private int height;
    public int id;
    protected int padding;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private SimpleTextView textView2;

    public HeaderCell(Context context) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false, null);
    }

    public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, false, resourcesProvider);
    }

    public HeaderCell(Context context, int i) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, i, 15, false, null);
    }

    public HeaderCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, Theme.key_windowBackgroundWhiteBlueHeader, i, 15, false, resourcesProvider);
    }

    public HeaderCell(Context context, int i, int i2, int i3, boolean z) {
        this(context, i, i2, i3, z, null);
    }

    public HeaderCell(Context context, int i, int i2, int i3, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, i3, 0, z, resourcesProvider);
    }

    public HeaderCell(Context context, int i, int i2, int i3, int i4, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, i3, i4, z, false, resourcesProvider);
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
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            this.animatedTextView.setTypeface(AndroidUtilities.bold());
            this.animatedTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.animatedTextView.setTextColor(getThemedColor(i));
            this.animatedTextView.setTag(Integer.valueOf(i));
            this.animatedTextView.getDrawable().setHacks(true, true, false);
            float f = i2;
            addView(this.animatedTextView, LayoutHelper.createFrame(-1, this.height - i3, (LocaleController.isRTL ? 5 : 3) | 48, f, i3, f, z ? 0.0f : i4));
        } else {
            TextView textView = new TextView(getContext());
            this.textView = textView;
            textView.setTextSize(1, 15.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.textView.setMinHeight(AndroidUtilities.dp(this.height - i3));
            this.textView.setTextColor(getThemedColor(i));
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
        ViewCompat.setAccessibilityHeading(this, true);
    }

    public void setHeight(int i) {
        TextView textView = this.textView;
        this.height = i;
        textView.setMinHeight(AndroidUtilities.dp(i) - ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).topMargin);
    }

    public void setTopMargin(int i) {
        ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).topMargin = AndroidUtilities.dp(i);
        setHeight(this.height);
    }

    public void setBottomMargin(int i) {
        float f = i;
        ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f);
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView != null) {
            ((FrameLayout.LayoutParams) simpleTextView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f);
        }
    }

    public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
        if (arrayList != null) {
            TextView textView = this.textView;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.5f;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            return;
        }
        this.textView.setAlpha(z ? 1.0f : 0.5f);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setTextSize(float f) {
        if (this.animated) {
            this.animatedTextView.setTextSize(AndroidUtilities.dp(f));
        } else {
            this.textView.setTextSize(1, f);
        }
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, false);
    }

    public void setText(CharSequence charSequence, boolean z) {
        if (this.animated) {
            this.animatedTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.animatedTextView.setText(charSequence, z);
            return;
        }
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setText(charSequence);
    }

    public void setText2(CharSequence charSequence) {
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView == null) {
            return;
        }
        simpleTextView.setText(charSequence);
    }

    public TextView getTextView() {
        return this.textView;
    }

    public SimpleTextView getTextView2() {
        return this.textView2;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(true);
        } else if (i >= 19 && (collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo()) != null) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
