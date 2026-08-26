package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda0;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;

public class StoryCaptionView extends NestedScrollView implements ItemOptions.ScrimView {
    public int blackoutBottomOffset;
    public final FrameLayout captionContainer;
    public final StoryCaptionTextView captionTextview;
    public boolean disableDraw;
    public boolean disableTouches;
    public boolean expanded;
    public boolean isLandscape;
    public float lastMotionX;
    public float lastMotionY;
    public boolean nestedScrollStarted;
    public float overScrollY;
    public int pendingTopMargin;
    public int prevHeight;
    public int replytextHash;
    public int replytitleHash;
    public final OverScroller scroller;
    public final SpringAnimation springAnimation;
    public float startMotionX;
    public float startMotionY;
    public int textHash;
    public final TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;
    public boolean touched;
    public float velocitySign;
    public float velocityY;

    public final class Panel {
        public static CharSequence[] musicSpan;
        public int currentAccount;
        public boolean isRepostMessage;
        public boolean loaded;
        public boolean loading;
        public Integer messageId;
        public TLRPC.Document music;
        public Long peerId;
        public Integer storyId;
        public String text;
        public Text textLayout;
        public SpannableStringBuilder title;
        public Text titleLayout;
        public boolean updateText;
        public StoryCaptionTextView view;
        public Runnable whenLoaded;
        public int width;
        public boolean small = true;
        public final AnimatedFloat animatedSmall = new AnimatedFloat(0, 350, CubicBezierInterpolator.EASE_OUT_QUINT);
        public final ButtonBounce bounce = new ButtonBounce(null, 1.0f, 5.0f);
        public final BaseCell.RippleDrawableSafe ripple = Theme.createRadSelectorDrawable(553648127, 0, 0);
        public final Paint backgroundPaint = new Paint(1);
        public final Paint linePaint = new Paint(1);
        public final Path clipRipple = new Path();
        public final RectF bounds = new RectF();

        public final class AnonymousClass1 extends CharacterStyle {
            @Override
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setAlpha((int) (textPaint.getAlpha() * 0.66f));
            }
        }

