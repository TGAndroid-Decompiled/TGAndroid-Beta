package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.FilteredSearchView;

public class SharedLinkCell extends FrameLayout {
    private StaticLayout captionLayout;
    private TextPaint captionTextPaint;
    private int captionY;
    private CheckBox2 checkBox;
    private boolean checkingForLongPress;
    private StaticLayout dateLayout;
    private int dateLayoutX;
    private SharedLinkCellDelegate delegate;
    private TextPaint description2TextPaint;
    private int description2Y;
    private StaticLayout descriptionLayout;
    private StaticLayout descriptionLayout2;
    private List descriptionLayout2Spoilers;
    private List descriptionLayoutSpoilers;
    private TextPaint descriptionTextPaint;
    private int descriptionY;
    private boolean drawLinkImageView;
    private StaticLayout fromInfoLayout;
    private AnimatedEmojiSpan.EmojiGroupedSpans fromInfoLayoutEmojis;
    private int fromInfoLayoutY;
    private LetterDrawable letterDrawable;
    private ImageReceiver linkImageView;
    private ArrayList linkLayout;
    private boolean linkPreviewPressed;
    private SparseArray linkSpoilers;
    private int linkY;
    ArrayList links;
    private LinkSpanDrawable.LinkCollector linksCollector;
    private MessageObject message;
    private boolean needDivider;
    private AtomicReference patchedDescriptionLayout;
    private AtomicReference patchedDescriptionLayout2;
    private Path path;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    private int pressCount;
    private LinkSpanDrawable pressedLink;
    private int pressedLinkIndex;
    private Theme.ResourcesProvider resourcesProvider;
    private SpoilerEffect spoilerPressed;
    private int spoilerTypePressed;
    private Stack spoilersPool;
    private StaticLayout titleLayout;
    private TextPaint titleTextPaint;
    private int titleY;
    private int viewType;

    public interface SharedLinkCellDelegate {
        boolean canPerformActions();

        void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject);

