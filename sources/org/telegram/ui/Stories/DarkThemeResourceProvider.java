package org.telegram.ui.Stories;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import androidx.core.graphics.ColorUtils;
import java.util.HashSet;
import java.util.Objects;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.Theme;
public class DarkThemeResourceProvider implements Theme.ResourcesProvider {
    Paint actionPaint;
    ColorFilter animatedEmojiColorFilter;
    Drawable msgOutMedia;
    HashSet<Integer> debugUnknownKeys = new HashSet<>();
    SparseIntArray sparseIntArray = new SparseIntArray();
    Paint dividerPaint = new Paint();

    public void appendColors() {
    }

    @Override
    public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.applyServiceShaderMatrix(i, i2, f, f2);
    }

    @Override
    public int getColorOrDefault(int i) {
        int color;
        color = getColor(i);
        return color;
    }

    @Override
    public int getCurrentColor(int i) {
        int color;
        color = getColor(i);
        return color;
    }

    @Override
    public boolean hasGradientService() {
        return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
    }

    @Override
    public void setAnimatedColor(int i, int i2) {
        Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i, i2);
    }

    public DarkThemeResourceProvider() {
        this.sparseIntArray.put(Theme.key_dialogIcon, -1);
        this.sparseIntArray.put(Theme.key_text_RedBold, -2406842);
        this.sparseIntArray.put(Theme.key_dialogButton, -10177041);
        this.sparseIntArray.put(Theme.key_chat_gifSaveHintBackground, ColorUtils.blendARGB(-16777216, -1, 0.2f));
        SparseIntArray sparseIntArray = this.sparseIntArray;
        int i = Theme.key_dialogSearchHint;
        sparseIntArray.put(i, ColorUtils.blendARGB(-16777216, -1, 0.5f));
        this.sparseIntArray.put(Theme.key_dialogSearchIcon, ColorUtils.blendARGB(-16777216, -1, 0.5f));
        SparseIntArray sparseIntArray2 = this.sparseIntArray;
        int i2 = Theme.key_dialogSearchBackground;
        sparseIntArray2.put(i2, ColorUtils.setAlphaComponent(-1, 17));
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItem, -1);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItemIcon, -1);
        this.sparseIntArray.put(Theme.key_listSelector, 234881023);
        SparseIntArray sparseIntArray3 = this.sparseIntArray;
        int i3 = Theme.key_dialogButtonSelector;
        sparseIntArray3.put(i3, 436207615);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelTrendingTitle, -1);
        this.sparseIntArray.put(Theme.key_groupcreate_sectionText, -1711276033);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteHintText, ColorUtils.blendARGB(-16777216, -1, 0.5f));
        this.sparseIntArray.put(Theme.key_dialogTextHint, ColorUtils.blendARGB(-16777216, -1, 0.5f));
        this.sparseIntArray.put(Theme.key_sheet_scrollUp, ColorUtils.blendARGB(-16777216, -1, 0.2f));
        this.sparseIntArray.put(Theme.key_dialogTextBlack, -592138);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueIcon, -1);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelStickerSetName, 1946157055);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelStickerSetNameIcon, 1946157055);
        this.sparseIntArray.put(Theme.key_chat_TextSelectionCursor, -1);
        this.sparseIntArray.put(Theme.key_featuredStickers_addedIcon, -1);
        this.sparseIntArray.put(Theme.key_actionBarDefault, -1);
        this.sparseIntArray.put(Theme.key_chat_gifSaveHintText, -1);
        this.sparseIntArray.put(Theme.key_chat_messagePanelSend, -1);
        this.sparseIntArray.put(Theme.key_chat_emojiSearchBackground, ColorUtils.setAlphaComponent(-1, 30));
        this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, -1073741824);
        this.sparseIntArray.put(i, ColorUtils.blendARGB(-16777216, -1, 0.5f));
        this.sparseIntArray.put(i2, ColorUtils.setAlphaComponent(-1, 17));
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteGrayText, ColorUtils.setAlphaComponent(-1, MessagesStorage.LAST_DB_VERSION));
        this.sparseIntArray.put(Theme.key_chat_messagePanelVoiceLockBackground, -14606046);
        this.sparseIntArray.put(Theme.key_chat_messagePanelVoiceLock, -1);
        this.sparseIntArray.put(Theme.key_chat_recordedVoiceDot, -1221292);
        this.sparseIntArray.put(Theme.key_chat_messagePanelVoiceDelete, -1);
        this.sparseIntArray.put(Theme.key_chat_recordedVoiceBackground, -15033089);
        this.sparseIntArray.put(Theme.key_chat_messagePanelVoiceDuration, -1);
        this.sparseIntArray.put(Theme.key_chat_recordTime, 2030043135);
        this.sparseIntArray.put(Theme.key_chat_recordVoiceCancel, -10638868);
        this.sparseIntArray.put(Theme.key_chat_messagePanelCursor, -1);
        this.sparseIntArray.put(Theme.key_chat_messagePanelHint, 1694498815);
        this.sparseIntArray.put(Theme.key_chat_inTextSelectionHighlight, -1515107571);
        this.sparseIntArray.put(Theme.key_chat_messageLinkOut, -5316609);
        this.sparseIntArray.put(Theme.key_chat_messagePanelText, -1);
        SparseIntArray sparseIntArray4 = this.sparseIntArray;
        int i4 = Theme.key_chat_messagePanelIcons;
        sparseIntArray4.put(i4, -1);
        this.sparseIntArray.put(i4, -1);
        this.sparseIntArray.put(Theme.key_chat_messagePanelBackground, ColorUtils.setAlphaComponent(-16777216, 122));
        this.sparseIntArray.put(Theme.key_dialogBackground, -14737633);
        this.sparseIntArray.put(Theme.key_dialog_inlineProgressBackground, -15393241);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhite, -15198183);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlackText, -1);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelEmptyText, -8553090);
        this.sparseIntArray.put(Theme.key_progressCircle, -10177027);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelStickerPackSelector, 181267199);
        this.sparseIntArray.put(Theme.key_chat_emojiSearchIcon, ColorUtils.setAlphaComponent(-1, 125));
        this.sparseIntArray.put(Theme.key_chat_emojiPanelIcon, -2130706433);
        this.sparseIntArray.put(Theme.key_chat_emojiBottomPanelIcon, ColorUtils.setAlphaComponent(-1, 125));
        this.sparseIntArray.put(Theme.key_chat_emojiPanelIconSelected, -1);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelStickerPackSelectorLine, -10177041);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelShadowLine, ColorUtils.setAlphaComponent(-16777216, 30));
        this.sparseIntArray.put(Theme.key_chat_emojiPanelBackspace, ColorUtils.setAlphaComponent(-1, 125));
        SparseIntArray sparseIntArray5 = this.sparseIntArray;
        int i5 = Theme.key_divider;
        sparseIntArray5.put(i5, -16777216);
        this.sparseIntArray.put(Theme.key_dialogFloatingButton, -10177041);
        this.sparseIntArray.put(Theme.key_dialogFloatingIcon, -1);
        this.sparseIntArray.put(Theme.key_graySection, -14079703);
        this.sparseIntArray.put(Theme.key_graySectionText, -8158332);
        this.sparseIntArray.put(Theme.key_windowBackgroundGray, -14737633);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueHeader, -9652488);
        this.sparseIntArray.put(Theme.key_windowBackgroundWhiteGrayText3, ColorUtils.blendARGB(-1, -16777216, 0.3f));
        this.sparseIntArray.put(Theme.key_undo_background, -14605274);
        this.sparseIntArray.put(Theme.key_undo_cancelColor, -7616267);
        this.sparseIntArray.put(Theme.key_undo_infoColor, -1);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuSeparator, -233499371);
        this.sparseIntArray.put(Theme.key_chat_emojiPanelStickerSetNameHighlight, -1);
        this.sparseIntArray.put(Theme.key_switchTrack, -10263709);
        this.sparseIntArray.put(Theme.key_switchTrackChecked, -15033089);
        this.sparseIntArray.put(Theme.key_dialogRoundCheckBox, -10177041);
        this.sparseIntArray.put(Theme.key_dialogTextBlue2, -15033089);
        this.sparseIntArray.put(Theme.key_color_red, -832444);
        this.sparseIntArray.put(Theme.key_checkboxDisabled, -10329502);
        this.sparseIntArray.put(Theme.key_dialogRoundCheckBoxCheck, -1);
        this.sparseIntArray.put(i3, 436207615);
        this.sparseIntArray.put(Theme.key_groupcreate_spanBackground, -13816531);
        this.sparseIntArray.put(Theme.key_groupcreate_spanDelete, -1);
        this.sparseIntArray.put(Theme.key_groupcreate_spanText, -657931);
        this.sparseIntArray.put(Theme.key_avatar_text, -1);
        this.sparseIntArray.put(Theme.key_groupcreate_hintText, -8553091);
        this.sparseIntArray.put(Theme.key_groupcreate_cursor, -10177041);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuBackground, -232841441);
        this.sparseIntArray.put(Theme.key_actionBarDefaultSelector, 385875967);
        this.sparseIntArray.put(Theme.key_fastScrollInactive, -12500671);
        this.sparseIntArray.put(Theme.key_fastScrollActive, -13133079);
        this.sparseIntArray.put(Theme.key_fastScrollText, -1);
        this.sparseIntArray.put(Theme.key_featuredStickers_addButton, -15033089);
        this.sparseIntArray.put(Theme.key_dialogTextLink, -10177041);
        this.sparseIntArray.put(Theme.key_dialogSearchText, -1);
        this.sparseIntArray.put(Theme.key_chat_messageLinkIn, -12147733);
        this.sparseIntArray.put(Theme.key_dialogTextGray2, -8553091);
        this.sparseIntArray.put(Theme.key_sheet_other, 1140850687);
        this.sparseIntArray.put(Theme.key_chat_outBubble, ColorUtils.blendARGB(-16777216, -1, 0.4f));
        this.sparseIntArray.put(Theme.key_chat_outBubbleGradient1, 0);
        this.sparseIntArray.put(Theme.key_chat_outBubbleGradient2, 0);
        this.sparseIntArray.put(Theme.key_chat_outBubbleGradient3, 0);
        this.sparseIntArray.put(Theme.key_chat_textSelectBackground, ColorUtils.blendARGB(-16777216, -1, 0.6f));
        appendColors();
        this.dividerPaint.setColor(getColor(i5));
    }

    @Override
    public int getColor(int i) {
        int indexOfKey = this.sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.sparseIntArray.valueAt(indexOfKey);
        }
        if (!this.debugUnknownKeys.contains(Integer.valueOf(i))) {
            this.debugUnknownKeys.add(Integer.valueOf(i));
        }
        return Theme.getColor(i);
    }

    @Override
    public Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.msgOutMedia == null) {
                this.msgOutMedia = new Theme.MessageDrawable(1, true, false, this);
            }
            return this.msgOutMedia;
        }
        return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
    }

    @Override
    public Paint getPaint(String str) {
        if (str.equals("paintDivider")) {
            return this.dividerPaint;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.actionPaint == null) {
                Paint paint = new Paint(1);
                this.actionPaint = paint;
                paint.setColor(ColorUtils.blendARGB(-16777216, -1, 0.1f));
            }
            return this.actionPaint;
        }
        return Theme.getThemePaint(str);
    }

    @Override
    public ColorFilter getAnimatedEmojiColorFilter() {
        if (this.animatedEmojiColorFilter == null) {
            this.animatedEmojiColorFilter = new PorterDuffColorFilter(getColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN);
        }
        return this.animatedEmojiColorFilter;
    }
}
