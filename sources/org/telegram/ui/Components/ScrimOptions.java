package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class ScrimOptions extends Dialog {
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private final FrameLayout containerView;
    public final Context context;
    public final int currentAccount;
    private boolean dismissing;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private boolean isGroup;
    private ValueAnimator openAnimator;
    private float openProgress;
    private ItemOptions options;
    private boolean optionsAtCenter;
    private FrameLayout optionsContainer;
    private View optionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private ChatMessageCell scrimCell;
    private Drawable scrimDrawable;
    private Drawable scrimDrawableBackground;
    private float scrimDrawableSh;
    private float scrimDrawableSw;
    private float scrimDrawableTx1;
    private float scrimDrawableTx2;
    private float scrimDrawableTy1;
    private float scrimDrawableTy2;
    private final FrameLayout windowView;

    public ScrimOptions(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.scrimDrawableSw = 1.0f;
        this.scrimDrawableSh = 1.0f;
        this.dismissing = false;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                if (ScrimOptions.this.openProgress <= 0.0f || ScrimOptions.this.blurBitmapPaint == null) {
                    canvas2 = canvas;
                } else {
                    ScrimOptions.this.blurMatrix.reset();
                    float width = getWidth() / ScrimOptions.this.blurBitmap.getWidth();
                    ScrimOptions.this.blurMatrix.postScale(width, width);
                    ScrimOptions.this.blurBitmapShader.setLocalMatrix(ScrimOptions.this.blurMatrix);
                    ScrimOptions.this.blurBitmapPaint.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ScrimOptions.this.blurBitmapPaint);
                }
                super.dispatchDraw(canvas2);
                if (ScrimOptions.this.scrimDrawable != null) {
                    ScrimOptions.this.scrimDrawable.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                    canvas2.save();
                    canvas2.translate(ScrimOptions.this.scrimDrawableTx2 + (ScrimOptions.this.scrimDrawableTx1 * ScrimOptions.this.openProgress), ScrimOptions.this.scrimDrawableTy2 + (ScrimOptions.this.scrimDrawableTy1 * ScrimOptions.this.openProgress));
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ScrimOptions.this.scrimDrawableSw, ScrimOptions.this.scrimDrawableSh), Math.max(ScrimOptions.this.scrimDrawableSw, ScrimOptions.this.scrimDrawableSh), 0.75f), 1.0f, ScrimOptions.this.openProgress);
                    canvas2.scale(fLerp, fLerp, (-ScrimOptions.this.scrimDrawableTx2) + ScrimOptions.this.scrimDrawable.getBounds().left + ((ScrimOptions.this.scrimDrawable.getBounds().width() / 2.0f) * ScrimOptions.this.scrimDrawableSw), (-ScrimOptions.this.scrimDrawableTy2) + ScrimOptions.this.scrimDrawable.getBounds().top + ((ScrimOptions.this.scrimDrawable.getBounds().height() / 2.0f) * ScrimOptions.this.scrimDrawableSh));
                    if (ScrimOptions.this.scrimDrawableBackground != null) {
                        ScrimOptions.this.scrimDrawableBackground.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                        ScrimOptions.this.scrimDrawableBackground.draw(canvas2);
                    }
                    ScrimOptions.this.scrimDrawable.draw(canvas2);
                    canvas2.restore();
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ScrimOptions.this.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                ScrimOptions.this.layout();
            }

            @Override
            protected void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                ScrimOptions.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onBackPressed();
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context);
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setClipToPadding(false);
        frameLayout.addView(sizeNotifierFrameLayout, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(frameLayout), frameLayout);
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() {
            @Override
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
                ScrimOptions.this.containerView.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
                ScrimOptions.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    public void setItemOptions(ItemOptions itemOptions) {
        this.options = itemOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f)).setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        this.optionsView = itemOptions.getLayout();
        FrameLayout frameLayout = new FrameLayout(this.context);
        this.optionsContainer = frameLayout;
        frameLayout.addView(this.optionsView, LayoutHelper.createFrame(-2, -2.0f));
        this.containerView.addView(this.optionsContainer, LayoutHelper.createFrame(-2, -2.0f));
    }

    public void setOptionsAtCenter() {
        ((FrameLayout.LayoutParams) this.optionsContainer.getLayoutParams()).gravity = 1;
        this.optionsAtCenter = true;
    }

    public FrameLayout getWindowView() {
        return this.windowView;
    }

    @Override
    public boolean isShowing() {
        return !this.dismissing;
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            prepareBlur(null);
            animateOpenTo(true, null);
        }
    }

    @Override
    public void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                ScrimOptions.$r8$lambda$Qwwuzmrq2q7ZjciBQ5G6nUwzM0s(this.f$0);
            }
        });
        this.windowView.invalidate();
    }

    public static void $r8$lambda$Qwwuzmrq2q7ZjciBQ5G6nUwzM0s(final ScrimOptions scrimOptions) {
        scrimOptions.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                super/*android.app.Dialog*/.dismiss();
            }
        });
    }

    public void dismissFast() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animateOpenTo(false, 2.0f, new Runnable() {
            @Override
            public final void run() {
                ScrimOptions.m2714$r8$lambda$8V3yZuc7FCgSPXDzxeQbV1JQ6U(this.f$0);
            }
        });
        this.windowView.invalidate();
    }

    public static void m2714$r8$lambda$8V3yZuc7FCgSPXDzxeQbV1JQ6U(final ScrimOptions scrimOptions) {
        scrimOptions.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                super/*android.app.Dialog*/.dismiss();
            }
        });
    }

    private void animateOpenTo(boolean z, Runnable runnable) {
        animateOpenTo(z, 1.0f, runnable);
    }

    private void animateOpenTo(final boolean z, float f, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ScrimOptions.m2713$r8$lambda$6MkXxIYJUu4hMIegmVvwNJvYM(this.f$0, valueAnimator2);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ScrimOptions.this.openProgress = z ? 1.0f : 0.0f;
                ScrimOptions.this.optionsView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, ScrimOptions.this.openProgress));
                ScrimOptions.this.optionsView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ScrimOptions.this.openProgress));
                ScrimOptions.this.optionsView.setAlpha(ScrimOptions.this.openProgress);
                ScrimOptions.this.windowView.invalidate();
                ScrimOptions.this.containerView.invalidate();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(350L);
        this.openAnimator.start();
    }

    public static void m2713$r8$lambda$6MkXxIYJUu4hMIegmVvwNJvYM(ScrimOptions scrimOptions, ValueAnimator valueAnimator) {
        scrimOptions.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        scrimOptions.openProgress = fFloatValue;
        scrimOptions.optionsView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
        scrimOptions.optionsView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, scrimOptions.openProgress));
        scrimOptions.optionsView.setAlpha(scrimOptions.openProgress);
        scrimOptions.windowView.invalidate();
        scrimOptions.containerView.invalidate();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        makeGlobalBlurBitmaps(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ScrimOptions.$r8$lambda$J_nM03ZcSufCsHupI0Ejlfl3kmc(this.f$0, view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public static void $r8$lambda$J_nM03ZcSufCsHupI0Ejlfl3kmc(ScrimOptions scrimOptions, View view, Bitmap bitmap, Bitmap bitmap2) {
        if (view != null) {
            scrimOptions.getClass();
            view.setVisibility(0);
        }
        scrimOptions.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        scrimOptions.blurBitmapPaint = paint;
        Bitmap bitmap3 = scrimOptions.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        scrimOptions.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        scrimOptions.blurMatrix = new Matrix();
        scrimOptions.iBlur3SourceBitmap.setBitmap(bitmap2);
        scrimOptions.checkBitmapMatrix();
    }

    public static void makeGlobalBlurBitmaps(final Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ScrimOptions.$r8$lambda$t4hDgimCWIj8tgunowf0q1ImPVw(callback2, (Bitmap) obj);
            }
        }, 15.0f);
    }

    public static void $r8$lambda$t4hDgimCWIj8tgunowf0q1ImPVw(Utilities.Callback2 callback2, Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.04f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.04f : -0.07f);
        Bitmap bitmapApplyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
        bitmapApplyColorMatrix.setHasAlpha(false);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(Theme.isCurrentThemeDark() ? 2.0f : 3.0f);
        if (!Theme.isCurrentThemeDark()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.isCurrentThemeDark() ? -0.2f : -0.07f);
        }
        Bitmap bitmapApplyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
        bitmapApplyColorMatrix2.setHasAlpha(false);
        bitmap.recycle();
        callback2.run(bitmapApplyColorMatrix, bitmapApplyColorMatrix2);
    }

    public static void makeGlobalBlurBitmaps(final View view, final Utilities.Callback2 callback2) {
        if (view == null) {
            makeGlobalBlurBitmaps(callback2);
        } else {
            AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ScrimOptions.$r8$lambda$7AwtP5SUIkivLwGZFKBd5UkJZxg(view, callback2, (Bitmap) obj);
                }
            }, 15.0f);
        }
    }

    public static void $r8$lambda$7AwtP5SUIkivLwGZFKBd5UkJZxg(View view, Utilities.Callback2 callback2, Bitmap bitmap) {
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int iClamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
            int iClamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
            int iClamp3 = Utilities.clamp((int) ((view.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - iClamp, 0);
            int iClamp4 = Utilities.clamp((int) ((view.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - iClamp2, 0);
            if ((iClamp != 0 || iClamp2 != 0 || iClamp3 != bitmap.getWidth() || iClamp4 != bitmap.getHeight()) && iClamp3 > 0 && iClamp4 > 0) {
                bitmap = Bitmap.createBitmap(bitmap, iClamp, iClamp2, iClamp3, iClamp4);
            }
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.04f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.04f : -0.07f);
        Bitmap bitmapApplyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
        bitmapApplyColorMatrix.setHasAlpha(false);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(Theme.isCurrentThemeDark() ? 2.0f : 3.0f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.isCurrentThemeDark() ? -0.2f : -0.07f);
        Bitmap bitmapApplyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
        bitmapApplyColorMatrix2.setHasAlpha(false);
        bitmap.recycle();
        callback2.run(bitmapApplyColorMatrix, bitmapApplyColorMatrix2);
    }

    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        View view = this.optionsView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void layout() {
        boolean z;
        Drawable drawable = this.scrimDrawable;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            FrameLayout frameLayout = this.optionsContainer;
            if (frameLayout != null) {
                float f = bounds.left;
                float f2 = this.scrimDrawableTx2;
                float f3 = f + f2;
                float f4 = bounds.right + f2;
                float f5 = bounds.top;
                float f6 = this.scrimDrawableTy2;
                float f7 = f5 + f6;
                float f8 = bounds.bottom + f6;
                boolean z2 = true;
                if (this.optionsAtCenter) {
                    z = false;
                } else {
                    if (f4 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                        this.optionsView.setPivotX(AndroidUtilities.dp(6.0f));
                        this.optionsContainer.setX(Math.min(this.containerView.getWidth() - this.optionsContainer.getWidth(), f3 - AndroidUtilities.dp(10.0f)) - this.containerView.getX());
                        z = false;
                    } else {
                        View view = this.optionsView;
                        view.setPivotX(view.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                        this.optionsContainer.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f4) - this.optionsContainer.getMeasuredWidth()) - this.containerView.getX());
                        z = true;
                    }
                    this.scrimDrawableTx1 = z ? ((this.optionsContainer.getX() + this.optionsContainer.getWidth()) - AndroidUtilities.dp(6.0f)) - f4 : (this.optionsContainer.getX() + AndroidUtilities.dp(10.0f)) - f3;
                    this.scrimDrawableTy1 = 0.0f;
                }
                float fDp = f8 + (this.scrimDrawableBackground != null ? AndroidUtilities.dp(21.0f) : 0);
                if (this.optionsContainer.getMeasuredHeight() + fDp > this.windowView.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                    View view2 = this.optionsView;
                    view2.setPivotY(view2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                    this.optionsContainer.setY(((f7 - AndroidUtilities.dp(4.0f)) - this.optionsContainer.getMeasuredHeight()) - this.containerView.getY());
                } else {
                    this.optionsView.setPivotY(AndroidUtilities.dp(6.0f));
                    this.optionsContainer.setY(Math.min((this.windowView.getHeight() - this.optionsContainer.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), fDp) - this.containerView.getY());
                    z2 = false;
                }
                this.options.setSwipebackGravity(z, z2);
            }
        }
    }

    public void setScrimDrawable(Drawable drawable, int i, int i2) {
        BlurredBackgroundDrawable radius = this.iBlur3Factory.create().setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider)).setPadding(AndroidUtilities.dp(8.0f)).setHasPadding(true).setRadius(AndroidUtilities.dp(16.0f));
        this.scrimDrawableBackground = radius;
        this.scrimDrawable = drawable;
        Point point = AndroidUtilities.displaySize;
        int i3 = (point.x - i) / 2;
        int i4 = (point.y - i2) / 2;
        int i5 = i + i3;
        int i6 = i2 + i4;
        radius.setBounds(i3 - AndroidUtilities.dp(8.0f), i4 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i5, AndroidUtilities.dp(8.0f) + i6);
        this.scrimDrawable.setBounds(i3, i4, i5, i6);
    }

    public void setScrim(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, CharSequence charSequence) {
        setScrim(chatMessageCell, characterStyle, charSequence, false);
    }

    public void setScrim(final ChatMessageCell chatMessageCell, CharacterStyle characterStyle, CharSequence charSequence, boolean z) {
        float captionX;
        float captionY;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f;
        boolean z2;
        float textX;
        float textY;
        int spanStart;
        int width;
        int spanEnd;
        ?? r14;
        float f2;
        RectF rectF;
        ?? r15;
        Bitmap bitmap;
        ?? r32;
        int i;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink foundLinkFindLink;
        ArrayList<ChatMessageCell.PollButton> pollButtons;
        int i2;
        float f3;
        float f4;
        int i3;
        if (chatMessageCell == null) {
            return;
        }
        this.scrimCell = chatMessageCell;
        int i4 = 0;
        this.isGroup = chatMessageCell.getCurrentMessagesGroup() != null;
        MessageObject messageObject = chatMessageCell.getMessageObject();
        boolean z3 = chatMessageCell.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z3 && z) {
            captionX = chatMessageCell.getExplanationX();
            captionY = chatMessageCell.getExplanationY();
            arrayList = chatMessageCell.getExplanationLayout().textLayoutBlocks;
            f = chatMessageCell.getExplanationLayout().textXOffset;
        } else if (chatMessageCell.getCaptionLayout() != null) {
            captionX = chatMessageCell.getCaptionX();
            captionY = chatMessageCell.getCaptionY();
            arrayList = chatMessageCell.getCaptionLayout().textLayoutBlocks;
            f = chatMessageCell.getCaptionLayout().textXOffset;
        } else {
            captionX = 0.0f;
            captionY = 0.0f;
            arrayList = null;
            f = 0.0f;
        }
        if (arrayList == null) {
            captionX = chatMessageCell.getTextX();
            captionY = chatMessageCell.getTextY() + chatMessageCell.transitionYOffsetForDrawables;
            arrayList = messageObject.textLayoutBlocks;
            f = messageObject.textXOffset;
        }
        if (arrayList == null) {
            z2 = z3;
            textX = captionX;
            textY = captionY;
            spanStart = 0;
            width = 0;
            spanEnd = 0;
            r14 = 0;
            break;
        }
        int i5 = 0;
        loop0: while (true) {
            if (i5 >= arrayList.size()) {
                z2 = z3;
                textX = captionX;
                textY = captionY;
                spanStart = 0;
                width = 0;
                spanEnd = 0;
                r14 = 0;
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i5);
            StaticLayout staticLayout = textLayoutBlock.textLayout;
            if (staticLayout != null && (staticLayout.getText() instanceof Spanned)) {
                z2 = z3;
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i4, staticLayout.getText().length(), CharacterStyle.class);
                if (characterStyleArr != null) {
                    for (CharacterStyle characterStyle2 : characterStyleArr) {
                        if (characterStyle2 == characterStyle) {
                            spanStart = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                            spanEnd = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                            textX = (textLayoutBlock.isRtl() ? (int) Math.ceil(f) : 0) + captionX;
                            textY = captionY + textLayoutBlock.padTop + textLayoutBlock.textYOffset(arrayList, chatMessageCell.transitionParams);
                            width = textLayoutBlock.originalWidth;
                            r14 = staticLayout;
                            break loop0;
                        }
                    }
                }
            } else {
                z2 = z3;
            }
            i5++;
            captionX = captionX;
            z3 = z2;
            captionY = captionY;
            i4 = 0;
        }
        if (r14 == 0 && chatMessageCell.getDescriptionlayout() != null) {
            StaticLayout descriptionlayout = chatMessageCell.getDescriptionlayout();
            int i6 = 0;
            while (i6 == 0) {
                if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                    i3 = spanStart;
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr2 != null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 < characterStyleArr2.length) {
                                if (characterStyleArr2[i7] == characterStyle) {
                                    spanStart = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                    spanEnd = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                    textX = chatMessageCell.getDescriptionLayoutX();
                                    textY = chatMessageCell.getDescriptionLayoutY();
                                    width = descriptionlayout.getWidth();
                                    r14 = descriptionlayout;
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    i6++;
                    r14 = r14;
                } else {
                    i3 = spanStart;
                }
                spanStart = i3;
                i6++;
                r14 = r14;
            }
            r14 = r14;
        }
        if (r14 == 0 && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = chatMessageCell.getPollButtons()) != null)) {
            int i8 = 0;
            r14 = r14;
            while (i8 < pollButtons.size()) {
                ChatMessageCell.PollButton pollButton = pollButtons.get(i8);
                StaticLayout staticLayout2 = pollButton.title;
                if (staticLayout2 == null) {
                    i2 = spanStart;
                } else {
                    i2 = spanStart;
                    if (staticLayout2.getText() instanceof Spanned) {
                        f3 = textX;
                        f4 = textY;
                        CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                        if (characterStyleArr3 != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 < characterStyleArr3.length) {
                                    if (characterStyleArr3[i9] == characterStyle) {
                                        spanStart = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                        spanEnd = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                        textX = pollButton.titleX;
                                        textY = pollButton.titleY;
                                        width = staticLayout2.getWidth();
                                        r14 = staticLayout2;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        i8++;
                        r14 = r14;
                    }
                    spanStart = i2;
                    textY = f4;
                    textX = f3;
                    i8++;
                    r14 = r14;
                }
                f3 = textX;
                f4 = textY;
                spanStart = i2;
                textY = f4;
                textX = f3;
                i8++;
                r14 = r14;
            }
        }
        if (r14 == 0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && (foundLinkFindLink = richMessageLayout.findLink(characterStyle)) != null) {
            r14 = foundLinkFindLink.layout;
            spanStart = foundLinkFindLink.start;
            spanEnd = foundLinkFindLink.end;
            width = foundLinkFindLink.originalWidth;
            textX = chatMessageCell.getTextX() + foundLinkFindLink.x;
            textY = chatMessageCell.getTextY() + foundLinkFindLink.y;
        }
        int i10 = width;
        int i11 = spanStart;
        float fMax = textX;
        int length = spanEnd;
        if (r14 == 0 && z2 && !z) {
            setScrim(chatMessageCell, characterStyle, charSequence, true);
            return;
        }
        if (r14 == 0) {
            return;
        }
        if (charSequence != null) {
            int lineForOffset = r14.getLineForOffset(i11);
            float lineTop = textY + r14.getLineTop(lineForOffset);
            float primaryHorizontal = r14.getPrimaryHorizontal(i11);
            float lineWidth = r14.getLineWidth(lineForOffset);
            ?? linkPath = new LinkPath(true);
            linkPath.setCurrentLayout(r14, i11, 0.0f);
            r14.getSelectionPath(i11, length, linkPath);
            RectF rectF2 = new RectF();
            linkPath.computeBounds(rectF2, true);
            StaticLayout staticLayoutMakeStaticLayout = MessageObject.makeStaticLayout(charSequence, r14.getPaint(), r14.getWidth(), 1.0f, 0.0f, false);
            length = charSequence.length();
            float width2 = staticLayoutMakeStaticLayout.getWidth();
            float fMax2 = 0.0f;
            for (int i12 = 0; i12 < staticLayoutMakeStaticLayout.getLineCount(); i12++) {
                width2 = Math.min(width2, staticLayoutMakeStaticLayout.getLineLeft(i12));
                fMax2 = Math.max(fMax2, staticLayoutMakeStaticLayout.getLineRight(i12));
            }
            fMax += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, fMax2 - width2)));
            rectF = rectF2;
            i11 = 0;
            f2 = lineTop;
            r15 = staticLayoutMakeStaticLayout;
        } else {
            f2 = textY;
            rectF = null;
            r15 = r14;
        }
        ?? r0 = r15;
        float f5 = fMax;
        final Paint paint = new Paint(1);
        paint.setColor(Theme.getColor(messageObject.isOutOwner() ? Theme.key_chat_outBubble : Theme.key_chat_inBubble, this.resourcesProvider));
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
        final ?? linkPath2 = new LinkPath(true);
        linkPath2.setUseCornerPathImplementation(true);
        linkPath2.setCurrentLayout(r0, i11, 0.0f);
        r0.getSelectionPath(i11, length, linkPath2);
        linkPath2.closeRects();
        final RectF rectF3 = new RectF();
        linkPath2.computeBounds(rectF3, true);
        int iWidth = (int) (rectF3.width() + LinkPath.getRadius());
        if (!chatMessageCell.drawBackgroundInParent() || iWidth <= 0 || rectF3.height() <= 0.0f) {
            bitmap = null;
            r32 = r0;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
            ?? canvas = new Canvas(bitmapCreateBitmap);
            r32 = r0;
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, iWidth, rectF3.height(), paint2);
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.translate(-rectF3.left, -rectF3.top);
            canvas.drawPath(linkPath2, paint3);
            bitmap = bitmapCreateBitmap;
        }
        final Paint paint4 = new Paint(3);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        chatMessageCell.setupTextColors();
        TextPaint textPaint = new TextPaint(r32.getPaint());
        textPaint.set(r32.getPaint());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnimatedEmojiSpan.cloneSpans(r32.getText(), -1, textPaint.getFontMetricsInt()));
        if (i11 > 0) {
            i = 0;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i11, 33);
        } else {
            i = 0;
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
        }
        final StaticLayout staticLayoutMakeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i10, 1.0f, messageObject.totalAnimatedEmojiCount >= 4 ? -1.0f : 0.0f, false);
        final int[] iArr = new int[2];
        chatMessageCell.getLocationOnScreen(iArr);
        final int[] iArr2 = {iArr[0] + ((int) f5), iArr[1] + ((int) f2)};
        final Bitmap bitmap2 = bitmap;
        this.scrimDrawable = new Drawable() {
            private int alpha = 255;

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas2) {
                if (this.alpha <= 0) {
                    return;
                }
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(getBounds());
                rectF4.left -= LinkPath.getRadius() / 2.0f;
                canvas2.save();
                canvas2.saveLayerAlpha(rectF4, this.alpha, 31);
                int[] iArr3 = iArr2;
                canvas2.translate(iArr3[0], iArr3[1]);
                ChatMessageCell chatMessageCell2 = chatMessageCell;
                if (chatMessageCell2 != null && chatMessageCell2.drawBackgroundInParent()) {
                    MessageDrawable messageDrawable = chatMessageCell.currentBackgroundDrawable;
                    if (messageDrawable != null && messageDrawable.getPaint() != null) {
                        canvas2.save();
                        chatMessageCell.setBackgroundTopY(true);
                        canvas2.translate(0.0f, -chatMessageCell.currentBackgroundDrawable.getTopY());
                        canvas2.drawPaint(chatMessageCell.currentBackgroundDrawable.getPaint());
                        canvas2.restore();
                    } else {
                        int[] iArr4 = iArr2;
                        canvas2.translate(-iArr4[0], -iArr4[1]);
                        int[] iArr5 = iArr;
                        canvas2.translate(iArr5[0], iArr5[1] + chatMessageCell.getPaddingTop());
                        chatMessageCell.drawBackgroundInternal(canvas2, true);
                        int[] iArr6 = iArr;
                        canvas2.translate(-iArr6[0], (-iArr6[1]) - chatMessageCell.getPaddingTop());
                        int[] iArr7 = iArr2;
                        canvas2.translate(iArr7[0], iArr7[1]);
                    }
                    if (bitmap2 != null) {
                        canvas2.save();
                        Bitmap bitmap3 = bitmap2;
                        RectF rectF5 = rectF3;
                        canvas2.drawBitmap(bitmap3, rectF5.left, rectF5.top, paint4);
                        canvas2.restore();
                    }
                } else {
                    canvas2.drawPath(linkPath2, paint);
                }
                canvas2.clipPath(linkPath2);
                staticLayoutMakeStaticLayout2.draw(canvas2);
                canvas2.restore();
            }

            @Override
            public void setAlpha(int i13) {
                this.alpha = i13;
            }
        };
        int radius = (int) (iArr[0] + f5 + rectF3.left + (LinkPath.getRadius() / 2.0f));
        int i13 = (int) (iArr[1] + f2 + rectF3.top);
        this.scrimDrawable.setBounds(radius, i13, ((int) rectF3.width()) + radius, ((int) rectF3.height()) + i13);
        if (charSequence != null) {
            float f6 = radius;
            if (rectF3.width() + f6 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                this.scrimDrawableTx2 -= (f6 + rectF3.width()) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
            }
            float f7 = i13;
            if (rectF3.height() + f7 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                this.scrimDrawableTy2 -= (f7 + rectF3.height()) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
            }
            if (rectF != null) {
                this.scrimDrawableSw = rectF.width() / rectF3.width();
                this.scrimDrawableSh = rectF.height() / rectF3.height();
            }
        }
    }
}
