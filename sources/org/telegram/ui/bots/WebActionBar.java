package org.telegram.ui.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.bots.WebActionBar;

public class WebActionBar extends FrameLayout {
    private ValueAnimator addressAnimator;
    public final Paint addressBackgroundPaint;
    public final FrameLayout addressContainer;
    public final EditTextBoldCursor addressEditText;
    public boolean addressing;
    public float addressingProgress;
    public final ImageView backButton;
    public final BackDrawable backButtonDrawable;
    public final Drawable backButtonSelector;
    private boolean backButtonShown;
    public final Paint backgroundPaint;
    public final ImageView clearButton;
    public final Drawable clearButtonSelector;
    public final GradientClip clip;
    private ValueAnimator colorAnimator;
    public final ImageView forwardButton;
    public final ForwardDrawable forwardButtonDrawable;
    public final Drawable forwardButtonSelector;
    private int fromBackgroundColor;
    public int height;
    public final LinearLayout leftmenu;
    public final LineProgressView lineProgressView;
    private Runnable longPressRunnable;
    public final ActionBarMenuItem menuButton;
    public final Drawable menuButtonSelector;
    private int menuType;
    private boolean occupyStatusBar;
    private long pressTime;
    private float pressX;
    public final float[] progress;
    public final Paint progressBackgroundPaint;
    public final RectF rect;
    public final LinearLayout rightmenu;
    public float scale;
    public final Paint scrimPaint;
    private ValueAnimator searchAnimator;
    public final FrameLayout searchContainer;
    public final EditTextBoldCursor searchEditText;
    public boolean searching;
    public float searchingProgress;
    public final Paint shadowPaint;
    public float titleProgress;
    public final Title[] titles;
    private Utilities.Callback<String> urlCallback;

    protected void onColorsUpdated() {
    }

    protected void onOpenedMenu() {
    }

    protected void onScrolledProgress(float f) {
    }

    protected void onSearchUpdated(String str) {
    }

