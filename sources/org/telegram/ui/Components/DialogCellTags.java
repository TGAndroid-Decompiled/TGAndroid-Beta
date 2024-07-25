package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.Theme;
public class DialogCellTags {
    private final ArrayList<MessagesController.DialogFilter> filters = new ArrayList<>();
    private final ArrayList<Tag> tags = new ArrayList<>();
    private Tag moreTags = null;

    public static class Tag {
        int color;
        public int colorId;
        public int filterId;
        StaticLayout layout;
        int left;
        private int textHeight;
        int width;

        private Tag() {
        }

        public static Tag asMore(int i) {
            Tag tag = new Tag();
            tag.filterId = i;
            StaticLayout staticLayout = new StaticLayout("+" + i, Theme.dialogs_tagTextPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 0.0f, 1.0f, false);
            tag.layout = staticLayout;
            tag.left = (int) (staticLayout.getLineCount() >= 1 ? tag.layout.getLineLeft(0) : 0.0f);
            tag.width = AndroidUtilities.dp(9.32f) + ((int) (tag.layout.getLineCount() >= 1 ? tag.layout.getLineWidth(0) : 0.0f));
            tag.textHeight = tag.layout.getHeight();
            tag.color = Theme.getColor(Theme.key_avatar_nameInMessageBlue);
            return tag;
        }

        public static Tag fromFilter(int i, MessagesController.DialogFilter dialogFilter) {
            Tag tag = new Tag();
            tag.filterId = dialogFilter.id;
            tag.colorId = dialogFilter.color;
            String str = dialogFilter.name;
            if (str == null) {
                str = "";
            }
            StaticLayout staticLayout = new StaticLayout(Emoji.replaceEmoji(str.toUpperCase(), Theme.dialogs_tagTextPaint.getFontMetricsInt(), false), Theme.dialogs_tagTextPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 0.0f, 1.0f, false);
            tag.layout = staticLayout;
            tag.left = (int) (staticLayout.getLineCount() >= 1 ? tag.layout.getLineLeft(0) : 0.0f);
            tag.width = AndroidUtilities.dp(9.32f) + ((int) (tag.layout.getLineCount() >= 1 ? tag.layout.getLineWidth(0) : 0.0f));
            tag.textHeight = tag.layout.getHeight();
            int[] iArr = Theme.keys_avatar_nameInMessage;
            tag.color = Theme.getColor(iArr[dialogFilter.color % iArr.length]);
            return tag;
        }

        public void draw(Canvas canvas) {
            Theme.dialogs_tagPaint.setColor(Theme.multAlpha(this.color, Theme.isCurrentThemeDark() ? 0.2f : 0.1f));
            Theme.dialogs_tagTextPaint.setColor(this.color);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.width, AndroidUtilities.dp(14.66f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.dialogs_tagPaint);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(4.66f) - this.left, (AndroidUtilities.dp(14.66f) - this.textHeight) / 2.0f);
            this.layout.draw(canvas);
            canvas.restore();
        }
    }

    public boolean update(int i, int i2, long j) {
        MessagesController.DialogFilter dialogFilter;
        Tag tag;
        MessagesController.DialogFilter dialogFilter2;
        String str;
        AccountInstance accountInstance = AccountInstance.getInstance(i);
        MessagesController messagesController = MessagesController.getInstance(i);
        if (!messagesController.folderTags || !accountInstance.getUserConfig().isPremium()) {
            boolean isEmpty = this.tags.isEmpty();
            this.tags.clear();
            return !isEmpty;
        }
        ArrayList<MessagesController.DialogFilter> arrayList = messagesController.dialogFilters;
        if (i2 == 7) {
            dialogFilter = messagesController.selectedDialogFilter[0];
        } else {
            dialogFilter = i2 == 8 ? messagesController.selectedDialogFilter[1] : null;
        }
        this.filters.clear();
        if (i2 == 0 || i2 == 7 || i2 == 8) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                MessagesController.DialogFilter dialogFilter3 = arrayList.get(i3);
                if (dialogFilter3 != null && dialogFilter3 != dialogFilter && dialogFilter3.color >= 0 && dialogFilter3.includesDialog(accountInstance, j)) {
                    this.filters.add(dialogFilter3);
                }
            }
        }
        int i4 = 0;
        boolean z = false;
        while (i4 < this.tags.size()) {
            Tag tag2 = this.tags.get(i4);
            int i5 = 0;
            while (true) {
                if (i5 >= this.filters.size()) {
                    dialogFilter2 = null;
                    break;
                } else if (this.filters.get(i5).id == tag2.filterId) {
                    dialogFilter2 = this.filters.get(i5);
                    break;
                } else {
                    i5++;
                }
            }
            if (dialogFilter2 == null) {
                this.tags.remove(i4);
                i4--;
            } else {
                if (dialogFilter2.color != tag2.colorId || ((str = dialogFilter2.name) != null && tag2.layout != null && str.length() != tag2.layout.getText().length())) {
                    this.tags.set(i4, Tag.fromFilter(i, dialogFilter2));
                }
                i4++;
            }
            z = true;
            i4++;
        }
        for (int i6 = 0; i6 < this.filters.size(); i6++) {
            MessagesController.DialogFilter dialogFilter4 = this.filters.get(i6);
            int i7 = 0;
            while (true) {
                if (i7 >= this.tags.size()) {
                    tag = null;
                    break;
                } else if (this.tags.get(i7).filterId == dialogFilter4.id) {
                    tag = this.tags.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            if (tag == null) {
                this.tags.add(i6, Tag.fromFilter(i, dialogFilter4));
                z = true;
            }
        }
        this.filters.clear();
        return z;
    }

    public boolean isEmpty() {
        return this.tags.isEmpty();
    }

    public void draw(Canvas canvas, int i) {
        int i2 = 0;
        canvas.clipRect(0, 0, i, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f = i;
        rectF.set(0.0f, 0.0f, f, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f, 0.0f);
        }
        int dp = i - AndroidUtilities.dp(25.0f);
        while (i2 < this.tags.size()) {
            Tag tag = this.tags.get(i2);
            dp -= tag.width + AndroidUtilities.dp(4.0f);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-tag.width, 0.0f);
                tag.draw(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                tag.draw(canvas);
                canvas.translate(tag.width + AndroidUtilities.dp(4.0f), 0.0f);
            }
            i2++;
        }
        if (i2 < this.tags.size()) {
            int size = this.tags.size() - i2;
            Tag tag2 = this.moreTags;
            if (tag2 == null || tag2.filterId != size) {
                this.moreTags = Tag.asMore(size);
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.moreTags.width, 0.0f);
                this.moreTags.draw(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.moreTags.draw(canvas);
                canvas.translate(this.moreTags.width + AndroidUtilities.dp(4.0f), 0.0f);
            }
        }
        canvas.restore();
    }
}
