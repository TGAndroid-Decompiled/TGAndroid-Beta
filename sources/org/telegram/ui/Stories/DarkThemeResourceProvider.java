package org.telegram.ui.Stories;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;

public class DarkThemeResourceProvider implements Theme.ResourcesProvider {
    public Paint actionPaint;
    public PorterDuffColorFilter animatedEmojiColorFilter;
    public final HashSet debugUnknownKeys = new HashSet();
    public final Paint dividerPaint;
    public MessageDrawable msgOutMedia;
    public final SparseIntArray sparseIntArray;

    public DarkThemeResourceProvider() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.sparseIntArray = sparseIntArray;
        Paint paint = new Paint();
        this.dividerPaint = paint;
        sparseIntArray.put(Theme.key_chat_BlurAlpha, -1308622848);
        sparseIntArray.put(Theme.key_chat_BlurAlphaSlow, -1056964608);
        sparseIntArray.put(Theme.key_statisticChartSignature, -1214008894);
        sparseIntArray.put(Theme.key_statisticChartSignatureAlpha, -1946157057);
        sparseIntArray.put(Theme.key_statisticChartHintLine, 452984831);
        sparseIntArray.put(Theme.key_statisticChartActiveLine, -665229191);
        sparseIntArray.put(Theme.key_statisticChartInactivePickerChart, -667862461);
        sparseIntArray.put(Theme.key_statisticChartActivePickerChart, -665229191);
        sparseIntArray.put(Theme.key_player_actionBarTitle, -1);
        sparseIntArray.put(Theme.key_dialogIcon, -1);
        sparseIntArray.put(Theme.key_text_RedBold, -2406842);
        sparseIntArray.put(Theme.key_dialogButton, -10177041);
        sparseIntArray.put(Theme.key_chat_gifSaveHintBackground, ColorUtils.blendARGB(0.2f, -16777216, -1));
        int i = Theme.key_dialogSearchHint;
        sparseIntArray.put(i, ColorUtils.blendARGB(0.5f, -16777216, -1));
        sparseIntArray.put(Theme.key_dialogSearchIcon, ColorUtils.blendARGB(0.5f, -16777216, -1));
        int i2 = Theme.key_dialogSearchBackground;
        sparseIntArray.put(i2, ColorUtils.setAlphaComponent(-1, 17));
        sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItem, -1);
        sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItemIcon, -1);
        sparseIntArray.put(Theme.key_text_RedRegular, -1152913);
        sparseIntArray.put(Theme.key_listSelector, 385875967);
        int i3 = Theme.key_dialogButtonSelector;
        sparseIntArray.put(i3, 436207615);
        sparseIntArray.put(Theme.key_chat_emojiPanelTrendingTitle, -1);
        sparseIntArray.put(Theme.key_groupcreate_sectionText, -1711276033);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteHintText, ColorUtils.blendARGB(0.5f, -16777216, -1));
        sparseIntArray.put(Theme.key_dialogTextHint, ColorUtils.blendARGB(0.5f, -16777216, -1));
        sparseIntArray.put(Theme.key_sheet_scrollUp, ColorUtils.blendARGB(0.2f, -16777216, -1));
        sparseIntArray.put(Theme.key_dialogTextBlack, -592138);
        sparseIntArray.put(Theme.key_dialogTextGray3, -8553091);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueIcon, -1);
        sparseIntArray.put(Theme.key_chat_emojiPanelStickerSetName, 1946157055);
        sparseIntArray.put(Theme.key_chat_emojiPanelStickerSetNameIcon, 1946157055);
        sparseIntArray.put(Theme.key_chat_TextSelectionCursor, -1);
        sparseIntArray.put(Theme.key_featuredStickers_addedIcon, -1);
        sparseIntArray.put(Theme.key_actionBarDefault, -1);
        sparseIntArray.put(Theme.key_chat_gifSaveHintText, -1);
        sparseIntArray.put(Theme.key_chat_emojiSearchBackground, ColorUtils.setAlphaComponent(-1, 30));
        sparseIntArray.put(Theme.key_chat_emojiPanelBackground, -14670806);
        sparseIntArray.put(Theme.key_actionBarActionModeDefaultIcon, -1);
        sparseIntArray.put(i, ColorUtils.blendARGB(0.5f, -16777216, -1));
        sparseIntArray.put(i2, ColorUtils.setAlphaComponent(-1, 17));
        sparseIntArray.put(Theme.key_windowBackgroundWhiteGrayText, ColorUtils.setAlphaComponent(-1, 127));
        sparseIntArray.put(Theme.key_chat_messagePanelVoiceLockBackground, -14606046);
        sparseIntArray.put(Theme.key_chat_messagePanelVoiceLock, -1);
        sparseIntArray.put(Theme.key_chat_recordedVoiceDot, -1221292);
        sparseIntArray.put(Theme.key_chat_messagePanelVoiceDelete, -1);
        sparseIntArray.put(Theme.key_chat_recordedVoiceBackground, -15033089);
        sparseIntArray.put(Theme.key_chat_messagePanelVoiceDuration, -1);
        sparseIntArray.put(Theme.key_chat_recordTime, 2030043135);
        sparseIntArray.put(Theme.key_chat_recordVoiceCancel, -10638868);
        sparseIntArray.put(Theme.key_chat_messagePanelCursor, -1);
        sparseIntArray.put(Theme.key_chat_messagePanelHint, Theme.multAlpha(0.6f, -1));
        sparseIntArray.put(Theme.key_chat_inTextSelectionHighlight, -1515107571);
        sparseIntArray.put(Theme.key_chat_messageLinkOut, -5316609);
        sparseIntArray.put(Theme.key_chat_messagePanelText, -1);
        sparseIntArray.put(Theme.key_chat_messagePanelIcons, Theme.multAlpha(0.9f, -1));
        sparseIntArray.put(Theme.key_glass_defaultIcon, Theme.multAlpha(0.8f, -1));
        sparseIntArray.put(Theme.key_chat_messagePanelBackground, -14670806);
        sparseIntArray.put(Theme.key_dialogBackground, -14737633);
        sparseIntArray.put(Theme.key_dialogBackgroundGray, -16777216);
        sparseIntArray.put(Theme.key_dialog_inlineProgressBackground, -15393241);
        sparseIntArray.put(Theme.key_windowBackgroundWhite, -15198183);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteBlackText, -1);
        sparseIntArray.put(Theme.key_chat_emojiPanelEmptyText, -8553090);
        sparseIntArray.put(Theme.key_progressCircle, -10177027);
        sparseIntArray.put(Theme.key_chat_emojiPanelStickerPackSelector, 181267199);
        sparseIntArray.put(Theme.key_chat_emojiSearchIcon, ColorUtils.setAlphaComponent(-1, 125));
        sparseIntArray.put(Theme.key_chat_emojiPanelIcon, -2130706433);
        sparseIntArray.put(Theme.key_chat_emojiBottomPanelIcon, ColorUtils.setAlphaComponent(-1, 125));
        sparseIntArray.put(Theme.key_chat_emojiPanelIconSelected, -1);
        sparseIntArray.put(Theme.key_chat_emojiPanelStickerPackSelectorLine, -10177041);
        sparseIntArray.put(Theme.key_chat_emojiPanelShadowLine, ColorUtils.setAlphaComponent(-16777216, 30));
        sparseIntArray.put(Theme.key_chat_emojiPanelBackspace, ColorUtils.setAlphaComponent(-1, 125));
        int i4 = Theme.key_divider;
        sparseIntArray.put(i4, -16777216);
        sparseIntArray.put(Theme.key_chat_editMediaButton, -15033089);
        sparseIntArray.put(Theme.key_dialogFloatingIcon, -1);
        sparseIntArray.put(Theme.key_graySection, -14079703);
        sparseIntArray.put(Theme.key_graySectionText, -8158332);
        sparseIntArray.put(Theme.key_windowBackgroundGray, -16777216);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueHeader, -15033089);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteInputFieldActivated, -10177041);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteInputField, -10177041);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteGrayText3, ColorUtils.blendARGB(0.3f, -1, -16777216));
        sparseIntArray.put(Theme.key_undo_background, -14605274);
        sparseIntArray.put(Theme.key_undo_cancelColor, -7616267);
        sparseIntArray.put(Theme.key_undo_infoColor, -1);
        sparseIntArray.put(Theme.key_actionBarDefaultSubmenuSeparator, -233499371);
        sparseIntArray.put(Theme.key_chat_emojiPanelStickerSetNameHighlight, -1);
        sparseIntArray.put(Theme.key_windowBackgroundWhiteGrayText4, -8355712);
        sparseIntArray.put(Theme.key_voipgroup_nameText, -1);
        sparseIntArray.put(Theme.key_voipgroup_inviteMembersBackground, -14538189);
        sparseIntArray.put(Theme.key_dialogScrollGlow, -14538189);
        sparseIntArray.put(Theme.key_chats_secretName, -9316522);
        sparseIntArray.put(Theme.key_chats_name, -1446156);
        sparseIntArray.put(Theme.key_chat_serviceBackground, -2110438831);
        sparseIntArray.put(Theme.key_switchTrack, -10263709);
        sparseIntArray.put(Theme.key_switchTrackChecked, -15033089);
        sparseIntArray.put(Theme.key_dialogRoundCheckBox, -15033089);
        sparseIntArray.put(Theme.key_dialogRadioBackgroundChecked, -15033089);
        sparseIntArray.put(Theme.key_dialogTextBlue2, -15033089);
        sparseIntArray.put(Theme.key_color_red, -832444);
        sparseIntArray.put(Theme.key_checkbox, -12692893);
        int i5 = Theme.key_checkboxDisabled;
        sparseIntArray.put(i5, -10329502);
        sparseIntArray.put(Theme.key_dialogRoundCheckBoxCheck, -1);
        sparseIntArray.put(i3, 436207615);
        sparseIntArray.put(Theme.key_groupcreate_spanBackground, -13816531);
        sparseIntArray.put(Theme.key_groupcreate_spanDelete, -1);
        sparseIntArray.put(Theme.key_groupcreate_spanText, -657931);
        sparseIntArray.put(Theme.key_avatar_text, -1);
        sparseIntArray.put(Theme.key_groupcreate_hintText, -8553091);
        sparseIntArray.put(Theme.key_groupcreate_cursor, -10177041);
        sparseIntArray.put(Theme.key_actionBarDefaultSubmenuBackground, -232841441);
        sparseIntArray.put(Theme.key_actionBarDefaultSelector, 385875967);
        sparseIntArray.put(Theme.key_fastScrollInactive, -12500671);
        sparseIntArray.put(Theme.key_fastScrollActive, -13133079);
        sparseIntArray.put(Theme.key_fastScrollText, -1);
        sparseIntArray.put(Theme.key_featuredStickers_addButton, -15033089);
        sparseIntArray.put(Theme.key_dialogTextLink, -10177041);
        sparseIntArray.put(Theme.key_dialogSearchText, -1);
        sparseIntArray.put(Theme.key_chat_messageLinkIn, -12147733);
        sparseIntArray.put(Theme.key_dialogTextGray2, -8553091);
        sparseIntArray.put(Theme.key_location_actionIcon, -592138);
        sparseIntArray.put(Theme.key_location_actionBackground, -14737633);
        sparseIntArray.put(Theme.key_location_actionPressedBackground, -12632257);
        sparseIntArray.put(Theme.key_location_actionActiveIcon, -8796932);
        sparseIntArray.put(Theme.key_sheet_other, 1140850687);
        sparseIntArray.put(Theme.key_chat_outBubble, ColorUtils.blendARGB(0.4f, -16777216, -1));
        sparseIntArray.put(Theme.key_chat_outBubbleGradient1, 0);
        sparseIntArray.put(Theme.key_chat_outBubbleGradient2, 0);
        sparseIntArray.put(Theme.key_chat_outBubbleGradient3, 0);
        sparseIntArray.put(Theme.key_chat_textSelectBackground, ColorUtils.setAlphaComponent(-1, 75));
        sparseIntArray.put(Theme.key_radioBackgroundChecked, -10177041);
        sparseIntArray.put(i5, -12237499);
        sparseIntArray.put(Theme.key_checkboxCheck, -1);
        sparseIntArray.put(Theme.key_avatar_backgroundSaved, -10703370);
        sparseIntArray.put(Theme.key_avatar_background2Saved, -12547121);
        sparseIntArray.put(Theme.key_share_icon, -1);
        sparseIntArray.put(Theme.key_share_linkText, -1207959553);
        sparseIntArray.put(Theme.key_share_linkBackground, 352321535);
        sparseIntArray.put(Theme.key_player_time, -8553091);
        sparseIntArray.put(Theme.key_player_progress, -11292689);
        sparseIntArray.put(Theme.key_player_progressBackground, -12829636);
        sparseIntArray.put(Theme.key_player_progressCachedBackground, -11184811);
        sparseIntArray.put(Theme.key_glass_targetMainTopPanel, -15198183);
        appendColors();
        paint.setColor(getColor(i4));
    }

    public void appendColors() {
    }

    @Override
    public final void applyServiceShaderMatrix(float f, float f2, int i, int i2) {
        ArticleViewer.IBlock.CC.$default$applyServiceShaderMatrix(f, f2, i, i2);
    }

    @Override
    public final ColorFilter getAnimatedEmojiColorFilter() {
        if (this.animatedEmojiColorFilter == null) {
            this.animatedEmojiColorFilter = new PorterDuffColorFilter(getColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN);
        }
        return this.animatedEmojiColorFilter;
    }

    @Override
    public final int getColor(int i) {
        SparseIntArray sparseIntArray = this.sparseIntArray;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        Integer numValueOf = Integer.valueOf(i);
        HashSet hashSet = this.debugUnknownKeys;
        if (!hashSet.contains(numValueOf)) {
            hashSet.add(Integer.valueOf(i));
        }
        return Theme.getColor(null, i, false);
    }

    @Override
    public final int getColorOrDefault(int i) {
        return getColor(i);
    }

    @Override
    public final int getCurrentColor(int i) {
        return getColor(i);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (!Objects.equals(str, "drawableMsgOutMedia")) {
            return null;
        }
        if (this.msgOutMedia == null) {
            this.msgOutMedia = new MessageDrawable(1, true, false, this);
        }
        return this.msgOutMedia;
    }

    @Override
    public final Paint getPaint(String str) {
        if (str.equals("paintDivider")) {
            return this.dividerPaint;
        }
        if (!str.equals("paintChatActionBackground")) {
            return Theme.getThemePaint(str);
        }
        if (this.actionPaint == null) {
            Paint paint = new Paint(1);
            this.actionPaint = paint;
            paint.setColor(ColorUtils.blendARGB(0.1f, -16777216, -1));
        }
        return this.actionPaint;
    }

    @Override
    public final boolean hasGradientService() {
        return false;
    }

    @Override
    public final boolean isDark() {
        return Theme.currentTheme.isDark();
    }

    @Override
    public final void setAnimatedColor(int i, int i2) {
    }
}
