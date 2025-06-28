package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class SuggestionOffer {
    public int height;
    private final Theme.ResourcesProvider resourcesProvider;
    public ArrayList rows = new ArrayList(2);
    private int rowsInfoX;
    private int rowsTitleX;
    public StaticLayout title;
    private int titleX;
    public int width;

    public static class Row {
        public final Text info;
        public final Text title;

        public Row(Text text, Text text2) {
            this.title = text;
            this.info = text2;
        }

        public int getHeight() {
            return (int) this.title.getHeight();
        }
    }

    public SuggestionOffer(int i, View view, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    private void updateBuildTitleStep(StringBuilder sb, int i, boolean z) {
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

    public void draw(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        int i2 = (i - this.width) / 2;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i2, 0.0f, r11 + i2, this.height);
        canvas.save();
        canvas.translate(f / 2.0f, f2);
        Paint themePaint = Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider);
        int alpha = themePaint.getAlpha();
        themePaint.setAlpha((int) (alpha * f4 * f3));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), themePaint);
        themePaint.setAlpha(alpha);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
            Paint themePaint2 = Theme.getThemePaint("paintChatActionBackgroundDarken", this.resourcesProvider);
            int alpha2 = themePaint2.getAlpha();
            themePaint2.setAlpha((int) (alpha2 * f4 * f3));
            canvas.drawRect(rectF, themePaint2);
            themePaint2.setAlpha(alpha2);
        }
        int dp = AndroidUtilities.dp(14.0f);
        if (this.title != null) {
            canvas.save();
            canvas.translate(this.titleX + i2, dp);
            this.title.draw(canvas);
            canvas.restore();
            dp += this.title.getHeight() + AndroidUtilities.dp(12.0f);
        }
        Iterator it = this.rows.iterator();
        while (it.hasNext()) {
            Row row = (Row) it.next();
            float f5 = dp;
            row.title.draw(canvas, this.rowsTitleX + i2, (row.getHeight() / 2.0f) + f5, 0.85f);
            row.info.draw(canvas, this.rowsInfoX + i2, f5 + (row.getHeight() / 2.0f));
            dp += row.getHeight() + AndroidUtilities.dp(7.0f);
        }
        canvas.restore();
    }

    public int getHeight() {
        return this.height;
    }

    protected Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public int getWidth() {
        return this.width;
    }

    public void update(MessageObject messageObject) {
        int i;
        String formatString;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost = (messageObject == null || (message = messageObject.messageOwner) == null) ? null : message.suggested_post;
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams of = MessageSuggestionParams.of(suggestedPost);
        TextPaint textPaint = (TextPaint) getThemedPaint("paintChatActionText3");
        this.height = AndroidUtilities.dp(14.0f) * 2;
        this.rows.clear();
        AmountUtils$Amount amountUtils$Amount = of.amount;
        if (amountUtils$Amount != null && !amountUtils$Amount.isZero()) {
            this.rows.add(new Row(new Text(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new Text(LocaleController.bold(of.amount.formatAsDecimalSpaced()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            this.rows.add(new Row(new Text(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new Text(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        Iterator it = this.rows.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        while (it.hasNext()) {
            Row row = (Row) it.next();
            f = Math.max(f, row.title.getWidth());
            f2 = Math.max(f2, row.info.getWidth());
            int height = this.height + row.getHeight();
            this.height = height;
            this.height = height + AndroidUtilities.dp(7.0f);
        }
        int dp = (int) (f2 + f + AndroidUtilities.dp(11.0f));
        int max = Math.max(dp, AndroidUtilities.dp(160.0f));
        String formatString2 = messageObject.isOutOwner() ? LocaleController.formatString(R.string.ChatYourSelfName, new Object[0]) : DialogObject.getName(messageObject.getFromChatId());
        long savedDialogId = messageObject.getSavedDialogId();
        if (savedDialogId == UserConfig.getInstance(messageObject.currentAccount).getClientUserId()) {
            LocaleController.formatString(R.string.ChatYourSelfName, new Object[0]);
        } else {
            DialogObject.getName(savedDialogId);
        }
        int editedSuggestionFlags = messageObject.getEditedSuggestionFlags();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (editedSuggestionFlags == 0) {
            formatString = LocaleController.formatString(R.string.SuggestionOfferInfoTitle, formatString2);
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            String formatString3 = messageObject2 != null ? messageObject2.isOutOwner() ? LocaleController.formatString(R.string.ChatYourSelfName, new Object[0]) : DialogObject.getName(messageObject.replyMessageObject.getFromChatId()) : "";
            StringBuilder sb = new StringBuilder();
            int i2 = editedSuggestionFlags & 4;
            int i3 = editedSuggestionFlags & 2;
            int i4 = editedSuggestionFlags & 8;
            int i5 = editedSuggestionFlags & 1;
            int i6 = (i2 != 0 ? 1 : 0) + (i3 != 0 ? 1 : 0) + (i4 != 0 ? 1 : 0) + (i5 != 0 ? 1 : 0);
            if (i5 != 0) {
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedPrice, i6 == 1);
                i = 1;
            } else {
                i = 0;
            }
            if (i3 != 0) {
                i++;
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedTime, i6 == i);
            }
            if (i2 != 0) {
                i++;
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedText, i6 == i);
            }
            if (i4 != 0) {
                updateBuildTitleStep(sb, R.string.SuggestionOfferInfoTitleEditedMedia, i6 == i + 1);
            }
            formatString = LocaleController.formatString(R.string.SuggestionOfferInfoTitleEditedX, formatString2, formatString3, sb);
        }
        spannableStringBuilder.append((CharSequence) formatString);
        this.title = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i7 = 0;
        for (int i8 = 0; i8 < this.title.getLineCount(); i8++) {
            i7 = (int) Math.max(i7, this.title.getLineWidth(i8));
        }
        int height2 = this.height + this.title.getHeight();
        this.height = height2;
        this.height = height2 + AndroidUtilities.dp(5.0f);
        int max2 = Math.max(dp, i7) + (AndroidUtilities.dp(24.0f) * 2);
        this.width = max2;
        this.titleX = (max2 - max) / 2;
        this.rowsTitleX = (max2 - dp) / 2;
        this.rowsInfoX = (int) (r1 + AndroidUtilities.dp(11.0f) + f);
    }
}
