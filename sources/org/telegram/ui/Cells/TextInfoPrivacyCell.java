package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
public class TextInfoPrivacyCell extends FrameLayout {
    private int bottomPadding;
    private int fixedSize;
    private boolean isRTL;
    private int linkTextColorKey;
    private LinkSpanDrawable.LinkCollector links;
    private final Theme.ResourcesProvider resourcesProvider;
    private CharSequence text;
    private TextView textView;
    private int topPadding;

    protected void afterTextDraw() {
    }

    protected void onTextDraw() {
    }

    public TextInfoPrivacyCell(Context context) {
        this(context, 21, null);
    }

    public TextInfoPrivacyCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 21, resourcesProvider);
    }

    public TextInfoPrivacyCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.linkTextColorKey = Theme.key_windowBackgroundWhiteLinkText;
        this.topPadding = 10;
        this.bottomPadding = 17;
        this.resourcesProvider = resourcesProvider;
        LinkSpanDrawable.LinkCollector linkCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = linkCollector;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, linkCollector, resourcesProvider) {
            @Override
            public void onDraw(Canvas canvas) {
                TextInfoPrivacyCell.this.onTextDraw();
                super.onDraw(canvas);
                TextInfoPrivacyCell.this.afterTextDraw();
            }
        };
        this.textView = linksTextView;
        linksTextView.setTextSize(1, 14.0f);
        this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.textView.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        this.textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText4));
        this.textView.setLinkTextColor(getThemedColor(this.linkTextColorKey));
        this.textView.setImportantForAccessibility(2);
        float f = i;
        addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        this.isRTL = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void updateRTL() {
        boolean z = this.isRTL;
        boolean z2 = LocaleController.isRTL;
        if (z == z2) {
            return;
        }
        this.isRTL = z2;
        this.textView.setGravity(z2 ? 5 : 3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 48;
        this.textView.setLayoutParams(layoutParams);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.links != null) {
            canvas.save();
            canvas.translate(this.textView.getLeft(), this.textView.getTop());
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    public void setLinkTextColorKey(int i) {
        this.linkTextColorKey = i;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.fixedSize != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.fixedSize), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setTopPadding(int i) {
        this.topPadding = i;
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = i;
    }

    public void setFixedSize(int i) {
        this.fixedSize = i;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.text)) {
            return;
        }
        this.text = charSequence;
        if (charSequence == null) {
            this.textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        } else {
            this.textView.setPadding(0, AndroidUtilities.dp(this.topPadding), 0, AndroidUtilities.dp(this.bottomPadding));
        }
        SpannableString spannableString = null;
        if (charSequence != null) {
            int length = charSequence.length();
            for (int i = 0; i < length - 1; i++) {
                if (charSequence.charAt(i) == '\n') {
                    int i2 = i + 1;
                    if (charSequence.charAt(i2) == '\n') {
                        if (spannableString == null) {
                            spannableString = new SpannableString(charSequence);
                        }
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), i2, i + 2, 33);
                    }
                }
            }
        }
        TextView textView = this.textView;
        if (spannableString != null) {
            charSequence = spannableString;
        }
        textView.setText(charSequence);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextColorByKey(int i) {
        this.textView.setTextColor(getThemedColor(i));
        this.textView.setTag(Integer.valueOf(i));
    }

    public TextView getTextView() {
        return this.textView;
    }

    public int length() {
        return this.textView.length();
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
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextView.class.getName());
        accessibilityNodeInfo.setText(this.text);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
