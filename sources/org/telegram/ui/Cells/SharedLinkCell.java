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
import com.google.android.gms.cast.internal.zzr;
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
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.FilteredSearchView;

public final class SharedLinkCell extends FrameLayout {
    public StaticLayout captionLayout;
    public final TextPaint captionTextPaint;
    public int captionY;
    public final CheckBox2 checkBox;
    public boolean checkingForLongPress;
    public StaticLayout dateLayout;
    public int dateLayoutX;
    public SharedLinkCellDelegate delegate;
    public final TextPaint description2TextPaint;
    public int description2Y;
    public StaticLayout descriptionLayout;
    public StaticLayout descriptionLayout2;
    public final ArrayList descriptionLayout2Spoilers;
    public final ArrayList descriptionLayoutSpoilers;
    public final TextPaint descriptionTextPaint;
    public int descriptionY;
    public boolean drawLinkImageView;
    public StaticLayout fromInfoLayout;
    public AnimatedEmojiSpan.EmojiGroupedSpans fromInfoLayoutEmojis;
    public int fromInfoLayoutY;
    public final LetterDrawable letterDrawable;
    public final ImageReceiver linkImageView;
    public final ArrayList linkLayout;
    public boolean linkPreviewPressed;
    public final SparseArray linkSpoilers;
    public int linkY;
    public final ArrayList links;
    public final LinkSpanDrawable.LinkCollector linksCollector;
    public MessageObject message;
    public boolean needDivider;
    public final AtomicReference patchedDescriptionLayout;
    public final AtomicReference patchedDescriptionLayout2;
    public final Path path;
    public zzr pendingCheckForLongPress;
    public BubbleActivity.AnonymousClass1 pendingCheckForTap;
    public int pressCount;
    public LinkSpanDrawable pressedLink;
    public int pressedLinkIndex;
    public final Theme.ResourcesProvider resourcesProvider;
    public SpoilerEffect spoilerPressed;
    public int spoilerTypePressed;
    public final Stack spoilersPool;
    public StaticLayout titleLayout;
    public final TextPaint titleTextPaint;
    public final int titleY;
    public final int viewType;

    public interface SharedLinkCellDelegate {
        boolean canPerformActions();

        void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject);

