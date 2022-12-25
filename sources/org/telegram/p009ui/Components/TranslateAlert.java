package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LinkSpanDrawable;
import org.telegram.p009ui.Components.TranslateAlert;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_translateResultText;
import org.telegram.tgnet.TLRPC$TL_messages_translateText;

public class TranslateAlert extends Dialog {
    private static final int MOST_SPEC;
    private Spannable allTexts;
    private TextView allTextsView;
    private boolean allowScroll;
    private ImageView backButton;
    protected ColorDrawable backDrawable;
    private Rect backRect;
    private int blockIndex;
    private FrameLayout bulletinContainer;
    private Rect buttonRect;
    private FrameLayout buttonShadowView;
    private TextView buttonTextView;
    private FrameLayout buttonView;
    private FrameLayout container;
    private float containerOpenAnimationT;
    private Rect containerRect;
    private FrameLayout contentView;
    private int currentAccount;
    private boolean dismissed;
    private boolean fastHide;
    private int firstMinHeight;
    private BaseFragment fragment;
    private String fromLanguage;
    private boolean fromScrollRect;
    private float fromScrollViewY;
    private float fromScrollY;
    private float fromY;
    private FrameLayout header;
    private FrameLayout.LayoutParams headerLayout;
    private FrameLayout headerShadowView;
    private float heightMaxPercent;
    private LinkSpanDrawable.LinkCollector links;
    private boolean loaded;
    private boolean loading;
    private boolean maybeScrolling;
    private int msgId;
    private boolean noforwards;
    private Runnable onDismiss;
    private OnLinkPress onLinkPress;
    private ValueAnimator openAnimationToAnimator;
    private boolean openAnimationToAnimatorPriority;
    private ValueAnimator openingAnimator;
    private boolean openingAnimatorPriority;
    private float openingT;
    private TLRPC$InputPeer peer;
    private LinkSpanDrawable pressedLink;
    private boolean pressedOutside;
    private Rect scrollRect;
    private NestedScrollView scrollView;
    private FrameLayout.LayoutParams scrollViewLayout;
    private boolean scrolling;
    private ImageView subtitleArrowView;
    private InlineLoadingTextView subtitleFromView;
    private FrameLayout.LayoutParams subtitleLayout;
    private TextView subtitleToView;
    private LinearLayout subtitleView;
    private ArrayList<CharSequence> textBlocks;
    private Rect textRect;
    private FrameLayout textsContainerView;
    private TextBlocksLayout textsView;
    private FrameLayout.LayoutParams titleLayout;
    private TextView titleView;
    private String toLanguage;

    public interface OnLinkPress {
        boolean run(URLSpan uRLSpan);
    }

    public interface OnTranslationFail {
        void run(boolean z);
    }

    public interface OnTranslationSuccess {
        void run(String str, String str2);
    }

    static {
        new DispatchQueue("translateQueue", false);
        MOST_SPEC = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    }

