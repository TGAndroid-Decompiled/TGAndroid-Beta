package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class SuggestionOffer {
    public int height;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList rows = new ArrayList(2);
    public int rowsInfoX;
    public int rowsTitleX;
    public StaticLayout title;
    public int titleX;
    public int width;

    public final class Row {
        public final Text info;
        public final Text title;

        public Row(Text text, Text text2) {
            this.title = text;
            this.info = text2;
        }
    }

    public SuggestionOffer(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public static void updateBuildTitleStep(StringBuilder sb, int i, boolean z) {
        if (sb.length() > 0) {
            if (z) {
                sb.append(' ');
                sb.append(LocaleController.getString(R.string.SuggestionOfferInfoTitleEditedAnd));
                sb.append(' ');
            } else {
                sb.append(", ");
            }
        }
        sb.append(LocaleController.getString(i));
    }

    public final int getHeight() {
        return this.height;
    }

    public final void update(MessageObject messageObject) {
        char c;
        int i;
        float f;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost = (messageObject == null || (message = messageObject.messageOwner) == null) ? null : message.suggested_post;
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams messageSuggestionParamsOf = MessageSuggestionParams.of(suggestedPost);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionText3") : null;
        if (paint == null) {
            paint = Theme.getThemePaint("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) paint;
        this.height = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.rows;
        arrayList.clear();
        AmountUtils$Amount amountUtils$Amount = messageSuggestionParamsOf.amount;
        if (amountUtils$Amount != null && !amountUtils$Amount.isZero()) {
            arrayList.add(new Row(new Text(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new Text(LocaleController.bold(messageSuggestionParamsOf.amount.formatAsDecimalSpaced()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new Row(new Text(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new Text(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Row row = (Row) obj;
            fMax = Math.max(fMax, row.title.getWidth());
            fMax2 = Math.max(fMax2, row.info.getWidth());
            int height = row.title.layout.getHeight() + this.height;
            this.height = height;
            this.height = AndroidUtilities.dp(7.0f) + height;
        }
        int iDp = (int) (fMax2 + fMax + AndroidUtilities.dp(11.0f));
        int iMax = Math.max(iDp, AndroidUtilities.dp(160.0f));
        String name = DialogObject.getName(messageObject.getFromChatId());
        int editedSuggestionFlags = messageObject.getEditedSuggestionFlags();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (editedSuggestionFlags == 0) {
            if (messageObject.isOutOwner()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SuggestionOfferInfoTitleYou));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.SuggestionOfferInfoTitle, name));
            }
            f = 11.0f;
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            if (messageObject2 != null) {
                DialogObject.getName(messageObject2.getFromChatId());
            }
            StringBuilder sb = new StringBuilder();
            int i3 = editedSuggestionFlags & 4;
            int i4 = editedSuggestionFlags & 2;
            int i5 = editedSuggestionFlags & 8;
            int i6 = editedSuggestionFlags & 1;
            int i7 = (i3 != 0 ? 1 : 0) + (i4 != 0 ? 1 : 0) + (i5 != 0 ? 1 : 0) + (i6 != 0 ? 1 : 0);
            if (i6 != 0) {
                c = 0;
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedPrice, i7 == 1);
                i = 1;
            } else {
                c = 0;
                i = 0;
            }
            if (i4 != 0) {
                i++;
                f = 11.0f;
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedTime, i7 == i);
            } else {
                f = 11.0f;
            }
            if (i3 != 0) {
                i++;
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedText, i7 == i);
            }
            if (i5 != 0) {
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedMedia, i7 == i + 1);
            }
            if (messageObject.isOutOwner()) {
                int i8 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c] = sb;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i8, objArr));
            } else {
                int i9 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c] = name;
                objArr2[1] = sb;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i9, objArr2));
            }
        }
        this.title = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, iMax, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int iMax2 = 0;
        for (int i10 = 0; i10 < this.title.getLineCount(); i10++) {
            iMax2 = (int) Math.max(iMax2, this.title.getLineWidth(i10));
        }
        int height2 = this.title.getHeight() + this.height;
        this.height = height2;
        this.height = AndroidUtilities.dp(5.0f) + height2;
        int iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 24.0f, Math.max(iDp, iMax2));
        this.width = iM;
        this.titleX = (iM - iMax) / 2;
        int i11 = (iM - iDp) / 2;
        this.rowsTitleX = i11;
        this.rowsInfoX = (int) (AndroidUtilities.dp(f) + i11 + fMax);
    }
}
