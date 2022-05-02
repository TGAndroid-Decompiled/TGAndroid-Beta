package org.telegram.p009ui.Cells;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
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
import java.io.File;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.DotDividerSpan;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LineProgressView;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.FilteredSearchView;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_photoSizeEmpty;
import org.webrtc.MediaStreamTrack;

public class SharedDocumentCell extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    private int TAG;
    private CharSequence caption;
    private TextView captionTextView;
    private CheckBox2 checkBox;
    private int currentAccount;
    private TextView dateTextView;
    private SpannableStringBuilder dotSpan;
    private long downloadedSize;
    private boolean drawDownloadIcon;
    float enterAlpha;
    private TextView extTextView;
    FlickerLoadingView globalGradientView;
    boolean ignoreRequestLayout;
    private boolean loaded;
    private boolean loading;
    private MessageObject message;
    private TextView nameTextView;
    private boolean needDivider;
    private ImageView placeholderImageView;
    private LineProgressView progressView;
    private final Theme.ResourcesProvider resourcesProvider;
    public TextView rightDateTextView;
    private RLottieDrawable statusDrawable;
    private RLottieImageView statusImageView;
    private BackupImageView thumbImageView;
    private int viewType;

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    public SharedDocumentCell(Context context) {
        this(context, 0);
    }

    public SharedDocumentCell(Context context, int i) {
        this(context, i, null);
    }

    public SharedDocumentCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
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
        float f = 12.0f;
        if (i == 1) {
            boolean z = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 12.0f, z ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z2 = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(40, 40.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 12.0f, 8.0f, z2 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.extTextView = textView;
        textView.setTextColor(getThemedColor("files_iconText"));
        this.extTextView.setTextSize(1, 14.0f);
        this.extTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.extTextView.setLines(1);
        this.extTextView.setMaxLines(1);
        this.extTextView.setSingleLine(true);
        this.extTextView.setGravity(17);
        this.extTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.extTextView.setImportantForAccessibility(2);
        if (i == 1) {
            View view = this.extTextView;
            boolean z3 = LocaleController.isRTL;
            addView(view, LayoutHelper.createFrame(32, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 20.0f, 28.0f, z3 ? 20.0f : 0.0f, 0.0f));
        } else {
            View view2 = this.extTextView;
            boolean z4 = LocaleController.isRTL;
            addView(view2, LayoutHelper.createFrame(32, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 22.0f, z4 ? 16.0f : 0.0f, 0.0f));
        }
        BackupImageView backupImageView = new BackupImageView(context) {
            @Override
            public void onDraw(Canvas canvas) {
                float f2 = 1.0f;
                if (SharedDocumentCell.this.thumbImageView.getImageReceiver().hasBitmapImage()) {
                    f2 = 1.0f - SharedDocumentCell.this.thumbImageView.getImageReceiver().getCurrentAlpha();
                }
                SharedDocumentCell.this.extTextView.setAlpha(f2);
                SharedDocumentCell.this.placeholderImageView.setAlpha(f2);
                super.onDraw(canvas);
            }
        };
        this.thumbImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.m34dp(4.0f));
        if (i == 1) {
            View view3 = this.thumbImageView;
            boolean z5 = LocaleController.isRTL;
            addView(view3, LayoutHelper.createFrame(42, 42.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 16.0f, 12.0f, z5 ? 16.0f : 0.0f, 0.0f));
        } else {
            View view4 = this.thumbImageView;
            boolean z6 = LocaleController.isRTL;
            addView(view4, LayoutHelper.createFrame(40, 40.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 12.0f, 8.0f, !z6 ? 0.0f : f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.nameTextView = textView2;
        textView2.setTextColor(getThemedColor("windowBackgroundWhiteBlackText"));
        this.nameTextView.setTextSize(1, 16.0f);
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i == 1) {
            this.nameTextView.setLines(1);
            this.nameTextView.setMaxLines(1);
            this.nameTextView.setSingleLine(true);
            View view5 = this.nameTextView;
            boolean z7 = LocaleController.isRTL;
            addView(view5, LayoutHelper.createFrame(-1, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 8.0f : 72.0f, 9.0f, z7 ? 72.0f : 8.0f, 0.0f));
        } else if (i == 2) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            boolean z8 = LocaleController.isRTL;
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, (z8 ? 5 : 3) | 48, z8 ? 16.0f : 72.0f, 5.0f, z8 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.rightDateTextView = textView3;
            textView3.setTextColor(getThemedColor("windowBackgroundWhiteGrayText3"));
            this.rightDateTextView.setTextSize(1, 14.0f);
            if (!LocaleController.isRTL) {
                linearLayout.addView(this.nameTextView, LayoutHelper.createLinear(-2, -2, 1.0f));
                linearLayout.addView(this.rightDateTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 4, 0, 0, 0));
            } else {
                linearLayout.addView(this.rightDateTextView, LayoutHelper.createLinear(-2, -2, 0.0f));
                linearLayout.addView(this.nameTextView, LayoutHelper.createLinear(-2, -2, 1.0f, 0, 0, 4, 0));
            }
            this.nameTextView.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.captionTextView = textView4;
            textView4.setTextColor(getThemedColor("windowBackgroundWhiteBlackText"));
            this.captionTextView.setLines(1);
            this.captionTextView.setMaxLines(1);
            this.captionTextView.setSingleLine(true);
            this.captionTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.captionTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.captionTextView.setTextSize(1, 13.0f);
            View view6 = this.captionTextView;
            boolean z9 = LocaleController.isRTL;
            addView(view6, LayoutHelper.createFrame(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 8.0f : 72.0f, 30.0f, z9 ? 72.0f : 8.0f, 0.0f));
            this.captionTextView.setVisibility(8);
        } else {
            this.nameTextView.setMaxLines(1);
            View view7 = this.nameTextView;
            boolean z10 = LocaleController.isRTL;
            addView(view7, LayoutHelper.createFrame(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 8.0f : 72.0f, 5.0f, z10 ? 72.0f : 8.0f, 0.0f));
        }
        this.statusDrawable = new RLottieDrawable(C0952R.raw.download_arrow, "download_arrow", AndroidUtilities.m34dp(14.0f), AndroidUtilities.m34dp(14.0f), true, null);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.statusImageView = rLottieImageView;
        rLottieImageView.setAnimation(this.statusDrawable);
        this.statusImageView.setVisibility(4);
        this.statusImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("sharedMedia_startStopLoadIcon"), PorterDuff.Mode.MULTIPLY));
        if (i == 1) {
            View view8 = this.statusImageView;
            boolean z11 = LocaleController.isRTL;
            addView(view8, LayoutHelper.createFrame(14, 14.0f, (z11 ? 5 : 3) | 48, z11 ? 8.0f : 70.0f, 37.0f, z11 ? 72.0f : 8.0f, 0.0f));
        } else {
            View view9 = this.statusImageView;
            boolean z12 = LocaleController.isRTL;
            addView(view9, LayoutHelper.createFrame(14, 14.0f, (z12 ? 5 : 3) | 48, z12 ? 8.0f : 70.0f, 33.0f, z12 ? 72.0f : 8.0f, 0.0f));
        }
        TextView textView5 = new TextView(context);
        this.dateTextView = textView5;
        textView5.setTextColor(getThemedColor("windowBackgroundWhiteGrayText3"));
        this.dateTextView.setLines(1);
        this.dateTextView.setMaxLines(1);
        this.dateTextView.setSingleLine(true);
        this.dateTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.dateTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i == 1) {
            this.dateTextView.setTextSize(1, 13.0f);
            View view10 = this.dateTextView;
            boolean z13 = LocaleController.isRTL;
            addView(view10, LayoutHelper.createFrame(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 8.0f : 72.0f, 34.0f, z13 ? 72.0f : 8.0f, 0.0f));
        } else {
            this.dateTextView.setTextSize(1, 13.0f);
            View view11 = this.dateTextView;
            boolean z14 = LocaleController.isRTL;
            addView(view11, LayoutHelper.createFrame(-1, -2.0f, (z14 ? 5 : 3) | 48, z14 ? 8.0f : 72.0f, 30.0f, z14 ? 72.0f : 8.0f, 0.0f));
        }
        LineProgressView lineProgressView = new LineProgressView(context);
        this.progressView = lineProgressView;
        lineProgressView.setProgressColor(getThemedColor("sharedMedia_startStopLoadIcon"));
        View view12 = this.progressView;
        boolean z15 = LocaleController.isRTL;
        addView(view12, LayoutHelper.createFrame(-1, 2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 72.0f, 54.0f, z15 ? 72.0f : 0.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21);
        this.checkBox = checkBox2;
        checkBox2.setVisibility(4);
        this.checkBox.setColor(null, "windowBackgroundWhite", "checkboxCheck");
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(2);
        if (i == 1) {
            View view13 = this.checkBox;
            boolean z16 = LocaleController.isRTL;
            addView(view13, LayoutHelper.createFrame(24, 24.0f, (z16 ? 5 : 3) | 48, z16 ? 0.0f : 38.0f, 36.0f, z16 ? 38.0f : 0.0f, 0.0f));
        } else {
            View view14 = this.checkBox;
            boolean z17 = LocaleController.isRTL;
            addView(view14, LayoutHelper.createFrame(24, 24.0f, (z17 ? 5 : 3) | 48, z17 ? 0.0f : 33.0f, 28.0f, z17 ? 33.0f : 0.0f, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.dotSpan = spannableStringBuilder;
            spannableStringBuilder.setSpan(new DotDividerSpan(), 0, 1, 0);
        }
    }

    public void setDrawDownloadIcon(boolean z) {
        this.drawDownloadIcon = z;
    }

    public void setTextAndValueAndTypeAndThumb(String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        String str6;
        this.nameTextView.setText(str);
        this.dateTextView.setText(str2);
        if (str3 != null) {
            this.extTextView.setVisibility(0);
            this.extTextView.setText(str3.toLowerCase());
        } else {
            this.extTextView.setVisibility(4);
        }
        this.needDivider = z;
        if (i == 0) {
            this.placeholderImageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            this.placeholderImageView.setVisibility(0);
        } else {
            this.placeholderImageView.setVisibility(4);
        }
        if (str4 == null && i == 0) {
            this.extTextView.setAlpha(1.0f);
            this.placeholderImageView.setAlpha(1.0f);
            this.thumbImageView.setImageBitmap(null);
            this.thumbImageView.setVisibility(4);
        } else {
            if (str4 != null) {
                this.thumbImageView.setImage(str4, "42_42", null);
            } else {
                CombinedDrawable createCircleDrawableWithIcon = Theme.createCircleDrawableWithIcon(AndroidUtilities.m34dp(42.0f), i);
                if (i == C0952R.C0953drawable.files_storage) {
                    str6 = "chat_attachLocationBackground";
                    str5 = "chat_attachLocationIcon";
                } else if (i == C0952R.C0953drawable.files_gallery) {
                    str6 = "chat_attachContactBackground";
                    str5 = "chat_attachContactIcon";
                } else if (i == C0952R.C0953drawable.files_music) {
                    str6 = "chat_attachAudioBackground";
                    str5 = "chat_attachAudioIcon";
                } else if (i == C0952R.C0953drawable.files_internal) {
                    str6 = "chat_attachGalleryBackground";
                    str5 = "chat_attachGalleryIcon";
                } else {
                    str6 = "files_folderIconBackground";
                    str5 = "files_folderIcon";
                }
                Theme.setCombinedDrawableColor(createCircleDrawableWithIcon, getThemedColor(str6), false);
                Theme.setCombinedDrawableColor(createCircleDrawableWithIcon, getThemedColor(str5), true);
                this.thumbImageView.setImageDrawable(createCircleDrawableWithIcon);
            }
            this.thumbImageView.setVisibility(0);
        }
        setWillNotDraw(true ^ this.needDivider);
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        if (str2 != null) {
            this.thumbImageView.setImage(str2, null, Theme.chat_attachEmptyDrawable);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.thumbImageView.setOrientation(0, true);
                BackupImageView backupImageView = this.thumbImageView;
                backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            } else {
                this.thumbImageView.setOrientation(photoEntry.orientation, true);
                BackupImageView backupImageView2 = this.thumbImageView;
                backupImageView2.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            }
            str = photoEntry.path;
        } else {
            this.thumbImageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
            str = "";
        }
        File file = new File(str);
        this.nameTextView.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.extTextView.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (!(photoEntry.width == 0 || photoEntry.height == 0)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(String.format(Locale.US, "%dx%d", Integer.valueOf(photoEntry.width), Integer.valueOf(photoEntry.height)));
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
        sb.append(LocaleController.getInstance().formatterStats.format(photoEntry.dateTaken));
        this.dateTextView.setText(sb);
        this.placeholderImageView.setVisibility(8);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.progressView.getVisibility() == 0) {
            updateFileExistIcon(false);
        }
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.checkBox.getVisibility() != 0) {
            this.checkBox.setVisibility(0);
        }
        this.checkBox.setChecked(z, z2);
    }

    public void setDocument(MessageObject messageObject, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        MessageObject messageObject2 = this.message;
        if (messageObject2 == null || messageObject == null || messageObject2.getId() == messageObject.getId()) {
            z3 = z;
            z2 = false;
        } else {
            z3 = z;
            z2 = true;
        }
        this.needDivider = z3;
        this.message = messageObject;
        this.loaded = false;
        this.loading = false;
        if (!z2) {
            this.downloadedSize = 0L;
        }
        TLRPC$Document document = messageObject.getDocument();
        int i = 8;
        String str3 = "";
        if (document != null) {
            String str4 = null;
            if (messageObject.isMusic()) {
                for (int i2 = 0; i2 < document.attributes.size(); i2++) {
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i2);
                    if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) && !(((str = tLRPC$DocumentAttribute.performer) == null || str.length() == 0) && ((str2 = tLRPC$DocumentAttribute.title) == null || str2.length() == 0))) {
                        str4 = messageObject.getMusicAuthor() + " - " + messageObject.getMusicTitle();
                    }
                }
            }
            String documentFileName = (messageObject.isVideo() || (messageObject.messageOwner.media instanceof TLRPC$TL_messageMediaPhoto) || MessageObject.isGifDocument(document)) ? null : FileLoader.getDocumentFileName(document);
            if (TextUtils.isEmpty(documentFileName)) {
                if (document.mime_type.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    if (MessageObject.isGifDocument(document)) {
                        documentFileName = LocaleController.getString("AttachGif", C0952R.string.AttachGif);
                    } else {
                        documentFileName = LocaleController.getString("AttachVideo", C0952R.string.AttachVideo);
                    }
                } else if (document.mime_type.startsWith("image")) {
                    documentFileName = LocaleController.getString("AttachPhoto", C0952R.string.AttachPhoto);
                } else if (document.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    documentFileName = LocaleController.getString("AttachAudio", C0952R.string.AttachAudio);
                } else {
                    documentFileName = LocaleController.getString("AttachDocument", C0952R.string.AttachDocument);
                }
            }
            if (str4 == null) {
                str4 = documentFileName;
            }
            CharSequence highlightText = AndroidUtilities.highlightText(str4, messageObject.highlightedWords, this.resourcesProvider);
            if (highlightText != null) {
                this.nameTextView.setText(highlightText);
            } else {
                this.nameTextView.setText(str4);
            }
            this.placeholderImageView.setVisibility(0);
            this.extTextView.setVisibility(0);
            this.placeholderImageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(documentFileName, document.mime_type, false));
            TextView textView = this.extTextView;
            int lastIndexOf = documentFileName.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = documentFileName.substring(lastIndexOf + 1).toLowerCase();
            }
            textView.setText(str3);
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize = null;
            }
            if ((closestPhotoSizeWithSize2 instanceof TLRPC$TL_photoSizeEmpty) || closestPhotoSizeWithSize2 == null) {
                this.thumbImageView.setVisibility(4);
                this.thumbImageView.setImageBitmap(null);
                this.extTextView.setAlpha(1.0f);
                this.placeholderImageView.setAlpha(1.0f);
            } else {
                this.thumbImageView.getImageReceiver().setNeedsQualityThumb(closestPhotoSizeWithSize == null);
                this.thumbImageView.getImageReceiver().setShouldGenerateQualityThumb(closestPhotoSizeWithSize == null);
                this.thumbImageView.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    this.thumbImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, null, 1, messageObject);
                } else {
                    this.thumbImageView.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", null, 0, 1, messageObject);
                }
            }
            updateDateView();
            if (!messageObject.hasHighlightedWords() || TextUtils.isEmpty(this.message.messageOwner.message)) {
                TextView textView2 = this.captionTextView;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.message.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.message.highlightedWords, this.resourcesProvider);
                this.caption = highlightText2;
                TextView textView3 = this.captionTextView;
                if (textView3 != null) {
                    if (highlightText2 != null) {
                        i = 0;
                    }
                    textView3.setVisibility(i);
                }
            }
        } else {
            this.nameTextView.setText(str3);
            this.extTextView.setText(str3);
            this.dateTextView.setText(str3);
            this.placeholderImageView.setVisibility(0);
            this.extTextView.setVisibility(0);
            this.extTextView.setAlpha(1.0f);
            this.placeholderImageView.setAlpha(1.0f);
            this.thumbImageView.setVisibility(4);
            this.thumbImageView.setImageBitmap(null);
            this.caption = null;
            TextView textView4 = this.captionTextView;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        setWillNotDraw(!this.needDivider);
        this.progressView.setProgress(0.0f, false);
        updateFileExistIcon(z2);
    }

    private void updateDateView() {
        String str;
        MessageObject messageObject = this.message;
        if (messageObject != null && messageObject.getDocument() != null) {
            MessageObject messageObject2 = this.message;
            long j = messageObject2.messageOwner.date * 1000;
            long j2 = this.downloadedSize;
            if (j2 == 0) {
                str = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
            } else {
                str = String.format(Locale.ENGLISH, "%s / %s", AndroidUtilities.formatFileSize(j2), AndroidUtilities.formatFileSize(this.message.getDocument().size));
            }
            if (this.viewType == 2) {
                this.dateTextView.setText(new SpannableStringBuilder().append((CharSequence) str).append(' ').append((CharSequence) this.dotSpan).append(' ').append(FilteredSearchView.createFromInfoString(this.message)));
                this.rightDateTextView.setText(LocaleController.stringForMessageListDate(this.message.messageOwner.date));
                return;
            }
            this.dateTextView.setText(String.format("%s, %s", str, LocaleController.formatString("formatDateAtTime", C0952R.string.formatDateAtTime, LocaleController.getInstance().formatterYear.format(new Date(j)), LocaleController.getInstance().formatterDay.format(new Date(j)))));
        }
    }

    public void updateFileExistIcon(boolean z) {
        if (z && Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.message;
        float f = 72.0f;
        float f2 = 8.0f;
        if (messageObject == null || messageObject.messageOwner.media == null) {
            this.loading = false;
            this.loaded = true;
            this.progressView.setVisibility(4);
            this.progressView.setProgress(0.0f, false);
            this.statusImageView.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.dateTextView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = AndroidUtilities.m34dp(LocaleController.isRTL ? 8.0f : 72.0f);
                if (!LocaleController.isRTL) {
                    f = 8.0f;
                }
                layoutParams.rightMargin = AndroidUtilities.m34dp(f);
                this.dateTextView.requestLayout();
            }
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            return;
        }
        this.loaded = false;
        if (messageObject.attachPathExists || messageObject.mediaExists || !this.drawDownloadIcon) {
            this.statusImageView.setVisibility(4);
            this.progressView.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.dateTextView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = AndroidUtilities.m34dp(LocaleController.isRTL ? 8.0f : 72.0f);
                if (!LocaleController.isRTL) {
                    f = 8.0f;
                }
                layoutParams2.rightMargin = AndroidUtilities.m34dp(f);
                this.dateTextView.requestLayout();
            }
            this.loading = false;
            this.loaded = true;
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
        DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(attachFileName, this.message, this);
        this.loading = FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName);
        this.statusImageView.setVisibility(0);
        int i = 15;
        this.statusDrawable.setCustomEndFrame(this.loading ? 15 : 0);
        this.statusDrawable.setPlayInDirectionOfCustomEndFrame(true);
        if (z) {
            this.statusImageView.playAnimation();
        } else {
            RLottieDrawable rLottieDrawable = this.statusDrawable;
            if (!this.loading) {
                i = 0;
            }
            rLottieDrawable.setCurrentFrame(i);
            this.statusImageView.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.dateTextView.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = AndroidUtilities.m34dp(LocaleController.isRTL ? 8.0f : 86.0f);
            if (LocaleController.isRTL) {
                f2 = 86.0f;
            }
            layoutParams3.rightMargin = AndroidUtilities.m34dp(f2);
            this.dateTextView.requestLayout();
        }
        if (this.loading) {
            this.progressView.setVisibility(0);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
            if (fileProgress == null) {
                fileProgress = Float.valueOf(0.0f);
            }
            this.progressView.setProgress(fileProgress.floatValue(), false);
            return;
        }
        this.progressView.setVisibility(4);
    }

    public MessageObject getMessage() {
        return this.message;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public BackupImageView getImageView() {
        return this.thumbImageView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = this.viewType;
        if (i3 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        } else if (i3 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(56.0f), 1073741824));
            int dp = AndroidUtilities.m34dp(34.0f) + this.nameTextView.getMeasuredHeight() + (this.needDivider ? 1 : 0);
            if (!(this.caption == null || this.captionTextView == null || !this.message.hasHighlightedWords())) {
                this.ignoreRequestLayout = true;
                this.captionTextView.setText(AndroidUtilities.ellipsizeCenterEnd(this.caption, this.message.highlightedWords.get(0), this.captionTextView.getMeasuredWidth(), this.captionTextView.getPaint(), 130));
                this.ignoreRequestLayout = false;
                dp += this.captionTextView.getMeasuredHeight() + AndroidUtilities.m34dp(3.0f);
            }
            setMeasuredDimension(getMeasuredWidth(), dp);
        }
    }

    @Override
    public void requestLayout() {
        if (!this.ignoreRequestLayout) {
            super.requestLayout();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        super.onLayout(z, i, i2, i3, i4);
        if (!(this.viewType == 1 || this.nameTextView.getLineCount() > 1 || (textView = this.captionTextView) == null)) {
            textView.getVisibility();
        }
        int measuredHeight = this.nameTextView.getMeasuredHeight() - AndroidUtilities.m34dp(22.0f);
        TextView textView2 = this.captionTextView;
        if (textView2 != null && textView2.getVisibility() == 0) {
            TextView textView3 = this.captionTextView;
            textView3.layout(textView3.getLeft(), this.captionTextView.getTop() + measuredHeight, this.captionTextView.getRight(), this.captionTextView.getBottom() + measuredHeight);
            measuredHeight += this.captionTextView.getMeasuredHeight() + AndroidUtilities.m34dp(3.0f);
        }
        TextView textView4 = this.dateTextView;
        textView4.layout(textView4.getLeft(), this.dateTextView.getTop() + measuredHeight, this.dateTextView.getRight(), this.dateTextView.getBottom() + measuredHeight);
        RLottieImageView rLottieImageView = this.statusImageView;
        rLottieImageView.layout(rLottieImageView.getLeft(), this.statusImageView.getTop() + measuredHeight, this.statusImageView.getRight(), measuredHeight + this.statusImageView.getBottom());
        LineProgressView lineProgressView = this.progressView;
        lineProgressView.layout(lineProgressView.getLeft(), (getMeasuredHeight() - this.progressView.getMeasuredHeight()) - (this.needDivider ? 1 : 0), this.progressView.getRight(), getMeasuredHeight() - (this.needDivider ? 1 : 0));
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        updateFileExistIcon(true);
        this.downloadedSize = 0L;
        updateDateView();
    }

    @Override
    public void onSuccessDownload(String str) {
        this.progressView.setProgress(1.0f, true);
        updateFileExistIcon(true);
        this.downloadedSize = 0L;
        updateDateView();
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        if (this.progressView.getVisibility() != 0) {
            updateFileExistIcon(true);
        }
        this.downloadedSize = j;
        updateDateView();
        this.progressView.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public void setGlobalGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.enterAlpha == 1.0f || this.globalGradientView == null) {
            super.dispatchDraw(canvas);
            drawDivider(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.enterAlpha) * 255.0f), 31);
        this.globalGradientView.setViewType(3);
        this.globalGradientView.updateColors();
        this.globalGradientView.updateGradient();
        this.globalGradientView.draw(canvas);
        canvas.restore();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.enterAlpha * 255.0f), 31);
        super.dispatchDraw(canvas);
        drawDivider(canvas);
        canvas.restore();
    }

    private void drawDivider(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(AndroidUtilities.m34dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
        }
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.enterAlpha != f) {
            this.enterAlpha = f;
            invalidate();
        }
    }
}
