package org.telegram.p009ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Paint.Swatch;
import org.telegram.p009ui.Components.Paint.Views.EntityView;
import org.telegram.p009ui.Components.Point;
import org.telegram.p009ui.Components.Rect;

public class TextPaintView extends EntityView {
    private int baseFontSize;
    private int currentType;
    private EditTextOutline editText;
    private Swatch swatch;

    public TextPaintView(Context context, Point point, int i, String str, Swatch swatch, int i2) {
        super(context, point);
        this.baseFontSize = i;
        EditTextOutline editTextOutline = new EditTextOutline(context);
        this.editText = editTextOutline;
        editTextOutline.setBackgroundColor(0);
        this.editText.setPadding(AndroidUtilities.m34dp(7.0f), AndroidUtilities.m34dp(7.0f), AndroidUtilities.m34dp(7.0f), AndroidUtilities.m34dp(7.0f));
        this.editText.setClickable(false);
        this.editText.setEnabled(false);
        this.editText.setCursorColor(-1);
        this.editText.setTextSize(0, this.baseFontSize);
        this.editText.setText(str);
        this.editText.setTextColor(swatch.color);
        this.editText.setTypeface(null, 1);
        this.editText.setGravity(17);
        this.editText.setHorizontallyScrolling(false);
        this.editText.setImeOptions(268435456);
        this.editText.setFocusableInTouchMode(true);
        EditTextOutline editTextOutline2 = this.editText;
        editTextOutline2.setInputType(editTextOutline2.getInputType() | 16384);
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
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                this.text = charSequence.toString();
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
    }

    public void setMaxWidth(int i) {
        this.editText.setMaxWidth(i);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updatePosition();
    }

    public String getText() {
        return this.editText.getText().toString();
    }

    public void setText(String str) {
        this.editText.setText(str);
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

    private void updateColor() {
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
        float scaleX = ((ViewGroup) getParent()).getScaleX();
        float measuredWidth = ((getMeasuredWidth() - (this.currentType == 2 ? AndroidUtilities.m34dp(24.0f) : 0)) * getScale()) + (AndroidUtilities.m34dp(46.0f) / scaleX);
        float measuredHeight = (getMeasuredHeight() * getScale()) + (AndroidUtilities.m34dp(20.0f) / scaleX);
        Point point = this.position;
        return new Rect((point.f1072x - (measuredWidth / 2.0f)) * scaleX, (point.f1073y - (measuredHeight / 2.0f)) * scaleX, measuredWidth * scaleX, measuredHeight * scaleX);
    }

    @Override
    public TextViewSelectionView createSelectionView() {
        return new TextViewSelectionView(this, getContext());
    }

    public class TextViewSelectionView extends EntityView.SelectionView {
        public TextViewSelectionView(TextPaintView textPaintView, Context context) {
            super(context);
        }

        @Override
        protected int pointInsideHandle(float f, float f2) {
            float dp = AndroidUtilities.m34dp(19.5f);
            float dp2 = AndroidUtilities.m34dp(1.0f) + dp;
            float f3 = dp2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f3;
            float measuredHeight = getMeasuredHeight() - f3;
            float f4 = (measuredHeight / 2.0f) + dp2;
            if (f > dp2 - dp && f2 > f4 - dp && f < dp2 + dp && f2 < f4 + dp) {
                return 1;
            }
            float f5 = dp2 + measuredWidth;
            if (f <= f5 - dp || f2 <= f4 - dp || f >= f5 + dp || f2 >= f4 + dp) {
                return (f <= dp2 || f >= measuredWidth || f2 <= dp2 || f2 >= measuredHeight) ? 0 : 3;
            }
            return 2;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float dp = AndroidUtilities.m34dp(3.0f);
            float dp2 = AndroidUtilities.m34dp(3.0f);
            float dp3 = AndroidUtilities.m34dp(1.0f);
            float dp4 = AndroidUtilities.m34dp(4.5f);
            float dp5 = dp4 + dp3 + AndroidUtilities.m34dp(15.0f);
            float f = dp5 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            float f2 = dp + dp2;
            int floor = (int) Math.floor(measuredWidth / f2);
            float ceil = (float) Math.ceil(((measuredWidth - (floor * f2)) + dp) / 2.0f);
            for (int i = 0; i < floor; i++) {
                float f3 = ceil + dp5 + (i * f2);
                float f4 = dp3 / 2.0f;
                float f5 = f3 + dp2;
                ceil = ceil;
                floor = floor;
                canvas.drawRect(f3, dp5 - f4, f5, dp5 + f4, this.paint);
                float f6 = dp5 + measuredHeight;
                canvas.drawRect(f3, f6 - f4, f5, f6 + f4, this.paint);
            }
            int floor2 = (int) Math.floor(measuredHeight / f2);
            float ceil2 = (float) Math.ceil(((measuredHeight - (floor2 * f2)) + dp) / 2.0f);
            for (int i2 = 0; i2 < floor2; i2++) {
                float f7 = ceil2 + dp5 + (i2 * f2);
                float f8 = dp3 / 2.0f;
                float f9 = f7 + dp2;
                floor2 = floor2;
                canvas.drawRect(dp5 - f8, f7, dp5 + f8, f9, this.paint);
                float f10 = dp5 + measuredWidth;
                canvas.drawRect(f10 - f8, f7, f10 + f8, f9, this.paint);
            }
            float f11 = (measuredHeight / 2.0f) + dp5;
            canvas.drawCircle(dp5, f11, dp4, this.dotPaint);
            canvas.drawCircle(dp5, f11, dp4, this.dotStrokePaint);
            float f12 = dp5 + measuredWidth;
            canvas.drawCircle(f12, f11, dp4, this.dotPaint);
            canvas.drawCircle(f12, f11, dp4, this.dotStrokePaint);
        }
    }
}
