package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;

public final class DialogCellTags {
    public final DialogCell parentView;
    public final ArrayList filters = new ArrayList();
    public final ArrayList tags = new ArrayList();
    public Tag moreTags = null;

    public final class Tag {
        public int color;
        public int colorId;
        public int filterId;
        public Text text;
        public int width;

        public static Tag fromFilter(DialogCell dialogCell, MessagesController.DialogFilter dialogFilter) {
            Tag tag = new Tag();
            tag.filterId = dialogFilter.id;
            tag.colorId = dialogFilter.color;
            String str = dialogFilter.name;
            if (str == null) {
                str = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
            Text text = new Text(spannableStringBuilder, 10.0f, AndroidUtilities.bold());
            text.supportAnimatedEmojis(dialogCell);
            tag.text = text;
            tag.text.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, text.paint.getFontMetricsInt(), false), dialogFilter.entities, tag.text.paint.getFontMetricsInt()));
            Text text2 = tag.text;
            if (text2.animatedEmojisCacheType != 26) {
                text2.animatedEmojisCacheType = 26;
                if (text2.drawAnimatedEmojis) {
                    AnimatedEmojiSpan.release(text2.parentView, text2.animatedEmojis);
                    text2.animatedEmojis = AnimatedEmojiSpan.update(text2.animatedEmojisCacheType, text2.parentView, text2.animatedEmojis, text2.layout);
                }
            }
            int iDp = AndroidUtilities.dp(9.32f);
            Text text3 = tag.text;
            tag.width = iDp + ((int) text3.width);
            text3.layout.getHeight();
            int[] iArr = Theme.keys_avatar_nameInMessage;
            tag.color = Theme.getColor(null, iArr[dialogFilter.color % iArr.length], false);
            return tag;
        }

        public final void draw(Canvas canvas) {
            Theme.dialogs_tagPaint.setColor(Theme.multAlpha(Theme.currentTheme.isDark() ? 0.2f : 0.1f, this.color));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.width, AndroidUtilities.dp(14.66f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.dialogs_tagPaint);
            this.text.draw(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(14.66f) / 2.0f, 1.0f, this.color, canvas);
        }
    }

    public DialogCellTags(DialogCell dialogCell) {
        this.parentView = dialogCell;
    }

    public final void draw(Canvas canvas, int i) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f = i;
        rectF.set(0.0f, 0.0f, f, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f, 0.0f);
        }
        int iDp = i - AndroidUtilities.dp(25.0f);
        int i2 = 0;
        while (true) {
            arrayList = this.tags;
            if (i2 >= arrayList.size()) {
                break;
            }
            Tag tag = (Tag) arrayList.get(i2);
            iDp = OKLCH.m$1(4.0f, tag.width, iDp);
            if (iDp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-tag.width, 0.0f);
                tag.draw(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                tag.draw(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + tag.width, 0.0f);
            }
            i2++;
        }
        if (i2 < arrayList.size()) {
            int size = arrayList.size() - i2;
            Tag tag2 = this.moreTags;
            if (tag2 == null || tag2.filterId != size) {
                Tag tag3 = new Tag();
                tag3.filterId = size;
                Text text = new Text(DiffUtil.m(size, "+"), 10.0f, AndroidUtilities.bold());
                text.supportAnimatedEmojis(this.parentView);
                tag3.text = text;
                int iDp2 = AndroidUtilities.dp(9.32f);
                Text text2 = tag3.text;
                tag3.width = iDp2 + ((int) text2.width);
                text2.layout.getHeight();
                tag3.color = Theme.getColor(null, Theme.key_avatar_nameInMessageBlue, false);
                this.moreTags = tag3;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.moreTags.width, 0.0f);
                this.moreTags.draw(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.moreTags.draw(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.moreTags.width, 0.0f);
            }
        }
        canvas.restore();
    }
}
