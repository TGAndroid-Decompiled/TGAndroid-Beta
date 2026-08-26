package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FilledTabsView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftPatterns;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.MHTML;

public class PeerColorActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int PAGE_NAME = 1;
    public static final int PAGE_PROFILE = 0;
    private FrameLayout actionBarContainer;
    private boolean applying;
    private boolean applyingName;
    private boolean applyingProfile;
    private ImageView backButton;
    private BaseFragment bulletinFragment;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private ColoredActionBar colorBar;
    private FrameLayout contentView;
    private final SparseIntArray currentColors;
    private ImageView dayNightItem;
    private final long dialogId;
    private boolean forceDark;
    private final StarsController.GiftsList gifts;
    private final StarsController.GiftsList giftsWithPeerColor;
    private final boolean isChannel;
    private boolean isDark;
    public boolean loading;
    private final MessageDrawable msgInDrawable;
    private final MessageDrawable msgInDrawableSelected;
    public Page namePage;
    private Theme.ResourcesProvider parentResourcesProvider;
    public Page profilePage;
    private boolean startAtProfile;
    private RLottieDrawable sunDrawable;
    private FilledTabsView tabsView;
    private SimpleTextView titleView;
    private ViewPagerFixed viewPager;

    public static class ChangeNameColorCell extends View {
        private final Text buttonText;
        private PeerColorDrawable color1Drawable;
        private PeerColorDrawable color2Drawable;
        private final int currentAccount;
        private final Drawable drawable;
        private final boolean isChannelOrGroup;
        private final boolean isGroup;
        private LevelLock lock;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private Text userText;
        private final Paint userTextBackgroundPaint;
        private int userTextColorKey;

        public ChangeNameColorCell(int i, long j, Context context, Theme.ResourcesProvider resourcesProvider) {
            int i2;
            int iMin;
            int iMax;
            super(context);
            this.userTextBackgroundPaint = new Paint(1);
            this.userTextColorKey = -1;
            MessagesController messagesController = MessagesController.getInstance(i);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
            this.currentAccount = i;
            boolean z = j < 0;
            this.isChannelOrGroup = z;
            boolean z2 = z && !ChatObject.isChannelAndNotMegaGroup(chat);
            this.isGroup = z2;
            this.resourcesProvider = resourcesProvider;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
            this.drawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider), PorterDuff.Mode.SRC_IN));
            if (z) {
                i2 = z2 ? R.string.ChangeGroupAppearance : R.string.ChangeChannelNameColor2;
            } else {
                i2 = R.string.ChangeUserNameColor;
            }
            String string = LocaleController.getString(i2);
            if (z && !z2 && MessagesController.getInstance(i).getMainSettings().getInt("boostingappearance", 0) < 3) {
                MessagesController.PeerColors peerColors = messagesController.peerColors;
                if (peerColors != null) {
                    int iMin2 = Math.min(Integer.MAX_VALUE, peerColors.maxLevel());
                    int iMax2 = Math.max(0, messagesController.peerColors.maxLevel());
                    iMin = Math.min(iMin2, messagesController.peerColors.minLevel());
                    iMax = Math.max(iMax2, messagesController.peerColors.minLevel());
                } else {
                    iMin = Integer.MAX_VALUE;
                    iMax = 0;
                }
                int iMin3 = Math.min(iMin, messagesController.channelBgIconLevelMin);
                int iMin4 = Math.min(iMax, messagesController.channelBgIconLevelMin);
                MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
                if (peerColors2 != null) {
                    int iMin5 = Math.min(iMin3, peerColors2.maxLevel());
                    int iMax3 = Math.max(iMin4, messagesController.profilePeerColors.maxLevel());
                    iMin3 = Math.min(iMin5, messagesController.profilePeerColors.minLevel());
                    iMin4 = Math.max(iMax3, messagesController.profilePeerColors.minLevel());
                }
                int iMin6 = Math.min(iMin3, messagesController.channelProfileIconLevelMin);
                int iMax4 = Math.max(iMin4, messagesController.channelProfileIconLevelMin);
                int iMin7 = Math.min(iMin6, messagesController.channelEmojiStatusLevelMin);
                int iMax5 = Math.max(iMax4, messagesController.channelEmojiStatusLevelMin);
                int iMin8 = Math.min(iMin7, messagesController.channelWallpaperLevelMin);
                int iMax6 = Math.max(iMax5, messagesController.channelWallpaperLevelMin);
                int iMin9 = Math.min(iMin8, messagesController.channelCustomWallpaperLevelMin);
                int iMax7 = Math.max(iMax6, messagesController.channelCustomWallpaperLevelMin);
                int i3 = chat != null ? chat.level : 0;
                if (i3 < iMax7) {
                    this.lock = new LevelLock(context, true, Math.max(i3, iMin9), resourcesProvider);
                }
            }
            setContentDescription(string);
            this.buttonText = new Text(string, 16.0f);
            updateColors();
        }

        private int rtl(int i) {
            return LocaleController.isRTL ? getMeasuredWidth() - i : i;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            int iDp;
            int iDp2;
            DrawableUtils.setBounds(this.drawable, rtl(AndroidUtilities.dp(28.0f)), getMeasuredHeight() / 2.0f, 17);
            this.drawable.draw(canvas);
            Text text = this.buttonText;
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
            LevelLock levelLock = this.lock;
            if (levelLock != null) {
                iDp = AndroidUtilities.dp(8.0f) + levelLock.getIntrinsicWidth();
            } else {
                iDp = 0;
            }
            text.ellipsize(measuredWidth - iDp);
            float measuredWidth2 = LocaleController.isRTL ? (getMeasuredWidth() - this.buttonText.getWidth()) - AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(58.0f);
            this.buttonText.draw(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
            if (this.lock != null) {
                int width = (int) (this.buttonText.getWidth() + measuredWidth2 + AndroidUtilities.dp(6.0f));
                this.lock.setBounds(width, 0, width, getHeight());
                this.lock.draw(canvas);
            }
            boolean z = this.isGroup;
            if (z && this.color2Drawable != null) {
                int iDp3 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
                this.color2Drawable.setBounds(iDp3 - AndroidUtilities.dp(11.0f), OKLCH.m$2(11.0f, getMeasuredHeight(), 2), iDp3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
                this.color2Drawable.stroke(AndroidUtilities.dpf2(3.0f), Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.color2Drawable.draw(canvas);
            } else if (this.color1Drawable != null && this.color2Drawable != null) {
                int iDp4 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
                this.color2Drawable.setBounds(iDp4 - AndroidUtilities.dp(11.0f), OKLCH.m$2(11.0f, getMeasuredHeight(), 2), iDp4, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
                PeerColorDrawable peerColorDrawable = this.color2Drawable;
                float fDpf2 = AndroidUtilities.dpf2(3.0f);
                int i = Theme.key_windowBackgroundWhite;
                peerColorDrawable.stroke(fDpf2, Theme.getColor(i, this.resourcesProvider));
                this.color2Drawable.draw(canvas);
                int iDp5 = iDp4 - AndroidUtilities.dp(18.0f);
                this.color1Drawable.setBounds(iDp5 - AndroidUtilities.dp(11.0f), OKLCH.m$2(11.0f, getMeasuredHeight(), 2), iDp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
                this.color1Drawable.stroke(AndroidUtilities.dpf2(3.0f), Theme.getColor(i, this.resourcesProvider));
                this.color1Drawable.draw(canvas);
            } else if (this.userText != null && !z) {
                float measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
                float width2 = this.buttonText.getWidth();
                LevelLock levelLock2 = this.lock;
                if (levelLock2 == null) {
                    iDp2 = 0;
                } else {
                    iDp2 = AndroidUtilities.dp(12.0f) + levelLock2.getIntrinsicWidth();
                }
                float fMin = (int) (measuredWidth3 - Math.min(width2 + iDp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
                int iMin = (int) Math.min(this.userText.getWidth(), fMin);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : RichMessageLayout$$ExternalSyntheticOutline1.m(33.0f, getMeasuredWidth(), iMin), (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + iMin : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.userTextBackgroundPaint);
                this.userText.ellipsize(fMin).draw(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : RichMessageLayout$$ExternalSyntheticOutline1.m(24.0f, getMeasuredWidth(), iMin), getMeasuredHeight() / 2.0f);
            }
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
                if (paint == null) {
                    paint = Theme.dividerPaint;
                }
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : 0), getMeasuredHeight() - 1, paint);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void set(TLRPC.Chat chat, boolean z) {
            int color;
            ArrayList<Integer> arrayList;
            if (chat == null) {
                return;
            }
            this.needDivider = z;
            this.userText = new Text(Emoji.replaceEmoji(chat.title, Theme.chat_msgTextPaint.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            PeerColorDrawable peerColorDrawable = this.color1Drawable;
            if (peerColorDrawable != null) {
                peerColorDrawable.setView(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                this.color1Drawable = PeerColorDrawable.from((TLRPC.TL_emojiStatusCollectible) emojiStatus);
            } else {
                this.color1Drawable = ChatObject.getProfileColorId(chat) >= 0 ? PeerColorDrawable.fromProfile(this.currentAccount, ChatObject.getProfileColorId(chat)).setRadius(AndroidUtilities.dp(11.0f)) : null;
            }
            PeerColorDrawable peerColorDrawable2 = this.color1Drawable;
            if (peerColorDrawable2 != null) {
                peerColorDrawable2.setView(this);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                int i = (!zIsDark || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!zIsDark || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int iIntValue = arrayList.get(0).intValue() | (-16777216);
                int iIntValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue;
                int iIntValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue;
                this.userText.setColor(i);
                this.userTextBackgroundPaint.setColor(Theme.multAlpha(0.1f, i));
                PeerColorDrawable radius = new PeerColorDrawable(iIntValue, iIntValue2, iIntValue3, tL_peerColorCollectible.gift_emoji_id).setRadius(AndroidUtilities.dp(11.0f));
                this.color2Drawable = radius;
                radius.setView(this);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i2 = Theme.keys_avatar_nameInMessage[colorId];
                this.userTextColorKey = i2;
                color = Theme.getColor(i2, this.resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color2 = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color2 != null) {
                    this.userTextColorKey = -1;
                    color = color2.getColor1();
                } else {
                    int i3 = Theme.keys_avatar_nameInMessage[0];
                    this.userTextColorKey = i3;
                    color = Theme.getColor(i3, this.resourcesProvider);
                }
            }
            this.userText.setColor(color);
            this.userTextBackgroundPaint.setColor(Theme.multAlpha(0.1f, color));
            PeerColorDrawable radius2 = PeerColorDrawable.from(this.currentAccount, colorId).setRadius(AndroidUtilities.dp(11.0f));
            this.color2Drawable = radius2;
            if (radius2 != null) {
                radius2.setView(this);
            }
        }

        public void updateColors() {
            int i;
            this.drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.isChannelOrGroup ? Theme.key_windowBackgroundWhiteGrayIcon : Theme.key_windowBackgroundWhiteBlueText4, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.buttonText.setColor(Theme.getColor(this.isChannelOrGroup ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteBlueText4, this.resourcesProvider));
            if (this.userText == null || this.userTextBackgroundPaint == null || (i = this.userTextColorKey) == -1) {
                return;
            }
            int color = Theme.getColor(i, this.resourcesProvider);
            this.userText.setColor(color);
            this.userTextBackgroundPaint.setColor(Theme.multAlpha(0.1f, color));
        }

        private float rtl(float f) {
            return LocaleController.isRTL ? getMeasuredWidth() - f : f;
        }

        public void set(TLRPC.User user) {
            int color;
            ArrayList<Integer> arrayList;
            if (user == null) {
                return;
            }
            String str = user.first_name;
            String strTrim = str == null ? "" : str.trim();
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            this.userText = new Text(Emoji.replaceEmoji(strTrim, Theme.chat_msgTextPaint.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            PeerColorDrawable peerColorDrawable = this.color1Drawable;
            if (peerColorDrawable != null) {
                peerColorDrawable.setView(null);
            }
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                this.color1Drawable = PeerColorDrawable.from((TLRPC.TL_emojiStatusCollectible) emojiStatus);
            } else {
                this.color1Drawable = UserObject.getProfileColorId(user) >= 0 ? PeerColorDrawable.fromProfile(this.currentAccount, UserObject.getProfileColorId(user)).setRadius(AndroidUtilities.dp(11.0f)) : null;
            }
            PeerColorDrawable peerColorDrawable2 = this.color1Drawable;
            if (peerColorDrawable2 != null) {
                peerColorDrawable2.setView(this);
            }
            TLRPC.PeerColor peerColor = user.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                int i = (!zIsDark || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!zIsDark || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int iIntValue = arrayList.get(0).intValue() | (-16777216);
                int iIntValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue;
                int iIntValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue;
                this.userText.setColor(i);
                this.userTextBackgroundPaint.setColor(Theme.multAlpha(0.1f, i));
                PeerColorDrawable radius = new PeerColorDrawable(iIntValue, iIntValue2, iIntValue3, tL_peerColorCollectible.gift_emoji_id).setRadius(AndroidUtilities.dp(11.0f));
                this.color2Drawable = radius;
                radius.setView(this);
                return;
            }
            int colorId = UserObject.getColorId(user);
            if (colorId < 7) {
                int i2 = Theme.keys_avatar_nameInMessage[colorId];
                this.userTextColorKey = i2;
                color = Theme.getColor(i2, this.resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color2 = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color2 != null) {
                    this.userTextColorKey = -1;
                    color = color2.getColor1();
                } else {
                    int i3 = Theme.keys_avatar_nameInMessage[0];
                    this.userTextColorKey = i3;
                    color = Theme.getColor(i3, this.resourcesProvider);
                }
            }
            this.userText.setColor(color);
            this.userTextBackgroundPaint.setColor(Theme.multAlpha(0.1f, color));
            this.color2Drawable = PeerColorDrawable.from(this.currentAccount, colorId).setRadius(AndroidUtilities.dp(11.0f));
        }
    }

    public static class LevelLock extends Drawable {
        private final PremiumGradient.PremiumGradientTools gradientTools;
        private final Drawable lock;
        private final float lockScale;
        private final Theme.ResourcesProvider resourcesProvider;
        private final Text text;

        public LevelLock(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            this(context, false, i, resourcesProvider);
        }

        @Override
        public void draw(Canvas canvas) {
            int i = getBounds().left;
            int iCenterY = getBounds().centerY();
            RectF rectF = AndroidUtilities.rectTmp;
            float f = iCenterY;
            rectF.set(i, f - (getIntrinsicHeight() / 2.0f), getIntrinsicWidth() + i, (getIntrinsicHeight() / 2.0f) + f);
            this.gradientTools.gradientMatrix(rectF);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.gradientTools.paint);
            this.lock.setBounds(AndroidUtilities.dp(3.33f) + i, (int) (f - ((this.lock.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((this.lock.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i), (int) Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(this.lock.getIntrinsicHeight(), 0.875f, 2.0f, f));
            this.lock.draw(canvas);
            this.text.draw(canvas, (this.lock.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i, f, -1, 1.0f);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.33f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.text.getWidth() + (this.lock.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public LevelLock(Context context, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
            this.lockScale = 0.875f;
            this.resourcesProvider = resourcesProvider;
            this.text = new Text(LocaleController.formatPluralString(z ? "BoostLevelPlus" : "BoostLevel", i, new Object[0]), 12.0f, AndroidUtilities.bold());
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.lock = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.gradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, resourcesProvider);
        }
    }

    public class Page extends FrameLayout {
        private static final int VIEW_TYPE_BUTTONPAD = 5;
        private static final int VIEW_TYPE_COLOR_PICKER = 1;
        private static final int VIEW_TYPE_FLICKER = 9;
        private static final int VIEW_TYPE_GIFT = 8;
        private static final int VIEW_TYPE_GIFTS_EMPTY = 11;
        private static final int VIEW_TYPE_GIFT_FOREIGN = 12;
        private static final int VIEW_TYPE_HEADER = 7;
        private static final int VIEW_TYPE_ICON = 3;
        private static final int VIEW_TYPE_INFO = 2;
        private static final int VIEW_TYPE_MESSAGE = 0;
        private static final int VIEW_TYPE_TABS = 10;
        private static final int VIEW_TYPE_TEXT = 6;
        private int actionBarHeight;
        private ButtonWithCounterView button;
        private CharSequence buttonCollectible;
        private FrameLayout buttonContainer;
        private CharSequence buttonLocked;
        int buttonRow;
        private View buttonShadow;
        private CharSequence buttonUnlocked;
        int clearRow;
        int colorPickerRow;
        int giftsCount;
        int giftsEmptyRow;
        int giftsEndRow;
        int giftsHeaderRow;
        int giftsInfoRow;
        int giftsLoadingEndRow;
        int giftsLoadingStartRow;
        int giftsStartRow;
        int giftsTabsRow;
        int iconRow;
        private final HashMap<Integer, TL_stars.StarGift> index2gift;
        int info2Row;
        int infoRow;
        private GridLayoutManager layoutManager;
        private RecyclerView.Adapter listAdapter;
        private RecyclerListView listView;
        private ThemePreviewMessagesCell messagesCellPreview;
        private PeerColorGrid peerColorPicker;
        private ProfilePreview profilePreview;
        private ResaleGiftsFragment.ResaleGiftsList resaleGifts;
        int rowCount;
        private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
        private int selectedColor;
        private long selectedEmoji;
        private TLRPC.TL_emojiStatusCollectible selectedEmojiCollectible;
        private TLRPC.TL_peerColorCollectible selectedPeerCollectible;
        private TL_stars.TL_starGiftUnique selectedResaleGift;
        private TL_stars.StarGift selectedTabGift;
        private SetReplyIconCell setReplyIconCell;
        int shadowRow;
        private final ArrayList<CharSequence> tabs;
        private final int type;
        final ArrayList<TL_stars.TL_starGiftUnique> uniqueGifts;

        public class AnonymousClass4 extends RecyclerListView.SelectionAdapter {
            final Context val$context;
            final PeerColorActivity val$this$0;
            final int val$type;

            public AnonymousClass4(PeerColorActivity peerColorActivity, Context context, int i) {
                this.val$this$0 = peerColorActivity;
                this.val$context = context;
                this.val$type = i;
            }

            public void lambda$onBindViewHolder$1(int i) {
                PeerColorActivity.this.viewPager.scrollToPosition(1 - i);
            }

            public void lambda$onBindViewHolder$2(Boolean bool) {
                Page.this.update();
            }

            public void lambda$onBindViewHolder$3(Integer num) {
                Page.this.selectedTabGift = num.intValue() == 0 ? null : (TL_stars.StarGift) Page.this.index2gift.get(num);
                if (Page.this.selectedTabGift == null) {
                    if (Page.this.resaleGifts != null) {
                        Page.this.resaleGifts.cancel();
                        Page.this.resaleGifts = null;
                    }
                } else if (Page.this.resaleGifts == null || Page.this.resaleGifts.gift_id != Page.this.selectedTabGift.id) {
                    Page page = Page.this;
                    page.resaleGifts = new ResaleGiftsFragment.ResaleGiftsList(Page.this.selectedTabGift.id, ((BaseFragment) PeerColorActivity.this).currentAccount, new PeerColorActivity$Page$4$$ExternalSyntheticLambda0(this, 0));
                    Page.this.resaleGifts.load(false);
                }
                Page.this.update();
                (PeerColorActivity.this.viewPager.getCurrentPosition() == 1 ? PeerColorActivity.this.profilePage : PeerColorActivity.this.namePage).update();
            }

            public void lambda$onCreateViewHolder$0(Integer num) {
                Page.this.selectedColor = num.intValue();
                Page.this.selectedEmojiCollectible = null;
                Page.this.selectedPeerCollectible = null;
                Page.this.selectedResaleGift = null;
                Page.this.updateProfilePreview(true);
                Page.this.updateMessages();
                Page.this.updateButton(true);
                if (Page.this.setReplyIconCell != null) {
                    Page.this.setReplyIconCell.invalidate();
                }
                Page page = PeerColorActivity.this.profilePage;
                if (page == null || page.profilePreview == null) {
                    return;
                }
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                if (peerColorActivity.namePage != null) {
                    peerColorActivity.profilePage.profilePreview.overrideAvatarColor(PeerColorActivity.this.namePage.selectedColor);
                }
            }

            @Override
            public int getItemCount() {
                return Page.this.rowCount;
            }

            @Override
            public int getItemViewType(int i) {
                Page page = Page.this;
                if (i != page.infoRow && i != page.giftsInfoRow && i != page.info2Row && i != page.shadowRow) {
                    if (i == page.colorPickerRow) {
                        return 1;
                    }
                    if (i == page.iconRow) {
                        return 3;
                    }
                    if (i == page.buttonRow) {
                        return 5;
                    }
                    if (i == page.clearRow) {
                        return 6;
                    }
                    if (i == page.giftsTabsRow) {
                        return 10;
                    }
                    if (i == page.giftsEmptyRow) {
                        return 11;
                    }
                    if (i == page.giftsHeaderRow) {
                        return 7;
                    }
                    if (i >= page.giftsStartRow && i < page.giftsEndRow) {
                        return page.selectedTabGift == null ? 8 : 12;
                    }
                    if (i >= page.giftsLoadingStartRow && i < page.giftsLoadingEndRow) {
                        return 9;
                    }
                    if (i == getItemCount() - 1) {
                        return 4;
                    }
                }
                return 2;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 6 || viewHolder.getItemViewType() == 8 || viewHolder.getItemViewType() == 12;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z = true;
                switch (getItemViewType(i)) {
                    case 1:
                        viewHolder.itemView.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        ((PeerColorGrid) viewHolder.itemView).updateColors();
                        break;
                    case 2:
                        TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                        textInfoPrivacyCell.setFixedSize(0);
                        Page page = Page.this;
                        if (i == page.infoRow) {
                            textInfoPrivacyCell.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(this.val$type == 1 ? LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelColorHint : R.string.UserColorHint) : LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelProfileHint : R.string.UserProfileHint2), new OAuthSheet$$ExternalSyntheticLambda6(this, this.val$type, 11)), true));
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), Page.this.clearRow >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        } else if (i == page.shadowRow) {
                            textInfoPrivacyCell.setText("");
                            textInfoPrivacyCell.setFixedSize(12);
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), Page.this.giftsHeaderRow >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        } else if (i == page.giftsInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        }
                        break;
                    case 3:
                        ((SetReplyIconCell) viewHolder.itemView).updateColors();
                        break;
                    case 6:
                        TextCell textCell = (TextCell) viewHolder.itemView;
                        textCell.updateColors();
                        textCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        textCell.updateColors();
                        Page page2 = Page.this;
                        if (i == page2.clearRow) {
                            textCell.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                        }
                        break;
                    case 7:
                        HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                        if (i == Page.this.giftsHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                        }
                        headerCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        break;
                    case 8:
                        GiftCell giftCell = (GiftCell) viewHolder.itemView;
                        Page page3 = Page.this;
                        int i2 = i - page3.giftsStartRow;
                        if (i2 >= 0 && i2 < page3.uniqueGifts.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = Page.this.uniqueGifts.get(i2);
                            giftCell.set(i2, tL_starGiftUnique);
                            if ((Page.this.selectedEmojiCollectible == null || Page.this.selectedEmojiCollectible.collectible_id != tL_starGiftUnique.id) && (Page.this.selectedPeerCollectible == null || Page.this.selectedPeerCollectible.collectible_id != tL_starGiftUnique.id)) {
                                z = false;
                            }
                            giftCell.setSelected(z, false);
                            giftCell.card.invalidate();
                            break;
                        }
                        break;
                    case 10:
                        GiftSheet.Tabs tabs = (GiftSheet.Tabs) viewHolder.itemView;
                        Page.this.tabs.clear();
                        Page.this.index2gift.clear();
                        ArrayList arrayList = StarsController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount, false).sortedGifts;
                        Page.this.tabs.add(LocaleController.getString(R.string.Gift2TabMine));
                        int size = 0;
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i3);
                            int i4 = this.val$type;
                            if ((i4 == 0 || (i4 == 1 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                                if (Page.this.selectedTabGift == starGift) {
                                    size = Page.this.tabs.size();
                                }
                                Page.this.index2gift.put(Integer.valueOf(Page.this.tabs.size()), starGift);
                                TextPaint textPaint = new TextPaint(1);
                                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(starGift.getDocument(), textPaint.getFontMetricsInt());
                                animatedEmojiSpan.size = AndroidUtilities.dp(14.0f);
                                spannableStringBuilder.setSpan(animatedEmojiSpan, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) starGift.title);
                                Page.this.tabs.add(spannableStringBuilder);
                            }
                        }
                        tabs.set(0, Page.this.tabs, size, new PeerColorActivity$Page$4$$ExternalSyntheticLambda0(this, 1));
                        tabs.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        tabs.updateColors();
                        break;
                    case 11:
                        ((EmptyView) viewHolder.itemView).updateColors();
                        break;
                    case 12:
                        GiftSheet.GiftCell giftCell2 = (GiftSheet.GiftCell) viewHolder.itemView;
                        Page page4 = Page.this;
                        int i5 = i - page4.giftsStartRow;
                        if (page4.resaleGifts != null && i5 >= 0 && i5 < Page.this.uniqueGifts.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = Page.this.uniqueGifts.get(i5);
                            giftCell2.setStarsGift(tL_starGiftUnique2, false, false, false, true, false);
                            if ((Page.this.selectedEmojiCollectible == null || Page.this.selectedEmojiCollectible.collectible_id != tL_starGiftUnique2.id) && (Page.this.selectedPeerCollectible == null || Page.this.selectedPeerCollectible.collectible_id != tL_starGiftUnique2.id)) {
                                z = false;
                            }
                            giftCell2.setSelected(z, false);
                        }
                        break;
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View emptyView;
                View giftCell;
                switch (i) {
                    case 1:
                        PeerColorGrid peerColorGrid = Page.this.peerColorPicker = new PeerColorGrid(Page.this.getContext(), this.val$type, ((BaseFragment) PeerColorActivity.this).currentAccount, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        peerColorGrid.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        peerColorGrid.setSelected(Page.this.selectedColor, false);
                        peerColorGrid.setOnColorClick(new PeerColorActivity$Page$4$$ExternalSyntheticLambda0(this, 2));
                        giftCell = peerColorGrid;
                        emptyView = giftCell;
                        break;
                    case 2:
                    default:
                        emptyView = new TextInfoPrivacyCell(Page.this.getContext(), 24, PeerColorActivity.this.getResourceProvider());
                        break;
                    case 3:
                        Page page = Page.this;
                        Page page2 = Page.this;
                        SetReplyIconCell setReplyIconCell = page.setReplyIconCell = page2.new SetReplyIconCell(page2.getContext());
                        setReplyIconCell.update(false);
                        giftCell = setReplyIconCell;
                        emptyView = giftCell;
                        break;
                    case 4:
                        View view = new View(Page.this.getContext()) {
                            @Override
                            public void onMeasure(int i2, int i3) {
                                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                            }
                        };
                        view.setBackground(Theme.getThemedDrawableByKey(Page.this.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        emptyView = view;
                        break;
                    case 5:
                        emptyView = new View(Page.this.getContext()) {
                            @Override
                            public void onMeasure(int i2, int i3) {
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                            }
                        };
                        break;
                    case 6:
                        TextCell textCell = new TextCell(23, Page.this.getContext(), PeerColorActivity.this.getResourceProvider(), false, false);
                        textCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        emptyView = textCell;
                        break;
                    case 7:
                        HeaderCell headerCell = new HeaderCell(Page.this.getContext(), ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        headerCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        emptyView = headerCell;
                        break;
                    case 8:
                        giftCell = new GiftCell(Page.this.getContext(), false, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        emptyView = giftCell;
                        break;
                    case 9:
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.val$context, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        flickerLoadingView.setIsSingleCell(true);
                        flickerLoadingView.setViewType(35);
                        emptyView = flickerLoadingView;
                        break;
                    case 10:
                        GiftSheet.Tabs tabs = new GiftSheet.Tabs(Page.this.getContext(), false, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        tabs.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        giftCell = tabs;
                        emptyView = giftCell;
                        break;
                    case 11:
                        Page page3 = Page.this;
                        emptyView = page3.new EmptyView(page3.getContext());
                        break;
                    case 12:
                        emptyView = new GiftSheet.GiftCell(Page.this.getContext(), ((BaseFragment) PeerColorActivity.this).currentAccount, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        break;
                }
                return new RecyclerListView.Holder(emptyView);
            }

            @Override
            public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewAttachedToWindow(viewHolder);
                boolean z = true;
                if (viewHolder.getItemViewType() == 8) {
                    GiftCell giftCell = (GiftCell) viewHolder.itemView;
                    int adapterPosition = viewHolder.getAdapterPosition();
                    Page page = Page.this;
                    int i = adapterPosition - page.giftsStartRow;
                    if (i < 0 || i >= page.uniqueGifts.size()) {
                        return;
                    }
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = Page.this.uniqueGifts.get(i);
                    giftCell.set(i, tL_starGiftUnique);
                    if ((Page.this.selectedEmojiCollectible == null || Page.this.selectedEmojiCollectible.collectible_id != tL_starGiftUnique.id) && (Page.this.selectedPeerCollectible == null || Page.this.selectedPeerCollectible.collectible_id != tL_starGiftUnique.id)) {
                        z = false;
                    }
                    giftCell.setSelected(z, false);
                    return;
                }
                if (viewHolder.getItemViewType() == 12) {
                    GiftSheet.GiftCell giftCell2 = (GiftSheet.GiftCell) viewHolder.itemView;
                    int adapterPosition2 = viewHolder.getAdapterPosition();
                    Page page2 = Page.this;
                    int i2 = adapterPosition2 - page2.giftsStartRow;
                    if (page2.resaleGifts != null && i2 >= 0 && i2 < Page.this.uniqueGifts.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = Page.this.uniqueGifts.get(i2);
                        giftCell2.setStarsGift(tL_starGiftUnique2, false, false, false, true, false);
                        if ((Page.this.selectedEmojiCollectible == null || Page.this.selectedEmojiCollectible.collectible_id != tL_starGiftUnique2.id) && (Page.this.selectedPeerCollectible == null || Page.this.selectedPeerCollectible.collectible_id != tL_starGiftUnique2.id)) {
                            z = false;
                        }
                        giftCell2.setSelected(z, false);
                    }
                }
            }
        }

        public class EmptyView extends LinearLayout {
            private final BackupImageView imageView;
            private final TextView subtitle;
            private final TextView title;

            public EmptyView(Context context) {
                super(context);
                setOrientation(1);
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                BackupImageView backupImageView = new BackupImageView(getContext());
                this.imageView = backupImageView;
                backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_draw, "utyan_draw", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 6, 0, 0));
                LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(getContext(), 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                this.title = linksTextViewMakeLinkTextView;
                linksTextViewMakeLinkTextView.setGravity(17);
                linksTextViewMakeLinkTextView.setText(LocaleController.getString(Page.this.type == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
                addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 64, 8, 64, 8));
                LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(getContext(), 14.0f, Theme.key_chat_messageLinkIn, false, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                this.subtitle = linksTextViewMakeLinkTextView2;
                linksTextViewMakeLinkTextView2.setGravity(17);
                linksTextViewMakeLinkTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new MainTabsLayout$$ExternalSyntheticLambda0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
                addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 32, 4, 32, 24));
            }

            public void lambda$new$0(Boolean bool) {
                Page.this.update();
            }

            public void lambda$new$1() {
                GiftSheet.Tabs tabs = null;
                for (int i = 0; i < Page.this.listView.getChildCount(); i++) {
                    View childAt = Page.this.listView.getChildAt(i);
                    if (childAt instanceof GiftSheet.Tabs) {
                        tabs = (GiftSheet.Tabs) childAt;
                    }
                }
                if (tabs == null || Page.this.tabs.size() <= 1) {
                    return;
                }
                tabs.selected = 1;
                tabs.layout.invalidate();
                Page page = Page.this;
                page.selectedTabGift = (TL_stars.StarGift) page.index2gift.get(1);
                if (Page.this.selectedTabGift == null) {
                    if (Page.this.resaleGifts != null) {
                        Page.this.resaleGifts.cancel();
                        Page.this.resaleGifts = null;
                    }
                } else if (Page.this.resaleGifts == null || Page.this.resaleGifts.gift_id != Page.this.selectedTabGift.id) {
                    Page page2 = Page.this;
                    page2.resaleGifts = new ResaleGiftsFragment.ResaleGiftsList(Page.this.selectedTabGift.id, ((BaseFragment) PeerColorActivity.this).currentAccount, new PollItemMenu$$ExternalSyntheticLambda15(this, 16));
                    Page.this.resaleGifts.load(false);
                }
                Page.this.update();
                (PeerColorActivity.this.viewPager.getCurrentPosition() == 1 ? PeerColorActivity.this.profilePage : PeerColorActivity.this.namePage).update();
            }

            public void updateColors() {
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                this.title.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                TextView textView = this.subtitle;
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                int i = Theme.key_chat_messageLinkIn;
                textView.setTextColor(peerColorActivity.getThemedColor(i));
                this.subtitle.setLinkTextColor(PeerColorActivity.this.getThemedColor(i));
            }
        }

        public class SetReplyIconCell extends FrameLayout {
            private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
            private Text offText;
            private TextView textView;

            public SetReplyIconCell(Context context) {
                super(context);
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTextSize(1, 16.0f);
                this.textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                if (Page.this.type == 1) {
                    this.textView.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
                } else {
                    this.textView.setText(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
                }
                addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
                this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 13);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                updateImageBounds();
                this.imageDrawable.setColor(Integer.valueOf(getColor()));
                Text text = this.offText;
                if (text != null) {
                    text.draw(canvas, (getMeasuredWidth() - this.offText.getWidth()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4), 1.0f);
                } else {
                    this.imageDrawable.draw(canvas);
                }
            }

            public int getColor() {
                MessagesController.PeerColor color;
                if (Page.this.selectedColor < 0) {
                    PeerColorActivity peerColorActivity = PeerColorActivity.this;
                    int i = Theme.key_actionBarDefault;
                    if (AndroidUtilities.computePerceivedBrightness(peerColorActivity.getThemedColor(i)) > 0.8f) {
                        return Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                    }
                    return AndroidUtilities.computePerceivedBrightness(PeerColorActivity.this.getThemedColor(i)) < 0.2f ? Theme.multAlpha(0.5f, Theme.getColor(Theme.key_actionBarDefaultTitle, ((BaseFragment) PeerColorActivity.this).resourceProvider)) : Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, ((BaseFragment) PeerColorActivity.this).resourceProvider), Theme.multAlpha(0.7f, PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i, ((BaseFragment) PeerColorActivity.this).resourceProvider))));
                }
                if (Page.this.selectedColor < 7) {
                    Page page = Page.this;
                    return PeerColorActivity.this.getThemedColor(Theme.keys_avatar_nameInMessage[page.selectedColor]);
                }
                MessagesController.PeerColors peerColors = Page.this.type == 1 ? MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).peerColors : MessagesController.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).profilePeerColors;
                return (peerColors == null || (color = peerColors.getColor(Page.this.selectedColor)) == null) ? PeerColorActivity.this.getThemedColor(Theme.keys_avatar_nameInMessage[0]) : color.getColor1();
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.imageDrawable.attach();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.imageDrawable.detach();
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            }

            public void update(boolean z) {
                if (Page.this.selectedEmoji != 0) {
                    this.imageDrawable.set(Page.this.selectedEmoji, z);
                    this.offText = null;
                } else {
                    this.imageDrawable.set((Drawable) null, z);
                    if (this.offText == null) {
                        this.offText = new Text(LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f);
                    }
                }
            }

            public void updateColors() {
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                this.textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            }

            public void updateImageBounds() {
                int width;
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
                int iDp = LocaleController.isRTL ? AndroidUtilities.dp(21.0f) : (getWidth() - this.imageDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(21.0f);
                int height = (getHeight() - this.imageDrawable.getIntrinsicHeight()) / 2;
                if (LocaleController.isRTL) {
                    width = this.imageDrawable.getIntrinsicWidth() + AndroidUtilities.dp(21.0f);
                } else {
                    width = getWidth() - AndroidUtilities.dp(21.0f);
                }
                swapAnimatedEmojiDrawable.setBounds(iDp, height, width, (this.imageDrawable.getIntrinsicHeight() + getHeight()) / 2);
            }
        }

        public Page(Context context, final int i) {
            CharSequence charSequence;
            super(context);
            this.selectedColor = -1;
            this.selectedEmoji = 0L;
            this.selectedEmojiCollectible = null;
            this.selectedPeerCollectible = null;
            this.selectedTabGift = null;
            this.tabs = new ArrayList<>();
            this.index2gift = new HashMap<>();
            this.colorPickerRow = -1;
            this.infoRow = -1;
            this.iconRow = -1;
            this.info2Row = -1;
            this.buttonRow = -1;
            this.clearRow = -1;
            this.shadowRow = -1;
            this.giftsHeaderRow = -1;
            this.giftsStartRow = -1;
            this.giftsEndRow = -1;
            this.giftsLoadingStartRow = -1;
            this.giftsLoadingEndRow = -1;
            this.giftsCount = 0;
            this.giftsInfoRow = -1;
            this.giftsTabsRow = -1;
            this.giftsEmptyRow = -1;
            this.uniqueGifts = new ArrayList<>();
            this.type = i;
            setupValues();
            RecyclerListView recyclerListView = new RecyclerListView(getContext(), PeerColorActivity.this.getResourceProvider()) {
                @Override
                public Integer getSelectorColor(int i2) {
                    Page page = Page.this;
                    if ((i2 < page.giftsStartRow || i2 >= page.giftsEndRow) && (i2 < page.giftsLoadingStartRow || i2 >= page.giftsLoadingEndRow)) {
                        return super.getSelectorColor(i2);
                    }
                    return 0;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    Page page = Page.this;
                    drawSectionBackground(canvas, page.giftsStartRow, Math.max(page.giftsLoadingEndRow, page.giftsEndRow) - 1, getThemedColor(Theme.key_windowBackgroundWhite), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    super.onDraw(canvas);
                }

                @Override
                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    Page.this.updateButtonY();
                    if (Page.this.selectedTabGift != null) {
                        if (Page.this.resaleGifts == null || !Page.this.seesLoading()) {
                            return;
                        }
                        Page.this.resaleGifts.load(false);
                        return;
                    }
                    StarsController.GiftsList giftsList = i == 1 ? PeerColorActivity.this.giftsWithPeerColor : PeerColorActivity.this.gifts;
                    if (giftsList == null || !Page.this.seesLoading()) {
                        return;
                    }
                    giftsList.load();
                }

                @Override
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    Page.this.updateButtonY();
                }
            };
            this.listView = recyclerListView;
            ((DefaultItemAnimator) recyclerListView.getItemAnimator()).setSupportsChangeAnimations(false);
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
            this.layoutManager = gridLayoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i2) {
                    Page page = Page.this;
                    if (i2 < page.giftsStartRow || i2 >= page.giftsEndRow) {
                        return (i2 < page.giftsLoadingStartRow || i2 >= page.giftsLoadingEndRow) ? 3 : 1;
                    }
                    return 1;
                }
            });
            this.listView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    Page page = Page.this;
                    int i2 = page.giftsStartRow;
                    if (childAdapterPosition >= i2) {
                        int i3 = page.giftsCount;
                        if (childAdapterPosition >= i2 + i3) {
                            return;
                        }
                        int i4 = childAdapterPosition - i2;
                        int i5 = i4 / 3;
                        boolean z = i5 == 0;
                        boolean z2 = i5 == (i3 - 1) / 3;
                        int i6 = i4 % 3;
                        boolean z3 = i6 == 0;
                        boolean z4 = i6 == 2;
                        rect.top = z ? AndroidUtilities.dp(8.0f) : 0;
                        rect.bottom = z2 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.left = z3 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.right = z4 ? AndroidUtilities.dp(8.0f) : 0;
                    }
                }
            });
            this.listView.setLayoutManager(this.layoutManager);
            RecyclerListView recyclerListView2 = this.listView;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(PeerColorActivity.this, context, i);
            this.listAdapter = anonymousClass4;
            recyclerListView2.setAdapter(anonymousClass4);
            this.listView.setOnItemClickListener(new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 0));
            this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    super.onScrolled(recyclerView, i2, i3);
                    if (Page.this.selectedTabGift != null) {
                        if (Page.this.resaleGifts == null || !Page.this.seesLoading()) {
                            return;
                        }
                        Page.this.resaleGifts.load(false);
                        return;
                    }
                    StarsController.GiftsList giftsList = i == 1 ? PeerColorActivity.this.giftsWithPeerColor : PeerColorActivity.this.gifts;
                    if (giftsList == null || !Page.this.seesLoading()) {
                        return;
                    }
                    giftsList.load();
                }
            });
            addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.buttonContainer = frameLayout;
            frameLayout.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
            View view = new View(getContext());
            this.buttonShadow = view;
            view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_divider));
            this.buttonShadow.setAlpha(0.0f);
            this.buttonContainer.addView(this.buttonShadow, LayoutHelper.createFrame(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            this.buttonUnlocked = LocaleController.getString(PeerColorActivity.this.isChannel ? R.string.ChannelColorApply : R.string.UserColorApply);
            this.buttonLocked = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append(this.buttonUnlocked);
            this.buttonCollectible = LocaleController.getString(R.string.UserColorApplyCollectible);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, PeerColorActivity.this.getResourceProvider());
            this.button = buttonWithCounterView;
            buttonWithCounterView.setRound();
            this.button.text.setHacks(true, true, true);
            ButtonWithCounterView buttonWithCounterView2 = this.button;
            if (PeerColorActivity.this.isChannel) {
                charSequence = this.buttonUnlocked;
            } else if (!PeerColorActivity.this.getUserConfig().isPremium()) {
                charSequence = this.buttonLocked;
            } else if (this.selectedEmojiCollectible != null) {
                charSequence = this.buttonCollectible;
            } else {
                charSequence = this.buttonUnlocked;
            }
            buttonWithCounterView2.setText(charSequence, false);
            this.button.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 19));
            this.buttonContainer.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
            addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
            this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    Page.this.updateButtonY();
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.listView.lambda$onCellEnter$52(defaultItemAnimator);
            if (i == 0) {
                this.profilePreview = new ProfilePreview(getContext(), ((BaseFragment) PeerColorActivity.this).currentAccount, PeerColorActivity.this.dialogId, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                updateProfilePreview(false);
                addView(this.profilePreview, LayoutHelper.createFrame(-1, -2, 55));
            } else {
                ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(getContext(), ((BaseFragment) PeerColorActivity.this).parentLayout, 3, PeerColorActivity.this.dialogId, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                this.messagesCellPreview = themePreviewMessagesCell;
                themePreviewMessagesCell.setImportantForAccessibility(4);
                ThemePreviewMessagesCell themePreviewMessagesCell2 = this.messagesCellPreview;
                themePreviewMessagesCell2.fragment = PeerColorActivity.this;
                addView(themePreviewMessagesCell2, LayoutHelper.createFrame(-1, -2, 55));
            }
            updateColors();
            updateRows();
            setWillNotDraw(false);
        }

        public void lambda$new$0(int i, View view, int i2) {
            ProfilePreview profilePreview;
            Page page;
            if (view instanceof SetReplyIconCell) {
                showSelectStatusDialog((SetReplyIconCell) view);
                return;
            }
            if (i2 == this.clearRow) {
                this.selectedColor = -1;
                this.selectedEmoji = 0L;
                this.selectedEmojiCollectible = null;
                this.selectedPeerCollectible = null;
                this.selectedResaleGift = null;
                updateMessages();
                if (i == 0) {
                    PeerColorActivity.this.namePage.updateMessages();
                }
                SetReplyIconCell setReplyIconCell = this.setReplyIconCell;
                if (setReplyIconCell != null) {
                    setReplyIconCell.update(true);
                }
                updateProfilePreview(true);
                updateButton(true);
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                Page page2 = peerColorActivity.profilePage;
                if (page2 == null || (profilePreview = page2.profilePreview) == null || (page = peerColorActivity.namePage) == null) {
                    return;
                }
                profilePreview.overrideAvatarColor(page.selectedColor);
                return;
            }
            int i3 = this.giftsStartRow;
            if (i2 < i3 || i2 >= this.giftsEndRow) {
                return;
            }
            int i4 = i2 - i3;
            if (this.selectedTabGift == null) {
                if (i4 < 0 || i4 >= this.uniqueGifts.size()) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.uniqueGifts.get(i4);
                if (i == 1) {
                    TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                    if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                        return;
                    }
                    this.selectedEmoji = 0L;
                    this.selectedColor = -1;
                    this.selectedResaleGift = null;
                    this.selectedEmojiCollectible = null;
                    this.selectedPeerCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                } else {
                    this.selectedEmoji = 0L;
                    this.selectedColor = -1;
                    this.selectedResaleGift = null;
                    this.selectedEmojiCollectible = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                    this.selectedPeerCollectible = null;
                }
                updateProfilePreview(true);
                updateMessages();
                updateButton(true);
                SetReplyIconCell setReplyIconCell2 = this.setReplyIconCell;
                if (setReplyIconCell2 != null) {
                    setReplyIconCell2.update(true);
                    return;
                }
                return;
            }
            if (this.resaleGifts == null || i4 < 0 || i4 >= this.uniqueGifts.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.uniqueGifts.get(i4);
            if (i == 1) {
                TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                if (!(peerColor2 instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                this.selectedEmoji = 0L;
                this.selectedColor = -1;
                this.selectedEmojiCollectible = null;
                this.selectedPeerCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            } else {
                this.selectedEmoji = 0L;
                this.selectedColor = -1;
                this.selectedEmojiCollectible = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                this.selectedPeerCollectible = null;
            }
            this.selectedResaleGift = tL_starGiftUnique2;
            updateProfilePreview(true);
            updateMessages();
            updateButton(true);
            SetReplyIconCell setReplyIconCell3 = this.setReplyIconCell;
            if (setReplyIconCell3 != null) {
                setReplyIconCell3.update(true);
            }
        }

        public void lambda$new$1(View view) {
            PeerColorActivity.this.buttonClick();
        }

        public void lambda$updateColors$2(View view) {
            if (view instanceof PeerColorGrid) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((PeerColorGrid) view).updateColors();
                return;
            }
            if (view instanceof TextCell) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((TextCell) view).updateColors();
                return;
            }
            if (view instanceof SetReplyIconCell) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((SetReplyIconCell) view).updateColors();
                return;
            }
            if (view instanceof HeaderCell) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                return;
            }
            if (view instanceof GiftCell) {
                ((GiftCell) view).card.invalidate();
                return;
            }
            if (view instanceof GiftSheet.Tabs) {
                view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                ((GiftSheet.Tabs) view).updateColors();
            } else if (view instanceof EmptyView) {
                ((EmptyView) view).updateColors();
            }
        }

        public void updateButtonY() {
            if (this.buttonContainer == null) {
                return;
            }
            int itemCount = this.listAdapter.getItemCount() - 1;
            boolean z = false;
            int measuredHeight = 0;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && childAdapterPosition <= itemCount) {
                    measuredHeight = Math.max(measuredHeight, childAt.getTop());
                    if (childAdapterPosition == itemCount) {
                        z = true;
                    }
                }
            }
            if (!z) {
                measuredHeight = this.listView.getMeasuredHeight();
            }
            float fMax = Math.max(0, measuredHeight - (this.listView.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
            int i2 = this.type;
            if (i2 == 0 || i2 == 1) {
                this.buttonShadow.animate().alpha(fMax > 0.0f ? 0.0f : 1.0f).start();
                fMax = 0.0f;
            }
            this.buttonContainer.setTranslationY(fMax);
        }

        public void updateMessages() {
            MessageObject messageObject;
            ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
            if (themePreviewMessagesCell != null) {
                ChatMessageCell[] cells = themePreviewMessagesCell.getCells();
                for (int i = 0; i < cells.length; i++) {
                    ChatMessageCell chatMessageCell = cells[i];
                    if (chatMessageCell != null && (messageObject = chatMessageCell.getMessageObject()) != null) {
                        messageObject.notime = true;
                        PeerColorGrid peerColorGrid = this.peerColorPicker;
                        if (peerColorGrid != null) {
                            messageObject.overrideLinkColor = peerColorGrid.getColorId();
                        }
                        messageObject.overrideLinkEmoji = this.selectedEmoji;
                        messageObject.overrideLinkPeerColor = this.selectedPeerCollectible;
                        cells[i].setAvatar(messageObject);
                        cells[i].invalidate();
                    }
                }
            }
        }

        private void updateRows() {
            this.clearRow = -1;
            this.shadowRow = -1;
            this.giftsHeaderRow = -1;
            this.giftsStartRow = -1;
            this.giftsLoadingStartRow = -1;
            this.giftsLoadingEndRow = -1;
            this.giftsEndRow = -1;
            this.giftsInfoRow = -1;
            this.giftsTabsRow = -1;
            this.giftsEmptyRow = -1;
            int i = 0;
            this.giftsCount = 0;
            this.uniqueGifts.clear();
            this.colorPickerRow = 0;
            this.iconRow = 1;
            int i2 = 3;
            this.rowCount = 3;
            this.infoRow = 2;
            int i3 = this.type;
            if (i3 == 0 && (this.selectedColor >= 0 || this.selectedEmojiCollectible != null || this.selectedPeerCollectible != null)) {
                this.clearRow = 3;
                this.rowCount = 5;
                this.shadowRow = 4;
            }
            StarsController.GiftsList giftsList = i3 == 1 ? PeerColorActivity.this.giftsWithPeerColor : PeerColorActivity.this.gifts;
            int i4 = this.type;
            if ((i4 == 0 || i4 == 1) && giftsList != null) {
                int i5 = this.rowCount;
                this.rowCount = i5 + 1;
                this.giftsTabsRow = i5;
                if (this.selectedTabGift == null) {
                    while (true) {
                        ArrayList arrayList = giftsList.gifts;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList.get(i)).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            this.uniqueGifts.add((TL_stars.TL_starGiftUnique) starGift);
                        }
                        i++;
                    }
                    int i6 = this.rowCount;
                    this.giftsStartRow = i6;
                    this.rowCount = this.uniqueGifts.size() + i6;
                    this.giftsCount = this.uniqueGifts.size() + this.giftsCount;
                    this.giftsEndRow = this.rowCount;
                    if (PeerColorActivity.this.gifts.loading || !PeerColorActivity.this.gifts.endReached) {
                        int i7 = this.rowCount;
                        this.giftsLoadingStartRow = i7;
                        int i8 = this.giftsCount;
                        int i9 = 3 - (i8 % 3);
                        if (i8 <= 0) {
                            i2 = 9;
                        } else if (i9 > 0) {
                            i2 = i9;
                        }
                        int i10 = i7 + i2;
                        this.rowCount = i10;
                        this.giftsCount = i8 + i2;
                        this.giftsLoadingEndRow = i10;
                    } else if (this.uniqueGifts.isEmpty()) {
                        int i11 = this.rowCount;
                        this.rowCount = i11 + 1;
                        this.giftsEmptyRow = i11;
                    }
                    if (seesLoading()) {
                        giftsList.load();
                    }
                } else if (this.resaleGifts != null) {
                    long clientUserId = UserConfig.getInstance(((BaseFragment) PeerColorActivity.this).currentAccount).getClientUserId();
                    for (int i12 = 0; i12 < this.resaleGifts.gifts.size(); i12++) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.resaleGifts.gifts.get(i12);
                        if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                            this.uniqueGifts.add(tL_starGiftUnique);
                        }
                    }
                    int i13 = this.rowCount;
                    this.giftsStartRow = i13;
                    this.rowCount = this.uniqueGifts.size() + i13;
                    int size = this.uniqueGifts.size() + this.giftsCount;
                    this.giftsCount = size;
                    int i14 = this.rowCount;
                    this.giftsEndRow = i14;
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.resaleGifts;
                    if (resaleGiftsList.loading || !resaleGiftsList.endReached) {
                        this.giftsLoadingStartRow = i14;
                        int i15 = 3 - (size % 3);
                        if (size <= 0) {
                            i2 = 9;
                        } else if (i15 > 0) {
                            i2 = i15;
                        }
                        int i16 = i14 + i2;
                        this.rowCount = i16;
                        this.giftsCount = size + i2;
                        this.giftsLoadingEndRow = i16;
                    }
                    if (seesLoading()) {
                        this.resaleGifts.load(false);
                    }
                }
                int i17 = this.rowCount;
                this.rowCount = i17 + 1;
                this.giftsInfoRow = i17;
            }
            int i18 = this.rowCount;
            this.rowCount = i18 + 1;
            this.buttonRow = i18;
        }

        public void checkResetColorButton() {
            int i;
            if (this.type != 0) {
                return;
            }
            int i2 = this.clearRow;
            updateRows();
            if (i2 >= 0 && this.clearRow < 0) {
                this.listAdapter.notifyItemRangeRemoved(i2, 2);
            } else {
                if (i2 >= 0 || (i = this.clearRow) < 0) {
                    return;
                }
                this.listAdapter.notifyItemRangeInserted(i, 2);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (PeerColorActivity.this.getParentLayout() != null) {
                INavigationLayout parentLayout = PeerColorActivity.this.getParentLayout();
                int i = this.actionBarHeight;
                parentLayout.getClass();
                ((ActionBarLayout) parentLayout).drawHeaderShadow(canvas, 255, i);
            }
        }

        public boolean hasUnsavedChanged() {
            if (PeerColorActivity.this.isChannel) {
                TLRPC.Chat chat = PeerColorActivity.this.getMessagesController().getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                if (chat == null) {
                    return false;
                }
                if (this.type != 1) {
                    if (this.selectedColor == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.selectedEmoji == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) && PeerColorActivity.eq(chat.emoji_status, this.selectedEmojiCollectible)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (this.selectedColor == ChatObject.getColorId(chat) && this.selectedEmoji == ChatObject.getEmojiId(chat)) {
                    TLRPC.PeerColor peerColor = chat.color;
                    if (PeerColorActivity.eq(peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null, this.selectedPeerCollectible)) {
                        return false;
                    }
                }
                return true;
            }
            TLRPC.User currentUser = PeerColorActivity.this.getUserConfig().getCurrentUser();
            if (currentUser == null) {
                return false;
            }
            if (this.type != 1) {
                if (this.selectedColor == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser))) {
                    if (this.selectedEmoji == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser)) && PeerColorActivity.eq(currentUser.emoji_status, this.selectedEmojiCollectible)) {
                        return false;
                    }
                }
                return true;
            }
            if (this.selectedColor == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser)) && this.selectedEmoji == UserObject.getEmojiId(currentUser)) {
                TLRPC.PeerColor peerColor2 = currentUser.color;
                if (PeerColorActivity.eq(peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null, this.selectedPeerCollectible)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void onMeasure(int i, int i2) {
            if (this.type == 1) {
                super.onMeasure(i, i2);
                this.actionBarHeight = ActionBar.getCurrentActionBarHeight() + this.messagesCellPreview.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) this.messagesCellPreview.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) this.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                this.listView.setPadding(0, this.messagesCellPreview.getMeasuredHeight(), 0, 0);
            } else {
                this.actionBarHeight = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) this.listView.getLayoutParams()).topMargin = this.actionBarHeight;
                ((ViewGroup.MarginLayoutParams) this.profilePreview.getLayoutParams()).height = this.actionBarHeight;
            }
            super.onMeasure(i, i2);
        }

        public void premiumChanged() {
            updateButton(true);
        }

        public boolean seesLoading() {
            if (this.listView == null) {
                return false;
            }
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                    return true;
                }
            }
            return false;
        }

        public void setupValues() {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
            if (this.type == 0) {
                if (PeerColorActivity.this.dialogId < 0) {
                    TLRPC.Chat chat = PeerColorActivity.this.getMessagesController().getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                    this.selectedColor = ChatObject.getProfileColorId(chat);
                    this.selectedEmoji = ChatObject.getProfileEmojiId(chat);
                    if (chat != null) {
                        TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                            tL_emojiStatusCollectible2 = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        } else {
                            tL_emojiStatusCollectible2 = null;
                        }
                    } else {
                        tL_emojiStatusCollectible2 = null;
                    }
                    this.selectedEmojiCollectible = tL_emojiStatusCollectible2;
                    this.selectedPeerCollectible = null;
                } else {
                    TLRPC.User currentUser = PeerColorActivity.this.getUserConfig().getCurrentUser();
                    this.selectedColor = UserObject.getProfileColorId(currentUser);
                    this.selectedEmoji = UserObject.getProfileEmojiId(currentUser);
                    if (currentUser != null) {
                        TLRPC.EmojiStatus emojiStatus2 = currentUser.emoji_status;
                        if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                            tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus2;
                        } else {
                            tL_emojiStatusCollectible = null;
                        }
                    } else {
                        tL_emojiStatusCollectible = null;
                    }
                    this.selectedEmojiCollectible = tL_emojiStatusCollectible;
                    this.selectedPeerCollectible = null;
                }
            } else if (PeerColorActivity.this.dialogId < 0) {
                TLRPC.Chat chat2 = PeerColorActivity.this.getMessagesController().getChat(Long.valueOf(-PeerColorActivity.this.dialogId));
                this.selectedColor = ChatObject.getColorId(chat2);
                this.selectedEmoji = ChatObject.getEmojiId(chat2);
                this.selectedEmojiCollectible = null;
                if (chat2 != null) {
                    TLRPC.PeerColor peerColor = chat2.color;
                    if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                        tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    }
                }
                this.selectedPeerCollectible = tL_peerColorCollectible;
            } else {
                TLRPC.User currentUser2 = PeerColorActivity.this.getUserConfig().getCurrentUser();
                this.selectedColor = UserObject.getColorId(currentUser2);
                this.selectedEmoji = UserObject.getEmojiId(currentUser2);
                this.selectedEmojiCollectible = null;
                if (currentUser2 != null) {
                    TLRPC.PeerColor peerColor2 = currentUser2.color;
                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                        tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                    }
                }
                this.selectedPeerCollectible = tL_peerColorCollectible;
            }
            if (this.selectedEmojiCollectible == null && this.selectedPeerCollectible == null) {
                return;
            }
            this.selectedColor = -1;
            this.selectedEmoji = 0L;
        }

        public void showSelectStatusDialog(final SetReplyIconCell setReplyIconCell) {
            int iCenterX;
            int iDp;
            if (this.selectAnimatedEmojiDialog != null || setReplyIconCell == null) {
                return;
            }
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
            int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
            int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = setReplyIconCell.imageDrawable;
            if (setReplyIconCell.imageDrawable != null) {
                setReplyIconCell.imageDrawable.play();
                setReplyIconCell.updateImageBounds();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(setReplyIconCell.imageDrawable.getBounds());
                if (this.type == 1) {
                    iDp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin;
                } else {
                    iDp = (-(setReplyIconCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                }
                iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
            } else {
                iCenterX = 0;
                iDp = 0;
            }
            int i = iDp;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(PeerColorActivity.this, getContext(), true, Integer.valueOf(iCenterX), this.type == 1 ? 5 : 7, true, PeerColorActivity.this.getResourceProvider(), this.type == 1 ? 24 : 16, setReplyIconCell.getColor()) {
                @Override
                public float getScrimDrawableTranslationY() {
                    return 0.0f;
                }

                @Override
                public void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    if (tL_starGiftUnique != null) {
                        if (Page.this.type == 0) {
                            TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                            if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                                return;
                            }
                            Page.this.selectedPeerCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                            Page.this.selectedEmojiCollectible = null;
                        } else {
                            Page.this.selectedPeerCollectible = null;
                            Page.this.selectedEmojiCollectible = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                        }
                        Page.this.selectedResaleGift = null;
                        Page.this.selectedColor = -1;
                    } else {
                        Page.this.selectedEmoji = l == null ? 0L : l.longValue();
                        Page.this.selectedEmojiCollectible = null;
                        Page.this.selectedPeerCollectible = null;
                        Page.this.selectedResaleGift = null;
                    }
                    SetReplyIconCell setReplyIconCell2 = setReplyIconCell;
                    if (setReplyIconCell2 != null) {
                        setReplyIconCell2.update(true);
                    }
                    Page.this.updateProfilePreview(true);
                    Page.this.updateMessages();
                    Page.this.updateButton(true);
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        Page.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }
            };
            selectAnimatedEmojiDialog.useAccentForPlus = true;
            long j = this.selectedEmoji;
            selectAnimatedEmojiDialog.setSelected(j == 0 ? null : Long.valueOf(j));
            selectAnimatedEmojiDialog.setSaveState(3);
            selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, setReplyIconCell);
            int i2 = -2;
            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i2, i2) {
                @Override
                public void dismiss() {
                    super.dismiss();
                    Page.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindow.showAsDropDown(setReplyIconCell, 0, i, (LocaleController.isRTL ? 3 : 5) | 48);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }

        public void update() {
            updateRows();
            this.listAdapter.notifyDataSetChanged();
        }

        public void updateButton(boolean z) {
            CharSequence charSequence;
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView == null) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.selectedResaleGift;
            if (tL_starGiftUnique == null) {
                if (PeerColorActivity.this.getUserConfig().isPremium() || PeerColorActivity.this.isChannel) {
                    charSequence = this.selectedEmojiCollectible != null ? this.buttonCollectible : this.buttonUnlocked;
                } else {
                    charSequence = this.buttonLocked;
                }
                buttonWithCounterView.setText(charSequence, z);
                this.button.setSubText(null, z);
                return;
            }
            AmountUtils$Amount resellAmount = tL_starGiftUnique.getResellAmount(AmountUtils$Currency.STARS);
            if (tL_starGiftUnique.resale_ton_only) {
                this.button.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(AmountUtils$Currency.TON).asFormatString()), 1.13f), z);
                this.button.setSubText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) (resellAmount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null), z);
            } else {
                this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) (resellAmount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null), z);
                this.button.setSubText(null, z);
            }
        }

        public void updateColors() {
            RecyclerListView recyclerListView = this.listView;
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            int i = Theme.key_windowBackgroundGray;
            recyclerListView.setBackgroundColor(peerColorActivity.getThemedColor(i));
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.updateColors();
            }
            ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
            if (themePreviewMessagesCell != null) {
                themePreviewMessagesCell.invalidate();
            }
            updateProfilePreview(true);
            this.buttonContainer.setBackgroundColor(PeerColorActivity.this.getThemedColor(i));
            this.buttonShadow.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_divider));
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new QrActivity$5$$ExternalSyntheticLambda1(this, 1));
        }

        public void updateProfilePreview(boolean z) {
            PeerColorGrid peerColorGrid = this.peerColorPicker;
            if (peerColorGrid != null) {
                peerColorGrid.setSelected(this.selectedColor, z);
            }
            ProfilePreview profilePreview = this.profilePreview;
            if (profilePreview != null) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.selectedEmojiCollectible;
                if (tL_emojiStatusCollectible != null) {
                    profilePreview.setStatusEmoji(tL_emojiStatusCollectible.document_id, true, z);
                    this.profilePreview.setColor(MessagesController.PeerColor.fromCollectible(this.selectedEmojiCollectible), z);
                    this.profilePreview.setEmoji(this.selectedEmojiCollectible.pattern_document_id, true, z);
                } else {
                    if (DialogObject.isEmojiStatusCollectible(PeerColorActivity.this.dialogId)) {
                        this.profilePreview.setStatusEmoji(0L, false, z);
                    } else {
                        this.profilePreview.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(PeerColorActivity.this.dialogId), DialogObject.isEmojiStatusCollectible(PeerColorActivity.this.dialogId), z);
                    }
                    this.profilePreview.setColor(this.selectedColor, z);
                    this.profilePreview.setEmoji(this.selectedEmoji, false, z);
                }
            }
            if (this.type == 0 && PeerColorActivity.this.colorBar != null) {
                if (this.selectedEmojiCollectible != null) {
                    PeerColorActivity.this.colorBar.setColor(MessagesController.PeerColor.fromCollectible(this.selectedEmojiCollectible), z);
                } else {
                    PeerColorActivity.this.colorBar.setColor(((BaseFragment) PeerColorActivity.this).currentAccount, this.selectedColor, z);
                }
            }
            checkResetColorButton();
            updateSelectedGift();
        }

        public void updateSelectedGift() {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof GiftCell) {
                    GiftCell giftCell = (GiftCell) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.selectedEmojiCollectible;
                    giftCell.setSelected((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == giftCell.getGiftId()) || ((tL_peerColorCollectible2 = this.selectedPeerCollectible) != null && tL_peerColorCollectible2.collectible_id == giftCell.getGiftId()), true);
                } else if (childAt instanceof GiftSheet.GiftCell) {
                    GiftSheet.GiftCell giftCell2 = (GiftSheet.GiftCell) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.selectedEmojiCollectible;
                    giftCell2.setSelected((tL_emojiStatusCollectible2 != null && tL_emojiStatusCollectible2.collectible_id == giftCell2.getGiftId()) || ((tL_peerColorCollectible = this.selectedPeerCollectible) != null && tL_peerColorCollectible.collectible_id == giftCell2.getGiftId()), true);
                }
            }
        }
    }

    public static class PeerColorGrid extends View {
        public static final int TYPE_FOLDER_TAG = 2;
        private final Paint backgroundPaint;
        private ColorButton[] buttons;
        private final int currentAccount;
        private final Paint dividerPaint;
        private boolean lock;
        private boolean needDivider;
        private Utilities.Callback<Integer> onColorClick;
        final int[] order;
        private ColorButton pressedButton;
        private final Theme.ResourcesProvider resourcesProvider;
        private int selectedColorId;
        private final int type;

        public PeerColorGrid(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.order = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
            this.dividerPaint = new Paint(1);
            this.needDivider = true;
            this.selectedColorId = 0;
            this.type = i;
            this.currentAccount = i2;
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (this.buttons != null) {
                int i = 0;
                while (true) {
                    ColorButton[] colorButtonArr = this.buttons;
                    if (i >= colorButtonArr.length) {
                        break;
                    }
                    colorButtonArr[i].draw(canvas);
                    i++;
                }
            }
            if (this.needDivider) {
                this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
                canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), this.dividerPaint);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            ColorButton colorButton;
            ColorButton colorButton2;
            Utilities.Callback<Integer> callback;
            Utilities.Callback<Integer> callback2;
            if (this.buttons == null) {
                colorButton = null;
                break;
            }
            int i = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i >= colorButtonArr.length) {
                    colorButton = null;
                    break;
                }
                if (colorButtonArr[i].clickBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                    colorButton = this.buttons[i];
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() == 0) {
                this.pressedButton = colorButton;
                if (colorButton != null) {
                    colorButton.setPressed(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (motionEvent.getAction() == 2) {
                ColorButton colorButton3 = this.pressedButton;
                if (colorButton3 != colorButton) {
                    if (colorButton3 != null) {
                        colorButton3.setPressed(false);
                    }
                    if (colorButton != null) {
                        colorButton.setPressed(true);
                    }
                    if (this.pressedButton != null && colorButton != null && (callback2 = this.onColorClick) != null) {
                        callback2.run(Integer.valueOf(colorButton.id));
                    }
                    this.pressedButton = colorButton;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (colorButton2 = this.pressedButton) != null && (callback = this.onColorClick) != null) {
                    callback.run(Integer.valueOf(colorButton2.id));
                }
                if (this.buttons != null) {
                    int i2 = 0;
                    while (true) {
                        ColorButton[] colorButtonArr2 = this.buttons;
                        if (i2 >= colorButtonArr2.length) {
                            break;
                        }
                        colorButtonArr2[i2].setPressed(false);
                        i2++;
                    }
                }
                this.pressedButton = null;
            }
            return true;
        }

        public int getColorId() {
            return this.selectedColorId;
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            MessagesController.PeerColors peerColors = this.type == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
            int size2 = peerColors == null ? 0 : peerColors.colors.size();
            int i4 = this.type;
            int i5 = 8;
            int i6 = 2;
            if (i4 == 2) {
                size2 = 8;
            }
            if (i4 != 2 && i4 == 1) {
                i5 = 7;
            }
            float f = size;
            float f2 = i5;
            float f3 = i5 + 1;
            float fMin = Math.min(AndroidUtilities.dp(54.0f), f / ((f3 * 0.28947f) + f2));
            float fMin2 = Math.min(0.28947f * fMin, AndroidUtilities.dp(8.0f));
            float fMin3 = Math.min(0.31578946f * fMin, AndroidUtilities.dp(11.33f));
            int i7 = size2 / i5;
            setMeasuredDimension(size, (int) (((i7 + 1) * fMin3) + (i7 * fMin)));
            ColorButton[] colorButtonArr = this.buttons;
            if (colorButtonArr == null || colorButtonArr.length != size2) {
                this.buttons = new ColorButton[size2];
                int i8 = 0;
                while (i8 < size2) {
                    this.buttons[i8] = new ColorButton();
                    if (this.type == i6) {
                        ColorButton colorButton = this.buttons[i8];
                        int i9 = this.order[i8];
                        colorButton.id = i9;
                        colorButton.setClose(i9 < 0);
                        ColorButton colorButton2 = this.buttons[i8];
                        int i10 = this.order[i8];
                        if (i10 < 0) {
                            i3 = Theme.key_avatar_backgroundGray;
                        } else {
                            int[] iArr = Theme.keys_avatar_nameInMessage;
                            i3 = iArr[i10 % iArr.length];
                        }
                        colorButton2.set(Theme.getColor(i3, this.resourcesProvider));
                    } else if (peerColors != null && i8 >= 0 && i8 < peerColors.colors.size()) {
                        this.buttons[i8].id = peerColors.colors.get(i8).id;
                        this.buttons[i8].set(peerColors.colors.get(i8));
                    }
                    i8++;
                    i6 = 2;
                }
            }
            float f4 = ((f - ((f3 * fMin2) + (f2 * fMin))) / 2.0f) + fMin2;
            if (this.buttons != null) {
                float f5 = f4;
                float f6 = fMin3;
                for (int i11 = 0; i11 < this.buttons.length; i11++) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(f5, f6, f5 + fMin, f6 + fMin);
                    this.buttons[i11].layout(rectF);
                    rectF.inset((-fMin2) / 2.0f, (-fMin3) / 2.0f);
                    this.buttons[i11].layoutClickBounds(rectF);
                    ColorButton colorButton3 = this.buttons[i11];
                    colorButton3.setSelected(colorButton3.id == this.selectedColorId, false);
                    if (i11 % i5 == i5 - 1) {
                        f6 += fMin + fMin3;
                        f5 = f4;
                    } else {
                        f5 = fMin + fMin2 + f5;
                    }
                }
            }
        }

        public void setCloseAsLock(boolean z) {
            this.lock = z;
        }

        public void setDivider(boolean z) {
            this.needDivider = z;
            invalidate();
        }

        public void setOnColorClick(Utilities.Callback<Integer> callback) {
            this.onColorClick = callback;
        }

        public void setSelected(int i, boolean z) {
            this.selectedColorId = i;
            if (this.buttons == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i2 >= colorButtonArr.length) {
                    return;
                }
                ColorButton colorButton = colorButtonArr[i2];
                colorButton.setSelected(colorButton.id == i, z);
                i2++;
            }
        }

        public void updateColors() {
            int i;
            if (this.buttons == null) {
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            MessagesController.PeerColors peerColors = this.type == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
            int i2 = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i2 >= colorButtonArr.length) {
                    invalidate();
                    return;
                }
                int i3 = this.type;
                if (i3 == 2) {
                    ColorButton colorButton = colorButtonArr[i2];
                    int i4 = this.order[i2];
                    colorButton.id = i4;
                    colorButton.setClose(i4 < 0);
                    ColorButton colorButton2 = this.buttons[i2];
                    int i5 = this.order[i2];
                    if (i5 < 0) {
                        i = Theme.key_avatar_backgroundGray;
                    } else {
                        int[] iArr = Theme.keys_avatar_nameInMessage;
                        i = iArr[i5 % iArr.length];
                    }
                    colorButton2.set(Theme.getColor(i, this.resourcesProvider));
                } else if (i2 < 7 && i3 == 1) {
                    ColorButton colorButton3 = colorButtonArr[i2];
                    int i6 = this.order[i2];
                    colorButton3.id = i6;
                    colorButton3.set(Theme.getColor(Theme.keys_avatar_nameInMessage[i6], this.resourcesProvider));
                } else if (peerColors != null && i2 >= 0 && i2 < peerColors.colors.size()) {
                    this.buttons[i2].id = peerColors.colors.get(i2).id;
                    this.buttons[i2].set(peerColors.colors.get(i2));
                }
                i2++;
            }
        }

        public class ColorButton {
            private final ButtonBounce bounce;
            private Paint closePaint;
            private Path closePath;
            private boolean hasClose;
            private boolean hasColor2;
            private boolean hasColor3;
            public int id;
            private Drawable lockDrawable;
            private boolean pressed;
            private boolean selected;
            private final AnimatedFloat selectedT;
            private final Paint paint1 = new Paint(1);
            private final Paint paint2 = new Paint(1);
            private final Paint paint3 = new Paint(1);
            private final Path circlePath = new Path();
            private final Path color2Path = new Path();
            private final RectF bounds = new RectF();
            public final RectF clickBounds = new RectF();

            public ColorButton() {
                this.bounce = new ButtonBounce(PeerColorGrid.this);
                this.selectedT = new AnimatedFloat(PeerColorGrid.this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public void draw(Canvas canvas) {
                canvas.save();
                float scale = this.bounce.getScale(0.05f);
                canvas.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
                canvas.save();
                this.circlePath.rewind();
                this.circlePath.addCircle(this.bounds.centerX(), this.bounds.centerY(), Math.min(this.bounds.height() / 2.0f, this.bounds.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(this.circlePath);
                canvas.drawPaint(this.paint1);
                if (this.hasColor2) {
                    this.color2Path.rewind();
                    Path path = this.color2Path;
                    RectF rectF = this.bounds;
                    path.moveTo(rectF.right, rectF.top);
                    Path path2 = this.color2Path;
                    RectF rectF2 = this.bounds;
                    path2.lineTo(rectF2.right, rectF2.bottom);
                    Path path3 = this.color2Path;
                    RectF rectF3 = this.bounds;
                    path3.lineTo(rectF3.left, rectF3.bottom);
                    this.color2Path.close();
                    canvas.drawPath(this.color2Path, this.paint2);
                }
                canvas.restore();
                if (this.hasColor3) {
                    canvas.save();
                    float fWidth = this.bounds.width() * 0.315f;
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f = fWidth / 2.0f;
                    rectF4.set(this.bounds.centerX() - f, this.bounds.centerY() - f, this.bounds.centerX() + f, this.bounds.centerY() + f);
                    canvas.rotate(45.0f, this.bounds.centerX(), this.bounds.centerY());
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.paint3);
                    canvas.restore();
                }
                float f2 = this.selectedT.set(this.selected);
                if (f2 > 0.0f) {
                    PeerColorGrid.this.backgroundPaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    PeerColorGrid.this.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, PeerColorGrid.this.resourcesProvider));
                    canvas.drawCircle(this.bounds.centerX(), this.bounds.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, f2) * PeerColorGrid.this.backgroundPaint.getStrokeWidth()) + Math.min(this.bounds.height() / 2.0f, this.bounds.width() / 2.0f), PeerColorGrid.this.backgroundPaint);
                }
                if (this.hasClose) {
                    if (PeerColorGrid.this.lock) {
                        if (this.lockDrawable == null) {
                            Drawable drawable = PeerColorGrid.this.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            this.lockDrawable = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        this.lockDrawable.setBounds((int) TextureRenderer$$ExternalSyntheticOutline0.m(this.lockDrawable.getIntrinsicWidth(), 2.0f, 1.2f, this.bounds.centerX()), (int) TextureRenderer$$ExternalSyntheticOutline0.m(this.lockDrawable.getIntrinsicHeight(), 2.0f, 1.2f, this.bounds.centerY()), (int) zzir.m(this.lockDrawable.getIntrinsicWidth(), 2.0f, 1.2f, this.bounds.centerX()), (int) zzir.m(this.lockDrawable.getIntrinsicHeight(), 2.0f, 1.2f, this.bounds.centerY()));
                        this.lockDrawable.draw(canvas);
                    } else {
                        if (this.closePath == null) {
                            this.closePath = new Path();
                        }
                        if (this.closePaint == null) {
                            Paint paint = new Paint(1);
                            this.closePaint = paint;
                            paint.setColor(-1);
                            this.closePaint.setStyle(Paint.Style.STROKE);
                            this.closePaint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        this.closePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        this.closePath.rewind();
                        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), f2);
                        this.closePath.moveTo(this.bounds.centerX() - fLerp, this.bounds.centerY() - fLerp);
                        this.closePath.lineTo(this.bounds.centerX() + fLerp, this.bounds.centerY() + fLerp);
                        this.closePath.moveTo(this.bounds.centerX() + fLerp, this.bounds.centerY() - fLerp);
                        this.closePath.lineTo(this.bounds.centerX() - fLerp, this.bounds.centerY() + fLerp);
                        canvas.drawPath(this.closePath, this.closePaint);
                    }
                }
                canvas.restore();
            }

            public boolean isPressed() {
                return this.pressed;
            }

            public void layout(RectF rectF) {
                this.bounds.set(rectF);
            }

            public void layoutClickBounds(RectF rectF) {
                this.clickBounds.set(rectF);
            }

            public void set(int i) {
                this.hasColor3 = false;
                this.hasColor2 = false;
                this.paint1.setColor(i);
            }

            public void setClose(boolean z) {
                this.hasClose = z;
            }

            public void setPressed(boolean z) {
                ButtonBounce buttonBounce = this.bounce;
                this.pressed = z;
                buttonBounce.setPressed(z);
            }

            public void setSelected(boolean z, boolean z2) {
                this.selected = z;
                if (!z2) {
                    this.selectedT.set(z, true);
                }
                PeerColorGrid.this.invalidate();
            }

            public void set(int i, int i2) {
                this.hasColor2 = true;
                this.hasColor3 = false;
                this.paint1.setColor(i);
                this.paint2.setColor(i2);
            }

            public void set(MessagesController.PeerColor peerColor) {
                boolean zIsDark;
                if (peerColor == null) {
                    return;
                }
                if (PeerColorGrid.this.resourcesProvider != null) {
                    zIsDark = PeerColorGrid.this.resourcesProvider.isDark();
                } else {
                    zIsDark = Theme.currentTheme.isDark();
                }
                if (PeerColorGrid.this.type != 1) {
                    this.paint1.setColor(peerColor.getColor(0, PeerColorGrid.this.resourcesProvider));
                    this.paint2.setColor(peerColor.hasColor6(zIsDark) ? peerColor.getColor(1, PeerColorGrid.this.resourcesProvider) : peerColor.getColor(0, PeerColorGrid.this.resourcesProvider));
                    this.hasColor2 = peerColor.hasColor6(zIsDark);
                    this.hasColor3 = false;
                    return;
                }
                if (!zIsDark || !peerColor.hasColor2() || peerColor.hasColor3()) {
                    this.paint1.setColor(peerColor.getColor(0, PeerColorGrid.this.resourcesProvider));
                    this.paint2.setColor(peerColor.getColor(1, PeerColorGrid.this.resourcesProvider));
                } else {
                    this.paint1.setColor(peerColor.getColor(1, PeerColorGrid.this.resourcesProvider));
                    this.paint2.setColor(peerColor.getColor(0, PeerColorGrid.this.resourcesProvider));
                }
                this.paint3.setColor(peerColor.getColor(2, PeerColorGrid.this.resourcesProvider));
                this.hasColor2 = peerColor.hasColor2(zIsDark);
                this.hasColor3 = peerColor.hasColor3(zIsDark);
            }
        }
    }

    public static class PeerColorSpan extends ReplacementSpan {
        public PeerColorDrawable drawable;
        private int size = AndroidUtilities.dp(21.0f);

        public PeerColorSpan(boolean z, int i, int i2) {
            this.drawable = z ? PeerColorDrawable.fromProfile(i, i2) : PeerColorDrawable.from(i, i2);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            PeerColorDrawable peerColorDrawable = this.drawable;
            if (peerColorDrawable != null) {
                int i6 = (i3 + i5) / 2;
                int iDp = (int) (AndroidUtilities.dp(3.0f) + f);
                int i7 = i6 - this.size;
                float fDp = f + AndroidUtilities.dp(5.0f);
                int i8 = this.size;
                peerColorDrawable.setBounds(iDp, i7, (int) (fDp + i8), i6 + i8);
                this.drawable.draw(canvas);
            }
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.size;
        }

        public PeerColorSpan setSize(int i) {
            PeerColorDrawable peerColorDrawable = this.drawable;
            if (peerColorDrawable != null) {
                peerColorDrawable.setRadius(i / 2.0f);
                this.size = i;
            }
            return this;
        }
    }

    public PeerColorActivity(long j) {
        super(null);
        this.currentColors = new SparseIntArray();
        boolean zIsDark = Theme.currentTheme.isDark();
        this.isDark = zIsDark;
        this.forceDark = zIsDark;
        this.dialogId = j;
        this.isChannel = j != 0;
        if (j >= 0) {
            StarsController.getInstance(this.currentAccount, false).loadStarGifts();
            StarsController.GiftsList giftsList = new StarsController.GiftsList(this.currentAccount, j, false);
            this.gifts = giftsList;
            int i = giftsList.includeFlags;
            int i2 = (i & (-16)) | 8;
            if (i != i2) {
                giftsList.includeFlags = i2;
            }
            giftsList.load();
            StarsController.GiftsList giftsList2 = new StarsController.GiftsList(this.currentAccount, j, false);
            this.giftsWithPeerColor = giftsList2;
            int i3 = giftsList2.includeFlags;
            int i4 = (i3 & (-16)) | 8;
            if (i3 != i4) {
                giftsList2.includeFlags = i4;
            }
            giftsList2.peer_color_available = true;
            giftsList2.load();
        } else {
            this.gifts = null;
            this.giftsWithPeerColor = null;
        }
        this.resourceProvider = new Theme.ResourcesProvider() {
            @Override
            public void applyServiceShaderMatrix(int i5, int i6, float f, float f2) {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i5, i6, f, f2);
            }

            @Override
            public ColorFilter getAnimatedEmojiColorFilter() {
                return Theme.chat_animatedEmojiTextColorFilter;
            }

            @Override
            public int getColor(int i5) {
                int iIndexOfKey = PeerColorActivity.this.currentColors.indexOfKey(i5);
                if (iIndexOfKey >= 0) {
                    return PeerColorActivity.this.currentColors.valueAt(iIndexOfKey);
                }
                return PeerColorActivity.this.parentResourcesProvider != null ? PeerColorActivity.this.parentResourcesProvider.getColor(i5) : Theme.getColor(null, i5, false);
            }

            @Override
            public int getColorOrDefault(int i5) {
                return getColor(i5);
            }

            @Override
            public int getCurrentColor(int i5) {
                return getColor(i5);
            }

            @Override
            public Drawable getDrawable(String str) {
                if (str.equals("drawableMsgIn")) {
                    return PeerColorActivity.this.msgInDrawable;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return PeerColorActivity.this.msgInDrawableSelected;
                }
                return PeerColorActivity.this.parentResourcesProvider != null ? PeerColorActivity.this.parentResourcesProvider.getDrawable(str) : (Drawable) Theme.defaultChatDrawables.get(str);
            }

            @Override
            public Paint getPaint(String str) {
                return Theme.getThemePaint(str);
            }

            @Override
            public boolean hasGradientService() {
                return false;
            }

            @Override
            public boolean isDark() {
                return PeerColorActivity.this.isDark;
            }

            @Override
            public void setAnimatedColor(int i5, int i6) {
            }
        };
        this.msgInDrawable = new MessageDrawable(0, false, false, this.resourceProvider);
        this.msgInDrawableSelected = new MessageDrawable(0, false, true, this.resourceProvider);
    }

    public static int adaptProfileEmojiColor(int i) {
        return Theme.adaptHSV(0.5f, (AndroidUtilities.computePerceivedBrightness(i) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i);
    }

    private void apply() {
        TL_account.updateColor updatecolor;
        TL_account.updateColor updatecolor2;
        int i;
        if (this.applying) {
            return;
        }
        if (this.isChannel || getUserConfig().isPremium()) {
            if (this.isChannel) {
                finishFragment();
            } else {
                TLRPC.User currentUser = getUserConfig().getCurrentUser();
                if (currentUser.color == null) {
                    TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                    currentUser.color = tL_peerColor;
                    tL_peerColor.flags |= 1;
                    tL_peerColor.color = (int) (currentUser.id % 7);
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
                if (this.namePage.selectedColor == UserObject.getColorId(currentUser) && this.namePage.selectedEmoji == UserObject.getEmojiId(currentUser)) {
                    long j = this.namePage.selectedPeerCollectible == null ? 0L : this.namePage.selectedPeerCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = currentUser.color;
                    if (j != (peerColor instanceof TLRPC.TL_peerColorCollectible ? peerColor.collectible_id : 0L)) {
                        this.applyingName = true;
                        updatecolor = new TL_account.updateColor();
                        currentUser.flags2 |= 256;
                        currentUser.color.flags |= 1;
                        if (this.namePage.selectedPeerCollectible != null) {
                            updatecolor.flags |= 4;
                            TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                            updatecolor.color = tL_inputPeerColorCollectible;
                            tL_inputPeerColorCollectible.collectible_id = this.namePage.selectedPeerCollectible.collectible_id;
                            currentUser.color = this.namePage.selectedPeerCollectible;
                        } else {
                            updatecolor.flags |= 4;
                            TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                            updatecolor.color = tL_peerColor2;
                            tL_peerColor2.flags |= 1;
                            tL_peerColor2.color = this.namePage.selectedColor;
                            TLRPC.PeerColor peerColor2 = currentUser.color;
                            peerColor2.flags |= 1;
                            peerColor2.color = this.namePage.selectedColor;
                            if (this.namePage.selectedEmoji != 0) {
                                updatecolor.flags |= 1;
                                TLRPC.PeerColor peerColor3 = currentUser.color;
                                peerColor3.flags |= 2;
                                TLRPC.PeerColor peerColor4 = updatecolor.color;
                                peerColor4.flags |= 2;
                                long j2 = this.namePage.selectedEmoji;
                                peerColor3.background_emoji_id = j2;
                                peerColor4.background_emoji_id = j2;
                            } else {
                                TLRPC.PeerColor peerColor5 = currentUser.color;
                                peerColor5.flags &= -3;
                                peerColor5.background_emoji_id = 0L;
                            }
                        }
                        getConnectionsManager().sendRequest(updatecolor, null);
                    }
                } else {
                    this.applyingName = true;
                    updatecolor = new TL_account.updateColor();
                    currentUser.flags2 |= 256;
                    currentUser.color.flags |= 1;
                    if (this.namePage.selectedPeerCollectible != null) {
                        updatecolor.flags |= 4;
                        TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible2 = new TLRPC.TL_inputPeerColorCollectible();
                        updatecolor.color = tL_inputPeerColorCollectible2;
                        tL_inputPeerColorCollectible2.collectible_id = this.namePage.selectedPeerCollectible.collectible_id;
                        currentUser.color = this.namePage.selectedPeerCollectible;
                    } else {
                        updatecolor.flags |= 4;
                        TLRPC.TL_peerColor tL_peerColor3 = new TLRPC.TL_peerColor();
                        updatecolor.color = tL_peerColor3;
                        tL_peerColor3.flags |= 1;
                        tL_peerColor3.color = this.namePage.selectedColor;
                        TLRPC.PeerColor peerColor6 = currentUser.color;
                        peerColor6.flags |= 1;
                        peerColor6.color = this.namePage.selectedColor;
                        if (this.namePage.selectedEmoji != 0) {
                            updatecolor.flags |= 1;
                            TLRPC.PeerColor peerColor7 = currentUser.color;
                            peerColor7.flags |= 2;
                            TLRPC.PeerColor peerColor8 = updatecolor.color;
                            peerColor8.flags |= 2;
                            long j3 = this.namePage.selectedEmoji;
                            peerColor7.background_emoji_id = j3;
                            peerColor8.background_emoji_id = j3;
                        } else {
                            TLRPC.PeerColor peerColor9 = currentUser.color;
                            peerColor9.flags &= -3;
                            peerColor9.background_emoji_id = 0L;
                        }
                    }
                    getConnectionsManager().sendRequest(updatecolor, null);
                }
                if (this.profilePage.selectedColor != UserObject.getProfileColorId(currentUser) || this.profilePage.selectedEmoji != UserObject.getOnlyProfileEmojiId(currentUser)) {
                    this.applyingProfile = true;
                    if (currentUser.profile_color == null) {
                        currentUser.profile_color = new TLRPC.TL_peerColor();
                    }
                    updatecolor2 = new TL_account.updateColor();
                    updatecolor2.for_profile = true;
                    currentUser.flags2 |= 512;
                    if (this.profilePage.selectedColor < 0) {
                        currentUser.profile_color.flags &= -2;
                    } else {
                        if (updatecolor2.color == null) {
                            updatecolor2.flags |= 4;
                            updatecolor2.color = new TLRPC.TL_peerColor();
                        }
                        TLRPC.PeerColor peerColor10 = updatecolor2.color;
                        peerColor10.flags |= 1;
                        peerColor10.color = this.profilePage.selectedColor;
                        TLRPC.PeerColor peerColor11 = currentUser.profile_color;
                        peerColor11.flags |= 1;
                        peerColor11.color = this.profilePage.selectedColor;
                    }
                    if (this.profilePage.selectedEmoji != 0) {
                        i = updatecolor2.flags;
                        updatecolor2.flags = i | 1;
                        currentUser.profile_color.flags |= 2;
                        if (updatecolor2.color == null) {
                            updatecolor2.flags = i | 5;
                            updatecolor2.color = new TLRPC.TL_peerColor();
                        }
                        TLRPC.PeerColor peerColor12 = updatecolor2.color;
                        peerColor12.flags |= 2;
                        TLRPC.PeerColor peerColor13 = currentUser.profile_color;
                        long j4 = this.profilePage.selectedEmoji;
                        peerColor13.background_emoji_id = j4;
                        peerColor12.background_emoji_id = j4;
                    } else {
                        TLRPC.PeerColor peerColor14 = currentUser.profile_color;
                        peerColor14.flags &= -3;
                        peerColor14.background_emoji_id = 0L;
                    }
                    getConnectionsManager().sendRequest(updatecolor2, null);
                } else if ((this.profilePage.selectedEmojiCollectible == null ? 0L : this.profilePage.selectedEmojiCollectible.collectible_id) != UserObject.getProfileCollectibleId(currentUser)) {
                    this.applyingProfile = true;
                    if (currentUser.profile_color == null) {
                        currentUser.profile_color = new TLRPC.TL_peerColor();
                    }
                    updatecolor2 = new TL_account.updateColor();
                    updatecolor2.for_profile = true;
                    currentUser.flags2 |= 512;
                    if (this.profilePage.selectedColor < 0) {
                        currentUser.profile_color.flags &= -2;
                    } else {
                        if (updatecolor2.color == null) {
                            updatecolor2.flags |= 4;
                            updatecolor2.color = new TLRPC.TL_peerColor();
                        }
                        TLRPC.PeerColor peerColor15 = updatecolor2.color;
                        peerColor15.flags |= 1;
                        peerColor15.color = this.profilePage.selectedColor;
                        TLRPC.PeerColor peerColor16 = currentUser.profile_color;
                        peerColor16.flags |= 1;
                        peerColor16.color = this.profilePage.selectedColor;
                    }
                    if (this.profilePage.selectedEmoji != 0) {
                        i = updatecolor2.flags;
                        updatecolor2.flags = i | 1;
                        currentUser.profile_color.flags |= 2;
                        if (updatecolor2.color == null) {
                            updatecolor2.flags = i | 5;
                            updatecolor2.color = new TLRPC.TL_peerColor();
                        }
                        TLRPC.PeerColor peerColor17 = updatecolor2.color;
                        peerColor17.flags |= 2;
                        TLRPC.PeerColor peerColor18 = currentUser.profile_color;
                        long j5 = this.profilePage.selectedEmoji;
                        peerColor18.background_emoji_id = j5;
                        peerColor17.background_emoji_id = j5;
                    } else {
                        TLRPC.PeerColor peerColor19 = currentUser.profile_color;
                        peerColor19.flags &= -3;
                        peerColor19.background_emoji_id = 0L;
                    }
                    getConnectionsManager().sendRequest(updatecolor2, null);
                }
                if (!eq(currentUser.emoji_status, this.profilePage.selectedEmojiCollectible) && (this.profilePage.selectedEmojiCollectible != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    if (this.profilePage.selectedEmojiCollectible != null) {
                        long j6 = this.profilePage.selectedEmojiCollectible.collectible_id;
                        for (int i2 = 0; i2 < this.profilePage.uniqueGifts.size(); i2++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.profilePage.uniqueGifts.get(i2);
                            if (tL_starGiftUnique2.id == j6) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                        }
                    }
                    if (tL_starGiftUnique != null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                    }
                    getMessagesController().updateEmojiStatus(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().putUser(currentUser, false);
                getUserConfig().saveConfig(true);
                finishFragment();
                showBulletin();
            }
            this.applying = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public void buttonClick() {
        if (this.loading) {
            return;
        }
        if (this.isChannel) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, getContext(), getCurrentAccount(), false, 23, true, null));
            return;
        }
        Page page = this.viewPager.getCurrentPosition() == 1 ? this.namePage : this.profilePage;
        if (page.selectedResaleGift != null) {
            (this.viewPager.getCurrentPosition() == 1 ? this.profilePage : this.namePage).setupValues();
            this.loading = true;
            page.button.setLoading(true);
            buy(page.selectedResaleGift, new OAuthSheet$$ExternalSyntheticLambda1(9, this, page));
            return;
        }
        Page page2 = this.viewPager.getCurrentPosition() == 1 ? this.profilePage : this.namePage;
        if (page2.selectedResaleGift != null) {
            page2.setupValues();
        }
        apply();
        finishFragment();
        showBulletin();
    }

    public static boolean eq(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z && tL_emojiStatusCollectible != null && z && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    private List<TLRPC.TL_availableReaction> getAvailableReactions() {
        return getMediaDataController().getReactionsList();
    }

    public void lambda$buttonClick$5(Page page, Boolean bool) {
        this.loading = false;
        page.button.setLoading(false);
        if (bool.booleanValue()) {
            apply();
            finishFragment();
            showBulletin();
        }
    }

    public static void lambda$buy$6(Browser.Progress progress, Utilities.Callback callback, Boolean bool, String str) {
        progress.end();
        if (callback != null) {
            callback.run(bool);
        }
    }

    public void lambda$buy$7(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Utilities.Callback callback, StarGiftSheet.PaymentFormState paymentFormState, Browser.Progress progress) {
        zArr[0] = true;
        progress.init();
        StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, null, true, new OAuthSheet$$ExternalSyntheticLambda19(9, progress, callback));
    }

    public static void lambda$buy$8(boolean[] zArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        if (zArr[0] || callback == null) {
            return;
        }
        callback.run(Boolean.FALSE);
    }

    public void lambda$buy$9(AmountUtils$Currency amountUtils$Currency, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Utilities.Callback callback, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        StarGiftSheet.PaymentFormState paymentFormState = new StarGiftSheet.PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = new StarGiftSheet.ResaleBuyTransferAlert(getContext(), this.resourceProvider, tL_starGiftUnique, paymentFormState, this.currentAccount, j, BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb), false, new PeerColorActivity$$ExternalSyntheticLambda7(this, zArr, tL_starGiftUnique, j, callback, 0));
        resaleBuyTransferAlert.alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda23(4, (Object) callback, zArr));
        resaleBuyTransferAlert.show();
    }

    public void lambda$createView$0(Integer num) {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            viewPagerFixed.scrollToPosition(num.intValue());
        }
    }

    public void lambda$createView$1(View view) {
        if (onBackPressed(true)) {
            finishFragment();
        }
    }

    public void lambda$createView$2(View view) {
        toggleTheme();
    }

    public void lambda$showUnsavedAlert$3(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$showUnsavedAlert$4(AlertDialog alertDialog, int i) {
        buttonClick();
    }

    public static boolean lambda$toggleTheme$10(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$toggleTheme$11() {
        this.isDark = !this.isDark;
        updateThemeColors();
        setForceDark(this.isDark, true);
        updateColors();
    }

    private void setLoading(boolean z) {
        Page page = this.namePage;
        if (page != null && page.button != null) {
            this.namePage.button.setLoading(z);
        }
        Page page2 = this.profilePage;
        if (page2 == null || page2.button == null) {
            return;
        }
        this.profilePage.button.setLoading(z);
    }

    private void showBulletin() {
        if (this.bulletinFragment != null) {
            if (!this.applyingName || (this.applyingProfile && getCurrentPage() != this.namePage)) {
                if (this.applyingProfile && (!this.applyingName || getCurrentPage() == this.profilePage)) {
                    if (this.profilePage.selectedColor >= 0) {
                        BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(PeerColorDrawable.fromProfile(this.currentAccount, this.profilePage.selectedColor), LocaleController.getString(this.isChannel ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).show();
                    } else if (this.profilePage.selectedEmoji != 0) {
                        BulletinFactory.of(this.bulletinFragment).createStaticEmojiBulletin(AnimatedEmojiDrawable.findDocument(this.currentAccount, this.profilePage.selectedEmoji), LocaleController.getString(this.isChannel ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied)).show();
                    } else {
                        FactCheckController$$ExternalSyntheticOutline0.m(this.isChannel ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, BulletinFactory.of(this.bulletinFragment), R.raw.contact_check);
                    }
                }
            } else if (this.namePage.selectedColor >= 0) {
                BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(PeerColorDrawable.from(this.currentAccount, this.namePage.selectedColor), LocaleController.getString(this.isChannel ? R.string.ChannelColorApplied : R.string.UserColorApplied)).show();
            } else if (this.namePage.selectedPeerCollectible == null) {
                return;
            } else {
                BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(PeerColorDrawable.from(this.namePage.selectedPeerCollectible), LocaleController.getString(this.isChannel ? R.string.ChannelColorApplied : R.string.UserColorApplied)).show();
            }
            this.bulletinFragment = null;
        }
    }

    private void showUnsavedAlert() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i = 0;
        final int i2 = 1;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(this.isChannel ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved)).setMessage(LocaleController.getString(this.isChannel ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage)).setNegativeButton(LocaleController.getString(R.string.Dismiss), new AlertDialog.OnButtonClickListener(this) {
            public final PeerColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$showUnsavedAlert$3(alertDialog, i3);
                        break;
                    default:
                        this.f$0.lambda$showUnsavedAlert$4(alertDialog, i3);
                        break;
                }
            }
        }).setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
            public final PeerColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$showUnsavedAlert$3(alertDialog, i3);
                        break;
                    default:
                        this.f$0.lambda$showUnsavedAlert$4(alertDialog, i3);
                        break;
                }
            }
        }).create();
        showDialog(alertDialogCreate);
        ((TextView) alertDialogCreate.getButton(-2)).setTextColor(getThemedColor(Theme.key_text_RedBold));
    }

    public void updateColors() {
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        SimpleTextView simpleTextView = this.titleView;
        if (simpleTextView != null) {
            simpleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        }
        this.namePage.updateColors();
        this.profilePage.updateColors();
        ColoredActionBar coloredActionBar = this.colorBar;
        if (coloredActionBar != null) {
            coloredActionBar.updateColors();
        }
        setNavigationBarColor(getNavigationBarColor());
    }

    public static CharSequence withLevelLock(CharSequence charSequence, int i) {
        if (i <= 0) {
            return charSequence;
        }
        Context context = ApplicationLoader.applicationContext;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  L");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(new LevelLock(context, i, null));
        coloredImageSpan.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public void buy(TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback<Boolean> callback) {
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        AmountUtils$Currency amountUtils$Currency = tL_starGiftUnique.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
        StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(tL_starGiftUnique, clientUserId, null, true, new PeerColorActivity$$ExternalSyntheticLambda12(this, amountUtils$Currency, tL_starGiftUnique, clientUserId, callback));
    }

    @Override
    public View createView(Context context) {
        final int i = 1;
        this.namePage = new Page(context, 1);
        final int i2 = 0;
        this.profilePage = new Page(context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onMeasure(int i3, int i4) {
                if (PeerColorActivity.this.actionBarContainer != null) {
                    ((ViewGroup.MarginLayoutParams) PeerColorActivity.this.actionBarContainer.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) PeerColorActivity.this.actionBarContainer.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i3, i4);
            }
        };
        frameLayout.setFitsSystemWindows(true);
        this.colorBar = new ColoredActionBar(context, this.resourceProvider) {
            private int lastBtnColor = 0;

            @Override
            public void onUpdateColor() {
                PeerColorActivity.this.updateLightStatusBar();
                updateActionBarButtonsColor();
                if (PeerColorActivity.this.tabsView != null) {
                    PeerColorActivity.this.tabsView.setBackgroundColor(getTabsViewBackgroundColor());
                }
            }

            public void updateActionBarButtonsColor() {
                int actionBarButtonColor = getActionBarButtonColor();
                if (this.lastBtnColor != actionBarButtonColor) {
                    if (PeerColorActivity.this.backButton != null) {
                        this.lastBtnColor = actionBarButtonColor;
                        PeerColorActivity.this.backButton.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
                    }
                    if (PeerColorActivity.this.dayNightItem != null) {
                        this.lastBtnColor = actionBarButtonColor;
                        PeerColorActivity.this.dayNightItem.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
                    }
                }
            }
        };
        this.profilePage.updateProfilePreview(false);
        frameLayout.addView(this.colorBar, LayoutHelper.createFrame(-1, -2, 55));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public void onTabAnimationUpdate(boolean z) {
                PeerColorActivity.this.tabsView.setSelected(PeerColorActivity.this.viewPager.getPositionAnimated());
                PeerColorActivity.this.colorBar.setProgressToGradient(1.0f - PeerColorActivity.this.viewPager.getPositionAnimated());
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void bindView(View view, int i3, int i4) {
            }

            @Override
            public View createView(int i3) {
                if (i3 == 1) {
                    return PeerColorActivity.this.namePage;
                }
                if (i3 == 0) {
                    return PeerColorActivity.this.profilePage;
                }
                return null;
            }

            @Override
            public int getItemCount() {
                return 2;
            }

            @Override
            public int getItemViewType(int i3) {
                return i3;
            }
        });
        frameLayout.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.actionBarContainer = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 55));
        if (this.isChannel) {
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleView = simpleTextView;
            simpleTextView.setText(LocaleController.getString(R.string.ChannelColorTitle2));
            this.titleView.setEllipsizeByGradient(true);
            this.titleView.setTextSize(20);
            this.titleView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.actionBarContainer.addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            FilledTabsView filledTabsView = new FilledTabsView(context);
            this.tabsView = filledTabsView;
            filledTabsView.setTabs(LocaleController.getString(this.isChannel ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(this.isChannel ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.tabsView.onTabSelected(new PollItemMenu$$ExternalSyntheticLambda15(this, 15));
            this.actionBarContainer.addView(this.tabsView, LayoutHelper.createFrame(-1, 40, 17));
        }
        ColoredActionBar coloredActionBar = this.colorBar;
        if (coloredActionBar != null) {
            coloredActionBar.setProgressToGradient(1.0f);
            updateLightStatusBar();
        }
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.backButton;
        int i3 = Theme.key_actionBarWhiteSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.backButton.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.backButton;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.backButton.setOnClickListener(new View.OnClickListener(this) {
            public final PeerColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$1(view);
                        break;
                    default:
                        this.f$0.lambda$createView$2(view);
                        break;
                }
            }
        });
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(54, 54, 19));
        int i4 = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, Fragment$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.sunDrawable = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        if (this.isDark) {
            this.sunDrawable.setCurrentFrame(35);
            this.sunDrawable.setCustomEndFrame(36);
        } else {
            this.sunDrawable.setCustomEndFrame(0);
            this.sunDrawable.setCurrentFrame(0);
        }
        this.sunDrawable.beginApplyLayerColors();
        int color = Theme.getColor(null, Theme.key_chats_menuName, false);
        this.sunDrawable.setLayerColor("Sunny", color);
        this.sunDrawable.setLayerColor("Path 6", color);
        this.sunDrawable.setLayerColor("Path", color);
        this.sunDrawable.setLayerColor("Path 5", color);
        this.sunDrawable.commitApplyLayerColors();
        ImageView imageView4 = new ImageView(context);
        this.dayNightItem = imageView4;
        imageView4.setScaleType(scaleType);
        this.dayNightItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.dayNightItem.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.dayNightItem.setOnClickListener(new View.OnClickListener(this) {
            public final PeerColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$1(view);
                        break;
                    default:
                        this.f$0.lambda$createView$2(view);
                        break;
                }
            }
        });
        this.actionBarContainer.addView(this.dayNightItem, LayoutHelper.createFrame(54, 54, 21));
        this.dayNightItem.setImageDrawable(this.sunDrawable);
        this.colorBar.updateColors();
        this.contentView = frameLayout;
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            this.namePage.premiumChanged();
            this.profilePage.premiumChanged();
        } else if (i == NotificationCenter.starUserGiftsLoaded) {
            this.namePage.update();
            this.profilePage.update();
        } else if (i == NotificationCenter.starGiftsLoaded) {
            this.namePage.update();
            this.profilePage.update();
        }
    }

    public Page getCurrentPage() {
        return this.viewPager.getCurrentPosition() == 0 ? this.profilePage : this.namePage;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda0(this, 27), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    public boolean hasUnsavedChanged() {
        return this.namePage.hasUnsavedChanged() || this.profilePage.hasUnsavedChanged();
    }

    @Override
    public boolean isLightStatusBar() {
        ColoredActionBar coloredActionBar = this.colorBar;
        if (coloredActionBar == null) {
            return super.isLightStatusBar();
        }
        return ColorUtils.calculateLuminance(coloredActionBar.getColor()) > 0.699999988079071d;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.isChannel && hasUnsavedChanged() && getUserConfig().isPremium()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.isChannel || !hasUnsavedChanged() || !getUserConfig().isPremium()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        showUnsavedAlert();
        return false;
    }

    @Override
    public void onFragmentClosed() {
        super.onFragmentClosed();
        Bulletin.removeDelegate(this);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return true;
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(62.0f);
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        });
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    public void setForceDark(boolean z, boolean z2) {
        if (this.forceDark == z) {
            return;
        }
        this.forceDark = z;
        if (z2) {
            RLottieDrawable rLottieDrawable = this.sunDrawable;
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.getFramesCount() : 0);
            RLottieDrawable rLottieDrawable2 = this.sunDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.start();
                return;
            }
            return;
        }
        int framesCount = z ? this.sunDrawable.getFramesCount() - 1 : 0;
        this.sunDrawable.setCurrentFrame(framesCount, false, true);
        this.sunDrawable.setCustomEndFrame(framesCount);
        ImageView imageView = this.dayNightItem;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public PeerColorActivity setOnApplied(BaseFragment baseFragment) {
        this.bulletinFragment = baseFragment;
        return this;
    }

    @Override
    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.parentResourcesProvider = resourcesProvider;
    }

    public PeerColorActivity startOnProfile() {
        this.startAtProfile = true;
        return this;
    }

    public void toggleTheme() {
        FrameLayout frameLayout = (FrameLayout) getParentActivity().getWindow().getDecorView();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.dayNightItem.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.dayNightItem.setAlpha(1.0f);
        final Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        final Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.dayNightItem.getLocationInWindow(iArr);
        final float f = iArr[0];
        final float f2 = iArr[1];
        final float measuredWidth = (this.dayNightItem.getMeasuredWidth() / 2.0f) + f;
        final float measuredHeight = (this.dayNightItem.getMeasuredHeight() / 2.0f) + f2;
        final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        View view = new View(getContext()) {
            @Override
            public void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (PeerColorActivity.this.isDark) {
                    if (PeerColorActivity.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, PeerColorActivity.this.changeDayNightViewProgress * fMax, paint);
                    }
                    canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas2.drawCircle(measuredWidth, measuredHeight, (1.0f - PeerColorActivity.this.changeDayNightViewProgress) * fMax, paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                PeerColorActivity.this.dayNightItem.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightView = view;
        view.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(22));
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PeerColorActivity.this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PeerColorActivity.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || PeerColorActivity.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (PeerColorActivity.this.changeDayNightView != null) {
                    if (PeerColorActivity.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) PeerColorActivity.this.changeDayNightView.getParent()).removeView(PeerColorActivity.this.changeDayNightView);
                    }
                    PeerColorActivity.this.changeDayNightView = null;
                }
                PeerColorActivity.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(this, 9));
    }

    public void updateLightStatusBar() {
        if (getParentActivity() == null) {
            return;
        }
        AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
    }

    public void updateThemeColors() {
        Theme.ThemeInfo themeInfo;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] iArr;
        int i;
        Theme.ThemeAccent accent;
        Page page;
        int i2;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        HashMap map = Theme.themesDict;
        if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
            string2 = "Dark Blue";
        }
        Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
        if (string.equals(string2)) {
            if (themeInfo2.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            if (this.isDark) {
                themeInfo = (Theme.ThemeInfo) map.get(str3);
            } else {
                themeInfo = (Theme.ThemeInfo) map.get(str2);
            }
            this.currentColors.clear();
            strArr = new String[1];
            str = themeInfo.assetName;
            if (str != null) {
                themeFileValues = Theme.getThemeFileValues(null, str, strArr);
            } else {
                themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
            }
            iArr = Theme.defaultColors;
            if (iArr != null) {
                for (i2 = 0; i2 < iArr.length; i2++) {
                    this.currentColors.put(i2, iArr[i2]);
                }
            }
            for (i = 0; i < themeFileValues.size(); i++) {
                this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
            }
            accent = themeInfo.getAccent(false);
            if (accent != null) {
                accent.fillAccentColors(themeFileValues, this.currentColors);
            }
            page = this.namePage;
            if (page != null || page.messagesCellPreview == null) {
            }
            MHTML mhtmlCreateBackgroundDrawable = Theme.createBackgroundDrawable(themeInfo, this.currentColors, strArr[0], 0, true);
            ThemePreviewMessagesCell themePreviewMessagesCell = this.namePage.messagesCellPreview;
            Drawable drawable = (BitmapDrawable) mhtmlCreateBackgroundDrawable.boundary;
            if (drawable == null) {
                drawable = (Drawable) mhtmlCreateBackgroundDrawable.file;
            }
            themePreviewMessagesCell.setOverrideBackground(drawable);
            return;
        }
        str3 = string2;
        str2 = string;
        if (this.isDark) {
            themeInfo = (Theme.ThemeInfo) map.get(str3);
        } else {
            themeInfo = (Theme.ThemeInfo) map.get(str2);
        }
        this.currentColors.clear();
        strArr = new String[1];
        str = themeInfo.assetName;
        if (str != null) {
            themeFileValues = Theme.getThemeFileValues(null, str, strArr);
        } else {
            themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
        }
        iArr = Theme.defaultColors;
        if (iArr != null) {
            while (i2 < iArr.length) {
                this.currentColors.put(i2, iArr[i2]);
            }
        }
        while (i < themeFileValues.size()) {
            this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
        }
        accent = themeInfo.getAccent(false);
        if (accent != null) {
            accent.fillAccentColors(themeFileValues, this.currentColors);
        }
        page = this.namePage;
        if (page != null) {
        }
    }

    public static class PeerColorDrawable extends Drawable {
        private final Path clipCirclePath;
        private final Paint color1Paint;
        private final Paint color2Paint;
        private final Path color2Path;
        private final Paint color3Paint;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        private final boolean hasColor3;
        private float radius = AndroidUtilities.dpf2(10.6665f);
        private Paint strokePaint;

        public PeerColorDrawable(int i, int i2, int i3) {
            Paint paint = new Paint(1);
            this.color1Paint = paint;
            Paint paint2 = new Paint(1);
            this.color2Paint = paint2;
            Paint paint3 = new Paint(1);
            this.color3Paint = paint3;
            this.color2Path = new Path();
            this.clipCirclePath = new Path();
            this.hasColor3 = i3 != i;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            this.emoji = null;
            initPath();
        }

        public static PeerColorDrawable from(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
            int i = tL_emojiStatusCollectible.center_color | (-16777216);
            return new PeerColorDrawable(i, i, i, tL_emojiStatusCollectible.document_id);
        }

        public static PeerColorDrawable fromProfile(int i, int i2) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i).profilePeerColors;
            return from(peerColors == null ? null : peerColors.getColor(i2), true);
        }

        private void initPath() {
            this.clipCirclePath.rewind();
            Path path = this.clipCirclePath;
            float f = this.radius;
            path.addCircle(f, f, f, Path.Direction.CW);
            this.color2Path.rewind();
            this.color2Path.moveTo(this.radius * 2.0f, 0.0f);
            Path path2 = this.color2Path;
            float f2 = this.radius * 2.0f;
            path2.lineTo(f2, f2);
            this.color2Path.lineTo(0.0f, this.radius * 2.0f);
            this.color2Path.close();
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().centerX() - this.radius, getBounds().centerY() - this.radius);
            Paint paint = this.strokePaint;
            if (paint != null) {
                float f = this.radius;
                canvas.drawCircle(f, f, f, paint);
            }
            canvas.clipPath(this.clipCirclePath);
            canvas.drawPaint(this.color1Paint);
            canvas.drawPath(this.color2Path, this.color2Paint);
            if (this.hasColor3) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.radius - AndroidUtilities.dp(3.66f), this.radius - AndroidUtilities.dp(3.66f), this.radius + AndroidUtilities.dp(3.66f), this.radius + AndroidUtilities.dp(3.66f));
                float f2 = this.radius;
                canvas.rotate(45.0f, f2, f2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.color3Paint);
            }
            canvas.restore();
            if (this.emoji != null) {
                int iDp = AndroidUtilities.dp(14.0f) / 2;
                this.emoji.setBounds(getBounds().centerX() - iDp, getBounds().centerY() - iDp, getBounds().centerX() + iDp, getBounds().centerY() + iDp);
                this.emoji.draw(canvas);
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return (int) (this.radius * 2.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.radius * 2.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public PeerColorDrawable setRadius(float f) {
            this.radius = f;
            initPath();
            return this;
        }

        public PeerColorDrawable setView(View view) {
            if (view == null) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.detach();
                    this.emoji.setParentView(null);
                }
                return this;
            }
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emoji;
            if (swapAnimatedEmojiDrawable2 != null) {
                swapAnimatedEmojiDrawable2.setParentView(view);
            }
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view2) {
                    if (PeerColorDrawable.this.emoji != null) {
                        PeerColorDrawable.this.emoji.attach();
                    }
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    if (PeerColorDrawable.this.emoji != null) {
                        PeerColorDrawable.this.emoji.detach();
                    }
                }
            });
            return this;
        }

        public PeerColorDrawable stroke(float f, int i) {
            if (this.strokePaint == null) {
                Paint paint = new Paint(1);
                this.strokePaint = paint;
                paint.setStyle(Paint.Style.STROKE);
            }
            this.strokePaint.setStrokeWidth(f);
            this.strokePaint.setColor(i);
            return this;
        }

        public static PeerColorDrawable from(int i, int i2) {
            if (i2 < 7) {
                int[] iArr = Theme.keys_avatar_nameInMessage;
                return new PeerColorDrawable(Theme.getColor(null, iArr[i2], false), Theme.getColor(null, iArr[i2], false), Theme.getColor(null, iArr[i2], false));
            }
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
            return from(peerColors != null ? peerColors.getColor(i2) : null, false);
        }

        public static PeerColorDrawable from(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor == null) {
                return new PeerColorDrawable(0, 0, 0);
            }
            return new PeerColorDrawable(peerColor.getColor1(), (!z || peerColor.hasColor6(Theme.currentTheme.isDark())) ? peerColor.getColor2() : peerColor.getColor1(), z ? peerColor.getColor1() : peerColor.getColor3());
        }

        public PeerColorDrawable(int i, int i2, int i3, long j) {
            Paint paint = new Paint(1);
            this.color1Paint = paint;
            Paint paint2 = new Paint(1);
            this.color2Paint = paint2;
            Paint paint3 = new Paint(1);
            this.color3Paint = paint3;
            this.color2Path = new Path();
            this.clipCirclePath = new Path();
            this.hasColor3 = i3 != i;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            initPath();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, AndroidUtilities.dp(14.0f));
            this.emoji = swapAnimatedEmojiDrawable;
            swapAnimatedEmojiDrawable.set(j, false);
        }

        public static PeerColorDrawable from(TLRPC.TL_peerColorCollectible tL_peerColorCollectible) {
            ArrayList<Integer> arrayList;
            if (!Theme.currentTheme.isDark() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int iIntValue = arrayList.get(0).intValue() | (-16777216);
            return new PeerColorDrawable(iIntValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue, tL_peerColorCollectible.gift_emoji_id);
        }
    }

    public static class ColoredActionBar extends View {
        private RadialGradient backgroundGradient;
        private int backgroundGradientColor1;
        private int backgroundGradientColor2;
        private int backgroundGradientHeight;
        private int backgroundGradientWidth;
        private final Paint backgroundPaint;
        public int color1;
        private final AnimatedColor color1Animated;
        public int color2;
        private final AnimatedColor color2Animated;
        private int defaultColor;
        protected boolean ignoreMeasure;
        public boolean isDefault;
        private float progressToGradient;
        private final Theme.ResourcesProvider resourcesProvider;

        public ColoredActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.progressToGradient = 0.0f;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.color1Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.color2Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.backgroundPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            this.defaultColor = Theme.getColor(Theme.key_actionBarDefault, resourcesProvider);
            setColor(-1, -1, false);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            int i = this.color1Animated.set(this.color1);
            int i2 = this.color2Animated.set(this.color2);
            if (this.backgroundGradient == null || this.backgroundGradientColor1 != i || this.backgroundGradientColor2 != i2 || this.backgroundGradientWidth != getWidth() || this.backgroundGradientHeight != getHeight()) {
                this.backgroundGradientWidth = getWidth();
                this.backgroundGradientHeight = getHeight();
                float f = this.backgroundGradientWidth;
                float f2 = this.backgroundGradientHeight;
                float fDistance = AndroidUtilities.distance(0.0f, 0.0f, f, f2) * 0.75f;
                this.backgroundGradientColor2 = i2;
                this.backgroundGradientColor1 = i;
                RadialGradient radialGradient = new RadialGradient(f / 2.0f, 0.4f * f2, fDistance, new int[]{i2, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.backgroundGradient = radialGradient;
                this.backgroundPaint.setShader(radialGradient);
                onUpdateColor();
            }
            if (this.progressToGradient < 1.0f) {
                canvas.drawColor(this.defaultColor);
            }
            float f3 = this.progressToGradient;
            if (f3 > 0.0f) {
                this.backgroundPaint.setAlpha((int) (f3 * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundPaint);
            }
        }

        public int getActionBarButtonColor() {
            int i = Theme.key_actionBarDefaultIcon;
            return ColorUtils.blendARGB(this.progressToGradient, Theme.getColor(i, this.resourcesProvider), this.isDefault ? Theme.getColor(i, this.resourcesProvider) : -1);
        }

        public int getColor() {
            return ColorUtils.blendARGB(this.progressToGradient, Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider), ColorUtils.blendARGB(0.75f, this.color1Animated.get(), this.color2Animated.get()));
        }

        public int getTabsViewBackgroundColor() {
            int i = Theme.key_actionBarDefault;
            return ColorUtils.blendARGB(this.progressToGradient, AndroidUtilities.computePerceivedBrightness(Theme.getColor(i, this.resourcesProvider)) > 0.721f ? Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider) : Theme.adaptHSV(0.08f, -0.08f, Theme.getColor(i, this.resourcesProvider)), AndroidUtilities.computePerceivedBrightness(ColorUtils.blendARGB(0.75f, this.color1Animated.get(), this.color2Animated.get())) > 0.721f ? Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourcesProvider) : Theme.adaptHSV(0.08f, -0.08f, ColorUtils.blendARGB(0.75f, this.color1Animated.get(), this.color2Animated.get())));
        }

        @Override
        public void onMeasure(int i, int i2) {
            if (!this.ignoreMeasure) {
                i2 = ArticleViewer$10$$ExternalSyntheticOutline0.m(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
            }
            super.onMeasure(i, i2);
        }

        public void onUpdateColor() {
        }

        public void setColor(int i, int i2, boolean z) {
            MessagesController.PeerColors peerColors;
            MessagesController.PeerColor color = null;
            if (i2 >= 0 && i >= 0 && (peerColors = MessagesController.getInstance(i).profilePeerColors) != null) {
                color = peerColors.getColor(i2);
            }
            setColor(color, z);
        }

        public void setProgressToGradient(float f) {
            if (Math.abs(this.progressToGradient - f) > 0.001f) {
                this.progressToGradient = f;
                onUpdateColor();
                invalidate();
            }
        }

        public void updateColors() {
            this.defaultColor = Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider);
            onUpdateColor();
            invalidate();
        }

        public void setColor(MessagesController.PeerColor peerColor, boolean z) {
            this.isDefault = false;
            if (peerColor == null) {
                this.isDefault = true;
                int color = Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider);
                this.color2 = color;
                this.color1 = color;
            } else {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                this.color1 = peerColor.getBgColor1(zIsDark);
                this.color2 = peerColor.getBgColor2(zIsDark);
            }
            if (!z) {
                this.color1Animated.set(this.color1, true);
                this.color2Animated.set(this.color2, true);
            }
            invalidate();
        }
    }

    public static class ProfilePreview extends FrameLayout {
        protected final AvatarDrawable avatarDrawable;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerificationEmoji;
        private final int currentAccount;
        private final long dialogId;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        private final AnimatedFloat emojiCollectible;
        protected final ImageReceiver imageReceiver;
        private final boolean isChannel;
        private boolean isEmojiCollectible;
        private boolean isForum;
        private MessagesController.PeerColor peerColor;
        private final RectF rectF;
        private final Theme.ResourcesProvider resourcesProvider;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusEmoji;
        private final StoriesUtilities.StoryGradientTools storyGradient;
        protected final SimpleTextView subtitleView;
        protected final SimpleTextView titleView;

        public ProfilePreview(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
            CharSequence userName;
            long botVerificationIcon;
            super(context);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageReceiver = imageReceiver;
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            this.avatarDrawable = avatarDrawable;
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(20.0f), 13);
            this.storyGradient = new StoriesUtilities.StoryGradientTools(this);
            this.emojiCollectible = new AnimatedFloat(this, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.rectF = new RectF();
            this.currentAccount = i;
            this.dialogId = j;
            this.resourcesProvider = resourcesProvider;
            long emojiStatusDocumentId = 0;
            boolean z = j < 0;
            this.isChannel = z;
            SimpleTextView simpleTextView = new SimpleTextView(context) {
                @Override
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    ProfilePreview.this.statusEmoji.attach();
                }

                @Override
                public void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    ProfilePreview.this.statusEmoji.detach();
                }
            };
            this.titleView = simpleTextView;
            this.botVerificationEmoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, AndroidUtilities.dp(17.0f));
            this.statusEmoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, AndroidUtilities.dp(24.0f));
            simpleTextView.setLeftDrawableOutside(true);
            simpleTextView.setRightDrawableOutside(true);
            simpleTextView.setTextColor(-1);
            simpleTextView.setTextSize(20);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setWidthWrapContent(true);
            addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.subtitleView = simpleTextView2;
            simpleTextView2.setTextSize(14);
            simpleTextView2.setTextColor(-2130706433);
            simpleTextView2.setGravity(1);
            addView(simpleTextView2, LayoutHelper.createFrame(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
            if (z) {
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                userName = chat == null ? "" : chat.title;
                avatarDrawable.setInfo(i, chat);
                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
                if (chat != null) {
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
                }
            } else {
                TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                userName = UserObject.getUserName(currentUser);
                avatarDrawable.setInfo(i, currentUser);
                imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
                botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
                if (currentUser != null) {
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
                }
            }
            try {
                userName = Emoji.replaceEmoji(userName, null, false);
            } catch (Exception unused) {
            }
            this.titleView.setText(userName);
            this.botVerificationEmoji.set(botVerificationIcon, false);
            this.titleView.setLeftDrawable(this.botVerificationEmoji);
            this.statusEmoji.set(emojiStatusDocumentId, false);
            this.titleView.setRightDrawable(this.statusEmoji);
            if (this.isChannel) {
                long j2 = -j;
                TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(j2));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j2);
                if (chatFull == null || chatFull.participants_count <= 0) {
                    if (chat2 == null || chat2.participants_count <= 0) {
                        boolean zIsPublic = ChatObject.isPublic(chat2);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            this.subtitleView.setText(LocaleController.getString(zIsPublic ? R.string.ChannelPublic : R.string.ChannelPrivate).toLowerCase());
                        } else {
                            this.subtitleView.setText(LocaleController.getString(zIsPublic ? R.string.MegaPublic : R.string.MegaPrivate).toLowerCase());
                        }
                    } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count));
                    } else {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Members", chat2.participants_count));
                    }
                } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.subtitleView.setText(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count));
                } else {
                    this.subtitleView.setText(LocaleController.formatPluralStringComma("Members", chatFull.participants_count));
                }
            } else {
                this.subtitleView.setText(LocaleController.getString(R.string.Online));
            }
            setWillNotDraw(false);
        }

        private int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            this.rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + getWidth()) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
            StarGiftPatterns.drawProfileAnimatedPattern(canvas, this.emoji, getWidth(), getHeight(), 1.0f, this.rectF, 1.0f);
            this.imageReceiver.setRoundRadius(AndroidUtilities.dp(this.isForum ? 18.0f : 54.0f));
            this.imageReceiver.setImageCoords(this.rectF);
            this.imageReceiver.draw(canvas);
            float fWidth = (this.rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
            float fDp = AndroidUtilities.dp(this.isForum ? 22.0f : 58.0f);
            canvas.drawRoundRect(this.rectF.centerX() - fWidth, this.rectF.centerY() - fWidth, this.rectF.centerX() + fWidth, this.rectF.centerY() + fWidth, fDp, fDp, this.storyGradient.getPaint(this.rectF));
            super.dispatchDraw(canvas);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.emoji.attach();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.emoji.detach();
            this.imageReceiver.onDetachedFromWindow();
        }

        public void overrideAvatarColor(int i) {
            int themedColor;
            int themedColor2;
            if (i >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i) : null;
                if (color != null) {
                    int color1 = color.getColor1();
                    themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)]);
                    themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)]);
                } else {
                    long j = i;
                    themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j)]);
                    themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j)]);
                }
            } else {
                long j2 = i;
                themedColor = getThemedColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j2)]);
                themedColor2 = getThemedColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j2)]);
            }
            this.avatarDrawable.setColor(themedColor, themedColor2);
            invalidate();
        }

        public void setColor(int i, boolean z) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
            setColor(peerColors == null ? null : peerColors.getColor(i), z);
        }

        public void setEmoji(long j, boolean z, boolean z2) {
            MessagesController.PeerColor peerColor;
            Theme.ResourcesProvider resourcesProvider;
            int i;
            if (j == 0) {
                this.emoji.set((Drawable) null, z2);
            } else {
                this.emoji.set(j, z2);
            }
            Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
            boolean zIsDark = resourcesProvider2 != null ? resourcesProvider2.isDark() : Theme.currentTheme.isDark();
            MessagesController.PeerColor peerColor2 = this.peerColor;
            if (peerColor2 != null) {
                int i2 = peerColor2.patternColor;
                if (i2 != 0) {
                    this.emoji.setColor(Integer.valueOf(i2));
                } else {
                    this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(peerColor2.getBgColor1(zIsDark))));
                }
            } else {
                int i3 = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i3)) > 0.8f) {
                    this.emoji.setColor(Integer.valueOf(getThemedColor(Theme.key_windowBackgroundWhiteBlueText)));
                } else if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i3)) < 0.2f) {
                    this.emoji.setColor(Integer.valueOf(Theme.multAlpha(0.5f, Theme.getColor(null, Theme.key_actionBarDefaultTitle, false))));
                } else {
                    this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(null, i3, false))));
                }
            }
            MessagesController.PeerColor peerColor3 = this.peerColor;
            if (peerColor3 != null) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusEmoji;
                int color = peerColor3.getColor(1, this.resourcesProvider);
                if (this.peerColor.hasColor6(zIsDark)) {
                    peerColor = this.peerColor;
                    resourcesProvider = this.resourcesProvider;
                    i = 4;
                } else {
                    peerColor = this.peerColor;
                    resourcesProvider = this.resourcesProvider;
                    i = 2;
                }
                swapAnimatedEmojiDrawable.setColor(Integer.valueOf(ColorUtils.blendARGB(0.5f, color, peerColor.getColor(i, resourcesProvider))));
            } else {
                this.statusEmoji.setColor(Integer.valueOf(Theme.getColor(Theme.key_profile_verifiedBackground, this.resourcesProvider)));
            }
            this.isEmojiCollectible = z;
            if (!z2) {
                this.emojiCollectible.force(z);
            }
            invalidate();
        }

        public void setForum(boolean z) {
            if (this.isForum != z) {
                invalidate();
            }
            this.isForum = z;
        }

        public void setStatusEmoji(long j, boolean z, boolean z2) {
            this.statusEmoji.set(j, z2);
            this.statusEmoji.setParticles(z, z2);
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
            MessagesController.PeerColor peerColor = this.peerColor;
            if (peerColor != null) {
                this.statusEmoji.setColor(Integer.valueOf(ColorUtils.blendARGB(0.5f, peerColor.getColor2(zIsDark), this.peerColor.hasColor6(zIsDark) ? this.peerColor.getColor5(zIsDark) : this.peerColor.getColor3(zIsDark))));
            } else {
                this.statusEmoji.setColor(Integer.valueOf(Theme.getColor(Theme.key_profile_verifiedBackground, this.resourcesProvider)));
            }
        }

        public void setColor(MessagesController.PeerColor peerColor, boolean z) {
            this.peerColor = peerColor;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
            if (peerColor != null) {
                int i = peerColor.patternColor;
                if (i != 0) {
                    this.emoji.setColor(Integer.valueOf(i));
                } else {
                    this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(peerColor.getBgColor1(zIsDark))));
                }
                this.statusEmoji.setColor(Integer.valueOf(ColorUtils.blendARGB(0.25f, peerColor.getStoryColor1(Theme.currentTheme.isDark()), -1)));
                this.botVerificationEmoji.setColor(Integer.valueOf(ColorUtils.blendARGB(0.25f, peerColor.getStoryColor1(Theme.currentTheme.isDark()), -1)));
                int iBlendARGB = ColorUtils.blendARGB(0.5f, peerColor.getStoryColor1(zIsDark), peerColor.getStoryColor2(zIsDark));
                int i2 = Theme.key_actionBarDefault;
                if (!Theme.hasHue(getThemedColor(i2))) {
                    this.subtitleView.setTextColor(iBlendARGB);
                } else {
                    SimpleTextView simpleTextView = this.subtitleView;
                    int themedColor = getThemedColor(i2);
                    int themedColor2 = getThemedColor(Theme.key_avatar_subtitleInProfileBlue);
                    float[] tempHsv = Theme.getTempHsv(3);
                    float[] tempHsv2 = Theme.getTempHsv(4);
                    Color.colorToHSV(themedColor, tempHsv);
                    Color.colorToHSV(iBlendARGB, tempHsv2);
                    simpleTextView.setTextColor(Theme.changeColorAccent(tempHsv, tempHsv2, themedColor2, zIsDark, iBlendARGB));
                }
                this.titleView.setTextColor(-1);
            } else {
                int i3 = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i3)) > 0.8f) {
                    this.emoji.setColor(Integer.valueOf(getThemedColor(Theme.key_windowBackgroundWhiteBlueText)));
                } else if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i3)) < 0.2f) {
                    this.emoji.setColor(Integer.valueOf(Theme.multAlpha(0.5f, getThemedColor(Theme.key_actionBarDefaultTitle))));
                } else {
                    this.emoji.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(getThemedColor(i3))));
                }
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusEmoji;
                int i4 = Theme.key_profile_verifiedBackground;
                swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(i4, this.resourcesProvider)));
                this.botVerificationEmoji.setColor(Integer.valueOf(Theme.getColor(i4, this.resourcesProvider)));
                this.subtitleView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubtitle));
                this.titleView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
            }
            this.storyGradient.setColor(peerColor, z);
            invalidate();
        }
    }

    public static boolean eq(TLRPC.TL_peerColorCollectible tL_peerColorCollectible, TLRPC.TL_peerColorCollectible tL_peerColorCollectible2) {
        if (tL_peerColorCollectible == tL_peerColorCollectible2) {
            return true;
        }
        if (tL_peerColorCollectible == null && tL_peerColorCollectible2 == null) {
            return true;
        }
        return (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id) ? false : true;
    }

    public static class GiftCell extends FrameLayout {
        public TL_stars.starGiftAttributeBackdrop backdrop;
        public final FrameLayout card;
        public final GiftSheet.CardBackground cardBackground;
        public long id;
        public final BackupImageView imageView;
        private TLRPC.Document lastDocument;
        private long lastDocumentId;
        public TL_stars.starGiftAttributePattern pattern;
        private final GiftSheet.Ribbon ribbon;

        public static class Factory extends UItem.UItemFactory<GiftCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asGiftCell(TL_stars.SavedStarGift savedStarGift) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = savedStarGift;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                GiftCell giftCell = (GiftCell) view;
                giftCell.set(-1, (TL_stars.SavedStarGift) uItem.object);
                giftCell.setSelected(uItem.checked, false);
            }

            @Override
            public GiftCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, true, resourcesProvider);
            }
        }

        public GiftCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.card = frameLayout;
            GiftSheet.CardBackground cardBackground = new GiftSheet.CardBackground(frameLayout, resourcesProvider, false);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            ScaleStateListAnimator.apply(frameLayout, 0.025f, 1.25f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
            if (!z) {
                this.ribbon = null;
                return;
            }
            GiftSheet.Ribbon ribbon = new GiftSheet.Ribbon(context);
            this.ribbon = ribbon;
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        }

        private void setSticker(TLRPC.Document document, Object obj) {
            if (document == null) {
                this.imageView.clearImage();
                this.lastDocument = null;
                this.lastDocumentId = 0L;
            } else {
                if (this.lastDocument == document) {
                    return;
                }
                this.lastDocument = document;
                this.lastDocumentId = document.id;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
                this.imageView.setImage(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), obj);
            }
        }

        public long getGiftId() {
            return this.id;
        }

        public void set(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            this.id = tL_starGiftUnique.id;
            boolean z = i % 3 == 1;
            setPadding(z ? AndroidUtilities.dp(4.0f) : 0, 0, z ? AndroidUtilities.dp(4.0f) : 0, 0);
            setSticker(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
            this.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
            this.cardBackground.setBackdrop(this.backdrop);
            this.cardBackground.setPattern(this.pattern);
        }

        public void setSelected(boolean z, boolean z2) {
            this.cardBackground.setSelected(z, z2);
            float f = z ? 0.9f : 1.0f;
            if (z2) {
                this.imageView.animate().scaleX(f).scaleY(f).start();
                return;
            }
            this.imageView.animate().cancel();
            this.imageView.setScaleX(f);
            this.imageView.setScaleY(f);
        }

        public void set(int i, TL_stars.SavedStarGift savedStarGift) {
            this.id = savedStarGift.gift.id;
            boolean z = i % 3 == 1;
            setPadding(z ? AndroidUtilities.dp(4.0f) : 0, 0, z ? AndroidUtilities.dp(4.0f) : 0, 0);
            setSticker(savedStarGift.gift.getDocument(), savedStarGift.gift);
            this.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
            this.cardBackground.setBackdrop(this.backdrop);
            this.cardBackground.setPattern(this.pattern);
            GiftSheet.Ribbon ribbon = this.ribbon;
            if (ribbon != null) {
                ribbon.setBackdrop(this.backdrop);
                GiftSheet.Ribbon ribbon2 = this.ribbon;
                String strM = BillingController$$ExternalSyntheticOutline0.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
                ribbon2.currentText = strM;
                ribbon2.drawable.setText(9, strM, false);
            }
        }
    }
}