        public static CharSequence musicSpan() {
            if (musicSpan == null) {
                musicSpan = new CharSequence[2];
            }
            CharSequence[] charSequenceArr = musicSpan;
            if (charSequenceArr[0] == null) {
                charSequenceArr[0] = new SpannableStringBuilder("u");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_widget_music);
                coloredImageSpan.setSize(AndroidUtilities.dp(16.0f));
                coloredImageSpan.spaceScaleX = 1.0f;
                coloredImageSpan.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                ((SpannableStringBuilder) musicSpan[0]).setSpan(coloredImageSpan, 0, 1, 33);
            }
            return musicSpan[0];
        }

        public final void draw(Canvas canvas, float f) {
            if (this.titleLayout == null) {
                CharSequence charSequence = this.title;
                if (charSequence == null) {
                    charSequence = "";
                }
                TLRPC.Document document = this.music;
                this.titleLayout = new Text(charSequence, document != null ? 12.0f : 14.0f, document != null ? null : AndroidUtilities.bold());
            }
            if (this.textLayout == null || this.updateText) {
                String str = this.text;
                this.textLayout = new Text(str != null ? str : "", 14.0f, null);
            }
            float f2 = this.animatedSmall.set(this.small);
            Paint paint = this.backgroundPaint;
            paint.setColor(1073741824);
            int iMin = (int) Math.min(f, Math.max(this.titleLayout.width, this.textLayout.width) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), f2));
            this.width = iMin;
            int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), f2);
            RectF rectF = this.bounds;
            float f3 = iMin;
            rectF.set(0.0f, 0.0f, f3, iLerp);
            canvas.save();
            float scale = this.bounce.getScale(0.02f);
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), f2);
            canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
            canvas.save();
            Path path = this.clipRipple;
            path.rewind();
            path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(path);
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.ripple;
            rippleDrawableSafe.setBounds(0, 0, iMin, iLerp);
            rippleDrawableSafe.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
            Paint paint2 = this.linePaint;
            paint2.setColor(-1);
            float f4 = 1.0f - f2;
            paint2.setAlpha((int) (255.0f * f4));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
            canvas.restore();
            int iDp = iMin - AndroidUtilities.dp(20.0f);
            if (f3 < f) {
                iDp = (int) Math.min(AndroidUtilities.dp(12.0f) + iDp, f - AndroidUtilities.dp(20.0f));
            }
            Text text = this.titleLayout;
            float f5 = iDp;
            text.ellipsizeWidth = f5;
            text.draw(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), f2), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), f2), 1.0f, -1, canvas);
            Text text2 = this.textLayout;
            text2.ellipsizeWidth = f5;
            text2.draw(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f4, -1, canvas);
            canvas.restore();
        }

        public final int height() {
            return AndroidUtilities.dp(this.small ? 22.0f : 42.0f);
        }

        public final void load() {
            if (this.loaded || this.loading || this.peerId == null || this.storyId == null || this.view == null) {
                return;
            }
            this.loading = true;
            MessagesController.getInstance(this.currentAccount).getStoriesController().resolveStoryLink(this.peerId.longValue(), this.storyId.intValue(), new QrActivity$5$$ExternalSyntheticLambda0(this, 10));
        }

        public final void setPressed(float f, float f2, boolean z) {
            this.bounce.setPressed(z);
            int[] iArr = z ? new int[]{16842919, 16842910} : new int[0];
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.ripple;
            rippleDrawableSafe.setState(iArr);
            if (z) {
                rippleDrawableSafe.setHotspot(f, f2);
            }
        }
    }

    public final class StoryCaptionTextView extends View implements TextSelectionHelper.SimpleSelectabeleView {
        public final boolean allowClickSpoilers;
        public final PorterDuffColorFilter emojiColorFilter;
        public int horizontalPadding;
        public boolean isSpoilersRevealed;
        public float progressToExpand;
        public boolean shouldCollapse;
        public StaticLayout showMore;
        public final TextPaint showMorePaint;
        public float showMoreX;
        public float showMoreY;
        public int sizeCached;
        public final TextState[] state;
        public final TextPaint textPaint;
        public ValueAnimator updateAnimator;
        public float updateT;
        public boolean updating;
        public int verticalPadding;
        public final Paint xRefGradinetPaint;
        public final Paint xRefPaint;

        public final class LineInfo {
            public float collapsedX;
            public float collapsedY;
            public float finalX;
            public float finalY;
            public AnimatedEmojiSpan.EmojiGroupedSpans layoutEmoji;
            public StaticLayout staticLayout;
        }

        public final class TextState {
            public Panel bottomPanel;
            public final SpoilersClickDetector clickDetector;
            public int collapsedTextHeight;
            public StaticLayout firstLayout;
            public AnimatedEmojiSpan.EmojiGroupedSpans firstLayoutEmoji;
            public StaticLayout fullLayout;
            public AnimatedEmojiSpan.EmojiGroupedSpans fullLayoutEmoji;
            public final LinkSpanDrawable.LinkCollector links;
            public final LoadingDrawable loadingDrawable;
            public final Path loadingPath;
            public LineInfo[] nextLinesLayouts;
            public final AtomicReference patchedLayout;
            public AnimatedEmojiSpan pressedEmoji;
            public LinkSpanDrawable pressedLink;
            public final ArrayList spoilers;
            public final Stack spoilersPool;
            public CharSequence text;
            public int textHeight;
            public Panel topPanel;
            public final AnimatedFloat translateT;
            public boolean translating;

            public TextState() {
                this.links = new LinkSpanDrawable.LinkCollector(StoryCaptionTextView.this);
                ArrayList arrayList = new ArrayList();
                this.spoilers = arrayList;
                this.spoilersPool = new Stack();
                this.text = "";
                this.translateT = new AnimatedFloat(StoryCaptionView.this, 0L, 400L, CubicBezierInterpolator.EASE_OUT_QUINT);
                Path path = new Path();
                this.loadingPath = path;
                this.patchedLayout = new AtomicReference();
                this.clickDetector = new SpoilersClickDetector(StoryCaptionTextView.this, arrayList, new StoriesViewPager$$ExternalSyntheticLambda0(this, 19));
                LoadingDrawable loadingDrawable = new LoadingDrawable();
                this.loadingDrawable = loadingDrawable;
                loadingDrawable.usePath = path;
                loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
                loadingDrawable.setColors(Theme.multAlpha(0.3f, -1), Theme.multAlpha(0.1f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.7f, -1));
                loadingDrawable.setCallback(StoryCaptionTextView.this);
            }

            public final int collapsedTextHeight(int i) {
                int iDp;
                Panel panel = this.topPanel;
                int iDp2 = 0;
                if (panel != null) {
                    iDp = AndroidUtilities.dp(8.0f) + panel.height();
                } else {
                    iDp = 0;
                }
                Panel panel2 = this.bottomPanel;
                if (panel2 != null) {
                    iDp2 = AndroidUtilities.dp(8.0f) + panel2.height();
                }
                int i2 = iDp + iDp2;
                StaticLayout staticLayout = this.fullLayout;
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                if (staticLayout == null) {
                    return i - ((storyCaptionTextView.verticalPadding * 2) + this.textHeight);
                }
                int lineCount = staticLayout.getLineCount();
                if (!storyCaptionTextView.shouldCollapse) {
                    return i - ((storyCaptionTextView.verticalPadding * 2) + this.textHeight);
                }
                return (i - ((Math.min(3, lineCount) + 1) * storyCaptionTextView.textPaint.getFontMetricsInt(null))) - i2;
            }

            public final void draw(Canvas canvas, float f) {
                Canvas canvas2;
                float f2 = this.translateT.set(this.translating);
                if (f <= 0.0f) {
                    return;
                }
                float fLerp = AndroidUtilities.lerp(f, 0.7f * f, f2);
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                if (fLerp >= 1.0f) {
                    drawInternal(canvas, f2);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, StoryCaptionView.this.getWidth(), StoryCaptionView.this.getHeight(), (int) (fLerp * 255.0f), 31);
                    drawInternal(canvas2, f2);
                    canvas2.restore();
                }
                if (f2 > 0.0f || this.translating) {
                    int i = (int) (f2 * 255.0f * fLerp);
                    LoadingDrawable loadingDrawable = this.loadingDrawable;
                    loadingDrawable.setAlpha(i);
                    loadingDrawable.draw(canvas2);
                    storyCaptionTextView.invalidate();
                }
            }

            public final void drawInternal(Canvas canvas, float f) {
                int i;
                ArrayList arrayList;
                ArrayList arrayList2;
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                ArrayList arrayList3;
                LineInfo lineInfo;
                ArrayList arrayList4;
                Canvas canvas2 = canvas;
                Panel panel = this.topPanel;
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                if (panel != null) {
                    canvas2.save();
                    canvas2.translate(storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding);
                    Panel panel2 = this.topPanel;
                    int width = storyCaptionTextView.getWidth();
                    int i2 = storyCaptionTextView.horizontalPadding;
                    panel2.draw(canvas2, (width - i2) - i2);
                    int iDp = AndroidUtilities.dp(8.0f) + this.topPanel.height();
                    canvas2.restore();
                    i = iDp;
                } else {
                    i = 0;
                }
                canvas2.save();
                canvas2.translate(storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding + i);
                if (this.links.draw(canvas2)) {
                    storyCaptionTextView.invalidate();
                }
                canvas2.restore();
                float f2 = 0.0f;
                boolean z = f > 0.0f;
                this.loadingPath.rewind();
                ArrayList arrayList5 = this.spoilers;
                boolean zIsEmpty = arrayList5.isEmpty();
                AtomicReference atomicReference3 = this.patchedLayout;
                if (zIsEmpty && this.firstLayout != null) {
                    if (StoryCaptionView.this.textSelectionHelper.isInSelectionMode()) {
                        canvas2.save();
                        canvas2.translate(storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding + i);
                        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = StoryCaptionView.this.textSelectionHelper;
                        Layout staticTextLayout = simpleTextSelectionHelper.selectabeleView.getStaticTextLayout();
                        int color = Theme.getColor(Theme.key_chat_textSelectBackground, simpleTextSelectionHelper.resourcesProvider);
                        simpleTextSelectionHelper.selectionPaint.setColor(color);
                        simpleTextSelectionHelper.selectionHandlePaint.setColor(color);
                        simpleTextSelectionHelper.drawSelection(canvas2, staticTextLayout, simpleTextSelectionHelper.selectionStart, simpleTextSelectionHelper.selectionEnd, true, true, 0.0f);
                        canvas2 = canvas2;
                        canvas2.restore();
                    }
                    if (this.firstLayout != null) {
                        canvas2.save();
                        canvas2.translate(storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding + i);
                        StaticLayout staticLayout = this.firstLayout;
                        if (arrayList5.isEmpty()) {
                            arrayList4 = arrayList5;
                            atomicReference = atomicReference3;
                            staticLayout.draw(canvas2);
                        } else {
                            SpoilerEffect.renderWithRipple(StoryCaptionTextView.this, false, -1, 0, atomicReference3, 0, staticLayout, arrayList5, canvas, false);
                            atomicReference = atomicReference3;
                            arrayList4 = arrayList5;
                            canvas2 = canvas;
                        }
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate = AnimatedEmojiSpan.update(0, storyCaptionTextView, this.firstLayoutEmoji, this.firstLayout);
                        this.firstLayoutEmoji = emojiGroupedSpansUpdate;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.firstLayout, emojiGroupedSpansUpdate, 0.0f, arrayList4, 0.0f, 0.0f, 0.0f, 1.0f, storyCaptionTextView.emojiColorFilter);
                        arrayList2 = arrayList4;
                        canvas2.restore();
                        if (z) {
                            putLayoutRects(this.firstLayout, storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding + i);
                        }
                    } else {
                        arrayList2 = arrayList5;
                        atomicReference = atomicReference3;
                    }
                    if (this.nextLinesLayouts != null) {
                        int i3 = 0;
                        while (true) {
                            LineInfo[] lineInfoArr = this.nextLinesLayouts;
                            if (i3 >= lineInfoArr.length) {
                                break;
                            }
                            LineInfo lineInfo2 = lineInfoArr[i3];
                            if (lineInfo2 == null) {
                                atomicReference2 = atomicReference;
                                i3 = i3;
                                arrayList3 = arrayList2;
                            } else {
                                canvas2.save();
                                float f3 = lineInfo2.collapsedX;
                                float f4 = lineInfo2.finalX;
                                if (f3 != f4) {
                                    arrayList2 = arrayList2;
                                    atomicReference2 = atomicReference;
                                    i3 = i3;
                                    float fLerp = AndroidUtilities.lerp(f3, f4, storyCaptionTextView.progressToExpand);
                                    float fLerp2 = AndroidUtilities.lerp(lineInfo2.collapsedY, lineInfo2.finalY, CubicBezierInterpolator.EASE_OUT.getInterpolation(storyCaptionTextView.progressToExpand));
                                    canvas2.translate(storyCaptionTextView.horizontalPadding + fLerp, storyCaptionTextView.verticalPadding + i + fLerp2);
                                    if (z) {
                                        putLayoutRects(lineInfo2.staticLayout, storyCaptionTextView.horizontalPadding + fLerp, storyCaptionTextView.verticalPadding + i + fLerp2);
                                    }
                                    lineInfo2.staticLayout.draw(canvas2);
                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate2 = AnimatedEmojiSpan.update(0, storyCaptionTextView, lineInfo2.layoutEmoji, lineInfo2.staticLayout);
                                    lineInfo2.layoutEmoji = emojiGroupedSpansUpdate2;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, lineInfo2.staticLayout, emojiGroupedSpansUpdate2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, storyCaptionTextView.emojiColorFilter);
                                } else if (storyCaptionTextView.progressToExpand == f2) {
                                    atomicReference2 = atomicReference;
                                    i3 = i3;
                                    arrayList3 = arrayList2;
                                } else {
                                    canvas2.translate(storyCaptionTextView.horizontalPadding + f4, storyCaptionTextView.verticalPadding + i + lineInfo2.finalY);
                                    canvas2.saveLayerAlpha(0.0f, 0.0f, lineInfo2.staticLayout.getWidth(), lineInfo2.staticLayout.getHeight(), (int) (storyCaptionTextView.progressToExpand * 255.0f), 31);
                                    StaticLayout staticLayout2 = lineInfo2.staticLayout;
                                    if (arrayList2.isEmpty()) {
                                        canvas2 = canvas;
                                        lineInfo = lineInfo2;
                                        atomicReference2 = atomicReference;
                                        staticLayout2.draw(canvas2);
                                    } else {
                                        lineInfo = lineInfo2;
                                        AtomicReference atomicReference4 = atomicReference;
                                        SpoilerEffect.renderWithRipple(StoryCaptionTextView.this, false, -1, 0, atomicReference4, 0, staticLayout2, arrayList2, canvas, false);
                                        atomicReference2 = atomicReference4;
                                        canvas2 = canvas;
                                    }
                                    if (z) {
                                        putLayoutRects(lineInfo.staticLayout, storyCaptionTextView.horizontalPadding + lineInfo.finalX, storyCaptionTextView.verticalPadding + i + lineInfo.finalY);
                                    }
                                    lineInfo.staticLayout.draw(canvas2);
                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate3 = AnimatedEmojiSpan.update(0, storyCaptionTextView, lineInfo.layoutEmoji, lineInfo.staticLayout);
                                    lineInfo.layoutEmoji = emojiGroupedSpansUpdate3;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, lineInfo.staticLayout, emojiGroupedSpansUpdate3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, storyCaptionTextView.progressToExpand, storyCaptionTextView.emojiColorFilter);
                                    canvas2.restore();
                                }
                                arrayList3 = arrayList2;
                                canvas2.restore();
                            }
                            int i4 = i3 + 1;
                            arrayList2 = arrayList3;
                            atomicReference = atomicReference2;
                            f2 = 0.0f;
                            i3 = i4;
                        }
                    }
                } else if (this.fullLayout != null) {
                    canvas2.save();
                    canvas2.translate(storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding + i);
                    if (StoryCaptionView.this.textSelectionHelper.isInSelectionMode()) {
                        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper2 = StoryCaptionView.this.textSelectionHelper;
                        Layout staticTextLayout2 = simpleTextSelectionHelper2.selectabeleView.getStaticTextLayout();
                        int color2 = Theme.getColor(Theme.key_chat_textSelectBackground, simpleTextSelectionHelper2.resourcesProvider);
                        simpleTextSelectionHelper2.selectionPaint.setColor(color2);
                        simpleTextSelectionHelper2.selectionHandlePaint.setColor(color2);
                        simpleTextSelectionHelper2.drawSelection(canvas2, staticTextLayout2, simpleTextSelectionHelper2.selectionStart, simpleTextSelectionHelper2.selectionEnd, true, true, 0.0f);
                    }
                    StaticLayout staticLayout3 = this.fullLayout;
                    if (arrayList5.isEmpty()) {
                        canvas2 = canvas;
                        arrayList = arrayList5;
                        staticLayout3.draw(canvas2);
                    } else {
                        SpoilerEffect.renderWithRipple(StoryCaptionTextView.this, false, -1, 0, atomicReference3, 0, staticLayout3, arrayList5, canvas, false);
                        arrayList = arrayList5;
                        canvas2 = canvas;
                    }
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate4 = AnimatedEmojiSpan.update(0, storyCaptionTextView, this.fullLayoutEmoji, this.fullLayout);
                    this.fullLayoutEmoji = emojiGroupedSpansUpdate4;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.fullLayout, emojiGroupedSpansUpdate4, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, storyCaptionTextView.emojiColorFilter);
                    canvas2.restore();
                    if (z) {
                        putLayoutRects(this.fullLayout, storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding + i);
                    }
                }
                if (this.bottomPanel != null) {
                    canvas2.save();
                    canvas2.translate(storyCaptionTextView.horizontalPadding, (AndroidUtilities.lerp(this.collapsedTextHeight, this.textHeight, storyCaptionTextView.progressToExpand) + storyCaptionTextView.verticalPadding) - this.bottomPanel.height());
                    Panel panel3 = this.bottomPanel;
                    int width2 = storyCaptionTextView.getWidth();
                    int i5 = storyCaptionTextView.horizontalPadding;
                    panel3.draw(canvas2, (width2 - i5) - i5);
                    canvas2.restore();
                }
            }

            public final void measure(int i) {
                boolean zIsEmpty = TextUtils.isEmpty(this.text);
                Stack stack = this.spoilersPool;
                ArrayList arrayList = this.spoilers;
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                if (zIsEmpty) {
                    this.fullLayout = null;
                    this.textHeight = 0;
                    Panel panel = this.topPanel;
                    if (panel != null) {
                        this.textHeight = AndroidUtilities.dp(4.0f) + panel.height();
                    }
                    Panel panel2 = this.bottomPanel;
                    if (panel2 != null) {
                        this.textHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(panel2.height(), 4.0f, this.textHeight);
                    }
                    this.collapsedTextHeight = this.textHeight;
                    if (this == storyCaptionTextView.state[0]) {
                        storyCaptionTextView.showMore = null;
                    }
                    this.firstLayout = null;
                    stack.addAll(arrayList);
                    arrayList.clear();
                    return;
                }
                StaticLayout staticLayoutAccess$000 = StoryCaptionTextView.access$000(storyCaptionTextView, storyCaptionTextView.textPaint, this.text, i);
                this.fullLayout = staticLayoutAccess$000;
                this.textHeight = staticLayoutAccess$000.getHeight();
                Panel panel3 = this.topPanel;
                int iDp = panel3 != null ? AndroidUtilities.dp(8.0f) + panel3.height() : 0;
                Panel panel4 = this.bottomPanel;
                if (panel4 != null) {
                    this.textHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(panel4.height(), 8.0f, this.textHeight);
                }
                this.textHeight += iDp;
                float fMeasureText = storyCaptionTextView.textPaint.measureText(" ");
                storyCaptionTextView.shouldCollapse = this.fullLayout.getLineCount() > 3;
                if (storyCaptionTextView.shouldCollapse && this.fullLayout.getLineCount() == 4) {
                    if (TextUtils.getTrimmedLength(this.text.subSequence(this.fullLayout.getLineStart(2), this.fullLayout.getLineEnd(2))) == 0) {
                        storyCaptionTextView.shouldCollapse = false;
                    }
                }
                if (storyCaptionTextView.shouldCollapse) {
                    float topPadding = this.fullLayout.getTopPadding() + this.fullLayout.getLineTop(2);
                    if (this == storyCaptionTextView.state[0]) {
                        String string = LocaleController.getString(R.string.ShowMore);
                        storyCaptionTextView.showMore = StoryCaptionTextView.access$000(storyCaptionTextView, storyCaptionTextView.showMorePaint, string, i);
                        storyCaptionTextView.showMoreY = ((storyCaptionTextView.verticalPadding + iDp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                        storyCaptionTextView.showMoreX = (storyCaptionTextView.horizontalPadding + i) - storyCaptionTextView.showMorePaint.measureText(string);
                    }
                    int topPadding2 = this.fullLayout.getTopPadding() + this.fullLayout.getLineBottom(2);
                    Panel panel5 = this.topPanel;
                    int iDp2 = topPadding2 + (panel5 != null ? AndroidUtilities.dp(8.0f) + panel5.height() : 0);
                    Panel panel6 = this.bottomPanel;
                    this.collapsedTextHeight = iDp2 + (panel6 != null ? AndroidUtilities.dp(8.0f) + panel6.height() : 0);
                    this.firstLayout = StoryCaptionTextView.access$000(storyCaptionTextView, storyCaptionTextView.textPaint, this.text.subSequence(0, this.fullLayout.getLineEnd(2)), i);
                    stack.addAll(arrayList);
                    arrayList.clear();
                    SpoilerEffect.addSpoilers(StoryCaptionView.this, this.fullLayout, stack, arrayList);
                    float lineRight = this.fullLayout.getLineRight(2) + fMeasureText;
                    if (this.nextLinesLayouts != null) {
                        int i2 = 0;
                        while (true) {
                            LineInfo[] lineInfoArr = this.nextLinesLayouts;
                            if (i2 >= lineInfoArr.length) {
                                break;
                            }
                            LineInfo lineInfo = lineInfoArr[i2];
                            if (lineInfo != null) {
                                AnimatedEmojiSpan.release(StoryCaptionView.this, lineInfo.layoutEmoji);
                            }
                            i2++;
                        }
                    }
                    this.nextLinesLayouts = new LineInfo[this.fullLayout.getLineCount() - 3];
                    if (arrayList.isEmpty()) {
                        for (int i3 = 3; i3 < this.fullLayout.getLineCount(); i3++) {
                            int lineStart = this.fullLayout.getLineStart(i3);
                            int lineEnd = this.fullLayout.getLineEnd(i3);
                            CharSequence charSequenceSubSequence = this.text.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                                this.nextLinesLayouts[i3 - 3] = null;
                            } else {
                                StaticLayout staticLayoutAccess$001 = StoryCaptionTextView.access$000(storyCaptionTextView, storyCaptionTextView.textPaint, charSequenceSubSequence, i);
                                LineInfo lineInfo2 = new LineInfo();
                                this.nextLinesLayouts[i3 - 3] = lineInfo2;
                                lineInfo2.staticLayout = staticLayoutAccess$001;
                                lineInfo2.finalX = this.fullLayout.getLineLeft(i3);
                                lineInfo2.finalY = this.fullLayout.getTopPadding() + this.fullLayout.getLineTop(i3);
                                if (lineRight < storyCaptionTextView.showMoreX - AndroidUtilities.dp(16.0f)) {
                                    lineInfo2.collapsedY = topPadding;
                                    lineInfo2.collapsedX = lineRight;
                                    lineRight = Math.abs(staticLayoutAccess$001.getLineRight(0) - staticLayoutAccess$001.getLineLeft(0)) + fMeasureText + lineRight;
                                } else {
                                    lineInfo2.collapsedY = lineInfo2.finalY;
                                    lineInfo2.collapsedX = lineInfo2.finalX;
                                }
                            }
                        }
                    }
                } else {
                    if (this == storyCaptionTextView.state[0]) {
                        storyCaptionTextView.showMore = null;
                    }
                    this.firstLayout = null;
                    this.collapsedTextHeight = this.textHeight;
                    stack.addAll(arrayList);
                    arrayList.clear();
                    SpoilerEffect.addSpoilers(storyCaptionTextView, this.fullLayout, stack, arrayList);
                }
                int i4 = storyCaptionTextView.horizontalPadding;
                int i5 = storyCaptionTextView.verticalPadding;
                SpoilersClickDetector spoilersClickDetector = this.clickDetector;
                spoilersClickDetector.horizontalPadding = i4;
                spoilersClickDetector.verticalPadding = i5;
            }

            public final void putLayoutRects(Layout layout, float f, float f2) {
                float lineTop = 0.0f;
                int i = 0;
                while (i < layout.getLineCount()) {
                    float lineLeft = layout.getLineLeft(i);
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    float f3 = lineLeft - (storyCaptionTextView.horizontalPadding / 3.0f);
                    float lineRight = (storyCaptionTextView.horizontalPadding / 3.0f) + layout.getLineRight(i);
                    if (i == 0) {
                        lineTop = layout.getLineTop(i) - (storyCaptionTextView.verticalPadding / 3.0f);
                    }
                    float lineBottom = layout.getLineBottom(i);
                    float f4 = i >= layout.getLineCount() + (-1) ? (storyCaptionTextView.verticalPadding / 3.0f) + lineBottom : lineBottom;
                    this.loadingPath.addRect(f + f3, f2 + lineTop, f + lineRight, f2 + f4, Path.Direction.CW);
                    i++;
                    lineTop = f4;
                }
            }

            public final void setup(CharSequence charSequence, Panel panel, Panel panel2) {
                this.text = charSequence;
                this.topPanel = panel;
                this.bottomPanel = panel2;
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                if (panel != null) {
                    StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2 storyCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2 = new StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2(this, 0);
                    panel.view = storyCaptionTextView;
                    panel.whenLoaded = storyCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2;
                    new ReplyMessageLine(storyCaptionTextView);
                    panel.ripple.setCallback(storyCaptionTextView);
                    panel.animatedSmall.parent = storyCaptionTextView;
                    panel.bounce.view = storyCaptionTextView;
                    panel.load();
                }
                Panel panel3 = this.bottomPanel;
                if (panel3 != null) {
                    StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2 storyCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda3 = new StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2(this, 1);
                    panel3.view = storyCaptionTextView;
                    panel3.whenLoaded = storyCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda3;
                    new ReplyMessageLine(storyCaptionTextView);
                    panel3.ripple.setCallback(storyCaptionTextView);
                    panel3.animatedSmall.parent = storyCaptionTextView;
                    panel3.bounce.view = storyCaptionTextView;
                    panel3.load();
                }
                storyCaptionTextView.sizeCached = 0;
                storyCaptionTextView.requestLayout();
            }
        }

        public StoryCaptionTextView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            TextPaint textPaint2 = new TextPaint(1);
            this.showMorePaint = textPaint2;
            Paint paint = new Paint();
            this.xRefPaint = paint;
            Paint paint2 = new Paint(1);
            this.xRefGradinetPaint = paint2;
            this.state = new TextState[]{new TextState(), null};
            this.sizeCached = 0;
            new Path();
            this.allowClickSpoilers = true;
            this.updating = false;
            textPaint.setColor(-1);
            textPaint.linkColor = -1;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setColor(-1);
            textPaint2.setTypeface(AndroidUtilities.bold());
            textPaint2.setTextSize(AndroidUtilities.dp(16.0f));
            paint.setColor(-16777216);
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint.setXfermode(new PorterDuffXfermode(mode));
            paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            paint2.setXfermode(new PorterDuffXfermode(mode));
            this.emojiColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }

        public static StaticLayout access$000(StoryCaptionTextView storyCaptionTextView, TextPaint textPaint, CharSequence charSequence, int i) {
            Layout.Alignment alignmentALIGN_RIGHT;
            storyCaptionTextView.getClass();
            if (Build.VERSION.SDK_INT < 24) {
                return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignmentALIGN_RIGHT = StaticLayoutEx.ALIGN_RIGHT();
            } else {
                Layout.Alignment[] alignmentArr = StaticLayoutEx.alignments;
                alignmentALIGN_RIGHT = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
            }
            return hyphenationFrequency.setAlignment(alignmentALIGN_RIGHT).build();
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean zContains;
            int iDp;
            TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper;
            boolean z2;
            float f;
            float f2;
            Layout staticTextLayout;
            Rect rect;
            TextState textState;
            TextState textState2;
            ?? r12;
            Panel panel;
            int action = motionEvent.getAction();
            StoryCaptionView storyCaptionView = StoryCaptionView.this;
            if (action == 0) {
                storyCaptionView.startMotionX = motionEvent.getX();
                storyCaptionView.startMotionY = motionEvent.getY();
            }
            storyCaptionView.lastMotionX = motionEvent.getX();
            storyCaptionView.lastMotionY = motionEvent.getY();
            StaticLayout staticLayout = this.showMore;
            if (staticLayout != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f3 = this.showMoreX;
                rectF.set(f3, this.showMoreY, staticLayout.getWidth() + f3, this.showMoreY + this.showMore.getHeight());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            TextState[] textStateArr = this.state;
            TextState textState3 = textStateArr[0];
            if (textState3 == null || (panel = textState3.topPanel) == null) {
                zContains = false;
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(8.0f) + panel.height();
                RectF rectF2 = AndroidUtilities.rectTmp;
                int i = this.horizontalPadding;
                int i2 = this.verticalPadding;
                Panel panel2 = textStateArr[0].topPanel;
                rectF2.set(i, i2, i + panel2.width, panel2.height() + i2);
                zContains = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                if (zContains) {
                    z = false;
                }
                if (motionEvent.getAction() == 0 && zContains) {
                    textStateArr[0].topPanel.setPressed(motionEvent.getX(), motionEvent.getY(), true);
                } else if (motionEvent.getAction() == 2) {
                    Panel panel3 = textStateArr[0].topPanel;
                    if (panel3.bounce.isPressed && !zContains) {
                        panel3.setPressed(motionEvent.getX(), motionEvent.getY(), false);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && zContains) {
                        Panel panel4 = textStateArr[0].topPanel;
                        if (panel4.bounce.isPressed) {
                            storyCaptionView.onReplyClick(panel4);
                        }
                    }
                    textStateArr[0].topPanel.setPressed(motionEvent.getX(), motionEvent.getY(), false);
                }
            }
            if (zContains || (textState2 = textStateArr[0]) == null || textState2.bottomPanel == null) {
                simpleTextSelectionHelper = storyCaptionView.textSelectionHelper;
                if (z && (storyCaptionView.expanded || (textState = textStateArr[0]) == null || textState.firstLayout == null)) {
                    f = this.horizontalPadding;
                    f2 = this.verticalPadding + iDp;
                    staticTextLayout = simpleTextSelectionHelper.selectabeleView.getStaticTextLayout();
                    rect = simpleTextSelectionHelper.textArea;
                    if (staticTextLayout == null) {
                        rect.setEmpty();
                        simpleTextSelectionHelper.maybeSelectedView = null;
                    } else {
                        simpleTextSelectionHelper.maybeSelectedView = simpleTextSelectionHelper.selectabeleView;
                        int i3 = (int) f;
                        simpleTextSelectionHelper.maybeTextX = i3;
                        int i4 = (int) f2;
                        simpleTextSelectionHelper.maybeTextY = i4;
                        TextSelectionHelper.LayoutBlock layoutBlock = simpleTextSelectionHelper.layoutBlock;
                        layoutBlock.layout = staticTextLayout;
                        layoutBlock.xOffset = f;
                        layoutBlock.yOffset = f2;
                        layoutBlock.charOffset = 0;
                        rect.set(i3, i4, (int) (f + staticTextLayout.getWidth()), (int) (f2 + staticTextLayout.getHeight()));
                    }
                    simpleTextSelectionHelper.onTouchEvent(motionEvent);
                }
                if (simpleTextSelectionHelper.isInSelectionMode() && z && this.allowClickSpoilers) {
                    z2 = false;
                    if (((GestureDetector) textStateArr[0].clickDetector.gestureDetector.zza).onTouchEvent(motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        simpleTextSelectionHelper.clear(false);
                        return true;
                    }
                } else {
                    z2 = false;
                }
                if (super.dispatchTouchEvent(motionEvent) && !zContains) {
                    return z2;
                }
            } else {
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f4 = this.horizontalPadding;
                float fLerp = (AndroidUtilities.lerp(textState2.collapsedTextHeight, textState2.textHeight, this.progressToExpand) + this.verticalPadding) - textStateArr[0].bottomPanel.height();
                int i5 = this.horizontalPadding;
                TextState textState4 = textStateArr[0];
                rectF3.set(f4, fLerp, i5 + textState4.bottomPanel.width, AndroidUtilities.lerp(textState4.collapsedTextHeight, textState4.textHeight, this.progressToExpand) + this.verticalPadding);
                boolean zContains2 = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                if (zContains2) {
                    z = false;
                }
                if (motionEvent.getAction() == 0 && zContains2) {
                    textStateArr[0].bottomPanel.setPressed(motionEvent.getX(), motionEvent.getY(), true);
                } else if (motionEvent.getAction() == 2) {
                    Panel panel5 = textStateArr[0].bottomPanel;
                    if (panel5.bounce.isPressed && !zContains2) {
                        panel5.setPressed(motionEvent.getX(), motionEvent.getY(), false);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && zContains2) {
                        r12 = 0;
                        r12 = 0;
                        Panel panel6 = textStateArr[0].bottomPanel;
                        if (panel6.bounce.isPressed) {
                            storyCaptionView.onReplyClick(panel6);
                        }
                    } else {
                        r12 = 0;
                    }
                    textStateArr[r12].bottomPanel.setPressed(motionEvent.getX(), motionEvent.getY(), r12);
                }
                if (!zContains2) {
                    simpleTextSelectionHelper = storyCaptionView.textSelectionHelper;
                    if (z) {
                        f = this.horizontalPadding;
                        f2 = this.verticalPadding + iDp;
                        staticTextLayout = simpleTextSelectionHelper.selectabeleView.getStaticTextLayout();
                        rect = simpleTextSelectionHelper.textArea;
                        if (staticTextLayout == null) {
                            rect.setEmpty();
                            simpleTextSelectionHelper.maybeSelectedView = null;
                        } else {
                            simpleTextSelectionHelper.maybeSelectedView = simpleTextSelectionHelper.selectabeleView;
                            int i6 = (int) f;
                            simpleTextSelectionHelper.maybeTextX = i6;
                            int i7 = (int) f2;
                            simpleTextSelectionHelper.maybeTextY = i7;
                            TextSelectionHelper.LayoutBlock layoutBlock2 = simpleTextSelectionHelper.layoutBlock;
                            layoutBlock2.layout = staticTextLayout;
                            layoutBlock2.xOffset = f;
                            layoutBlock2.yOffset = f2;
                            layoutBlock2.charOffset = 0;
                            rect.set(i6, i7, (int) (f + staticTextLayout.getWidth()), (int) (f2 + staticTextLayout.getHeight()));
                        }
                        simpleTextSelectionHelper.onTouchEvent(motionEvent);
                    }
                    if (simpleTextSelectionHelper.isInSelectionMode()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (super.dispatchTouchEvent(motionEvent)) {
                    }
                }
            }
            return true;
        }

        public float getAnimatedHeight() {
            int i = this.verticalPadding * 2;
            TextState[] textStateArr = this.state;
            int i2 = textStateArr[0].textHeight;
            TextState textState = textStateArr[1];
            return AndroidUtilities.lerp(i2, textState != null ? textState.textHeight : 0, this.updateT) + i;
        }

        public Paint getPaint() {
            return this.textPaint;
        }

        @Override
        public Layout getStaticTextLayout() {
            return this.state[0].fullLayout;
        }

        @Override
        public CharSequence getText() {
            return this.state[0].text;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            int i = 0;
            TextState textState = this.state[0];
            AnimatedEmojiSpan.release(StoryCaptionTextView.this, textState.fullLayoutEmoji);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = textState.firstLayoutEmoji;
            StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
            AnimatedEmojiSpan.release(storyCaptionTextView, emojiGroupedSpans);
            if (textState.nextLinesLayouts == null) {
                return;
            }
            while (true) {
                LineInfo[] lineInfoArr = textState.nextLinesLayouts;
                if (i >= lineInfoArr.length) {
                    return;
                }
                LineInfo lineInfo = lineInfoArr[i];
                if (lineInfo != null) {
                    AnimatedEmojiSpan.release(storyCaptionTextView, lineInfo.layoutEmoji);
                }
                i++;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.showMore != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            TextState[] textStateArr = this.state;
            textStateArr[0].draw(canvas2, 1.0f - this.updateT);
            TextState textState = textStateArr[1];
            if (textState != null) {
                textState.draw(canvas2, this.updateT);
            }
            if (this.showMore != null) {
                float scrollY = this.showMoreY + StoryCaptionView.this.getScrollY();
                float fClamp = 1.0f - Utilities.clamp(this.progressToExpand / 0.5f, 1.0f, 0.0f);
                Paint paint = this.xRefGradinetPaint;
                int i = (int) (fClamp * 255.0f);
                paint.setAlpha(i);
                Paint paint2 = this.xRefPaint;
                paint2.setAlpha(i);
                this.showMorePaint.setAlpha(i);
                canvas2.save();
                canvas2.translate(this.showMoreX - AndroidUtilities.dp(32.0f), scrollY);
                canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.showMore.getHeight() + this.verticalPadding, paint);
                canvas2.restore();
                canvas2.drawRect(this.showMoreX - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.showMore.getHeight() + scrollY + this.verticalPadding, paint2);
                canvas2.save();
                canvas2.translate(this.showMoreX, scrollY);
                this.showMore.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3 = (i2 + i) << 16;
            this.horizontalPadding = AndroidUtilities.dp(16.0f);
            this.verticalPadding = AndroidUtilities.dp(8.0f);
            int i4 = this.sizeCached;
            TextState[] textStateArr = this.state;
            if (i4 != i3) {
                this.sizeCached = i3;
                int iMax = Math.max(0, View.MeasureSpec.getSize(i) - (this.horizontalPadding * 2));
                textStateArr[0].measure(iMax);
                TextState textState = textStateArr[1];
                if (textState != null) {
                    textState.measure(iMax);
                }
            }
            int i5 = this.verticalPadding * 2;
            int i6 = textStateArr[0].textHeight;
            TextState textState2 = textStateArr[1];
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i6, textState2 != null ? textState2.textHeight : 0, this.updateT) + i5, 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            TextState[] textStateArr;
            boolean z;
            boolean z2;
            AnimatedEmojiSpan animatedEmojiSpan;
            CharacterStyle characterStyle;
            CharacterStyle characterStyle2;
            AnimatedEmojiSpan[] animatedEmojiSpanArr;
            if (!StoryCaptionView.this.disableTouches && (textStateArr = this.state) != null) {
                TextState textState = textStateArr[0];
                if (textState.fullLayout != null) {
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    StaticLayout staticLayout = storyCaptionTextView.showMore;
                    if (staticLayout != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f = storyCaptionTextView.showMoreX;
                        rectF.set(f, storyCaptionTextView.showMoreY, staticLayout.getWidth() + f, storyCaptionTextView.showMoreY + storyCaptionTextView.showMore.getHeight());
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                    if ((z && motionEvent.getAction() == 0) || ((textState.pressedLink != null || textState.pressedEmoji != null) && motionEvent.getAction() == 1)) {
                        Panel panel = textState.topPanel;
                        int iDp = panel == null ? 0 : AndroidUtilities.dp(8.0f) + panel.height();
                        Panel panel2 = textState.bottomPanel;
                        int iDp2 = panel2 == null ? 0 : AndroidUtilities.dp(8.0f) + panel2.height();
                        int x = (int) (motionEvent.getX() - storyCaptionTextView.horizontalPadding);
                        int y = (int) ((motionEvent.getY() - storyCaptionTextView.verticalPadding) - (iDp + iDp2));
                        int lineForVertical = textState.fullLayout.getLineForVertical(y);
                        float f2 = x;
                        int offsetForHorizontal = textState.fullLayout.getOffsetForHorizontal(lineForVertical, f2);
                        float lineLeft = textState.fullLayout.getLineLeft(lineForVertical);
                        StoryCaptionView storyCaptionView = StoryCaptionView.this;
                        LinkSpanDrawable.LinkCollector linkCollector = textState.links;
                        if (lineLeft > f2 || textState.fullLayout.getLineWidth(lineForVertical) + lineLeft < f2 || y < 0 || y > textState.fullLayout.getHeight()) {
                            animatedEmojiSpan = null;
                            characterStyle = null;
                            z2 = false;
                        } else {
                            SpannableString spannableString = new SpannableString(textState.text);
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr == null || characterStyleArr.length == 0) {
                                characterStyleArr = (CharacterStyle[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpanMono.class);
                            }
                            if (characterStyleArr == null || characterStyleArr.length == 0) {
                                characterStyle = null;
                            } else {
                                characterStyle = characterStyleArr[0];
                                if (motionEvent.getAction() == 0) {
                                    linkCollector.clear(true);
                                    textState.pressedEmoji = null;
                                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(characterStyleArr[0], null, motionEvent.getX(), motionEvent.getY());
                                    textState.pressedLink = linkSpanDrawable;
                                    linkSpanDrawable.setColor(Theme.multAlpha(0.2f, -1));
                                    linkCollector.addLink(textState.pressedLink, null);
                                    int spanStart = spannableString.getSpanStart(textState.pressedLink.mSpan);
                                    int spanEnd = spannableString.getSpanEnd(textState.pressedLink.mSpan);
                                    LinkPath linkPathObtainNewPath = textState.pressedLink.obtainNewPath();
                                    linkPathObtainNewPath.setCurrentLayout(textState.fullLayout, spanStart, 0.0f, storyCaptionTextView.getPaddingTop());
                                    textState.fullLayout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                                    LinkSpanDrawable linkSpanDrawable2 = textState.pressedLink;
                                    storyCaptionView.textSelectionHelper.clear(false);
                                    storyCaptionTextView.postDelayed(new StoryViewer$5$$ExternalSyntheticLambda0(12, textState, linkSpanDrawable2), ViewConfiguration.getLongPressTimeout());
                                    z2 = true;
                                }
                                if (textState.pressedLink == null || z2 || (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, AnimatedEmojiSpan.class)) == null || animatedEmojiSpanArr.length == 0) {
                                    animatedEmojiSpan = null;
                                } else {
                                    animatedEmojiSpan = animatedEmojiSpanArr[0];
                                    if (motionEvent.getAction() == 0) {
                                        textState.pressedLink = null;
                                        textState.pressedEmoji = animatedEmojiSpanArr[0];
                                        z2 = true;
                                    }
                                }
                            }
                            z2 = false;
                            if (textState.pressedLink == null) {
                                animatedEmojiSpan = null;
                            } else {
                                animatedEmojiSpan = null;
                            }
                        }
                        if (motionEvent.getAction() == 1) {
                            linkCollector.clear(true);
                            LinkSpanDrawable linkSpanDrawable3 = textState.pressedLink;
                            if (linkSpanDrawable3 == null || (characterStyle2 = linkSpanDrawable3.mSpan) != characterStyle) {
                                AnimatedEmojiSpan animatedEmojiSpan2 = textState.pressedEmoji;
                                if (animatedEmojiSpan2 != null && animatedEmojiSpan2 == animatedEmojiSpan) {
                                    storyCaptionView.onEmojiClick(animatedEmojiSpan2);
                                }
                            } else {
                                storyCaptionView.onLinkClick(characterStyle2, storyCaptionView);
                            }
                            textState.pressedLink = null;
                            textState.pressedEmoji = null;
                            z2 = true;
                        }
                    } else if (motionEvent.getAction() == 3) {
                        TextState[] textStateArr2 = storyCaptionTextView.state;
                        textStateArr2[0].links.clear(true);
                        textStateArr2[0].pressedLink = null;
                        storyCaptionTextView.invalidate();
                        textState.pressedEmoji = null;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || super.onTouchEvent(motionEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public void setPressed(boolean z) {
            boolean z2 = z != isPressed();
            super.setPressed(z);
            if (z2) {
                invalidate();
            }
        }

        public final void setText(CharSequence charSequence, Panel panel, Panel panel2, boolean z, boolean z2) {
            if (charSequence == null) {
                charSequence = "";
            }
            TextState[] textStateArr = this.state;
            if (MediaDataController.stringsEqual(textStateArr[0].text, charSequence)) {
                TextState textState = textStateArr[0];
                if (textState.topPanel == panel && textState.bottomPanel == panel2) {
                    textState.translating = z;
                    invalidate();
                    return;
                }
            }
            this.isSpoilersRevealed = false;
            ValueAnimator valueAnimator = this.updateAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.updating = false;
            if (!z2) {
                textStateArr[0].setup(charSequence, panel, panel2);
                textStateArr[0].translating = z;
                invalidate();
                this.updateT = 0.0f;
                return;
            }
            if (textStateArr[1] == null) {
                textStateArr[1] = new TextState();
            }
            TextState textState2 = textStateArr[1];
            TextState textState3 = textStateArr[0];
            textState2.setup(textState3.text, textState3.topPanel, textState3.bottomPanel);
            TextState textState4 = textStateArr[1];
            TextState textState5 = textStateArr[0];
            textState4.translating = textState5.translating;
            textState4.translateT.set(textState5.translateT.value, true);
            textStateArr[0].setup(charSequence, panel, panel2);
            TextState textState6 = textStateArr[0];
            textState6.translating = z;
            textState6.translateT.set(0.0f, true);
            this.updateT = 1.0f;
            ValueAnimator valueAnimator2 = this.updateAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.updating = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.updateT, 0.0f);
            this.updateAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 3));
            this.updateAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 26));
            this.updateAnimator.setDuration(180L);
            this.updateAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.updateAnimator.start();
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                StoryCaptionView.this.invalidate();
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            Panel panel;
            Panel panel2;
            Panel panel3;
            Panel panel4;
            TextState[] textStateArr = this.state;
            TextState textState = textStateArr[0];
            if (textState != null && (textState.loadingDrawable == drawable || (((panel3 = textState.topPanel) != null && panel3.ripple == drawable) || ((panel4 = textState.bottomPanel) != null && panel4.ripple == drawable)))) {
                return true;
            }
            TextState textState2 = textStateArr[1];
            if (textState2 == null || (textState2.loadingDrawable != drawable && (((panel = textState2.topPanel) == null || panel.ripple != drawable) && ((panel2 = textState2.bottomPanel) == null || panel2.ripple != drawable)))) {
                return super.verifyDrawable(drawable);
            }
            return true;
        }
    }

    public StoryCaptionView(Context context, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(context, null);
        Paint paint = new Paint(1);
        this.pendingTopMargin = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.captionContainer = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        StoryCaptionTextView storyCaptionTextView = new StoryCaptionTextView(getContext());
        this.captionTextview = storyCaptionTextView;
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(storyCaptionTextView, darkThemeResourceProvider);
        this.textSelectionHelper = simpleTextSelectionHelper;
        simpleTextSelectionHelper.useMovingOffset = false;
        frameLayout.addView(storyCaptionTextView, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        SpringAnimation springAnimation = new SpringAnimation(storyCaptionTextView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.springAnimation = springAnimation;
        springAnimation.mSpring.setStiffness(100.0f);
        springAnimation.mMinVisibleChange = 1.0f;
        springAnimation.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, 14));
        springAnimation.mSpring.setDampingRatio(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("abortAnimatedScroll", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.scroller = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.scroller = null;
            FileLog.e(e2);
        }
    }

    public final void collapse$1() {
        int i = 0;
        if (this.expanded) {
            this.expanded = false;
            float scrollY = getScrollY();
            float f = this.captionTextview.progressToExpand;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new StoryCaptionView$$ExternalSyntheticLambda0(this, scrollY, f, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.nestedScrollStarted || this.overScrollY == 0.0f || (overScroller = this.scroller) == null || !overScroller.isFinished()) {
            return;
        }
        SpringAnimation springAnimation = this.springAnimation;
        if (!springAnimation.mRunning) {
            springAnimation.mVelocity = 0.0f;
            springAnimation.start();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            collapse$1();
        }
    }

    @Override
    public final boolean dispatchNestedPreScroll(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.nestedScrollStarted) {
            float f = this.overScrollY;
            if ((f > 0.0f && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f2 = i2;
                float f3 = f - f2;
                if (f > 0.0f) {
                    if (f3 < 0.0f) {
                        this.overScrollY = 0.0f;
                        iArr[1] = (int) (f2 + f3 + 0);
                    } else {
                        this.overScrollY = f3;
                        iArr[1] = i2;
                    }
                } else if (f3 > 0.0f) {
                    this.overScrollY = 0.0f;
                    iArr[1] = (int) (f2 + f3 + 0);
                } else {
                    this.overScrollY = f3;
                    iArr[1] = i2;
                }
                this.captionTextview.setTranslationY(this.overScrollY);
                this.textSelectionHelper.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        float f;
        if (i4 != 0) {
            int iRound = Math.round((1.0f - Math.abs((-this.overScrollY) / this.captionContainer.getTop())) * i4);
            if (iRound != 0) {
                boolean z = this.nestedScrollStarted;
                StoryCaptionTextView storyCaptionTextView = this.captionTextview;
                if (z) {
                    float f2 = this.overScrollY - iRound;
                    this.overScrollY = f2;
                    storyCaptionTextView.setTranslationY(f2);
                } else {
                    SpringAnimation springAnimation = this.springAnimation;
                    if (!springAnimation.mRunning) {
                        OverScroller overScroller = this.scroller;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f = 0.0f;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            float fMin = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            iRound = (int) ((iRound * fMin) / currVelocity);
                            f = fMin * (-this.velocitySign);
                        }
                        if (iRound != 0) {
                            float f3 = this.overScrollY - iRound;
                            this.overScrollY = f3;
                            storyCaptionTextView.setTranslationY(f3);
                        }
                        if (!springAnimation.mRunning) {
                            springAnimation.mVelocity = f;
                            springAnimation.start();
                        }
                        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
                            collapse$1();
                        }
                    }
                }
            }
        }
        this.textSelectionHelper.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.disableDraw) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int iSave = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.blackoutBottomOffset + i);
        canvas.clipRect(0, scrollY, width, i);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override
    public final void drawScrim(Canvas canvas, float f) {
        StoryCaptionTextView.TextState textState;
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        StoryCaptionTextView.TextState[] textStateArr = storyCaptionTextView.state;
        if (textStateArr == null || (textState = textStateArr[0]) == null || textState.bottomPanel == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x = storyCaptionTextView.getX() - getScrollX();
        FrameLayout frameLayout = this.captionContainer;
        float x2 = frameLayout.getX() + x + storyCaptionTextView.horizontalPadding;
        float y = frameLayout.getY() + (storyCaptionTextView.getY() - getScrollY()) + storyCaptionTextView.verticalPadding;
        StoryCaptionTextView.TextState[] textStateArr2 = storyCaptionTextView.state;
        StoryCaptionTextView.TextState textState2 = textStateArr2[0];
        canvas.translate(x2, (y + AndroidUtilities.lerp(textState2.collapsedTextHeight, textState2.textHeight, storyCaptionTextView.progressToExpand)) - textStateArr2[0].bottomPanel.height());
        Panel panel = textStateArr2[0].bottomPanel;
        int width = getWidth();
        int i = storyCaptionTextView.horizontalPadding;
        panel.draw(canvas, (width - i) - i);
        canvas.restore();
    }

    public final void expand(boolean z) {
        int i = 1;
        if (!this.expanded || z) {
            this.expanded = true;
            float scrollY = getScrollY();
            float f = this.captionTextview.progressToExpand;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new StoryCaptionView$$ExternalSyntheticLambda0(this, scrollY, f, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    public final void fling(int i) {
        super.fling(i);
        this.velocitySign = Math.signum(i);
        this.velocityY = 0.0f;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void getBounds(RectF rectF) {
        StoryCaptionTextView.TextState textState;
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        StoryCaptionTextView.TextState[] textStateArr = storyCaptionTextView.state;
        if (textStateArr == null || (textState = textStateArr[0]) == null || textState.bottomPanel == null) {
            return;
        }
        float f = storyCaptionTextView.horizontalPadding;
        float fLerp = (AndroidUtilities.lerp(textState.collapsedTextHeight, textState.textHeight, storyCaptionTextView.progressToExpand) + storyCaptionTextView.verticalPadding) - storyCaptionTextView.state[0].bottomPanel.height();
        float width = getWidth() - storyCaptionTextView.horizontalPadding;
        int i = storyCaptionTextView.verticalPadding;
        StoryCaptionTextView.TextState textState2 = storyCaptionTextView.state[0];
        rectF.set(f, fLerp, width, AndroidUtilities.lerp(textState2.collapsedTextHeight, textState2.textHeight, storyCaptionTextView.progressToExpand) + i);
        float x = storyCaptionTextView.getX() - getScrollX();
        FrameLayout frameLayout = this.captionContainer;
        rectF.offset(frameLayout.getX() + x, frameLayout.getY() + (storyCaptionTextView.getY() - getScrollY()));
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.captionContainer;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i = this.pendingTopMargin;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.captionTextview.getTranslationY()) / Math.min(this.prevHeight, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.captionTextview.getTranslationY() + this.captionContainer.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.textSelectionHelper.invalidate();
    }

    public void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan) {
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryCaptionView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLinkClick(CharacterStyle characterStyle, View view) {
    }

    @Override
    public final void onMeasure(int i, int i2) {
        updateTopMargin(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public void onReplyClick(Panel panel) {
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryCaptionView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void reset() {
        scrollTo(0, 0);
        this.expanded = false;
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        storyCaptionTextView.progressToExpand = 0.0f;
        storyCaptionTextView.invalidate();
    }

    @Override
    public final void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        invalidate();
    }

    @Override
    public final boolean startNestedScroll(int i, int i2) {
        if (i2 == 0) {
            this.springAnimation.cancel();
            this.nestedScrollStarted = true;
            this.overScrollY = this.captionTextview.getTranslationY();
        }
        return true;
    }

    @Override
    public final void stopNestedScroll(int i) {
        OverScroller overScroller;
        if (this.nestedScrollStarted && i == 0) {
            this.nestedScrollStarted = false;
            if (this.overScrollY == 0.0f || (overScroller = this.scroller) == null || !overScroller.isFinished()) {
                return;
            }
            float f = this.velocityY;
            SpringAnimation springAnimation = this.springAnimation;
            if (!springAnimation.mRunning) {
                springAnimation.mVelocity = f;
                springAnimation.start();
            }
            if (getScrollY() < AndroidUtilities.dp(2.0f)) {
                collapse$1();
            }
        }
    }

    public final void updateTopMargin(int i, int i2) {
        int iLerp;
        if (i == 0 || i2 == 0) {
            iLerp = -1;
        } else {
            StoryCaptionTextView storyCaptionTextView = this.captionTextview;
            StoryCaptionTextView.TextState textState = storyCaptionTextView.state[0];
            CharSequence charSequence = textState.text;
            Panel panel = textState.topPanel;
            SpannableStringBuilder spannableStringBuilder = panel != null ? panel.title : null;
            String str = panel != null ? panel.text : null;
            int iHashCode = charSequence.hashCode();
            int iHashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int iHashCode3 = str != null ? str.hashCode() : 0;
            Point point = AndroidUtilities.displaySize;
            boolean z = point.x > point.y;
            if (this.textHash == iHashCode && this.replytitleHash == iHashCode2 && this.replytextHash == iHashCode3 && this.isLandscape == z && this.prevHeight == i2 && !storyCaptionTextView.updating) {
                iLerp = -1;
            } else {
                this.textHash = iHashCode;
                this.replytitleHash = iHashCode2;
                this.replytextHash = iHashCode3;
                this.isLandscape = z;
                this.prevHeight = i2;
                storyCaptionTextView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                StoryCaptionTextView.TextState[] textStateArr = storyCaptionTextView.state;
                int iCollapsedTextHeight = textStateArr[0].collapsedTextHeight(i2);
                StoryCaptionTextView.TextState textState2 = textStateArr[1];
                iLerp = AndroidUtilities.lerp(iCollapsedTextHeight, textState2 != null ? textState2.collapsedTextHeight(i2) : 0, storyCaptionTextView.updateT);
            }
        }
        if (iLerp >= 0) {
            ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin = iLerp;
            this.pendingTopMargin = -1;
        }
    }

    public void onLinkLongPress(URLSpan uRLSpan, View view, LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0) {
    }
}
