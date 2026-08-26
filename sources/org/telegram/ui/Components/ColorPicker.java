package org.telegram.ui.Components;

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
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet$ColorPickerView$1;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet.GradientPickerView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet.GridPickerView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet.SlidersPickerView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda11;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.TON.TONIntroActivity;

public class ColorPicker extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final ImageView addButton;
    public final Drawable circleDrawable;
    public final Paint circlePaint;
    public boolean circlePressed;
    public final AnonymousClass6 clearButton;
    public final EditTextBoldCursor[] colorEditText;
    public LinearGradient colorGradient;
    public final float[] colorHSV;
    public boolean colorPressed;
    public Bitmap colorWheelBitmap;
    public final Paint colorWheelPaint;
    public int colorWheelWidth;
    public AnimatorSet colorsAnimator;
    public int colorsCount;
    public int currentResetType;
    public final ColorPickerDelegate delegate;
    public final float[] hsvTemp;
    public boolean ignoreTextChange;
    public long lastUpdateTime;
    public final Paint linePaint;
    public final AnonymousClass1 linearLayout;
    public float maxBrightness;
    public int maxColorsCount;
    public float maxHsvBrightness;
    public final ActionBarMenuItem menuItem;
    public float minBrightness;
    public float minHsvBrightness;
    public boolean myMessagesColor;
    public float pressedMoveProgress;
    public int prevSelectedColor;
    public final RadioButton[] radioButton;
    public final FrameLayout radioContainer;
    public final TextView resetButton;
    public Theme.ResourcesProvider resourcesProvider;
    public int selectedColor;
    public final RectF sliderRect;
    public final Paint valueSliderPaint;

    public final class AnonymousClass2 extends EditTextBoldCursor {
        public final int $r8$classId;
        public final FrameLayout this$0;
        public final int val$num;

        public AnonymousClass2(FrameLayout frameLayout, Context context, int i, int i2) {
            super(context);
            this.$r8$classId = i2;
            this.this$0 = frameLayout;
            this.val$num = i;
        }

        @Override
        public boolean getGlobalVisibleRect(Rect rect, Point point) {
            switch (this.$r8$classId) {
                case 1:
                    boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                    return globalVisibleRect;
                default:
                    return super.getGlobalVisibleRect(rect, point);
            }
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 1:
                    super.invalidate();
                    ((ColorPicker) this.this$0).colorEditText[this.val$num - 1].invalidate();
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            EmojiView.SearchField searchField;
            View view;
            LinearLayoutManager linearLayoutManager;
            View view2;
            EmojiView.EmojiViewDelegate emojiViewDelegate;
            int i = this.val$num;
            FrameLayout frameLayout = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    if (getAlpha() != 1.0f || motionEvent.getAction() != 0) {
                        return false;
                    }
                    ColorPicker colorPicker = (ColorPicker) frameLayout;
                    if (colorPicker.colorEditText[i + 1].isFocused()) {
                        AndroidUtilities.showKeyboard(colorPicker.colorEditText[i + 1]);
                        return false;
                    }
                    colorPicker.colorEditText[i + 1].requestFocus();
                    return false;
                case 1:
                    if (getAlpha() == 1.0f) {
                        if (isFocused()) {
                            AndroidUtilities.showKeyboard(this);
                            return super.onTouchEvent(motionEvent);
                        }
                        requestFocus();
                    }
                    return false;
                default:
                    EmojiView.SearchField searchField2 = (EmojiView.SearchField) frameLayout;
                    if (!searchField2.searchEditText.isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (motionEvent.getAction() == 0) {
                        EmojiView emojiView = searchField2.this$0;
                        if (!emojiView.delegate.isSearchOpened()) {
                            AnimatorSet animatorSet = emojiView.searchAnimation;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                emojiView.searchAnimation = null;
                            }
                            emojiView.firstStickersAttach = false;
                            emojiView.firstGifAttach = false;
                            emojiView.firstEmojiAttach = false;
                            int i2 = 0;
                            while (i2 < 3) {
                                EmojiView.AnonymousClass19 anonymousClass19 = emojiView.stickersGridView;
                                EmojiView.AnonymousClass5 anonymousClass5 = emojiView.emojiGridView;
                                EmojiView.AnonymousClass14 anonymousClass14 = emojiView.gifGridView;
                                if (i2 == 0) {
                                    searchField = emojiView.emojiSearchField;
                                    view = emojiView.emojiTabs;
                                    linearLayoutManager = emojiView.emojiLayoutManager;
                                    view2 = anonymousClass5;
                                } else if (i2 == 1) {
                                    view = emojiView.gifTabs;
                                    searchField = emojiView.gifSearchField;
                                    linearLayoutManager = emojiView.gifLayoutManager;
                                    view2 = anonymousClass14;
                                } else {
                                    searchField = emojiView.stickersSearchField;
                                    view = emojiView.stickersTab;
                                    linearLayoutManager = emojiView.stickersLayoutManager;
                                    view2 = anonymousClass19;
                                }
                                if (searchField != null) {
                                    if (searchField2 == searchField && (emojiViewDelegate = emojiView.delegate) != null && emojiViewDelegate.isExpanded()) {
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        emojiView.searchAnimation = animatorSet2;
                                        Property property = View.TRANSLATION_Y;
                                        if (view == null || i2 == 2) {
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, i2 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(searchField, (Property<EmojiView.SearchField, Float>) property, AndroidUtilities.dp(0.0f)));
                                        } else {
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, -AndroidUtilities.dp(40.0f)), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, -AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(searchField, (Property<EmojiView.SearchField, Float>) property, AndroidUtilities.dp(0.0f)));
                                        }
                                        emojiView.searchAnimation.setDuration(220L);
                                        emojiView.searchAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                        emojiView.searchAnimation.addListener(new ChatActivity.AnonymousClass74(emojiView, view2, false, 18));
                                        emojiView.searchAnimation.start();
                                    } else {
                                        searchField.setTranslationY(AndroidUtilities.dp(0.0f));
                                        if (view != null && i2 != 2) {
                                            view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                        }
                                        if (view2 == anonymousClass19) {
                                            view2.setPadding(0, 0, 0, emojiView.bottomInset);
                                        } else if (view2 == anonymousClass5) {
                                            view2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), emojiView.bottomInset);
                                        } else if (view2 == anonymousClass14) {
                                            view2.setPadding(0, emojiView.searchFieldHeight, 0, emojiView.bottomInset);
                                        }
                                        if (view2 == anonymousClass14) {
                                            boolean z = emojiView.gifAdapter.results.size() > 0;
                                            EmojiView.GifAdapter gifAdapter = emojiView.gifSearchAdapter;
                                            gifAdapter.showTrendingWhenSearchEmpty = z;
                                            if (z) {
                                                gifAdapter.search("", true);
                                                if (anonymousClass14.getAdapter() != gifAdapter) {
                                                    anonymousClass14.setAdapter(gifAdapter);
                                                }
                                            }
                                        }
                                        linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                                    }
                                }
                                i2++;
                            }
                            emojiView.showBottomTab(false);
                        }
                        emojiView.delegate.onSearchOpenClose(i != 1 ? 1 : 2);
                        AnonymousClass2 anonymousClass2 = searchField2.searchEditText;
                        anonymousClass2.requestFocus();
                        AndroidUtilities.showKeyboard(anonymousClass2);
                    }
                    return super.onTouchEvent(motionEvent);
            }
        }
    }

    public final class AnonymousClass4 implements TextWatcher {
        public final int $r8$classId;
        public final View this$0;
        public final int val$num;

        public AnonymousClass4(ViewGroup viewGroup, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = viewGroup;
            this.val$num = i;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            int i;
            int i2;
            int i3;
            ThemeEditorView.EditorAlert editorAlert;
            int length;
            int i4 = -1;
            int i5 = this.val$num;
            View view = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    ColorPicker colorPicker = (ColorPicker) view;
                    EditTextBoldCursor[] editTextBoldCursorArr = colorPicker.colorEditText;
                    if (!colorPicker.ignoreTextChange) {
                        colorPicker.ignoreTextChange = true;
                        int i6 = 0;
                        while (i6 < editable.length()) {
                            char cCharAt = editable.charAt(i6);
                            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F'))) {
                                editable.replace(i6, i6 + 1, "");
                                i6--;
                            }
                            i6++;
                        }
                        if (editable.length() == 0) {
                            colorPicker.ignoreTextChange = false;
                        } else {
                            try {
                                i4 = Integer.parseInt(editTextBoldCursorArr[i5].getText().toString(), 16) | (-16777216);
                            } catch (Exception unused) {
                            }
                            colorPicker.setColorInner(i4);
                            int color = colorPicker.getColor();
                            if (editable.length() == 6) {
                                editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                                editTextBoldCursorArr[i5].setSelection(editable.length());
                            }
                            RadioButton radioButton = colorPicker.radioButton[colorPicker.selectedColor];
                            radioButton.currentColor = color;
                            radioButton.invalidate();
                            colorPicker.delegate.setColor(color, colorPicker.selectedColor, true);
                            colorPicker.ignoreTextChange = false;
                        }
                        break;
                    }
                    break;
                case 1:
                    int iCodePointCount = i5 - Character.codePointCount(editable, 0, editable.length());
                    NumberTextView numberTextView = (NumberTextView) view;
                    if (iCodePointCount < 30) {
                        numberTextView.setNumber(iCodePointCount, numberTextView.getVisibility() == 0);
                        AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
                    }
                    break;
                case 2:
                    ThemeEditorView.EditorAlert.ColorPicker colorPicker2 = (ThemeEditorView.EditorAlert.ColorPicker) view;
                    ThemeEditorView.EditorAlert editorAlert2 = colorPicker2.this$1;
                    if (!editorAlert2.ignoreTextChange) {
                        editorAlert2.ignoreTextChange = true;
                        int iIntValue = Utilities.parseInt((CharSequence) editable.toString()).intValue();
                        EditTextBoldCursor[] editTextBoldCursorArr2 = colorPicker2.colorEditText;
                        if (iIntValue < 0) {
                            editTextBoldCursorArr2[i5].setText("0");
                            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr2[i5];
                            editTextBoldCursor.setSelection(editTextBoldCursor.length());
                            iIntValue = 0;
                        } else if (iIntValue > 255) {
                            editTextBoldCursorArr2[i5].setText("255");
                            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr2[i5];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            iIntValue = 255;
                        }
                        float[] fArr = colorPicker2.colorHSV;
                        int iHSVToColor = (Color.HSVToColor(fArr) & 16777215) | (((int) (colorPicker2.alpha * 255.0f)) << 24);
                        if (i5 == 2) {
                            i = iHSVToColor & (-256);
                            i2 = iIntValue & 255;
                        } else if (i5 == 1) {
                            i = (-65281) & iHSVToColor;
                            i2 = (iIntValue & 255) << 8;
                        } else if (i5 != 0) {
                            if (i5 == 3) {
                                i = iHSVToColor & 16777215;
                                i2 = (iIntValue & 255) << 24;
                            }
                            colorPicker2.setColor(iHSVToColor);
                            i3 = 0;
                            while (true) {
                                editorAlert = colorPicker2.this$1;
                                if (i3 < ThemeEditorView.this.currentThemeDesription.size()) {
                                    editorAlert.ignoreTextChange = false;
                                } else {
                                    ((ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i3)).setColor((Color.HSVToColor(fArr) & 16777215) | (((int) (colorPicker2.alpha * 255.0f)) << 24), false, true);
                                    i3++;
                                }
                            }
                        } else {
                            i = (-16711681) & iHSVToColor;
                            i2 = (iIntValue & 255) << 16;
                        }
                        iHSVToColor = i | i2;
                        colorPicker2.setColor(iHSVToColor);
                        i3 = 0;
                        while (true) {
                            editorAlert = colorPicker2.this$1;
                            if (i3 < ThemeEditorView.this.currentThemeDesription.size()) {
                                editorAlert.ignoreTextChange = false;
                            } else {
                                ((ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i3)).setColor((Color.HSVToColor(fArr) & 16777215) | (((int) (colorPicker2.alpha * 255.0f)) << 24), false, true);
                                i3++;
                            }
                            break;
                        }
                    }
                    break;
                default:
                    PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) view;
                    if (!phoneConfirmationView.ignoreOnTextChange && (length = editable.length()) >= 1) {
                        if (length > 1) {
                            String string = editable.toString();
                            phoneConfirmationView.ignoreOnTextChange = true;
                            for (int i7 = 0; i7 < Math.min(phoneConfirmationView.length - i5, length); i7++) {
                                if (i7 == 0) {
                                    editable.replace(0, length, string.substring(i7, i7 + 1));
                                } else {
                                    phoneConfirmationView.codeField[i5 + i7].setText(string.substring(i7, i7 + 1));
                                }
                            }
                            phoneConfirmationView.ignoreOnTextChange = false;
                        }
                        if (i5 != phoneConfirmationView.length - 1) {
                            int i8 = i5 + 1;
                            EditTextBoldCursor editTextBoldCursor3 = phoneConfirmationView.codeField[i8];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            phoneConfirmationView.codeField[i8].requestFocus();
                        }
                        int i9 = phoneConfirmationView.length;
                        if ((i5 == i9 - 1 || (i5 == i9 - 2 && length >= 2)) && phoneConfirmationView.getCode().length() == phoneConfirmationView.length) {
                            phoneConfirmationView.onNextPressed(null);
                        }
                    }
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        public AnonymousClass4(int i, NumberTextView numberTextView) {
            this.$r8$classId = 1;
            this.val$num = i;
            this.this$0 = numberTextView;
        }

        private final void beforeTextChanged$org$telegram$ui$Components$AlertsCreator$18(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$ColorPicker$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$ThemeEditorView$EditorAlert$ColorPicker$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$PassportActivity$PhoneConfirmationView$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$AlertsCreator$18(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$ColorPicker$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$ThemeEditorView$EditorAlert$ColorPicker$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PassportActivity$PhoneConfirmationView$3(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass6 extends ImageView {
        public AnonymousClass6(Context context) {
            super(context);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            ColorPicker.this.linearLayout.invalidate();
        }
    }

    public interface ColorPickerDelegate {
        void deleteTheme();

        int getDefaultColor(int i);

        void openThemeCreate(boolean z);

        void setColor(int i, int i2, boolean z);
    }

    public final class RadioButton extends View {
        public ObjectAnimator checkAnimator;
        public boolean checked;
        public float checkedState;
        public int currentColor;
        public final Paint paint;

        public RadioButton(Context context) {
            super(context);
            this.paint = new Paint(1);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float fDp = AndroidUtilities.dp(15.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            Paint paint = this.paint;
            paint.setColor(this.currentColor);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.checkedState * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (AndroidUtilities.dp(5.0f) * this.checkedState), paint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.checked);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        }

        public final void updateCheckedState(boolean z) {
            ObjectAnimator objectAnimator = this.checkAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z) {
                this.checkedState = this.checked ? 1.0f : 0.0f;
                invalidate();
            } else {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "checkedState", this.checked ? 1.0f : 0.0f);
                this.checkAnimator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.checkAnimator.start();
            }
        }
    }

    public ColorPicker(Context context, boolean z, ColorPickerDelegate colorPickerDelegate) {
        super(context);
        this.sliderRect = new RectF();
        this.radioButton = new RadioButton[4];
        final int i = 1;
        this.colorsCount = 1;
        this.maxColorsCount = 1;
        final int i2 = 3;
        this.colorHSV = new float[]{0.0f, 0.0f, 1.0f};
        this.hsvTemp = new float[3];
        this.pressedMoveProgress = 1.0f;
        this.minBrightness = 0.0f;
        this.maxBrightness = 1.0f;
        this.minHsvBrightness = 0.0f;
        this.maxHsvBrightness = 1.0f;
        this.delegate = colorPickerDelegate;
        final int i3 = 2;
        this.colorEditText = new EditTextBoldCursor[2];
        final int i4 = 0;
        setWillNotDraw(false);
        this.circleDrawable = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.circlePaint = new Paint(1);
        this.colorWheelPaint = new Paint(5);
        this.valueSliderPaint = new Paint(5);
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context);
        this.linearLayout = anonymousClass1;
        anonymousClass1.setOrientation(0);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        anonymousClass1.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.radioContainer = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, LayoutHelper.createFrame(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i5 = 0;
        while (i5 < 4) {
            this.radioButton[i5] = new RadioButton(context);
            RadioButton radioButton = this.radioButton[i5];
            radioButton.checked = this.selectedColor == i5;
            radioButton.updateCheckedState(false);
            this.radioContainer.addView(this.radioButton[i5], LayoutHelper.createFrame(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.radioButton[i5].setOnClickListener(new View.OnClickListener(this) {
                public final ColorPicker f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    final ColorPicker colorPicker = this.f$0;
                    switch (i4) {
                        case 0:
                            colorPicker.lambda$new$0(view);
                            break;
                        case 1:
                            if (colorPicker.colorsAnimator == null) {
                                int i6 = colorPicker.colorsCount;
                                ColorPicker.ColorPickerDelegate colorPickerDelegate2 = colorPicker.delegate;
                                ColorPicker.RadioButton[] radioButtonArr = colorPicker.radioButton;
                                if (i6 == 1) {
                                    ColorPicker.RadioButton radioButton2 = radioButtonArr[1];
                                    if (radioButton2.currentColor == 0) {
                                        radioButton2.currentColor = ColorPicker.generateGradientColors(radioButtonArr[0].currentColor);
                                        radioButton2.invalidate();
                                    }
                                    if (colorPicker.myMessagesColor) {
                                        colorPickerDelegate2.setColor(radioButtonArr[0].currentColor, 0, true);
                                    }
                                    colorPickerDelegate2.setColor(radioButtonArr[1].currentColor, 1, true);
                                    colorPicker.colorsCount = 2;
                                } else if (i6 == 2) {
                                    colorPicker.colorsCount = 3;
                                    if (radioButtonArr[2].currentColor == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(radioButtonArr[0].currentColor, fArr);
                                        float f = fArr[0];
                                        if (f > 180.0f) {
                                            fArr[0] = f - 60.0f;
                                        } else {
                                            fArr[0] = f + 60.0f;
                                        }
                                        ColorPicker.RadioButton radioButton3 = radioButtonArr[2];
                                        radioButton3.currentColor = Color.HSVToColor(255, fArr);
                                        radioButton3.invalidate();
                                    }
                                    colorPickerDelegate2.setColor(radioButtonArr[2].currentColor, 2, true);
                                } else if (i6 == 3) {
                                    colorPicker.colorsCount = 4;
                                    ColorPicker.RadioButton radioButton4 = radioButtonArr[3];
                                    if (radioButton4.currentColor == 0) {
                                        radioButton4.currentColor = ColorPicker.generateGradientColors(radioButtonArr[2].currentColor);
                                        radioButton4.invalidate();
                                    }
                                    colorPickerDelegate2.setColor(radioButtonArr[3].currentColor, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                int i7 = colorPicker.colorsCount;
                                int i8 = colorPicker.maxColorsCount;
                                Property property = View.TRANSLATION_X;
                                Property property2 = View.SCALE_Y;
                                Property property3 = View.SCALE_X;
                                Property property4 = View.ALPHA;
                                ImageView imageView = colorPicker.addButton;
                                if (i7 < i8) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (colorPicker.colorsCount > 1) {
                                    ColorPicker.AnonymousClass6 anonymousClass6 = colorPicker.clearButton;
                                    if (anonymousClass6.getVisibility() != 0) {
                                        anonymousClass6.setScaleX(0.0f);
                                        anonymousClass6.setScaleY(0.0f);
                                    }
                                    anonymousClass6.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<ColorPicker.AnonymousClass6, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<ColorPicker.AnonymousClass6, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<ColorPicker.AnonymousClass6, Float>) property2, 1.0f));
                                }
                                radioButtonArr[colorPicker.colorsCount - 1].callOnClick();
                                colorPicker.colorsAnimator = new AnimatorSet();
                                colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList, false);
                                colorPicker.colorsAnimator.playTogether(arrayList);
                                colorPicker.colorsAnimator.setDuration(180L);
                                colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                                colorPicker.colorsAnimator.addListener(new CheckBox.AnonymousClass1(colorPicker, 22));
                                colorPicker.colorsAnimator.start();
                                break;
                            }
                            break;
                        case 2:
                            if (colorPicker.colorsAnimator == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i9 = colorPicker.colorsCount;
                                Property property5 = View.TRANSLATION_X;
                                Property property6 = View.SCALE_Y;
                                Property property7 = View.SCALE_X;
                                Property property8 = View.ALPHA;
                                ImageView imageView2 = colorPicker.addButton;
                                if (i9 == 2) {
                                    colorPicker.colorsCount = 1;
                                    ColorPicker.AnonymousClass6 anonymousClass7 = colorPicker.clearButton;
                                    arrayList2.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i9 == 3) {
                                    colorPicker.colorsCount = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i9 == 4) {
                                    colorPicker.colorsCount = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 13.0f, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (colorPicker.colorsCount < colorPicker.maxColorsCount) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i10 = colorPicker.selectedColor;
                                ColorPicker.RadioButton[] radioButtonArr2 = colorPicker.radioButton;
                                if (i10 != 3) {
                                    ColorPicker.RadioButton radioButton5 = radioButtonArr2[i10];
                                    while (true) {
                                        i10++;
                                        if (i10 < radioButtonArr2.length) {
                                            radioButtonArr2[i10 - 1] = radioButtonArr2[i10];
                                        } else {
                                            radioButtonArr2[3] = radioButton5;
                                        }
                                    }
                                }
                                int i11 = colorPicker.prevSelectedColor;
                                if (i11 < 0 || i11 >= colorPicker.selectedColor) {
                                    radioButtonArr2[colorPicker.colorsCount - 1].callOnClick();
                                } else {
                                    radioButtonArr2[i11].callOnClick();
                                }
                                int i12 = 0;
                                while (i12 < radioButtonArr2.length) {
                                    int i13 = colorPicker.colorsCount;
                                    ColorPicker.ColorPickerDelegate colorPickerDelegate3 = colorPicker.delegate;
                                    if (i12 < i13) {
                                        colorPickerDelegate3.setColor(radioButtonArr2[i12].currentColor, i12, i12 == radioButtonArr2.length - 1);
                                    } else {
                                        colorPickerDelegate3.setColor(0, i12, i12 == radioButtonArr2.length - 1);
                                    }
                                    i12++;
                                }
                                colorPicker.colorsAnimator = new AnimatorSet();
                                colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList2, true);
                                colorPicker.colorsAnimator.playTogether(arrayList2);
                                colorPicker.colorsAnimator.setDuration(180L);
                                colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                                colorPicker.colorsAnimator.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public final void onAnimationEnd(Animator animator) {
                                        ColorPicker colorPicker2 = ColorPicker.this;
                                        if (colorPicker2.colorsCount == 1) {
                                            colorPicker2.clearButton.setVisibility(4);
                                        }
                                        int i14 = 0;
                                        while (true) {
                                            RadioButton[] radioButtonArr3 = colorPicker2.radioButton;
                                            if (i14 >= radioButtonArr3.length) {
                                                colorPicker2.colorsAnimator = null;
                                                return;
                                            } else {
                                                if (radioButtonArr3[i14].getTag(R.id.index_tag) == null) {
                                                    colorPicker2.radioButton[i14].setVisibility(4);
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                });
                                colorPicker.colorsAnimator.start();
                                break;
                            }
                            break;
                        default:
                            colorPicker.menuItem.toggleSubMenu(null, null);
                            break;
                    }
                }
            });
            i5++;
        }
        int i6 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.colorEditText;
            if (i6 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i6 % 2 == 0) {
                editTextBoldCursorArr[i6] = new AnonymousClass2(this, context, i6, i4);
                this.colorEditText[i6].setBackgroundDrawable(null);
                this.colorEditText[i6].setText("#");
                this.colorEditText[i6].setEnabled(false);
                this.colorEditText[i6].setFocusable(false);
                this.colorEditText[i6].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.linearLayout.addView(this.colorEditText[i6], LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i6] = new AnonymousClass2(this, context, i6, i);
                this.colorEditText[i6].setBackgroundDrawable(null);
                this.colorEditText[i6].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.colorEditText[i6].setHint("8BC6ED");
                this.colorEditText[i6].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.linearLayout.addView(this.colorEditText[i6], LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.colorEditText[i6].addTextChangedListener(new AnonymousClass4(this, i6, i4));
                this.colorEditText[i6].setOnEditorActionListener(new PaymentFormActivity$$ExternalSyntheticLambda11(2));
            }
            this.colorEditText[i6].setTextSize(1, 16.0f);
            this.colorEditText[i6].setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, this.resourcesProvider));
            EditTextBoldCursor editTextBoldCursor = this.colorEditText[i6];
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(i7, this.resourcesProvider));
            this.colorEditText[i6].setCursorColor(Theme.getColor(i7, this.resourcesProvider));
            this.colorEditText[i6].setCursorSize(AndroidUtilities.dp(18.0f));
            this.colorEditText[i6].setCursorWidth(1.5f);
            this.colorEditText[i6].setSingleLine(true);
            this.colorEditText[i6].setGravity(19);
            this.colorEditText[i6].setHeaderHintColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, this.resourcesProvider));
            this.colorEditText[i6].setTransformHintToHeader(true);
            this.colorEditText[i6].setInputType(524416);
            this.colorEditText[i6].setImeOptions(268435462);
            if (i6 == 1) {
                this.colorEditText[i6].requestFocus();
            } else if (i6 == 2 || i6 == 3) {
                this.colorEditText[i6].setVisibility(8);
            }
            i6++;
        }
        ImageView imageView = new ImageView(getContext());
        this.addButton = imageView;
        int i8 = Theme.key_dialogButtonSelector;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i8, this.resourcesProvider), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i9 = Theme.key_windowBackgroundWhiteBlackText;
        int color = Theme.getColor(i9, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ColorPicker f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                final ColorPicker colorPicker = this.f$0;
                switch (i) {
                    case 0:
                        colorPicker.lambda$new$0(view);
                        break;
                    case 1:
                        if (colorPicker.colorsAnimator == null) {
                            int i10 = colorPicker.colorsCount;
                            ColorPicker.ColorPickerDelegate colorPickerDelegate2 = colorPicker.delegate;
                            ColorPicker.RadioButton[] radioButtonArr = colorPicker.radioButton;
                            if (i10 == 1) {
                                ColorPicker.RadioButton radioButton2 = radioButtonArr[1];
                                if (radioButton2.currentColor == 0) {
                                    radioButton2.currentColor = ColorPicker.generateGradientColors(radioButtonArr[0].currentColor);
                                    radioButton2.invalidate();
                                }
                                if (colorPicker.myMessagesColor) {
                                    colorPickerDelegate2.setColor(radioButtonArr[0].currentColor, 0, true);
                                }
                                colorPickerDelegate2.setColor(radioButtonArr[1].currentColor, 1, true);
                                colorPicker.colorsCount = 2;
                            } else if (i10 == 2) {
                                colorPicker.colorsCount = 3;
                                if (radioButtonArr[2].currentColor == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(radioButtonArr[0].currentColor, fArr);
                                    float f = fArr[0];
                                    if (f > 180.0f) {
                                        fArr[0] = f - 60.0f;
                                    } else {
                                        fArr[0] = f + 60.0f;
                                    }
                                    ColorPicker.RadioButton radioButton3 = radioButtonArr[2];
                                    radioButton3.currentColor = Color.HSVToColor(255, fArr);
                                    radioButton3.invalidate();
                                }
                                colorPickerDelegate2.setColor(radioButtonArr[2].currentColor, 2, true);
                            } else if (i10 == 3) {
                                colorPicker.colorsCount = 4;
                                ColorPicker.RadioButton radioButton4 = radioButtonArr[3];
                                if (radioButton4.currentColor == 0) {
                                    radioButton4.currentColor = ColorPicker.generateGradientColors(radioButtonArr[2].currentColor);
                                    radioButton4.invalidate();
                                }
                                colorPickerDelegate2.setColor(radioButtonArr[3].currentColor, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            int i11 = colorPicker.colorsCount;
                            int i12 = colorPicker.maxColorsCount;
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            ImageView imageView2 = colorPicker.addButton;
                            if (i11 < i12) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (colorPicker.colorsCount > 1) {
                                ColorPicker.AnonymousClass6 anonymousClass6 = colorPicker.clearButton;
                                if (anonymousClass6.getVisibility() != 0) {
                                    anonymousClass6.setScaleX(0.0f);
                                    anonymousClass6.setScaleY(0.0f);
                                }
                                anonymousClass6.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<ColorPicker.AnonymousClass6, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<ColorPicker.AnonymousClass6, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<ColorPicker.AnonymousClass6, Float>) property2, 1.0f));
                            }
                            radioButtonArr[colorPicker.colorsCount - 1].callOnClick();
                            colorPicker.colorsAnimator = new AnimatorSet();
                            colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList, false);
                            colorPicker.colorsAnimator.playTogether(arrayList);
                            colorPicker.colorsAnimator.setDuration(180L);
                            colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            colorPicker.colorsAnimator.addListener(new CheckBox.AnonymousClass1(colorPicker, 22));
                            colorPicker.colorsAnimator.start();
                            break;
                        }
                        break;
                    case 2:
                        if (colorPicker.colorsAnimator == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i13 = colorPicker.colorsCount;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            ImageView imageView3 = colorPicker.addButton;
                            if (i13 == 2) {
                                colorPicker.colorsCount = 1;
                                ColorPicker.AnonymousClass6 anonymousClass7 = colorPicker.clearButton;
                                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i13 == 3) {
                                colorPicker.colorsCount = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i13 == 4) {
                                colorPicker.colorsCount = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 13.0f, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (colorPicker.colorsCount < colorPicker.maxColorsCount) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i14 = colorPicker.selectedColor;
                            ColorPicker.RadioButton[] radioButtonArr2 = colorPicker.radioButton;
                            if (i14 != 3) {
                                ColorPicker.RadioButton radioButton5 = radioButtonArr2[i14];
                                while (true) {
                                    i14++;
                                    if (i14 < radioButtonArr2.length) {
                                        radioButtonArr2[i14 - 1] = radioButtonArr2[i14];
                                    } else {
                                        radioButtonArr2[3] = radioButton5;
                                    }
                                }
                            }
                            int i15 = colorPicker.prevSelectedColor;
                            if (i15 < 0 || i15 >= colorPicker.selectedColor) {
                                radioButtonArr2[colorPicker.colorsCount - 1].callOnClick();
                            } else {
                                radioButtonArr2[i15].callOnClick();
                            }
                            int i16 = 0;
                            while (i16 < radioButtonArr2.length) {
                                int i17 = colorPicker.colorsCount;
                                ColorPicker.ColorPickerDelegate colorPickerDelegate3 = colorPicker.delegate;
                                if (i16 < i17) {
                                    colorPickerDelegate3.setColor(radioButtonArr2[i16].currentColor, i16, i16 == radioButtonArr2.length - 1);
                                } else {
                                    colorPickerDelegate3.setColor(0, i16, i16 == radioButtonArr2.length - 1);
                                }
                                i16++;
                            }
                            colorPicker.colorsAnimator = new AnimatorSet();
                            colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList2, true);
                            colorPicker.colorsAnimator.playTogether(arrayList2);
                            colorPicker.colorsAnimator.setDuration(180L);
                            colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            colorPicker.colorsAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    ColorPicker colorPicker2 = ColorPicker.this;
                                    if (colorPicker2.colorsCount == 1) {
                                        colorPicker2.clearButton.setVisibility(4);
                                    }
                                    int i18 = 0;
                                    while (true) {
                                        RadioButton[] radioButtonArr3 = colorPicker2.radioButton;
                                        if (i18 >= radioButtonArr3.length) {
                                            colorPicker2.colorsAnimator = null;
                                            return;
                                        } else {
                                            if (radioButtonArr3[i18].getTag(R.id.index_tag) == null) {
                                                colorPicker2.radioButton[i18].setVisibility(4);
                                            }
                                            i18++;
                                        }
                                    }
                                }
                            });
                            colorPicker.colorsAnimator.start();
                            break;
                        }
                        break;
                    default:
                        colorPicker.menuItem.toggleSubMenu(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, LayoutHelper.createFrame(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(getContext());
        this.clearButton = anonymousClass6;
        anonymousClass6.setBackground(Theme.createSelectorDrawable(Theme.getColor(i8, this.resourcesProvider), 1, -1));
        anonymousClass6.setImageResource(R.drawable.msg_close);
        anonymousClass6.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i9, this.resourcesProvider), mode));
        anonymousClass6.setAlpha(0.0f);
        anonymousClass6.setScaleX(0.0f);
        anonymousClass6.setScaleY(0.0f);
        anonymousClass6.setScaleType(scaleType);
        anonymousClass6.setVisibility(4);
        anonymousClass6.setOnClickListener(new View.OnClickListener(this) {
            public final ColorPicker f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                final ColorPicker colorPicker = this.f$0;
                switch (i3) {
                    case 0:
                        colorPicker.lambda$new$0(view);
                        break;
                    case 1:
                        if (colorPicker.colorsAnimator == null) {
                            int i10 = colorPicker.colorsCount;
                            ColorPicker.ColorPickerDelegate colorPickerDelegate2 = colorPicker.delegate;
                            ColorPicker.RadioButton[] radioButtonArr = colorPicker.radioButton;
                            if (i10 == 1) {
                                ColorPicker.RadioButton radioButton2 = radioButtonArr[1];
                                if (radioButton2.currentColor == 0) {
                                    radioButton2.currentColor = ColorPicker.generateGradientColors(radioButtonArr[0].currentColor);
                                    radioButton2.invalidate();
                                }
                                if (colorPicker.myMessagesColor) {
                                    colorPickerDelegate2.setColor(radioButtonArr[0].currentColor, 0, true);
                                }
                                colorPickerDelegate2.setColor(radioButtonArr[1].currentColor, 1, true);
                                colorPicker.colorsCount = 2;
                            } else if (i10 == 2) {
                                colorPicker.colorsCount = 3;
                                if (radioButtonArr[2].currentColor == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(radioButtonArr[0].currentColor, fArr);
                                    float f = fArr[0];
                                    if (f > 180.0f) {
                                        fArr[0] = f - 60.0f;
                                    } else {
                                        fArr[0] = f + 60.0f;
                                    }
                                    ColorPicker.RadioButton radioButton3 = radioButtonArr[2];
                                    radioButton3.currentColor = Color.HSVToColor(255, fArr);
                                    radioButton3.invalidate();
                                }
                                colorPickerDelegate2.setColor(radioButtonArr[2].currentColor, 2, true);
                            } else if (i10 == 3) {
                                colorPicker.colorsCount = 4;
                                ColorPicker.RadioButton radioButton4 = radioButtonArr[3];
                                if (radioButton4.currentColor == 0) {
                                    radioButton4.currentColor = ColorPicker.generateGradientColors(radioButtonArr[2].currentColor);
                                    radioButton4.invalidate();
                                }
                                colorPickerDelegate2.setColor(radioButtonArr[3].currentColor, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            int i11 = colorPicker.colorsCount;
                            int i12 = colorPicker.maxColorsCount;
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            ImageView imageView2 = colorPicker.addButton;
                            if (i11 < i12) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (colorPicker.colorsCount > 1) {
                                ColorPicker.AnonymousClass6 anonymousClass7 = colorPicker.clearButton;
                                if (anonymousClass7.getVisibility() != 0) {
                                    anonymousClass7.setScaleX(0.0f);
                                    anonymousClass7.setScaleY(0.0f);
                                }
                                anonymousClass7.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property2, 1.0f));
                            }
                            radioButtonArr[colorPicker.colorsCount - 1].callOnClick();
                            colorPicker.colorsAnimator = new AnimatorSet();
                            colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList, false);
                            colorPicker.colorsAnimator.playTogether(arrayList);
                            colorPicker.colorsAnimator.setDuration(180L);
                            colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            colorPicker.colorsAnimator.addListener(new CheckBox.AnonymousClass1(colorPicker, 22));
                            colorPicker.colorsAnimator.start();
                            break;
                        }
                        break;
                    case 2:
                        if (colorPicker.colorsAnimator == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i13 = colorPicker.colorsCount;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            ImageView imageView3 = colorPicker.addButton;
                            if (i13 == 2) {
                                colorPicker.colorsCount = 1;
                                ColorPicker.AnonymousClass6 anonymousClass8 = colorPicker.clearButton;
                                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<ColorPicker.AnonymousClass6, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<ColorPicker.AnonymousClass6, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<ColorPicker.AnonymousClass6, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i13 == 3) {
                                colorPicker.colorsCount = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i13 == 4) {
                                colorPicker.colorsCount = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 13.0f, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (colorPicker.colorsCount < colorPicker.maxColorsCount) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i14 = colorPicker.selectedColor;
                            ColorPicker.RadioButton[] radioButtonArr2 = colorPicker.radioButton;
                            if (i14 != 3) {
                                ColorPicker.RadioButton radioButton5 = radioButtonArr2[i14];
                                while (true) {
                                    i14++;
                                    if (i14 < radioButtonArr2.length) {
                                        radioButtonArr2[i14 - 1] = radioButtonArr2[i14];
                                    } else {
                                        radioButtonArr2[3] = radioButton5;
                                    }
                                }
                            }
                            int i15 = colorPicker.prevSelectedColor;
                            if (i15 < 0 || i15 >= colorPicker.selectedColor) {
                                radioButtonArr2[colorPicker.colorsCount - 1].callOnClick();
                            } else {
                                radioButtonArr2[i15].callOnClick();
                            }
                            int i16 = 0;
                            while (i16 < radioButtonArr2.length) {
                                int i17 = colorPicker.colorsCount;
                                ColorPicker.ColorPickerDelegate colorPickerDelegate3 = colorPicker.delegate;
                                if (i16 < i17) {
                                    colorPickerDelegate3.setColor(radioButtonArr2[i16].currentColor, i16, i16 == radioButtonArr2.length - 1);
                                } else {
                                    colorPickerDelegate3.setColor(0, i16, i16 == radioButtonArr2.length - 1);
                                }
                                i16++;
                            }
                            colorPicker.colorsAnimator = new AnimatorSet();
                            colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList2, true);
                            colorPicker.colorsAnimator.playTogether(arrayList2);
                            colorPicker.colorsAnimator.setDuration(180L);
                            colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            colorPicker.colorsAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    ColorPicker colorPicker2 = ColorPicker.this;
                                    if (colorPicker2.colorsCount == 1) {
                                        colorPicker2.clearButton.setVisibility(4);
                                    }
                                    int i18 = 0;
                                    while (true) {
                                        RadioButton[] radioButtonArr3 = colorPicker2.radioButton;
                                        if (i18 >= radioButtonArr3.length) {
                                            colorPicker2.colorsAnimator = null;
                                            return;
                                        } else {
                                            if (radioButtonArr3[i18].getTag(R.id.index_tag) == null) {
                                                colorPicker2.radioButton[i18].setVisibility(4);
                                            }
                                            i18++;
                                        }
                                    }
                                }
                            });
                            colorPicker.colorsAnimator.start();
                            break;
                        }
                        break;
                    default:
                        colorPicker.menuItem.toggleSubMenu(null, null);
                        break;
                }
            }
        });
        anonymousClass6.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(anonymousClass6, LayoutHelper.createFrame(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.resetButton = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(Theme.getColor(i9, this.resourcesProvider));
        addView(textView, LayoutHelper.createFrame(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(i2));
        if (z) {
            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor(i9, this.resourcesProvider), false, null);
            this.menuItem = actionBarMenuItem;
            actionBarMenuItem.setLongClickEnabled(false);
            actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            actionBarMenuItem.addSubItem(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            actionBarMenuItem.addSubItem(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            actionBarMenuItem.addSubItem(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            actionBarMenuItem.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            actionBarMenuItem.setSubMenuOpenSide(2);
            actionBarMenuItem.setDelegate(new ColorPicker$$ExternalSyntheticLambda6(this, i4));
            actionBarMenuItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            actionBarMenuItem.setTranslationX(AndroidUtilities.dp(6.0f));
            actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i8, this.resourcesProvider), 1, -1));
            addView(actionBarMenuItem, LayoutHelper.createFrame(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            actionBarMenuItem.setOnClickListener(new View.OnClickListener(this) {
                public final ColorPicker f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    final ColorPicker colorPicker = this.f$0;
                    switch (i2) {
                        case 0:
                            colorPicker.lambda$new$0(view);
                            break;
                        case 1:
                            if (colorPicker.colorsAnimator == null) {
                                int i10 = colorPicker.colorsCount;
                                ColorPicker.ColorPickerDelegate colorPickerDelegate2 = colorPicker.delegate;
                                ColorPicker.RadioButton[] radioButtonArr = colorPicker.radioButton;
                                if (i10 == 1) {
                                    ColorPicker.RadioButton radioButton2 = radioButtonArr[1];
                                    if (radioButton2.currentColor == 0) {
                                        radioButton2.currentColor = ColorPicker.generateGradientColors(radioButtonArr[0].currentColor);
                                        radioButton2.invalidate();
                                    }
                                    if (colorPicker.myMessagesColor) {
                                        colorPickerDelegate2.setColor(radioButtonArr[0].currentColor, 0, true);
                                    }
                                    colorPickerDelegate2.setColor(radioButtonArr[1].currentColor, 1, true);
                                    colorPicker.colorsCount = 2;
                                } else if (i10 == 2) {
                                    colorPicker.colorsCount = 3;
                                    if (radioButtonArr[2].currentColor == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(radioButtonArr[0].currentColor, fArr);
                                        float f = fArr[0];
                                        if (f > 180.0f) {
                                            fArr[0] = f - 60.0f;
                                        } else {
                                            fArr[0] = f + 60.0f;
                                        }
                                        ColorPicker.RadioButton radioButton3 = radioButtonArr[2];
                                        radioButton3.currentColor = Color.HSVToColor(255, fArr);
                                        radioButton3.invalidate();
                                    }
                                    colorPickerDelegate2.setColor(radioButtonArr[2].currentColor, 2, true);
                                } else if (i10 == 3) {
                                    colorPicker.colorsCount = 4;
                                    ColorPicker.RadioButton radioButton4 = radioButtonArr[3];
                                    if (radioButton4.currentColor == 0) {
                                        radioButton4.currentColor = ColorPicker.generateGradientColors(radioButtonArr[2].currentColor);
                                        radioButton4.invalidate();
                                    }
                                    colorPickerDelegate2.setColor(radioButtonArr[3].currentColor, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                int i11 = colorPicker.colorsCount;
                                int i12 = colorPicker.maxColorsCount;
                                Property property = View.TRANSLATION_X;
                                Property property2 = View.SCALE_Y;
                                Property property3 = View.SCALE_X;
                                Property property4 = View.ALPHA;
                                ImageView imageView2 = colorPicker.addButton;
                                if (i11 < i12) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, zzkv.m(colorPicker.colorsCount, 1, AndroidUtilities.dp(13.0f), (colorPicker.colorsCount - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (colorPicker.colorsCount > 1) {
                                    ColorPicker.AnonymousClass6 anonymousClass7 = colorPicker.clearButton;
                                    if (anonymousClass7.getVisibility() != 0) {
                                        anonymousClass7.setScaleX(0.0f);
                                        anonymousClass7.setScaleY(0.0f);
                                    }
                                    anonymousClass7.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<ColorPicker.AnonymousClass6, Float>) property2, 1.0f));
                                }
                                radioButtonArr[colorPicker.colorsCount - 1].callOnClick();
                                colorPicker.colorsAnimator = new AnimatorSet();
                                colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList, false);
                                colorPicker.colorsAnimator.playTogether(arrayList);
                                colorPicker.colorsAnimator.setDuration(180L);
                                colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                                colorPicker.colorsAnimator.addListener(new CheckBox.AnonymousClass1(colorPicker, 22));
                                colorPicker.colorsAnimator.start();
                                break;
                            }
                            break;
                        case 2:
                            if (colorPicker.colorsAnimator == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i13 = colorPicker.colorsCount;
                                Property property5 = View.TRANSLATION_X;
                                Property property6 = View.SCALE_Y;
                                Property property7 = View.SCALE_X;
                                Property property8 = View.ALPHA;
                                ImageView imageView3 = colorPicker.addButton;
                                if (i13 == 2) {
                                    colorPicker.colorsCount = 1;
                                    ColorPicker.AnonymousClass6 anonymousClass8 = colorPicker.clearButton;
                                    arrayList2.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<ColorPicker.AnonymousClass6, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<ColorPicker.AnonymousClass6, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<ColorPicker.AnonymousClass6, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i13 == 3) {
                                    colorPicker.colorsCount = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i13 == 4) {
                                    colorPicker.colorsCount = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 13.0f, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (colorPicker.colorsCount < colorPicker.maxColorsCount) {
                                    imageView3.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i14 = colorPicker.selectedColor;
                                ColorPicker.RadioButton[] radioButtonArr2 = colorPicker.radioButton;
                                if (i14 != 3) {
                                    ColorPicker.RadioButton radioButton5 = radioButtonArr2[i14];
                                    while (true) {
                                        i14++;
                                        if (i14 < radioButtonArr2.length) {
                                            radioButtonArr2[i14 - 1] = radioButtonArr2[i14];
                                        } else {
                                            radioButtonArr2[3] = radioButton5;
                                        }
                                    }
                                }
                                int i15 = colorPicker.prevSelectedColor;
                                if (i15 < 0 || i15 >= colorPicker.selectedColor) {
                                    radioButtonArr2[colorPicker.colorsCount - 1].callOnClick();
                                } else {
                                    radioButtonArr2[i15].callOnClick();
                                }
                                int i16 = 0;
                                while (i16 < radioButtonArr2.length) {
                                    int i17 = colorPicker.colorsCount;
                                    ColorPicker.ColorPickerDelegate colorPickerDelegate3 = colorPicker.delegate;
                                    if (i16 < i17) {
                                        colorPickerDelegate3.setColor(radioButtonArr2[i16].currentColor, i16, i16 == radioButtonArr2.length - 1);
                                    } else {
                                        colorPickerDelegate3.setColor(0, i16, i16 == radioButtonArr2.length - 1);
                                    }
                                    i16++;
                                }
                                colorPicker.colorsAnimator = new AnimatorSet();
                                colorPicker.updateColorsPosition(colorPicker.getMeasuredWidth(), arrayList2, true);
                                colorPicker.colorsAnimator.playTogether(arrayList2);
                                colorPicker.colorsAnimator.setDuration(180L);
                                colorPicker.colorsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                                colorPicker.colorsAnimator.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public final void onAnimationEnd(Animator animator) {
                                        ColorPicker colorPicker2 = ColorPicker.this;
                                        if (colorPicker2.colorsCount == 1) {
                                            colorPicker2.clearButton.setVisibility(4);
                                        }
                                        int i18 = 0;
                                        while (true) {
                                            RadioButton[] radioButtonArr3 = colorPicker2.radioButton;
                                            if (i18 >= radioButtonArr3.length) {
                                                colorPicker2.colorsAnimator = null;
                                                return;
                                            } else {
                                                if (radioButtonArr3[i18].getTag(R.id.index_tag) == null) {
                                                    colorPicker2.radioButton[i18].setVisibility(4);
                                                }
                                                i18++;
                                            }
                                        }
                                    }
                                });
                                colorPicker.colorsAnimator.start();
                                break;
                            }
                            break;
                        default:
                            colorPicker.menuItem.toggleSubMenu(null, null);
                            break;
                    }
                }
            });
        }
        updateColorsPosition(getMeasuredWidth(), null, false);
    }

    public static int generateGradientColors(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[1];
        if (f > 0.5f) {
            fArr[1] = f - 0.15f;
        } else {
            fArr[1] = f + 0.15f;
        }
        float f2 = fArr[0];
        if (f2 > 180.0f) {
            fArr[0] = f2 - 20.0f;
        } else {
            fArr[0] = f2 + 20.0f;
        }
        return Color.HSVToColor(255, fArr);
    }

    private float getBrightness() {
        return Math.max(this.minHsvBrightness, Math.min(this.colorHSV[2], this.maxHsvBrightness));
    }

    public void setColorInner(int i) {
        Color.colorToHSV(i, this.colorHSV);
        int defaultColor = this.delegate.getDefaultColor(this.selectedColor);
        if (defaultColor == 0 || defaultColor != i) {
            updateHsvMinMaxBrightness();
        }
        this.colorGradient = null;
        super.invalidate();
        this.linearLayout.invalidate();
    }

    public final void drawPointerArrow(Canvas canvas, int i, int i2, int i3, boolean z) {
        int iDp = AndroidUtilities.dp(z ? 12.0f : 16.0f);
        Drawable drawable = this.circleDrawable;
        drawable.setBounds(i - iDp, i2 - iDp, i + iDp, iDp + i2);
        drawable.draw(canvas);
        Paint paint = this.circlePaint;
        paint.setColor(-1);
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, AndroidUtilities.dp(z ? 11.0f : 15.0f), paint);
        paint.setColor(i3);
        canvas.drawCircle(f, f2, AndroidUtilities.dp(z ? 9.0f : 13.0f), paint);
    }

    public int getColor() {
        float[] fArr = this.colorHSV;
        float f = fArr[0];
        float[] fArr2 = this.hsvTemp;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.linearLayout.invalidate();
    }

    public final void lambda$new$0(View view) {
        RadioButton radioButton = (RadioButton) view;
        int i = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.radioButton;
            if (i >= radioButtonArr.length) {
                int i2 = radioButton.currentColor;
                setColorInner(i2);
                this.colorEditText[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i2)), Byte.valueOf((byte) Color.green(i2)), Byte.valueOf((byte) Color.blue(i2))).toUpperCase());
                return;
            }
            RadioButton radioButton2 = radioButtonArr[i];
            boolean z = radioButton2 == radioButton;
            radioButton2.checked = z;
            radioButton2.updateCheckedState(true);
            if (z) {
                this.prevSelectedColor = this.selectedColor;
                this.selectedColor = i;
            }
            i++;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int iDp = AndroidUtilities.dp(45.0f);
        float f2 = iDp;
        canvas.drawBitmap(this.colorWheelBitmap, 0.0f, f2, (Paint) null);
        int height = this.colorWheelBitmap.getHeight() + iDp;
        Paint paint = this.linePaint;
        canvas.drawRect(0.0f, f2, getMeasuredWidth(), iDp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.colorHSV;
        float f3 = fArr[0];
        float[] fArr2 = this.hsvTemp;
        fArr2[0] = f3;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int iM = (int) DiffUtil.m(1.0f, fArr[1], this.colorWheelBitmap.getHeight(), f2);
        if (!this.circlePressed) {
            int iDp2 = AndroidUtilities.dp(16.0f);
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.pressedMoveProgress);
            if (measuredWidth < iDp2) {
                measuredWidth = (int) (((iDp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - iDp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - iDp2)) * interpolation));
            }
            int i = iDp + iDp2;
            if (iM < i) {
                iM = (int) ((interpolation * (i - iM)) + iM);
            } else if (iM > (this.colorWheelBitmap.getHeight() + iDp) - iDp2) {
                iM = (int) (iM - (interpolation * (iM - ((this.colorWheelBitmap.getHeight() + iDp) - iDp2))));
            }
        }
        drawPointerArrow(canvas, measuredWidth, iM, Color.HSVToColor(fArr2), false);
        RectF rectF = this.sliderRect;
        rectF.set(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(26.0f) + height, getMeasuredWidth() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(34.0f) + height);
        LinearGradient linearGradient = this.colorGradient;
        Paint paint2 = this.valueSliderPaint;
        if (linearGradient == null) {
            fArr2[2] = this.minHsvBrightness;
            int iHSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.maxHsvBrightness;
            int iHSVToColor2 = Color.HSVToColor(fArr2);
            float f4 = rectF.left;
            float f5 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f4, f5, rectF.right, f5, new int[]{iHSVToColor2, iHSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.colorGradient = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.minHsvBrightness == this.maxHsvBrightness) {
            f = 0.5f;
        } else {
            float brightness = getBrightness();
            float f6 = this.minHsvBrightness;
            f = (brightness - f6) / (this.maxHsvBrightness - f6);
        }
        drawPointerArrow(canvas, (int) ((rectF.width() * (1.0f - f)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.circlePressed || this.pressedMoveProgress >= 1.0f) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.lastUpdateTime;
        this.lastUpdateTime = jElapsedRealtime;
        float f7 = (j / 180.0f) + this.pressedMoveProgress;
        this.pressedMoveProgress = f7;
        if (f7 > 1.0f) {
            this.pressedMoveProgress = 1.0f;
        }
        super.invalidate();
        this.linearLayout.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateColorsPosition(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.colorWheelWidth != i) {
            this.colorWheelWidth = i;
            int iDp = AndroidUtilities.dp(180.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, iDp, Bitmap.Config.ARGB_8888);
            float f = i;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f2 = iDp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, iDp / 3, 0.0f, f2, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.colorWheelPaint;
            paint.setShader(composeShader);
            new Canvas(bitmapCreateBitmap).drawRect(0.0f, 0.0f, f, f2, paint);
            this.colorWheelBitmap = bitmapCreateBitmap;
            this.colorGradient = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setColor(int i, int i2) {
        if (!this.ignoreTextChange) {
            this.ignoreTextChange = true;
            if (this.selectedColor == i2) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i)), Byte.valueOf((byte) Color.green(i)), Byte.valueOf((byte) Color.blue(i))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.colorEditText;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            RadioButton radioButton = this.radioButton[i2];
            radioButton.currentColor = i;
            radioButton.invalidate();
            this.ignoreTextChange = false;
        }
        setColorInner(i);
    }

    public void setHasChanges(boolean z) {
        TextView textView = this.resetButton;
        if (!z || textView.getTag() == null) {
            if ((z || textView.getTag() != null) && this.clearButton.getTag() == null) {
                textView.setTag(z ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                animatorSet.addListener(new ChatActivity.AnonymousClass77(19, this, z));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f) {
        this.maxBrightness = f;
        updateHsvMinMaxBrightness();
    }

    public void setMinBrightness(float f) {
        this.minBrightness = f;
        updateHsvMinMaxBrightness();
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public final void setType(int i, int i2, int i3, boolean z) {
        if (i != this.currentResetType) {
            this.prevSelectedColor = 0;
            this.selectedColor = 0;
            int i4 = 0;
            while (i4 < 4) {
                RadioButton radioButton = this.radioButton[i4];
                radioButton.checked = i4 == this.selectedColor;
                radioButton.updateCheckedState(true);
                i4++;
            }
        }
        this.maxColorsCount = i2;
        this.currentResetType = i;
        this.myMessagesColor = z;
        this.colorsCount = i3;
        ImageView imageView = this.addButton;
        if (i3 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i3 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i3 == 3) {
            imageView.setTranslationX(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 13.0f, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(3, 13.0f, AndroidUtilities.dp(30.0f) * 3));
        }
        ActionBarMenuItem actionBarMenuItem = this.menuItem;
        AnonymousClass6 anonymousClass6 = this.clearButton;
        if (actionBarMenuItem != null) {
            if (i == 1) {
                actionBarMenuItem.setVisibility(0);
            } else {
                actionBarMenuItem.setVisibility(8);
                anonymousClass6.setTranslationX(0.0f);
            }
        }
        if (i2 <= 1) {
            imageView.setVisibility(8);
            anonymousClass6.setVisibility(8);
        } else {
            if (i3 < i2) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i3 > 1) {
                anonymousClass6.setVisibility(0);
                anonymousClass6.setScaleX(1.0f);
                anonymousClass6.setScaleY(1.0f);
                anonymousClass6.setAlpha(1.0f);
            } else {
                anonymousClass6.setVisibility(8);
            }
        }
        this.linearLayout.invalidate();
        updateColorsPosition(getMeasuredWidth(), null, false);
    }

    public final void updateColorsPosition(int i, ArrayList arrayList, boolean z) {
        int i2 = this.colorsCount;
        int iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i2 - 1, 13.0f, AndroidUtilities.dp(30.0f) * i2);
        FrameLayout frameLayout = this.radioContainer;
        int left = frameLayout.getLeft() + iM;
        int iDp = i - AndroidUtilities.dp(this.currentResetType == 1 ? 50.0f : 0.0f);
        float f = left > iDp ? left - iDp : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f));
        } else {
            frameLayout.setTranslationX(-f);
        }
        int i3 = 0;
        int iM2 = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.radioButton;
            if (i3 >= radioButtonArr.length) {
                return;
            }
            RadioButton radioButton = radioButtonArr[i3];
            int i4 = R.id.index_tag;
            boolean z2 = radioButton.getTag(i4) != null;
            int i5 = this.colorsCount;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (i3 < i5) {
                radioButtonArr[i3].setVisibility(0);
                if (arrayList != null) {
                    if (!z2) {
                        arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property2, 1.0f));
                    }
                    if (z || !(z || i3 == this.colorsCount - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property, iM2));
                    } else {
                        radioButtonArr[i3].setTranslationX(iM2);
                    }
                } else {
                    radioButtonArr[i3].setVisibility(0);
                    if (this.colorsAnimator == null) {
                        radioButtonArr[i3].setAlpha(1.0f);
                        radioButtonArr[i3].setScaleX(1.0f);
                        radioButtonArr[i3].setScaleY(1.0f);
                    }
                    radioButtonArr[i3].setTranslationX(iM2);
                }
                radioButtonArr[i3].setTag(i4, 1);
            } else {
                if (arrayList == null) {
                    radioButtonArr[i3].setVisibility(4);
                    if (this.colorsAnimator == null) {
                        radioButtonArr[i3].setAlpha(0.0f);
                        radioButtonArr[i3].setScaleX(0.0f);
                        radioButtonArr[i3].setScaleY(0.0f);
                    }
                } else if (z2) {
                    arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(radioButtonArr[i3], (Property<RadioButton, Float>) property2, 0.0f));
                }
                if (!z) {
                    radioButtonArr[i3].setTranslationX(iM2);
                }
                radioButtonArr[i3].setTag(i4, null);
            }
            iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(30.0f), 13.0f, iM2);
            i3++;
        }
    }

    public final void updateHsvMinMaxBrightness() {
        AnonymousClass6 anonymousClass6 = this.clearButton;
        if (anonymousClass6 == null) {
            return;
        }
        float f = anonymousClass6.getTag() != null ? 0.0f : this.minBrightness;
        float f2 = anonymousClass6.getTag() != null ? 1.0f : this.maxBrightness;
        float[] fArr = this.colorHSV;
        float f3 = fArr[2];
        if (f == 0.0f && f2 == 1.0f) {
            this.minHsvBrightness = 0.0f;
            this.maxHsvBrightness = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int iHSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f3;
        float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(iHSVToColor);
        float fMax = Math.max(0.0f, Math.min(f / fComputePerceivedBrightness, 1.0f));
        this.minHsvBrightness = fMax;
        this.maxHsvBrightness = Math.max(fMax, Math.min(f2 / fComputePerceivedBrightness, 1.0f));
    }

    public final class AnonymousClass1 extends LinearLayout {
        public final int $r8$classId;
        public final Object paint;
        public Object rect;
        public final View this$0;

        public AnonymousClass1(Context context) {
            super(context);
            this.$r8$classId = 5;
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            this.rect = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(35.0f));
            addView(backupImageView, LayoutHelper.createLinear(70, 70, 1));
            TextView textView = new TextView(context);
            this.paint = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
            TextView textView2 = new TextView(context);
            this.this$0 = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(17);
            addView(textView2, LayoutHelper.createLinear(-1, -2));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 3:
                    if (((LiveCommentsView.LiveCommentView) this.this$0).drawParticles) {
                        Path path = (Path) this.paint;
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(path);
                        if (((StarsReactionsSheet.Particles) this.rect) == null) {
                            this.rect = new StarsReactionsSheet.Particles(1, 250);
                        }
                        StarsReactionsSheet.Particles particles = (StarsReactionsSheet.Particles) this.rect;
                        float f = 0;
                        particles.bounds.set(f, f, getWidth(), getHeight());
                        particles.removeParticlesOutside();
                        StarsReactionsSheet.Particles particles2 = (StarsReactionsSheet.Particles) this.rect;
                        particles2.speed = 30.0f;
                        particles2.process();
                        ((StarsReactionsSheet.Particles) this.rect).draw(canvas, -1, 0.85f);
                        invalidate();
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            float alpha;
            switch (this.$r8$classId) {
                case 0:
                    Paint paint = (Paint) this.paint;
                    int i = Theme.key_dialogBackgroundGray;
                    ColorPicker colorPicker = (ColorPicker) this.this$0;
                    paint.setColor(Theme.getColor(i, colorPicker.resourcesProvider));
                    int left = colorPicker.colorEditText[0].getLeft() - AndroidUtilities.dp(13.0f);
                    float fDp = AndroidUtilities.dp(91.0f);
                    if (colorPicker.clearButton.getVisibility() == 0) {
                        alpha = colorPicker.clearButton.getAlpha() * AndroidUtilities.dp(25.0f);
                    } else {
                        alpha = 0.0f;
                    }
                    int i2 = (int) (fDp + alpha);
                    RectF rectF = (RectF) this.rect;
                    rectF.set(left, AndroidUtilities.dp(5.0f), left + i2, AndroidUtilities.dp(37.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        public AnonymousClass1(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 4:
                    super(context);
                    setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    frameLayout.setClipToPadding(false);
                    TONIntroActivity.AnonymousClass4 anonymousClass4 = new TONIntroActivity.AnonymousClass4(context, 70, 0);
                    frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
                    GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 4);
                    this.rect = gLIconTextureView;
                    GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
                    gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
                    gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
                    gLIconRenderer.updateColors();
                    gLIconTextureView.setStarParticlesView(anonymousClass4);
                    frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                    gLIconTextureView.setPaused(false);
                    addView(frameLayout, LayoutHelper.createFrame(180.0f, -1));
                    TextView textView = new TextView(context);
                    this.paint = textView;
                    zzkk.m(20.0f, 1, textView);
                    int i2 = Theme.key_dialogTextBlack;
                    textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                    textView.setGravity(17);
                    addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
                    TextView textView2 = new TextView(context);
                    this.this$0 = textView2;
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
                    textView2.setGravity(17);
                    addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 18));
                    break;
                default:
                    setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setClipChildren(false);
                    frameLayout2.setClipToPadding(false);
                    frameLayout2.addView(new StarsIntroActivity.AnonymousClass4(context, 70, 0), LayoutHelper.createFrame(-1.0f, -1));
                    BackupImageView backupImageView = new BackupImageView(context);
                    this.rect = backupImageView;
                    backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                    frameLayout2.addView(backupImageView, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                    addView(frameLayout2, LayoutHelper.createFrame(150.0f, -1));
                    TextView textView3 = new TextView(context);
                    this.paint = textView3;
                    zzkk.m(20.0f, 1, textView3);
                    int i3 = Theme.key_dialogTextBlack;
                    textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
                    textView3.setGravity(17);
                    addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
                    this.this$0 = linksTextView;
                    linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
                    linksTextView.setGravity(17);
                    addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 18));
                    break;
            }
        }

        public AnonymousClass1(ColorPicker colorPicker, Context context) {
            super(context);
            this.$r8$classId = 0;
            this.this$0 = colorPicker;
            this.rect = new RectF();
            this.paint = new Paint(1);
        }

        public AnonymousClass1(ColorPickerBottomSheet colorPickerBottomSheet, Context context) {
            super(context);
            this.$r8$classId = 1;
            setOrientation(1);
            ColorPickerBottomSheet.GridPickerView gridPickerView = colorPickerBottomSheet.new GridPickerView(context);
            this.rect = gridPickerView;
            gridPickerView.setCurrentColor(colorPickerBottomSheet.mColor);
            this.paint = colorPickerBottomSheet.new GradientPickerView(context);
            this.this$0 = colorPickerBottomSheet.new SlidersPickerView(context);
            ColorPickerBottomSheet$ColorPickerView$1 colorPickerBottomSheet$ColorPickerView$1 = new ColorPickerBottomSheet$ColorPickerView$1(context, ((BottomSheet) colorPickerBottomSheet).resourcesProvider);
            colorPickerBottomSheet$ColorPickerView$1.setAdapter(new ViewPagerFixed.Adapter() {
                @Override
                public final View createView(int i) {
                    ColorPicker.AnonymousClass1 anonymousClass1 = this.this$1;
                    if (i != 1) {
                        return i != 2 ? (ColorPickerBottomSheet.GridPickerView) anonymousClass1.rect : (ColorPickerBottomSheet.SlidersPickerView) anonymousClass1.this$0;
                    }
                    return (ColorPickerBottomSheet.GradientPickerView) anonymousClass1.paint;
                }

                @Override
                public final int getItemCount() {
                    return 3;
                }

                @Override
                public final CharSequence getItemTitle(int i) {
                    if (i != 1) {
                        return i != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase();
                    }
                    return LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
                }

                @Override
                public final int getItemViewType(int i) {
                    return i;
                }

                @Override
                public final void bindView(View view, int i, int i2) {
                }
            });
            addView(colorPickerBottomSheet$ColorPickerView$1, LayoutHelper.createLinear(1.0f, -1, 0));
            addView(colorPickerBottomSheet.alphaPickerView, LayoutHelper.createLinear(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(colorPickerBottomSheet.pipetteView, LayoutHelper.createLinear(28, 28));
            linearLayout.addView(colorPickerBottomSheet$ColorPickerView$1.createTabsView(8, false), LayoutHelper.createLinear(-1, 40, 1.0f, 16, 12, 0, 12, 0));
            linearLayout.addView(colorPickerBottomSheet.doneView, LayoutHelper.createLinear(28, 28));
            addView(linearLayout, LayoutHelper.createLinear(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }

        public AnonymousClass1(LiveCommentsView.LiveCommentView liveCommentView, Context context) {
            super(context);
            this.$r8$classId = 3;
            this.this$0 = liveCommentView;
            this.paint = new Path();
        }
    }
}
