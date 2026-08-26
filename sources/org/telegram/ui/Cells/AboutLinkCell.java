package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.ChangeUsernameActivity;
import org.telegram.ui.ChatEditTypeActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiView$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeSetUrlActivity;

public abstract class AboutLinkCell extends FrameLayout {
    public static final int COLLAPSED_HEIGHT = AndroidUtilities.dp(76.0f);
    public static final int MOST_SPEC = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final float SPACE;
    public SpannableStringBuilder accessibilityText;
    public final FrameLayout bottomShadow;
    public ValueAnimator collapseAnimator;
    public final FrameLayout container;
    public LoadingDrawable currentLoading;
    public AnonymousClass3 currentProgress;
    public float expandT;
    public StaticLayout firstThreeLinesLayout;
    public int lastInlineLine;
    public int lastMaxWidth;
    public final LinkSpanDrawable.LinkCollector links;
    public final AnonymousClass2 longPressedRunnable;
    public boolean moreButtonDisabled;
    public boolean needSpace;
    public StaticLayout[] nextLinesLayouts;
    public Point[] nextLinesLayoutsPositions;
    public String oldText;
    public final BaseFragment parentFragment;
    public LinkSpanDrawable pressedLink;
    public StaticLayout pressedLinkLayout;
    public float pressedLinkYOffset;
    public final Theme.ResourcesProvider resourcesProvider;
    public final BaseCell.RippleDrawableSafe rippleBackground;
    public boolean shouldExpand;
    public final Drawable showMoreBackgroundDrawable;
    public final FrameLayout showMoreTextBackgroundView;
    public final AnonymousClass1 showMoreTextView;
    public SpannableStringBuilder stringBuilder;
    public StaticLayout textLayout;
    public int textX;
    public int textY;
    public final TextView valueTextView;

