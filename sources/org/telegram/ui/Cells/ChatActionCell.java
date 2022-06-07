package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_messageActionUserUpdatedPhoto;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.PhotoViewer;

public class ChatActionCell extends BaseCell implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    private int TAG;
    private SpannableStringBuilder accessibilityText;
    private AvatarDrawable avatarDrawable;
    private int backgroundHeight;
    private Path backgroundPath;
    private boolean canDrawInParent;
    private int currentAccount;
    private MessageObject currentMessageObject;
    private ImageLocation currentVideoLocation;
    private int customDate;
    private CharSequence customText;
    private ChatActionCellDelegate delegate;
    private boolean hasReplyMessage;
    private boolean imagePressed;
    private ImageReceiver imageReceiver;
    private boolean invalidateColors;
    private boolean invalidatePath;
    private float lastTouchX;
    private float lastTouchY;
    private ArrayList<Integer> lineHeights;
    private ArrayList<Integer> lineWidths;
    private String overrideBackground;
    private Paint overrideBackgroundPaint;
    private String overrideText;
    private TextPaint overrideTextPaint;
    private URLSpan pressedLink;
    private int previousWidth;
    private RectF rect;
    public List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    private int textHeight;
    private StaticLayout textLayout;
    TextPaint textPaint;
    private int textWidth;
    private int textX;
    private int textXLeft;
    private int textY;
    private ThemeDelegate themeDelegate;
    private float viewTop;
    private boolean visiblePartSet;
    private boolean wasLayout;

    public interface ChatActionCellDelegate {

        public final class CC {
            public static void $default$didClickImage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static boolean $default$didLongPress(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, float f, float f2) {
                return false;
            }

            public static void $default$didPressReplyMessage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i) {
            }

            public static void $default$needOpenInviteLink(ChatActionCellDelegate chatActionCellDelegate, TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
            }

            public static void $default$needOpenUserProfile(ChatActionCellDelegate chatActionCellDelegate, long j) {
            }
        }

        void didClickImage(ChatActionCell chatActionCell);

        boolean didLongPress(ChatActionCell chatActionCell, float f, float f2);

        void didPressReplyMessage(ChatActionCell chatActionCell, int i);

        void needOpenInviteLink(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void needOpenUserProfile(long j);
    }

    public interface ThemeDelegate extends Theme.ResourcesProvider {
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            spoilerEffect.setSuppressUpdates(z);
        }
    }

    public ChatActionCell(Context context) {
        this(context, false, null);
    }

    public ChatActionCell(Context context, boolean z, ThemeDelegate themeDelegate) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.lineWidths = new ArrayList<>();
        this.lineHeights = new ArrayList<>();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.invalidatePath = true;
        this.invalidateColors = false;
        this.canDrawInParent = z;
        this.themeDelegate = themeDelegate;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.avatarDrawable = new AvatarDrawable();
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
    }

    public void setDelegate(ChatActionCellDelegate chatActionCellDelegate) {
        this.delegate = chatActionCellDelegate;
    }

    public void setCustomDate(int i, boolean z, boolean z2) {
        String str;
        int i2 = this.customDate;
        if (i2 != i && i2 / 3600 != i / 3600) {
            if (z) {
                str = i == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i));
            } else {
                str = LocaleController.formatDateChat(i);
            }
            this.customDate = i;
            CharSequence charSequence = this.customText;
            if (charSequence == null || !TextUtils.equals(str, charSequence)) {
                this.customText = str;
                this.accessibilityText = null;
                updateTextInternal(z2);
            }
        }
    }

    private void updateTextInternal(boolean z) {
        if (getMeasuredWidth() != 0) {
            createLayout(this.customText, getMeasuredWidth());
            invalidate();
        }
        if (this.wasLayout) {
            buildLayout();
        } else if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActionCell.this.requestLayout();
                }
            });
        } else {
            requestLayout();
        }
    }

    public void setCustomText(CharSequence charSequence) {
        this.customText = charSequence;
        if (charSequence != null) {
            updateTextInternal(false);
        }
    }

    public void setOverrideColor(String str, String str2) {
        this.overrideBackground = str;
        this.overrideText = str2;
    }

    public void setMessageObject(MessageObject messageObject) {
        TLRPC$PhotoSize tLRPC$PhotoSize;
        AtomicReference<WeakReference<View>> atomicReference;
        StaticLayout staticLayout;
        if (this.currentMessageObject != messageObject || (((staticLayout = this.textLayout) != null && !TextUtils.equals(staticLayout.getText(), messageObject.messageText)) || (!this.hasReplyMessage && messageObject.replyMessageObject != null))) {
            TLRPC$VideoSize tLRPC$VideoSize = null;
            this.accessibilityText = null;
            this.currentMessageObject = messageObject;
            if (!(messageObject == null || (atomicReference = messageObject.viewRef) == null || (atomicReference.get() != null && this.currentMessageObject.viewRef.get().get() == this))) {
                this.currentMessageObject.viewRef.set(new WeakReference<>(this));
            }
            this.hasReplyMessage = messageObject.replyMessageObject != null;
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.previousWidth = 0;
            if (this.currentMessageObject.type == 11) {
                this.avatarDrawable.setInfo(messageObject.getDialogId(), null, null);
                MessageObject messageObject2 = this.currentMessageObject;
                if (messageObject2.messageOwner.action instanceof TLRPC$TL_messageActionUserUpdatedPhoto) {
                    this.imageReceiver.setImage(null, null, this.avatarDrawable, null, messageObject2, 0);
                } else {
                    int size = messageObject2.photoThumbs.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            tLRPC$PhotoSize = null;
                            break;
                        }
                        tLRPC$PhotoSize = this.currentMessageObject.photoThumbs.get(i);
                        if (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) {
                            break;
                        }
                        i++;
                    }
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.currentMessageObject.photoThumbs, 640);
                    if (closestPhotoSizeWithSize != null) {
                        TLRPC$Photo tLRPC$Photo = messageObject.messageOwner.action.photo;
                        if (!tLRPC$Photo.video_sizes.isEmpty() && SharedConfig.autoplayGifs) {
                            TLRPC$VideoSize tLRPC$VideoSize2 = tLRPC$Photo.video_sizes.get(0);
                            if (messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(4, tLRPC$VideoSize2.size)) {
                                tLRPC$VideoSize = tLRPC$VideoSize2;
                            } else {
                                this.currentVideoLocation = ImageLocation.getForPhoto(tLRPC$VideoSize2, tLRPC$Photo);
                                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(tLRPC$VideoSize2), this.currentMessageObject, this);
                            }
                        }
                        if (tLRPC$VideoSize != null) {
                            this.imageReceiver.setImage(ImageLocation.getForPhoto(tLRPC$VideoSize, tLRPC$Photo), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(tLRPC$PhotoSize, this.currentMessageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, this.currentMessageObject, 1);
                        } else {
                            this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.currentMessageObject.photoThumbsObject), "150_150", ImageLocation.getForObject(tLRPC$PhotoSize, this.currentMessageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, this.currentMessageObject, 1);
                        }
                    } else {
                        this.imageReceiver.setImageBitmap(this.avatarDrawable);
                    }
                }
                this.imageReceiver.setVisible(!PhotoViewer.isShowingImage(this.currentMessageObject), false);
            } else {
                this.imageReceiver.setImageBitmap((Bitmap) null);
            }
            requestLayout();
        }
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    public ImageReceiver getPhotoImage() {
        return this.imageReceiver;
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
    }

    @Override
    protected boolean onLongPress() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            return chatActionCellDelegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
        }
        return false;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        this.wasLayout = false;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatActionCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void openLink(CharacterStyle characterStyle) {
        if (this.delegate != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("invite")) {
                URLSpan uRLSpan = this.pressedLink;
                if (uRLSpan instanceof URLSpanNoUnderline) {
                    TLObject object = ((URLSpanNoUnderline) uRLSpan).getObject();
                    if (object instanceof TLRPC$TL_chatInviteExported) {
                        this.delegate.needOpenInviteLink((TLRPC$TL_chatInviteExported) object);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.delegate.didPressReplyMessage(this, this.currentMessageObject.getReplyMsgId());
            } else if (url.startsWith("http")) {
                Browser.openUrl(getContext(), url);
            } else {
                this.delegate.needOpenUserProfile(Long.parseLong(url));
            }
        }
    }

    private void createLayout(CharSequence charSequence, int i) {
        int dp = i - AndroidUtilities.dp(30.0f);
        this.invalidatePath = true;
        this.textLayout = new StaticLayout(charSequence, (TextPaint) getThemedPaint("paintChatActionText"), dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        if (charSequence instanceof Spannable) {
            SpoilerEffect.addSpoilers(this, this.textLayout, (Spannable) charSequence, this.spoilersPool, this.spoilers);
        }
        this.textHeight = 0;
        this.textWidth = 0;
        try {
            int lineCount = this.textLayout.getLineCount();
            for (int i2 = 0; i2 < lineCount; i2++) {
                try {
                    float lineWidth = this.textLayout.getLineWidth(i2);
                    float f = dp;
                    if (lineWidth > f) {
                        lineWidth = f;
                    }
                    this.textHeight = (int) Math.max(this.textHeight, Math.ceil(this.textLayout.getLineBottom(i2)));
                    this.textWidth = (int) Math.max(this.textWidth, Math.ceil(lineWidth));
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.textX = (i - this.textWidth) / 2;
        this.textY = AndroidUtilities.dp(7.0f);
        this.textXLeft = (i - this.textLayout.getWidth()) / 2;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.currentMessageObject == null && this.customText == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.textHeight + AndroidUtilities.dp(14.0f));
            return;
        }
        int max = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i));
        if (this.previousWidth != max) {
            this.wasLayout = true;
            this.previousWidth = max;
            buildLayout();
        }
        int i3 = this.textHeight;
        MessageObject messageObject = this.currentMessageObject;
        setMeasuredDimension(max, i3 + ((messageObject == null || messageObject.type != 11) ? 0 : AndroidUtilities.roundMessageSize + AndroidUtilities.dp(10.0f)) + AndroidUtilities.dp(14.0f));
    }

    private void buildLayout() {
        CharSequence charSequence;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message == null || (tLRPC$MessageMedia = tLRPC$Message.media) == null || tLRPC$MessageMedia.ttl_seconds == 0) {
                charSequence = messageObject.messageText;
            } else if (tLRPC$MessageMedia.photo instanceof TLRPC$TL_photoEmpty) {
                charSequence = LocaleController.getString("AttachPhotoExpired", R.string.AttachPhotoExpired);
            } else if (tLRPC$MessageMedia.document instanceof TLRPC$TL_documentEmpty) {
                charSequence = LocaleController.getString("AttachVideoExpired", R.string.AttachVideoExpired);
            } else {
                charSequence = messageObject.messageText;
            }
        } else {
            charSequence = this.customText;
        }
        createLayout(charSequence, this.previousWidth);
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && messageObject2.type == 11) {
            int i = AndroidUtilities.roundMessageSize;
            this.imageReceiver.setImageCoords((this.previousWidth - AndroidUtilities.roundMessageSize) / 2, this.textHeight + AndroidUtilities.dp(19.0f), i, i);
        }
    }

    public int getCustomDate() {
        return this.customDate;
    }

    @Override
    public void onDraw(Canvas canvas) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 11) {
            this.imageReceiver.draw(canvas);
        }
        if (this.textLayout != null) {
            drawBackground(canvas, false);
            if (this.textPaint != null) {
                canvas.save();
                canvas.translate(this.textXLeft, this.textY);
                if (this.textLayout.getPaint() != this.textPaint) {
                    buildLayout();
                }
                canvas.save();
                SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
                this.textLayout.draw(canvas);
                canvas.restore();
                for (SpoilerEffect spoilerEffect : this.spoilers) {
                    spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                    spoilerEffect.draw(canvas);
                }
                canvas.restore();
            }
        }
    }

    public void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        Paint paint2;
        int i;
        int i2;
        int i3;
        Paint paint3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        float f3;
        int i9;
        int i10;
        int i11;
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        this.textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        String str = this.overrideBackground;
        if (str != null) {
            int themedColor = getThemedColor(str);
            if (this.overrideBackgroundPaint == null) {
                Paint paint4 = new Paint(1);
                this.overrideBackgroundPaint = paint4;
                paint4.setColor(themedColor);
                TextPaint textPaint = new TextPaint(1);
                this.overrideTextPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.overrideTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                this.overrideTextPaint.setColor(getThemedColor(this.overrideText));
            }
            themedPaint = this.overrideBackgroundPaint;
            this.textPaint = this.overrideTextPaint;
        }
        if (this.invalidatePath) {
            this.invalidatePath = false;
            this.lineWidths.clear();
            int lineCount = this.textLayout.getLineCount();
            int dp = AndroidUtilities.dp(11.0f);
            int dp2 = AndroidUtilities.dp(8.0f);
            int i12 = 0;
            for (int i13 = 0; i13 < lineCount; i13++) {
                int ceil = (int) Math.ceil(this.textLayout.getLineWidth(i13));
                if (i13 == 0 || (i11 = i12 - ceil) <= 0 || i11 > dp + dp2) {
                    i12 = ceil;
                }
                this.lineWidths.add(Integer.valueOf(i12));
            }
            for (int i14 = lineCount - 2; i14 >= 0; i14--) {
                int intValue = this.lineWidths.get(i14).intValue();
                int i15 = i12 - intValue;
                if (i15 <= 0 || i15 > dp + dp2) {
                    i12 = intValue;
                }
                this.lineWidths.set(i14, Integer.valueOf(i12));
            }
            int dp3 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int dp4 = AndroidUtilities.dp(3.0f);
            int dp5 = AndroidUtilities.dp(6.0f);
            int i16 = dp - dp4;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            float f4 = measuredWidth;
            this.backgroundPath.moveTo(f4, dp3);
            int i17 = 0;
            int i18 = 0;
            while (i17 < lineCount) {
                int intValue2 = this.lineWidths.get(i17).intValue();
                int i19 = dp2;
                int lineBottom = this.textLayout.getLineBottom(i17);
                int i20 = dp5;
                int i21 = lineCount - 1;
                if (i17 < i21) {
                    paint3 = themedPaint;
                    i4 = this.lineWidths.get(i17 + 1).intValue();
                } else {
                    paint3 = themedPaint;
                    i4 = 0;
                }
                int i22 = lineBottom - i18;
                if (i17 == 0 || intValue2 > i12) {
                    f = 3.0f;
                    i22 += AndroidUtilities.dp(3.0f);
                } else {
                    f = 3.0f;
                }
                if (i17 == i21 || intValue2 > i4) {
                    i22 += AndroidUtilities.dp(f);
                }
                float f5 = (intValue2 / 2.0f) + f4;
                int i23 = (i17 == i21 || intValue2 >= i4 || i17 == 0 || intValue2 >= i12) ? i19 : i20;
                if (i17 == 0 || intValue2 > i12) {
                    f2 = f4;
                    i6 = lineCount;
                    i8 = lineBottom;
                    i5 = i12;
                    i7 = measuredWidth;
                    this.rect.set((f5 - dp4) - dp, dp3, i16 + f5, (dp * 2) + dp3);
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else {
                    f2 = f4;
                    if (intValue2 < i12) {
                        i8 = lineBottom;
                        float f6 = i16 + f5;
                        i7 = measuredWidth;
                        i6 = lineCount;
                        i5 = i12;
                        this.rect.set(f6, dp3, (i23 * 2) + f6, i10 + dp3);
                        this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                    } else {
                        i6 = lineCount;
                        i8 = lineBottom;
                        i5 = i12;
                        i7 = measuredWidth;
                    }
                }
                dp3 += i22;
                if (i17 == i21 || intValue2 >= i4) {
                    f3 = 3.0f;
                } else {
                    f3 = 3.0f;
                    dp3 -= AndroidUtilities.dp(3.0f);
                    i22 -= AndroidUtilities.dp(3.0f);
                }
                if (i17 != 0 && intValue2 < i5) {
                    dp3 -= AndroidUtilities.dp(f3);
                    i22 -= AndroidUtilities.dp(f3);
                }
                this.lineHeights.add(Integer.valueOf(i22));
                if (i17 == i21 || intValue2 > i4) {
                    this.rect.set((f5 - dp4) - dp, dp3 - (dp * 2), f5 + i16, dp3);
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (intValue2 < i4) {
                    float f7 = f5 + i16;
                    this.rect.set(f7, dp3 - i9, (i23 * 2) + f7, dp3);
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i17++;
                i12 = intValue2;
                dp2 = i19;
                dp5 = i20;
                themedPaint = paint3;
                f4 = f2;
                i18 = i8;
                measuredWidth = i7;
                lineCount = i6;
            }
            paint = themedPaint;
            int i24 = dp2;
            int i25 = measuredWidth;
            i24 = dp5;
            int i26 = lineCount - 1;
            int i27 = i26;
            while (i27 >= 0) {
                int intValue3 = i27 != 0 ? this.lineWidths.get(i27 - 1).intValue() : 0;
                int intValue4 = this.lineWidths.get(i27).intValue();
                int intValue5 = i27 != i26 ? this.lineWidths.get(i27 + 1).intValue() : 0;
                this.textLayout.getLineBottom(i27);
                float f8 = i25 - (intValue4 / 2);
                if (i27 == i26 || intValue4 >= intValue5 || i27 == 0 || intValue4 >= intValue3) {
                }
                if (i27 == i26 || intValue4 > intValue5) {
                    this.rect.set(f8 - i16, dp3 - (dp * 2), dp4 + f8 + dp, dp3);
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (intValue4 < intValue5) {
                    float f9 = f8 - i16;
                    this.rect.set(f9 - (i24 * 2), dp3 - i3, f9, dp3);
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                }
                dp3 -= this.lineHeights.get(i27).intValue();
                if (i27 == 0 || intValue4 > intValue3) {
                    this.rect.set(f8 - i16, dp3, f8 + dp4 + dp, (dp * 2) + dp3);
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (intValue4 < intValue3) {
                    float f10 = f8 - i16;
                    this.rect.set(f10 - (i24 * 2), dp3, f10, i2 + dp3);
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i27--;
            }
            this.backgroundPath.close();
        } else {
            paint = themedPaint;
        }
        if (!this.visiblePartSet) {
            this.backgroundHeight = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        ThemeDelegate themeDelegate = this.themeDelegate;
        if (themeDelegate != null) {
            themeDelegate.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        int i28 = -1;
        if (!z || getAlpha() == 1.0f) {
            paint2 = paint;
            i = -1;
        } else {
            i28 = paint.getAlpha();
            i = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
            paint2 = paint;
            paint2.setAlpha((int) (i28 * getAlpha()));
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (i * getAlpha()));
        }
        canvas.drawPath(this.backgroundPath, paint2);
        if (hasGradientService()) {
            canvas.drawPath(this.backgroundPath, Theme.chat_actionBackgroundGradientDarkenPaint);
        }
        if (i28 >= 0) {
            paint2.setAlpha(i28);
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(i);
        }
    }

    public boolean hasGradientService() {
        ThemeDelegate themeDelegate;
        return this.overrideBackgroundPaint == null && ((themeDelegate = this.themeDelegate) == null ? Theme.hasGradientService() : themeDelegate.hasGradientService());
    }

    @Override
    public void onSuccessDownload(String str) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 11) {
            TLRPC$PhotoSize tLRPC$PhotoSize = null;
            int i = 0;
            int size = messageObject.photoThumbs.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                TLRPC$PhotoSize tLRPC$PhotoSize2 = this.currentMessageObject.photoThumbs.get(i);
                if (tLRPC$PhotoSize2 instanceof TLRPC$TL_photoStrippedSize) {
                    tLRPC$PhotoSize = tLRPC$PhotoSize2;
                    break;
                }
                i++;
            }
            this.imageReceiver.setImage(this.currentVideoLocation, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(tLRPC$PhotoSize, this.currentMessageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, this.currentMessageObject, 1);
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        }
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.customText) || this.currentMessageObject != null) {
            if (this.accessibilityText == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.customText) ? this.customText : this.currentMessageObject.messageText);
                for (final CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                    int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                    spannableStringBuilder.removeSpan(characterStyle);
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        {
                            ChatActionCell.this = this;
                        }

                        @Override
                        public void onClick(View view) {
                            if (ChatActionCell.this.delegate != null) {
                                ChatActionCell.this.openLink(characterStyle);
                            }
                        }
                    }, spanStart, spanEnd, 33);
                }
                this.accessibilityText = spannableStringBuilder;
            }
            if (Build.VERSION.SDK_INT < 24) {
                accessibilityNodeInfo.setContentDescription(this.accessibilityText.toString());
            } else {
                accessibilityNodeInfo.setText(this.accessibilityText);
            }
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    public void setInvalidateColors(boolean z) {
        if (this.invalidateColors != z) {
            this.invalidateColors = z;
            invalidate();
        }
    }

    private int getThemedColor(String str) {
        ThemeDelegate themeDelegate = this.themeDelegate;
        Integer color = themeDelegate != null ? themeDelegate.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    private Paint getThemedPaint(String str) {
        ThemeDelegate themeDelegate = this.themeDelegate;
        Paint paint = themeDelegate != null ? themeDelegate.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }
}