        void onLinkPress(String str, boolean z);
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
        textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        TextPaint textPaint2 = new TextPaint(1);
        this.descriptionTextPaint = textPaint2;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.linkImageView = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.letterDrawable = new LetterDrawable(0, resourcesProvider);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setVisibility(4);
        checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(2);
        boolean z = LocaleController.isRTL;
        addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 44.0f, 44.0f, z ? 44.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint3 = new TextPaint(1);
            this.description2TextPaint = textPaint3;
            textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint4 = new TextPaint(1);
        this.captionTextPaint = textPaint4;
        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void gatherLink(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("#")) {
            return;
        }
        if (!AndroidUtilities.charSequenceContains(strTrim, "://") && strTrim.toString().toLowerCase().indexOf("http") != 0 && strTrim.toString().toLowerCase().indexOf("mailto") != 0) {
            strTrim = "http://".concat(strTrim);
        }
        this.links.add(SpannableString.valueOf(strTrim));
    }

    public final void gatherRichMessageLinks(TL_iv.RichText richText) {
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

    public ImageReceiver getLinkImageView() {
        return this.linkImageView;
    }

    public MessageObject getMessage() {
        return this.message;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.drawLinkImageView) {
            this.linkImageView.onAttachedToWindow();
        }
        this.fromInfoLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.fromInfoLayoutEmojis, this.fromInfoLayout);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.drawLinkImageView) {
            this.linkImageView.onDetachedFromWindow();
        }
        AnimatedEmojiSpan.release(this, this.fromInfoLayoutEmojis);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (this.viewType == 1) {
            this.description2TextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        }
        StaticLayout staticLayout = this.dateLayout;
        int i = this.titleY;
        if (staticLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.dateLayoutX), i);
            this.dateLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.titleLayout != null) {
            canvas2.save();
            float fDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                StaticLayout staticLayout2 = this.dateLayout;
                fDp += staticLayout2 == null ? 0.0f : AndroidUtilities.dp(4.0f) + staticLayout2.getWidth();
            }
            canvas2.translate(fDp, i);
            this.titleLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.captionLayout != null) {
            this.captionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.captionY);
            this.captionLayout.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout3 = this.descriptionLayout;
        TextPaint textPaint = this.descriptionTextPaint;
        if (staticLayout3 != null) {
            textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.descriptionY);
            SpoilerEffect.renderWithRipple(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.patchedDescriptionLayout, 0, this.descriptionLayout, this.descriptionLayoutSpoilers, canvas2, false);
            canvas2.restore();
        }
        if (this.descriptionLayout2 != null) {
            textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.description2Y);
            SpoilerEffect.renderWithRipple(this, false, textPaint.getColor(), -AndroidUtilities.dp(2.0f), this.patchedDescriptionLayout2, 0, this.descriptionLayout2, this.descriptionLayout2Spoilers, canvas2, false);
            canvas2.restore();
        }
        ArrayList arrayList = this.linkLayout;
        if (!arrayList.isEmpty()) {
            textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
            int lineBottom = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                StaticLayout staticLayout4 = (StaticLayout) arrayList.get(i2);
                List list = (List) this.linkSpoilers.get(i2);
                if (staticLayout4.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.linkY + lineBottom);
                    Path path = this.path;
                    path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((SpoilerEffect) it.next()).getBounds();
                            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                        }
                    }
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipPath(path);
                    path.rewind();
                    if (list != null && !list.isEmpty()) {
                        ((SpoilerEffect) list.get(0)).getRipplePath(path);
                    }
                    canvas2.clipPath(path);
                    staticLayout4.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((SpoilerEffect) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    lineBottom += staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1);
                }
            }
            if (this.linksCollector.draw(canvas2)) {
                invalidate();
            }
        }
        if (this.fromInfoLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.fromInfoLayoutY);
            this.fromInfoLayout.draw(canvas2);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.fromInfoLayout, this.fromInfoLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        this.letterDrawable.draw(canvas2);
        if (this.drawLinkImageView) {
            this.linkImageView.draw(canvas2);
        }
        if (this.needDivider) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
        if (this.checkBox.checkBoxBase.isChecked) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        String str;
        String string;
        String str2;
        boolean z;
        float f;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        TextPaint textPaint;
        int iDp;
        CharSequence charSequence2;
        int i3;
        TLRPC.PhotoSize photoSize;
        boolean z2;
        int lineBottom;
        int i4;
        int iM;
        SparseArray sparseArray;
        TLRPC.PhotoSize photoSize2;
        TextPaint textPaint2;
        SparseArray sparseArray2;
        int i5;
        StaticLayout staticLayout;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        int iLastIndexOf;
        CharSequence charSequence3;
        int i6;
        SpannableStringBuilder spannableStringBuilder2;
        CharSequence charSequence4;
        String string2;
        SpannableStringBuilder spannableStringBuilderValueOf;
        CharSequence charSequence5;
        int i7;
        SpannableStringBuilder spannableStringBuilder3;
        String str3;
        CharSequence charSequence6;
        CharSequence charSequence7;
        int iLastIndexOf2;
        String strSubstring;
        int iLastIndexOf3;
        int i8 = 0;
        this.drawLinkImageView = false;
        this.descriptionLayout = null;
        this.titleLayout = null;
        this.descriptionLayout2 = null;
        this.captionLayout = null;
        ArrayList arrayList = this.linkLayout;
        arrayList.clear();
        ArrayList arrayList2 = this.links;
        arrayList2.clear();
        int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        MessageObject messageObject = this.message;
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        int i9 = 1;
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
                String str4 = webPage.description;
                str = webPage.url;
                z = z3;
                str2 = str4;
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
        int i10 = 46;
        if (messageObject2 == null || messageObject2.messageOwner.entities.isEmpty()) {
            f = 8.0f;
            spannableStringBuilder = null;
            charSequence = str2;
        } else {
            SpannableStringBuilder spannableStringBuilderValueOf2 = null;
            int i11 = 0;
            CharSequence charSequence8 = str2;
            while (i11 < this.message.messageOwner.entities.size()) {
                TLRPC.MessageEntity messageEntity = this.message.messageOwner.entities.get(i11);
                if (messageEntity.length <= 0 || (i6 = messageEntity.offset) < 0) {
                    charSequence3 = charSequence8;
                } else if (i6 < this.message.messageOwner.message.length()) {
                    if (messageEntity.offset + messageEntity.length > this.message.messageOwner.message.length()) {
                        charSequence3 = charSequence8;
                        messageEntity.length = this.message.messageOwner.message.length() - messageEntity.offset;
                    }
                    if (i11 == 0 && str != null && (messageEntity.offset != 0 || messageEntity.length != this.message.messageOwner.message.length())) {
                        if (this.message.messageOwner.entities.size() != i9) {
                            spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                            MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf2);
                        } else if (charSequence8 == null) {
                            spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                            MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf2);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilderValueOf2;
                    try {
                        if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                String str5 = this.message.messageOwner.message;
                                int i12 = messageEntity.offset;
                                string2 = str5.substring(i12, messageEntity.length + i12);
                            } else {
                                string2 = messageEntity.url;
                            }
                            if (string != null) {
                                charSequence5 = charSequence8;
                                string = Uri.parse(string2.toString()).getHost();
                                if (string == null) {
                                    string = string2.toString();
                                }
                                if (string != null) {
                                    strSubstring = string.substring(i8, iLastIndexOf2);
                                    iLastIndexOf3 = strSubstring.lastIndexOf(i10);
                                    if (iLastIndexOf3 >= 0) {
                                        strSubstring = strSubstring.substring(iLastIndexOf3 + 1);
                                    }
                                    string = strSubstring.substring(i8, 1).toUpperCase() + strSubstring.substring(1);
                                }
                                if (messageEntity.offset == 0) {
                                }
                                charSequence5 = charSequence8;
                                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                                MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf);
                                charSequence5 = spannableStringBuilderValueOf;
                            } else {
                                charSequence5 = charSequence8;
                                string = Uri.parse(string2.toString()).getHost();
                                if (string == null) {
                                    string = string2.toString();
                                }
                                if (string != null) {
                                    strSubstring = string.substring(i8, iLastIndexOf2);
                                    iLastIndexOf3 = strSubstring.lastIndexOf(i10);
                                    if (iLastIndexOf3 >= 0) {
                                        strSubstring = strSubstring.substring(iLastIndexOf3 + 1);
                                    }
                                    string = strSubstring.substring(i8, 1).toUpperCase() + strSubstring.substring(1);
                                }
                                if (messageEntity.offset == 0) {
                                }
                                charSequence5 = charSequence8;
                                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                                MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf);
                                charSequence5 = spannableStringBuilderValueOf;
                            }
                        } else {
                            try {
                                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                                        String str6 = this.message.messageOwner.message;
                                        int i13 = messageEntity.offset;
                                        string2 = str6.substring(i13, messageEntity.length + i13);
                                    } else {
                                        string2 = messageEntity.url;
                                    }
                                    if (string != null || string.length() == 0) {
                                        charSequence5 = charSequence8;
                                        string = Uri.parse(string2.toString()).getHost();
                                        if (string == null) {
                                            string = string2.toString();
                                        }
                                        if (string != null && (iLastIndexOf2 = string.lastIndexOf(i10)) >= 0) {
                                            strSubstring = string.substring(i8, iLastIndexOf2);
                                            iLastIndexOf3 = strSubstring.lastIndexOf(i10);
                                            if (iLastIndexOf3 >= 0) {
                                                strSubstring = strSubstring.substring(iLastIndexOf3 + 1);
                                            }
                                            string = strSubstring.substring(i8, 1).toUpperCase() + strSubstring.substring(1);
                                        }
                                        if (messageEntity.offset == 0 || messageEntity.length != this.message.messageOwner.message.length()) {
                                            charSequence5 = charSequence8;
                                            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                                            MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf);
                                            charSequence5 = spannableStringBuilderValueOf;
                                        }
                                        FileLog.e(e);
                                        spannableStringBuilderValueOf2 = spannableStringBuilder2;
                                        charSequence3 = charSequence4;
                                    }
                                } else if ((messageEntity instanceof TLRPC.TL_messageEntityEmail) && (string == null || string.length() == 0)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("mailto:");
                                    String str7 = this.message.messageOwner.message;
                                    int i14 = messageEntity.offset;
                                    sb.append(str7.substring(i14, messageEntity.length + i14));
                                    string2 = sb.toString();
                                    String str8 = this.message.messageOwner.message;
                                    int i15 = messageEntity.offset;
                                    string = str8.substring(i15, messageEntity.length + i15);
                                    if (messageEntity.offset != 0 || messageEntity.length != this.message.messageOwner.message.length()) {
                                        charSequence5 = charSequence8;
                                        spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(this.message.messageOwner.message);
                                        MediaDataController.addTextStyleRuns(this.message, spannableStringBuilderValueOf);
                                        charSequence5 = spannableStringBuilderValueOf;
                                    }
                                    FileLog.e(e);
                                    spannableStringBuilderValueOf2 = spannableStringBuilder2;
                                    charSequence3 = charSequence4;
                                } else {
                                    string2 = null;
                                    charSequence5 = charSequence8;
                                }
                            } catch (Exception e) {
                                e = e;
                                spannableStringBuilder2 = spannableStringBuilder4;
                                charSequence4 = charSequence8;
                            }
                        }
                        if (string2 != null) {
                            try {
                                if (AndroidUtilities.charSequenceContains(string2, "://") || string2.toString().toLowerCase().indexOf("http") == 0 || string2.toString().toLowerCase().indexOf("mailto") == 0) {
                                    i7 = 0;
                                } else {
                                    string2 = "http://" + ((Object) string2);
                                    i7 = 7;
                                }
                                SpannableString spannableStringValueOf = SpannableString.valueOf(string2);
                                int i16 = messageEntity.offset;
                                int i17 = messageEntity.length + i16;
                                ArrayList<TLRPC.MessageEntity> arrayList3 = this.message.messageOwner.entities;
                                charSequence5 = charSequence5;
                                for (int size2 = arrayList3.size(); i8 < size2; size2 = size2) {
                                    TLRPC.MessageEntity messageEntity2 = arrayList3.get(i8);
                                    i8++;
                                    spannableStringBuilder2 = spannableStringBuilder4;
                                    try {
                                        TLRPC.MessageEntity messageEntity3 = messageEntity2;
                                        String str9 = string;
                                        try {
                                            int i18 = messageEntity3.offset;
                                            int i19 = i7;
                                            int i20 = messageEntity3.length + i18;
                                            if (!(messageEntity3 instanceof TLRPC.TL_messageEntitySpoiler) || i16 > i20 || i17 < i18) {
                                                charSequence7 = charSequence5;
                                            } else {
                                                try {
                                                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                                    charSequence7 = charSequence5;
                                                    try {
                                                        textStyleRun.flags |= 256;
                                                        spannableStringValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), Math.max(i16, i18), Math.min(i17, i20) + i19, 33);
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        string = str9;
                                                        charSequence4 = charSequence7;
                                                        FileLog.e(e);
                                                        spannableStringBuilderValueOf2 = spannableStringBuilder2;
                                                        charSequence3 = charSequence4;
                                                        charSequence3 = charSequence8;
                                                        i11++;
                                                        i9 = 1;
                                                        i10 = 46;
                                                        i8 = 0;
                                                        charSequence8 = charSequence3;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    charSequence7 = charSequence5;
                                                }
                                            }
                                            string = str9;
                                            spannableStringBuilder4 = spannableStringBuilder2;
                                            i7 = i19;
                                            charSequence5 = charSequence7;
                                        } catch (Exception e4) {
                                            e = e4;
                                            string = str9;
                                            charSequence4 = charSequence5;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        charSequence4 = charSequence5;
                                    }
                                }
                                spannableStringBuilder3 = spannableStringBuilder4;
                                str3 = string;
                                charSequence6 = charSequence5;
                                arrayList2.add(spannableStringValueOf);
                            } catch (Exception e6) {
                                e = e6;
                                spannableStringBuilder2 = spannableStringBuilder4;
                            }
                        } else {
                            spannableStringBuilder3 = spannableStringBuilder4;
                            str3 = string;
                            charSequence6 = charSequence5;
                        }
                        string = str3;
                        spannableStringBuilderValueOf2 = spannableStringBuilder3;
                        charSequence3 = charSequence6;
                    } catch (Exception e7) {
                        e = e7;
                    }
                }
                charSequence3 = charSequence8;
                i11++;
                i9 = 1;
                i10 = 46;
                i8 = 0;
                charSequence8 = charSequence3;
            }
            f = 8.0f;
            spannableStringBuilder = spannableStringBuilderValueOf2;
            charSequence = charSequence8;
        }
        if (str != null && arrayList2.isEmpty()) {
            arrayList2.add(str);
        }
        MessageObject messageObject3 = this.message;
        if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (richMessage = message.rich_message) != null) {
            gatherRichMessageLinks(richMessage.blocks);
            if (!arrayList2.isEmpty()) {
                String string3 = ((CharSequence) arrayList2.get(0)).toString();
                if (string == null || string.length() == 0) {
                    String host = Uri.parse(string3.toString()).getHost();
                    string = host == null ? string3.toString() : host;
                    if (string != null && (iLastIndexOf = string.lastIndexOf(46)) >= 0) {
                        String strSubstring2 = string.substring(0, iLastIndexOf);
                        int iLastIndexOf4 = strSubstring2.lastIndexOf(46);
                        if (iLastIndexOf4 >= 0) {
                            strSubstring2 = strSubstring2.substring(iLastIndexOf4 + 1);
                        }
                        string = strSubstring2.substring(0, 1).toUpperCase() + strSubstring2.substring(1);
                    }
                }
            }
        }
        TextPaint textPaint3 = this.description2TextPaint;
        int i21 = this.viewType;
        if (i21 == 1) {
            String strStringForMessageListDate = LocaleController.stringForMessageListDate(this.message.messageOwner.date);
            int iCeil = (int) Math.ceil(textPaint3.measureText(strStringForMessageListDate));
            textPaint = textPaint3;
            this.dateLayout = ChatMessageCell.generateStaticLayout(strStringForMessageListDate, textPaint3, iCeil, iCeil, 0, 1);
            this.dateLayoutX = (size - iCeil) - AndroidUtilities.dp(f);
            iDp = AndroidUtilities.dp(12.0f) + iCeil;
        } else {
            textPaint = textPaint3;
            iDp = 0;
        }
        LetterDrawable letterDrawable = this.letterDrawable;
        if (string != null) {
            try {
                CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(string, this.message.highlightedWords, (Theme.ResourcesProvider) null);
                int i22 = size - iDp;
                StaticLayout staticLayoutGenerateStaticLayout = ChatMessageCell.generateStaticLayout(charSequenceHighlightText != null ? charSequenceHighlightText : string, this.titleTextPaint, i22 - AndroidUtilities.dp(4.0f), i22 - AndroidUtilities.dp(4.0f), 0, 3);
                this.titleLayout = staticLayoutGenerateStaticLayout;
                if (staticLayoutGenerateStaticLayout.getLineCount() > 0) {
                    int i23 = this.titleY;
                    StaticLayout staticLayout2 = this.titleLayout;
                    this.descriptionY = i23 + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + AndroidUtilities.dp(4.0f);
                }
            } catch (Exception e8) {
                FileLog.e(e8);
            }
            letterDrawable.setTitle(string);
        }
        this.description2Y = this.descriptionY;
        StaticLayout staticLayout3 = this.titleLayout;
        int iMax = Math.max(1, 4 - (staticLayout3 != null ? staticLayout3.getLineCount() : 0));
        if (i21 == 1) {
            spannableStringBuilder = null;
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        TextPaint textPaint4 = this.descriptionTextPaint;
        Stack stack = this.spoilersPool;
        if (charSequence2 != null) {
            try {
                StaticLayout staticLayoutGenerateStaticLayout2 = ChatMessageCell.generateStaticLayout(charSequence2, textPaint4, size, size, 0, iMax);
                this.descriptionLayout = staticLayoutGenerateStaticLayout2;
                if (staticLayoutGenerateStaticLayout2.getLineCount() > 0) {
                    int i24 = this.descriptionY;
                    StaticLayout staticLayout4 = this.descriptionLayout;
                    this.description2Y = i24 + staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(5.0f);
                }
                ArrayList arrayList4 = this.descriptionLayoutSpoilers;
                stack.addAll(arrayList4);
                arrayList4.clear();
                if (!this.message.isSpoilersRevealed) {
                    SpoilerEffect.addSpoilers(this, this.descriptionLayout, stack, arrayList4);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (spannableStringBuilder != null) {
            try {
                i3 = iMax;
                try {
                    this.descriptionLayout2 = ChatMessageCell.generateStaticLayout(spannableStringBuilder, textPaint4, size, size, 0, iMax);
                    if (this.descriptionLayout != null) {
                        this.description2Y += AndroidUtilities.dp(10.0f);
                    }
                    ArrayList arrayList5 = this.descriptionLayout2Spoilers;
                    stack.addAll(arrayList5);
                    arrayList5.clear();
                    if (!this.message.isSpoilersRevealed) {
                        SpoilerEffect.addSpoilers(this, this.descriptionLayout2, stack, arrayList5);
                    }
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                }
            } catch (Exception e11) {
                e = e11;
                i3 = iMax;
            }
        } else {
            i3 = iMax;
        }
        MessageObject messageObject4 = this.message;
        if (messageObject4 == null || TextUtils.isEmpty(messageObject4.messageOwner.message)) {
            photoSize = null;
        } else {
            photoSize = null;
            CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(Emoji.replaceEmoji(this.message.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), Theme.chat_msgTextPaint.getFontMetricsInt(), false), this.message.highlightedWords, (Theme.ResourcesProvider) null);
            if (charSequenceHighlightText2 != null) {
                String str10 = this.message.highlightedWords.get(0);
                TextPaint textPaint5 = this.captionTextPaint;
                this.captionLayout = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, str10, size, textPaint5, 130), textPaint5, size, TextUtils.TruncateAt.END), textPaint5, AndroidUtilities.dp(4.0f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        }
        StaticLayout staticLayout5 = this.captionLayout;
        if (staticLayout5 != null) {
            int i25 = this.descriptionY;
            this.captionY = i25;
            int iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(staticLayout5.getLineBottom(staticLayout5.getLineCount() - 1), 5.0f, i25);
            this.descriptionY = iM2;
            this.description2Y = iM2;
        }
        if (!arrayList2.isEmpty()) {
            int i26 = 0;
            while (true) {
                sparseArray = this.linkSpoilers;
                if (i26 >= sparseArray.size()) {
                    break;
                }
                stack.addAll((Collection) sparseArray.get(i26));
                i26++;
            }
            sparseArray.clear();
            int i27 = 0;
            while (i27 < arrayList2.size()) {
                try {
                    CharSequence charSequence9 = (CharSequence) arrayList2.get(i27);
                    Stack stack2 = stack;
                    try {
                        CharSequence charSequenceEllipsize = TextUtils.ellipsize(AndroidUtilities.replaceNewLines(SpannableStringBuilder.valueOf(charSequence9)), textPaint4, Math.min((int) Math.ceil(textPaint4.measureText(charSequence9, 0, charSequence9.length())), size), TextUtils.TruncateAt.MIDDLE);
                        int i28 = size;
                        TextPaint textPaint6 = textPaint4;
                        try {
                            StaticLayout staticLayout6 = new StaticLayout(charSequenceEllipsize, textPaint6, i28, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            textPaint4 = textPaint6;
                            size = i28;
                            this.linkY = this.description2Y;
                            StaticLayout staticLayout7 = this.descriptionLayout2;
                            if (staticLayout7 != null) {
                                try {
                                    if (staticLayout7.getLineCount() != 0) {
                                        int i29 = this.linkY;
                                        StaticLayout staticLayout8 = this.descriptionLayout2;
                                        try {
                                            this.linkY = staticLayout8.getLineBottom(staticLayout8.getLineCount() - 1) + AndroidUtilities.dp(5.0f) + i29;
                                        } catch (Exception e12) {
                                            e = e12;
                                            letterDrawable = letterDrawable;
                                            stack = stack2;
                                            textPaint2 = textPaint4;
                                            photoSize2 = null;
                                            sparseArray2 = sparseArray;
                                            i5 = i27;
                                            FileLog.e(e);
                                            i27 = i5 + 1;
                                            sparseArray = sparseArray2;
                                            letterDrawable = letterDrawable;
                                            arrayList2 = arrayList2;
                                            textPaint4 = textPaint2;
                                            photoSize = photoSize2;
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                }
                            }
                            if (this.message.isSpoilersRevealed) {
                                stack = stack2;
                                arrayList2 = arrayList2;
                                textPaint2 = textPaint4;
                                photoSize2 = null;
                                sparseArray2 = sparseArray;
                                i5 = i27;
                                staticLayout = staticLayout6;
                                letterDrawable = letterDrawable;
                            } else {
                                int i30 = i27;
                                try {
                                    ArrayList arrayList6 = new ArrayList();
                                    if (charSequenceEllipsize instanceof Spannable) {
                                        stack = stack2;
                                        ArrayList arrayList7 = arrayList2;
                                        sparseArray2 = sparseArray;
                                        staticLayout = staticLayout6;
                                        letterDrawable = letterDrawable;
                                        arrayList2 = arrayList7;
                                        textPaint2 = textPaint4;
                                        photoSize2 = null;
                                        i5 = i30;
                                        try {
                                            SpoilerEffect.addSpoilers(this, staticLayout, -1, -1, (Spannable) charSequenceEllipsize, stack, arrayList6, null);
                                        } catch (Exception e14) {
                                            e = e14;
                                            FileLog.e(e);
                                        }
                                    } else {
                                        stack = stack2;
                                        arrayList2 = arrayList2;
                                        textPaint2 = textPaint4;
                                        photoSize2 = null;
                                        sparseArray2 = sparseArray;
                                        i5 = i30;
                                        staticLayout = staticLayout6;
                                        letterDrawable = letterDrawable;
                                    }
                                    sparseArray2.put(i5, arrayList6);
                                } catch (Exception e15) {
                                    e = e15;
                                    letterDrawable = letterDrawable;
                                    stack = stack2;
                                    arrayList2 = arrayList2;
                                    textPaint2 = textPaint4;
                                    photoSize2 = null;
                                    sparseArray2 = sparseArray;
                                    i5 = i30;
                                }
                            }
                            arrayList.add(staticLayout);
                        } catch (Exception e16) {
                            e = e16;
                            letterDrawable = letterDrawable;
                            stack = stack2;
                            i5 = i27;
                            photoSize2 = photoSize;
                            textPaint2 = textPaint6;
                            size = i28;
                            arrayList2 = arrayList2;
                            sparseArray2 = sparseArray;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        stack = stack2;
                        photoSize2 = photoSize;
                        textPaint2 = textPaint4;
                        sparseArray2 = sparseArray;
                        i5 = i27;
                        FileLog.e(e);
                        i27 = i5 + 1;
                        sparseArray = sparseArray2;
                        letterDrawable = letterDrawable;
                        arrayList2 = arrayList2;
                        textPaint4 = textPaint2;
                        photoSize = photoSize2;
                    }
                } catch (Exception e18) {
                    e = e18;
                }
                i27 = i5 + 1;
                sparseArray = sparseArray2;
                letterDrawable = letterDrawable;
                arrayList2 = arrayList2;
                textPaint4 = textPaint2;
                photoSize = photoSize2;
            }
        }
        LetterDrawable letterDrawable2 = letterDrawable;
        TLRPC.PhotoSize photoSize3 = photoSize;
        int iDp2 = AndroidUtilities.dp(52.0f);
        int iM3 = LocaleController.isRTL ? RichMessageLayout$$ExternalSyntheticOutline2.m(View.MeasureSpec.getSize(i), 10.0f, iDp2) : AndroidUtilities.dp(10.0f);
        letterDrawable2.setBounds(iM3, AndroidUtilities.dp(11.0f), iM3 + iDp2, AndroidUtilities.dp(63.0f));
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
            ImageReceiver imageReceiver = this.linkImageView;
            float f2 = iDp2;
            imageReceiver.setImageCoords(iM3, AndroidUtilities.dp(11.0f), f2, f2);
            FileLoader.getAttachFileName(closestPhotoSizeWithSize);
            Locale locale = Locale.US;
            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, this.message.photoThumbsObject), iDp2 + "_" + iDp2, ImageLocation.getForObject(closestPhotoSizeWithSize2, this.message.photoThumbsObject), iDp2 + "_" + iDp2 + "_b", 0L, null, this.message, 0);
            z2 = true;
            this.drawLinkImageView = true;
        } else {
            z2 = true;
        }
        if (i21 == z2) {
            TextPaint textPaint7 = textPaint;
            i4 = 1;
            StaticLayout staticLayoutGenerateStaticLayout3 = ChatMessageCell.generateStaticLayout(FilteredSearchView.createFromInfoString(this.message, z2, 2, textPaint), textPaint7, size, size, 0, i3);
            this.fromInfoLayout = staticLayoutGenerateStaticLayout3;
            lineBottom = 0;
            this.fromInfoLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.fromInfoLayoutEmojis, staticLayoutGenerateStaticLayout3);
        } else {
            lineBottom = 0;
            i4 = 1;
        }
        StaticLayout staticLayout9 = this.titleLayout;
        if (staticLayout9 == null || staticLayout9.getLineCount() == 0) {
            iM = 0;
        } else {
            StaticLayout staticLayout10 = this.titleLayout;
            iM = staticLayout10.getLineBottom(staticLayout10.getLineCount() - i4) + AndroidUtilities.dp(4.0f);
        }
        StaticLayout staticLayout11 = this.captionLayout;
        if (staticLayout11 != null && staticLayout11.getLineCount() != 0) {
            StaticLayout staticLayout12 = this.captionLayout;
            iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(staticLayout12.getLineBottom(staticLayout12.getLineCount() - i4), 5.0f, iM);
        }
        StaticLayout staticLayout13 = this.descriptionLayout;
        if (staticLayout13 != null && staticLayout13.getLineCount() != 0) {
            StaticLayout staticLayout14 = this.descriptionLayout;
            iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(staticLayout14.getLineBottom(staticLayout14.getLineCount() - i4), 5.0f, iM);
        }
        StaticLayout staticLayout15 = this.descriptionLayout2;
        if (staticLayout15 != null && staticLayout15.getLineCount() != 0) {
            StaticLayout staticLayout16 = this.descriptionLayout2;
            iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(staticLayout16.getLineBottom(staticLayout16.getLineCount() - i4), 5.0f, iM);
            if (this.descriptionLayout != null) {
                iM += AndroidUtilities.dp(10.0f);
            }
        }
        for (int i31 = 0; i31 < arrayList.size(); i31 += i4) {
            StaticLayout staticLayout17 = (StaticLayout) arrayList.get(i31);
            if (staticLayout17.getLineCount() > 0) {
                lineBottom = staticLayout17.getLineBottom(staticLayout17.getLineCount() - i4) + lineBottom;
            }
        }
        int iM4 = iM + lineBottom;
        if (this.fromInfoLayout != null) {
            this.fromInfoLayoutY = AndroidUtilities.dp(5.0f) + this.linkY + lineBottom;
            StaticLayout staticLayout18 = this.fromInfoLayout;
            iM4 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(staticLayout18.getLineBottom(staticLayout18.getLineCount() - i4), 5.0f, iM4);
        }
        this.checkBox.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), MessageObject$$ExternalSyntheticOutline0.m(iM4, 17.0f, AndroidUtilities.dp(76.0f)) + (this.needDivider ? 1 : 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        SharedLinkCellDelegate sharedLinkCellDelegate;
        boolean z2;
        int i;
        int i2;
        int i3;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.message != null) {
            ArrayList arrayList = this.linkLayout;
            if (arrayList.isEmpty() || (sharedLinkCellDelegate = this.delegate) == null || !sharedLinkCellDelegate.canPerformActions()) {
                resetPressedLink();
            } else if (motionEvent.getAction() == 0 || ((this.linkPreviewPressed || this.spoilerPressed != null) && motionEvent.getAction() == 1)) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        z = false;
                        z2 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) arrayList.get(i4);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f = x;
                        float f2 = iDp;
                        if (f >= staticLayout.getLineLeft(0) + f2 && f <= staticLayout.getLineWidth(0) + f2 && y >= (i3 = this.linkY + i5) && y <= i3 + lineBottom) {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() != 0) {
                                if (!this.linkPreviewPressed) {
                                    if (this.spoilerPressed != null) {
                                        startSpoilerRipples(x, y, i5);
                                    } else {
                                        z = false;
                                    }
                                    z2 = true;
                                    break;
                                }
                                try {
                                    if (this.pressedLinkIndex == 0 && (messageMedia = this.message.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage == null || (str = webPage.embed_url) == null || str.length() == 0) {
                                        this.delegate.onLinkPress(((CharSequence) this.links.get(this.pressedLinkIndex)).toString(), false);
                                    } else {
                                        this.delegate.needOpenWebView(webPage, this.message);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                resetPressedLink();
                            } else {
                                this.spoilerPressed = null;
                                SparseArray sparseArray = this.linkSpoilers;
                                if (sparseArray.get(i4, null) != null) {
                                    for (SpoilerEffect spoilerEffect : (List) sparseArray.get(i4)) {
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
                                    this.linksCollector.addLink(this.pressedLink, null);
                                    if (!this.checkingForLongPress) {
                                        this.checkingForLongPress = true;
                                        if (this.pendingCheckForTap == null) {
                                            this.pendingCheckForTap = new BubbleActivity.AnonymousClass1(this, 7);
                                        }
                                        postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
                                    }
                                    try {
                                        linkPathObtainNewPath.setCurrentLayout(staticLayout, 0, f2, this.linkY + i5);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), linkPathObtainNewPath);
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                }
                            }
                            z = true;
                            z2 = true;
                            break;
                        }
                        i5 += lineBottom;
                    }
                    i4++;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 && this.spoilerPressed != null) {
                        startSpoilerRipples(x, y, 0);
                        z = true;
                        z2 = true;
                        break;
                    }
                    break;
                }
                int iDp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                StaticLayout staticLayout2 = this.descriptionLayout;
                if (staticLayout2 != null && x >= iDp2 && x <= staticLayout2.getWidth() + iDp2 && y >= (i2 = this.descriptionY) && y <= this.descriptionLayout.getHeight() + i2) {
                    ArrayList arrayList2 = this.descriptionLayoutSpoilers;
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        SpoilerEffect spoilerEffect2 = (SpoilerEffect) obj;
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
                if (staticLayout3 != null && x >= iDp2 && x <= staticLayout3.getWidth() + iDp2 && y >= (i = this.description2Y) && y <= this.descriptionLayout2.getHeight() + i) {
                    ArrayList arrayList3 = this.descriptionLayout2Spoilers;
                    int size2 = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList3.get(i7);
                        i7++;
                        SpoilerEffect spoilerEffect3 = (SpoilerEffect) obj2;
                        if (spoilerEffect3.getBounds().contains(x - iDp2, y - this.description2Y)) {
                            this.spoilerPressed = spoilerEffect3;
                            this.spoilerTypePressed = 2;
                            z = true;
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z2) {
                    resetPressedLink();
                }
            } else if (motionEvent.getAction() == 3) {
                resetPressedLink();
            }
            z = false;
        } else {
            resetPressedLink();
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public final void resetPressedLink() {
        this.linksCollector.clear(true);
        this.pressedLinkIndex = -1;
        this.pressedLink = null;
        this.linkPreviewPressed = false;
        this.checkingForLongPress = false;
        zzr zzrVar = this.pendingCheckForLongPress;
        if (zzrVar != null) {
            removeCallbacks(zzrVar);
        }
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.pendingCheckForTap;
        if (anonymousClass1 != null) {
            removeCallbacks(anonymousClass1);
        }
        invalidate();
    }

    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2.getVisibility() != 0) {
            checkBox2.setVisibility(0);
        }
        checkBox2.checkBoxBase.setChecked(-1, z, z2);
    }

    public void setDelegate(SharedLinkCellDelegate sharedLinkCellDelegate) {
        this.delegate = sharedLinkCellDelegate;
    }

    public final void startSpoilerRipples(int i, int i2, int i3) {
        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        resetPressedLink();
        this.spoilerPressed.onRippleEndCallback = new SharedLinkCell$$ExternalSyntheticLambda0(this, 0);
        int i4 = i - iDp;
        float fSqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        int i5 = this.spoilerTypePressed;
        SparseArray sparseArray = this.linkSpoilers;
        ArrayList arrayList = this.descriptionLayoutSpoilers;
        ArrayList arrayList2 = this.descriptionLayout2Spoilers;
        ArrayList arrayList3 = this.linkLayout;
        if (i5 == 0) {
            float lineBottom = 0.0f;
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                Layout layout = (Layout) arrayList3.get(i6);
                lineBottom += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) sparseArray.get(i6)).iterator();
                while (it.hasNext()) {
                    ((SpoilerEffect) it.next()).startRipple(i4, ((i2 - this.linkY) - i3) + lineBottom, fSqrt, false);
                }
            }
        } else if (i5 == 1) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((SpoilerEffect) obj).startRipple(i4, i2 - this.descriptionY, fSqrt, false);
            }
        } else if (i5 == 2) {
            int size2 = arrayList2.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList2.get(i8);
                i8++;
                ((SpoilerEffect) obj2).startRipple(i4, i2 - this.description2Y, fSqrt, false);
            }
        }
        for (int i9 = 0; i9 <= 2; i9++) {
            if (i9 != this.spoilerTypePressed) {
                if (i9 == 0) {
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        Layout layout2 = (Layout) arrayList3.get(i10);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        for (SpoilerEffect spoilerEffect : (List) sparseArray.get(i10)) {
                            spoilerEffect.startRipple(spoilerEffect.getBounds().centerX(), spoilerEffect.getBounds().centerY(), fSqrt, false);
                        }
                    }
                } else if (i9 == 1) {
                    int size3 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        SpoilerEffect spoilerEffect2 = (SpoilerEffect) obj3;
                        spoilerEffect2.startRipple(spoilerEffect2.getBounds().centerX(), spoilerEffect2.getBounds().centerY(), fSqrt, false);
                    }
                } else if (i9 == 2) {
                    int size4 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size4) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        SpoilerEffect spoilerEffect3 = (SpoilerEffect) obj4;
                        spoilerEffect3.startRipple(spoilerEffect3.getBounds().centerX(), spoilerEffect3.getBounds().centerY(), fSqrt, false);
                    }
                }
            }
        }
        this.spoilerTypePressed = -1;
        this.spoilerPressed = null;
    }

    public final void gatherRichMessageLinks(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                gatherRichMessageLinks(((TL_iv.pageBlockCover) pageBlock).cover);
                return;
            } else {
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    gatherRichMessageLinks(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
                    return;
                }
                return;
            }
        }
        gatherRichMessageLinks(pageBlock.text);
    }

    public final void gatherRichMessageLinks(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gatherRichMessageLinks((TL_iv.PageBlock) obj);
        }
    }
}
