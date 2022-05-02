package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;

public class ColorPicker extends FrameLayout {
    private ImageView addButton;
    private Drawable circleDrawable;
    private boolean circlePressed;
    private ImageView clearButton;
    private LinearGradient colorGradient;
    private boolean colorPressed;
    private Bitmap colorWheelBitmap;
    private int colorWheelWidth;
    private AnimatorSet colorsAnimator;
    private int currentResetType;
    private final ColorPickerDelegate delegate;
    boolean ignoreTextChange;
    private long lastUpdateTime;
    private Paint linePaint;
    private LinearLayout linearLayout;
    private ActionBarMenuItem menuItem;
    private boolean myMessagesColor;
    private FrameLayout radioContainer;
    private TextView resetButton;
    private int selectedColor;
    private RectF sliderRect = new RectF();
    private RadioButton[] radioButton = new RadioButton[4];
    private int colorsCount = 1;
    private int maxColorsCount = 1;
    private float[] colorHSV = {0.0f, 0.0f, 1.0f};
    private float[] hsvTemp = new float[3];
    private float pressedMoveProgress = 1.0f;
    private float minBrightness = 0.0f;
    private float maxBrightness = 1.0f;
    private float minHsvBrightness = 0.0f;
    private float maxHsvBrightness = 1.0f;
    private EditTextBoldCursor[] colorEditText = new EditTextBoldCursor[2];
    private Paint circlePaint = new Paint(1);
    private Paint colorWheelPaint = new Paint(5);
    private Paint valueSliderPaint = new Paint(5);

    public interface ColorPickerDelegate {
        void deleteTheme();

        int getDefaultColor(int i);

        void openThemeCreate(boolean z);

        void setColor(int i, int i2, boolean z);
    }

    public static void lambda$new$4(View view) {
    }

    public static class RadioButton extends View {
        private ObjectAnimator checkAnimator;
        private boolean checked;
        private float checkedState;
        private int currentColor;
        private final Paint paint = new Paint(1);

        public RadioButton(Context context) {
            super(context);
        }

        void updateCheckedState(boolean z) {
            ObjectAnimator objectAnimator = this.checkAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f = 1.0f;
            if (z) {
                float[] fArr = new float[1];
                if (!this.checked) {
                    f = 0.0f;
                }
                fArr[0] = f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", fArr);
                this.checkAnimator = ofFloat;
                ofFloat.setDuration(200L);
                this.checkAnimator.start();
                return;
            }
            if (!this.checked) {
                f = 0.0f;
            }
            setCheckedState(f);
        }

        public void setChecked(boolean z, boolean z2) {
            this.checked = z;
            updateCheckedState(z2);
        }

        public void setColor(int i) {
            this.currentColor = i;
            invalidate();
        }

        public int getColor() {
            return this.currentColor;
        }

        @Keep
        public void setCheckedState(float f) {
            this.checkedState = f;
            invalidate();
        }

