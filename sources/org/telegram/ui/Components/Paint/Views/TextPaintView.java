package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Rect;
public class TextPaintView extends EntityView {
    private int align;
    private int baseFontSize;
    private int currentType;
    private EditTextOutline editText;
    private Swatch swatch;
    private PaintTypeface typeface;

    public TextPaintView(Context context, Point point, int i, CharSequence charSequence, Swatch swatch, int i2) {
        super(context, point);
        this.typeface = PaintTypeface.ROBOTO_MEDIUM;
        this.baseFontSize = i;
        EditTextOutline editTextOutline = new EditTextOutline(context) {
            {
                this.animatedEmojiOffsetX = AndroidUtilities.dp(8.0f);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                EntityView.SelectionView selectionView = TextPaintView.this.selectionView;
                if (selectionView == null || selectionView.getVisibility() != 0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.editText = editTextOutline;
        editTextOutline.setGravity(19);
        this.editText.setBackgroundColor(0);
        this.editText.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.editText.setClickable(false);
        this.editText.setEnabled(false);
        this.editText.setCursorColor(-1);
        this.editText.setTextSize(0, this.baseFontSize);
        this.editText.setCursorSize(AndroidUtilities.dp(this.baseFontSize * 0.4f));
        this.editText.setText(charSequence);
        this.editText.setTextColor(swatch.color);
        this.editText.setTypeface(null, 1);
        this.editText.setHorizontallyScrolling(false);
        this.editText.setImeOptions(268435456);
        this.editText.setFocusableInTouchMode(true);
        EditTextOutline editTextOutline2 = this.editText;
        editTextOutline2.setInputType(editTextOutline2.getInputType() | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
        addView(this.editText, LayoutHelper.createFrame(-2, -2, 51));
        if (Build.VERSION.SDK_INT >= 23) {
            this.editText.setBreakStrategy(0);
        }
        setSwatch(swatch);
        setType(i2);
        updatePosition();
        this.editText.addTextChangedListener(new TextWatcher() {
            private int beforeCursorPosition = 0;
            private String text;

            @Override
            public void onTextChanged(CharSequence charSequence2, int i3, int i4, int i5) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence2, int i3, int i4, int i5) {
                this.text = charSequence2.toString();
                this.beforeCursorPosition = i3;
            }

            @Override
            public void afterTextChanged(Editable editable) {
                TextPaintView.this.editText.removeTextChangedListener(this);
                if (TextPaintView.this.editText.getLineCount() > 9) {
                    TextPaintView.this.editText.setText(this.text);
                    TextPaintView.this.editText.setSelection(this.beforeCursorPosition);
                }
                TextPaintView.this.editText.addTextChangedListener(this);
            }
        });
    }

    public TextPaintView(Context context, TextPaintView textPaintView, Point point) {
        this(context, point, textPaintView.baseFontSize, textPaintView.getText(), textPaintView.getSwatch(), textPaintView.currentType);
        setRotation(textPaintView.getRotation());
        setScale(textPaintView.getScale());
        setTypeface(textPaintView.getTypeface());
        setAlign(textPaintView.getAlign());
        int align = getAlign();
        int i = 2;
        this.editText.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        if (Build.VERSION.SDK_INT >= 17) {
            int align2 = getAlign();
            if (align2 == 1) {
                i = 4;
            } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i = 3;
            }
            this.editText.setTextAlignment(i);
        }
    }

    public int getBaseFontSize() {
        return this.baseFontSize;
    }

    public void setBaseFontSize(int i) {
        this.baseFontSize = i;
        float f = i;
        this.editText.setTextSize(0, f);
        this.editText.setCursorSize(AndroidUtilities.dp(f * 0.4f));
        if (this.editText.getText() instanceof Spanned) {
            Editable text = this.editText.getText();
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.replaceFontMetrics(getFontMetricsInt());
            }
            for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) text.getSpans(0, text.length(), AnimatedEmojiSpan.class)) {
                animatedEmojiSpan.replaceFontMetrics(getFontMetricsInt());
            }
            this.editText.invalidateForce();
        }
    }

    public void setAlign(int i) {
        this.align = i;
    }

    public int getAlign() {
        return this.align;
    }

    public void setTypeface(PaintTypeface paintTypeface) {
        this.typeface = paintTypeface;
        this.editText.setTypeface(paintTypeface.getTypeface());
    }

    public void setTypeface(String str) {
        for (PaintTypeface paintTypeface : PaintTypeface.get()) {
            if (paintTypeface.getKey().equals(str)) {
                setTypeface(paintTypeface);
                return;
            }
        }
    }

    public PaintTypeface getTypeface() {
        return this.typeface;
    }

    public EditTextOutline getEditText() {
        return this.editText;
    }

    public void setMaxWidth(int i) {
        this.editText.setMaxWidth(i);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updatePosition();
    }

    public CharSequence getText() {
        return this.editText.getText();
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.editText.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.editText.getTextSize();
    }

    public View getFocusedView() {
        return this.editText;
    }

    public void beginEditing() {
        this.editText.setEnabled(true);
        this.editText.setClickable(true);
        this.editText.requestFocus();
        EditTextOutline editTextOutline = this.editText;
        editTextOutline.setSelection(editTextOutline.getText().length());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TextPaintView.this.lambda$beginEditing$0();
            }
        }, 300L);
    }

    public void lambda$beginEditing$0() {
        AndroidUtilities.showKeyboard(this.editText);
    }

    public void endEditing() {
        this.editText.clearFocus();
        this.editText.setEnabled(false);
        this.editText.setClickable(false);
        updateSelectionView();
    }

    public Swatch getSwatch() {
        return this.swatch;
    }

    public int getTextSize() {
        return (int) this.editText.getTextSize();
    }

    public void setSwatch(Swatch swatch) {
        this.swatch = swatch;
        updateColor();
    }

    public void setType(int i) {
        this.currentType = i;
        updateColor();
    }

    public int getType() {
        return this.currentType;
    }

    public void updateColor() {
        int i = this.currentType;
        if (i == 0) {
            this.editText.setTextColor(-1);
            this.editText.setStrokeColor(this.swatch.color);
            this.editText.setFrameColor(0);
            this.editText.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else if (i == 1) {
            this.editText.setTextColor(this.swatch.color);
            this.editText.setStrokeColor(0);
            this.editText.setFrameColor(0);
            this.editText.setShadowLayer(5.0f, 0.0f, 1.0f, 1711276032);
        } else if (i == 2) {
            this.editText.setTextColor(-16777216);
            this.editText.setStrokeColor(0);
            this.editText.setFrameColor(this.swatch.color);
            this.editText.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override
    protected Rect getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Rect();
        }
        float scaleX = viewGroup.getScaleX();
        float measuredWidth = (getMeasuredWidth() * getScale()) + (AndroidUtilities.dp(64.0f) / scaleX);
        float measuredHeight = (getMeasuredHeight() * getScale()) + (AndroidUtilities.dp(52.0f) / scaleX);
        return new Rect((getPositionX() - (measuredWidth / 2.0f)) * scaleX, (getPositionY() - (measuredHeight / 2.0f)) * scaleX, measuredWidth * scaleX, measuredHeight * scaleX);
    }

    @Override
    public TextViewSelectionView createSelectionView() {
        return new TextViewSelectionView(this, getContext());
    }

    public class TextViewSelectionView extends EntityView.SelectionView {
        private Path path;

        public TextViewSelectionView(TextPaintView textPaintView, Context context) {
            super(context);
            this.path = new Path();
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float dp = AndroidUtilities.dp(19.5f);
            float dp2 = AndroidUtilities.dp(1.0f) + dp;
            float f3 = dp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f3;
            float measuredHeight = getMeasuredHeight() - f3;
            float f4 = (measuredHeight / 2.0f) + dp2;
            if (f <= dp2 - dp || f2 <= f4 - dp || f >= dp2 + dp || f2 >= f4 + dp) {
                float f5 = dp2 + measuredWidth;
                if (f <= f5 - dp || f2 <= f4 - dp || f >= f5 + dp || f2 >= f4 + dp) {
                    return (f <= dp2 || f >= measuredWidth || f2 <= dp2 || f2 >= measuredHeight) ? 0 : 3;
                }
                return 2;
            }
            return 1;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float dp = AndroidUtilities.dp(4.5f);
            float dp2 = AndroidUtilities.dp(2.0f) + dp + AndroidUtilities.dp(15.0f);
            float f = dp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = dp2 + measuredWidth;
            float f3 = dp2 + measuredHeight;
            rectF.set(dp2, dp2, f2, f3);
            float dp3 = AndroidUtilities.dp(12.0f);
            float min = Math.min(dp3, measuredWidth / 2.0f);
            float f4 = measuredHeight / 2.0f;
            float min2 = Math.min(dp3, f4);
            this.path.rewind();
            float f5 = min * 2.0f;
            float f6 = dp2 + f5;
            float f7 = 2.0f * min2;
            float f8 = dp2 + f7;
            rectF.set(dp2, dp2, f6, f8);
            this.path.arcTo(rectF, 180.0f, 90.0f);
            float f9 = f2 - f5;
            rectF.set(f9, dp2, f2, f8);
            this.path.arcTo(rectF, 270.0f, 90.0f);
            canvas.drawPath(this.path, this.paint);
            this.path.rewind();
            float f10 = f3 - f7;
            rectF.set(dp2, f10, f6, f3);
            this.path.arcTo(rectF, 180.0f, -90.0f);
            rectF.set(f9, f10, f2, f3);
            this.path.arcTo(rectF, 90.0f, -90.0f);
            canvas.drawPath(this.path, this.paint);
            float f11 = dp2 + min2;
            float f12 = f3 - min2;
            canvas.drawLine(dp2, f11, dp2, f12, this.paint);
            canvas.drawLine(f2, f11, f2, f12, this.paint);
            float f13 = f4 + dp2;
            canvas.drawCircle(dp2, f13, dp, this.dotPaint);
            canvas.drawCircle(dp2, f13, dp, this.dotStrokePaint);
            canvas.drawCircle(f2, f13, dp, this.dotPaint);
            canvas.drawCircle(f2, f13, dp, this.dotStrokePaint);
        }
    }
}