    public final class AnonymousClass1 extends TextView {
        public boolean pressed;

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.pressed) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_urlPaint);
            }
            super.onDraw(canvas);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z = this.pressed;
            if (motionEvent.getAction() == 0) {
                this.pressed = true;
            } else if (motionEvent.getAction() != 2) {
                this.pressed = false;
            }
            if (z != this.pressed) {
                invalidate();
            }
            return this.pressed || super.onTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass2 implements Runnable {
        public final ProfileActivity.ListAdapter.AnonymousClass2 this$0;

        public AnonymousClass2(ProfileActivity.ListAdapter.AnonymousClass2 anonymousClass2) {
            this.this$0 = anonymousClass2;
        }

        @Override
        public final void run() {
            String url;
            ProfileActivity.ListAdapter.AnonymousClass2 anonymousClass2 = this.this$0;
            LinkSpanDrawable linkSpanDrawable = anonymousClass2.pressedLink;
            if (linkSpanDrawable != null) {
                CharacterStyle characterStyle = linkSpanDrawable.mSpan;
                if (characterStyle instanceof URLSpanNoUnderline) {
                    url = ((URLSpanNoUnderline) characterStyle).getURL();
                } else {
                    url = characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                }
                final String str = url;
                try {
                    anonymousClass2.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                final StaticLayout staticLayout = anonymousClass2.pressedLinkLayout;
                final float f = anonymousClass2.pressedLinkYOffset;
                if (anonymousClass2.getContext() != null) {
                    final ClickableSpan clickableSpan = (ClickableSpan) anonymousClass2.pressedLink.mSpan;
                    BottomSheet bottomSheet = new BottomSheet(anonymousClass2.getContext(), null, false, false);
                    bottomSheet.fixNavigationBar();
                    bottomSheet.title = str;
                    bottomSheet.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ProfileActivity.ListAdapter.AnonymousClass2 anonymousClass3 = this.f$0.this$0;
                            if (i == 0) {
                                anonymousClass3.onLinkClick(clickableSpan, staticLayout, f);
                                return;
                            }
                            if (i == 1) {
                                String str2 = str;
                                AndroidUtilities.addToClipboard(str2);
                                if (AndroidUtilities.shouldShowClipboardToast()) {
                                    if (str2.startsWith("@")) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UsernameCopied, BulletinFactory.of(anonymousClass3.parentFragment), R.raw.copy, 36);
                                    } else if (str2.startsWith("#") || str2.startsWith("$")) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.HashtagCopied, BulletinFactory.of(anonymousClass3.parentFragment), R.raw.copy, 36);
                                    } else {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkCopied, BulletinFactory.of(anonymousClass3.parentFragment), R.raw.copy, 36);
                                    }
                                }
                            }
                        }
                    };
                    bottomSheet.items = charSequenceArr;
                    bottomSheet.onClickListener = onClickListener;
                    bottomSheet.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 5));
                    bottomSheet.show();
                }
                anonymousClass2.pressedLink = null;
            }
        }
    }

    public final class AnonymousClass3 extends Browser.Progress {
        public LoadingDrawable thisLoading;
        public final Layout val$layout;
        public final ClickableSpan val$pressedLink;
        public final float val$yOffset;

        public AnonymousClass3(Layout layout, ClickableSpan clickableSpan, float f) {
            this.val$layout = layout;
            this.val$pressedLink = clickableSpan;
            this.val$yOffset = f;
        }

        @Override
        public final void end(boolean z) {
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda3(this, 24), z ? 0L : 350L);
        }

        @Override
        public final void init() {
            AboutLinkCell aboutLinkCell = AboutLinkCell.this;
            LoadingDrawable loadingDrawable = aboutLinkCell.currentLoading;
            if (loadingDrawable != null) {
                aboutLinkCell.links.removeLoading(loadingDrawable, true);
            }
            LoadingDrawable loadingDrawableMakeLoading = LinkSpanDrawable.LinkCollector.makeLoading(this.val$layout, this.val$pressedLink, this.val$yOffset);
            this.thisLoading = loadingDrawableMakeLoading;
            aboutLinkCell.currentLoading = loadingDrawableMakeLoading;
            int color = Theme.getColor(Theme.key_chat_linkSelectBackground, aboutLinkCell.resourcesProvider);
            ProfileActivity.this.getClass();
            this.thisLoading.setColors(Theme.multAlpha(0.8f, color), Theme.multAlpha(1.3f, color), Theme.multAlpha(1.0f, color), Theme.multAlpha(4.0f, color));
            this.thisLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
            aboutLinkCell.links.addLoading(this.thisLoading, null);
        }
    }

    public final class AnonymousClass5 extends ClickableSpan {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$original;

        public AnonymousClass5(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$original = obj2;
        }

        @Override
        public final void onClick(View view) {
            switch (this.$r8$classId) {
                case 0:
                    AboutLinkCell aboutLinkCell = (AboutLinkCell) this.this$0;
                    aboutLinkCell.onLinkClick((ClickableSpan) this.val$original, aboutLinkCell.textLayout, 0.0f);
                    break;
                case 1:
                    ChatActionCell chatActionCell = (ChatActionCell) this.this$0;
                    if (chatActionCell.delegate != null) {
                        chatActionCell.openLink((CharacterStyle) this.val$original);
                    }
                    break;
                case 2:
                    CharacterStyle characterStyle = (CharacterStyle) this.val$original;
                    if (!(characterStyle instanceof ChatMessageCell.MessageAccessibilityNodeProvider.ProfileSpan)) {
                        ChatMessageCell chatMessageCell = ChatMessageCell.this;
                        ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = chatMessageCell.delegate;
                        if (chatMessageCellDelegate != null) {
                            chatMessageCellDelegate.didPressUrl(chatMessageCell, characterStyle, false);
                        }
                    } else {
                        ((ChatMessageCell.MessageAccessibilityNodeProvider.ProfileSpan) characterStyle).onClick(view);
                    }
                    break;
                case 3:
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.val$original));
                        if (BulletinFactory.canShowBulletin((ChangeUsernameActivity) this.this$0)) {
                            BulletinFactory.of((ChangeUsernameActivity) this.this$0).createCopyLinkBulletin(false).show();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                    break;
                case 4:
                    Browser.openUrl(((CheckBoxCell.AnonymousClass2) this.this$0).getContext(), "https://fragment.com/username/" + ((String) this.val$original));
                    break;
                case 5:
                    Browser.openUrl(((ChatEditTypeActivity.AnonymousClass6) this.this$0).getContext(), "https://fragment.com/username/" + ((String) this.val$original));
                    break;
                case 6:
                    ((EmojiView$2$$ExternalSyntheticLambda1) this.this$0).run();
                    break;
                case 7:
                    AndroidUtilities.addToClipboard((CharSequence) this.val$original);
                    ((Runnable) this.this$0).run();
                    break;
                default:
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.val$original));
                        if (BulletinFactory.canShowBulletin((ThemeSetUrlActivity) this.this$0)) {
                            BulletinFactory.of((ThemeSetUrlActivity) this.this$0).createCopyLinkBulletin(false).show();
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                    break;
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            switch (this.$r8$classId) {
                case 3:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    break;
                case 4:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    break;
                case 5:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    break;
                case 6:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(Theme.getColor(Theme.key_undo_cancelColor, (Theme.ResourcesProvider) this.val$original));
                    break;
                case 7:
                    textPaint.setColor(textPaint.linkColor);
                    break;
                case 8:
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    break;
                default:
                    super.updateDrawState(textPaint);
                    break;
            }
        }

        public AnonymousClass5(Object obj, Runnable runnable, int i) {
            this.$r8$classId = i;
            this.val$original = obj;
            this.this$0 = runnable;
        }

        public AnonymousClass5(String str, BaseFragment baseFragment, int i) {
            this.$r8$classId = i;
            this.this$0 = baseFragment;
            this.val$original = str;
        }
    }

    public final class SpringInterpolator {
        public float position;
        public float velocity;
    }

    public AboutLinkCell(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        new Point();
        new LinkPath(0);
        this.nextLinesLayouts = null;
        this.lastInlineLine = -1;
        this.needSpace = false;
        Paint paint = new Paint();
        this.SPACE = AndroidUtilities.dp(3.0f);
        this.longPressedRunnable = new AnonymousClass2((ProfileActivity.ListAdapter.AnonymousClass2) this);
        this.expandT = 0.0f;
        this.lastMaxWidth = 0;
        this.shouldExpand = false;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = baseFragment;
        FrameLayout frameLayout = new FrameLayout(context);
        this.container = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.links = new LinkSpanDrawable.LinkCollector(frameLayout);
        this.rippleBackground = Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 0, 0);
        TextView textView = new TextView(context);
        this.valueTextView = textView;
        textView.setVisibility(8);
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView, 13.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bottomShadow = frameLayout2;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i = Theme.key_windowBackgroundWhite;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(drawableMutate);
        addView(frameLayout2, LayoutHelper.createFrame(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 55));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        anonymousClass1.pressed = false;
        this.showMoreTextView = anonymousClass1;
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
        anonymousClass1.setTextSize(1, 16.0f);
        anonymousClass1.setLines(1);
        anonymousClass1.setMaxLines(1);
        anonymousClass1.setSingleLine(true);
        anonymousClass1.setText(LocaleController.getString(R.string.DescriptionMore));
        anonymousClass1.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38((ProfileActivity.ListAdapter.AnonymousClass2) this, 18));
        anonymousClass1.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.showMoreTextBackgroundView = frameLayout3;
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.showMoreBackgroundDrawable = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(drawableMutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView(anonymousClass1, LayoutHelper.createFrame(-2.0f, -2));
        addView(frameLayout3, LayoutHelper.createFrame(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(Theme.getColor(i, resourcesProvider));
        setWillNotDraw(false);
    }

    public static StaticLayout makeTextLayout(int i, CharSequence charSequence) {
        Layout.Alignment alignmentALIGN_RIGHT;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, Theme.profile_aboutTextPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), Theme.profile_aboutTextPaint, Math.max(1, i)).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignmentALIGN_RIGHT = StaticLayoutEx.ALIGN_RIGHT();
        } else {
            Layout.Alignment[] alignmentArr = StaticLayoutEx.alignments;
            alignmentALIGN_RIGHT = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignmentALIGN_RIGHT).build();
    }

    private void setHeight(int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getLayoutParams();
        boolean z = true;
        if (layoutParams == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            layoutParams = new RecyclerView.LayoutParams(-1, i);
        } else {
            z = ((ViewGroup.MarginLayoutParams) layoutParams).height != i;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = i;
        }
        if (z) {
            setLayoutParams(layoutParams);
        }
    }

    private void setShowMoreMarginBottom(int i) {
        FrameLayout frameLayout = this.showMoreTextBackgroundView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i) {
            layoutParams.bottomMargin = i;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void checkTextLayout(int i, boolean z) {
        if (this.moreButtonDisabled) {
            this.shouldExpand = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.stringBuilder;
        FrameLayout frameLayout = this.container;
        AnonymousClass1 anonymousClass1 = this.showMoreTextView;
        if (spannableStringBuilder != null && (i != this.lastMaxWidth || z)) {
            StaticLayout staticLayoutMakeTextLayout = makeTextLayout(i, spannableStringBuilder);
            this.textLayout = staticLayoutMakeTextLayout;
            this.shouldExpand = staticLayoutMakeTextLayout.getLineCount() >= 4;
            int lineCount = this.textLayout.getLineCount();
            FrameLayout frameLayout2 = this.showMoreTextBackgroundView;
            if (lineCount >= 3 && this.shouldExpand) {
                int iMax = Math.max(this.textLayout.getLineStart(2), this.textLayout.getLineEnd(2));
                if (this.stringBuilder.charAt(iMax - 1) == '\n') {
                    iMax--;
                }
                int i2 = iMax - 1;
                this.needSpace = (this.stringBuilder.charAt(i2) == ' ' || this.stringBuilder.charAt(i2) == '\n') ? false : true;
                this.firstThreeLinesLayout = makeTextLayout(i, this.stringBuilder.subSequence(0, iMax));
                this.nextLinesLayouts = new StaticLayout[this.textLayout.getLineCount() - 3];
                this.nextLinesLayoutsPositions = new Point[this.textLayout.getLineCount() - 3];
                float lineRight = this.firstThreeLinesLayout.getLineRight(this.firstThreeLinesLayout.getLineCount() - 1);
                boolean z2 = this.needSpace;
                float f = this.SPACE;
                float lineRight2 = lineRight + (z2 ? f : 0.0f);
                this.lastInlineLine = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i3 = MOST_SPEC;
                    frameLayout2.measure(i3, i3);
                }
                for (int i4 = 3; i4 < this.textLayout.getLineCount(); i4++) {
                    int lineStart = this.textLayout.getLineStart(i4);
                    int lineEnd = this.textLayout.getLineEnd(i4);
                    StaticLayout staticLayoutMakeTextLayout2 = makeTextLayout(i, this.stringBuilder.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i5 = i4 - 3;
                    this.nextLinesLayouts[i5] = staticLayoutMakeTextLayout2;
                    this.nextLinesLayoutsPositions[i5] = new Point();
                    if (this.lastInlineLine == -1) {
                        if (lineRight2 > frameLayout2.getPaddingLeft() + (i - frameLayout2.getMeasuredWidth())) {
                            this.lastInlineLine = i5;
                        }
                    }
                    lineRight2 += staticLayoutMakeTextLayout2.getLineRight(0) + f;
                }
                if (lineRight2 < frameLayout2.getPaddingLeft() + (i - frameLayout2.getMeasuredWidth())) {
                    this.shouldExpand = false;
                }
            }
            if (!this.shouldExpand) {
                this.firstThreeLinesLayout = null;
                this.nextLinesLayouts = null;
            }
            this.lastMaxWidth = i;
            frameLayout.setMinimumHeight(textHeight());
            if (this.shouldExpand && this.firstThreeLinesLayout != null) {
                int iMin = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.firstThreeLinesLayout;
                setShowMoreMarginBottom((((iMin - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - anonymousClass1.getPaddingBottom()) - (anonymousClass1.getLayout() == null ? 0 : anonymousClass1.getLayout().getHeight() - anonymousClass1.getLayout().getLineBottom(anonymousClass1.getLineCount() - 1)));
            }
        }
        anonymousClass1.setVisibility(this.shouldExpand ? 0 : 8);
        if (!this.shouldExpand && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.rippleBackground);
        }
        if (!this.shouldExpand || this.expandT >= 1.0f || frameLayout.getBackground() == null) {
            return;
        }
        frameLayout.setBackground(null);
    }

    public final LinkSpanDrawable checkTouchTextLayout(StaticLayout staticLayout, int i, int i2, int i3, int i4) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i6);
            float f = i5;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f || lineLeft + staticLayout.getLineWidth(lineForVertical) < f || i6 < 0 || i6 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return null;
            }
            LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanArr[0], resourcesProvider, i3, i4);
            linkSpanDrawable.setColor(Theme.getColor(Theme.key_chat_linkSelectBackground, resourcesProvider));
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
            float f2 = i2;
            this.pressedLinkYOffset = f2;
            linkPathObtainNewPath.setCurrentLayout(staticLayout, spanStart, 0.0f, f2);
            staticLayout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
            return linkSpanDrawable;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float fPow;
        float f4;
        StaticLayout staticLayout;
        int i;
        super.draw(canvas);
        View view = (View) getParent();
        float fPow2 = view == null ? 1.0f : (float) Math.pow(view.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(18.0f), getHeight());
        int iDp = AndroidUtilities.dp(18.0f);
        this.textX = iDp;
        float f5 = 0.0f;
        canvas.translate(iDp, 0.0f);
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null && linkCollector.draw(canvas)) {
            invalidate();
        }
        int iDp2 = AndroidUtilities.dp(8.0f);
        this.textY = iDp2;
        canvas.translate(0.0f, iDp2);
        try {
            TextPaint textPaint = Theme.profile_aboutTextPaint;
            int color = Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider);
            ProfileActivity.this.getClass();
            textPaint.linkColor = color;
            StaticLayout staticLayout2 = this.firstThreeLinesLayout;
            try {
                if (staticLayout2 == null || !this.shouldExpand) {
                    f = 0.0f;
                    f2 = 255.0f;
                    StaticLayout staticLayout3 = this.textLayout;
                    if (staticLayout3 != null) {
                        staticLayout3.draw(canvas);
                    }
                } else {
                    staticLayout2.draw(canvas);
                    int lineCount = this.firstThreeLinesLayout.getLineCount() - 1;
                    float lineTop = this.firstThreeLinesLayout.getLineTop(lineCount) + this.firstThreeLinesLayout.getTopPadding();
                    float lineRight = this.firstThreeLinesLayout.getLineRight(lineCount);
                    boolean z = this.needSpace;
                    float f6 = this.SPACE;
                    float f7 = lineRight + (z ? f6 : 0.0f);
                    float lineBottom = (this.firstThreeLinesLayout.getLineBottom(lineCount) - this.firstThreeLinesLayout.getLineTop(lineCount)) - this.firstThreeLinesLayout.getBottomPadding();
                    float fPow3 = 1.0f - ((float) Math.pow(this.expandT, 0.25d));
                    if (fPow3 < 0.5d) {
                        fPow = MediaController$$ExternalSyntheticOutline0.m(fPow3, 4.0f, fPow3, fPow3);
                        f3 = 255.0f;
                    } else {
                        f3 = 255.0f;
                        fPow = 1.0f - (((float) Math.pow((fPow3 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                    }
                    float f8 = fPow;
                    if (this.nextLinesLayouts != null) {
                        float f9 = f7;
                        int i2 = 0;
                        while (true) {
                            StaticLayout[] staticLayoutArr = this.nextLinesLayouts;
                            if (i2 >= staticLayoutArr.length) {
                                break;
                            }
                            StaticLayout staticLayout4 = staticLayoutArr[i2];
                            if (staticLayout4 != null) {
                                int iSave = canvas.save();
                                Point point = this.nextLinesLayoutsPositions[i2];
                                if (point != null) {
                                    point.set((int) ((f9 * f8) + this.textX), (int) DiffUtil.m(1.0f, f8, lineBottom, this.textY + lineTop));
                                }
                                int i3 = this.lastInlineLine;
                                if (i3 == -1 || i3 > i2) {
                                    staticLayout = staticLayout4;
                                    i = iSave;
                                    f4 = lineTop;
                                    canvas.translate(f9 * f8, DiffUtil.m(1.0f, f8, lineBottom, f4));
                                } else {
                                    canvas.translate(f5, lineTop + lineBottom);
                                    float width = staticLayout4.getWidth();
                                    float height = staticLayout4.getHeight();
                                    int i4 = (int) (this.expandT * f3);
                                    i = iSave;
                                    staticLayout = staticLayout4;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i4, 31);
                                    f4 = lineTop;
                                }
                                staticLayout.draw(canvas);
                                canvas.restoreToCount(i);
                                float lineRight2 = staticLayout.getLineRight(0) + f6 + f9;
                                lineBottom += (staticLayout.getLineBottom(0) + staticLayout.getTopPadding()) - 1;
                                f9 = lineRight2;
                            } else {
                                i2 = i2;
                                f4 = lineTop;
                            }
                            i2++;
                            lineTop = f4;
                            f5 = 0.0f;
                            f3 = 255.0f;
                        }
                    }
                    f = 0.0f;
                    f2 = 255.0f;
                }
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
            }
        } catch (Exception e2) {
            e = e2;
            f = 0.0f;
            f2 = 255.0f;
        }
        canvas.restore();
        FrameLayout frameLayout = this.showMoreTextBackgroundView;
        float alpha = frameLayout.getAlpha();
        if (alpha > f) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f2), 31);
            this.showMoreBackgroundDrawable.setAlpha((int) (fPow2 * f2));
            canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
            frameLayout.draw(canvas);
            canvas.restore();
        }
        FrameLayout frameLayout2 = this.bottomShadow;
        float alpha2 = frameLayout2.getAlpha();
        if (alpha2 > f) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f2), 31);
            canvas.translate(frameLayout2.getLeft(), frameLayout2.getTop());
            frameLayout2.draw(canvas);
            canvas.restore();
        }
        this.container.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void lambda$updateCollapse$1(AtomicReference atomicReference, float f, SpringInterpolator springInterpolator, ValueAnimator valueAnimator) {
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        float fFloatValue = (f2.floatValue() - ((Float) atomicReference.getAndSet(f2)).floatValue()) * 1000.0f * 8.0f;
        AndroidUtilities.lerp(f, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        float fMin = Math.min(fFloatValue, 250.0f);
        while (fMin > 0.0f) {
            float fMin2 = Math.min(fMin, 18.0f);
            float f3 = springInterpolator.position;
            float f4 = springInterpolator.velocity;
            float f5 = (((((-0.020170001f) * f4) + ((f3 - 1.0f) * (-3.8E-4f))) / 1.0f) * fMin2) + f4;
            springInterpolator.velocity = f5;
            springInterpolator.position = (f5 * fMin2) + f3;
            fMin -= fMin2;
        }
        float fLerp = AndroidUtilities.lerp(f, 1.0f, springInterpolator.position);
        this.expandT = fLerp;
        FrameLayout frameLayout = this.container;
        if (fLerp > 0.8f && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.rippleBackground);
        }
        this.showMoreTextBackgroundView.setAlpha(1.0f - this.expandT);
        this.bottomShadow.setAlpha((float) Math.pow(1.0f - this.expandT, 2.0d));
        int iTextHeight = textHeight();
        float fMin3 = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight());
        if (this.shouldExpand) {
            iTextHeight = (int) AndroidUtilities.lerp(fMin3, iTextHeight, this.expandT);
        }
        setHeight(iTextHeight);
        frameLayout.invalidate();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.textLayout != null) {
            SpannableStringBuilder spannableStringBuilder = this.accessibilityText;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.stringBuilder;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr == null || clickableSpanArr.length == 0) {
                        spannableStringBuilder = this.stringBuilder;
                        this.accessibilityText = spannableStringBuilder;
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.stringBuilder);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new AnonymousClass5(i, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.accessibilityText = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    }
                }
            }
            CharSequence text = this.valueTextView.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(spannableStringBuilder);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", spannableStringBuilder));
            }
        }
    }

    public final void onLinkClick(ClickableSpan clickableSpan, Layout layout, float f) {
        AnonymousClass3 anonymousClass3 = this.currentProgress;
        AnonymousClass3 anonymousClass4 = null;
        if (anonymousClass3 != null) {
            anonymousClass3.cancel(false);
            this.currentProgress = null;
        }
        if (layout != null && clickableSpan != null) {
            anonymousClass4 = new AnonymousClass3(layout, clickableSpan, f);
        }
        this.currentProgress = anonymousClass4;
        if (clickableSpan instanceof URLSpanNoUnderline) {
            String url = ((URLSpanNoUnderline) clickableSpan).getURL();
            if (url.startsWith("@") || url.startsWith("#") || url.startsWith("$") || url.startsWith("/")) {
                ProfileActivity.this.openUrl(url, this.currentProgress);
                return;
            }
            return;
        }
        if (!(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(this);
            return;
        }
        String url2 = ((URLSpan) clickableSpan).getURL();
        if (!AndroidUtilities.shouldShowUrlInAlert(url2)) {
            Browser.openUrl(getContext(), Uri.parse(url2), true, true, this.currentProgress);
        } else {
            AlertsCreator.showOpenUrlAlert(this.parentFragment, url2, true, true, false, this.currentProgress, null, null);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        checkTextLayout(View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f), false);
        int iTextHeight = textHeight();
        float fMin = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight());
        if (this.shouldExpand) {
            iTextHeight = (int) AndroidUtilities.lerp(fMin, iTextHeight, this.expandT);
        }
        setHeight(iTextHeight);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iTextHeight, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AboutLinkCell aboutLinkCell;
        LinkSpanDrawable linkSpanDrawableCheckTouchTextLayout;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        AnonymousClass1 anonymousClass1 = this.showMoreTextView;
        if (anonymousClass1.getVisibility() == 0) {
            FrameLayout frameLayout = this.showMoreTextBackgroundView;
            if (x >= frameLayout.getLeft() && x <= frameLayout.getRight() && y >= frameLayout.getTop() && y <= frameLayout.getBottom()) {
                return false;
            }
        }
        if (this.textLayout != null || this.nextLinesLayouts != null) {
            int action = motionEvent.getAction();
            AnonymousClass2 anonymousClass2 = this.longPressedRunnable;
            LinkSpanDrawable.LinkCollector linkCollector = this.links;
            if (action != 0 && (this.pressedLink == null || motionEvent.getAction() != 1)) {
                if (motionEvent.getAction() == 3) {
                    linkCollector.clear(true);
                    this.pressedLink = null;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
                    invalidate();
                }
                if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else if (motionEvent.getAction() == 0) {
                linkCollector.clear(true);
                this.pressedLink = null;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
                invalidate();
                if ((x < anonymousClass1.getLeft() || x > anonymousClass1.getRight() || y < anonymousClass1.getTop() || y > anonymousClass1.getBottom()) && (getMeasuredWidth() <= 0 || x <= getMeasuredWidth() - AndroidUtilities.dp(18.0f))) {
                    StaticLayout staticLayout = this.firstThreeLinesLayout;
                    if (staticLayout == null || this.expandT >= 1.0f || !this.shouldExpand) {
                        aboutLinkCell = this;
                    } else {
                        aboutLinkCell = this;
                        linkSpanDrawableCheckTouchTextLayout = aboutLinkCell.checkTouchTextLayout(staticLayout, this.textX, this.textY, x, y);
                        if (linkSpanDrawableCheckTouchTextLayout == null) {
                            if (aboutLinkCell.nextLinesLayouts != null) {
                                int i = 0;
                                while (true) {
                                    StaticLayout[] staticLayoutArr = aboutLinkCell.nextLinesLayouts;
                                    if (i < staticLayoutArr.length) {
                                        StaticLayout staticLayout2 = staticLayoutArr[i];
                                        Point point = aboutLinkCell.nextLinesLayoutsPositions[i];
                                        LinkSpanDrawable linkSpanDrawableCheckTouchTextLayout2 = aboutLinkCell.checkTouchTextLayout(staticLayout2, point.x, point.y, x, y);
                                        if (linkSpanDrawableCheckTouchTextLayout2 != null) {
                                            linkSpanDrawableCheckTouchTextLayout = linkSpanDrawableCheckTouchTextLayout2;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                        if (linkSpanDrawableCheckTouchTextLayout != null) {
                            aboutLinkCell.pressedLinkLayout = aboutLinkCell.textLayout;
                            aboutLinkCell.pressedLink = linkSpanDrawableCheckTouchTextLayout;
                            linkCollector.addLink(linkSpanDrawableCheckTouchTextLayout, null);
                            AndroidUtilities.runOnUIThread(anonymousClass2, ViewConfiguration.getLongPressTimeout());
                        } else if (super.onTouchEvent(motionEvent)) {
                            return false;
                        }
                    }
                    linkSpanDrawableCheckTouchTextLayout = aboutLinkCell.checkTouchTextLayout(aboutLinkCell.textLayout, aboutLinkCell.textX, aboutLinkCell.textY, x, y);
                    if (linkSpanDrawableCheckTouchTextLayout == null) {
                    }
                    if (linkSpanDrawableCheckTouchTextLayout != null) {
                        aboutLinkCell.pressedLinkLayout = aboutLinkCell.textLayout;
                        aboutLinkCell.pressedLink = linkSpanDrawableCheckTouchTextLayout;
                        linkCollector.addLink(linkSpanDrawableCheckTouchTextLayout, null);
                        AndroidUtilities.runOnUIThread(anonymousClass2, ViewConfiguration.getLongPressTimeout());
                    } else if (super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    aboutLinkCell = this;
                }
                linkSpanDrawableCheckTouchTextLayout = null;
                if (linkSpanDrawableCheckTouchTextLayout != null) {
                    aboutLinkCell.pressedLinkLayout = aboutLinkCell.textLayout;
                    aboutLinkCell.pressedLink = linkSpanDrawableCheckTouchTextLayout;
                    linkCollector.addLink(linkSpanDrawableCheckTouchTextLayout, null);
                    AndroidUtilities.runOnUIThread(anonymousClass2, ViewConfiguration.getLongPressTimeout());
                } else if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                LinkSpanDrawable linkSpanDrawable = this.pressedLink;
                if (linkSpanDrawable != null) {
                    try {
                        onLinkClick((ClickableSpan) linkSpanDrawable.mSpan, this.textLayout, this.pressedLinkYOffset);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    linkCollector.clear(true);
                    this.pressedLink = null;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
                    invalidate();
                } else if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        } else if (super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setMoreButtonDisabled(boolean z) {
        this.moreButtonDisabled = z;
    }

    public final void setTextAndValue(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.oldText)) {
            return;
        }
        try {
            this.oldText = AndroidUtilities.getSafeString(str);
        } catch (Throwable unused) {
            this.oldText = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.oldText);
        this.stringBuilder = spannableStringBuilder;
        this.accessibilityText = null;
        MessageObject.addLinks(false, spannableStringBuilder, false, false, !z);
        Emoji.replaceEmoji(this.stringBuilder, Theme.profile_aboutTextPaint.getFontMetricsInt(), false);
        if (this.lastMaxWidth <= 0) {
            this.lastMaxWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
        }
        checkTextLayout(this.lastMaxWidth, true);
        int iTextHeight = textHeight();
        TextView textView = this.valueTextView;
        float fMin = Math.min(COLLAPSED_HEIGHT + (textView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight());
        if (this.shouldExpand) {
            iTextHeight = (int) AndroidUtilities.lerp(fMin, iTextHeight, this.expandT);
        }
        setHeight(iTextHeight);
        int visibility = textView.getVisibility();
        if (TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        if (visibility != textView.getVisibility()) {
            checkTextLayout(this.lastMaxWidth, true);
        }
        requestLayout();
    }

    public final int textHeight() {
        StaticLayout staticLayout = this.textLayout;
        int iDp = AndroidUtilities.dp(16.0f) + (staticLayout != null ? staticLayout.getHeight() : AndroidUtilities.dp(20.0f));
        return this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(23.0f) + iDp : iDp;
    }

    public final void updateCollapse() {
        ValueAnimator valueAnimator = this.collapseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.collapseAnimator = null;
        }
        float f = this.expandT;
        float fTextHeight = textHeight();
        float fMin = Math.min(COLLAPSED_HEIGHT, fTextHeight);
        Math.abs(AndroidUtilities.lerp(fMin, fTextHeight, 1.0f) - AndroidUtilities.lerp(fMin, fTextHeight, f));
        this.collapseAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        float fAbs = Math.abs(f - 1.0f) * 1250.0f * 2.0f;
        SpringInterpolator springInterpolator = new SpringInterpolator();
        springInterpolator.position = 0.0f;
        springInterpolator.velocity = 0.0f;
        this.collapseAnimator.addUpdateListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, new AtomicReference(Float.valueOf(f)), f, springInterpolator));
        this.collapseAnimator.addListener(new ArticleViewer.AnonymousClass25(this, 10));
        this.collapseAnimator.setDuration((long) fAbs);
        this.collapseAnimator.start();
    }
}
