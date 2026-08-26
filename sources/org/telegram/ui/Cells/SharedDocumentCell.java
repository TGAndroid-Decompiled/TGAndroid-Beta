package org.telegram.ui.Cells;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.FilteredSearchView;

public final class SharedDocumentCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final int TAG;
    public CharSequence caption;
    public final TextView captionTextView;
    public final CheckBox2 checkBox;
    public final int currentAccount;
    public final AnimatedEmojiSpan.TextViewEmojis dateTextView;
    public final SpannableStringBuilder dotSpan;
    public long downloadedSize;
    public boolean drawDownloadIcon;
    public float enterAlpha;
    public final TextView extTextView;
    public FlickerLoadingView globalGradientView;
    public boolean ignoreRequestLayout;
    public boolean loaded;
    public boolean loading;
    public MessageObject message;
    public final TextView nameTextView;
    public boolean needDivider;
    public final ImageView placeholderImageView;
    public final LineProgressView progressView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView rightDateTextView;
    public boolean showReorderIcon;
    public float showReorderIconProgress;
    public final RLottieDrawable statusDrawable;
    public final RLottieImageView statusImageView;
    public final UserCell.AnonymousClass2 thumbImageView;
    public final int viewType;

    public SharedDocumentCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        float f;
        super(context);
        this.drawDownloadIcon = true;
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        this.enterAlpha = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.viewType = i;
        this.TAG = DownloadController.getInstance(i2).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.placeholderImageView = imageView;
        if (i == 1) {
            boolean z = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 12.0f, z ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z2 = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(40, 40.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 12.0f, 8.0f, z2 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.extTextView = textView;
        zzlj.m(Theme.key_files_iconText, resourcesProvider, textView, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i == 1) {
            boolean z3 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(32, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 20.0f, 28.0f, z3 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z4 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(32, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 22.0f, z4 ? 16.0f : 0.0f, 0.0f));
        }
        UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context, 2);
        this.thumbImageView = anonymousClass2;
        anonymousClass2.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i == 1) {
            boolean z5 = LocaleController.isRTL;
            addView(anonymousClass2, LayoutHelper.createFrame(42, 42.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z6 = LocaleController.isRTL;
            addView(anonymousClass2, LayoutHelper.createFrame(40, 40.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 12.0f, 8.0f, z6 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.nameTextView = textView2;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        zzlj.m(i3, resourcesProvider, textView2, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z7 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 8.0f : 72.0f, 9.0f, z7 ? 72.0f : 8.0f, 0.0f));
            f = 14.0f;
        } else if (i == 2) {
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            boolean z8 = LocaleController.isRTL;
            addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, (z8 ? 5 : 3) | 48, z8 ? 16.0f : 72.0f, 5.0f, z8 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.rightDateTextView = textView3;
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider, textView3, 14.0f);
            f = 14.0f;
            if (LocaleController.isRTL) {
                linearLayoutM.addView(textView3, LayoutHelper.createLinear(0.0f, -2, -2));
                linearLayoutM.addView(textView2, LayoutHelper.createLinear(1.0f, -2, -2, 0, 4, 0));
            } else {
                linearLayoutM.addView(textView2, LayoutHelper.createLinear(1.0f, -2, -2));
                linearLayoutM.addView(textView3, LayoutHelper.createLinear(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.captionTextView = textView4;
            textView4.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z9 = LocaleController.isRTL;
            addView(textView4, LayoutHelper.createFrame(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 8.0f : 72.0f, 30.0f, z9 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f = 14.0f;
            textView2.setMaxLines(1);
            boolean z10 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 8.0f : 72.0f, 5.0f, z10 ? 72.0f : 8.0f, 0.0f));
        }
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f), AndroidUtilities.dp(f), true, null);
        this.statusDrawable = rLottieDrawable;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.statusImageView = rLottieImageView;
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setVisibility(4);
        int i4 = Theme.key_sharedMedia_startStopLoadIcon;
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), PorterDuff.Mode.SRC_IN));
        if (i == 1) {
            boolean z11 = LocaleController.isRTL;
            addView(rLottieImageView, LayoutHelper.createFrame(14, 14.0f, (z11 ? 5 : 3) | 48, z11 ? 8.0f : 70.0f, 37.0f, z11 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z12 = LocaleController.isRTL;
            addView(rLottieImageView, LayoutHelper.createFrame(14, 14.0f, (z12 ? 5 : 3) | 48, z12 ? 8.0f : 70.0f, 33.0f, z12 ? 72.0f : 8.0f, 0.0f));
        }
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
        this.dateTextView = textViewEmojis;
        textViewEmojis.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        textViewEmojis.setLines(1);
        textViewEmojis.setMaxLines(1);
        textViewEmojis.setSingleLine(true);
        textViewEmojis.setEllipsize(truncateAt);
        textViewEmojis.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        NotificationCenter.listenEmojiLoading(textViewEmojis);
        if (i == 1) {
            textViewEmojis.setTextSize(1, 13.0f);
            boolean z13 = LocaleController.isRTL;
            addView(textViewEmojis, LayoutHelper.createFrame(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 8.0f : 72.0f, 34.0f, z13 ? 72.0f : 8.0f, 0.0f));
        } else {
            textViewEmojis.setTextSize(1, 13.0f);
            boolean z14 = LocaleController.isRTL;
            addView(textViewEmojis, LayoutHelper.createFrame(-1, -2.0f, (z14 ? 5 : 3) | 48, z14 ? 8.0f : 72.0f, 30.0f, z14 ? 72.0f : 8.0f, 0.0f));
        }
        LineProgressView lineProgressView = new LineProgressView(context);
        this.progressView = lineProgressView;
        lineProgressView.setProgressColor(Theme.getColor(i4, resourcesProvider));
        boolean z15 = LocaleController.isRTL;
        addView(lineProgressView, LayoutHelper.createFrame(-1, 2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 72.0f, 54.0f, z15 ? 72.0f : 0.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setVisibility(4);
        checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(2);
        if (i == 1) {
            boolean z16 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z16 ? 5 : 3) | 48, z16 ? 0.0f : 38.0f, 36.0f, z16 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z17 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z17 ? 5 : 3) | 48, z17 ? 0.0f : 33.0f, 28.0f, z17 ? 33.0f : 0.0f, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.dotSpan = spannableStringBuilder;
            spannableStringBuilder.setSpan(new DotDividerSpan(), 0, 1, 0);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2 = this.enterAlpha;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (f2 == 1.0f || this.globalGradientView == null) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.getThemePaint("paintDivider", resourcesProvider));
            }
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.enterAlpha) * 255.0f), 31);
            this.globalGradientView.setViewType(3);
            this.globalGradientView.updateColors$1();
            this.globalGradientView.updateGradient();
            this.globalGradientView.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.enterAlpha * 255.0f), 31);
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.getThemePaint("paintDivider", resourcesProvider));
            }
            canvas.restore();
        }
        boolean z = this.showReorderIcon;
        if (z || this.showReorderIconProgress != 0.0f) {
            if (z) {
                float f3 = this.showReorderIconProgress;
                if (f3 != 1.0f) {
                    this.showReorderIconProgress = f3 + 0.10666667f;
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
            float f4 = this.showReorderIconProgress;
            canvas.scale(f4, f4, (Theme.dialogs_reorderDrawable.getIntrinsicWidth() / 2.0f) + measuredWidth, (Theme.dialogs_reorderDrawable.getIntrinsicHeight() / 2.0f) + measuredHeight);
            Drawable drawable = Theme.dialogs_reorderDrawable;
            drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, Theme.dialogs_reorderDrawable.getIntrinsicHeight() + measuredHeight);
            Theme.dialogs_reorderDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public BackupImageView getImageView() {
        return this.thumbImageView;
    }

    public MessageObject getMessage() {
        return this.message;
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.progressView.getVisibility() == 0) {
            updateFileExistIcon(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateFileExistIcon(true);
        this.downloadedSize = 0L;
        updateDateView();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2.checkBoxBase.isChecked) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBox2.checkBoxBase.isChecked);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.viewType != 1) {
            TextView textView = this.nameTextView;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.captionTextView;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(textView2.getMeasuredHeight(), 3.0f, measuredHeight);
                }
                AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.dateTextView;
                textViewEmojis.layout(textViewEmojis.getLeft(), textViewEmojis.getTop() + measuredHeight, textViewEmojis.getRight(), textViewEmojis.getBottom() + measuredHeight);
                RLottieImageView rLottieImageView = this.statusImageView;
                rLottieImageView.layout(rLottieImageView.getLeft(), rLottieImageView.getTop() + measuredHeight, rLottieImageView.getRight(), rLottieImageView.getBottom() + measuredHeight);
                LineProgressView lineProgressView = this.progressView;
                lineProgressView.layout(lineProgressView.getLeft(), (getMeasuredHeight() - lineProgressView.getMeasuredHeight()) - (this.needDivider ? 1 : 0), lineProgressView.getRight(), getMeasuredHeight() - (this.needDivider ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int i3 = this.viewType;
        if (i3 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
            return;
        }
        if (i3 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int measuredHeight = this.nameTextView.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.needDivider ? 1 : 0);
        if (this.caption != null && (textView = this.captionTextView) != null && this.message.hasHighlightedWords()) {
            this.ignoreRequestLayout = true;
            textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.caption, this.message.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
            this.ignoreRequestLayout = false;
            measuredHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(textView.getMeasuredHeight(), 3.0f, measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        LineProgressView lineProgressView = this.progressView;
        if (lineProgressView.getVisibility() != 0) {
            updateFileExistIcon(true);
        }
        this.downloadedSize = j;
        updateDateView();
        lineProgressView.setProgress(Math.min(1.0f, j / j2), true);
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.progressView.setProgress(1.0f, true);
        updateFileExistIcon(true);
        this.downloadedSize = 0L;
        updateDateView();
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreRequestLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2.getVisibility() != 0) {
            checkBox2.setVisibility(0);
        }
        checkBox2.checkBoxBase.setChecked(-1, z, z2);
    }

    public final void setDocument(MessageObject messageObject, boolean z) {
        String str;
        Theme.ResourcesProvider resourcesProvider;
        String str2;
        String str3;
        String str4;
        MessageObject messageObject2 = this.message;
        boolean z2 = (messageObject2 == null || messageObject == null || messageObject2.getId() == messageObject.getId()) ? false : true;
        this.needDivider = z;
        this.message = messageObject;
        this.loaded = false;
        this.loading = false;
        if (!z2) {
            this.downloadedSize = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.captionTextView;
        TextView textView2 = this.nameTextView;
        ImageView imageView = this.placeholderImageView;
        TextView textView3 = this.extTextView;
        UserCell.AnonymousClass2 anonymousClass2 = this.thumbImageView;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i = 0; i < document.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = messageObject.getMusicAuthor() + " - " + messageObject.getMusicTitle();
                    }
                }
            } else {
                str = null;
            }
            String documentFileName = (messageObject.isVideo() || (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isGifDocument(document)) ? null : FileLoader.getDocumentFileName(document);
            if (TextUtils.isEmpty(documentFileName) && (str2 = document.mime_type) != null) {
                if (str2.startsWith("video")) {
                    documentFileName = MessageObject.isGifDocument(document) ? LocaleController.getString(R.string.AttachGif) : LocaleController.getString(R.string.AttachVideo);
                } else if (document.mime_type.startsWith("image")) {
                    documentFileName = MessageObject.isGifDocument(document) ? LocaleController.getString(R.string.AttachGif) : LocaleController.getString(R.string.AttachPhoto);
                } else {
                    documentFileName = document.mime_type.startsWith("audio") ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachDocument);
                }
            }
            String str5 = str == null ? documentFileName : str;
            ArrayList<String> arrayList = messageObject.highlightedWords;
            Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
            CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(str5, arrayList, resourcesProvider2);
            if (charSequenceHighlightText != null) {
                textView2.setText(charSequenceHighlightText);
            } else {
                textView2.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(documentFileName, document.mime_type, false));
            int iLastIndexOf = documentFileName.lastIndexOf(46);
            textView3.setText(iLastIndexOf == -1 ? "" : documentFileName.substring(iLastIndexOf + 1).toLowerCase());
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize = null;
            }
            if ((closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty) || closestPhotoSizeWithSize2 == null) {
                resourcesProvider = resourcesProvider2;
                anonymousClass2.setVisibility(4);
                anonymousClass2.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                anonymousClass2.getImageReceiver().setNeedsQualityThumb(closestPhotoSizeWithSize == null);
                anonymousClass2.getImageReceiver().setShouldGenerateQualityThumb(closestPhotoSizeWithSize == null);
                anonymousClass2.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    resourcesProvider = resourcesProvider2;
                    this.thumbImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    resourcesProvider = resourcesProvider2;
                    anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", null, 0L, null, messageObject, 1);
                    anonymousClass2.onNewImageSet();
                }
            }
            updateDateView();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(this.message.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.message.highlightedWords, resourcesProvider);
                this.caption = charSequenceHighlightText2;
                if (textView != 0) {
                    textView.setVisibility(charSequenceHighlightText2 == null ? 8 : 0);
                }
            } else if (textView != 0) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.dateTextView.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            anonymousClass2.setVisibility(4);
            anonymousClass2.setImageBitmap(null);
            this.caption = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.needDivider);
        this.progressView.setProgress(0.0f, false);
        updateFileExistIcon(z2);
    }

    public void setDrawDownloadIcon(boolean z) {
        this.drawDownloadIcon = z;
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

    public void setPhoto(String str) {
        boolean zEndsWith = str.endsWith("mp4");
        UserCell.AnonymousClass2 anonymousClass2 = this.thumbImageView;
        if (zEndsWith) {
            anonymousClass2.setImage("vthumb://0:".concat(str), null, null);
            anonymousClass2.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            anonymousClass2.setVisibility(8);
        } else {
            anonymousClass2.setImage("thumb://0:".concat(str), null, null);
            anonymousClass2.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        UserCell.AnonymousClass2 anonymousClass2 = this.thumbImageView;
        if (str2 != null) {
            anonymousClass2.setImage(str2, null, Theme.chat_attachEmptyDrawable);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                anonymousClass2.imageReceiver.setOrientation(0, true);
                anonymousClass2.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            } else {
                anonymousClass2.imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                anonymousClass2.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            }
            str = photoEntry.path;
        } else {
            anonymousClass2.setImageDrawable(Theme.chat_attachEmptyDrawable);
            str = "";
        }
        File file = new File(str);
        this.nameTextView.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.extTextView.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(photoEntry.width + "x" + photoEntry.height);
        }
        if (photoEntry.isVideo) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
        }
        if (photoEntry.size != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(AndroidUtilities.formatFileSize(photoEntry.size));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(LocaleController.getInstance().getFormatterStats().format(photoEntry.dateTaken));
        this.dateTextView.setText(sb);
        this.placeholderImageView.setVisibility(8);
    }

    public final void setTextAndValueAndTypeAndThumb(boolean z, String str, int i, String str2, String str3, String str4) {
        int i2;
        int i3;
        this.nameTextView.setText(str);
        this.dateTextView.setText(str2);
        TextView textView = this.extTextView;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.needDivider = z;
        ImageView imageView = this.placeholderImageView;
        if (i == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i4 = this.viewType;
        UserCell.AnonymousClass2 anonymousClass2 = this.thumbImageView;
        if (str4 == null && i == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i4 != 3) {
                anonymousClass2.setImageBitmap(null);
                anonymousClass2.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(42.0f), i);
                if (i == R.drawable.files_storage) {
                    i2 = Theme.key_chat_attachLocationBackground;
                    i3 = Theme.key_chat_attachIcon;
                } else if (i == R.drawable.files_gallery) {
                    i2 = Theme.key_chat_attachContactBackground;
                    i3 = Theme.key_chat_attachIcon;
                } else if (i == R.drawable.files_music) {
                    i2 = Theme.key_chat_attachAudioBackground;
                    i3 = Theme.key_chat_attachIcon;
                } else if (i == R.drawable.files_internal) {
                    i2 = Theme.key_chat_attachGalleryBackground;
                    i3 = Theme.key_chat_attachIcon;
                } else {
                    i2 = Theme.key_files_folderIconBackground;
                    i3 = Theme.key_files_folderIcon;
                }
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon, Theme.getColor(i2, resourcesProvider), false);
                Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon, Theme.getColor(i3, resourcesProvider), true);
                anonymousClass2.setImageDrawable(combinedDrawableCreateCircleDrawableWithIcon);
            } else if (i4 != 3) {
                anonymousClass2.setImage(str4, "42_42", null);
            }
            anonymousClass2.setVisibility(0);
        }
        setWillNotDraw(!this.needDivider);
    }

    public final void updateDateView() {
        String strM;
        MessageObject messageObject = this.message;
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        MessageObject messageObject2 = this.message;
        long j = ((long) messageObject2.messageOwner.date) * 1000;
        long j2 = this.downloadedSize;
        if (j2 == 0) {
            strM = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
        } else {
            Locale locale = Locale.ENGLISH;
            strM = zzkc.m(AndroidUtilities.formatFileSize(j2), " / ", AndroidUtilities.formatFileSize(this.message.getDocument().size));
        }
        int i = this.viewType;
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.dateTextView;
        if (i == 2) {
            textViewEmojis.setText(new SpannableStringBuilder().append((CharSequence) strM).append(' ').append((CharSequence) this.dotSpan).append(' ').append(FilteredSearchView.createFromInfoString(this.message, true, 2, textViewEmojis.getPaint())));
            this.rightDateTextView.setText(LocaleController.stringForMessageListDate(this.message.messageOwner.date));
            return;
        }
        textViewEmojis.setText(strM + ", " + LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j)), LocaleController.getInstance().getFormatterDay().format(new Date(j))));
    }

    public final void updateFileExistIcon(boolean z) {
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.message;
        int i = this.currentAccount;
        RLottieImageView rLottieImageView = this.statusImageView;
        LineProgressView lineProgressView = this.progressView;
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.dateTextView;
        if (messageObject == null || messageObject.messageOwner.media == null) {
            this.loading = false;
            this.loaded = true;
            lineProgressView.setVisibility(4);
            lineProgressView.setProgress(0.0f, false);
            rLottieImageView.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textViewEmojis.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                textViewEmojis.requestLayout();
            }
            DownloadController.getInstance(i).removeLoadingFileObserver(this);
            return;
        }
        this.loaded = false;
        if (messageObject.attachPathExists || messageObject.mediaExists || !this.drawDownloadIcon) {
            rLottieImageView.setVisibility(4);
            lineProgressView.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textViewEmojis.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                textViewEmojis.requestLayout();
            }
            this.loading = false;
            this.loaded = true;
            DownloadController.getInstance(i).removeLoadingFileObserver(this);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
        DownloadController.getInstance(i).addLoadingFileObserver(attachFileName, this.message, this);
        this.loading = FileLoader.getInstance(i).isLoadingFile(attachFileName);
        rLottieImageView.setVisibility(0);
        int i2 = this.loading ? 15 : 0;
        RLottieDrawable rLottieDrawable = this.statusDrawable;
        rLottieDrawable.setCustomEndFrame(i2);
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        if (z) {
            rLottieImageView.playAnimation();
        } else {
            rLottieDrawable.setCurrentFrame(this.loading ? 15 : 0, true, false);
            rLottieImageView.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textViewEmojis.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 86.0f);
            layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 86.0f : 8.0f);
            textViewEmojis.requestLayout();
        }
        if (!this.loading) {
            lineProgressView.setVisibility(4);
            return;
        }
        lineProgressView.setVisibility(0);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
        if (fileProgress == null) {
            fileProgress = Float.valueOf(0.0f);
        }
        lineProgressView.setProgress(fileProgress.floatValue(), false);
    }
}