    public void openAnimation(float f) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        if (this.containerOpenAnimationT == min) {
            return;
        }
        this.containerOpenAnimationT = min;
        this.titleView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9473f, min));
        this.titleView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9473f, min));
        FrameLayout.LayoutParams layoutParams = this.titleLayout;
        int m35dp = AndroidUtilities.m35dp(AndroidUtilities.lerp(22, 72, min));
        int m35dp2 = AndroidUtilities.m35dp(AndroidUtilities.lerp(22, 8, min));
        FrameLayout.LayoutParams layoutParams2 = this.titleLayout;
        layoutParams.setMargins(m35dp, m35dp2, layoutParams2.rightMargin, layoutParams2.bottomMargin);
        this.titleView.setLayoutParams(this.titleLayout);
        FrameLayout.LayoutParams layoutParams3 = this.subtitleLayout;
        int m35dp3 = AndroidUtilities.m35dp(AndroidUtilities.lerp(22, 72, min)) - LoadingTextView2.paddingHorizontal;
        int m35dp4 = AndroidUtilities.m35dp(AndroidUtilities.lerp(47, 30, min)) - LoadingTextView2.paddingVertical;
        FrameLayout.LayoutParams layoutParams4 = this.subtitleLayout;
        layoutParams3.setMargins(m35dp3, m35dp4, layoutParams4.rightMargin, layoutParams4.bottomMargin);
        this.subtitleView.setLayoutParams(this.subtitleLayout);
        this.backButton.setAlpha(min);
        float f2 = (0.25f * min) + 0.75f;
        this.backButton.setScaleX(f2);
        this.backButton.setScaleY(f2);
        this.backButton.setClickable(min > 0.5f);
        this.headerShadowView.setAlpha(this.scrollView.getScrollY() <= 0 ? min : 1.0f);
        this.headerLayout.height = AndroidUtilities.lerp(AndroidUtilities.m35dp(70.0f), AndroidUtilities.m35dp(56.0f), min);
        this.header.setLayoutParams(this.headerLayout);
        FrameLayout.LayoutParams layoutParams5 = this.scrollViewLayout;
        int i = layoutParams5.leftMargin;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.m35dp(70.0f), AndroidUtilities.m35dp(56.0f), min);
        FrameLayout.LayoutParams layoutParams6 = this.scrollViewLayout;
        layoutParams5.setMargins(i, lerp, layoutParams6.rightMargin, layoutParams6.bottomMargin);
        this.scrollView.setLayoutParams(this.scrollViewLayout);
    }

    public void openAnimationTo(float f, boolean z) {
        openAnimationTo(f, z, null);
    }

    private void openAnimationTo(float f, boolean z, final Runnable runnable) {
        if (!this.openAnimationToAnimatorPriority || z) {
            this.openAnimationToAnimatorPriority = z;
            float min = Math.min(Math.max(f, 0.0f), 1.0f);
            ValueAnimator valueAnimator = this.openAnimationToAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.containerOpenAnimationT, min);
            this.openAnimationToAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TranslateAlert.this.lambda$openAnimationTo$0(valueAnimator2);
                }
            });
            this.openAnimationToAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    TranslateAlert.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    TranslateAlert.this.openAnimationToAnimatorPriority = false;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    TranslateAlert.this.openAnimationToAnimatorPriority = false;
                }
            });
            this.openAnimationToAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.openAnimationToAnimator.setDuration(220L);
            this.openAnimationToAnimator.start();
            if (min < 0.5d || this.blockIndex > 1) {
                return;
            }
            fetchNext();
        }
    }

    public void lambda$openAnimationTo$0(ValueAnimator valueAnimator) {
        openAnimation(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int minHeight() {
        return minHeight(false);
    }

    private int minHeight(boolean z) {
        TextBlocksLayout textBlocksLayout = this.textsView;
        int measuredHeight = textBlocksLayout == null ? 0 : textBlocksLayout.getMeasuredHeight();
        int m35dp = AndroidUtilities.m35dp(147.0f) + measuredHeight;
        if (this.firstMinHeight < 0 && measuredHeight > 0) {
            this.firstMinHeight = m35dp;
        }
        return (this.firstMinHeight <= 0 || this.textBlocks.size() <= 1 || z) ? m35dp : this.firstMinHeight;
    }

    public boolean canExpand() {
        return this.textsView.getBlocksCount() < this.textBlocks.size() || ((float) minHeight(true)) >= ((float) AndroidUtilities.displayMetrics.heightPixels) * this.heightMaxPercent;
    }

    public void updateCanExpand() {
        boolean canExpand = canExpand();
        if (this.containerOpenAnimationT > 0.0f && !canExpand) {
            openAnimationTo(0.0f, false);
        }
        this.buttonShadowView.animate().alpha(canExpand ? 1.0f : 0.0f).setDuration(Math.abs(this.buttonShadowView.getAlpha() - (canExpand ? 1.0f : 0.0f)) * 220.0f).start();
    }

    public TranslateAlert(BaseFragment baseFragment, Context context, String str, String str2, CharSequence charSequence, boolean z, OnLinkPress onLinkPress, Runnable runnable) {
        this(baseFragment, context, -1, null, -1, str, str2, charSequence, z, onLinkPress, runnable);
    }

    public TranslateAlert(BaseFragment baseFragment, Context context, int i, TLRPC$InputPeer tLRPC$InputPeer, int i2, String str, String str2, CharSequence charSequence, boolean z, OnLinkPress onLinkPress, Runnable runnable) {
        super(context, C1072R.style.TransparentDialog);
        this.blockIndex = 0;
        this.containerOpenAnimationT = 0.0f;
        this.openAnimationToAnimatorPriority = false;
        this.openAnimationToAnimator = null;
        this.firstMinHeight = -1;
        this.allowScroll = true;
        this.fromScrollY = 0.0f;
        this.containerRect = new Rect();
        this.textRect = new Rect();
        new Rect();
        this.buttonRect = new Rect();
        this.backRect = new Rect();
        this.scrollRect = new Rect();
        this.fromY = 0.0f;
        this.pressedOutside = false;
        this.maybeScrolling = false;
        this.scrolling = false;
        this.fromScrollRect = false;
        this.fromScrollViewY = 0.0f;
        this.allTexts = null;
        this.openingT = 0.0f;
        this.backDrawable = new ColorDrawable(-16777216) {
            {
                TranslateAlert.this = this;
            }

            @Override
            public void setAlpha(int i3) {
                super.setAlpha(i3);
                TranslateAlert.this.container.invalidate();
            }
        };
        this.dismissed = false;
        this.heightMaxPercent = 0.85f;
        this.fastHide = false;
        this.openingAnimatorPriority = false;
        this.loading = false;
        this.loaded = false;
        this.onLinkPress = onLinkPress;
        this.noforwards = z;
        this.fragment = baseFragment;
        this.fromLanguage = (str == null || !str.equals("und")) ? str : "auto";
        this.toLanguage = str2;
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        this.textBlocks = arrayList;
        arrayList.add(charSequence);
        this.onDismiss = runnable;
        this.currentAccount = i;
        this.peer = tLRPC$InputPeer;
        this.msgId = i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            getWindow().addFlags(-2147483392);
        } else if (i3 >= 21) {
            getWindow().addFlags(-2147417856);
        }
        if (z) {
            getWindow().addFlags(8192);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentView = frameLayout;
        frameLayout.setBackground(this.backDrawable);
        this.contentView.setClipChildren(false);
        this.contentView.setClipToPadding(false);
        if (i3 >= 21) {
            this.contentView.setFitsSystemWindows(true);
            if (i3 >= 30) {
                this.contentView.setSystemUiVisibility(1792);
            } else {
                this.contentView.setSystemUiVisibility(1280);
            }
        }
        final Paint paint = new Paint();
        paint.setColor(Theme.getColor("dialogBackground"));
        paint.setShadowLayer(AndroidUtilities.m35dp(2.0f), 0.0f, AndroidUtilities.m35dp(-0.66f), 503316480);
        FrameLayout frameLayout2 = new FrameLayout(context) {
            private RectF containerRect;
            private int contentHeight = ConnectionsManager.DEFAULT_DATACENTER_ID;

            {
                TranslateAlert.this = this;
                new Path();
                this.containerRect = new RectF();
                new RectF();
            }

            @Override
            protected void onMeasure(int i4, int i5) {
                int size = View.MeasureSpec.getSize(i4);
                View.MeasureSpec.getSize(i4);
                int i6 = (int) (AndroidUtilities.displayMetrics.heightPixels * TranslateAlert.this.heightMaxPercent);
                if (TranslateAlert.this.textsView != null && TranslateAlert.this.textsView.getMeasuredHeight() <= 0) {
                    TranslateAlert.this.textsView.measure(View.MeasureSpec.makeMeasureSpec((((View.MeasureSpec.getSize(i4) - TranslateAlert.this.textsView.getPaddingLeft()) - TranslateAlert.this.textsView.getPaddingRight()) - TranslateAlert.this.textsContainerView.getPaddingLeft()) - TranslateAlert.this.textsContainerView.getPaddingRight(), 1073741824), 0);
                }
                int min = Math.min(i6, TranslateAlert.this.minHeight());
                int i7 = (int) (min + ((AndroidUtilities.displayMetrics.heightPixels - min) * TranslateAlert.this.containerOpenAnimationT));
                TranslateAlert.this.updateCanExpand();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(size * 0.8f, Math.min(AndroidUtilities.m35dp(480.0f), size)), View.MeasureSpec.getMode(i4)), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            }

            @Override
            protected void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                super.onLayout(z2, i4, i5, i6, i7);
                this.contentHeight = Math.min(this.contentHeight, i7 - i5);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int width = getWidth();
                int height = getHeight();
                int m35dp = AndroidUtilities.m35dp((1.0f - TranslateAlert.this.containerOpenAnimationT) * 12.0f);
                canvas.clipRect(0, 0, width, height);
                this.containerRect.set(0.0f, 0.0f, width, height + m35dp);
                canvas.translate(0.0f, (1.0f - TranslateAlert.this.openingT) * height);
                float f = m35dp;
                canvas.drawRoundRect(this.containerRect, f, f, paint);
                super.onDraw(canvas);
            }
        };
        this.container = frameLayout2;
        frameLayout2.setWillNotDraw(false);
        this.header = new FrameLayout(context);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setPivotX(LocaleController.isRTL ? textView.getWidth() : 0.0f);
        this.titleView.setPivotY(0.0f);
        this.titleView.setLines(1);
        this.titleView.setText(LocaleController.getString("AutomaticTranslation", C1072R.string.AutomaticTranslation));
        this.titleView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleView.setTextColor(Theme.getColor("dialogTextBlack"));
        this.titleView.setTextSize(0, AndroidUtilities.m35dp(19.0f));
        FrameLayout frameLayout3 = this.header;
        View view = this.titleView;
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, -2.0f, 55, 22.0f, 22.0f, 22.0f, 0.0f);
        this.titleLayout = createFrame;
        frameLayout3.addView(view, createFrame);
        this.titleView.post(new Runnable() {
            @Override
            public final void run() {
                TranslateAlert.this.lambda$new$1();
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.subtitleView = linearLayout;
        linearLayout.setOrientation(0);
        if (i3 >= 17) {
            this.subtitleView.setLayoutDirection(LocaleController.isRTL ? 1 : 0);
        }
        this.subtitleView.setGravity(LocaleController.isRTL ? 5 : 3);
        String languageName = languageName(str);
        InlineLoadingTextView inlineLoadingTextView = new InlineLoadingTextView(context, languageName == null ? languageName(str2) : languageName, AndroidUtilities.m35dp(14.0f), Theme.getColor("player_actionBarSubtitle")) {
            {
                TranslateAlert.this = this;
            }

            @Override
            protected void onLoadAnimation(float f) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TranslateAlert.this.subtitleFromView.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (LocaleController.isRTL) {
                        marginLayoutParams.leftMargin = AndroidUtilities.m35dp(2.0f - (f * 6.0f));
                    } else {
                        marginLayoutParams.rightMargin = AndroidUtilities.m35dp(2.0f - (f * 6.0f));
                    }
                    TranslateAlert.this.subtitleFromView.setLayoutParams(marginLayoutParams);
                }
            }
        };
        this.subtitleFromView = inlineLoadingTextView;
        inlineLoadingTextView.showLoadingText = false;
        ImageView imageView = new ImageView(context);
        this.subtitleArrowView = imageView;
        imageView.setImageResource(C1072R.C1073drawable.search_arrow);
        this.subtitleArrowView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("player_actionBarSubtitle"), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            this.subtitleArrowView.setScaleX(-1.0f);
        }
        TextView textView2 = new TextView(context);
        this.subtitleToView = textView2;
        textView2.setLines(1);
        this.subtitleToView.setTextColor(Theme.getColor("player_actionBarSubtitle"));
        this.subtitleToView.setTextSize(0, AndroidUtilities.m35dp(14.0f));
        this.subtitleToView.setText(languageName(str2));
        if (LocaleController.isRTL) {
            this.subtitleView.setPadding(InlineLoadingTextView.paddingHorizontal, 0, 0, 0);
            this.subtitleView.addView(this.subtitleToView, LayoutHelper.createLinear(-2, -2, 16));
            this.subtitleView.addView(this.subtitleArrowView, LayoutHelper.createLinear(-2, -2, 16, 3, 1, 0, 0));
            this.subtitleView.addView(this.subtitleFromView, LayoutHelper.createLinear(-2, -2, 16, 2, 0, 0, 0));
        } else {
            this.subtitleView.setPadding(0, 0, InlineLoadingTextView.paddingHorizontal, 0);
            this.subtitleView.addView(this.subtitleFromView, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 2, 0));
            this.subtitleView.addView(this.subtitleArrowView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 3, 0));
            this.subtitleView.addView(this.subtitleToView, LayoutHelper.createLinear(-2, -2, 16));
        }
        if (languageName != null) {
            this.subtitleFromView.set(languageName);
        }
        FrameLayout frameLayout4 = this.header;
        View view2 = this.subtitleView;
        int i4 = LocaleController.isRTL ? 5 : 3;
        int i5 = LoadingTextView2.paddingHorizontal;
        float f = AndroidUtilities.density;
        FrameLayout.LayoutParams createFrame2 = LayoutHelper.createFrame(-1, -2.0f, i4 | 48, 22.0f - (i5 / AndroidUtilities.density), 47.0f - (LoadingTextView2.paddingVertical / f), 22.0f - (i5 / f), 0.0f);
        this.subtitleLayout = createFrame2;
        frameLayout4.addView(view2, createFrame2);
        ImageView imageView2 = new ImageView(context);
        this.backButton = imageView2;
        imageView2.setImageResource(C1072R.C1073drawable.ic_ab_back);
        this.backButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogTextBlack"), PorterDuff.Mode.MULTIPLY));
        this.backButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.backButton.setPadding(AndroidUtilities.m35dp(16.0f), 0, AndroidUtilities.m35dp(16.0f), 0);
        this.backButton.setBackground(Theme.createSelectorDrawable(Theme.getColor("dialogButtonSelector")));
        this.backButton.setClickable(false);
        this.backButton.setAlpha(0.0f);
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                TranslateAlert.this.lambda$new$2(view3);
            }
        });
        this.header.addView(this.backButton, LayoutHelper.createFrame(56, 56, 3));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.headerShadowView = frameLayout5;
        frameLayout5.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        this.headerShadowView.setAlpha(0.0f);
        this.header.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 1, 87));
        this.header.setClipChildren(false);
        FrameLayout frameLayout6 = this.container;
        View view3 = this.header;
        FrameLayout.LayoutParams createFrame3 = LayoutHelper.createFrame(-1, 70, 55);
        this.headerLayout = createFrame3;
        frameLayout6.addView(view3, createFrame3);
        NestedScrollView nestedScrollView = new NestedScrollView(context) {
            {
                TranslateAlert.this = this;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return TranslateAlert.this.allowScroll && TranslateAlert.this.containerOpenAnimationT >= 1.0f && TranslateAlert.this.canExpand() && super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onNestedScroll(View view4, int i6, int i7, int i8, int i9) {
                super.onNestedScroll(view4, i6, i7, i8, i9);
            }

            @Override
            public void onScrollChanged(int i6, int i7, int i8, int i9) {
                super.onScrollChanged(i6, i7, i8, i9);
                if (TranslateAlert.this.checkForNextLoading()) {
                    TranslateAlert.this.openAnimationTo(1.0f, true);
                }
            }
        };
        this.scrollView = nestedScrollView;
        nestedScrollView.setClipChildren(true);
        TextView textView3 = new TextView(context) {
            {
                TranslateAlert.this = this;
            }

            @Override
            protected void onMeasure(int i6, int i7) {
                super.onMeasure(i6, TranslateAlert.MOST_SPEC);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                if (TranslateAlert.this.links == null || !TranslateAlert.this.links.draw(canvas)) {
                    return;
                }
                invalidate();
            }

            @Override
            public boolean onTextContextMenuItem(int i6) {
                if (i6 == 16908321 && isFocused()) {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", getText().subSequence(Math.max(0, Math.min(getSelectionStart(), getSelectionEnd())), Math.max(0, Math.max(getSelectionStart(), getSelectionEnd())))));
                    BulletinFactory.m14of(TranslateAlert.this.bulletinContainer, null).createCopyBulletin(LocaleController.getString("TextCopied", C1072R.string.TextCopied)).show();
                    clearFocus();
                    return true;
                }
                return super.onTextContextMenuItem(i6);
            }
        };
        this.allTextsView = textView3;
        this.links = new LinkSpanDrawable.LinkCollector(textView3);
        this.allTextsView.setTextColor(0);
        this.allTextsView.setTextSize(1, 16.0f);
        this.allTextsView.setTextIsSelectable(!z);
        this.allTextsView.setHighlightColor(Theme.getColor("chat_inTextSelectionHighlight"));
        int color = Theme.getColor("chat_TextSelectionCursor");
        if (i3 >= 29) {
            try {
                if (!XiaomiUtilities.isMIUI()) {
                    Drawable textSelectHandleLeft = this.allTextsView.getTextSelectHandleLeft();
                    textSelectHandleLeft.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    this.allTextsView.setTextSelectHandleLeft(textSelectHandleLeft);
                    Drawable textSelectHandleRight = this.allTextsView.getTextSelectHandleRight();
                    textSelectHandleRight.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    this.allTextsView.setTextSelectHandleRight(textSelectHandleRight);
                }
            } catch (Exception unused) {
            }
        }
        this.allTextsView.setFocusable(true);
        this.allTextsView.setMovementMethod(new LinkMovementMethod());
        TextBlocksLayout textBlocksLayout = new TextBlocksLayout(context, AndroidUtilities.m35dp(16.0f), Theme.getColor("dialogTextBlack"), this.allTextsView);
        this.textsView = textBlocksLayout;
        int m35dp = AndroidUtilities.m35dp(22.0f);
        int i6 = LoadingTextView2.paddingHorizontal;
        int m35dp2 = AndroidUtilities.m35dp(12.0f);
        int i7 = LoadingTextView2.paddingVertical;
        textBlocksLayout.setPadding(m35dp - i6, m35dp2 - i7, AndroidUtilities.m35dp(22.0f) - i6, AndroidUtilities.m35dp(12.0f) - i7);
        Iterator<CharSequence> it = this.textBlocks.iterator();
        while (it.hasNext()) {
            this.textsView.addBlock(it.next());
        }
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.textsContainerView = frameLayout7;
        frameLayout7.addView(this.textsView, LayoutHelper.createFrame(-1, -2.0f));
        this.scrollView.addView(this.textsContainerView, LayoutHelper.createLinear(-1, -2, 1.0f));
        FrameLayout frameLayout8 = this.container;
        View view4 = this.scrollView;
        FrameLayout.LayoutParams createFrame4 = LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 70.0f, 0.0f, 81.0f);
        this.scrollViewLayout = createFrame4;
        frameLayout8.addView(view4, createFrame4);
        fetchNext();
        FrameLayout frameLayout9 = new FrameLayout(context);
        this.buttonShadowView = frameLayout9;
        frameLayout9.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        this.container.addView(this.buttonShadowView, LayoutHelper.createFrame(-1, 1.0f, 87, 0.0f, 0.0f, 0.0f, 80.0f));
        TextView textView4 = new TextView(context);
        this.buttonTextView = textView4;
        textView4.setLines(1);
        this.buttonTextView.setSingleLine(true);
        this.buttonTextView.setGravity(1);
        this.buttonTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setText(LocaleController.getString("CloseTranslation", C1072R.string.CloseTranslation));
        FrameLayout frameLayout10 = new FrameLayout(context);
        this.buttonView = frameLayout10;
        frameLayout10.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("featuredStickers_addButton"), 4.0f));
        this.buttonView.addView(this.buttonTextView);
        this.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view5) {
                TranslateAlert.this.lambda$new$3(view5);
            }
        });
        this.container.addView(this.buttonView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        this.contentView.addView(this.container, LayoutHelper.createFrame(-1, -2, 81));
        FrameLayout frameLayout11 = new FrameLayout(context);
        this.bulletinContainer = frameLayout11;
        this.contentView.addView(frameLayout11, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 81.0f));
    }

    public void lambda$new$1() {
        TextView textView = this.titleView;
        textView.setPivotX(LocaleController.isRTL ? textView.getWidth() : 0.0f);
    }

    public void lambda$new$2(View view) {
        dismiss();
    }

    public void lambda$new$3(View view) {
        dismiss();
    }

    public void showDim(boolean z) {
        this.contentView.setBackground(z ? this.backDrawable : null);
    }

    private boolean scrollAtBottom() {
        NestedScrollView nestedScrollView = this.scrollView;
        int bottom = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getBottom();
        LoadingTextView2 firstUnloadedBlock = this.textsView.getFirstUnloadedBlock();
        if (firstUnloadedBlock != null) {
            bottom = firstUnloadedBlock.getTop();
        }
        return bottom - (this.scrollView.getHeight() + this.scrollView.getScrollY()) <= this.textsContainerView.getPaddingBottom();
    }

    private void setScrollY(float f) {
        openAnimation(f);
        float max = Math.max(Math.min(f + 1.0f, 1.0f), 0.0f);
        this.openingT = max;
        this.backDrawable.setAlpha((int) (max * 51.0f));
        this.container.invalidate();
        this.bulletinContainer.setTranslationY((1.0f - this.openingT) * Math.min(minHeight(), AndroidUtilities.displayMetrics.heightPixels * this.heightMaxPercent));
    }

    private void scrollYTo(float f) {
        scrollYTo(f, null);
    }

    private void scrollYTo(float f, Runnable runnable) {
        openAnimationTo(f, false, runnable);
        openTo(f + 1.0f, false);
    }

    private float getScrollY() {
        return Math.max(Math.min(this.containerOpenAnimationT - (1.0f - this.openingT), 1.0f), 0.0f);
    }

    private boolean hasSelection() {
        return this.allTextsView.hasSelection();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float round;
        float f;
        ClickableSpan[] clickableSpanArr;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.container.getGlobalVisibleRect(this.containerRect);
            int i = (int) x;
            int i2 = (int) y;
            boolean z = false;
            if (!this.containerRect.contains(i, i2)) {
                if (motionEvent.getAction() == 0) {
                    this.pressedOutside = true;
                    return true;
                } else if (motionEvent.getAction() == 1 && this.pressedOutside) {
                    this.pressedOutside = false;
                    dismiss();
                    return true;
                }
            }
            try {
                this.allTextsView.getGlobalVisibleRect(this.textRect);
                if (this.textRect.contains(i, i2) && !this.maybeScrolling) {
                    Layout layout = this.allTextsView.getLayout();
                    int top = (int) ((((y - this.allTextsView.getTop()) - this.container.getTop()) - this.scrollView.getTop()) + this.scrollView.getScrollY());
                    int lineForVertical = layout.getLineForVertical(top);
                    float left = (int) ((x - this.allTextsView.getLeft()) - this.container.getLeft());
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, left);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if ((this.allTexts instanceof Spannable) && lineLeft <= left && lineLeft + layout.getLineWidth(lineForVertical) >= left && (clickableSpanArr = (ClickableSpan[]) this.allTexts.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) != null && clickableSpanArr.length >= 1) {
                        if (motionEvent.getAction() == 1 && this.pressedLink.getSpan() == clickableSpanArr[0]) {
                            ((ClickableSpan) this.pressedLink.getSpan()).onClick(this.allTextsView);
                            LinkSpanDrawable.LinkCollector linkCollector = this.links;
                            if (linkCollector != null) {
                                linkCollector.removeLink(this.pressedLink);
                            }
                            this.pressedLink = null;
                            this.allTextsView.setTextIsSelectable(!this.noforwards);
                        } else if (motionEvent.getAction() == 0) {
                            LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanArr[0], this.fragment.getResourceProvider(), left, top, false);
                            this.pressedLink = linkSpanDrawable;
                            LinkSpanDrawable.LinkCollector linkCollector2 = this.links;
                            if (linkCollector2 != null) {
                                linkCollector2.addLink(linkSpanDrawable);
                            }
                            LinkPath obtainNewPath = this.pressedLink.obtainNewPath();
                            int spanStart = this.allTexts.getSpanStart(this.pressedLink.getSpan());
                            int spanEnd = this.allTexts.getSpanEnd(this.pressedLink.getSpan());
                            obtainNewPath.setCurrentLayout(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, obtainNewPath);
                        }
                        this.allTextsView.invalidate();
                        return true;
                    }
                }
                if (this.pressedLink != null) {
                    LinkSpanDrawable.LinkCollector linkCollector3 = this.links;
                    if (linkCollector3 != null) {
                        linkCollector3.clear();
                    }
                    this.pressedLink = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.scrollView.getGlobalVisibleRect(this.scrollRect);
            this.backButton.getGlobalVisibleRect(this.backRect);
            this.buttonView.getGlobalVisibleRect(this.buttonRect);
            if (this.pressedLink == null && !hasSelection()) {
                if (!this.backRect.contains(i, i2) && !this.buttonRect.contains(i, i2) && motionEvent.getAction() == 0) {
                    this.fromScrollRect = this.scrollRect.contains(i, i2) && (this.containerOpenAnimationT > 0.0f || !canExpand());
                    this.maybeScrolling = true;
                    if (this.scrollRect.contains(i, i2) && this.textsView.getBlocksCount() > 0 && !this.textsView.getBlockAt(0).loaded) {
                        z = true;
                    }
                    this.scrolling = z;
                    this.fromY = y;
                    this.fromScrollY = getScrollY();
                    this.fromScrollViewY = this.scrollView.getScrollY();
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                } else if (this.maybeScrolling && (motionEvent.getAction() == 2 || motionEvent.getAction() == 1)) {
                    float f2 = this.fromY - y;
                    if (this.fromScrollRect) {
                        f2 = -Math.max(0.0f, (-(this.fromScrollViewY + AndroidUtilities.m35dp(48.0f))) - f2);
                        if (f2 < 0.0f) {
                            this.scrolling = true;
                            this.allTextsView.setTextIsSelectable(false);
                        }
                    } else if (Math.abs(f2) > AndroidUtilities.m35dp(4.0f) && !this.fromScrollRect) {
                        this.scrolling = true;
                        this.allTextsView.setTextIsSelectable(false);
                        this.scrollView.stopNestedScroll();
                        this.allowScroll = false;
                    }
                    float f3 = AndroidUtilities.displayMetrics.heightPixels;
                    float min = Math.min(minHeight(), this.heightMaxPercent * f3);
                    float f4 = f3 - min;
                    float min2 = ((1.0f - (-Math.min(Math.max(this.fromScrollY, -1.0f), 0.0f))) * min) + (Math.min(1.0f, Math.max(this.fromScrollY, 0.0f)) * f4) + f2;
                    float f5 = min2 > min ? (min2 - min) / f4 : -(1.0f - (min2 / min));
                    if (!canExpand()) {
                        f5 = Math.min(f5, 0.0f);
                    }
                    updateCanExpand();
                    if (this.scrolling) {
                        setScrollY(f5);
                        if (motionEvent.getAction() == 1) {
                            this.scrolling = false;
                            this.allTextsView.setTextIsSelectable(!this.noforwards);
                            this.maybeScrolling = false;
                            this.allowScroll = true;
                            if (Math.abs(f2) > AndroidUtilities.m35dp(16.0f)) {
                                round = Math.round(this.fromScrollY) + ((f5 > this.fromScrollY ? 1.0f : -1.0f) * ((float) Math.ceil(Math.abs(f - f5))));
                            } else {
                                round = Math.round(this.fromScrollY);
                            }
                            scrollYTo(round, new Runnable() {
                                @Override
                                public final void run() {
                                    TranslateAlert.this.lambda$dispatchTouchEvent$4();
                                }
                            });
                        }
                        return true;
                    }
                }
            }
            if (hasSelection() && this.maybeScrolling) {
                this.scrolling = false;
                this.allTextsView.setTextIsSelectable(!this.noforwards);
                this.maybeScrolling = false;
                this.allowScroll = true;
                scrollYTo(Math.round(this.fromScrollY));
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public void lambda$dispatchTouchEvent$4() {
        this.contentView.post(new TranslateAlert$$ExternalSyntheticLambda8(this));
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.contentView.setPadding(0, 0, 0, 0);
        setContentView(this.contentView, new ViewGroup.LayoutParams(-1, -1));
        Window window = getWindow();
        window.setWindowAnimations(C1072R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.flags = i;
        int i2 = i | 131072;
        attributes.flags = i2;
        if (Build.VERSION.SDK_INT >= 21) {
            attributes.flags = i2 | (-2147417856);
        }
        attributes.flags |= 256;
        attributes.height = -1;
        window.setAttributes(attributes);
        int color = Theme.getColor("windowBackgroundWhite");
        AndroidUtilities.setNavigationBarColor(window, color);
        AndroidUtilities.setLightNavigationBar(window, ((double) AndroidUtilities.computePerceivedBrightness(color)) > 0.721d);
        this.container.forceLayout();
    }

    @Override
    public void show() {
        super.show();
        openAnimation(0.0f);
        openTo(1.0f, true, true);
    }

    @Override
    public void dismiss() {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        openTo(0.0f, true);
    }

    private void openTo(float f, boolean z) {
        openTo(f, z, false);
    }

    private void openTo(float f, boolean z, final boolean z2) {
        Runnable runnable;
        final float min = Math.min(Math.max(f, 0.0f), 1.0f);
        if (!this.openingAnimatorPriority || z) {
            this.openingAnimatorPriority = z;
            ValueAnimator valueAnimator = this.openingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.openingAnimator = ValueAnimator.ofFloat(this.openingT, min);
            this.backDrawable.setAlpha((int) (this.openingT * 51.0f));
            this.openingAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TranslateAlert.this.lambda$openTo$5(valueAnimator2);
                }
            });
            if (min <= 0.0f && (runnable = this.onDismiss) != null) {
                runnable.run();
            }
            this.openingAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    TranslateAlert.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (min <= 0.0f) {
                        TranslateAlert.this.dismissInternal();
                    } else if (z2) {
                        TranslateAlert.this.allTextsView.setTextIsSelectable(!TranslateAlert.this.noforwards);
                        TranslateAlert.this.allTextsView.invalidate();
                        TranslateAlert.this.scrollView.stopNestedScroll();
                        TranslateAlert.this.openAnimation(min - 1.0f);
                    }
                    TranslateAlert.this.openingAnimatorPriority = false;
                }
            });
            this.openingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.openingAnimator.setDuration(Math.abs(this.openingT - min) * (this.fastHide ? 200 : 380));
            this.openingAnimator.setStartDelay(z2 ? 60L : 0L);
            this.openingAnimator.start();
        }
    }

    public void lambda$openTo$5(ValueAnimator valueAnimator) {
        this.openingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.container.invalidate();
        this.backDrawable.setAlpha((int) (this.openingT * 51.0f));
        this.bulletinContainer.setTranslationY((1.0f - this.openingT) * Math.min(minHeight(), AndroidUtilities.displayMetrics.heightPixels * this.heightMaxPercent));
    }

    public void dismissInternal() {
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public String languageName(String str) {
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        LocaleController.LocaleInfo builtinLanguageByPlural = LocaleController.getInstance().getBuiltinLanguageByPlural(str);
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        if (builtinLanguageByPlural == null) {
            return null;
        }
        if (currentLocaleInfo != null && "en".equals(currentLocaleInfo.pluralLangCode)) {
            return builtinLanguageByPlural.nameEnglish;
        }
        return builtinLanguageByPlural.name;
    }

    public void updateSourceLanguage() {
        if (languageName(this.fromLanguage) != null) {
            this.subtitleView.setAlpha(1.0f);
            InlineLoadingTextView inlineLoadingTextView = this.subtitleFromView;
            if (inlineLoadingTextView.loaded) {
                return;
            }
            inlineLoadingTextView.loaded(languageName(this.fromLanguage));
        } else if (this.loaded) {
            this.subtitleView.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    private boolean fetchNext() {
        if (this.loading) {
            return false;
        }
        this.loading = true;
        if (this.blockIndex >= this.textBlocks.size()) {
            return false;
        }
        fetchTranslation(this.textBlocks.get(this.blockIndex), Math.min((this.blockIndex + 1) * 1000, 3500), new OnTranslationSuccess() {
            @Override
            public final void run(String str, String str2) {
                TranslateAlert.this.lambda$fetchNext$7(str, str2);
            }
        }, new OnTranslationFail() {
            @Override
            public final void run(boolean z) {
                TranslateAlert.this.lambda$fetchNext$8(z);
            }
        });
        return true;
    }

    public void lambda$fetchNext$7(String str, String str2) {
        TextView textView;
        URLSpan[] uRLSpanArr;
        URLSpan[] uRLSpanArr2;
        this.loaded = true;
        Spannable spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            MessageObject.addUrlsByPattern(false, spannableStringBuilder, false, 0, 0, true);
            for (final URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        {
                            TranslateAlert.this = this;
                        }

                        @Override
                        public void onClick(View view) {
                            if (TranslateAlert.this.onLinkPress != null) {
                                if (TranslateAlert.this.onLinkPress.run(uRLSpan)) {
                                    TranslateAlert.this.fastHide = true;
                                    TranslateAlert.this.dismiss();
                                    return;
                                }
                                return;
                            }
                            AlertsCreator.showOpenUrlAlert(TranslateAlert.this.fragment, uRLSpan.getURL(), false, false);
                        }

                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                            if (!(uRLSpan instanceof URLSpanNoUnderline)) {
                                textPaint.setUnderlineText(true);
                            }
                            textPaint.setColor(Theme.getColor("dialogTextLink"));
                            textPaint.setAlpha(min);
                        }
                    }, spanStart, spanEnd, 33);
                }
            }
            AndroidUtilities.addLinks(spannableStringBuilder, 1);
            for (final URLSpan uRLSpan2 : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart2 = spannableStringBuilder.getSpanStart(uRLSpan2);
                int spanEnd2 = spannableStringBuilder.getSpanEnd(uRLSpan2);
                if (spanStart2 != -1 && spanEnd2 != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan2);
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        {
                            TranslateAlert.this = this;
                        }

                        @Override
                        public void onClick(View view) {
                            AlertsCreator.showOpenUrlAlert(TranslateAlert.this.fragment, uRLSpan2.getURL(), false, false);
                        }

                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                            if (!(uRLSpan2 instanceof URLSpanNoUnderline)) {
                                textPaint.setUnderlineText(true);
                            }
                            textPaint.setColor(Theme.getColor("dialogTextLink"));
                            textPaint.setAlpha(min);
                        }
                    }, spanStart2, spanEnd2, 33);
                }
            }
            spannableStringBuilder = (Spannable) Emoji.replaceEmoji(spannableStringBuilder, this.allTextsView.getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(14.0f), false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        CharSequence charSequence = this.allTexts;
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
        if (this.blockIndex != 0) {
            spannableStringBuilder2.append((CharSequence) "\n");
        }
        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        this.allTexts = spannableStringBuilder2;
        this.textsView.setWholeText(spannableStringBuilder2);
        LoadingTextView2 blockAt = this.textsView.getBlockAt(this.blockIndex);
        if (blockAt != null) {
            blockAt.loaded(spannableStringBuilder, new Runnable() {
                @Override
                public final void run() {
                    TranslateAlert.this.lambda$fetchNext$6();
                }
            });
        }
        if (str2 != null) {
            this.fromLanguage = str2;
        }
        updateSourceLanguage();
        if (this.blockIndex == 0 && AndroidUtilities.isAccessibilityScreenReaderEnabled() && (textView = this.allTextsView) != null) {
            textView.requestFocus();
        }
        this.blockIndex++;
        this.loading = false;
    }

    public void lambda$fetchNext$6() {
        this.contentView.post(new TranslateAlert$$ExternalSyntheticLambda8(this));
    }

    public void lambda$fetchNext$8(boolean z) {
        if (z) {
            Toast.makeText(getContext(), LocaleController.getString("TranslationFailedAlert1", C1072R.string.TranslationFailedAlert1), 0).show();
        } else {
            Toast.makeText(getContext(), LocaleController.getString("TranslationFailedAlert2", C1072R.string.TranslationFailedAlert2), 0).show();
        }
        if (this.blockIndex == 0) {
            dismiss();
        }
    }

    public boolean checkForNextLoading() {
        if (scrollAtBottom()) {
            fetchNext();
            return true;
        }
        return false;
    }

    private void fetchTranslation(CharSequence charSequence, final long j, final OnTranslationSuccess onTranslationSuccess, final OnTranslationFail onTranslationFail) {
        final long currentTimeMillis = System.currentTimeMillis();
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                TranslateAlert.lambda$fetchTranslation$10(TranslateAlert.OnTranslationSuccess.this, onTranslationFail, currentTimeMillis, j, (String) obj);
            }
        };
        TLRPC$InputPeer tLRPC$InputPeer = this.peer;
        if (tLRPC$InputPeer != null) {
            translateText(this.currentAccount, tLRPC$InputPeer, this.msgId, this.fromLanguage, this.toLanguage, callback);
        } else if (charSequence != null) {
            translateText(this.currentAccount, charSequence.toString(), this.fromLanguage, this.toLanguage, callback);
        } else {
            onTranslationFail.run(false);
        }
    }

    public static void lambda$fetchTranslation$10(final OnTranslationSuccess onTranslationSuccess, final OnTranslationFail onTranslationFail, long j, long j2, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranslateAlert.lambda$fetchTranslation$9(str, onTranslationSuccess, onTranslationFail);
            }
        }, Math.max((System.currentTimeMillis() - j) - j2, 1L));
    }

    public static void lambda$fetchTranslation$9(String str, OnTranslationSuccess onTranslationSuccess, OnTranslationFail onTranslationFail) {
        if (str != null) {
            onTranslationSuccess.run(str, null);
        } else {
            onTranslationFail.run(false);
        }
    }

    private static void translateText(int i, TLRPC$InputPeer tLRPC$InputPeer, int i2, String str, String str2, final Utilities.Callback<String> callback) {
        if (callback == null) {
            return;
        }
        str = (str == null || str.equals("und")) ? null : null;
        TLRPC$TL_messages_translateText tLRPC$TL_messages_translateText = new TLRPC$TL_messages_translateText();
        tLRPC$TL_messages_translateText.peer = tLRPC$InputPeer;
        tLRPC$TL_messages_translateText.msg_id = i2;
        int i3 = tLRPC$TL_messages_translateText.flags | 1;
        tLRPC$TL_messages_translateText.flags = i3;
        if (str != null) {
            tLRPC$TL_messages_translateText.from_lang = str;
            tLRPC$TL_messages_translateText.flags = i3 | 4;
        }
        tLRPC$TL_messages_translateText.to_lang = str2;
        try {
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_translateText, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TranslateAlert.lambda$translateText$11(Utilities.Callback.this, tLObject, tLRPC$TL_error);
                }
            });
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public static void lambda$translateText$11(Utilities.Callback callback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_translateResultText) {
            callback.run(((TLRPC$TL_messages_translateResultText) tLObject).text);
        } else {
            callback.run(null);
        }
    }

    private static void translateText(int i, String str, String str2, String str3, final Utilities.Callback<String> callback) {
        if (callback == null) {
            return;
        }
        str2 = (str2 == null || str2.equals("und")) ? null : null;
        TLRPC$TL_messages_translateText tLRPC$TL_messages_translateText = new TLRPC$TL_messages_translateText();
        int i2 = tLRPC$TL_messages_translateText.flags | 2;
        tLRPC$TL_messages_translateText.flags = i2;
        tLRPC$TL_messages_translateText.text = str;
        if (str2 != null) {
            tLRPC$TL_messages_translateText.from_lang = str2;
            tLRPC$TL_messages_translateText.flags = i2 | 4;
        }
        tLRPC$TL_messages_translateText.to_lang = str3;
        try {
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_translateText, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TranslateAlert.lambda$translateText$12(Utilities.Callback.this, tLObject, tLRPC$TL_error);
                }
            });
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public static void lambda$translateText$12(Utilities.Callback callback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_translateResultText) {
            callback.run(((TLRPC$TL_messages_translateResultText) tLObject).text);
        } else {
            callback.run(null);
        }
    }

    public static TranslateAlert showAlert(Context context, BaseFragment baseFragment, int i, TLRPC$InputPeer tLRPC$InputPeer, int i2, String str, String str2, CharSequence charSequence, boolean z, OnLinkPress onLinkPress, Runnable runnable) {
        TranslateAlert translateAlert = new TranslateAlert(baseFragment, context, i, tLRPC$InputPeer, i2, str, str2, charSequence, z, onLinkPress, runnable);
        if (baseFragment != null) {
            if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(translateAlert);
            }
        } else {
            translateAlert.show();
        }
        return translateAlert;
    }

    public static TranslateAlert showAlert(Context context, BaseFragment baseFragment, String str, String str2, CharSequence charSequence, boolean z, OnLinkPress onLinkPress, Runnable runnable) {
        TranslateAlert translateAlert = new TranslateAlert(baseFragment, context, str, str2, charSequence, z, onLinkPress, runnable);
        if (baseFragment != null) {
            if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(translateAlert);
            }
        } else {
            translateAlert.show();
        }
        return translateAlert;
    }

    public static class TextBlocksLayout extends ViewGroup {
        private static final int gap = ((-LoadingTextView2.paddingVertical) * 4) + AndroidUtilities.m35dp(0.48f);
        private final int fontSize;
        private final int textColor;
        private TextView wholeTextView;

        protected void onHeightUpdated(int i) {
        }

        public TextBlocksLayout(Context context, int i, int i2, TextView textView) {
            super(context);
            this.fontSize = i;
            this.textColor = i2;
            if (textView != null) {
                int i3 = LoadingTextView2.paddingHorizontal;
                int i4 = LoadingTextView2.paddingVertical;
                textView.setPadding(i3, i4, i3, i4);
                this.wholeTextView = textView;
                addView(textView);
            }
        }

        public void setWholeText(CharSequence charSequence) {
            this.wholeTextView.clearFocus();
            this.wholeTextView.setText(charSequence);
        }

        public LoadingTextView2 addBlock(CharSequence charSequence) {
            LoadingTextView2 loadingTextView2 = new LoadingTextView2(getContext(), charSequence, getBlocksCount() > 0, this.fontSize, this.textColor);
            loadingTextView2.setFocusable(false);
            addView(loadingTextView2);
            TextView textView = this.wholeTextView;
            if (textView != null) {
                textView.bringToFront();
            }
            return loadingTextView2;
        }

        public int getBlocksCount() {
            return getChildCount() - (this.wholeTextView != null ? 1 : 0);
        }

        public LoadingTextView2 getBlockAt(int i) {
            View childAt = getChildAt(i);
            if (childAt instanceof LoadingTextView2) {
                return (LoadingTextView2) childAt;
            }
            return null;
        }

        public LoadingTextView2 getFirstUnloadedBlock() {
            int blocksCount = getBlocksCount();
            for (int i = 0; i < blocksCount; i++) {
                LoadingTextView2 blockAt = getBlockAt(i);
                if (blockAt != null && !blockAt.loaded) {
                    return blockAt;
                }
            }
            return null;
        }

        public int height() {
            int blocksCount = getBlocksCount();
            int i = 0;
            for (int i2 = 0; i2 < blocksCount; i2++) {
                i += getBlockAt(i2).height();
            }
            return getPaddingTop() + i + getPaddingBottom();
        }

        public void updateHeight() {
            int height = height();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, height);
            } else {
                r2 = layoutParams.height != height;
                layoutParams.height = height;
            }
            if (r2) {
                setLayoutParams(layoutParams);
                onHeightUpdated(height);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int blocksCount = getBlocksCount();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), View.MeasureSpec.getMode(i));
            for (int i3 = 0; i3 < blocksCount; i3++) {
                getBlockAt(i3).measure(makeMeasureSpec, TranslateAlert.MOST_SPEC);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(height(), 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int blocksCount = getBlocksCount();
            int i5 = 0;
            int i6 = 0;
            while (i5 < blocksCount) {
                LoadingTextView2 blockAt = getBlockAt(i5);
                int height = blockAt.height();
                int i7 = i5 > 0 ? gap : 0;
                blockAt.layout(getPaddingLeft(), getPaddingTop() + i6 + i7, (i3 - i) - getPaddingRight(), getPaddingTop() + i6 + height + i7);
                i6 += height;
                if (i5 > 0 && i5 < blocksCount - 1) {
                    i6 += gap;
                }
                i5++;
            }
            int i8 = i3 - i;
            this.wholeTextView.measure(View.MeasureSpec.makeMeasureSpec((i8 - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(((i4 - i2) - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.wholeTextView.layout(getPaddingLeft(), getPaddingTop(), i8 - getPaddingRight(), getPaddingTop() + this.wholeTextView.getMeasuredHeight());
        }
    }

    public static class InlineLoadingTextView extends ViewGroup {
        public static final int paddingHorizontal = AndroidUtilities.m35dp(6.0f);
        private final TextView fromTextView;
        private final float gradientWidth;
        private final Path inPath;
        public boolean loaded;
        private ValueAnimator loadedAnimator;
        private final ValueAnimator loadingAnimator;
        private final Paint loadingPaint;
        private final Path loadingPath;
        public float loadingT;
        private final RectF rect;
        private final Path shadePath;
        public boolean showLoadingText;
        private final long start;
        private final Path tempPath;
        private final TextView toTextView;

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        protected void onLoadAnimation(float f) {
        }

        public InlineLoadingTextView(Context context, CharSequence charSequence, int i, int i2) {
            super(context);
            this.showLoadingText = true;
            this.start = SystemClock.elapsedRealtime();
            this.loaded = false;
            this.loadingT = 0.0f;
            this.loadedAnimator = null;
            this.rect = new RectF();
            this.inPath = new Path();
            this.tempPath = new Path();
            this.loadingPath = new Path();
            this.shadePath = new Path();
            Paint paint = new Paint();
            this.loadingPaint = paint;
            float m35dp = AndroidUtilities.m35dp(350.0f);
            this.gradientWidth = m35dp;
            int i3 = paddingHorizontal;
            setPadding(i3, 0, i3, 0);
            setClipChildren(false);
            setWillNotDraw(false);
            TextView textView = new TextView(this, context) {
                @Override
                protected void onMeasure(int i4, int i5) {
                    super.onMeasure(TranslateAlert.MOST_SPEC, TranslateAlert.MOST_SPEC);
                }
            };
            this.fromTextView = textView;
            float f = i;
            textView.setTextSize(0, f);
            textView.setTextColor(i2);
            textView.setText(charSequence);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(null);
            textView.setFocusable(false);
            textView.setImportantForAccessibility(2);
            addView(textView);
            TextView textView2 = new TextView(this, context) {
                @Override
                protected void onMeasure(int i4, int i5) {
                    super.onMeasure(TranslateAlert.MOST_SPEC, TranslateAlert.MOST_SPEC);
                }
            };
            this.toTextView = textView2;
            textView2.setTextSize(0, f);
            textView2.setTextColor(i2);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(null);
            textView2.setFocusable(true);
            addView(textView2);
            int color = Theme.getColor("dialogBackground");
            paint.setShader(new LinearGradient(0.0f, 0.0f, m35dp, 0.0f, new int[]{color, Theme.getColor("dialogBackgroundGray"), color}, new float[]{0.0f, 0.67f, 1.0f}, Shader.TileMode.REPEAT));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.loadingAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TranslateAlert.InlineLoadingTextView.this.lambda$new$0(valueAnimator);
                }
            });
            ofFloat.setDuration(Long.MAX_VALUE);
            ofFloat.start();
        }

        public void lambda$new$0(ValueAnimator valueAnimator) {
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.fromTextView.measure(0, 0);
            this.toTextView.measure(0, 0);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(this.fromTextView.getMeasuredWidth(), this.toTextView.getMeasuredWidth(), this.loadingT) + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.fromTextView.getMeasuredHeight(), this.toTextView.getMeasuredHeight()), 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.fromTextView.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + this.fromTextView.getMeasuredWidth(), getPaddingTop() + this.fromTextView.getMeasuredHeight());
            this.toTextView.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + this.toTextView.getMeasuredWidth(), getPaddingTop() + this.toTextView.getMeasuredHeight());
            updateWidth();
        }

        private void updateWidth() {
            int lerp = AndroidUtilities.lerp(this.fromTextView.getMeasuredWidth(), this.toTextView.getMeasuredWidth(), this.loadingT) + getPaddingLeft() + getPaddingRight();
            int max = Math.max(this.fromTextView.getMeasuredHeight(), this.toTextView.getMeasuredHeight());
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            boolean z = true;
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(lerp, max);
            } else {
                if (layoutParams.width == lerp && layoutParams.height == max) {
                    z = false;
                }
                layoutParams.width = lerp;
                layoutParams.height = max;
            }
            if (z) {
                setLayoutParams(layoutParams);
            }
        }

        public void loaded(CharSequence charSequence) {
            loaded(charSequence, 350L, null);
        }

        public void loaded(CharSequence charSequence, long j, final Runnable runnable) {
            this.loaded = true;
            this.toTextView.setText(charSequence);
            if (this.loadingAnimator.isRunning()) {
                this.loadingAnimator.cancel();
            }
            if (this.loadedAnimator == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.loadedAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TranslateAlert.InlineLoadingTextView.this.lambda$loaded$1(valueAnimator);
                    }
                });
                this.loadedAnimator.addListener(new AnimatorListenerAdapter(this) {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                this.loadedAnimator.setDuration(j);
                this.loadedAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                this.loadedAnimator.start();
            }
        }

        public void lambda$loaded$1(ValueAnimator valueAnimator) {
            this.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateWidth();
            invalidate();
            onLoadAnimation(this.loadingT);
        }

        public void set(CharSequence charSequence) {
            this.loaded = true;
            this.toTextView.setText(charSequence);
            if (this.loadingAnimator.isRunning()) {
                this.loadingAnimator.cancel();
            }
            ValueAnimator valueAnimator = this.loadedAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.loadedAnimator = null;
            }
            this.loadingT = 1.0f;
            requestLayout();
            updateWidth();
            invalidate();
            onLoadAnimation(1.0f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            float max = LocaleController.isRTL ? Math.max(width / 2.0f, width - 8.0f) : Math.min(width / 2.0f, 8.0f);
            float min = Math.min(height / 2.0f, 8.0f);
            float f = max * max;
            float f2 = min * min;
            float f3 = width - max;
            float f4 = f3 * f3;
            float f5 = height - min;
            float f6 = f5 * f5;
            float sqrt = this.loadingT * ((float) Math.sqrt(Math.max(Math.max(f + f2, f2 + f4), Math.max(f + f6, f4 + f6))));
            this.inPath.reset();
            this.inPath.addCircle(max, min, sqrt, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(this.inPath, Region.Op.DIFFERENCE);
            this.loadingPaint.setAlpha((int) ((1.0f - this.loadingT) * 255.0f));
            float f7 = this.gradientWidth;
            float f8 = this.gradientWidth;
            float elapsedRealtime = f7 - (((((float) (SystemClock.elapsedRealtime() - this.start)) / 1000.0f) * f8) % f8);
            this.shadePath.reset();
            this.shadePath.addRect(0.0f, 0.0f, width, height, Path.Direction.CW);
            this.loadingPath.reset();
            this.rect.set(0.0f, 0.0f, width, height);
            this.loadingPath.addRoundRect(this.rect, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), Path.Direction.CW);
            canvas.clipPath(this.loadingPath);
            canvas.translate(-elapsedRealtime, 0.0f);
            this.shadePath.offset(elapsedRealtime, 0.0f, this.tempPath);
            canvas.drawPath(this.tempPath, this.loadingPaint);
            canvas.translate(elapsedRealtime, 0.0f);
            canvas.restore();
            if (this.showLoadingText && this.fromTextView != null) {
                canvas.save();
                this.rect.set(0.0f, 0.0f, width, height);
                canvas.clipPath(this.inPath, Region.Op.DIFFERENCE);
                canvas.translate(paddingHorizontal, 0.0f);
                canvas.saveLayerAlpha(this.rect, 20, 31);
                this.fromTextView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            if (this.toTextView != null) {
                canvas.save();
                canvas.clipPath(this.inPath);
                canvas.translate(paddingHorizontal, 0.0f);
                canvas.saveLayerAlpha(this.rect, (int) (this.loadingT * 255.0f), 31);
                this.toTextView.draw(canvas);
                if (this.loadingT < 1.0f) {
                    canvas.restore();
                }
                canvas.restore();
            }
        }
    }

    public static class LoadingTextView2 extends ViewGroup {
        public static final int paddingHorizontal = AndroidUtilities.m35dp(6.0f);
        public static final int paddingVertical = AndroidUtilities.m35dp(1.5f);
        private RectF fetchedPathRect;
        private final TextView fromTextView;
        private final float gradientWidth;
        private final Path inPath;
        int lastWidth;
        public boolean loaded;
        private ValueAnimator loadedAnimator;
        private final ValueAnimator loadingAnimator;
        private final Paint loadingPaint;
        private final Path loadingPath;
        private float loadingT;
        private final RectF rect;
        private float scaleT;
        private final Path shadePath;
        public boolean showLoadingText;
        private final long start;
        private final Path tempPath;
        private final TextView toTextView;

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        public LoadingTextView2(Context context, CharSequence charSequence, final boolean z, int i, int i2) {
            super(context);
            this.showLoadingText = true;
            this.start = SystemClock.elapsedRealtime();
            this.scaleT = 1.0f;
            this.loaded = false;
            this.loadingT = 0.0f;
            this.loadedAnimator = null;
            this.lastWidth = 0;
            this.fetchedPathRect = new RectF();
            this.rect = new RectF();
            this.inPath = new Path();
            this.tempPath = new Path();
            this.loadingPath = new Path();
            this.shadePath = new Path();
            Paint paint = new Paint();
            this.loadingPaint = paint;
            float m35dp = AndroidUtilities.m35dp(350.0f);
            this.gradientWidth = m35dp;
            int i3 = paddingHorizontal;
            int i4 = paddingVertical;
            setPadding(i3, i4, i3, i4);
            setClipChildren(false);
            setWillNotDraw(false);
            setFocusable(false);
            TextView textView = new TextView(this, context) {
                @Override
                protected void onMeasure(int i5, int i6) {
                    super.onMeasure(i5, TranslateAlert.MOST_SPEC);
                }
            };
            this.fromTextView = textView;
            float f = i;
            textView.setTextSize(0, f);
            textView.setTextColor(i2);
            textView.setText(charSequence);
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setEllipsize(null);
            textView.setFocusable(false);
            textView.setImportantForAccessibility(2);
            addView(textView);
            TextView textView2 = new TextView(this, context) {
                @Override
                protected void onMeasure(int i5, int i6) {
                    super.onMeasure(i5, TranslateAlert.MOST_SPEC);
                }
            };
            this.toTextView = textView2;
            textView2.setTextSize(0, f);
            textView2.setTextColor(i2);
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setFocusable(false);
            textView2.setImportantForAccessibility(2);
            addView(textView2);
            int color = Theme.getColor("dialogBackground");
            paint.setShader(new LinearGradient(0.0f, 0.0f, m35dp, 0.0f, new int[]{color, Theme.getColor("dialogBackgroundGray"), color}, new float[]{0.0f, 0.67f, 1.0f}, Shader.TileMode.REPEAT));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.loadingAnimator = ofFloat;
            if (z) {
                this.scaleT = 0.0f;
            }
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TranslateAlert.LoadingTextView2.this.lambda$new$0(z, valueAnimator);
                }
            });
            ofFloat.setDuration(Long.MAX_VALUE);
            ofFloat.start();
        }

        public void lambda$new$0(boolean z, ValueAnimator valueAnimator) {
            invalidate();
            if (z) {
                boolean z2 = this.scaleT < 1.0f;
                this.scaleT = Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.start)) / 400.0f);
                if (z2) {
                    updateHeight();
                }
            }
        }

        public int innerHeight() {
            return (int) (AndroidUtilities.lerp(this.fromTextView.getMeasuredHeight(), this.toTextView.getMeasuredHeight(), this.loadingT) * this.scaleT);
        }

        public int height() {
            return getPaddingTop() + innerHeight() + getPaddingBottom();
        }

        private void updateHeight() {
            ViewParent parent = getParent();
            if (parent instanceof TextBlocksLayout) {
                ((TextBlocksLayout) parent).updateHeight();
            }
        }

        public void loaded(CharSequence charSequence, final Runnable runnable) {
            this.loaded = true;
            this.toTextView.setText(charSequence);
            layout();
            if (this.loadingAnimator.isRunning()) {
                this.loadingAnimator.cancel();
            }
            if (this.loadedAnimator == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.loadedAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TranslateAlert.LoadingTextView2.this.lambda$loaded$1(valueAnimator);
                    }
                });
                this.loadedAnimator.addListener(new AnimatorListenerAdapter(this) {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                this.loadedAnimator.setDuration(350L);
                this.loadedAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                this.loadedAnimator.start();
            }
        }

        public void lambda$loaded$1(ValueAnimator valueAnimator) {
            this.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateHeight();
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            if (this.fromTextView.getMeasuredWidth() <= 0 || this.lastWidth != paddingLeft) {
                measureChild(this.fromTextView, paddingLeft);
                updateLoadingPath();
            }
            if (this.toTextView.getMeasuredWidth() <= 0 || this.lastWidth != paddingLeft) {
                measureChild(this.toTextView, paddingLeft);
            }
            this.lastWidth = paddingLeft;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(height(), 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            layout(((i3 - i) - getPaddingLeft()) - getPaddingRight(), true);
        }

        private void layout(int i, boolean z) {
            if (this.lastWidth != i || z) {
                this.lastWidth = i;
                layout(i);
            }
        }

        private void layout(int i) {
            measureChild(this.fromTextView, i);
            layoutChild(this.fromTextView, i);
            updateLoadingPath();
            measureChild(this.toTextView, i);
            layoutChild(this.toTextView, i);
            updateHeight();
        }

        private void layout() {
            layout(this.lastWidth);
        }

        private void measureChild(View view, int i) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), TranslateAlert.MOST_SPEC);
        }

        private void layoutChild(View view, int i) {
            view.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + i, getPaddingTop() + view.getMeasuredHeight());
        }

        private void updateLoadingPath() {
            boolean z;
            TextView textView = this.fromTextView;
            if (textView == null || textView.getMeasuredWidth() <= 0) {
                return;
            }
            this.loadingPath.reset();
            Layout layout = this.fromTextView.getLayout();
            if (layout != null) {
                CharSequence text = layout.getText();
                int lineCount = layout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    float lineLeft = layout.getLineLeft(i);
                    float lineRight = layout.getLineRight(i);
                    float min = Math.min(lineLeft, lineRight);
                    float max = Math.max(lineLeft, lineRight);
                    int lineStart = layout.getLineStart(i);
                    int lineEnd = layout.getLineEnd(i);
                    while (true) {
                        if (lineStart >= lineEnd) {
                            z = false;
                            break;
                        }
                        char charAt = text.charAt(lineStart);
                        if (charAt != '\n' && charAt != '\t' && charAt != ' ') {
                            z = true;
                            break;
                        }
                        lineStart++;
                    }
                    if (z) {
                        RectF rectF = this.fetchedPathRect;
                        int i2 = paddingHorizontal;
                        int lineTop = layout.getLineTop(i);
                        int i3 = paddingVertical;
                        rectF.set(min - i2, lineTop - i3, max + i2, layout.getLineBottom(i) + i3);
                        this.loadingPath.addRoundRect(this.fetchedPathRect, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), Path.Direction.CW);
                    }
                }
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            float max = LocaleController.isRTL ? Math.max(width / 2.0f, width - 8.0f) : Math.min(width / 2.0f, 8.0f);
            float min = Math.min(height / 2.0f, 8.0f);
            float f = max * max;
            float f2 = min * min;
            float f3 = width - max;
            float f4 = f3 * f3;
            float f5 = height - min;
            float f6 = f5 * f5;
            float sqrt = this.loadingT * ((float) Math.sqrt(Math.max(Math.max(f + f2, f2 + f4), Math.max(f + f6, f4 + f6))));
            this.inPath.reset();
            this.inPath.addCircle(max, min, sqrt, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(this.inPath, Region.Op.DIFFERENCE);
            this.loadingPaint.setAlpha((int) ((1.0f - this.loadingT) * 255.0f));
            float f7 = this.gradientWidth;
            float f8 = this.gradientWidth;
            float elapsedRealtime = f7 - (((((float) (SystemClock.elapsedRealtime() - this.start)) / 1000.0f) * f8) % f8);
            this.shadePath.reset();
            this.shadePath.addRect(0.0f, 0.0f, width, height, Path.Direction.CW);
            int i = paddingHorizontal;
            int i2 = paddingVertical;
            canvas.translate(i, i2);
            canvas.clipPath(this.loadingPath);
            canvas.translate(-i, -i2);
            canvas.translate(-elapsedRealtime, 0.0f);
            this.shadePath.offset(elapsedRealtime, 0.0f, this.tempPath);
            canvas.drawPath(this.tempPath, this.loadingPaint);
            canvas.translate(elapsedRealtime, 0.0f);
            canvas.restore();
            if (this.showLoadingText && this.fromTextView != null) {
                canvas.save();
                this.rect.set(0.0f, 0.0f, width, height);
                canvas.clipPath(this.inPath, Region.Op.DIFFERENCE);
                canvas.translate(i, i2);
                canvas.saveLayerAlpha(this.rect, 20, 31);
                this.fromTextView.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            if (this.toTextView != null) {
                canvas.save();
                canvas.clipPath(this.inPath);
                canvas.translate(i, i2);
                canvas.saveLayerAlpha(this.rect, (int) (this.loadingT * 255.0f), 31);
                this.toTextView.draw(canvas);
                if (this.loadingT < 1.0f) {
                    canvas.restore();
                }
                canvas.restore();
            }
        }
    }
}