    @Override
    @SuppressLint({"MissingSuperCall"})
    protected boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public WebActionBar(Context context) {
        super(context);
        this.rect = new RectF();
        this.titles = r9;
        this.titleProgress = 0.0f;
        this.progress = new float[2];
        this.backgroundPaint = new Paint(1);
        this.progressBackgroundPaint = new Paint(1);
        this.shadowPaint = new Paint(1);
        this.scrimPaint = new Paint(1);
        this.addressBackgroundPaint = new Paint(1);
        this.height = AndroidUtilities.dp(56.0f);
        this.scale = 1.0f;
        this.searchingProgress = 0.0f;
        this.addressingProgress = 0.0f;
        this.menuType = -1;
        this.clip = new GradientClip();
        this.longPressRunnable = new Runnable() {
            @Override
            public final void run() {
                WebActionBar.this.lambda$new$8();
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchContainer = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.addressContainer = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1, 56, 87));
        LinearLayout linearLayout = new LinearLayout(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotY(0.0f);
                setPivotX(0.0f);
            }
        };
        this.leftmenu = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPivotY(0.0f);
        addView(linearLayout, LayoutHelper.createFrame(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        BackDrawable backDrawable = new BackDrawable(false);
        this.backButtonDrawable = backDrawable;
        backDrawable.setAnimationTime(200.0f);
        backDrawable.setRotation(1.0f, false);
        imageView.setImageDrawable(backDrawable);
        Drawable createSelectorDrawable = Theme.createSelectorDrawable(1090519039);
        this.backButtonSelector = createSelectorDrawable;
        imageView.setBackground(createSelectorDrawable);
        linearLayout.addView(imageView, LayoutHelper.createLinear(54, 56));
        LinearLayout linearLayout2 = new LinearLayout(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
            }
        };
        this.rightmenu = linearLayout2;
        linearLayout2.setOrientation(0);
        addView(linearLayout2, LayoutHelper.createFrame(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.forwardButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        ForwardDrawable forwardDrawable = new ForwardDrawable(this);
        this.forwardButtonDrawable = forwardDrawable;
        imageView2.setImageDrawable(forwardDrawable);
        forwardDrawable.setState(false);
        Drawable createSelectorDrawable2 = Theme.createSelectorDrawable(1090519039);
        this.forwardButtonSelector = createSelectorDrawable2;
        imageView2.setBackground(createSelectorDrawable2);
        linearLayout2.addView(imageView2, LayoutHelper.createLinear(54, 56));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 1090519039, -5000269) {
            @Override
            public void toggleSubMenu() {
                WebActionBar.this.onOpenedMenu();
                super.toggleSubMenu();
            }
        };
        this.menuButton = actionBarMenuItem;
        actionBarMenuItem.setLayoutInScreen(true);
        actionBarMenuItem.setDuplicateParentStateEnabled(false);
        actionBarMenuItem.setClickable(true);
        actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
        int i = R.drawable.msg_search;
        int i2 = R.string.Search;
        actionBarMenuItem.addSubItem(1, i, LocaleController.getString("Search", i2));
        actionBarMenuItem.addSubItem(2, R.drawable.msg_share, LocaleController.getString("ShareFile", R.string.ShareFile));
        actionBarMenuItem.addSubItem(3, R.drawable.msg_openin, LocaleController.getString("OpenInExternalApp", R.string.OpenInExternalApp));
        actionBarMenuItem.addSubItem(4, R.drawable.msg_settings_old, LocaleController.getString("Settings", R.string.Settings));
        actionBarMenuItem.addSubItem(5, R.drawable.msg_reset, LocaleController.getString(R.string.Reload));
        Drawable createSelectorDrawable3 = Theme.createSelectorDrawable(1090519039);
        this.menuButtonSelector = createSelectorDrawable3;
        actionBarMenuItem.setBackground(createSelectorDrawable3);
        actionBarMenuItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        linearLayout2.addView(actionBarMenuItem, LayoutHelper.createLinear(54, 56));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(this, context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.searchEditText = editTextBoldCursor;
        editTextBoldCursor.setVisibility(8);
        editTextBoldCursor.setAlpha(0.0f);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(i2));
        editTextBoldCursor.setBackgroundResource(0);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        editTextBoldCursor.setTranslationY(-AndroidUtilities.dp(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                boolean lambda$new$0;
                lambda$new$0 = WebActionBar.this.lambda$new$0(textView, i3, keyEvent);
                return lambda$new$0;
            }
        });
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                AndroidUtilities.updateViewShow(WebActionBar.this.clearButton, editable.length() > 0 && WebActionBar.this.searching, true, true);
                WebActionBar.this.onSearchUpdated(editable.toString());
            }
        });
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -1, 119));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(this, context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.addressEditText = editTextBoldCursor2;
        editTextBoldCursor2.setVisibility(8);
        editTextBoldCursor2.setAlpha(0.0f);
        editTextBoldCursor2.setTextSize(1, 15.66f);
        editTextBoldCursor2.setSingleLine(true);
        editTextBoldCursor2.setHint(LocaleController.getString(R.string.AddressPlaceholder));
        editTextBoldCursor2.setBackgroundResource(0);
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setGravity(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 524288);
        editTextBoldCursor2.setImeOptions(33554438);
        editTextBoldCursor2.setTextIsSelectable(false);
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                boolean lambda$new$1;
                lambda$new$1 = WebActionBar.this.lambda$new$1(textView, i3, keyEvent);
                return lambda$new$1;
            }
        });
        frameLayout2.addView(editTextBoldCursor2, LayoutHelper.createFrame(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.clearButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        imageView3.setImageResource(R.drawable.ic_close_white);
        Drawable createSelectorDrawable4 = Theme.createSelectorDrawable(1090519039);
        this.clearButtonSelector = createSelectorDrawable4;
        imageView3.setBackground(createSelectorDrawable4);
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                WebActionBar.this.lambda$new$2(view);
            }
        });
        addView(imageView3, LayoutHelper.createFrame(54, 56, 85));
        LineProgressView lineProgressView = new LineProgressView(context);
        this.lineProgressView = lineProgressView;
        lineProgressView.setPivotX(0.0f);
        lineProgressView.setPivotY(AndroidUtilities.dp(2.0f));
        addView(lineProgressView, LayoutHelper.createFrame(-1, 2, 87));
        setWillNotDraw(false);
        Title[] titleArr = {new Title(), new Title()};
        setColors(Theme.getColor(Theme.key_windowBackgroundWhite), Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), false);
    }

    public boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchEditText);
        return false;
    }

    public boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            Utilities.Callback<String> callback = this.urlCallback;
            if (callback != null) {
                callback.run(this.addressEditText.getText().toString());
            }
            showAddress(false, true);
        }
        return false;
    }

    public void lambda$new$2(View view) {
        this.searchEditText.setText("");
    }

    public void occupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public void setTitle(int i, String str, boolean z) {
        this.titles[i].title.setText(str, z);
    }

    public void setSubtitle(int i, String str, boolean z) {
        this.titles[i].subtitle.setText(str, z);
    }

    public String getTitle() {
        CharSequence text = this.titles[0].title.getText();
        return text == null ? "" : text.toString();
    }

    public void swap() {
        Title[] titleArr = this.titles;
        Title title = titleArr[0];
        titleArr[0] = titleArr[1];
        titleArr[1] = title;
        float[] fArr = this.progress;
        float f = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f;
        invalidate();
    }

    public void setMenuType(int i) {
        if (this.menuType != i) {
            this.menuType = i;
            if (i == 0) {
                this.menuButton.showSubItem(1);
                this.menuButton.showSubItem(2);
                this.menuButton.showSubItem(3);
                this.menuButton.showSubItem(4);
                this.menuButton.hideSubItem(5);
                return;
            }
            if (i == 1) {
                this.menuButton.showSubItem(1);
                this.menuButton.hideSubItem(2);
                this.menuButton.showSubItem(3);
                this.menuButton.hideSubItem(4);
                this.menuButton.showSubItem(5);
            }
        }
    }

    public void setTransitionProgress(float f) {
        this.titleProgress = f;
        invalidate();
    }

    public void setProgress(float f) {
        setProgress(0, f);
    }

    public void setProgress(int i, float f) {
        this.progress[i] = f;
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(topPadding() + AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setColors(int i, boolean z) {
        setColors(i, -1.0f, z);
    }

    public void setColors(final int i, float f, boolean z) {
        if (this.backgroundPaint.getColor() == i) {
            return;
        }
        if (!z) {
            if (f < 0.0f) {
                f = AndroidUtilities.computePerceivedBrightness(i) <= 0.721f ? 1.0f : 0.0f;
            }
            int blendARGB = ColorUtils.blendARGB(-16777216, -1, f);
            this.backgroundPaint.setColor(i);
            this.progressBackgroundPaint.setColor(Theme.blendOver(i, Theme.multAlpha(blendARGB, 0.07f)));
            this.shadowPaint.setColor(Theme.blendOver(i, Theme.multAlpha(blendARGB, 0.14f)));
            this.addressBackgroundPaint.setColor(Theme.blendOver(i, Theme.multAlpha(blendARGB, 0.07f)));
            this.lineProgressView.setProgressColor(Theme.getColor(Theme.key_featuredStickers_addButton));
            this.titles[0].title.setTextColor(blendARGB);
            this.titles[1].title.setTextColor(blendARGB);
            this.titles[0].subtitle.setTextColor(Theme.multAlpha(blendARGB, 0.6f));
            this.titles[1].subtitle.setTextColor(Theme.multAlpha(blendARGB, 0.6f));
            this.backButtonDrawable.setColor(blendARGB);
            this.backButtonDrawable.setRotatedColor(blendARGB);
            this.forwardButtonDrawable.setColor(blendARGB);
            this.menuButton.setIconColor(blendARGB);
            this.forwardButton.setColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.SRC_IN));
            this.clearButton.setColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.SRC_IN));
            int blendOver = Theme.blendOver(i, Theme.multAlpha(blendARGB, 0.22f));
            Theme.setSelectorDrawableColor(this.backButtonSelector, blendOver, true);
            Theme.setSelectorDrawableColor(this.forwardButtonSelector, blendOver, true);
            Theme.setSelectorDrawableColor(this.menuButtonSelector, blendOver, true);
            Theme.setSelectorDrawableColor(this.clearButtonSelector, blendOver, true);
            this.searchEditText.setHintTextColor(Theme.multAlpha(blendARGB, 0.6f));
            this.searchEditText.setTextColor(blendARGB);
            this.searchEditText.setCursorColor(blendARGB);
            this.searchEditText.setHandlesColor(blendARGB);
            this.addressEditText.setHintTextColor(Theme.multAlpha(blendARGB, 0.6f));
            this.addressEditText.setTextColor(blendARGB);
            this.addressEditText.setCursorColor(blendARGB);
            this.addressEditText.setHandlesColor(blendARGB);
            this.menuButton.setPopupItemsColor(Theme.multAlpha(blendARGB, 0.55f), true);
            this.menuButton.setPopupItemsColor(blendARGB, false);
            this.menuButton.setPopupItemsSelectorColor(blendOver);
            this.menuButton.redrawPopup(i);
            onColorsUpdated();
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.colorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int color = this.backgroundPaint.getColor();
        this.fromBackgroundColor = color;
        final float f2 = AndroidUtilities.computePerceivedBrightness(color) <= 0.721f ? 1.0f : 0.0f;
        final float f3 = AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 0.0f : 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.colorAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                WebActionBar.this.lambda$setColors$3(i, f2, f3, valueAnimator2);
            }
        });
        this.colorAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                WebActionBar.this.setColors(i, f3, false);
            }
        });
        this.colorAnimator.start();
    }

    public void lambda$setColors$3(int i, float f, float f2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setColors(ColorUtils.blendARGB(this.fromBackgroundColor, i, floatValue), AndroidUtilities.lerp(f, f2, floatValue), false);
    }

    public int getBackgroundColor() {
        return this.backgroundPaint.getColor();
    }

    public void setHeight(int i) {
        if (this.height != i) {
            this.height = i;
            float pow = (float) Math.pow(i / AndroidUtilities.dp(56.0f), 0.5d);
            this.scale = pow;
            this.leftmenu.setScaleX(pow);
            this.leftmenu.setScaleY(this.scale);
            this.leftmenu.setTranslationX(AndroidUtilities.dp(42.0f) * (1.0f - this.scale));
            this.leftmenu.setTranslationY((-AndroidUtilities.dp(12.0f)) * (1.0f - this.scale));
            this.rightmenu.setScaleX(this.scale);
            this.rightmenu.setScaleY(this.scale);
            this.rightmenu.setTranslationX((-AndroidUtilities.dp(42.0f)) * (1.0f - this.scale));
            this.rightmenu.setTranslationY((-AndroidUtilities.dp(12.0f)) * (1.0f - this.scale));
            this.lineProgressView.setTranslationY(this.height - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public class Title {
        public final AnimatedTextView.AnimatedTextDrawable subtitle;
        public final AnimatedTextView.AnimatedTextDrawable title;

        public Title() {
            new AnimatedFloat(WebActionBar.this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.title = animatedTextDrawable;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.subtitle = animatedTextDrawable2;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.33f));
            animatedTextDrawable.setScaleProperty(0.6f);
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setEllipsizeByGradient(false);
            animatedTextDrawable.setCallback(WebActionBar.this);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable2.setEllipsizeByGradient(false);
            animatedTextDrawable2.setCallback(WebActionBar.this);
            animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        }

        public void draw(Canvas canvas, float f, float f2, float f3) {
            WebActionBar.this.rect.set(0.0f, 0.0f, f, f2);
            canvas.saveLayerAlpha(WebActionBar.this.rect, (int) (f3 * 255.0f), 31);
            float isNotEmpty = this.title.isNotEmpty() * this.subtitle.isNotEmpty();
            canvas.save();
            float f4 = 0.82f * f2;
            canvas.translate(0.0f, (-AndroidUtilities.dp(1.0f)) + ((1.0f - WebActionBar.this.scale) * f4));
            canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * isNotEmpty);
            float lerp = WebActionBar.this.scale * AndroidUtilities.lerp(1.0f, 0.86f, isNotEmpty);
            canvas.scale(lerp, lerp, 0.0f, 0.0f);
            this.title.setBounds(0.0f, 0.0f, AndroidUtilities.displaySize.x, f2);
            this.title.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(0.0f, (-AndroidUtilities.dp(1.0f)) + (f4 * (1.0f - WebActionBar.this.scale)) + (AndroidUtilities.dp(14.0f) * isNotEmpty));
            float lerp2 = WebActionBar.this.scale * AndroidUtilities.lerp(1.0f, 0.9f, isNotEmpty);
            canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
            this.subtitle.setBounds(0.0f, 0.0f, AndroidUtilities.displaySize.x, f2);
            this.subtitle.draw(canvas);
            canvas.restore();
            WebActionBar.this.rect.set(f - AndroidUtilities.dp(12.0f), 0.0f, f, f2);
            WebActionBar webActionBar = WebActionBar.this;
            webActionBar.clip.draw(canvas, webActionBar.rect, 2, 1.0f);
            canvas.restore();
        }
    }

    public int topPadding() {
        if (this.occupyStatusBar) {
            return AndroidUtilities.statusBarHeight;
        }
        return 0;
    }

    public void drawBackground(Canvas canvas, int i, float f) {
        float width = getWidth() * this.titleProgress;
        float f2 = i;
        this.rect.set(0.0f, 0.0f, getWidth(), f2);
        int alpha = this.backgroundPaint.getAlpha();
        this.backgroundPaint.setAlpha((int) (alpha * f));
        canvas.drawRect(this.rect, this.backgroundPaint);
        this.backgroundPaint.setAlpha(alpha);
        if (this.titleProgress > 0.0f) {
            this.rect.set(0.0f, 0.0f, this.progress[1] * getWidth(), f2);
            int alpha2 = this.progressBackgroundPaint.getAlpha();
            this.progressBackgroundPaint.setAlpha((int) (alpha2 * f * (1.0f - this.searchingProgress) * (1.0f - this.addressingProgress)));
            canvas.drawRect(this.rect, this.progressBackgroundPaint);
            this.progressBackgroundPaint.setAlpha(alpha2);
            this.rect.set(width, Math.min(topPadding() + this.height, i) - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth() + width, Math.min(topPadding() + this.height, i));
            canvas.drawRect(this.rect, this.shadowPaint);
        }
        float f3 = this.titleProgress;
        if (f3 < 1.0f) {
            this.scrimPaint.setColor(Theme.multAlpha(1610612736, (1.0f - f3) * f));
            this.rect.set(0.0f, 0.0f, width, f2);
            canvas.drawRect(this.rect, this.scrimPaint);
            this.rect.set(width, 0.0f, getWidth(), f2);
            int alpha3 = this.backgroundPaint.getAlpha();
            this.backgroundPaint.setAlpha((int) (alpha3 * f));
            canvas.drawRect(this.rect, this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha3);
        }
        this.rect.set(width, 0.0f, (this.progress[0] * getWidth()) + width, f2);
        int alpha4 = this.progressBackgroundPaint.getAlpha();
        this.progressBackgroundPaint.setAlpha((int) ((1.0f - Utilities.clamp01(this.titleProgress * 4.0f)) * alpha4 * f * (1.0f - this.searchingProgress) * (1.0f - this.addressingProgress)));
        canvas.drawRect(this.rect, this.progressBackgroundPaint);
        this.progressBackgroundPaint.setAlpha(alpha4);
        this.rect.set(width, Math.min(topPadding() + this.height, i) - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth() + width, Math.min(topPadding() + this.height, i));
        canvas.drawRect(this.rect, this.shadowPaint);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        drawBackground(canvas, topPadding() + this.height, 1.0f);
        float right = this.leftmenu.getRight();
        float left = this.rightmenu.getLeft();
        float f = topPadding();
        float f2 = topPadding() + this.height;
        if (this.titleProgress < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.titleProgress) - (AndroidUtilities.dp(30.0f) * Utilities.clamp01(this.titleProgress * 2.0f));
            canvas.translate(right + width, f);
            AndroidUtilities.lerp(1.0f, 0.5f, this.titleProgress);
            this.titles[0].draw(canvas, (left - right) - width, f2 - f, (1.0f - this.titleProgress) * (1.0f - this.searchingProgress));
            canvas.restore();
        }
        if (this.titleProgress > 0.0f) {
            float width2 = getWidth() * this.titleProgress;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f);
            canvas.translate(AndroidUtilities.dp(-12.0f) * (1.0f - this.titleProgress), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.titleProgress);
            float f3 = f2 - f;
            canvas.scale(lerp, lerp, 0.0f, f3 / 2.0f);
            this.titles[1].draw(canvas, left - right, f3, this.titleProgress * (1.0f - this.searchingProgress) * (1.0f - this.addressingProgress));
            canvas.restore();
        }
        this.rect.set(0.0f, 0.0f, getWidth(), f2);
        canvas.save();
        canvas.clipRect(this.rect);
        if (this.addressingProgress > 0.0f) {
            float f4 = (f + f2) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            this.rect.set(AndroidUtilities.dp(6.0f), f4 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.addressingProgress), f4 + dp);
            int alpha = this.addressBackgroundPaint.getAlpha();
            this.addressBackgroundPaint.setAlpha((int) (alpha * this.addressingProgress));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), this.addressBackgroundPaint);
            this.addressBackgroundPaint.setAlpha(alpha);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void showSearch(final boolean z, boolean z2) {
        if (this.searching == z) {
            return;
        }
        ValueAnimator valueAnimator = this.searchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.searching = z;
        boolean z3 = false;
        if (z2) {
            this.searchEditText.setVisibility(0);
            this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
            float[] fArr = new float[2];
            fArr[0] = this.searchingProgress;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.searchAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    WebActionBar.this.lambda$showSearch$4(valueAnimator2);
                }
            });
            this.searchAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    WebActionBar webActionBar = WebActionBar.this;
                    if (!webActionBar.searching) {
                        webActionBar.searchEditText.setVisibility(8);
                        WebActionBar.this.searchEditText.setText("");
                    }
                    WebActionBar webActionBar2 = WebActionBar.this;
                    EditTextBoldCursor editTextBoldCursor = webActionBar2.searchEditText;
                    float f = z ? 1.0f : 0.0f;
                    webActionBar2.searchingProgress = f;
                    editTextBoldCursor.setAlpha(f);
                    WebActionBar.this.invalidate();
                }
            });
            this.searchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.searchAnimator.setDuration(320L);
            this.searchAnimator.start();
        } else {
            this.searchingProgress = z ? 1.0f : 0.0f;
            invalidate();
            this.searchEditText.setAlpha(z ? 1.0f : 0.0f);
            this.searchEditText.setVisibility(z ? 0 : 8);
            this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WebActionBar.this.lambda$showSearch$5();
            }
        }, this.searching ? 100L : 0L);
        AndroidUtilities.updateViewShow(this.forwardButton, !z, true, z2);
        AndroidUtilities.updateViewShow(this.menuButton, !z, true, z2);
        ImageView imageView = this.clearButton;
        if (this.searchEditText.length() > 0 && this.searching) {
            z3 = true;
        }
        AndroidUtilities.updateViewShow(imageView, z3, true, z2);
    }

    public void lambda$showSearch$4(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchingProgress = floatValue;
        this.searchEditText.setAlpha(floatValue);
        invalidate();
    }

    public void lambda$showSearch$5() {
        if (this.searching) {
            this.searchEditText.requestFocus();
            AndroidUtilities.showKeyboard(this.searchEditText);
        } else {
            this.searchEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }
    }

    public void setBackButton(boolean z) {
        this.backButtonShown = z;
        if (isSearching() || isAddressing()) {
            return;
        }
        this.backButtonDrawable.setRotation(this.backButtonShown ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z) {
        this.backButtonShown = z;
    }

    public boolean isSearching() {
        return this.searching;
    }

    public void showAddress(String str, Utilities.Callback<String> callback) {
        this.addressEditText.setText(str);
        EditTextBoldCursor editTextBoldCursor = this.addressEditText;
        editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        this.addressEditText.setScrollX(0);
        this.urlCallback = callback;
        showAddress(true, true);
    }

    public void showAddress(final boolean z, boolean z2) {
        if (this.addressing == z) {
            return;
        }
        ValueAnimator valueAnimator = this.addressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.addressing = z;
        if (z2) {
            this.addressEditText.setVisibility(0);
            this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
            float[] fArr = new float[2];
            fArr[0] = this.addressingProgress;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.addressAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    WebActionBar.this.lambda$showAddress$6(valueAnimator2);
                }
            });
            this.addressAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    WebActionBar webActionBar = WebActionBar.this;
                    if (!webActionBar.addressing) {
                        webActionBar.addressEditText.setVisibility(8);
                    }
                    WebActionBar webActionBar2 = WebActionBar.this;
                    EditTextBoldCursor editTextBoldCursor = webActionBar2.addressEditText;
                    float f = z ? 1.0f : 0.0f;
                    webActionBar2.addressingProgress = f;
                    editTextBoldCursor.setAlpha(f);
                    WebActionBar.this.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * WebActionBar.this.addressingProgress);
                    WebActionBar.this.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * WebActionBar.this.addressingProgress);
                    WebActionBar.this.invalidate();
                }
            });
            this.addressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.addressAnimator.setDuration(320L);
            this.addressAnimator.start();
        } else {
            this.addressingProgress = z ? 1.0f : 0.0f;
            invalidate();
            this.addressEditText.setAlpha(z ? 1.0f : 0.0f);
            this.addressEditText.setVisibility(z ? 0 : 8);
            this.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * this.addressingProgress);
            this.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * this.addressingProgress);
            this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                WebActionBar.this.lambda$showAddress$7();
            }
        }, this.addressing ? 100L : 0L);
    }

    public void lambda$showAddress$6(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.addressingProgress = floatValue;
        this.addressEditText.setAlpha(floatValue);
        this.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * this.addressingProgress);
        this.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * this.addressingProgress);
        invalidate();
    }

    public void lambda$showAddress$7() {
        if (this.addressing) {
            this.addressEditText.requestFocus();
            AndroidUtilities.showKeyboard(this.addressEditText);
        } else {
            this.addressEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.addressEditText);
        }
    }

    public boolean isAddressing() {
        return this.addressing;
    }

    public void lambda$new$8() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        performHapticFeedback(0, 1);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            if (motionEvent.getX() > this.leftmenu.getRight() && motionEvent.getX() < this.rightmenu.getLeft() && !isSearching() && !isAddressing()) {
                this.pressX = motionEvent.getX();
                motionEvent.getY();
                this.pressTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.longPressRunnable, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.pressTime)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            onScrolledProgress((motionEvent.getX() - this.pressX) / (getWidth() * 0.8f));
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.pressTime = 0L;
        }
        this.pressX = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public class ForwardDrawable extends Drawable {
        private AnimatedFloat animatedState;
        private final Paint paint;
        private final Path path = new Path();
        private boolean state;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ForwardDrawable(WebActionBar webActionBar) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            this.animatedState = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    WebActionBar.ForwardDrawable.this.invalidateSelf();
                }
            }, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public void setState(boolean z) {
            this.state = z;
            invalidateSelf();
        }

        @Override
        public void draw(Canvas canvas) {
            float f = this.animatedState.set(!this.state);
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            float width = getBounds().width();
            float f2 = 0.57f * width;
            this.path.rewind();
            float f3 = f2 / 2.0f;
            this.path.moveTo(centerX - AndroidUtilities.lerp(f3, (-f2) / 2.0f, f), centerY);
            float f4 = f3 + centerX;
            this.path.lineTo(f4, centerY);
            float f5 = f4 - (0.27f * width);
            float f6 = (0.54f * width) / 2.0f;
            this.path.moveTo(f5, centerY - f6);
            this.path.lineTo(f4, centerY);
            this.path.lineTo(f5, f6 + centerY);
            canvas.save();
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.translate(0.0f, (-width) * 0.1f * f);
            canvas.rotate(f * 90.0f, centerX, centerY);
            canvas.drawPath(this.path, this.paint);
            canvas.restore();
        }

        public void setColor(int i) {
            this.paint.setColor(i);
            invalidateSelf();
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }
    }
}