        void onLinkPress(String str, boolean z);
    }

    static int access$104(SharedLinkCell sharedLinkCell) {
        int i = sharedLinkCell.pressCount + 1;
        sharedLinkCell.pressCount = i;
        return i;
    }

    private final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        @Override
        public void run() {
            if (SharedLinkCell.this.pendingCheckForLongPress == null) {
                SharedLinkCell sharedLinkCell = SharedLinkCell.this;
                sharedLinkCell.pendingCheckForLongPress = sharedLinkCell.new CheckForLongPress();
            }
            SharedLinkCell.this.pendingCheckForLongPress.currentPressCount = SharedLinkCell.access$104(SharedLinkCell.this);
            SharedLinkCell sharedLinkCell2 = SharedLinkCell.this;
            sharedLinkCell2.postDelayed(sharedLinkCell2.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
        }
    }

    class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
        }

        @Override
        public void run() {
            if (SharedLinkCell.this.checkingForLongPress && SharedLinkCell.this.getParent() != null && this.currentPressCount == SharedLinkCell.this.pressCount) {
                SharedLinkCell.this.checkingForLongPress = false;
                try {
                    SharedLinkCell.this.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                if (SharedLinkCell.this.pressedLinkIndex >= 0) {
                    SharedLinkCellDelegate sharedLinkCellDelegate = SharedLinkCell.this.delegate;
                    SharedLinkCell sharedLinkCell = SharedLinkCell.this;
                    sharedLinkCellDelegate.onLinkPress(((CharSequence) sharedLinkCell.links.get(sharedLinkCell.pressedLinkIndex)).toString(), true);
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                SharedLinkCell.this.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
    }

    protected void startCheckLongPress() {
        if (this.checkingForLongPress) {
            return;
        }
        this.checkingForLongPress = true;
        if (this.pendingCheckForTap == null) {
            this.pendingCheckForTap = new CheckForTap();
        }
        postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
    }

    protected void cancelCheckLongPress() {
        this.checkingForLongPress = false;
        CheckForLongPress checkForLongPress = this.pendingCheckForLongPress;
        if (checkForLongPress != null) {
            removeCallbacks(checkForLongPress);
        }
        CheckForTap checkForTap = this.pendingCheckForTap;
        if (checkForTap != null) {
            removeCallbacks(checkForTap);
        }
    }

    public SharedLinkCell(Context context, int i) {
        this(context, i, null);
    }

    public SharedLinkCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.linksCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = new ArrayList();
        this.linkLayout = new ArrayList();
        this.linkSpoilers = new SparseArray();
        this.descriptionLayoutSpoilers = new ArrayList();
        this.descriptionLayout2Spoilers = new ArrayList();
        this.spoilersPool = new Stack();
        this.path = new Path();
        this.spoilerTypePressed = -1;
        this.titleY = AndroidUtilities.dp(10.0f);
        this.descriptionY = AndroidUtilities.dp(30.0f);
        this.patchedDescriptionLayout = new AtomicReference();
        this.description2Y = AndroidUtilities.dp(30.0f);
        this.patchedDescriptionLayout2 = new AtomicReference();
        this.captionY = AndroidUtilities.dp(30.0f);
        this.fromInfoLayoutY = AndroidUtilities.dp(30.0f);
        this.resourcesProvider = resourcesProvider;
        this.viewType = i;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.titleTextPaint = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.titleTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.descriptionTextPaint = new TextPaint(1);
        this.titleTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.descriptionTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.linkImageView = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.letterDrawable = new LetterDrawable(resourcesProvider, 0);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setVisibility(4);
        this.checkBox.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(2);
        CheckBox2 checkBox3 = this.checkBox;
        boolean z = LocaleController.isRTL;
        addView(checkBox3, LayoutHelper.createFrame(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 44.0f, 44.0f, z ? 44.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint2 = new TextPaint(1);
            this.description2TextPaint = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint3 = new TextPaint(1);
        this.captionTextPaint = textPaint3;
        textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
    }

    private void gatherLink(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("#")) {
            return;
        }
        if (!AndroidUtilities.charSequenceContains(strTrim, "://") && strTrim.toString().toLowerCase().indexOf("http") != 0 && strTrim.toString().toLowerCase().indexOf("mailto") != 0) {
            strTrim = "http://" + strTrim;
        }
        this.links.add(SpannableString.valueOf(strTrim));
    }

    private void gatherRichMessageLinks(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textUrl) {
            gatherLink(richText.url);
            return;
        }
        if (richText instanceof TL_iv.textAutoUrl) {
            gatherLink(RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            gatherLink("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            gatherLink("mailto:" + RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                gatherRichMessageLinks(richText.texts.get(i));
            }
            return;
        }
        if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            gatherRichMessageLinks(richText.text);
        }
    }

    private void gatherRichMessageLinks(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            gatherRichMessageLinks(pageBlock.text);
        } else if (pageBlock instanceof TL_iv.pageBlockCover) {
            gatherRichMessageLinks(((TL_iv.pageBlockCover) pageBlock).cover);
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            gatherRichMessageLinks(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
        }
    }

    private void gatherRichMessageLinks(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gatherRichMessageLinks((TL_iv.PageBlock) it.next());
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        String str;
        String string;
        String str2;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        int iDp;
        CharSequence charSequence2;
        TLRPC.PhotoSize photoSize;
        boolean z2;
        int i3;
        int lineBottom;
        int i4;
        TLRPC.PhotoSize photoSize2;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int iLastIndexOf;
        CharSequence charSequence3;
        int i5;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilderValueOf;
        int iLastIndexOf2;
        int i6;
        int i7 = 0;
        this.drawLinkImageView = false;
        this.descriptionLayout = null;
        this.titleLayout = null;
        this.descriptionLayout2 = null;
        this.captionLayout = null;
        this.linkLayout.clear();
        this.links.clear();
        int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        MessageObject messageObject = this.message;
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        int i8 = 1;
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage instanceof TLRPC.TL_webPage) {
                if (messageObject.photoThumbs == null && webPage.photo != null) {
                    messageObject.generateThumbs(true);
                }
                boolean z3 = (webPage.photo == null || this.message.photoThumbs == null) ? false : true;
                string = webPage.title;
                if (string == null) {
                    string = webPage.site_name;
                }
                String str3 = webPage.description;
                str = webPage.url;
                z = z3;
                str2 = str3;
            } else {
                str = null;
                string = null;
                str2 = null;
                z = false;
            }
        } else {
            str = null;
            string = null;
            str2 = null;
            z = false;
        }
        MessageObject messageObject2 = this.message;
        int i9 = 46;
        if (messageObject2 == null || messageObject2.messageOwner.entities.isEmpty()) {
            spannableStringBuilder = null;
            charSequence = str2;
        } else {
            SpannableStringBuilder spannableStringBuilderValueOf2 = null;
            int i10 = 0;
            CharSequence charSequence4 = str2;
            while (i10 < this.message.messageOwner.entities.size()) {
                TLRPC.MessageEntity messageEntity = this.message.messageOwner.entities.get(i10);
                if (messageEntity.length > 0 && (i5 = messageEntity.offset) >= 0 && i5 < this.message.messageOwner.message.length()) {
                    if (messageEntity.offset + messageEntity.length > this.message.messageOwner.message.length()) {
                        charSequence3 = charSequence4;
                        charSequence3 = charSequence4;
                        charSequence3 = charSequence4;
                        messageEntity.length = this.message.messageOwner.message.length() - messageEntity.offset;
                    }
                    if (i10 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.message.messageOwner.message.length())) {
                        if (this.message.messageOwner.entities.size() != i8) {
                            spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                            MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf2);
                        } else if (charSequence4 == null) {
                            spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                            MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf2);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilderValueOf2;
                    try {
                        if ((messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityUrl)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                String str4 = this.message.messageOwner.message;
                                int i11 = messageEntity.offset;
                                strSubstring = str4.substring(i11, messageEntity.length + i11);
                            } else {
                                strSubstring = messageEntity.url;
                            }
                            if (string == null || string.length() == 0) {
                                charSequence4 = charSequence4;
                                string = Uri.parse(strSubstring.toString()).getHost();
                                if (string == null) {
                                    string = strSubstring.toString();
                                }
                                if (string != null && (iLastIndexOf2 = string.lastIndexOf(i9)) >= 0) {
                                    String strSubstring2 = string.substring(i7, iLastIndexOf2);
                                    int iLastIndexOf3 = strSubstring2.lastIndexOf(i9);
                                    if (iLastIndexOf3 >= 0) {
                                        strSubstring2 = strSubstring2.substring(iLastIndexOf3 + i8);
                                    }
                                    string = strSubstring2.substring(i7, i8).toUpperCase() + strSubstring2.substring(i8);
                                }
                                if (messageEntity.offset != 0 || messageEntity.length != this.message.messageOwner.message.length()) {
                                    charSequence4 = charSequence4;
                                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                                    MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf);
                                    charSequence4 = spannableStringBuilderValueOf;
                                }
                                spannableStringBuilderValueOf2 = spannableStringBuilder2;
                                charSequence3 = charSequence4;
                            }
                        } else if ((messageEntity instanceof TLRPC.TL_messageEntityEmail) && (string == null || string.length() == 0)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("mailto:");
                            String str5 = this.message.messageOwner.message;
                            int i12 = messageEntity.offset;
                            sb.append(str5.substring(i12, messageEntity.length + i12));
                            strSubstring = sb.toString();
                            String str6 = this.message.messageOwner.message;
                            int i13 = messageEntity.offset;
                            string = str6.substring(i13, messageEntity.length + i13);
                            if (messageEntity.offset != 0 || messageEntity.length != this.message.messageOwner.message.length()) {
                                charSequence4 = charSequence4;
                                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                                MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf);
                                charSequence4 = spannableStringBuilderValueOf;
                            }
                            spannableStringBuilderValueOf2 = spannableStringBuilder2;
                            charSequence3 = charSequence4;
                        } else {
                            strSubstring = null;
                            charSequence4 = charSequence4;
                        }
                        if (strSubstring != null) {
                            if (AndroidUtilities.charSequenceContains(strSubstring, "://") || strSubstring.toString().toLowerCase().indexOf("http") == 0 || strSubstring.toString().toLowerCase().indexOf("mailto") == 0) {
                                i6 = 0;
                            } else {
                                strSubstring = "http://" + ((Object) strSubstring);
                                i6 = 7;
                            }
                            SpannableString spannableStringValueOf = SpannableString.valueOf(strSubstring);
                            int i14 = messageEntity.offset;
                            int i15 = messageEntity.length + i14;
                            for (TLRPC.MessageEntity messageEntity2 : this.message.messageOwner.entities) {
                                int i16 = messageEntity2.offset;
                                int i17 = messageEntity2.length + i16;
                                if ((messageEntity2 instanceof TLRPC.TL_messageEntitySpoiler) && i14 <= i17 && i15 >= i16) {
                                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                    textStyleRun.flags |= 256;
                                    spannableStringValueOf.setSpan(new TextStyleSpan(textStyleRun), Math.max(i14, i16), Math.min(i15, i17) + i6, 33);
                                }
                            }
                            this.links.add(spannableStringValueOf);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    spannableStringBuilderValueOf2 = spannableStringBuilder2;
                    charSequence3 = charSequence4;
                }
                charSequence3 = charSequence4;
                charSequence3 = charSequence4;
                charSequence3 = charSequence4;
                charSequence3 = charSequence4;
                charSequence3 = charSequence4;
                charSequence3 = charSequence4;
                i10++;
                i7 = 0;
                i9 = 46;
                i8 = 1;
                charSequence4 = charSequence3;
            }
            spannableStringBuilder = spannableStringBuilderValueOf2;
            charSequence = charSequence4;
        }
        if (str != null && this.links.isEmpty()) {
            this.links.add(str);
        }
        MessageObject messageObject3 = this.message;
        if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (richMessage = message.rich_message) != null) {
            gatherRichMessageLinks(richMessage.blocks);
            if (!this.links.isEmpty()) {
                String string2 = ((CharSequence) this.links.get(0)).toString();
                if (string == null || string.length() == 0) {
                    String host = Uri.parse(string2.toString()).getHost();
                    string = host == null ? string2.toString() : host;
                    if (string != null && (iLastIndexOf = string.lastIndexOf(46)) >= 0) {
                        String strSubstring3 = string.substring(0, iLastIndexOf);
                        int iLastIndexOf4 = strSubstring3.lastIndexOf(46);
                        if (iLastIndexOf4 >= 0) {
                            strSubstring3 = strSubstring3.substring(iLastIndexOf4 + 1);
                        }
                        string = strSubstring3.substring(0, 1).toUpperCase() + strSubstring3.substring(1);
                    }
                }
            }
        }
        if (this.viewType == 1) {
            String strStringForMessageListDate = LocaleController.stringForMessageListDate(this.message.messageOwner.date);
            int iCeil = (int) Math.ceil(this.description2TextPaint.measureText(strStringForMessageListDate));
            this.dateLayout = ChatMessageCell.generateStaticLayout(strStringForMessageListDate, this.description2TextPaint, iCeil, iCeil, 0, 1);
            this.dateLayoutX = (size - iCeil) - AndroidUtilities.dp(8.0f);
            iDp = iCeil + AndroidUtilities.dp(12.0f);
        } else {
            iDp = 0;
        }
        if (string != null) {
            try {
                CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(string, this.message.highlightedWords, (Theme.ResourcesProvider) null);
                int i18 = size - iDp;
                StaticLayout staticLayoutGenerateStaticLayout = ChatMessageCell.generateStaticLayout(charSequenceHighlightText != null ? charSequenceHighlightText : string, this.titleTextPaint, i18 - AndroidUtilities.dp(4.0f), i18 - AndroidUtilities.dp(4.0f), 0, 3);
                this.titleLayout = staticLayoutGenerateStaticLayout;
                if (staticLayoutGenerateStaticLayout.getLineCount() > 0) {
                    int i19 = this.titleY;
                    StaticLayout staticLayout = this.titleLayout;
                    this.descriptionY = i19 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            this.letterDrawable.setTitle(string);
        }
        this.description2Y = this.descriptionY;
        StaticLayout staticLayout2 = this.titleLayout;
        int iMax = Math.max(1, 4 - (staticLayout2 != null ? staticLayout2.getLineCount() : 0));
        if (this.viewType == 1) {
            spannableStringBuilder = null;
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        if (charSequence2 != null) {
            try {
                StaticLayout staticLayoutGenerateStaticLayout2 = ChatMessageCell.generateStaticLayout(charSequence2, this.descriptionTextPaint, size, size, 0, iMax);
                this.descriptionLayout = staticLayoutGenerateStaticLayout2;
                if (staticLayoutGenerateStaticLayout2.getLineCount() > 0) {
                    int i20 = this.descriptionY;
                    StaticLayout staticLayout3 = this.descriptionLayout;
                    this.description2Y = i20 + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                }
                this.spoilersPool.addAll(this.descriptionLayoutSpoilers);
                this.descriptionLayoutSpoilers.clear();
                if (!this.message.isSpoilersRevealed) {
                    SpoilerEffect.addSpoilers(this, this.descriptionLayout, this.spoilersPool, this.descriptionLayoutSpoilers);
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        if (spannableStringBuilder != null) {
            try {
                this.descriptionLayout2 = ChatMessageCell.generateStaticLayout(spannableStringBuilder, this.descriptionTextPaint, size, size, 0, iMax);
                if (this.descriptionLayout != null) {
                    this.description2Y += AndroidUtilities.dp(10.0f);
                }
                this.spoilersPool.addAll(this.descriptionLayout2Spoilers);
                this.descriptionLayout2Spoilers.clear();
                if (!this.message.isSpoilersRevealed) {
                    SpoilerEffect.addSpoilers(this, this.descriptionLayout2, this.spoilersPool, this.descriptionLayout2Spoilers);
                }
            } catch (Exception e4) {
                FileLog.e(e4);
            }
        }
        MessageObject messageObject4 = this.message;
        if (messageObject4 == null || TextUtils.isEmpty(messageObject4.messageOwner.message)) {
            photoSize = null;
        } else {
            photoSize = null;
            CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(Emoji.replaceEmoji(this.message.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), Theme.chat_msgTextPaint.getFontMetricsInt(), false), this.message.highlightedWords, (Theme.ResourcesProvider) null);
            if (charSequenceHighlightText2 != null) {
                this.captionLayout = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, this.message.highlightedWords.get(0), size, this.captionTextPaint, 130), this.captionTextPaint, size, TextUtils.TruncateAt.END), this.captionTextPaint, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        }
        StaticLayout staticLayout4 = this.captionLayout;
        if (staticLayout4 != null) {
            int i21 = this.descriptionY;
            this.captionY = i21;
            int lineBottom2 = i21 + staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
            this.descriptionY = lineBottom2;
            this.description2Y = lineBottom2;
        }
        if (!this.links.isEmpty()) {
            for (int i22 = 0; i22 < this.linkSpoilers.size(); i22++) {
                this.spoilersPool.addAll((Collection) this.linkSpoilers.get(i22));
            }
            this.linkSpoilers.clear();
            int i23 = 0;
            while (i23 < this.links.size()) {
                try {
                    CharSequence charSequence5 = (CharSequence) this.links.get(i23);
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(AndroidUtilities.replaceNewLines(SpannableStringBuilder.valueOf(charSequence5)), this.descriptionTextPaint, Math.min((int) Math.ceil(this.descriptionTextPaint.measureText(charSequence5, 0, charSequence5.length())), size), TextUtils.TruncateAt.MIDDLE);
                    photoSize2 = photoSize;
                    try {
                        StaticLayout staticLayout5 = new StaticLayout(charSequenceEllipsize, this.descriptionTextPaint, size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.linkY = this.description2Y;
                        StaticLayout staticLayout6 = this.descriptionLayout2;
                        if (staticLayout6 != null && staticLayout6.getLineCount() != 0) {
                            int i24 = this.linkY;
                            StaticLayout staticLayout7 = this.descriptionLayout2;
                            this.linkY = i24 + staticLayout7.getLineBottom(staticLayout7.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                        }
                        if (!this.message.isSpoilersRevealed) {
                            ArrayList arrayList = new ArrayList();
                            if (charSequenceEllipsize instanceof Spannable) {
                                SpoilerEffect.addSpoilers(this, staticLayout5, (Spannable) charSequenceEllipsize, this.spoilersPool, arrayList);
                            }
                            this.linkSpoilers.put(i23, arrayList);
                        }
                        this.linkLayout.add(staticLayout5);
                    } catch (Exception e5) {
                        e = e5;
                        FileLog.e(e);
                    }
                } catch (Exception e6) {
                    e = e6;
                    photoSize2 = photoSize;
                }
                i23++;
                photoSize = photoSize2;
            }
        }
        TLRPC.PhotoSize photoSize3 = photoSize;
        int iDp2 = AndroidUtilities.dp(52.0f);
        int size2 = LocaleController.isRTL ? (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(10.0f)) - iDp2 : AndroidUtilities.dp(10.0f);
        this.letterDrawable.setBounds(size2, AndroidUtilities.dp(11.0f), size2 + iDp2, AndroidUtilities.dp(63.0f));
        if (z) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.message.photoThumbs, iDp2, true);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.message.photoThumbs, 80);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize2 = photoSize3;
            }
            if (closestPhotoSizeWithSize != null) {
                closestPhotoSizeWithSize.size = -1;
            }
            if (closestPhotoSizeWithSize2 != null) {
                closestPhotoSizeWithSize2.size = -1;
            }
            float f = iDp2;
            this.linkImageView.setImageCoords(size2, AndroidUtilities.dp(11.0f), f, f);
            FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            Locale locale = Locale.US;
            this.linkImageView.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.message.photoThumbsObject), String.format(locale, "%d_%d", Integer.valueOf(iDp2), Integer.valueOf(iDp2)), ImageLocation.getForObject(closestPhotoSizeWithSize2, this.message.photoThumbsObject), String.format(locale, "%d_%d_b", Integer.valueOf(iDp2), Integer.valueOf(iDp2)), 0L, null, this.message, 0);
            z2 = true;
            this.drawLinkImageView = true;
        } else {
            z2 = true;
        }
        if (this.viewType == z2) {
            StaticLayout staticLayoutGenerateStaticLayout3 = ChatMessageCell.generateStaticLayout(FilteredSearchView.createFromInfoString(this.message, z2, 2, this.description2TextPaint), this.description2TextPaint, size, size, 0, iMax);
            this.fromInfoLayout = staticLayoutGenerateStaticLayout3;
            i3 = 0;
            this.fromInfoLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.fromInfoLayoutEmojis, staticLayoutGenerateStaticLayout3);
        } else {
            i3 = 0;
        }
        StaticLayout staticLayout8 = this.titleLayout;
        if (staticLayout8 == null || staticLayout8.getLineCount() == 0) {
            lineBottom = 0;
        } else {
            StaticLayout staticLayout9 = this.titleLayout;
            lineBottom = staticLayout9.getLineBottom(staticLayout9.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
        }
        StaticLayout staticLayout10 = this.captionLayout;
        if (staticLayout10 != null && staticLayout10.getLineCount() != 0) {
            StaticLayout staticLayout11 = this.captionLayout;
            lineBottom += staticLayout11.getLineBottom(staticLayout11.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
        }
        StaticLayout staticLayout12 = this.descriptionLayout;
        if (staticLayout12 != null && staticLayout12.getLineCount() != 0) {
            StaticLayout staticLayout13 = this.descriptionLayout;
            lineBottom += staticLayout13.getLineBottom(staticLayout13.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
        }
        StaticLayout staticLayout14 = this.descriptionLayout2;
        if (staticLayout14 != null && staticLayout14.getLineCount() != 0) {
            StaticLayout staticLayout15 = this.descriptionLayout2;
            lineBottom += staticLayout15.getLineBottom(staticLayout15.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
            if (this.descriptionLayout != null) {
                lineBottom += AndroidUtilities.dp(10.0f);
            }
        }
        int lineBottom3 = 0;
        while (i3 < this.linkLayout.size()) {
            StaticLayout staticLayout16 = (StaticLayout) this.linkLayout.get(i3);
            if (staticLayout16.getLineCount() > 0) {
                i4 = 1;
                lineBottom3 += staticLayout16.getLineBottom(staticLayout16.getLineCount() - 1);
            } else {
                i4 = 1;
            }
            i3 += i4;
        }
        int lineBottom4 = lineBottom + lineBottom3;
        if (this.fromInfoLayout != null) {
            this.fromInfoLayoutY = this.linkY + lineBottom3 + AndroidUtilities.dp(5.0f);
            StaticLayout staticLayout17 = this.fromInfoLayout;
            lineBottom4 += staticLayout17.getLineBottom(staticLayout17.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
        }
        this.checkBox.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max(AndroidUtilities.dp(76.0f), lineBottom4 + AndroidUtilities.dp(17.0f)) + (this.needDivider ? 1 : 0));
    }

    public void setLink(MessageObject messageObject, boolean z) {
        this.needDivider = z;
        resetPressedLink();
        this.message = messageObject;
        requestLayout();
    }

    public ImageReceiver getLinkImageView() {
        return this.linkImageView;
    }

    public void setDelegate(SharedLinkCellDelegate sharedLinkCellDelegate) {
        this.delegate = sharedLinkCellDelegate;
    }

    public MessageObject getMessage() {
        return this.message;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.drawLinkImageView) {
            this.linkImageView.onDetachedFromWindow();
        }
        AnimatedEmojiSpan.release(this, this.fromInfoLayoutEmojis);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.drawLinkImageView) {
            this.linkImageView.onAttachedToWindow();
        }
        this.fromInfoLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.fromInfoLayoutEmojis, this.fromInfoLayout);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        SharedLinkCellDelegate sharedLinkCellDelegate;
        boolean z2;
        int i;
        int i2;
        int i3;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.message != null && !this.linkLayout.isEmpty() && (sharedLinkCellDelegate = this.delegate) != null && sharedLinkCellDelegate.canPerformActions()) {
            if (motionEvent.getAction() == 0 || ((this.linkPreviewPressed || this.spoilerPressed != null) && motionEvent.getAction() == 1)) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= this.linkLayout.size()) {
                        z = false;
                        z2 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) this.linkLayout.get(i4);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f = x;
                        float f2 = iDp;
                        if (f >= staticLayout.getLineLeft(0) + f2 && f <= staticLayout.getLineWidth(0) + f2 && y >= (i3 = this.linkY + i5) && y <= i3 + lineBottom) {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.spoilerPressed = null;
                                if (this.linkSpoilers.get(i4, null) != null) {
                                    for (SpoilerEffect spoilerEffect : (List) this.linkSpoilers.get(i4)) {
                                        if (spoilerEffect.getBounds().contains(x - iDp, (y - this.linkY) - i5)) {
                                            resetPressedLink();
                                            this.spoilerPressed = spoilerEffect;
                                            this.spoilerTypePressed = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.spoilerPressed == null && (this.pressedLinkIndex != i4 || this.pressedLink == null || !this.linkPreviewPressed)) {
                                    resetPressedLink();
                                    this.pressedLinkIndex = i4;
                                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(null, this.resourcesProvider, x - iDp, (y - this.linkY) - i5);
                                    this.pressedLink = linkSpanDrawable;
                                    LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
                                    this.linkPreviewPressed = true;
                                    this.linksCollector.addLink(this.pressedLink);
                                    startCheckLongPress();
                                    try {
                                        linkPathObtainNewPath.setCurrentLayout(staticLayout, 0, f2, this.linkY + i5);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), linkPathObtainNewPath);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            } else if (this.linkPreviewPressed) {
                                try {
                                    if (this.pressedLinkIndex == 0 && (messageMedia = this.message.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage != null && (str = webPage.embed_url) != null && str.length() != 0) {
                                        this.delegate.needOpenWebView(webPage, this.message);
                                    } else {
                                        this.delegate.onLinkPress(((CharSequence) this.links.get(this.pressedLinkIndex)).toString(), false);
                                    }
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                                resetPressedLink();
                            } else {
                                if (this.spoilerPressed != null) {
                                    startSpoilerRipples(x, y, i5);
                                } else {
                                    z = false;
                                }
                                z2 = true;
                                break;
                            }
                            z = true;
                            z2 = true;
                            break;
                        }
                        i5 += lineBottom;
                    }
                    i4++;
                }
                if (motionEvent.getAction() == 0) {
                    int iDp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                    StaticLayout staticLayout2 = this.descriptionLayout;
                    if (staticLayout2 != null && x >= iDp2 && x <= staticLayout2.getWidth() + iDp2 && y >= (i2 = this.descriptionY) && y <= i2 + this.descriptionLayout.getHeight()) {
                        for (SpoilerEffect spoilerEffect2 : this.descriptionLayoutSpoilers) {
                            if (spoilerEffect2.getBounds().contains(x - iDp2, y - this.descriptionY)) {
                                this.spoilerPressed = spoilerEffect2;
                                this.spoilerTypePressed = 1;
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.descriptionLayout2;
                    if (staticLayout3 != null && x >= iDp2 && x <= staticLayout3.getWidth() + iDp2 && y >= (i = this.description2Y) && y <= i + this.descriptionLayout2.getHeight()) {
                        for (SpoilerEffect spoilerEffect3 : this.descriptionLayout2Spoilers) {
                            if (spoilerEffect3.getBounds().contains(x - iDp2, y - this.description2Y)) {
                                this.spoilerPressed = spoilerEffect3;
                                this.spoilerTypePressed = 2;
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 && this.spoilerPressed != null) {
                        startSpoilerRipples(x, y, 0);
                        z = true;
                        z2 = true;
                        break;
                    }
                    break;
                }
                if (!z2) {
                    resetPressedLink();
                }
            } else if (motionEvent.getAction() == 3) {
                resetPressedLink();
            }
            return z || super.onTouchEvent(motionEvent);
        }
        resetPressedLink();
        z = false;
        if (z) {
            return true;
        }
    }

    private void startSpoilerRipples(int i, int i2, int i3) {
        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        resetPressedLink();
        this.spoilerPressed.setOnRippleEndCallback(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$startSpoilerRipples$1();
            }
        });
        int i4 = i - iDp;
        float fSqrt = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
        int i5 = this.spoilerTypePressed;
        if (i5 == 0) {
            float lineBottom = 0.0f;
            for (int i6 = 0; i6 < this.linkLayout.size(); i6++) {
                Layout layout = (Layout) this.linkLayout.get(i6);
                lineBottom += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) this.linkSpoilers.get(i6)).iterator();
                while (it.hasNext()) {
                    ((SpoilerEffect) it.next()).startRipple(i4, ((i2 - getYOffsetForType(0)) - i3) + lineBottom, fSqrt);
                }
            }
        } else if (i5 == 1) {
            Iterator it2 = this.descriptionLayoutSpoilers.iterator();
            while (it2.hasNext()) {
                ((SpoilerEffect) it2.next()).startRipple(i4, i2 - getYOffsetForType(1), fSqrt);
            }
        } else if (i5 == 2) {
            Iterator it3 = this.descriptionLayout2Spoilers.iterator();
            while (it3.hasNext()) {
                ((SpoilerEffect) it3.next()).startRipple(i4, i2 - getYOffsetForType(2), fSqrt);
            }
        }
        for (int i7 = 0; i7 <= 2; i7++) {
            if (i7 != this.spoilerTypePressed) {
                if (i7 == 0) {
                    for (int i8 = 0; i8 < this.linkLayout.size(); i8++) {
                        Layout layout2 = (Layout) this.linkLayout.get(i8);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (SpoilerEffect spoilerEffect : (List) this.linkSpoilers.get(i8)) {
                            spoilerEffect.startRipple(spoilerEffect.getBounds().centerX(), spoilerEffect.getBounds().centerY(), fSqrt);
                        }
                    }
                } else if (i7 == 1) {
                    for (SpoilerEffect spoilerEffect2 : this.descriptionLayoutSpoilers) {
                        spoilerEffect2.startRipple(spoilerEffect2.getBounds().centerX(), spoilerEffect2.getBounds().centerY(), fSqrt);
                    }
                } else if (i7 == 2) {
                    for (SpoilerEffect spoilerEffect3 : this.descriptionLayout2Spoilers) {
                        spoilerEffect3.startRipple(spoilerEffect3.getBounds().centerX(), spoilerEffect3.getBounds().centerY(), fSqrt);
                    }
                }
            }
        }
        this.spoilerTypePressed = -1;
        this.spoilerPressed = null;
    }

    public void lambda$startSpoilerRipples$1() {
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$startSpoilerRipples$0();
            }
        });
    }

    public void lambda$startSpoilerRipples$0() {
        this.message.isSpoilersRevealed = true;
        this.linkSpoilers.clear();
        this.descriptionLayoutSpoilers.clear();
        this.descriptionLayout2Spoilers.clear();
        invalidate();
    }

    private int getYOffsetForType(int i) {
        if (i == 1) {
            return this.descriptionY;
        }
        if (i != 2) {
            return this.linkY;
        }
        return this.description2Y;
    }

    public String getLink(int i) {
        if (i < 0 || i >= this.links.size()) {
            return null;
        }
        return ((CharSequence) this.links.get(i)).toString();
    }

    protected void resetPressedLink() {
        this.linksCollector.clear(true);
        this.pressedLinkIndex = -1;
        this.pressedLink = null;
        this.linkPreviewPressed = false;
        cancelCheckLongPress();
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.checkBox.getVisibility() != 0) {
            this.checkBox.setVisibility(0);
        }
        this.checkBox.setChecked(z, z2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.viewType == 1) {
            this.description2TextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
        }
        if (this.dateLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.dateLayoutX), this.titleY);
            this.dateLayout.draw(canvas);
            canvas.restore();
        }
        if (this.titleLayout != null) {
            canvas.save();
            float fDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout = this.dateLayout;
                fDp += staticLayout == null ? 0.0f : staticLayout.getWidth() + AndroidUtilities.dp(4.0f);
            }
            canvas.translate(fDp, this.titleY);
            this.titleLayout.draw(canvas);
            canvas.restore();
        }
        if (this.captionLayout != null) {
            this.captionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.captionY);
            this.captionLayout.draw(canvas);
            canvas.restore();
        }
        if (this.descriptionLayout != null) {
            this.descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.descriptionY);
            SpoilerEffect.renderWithRipple(this, false, this.descriptionTextPaint.getColor(), -AndroidUtilities.dp(2.0f), this.patchedDescriptionLayout, 0, this.descriptionLayout, this.descriptionLayoutSpoilers, canvas, false);
            canvas.restore();
        }
        if (this.descriptionLayout2 != null) {
            this.descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.description2Y);
            SpoilerEffect.renderWithRipple(this, false, this.descriptionTextPaint.getColor(), -AndroidUtilities.dp(2.0f), this.patchedDescriptionLayout2, 0, this.descriptionLayout2, this.descriptionLayout2Spoilers, canvas, false);
            canvas.restore();
        }
        if (!this.linkLayout.isEmpty()) {
            this.descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, this.resourcesProvider));
            int lineBottom = 0;
            for (int i = 0; i < this.linkLayout.size(); i++) {
                StaticLayout staticLayout2 = (StaticLayout) this.linkLayout.get(i);
                List list = (List) this.linkSpoilers.get(i);
                if (staticLayout2.getLineCount() > 0) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.linkY + lineBottom);
                    this.path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((SpoilerEffect) it.next()).getBounds();
                            this.path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                        }
                    }
                    canvas.save();
                    canvas.clipPath(this.path, Region.Op.DIFFERENCE);
                    staticLayout2.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.clipPath(this.path);
                    this.path.rewind();
                    if (list != null && !list.isEmpty()) {
                        ((SpoilerEffect) list.get(0)).getRipplePath(this.path);
                    }
                    canvas.clipPath(this.path);
                    staticLayout2.draw(canvas);
                    canvas.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((SpoilerEffect) it2.next()).draw(canvas);
                        }
                    }
                    canvas.restore();
                    lineBottom += staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
                }
            }
            if (this.linksCollector.draw(canvas)) {
                invalidate();
            }
        }
        if (this.fromInfoLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.fromInfoLayoutY);
            this.fromInfoLayout.draw(canvas);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.fromInfoLayout, this.fromInfoLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        this.letterDrawable.draw(canvas);
        if (this.drawLinkImageView) {
            this.linkImageView.draw(canvas);
        }
        if (this.needDivider) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.descriptionLayout != null) {
            sb.append(", ");
            sb.append(this.descriptionLayout.getText());
        }
        if (this.descriptionLayout2 != null) {
            sb.append(", ");
            sb.append(this.descriptionLayout2.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }
}
