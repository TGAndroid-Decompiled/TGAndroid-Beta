package org.telegram.ui.Components.Reactions;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import androidx.core.view.GestureDetectorCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public abstract class CustomReactionEditText extends EditTextCaption {
    public final GestureDetectorCompat gestureDetector;
    public int maxLength;
    public Runnable onFocused;
    public final Theme.ResourcesProvider resourcesProvider;

    public final class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        @Override
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }
    }

    public CustomReactionEditText(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context, resourcesProvider);
        this.resourcesProvider = resourcesProvider;
        this.gestureDetector = new GestureDetectorCompat(getContext(), new AnonymousClass1());
        setBackground(null);
        setIncludeFontPadding(true);
        int i2 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.maxLength = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(Theme.getColor(Theme.key_chat_messagePanelText, resourcesProvider));
        setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkOut, resourcesProvider));
        setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        int i3 = Theme.key_chat_messagePanelHint;
        setHintColor(Theme.getColor(i3, resourcesProvider));
        setHintTextColor(Theme.getColor(i3, resourcesProvider));
        setCursorColor(Theme.getColor(Theme.key_chat_messagePanelCursor, resourcesProvider));
        setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        if (i2 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3((ChatCustomReactionsEditActivity.AnonymousClass3) this, 3));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void addReactionsSpan() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((AddReactionsSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AddReactionsSpan.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            AddReactionsSpan addReactionsSpan = new AddReactionsSpan(this.resourcesProvider);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(addReactionsSpan.alpha, 255);
            valueAnimatorOfInt.addUpdateListener(new AddReactionsSpan$$ExternalSyntheticLambda0(addReactionsSpan, this, 0));
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.start();
            spannableStringBuilder2.setSpan(addReactionsSpan, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.gestureDetector.mDetector.onTouchEvent(motionEvent) || isLongClickable()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        int i = R.id.menu_delete;
        menu.add(i, i, 0, LocaleController.getString(R.string.Delete));
    }

    public int getEditTextSelectionEnd() {
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd;
    }

    public int getEditTextSelectionStart() {
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return getPaint().getFontMetricsInt();
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (!hasSelection() || ((AddReactionsSpan[]) getText().getSpans(i, i2, AddReactionsSpan.class)).length == 0) {
            return;
        }
        setSelection(i, i2 - 1);
    }

    public final void removeReactionsSpan(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (AddReactionsSpan addReactionsSpan : (AddReactionsSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AddReactionsSpan.class)) {
            GiftSheet$$ExternalSyntheticLambda26 giftSheet$$ExternalSyntheticLambda26 = new GiftSheet$$ExternalSyntheticLambda26(14, this, addReactionsSpan);
            if (z) {
                setCursorVisible(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(addReactionsSpan.alpha, 0);
                valueAnimatorOfInt.addUpdateListener(new AddReactionsSpan$$ExternalSyntheticLambda0(addReactionsSpan, this, 1));
                valueAnimatorOfInt.addListener(new BaseChartView.AnonymousClass4(giftSheet$$ExternalSyntheticLambda26, 11));
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.start();
            } else {
                giftSheet$$ExternalSyntheticLambda26.run();
            }
        }
    }

    public void setMaxLength(int i) {
        if (this.maxLength != i) {
            this.maxLength = i;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.onFocused = runnable;
    }
}