        @Keep
        public float getCheckedState() {
            return this.checkedState;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(30.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float dp = AndroidUtilities.m34dp(15.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.paint.setColor(this.currentColor);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.m34dp(3.0f));
            this.paint.setAlpha(Math.round(this.checkedState * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (this.paint.getStrokeWidth() * 0.5f), this.paint);
            this.paint.setAlpha(255);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.m34dp(5.0f) * this.checkedState), this.paint);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", C0890R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.checked);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    public ColorPicker(Context context, boolean z, ColorPickerDelegate colorPickerDelegate) {
        super(context);
        this.delegate = colorPickerDelegate;
        setWillNotDraw(false);
        this.circleDrawable = context.getResources().getDrawable(C0890R.C0891drawable.knob_shadow).mutate();
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        LinearLayout linearLayout = new LinearLayout(context) {
            private Paint paint;
            private RectF rect = new RectF();

            {
                Paint paint2 = new Paint(1);
                this.paint = paint2;
                paint2.setColor(Theme.getColor("dialogBackgroundGray"));
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int left = ColorPicker.this.colorEditText[0].getLeft() - AndroidUtilities.m34dp(13.0f);
                this.rect.set(left, AndroidUtilities.m34dp(5.0f), left + ((int) (AndroidUtilities.m34dp(91.0f) + (ColorPicker.this.clearButton.getVisibility() == 0 ? AndroidUtilities.m34dp(25.0f) * ColorPicker.this.clearButton.getAlpha() : 0.0f))), AndroidUtilities.m34dp(37.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.m34dp(16.0f), AndroidUtilities.m34dp(16.0f), this.paint);
            }
        };
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.linearLayout, LayoutHelper.createFrame(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        this.linearLayout.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.radioContainer = frameLayout;
        frameLayout.setClipChildren(false);
        addView(this.radioContainer, LayoutHelper.createFrame(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i = 0;
        while (i < 4) {
            this.radioButton[i] = new RadioButton(context);
            this.radioButton[i].setChecked(this.selectedColor == i, false);
            this.radioContainer.addView(this.radioButton[i], LayoutHelper.createFrame(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.radioButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ColorPicker.this.lambda$new$0(view);
                }
            });
            i++;
        }
        final int i2 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.colorEditText;
            if (i2 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i2 % 2 == 0) {
                editTextBoldCursorArr[i2] = new EditTextBoldCursor(context) {
                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                            if (ColorPicker.this.colorEditText[i2 + 1].isFocused()) {
                                AndroidUtilities.showKeyboard(ColorPicker.this.colorEditText[i2 + 1]);
                            } else {
                                ColorPicker.this.colorEditText[i2 + 1].requestFocus();
                            }
                        }
                        return false;
                    }
                };
                this.colorEditText[i2].setBackgroundDrawable(null);
                this.colorEditText[i2].setText("#");
                this.colorEditText[i2].setEnabled(false);
                this.colorEditText[i2].setFocusable(false);
                this.colorEditText[i2].setPadding(0, AndroidUtilities.m34dp(5.0f), 0, AndroidUtilities.m34dp(16.0f));
                this.linearLayout.addView(this.colorEditText[i2], LayoutHelper.createLinear(-2, -1, 0.0f, 0.0f, 0.0f, 0.0f));
            } else {
                editTextBoldCursorArr[i2] = new EditTextBoldCursor(context) {
                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        if (getAlpha() != 1.0f) {
                            return false;
                        }
                        if (!isFocused()) {
                            requestFocus();
                            return false;
                        }
                        AndroidUtilities.showKeyboard(this);
                        return super.onTouchEvent(motionEvent);
                    }

                    @Override
                    public boolean getGlobalVisibleRect(Rect rect, Point point) {
                        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                        rect.bottom += AndroidUtilities.m34dp(40.0f);
                        return globalVisibleRect;
                    }

                    @Override
                    public void invalidate() {
                        super.invalidate();
                        ColorPicker.this.colorEditText[i2 - 1].invalidate();
                    }
                };
                this.colorEditText[i2].setBackgroundDrawable(null);
                this.colorEditText[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.colorEditText[i2].setHint("8BC6ED");
                this.colorEditText[i2].setPadding(0, AndroidUtilities.m34dp(5.0f), 0, AndroidUtilities.m34dp(16.0f));
                this.linearLayout.addView(this.colorEditText[i2], LayoutHelper.createLinear(71, -1, 0.0f, 0.0f, 0.0f, 0.0f));
                this.colorEditText[i2].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        ColorPicker colorPicker = ColorPicker.this;
                        if (!colorPicker.ignoreTextChange) {
                            colorPicker.ignoreTextChange = true;
                            int i3 = 0;
                            while (i3 < editable.length()) {
                                char charAt = editable.charAt(i3);
                                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                                    editable.replace(i3, i3 + 1, "");
                                    i3--;
                                }
                                i3++;
                            }
                            if (editable.length() == 0) {
                                ColorPicker.this.ignoreTextChange = false;
                                return;
                            }
                            ColorPicker colorPicker2 = ColorPicker.this;
                            colorPicker2.setColorInner(colorPicker2.getFieldColor(i2, -1));
                            int color = ColorPicker.this.getColor();
                            if (editable.length() == 6) {
                                editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                                ColorPicker.this.colorEditText[i2].setSelection(editable.length());
                            }
                            ColorPicker.this.radioButton[ColorPicker.this.selectedColor].setColor(color);
                            ColorPicker.this.delegate.setColor(color, ColorPicker.this.selectedColor, true);
                            ColorPicker.this.ignoreTextChange = false;
                        }
                    }
                });
                this.colorEditText[i2].setOnEditorActionListener(ColorPicker$$ExternalSyntheticLambda5.INSTANCE);
            }
            this.colorEditText[i2].setTextSize(1, 16.0f);
            this.colorEditText[i2].setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
            this.colorEditText[i2].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.colorEditText[i2].setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.colorEditText[i2].setCursorSize(AndroidUtilities.m34dp(18.0f));
            this.colorEditText[i2].setCursorWidth(1.5f);
            this.colorEditText[i2].setSingleLine(true);
            this.colorEditText[i2].setGravity(19);
            this.colorEditText[i2].setHeaderHintColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
            this.colorEditText[i2].setTransformHintToHeader(true);
            this.colorEditText[i2].setInputType(524416);
            this.colorEditText[i2].setImeOptions(268435462);
            if (i2 == 1) {
                this.colorEditText[i2].requestFocus();
            } else if (i2 == 2 || i2 == 3) {
                this.colorEditText[i2].setVisibility(8);
            }
            i2++;
        }
        ImageView imageView = new ImageView(getContext());
        this.addButton = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor("dialogButtonSelector"), 1));
        this.addButton.setImageResource(C0890R.C0891drawable.themes_addcolor);
        this.addButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
        this.addButton.setScaleType(ImageView.ScaleType.CENTER);
        this.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ColorPicker.this.lambda$new$2(view);
            }
        });
        this.addButton.setContentDescription(LocaleController.getString("Add", C0890R.string.Add));
        addView(this.addButton, LayoutHelper.createFrame(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(getContext()) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ColorPicker.this.linearLayout.invalidate();
            }
        };
        this.clearButton = imageView2;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor("dialogButtonSelector"), 1));
        this.clearButton.setImageResource(C0890R.C0891drawable.themes_deletecolor);
        this.clearButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
        this.clearButton.setAlpha(0.0f);
        this.clearButton.setScaleX(0.0f);
        this.clearButton.setScaleY(0.0f);
        this.clearButton.setScaleType(ImageView.ScaleType.CENTER);
        this.clearButton.setVisibility(4);
        this.clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ColorPicker.this.lambda$new$3(view);
            }
        });
        this.clearButton.setContentDescription(LocaleController.getString("ClearButton", C0890R.string.ClearButton));
        addView(this.clearButton, LayoutHelper.createFrame(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.resetButton = textView;
        textView.setTextSize(1, 15.0f);
        this.resetButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.resetButton.setGravity(17);
        this.resetButton.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
        this.resetButton.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        addView(this.resetButton, LayoutHelper.createFrame(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        this.resetButton.setOnClickListener(ColorPicker$$ExternalSyntheticLambda4.INSTANCE);
        if (z) {
            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor("windowBackgroundWhiteBlackText"));
            this.menuItem = actionBarMenuItem;
            actionBarMenuItem.setLongClickEnabled(false);
            this.menuItem.setIcon(C0890R.C0891drawable.ic_ab_other);
            this.menuItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C0890R.string.AccDescrMoreOptions));
            this.menuItem.addSubItem(1, C0890R.C0891drawable.msg_edit, LocaleController.getString("OpenInEditor", C0890R.string.OpenInEditor));
            this.menuItem.addSubItem(2, C0890R.C0891drawable.msg_share, LocaleController.getString("ShareTheme", C0890R.string.ShareTheme));
            this.menuItem.addSubItem(3, C0890R.C0891drawable.msg_delete, LocaleController.getString("DeleteTheme", C0890R.string.DeleteTheme));
            this.menuItem.setMenuYOffset(-AndroidUtilities.m34dp(80.0f));
            this.menuItem.setSubMenuOpenSide(2);
            this.menuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
                @Override
                public final void onItemClick(int i3) {
                    ColorPicker.this.lambda$new$5(i3);
                }
            });
            this.menuItem.setAdditionalYOffset(AndroidUtilities.m34dp(72.0f));
            this.menuItem.setTranslationX(AndroidUtilities.m34dp(6.0f));
            this.menuItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("dialogButtonSelector"), 1));
            addView(this.menuItem, LayoutHelper.createFrame(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            this.menuItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ColorPicker.this.lambda$new$6(view);
                }
            });
        }
        updateColorsPosition(null, 0, false, getMeasuredWidth());
    }

    public void lambda$new$0(View view) {
        RadioButton radioButton = (RadioButton) view;
        int i = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.radioButton;
            if (i < radioButtonArr.length) {
                boolean z = radioButtonArr[i] == radioButton;
                radioButtonArr[i].setChecked(z, true);
                if (z) {
                    this.selectedColor = i;
                }
                i++;
            } else {
                int color = radioButton.getColor();
                setColorInner(color);
                this.colorEditText[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                return;
            }
        }
    }

    public static boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        AndroidUtilities.hideKeyboard(textView);
        return true;
    }

    public void lambda$new$2(View view) {
        if (this.colorsAnimator == null) {
            int i = this.colorsCount;
            if (i == 1) {
                if (this.radioButton[1].getColor() == 0) {
                    RadioButton[] radioButtonArr = this.radioButton;
                    radioButtonArr[1].setColor(generateGradientColors(radioButtonArr[0].getColor()));
                }
                if (this.myMessagesColor) {
                    this.delegate.setColor(this.radioButton[0].getColor(), 0, true);
                }
                this.delegate.setColor(this.radioButton[1].getColor(), 1, true);
                this.colorsCount = 2;
            } else if (i == 2) {
                this.colorsCount = 3;
                if (this.radioButton[2].getColor() == 0) {
                    float[] fArr = new float[3];
                    Color.colorToHSV(this.radioButton[0].getColor(), fArr);
                    if (fArr[0] > 180.0f) {
                        fArr[0] = fArr[0] - 60.0f;
                    } else {
                        fArr[0] = fArr[0] + 60.0f;
                    }
                    this.radioButton[2].setColor(Color.HSVToColor(255, fArr));
                }
                this.delegate.setColor(this.radioButton[2].getColor(), 2, true);
            } else if (i == 3) {
                this.colorsCount = 4;
                if (this.radioButton[3].getColor() == 0) {
                    RadioButton[] radioButtonArr2 = this.radioButton;
                    radioButtonArr2[3].setColor(generateGradientColors(radioButtonArr2[2].getColor()));
                }
                this.delegate.setColor(this.radioButton[3].getColor(), 3, true);
            } else {
                return;
            }
            ArrayList<Animator> arrayList = new ArrayList<>();
            if (this.colorsCount < this.maxColorsCount) {
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_X, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_Y, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.TRANSLATION_X, (AndroidUtilities.m34dp(30.0f) * (this.colorsCount - 1)) + (AndroidUtilities.m34dp(13.0f) * (this.colorsCount - 1))));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.TRANSLATION_X, (AndroidUtilities.m34dp(30.0f) * (this.colorsCount - 1)) + (AndroidUtilities.m34dp(13.0f) * (this.colorsCount - 1))));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_Y, 0.0f));
            }
            if (this.colorsCount > 1) {
                if (this.clearButton.getVisibility() != 0) {
                    this.clearButton.setScaleX(0.0f);
                    this.clearButton.setScaleY(0.0f);
                }
                this.clearButton.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.clearButton, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.clearButton, View.SCALE_X, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.clearButton, View.SCALE_Y, 1.0f));
            }
            this.radioButton[this.colorsCount - 1].callOnClick();
            this.colorsAnimator = new AnimatorSet();
            updateColorsPosition(arrayList, 0, false, getMeasuredWidth());
            this.colorsAnimator.playTogether(arrayList);
            this.colorsAnimator.setDuration(180L);
            this.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.colorsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ColorPicker.this.colorsCount == ColorPicker.this.maxColorsCount) {
                        ColorPicker.this.addButton.setVisibility(4);
                    }
                    ColorPicker.this.colorsAnimator = null;
                }
            });
            this.colorsAnimator.start();
        }
    }

    public void lambda$new$3(View view) {
        RadioButton[] radioButtonArr;
        if (this.colorsAnimator == null) {
            ArrayList<Animator> arrayList = new ArrayList<>();
            int i = this.colorsCount;
            if (i == 2) {
                this.colorsCount = 1;
                arrayList.add(ObjectAnimator.ofFloat(this.clearButton, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.clearButton, View.SCALE_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.clearButton, View.SCALE_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.TRANSLATION_X, 0.0f));
            } else if (i == 3) {
                this.colorsCount = 2;
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.TRANSLATION_X, AndroidUtilities.m34dp(30.0f) + AndroidUtilities.m34dp(13.0f)));
            } else if (i == 4) {
                this.colorsCount = 3;
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.TRANSLATION_X, (AndroidUtilities.m34dp(30.0f) * 2) + (AndroidUtilities.m34dp(13.0f) * 2)));
            } else {
                return;
            }
            if (this.colorsCount < this.maxColorsCount) {
                this.addButton.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_X, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_Y, 1.0f));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.addButton, View.SCALE_Y, 0.0f));
            }
            int i2 = this.selectedColor;
            if (i2 != 3) {
                RadioButton radioButton = this.radioButton[i2];
                int i3 = i2 + 1;
                while (true) {
                    radioButtonArr = this.radioButton;
                    if (i3 >= radioButtonArr.length) {
                        break;
                    }
                    radioButtonArr[i3 - 1] = radioButtonArr[i3];
                    i3++;
                }
                radioButtonArr[3] = radioButton;
            }
            this.radioButton[0].callOnClick();
            int i4 = 0;
            while (true) {
                RadioButton[] radioButtonArr2 = this.radioButton;
                if (i4 < radioButtonArr2.length) {
                    if (i4 < this.colorsCount) {
                        this.delegate.setColor(radioButtonArr2[i4].getColor(), i4, i4 == this.radioButton.length - 1);
                    } else {
                        this.delegate.setColor(0, i4, i4 == radioButtonArr2.length - 1);
                    }
                    i4++;
                } else {
                    this.colorsAnimator = new AnimatorSet();
                    updateColorsPosition(arrayList, this.selectedColor, true, getMeasuredWidth());
                    this.colorsAnimator.playTogether(arrayList);
                    this.colorsAnimator.setDuration(180L);
                    this.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.colorsAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ColorPicker.this.colorsCount == 1) {
                                ColorPicker.this.clearButton.setVisibility(4);
                            }
                            for (int i5 = 0; i5 < ColorPicker.this.radioButton.length; i5++) {
                                if (ColorPicker.this.radioButton[i5].getTag(C0890R.C0892id.index_tag) == null) {
                                    ColorPicker.this.radioButton[i5].setVisibility(4);
                                }
                            }
                            ColorPicker.this.colorsAnimator = null;
                        }
                    });
                    this.colorsAnimator.start();
                    return;
                }
            }
        }
    }

    public void lambda$new$5(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            ColorPickerDelegate colorPickerDelegate = this.delegate;
            if (i != 2) {
                z = false;
            }
            colorPickerDelegate.openThemeCreate(z);
        } else if (i == 3) {
            this.delegate.deleteTheme();
        }
    }

    public void lambda$new$6(View view) {
        this.menuItem.toggleSubMenu();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateColorsPosition(null, 0, false, getMeasuredWidth());
    }

    private void updateColorsPosition(ArrayList<Animator> arrayList, int i, boolean z, int i2) {
        int i3 = this.colorsCount;
        int left = this.radioContainer.getLeft() + (AndroidUtilities.m34dp(30.0f) * i3) + ((i3 - 1) * AndroidUtilities.m34dp(13.0f));
        int dp = i2 - AndroidUtilities.m34dp(this.currentResetType == 1 ? 50.0f : 0.0f);
        float f = left > dp ? left - dp : 0.0f;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.radioContainer, View.TRANSLATION_X, -f));
        } else {
            this.radioContainer.setTranslationX(-f);
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.radioButton;
            if (i4 < radioButtonArr.length) {
                boolean z2 = radioButtonArr[i4].getTag(C0890R.C0892id.index_tag) != null;
                if (i4 < this.colorsCount) {
                    this.radioButton[i4].setVisibility(0);
                    if (arrayList != null) {
                        if (!z2) {
                            arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.ALPHA, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.SCALE_X, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.SCALE_Y, 1.0f));
                        }
                        if (z || (!z && i4 != this.colorsCount - 1)) {
                            arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.TRANSLATION_X, i5));
                        } else {
                            this.radioButton[i4].setTranslationX(i5);
                        }
                    } else {
                        this.radioButton[i4].setVisibility(0);
                        if (this.colorsAnimator == null) {
                            this.radioButton[i4].setAlpha(1.0f);
                            this.radioButton[i4].setScaleX(1.0f);
                            this.radioButton[i4].setScaleY(1.0f);
                        }
                        this.radioButton[i4].setTranslationX(i5);
                    }
                    this.radioButton[i4].setTag(C0890R.C0892id.index_tag, 1);
                } else {
                    if (arrayList == null) {
                        this.radioButton[i4].setVisibility(4);
                        if (this.colorsAnimator == null) {
                            this.radioButton[i4].setAlpha(0.0f);
                            this.radioButton[i4].setScaleX(0.0f);
                            this.radioButton[i4].setScaleY(0.0f);
                        }
                    } else if (z2) {
                        arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.ALPHA, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.SCALE_X, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.radioButton[i4], View.SCALE_Y, 0.0f));
                    }
                    if (!z) {
                        this.radioButton[i4].setTranslationX(i5);
                    }
                    this.radioButton[i4].setTag(C0890R.C0892id.index_tag, null);
                }
                i5 += AndroidUtilities.m34dp(30.0f) + AndroidUtilities.m34dp(13.0f);
                i4++;
            } else {
                return;
            }
        }
    }

    public void hideKeyboard() {
        AndroidUtilities.hideKeyboard(this.colorEditText[1]);
    }

    @Override
    protected void onDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.ColorPicker.onDraw(android.graphics.Canvas):void");
    }

    public int getFieldColor(int i, int i2) {
        try {
            return Integer.parseInt(this.colorEditText[i].getText().toString(), 16) | (-16777216);
        } catch (Exception unused) {
            return i2;
        }
    }

    private void drawPointerArrow(Canvas canvas, int i, int i2, int i3, boolean z) {
        int dp = AndroidUtilities.m34dp(z ? 12.0f : 16.0f);
        this.circleDrawable.setBounds(i - dp, i2 - dp, i + dp, dp + i2);
        this.circleDrawable.draw(canvas);
        this.circlePaint.setColor(-1);
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, AndroidUtilities.m34dp(z ? 11.0f : 15.0f), this.circlePaint);
        this.circlePaint.setColor(i3);
        canvas.drawCircle(f, f2, AndroidUtilities.m34dp(z ? 9.0f : 13.0f), this.circlePaint);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.colorWheelWidth != i) {
            this.colorWheelWidth = i;
            this.colorWheelBitmap = createColorWheelBitmap(i, AndroidUtilities.m34dp(180.0f));
            this.colorGradient = null;
        }
    }

    private Bitmap createColorWheelBitmap(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f = i;
        float f2 = i2;
        this.colorWheelPaint.setShader(new ComposeShader(new LinearGradient(0.0f, i2 / 3, 0.0f, f2, new int[]{-1, 0}, (float[]) null, Shader.TileMode.CLAMP), new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY));
        new Canvas(createBitmap).drawRect(0.0f, 0.0f, f, f2, this.colorWheelPaint);
        return createBitmap;
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.ColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setColorInner(int i) {
        Color.colorToHSV(i, this.colorHSV);
        int defaultColor = this.delegate.getDefaultColor(this.selectedColor);
        if (defaultColor == 0 || defaultColor != i) {
            updateHsvMinMaxBrightness();
        }
        this.colorGradient = null;
        invalidate();
    }

    public void setColor(int i, int i2) {
        if (!this.ignoreTextChange) {
            this.ignoreTextChange = true;
            if (this.selectedColor == i2) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i)), Byte.valueOf((byte) Color.green(i)), Byte.valueOf((byte) Color.blue(i))).toUpperCase();
                this.colorEditText[1].setText(upperCase);
                this.colorEditText[1].setSelection(upperCase.length());
            }
            this.radioButton[i2].setColor(i);
            this.ignoreTextChange = false;
        }
        setColorInner(i);
    }

    public void setHasChanges(final boolean z) {
        if (z && this.resetButton.getTag() != null) {
            return;
        }
        if ((z || this.resetButton.getTag() != null) && this.clearButton.getTag() == null) {
            this.resetButton.setTag(z ? 1 : null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z) {
                this.resetButton.setVisibility(0);
            }
            TextView textView = this.resetButton;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (!z) {
                        ColorPicker.this.resetButton.setVisibility(8);
                    }
                }
            });
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setType(int i, boolean z, final int i2, int i3, boolean z2, int i4, boolean z3) {
        if (i != this.currentResetType) {
            this.selectedColor = 0;
            int i5 = 0;
            while (i5 < 4) {
                this.radioButton[i5].setChecked(i5 == this.selectedColor, true);
                i5++;
            }
        }
        this.maxColorsCount = i2;
        this.currentResetType = i;
        this.myMessagesColor = z2;
        this.colorsCount = i3;
        if (i3 == 1) {
            this.addButton.setTranslationX(0.0f);
        } else if (i3 == 2) {
            this.addButton.setTranslationX(AndroidUtilities.m34dp(30.0f) + AndroidUtilities.m34dp(13.0f));
        } else if (i3 == 3) {
            this.addButton.setTranslationX((AndroidUtilities.m34dp(30.0f) * 2) + (AndroidUtilities.m34dp(13.0f) * 2));
        } else {
            this.addButton.setTranslationX((AndroidUtilities.m34dp(30.0f) * 3) + (AndroidUtilities.m34dp(13.0f) * 3));
        }
        ActionBarMenuItem actionBarMenuItem = this.menuItem;
        if (actionBarMenuItem != null) {
            if (i == 1) {
                actionBarMenuItem.setVisibility(0);
            } else {
                actionBarMenuItem.setVisibility(8);
                this.clearButton.setTranslationX(0.0f);
            }
        }
        if (i2 <= 1) {
            this.addButton.setVisibility(8);
            this.clearButton.setVisibility(8);
        } else {
            if (i3 < i2) {
                this.addButton.setVisibility(0);
                this.addButton.setScaleX(1.0f);
                this.addButton.setScaleY(1.0f);
                this.addButton.setAlpha(1.0f);
            } else {
                this.addButton.setVisibility(8);
            }
            if (i3 > 1) {
                this.clearButton.setVisibility(0);
                this.clearButton.setScaleX(1.0f);
                this.clearButton.setScaleY(1.0f);
                this.clearButton.setAlpha(1.0f);
            } else {
                this.clearButton.setVisibility(8);
            }
        }
        this.linearLayout.invalidate();
        ArrayList arrayList = null;
        updateColorsPosition(null, 0, false, getMeasuredWidth());
        if (z3) {
            arrayList = new ArrayList();
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (i2 <= 1) {
                        ColorPicker.this.clearButton.setVisibility(8);
                    }
                }
            });
            animatorSet.start();
        }
    }

    public int getColor() {
        float[] fArr = this.hsvTemp;
        float[] fArr2 = this.colorHSV;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = getBrightness();
        return (Color.HSVToColor(this.hsvTemp) & 16777215) | (-16777216);
    }

    private float getBrightness() {
        return Math.max(this.minHsvBrightness, Math.min(this.colorHSV[2], this.maxHsvBrightness));
    }

    private void updateHsvMinMaxBrightness() {
        ImageView imageView = this.clearButton;
        if (imageView != null) {
            float f = imageView.getTag() != null ? 0.0f : this.minBrightness;
            float f2 = this.clearButton.getTag() != null ? 1.0f : this.maxBrightness;
            float[] fArr = this.colorHSV;
            float f3 = fArr[2];
            if (f == 0.0f && f2 == 1.0f) {
                this.minHsvBrightness = 0.0f;
                this.maxHsvBrightness = 1.0f;
                return;
            }
            fArr[2] = 1.0f;
            int HSVToColor = Color.HSVToColor(fArr);
            this.colorHSV[2] = f3;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
            float max = Math.max(0.0f, Math.min(f / computePerceivedBrightness, 1.0f));
            this.minHsvBrightness = max;
            this.maxHsvBrightness = Math.max(max, Math.min(f2 / computePerceivedBrightness, 1.0f));
        }
    }

    public void setMinBrightness(float f) {
        this.minBrightness = f;
        updateHsvMinMaxBrightness();
    }

    public void setMaxBrightness(float f) {
        this.maxBrightness = f;
        updateHsvMinMaxBrightness();
    }

    public void provideThemeDescriptions(List<ThemeDescription> list) {
        for (int i = 0; i < this.colorEditText.length; i++) {
            list.add(new ThemeDescription(this.colorEditText[i], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
            list.add(new ThemeDescription(this.colorEditText[i], ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
            list.add(new ThemeDescription(this.colorEditText[i], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
            list.add(new ThemeDescription(this.colorEditText[i], ThemeDescription.FLAG_HINTTEXTCOLOR | ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "windowBackgroundWhiteBlueHeader"));
            list.add(new ThemeDescription(this.colorEditText[i], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
            list.add(new ThemeDescription(this.colorEditText[i], ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        }
        list.add(new ThemeDescription(this.clearButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        list.add(new ThemeDescription(this.clearButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "dialogButtonSelector"));
        if (this.menuItem != null) {
            ThemeDescription.ThemeDescriptionDelegate colorPicker$$ExternalSyntheticLambda7 = new ThemeDescription.ThemeDescriptionDelegate() {
                @Override
                public final void didSetColor() {
                    ColorPicker.this.lambda$provideThemeDescriptions$7();
                }

                @Override
                public void onAnimationProgress(float f) {
                    ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
                }
            };
            list.add(new ThemeDescription(this.menuItem, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, "windowBackgroundWhiteBlackText"));
            list.add(new ThemeDescription(this.menuItem, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, "dialogButtonSelector"));
            list.add(new ThemeDescription(this.menuItem, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, "actionBarDefaultSubmenuItem"));
            list.add(new ThemeDescription(this.menuItem, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, "actionBarDefaultSubmenuItemIcon"));
            list.add(new ThemeDescription(this.menuItem, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, "actionBarDefaultSubmenuBackground"));
        }
    }

    public void lambda$provideThemeDescriptions$7() {
        this.menuItem.setIconColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        Theme.setDrawableColor(this.menuItem.getBackground(), Theme.getColor("dialogButtonSelector"));
        this.menuItem.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItem"), false);
        this.menuItem.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItemIcon"), true);
        this.menuItem.redrawPopup(Theme.getColor("actionBarDefaultSubmenuBackground"));
    }

    public static int generateGradientColors(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        if (fArr[1] > 0.5f) {
            fArr[1] = fArr[1] - 0.15f;
        } else {
            fArr[1] = fArr[1] + 0.15f;
        }
        if (fArr[0] > 180.0f) {
            fArr[0] = fArr[0] - 20.0f;
        } else {
            fArr[0] = fArr[0] + 20.0f;
        }
        return Color.HSVToColor(255, fArr);
    }
}
