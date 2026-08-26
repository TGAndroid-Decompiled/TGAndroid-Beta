package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.FilteredSearchView;

public class SharedAudioCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public final int TAG;
    public boolean buttonPressed;
    public int buttonState;
    public int buttonX;
    public int buttonY;
    public StaticLayout captionLayout;
    public AnimatedEmojiSpan.EmojiGroupedSpans captionLayoutEmojis;
    public float captionLayoutLeft;
    public float captionLayoutWidth;
    public final TextPaint captionTextPaint;
    public int captionY;
    public final CheckBox2 checkBox;
    public boolean checkForButtonPress;
    public final int currentAccount;
    public MessageObject currentMessageObject;
    public StaticLayout dateLayout;
    public int dateLayoutX;
    public final TextPaint description2TextPaint;
    public StaticLayout descriptionLayout;
    public AnimatedEmojiSpan.EmojiGroupedSpans descriptionLayoutEmojis;
    public float descriptionLayoutLeft;
    public float descriptionLayoutWidth;
    public int descriptionY;
    public final SpannableStringBuilder dotSpan;
    public float enterAlpha;
    public FlickerLoadingView globalGradientView;
    public int hasMiniProgress;
    public boolean miniButtonPressed;
    public int miniButtonState;
    public boolean needDivider;
    public Utilities.CallbackReturn needPlayMessageListener;
    public final RadialProgress2 radialProgress;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean showName;
    public float showNameProgress;
    public boolean showReorderIcon;
    public float showReorderIconProgress;
    public StaticLayout titleLayout;
    public AnimatedEmojiSpan.EmojiGroupedSpans titleLayoutEmojis;
    public float titleLayoutLeft;
    public float titleLayoutWidth;
    public final TextPaint titlePaint;
    public final int titleY;
    public final int viewType;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
            Object obj = uItem.object;
            if (obj instanceof MessageObject) {
                sharedAudioCell.setMessageObject((MessageObject) obj, z);
            } else if (obj instanceof MediaController.AudioEntry) {
                MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
                sharedAudioCell.setTag(audioEntry);
                sharedAudioCell.setMessageObject(audioEntry.messageObject, z);
            }
            Object obj2 = uItem.object2;
            if (obj2 instanceof Utilities.CallbackReturn) {
                sharedAudioCell.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
            }
            sharedAudioCell.setChecked(uItem.checked, false);
        }

        @Override
        public final boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id && uItem.object == uItem2.object;
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            SharedAudioCell sharedAudioCell = new SharedAudioCell(context, 0, resourcesProvider);
            sharedAudioCell.setCheckForButtonPress(true);
            return sharedAudioCell;
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id && uItem.object == uItem2.object;
        }
    }

    public SharedAudioCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.titleY = AndroidUtilities.dp(9.0f);
        this.descriptionY = AndroidUtilities.dp(29.0f);
        this.captionY = AndroidUtilities.dp(29.0f);
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        this.showName = true;
        this.showNameProgress = 0.0f;
        this.enterAlpha = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.viewType = i;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(resourcesProvider, this);
        this.radialProgress = radialProgress2;
        int i3 = Theme.key_chat_inLoader;
        int i4 = Theme.key_chat_inLoaderSelected;
        int i5 = Theme.key_chat_inMediaIcon;
        int i6 = Theme.key_chat_inMediaIconSelected;
        radialProgress2.circleColorKey = i3;
        radialProgress2.circlePressedColorKey = i4;
        radialProgress2.iconColorKey = i5;
        radialProgress2.iconPressedColorKey = i6;
        this.TAG = DownloadController.getInstance(i2).generateObserverTag();
        setWillNotDraw(false);
        CheckBox2 checkBox2 = new CheckBox2(context, 22, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setVisibility(4);
        checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(3);
        boolean z = LocaleController.isRTL;
        addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 38.1f, 32.1f, z ? 6.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.description2TextPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.dotSpan = spannableStringBuilder;
            spannableStringBuilder.setSpan(new DotDividerSpan(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.captionTextPaint = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (resourcesProvider != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.titlePaint = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(resourcesProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
        }
    }

    private int getIconForCurrentState() {
        int i = this.buttonState;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.miniButtonState;
        if (i < 0) {
            return 4;
        }
        return i == 0 ? 2 : 3;
    }

    public void didPressedButton() {
        int i = this.buttonState;
        int i2 = this.currentAccount;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (i == 0) {
            if (this.miniButtonState == 0) {
                this.currentMessageObject.putInDownloadsStore = true;
                FileLoader.getInstance(i2).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 0);
            }
            if (needPlayMessage(this.currentMessageObject)) {
                if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                    this.miniButtonState = 1;
                    radialProgress2.setProgress(0.0f, false);
                    radialProgress2.setMiniIcon(getMiniIconForCurrentState(), false, true);
                }
                this.buttonState = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                this.buttonState = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i == 2) {
            radialProgress2.setProgress(0.0f, false);
            this.currentMessageObject.putInDownloadsStore = true;
            FileLoader.getInstance(i2).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 0);
            this.buttonState = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i == 4) {
            FileLoader.getInstance(i2).cancelLoadFile(this.currentMessageObject.getDocument());
            this.buttonState = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        updateButtonState(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z = this.showName;
        if (z) {
            float f2 = this.showNameProgress;
            if (f2 != 1.0f) {
                this.showNameProgress = f2 + 0.10666667f;
                invalidate();
            } else if (!z) {
                f = this.showNameProgress;
                if (f != 0.0f) {
                    this.showNameProgress = f - 0.10666667f;
                    invalidate();
                }
            }
        } else if (!z) {
            f = this.showNameProgress;
            if (f != 0.0f) {
                this.showNameProgress = f - 0.10666667f;
                invalidate();
            }
        }
        this.showNameProgress = Utilities.clamp(this.showNameProgress, 1.0f, 0.0f);
        if (this.enterAlpha == 1.0f || this.globalGradientView == null) {
            drawInternal$1(canvas);
            drawReorder(canvas);
            super.dispatchDraw(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.enterAlpha) * 255.0f), 31);
        this.globalGradientView.setViewType(4);
        this.globalGradientView.updateColors$1();
        this.globalGradientView.updateGradient();
        this.globalGradientView.draw(canvas);
        canvas.restore();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.enterAlpha * 255.0f), 31);
        drawInternal$1(canvas);
        super.dispatchDraw(canvas);
        drawReorder(canvas);
        canvas.restore();
    }

    public final void drawInternal$1(Canvas canvas) {
        StaticLayout staticLayout;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (this.viewType == 1) {
            this.description2TextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        }
        StaticLayout staticLayout2 = this.dateLayout;
        int i = this.titleY;
        int width = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.dateLayoutX), i);
            this.dateLayout.draw(canvas);
            canvas.restore();
        }
        if (this.titleLayout != null) {
            int alpha = Theme.chat_contextResult_titleTextPaint.getAlpha();
            float f = this.showNameProgress;
            if (f != 1.0f) {
                Theme.chat_contextResult_titleTextPaint.setAlpha((int) (alpha * f));
            }
            canvas.save();
            int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && (staticLayout = this.dateLayout) != null) {
                width = staticLayout.getWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 4.0f);
            }
            canvas.translate(((iDp + width) + (LocaleController.isRTL ? this.titleLayout.getWidth() - this.titleLayoutWidth : 0.0f)) - this.titleLayoutLeft, i);
            this.titleLayout.draw(canvas);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.titleLayout, this.titleLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.showNameProgress != 1.0f) {
                Theme.chat_contextResult_titleTextPaint.setAlpha(alpha);
            }
        }
        if (this.captionLayout != null) {
            this.captionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.captionLayout.getWidth() - this.captionLayoutWidth : 0.0f)) - this.captionLayoutLeft, this.captionY);
            this.captionLayout.draw(canvas);
            canvas.restore();
        }
        if (this.descriptionLayout != null) {
            Theme.chat_contextResult_descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            int alpha2 = Theme.chat_contextResult_descriptionTextPaint.getAlpha();
            float f2 = this.showNameProgress;
            if (f2 != 1.0f) {
                Theme.chat_contextResult_descriptionTextPaint.setAlpha((int) (alpha2 * f2));
            }
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.descriptionLayout.getWidth() - this.descriptionLayoutWidth : 0.0f)) - this.descriptionLayoutLeft, this.descriptionY);
            this.descriptionLayout.draw(canvas);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.descriptionLayout, this.descriptionLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.showNameProgress != 1.0f) {
                Theme.chat_contextResult_descriptionTextPaint.setAlpha(alpha2);
            }
        }
        int color = Theme.getColor(this.buttonPressed ? Theme.key_chat_inAudioSelectedProgress : Theme.key_chat_inAudioProgress, resourcesProvider);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.progressColor = color;
        radialProgress2.overlayImageAlpha = this.showNameProgress;
        radialProgress2.draw(canvas);
        if (this.needDivider) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, Theme.getThemePaint("paintDivider", resourcesProvider));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.getThemePaint("paintDivider", resourcesProvider));
            }
        }
    }

    public final void drawReorder(Canvas canvas) {
        float f;
        boolean z = this.showReorderIcon;
        if (z || this.showReorderIconProgress != 0.0f) {
            if (z) {
                float f2 = this.showReorderIconProgress;
                if (f2 != 1.0f) {
                    this.showReorderIconProgress = f2 + 0.10666667f;
                    invalidate();
                } else if (!z) {
                    f = this.showReorderIconProgress;
                    if (f != 0.0f) {
                        this.showReorderIconProgress = f - 0.10666667f;
                        invalidate();
                    }
                }
            } else if (!z) {
                f = this.showReorderIconProgress;
                if (f != 0.0f) {
                    this.showReorderIconProgress = f - 0.10666667f;
                    invalidate();
                }
            }
            this.showReorderIconProgress = Utilities.clamp(this.showReorderIconProgress, 1.0f, 0.0f);
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - Theme.dialogs_reorderDrawable.getIntrinsicWidth();
            int measuredHeight = (getMeasuredHeight() - Theme.dialogs_reorderDrawable.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f3 = this.showReorderIconProgress;
            canvas.scale(f3, f3, (Theme.dialogs_reorderDrawable.getIntrinsicWidth() / 2.0f) + measuredWidth, (Theme.dialogs_reorderDrawable.getIntrinsicHeight() / 2.0f) + measuredHeight);
            Drawable drawable = Theme.dialogs_reorderDrawable;
            drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, Theme.dialogs_reorderDrawable.getIntrinsicHeight() + measuredHeight);
            Theme.dialogs_reorderDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public MessageObject getMessage() {
        return this.currentMessageObject;
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    public boolean needPlayMessage(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.needPlayMessageListener;
        return callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.radialProgress.overlayImageView.onAttachedToWindow();
        updateButtonState(false, false);
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.titleLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.titleLayoutEmojis, this.titleLayout);
        this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, this.descriptionLayout);
        this.captionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.captionLayoutEmojis, this.captionLayout);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        DownloadController.getInstance(i).removeLoadingFileObserver(this);
        this.radialProgress.overlayImageView.onDetachedFromWindow();
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        AnimatedEmojiSpan.release(this, this.titleLayoutEmojis);
        AnimatedEmojiSpan.release(this, this.descriptionLayoutEmojis);
        AnimatedEmojiSpan.release(this, this.captionLayoutEmojis);
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState(true, z);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.currentMessageObject.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.currentMessageObject.getMusicAuthor(), this.currentMessageObject.getMusicTitle()));
        } else if (this.titleLayout != null && this.descriptionLayout != null) {
            accessibilityNodeInfo.setText(((Object) this.titleLayout.getText()) + ", " + ((Object) this.descriptionLayout.getText()));
        }
        if (this.checkBox.checkBoxBase.isChecked) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState == 1) {
            string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        } else if (iconForCurrentState != 2) {
            string = iconForCurrentState != 3 ? LocaleController.getString("AccActionPlay", R.string.AccActionPlay) : LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
        } else {
            string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iDp;
        float f;
        CharSequence charSequenceCreateFromInfoString;
        String str;
        int iDp2;
        int iDp3;
        float lineLeft;
        float lineWidth;
        CharSequence charSequenceReplace;
        CharSequence charSequenceHighlightText;
        CharSequence charSequenceReplaceEmoji;
        CharSequence charSequenceHighlightText2;
        StaticLayout staticLayout;
        float lineLeft2;
        float lineWidth2;
        this.descriptionLayout = null;
        this.titleLayout = null;
        this.captionLayout = null;
        int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(28.0f);
        TextPaint textPaint = this.description2TextPaint;
        int i3 = this.viewType;
        if (i3 == 1) {
            String strStringForMessageListDate = LocaleController.stringForMessageListDate(this.currentMessageObject.messageOwner.date);
            int iCeil = (int) Math.ceil(textPaint.measureText(strStringForMessageListDate));
            this.dateLayout = ChatMessageCell.generateStaticLayout(strStringForMessageListDate, textPaint, iCeil, iCeil, 0, 1);
            this.dateLayoutX = AndroidUtilities.dp(20.0f) + ((size - iCeil) - AndroidUtilities.dp(8.0f));
            iDp = AndroidUtilities.dp(12.0f) + iCeil;
        } else {
            iDp = 0;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i3 == 1) {
            try {
                if (this.currentMessageObject.isVoice() || this.currentMessageObject.isRoundVideo()) {
                    charSequenceCreateFromInfoString = FilteredSearchView.createFromInfoString(this.currentMessageObject, true, 1, null);
                } else {
                    charSequenceCreateFromInfoString = this.currentMessageObject.getMusicTitle().replace('\n', ' ');
                }
            } catch (Exception e) {
                e = e;
                f = 4.0f;
                FileLog.e(e);
                str = "";
                if (this.currentMessageObject.hasHighlightedWords()) {
                    if (TextUtils.isEmpty(this.currentMessageObject.messageOwner.message)) {
                        charSequenceReplaceEmoji = "";
                    } else {
                        charSequenceReplaceEmoji = Emoji.replaceEmoji(this.currentMessageObject.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), Theme.chat_msgTextPaint.getFontMetricsInt(), false);
                    }
                    charSequenceHighlightText2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji, this.currentMessageObject.highlightedWords, resourcesProvider);
                    if (charSequenceHighlightText2 != null) {
                        String str2 = this.currentMessageObject.highlightedWords.get(0);
                        TextPaint textPaint2 = this.captionTextPaint;
                        staticLayout = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, str2, size, textPaint2, 130), textPaint2, size, TextUtils.TruncateAt.END), textPaint2, AndroidUtilities.dp(f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.captionLayout = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            lineLeft2 = this.captionLayout.getLineLeft(0);
                        } else {
                            lineLeft2 = 0.0f;
                        }
                        this.captionLayoutLeft = lineLeft2;
                        if (this.captionLayout.getLineCount() > 0) {
                            lineWidth2 = this.captionLayout.getLineWidth(0);
                        } else {
                            lineWidth2 = 0.0f;
                        }
                        this.captionLayoutWidth = lineWidth2;
                    }
                    this.captionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.captionLayoutEmojis, this.captionLayout);
                }
                if (i3 == 1) {
                    try {
                        if (this.currentMessageObject.isVoice()) {
                        }
                        String duration = AndroidUtilities.formatDuration((int) this.currentMessageObject.getDuration(), false);
                        if (i3 == 1) {
                            textPaint = Theme.chat_contextResult_descriptionTextPaint;
                        }
                        this.descriptionLayout = new StaticLayout(TextUtils.ellipsize(duration, textPaint, size, TextUtils.TruncateAt.END), textPaint, size + AndroidUtilities.dp(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        if (this.descriptionLayout.getLineCount() > 0) {
                            lineLeft = this.descriptionLayout.getLineLeft(0);
                        } else {
                            lineLeft = 0.0f;
                        }
                        this.descriptionLayoutLeft = lineLeft;
                        if (this.descriptionLayout.getLineCount() > 0) {
                            lineWidth = this.descriptionLayout.getLineWidth(0);
                        } else {
                            lineWidth = 0.0f;
                        }
                        this.descriptionLayoutWidth = lineWidth;
                        this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, this.descriptionLayout);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                } else {
                    charSequenceReplace = this.currentMessageObject.getMusicAuthor().replace('\n', ' ');
                    charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceReplace, this.currentMessageObject.highlightedWords, resourcesProvider);
                    if (charSequenceHighlightText != null) {
                        charSequenceReplace = charSequenceHighlightText;
                    }
                    if (i3 == 1) {
                        charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.dotSpan).append(' ').append(FilteredSearchView.createFromInfoString(this.currentMessageObject, true, 1, null));
                    }
                    if (i3 != 1) {
                        textPaint = Theme.chat_contextResult_descriptionTextPaint;
                    }
                    if (this.currentMessageObject.getDuration() > 0.0d) {
                        str = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.currentMessageObject.getDuration()));
                    }
                    this.descriptionLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(charSequenceReplace, textPaint, size - textPaint.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint, size + AndroidUtilities.dp(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    if (this.descriptionLayout.getLineCount() > 0) {
                        lineLeft = this.descriptionLayout.getLineLeft(0);
                    } else {
                        lineLeft = 0.0f;
                    }
                    this.descriptionLayoutLeft = lineLeft;
                    if (this.descriptionLayout.getLineCount() > 0) {
                        lineWidth = this.descriptionLayout.getLineWidth(0);
                    } else {
                        lineWidth = 0.0f;
                    }
                    this.descriptionLayoutWidth = lineWidth;
                    this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, this.descriptionLayout);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(56.0f) + (this.captionLayout != null ? AndroidUtilities.dp(18.0f) : 0) + (this.needDivider ? 1 : 0));
                iDp2 = AndroidUtilities.dp(52.0f);
                if (LocaleController.isRTL) {
                    iDp3 = RichMessageLayout$$ExternalSyntheticOutline2.m(View.MeasureSpec.getSize(i), 8.0f, iDp2);
                } else {
                    iDp3 = AndroidUtilities.dp(8.0f);
                }
                int iDp4 = AndroidUtilities.dp(f) + iDp3;
                this.buttonX = iDp4;
                int iDp5 = AndroidUtilities.dp(6.0f);
                this.buttonY = iDp5;
                this.radialProgress.setProgressRect(iDp4, iDp5, AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(50.0f));
                measureChildWithMargins(this.checkBox, i, 0, i2, 0);
                if (this.captionLayout != null) {
                    this.descriptionY = AndroidUtilities.dp(29.0f);
                } else {
                    this.captionY = AndroidUtilities.dp(29.0f);
                    this.descriptionY = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(29.0f);
                }
            }
        } else {
            charSequenceCreateFromInfoString = this.currentMessageObject.getMusicTitle().replace('\n', ' ');
        }
        f = 4.0f;
        try {
            CharSequence charSequenceHighlightText3 = AndroidUtilities.highlightText(charSequenceCreateFromInfoString, this.currentMessageObject.highlightedWords, resourcesProvider);
            if (charSequenceHighlightText3 != null) {
                charSequenceCreateFromInfoString = charSequenceHighlightText3;
            }
            TextPaint textPaint3 = this.titlePaint;
            if (textPaint3 == null) {
                textPaint3 = Theme.chat_contextResult_titleTextPaint;
            }
            StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequenceCreateFromInfoString, textPaint3, size - iDp, TextUtils.TruncateAt.END), textPaint3, (AndroidUtilities.dp(4.0f) + size) - iDp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.titleLayout = staticLayout2;
            this.titleLayoutLeft = staticLayout2.getLineCount() > 0 ? this.titleLayout.getLineLeft(0) : 0.0f;
            this.titleLayoutWidth = this.titleLayout.getLineCount() > 0 ? this.titleLayout.getLineWidth(0) : 0.0f;
            this.titleLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.titleLayoutEmojis, this.titleLayout);
        } catch (Exception e3) {
            e = e3;
            FileLog.e(e);
        }
        str = "";
        if (this.currentMessageObject.hasHighlightedWords()) {
            if (TextUtils.isEmpty(this.currentMessageObject.messageOwner.message)) {
                charSequenceReplaceEmoji = "";
            } else {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(this.currentMessageObject.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), Theme.chat_msgTextPaint.getFontMetricsInt(), false);
            }
            charSequenceHighlightText2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji, this.currentMessageObject.highlightedWords, resourcesProvider);
            if (charSequenceHighlightText2 != null) {
                String str3 = this.currentMessageObject.highlightedWords.get(0);
                TextPaint textPaint4 = this.captionTextPaint;
                staticLayout = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, str3, size, textPaint4, 130), textPaint4, size, TextUtils.TruncateAt.END), textPaint4, AndroidUtilities.dp(f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.captionLayout = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    lineLeft2 = this.captionLayout.getLineLeft(0);
                } else {
                    lineLeft2 = 0.0f;
                }
                this.captionLayoutLeft = lineLeft2;
                if (this.captionLayout.getLineCount() > 0) {
                    lineWidth2 = this.captionLayout.getLineWidth(0);
                } else {
                    lineWidth2 = 0.0f;
                }
                this.captionLayoutWidth = lineWidth2;
            }
            this.captionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.captionLayoutEmojis, this.captionLayout);
        }
        if (i3 == 1) {
            if (!this.currentMessageObject.isVoice() || this.currentMessageObject.isRoundVideo()) {
                String duration2 = AndroidUtilities.formatDuration((int) this.currentMessageObject.getDuration(), false);
                if (i3 == 1) {
                    textPaint = Theme.chat_contextResult_descriptionTextPaint;
                }
                this.descriptionLayout = new StaticLayout(TextUtils.ellipsize(duration2, textPaint, size, TextUtils.TruncateAt.END), textPaint, size + AndroidUtilities.dp(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                charSequenceReplace = this.currentMessageObject.getMusicAuthor().replace('\n', ' ');
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceReplace, this.currentMessageObject.highlightedWords, resourcesProvider);
                if (charSequenceHighlightText != null) {
                    charSequenceReplace = charSequenceHighlightText;
                }
                if (i3 == 1) {
                    charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.dotSpan).append(' ').append(FilteredSearchView.createFromInfoString(this.currentMessageObject, true, 1, null));
                }
                if (i3 != 1) {
                    textPaint = Theme.chat_contextResult_descriptionTextPaint;
                }
                if (this.currentMessageObject.getDuration() > 0.0d) {
                    str = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.currentMessageObject.getDuration()));
                }
                this.descriptionLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(charSequenceReplace, textPaint, size - textPaint.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint, size + AndroidUtilities.dp(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            if (this.descriptionLayout.getLineCount() > 0) {
                lineLeft = this.descriptionLayout.getLineLeft(0);
            } else {
                lineLeft = 0.0f;
            }
            this.descriptionLayoutLeft = lineLeft;
            if (this.descriptionLayout.getLineCount() > 0) {
                lineWidth = this.descriptionLayout.getLineWidth(0);
            } else {
                lineWidth = 0.0f;
            }
            this.descriptionLayoutWidth = lineWidth;
            this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, this.descriptionLayout);
        } else {
            charSequenceReplace = this.currentMessageObject.getMusicAuthor().replace('\n', ' ');
            charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceReplace, this.currentMessageObject.highlightedWords, resourcesProvider);
            if (charSequenceHighlightText != null) {
                charSequenceReplace = charSequenceHighlightText;
            }
            if (i3 == 1) {
                charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.dotSpan).append(' ').append(FilteredSearchView.createFromInfoString(this.currentMessageObject, true, 1, null));
            }
            if (i3 != 1) {
                textPaint = Theme.chat_contextResult_descriptionTextPaint;
            }
            if (this.currentMessageObject.getDuration() > 0.0d) {
                str = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.currentMessageObject.getDuration()));
            }
            this.descriptionLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(charSequenceReplace, textPaint, size - textPaint.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint, size + AndroidUtilities.dp(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (this.descriptionLayout.getLineCount() > 0) {
                lineLeft = this.descriptionLayout.getLineLeft(0);
            } else {
                lineLeft = 0.0f;
            }
            this.descriptionLayoutLeft = lineLeft;
            if (this.descriptionLayout.getLineCount() > 0) {
                lineWidth = this.descriptionLayout.getLineWidth(0);
            } else {
                lineWidth = 0.0f;
            }
            this.descriptionLayoutWidth = lineWidth;
            this.descriptionLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.descriptionLayoutEmojis, this.descriptionLayout);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(56.0f) + (this.captionLayout != null ? AndroidUtilities.dp(18.0f) : 0) + (this.needDivider ? 1 : 0));
        iDp2 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
            iDp3 = RichMessageLayout$$ExternalSyntheticOutline2.m(View.MeasureSpec.getSize(i), 8.0f, iDp2);
        } else {
            iDp3 = AndroidUtilities.dp(8.0f);
        }
        int iDp6 = AndroidUtilities.dp(f) + iDp3;
        this.buttonX = iDp6;
        int iDp7 = AndroidUtilities.dp(6.0f);
        this.buttonY = iDp7;
        this.radialProgress.setProgressRect(iDp6, iDp7, AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(50.0f));
        measureChildWithMargins(this.checkBox, i, 0, i2, 0);
        if (this.captionLayout != null) {
            this.descriptionY = AndroidUtilities.dp(29.0f);
        } else {
            this.captionY = AndroidUtilities.dp(29.0f);
            this.descriptionY = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(29.0f);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
        if (this.hasMiniProgress != 0) {
            if (this.miniButtonState != 1) {
                updateButtonState(false, true);
            }
        } else if (this.buttonState != 4) {
            updateButtonState(false, true);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        updateButtonState(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int iDp;
        int iDp2;
        int i;
        if (this.currentMessageObject == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int iDp3 = AndroidUtilities.dp(36.0f);
        boolean z3 = this.miniButtonState >= 0 && x >= (iDp2 = this.buttonX + (iDp = AndroidUtilities.dp(27.0f))) && x <= iDp2 + iDp3 && y >= (i = this.buttonY + iDp) && y <= i + iDp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (action == 0) {
            if (!z3) {
                if (this.checkForButtonPress && radialProgress2.progressRect.contains(x, y)) {
                    requestDisallowInterceptTouchEvent(true);
                    this.buttonPressed = true;
                    radialProgress2.setPressed(true, false);
                    invalidate();
                }
                radialProgress2.setPressed(this.miniButtonPressed, true);
                if (!z || this.buttonPressed) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (motionEvent.getAction() != 3) {
                    return z2;
                }
                this.miniButtonPressed = false;
                this.buttonPressed = false;
                radialProgress2.setPressed(false, false);
                radialProgress2.setPressed(this.miniButtonPressed, true);
                return false;
            }
            this.miniButtonPressed = true;
            radialProgress2.setPressed(true, true);
            invalidate();
            z = true;
            radialProgress2.setPressed(this.miniButtonPressed, true);
            if (z) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (motionEvent.getAction() != 3) {
                return z2;
            }
            this.miniButtonPressed = false;
            this.buttonPressed = false;
            radialProgress2.setPressed(false, false);
            radialProgress2.setPressed(this.miniButtonPressed, true);
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.miniButtonPressed) {
                this.miniButtonPressed = false;
                playSoundEffect(0);
                int i2 = this.miniButtonState;
                int i3 = this.currentAccount;
                if (i2 == 0) {
                    this.miniButtonState = 1;
                    radialProgress2.setProgress(0.0f, false);
                    FileLoader.getInstance(i3).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 0);
                    radialProgress2.setMiniIcon(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.miniButtonState = 0;
                    FileLoader.getInstance(i3).cancelLoadFile(this.currentMessageObject.getDocument());
                    radialProgress2.setMiniIcon(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (this.buttonPressed) {
                this.buttonPressed = false;
                playSoundEffect(0);
                didPressedButton();
                invalidate();
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
            this.miniButtonPressed = false;
            this.buttonPressed = false;
            invalidate();
        } else if (motionEvent.getAction() == 2 && !z3 && this.miniButtonPressed) {
            this.miniButtonPressed = false;
            invalidate();
        }
        z = false;
        radialProgress2.setPressed(this.miniButtonPressed, true);
        if (z) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (motionEvent.getAction() != 3) {
            return z2;
        }
        this.miniButtonPressed = false;
        this.buttonPressed = false;
        radialProgress2.setPressed(false, false);
        radialProgress2.setPressed(this.miniButtonPressed, true);
        return false;
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        didPressedButton();
        return true;
    }

    public void setCheckForButtonPress(boolean z) {
        this.checkForButtonPress = z;
    }

    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2.getVisibility() != 0) {
            checkBox2.setVisibility(0);
        }
        checkBox2.checkBoxBase.setChecked(-1, z, z2);
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.enterAlpha != f) {
            this.enterAlpha = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    public final void setMessageObject(MessageObject messageObject, boolean z) {
        this.needDivider = z;
        this.currentMessageObject = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        boolean z2 = closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (z2 || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.setImageOverlay(closestPhotoSizeWithSize, document, messageObject);
        } else {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.overlayImageView.setImageBitmap(bitmap);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.setImageOverlay(null, null, null);
                } else {
                    radialProgress2.setImageOverlay(artworkUrl);
                }
            }
        }
        updateButtonState(false, false);
        requestLayout();
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.needPlayMessageListener = callbackReturn;
    }

    public final void updateButtonState(boolean z, boolean z2) {
        String fileName = this.currentMessageObject.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        boolean z3 = messageObject.attachPathExists || messageObject.mediaExists;
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.currentMessageObject.getDialogId()) != 0) {
            this.hasMiniProgress = z3 ? 1 : 2;
            z3 = true;
        } else {
            this.hasMiniProgress = 0;
            this.miniButtonState = -1;
        }
        int i = this.hasMiniProgress;
        int i2 = this.currentAccount;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (i == 0) {
            if (z3) {
                DownloadController.getInstance(i2).removeLoadingFileObserver(this);
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                radialProgress2.setProgress(1.0f, z2);
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
                invalidate();
                return;
            }
            DownloadController.getInstance(i2).addLoadingFileObserver(fileName, this.currentMessageObject, this);
            if (FileLoader.getInstance(i2).isLoadingFile(fileName)) {
                this.buttonState = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.setProgress(fileProgress.floatValue(), z2);
                } else {
                    radialProgress2.setProgress(0.0f, z2);
                }
            } else {
                this.buttonState = 2;
                radialProgress2.setProgress(0.0f, z2);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
            return;
        }
        radialProgress2.miniProgressBackgroundPaint.setColor(Theme.getColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outLoader : Theme.key_chat_inLoader, this.resourcesProvider));
        boolean zIsPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
        if (!zIsPlayingMessage2 || (zIsPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.buttonState = 0;
        } else {
            this.buttonState = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.hasMiniProgress == 1) {
            DownloadController.getInstance(i2).removeLoadingFileObserver(this);
            this.miniButtonState = -1;
            radialProgress2.setMiniIcon(getMiniIconForCurrentState(), z, z2);
            return;
        }
        DownloadController.getInstance(i2).addLoadingFileObserver(fileName, this.currentMessageObject, this);
        if (!FileLoader.getInstance(i2).isLoadingFile(fileName)) {
            this.miniButtonState = 0;
            radialProgress2.setMiniIcon(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.miniButtonState = 1;
        radialProgress2.setMiniIcon(getMiniIconForCurrentState(), z, z2);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.setProgress(fileProgress2.floatValue(), z2);
        } else {
            radialProgress2.setProgress(0.0f, z2);
        }
    }
}
