package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
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
import org.telegram.ui.Components.LayoutHelper;

public class HeaderCell extends FrameLayout {
    private int height;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private SimpleTextView textView2;

    public HeaderCell(Context context) {
        this(context, "windowBackgroundWhiteBlueHeader", 21, 15, false, null);
    }

    public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, "windowBackgroundWhiteBlueHeader", 21, 15, false, resourcesProvider);
    }

    public HeaderCell(Context context, int i) {
        this(context, "windowBackgroundWhiteBlueHeader", i, 15, false, null);
    }

    public HeaderCell(Context context, String str, int i, int i2, boolean z) {
        this(context, str, i, i2, z, null);
    }

    public HeaderCell(Context context, String str, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.height = 40;
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(getContext());
        this.textView = textView;
        textView.setTextSize(1, 15.0f);
        this.textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = 5;
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setMinHeight(AndroidUtilities.dp(this.height - i2));
        this.textView.setTextColor(getThemedColor(str));
        this.textView.setTag(str);
        float f = i;
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f, i2, f, 0.0f));
        if (z) {
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            this.textView2 = simpleTextView;
            simpleTextView.setTextSize(13);
            this.textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            addView(this.textView2, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 3 : i3) | 48, f, 21.0f, f, 0.0f));
        }
        ViewCompat.setAccessibilityHeading(this, true);
    }

    public void setHeight(int i) {
        TextView textView = this.textView;
        this.height = i;
        textView.setMinHeight(AndroidUtilities.dp(i) - ((FrameLayout.LayoutParams) this.textView.getLayoutParams()).topMargin);
    }

    public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
        float f = 1.0f;
        if (arrayList != null) {
            TextView textView = this.textView;
            float[] fArr = new float[1];
            if (!z) {
                f = 0.5f;
            }
            fArr[0] = f;
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", fArr));
            return;
        }
        TextView textView2 = this.textView;
        if (!z) {
            f = 0.5f;
        }
        textView2.setAlpha(f);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setTextSize(float f) {
        this.textView.setTextSize(1, f);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setText2(CharSequence charSequence) {
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView != null) {
            simpleTextView.setText(charSequence);
        }
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
        if (Build.VERSION.SDK_INT >= 19 && (collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo()) != null) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
