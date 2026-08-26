package org.telegram.ui.Cells;

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
    public int bottomPadding;
    public int fixedSize;
    public boolean isRTL;
    public int linkTextColorKey;
    public Integer linkTextRippleColor;
    public final LinkSpanDrawable.LinkCollector links;
    public final Theme.ResourcesProvider resourcesProvider;
    public CharSequence text;
    public final CheckBoxCell.AnonymousClass2 textView;
    public int topPadding;

    public TextInfoPrivacyCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 24, resourcesProvider);
    }

    public void afterTextDraw() {
    }

    public int getFixedSize() {
        return this.fixedSize;
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public LinkSpanDrawable.LinksTextView getTextView() {
        return this.textView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            canvas.save();
            CheckBoxCell.AnonymousClass2 anonymousClass2 = this.textView;
            canvas.translate(anonymousClass2.getLeft(), anonymousClass2.getTop());
            if (linkCollector.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextView.class.getName());
        accessibilityNodeInfo.setText(this.text);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.fixedSize;
        if (i3 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (i3 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.fixedSize), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void onTextDraw() {
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = i;
    }

    public final void setEnabled(ArrayList arrayList, boolean z) {
        CheckBoxCell.AnonymousClass2 anonymousClass2 = this.textView;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass2, (Property<CheckBoxCell.AnonymousClass2, Float>) View.ALPHA, z ? 1.0f : 0.5f));
        } else {
            anonymousClass2.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public void setFixedSize(int i) {
        this.fixedSize = i;
    }

    public void setLinkTextColorKey(int i) {
        this.linkTextColorKey = i;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.linkTextRippleColor = num;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.text)) {
            return;
        }
        this.text = charSequence;
        CheckBoxCell.AnonymousClass2 anonymousClass2 = this.textView;
        if (charSequence == null) {
            anonymousClass2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        } else {
            anonymousClass2.setPadding(0, AndroidUtilities.dp(this.topPadding), 0, AndroidUtilities.dp(this.bottomPadding));
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
        if (spannableString != null) {
            charSequence = spannableString;
        }
        anonymousClass2.setText(charSequence);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextColorByKey(int i) {
        int color = Theme.getColor(i, this.resourcesProvider);
        CheckBoxCell.AnonymousClass2 anonymousClass2 = this.textView;
        anonymousClass2.setTextColor(color);
        anonymousClass2.setTag(Integer.valueOf(i));
    }

    public void setTextGravity(int i) {
        this.textView.setGravity(i);
    }

    public void setTopPadding(int i) {
        this.topPadding = i;
    }

    public TextInfoPrivacyCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.linkTextColorKey = Theme.key_windowBackgroundWhiteLinkText;
        this.topPadding = 10;
        this.bottomPadding = 17;
        this.resourcesProvider = resourcesProvider;
        LinkSpanDrawable.LinkCollector linkCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = linkCollector;
        CheckBoxCell.AnonymousClass2 anonymousClass2 = new CheckBoxCell.AnonymousClass2(this, context, linkCollector, resourcesProvider);
        this.textView = anonymousClass2;
        anonymousClass2.setTextSize(1, 14.0f);
        anonymousClass2.setGravity(LocaleController.isRTL ? 5 : 3);
        anonymousClass2.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        anonymousClass2.setMovementMethod(LinkMovementMethod.getInstance());
        int i2 = Theme.key_windowBackgroundWhiteGrayText4;
        anonymousClass2.setTextColor(Theme.getColor(i2, resourcesProvider));
        anonymousClass2.setEmojiColor(Theme.getColor(i2, resourcesProvider));
        anonymousClass2.setLinkTextColor(Theme.getColor(this.linkTextColorKey, resourcesProvider));
        anonymousClass2.setImportantForAccessibility(2);
        float f = i;
        addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        this.isRTL = LocaleController.isRTL;
        setWillNotDraw(false);
    }
}
