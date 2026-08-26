package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.LoginActivity;

public final class TextPaintView extends EntityView {
    public int align;
    public int baseFontSize;
    public int currentType;
    public boolean disableAutoresize;
    public final AnonymousClass1 editText;
    public String lastTypefaceKey;
    public int maxFontSize;
    public int minFontSize;
    public Runnable onFontChange;
    public Swatch swatch;
    public PaintTypeface typeface;

    public final class AnonymousClass2 implements TextWatcher {
        public final int $r8$classId = 0;
        public boolean pasted;
        public final ViewGroup this$0;

        public AnonymousClass2(TextPaintView textPaintView) {
            this.this$0 = textPaintView;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            int iClamp;
            switch (this.$r8$classId) {
                case 0:
                    boolean z = this.pasted;
                    TextPaintView textPaintView = (TextPaintView) this.this$0;
                    if (z && textPaintView.minFontSize > 0 && textPaintView.maxFontSize > 0 && !textPaintView.disableAutoresize) {
                        AnonymousClass1 anonymousClass1 = textPaintView.editText;
                        if (anonymousClass1.getLayout() != null) {
                            int height = anonymousClass1.getLayout().getHeight();
                            float f = AndroidUtilities.displaySize.y / 3.0f;
                            float f2 = height;
                            if (f2 > f && (iClamp = Utilities.clamp((int) ((f / f2) * textPaintView.getBaseFontSize()), textPaintView.maxFontSize, textPaintView.minFontSize)) != textPaintView.getBaseFontSize()) {
                                textPaintView.setBaseFontSize(iClamp);
                                Runnable runnable = textPaintView.onFontChange;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                        }
                    }
                    int length = textPaintView.editText.getText().length();
                    AnonymousClass1 anonymousClass2 = textPaintView.editText;
                    if (length > 0) {
                        anonymousClass2.setHint((CharSequence) null);
                    } else {
                        anonymousClass2.setHint(LocaleController.getString(R.string.TextPlaceholder));
                        anonymousClass2.setHintTextColor(1627389951);
                    }
                    break;
                default:
                    if (this.pasted) {
                        LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = (LoginActivity.LoginActivityNewPasswordView) this.this$0;
                        if (loginActivityNewPasswordView.passwordButton.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                            if (loginActivityNewPasswordView.isPasswordVisible) {
                                loginActivityNewPasswordView.passwordButton.callOnClick();
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(loginActivityNewPasswordView.passwordButton, true, 0.1f, true);
                            break;
                        } else if (loginActivityNewPasswordView.passwordButton.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                            AndroidUtilities.updateViewVisibilityAnimated(loginActivityNewPasswordView.passwordButton, false, 0.1f, true);
                            break;
                        }
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    this.pasted = i3 > 3;
                    break;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        public AnonymousClass2(LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView, boolean z) {
            this.this$0 = loginActivityNewPasswordView;
            this.pasted = z;
        }

        private final void beforeTextChanged$org$telegram$ui$LoginActivity$LoginActivityNewPasswordView$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$Paint$Views$TextPaintView$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$LoginActivity$LoginActivityNewPasswordView$1(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public TextPaintView(Context context, PointF pointF, int i, CharSequence charSequence, Swatch swatch, int i2) {
        super(context, pointF);
        this.typeface = PaintTypeface.ROBOTO_MEDIUM;
        this.baseFontSize = i;
        ?? r5 = new EditTextOutline(context) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                EntityView.SelectionView selectionView = TextPaintView.this.selectionView;
                if (selectionView == null || selectionView.getVisibility() != 0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                EntityView.SelectionView selectionView = TextPaintView.this.selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
            }

            @Override
            public final void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                EntityView.SelectionView selectionView = TextPaintView.this.selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
            }
        };
        this.editText = r5;
        NotificationCenter.listenEmojiLoading(r5);
        r5.setGravity(19);
        r5.setBackgroundColor(0);
        r5.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        r5.setClickable(false);
        r5.setEnabled(false);
        r5.setCursorColor(-1);
        r5.setTextSize(0, this.baseFontSize);
        r5.setCursorSize(AndroidUtilities.dp(this.baseFontSize * 0.4f));
        r5.setText(charSequence);
        if (r5.getText().length() <= 0) {
            r5.setHint(LocaleController.getString(R.string.TextPlaceholder));
            r5.setHintTextColor(1627389951);
        } else {
            r5.setHint(null);
        }
        r5.setTextColor(swatch.color);
        r5.setTypeface(null, 1);
        r5.setHorizontallyScrolling(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            r5.setImeOptions(285212672);
        } else {
            r5.setImeOptions(268435456);
        }
        r5.setFocusableInTouchMode(true);
        r5.setInputType(16384);
        r5.setSingleLine(false);
        addView((View) r5, LayoutHelper.createFrame(-2, -2, 51));
        if (i3 >= 29 || i3 >= 23) {
            r5.setBreakStrategy(0);
        }
        setSwatch(swatch);
        setType(i2);
        updatePosition();
        r5.addTextChangedListener(new AnonymousClass2(this));
    }

    public final void beginEditing() {
        AnonymousClass1 anonymousClass1 = this.editText;
        anonymousClass1.setEnabled(true);
        anonymousClass1.setClickable(true);
        anonymousClass1.requestFocus();
        anonymousClass1.setSelection(anonymousClass1.getText().length());
        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 3), 300L);
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new LinkView.TextViewSelectionView(this, getContext());
    }

    public int getAlign() {
        return this.align;
    }

    public int getBaseFontSize() {
        return this.baseFontSize;
    }

    public EditTextOutline getEditText() {
        return this.editText;
    }

    public View getFocusedView() {
        return this.editText;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return getTextSize();
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fM$1 = OKLCH.m$1(fDp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        AnonymousClass1 anonymousClass1 = this.editText;
        return new RectOld(fM$1, (positionY - (((fDp2 - anonymousClass1.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((fDp * scaleX) + fM$1) - fM$1, (fDp2 - anonymousClass1.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.editText.framePadding;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.editText.framePadding;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.editText.framePadding;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.editText.framePadding;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public Swatch getSwatch() {
        return this.swatch;
    }

    public CharSequence getText() {
        return getText();
    }

    public int getTextSize() {
        return (int) getTextSize();
    }

    public int getType() {
        return this.currentType;
    }

    public PaintTypeface getTypeface() {
        return this.typeface;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updatePosition();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePosition();
    }

    public void setAlign(int i) {
        this.align = i;
    }

    public void setBaseFontSize(int i) {
        this.baseFontSize = i;
        float f = i;
        AnonymousClass1 anonymousClass1 = this.editText;
        anonymousClass1.setTextSize(0, f);
        anonymousClass1.setCursorSize(AndroidUtilities.dp(f * 0.4f));
        if (anonymousClass1.getText() != null) {
            Editable text = anonymousClass1.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i2 = 0; i2 < emojiSpanArr.length; i2++) {
                emojiSpanArr[i2].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i2].scale = 0.85f;
            }
            for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) text.getSpans(0, text.length(), AnimatedEmojiSpan.class)) {
                animatedEmojiSpan.replaceFontMetrics(getFontMetricsInt());
            }
            anonymousClass1.invalidateForce();
        }
    }

    public void setMaxWidth(int i) {
        setMaxWidth(i);
    }

    public void setSwatch(Swatch swatch) {
        this.swatch = new Swatch(swatch.brushWeight, swatch.color);
        updateColor();
    }

    public void setText(CharSequence charSequence) {
        AnonymousClass1 anonymousClass1 = this.editText;
        anonymousClass1.setText(charSequence);
        if (anonymousClass1.getText().length() > 0) {
            anonymousClass1.setHint((CharSequence) null);
        } else {
            anonymousClass1.setHint(LocaleController.getString(R.string.TextPlaceholder));
            anonymousClass1.setHintTextColor(1627389951);
        }
    }

    public void setType(int i) {
        this.currentType = i;
        updateColor();
    }

    public void setTypeface(PaintTypeface paintTypeface) {
        this.typeface = paintTypeface;
        if (paintTypeface != null) {
            setTypeface(paintTypeface.getTypeface());
        }
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public final void updateColor() {
        AnonymousClass1 anonymousClass1 = this.editText;
        anonymousClass1.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i = this.swatch.color;
        int i2 = this.currentType;
        if (i2 == 0) {
            anonymousClass1.setFrameColor(i);
            i = AndroidUtilities.computePerceivedBrightness(this.swatch.color) >= 0.721f ? -16777216 : -1;
        } else if (i2 == 1) {
            anonymousClass1.setFrameColor(AndroidUtilities.computePerceivedBrightness(i) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i2 == 2) {
            anonymousClass1.setFrameColor(AndroidUtilities.computePerceivedBrightness(i) >= 0.25f ? -16777216 : -1);
        } else {
            anonymousClass1.setFrameColor(0);
        }
        anonymousClass1.setTextColor(i);
        anonymousClass1.setCursorColor(i);
        anonymousClass1.setHandlesColor(i);
        anonymousClass1.setHighlightColor(Theme.multAlpha(0.4f, i));
    }

    public void setTypeface(String str) {
        for (PaintTypeface paintTypeface : PaintTypeface.get()) {
            if (paintTypeface.key.equals(str)) {
                setTypeface(paintTypeface);
                str = null;
                break;
            }
        }
        this.lastTypefaceKey = str;
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public TextPaintView(Context context, TextPaintView textPaintView, PointF pointF) {
        this(context, pointF, textPaintView.baseFontSize, textPaintView.getText(), textPaintView.getSwatch(), textPaintView.currentType);
        setRotation(textPaintView.getRotation());
        setScale(textPaintView.getScale());
        setTypeface(textPaintView.getTypeface());
        setAlign(textPaintView.getAlign());
        int align = getAlign();
        int i = 2;
        setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i = 3;
        }
        setTextAlignment(i);
    }
}
