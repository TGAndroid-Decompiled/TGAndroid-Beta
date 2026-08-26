package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.TextColorThemeCell;
import org.telegram.ui.LaunchActivity;

public class ThemeEditorView {
    private static volatile ThemeEditorView Instance;
    private ArrayList<ThemeDescription> currentThemeDesription;
    private int currentThemeDesriptionPosition;
    private DecelerateInterpolator decelerateInterpolator;
    private EditorAlert editorAlert;
    private boolean hidden;
    private Activity parentActivity;
    private SharedPreferences preferences;
    private Theme.ThemeInfo themeInfo;
    private WallpaperUpdater wallpaperUpdater;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowManager windowManager;
    private FrameLayout windowView;
    private final int editorWidth = AndroidUtilities.dp(54.0f);
    private final int editorHeight = AndroidUtilities.dp(54.0f);

    public class AnonymousClass1 extends FrameLayout {
        private boolean dragging;
        private float startX;
        private float startY;

        public AnonymousClass1(Context context) {
            super(context);
        }

        public static void lambda$onTouchEvent$0(DialogInterface dialogInterface) {
        }

        public void lambda$onTouchEvent$1(DialogInterface dialogInterface) {
            ThemeEditorView.this.editorAlert = null;
            ThemeEditorView.this.show();
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            INavigationLayout actionBarLayout;
            ArrayList<ThemeDescription> themeDescriptions;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (motionEvent.getAction() == 0) {
                this.startX = rawX;
                this.startY = rawY;
            } else if (motionEvent.getAction() != 2 || this.dragging) {
                if (motionEvent.getAction() == 1 && !this.dragging && ThemeEditorView.this.editorAlert == null) {
                    LaunchActivity launchActivity = (LaunchActivity) ThemeEditorView.this.parentActivity;
                    if (AndroidUtilities.isTablet()) {
                        actionBarLayout = launchActivity.getLayersActionBarLayout();
                        if (actionBarLayout != null && ((ActionBarLayout) actionBarLayout).getFragmentStack().isEmpty()) {
                            actionBarLayout = null;
                        }
                        if (actionBarLayout == null && (actionBarLayout = launchActivity.getRightActionBarLayout()) != null && ((ActionBarLayout) actionBarLayout).getFragmentStack().isEmpty()) {
                            actionBarLayout = null;
                        }
                    } else {
                        actionBarLayout = null;
                    }
                    if (actionBarLayout == null) {
                        actionBarLayout = launchActivity.getActionBarLayout();
                    }
                    if (actionBarLayout != null) {
                        ActionBarLayout actionBarLayout2 = (ActionBarLayout) actionBarLayout;
                        BaseFragment baseFragment = actionBarLayout2.getFragmentStack().isEmpty() ? null : (BaseFragment) Theme.ResourcesProvider.CC.m(actionBarLayout2, 1, actionBarLayout2.getFragmentStack());
                        if (baseFragment != null && (themeDescriptions = baseFragment.getThemeDescriptions()) != null) {
                            ThemeEditorView themeEditorView = ThemeEditorView.this;
                            ThemeEditorView themeEditorView2 = ThemeEditorView.this;
                            themeEditorView.editorAlert = themeEditorView2.new EditorAlert(themeEditorView2.parentActivity, themeDescriptions);
                            ThemeEditorView.this.editorAlert.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda9(1));
                            ThemeEditorView.this.editorAlert.setOnDismissListener(new SearchTagsList$$ExternalSyntheticLambda5(this, 1));
                            ThemeEditorView.this.editorAlert.show();
                            ThemeEditorView.this.hide();
                        }
                    }
                }
            } else if (Math.abs(this.startX - rawX) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(this.startY - rawY) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
                this.dragging = true;
                this.startX = rawX;
                this.startY = rawY;
            }
            if (this.dragging) {
                if (motionEvent.getAction() == 2) {
                    float f = rawX - this.startX;
                    float f2 = rawY - this.startY;
                    WindowManager.LayoutParams layoutParams = ThemeEditorView.this.windowLayoutParams;
                    layoutParams.x = (int) (layoutParams.x + f);
                    WindowManager.LayoutParams layoutParams2 = ThemeEditorView.this.windowLayoutParams;
                    layoutParams2.y = (int) (layoutParams2.y + f2);
                    int i = ThemeEditorView.this.editorWidth / 2;
                    int i2 = -i;
                    if (ThemeEditorView.this.windowLayoutParams.x < i2) {
                        ThemeEditorView.this.windowLayoutParams.x = i2;
                    } else if (ThemeEditorView.this.windowLayoutParams.x > (AndroidUtilities.displaySize.x - ThemeEditorView.this.windowLayoutParams.width) + i) {
                        ThemeEditorView.this.windowLayoutParams.x = (AndroidUtilities.displaySize.x - ThemeEditorView.this.windowLayoutParams.width) + i;
                    }
                    float fM = 1.0f;
                    if (ThemeEditorView.this.windowLayoutParams.x < 0) {
                        fM = zzir.m(ThemeEditorView.this.windowLayoutParams.x, i, 0.5f, 1.0f);
                    } else if (ThemeEditorView.this.windowLayoutParams.x > AndroidUtilities.displaySize.x - ThemeEditorView.this.windowLayoutParams.width) {
                        fM = TextureRenderer$$ExternalSyntheticOutline0.m((ThemeEditorView.this.windowLayoutParams.x - AndroidUtilities.displaySize.x) + ThemeEditorView.this.windowLayoutParams.width, i, 0.5f, 1.0f);
                    }
                    if (ThemeEditorView.this.windowView.getAlpha() != fM) {
                        ThemeEditorView.this.windowView.setAlpha(fM);
                    }
                    if (ThemeEditorView.this.windowLayoutParams.y < 0) {
                        ThemeEditorView.this.windowLayoutParams.y = 0;
                    } else if (ThemeEditorView.this.windowLayoutParams.y > AndroidUtilities.displaySize.y - ThemeEditorView.this.windowLayoutParams.height) {
                        ThemeEditorView.this.windowLayoutParams.y = AndroidUtilities.displaySize.y - ThemeEditorView.this.windowLayoutParams.height;
                    }
                    ThemeEditorView.this.windowManager.updateViewLayout(ThemeEditorView.this.windowView, ThemeEditorView.this.windowLayoutParams);
                    this.startX = rawX;
                    this.startY = rawY;
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    this.dragging = false;
                    ThemeEditorView.this.animateToBoundsMaybe();
                }
            }
            return true;
        }
    }

    public class EditorAlert extends BottomSheet {
        private boolean animationInProgress;
        private FrameLayout bottomLayout;
        private FrameLayout bottomSaveLayout;
        private AnimatorSet colorChangeAnimation;
        private ColorPicker colorPicker;
        private FrameLayout frameLayout;
        private boolean ignoreTextChange;
        private LinearLayoutManager layoutManager;
        private ListAdapter listAdapter;
        private RecyclerListView listView;
        private int previousScrollPosition;
        private TextView saveButton;
        private int scrollOffsetY;
        private SearchAdapter searchAdapter;
        private EmptyTextProgressView searchEmptyView;
        private SearchField searchField;
        private View[] shadow;
        private AnimatorSet[] shadowAnimation;
        private Drawable shadowDrawable;
        private boolean startedColorChange;
        private int topBeforeSwitch;

        public class ColorPicker extends FrameLayout {
            private float alpha;
            private LinearGradient alphaGradient;
            private boolean alphaPressed;
            private Drawable circleDrawable;
            private Paint circlePaint;
            private boolean circlePressed;
            private EditTextBoldCursor[] colorEditText;
            private LinearGradient colorGradient;
            private float[] colorHSV;
            private boolean colorPressed;
            private Bitmap colorWheelBitmap;
            private Paint colorWheelPaint;
            private int colorWheelRadius;
            private DecelerateInterpolator decelerateInterpolator;
            private float[] hsvTemp;
            private LinearLayout linearLayout;
            private final int paramValueSliderWidth;
            private Paint valueSliderPaint;

            public ColorPicker(Context context) {
                super(context);
                this.paramValueSliderWidth = AndroidUtilities.dp(20.0f);
                this.colorEditText = new EditTextBoldCursor[4];
                this.colorHSV = new float[]{0.0f, 0.0f, 1.0f};
                this.alpha = 1.0f;
                this.hsvTemp = new float[3];
                this.decelerateInterpolator = new DecelerateInterpolator();
                setWillNotDraw(false);
                int i = 1;
                this.circlePaint = new Paint(1);
                this.circleDrawable = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
                Paint paint = new Paint();
                this.colorWheelPaint = paint;
                paint.setAntiAlias(true);
                this.colorWheelPaint.setDither(true);
                Paint paint2 = new Paint();
                this.valueSliderPaint = paint2;
                paint2.setAntiAlias(true);
                this.valueSliderPaint.setDither(true);
                LinearLayout linearLayout = new LinearLayout(context);
                this.linearLayout = linearLayout;
                linearLayout.setOrientation(0);
                addView(this.linearLayout, LayoutHelper.createFrame(-2, -2, 49));
                final int i2 = 0;
                while (i2 < 4) {
                    this.colorEditText[i2] = new EditTextBoldCursor(context);
                    this.colorEditText[i2].setInputType(2);
                    this.colorEditText[i2].setTextColor(-14606047);
                    this.colorEditText[i2].setCursorColor(-14606047);
                    this.colorEditText[i2].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.colorEditText[i2].setCursorWidth(1.5f);
                    this.colorEditText[i2].setTextSize(1, 18.0f);
                    this.colorEditText[i2].setBackground(null);
                    this.colorEditText[i2].setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
                    this.colorEditText[i2].setMaxLines(1);
                    this.colorEditText[i2].setTag(Integer.valueOf(i2));
                    this.colorEditText[i2].setGravity(17);
                    if (i2 == 0) {
                        this.colorEditText[i2].setHint("red");
                    } else if (i2 == 1) {
                        this.colorEditText[i2].setHint("green");
                    } else if (i2 == 2) {
                        this.colorEditText[i2].setHint("blue");
                    } else if (i2 == 3) {
                        this.colorEditText[i2].setHint("alpha");
                    }
                    this.colorEditText[i2].setImeOptions((i2 == 3 ? 6 : 5) | 268435456);
                    this.colorEditText[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                    this.linearLayout.addView(this.colorEditText[i2], LayoutHelper.createLinear(55, 36, 0.0f, 0.0f, i2 != 3 ? 16.0f : 0.0f, 0.0f));
                    this.colorEditText[i2].addTextChangedListener(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            int i3;
                            int i4;
                            int i5;
                            if (EditorAlert.this.ignoreTextChange) {
                                return;
                            }
                            EditorAlert.this.ignoreTextChange = true;
                            int iIntValue = Utilities.parseInt((CharSequence) editable.toString()).intValue();
                            if (iIntValue < 0) {
                                ColorPicker.this.colorEditText[i2].setText("0");
                                ColorPicker.this.colorEditText[i2].setSelection(ColorPicker.this.colorEditText[i2].length());
                                iIntValue = 0;
                            } else if (iIntValue > 255) {
                                ColorPicker.this.colorEditText[i2].setText("255");
                                ColorPicker.this.colorEditText[i2].setSelection(ColorPicker.this.colorEditText[i2].length());
                                iIntValue = 255;
                            }
                            int color = ColorPicker.this.getColor();
                            int i6 = i2;
                            if (i6 == 2) {
                                i3 = color & (-256);
                                i4 = iIntValue & 255;
                            } else if (i6 == 1) {
                                i3 = color & (-65281);
                                i4 = (iIntValue & 255) << 8;
                            } else {
                                if (i6 != 0) {
                                    if (i6 == 3) {
                                        i3 = color & 16777215;
                                        i4 = (iIntValue & 255) << 24;
                                    }
                                    ColorPicker.this.setColor(color);
                                    for (i5 = 0; i5 < ThemeEditorView.this.currentThemeDesription.size(); i5++) {
                                        ((ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i5)).setColor(ColorPicker.this.getColor(), false, true);
                                    }
                                    EditorAlert.this.ignoreTextChange = false;
                                }
                                i3 = color & (-16711681);
                                i4 = (iIntValue & 255) << 16;
                            }
                            color = i3 | i4;
                            ColorPicker.this.setColor(color);
                            while (i5 < ThemeEditorView.this.currentThemeDesription.size()) {
                                ((ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i5)).setColor(ColorPicker.this.getColor(), false, true);
                            }
                            EditorAlert.this.ignoreTextChange = false;
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }
                    });
                    this.colorEditText[i2].setOnEditorActionListener(new ColorPicker$$ExternalSyntheticLambda1(i));
                    i2++;
                }
            }

            private Bitmap createColorWheelBitmap(int i, int i2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[13];
                float[] fArr = {0.0f, 1.0f, 1.0f};
                for (int i3 = 0; i3 < 13; i3++) {
                    fArr[0] = ((i3 * 30) + 180) % 360;
                    iArr[i3] = Color.HSVToColor(fArr);
                }
                iArr[12] = iArr[0];
                float f = i / 2;
                float f2 = i2 / 2;
                this.colorWheelPaint.setShader(new ComposeShader(new SweepGradient(f, f2, iArr, (float[]) null), new RadialGradient(f, f2, this.colorWheelRadius, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER));
                new Canvas(bitmapCreateBitmap).drawCircle(f, f2, this.colorWheelRadius, this.colorWheelPaint);
                return bitmapCreateBitmap;
            }

            private void drawPointerArrow(Canvas canvas, int i, int i2, int i3) {
                int iDp = AndroidUtilities.dp(13.0f);
                this.circleDrawable.setBounds(i - iDp, i2 - iDp, i + iDp, iDp + i2);
                this.circleDrawable.draw(canvas);
                this.circlePaint.setColor(-1);
                float f = i;
                float f2 = i2;
                canvas.drawCircle(f, f2, AndroidUtilities.dp(11.0f), this.circlePaint);
                this.circlePaint.setColor(i3);
                canvas.drawCircle(f, f2, AndroidUtilities.dp(9.0f), this.circlePaint);
            }

            public static boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
            }

            private void startColorChange(boolean z) {
                if (EditorAlert.this.startedColorChange == z) {
                    return;
                }
                if (EditorAlert.this.colorChangeAnimation != null) {
                    EditorAlert.this.colorChangeAnimation.cancel();
                }
                EditorAlert.this.startedColorChange = z;
                EditorAlert.this.colorChangeAnimation = new AnimatorSet();
                EditorAlert.this.colorChangeAnimation.playTogether(ObjectAnimator.ofInt(((BottomSheet) EditorAlert.this).backDrawable, (Property<BottomSheet.SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, z ? 0 : 51), ObjectAnimator.ofFloat(((BottomSheet) EditorAlert.this).containerView, (Property<ViewGroup, Float>) View.ALPHA, z ? 0.2f : 1.0f));
                EditorAlert.this.colorChangeAnimation.setDuration(150L);
                EditorAlert.this.colorChangeAnimation.setInterpolator(this.decelerateInterpolator);
                EditorAlert.this.colorChangeAnimation.start();
            }

            public int getColor() {
                return (Color.HSVToColor(this.colorHSV) & 16777215) | (((int) (this.alpha * 255.0f)) << 24);
            }

            @Override
            public void onDraw(Canvas canvas) {
                int width = (getWidth() / 2) - (this.paramValueSliderWidth * 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
                Bitmap bitmap = this.colorWheelBitmap;
                int i = this.colorWheelRadius;
                canvas.drawBitmap(bitmap, width - i, height - i, (Paint) null);
                double radians = (float) Math.toRadians(this.colorHSV[0]);
                int i2 = ((int) ((-Math.cos(radians)) * ((double) this.colorHSV[1]) * ((double) this.colorWheelRadius))) + width;
                double d = -Math.sin(radians);
                float[] fArr = this.colorHSV;
                float f = fArr[1];
                int i3 = ((int) (d * ((double) f) * ((double) this.colorWheelRadius))) + height;
                float[] fArr2 = this.hsvTemp;
                fArr2[0] = fArr[0];
                fArr2[1] = f;
                fArr2[2] = 1.0f;
                drawPointerArrow(canvas, i2, i3, Color.HSVToColor(fArr2));
                int i4 = this.colorWheelRadius;
                int i5 = width + i4 + this.paramValueSliderWidth;
                int i6 = height - i4;
                int iDp = AndroidUtilities.dp(9.0f);
                int i7 = this.colorWheelRadius * 2;
                if (this.colorGradient == null) {
                    this.colorGradient = new LinearGradient(i5, i6, i5 + iDp, i6 + i7, new int[]{-16777216, Color.HSVToColor(this.hsvTemp)}, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.valueSliderPaint.setShader(this.colorGradient);
                float f2 = i6;
                float f3 = i6 + i7;
                canvas.drawRect(i5, f2, i5 + iDp, f3, this.valueSliderPaint);
                int i8 = iDp / 2;
                float[] fArr3 = this.colorHSV;
                float f4 = i7;
                drawPointerArrow(canvas, i5 + i8, (int) ((fArr3[2] * f4) + f2), Color.HSVToColor(fArr3));
                int i9 = (this.paramValueSliderWidth * 2) + i5;
                if (this.alphaGradient == null) {
                    int iHSVToColor = Color.HSVToColor(this.hsvTemp);
                    this.alphaGradient = new LinearGradient(i9, f2, i9 + iDp, f3, new int[]{iHSVToColor, iHSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.valueSliderPaint.setShader(this.alphaGradient);
                canvas.drawRect(i9, f2, iDp + i9, f3, this.valueSliderPaint);
                drawPointerArrow(canvas, i9 + i8, (int) DiffUtil.m(1.0f, this.alpha, f4, f2), (Color.HSVToColor(this.colorHSV) & 16777215) | (((int) (this.alpha * 255.0f)) << 24));
            }

            @Override
            public void onMeasure(int i, int i2) {
                int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                measureChild(this.linearLayout, i, i2);
                setMeasuredDimension(iMin, iMin);
            }

            @Override
            public void onSizeChanged(int i, int i2, int i3, int i4) {
                int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(20.0f, (i / 2) - (this.paramValueSliderWidth * 2), 1);
                this.colorWheelRadius = iM;
                int i5 = iM * 2;
                this.colorWheelBitmap = createColorWheelBitmap(i5, i5);
                this.colorGradient = null;
                this.alphaGradient = null;
            }

            @Override
            public boolean onTouchEvent(android.view.MotionEvent r18) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ThemeEditorView.EditorAlert.ColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
            }

            public void setColor(int i) {
                int iRed = Color.red(i);
                int iGreen = Color.green(i);
                int iBlue = Color.blue(i);
                int iAlpha = Color.alpha(i);
                if (!EditorAlert.this.ignoreTextChange) {
                    EditorAlert.this.ignoreTextChange = true;
                    this.colorEditText[0].setText("" + iRed);
                    this.colorEditText[1].setText("" + iGreen);
                    this.colorEditText[2].setText("" + iBlue);
                    this.colorEditText[3].setText("" + iAlpha);
                    for (int i2 = 0; i2 < 4; i2++) {
                        EditTextBoldCursor editTextBoldCursor = this.colorEditText[i2];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    EditorAlert.this.ignoreTextChange = false;
                }
                this.alphaGradient = null;
                this.colorGradient = null;
                this.alpha = iAlpha / 255.0f;
                Color.colorToHSV(i, this.colorHSV);
                invalidate();
            }
        }

        public class ListAdapter extends RecyclerListView.SelectionAdapter {
            private Context context;
            private int currentCount;
            private ArrayList<ArrayList<ThemeDescription>> items = new ArrayList<>();

            public ListAdapter(Context context, ArrayList<ThemeDescription> arrayList) {
                this.context = context;
                HashMap map = new HashMap();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ThemeDescription themeDescription = arrayList.get(i);
                    int i2 = themeDescription.currentKey;
                    ArrayList<ThemeDescription> arrayList2 = (ArrayList) map.get(Integer.valueOf(i2));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                        map.put(Integer.valueOf(i2), arrayList2);
                        this.items.add(arrayList2);
                    }
                    arrayList2.add(themeDescription);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    int i3 = Theme.key_windowBackgroundGray;
                    if (map.containsKey(Integer.valueOf(i3))) {
                        return;
                    }
                    ArrayList<ThemeDescription> arrayList3 = new ArrayList<>();
                    arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, i3));
                    this.items.add(arrayList3);
                }
            }

            public ArrayList<ThemeDescription> getItem(int i) {
                if (i < 0 || i >= this.items.size()) {
                    return null;
                }
                return this.items.get(i);
            }

            @Override
            public int getItemCount() {
                if (this.items.isEmpty()) {
                    return 0;
                }
                return this.items.size() + 1;
            }

            @Override
            public int getItemViewType(int i) {
                return i == 0 ? 1 : 0;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.getItemViewType() == 0) {
                    ThemeDescription themeDescription = this.items.get(i - 1).get(0);
                    int setColor = themeDescription.currentKey == Theme.key_chat_wallpaper ? 0 : themeDescription.getSetColor();
                    TextColorThemeCell textColorThemeCell = (TextColorThemeCell) viewHolder.itemView;
                    if (OKLCH.colorKeysMap == null) {
                        OKLCH.colorKeysMap = OKLCH.createColorKeysMap();
                    }
                    textColorThemeCell.textView.setText((String) OKLCH.colorKeysMap.get(themeDescription.currentKey));
                    textColorThemeCell.currentColor = setColor;
                    textColorThemeCell.setWillNotDraw(setColor == 0);
                    textColorThemeCell.invalidate();
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View textColorThemeCell;
                if (i != 0) {
                    textColorThemeCell = new View(this.context);
                    textColorThemeCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                } else {
                    textColorThemeCell = new TextColorThemeCell(this.context);
                    textColorThemeCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                }
                return new RecyclerListView.Holder(textColorThemeCell);
            }
        }

        public class SearchAdapter extends RecyclerListView.SelectionAdapter {
            private Context context;
            private int currentCount;
            private int lastSearchId;
            private String lastSearchText;
            private Runnable searchRunnable;
            private ArrayList<ArrayList<ThemeDescription>> searchResult = new ArrayList<>();
            private ArrayList<CharSequence> searchNames = new ArrayList<>();

            public SearchAdapter(Context context) {
                this.context = context;
            }

            public void lambda$updateSearchResults$0(int i, ArrayList arrayList, ArrayList arrayList2) {
                if (i != this.lastSearchId) {
                    return;
                }
                if (EditorAlert.this.listView.getAdapter() != EditorAlert.this.searchAdapter) {
                    EditorAlert editorAlert = EditorAlert.this;
                    editorAlert.topBeforeSwitch = editorAlert.getCurrentTop();
                    EditorAlert.this.listView.setAdapter(EditorAlert.this.searchAdapter);
                    EditorAlert.this.searchAdapter.notifyDataSetChanged();
                }
                boolean z = !this.searchResult.isEmpty() && arrayList.isEmpty();
                boolean z2 = this.searchResult.isEmpty() && arrayList.isEmpty();
                if (z) {
                    EditorAlert editorAlert2 = EditorAlert.this;
                    editorAlert2.topBeforeSwitch = editorAlert2.getCurrentTop();
                }
                this.searchResult = arrayList;
                this.searchNames = arrayList2;
                notifyDataSetChanged();
                if (!z2 && !z && EditorAlert.this.topBeforeSwitch > 0) {
                    EditorAlert.this.layoutManager.scrollToPositionWithOffset(0, -EditorAlert.this.topBeforeSwitch);
                    EditorAlert.this.topBeforeSwitch = -1000;
                }
                EditorAlert.this.searchEmptyView.showTextView();
            }

            public void lambda$searchDialogs$1(String str, int i) {
                try {
                    String lowerCase = str.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        this.lastSearchId = -1;
                        updateSearchResults(new ArrayList<>(), new ArrayList<>(), this.lastSearchId);
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i2 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i2];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList<ArrayList<ThemeDescription>> arrayList = new ArrayList<>();
                    ArrayList<CharSequence> arrayList2 = new ArrayList<>();
                    int size = EditorAlert.this.listAdapter.items.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ArrayList<ThemeDescription> arrayList3 = (ArrayList) EditorAlert.this.listAdapter.items.get(i3);
                        int i4 = arrayList3.get(0).currentKey;
                        if (OKLCH.colorKeysMap == null) {
                            OKLCH.colorKeysMap = OKLCH.createColorKeysMap();
                        }
                        String str2 = (String) OKLCH.colorKeysMap.get(i4);
                        String lowerCase2 = str2.toLowerCase();
                        for (int i5 = 0; i5 < i2; i5++) {
                            String str3 = strArr[i5];
                            if (lowerCase2.contains(str3)) {
                                arrayList.add(arrayList3);
                                arrayList2.add(generateSearchName(str2, str3));
                                break;
                            }
                        }
                    }
                    updateSearchResults(arrayList, arrayList2, i);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            private void updateSearchResults(ArrayList<ArrayList<ThemeDescription>> arrayList, ArrayList<CharSequence> arrayList2, int i) {
                AndroidUtilities.runOnUIThread(new ShareTopView$$ExternalSyntheticLambda3(this, i, arrayList, arrayList2, 15));
            }

            public CharSequence generateSearchName(String str, String str2) {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strTrim = str.trim();
                String lowerCase = strTrim.toLowerCase();
                int i = 0;
                while (true) {
                    int iIndexOf = lowerCase.indexOf(str2, i);
                    if (iIndexOf == -1) {
                        break;
                    }
                    int length = str2.length() + iIndexOf;
                    if (i != 0 && i != iIndexOf + 1) {
                        spannableStringBuilder.append((CharSequence) strTrim.substring(i, iIndexOf));
                    } else if (i == 0 && iIndexOf != 0) {
                        spannableStringBuilder.append((CharSequence) strTrim.substring(0, iIndexOf));
                    }
                    String strSubstring = strTrim.substring(iIndexOf, Math.min(strTrim.length(), length));
                    if (strSubstring.startsWith(" ")) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    String strTrim2 = strSubstring.trim();
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) strTrim2);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-11697229), length2, strTrim2.length() + length2, 33);
                    i = length;
                }
                if (i != -1 && i < strTrim.length()) {
                    spannableStringBuilder.append((CharSequence) strTrim.substring(i));
                }
                return spannableStringBuilder;
            }

            public ArrayList<ThemeDescription> getItem(int i) {
                if (i < 0 || i >= this.searchResult.size()) {
                    return null;
                }
                return this.searchResult.get(i);
            }

            @Override
            public int getItemCount() {
                if (this.searchResult.isEmpty()) {
                    return 0;
                }
                return this.searchResult.size() + 1;
            }

            @Override
            public int getItemViewType(int i) {
                return i == 0 ? 1 : 0;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.getItemViewType() == 0) {
                    int i2 = i - 1;
                    ThemeDescription themeDescription = this.searchResult.get(i2).get(0);
                    int setColor = themeDescription.currentKey == Theme.key_chat_wallpaper ? 0 : themeDescription.getSetColor();
                    TextColorThemeCell textColorThemeCell = (TextColorThemeCell) viewHolder.itemView;
                    textColorThemeCell.textView.setText(this.searchNames.get(i2));
                    textColorThemeCell.currentColor = setColor;
                    textColorThemeCell.setWillNotDraw(setColor == 0);
                    textColorThemeCell.invalidate();
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View textColorThemeCell;
                if (i != 0) {
                    textColorThemeCell = new View(this.context);
                    textColorThemeCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                } else {
                    textColorThemeCell = new TextColorThemeCell(this.context);
                    textColorThemeCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                }
                return new RecyclerListView.Holder(textColorThemeCell);
            }

            public void searchDialogs(String str) {
                if (str == null || !str.equals(this.lastSearchText)) {
                    this.lastSearchText = str;
                    if (this.searchRunnable != null) {
                        Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                        this.searchRunnable = null;
                    }
                    if (str != null && str.length() != 0) {
                        int i = this.lastSearchId + 1;
                        this.lastSearchId = i;
                        this.searchRunnable = new SlotsDrawable$$ExternalSyntheticLambda9(this, str, i, 23);
                        Utilities.searchQueue.postRunnable(this.searchRunnable, 300L);
                        return;
                    }
                    this.searchResult.clear();
                    EditorAlert editorAlert = EditorAlert.this;
                    editorAlert.topBeforeSwitch = editorAlert.getCurrentTop();
                    this.lastSearchId = -1;
                    notifyDataSetChanged();
                }
            }
        }

        public class SearchField extends FrameLayout {
            private View backgroundView;
            private ImageView clearSearchImageView;
            private EditTextBoldCursor searchEditText;

            public SearchField(Context context) {
                super(context);
                View view = new View(context);
                view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), -854795));
                addView(view, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView.setScaleType(scaleType);
                imageView.setImageResource(R.drawable.smiles_inputsearch);
                imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
                addView(imageView, LayoutHelper.createFrame(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                this.clearSearchImageView = imageView2;
                imageView2.setScaleType(scaleType);
                ImageView imageView3 = this.clearSearchImageView;
                CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2() {
                    @Override
                    public int getCurrentColor() {
                        return -6182737;
                    }
                };
                imageView3.setImageDrawable(closeProgressDrawable2);
                closeProgressDrawable2.setSide(AndroidUtilities.dp(7.0f));
                this.clearSearchImageView.setScaleX(0.1f);
                this.clearSearchImageView.setScaleY(0.1f);
                this.clearSearchImageView.setAlpha(0.0f);
                addView(this.clearSearchImageView, LayoutHelper.createFrame(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
                this.clearSearchImageView.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 8));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                    @Override
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setLocation(motionEventObtain.getRawX(), motionEventObtain.getRawY() - ((BottomSheet) EditorAlert.this).containerView.getTranslationY());
                        EditorAlert.this.listView.dispatchTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        return super.dispatchTouchEvent(motionEvent);
                    }
                };
                this.searchEditText = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 16.0f);
                this.searchEditText.setHintTextColor(-6774617);
                this.searchEditText.setTextColor(-14540254);
                this.searchEditText.setBackgroundDrawable(null);
                this.searchEditText.setPadding(0, 0, 0, 0);
                this.searchEditText.setMaxLines(1);
                this.searchEditText.setLines(1);
                this.searchEditText.setSingleLine(true);
                this.searchEditText.setImeOptions(268435459);
                this.searchEditText.setHint(LocaleController.getString(R.string.Search));
                this.searchEditText.setCursorColor(-11491093);
                this.searchEditText.setCursorSize(AndroidUtilities.dp(20.0f));
                this.searchEditText.setCursorWidth(1.5f);
                addView(this.searchEditText, LayoutHelper.createFrame(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
                this.searchEditText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        boolean z = SearchField.this.searchEditText.length() > 0;
                        if (z != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                            SearchField.this.clearSearchImageView.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).start();
                        }
                        String string = SearchField.this.searchEditText.getText().toString();
                        if (string.length() != 0) {
                            if (EditorAlert.this.searchEmptyView != null) {
                                EditorAlert.this.searchEmptyView.setText(LocaleController.getString(R.string.NoResult));
                            }
                        } else if (EditorAlert.this.listView.getAdapter() != EditorAlert.this.listAdapter) {
                            int currentTop = EditorAlert.this.getCurrentTop();
                            EditorAlert.this.searchEmptyView.setText(LocaleController.getString(R.string.NoChats));
                            EditorAlert.this.searchEmptyView.showTextView();
                            EditorAlert.this.listView.setAdapter(EditorAlert.this.listAdapter);
                            EditorAlert.this.listAdapter.notifyDataSetChanged();
                            if (currentTop > 0) {
                                EditorAlert.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                            }
                        }
                        if (EditorAlert.this.searchAdapter != null) {
                            EditorAlert.this.searchAdapter.searchDialogs(string);
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }
                });
                this.searchEditText.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(this, 1));
            }

            public void lambda$new$0(View view) {
                this.searchEditText.setText("");
                AndroidUtilities.showKeyboard(this.searchEditText);
            }

            public boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(this.searchEditText);
                return false;
            }

            public void hideKeyboard() {
                AndroidUtilities.hideKeyboard(this.searchEditText);
            }

            @Override
            public void requestDisallowInterceptTouchEvent(boolean z) {
                super.requestDisallowInterceptTouchEvent(z);
            }

            public void showKeyboard() {
                this.searchEditText.requestFocus();
                AndroidUtilities.showKeyboard(this.searchEditText);
            }
        }

        public EditorAlert(Context context, ArrayList<ThemeDescription> arrayList) {
            super(context, true, false, null);
            this.shadow = new View[2];
            this.shadowAnimation = new AnimatorSet[2];
            this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            FrameLayout frameLayout = new FrameLayout(context) {
                private boolean ignoreLayout = false;
                private RectF rect1 = new RectF();
                private Boolean statusBarOpen;

                private void updateLightStatusBar(boolean z) {
                    Boolean bool = this.statusBarOpen;
                    if (bool == null || bool.booleanValue() != z) {
                        boolean z2 = AndroidUtilities.computePerceivedBrightness(EditorAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                        boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(EditorAlert.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                        this.statusBarOpen = Boolean.valueOf(z);
                        if (!z) {
                            z2 = z3;
                        }
                        AndroidUtilities.setLightStatusBar(EditorAlert.this.getWindow(), z2);
                    }
                }

                @Override
                public void onDraw(Canvas canvas) {
                    float fMin;
                    int iMin;
                    int iDp = AndroidUtilities.dp(6.0f) + (EditorAlert.this.scrollOffsetY - ((BottomSheet) EditorAlert.this).backgroundPaddingTop);
                    int iDp2 = (EditorAlert.this.scrollOffsetY - ((BottomSheet) EditorAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
                    int iDp3 = ((BottomSheet) EditorAlert.this).backgroundPaddingTop + AndroidUtilities.dp(30.0f) + getMeasuredHeight();
                    if (!((BottomSheet) EditorAlert.this).isFullscreen) {
                        int i = AndroidUtilities.statusBarHeight;
                        iDp2 += i;
                        iDp += i;
                        iDp3 -= i;
                        int i2 = ((BottomSheet) EditorAlert.this).backgroundPaddingTop + iDp2;
                        int i3 = AndroidUtilities.statusBarHeight;
                        int i4 = i3 * 2;
                        if (i2 < i4) {
                            int iMin2 = Math.min(i3, (i4 - iDp2) - ((BottomSheet) EditorAlert.this).backgroundPaddingTop);
                            iDp2 -= iMin2;
                            iDp3 += iMin2;
                            fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
                        } else {
                            fMin = 1.0f;
                        }
                        int i5 = ((BottomSheet) EditorAlert.this).backgroundPaddingTop + iDp2;
                        int i6 = AndroidUtilities.statusBarHeight;
                        iMin = i5 < i6 ? Math.min(i6, (i6 - iDp2) - ((BottomSheet) EditorAlert.this).backgroundPaddingTop) : 0;
                        EditorAlert.this.shadowDrawable.setBounds(0, iDp2, getMeasuredWidth(), iDp3);
                        EditorAlert.this.shadowDrawable.draw(canvas);
                        if (fMin != 1.0f) {
                            Theme.dialogs_onlineCirclePaint.setColor(-1);
                            this.rect1.set(((BottomSheet) EditorAlert.this).backgroundPaddingLeft, ((BottomSheet) EditorAlert.this).backgroundPaddingTop + iDp2, getMeasuredWidth() - ((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) EditorAlert.this).backgroundPaddingTop + iDp2);
                            canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                        }
                        int iDp4 = AndroidUtilities.dp(36.0f);
                        this.rect1.set((getMeasuredWidth() - iDp4) / 2, iDp, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + iDp);
                        Theme.dialogs_onlineCirclePaint.setColor(-1973016);
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (EditorAlert.this.listView.getAlpha() * 255.0f));
                        canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                        if (iMin > 0) {
                            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                            canvas.drawRect(((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                        }
                        updateLightStatusBar(iMin > AndroidUtilities.statusBarHeight / 2);
                    }
                    fMin = 1.0f;
                    EditorAlert.this.shadowDrawable.setBounds(0, iDp2, getMeasuredWidth(), iDp3);
                    EditorAlert.this.shadowDrawable.draw(canvas);
                    if (fMin != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(-1);
                        this.rect1.set(((BottomSheet) EditorAlert.this).backgroundPaddingLeft, ((BottomSheet) EditorAlert.this).backgroundPaddingTop + iDp2, getMeasuredWidth() - ((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) EditorAlert.this).backgroundPaddingTop + iDp2);
                        canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                    }
                    int iDp5 = AndroidUtilities.dp(36.0f);
                    this.rect1.set((getMeasuredWidth() - iDp5) / 2, iDp, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + iDp);
                    Theme.dialogs_onlineCirclePaint.setColor(-1973016);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (EditorAlert.this.listView.getAlpha() * 255.0f));
                    canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    if (iMin > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        canvas.drawRect(((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                    updateLightStatusBar(iMin > AndroidUtilities.statusBarHeight / 2);
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0 || EditorAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= EditorAlert.this.scrollOffsetY) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    EditorAlert.this.lambda$showGiftOfferSheet$15();
                    return true;
                }

                @Override
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    super.onLayout(z, i, i2, i3, i4);
                    EditorAlert.this.updateLayout();
                }

                @Override
                public void onMeasure(int i, int i2) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    if (!((BottomSheet) EditorAlert.this).isFullscreen) {
                        this.ignoreLayout = true;
                        setPadding(((BottomSheet) EditorAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) EditorAlert.this).backgroundPaddingLeft, 0);
                        this.ignoreLayout = false;
                    }
                    int iDp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
                    if (EditorAlert.this.listView.getPaddingTop() != iDp) {
                        this.ignoreLayout = true;
                        EditorAlert.this.listView.getPaddingTop();
                        EditorAlert.this.listView.setPadding(0, iDp, 0, AndroidUtilities.dp(48.0f));
                        if (EditorAlert.this.colorPicker.getVisibility() == 0) {
                            EditorAlert editorAlert = EditorAlert.this;
                            editorAlert.setScrollOffsetY(editorAlert.listView.getPaddingTop());
                            EditorAlert.this.previousScrollPosition = 0;
                        }
                        this.ignoreLayout = false;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    return !EditorAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.containerView = frameLayout;
            frameLayout.setWillNotDraw(false);
            ViewGroup viewGroup = this.containerView;
            int i = this.backgroundPaddingLeft;
            viewGroup.setPadding(i, 0, i, 0);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.frameLayout = frameLayout2;
            frameLayout2.setBackgroundColor(-1);
            SearchField searchField = new SearchField(context);
            this.searchField = searchField;
            this.frameLayout.addView(searchField, LayoutHelper.createFrame(-1, -1, 51));
            RecyclerListView recyclerListView = new RecyclerListView(context) {
                @Override
                public boolean allowSelectChildAtPosition(float f, float f2) {
                    return f2 >= ((float) ((AndroidUtilities.dp(48.0f) + EditorAlert.this.scrollOffsetY) + AndroidUtilities.statusBarHeight));
                }
            };
            this.listView = recyclerListView;
            recyclerListView.setSelectorDrawableColor(251658240);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
            this.listView.setClipToPadding(false);
            RecyclerListView recyclerListView2 = this.listView;
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            recyclerListView2.setLayoutManager(linearLayoutManager);
            this.listView.setHorizontalScrollBarEnabled(false);
            this.listView.setVerticalScrollBarEnabled(false);
            this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
            RecyclerListView recyclerListView3 = this.listView;
            ListAdapter listAdapter = new ListAdapter(context, arrayList);
            this.listAdapter = listAdapter;
            recyclerListView3.setAdapter(listAdapter);
            this.searchAdapter = new SearchAdapter(context);
            this.listView.setGlowColor(-657673);
            this.listView.lambda$onCellEnter$52(null);
            this.listView.setLayoutAnimation(null);
            this.listView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 19));
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    EditorAlert.this.updateLayout();
                }
            });
            EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
            this.searchEmptyView = emptyTextProgressView;
            emptyTextProgressView.setShowAtCenter(true);
            this.searchEmptyView.showTextView();
            this.searchEmptyView.setText(LocaleController.getString(R.string.NoResult));
            this.listView.setEmptyView(this.searchEmptyView);
            this.containerView.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
            layoutParams.topMargin = AndroidUtilities.dp(58.0f);
            this.shadow[0] = new View(context);
            this.shadow[0].setBackgroundColor(301989888);
            this.shadow[0].setAlpha(0.0f);
            this.shadow[0].setTag(1);
            this.containerView.addView(this.shadow[0], layoutParams);
            this.containerView.addView(this.frameLayout, LayoutHelper.createFrame(-1, 58, 51));
            ColorPicker colorPicker = new ColorPicker(context);
            this.colorPicker = colorPicker;
            colorPicker.setVisibility(8);
            this.containerView.addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
            layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
            this.shadow[1] = new View(context);
            this.shadow[1].setBackgroundColor(301989888);
            this.containerView.addView(this.shadow[1], layoutParams2);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.bottomSaveLayout = frameLayout3;
            frameLayout3.setBackgroundColor(-1);
            this.containerView.addView(this.bottomSaveLayout, LayoutHelper.createFrame(-1, 48, 83));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-15095832);
            textView.setGravity(17);
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView.setText(LocaleController.getString(R.string.CloseEditor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            this.bottomSaveLayout.addView(textView, LayoutHelper.createFrame(-2, -1, 51));
            final int i2 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 3:
                            this.f$0.lambda$new$4(view);
                            break;
                        default:
                            this.f$0.lambda$new$5(view);
                            break;
                    }
                }
            });
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(-15095832);
            textView2.setGravity(17);
            textView2.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView2.setText(LocaleController.getString(R.string.SaveTheme).toUpperCase());
            textView2.setTypeface(AndroidUtilities.bold());
            this.bottomSaveLayout.addView(textView2, LayoutHelper.createFrame(-2, -1, 53));
            final int i3 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 3:
                            this.f$0.lambda$new$4(view);
                            break;
                        default:
                            this.f$0.lambda$new$5(view);
                            break;
                    }
                }
            });
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.bottomLayout = frameLayout4;
            frameLayout4.setVisibility(8);
            this.bottomLayout.setBackgroundColor(-1);
            this.containerView.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 83));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(-15095832);
            textView3.setGravity(17);
            textView3.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView3.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView3.setTypeface(AndroidUtilities.bold());
            this.bottomLayout.addView(textView3, LayoutHelper.createFrame(-2, -1, 51));
            final int i4 = 2;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 3:
                            this.f$0.lambda$new$4(view);
                            break;
                        default:
                            this.f$0.lambda$new$5(view);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            this.bottomLayout.addView(linearLayout, LayoutHelper.createFrame(-2, -1, 53));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-15095832);
            textView4.setGravity(17);
            textView4.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView4.setText(LocaleController.getString(R.string.Default).toUpperCase());
            textView4.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView4, LayoutHelper.createFrame(-2, -1, 51));
            final int i5 = 3;
            textView4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 3:
                            this.f$0.lambda$new$4(view);
                            break;
                        default:
                            this.f$0.lambda$new$5(view);
                            break;
                    }
                }
            });
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 14.0f);
            textView5.setTextColor(-15095832);
            textView5.setGravity(17);
            textView5.setBackgroundDrawable(Theme.createSelectorDrawable(788529152, 0, -1));
            textView5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            textView5.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, LayoutHelper.createFrame(-2, -1, 51));
            final int i6 = 4;
            textView5.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeEditorView.EditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) throws Throwable {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 3:
                            this.f$0.lambda$new$4(view);
                            break;
                        default:
                            this.f$0.lambda$new$5(view);
                            break;
                    }
                }
            });
        }

        public int getCurrentTop() {
            if (this.listView.getChildCount() == 0) {
                return -1000;
            }
            int top = 0;
            View childAt = this.listView.getChildAt(0);
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
            if (holder == null) {
                return -1000;
            }
            int paddingTop = this.listView.getPaddingTop();
            if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
                top = childAt.getTop();
            }
            return paddingTop - top;
        }

        public void lambda$new$0(View view, int i) throws Throwable {
            if (i == 0) {
                return;
            }
            RecyclerView.Adapter adapter = this.listView.getAdapter();
            ListAdapter listAdapter = this.listAdapter;
            if (adapter == listAdapter) {
                ThemeEditorView.this.currentThemeDesription = listAdapter.getItem(i - 1);
            } else {
                ThemeEditorView.this.currentThemeDesription = this.searchAdapter.getItem(i - 1);
            }
            ThemeEditorView.this.currentThemeDesriptionPosition = i;
            for (int i2 = 0; i2 < ThemeEditorView.this.currentThemeDesription.size(); i2++) {
                ThemeDescription themeDescription = (ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i2);
                int i3 = themeDescription.currentKey;
                if (i3 == Theme.key_chat_wallpaper) {
                    ThemeEditorView.this.wallpaperUpdater.showAlert(true);
                    return;
                }
                int color = Theme.getColor(themeDescription.previousIsDefault, i3, false);
                themeDescription.previousColor = color;
                themeDescription.currentColor = color;
                if (i2 == 0) {
                    this.colorPicker.setColor(color);
                }
            }
            setColorPickerVisible(true);
        }

        public void lambda$new$1(View view) {
            lambda$showGiftOfferSheet$15();
        }

        public void lambda$new$2(View view) throws Throwable {
            Theme.saveCurrentTheme(ThemeEditorView.this.themeInfo, true, false, false);
            setOnDismissListener((DialogInterface.OnDismissListener) null);
            lambda$showGiftOfferSheet$15();
            ThemeEditorView.this.close();
        }

        public void lambda$new$3(View view) throws Throwable {
            for (int i = 0; i < ThemeEditorView.this.currentThemeDesription.size(); i++) {
                ThemeDescription themeDescription = (ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i);
                themeDescription.setColor(themeDescription.previousColor, themeDescription.previousIsDefault[0], true);
            }
            setColorPickerVisible(false);
        }

        public void lambda$new$4(View view) throws Throwable {
            for (int i = 0; i < ThemeEditorView.this.currentThemeDesription.size(); i++) {
                ThemeDescription themeDescription = (ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i);
                themeDescription.setColor(Theme.getDefaultColor(themeDescription.currentKey), true, true);
            }
            setColorPickerVisible(false);
        }

        public void lambda$new$5(View view) throws Throwable {
            setColorPickerVisible(false);
        }

        private void runShadowAnimation(final int i, final boolean z) {
            if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
                return;
            }
            this.shadow[i].setTag(z ? null : 1);
            if (z) {
                this.shadow[i].setVisibility(0);
            }
            AnimatorSet animatorSet = this.shadowAnimation[i];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.shadowAnimation[i] = new AnimatorSet();
            this.shadowAnimation[i].playTogether(ObjectAnimator.ofFloat(this.shadow[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.shadowAnimation[i].setDuration(150L);
            this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    if (EditorAlert.this.shadowAnimation[i] == null || !EditorAlert.this.shadowAnimation[i].equals(animator)) {
                        return;
                    }
                    EditorAlert.this.shadowAnimation[i] = null;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (EditorAlert.this.shadowAnimation[i] == null || !EditorAlert.this.shadowAnimation[i].equals(animator)) {
                        return;
                    }
                    if (!z) {
                        EditorAlert.this.shadow[i].setVisibility(4);
                    }
                    EditorAlert.this.shadowAnimation[i] = null;
                }
            });
            this.shadowAnimation[i].start();
        }

        public void setColorPickerVisible(boolean z) throws Throwable {
            ?? r2;
            if (z) {
                this.animationInProgress = true;
                this.colorPicker.setVisibility(0);
                this.bottomLayout.setVisibility(0);
                this.colorPicker.setAlpha(0.0f);
                this.bottomLayout.setAlpha(0.0f);
                this.previousScrollPosition = this.scrollOffsetY;
                AnimatorSet animatorSet = new AnimatorSet();
                ColorPicker colorPicker = this.colorPicker;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(colorPicker, (Property<ColorPicker, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.bottomLayout, (Property<FrameLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.listView, (Property<RecyclerListView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.frameLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.shadow[0], (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.searchEmptyView, (Property<EmptyTextProgressView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.bottomSaveLayout, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.listView.getPaddingTop()));
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(ThemeEditorView.this.decelerateInterpolator);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EditorAlert.this.listView.setVisibility(4);
                        EditorAlert.this.searchField.setVisibility(4);
                        EditorAlert.this.bottomSaveLayout.setVisibility(4);
                        EditorAlert.this.animationInProgress = false;
                    }
                });
                animatorSet.start();
                return;
            }
            if (ThemeEditorView.this.parentActivity != null) {
                r2 = 0;
                ((LaunchActivity) ThemeEditorView.this.parentActivity).rebuildAllFragments(false);
            } else {
                r2 = 0;
            }
            Theme.saveCurrentTheme(ThemeEditorView.this.themeInfo, r2, r2, r2);
            if (this.listView.getAdapter() == this.listAdapter) {
                AndroidUtilities.hideKeyboard(getCurrentFocus());
            }
            this.animationInProgress = true;
            this.listView.setVisibility(r2);
            this.bottomSaveLayout.setVisibility(r2);
            this.searchField.setVisibility(r2);
            this.listView.setAlpha(0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ColorPicker colorPicker2 = this.colorPicker;
            Property property2 = View.ALPHA;
            float[] fArr = new float[1];
            fArr[r2] = 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(colorPicker2, (Property<ColorPicker, Float>) property2, fArr);
            FrameLayout frameLayout = this.bottomLayout;
            float[] fArr2 = new float[1];
            fArr2[r2] = 0.0f;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, fArr2);
            RecyclerListView recyclerListView = this.listView;
            float[] fArr3 = new float[1];
            fArr3[r2] = 1.0f;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property2, fArr3);
            FrameLayout frameLayout2 = this.frameLayout;
            float[] fArr4 = new float[1];
            fArr4[r2] = 1.0f;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, fArr4);
            View view = this.shadow[r2];
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, view.getTag() == null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.searchEmptyView, (Property<EmptyTextProgressView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.bottomSaveLayout, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofInt(this, "scrollOffsetY", this.previousScrollPosition));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(ThemeEditorView.this.decelerateInterpolator);
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (EditorAlert.this.listView.getAdapter() == EditorAlert.this.searchAdapter) {
                        EditorAlert.this.searchField.showKeyboard();
                    }
                    EditorAlert.this.colorPicker.setVisibility(8);
                    EditorAlert.this.bottomLayout.setVisibility(8);
                    EditorAlert.this.animationInProgress = false;
                }
            });
            animatorSet2.start();
            this.listView.getAdapter().lambda$onBindViewHolder$31(ThemeEditorView.this.currentThemeDesriptionPosition);
        }

        public void updateLayout() {
            if (this.listView.getChildCount() <= 0 || this.listView.getVisibility() != 0 || this.animationInProgress) {
                return;
            }
            int i = 0;
            View childAt = this.listView.getChildAt(0);
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
            int paddingTop = (this.listView.getVisibility() != 0 || this.animationInProgress) ? this.listView.getPaddingTop() : childAt.getTop() - AndroidUtilities.dp(8.0f);
            if (paddingTop <= (-AndroidUtilities.dp(1.0f)) || holder == null || holder.getAdapterPosition() != 0) {
                runShadowAnimation(0, true);
            } else {
                runShadowAnimation(0, false);
                i = paddingTop;
            }
            if (this.scrollOffsetY != i) {
                setScrollOffsetY(i);
            }
        }

        @Override
        public boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public void dismissInternal() {
            super.dismissInternal();
            if (this.searchField.searchEditText.isFocused()) {
                AndroidUtilities.hideKeyboard(this.searchField.searchEditText);
            }
        }

        public int getScrollOffsetY() {
            return this.scrollOffsetY;
        }

        @Override
        public void setLastVisible(boolean z) {
        }

        public void setScrollOffsetY(int i) {
            RecyclerListView recyclerListView = this.listView;
            this.scrollOffsetY = i;
            recyclerListView.setTopGlowOffset(i);
            this.frameLayout.setTranslationY(this.scrollOffsetY);
            this.colorPicker.setTranslationY(this.scrollOffsetY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY);
            this.containerView.invalidate();
        }
    }

    public void animateToBoundsMaybe() {
        float f;
        ArrayList arrayList;
        boolean z;
        AnimatorSet animatorSet;
        int i;
        float f2;
        int sideCoord = getSideCoord(true, 0, 0.0f, this.editorWidth);
        int sideCoord2 = getSideCoord(true, 1, 0.0f, this.editorWidth);
        int sideCoord3 = getSideCoord(false, 0, 0.0f, this.editorHeight);
        int sideCoord4 = getSideCoord(false, 1, 0.0f, this.editorHeight);
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        int iDp = AndroidUtilities.dp(20.0f);
        if (Math.abs(sideCoord - this.windowLayoutParams.x) <= iDp || ((i = this.windowLayoutParams.x) < 0 && i > (-this.editorWidth) / 4)) {
            f = 0.0f;
            ArrayList arrayList2 = new ArrayList();
            editorEdit.putInt("sidex", 0);
            if (this.windowView.getAlpha() != 1.0f) {
                arrayList2.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            }
            arrayList2.add(ObjectAnimator.ofInt(this, "x", sideCoord));
            arrayList = arrayList2;
        } else {
            if (Math.abs(sideCoord2 - i) > iDp) {
                int i2 = this.windowLayoutParams.x;
                int i3 = AndroidUtilities.displaySize.x;
                f = 0.0f;
                int i4 = this.editorWidth;
                f2 = 1.0f;
                if (i2 <= i3 - i4 || i2 >= i3 - ((i4 / 4) * 3)) {
                    if (this.windowView.getAlpha() != 1.0f) {
                        arrayList = new ArrayList();
                        if (this.windowLayoutParams.x < 0) {
                            arrayList.add(ObjectAnimator.ofInt(this, "x", -this.editorWidth));
                        } else {
                            arrayList.add(ObjectAnimator.ofInt(this, "x", AndroidUtilities.displaySize.x));
                        }
                        z = true;
                    } else {
                        editorEdit.putFloat("px", (this.windowLayoutParams.x - sideCoord) / (sideCoord2 - sideCoord));
                        editorEdit.putInt("sidex", 2);
                        arrayList = null;
                    }
                    if (!z) {
                        if (Math.abs(sideCoord3 - this.windowLayoutParams.y) > iDp || this.windowLayoutParams.y <= ActionBar.getCurrentActionBarHeight()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            editorEdit.putInt("sidey", 0);
                            arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord3));
                        } else if (Math.abs(sideCoord4 - this.windowLayoutParams.y) <= iDp) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            editorEdit.putInt("sidey", 1);
                            arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord4));
                        } else {
                            editorEdit.putFloat("py", (this.windowLayoutParams.y - sideCoord3) / (sideCoord4 - sideCoord3));
                            editorEdit.putInt("sidey", 2);
                        }
                        editorEdit.commit();
                    }
                    if (arrayList != null) {
                        if (this.decelerateInterpolator == null) {
                            this.decelerateInterpolator = new DecelerateInterpolator();
                        }
                        animatorSet = new AnimatorSet();
                        animatorSet.setInterpolator(this.decelerateInterpolator);
                        animatorSet.setDuration(150L);
                        if (z) {
                            arrayList.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, f));
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) throws Throwable {
                                    Theme.saveCurrentTheme(ThemeEditorView.this.themeInfo, true, false, false);
                                    ThemeEditorView.this.destroy();
                                }
                            });
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.start();
                    }
                }
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            arrayList = new ArrayList();
            editorEdit.putInt("sidex", 1);
            if (this.windowView.getAlpha() != f2) {
                arrayList.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, f2));
            }
            arrayList.add(ObjectAnimator.ofInt(this, "x", sideCoord2));
        }
        z = false;
        if (!z) {
            if (Math.abs(sideCoord3 - this.windowLayoutParams.y) > iDp) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorEdit.putInt("sidey", 0);
                arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord3));
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorEdit.putInt("sidey", 0);
                arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord3));
            }
            editorEdit.commit();
        }
        if (arrayList != null) {
            if (this.decelerateInterpolator == null) {
                this.decelerateInterpolator = new DecelerateInterpolator();
            }
            animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(this.decelerateInterpolator);
            animatorSet.setDuration(150L);
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, f));
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) throws Throwable {
                        Theme.saveCurrentTheme(ThemeEditorView.this.themeInfo, true, false, false);
                        ThemeEditorView.this.destroy();
                    }
                });
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
    }

    public static ThemeEditorView getInstance() {
        return Instance;
    }

    private static int getSideCoord(boolean z, int i, float f, int i2) {
        int i3;
        int iDp;
        if (z) {
            i3 = AndroidUtilities.displaySize.x;
        } else {
            i3 = AndroidUtilities.displaySize.y - i2;
            i2 = ActionBar.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            iDp = AndroidUtilities.dp(10.0f);
        } else {
            iDp = i == 1 ? i4 - AndroidUtilities.dp(10.0f) : Math.round((i4 - AndroidUtilities.dp(20.0f)) * f) + AndroidUtilities.dp(10.0f);
        }
        return !z ? ActionBar.getCurrentActionBarHeight() + iDp : iDp;
    }

    public void hide() {
        if (this.parentActivity == null) {
            return;
        }
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_Y, 1.0f, 0.0f));
            animatorSet.setInterpolator(this.decelerateInterpolator);
            animatorSet.setDuration(150L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ThemeEditorView.this.windowView != null) {
                        ThemeEditorView.this.windowView.setBackground(null);
                        ThemeEditorView.this.windowManager.removeView(ThemeEditorView.this.windowView);
                    }
                }
            });
            animatorSet.start();
            this.hidden = true;
        } catch (Exception unused) {
        }
    }

    private void showWithAnimation() {
        this.windowView.setBackgroundResource(R.drawable.theme_picker);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f));
        animatorSet.setInterpolator(this.decelerateInterpolator);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    public void close() {
        try {
            this.windowManager.removeView(this.windowView);
        } catch (Exception unused) {
        }
        this.parentActivity = null;
    }

    public void destroy() {
        FrameLayout frameLayout;
        this.wallpaperUpdater.cleanup();
        if (this.parentActivity == null || (frameLayout = this.windowView) == null) {
            return;
        }
        try {
            this.windowManager.removeViewImmediate(frameLayout);
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
        try {
            EditorAlert editorAlert = this.editorAlert;
            if (editorAlert != null) {
                editorAlert.lambda$showGiftOfferSheet$15();
                this.editorAlert = null;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.parentActivity = null;
        Instance = null;
    }

    public int getX() {
        return this.windowLayoutParams.x;
    }

    public int getY() {
        return this.windowLayoutParams.y;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        WallpaperUpdater wallpaperUpdater = this.wallpaperUpdater;
        if (wallpaperUpdater != null) {
            wallpaperUpdater.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged() {
        int i = this.preferences.getInt("sidex", 1);
        int i2 = this.preferences.getInt("sidey", 0);
        float f = this.preferences.getFloat("px", 0.0f);
        float f2 = this.preferences.getFloat("py", 0.0f);
        this.windowLayoutParams.x = getSideCoord(true, i, f, this.editorWidth);
        this.windowLayoutParams.y = getSideCoord(false, i2, f2, this.editorHeight);
        try {
            if (this.windowView.getParent() != null) {
                this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        layoutParams.x = i;
        this.windowManager.updateViewLayout(this.windowView, layoutParams);
    }

    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        layoutParams.y = i;
        this.windowManager.updateViewLayout(this.windowView, layoutParams);
    }

    public void show(Activity activity, Theme.ThemeInfo themeInfo) {
        if (Instance != null) {
            Instance.destroy();
        }
        this.hidden = false;
        this.themeInfo = themeInfo;
        this.windowView = new AnonymousClass1(activity);
        this.windowManager = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        this.preferences = sharedPreferences;
        int i = sharedPreferences.getInt("sidex", 1);
        int i2 = this.preferences.getInt("sidey", 0);
        float f = this.preferences.getFloat("px", 0.0f);
        float f2 = this.preferences.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.windowLayoutParams = layoutParams;
            int i3 = this.editorWidth;
            layoutParams.width = i3;
            layoutParams.height = this.editorHeight;
            layoutParams.x = getSideCoord(true, i, f, i3);
            this.windowLayoutParams.y = getSideCoord(false, i2, f2, this.editorHeight);
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, layoutParams2);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            this.wallpaperUpdater = new WallpaperUpdater(activity, null, new WallpaperUpdater.WallpaperUpdaterDelegate() {
                @Override
                public void didSelectWallpaper(File file, Bitmap bitmap, boolean z) throws Throwable {
                    Theme.ThemeInfo themeInfo2 = ThemeEditorView.this.themeInfo;
                    Theme.currentColors.delete(Theme.key_chat_wallpaper);
                    Theme.currentColors.delete(Theme.key_chat_wallpaper_gradient_to1);
                    Theme.currentColors.delete(Theme.key_chat_wallpaper_gradient_to2);
                    Theme.currentColors.delete(Theme.key_chat_wallpaper_gradient_to3);
                    Theme.currentColors.delete(Theme.key_chat_wallpaper_gradient_rotation);
                    Theme.themedWallpaperLink = null;
                    themeInfo2.setOverrideWallpaper(null);
                    if (bitmap == null) {
                        Theme.themedWallpaper = null;
                        Theme.wallpaper = null;
                        Theme.saveCurrentTheme(themeInfo2, false, false, false);
                        Theme.reloadWallpaper(true);
                        return;
                    }
                    Theme.themedWallpaper = new BitmapDrawable(bitmap);
                    Theme.saveCurrentTheme(themeInfo2, false, false, false);
                    int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(Theme.themedWallpaper);
                    int i4 = iArrCalcDrawableColor[0];
                    Theme.serviceMessageColorBackup = i4;
                    Theme.serviceMessageColor = i4;
                    int i5 = iArrCalcDrawableColor[1];
                    Theme.serviceSelectedMessageColorBackup = i5;
                    Theme.serviceSelectedMessageColor = i5;
                    Drawable drawable = Theme.wallpaper;
                    if (drawable != null) {
                        Theme.applyChatServiceMessageColor(drawable);
                    }
                    Theme.applyChatMessageSelectedBackgroundColor(Theme.wallpaper);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                }

                @Override
                public void needOpenColorPicker() throws Throwable {
                    for (int i4 = 0; i4 < ThemeEditorView.this.currentThemeDesription.size(); i4++) {
                        ThemeDescription themeDescription = (ThemeDescription) ThemeEditorView.this.currentThemeDesription.get(i4);
                        int color = Theme.getColor(themeDescription.previousIsDefault, themeDescription.currentKey, false);
                        themeDescription.previousColor = color;
                        themeDescription.currentColor = color;
                        if (i4 == 0) {
                            ThemeEditorView.this.editorAlert.colorPicker.setColor(themeDescription.currentColor);
                        }
                    }
                    ThemeEditorView.this.editorAlert.setColorPickerVisible(true);
                }
            });
            Instance = this;
            this.parentActivity = activity;
            showWithAnimation();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void show() {
        if (this.parentActivity == null) {
            return;
        }
        AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
        try {
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            this.hidden = false;
            showWithAnimation();
        } catch (Exception unused) {
        }
    }
}
