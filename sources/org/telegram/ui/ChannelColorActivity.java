package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeColors;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;

public class ChannelColorActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    protected Adapter adapter;
    public Drawable backgroundDrawable;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    private BaseFragment bulletinFragment;
    protected ButtonWithCounterView button;
    protected FrameLayout buttonContainer;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private final SparseIntArray currentColors;
    public int currentLevel;
    public int currentProfileColor;
    public long currentProfileEmoji;
    public int currentReplyColor;
    public long currentReplyEmoji;
    public TLRPC.EmojiStatus currentStatusEmoji;
    public TLRPC.WallPaper currentWallpaper;
    private ActionBarMenuItem dayNightItem;
    public final long dialogId;
    private final Paint dividerPaint;
    protected int emptyRow;
    private boolean forceDark;
    public TLRPC.WallPaper galleryWallpaper;
    private boolean isDark;
    protected boolean isGroup;
    protected GridLayoutManager layoutManager;
    protected RecyclerListView listView;
    private SpannableStringBuilder lock;
    protected int messagesPreviewRow;
    private final MessageDrawable msgInDrawable;
    private final MessageDrawable msgInDrawableSelected;
    private final Drawable msgOutCheckReadDrawable;
    private final MessageDrawable msgOutDrawable;
    private final MessageDrawable msgOutDrawableSelected;
    private final Drawable msgOutHalfCheckDrawable;
    protected int packEmojiHintRow;
    protected int packEmojiRow;
    protected int packStickerHintRow;
    protected int packStickerRow;
    private Theme.ResourcesProvider parentResourcesProvider;
    protected int profileColorGridRow;
    protected int profileEmojiRow;
    protected int profileHintRow;
    protected int profilePreviewRow;
    protected int removeProfileColorRow;
    protected int removeProfileColorShadowRow;
    protected int replyColorListRow;
    protected int replyEmojiRow;
    protected int replyHintRow;
    protected int rowsCount;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    public int selectedProfileColor;
    public long selectedProfileEmoji;
    public int selectedReplyColor;
    public long selectedReplyEmoji;
    public TLRPC.EmojiStatus selectedStatusEmoji;
    public TLRPC.WallPaper selectedWallpaper;
    protected int statusEmojiRow;
    protected int statusHintRow;
    private RLottieDrawable sunDrawable;
    protected int wallpaperHintRow;
    protected int wallpaperRow;
    protected int wallpaperThemesRow;

    public static boolean $r8$lambda$hmVvo36VO0QvCdUVJUydBvkeXWs(View view, MotionEvent motionEvent) {
        return true;
    }

    protected int getEmojiPackInfoStrRes() {
        return 0;
    }

    protected int getEmojiPackStrRes() {
        return 0;
    }

    protected int getEmojiStickersLevelMin() {
        return 0;
    }

    protected int getMessagePreviewType() {
        return 3;
    }

    protected int getStickerPackInfoStrRes() {
        return 0;
    }

    protected int getStickerPackStrRes() {
        return 0;
    }

    protected boolean isForum() {
        return false;
    }

    protected boolean needBoostInfoSection() {
        return false;
    }

    protected void openBoostDialog(int i) {
    }

    public int minLevelRequired() {
        int iMax = 0;
        if (this.currentReplyColor != this.selectedReplyColor) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(this.selectedReplyColor);
            if (color != null) {
                iMax = Math.max(0, color.getLvl(this.isGroup));
            }
        }
        if (this.currentReplyEmoji != this.selectedReplyEmoji) {
            iMax = Math.max(iMax, getMessagesController().channelBgIconLevelMin);
        }
        if (this.currentProfileColor != this.selectedProfileColor) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(this.selectedProfileColor) : null;
            if (color2 != null) {
                iMax = Math.max(iMax, color2.getLvl(this.isGroup));
            }
        }
        if (this.currentProfileEmoji != this.selectedProfileEmoji) {
            iMax = Math.max(iMax, getProfileIconLevelMin());
        }
        if (!DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji)) {
            iMax = Math.max(iMax, getEmojiStatusLevelMin());
        }
        return !ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper) ? Math.max(iMax, getWallpaperLevelMin()) : iMax;
    }

    protected int getProfileIconLevelMin() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    protected int getCustomWallpaperLevelMin() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    protected int getWallpaperLevelMin() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    protected int getEmojiStatusLevelMin() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public void updateButton(boolean z) {
        if (this.button == null || this.boostsStatus == null) {
            return;
        }
        int iMinLevelRequired = minLevelRequired();
        if (this.currentLevel >= iMinLevelRequired) {
            this.button.setSubText(null, z);
            return;
        }
        if (this.lock == null) {
            this.lock = new SpannableStringBuilder("l");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
            coloredImageSpan.setTopOffset(1);
            this.lock.setSpan(coloredImageSpan, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.lock).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", iMinLevelRequired, new Object[0]));
        this.button.setSubText(spannableStringBuilder, z);
    }

    public class ThemeDelegate implements Theme.ResourcesProvider {
        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        }

        @Override
        public ColorFilter getAnimatedEmojiColorFilter() {
            return Theme.chat_animatedEmojiTextColorFilter;
        }

        @Override
        public int getColorOrDefault(int i) {
            return getColor(i);
        }

        @Override
        public int getCurrentColor(int i) {
            return getColor(i);
        }

        @Override
        public boolean hasGradientService() {
            return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
        }

        @Override
        public void setAnimatedColor(int i, int i2) {
            Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i, i2);
        }

        public ThemeDelegate() {
        }

        @Override
        public int getColor(int i) {
            int iIndexOfKey = ChannelColorActivity.this.currentColors.indexOfKey(i);
            if (iIndexOfKey >= 0) {
                return ChannelColorActivity.this.currentColors.valueAt(iIndexOfKey);
            }
            if (ChannelColorActivity.this.parentResourcesProvider != null) {
                return ChannelColorActivity.this.parentResourcesProvider.getColor(i);
            }
            return Theme.getColor(i);
        }

        @Override
        public Drawable getDrawable(String str) {
            if (str.equals("drawableMsgIn")) {
                return ChannelColorActivity.this.msgInDrawable;
            }
            if (str.equals("drawableMsgInSelected")) {
                return ChannelColorActivity.this.msgInDrawableSelected;
            }
            if (str.equals("drawableMsgOut")) {
                return ChannelColorActivity.this.msgOutDrawable;
            }
            if (str.equals("drawableMsgOutSelected")) {
                return ChannelColorActivity.this.msgOutDrawableSelected;
            }
            if (str.equals("drawableMsgOutCheckRead")) {
                ChannelColorActivity.this.msgOutCheckReadDrawable.setColorFilter(getColor(Theme.key_chat_outSentCheckRead), PorterDuff.Mode.MULTIPLY);
                return ChannelColorActivity.this.msgOutCheckReadDrawable;
            }
            if (str.equals("drawableMsgOutHalfCheck")) {
                ChannelColorActivity.this.msgOutHalfCheckDrawable.setColorFilter(getColor(Theme.key_chat_outSentCheckRead), PorterDuff.Mode.MULTIPLY);
                return ChannelColorActivity.this.msgOutHalfCheckDrawable;
            }
            if (ChannelColorActivity.this.parentResourcesProvider != null) {
                return ChannelColorActivity.this.parentResourcesProvider.getDrawable(str);
            }
            return Theme.getThemeDrawable(str);
        }

        @Override
        public Paint getPaint(String str) {
            if (str.equals("paintDivider")) {
                return ChannelColorActivity.this.dividerPaint;
            }
            return Theme.getThemePaint(str);
        }

        @Override
        public boolean isDark() {
            return ChannelColorActivity.this.isDark;
        }

        public void toggle() {
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            channelColorActivity.isDark = !channelColorActivity.isDark;
            ChannelColorActivity.this.updateThemeColors();
            ChannelColorActivity.this.updateColors(false);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    public ChannelColorActivity(long j) {
        boolean zIsCurrentThemeDark = Theme.isCurrentThemeDark();
        this.isDark = zIsCurrentThemeDark;
        this.rowsCount = 0;
        this.forceDark = zIsCurrentThemeDark;
        this.currentColors = new SparseIntArray();
        Paint paint = new Paint(1);
        this.dividerPaint = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
        this.msgOutCheckReadDrawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_check_s).mutate();
        this.msgOutHalfCheckDrawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_halfcheck).mutate();
        this.dialogId = j;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            this.currentLevel = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChannelColorActivity.$r8$lambda$5YY1F8AMUKgN7A8OVVumjjgt9Io(this.f$0, chat, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
        this.resourceProvider = new ThemeDelegate();
        this.msgInDrawable = new MessageDrawable(0, false, false, this.resourceProvider);
        this.msgInDrawableSelected = new MessageDrawable(0, false, true, this.resourceProvider);
        this.msgOutDrawable = new MessageDrawable(0, true, false, this.resourceProvider);
        this.msgOutDrawableSelected = new MessageDrawable(0, true, true, this.resourceProvider);
    }

    public static void $r8$lambda$5YY1F8AMUKgN7A8OVVumjjgt9Io(ChannelColorActivity channelColorActivity, TLRPC.Chat chat, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        channelColorActivity.boostsStatus = tL_premium_boostsStatus;
        if (tL_premium_boostsStatus != null) {
            int i = tL_premium_boostsStatus.level;
            channelColorActivity.currentLevel = i;
            if (chat != null) {
                chat.flags |= 1024;
                chat.level = i;
            }
        }
        channelColorActivity.updateButton(true);
        ButtonWithCounterView buttonWithCounterView = channelColorActivity.button;
        if (buttonWithCounterView != null) {
            buttonWithCounterView.setLoading(false);
        }
    }

    @Override
    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.parentResourcesProvider = resourcesProvider;
    }

    protected void createListView() {
        RecyclerListView recyclerListView = new RecyclerListView(getContext(), this.resourceProvider);
        this.listView = recyclerListView;
        recyclerListView.setSections(false);
    }

    @Override
    public View createView(Context context) {
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.selectedReplyColor = colorId;
            this.currentReplyColor = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.selectedReplyEmoji = emojiId;
            this.currentReplyEmoji = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.selectedProfileColor = profileColorId;
            this.currentProfileColor = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.selectedProfileEmoji = profileEmojiId;
            this.currentProfileEmoji = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.selectedStatusEmoji = emojiStatus;
            this.currentStatusEmoji = emojiStatus;
        }
        final TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.selectedWallpaper = wallPaper;
            this.currentWallpaper = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.galleryWallpaper = this.currentWallpaper;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i != -1) {
                    if (i == 1) {
                        ChannelColorActivity.this.toggleTheme();
                    }
                } else {
                    ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                    if (channelColorActivity.currentLevel >= channelColorActivity.minLevelRequired() && ChannelColorActivity.this.hasUnsavedChanged()) {
                        ChannelColorActivity.this.showUnsavedAlert();
                    } else {
                        ChannelColorActivity.this.finishFragment();
                    }
                }
            }
        });
        int i = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.sunDrawable = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        if (!this.isDark) {
            this.sunDrawable.setCustomEndFrame(0);
            this.sunDrawable.setCurrentFrame(0);
        } else {
            this.sunDrawable.setCurrentFrame(35);
            this.sunDrawable.setCustomEndFrame(36);
        }
        this.sunDrawable.beginApplyLayerColors();
        int color = Theme.getColor(Theme.key_chats_menuName, this.resourceProvider);
        this.sunDrawable.setLayerColor("Sunny", color);
        this.sunDrawable.setLayerColor("Path 6", color);
        this.sunDrawable.setLayerColor("Path", color);
        this.sunDrawable.setLayerColor("Path 5", color);
        this.dayNightItem = this.actionBar.createMenu().addItem(1, this.sunDrawable);
        FrameLayout frameLayout = new FrameLayout(context);
        updateRows();
        createListView();
        if (!this.isGroup) {
            this.actionBar.setAdaptiveBackground(this.listView);
        }
        RecyclerListView recyclerListView = this.listView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.layoutManager = new GridLayoutManager(context, 3);
        this.listView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView2 = this.listView;
        int i2 = Theme.key_windowBackgroundGray;
        recyclerListView2.setBackgroundColor(getThemedColor(i2));
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                this.f$0.lambda$createView$4(chatFull, view, i3);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        ButtonWithCounterView round = new ButtonWithCounterView(context, this.resourceProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.ApplyChanges), false);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.buttonClick();
            }
        });
        updateButton(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.buttonContainer = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i2));
        this.buttonContainer.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.buttonContainer, LayoutHelper.createFrame(-1, 68, 80));
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i3) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
            }

            @Override
            public int getTopOffset(int i3) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i3);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i3) {
                return ChannelColorActivity.this.buttonContainer.getMeasuredHeight();
            }
        });
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void lambda$createView$4(TLRPC.ChatFull chatFull, final View view, final int i) {
        long emojiStatusDocumentId = 0;
        if (view instanceof EmojiCell) {
            if (i == this.packStickerRow) {
                if (chatFull == null) {
                    return;
                }
                GroupStickersActivity groupStickersActivity = new GroupStickersActivity(-this.dialogId);
                groupStickersActivity.setInfo(chatFull);
                presentFragment(groupStickersActivity);
                return;
            }
            if (i == this.replyEmojiRow) {
                emojiStatusDocumentId = this.selectedReplyEmoji;
            } else if (i == this.profileEmojiRow) {
                emojiStatusDocumentId = this.selectedProfileEmoji;
            } else if (i == this.statusEmojiRow) {
                TLRPC.EmojiStatus emojiStatus = this.selectedStatusEmoji;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    emojiStatusDocumentId = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id;
                } else {
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                }
            }
            if (i == this.packEmojiRow) {
                int emojiStickersLevelMin = getEmojiStickersLevelMin();
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < emojiStickersLevelMin) {
                    openBoostDialog(29);
                    return;
                }
                GroupStickersActivity groupStickersActivity2 = new GroupStickersActivity(-this.dialogId, true);
                groupStickersActivity2.setInfo(chatFull);
                presentFragment(groupStickersActivity2);
                return;
            }
            EmojiCell emojiCell = (EmojiCell) view;
            showSelectStatusDialog(emojiCell, emojiStatusDocumentId, i == this.statusEmojiRow, new Utilities.Callback3() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3) {
                    ChannelColorActivity.$r8$lambda$QXAoLBYO3GQ3QDDlDDophFSgibg(this.f$0, i, view, (Long) obj, (Integer) obj2, (TL_stars.TL_starGiftUnique) obj3);
                }
            }, this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible ? Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourceProvider) : emojiCell.getColor());
            return;
        }
        if (i == this.removeProfileColorRow) {
            this.selectedProfileColor = -1;
            this.selectedProfileEmoji = 0L;
            if (this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
                this.selectedStatusEmoji = null;
            }
            updateProfilePreview(true);
            updateButton(true);
            updateRows();
            updateColors(true);
            return;
        }
        if (i == this.wallpaperRow) {
            ChatThemeBottomSheet.openGalleryForBackground(getParentActivity(), this, this.dialogId, this.resourceProvider, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ChannelColorActivity.m1557$r8$lambda$TjoFbm3ztA8UHWT827a8mbrD_0(this.f$0, (TLRPC.WallPaper) obj);
                }
            }, new ThemePreviewActivity.DayNightSwitchDelegate() {
                @Override
                public boolean supportsAnimation() {
                    return false;
                }

                @Override
                public boolean isDark() {
                    return ((BaseFragment) ChannelColorActivity.this).resourceProvider != null ? ((BaseFragment) ChannelColorActivity.this).resourceProvider.isDark() : Theme.isCurrentThemeDark();
                }

                @Override
                public void switchDayNight(boolean z) {
                    if (((BaseFragment) ChannelColorActivity.this).resourceProvider instanceof ThemeDelegate) {
                        ((ThemeDelegate) ((BaseFragment) ChannelColorActivity.this).resourceProvider).toggle();
                    }
                    ChannelColorActivity.this.setForceDark(isDark(), false);
                    ChannelColorActivity.this.updateColors(false);
                }
            }, this.boostsStatus);
        }
    }

    public static void $r8$lambda$QXAoLBYO3GQ3QDDlDDophFSgibg(ChannelColorActivity channelColorActivity, int i, View view, Long l, Integer num, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (i == channelColorActivity.replyEmojiRow) {
            channelColorActivity.selectedReplyEmoji = l.longValue();
            channelColorActivity.updateMessagesPreview(true);
        } else if (i == channelColorActivity.profileEmojiRow) {
            channelColorActivity.selectedProfileEmoji = l.longValue();
            channelColorActivity.updateProfilePreview(true);
        } else if (i == channelColorActivity.statusEmojiRow) {
            if (l.longValue() == 0) {
                channelColorActivity.selectedStatusEmoji = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift.flags |= 1;
                    tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift.until = num.intValue();
                }
                channelColorActivity.selectedStatusEmoji = tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift;
                channelColorActivity.selectedProfileColor = -1;
                channelColorActivity.selectedProfileEmoji = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                channelColorActivity.selectedStatusEmoji = tL_emojiStatus;
            }
            channelColorActivity.updateProfilePreview(true);
        }
        channelColorActivity.updateButton(true);
        ((EmojiCell) view).setEmoji(l.longValue(), tL_starGiftUnique != null, true);
        channelColorActivity.updateColors(true);
    }

    public static void m1557$r8$lambda$TjoFbm3ztA8UHWT827a8mbrD_0(final ChannelColorActivity channelColorActivity, TLRPC.WallPaper wallPaper) {
        channelColorActivity.currentWallpaper = wallPaper;
        channelColorActivity.selectedWallpaper = wallPaper;
        channelColorActivity.galleryWallpaper = wallPaper;
        channelColorActivity.updateButton(false);
        channelColorActivity.updateMessagesPreview(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelColorActivity.$r8$lambda$1ZA6NqgM6zVcZTrqkFBxubDkDRE(this.f$0);
            }
        }, 350L);
    }

    public static void $r8$lambda$1ZA6NqgM6zVcZTrqkFBxubDkDRE(ChannelColorActivity channelColorActivity) {
        channelColorActivity.getClass();
        BulletinFactory.of(channelColorActivity).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.ChannelWallpaperUpdated)).show();
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.currentLevel < minLevelRequired() || !hasUnsavedChanged()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        showUnsavedAlert();
        return false;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !hasUnsavedChanged() || this.currentLevel < minLevelRequired();
    }

    public void buttonClick() {
        char c;
        char c2;
        int i;
        int i2;
        TLRPC.TL_channels_updateColor tL_channels_updateColor;
        int i3;
        long j;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper;
        TLRPC.WallPaper wallPaper;
        TLRPC.ChatFull chatFull;
        TLRPC.WallPaper wallPaper2;
        TLRPC.WallPaper wallPaper3;
        if (this.boostsStatus == null || this.button.isLoading()) {
            return;
        }
        if (this.currentLevel < minLevelRequired()) {
            this.button.setLoading(true);
            showLimit();
            return;
        }
        final int[] iArr = {0};
        final int[] iArr2 = {0};
        final boolean[] zArr = {false};
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChannelColorActivity.$r8$lambda$OLIS_Gk0viQqsHOzboDdmhen_V8(this.f$0, zArr, iArr2, iArr, (TLRPC.TL_error) obj);
            }
        };
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
            return;
        }
        this.button.setLoading(true);
        if (this.currentReplyColor == this.selectedReplyColor) {
            c = 3;
            if (this.currentReplyEmoji == this.selectedReplyEmoji) {
                i = 4;
                c2 = 2;
                i2 = 0;
            }
            if (this.currentProfileColor == this.selectedProfileColor || this.currentProfileEmoji != this.selectedProfileEmoji) {
                tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                tL_channels_updateColor.channel = getMessagesController().getInputChannel(-this.dialogId);
                tL_channels_updateColor.for_profile = true;
                if (chat.profile_color == null) {
                    chat.profile_color = new TLRPC.TL_peerColor();
                    chat.flags2 |= 256;
                }
                i3 = this.selectedProfileColor;
                if (i3 >= 0) {
                    tL_channels_updateColor.flags |= i;
                    tL_channels_updateColor.color = i3;
                    TLRPC.PeerColor peerColor = chat.profile_color;
                    peerColor.flags |= 1;
                    peerColor.color = i3;
                } else {
                    chat.profile_color.flags &= -2;
                }
                j = this.selectedProfileEmoji;
                if (j != 0) {
                    tL_channels_updateColor.flags |= 1;
                    tL_channels_updateColor.background_emoji_id = j;
                    TLRPC.PeerColor peerColor2 = chat.profile_color;
                    peerColor2.flags |= 2;
                    peerColor2.background_emoji_id = j;
                } else {
                    TLRPC.PeerColor peerColor3 = chat.profile_color;
                    peerColor3.flags &= -3;
                    peerColor3.background_emoji_id = 0L;
                }
                iArr[i2] = iArr[i2] + 1;
                getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                        ChannelColorActivity.m1560$r8$lambda$mSs1dzk2RSGtewEW2o7ejo9cPQ(this.f$0, callback, tLObject, tL_error);
                    }
                });
            }
            if (!ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) {
                tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(this.dialogId);
                wallPaper = this.selectedWallpaper;
                if (wallPaper != null) {
                    if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                        tL_messages_setChatWallPaper.flags |= 1;
                        TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                        tL_inputWallPaperNoFile.id = 0L;
                        tL_messages_setChatWallPaper.flags |= i;
                        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                        tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                        tL_wallPaperSettings.flags |= 128;
                        tL_wallPaperSettings.emoticon = ChatThemeController.getWallpaperEmoticon(this.selectedWallpaper);
                    } else {
                        tL_messages_setChatWallPaper.flags |= 1;
                        wallPaper3 = this.selectedWallpaper;
                        if (wallPaper3 instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                            TLRPC.WallPaper wallPaper4 = this.selectedWallpaper;
                            tL_inputWallPaper.id = wallPaper4.id;
                            tL_inputWallPaper.access_hash = wallPaper4.access_hash;
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                        } else if (wallPaper3 instanceof TLRPC.TL_wallPaperNoFile) {
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_inputWallPaperNoFile2.id = this.selectedWallpaper.id;
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                        }
                    }
                }
                iArr[i2] = iArr[i2] + 1;
                getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                        ChannelColorActivity.$r8$lambda$vGBFSGZqBZaEbimimGSFFXKFoQg(this.f$0, callback, tLObject, tL_error);
                    }
                });
                chatFull = getMessagesController().getChatFull(-this.dialogId);
                ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(this.dialogId, this.selectedWallpaper);
                if (chatFull != null) {
                    wallPaper2 = this.selectedWallpaper;
                    if (wallPaper2 == null) {
                        chatFull.flags2 &= -129;
                        chatFull.wallpaper = null;
                    } else {
                        chatFull.flags2 |= 128;
                        chatFull.wallpaper = wallPaper2;
                    }
                    getMessagesController().putChatFull(chatFull);
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i4 = NotificationCenter.chatInfoDidLoad;
                    Integer numValueOf = Integer.valueOf(i2);
                    Object[] objArr = new Object[i];
                    objArr[i2] = chatFull;
                    objArr[1] = numValueOf;
                    Boolean bool = Boolean.FALSE;
                    objArr[c2] = bool;
                    objArr[c] = bool;
                    notificationCenter.postNotificationName(i4, objArr);
                }
            }
            if (!DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji)) {
                tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(-this.dialogId);
                emojiStatus = this.selectedStatusEmoji;
                if (emojiStatus != null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                    tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                    chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                    chat.flags2 &= -513;
                } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                    tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                    tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                    tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                    tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                    chat.emoji_status = this.selectedStatusEmoji;
                    chat.flags |= 512;
                } else {
                    tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                    chat.emoji_status = emojiStatus;
                    chat.flags |= 512;
                }
                getMessagesController().updateEmojiStatusUntilUpdate(this.dialogId, this.selectedStatusEmoji);
                iArr[i2] = iArr[i2] + 1;
                getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                        ChannelColorActivity.$r8$lambda$dJHR91666oWz7dFZK8wzm0c4gdQ(this.f$0, callback, tLObject, tL_error);
                    }
                });
            }
            if (iArr[i2] == 0) {
                finishFragment();
                this.button.setLoading(false);
            } else {
                getMessagesController().putChat(chat, false);
                getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
            }
        }
        c = 3;
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(-this.dialogId);
        tL_channels_updateColor2.for_profile = false;
        if (chat.color == null) {
            chat.color = new TLRPC.TL_peerColor();
            chat.flags2 |= 128;
        }
        int i5 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i5 | 4;
        int i6 = this.selectedReplyColor;
        tL_channels_updateColor2.color = i6;
        TLRPC.PeerColor peerColor4 = chat.color;
        int i7 = peerColor4.flags;
        c2 = 2;
        int i8 = i7 | 1;
        peerColor4.flags = i8;
        peerColor4.color = i6;
        i = 4;
        i2 = 0;
        long j2 = this.selectedReplyEmoji;
        if (j2 != 0) {
            tL_channels_updateColor2.flags = i5 | 5;
            tL_channels_updateColor2.background_emoji_id = j2;
            peerColor4.flags = i7 | 3;
            peerColor4.background_emoji_id = j2;
        } else {
            peerColor4.flags = i8 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                ChannelColorActivity.m1555$r8$lambda$C8kKo15K3PchMwrJ9lkLF4StE8(this.f$0, callback, tLObject, tL_error);
            }
        });
        if (this.currentProfileColor == this.selectedProfileColor) {
            tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
            tL_channels_updateColor.channel = getMessagesController().getInputChannel(-this.dialogId);
            tL_channels_updateColor.for_profile = true;
            if (chat.profile_color == null) {
                chat.profile_color = new TLRPC.TL_peerColor();
                chat.flags2 |= 256;
            }
            i3 = this.selectedProfileColor;
            if (i3 >= 0) {
                tL_channels_updateColor.flags |= i;
                tL_channels_updateColor.color = i3;
                TLRPC.PeerColor peerColor5 = chat.profile_color;
                peerColor5.flags |= 1;
                peerColor5.color = i3;
            } else {
                chat.profile_color.flags &= -2;
            }
            j = this.selectedProfileEmoji;
            if (j != 0) {
                tL_channels_updateColor.flags |= 1;
                tL_channels_updateColor.background_emoji_id = j;
                TLRPC.PeerColor peerColor6 = chat.profile_color;
                peerColor6.flags |= 2;
                peerColor6.background_emoji_id = j;
            } else {
                TLRPC.PeerColor peerColor7 = chat.profile_color;
                peerColor7.flags &= -3;
                peerColor7.background_emoji_id = 0L;
            }
            iArr[i2] = iArr[i2] + 1;
            getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                    ChannelColorActivity.m1560$r8$lambda$mSs1dzk2RSGtewEW2o7ejo9cPQ(this.f$0, callback, tLObject, tL_error);
                }
            });
        } else {
            tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
            tL_channels_updateColor.channel = getMessagesController().getInputChannel(-this.dialogId);
            tL_channels_updateColor.for_profile = true;
            if (chat.profile_color == null) {
                chat.profile_color = new TLRPC.TL_peerColor();
                chat.flags2 |= 256;
            }
            i3 = this.selectedProfileColor;
            if (i3 >= 0) {
                tL_channels_updateColor.flags |= i;
                tL_channels_updateColor.color = i3;
                TLRPC.PeerColor peerColor8 = chat.profile_color;
                peerColor8.flags |= 1;
                peerColor8.color = i3;
            } else {
                chat.profile_color.flags &= -2;
            }
            j = this.selectedProfileEmoji;
            if (j != 0) {
                tL_channels_updateColor.flags |= 1;
                tL_channels_updateColor.background_emoji_id = j;
                TLRPC.PeerColor peerColor9 = chat.profile_color;
                peerColor9.flags |= 2;
                peerColor9.background_emoji_id = j;
            } else {
                TLRPC.PeerColor peerColor10 = chat.profile_color;
                peerColor10.flags &= -3;
                peerColor10.background_emoji_id = 0L;
            }
            iArr[i2] = iArr[i2] + 1;
            getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                    ChannelColorActivity.m1560$r8$lambda$mSs1dzk2RSGtewEW2o7ejo9cPQ(this.f$0, callback, tLObject, tL_error);
                }
            });
        }
        if (!ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) {
            tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
            tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(this.dialogId);
            wallPaper = this.selectedWallpaper;
            if (wallPaper != null) {
                if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    tL_messages_setChatWallPaper.flags |= 1;
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile3 = new TLRPC.TL_inputWallPaperNoFile();
                    tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile3;
                    tL_inputWallPaperNoFile3.id = 0L;
                    tL_messages_setChatWallPaper.flags |= i;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings2 = new TLRPC.TL_wallPaperSettings();
                    tL_messages_setChatWallPaper.settings = tL_wallPaperSettings2;
                    tL_wallPaperSettings2.flags |= 128;
                    tL_wallPaperSettings2.emoticon = ChatThemeController.getWallpaperEmoticon(this.selectedWallpaper);
                } else {
                    tL_messages_setChatWallPaper.flags |= 1;
                    wallPaper3 = this.selectedWallpaper;
                    if (wallPaper3 instanceof TLRPC.TL_wallPaper) {
                        TLRPC.TL_inputWallPaper tL_inputWallPaper2 = new TLRPC.TL_inputWallPaper();
                        TLRPC.WallPaper wallPaper5 = this.selectedWallpaper;
                        tL_inputWallPaper2.id = wallPaper5.id;
                        tL_inputWallPaper2.access_hash = wallPaper5.access_hash;
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper2;
                    } else if (wallPaper3 instanceof TLRPC.TL_wallPaperNoFile) {
                        TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile4 = new TLRPC.TL_inputWallPaperNoFile();
                        tL_inputWallPaperNoFile4.id = this.selectedWallpaper.id;
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile4;
                    }
                }
            }
            iArr[i2] = iArr[i2] + 1;
            getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                    ChannelColorActivity.$r8$lambda$vGBFSGZqBZaEbimimGSFFXKFoQg(this.f$0, callback, tLObject, tL_error);
                }
            });
            chatFull = getMessagesController().getChatFull(-this.dialogId);
            ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(this.dialogId, this.selectedWallpaper);
            if (chatFull != null) {
                wallPaper2 = this.selectedWallpaper;
                if (wallPaper2 == null) {
                    chatFull.flags2 &= -129;
                    chatFull.wallpaper = null;
                } else {
                    chatFull.flags2 |= 128;
                    chatFull.wallpaper = wallPaper2;
                }
                getMessagesController().putChatFull(chatFull);
                NotificationCenter notificationCenter2 = getNotificationCenter();
                int i9 = NotificationCenter.chatInfoDidLoad;
                Integer numValueOf2 = Integer.valueOf(i2);
                Object[] objArr2 = new Object[i];
                objArr2[i2] = chatFull;
                objArr2[1] = numValueOf2;
                Boolean bool2 = Boolean.FALSE;
                objArr2[c2] = bool2;
                objArr2[c] = bool2;
                notificationCenter2.postNotificationName(i9, objArr2);
            }
        }
        if (!DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji)) {
            tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
            tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(-this.dialogId);
            emojiStatus = this.selectedStatusEmoji;
            if (emojiStatus != null) {
                tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.flags2 &= -513;
            } else {
                tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.flags2 &= -513;
            }
            getMessagesController().updateEmojiStatusUntilUpdate(this.dialogId, this.selectedStatusEmoji);
            iArr[i2] = iArr[i2] + 1;
            getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                    ChannelColorActivity.$r8$lambda$dJHR91666oWz7dFZK8wzm0c4gdQ(this.f$0, callback, tLObject, tL_error);
                }
            });
        }
        if (iArr[i2] == 0) {
            finishFragment();
            this.button.setLoading(false);
        } else {
            getMessagesController().putChat(chat, false);
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public static void $r8$lambda$OLIS_Gk0viQqsHOzboDdmhen_V8(final ChannelColorActivity channelColorActivity, final boolean[] zArr, final int[] iArr, final int[] iArr2, final TLRPC.TL_error tL_error) {
        channelColorActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelColorActivity.$r8$lambda$PKRLcudj9G0zGzIQ5dxH9dnMuq4(this.f$0, zArr, iArr, iArr2, tL_error);
            }
        });
    }

    public static void $r8$lambda$PKRLcudj9G0zGzIQ5dxH9dnMuq4(ChannelColorActivity channelColorActivity, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        int i;
        channelColorActivity.getClass();
        if (zArr[0] || (i = iArr[0]) >= iArr2[0]) {
            return;
        }
        if (tL_error != null) {
            zArr[0] = true;
            if ("BOOSTS_REQUIRED".equals(tL_error.text)) {
                channelColorActivity.showLimit();
                return;
            } else {
                channelColorActivity.button.setLoading(false);
                BulletinFactory.of(channelColorActivity).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show();
                return;
            }
        }
        int i2 = i + 1;
        iArr[0] = i2;
        if (i2 == iArr2[0]) {
            channelColorActivity.finishFragment();
            channelColorActivity.showBulletin();
            channelColorActivity.button.setLoading(false);
        }
    }

    public static void m1555$r8$lambda$C8kKo15K3PchMwrJ9lkLF4StE8(ChannelColorActivity channelColorActivity, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        channelColorActivity.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (callback != null) {
            callback.run(tL_error);
        }
    }

    public static void m1560$r8$lambda$mSs1dzk2RSGtewEW2o7ejo9cPQ(ChannelColorActivity channelColorActivity, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        channelColorActivity.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (callback != null) {
            callback.run(tL_error);
        }
    }

    public static void $r8$lambda$vGBFSGZqBZaEbimimGSFFXKFoQg(ChannelColorActivity channelColorActivity, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        channelColorActivity.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (callback != null) {
            callback.run(tL_error);
        }
    }

    public static void $r8$lambda$dJHR91666oWz7dFZK8wzm0c4gdQ(ChannelColorActivity channelColorActivity, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        channelColorActivity.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (callback != null) {
            callback.run(tL_error);
        }
    }

    private void showLimit() {
        getMessagesController().getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChannelColorActivity.$r8$lambda$q2zMWDRgufgKHFwxhICYgucVvcs(this.f$0, (ChannelBoostsController.CanApplyBoost) obj);
            }
        });
    }

    public static void $r8$lambda$q2zMWDRgufgKHFwxhICYgucVvcs(final ChannelColorActivity channelColorActivity, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int lvl;
        int i;
        int i2;
        if (channelColorActivity.currentReplyColor == channelColorActivity.selectedReplyColor) {
            lvl = 0;
        } else {
            MessagesController.PeerColors peerColors = channelColorActivity.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(channelColorActivity.selectedReplyColor);
            if (color == null || color.getLvl(channelColorActivity.isGroup) <= channelColorActivity.currentLevel) {
                lvl = 0;
            } else {
                lvl = color.getLvl(channelColorActivity.isGroup);
            }
        }
        if (channelColorActivity.currentProfileColor == channelColorActivity.selectedProfileColor) {
            i = 20;
        } else {
            MessagesController.PeerColors peerColors2 = channelColorActivity.getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(channelColorActivity.selectedProfileColor) : null;
            if (color2 == null || color2.getLvl(channelColorActivity.isGroup) <= channelColorActivity.currentLevel) {
                i = 20;
            } else {
                lvl = color2.getLvl(channelColorActivity.isGroup);
                i = 24;
            }
        }
        final int i3 = lvl;
        if (channelColorActivity.currentReplyEmoji != channelColorActivity.selectedReplyEmoji && channelColorActivity.getMessagesController().channelBgIconLevelMin > channelColorActivity.currentLevel) {
            i = 27;
        }
        if (channelColorActivity.currentProfileEmoji != channelColorActivity.selectedProfileEmoji && channelColorActivity.getProfileIconLevelMin() > channelColorActivity.currentLevel) {
            i = 28;
        }
        if (!DialogObject.emojiStatusesEqual(channelColorActivity.currentStatusEmoji, channelColorActivity.selectedStatusEmoji) && channelColorActivity.getEmojiStatusLevelMin() > channelColorActivity.currentLevel) {
            i = channelColorActivity.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible ? 26 : 25;
        }
        if (ChatThemeController.wallpaperEquals(channelColorActivity.currentWallpaper, channelColorActivity.selectedWallpaper)) {
            i2 = i;
        } else {
            i2 = !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(channelColorActivity.selectedWallpaper)) ? 22 : 23;
        }
        if (channelColorActivity.getContext() == null || channelColorActivity.getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(channelColorActivity, channelColorActivity.getContext(), i2, channelColorActivity.currentAccount, channelColorActivity.getResourceProvider()) {
            @Override
            protected int channelColorLevelMin() {
                return i3;
            }
        };
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(channelColorActivity.boostsStatus, true);
        limitReachedBottomSheet.setDialogId(channelColorActivity.dialogId);
        final TLRPC.Chat chat = channelColorActivity.getMessagesController().getChat(Long.valueOf(-channelColorActivity.dialogId));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
                @Override
                public final void run() {
                    ChannelColorActivity.m1559$r8$lambda$h9lgDhmy_WTrTUoMyYwiBVOCSI(this.f$0, chat);
                }
            });
        }
        channelColorActivity.showDialog(limitReachedBottomSheet);
        channelColorActivity.button.setLoading(false);
    }

    public static void m1559$r8$lambda$h9lgDhmy_WTrTUoMyYwiBVOCSI(ChannelColorActivity channelColorActivity, TLRPC.Chat chat) {
        channelColorActivity.getClass();
        channelColorActivity.presentFragment(StatisticActivity.create(chat));
    }

    public void showUnsavedAlert() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(R.string.ChannelColorUnsaved)).setMessage(LocaleController.getString(R.string.ChannelColorUnsavedMessage)).setNegativeButton(LocaleController.getString(R.string.Dismiss), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.finishFragment();
            }
        }).setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.buttonClick();
            }
        }).create();
        showDialog(alertDialogCreate);
        ((TextView) alertDialogCreate.getButton(-2)).setTextColor(getThemedColor(Theme.key_text_RedBold));
    }

    public void showSelectStatusDialog(EmojiCell emojiCell, long j, boolean z, final Utilities.Callback3 callback3, int i) {
        int iCenterX;
        int iDp;
        int i2;
        if (this.selectAnimatedEmojiDialog != null || emojiCell == null) {
            return;
        }
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        boolean z2 = ((float) (emojiCell.getTop() + emojiCell.getHeight())) > ((float) this.listView.getMeasuredHeight()) / 2.0f;
        int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
        int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        emojiCell.imageDrawable.removeOldDrawable();
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = emojiCell.imageDrawable;
        if (emojiCell.imageDrawable != null) {
            emojiCell.imageDrawable.play();
            emojiCell.updateImageBounds();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(emojiCell.imageDrawable.getBounds());
            if (z2) {
                iDp = ((-rect.centerY()) + AndroidUtilities.dp(12.0f)) - iMin;
            } else {
                iDp = (-(emojiCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            }
            iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
        } else {
            iCenterX = 0;
            iDp = 0;
        }
        if (z) {
            i2 = z2 ? 10 : 9;
        } else {
            i2 = z2 ? 5 : 7;
        }
        int i3 = iDp;
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(iCenterX), i2, true, getResourceProvider(), z2 ? 24 : 16, i) {
            @Override
            protected float getScrimDrawableTranslationY() {
                return 0.0f;
            }

            @Override
            protected void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                Utilities.Callback3 callback4 = callback3;
                if (callback4 != null) {
                    callback4.run(Long.valueOf(l == null ? 0L : l.longValue()), num, tL_starGiftUnique);
                }
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    ChannelColorActivity.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }

            @Override
            public long getDialogId() {
                return ChannelColorActivity.this.dialogId;
            }
        };
        selectAnimatedEmojiDialog.useAccentForPlus = true;
        selectAnimatedEmojiDialog.setSelected(j == 0 ? null : Long.valueOf(j));
        selectAnimatedEmojiDialog.setSaveState(3);
        selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, emojiCell);
        int i4 = -2;
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i4, i4) {
            @Override
            public void dismiss() {
                super.dismiss();
                ChannelColorActivity.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
        selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
        selectAnimatedEmojiDialogWindow.showAsDropDown(emojiCell, 0, i3, 53);
        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
    }

    protected void updateRows() {
        Adapter adapter;
        Adapter adapter2;
        this.messagesPreviewRow = 0;
        this.replyColorListRow = 1;
        this.replyEmojiRow = 2;
        this.replyHintRow = 3;
        this.wallpaperThemesRow = 4;
        this.wallpaperRow = 5;
        this.wallpaperHintRow = 6;
        this.profilePreviewRow = 7;
        this.profileColorGridRow = 8;
        this.rowsCount = 10;
        this.profileEmojiRow = 9;
        if (this.selectedProfileEmoji != 0 || this.selectedProfileColor >= 0 || (this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z = this.removeProfileColorRow >= 0;
            this.rowsCount = 11;
            this.removeProfileColorRow = 10;
            if (!z && (adapter = this.adapter) != null) {
                adapter.notifyItemInserted(10);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        } else {
            int i = this.removeProfileColorRow;
            this.removeProfileColorRow = -1;
            if (i >= 0 && (adapter2 = this.adapter) != null) {
                adapter2.notifyItemRemoved(i);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        }
        int i2 = this.rowsCount;
        this.profileHintRow = i2;
        this.statusEmojiRow = i2 + 1;
        this.rowsCount = i2 + 3;
        this.statusHintRow = i2 + 2;
    }

    protected int getProfileInfoStrRes() {
        return R.string.ChannelProfileInfo;
    }

    protected int getEmojiStatusStrRes() {
        return R.string.ChannelEmojiStatus;
    }

    protected int getEmojiStatusInfoStrRes() {
        return R.string.ChannelEmojiStatusInfo;
    }

    protected int getWallpaperStrRes() {
        return R.string.ChannelWallpaper;
    }

    protected int getWallpaper2InfoStrRes() {
        return R.string.ChannelWallpaper2Info;
    }

    public String getThemeChooserEmoticon() {
        String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.selectedWallpaper);
        return (wallpaperEmoticon == null && this.selectedWallpaper == null && this.galleryWallpaper != null) ? "❌" : wallpaperEmoticon;
    }

    protected class Adapter extends RecyclerListView.SelectionAdapter {
        protected Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ProfilePreview profilePreview;
            View textInfoPrivacyCell;
            if (i == 0) {
                Context context = ChannelColorActivity.this.getContext();
                INavigationLayout iNavigationLayout = ((BaseFragment) ChannelColorActivity.this).parentLayout;
                int messagePreviewType = ChannelColorActivity.this.getMessagePreviewType();
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, iNavigationLayout, messagePreviewType, channelColorActivity.dialogId, ((BaseFragment) channelColorActivity).resourceProvider);
                themePreviewMessagesCell.customAnimation = true;
                themePreviewMessagesCell.setImportantForAccessibility(4);
                ChannelColorActivity channelColorActivity2 = ChannelColorActivity.this;
                themePreviewMessagesCell.fragment = channelColorActivity2;
                Drawable drawable = channelColorActivity2.backgroundDrawable;
                int i2 = ((BaseFragment) channelColorActivity2).currentAccount;
                ChannelColorActivity channelColorActivity3 = ChannelColorActivity.this;
                Drawable backgroundDrawable = PreviewView.getBackgroundDrawable(drawable, i2, channelColorActivity3.selectedWallpaper, channelColorActivity3.isDark);
                channelColorActivity2.backgroundDrawable = backgroundDrawable;
                themePreviewMessagesCell.setOverrideBackground(backgroundDrawable);
                textInfoPrivacyCell = themePreviewMessagesCell;
            } else if (i == 2) {
                ThemeChooser themeChooser = new ThemeChooser(ChannelColorActivity.this.getContext(), false, ((BaseFragment) ChannelColorActivity.this).currentAccount, ((BaseFragment) ChannelColorActivity.this).resourceProvider);
                themeChooser.setWithRemovedStub(true);
                themeChooser.setSelectedEmoticon(ChannelColorActivity.this.getThemeChooserEmoticon(), false);
                themeChooser.setGalleryWallpaper(ChannelColorActivity.this.galleryWallpaper);
                themeChooser.setOnEmoticonSelected(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChannelColorActivity.Adapter.$r8$lambda$q90784XX98kvOVMWQd4bJSTJwHo(this.f$0, (String) obj);
                    }
                });
                textInfoPrivacyCell = themeChooser;
            } else if (i == 5) {
                textInfoPrivacyCell = new TextCell(ChannelColorActivity.this.getContext(), ChannelColorActivity.this.getResourceProvider());
            } else if (i == 6) {
                textInfoPrivacyCell = new EmojiCell(ChannelColorActivity.this.getContext(), ((BaseFragment) ChannelColorActivity.this).resourceProvider);
            } else if (i == 3) {
                final PeerColorPicker peerColorPicker = new PeerColorPicker(ChannelColorActivity.this.getContext(), ((BaseFragment) ChannelColorActivity.this).currentAccount, ((BaseFragment) ChannelColorActivity.this).resourceProvider);
                peerColorPicker.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i3) {
                        ChannelColorActivity.Adapter.m1561$r8$lambda$wLc5xcXftoXAqktkIKIHyOBqi4(this.f$0, peerColorPicker, view, i3);
                    }
                });
                textInfoPrivacyCell = peerColorPicker;
            } else if (i == 4) {
                PeerColorActivity.PeerColorGrid peerColorGrid = new PeerColorActivity.PeerColorGrid(ChannelColorActivity.this.getContext(), 0, ((BaseFragment) ChannelColorActivity.this).currentAccount, ((BaseFragment) ChannelColorActivity.this).resourceProvider);
                peerColorGrid.setDivider(false);
                peerColorGrid.setOnColorClick(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChannelColorActivity.Adapter.$r8$lambda$6LiziAQu1JfYC399vaX41Gsyk1A(this.f$0, (Integer) obj);
                    }
                });
                textInfoPrivacyCell = peerColorGrid;
            } else if (i == 1) {
                ChannelColorActivity channelColorActivity4 = ChannelColorActivity.this;
                profilePreview = channelColorActivity4.new ProfilePreview(channelColorActivity4.getContext());
                if (ChannelColorActivity.this.isGroup) {
                    textInfoPrivacyCell = profilePreview;
                    profilePreview.setTag(-33024);
                    textInfoPrivacyCell = profilePreview;
                }
            } else if (i == 8) {
                textInfoPrivacyCell = new HeaderCell(ChannelColorActivity.this.getContext(), ((BaseFragment) ChannelColorActivity.this).resourceProvider);
            } else if (i == 9) {
                textInfoPrivacyCell = new PeerColorActivity.GiftCell(ChannelColorActivity.this.getContext(), false, ((BaseFragment) ChannelColorActivity.this).resourceProvider);
            } else if (i == 10) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(ChannelColorActivity.this.getContext(), ((BaseFragment) ChannelColorActivity.this).resourceProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(35);
                textInfoPrivacyCell = flickerLoadingView;
            } else {
                textInfoPrivacyCell = new TextInfoPrivacyCell(ChannelColorActivity.this.getContext());
            }
            textInfoPrivacyCell = profilePreview;
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }

        public static void $r8$lambda$q90784XX98kvOVMWQd4bJSTJwHo(Adapter adapter, String str) {
            if (str == null) {
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                channelColorActivity.selectedWallpaper = channelColorActivity.galleryWallpaper;
            } else {
                adapter.getClass();
                if (str.equals("❌")) {
                    ChannelColorActivity.this.selectedWallpaper = null;
                } else {
                    ChannelColorActivity.this.selectedWallpaper = new TLRPC.TL_wallPaperNoFile();
                    TLRPC.WallPaper wallPaper = ChannelColorActivity.this.selectedWallpaper;
                    wallPaper.id = 0L;
                    wallPaper.flags |= 4;
                    wallPaper.settings = new TLRPC.TL_wallPaperSettings();
                    ChannelColorActivity.this.selectedWallpaper.settings.emoticon = str;
                }
            }
            ChannelColorActivity.this.updateButton(true);
            ChannelColorActivity.this.updateMessagesPreview(true);
        }

        public static void m1561$r8$lambda$wLc5xcXftoXAqktkIKIHyOBqi4(Adapter adapter, PeerColorPicker peerColorPicker, View view, int i) {
            ChannelColorActivity.this.selectedReplyColor = peerColorPicker.toColorId(i);
            ChannelColorActivity.this.updateButton(true);
            ChannelColorActivity.this.updateMessagesPreview(true);
            ChannelColorActivity.this.updateProfilePreview(true);
            if (view.getLeft() < peerColorPicker.listView.getPaddingLeft() + AndroidUtilities.dp(24.0f)) {
                RecyclerListView recyclerListView = peerColorPicker.listView;
                recyclerListView.smoothScrollBy(-((recyclerListView.getPaddingLeft() + AndroidUtilities.dp(48.0f)) - view.getLeft()), 0);
            } else if (view.getLeft() + view.getWidth() > (peerColorPicker.listView.getMeasuredWidth() - peerColorPicker.listView.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                peerColorPicker.listView.smoothScrollBy((view.getLeft() + view.getWidth()) - ((peerColorPicker.listView.getMeasuredWidth() - peerColorPicker.listView.getPaddingRight()) - AndroidUtilities.dp(48.0f)), 0);
            }
        }

        public static void $r8$lambda$6LiziAQu1JfYC399vaX41Gsyk1A(Adapter adapter, Integer num) {
            ChannelColorActivity.this.selectedProfileColor = num.intValue();
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            if (channelColorActivity.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
                channelColorActivity.selectedStatusEmoji = null;
            }
            channelColorActivity.updateButton(true);
            ChannelColorActivity.this.updateProfilePreview(true);
            ChannelColorActivity.this.updateColors(true);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.StickerSet stickerSet;
            TLRPC.StickerSet stickerSet2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                ProfilePreview profilePreview = (ProfilePreview) viewHolder.itemView;
                profilePreview.backgroundView.setColor(((BaseFragment) ChannelColorActivity.this).currentAccount, ChannelColorActivity.this.selectedProfileColor, false);
                profilePreview.profileView.setColor(ChannelColorActivity.this.selectedProfileColor, false);
                profilePreview.profileView.setEmoji(ChannelColorActivity.this.selectedProfileEmoji, false, false);
                profilePreview.profileView.setForum(ChannelColorActivity.this.isForum());
                profilePreview.profileView.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(ChannelColorActivity.this.selectedStatusEmoji), false, false);
                profilePreview.profileView.overrideAvatarColor(ChannelColorActivity.this.selectedReplyColor);
                return;
            }
            if (itemViewType == 3) {
                ((PeerColorPicker) viewHolder.itemView).setSelected(ChannelColorActivity.this.selectedReplyColor, false);
                return;
            }
            if (itemViewType == 4) {
                ((PeerColorActivity.PeerColorGrid) viewHolder.itemView).setSelected(ChannelColorActivity.this.selectedProfileColor, false);
                return;
            }
            if (itemViewType == 5) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                if (i == channelColorActivity.removeProfileColorRow) {
                    textCell.setText(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                    return;
                }
                textCell.setText(LocaleController.getString(channelColorActivity.getWallpaperStrRes()), false);
                ChannelColorActivity channelColorActivity2 = ChannelColorActivity.this;
                if (channelColorActivity2.currentLevel < channelColorActivity2.getCustomWallpaperLevelMin()) {
                    textCell.setLockLevel(false, ChannelColorActivity.this.getCustomWallpaperLevelMin());
                    return;
                } else {
                    textCell.setLockLevel(false, 0);
                    return;
                }
            }
            if (itemViewType != 6) {
                if (itemViewType != 7) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                ChannelColorActivity channelColorActivity3 = ChannelColorActivity.this;
                if (i == channelColorActivity3.emptyRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText("");
                    return;
                }
                if (i == channelColorActivity3.replyHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                    return;
                }
                if (i == channelColorActivity3.wallpaperHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity3.getWallpaper2InfoStrRes()));
                    return;
                }
                if (i == channelColorActivity3.profileHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity3.getProfileInfoStrRes()));
                    return;
                }
                if (i == channelColorActivity3.statusHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity3.getEmojiStatusInfoStrRes()));
                    return;
                }
                if (i == channelColorActivity3.packEmojiHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity3.getEmojiPackInfoStrRes()));
                    return;
                }
                if (i == channelColorActivity3.packStickerHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity3.getStickerPackInfoStrRes()));
                    return;
                } else {
                    if (i == channelColorActivity3.removeProfileColorShadowRow) {
                        textInfoPrivacyCell.setText("");
                        textInfoPrivacyCell.setFixedSize(12);
                        return;
                    }
                    return;
                }
            }
            EmojiCell emojiCell = (EmojiCell) viewHolder.itemView;
            emojiCell.setDivider(false);
            ChannelColorActivity channelColorActivity4 = ChannelColorActivity.this;
            if (i == channelColorActivity4.replyEmojiRow) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity4).currentAccount, ChannelColorActivity.this.selectedReplyColor, true);
                emojiCell.setText(LocaleController.getString(R.string.ChannelReplyLogo));
                ChannelColorActivity channelColorActivity5 = ChannelColorActivity.this;
                if (channelColorActivity5.currentLevel < channelColorActivity5.getMessagesController().channelBgIconLevelMin) {
                    emojiCell.setLockLevel(ChannelColorActivity.this.getMessagesController().channelBgIconLevelMin);
                } else {
                    emojiCell.setLockLevel(0);
                }
                emojiCell.setEmoji(ChannelColorActivity.this.selectedReplyEmoji, false, false);
                return;
            }
            if (i == channelColorActivity4.profileEmojiRow) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity4).currentAccount, ChannelColorActivity.this.selectedProfileColor, false);
                emojiCell.setText(LocaleController.getString(R.string.ChannelProfileLogo));
                emojiCell.setDivider(ChannelColorActivity.this.removeProfileColorRow >= 0);
                ChannelColorActivity channelColorActivity6 = ChannelColorActivity.this;
                if (channelColorActivity6.currentLevel < channelColorActivity6.getProfileIconLevelMin()) {
                    emojiCell.setLockLevel(ChannelColorActivity.this.getProfileIconLevelMin());
                } else {
                    emojiCell.setLockLevel(0);
                }
                emojiCell.setEmoji(ChannelColorActivity.this.selectedProfileEmoji, false, false);
                return;
            }
            if (i == channelColorActivity4.statusEmojiRow) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity4).currentAccount, ChannelColorActivity.this.selectedProfileColor, false);
                emojiCell.setText(LocaleController.getString(ChannelColorActivity.this.getEmojiStatusStrRes()));
                ChannelColorActivity channelColorActivity7 = ChannelColorActivity.this;
                if (channelColorActivity7.currentLevel < channelColorActivity7.getEmojiStatusLevelMin()) {
                    emojiCell.setLockLevel(ChannelColorActivity.this.getEmojiStatusLevelMin());
                } else {
                    emojiCell.setLockLevel(0);
                }
                emojiCell.setEmoji(DialogObject.getEmojiStatusDocumentId(ChannelColorActivity.this.selectedStatusEmoji), DialogObject.isEmojiStatusCollectible(ChannelColorActivity.this.selectedStatusEmoji), false);
                return;
            }
            if (i == channelColorActivity4.packEmojiRow) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity4).currentAccount, ChannelColorActivity.this.selectedProfileColor, false);
                emojiCell.setText(LocaleController.getString(ChannelColorActivity.this.getEmojiPackStrRes()));
                ChannelColorActivity channelColorActivity8 = ChannelColorActivity.this;
                if (channelColorActivity8.currentLevel < channelColorActivity8.getEmojiStickersLevelMin()) {
                    emojiCell.setLockLevel(ChannelColorActivity.this.getEmojiStickersLevelMin());
                } else {
                    emojiCell.setLockLevel(0);
                }
                TLRPC.ChatFull chatFull = ChannelColorActivity.this.getMessagesController().getChatFull(-ChannelColorActivity.this.dialogId);
                if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                    emojiCell.setEmoji(ChannelColorActivity.this.getEmojiSetThumbId(stickerSet2), false, false);
                    return;
                } else {
                    emojiCell.setEmoji(0L, false, false);
                    return;
                }
            }
            if (i == channelColorActivity4.packStickerRow) {
                emojiCell.setText(LocaleController.getString(channelColorActivity4.getStickerPackStrRes()));
                emojiCell.setLockLevel(0);
                TLRPC.ChatFull chatFull2 = ChannelColorActivity.this.getMessagesController().getChatFull(-ChannelColorActivity.this.dialogId);
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                    emojiCell.setEmoji(ChannelColorActivity.this.getEmojiSetThumb(stickerSet), false, false);
                } else {
                    emojiCell.setEmoji(0L, false, false);
                }
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ProfilePreview) {
                ProfilePreview profilePreview = (ProfilePreview) view;
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                TLRPC.EmojiStatus emojiStatus = channelColorActivity.selectedStatusEmoji;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    profilePreview.profileView.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                    profilePreview.profileView.setEmoji(((TLRPC.TL_emojiStatusCollectible) ChannelColorActivity.this.selectedStatusEmoji).pattern_document_id, true, false);
                } else {
                    profilePreview.profileView.setColor(channelColorActivity.selectedProfileColor, false);
                    profilePreview.profileView.setEmoji(ChannelColorActivity.this.selectedProfileEmoji, false, false);
                }
                profilePreview.profileView.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(ChannelColorActivity.this.selectedStatusEmoji), DialogObject.isEmojiStatusCollectible(ChannelColorActivity.this.selectedStatusEmoji), false);
                profilePreview.profileView.setForum(ChannelColorActivity.this.isForum());
                profilePreview.profileView.overrideAvatarColor(ChannelColorActivity.this.selectedReplyColor);
            } else if (!(view instanceof ThemePreviewMessagesCell)) {
                ChannelColorActivity.this.updateColors(view);
            } else {
                ((ThemePreviewMessagesCell) view).setOverrideBackground(ChannelColorActivity.this.backgroundDrawable);
            }
            super.onViewAttachedToWindow(viewHolder);
        }

        @Override
        public int getItemViewType(int i) {
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            if (i == channelColorActivity.messagesPreviewRow) {
                return 0;
            }
            if (i == channelColorActivity.wallpaperThemesRow) {
                return 2;
            }
            if (i == channelColorActivity.profilePreviewRow) {
                return 1;
            }
            if (i == channelColorActivity.replyColorListRow) {
                return 3;
            }
            if (i == channelColorActivity.profileColorGridRow) {
                return 4;
            }
            if (i == channelColorActivity.replyEmojiRow || i == channelColorActivity.profileEmojiRow || i == channelColorActivity.statusEmojiRow || i == channelColorActivity.packEmojiRow || i == channelColorActivity.packStickerRow) {
                return 6;
            }
            return (i == channelColorActivity.wallpaperRow || i == channelColorActivity.removeProfileColorRow) ? 5 : 7;
        }

        @Override
        public int getItemCount() {
            return ChannelColorActivity.this.rowsCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 5 || itemViewType == 6;
        }
    }

    public void updateMessagesPreview(boolean z) {
        MessageObject messageObject;
        View viewFindChildAt = findChildAt(this.messagesPreviewRow);
        View viewFindChildAt2 = findChildAt(this.replyColorListRow);
        View viewFindChildAt3 = findChildAt(this.replyEmojiRow);
        View viewFindChildAt4 = findChildAt(this.wallpaperThemesRow);
        if (viewFindChildAt instanceof ThemePreviewMessagesCell) {
            ThemePreviewMessagesCell themePreviewMessagesCell = (ThemePreviewMessagesCell) viewFindChildAt;
            ChatMessageCell[] cells = themePreviewMessagesCell.getCells();
            for (int i = 0; i < cells.length; i++) {
                ChatMessageCell chatMessageCell = cells[i];
                if (chatMessageCell != null && (messageObject = chatMessageCell.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.selectedReplyColor;
                    messageObject.overrideLinkEmoji = this.selectedReplyEmoji;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable backgroundDrawable = PreviewView.getBackgroundDrawable(this.backgroundDrawable, this.currentAccount, this.selectedWallpaper, this.isDark);
            this.backgroundDrawable = backgroundDrawable;
            themePreviewMessagesCell.setOverrideBackground(backgroundDrawable);
        }
        if (viewFindChildAt2 instanceof PeerColorActivity.PeerColorGrid) {
            ((PeerColorActivity.PeerColorGrid) viewFindChildAt2).setSelected(this.selectedReplyColor, z);
        } else if (viewFindChildAt2 instanceof PeerColorPicker) {
            ((PeerColorPicker) viewFindChildAt2).setSelected(this.selectedReplyColor, z);
        }
        if (viewFindChildAt3 instanceof EmojiCell) {
            EmojiCell emojiCell = (EmojiCell) viewFindChildAt3;
            emojiCell.setAdaptiveEmojiColor(this.currentAccount, this.selectedReplyColor, true);
            emojiCell.setEmoji(this.selectedReplyEmoji, false, z);
        }
        if (viewFindChildAt4 instanceof ThemeChooser) {
            ThemeChooser themeChooser = (ThemeChooser) viewFindChildAt4;
            themeChooser.setSelectedEmoticon(getThemeChooserEmoticon(), z);
            themeChooser.setGalleryWallpaper(this.galleryWallpaper);
        }
    }

    public void updateProfilePreview(boolean z) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View viewFindChildAt = findChildAt(this.profilePreviewRow);
        View viewFindChildAt2 = findChildAt(this.profileColorGridRow);
        View viewFindChildAt3 = findChildAt(this.profileEmojiRow);
        View viewFindChildAt4 = findChildAt(this.statusEmojiRow);
        View viewFindChildAt5 = findChildAt(this.packEmojiRow);
        View viewFindChildAt6 = findChildAt(this.packStickerRow);
        if (viewFindChildAt instanceof ProfilePreview) {
            TLRPC.EmojiStatus emojiStatus = this.selectedStatusEmoji;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ProfilePreview profilePreview = (ProfilePreview) viewFindChildAt;
                profilePreview.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), z);
                profilePreview.setEmoji(((TLRPC.TL_emojiStatusCollectible) this.selectedStatusEmoji).pattern_document_id, true, z);
            } else {
                ProfilePreview profilePreview2 = (ProfilePreview) viewFindChildAt;
                profilePreview2.setColor(this.selectedProfileColor, z);
                profilePreview2.setEmoji(this.selectedProfileEmoji, false, z);
            }
            ProfilePreview profilePreview3 = (ProfilePreview) viewFindChildAt;
            profilePreview3.setEmojiStatus(this.selectedStatusEmoji, z);
            profilePreview3.profileView.overrideAvatarColor(this.selectedReplyColor);
            profilePreview3.updateColors();
        }
        if (viewFindChildAt2 instanceof PeerColorActivity.PeerColorGrid) {
            ((PeerColorActivity.PeerColorGrid) viewFindChildAt2).setSelected(this.selectedProfileColor, z);
        } else if (viewFindChildAt2 instanceof PeerColorPicker) {
            ((PeerColorPicker) viewFindChildAt2).setSelected(this.selectedReplyColor, z);
        }
        if (viewFindChildAt3 instanceof EmojiCell) {
            EmojiCell emojiCell = (EmojiCell) viewFindChildAt3;
            emojiCell.setAdaptiveEmojiColor(this.currentAccount, this.selectedProfileColor, false);
            emojiCell.setEmoji(this.selectedProfileEmoji, false, z);
        }
        if (viewFindChildAt4 instanceof EmojiCell) {
            TLRPC.EmojiStatus emojiStatus2 = this.selectedStatusEmoji;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((EmojiCell) viewFindChildAt4).setAdaptiveEmojiColor(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((EmojiCell) viewFindChildAt4).setAdaptiveEmojiColor(this.currentAccount, this.selectedProfileColor, false);
            }
            ((EmojiCell) viewFindChildAt4).setEmoji(DialogObject.getEmojiStatusDocumentId(this.selectedStatusEmoji), DialogObject.isEmojiStatusCollectible(this.selectedStatusEmoji), z);
        }
        if (viewFindChildAt5 instanceof EmojiCell) {
            EmojiCell emojiCell2 = (EmojiCell) viewFindChildAt5;
            emojiCell2.setAdaptiveEmojiColor(this.currentAccount, this.selectedProfileColor, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                emojiCell2.setEmoji(getEmojiSetThumbId(stickerSet2), false, false);
            } else {
                emojiCell2.setEmoji(0L, false, false);
            }
        }
        if (viewFindChildAt6 instanceof EmojiCell) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-this.dialogId);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((EmojiCell) viewFindChildAt6).setEmoji(getEmojiSetThumb(stickerSet), false, false);
            } else {
                ((EmojiCell) viewFindChildAt6).setEmoji(0L, false, false);
            }
        }
        updateRows();
    }

    public long getEmojiSetThumbId(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j = stickerSet.thumb_document_id;
        if (j == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).id;
            }
        }
        return j;
    }

    public TLRPC.Document getEmojiSetThumb(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public View findChildAt(int i) {
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (this.listView.getChildAdapterPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    protected class ProfilePreview extends FrameLayout implements Theme.Colorable {
        public final PeerColorActivity.ColoredActionBar backgroundView;
        public LinearLayout infoLayout;
        public final PeerColorActivity.ProfilePreview profileView;
        public TextView textInfo1;
        public TextView textInfo2;
        public SimpleTextView title;

        public int[] getColorKeys() {
            return Theme.Colorable.CC.$default$getColorKeys(this);
        }

        public void setTitleSize() {
            float f;
            boolean z = getResources().getConfiguration().orientation == 2;
            this.title.setTextSize((AndroidUtilities.isTablet() || !z) ? 20 : 18);
            SimpleTextView simpleTextView = this.title;
            if (AndroidUtilities.isTablet()) {
                f = -2.0f;
            } else {
                f = z ? 4 : 0;
            }
            simpleTextView.setTranslationY(AndroidUtilities.dp(f));
        }

        public ProfilePreview(Context context) {
            super(context);
            PeerColorActivity.ColoredActionBar coloredActionBar = new PeerColorActivity.ColoredActionBar(getContext(), ((BaseFragment) ChannelColorActivity.this).resourceProvider);
            this.backgroundView = coloredActionBar;
            coloredActionBar.setProgressToGradient(1.0f);
            coloredActionBar.ignoreMeasure = true;
            addView(coloredActionBar, LayoutHelper.createFrame(-1, -1, 119));
            PeerColorActivity.ProfilePreview profilePreview = new PeerColorActivity.ProfilePreview(getContext(), ((BaseFragment) ChannelColorActivity.this).currentAccount, ChannelColorActivity.this.dialogId, ((BaseFragment) ChannelColorActivity.this).resourceProvider) {
                @Override
                public void setColor(int i, boolean z) {
                    super.setColor(i, z);
                    ProfilePreview profilePreview2 = ProfilePreview.this;
                    TextView textView = profilePreview2.textInfo1;
                    if (textView != null) {
                        textView.setTextColor(profilePreview2.profileView.subtitleView.getTextColor());
                    }
                }
            };
            this.profileView = profilePreview;
            boolean z = ChannelColorActivity.this.isGroup;
            addView(profilePreview, LayoutHelper.createFrame(-1, z ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z ? 24.0f : 0.0f));
            if (ChannelColorActivity.this.needBoostInfoSection()) {
                SimpleTextView simpleTextView = new SimpleTextView(getContext());
                this.title = simpleTextView;
                simpleTextView.setGravity(19);
                SimpleTextView simpleTextView2 = this.title;
                int i = Theme.key_actionBarDefaultTitle;
                simpleTextView2.setTextColor(ChannelColorActivity.this.getThemedColor(i));
                this.title.setTypeface(AndroidUtilities.bold());
                this.title.setText(LocaleController.getString(R.string.ChangeChannelNameColor2));
                this.title.setAlpha(0.0f);
                setTitleSize();
                addView(this.title, LayoutHelper.createFrame(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.infoLayout = linearLayout;
                linearLayout.setOrientation(0);
                this.infoLayout.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.multAlpha(-16777216, 0.065f), -16777216));
                this.infoLayout.setGravity(17);
                this.infoLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(context);
                this.textInfo1 = textView;
                textView.setTextSize(1, 12.0f);
                this.textInfo1.setTextColor(profilePreview.subtitleView.getTextColor());
                TextView textView2 = new TextView(context);
                this.textInfo2 = textView2;
                textView2.setTextSize(1, 12.0f);
                this.textInfo2.setTextColor((ChannelColorActivity.this.isGroup && ChannelColorActivity.this.selectedProfileColor == -1) ? ChannelColorActivity.this.getThemedColor(i) : -1);
                TextView textView3 = this.textInfo1;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ChannelColorActivity.this.boostsStatus;
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
                this.textInfo2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                this.infoLayout.addView(this.textInfo1);
                this.infoLayout.addView(this.textInfo2, LayoutHelper.createLinear(-2, -2, 3.0f, 0.0f, 0.0f, 0.0f));
                addView(this.infoLayout, LayoutHelper.createFrame(-1, -2, 80));
            }
        }

        @Override
        public void updateColors() {
            SimpleTextView simpleTextView = this.title;
            if (simpleTextView != null) {
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                int themedColor = -1;
                simpleTextView.setTextColor((!channelColorActivity.isGroup || channelColorActivity.selectedProfileColor == -1) ? channelColorActivity.getThemedColor(Theme.key_actionBarDefaultTitle) : -1);
                TextView textView = this.textInfo2;
                ChannelColorActivity channelColorActivity2 = ChannelColorActivity.this;
                if (channelColorActivity2.isGroup && channelColorActivity2.selectedProfileColor == -1) {
                    themedColor = channelColorActivity2.getThemedColor(Theme.key_actionBarDefaultTitle);
                }
                textView.setTextColor(themedColor);
            }
        }

        public void setColor(int i, boolean z) {
            this.profileView.setColor(i, z);
            this.backgroundView.setColor(((BaseFragment) ChannelColorActivity.this).currentAccount, i, z);
        }

        public void setColor(MessagesController.PeerColor peerColor, boolean z) {
            this.profileView.setColor(peerColor, z);
            this.backgroundView.setColor(peerColor, z);
        }

        public void setEmoji(long j, boolean z, boolean z2) {
            this.profileView.setEmoji(j, z, z2);
        }

        public void setEmojiStatus(TLRPC.EmojiStatus emojiStatus, boolean z) {
            this.profileView.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(emojiStatus), false, z);
        }
    }

    static class EmojiCell extends FrameLayout {
        private int color;
        private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
        private boolean needDivider;
        private Text offText;
        private Theme.ResourcesProvider resourcesProvider;
        private SimpleTextView textView;

        public EmojiCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.needDivider = false;
            this.resourcesProvider = resourcesProvider;
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(16);
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 13);
        }

        public void setDivider(boolean z) {
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setLockLevel(int i) {
            if (i <= 0) {
                this.textView.setRightDrawable((Drawable) null);
            } else {
                this.textView.setRightDrawable(new PeerColorActivity.LevelLock(getContext(), i, this.resourcesProvider));
                this.textView.setDrawablePadding(AndroidUtilities.dp(6.0f));
            }
        }

        public void setAdaptiveEmojiColor(int i, int i2, boolean z) {
            if (i2 < 0) {
                setAdaptiveEmojiColor(null);
            } else if (i2 < 7) {
                this.color = Theme.getColor(Theme.keys_avatar_nameInMessage[i2], this.resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors = z ? MessagesController.getInstance(i).peerColors : MessagesController.getInstance(i).profilePeerColors;
                setAdaptiveEmojiColor(peerColors != null ? peerColors.getColor(i2) : null);
            }
            invalidate();
        }

        public void setAdaptiveEmojiColor(MessagesController.PeerColor peerColor) {
            if (peerColor == null) {
                int i = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i, this.resourcesProvider)) > 0.8f) {
                    this.color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, this.resourcesProvider);
                    return;
                } else if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i, this.resourcesProvider)) < 0.2f) {
                    this.color = Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider), 0.5f);
                    return;
                } else {
                    this.color = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i, this.resourcesProvider)), 0.7f));
                    return;
                }
            }
            this.color = peerColor.getColor(0, this.resourcesProvider);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        public void setEmoji(long j, boolean z, boolean z2) {
            if (j == 0) {
                this.imageDrawable.set((Drawable) null, z2);
                if (this.offText == null) {
                    this.offText = new Text(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f);
                }
            } else {
                this.imageDrawable.set(j, z2);
                this.offText = null;
            }
            this.imageDrawable.setParticles(z, z2);
        }

        public void setEmoji(TLRPC.Document document, boolean z, boolean z2) {
            if (document == null) {
                this.imageDrawable.set((Drawable) null, z2);
                if (this.offText == null) {
                    this.offText = new Text(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f);
                }
            } else {
                this.imageDrawable.set(document, z2);
                this.offText = null;
            }
            this.imageDrawable.setParticles(z, z2);
        }

        public void updateColors() {
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        }

        public void updateImageBounds() {
            this.imageDrawable.setBounds((getWidth() - this.imageDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(21.0f), (getHeight() - this.imageDrawable.getIntrinsicHeight()) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.imageDrawable.getIntrinsicHeight()) / 2);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            super.dispatchDraw(canvas);
            updateImageBounds();
            this.imageDrawable.setColor(Integer.valueOf(this.color));
            Text text = this.offText;
            if (text != null) {
                canvas2 = canvas;
                text.draw(canvas2, (getMeasuredWidth() - this.offText.getWidth()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, this.resourcesProvider), 1.0f);
            } else {
                canvas2 = canvas;
                this.imageDrawable.draw(canvas2);
            }
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
                if (paint != null) {
                    canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : 0), getMeasuredHeight() - 1, paint);
                }
            }
        }

        public int getColor() {
            return this.color;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageDrawable.detach();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageDrawable.attach();
        }
    }

    public static class ThemeChooser extends FrameLayout {
        private final RecyclerListView.SelectionAdapter adapter;
        private final int currentAccount;
        private String currentEmoticon;
        private boolean dataLoaded;
        private TLRPC.WallPaper fallbackWallpaper;
        public final List items;
        private final RecyclerListView listView;
        private final HashMap loadingThemes;
        private final HashMap loadingWallpapers;
        private Utilities.Callback onEmoticonSelected;
        private FlickerLoadingView progressView;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean withRemovedStub;

        public void setWithRemovedStub(boolean z) {
            this.withRemovedStub = z;
        }

        public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
            this.onEmoticonSelected = callback;
        }

        public void setSelectedEmoticon(String str, boolean z) {
            this.currentEmoticon = str;
            int i = -1;
            for (int i2 = 0; i2 < this.items.size(); i2++) {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) this.items.get(i2);
                boolean z2 = TextUtils.equals(this.currentEmoticon, chatThemeItem.getEmoticon()) || (TextUtils.isEmpty(str) && chatThemeItem.chatTheme.showAsDefaultStub);
                chatThemeItem.isSelected = z2;
                if (z2) {
                    i = i2;
                }
            }
            if (i >= 0 && !z && (this.listView.getLayoutManager() instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) this.listView.getLayoutManager()).scrollToPositionWithOffset(i, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
            }
            updateSelected();
        }

        public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
            this.fallbackWallpaper = wallPaper;
            AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChannelColorActivity.ThemeChooser.$r8$lambda$OB8VqyI5K6Dw4KJIF2JM4ZgzFGA(this.f$0, (View) obj);
                }
            });
            if (this.fallbackWallpaper != null) {
                if ((this.items.isEmpty() || ((ChatThemeBottomSheet.ChatThemeItem) this.items.get(0)).chatTheme.showAsDefaultStub) && this.withRemovedStub) {
                    this.items.add(0, new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createChatThemesRemoved(this.currentAccount)));
                    this.adapter.notifyDataSetChanged();
                }
            }
        }

        public static void $r8$lambda$OB8VqyI5K6Dw4KJIF2JM4ZgzFGA(ThemeChooser themeChooser, View view) {
            themeChooser.getClass();
            if (view instanceof ThemeSmallPreviewView) {
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) view;
                themeSmallPreviewView.setFallbackWallpaper(themeSmallPreviewView.chatThemeItem.chatTheme.showAsRemovedStub ? null : themeChooser.fallbackWallpaper);
            }
        }

        private void updateSelected() {
            int childAdapterPosition;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if ((childAt instanceof ThemeSmallPreviewView) && (childAdapterPosition = this.listView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < this.items.size()) {
                    ((ThemeSmallPreviewView) childAt).setSelected(((ChatThemeBottomSheet.ChatThemeItem) this.items.get(childAdapterPosition)).isSelected, true);
                }
            }
        }

        public boolean isDark() {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            return resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        }

        public ThemeChooser(Context context, final boolean z, final int i, final Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.items = new ArrayList();
            this.loadingThemes = new HashMap();
            this.loadingWallpapers = new HashMap();
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            if (!z) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), resourcesProvider);
                this.progressView = flickerLoadingView;
                flickerLoadingView.setViewType(14);
                this.progressView.setVisibility(0);
                addView(this.progressView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
            }
            RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
                @Override
                public Integer getSelectorColor(int i2) {
                    return 0;
                }
            };
            this.listView = recyclerListView;
            recyclerListView.setClipToPadding(false);
            recyclerListView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z ? 13.0f : 6.0f));
            if (z) {
                recyclerListView.setHasFixedSize(false);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
                gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int i2) {
                        return 1;
                    }
                });
                recyclerListView.setLayoutManager(gridLayoutManager);
            } else {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                recyclerListView.setAlpha(0.0f);
            }
            RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
                @Override
                public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                    return new RecyclerListView.Holder(new ThemeSmallPreviewView(viewGroup.getContext(), i, resourcesProvider, z ? 4 : 3) {
                        @Override
                        protected String noThemeString() {
                            return LocaleController.getString(R.string.ChannelNoWallpaper);
                        }

                        @Override
                        protected int noThemeStringTextSize() {
                            if (z) {
                                return super.noThemeStringTextSize();
                            }
                            return 13;
                        }
                    });
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
                    Theme.ThemeInfo themeInfo = ((ChatThemeBottomSheet.ChatThemeItem) ThemeChooser.this.items.get(i2)).chatTheme.getThemeInfo(((ChatThemeBottomSheet.ChatThemeItem) ThemeChooser.this.items.get(i2)).themeIndex);
                    if (themeInfo != null && themeInfo.pathToFile != null && !themeInfo.previewParsed && new File(themeInfo.pathToFile).exists()) {
                        ThemeChooser.this.parseTheme(themeInfo);
                    }
                    ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) ThemeChooser.this.items.get(i2);
                    themeSmallPreviewView.setEnabled(true);
                    themeSmallPreviewView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray));
                    themeSmallPreviewView.setItem(chatThemeItem, false);
                    themeSmallPreviewView.setSelected(chatThemeItem.isSelected, false);
                    themeSmallPreviewView.setFallbackWallpaper(chatThemeItem.chatTheme.showAsRemovedStub ? null : ThemeChooser.this.fallbackWallpaper);
                }

                @Override
                public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition < 0 || adapterPosition >= ThemeChooser.this.items.size()) {
                        return;
                    }
                    ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) ThemeChooser.this.items.get(adapterPosition);
                    ((ThemeSmallPreviewView) viewHolder.itemView).setSelected(chatThemeItem.isSelected, false);
                    ((ThemeSmallPreviewView) viewHolder.itemView).setFallbackWallpaper(chatThemeItem.chatTheme.showAsRemovedStub ? null : ThemeChooser.this.fallbackWallpaper);
                }

                @Override
                public int getItemCount() {
                    return ThemeChooser.this.items.size();
                }
            };
            this.adapter = selectionAdapter;
            recyclerListView.setAdapter(selectionAdapter);
            addView(recyclerListView, LayoutHelper.createFrame(-1, z ? -1.0f : 130.0f));
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i2) {
                    ChannelColorActivity.ThemeChooser.$r8$lambda$0VtWTD9gL0ILtaWkcwmJ8B33SVk(this.f$0, z, view, i2);
                }
            });
            ChatThemeController chatThemeController = ChatThemeController.getInstance(i);
            chatThemeController.preloadAllWallpaperThumbs(true);
            chatThemeController.preloadAllWallpaperThumbs(false);
            chatThemeController.preloadAllWallpaperImages(true);
            chatThemeController.preloadAllWallpaperImages(false);
            chatThemeController.requestAllChatThemes(new AnonymousClass4(i), true);
            updateState(false);
        }

        public static void $r8$lambda$0VtWTD9gL0ILtaWkcwmJ8B33SVk(ThemeChooser themeChooser, boolean z, View view, int i) {
            if (i < 0) {
                themeChooser.getClass();
                return;
            }
            if (i >= themeChooser.items.size()) {
                return;
            }
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) themeChooser.items.get(i);
            if (!z) {
                themeChooser.setSelectedEmoticon(chatThemeItem.getEmoticon(), true);
                if (view.getLeft() < themeChooser.listView.getPaddingLeft() + AndroidUtilities.dp(24.0f)) {
                    RecyclerListView recyclerListView = themeChooser.listView;
                    recyclerListView.smoothScrollBy(-((recyclerListView.getPaddingLeft() + AndroidUtilities.dp(48.0f)) - view.getLeft()), 0);
                } else if (view.getLeft() + view.getWidth() > (themeChooser.listView.getMeasuredWidth() - themeChooser.listView.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    themeChooser.listView.smoothScrollBy((view.getLeft() + view.getWidth()) - ((themeChooser.listView.getMeasuredWidth() - themeChooser.listView.getPaddingRight()) - AndroidUtilities.dp(48.0f)), 0);
                }
            }
            Utilities.Callback callback = themeChooser.onEmoticonSelected;
            if (callback != null) {
                callback.run(chatThemeItem.getEmoticon());
            }
        }

        class AnonymousClass4 implements ResultCallback {
            final int val$currentAccount;

            @Override
            public void onError(Throwable th) {
                ResultCallback.CC.$default$onError(this, th);
            }

            AnonymousClass4(int i) {
                this.val$currentAccount = i;
            }

            @Override
            public void onComplete(final List list) {
                NotificationCenter.getInstance(this.val$currentAccount).doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        ChannelColorActivity.ThemeChooser.this.onDataLoaded(list);
                    }
                });
            }

            @Override
            public void onError(TLRPC.TL_error tL_error) {
                Toast.makeText(ThemeChooser.this.getContext(), tL_error.text, 0).show();
            }
        }

        public void updateColors() {
            boolean zIsDark = isDark();
            for (int i = 0; i < this.items.size(); i++) {
                ((ChatThemeBottomSheet.ChatThemeItem) this.items.get(i)).themeIndex = zIsDark ? 1 : 0;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChannelColorActivity.ThemeChooser.$r8$lambda$m9Rjn50LqhUkv05O3BvHzJ_a57A(this.f$0, (View) obj);
                }
            });
            this.adapter.notifyDataSetChanged();
        }

        public static void $r8$lambda$m9Rjn50LqhUkv05O3BvHzJ_a57A(ThemeChooser themeChooser, View view) {
            themeChooser.getClass();
            ((ThemeSmallPreviewView) view).setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, themeChooser.resourcesProvider));
        }

        public void onDataLoaded(List list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.dataLoaded = true;
            this.items.clear();
            this.items.add(0, new ChatThemeBottomSheet.ChatThemeItem((EmojiThemes) list.get(0)));
            if (this.fallbackWallpaper != null && this.withRemovedStub) {
                this.items.add(0, new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createChatThemesRemoved(this.currentAccount)));
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int iIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
            for (int i = 1; i < list.size(); i++) {
                EmojiThemes emojiThemes = (EmojiThemes) list.get(i);
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
                emojiThemes.loadPreviewColors(this.currentAccount);
                chatThemeItem.themeIndex = iIsDark;
                this.items.add(chatThemeItem);
            }
            int i2 = -1;
            for (int i3 = 0; i3 < this.items.size(); i3++) {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem2 = (ChatThemeBottomSheet.ChatThemeItem) this.items.get(i3);
                boolean z = TextUtils.equals(this.currentEmoticon, chatThemeItem2.getEmoticon()) || (TextUtils.isEmpty(this.currentEmoticon) && chatThemeItem2.chatTheme.showAsDefaultStub);
                chatThemeItem2.isSelected = z;
                if (z) {
                    i2 = i3;
                }
            }
            RecyclerListView.SelectionAdapter selectionAdapter = this.adapter;
            if (selectionAdapter != null) {
                selectionAdapter.notifyDataSetChanged();
            }
            this.listView.animate().alpha(1.0f).setDuration(150L).start();
            updateState(true);
            if (i2 < 0 || !(this.listView.getLayoutManager() instanceof LinearLayoutManager)) {
                return;
            }
            ((LinearLayoutManager) this.listView.getLayoutManager()).scrollToPositionWithOffset(i2, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }

        public boolean parseTheme(final Theme.ThemeInfo themeInfo) {
            int iStringKeyToInt;
            int iIntValue;
            String[] strArrSplit;
            if (themeInfo == null || themeInfo.pathToFile == null) {
                return false;
            }
            boolean z = true;
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(themeInfo.pathToFile));
                int i = 0;
                boolean z2 = false;
                while (true) {
                    try {
                        int i2 = fileInputStream.read(ThemesHorizontalListCell.bytes);
                        if (i2 == -1) {
                            break;
                        }
                        int i3 = i;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i2) {
                            byte[] bArr = ThemesHorizontalListCell.bytes;
                            if (bArr[i4] == 10) {
                                int i6 = i4 - i5;
                                int i7 = i6 + 1;
                                String str = new String(bArr, i5, i6, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String strSubstring = str.substring(4);
                                    Uri uri = Uri.parse(strSubstring);
                                    themeInfo.slug = uri.getQueryParameter("slug");
                                    themeInfo.pathToWallpaper = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strSubstring) + ".wp").getAbsolutePath();
                                    String queryParameter = uri.getQueryParameter("mode");
                                    if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                        for (String str2 : strArrSplit) {
                                            if ("blur".equals(str2)) {
                                                themeInfo.isBlured = z;
                                                break;
                                            }
                                        }
                                    }
                                    if (!TextUtils.isEmpty(uri.getQueryParameter("pattern"))) {
                                        try {
                                            String queryParameter2 = uri.getQueryParameter("bg_color");
                                            if (!TextUtils.isEmpty(queryParameter2)) {
                                                themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                    themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                }
                                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                    themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                }
                                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                    themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                }
                                            }
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            String queryParameter3 = uri.getQueryParameter("rotation");
                                            if (!TextUtils.isEmpty(queryParameter3)) {
                                                themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        String queryParameter4 = uri.getQueryParameter("intensity");
                                        if (!TextUtils.isEmpty(queryParameter4)) {
                                            themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                        }
                                        if (themeInfo.patternIntensity == 0) {
                                            themeInfo.patternIntensity = 50;
                                        }
                                    }
                                } else {
                                    if (str.startsWith("WPS")) {
                                        themeInfo.previewWallpaperOffset = i7 + i3;
                                        z2 = true;
                                        break;
                                    }
                                    int iIndexOf = str.indexOf(61);
                                    if (iIndexOf != -1 && ((iStringKeyToInt = ThemeColors.stringKeyToInt(str.substring(0, iIndexOf))) == Theme.key_chat_inBubble || iStringKeyToInt == Theme.key_chat_outBubble || iStringKeyToInt == Theme.key_chat_wallpaper || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                        String strSubstring2 = str.substring(iIndexOf + 1);
                                        if (strSubstring2.length() > 0 && strSubstring2.charAt(0) == '#') {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring2);
                                            } catch (Exception unused3) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                            }
                                        } else {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                        }
                                        if (iStringKeyToInt == Theme.key_chat_inBubble) {
                                            themeInfo.setPreviewInColor(iIntValue);
                                        } else if (iStringKeyToInt == Theme.key_chat_outBubble) {
                                            themeInfo.setPreviewOutColor(iIntValue);
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper) {
                                            themeInfo.setPreviewBackgroundColor(iIntValue);
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1) {
                                            themeInfo.previewBackgroundGradientColor1 = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2) {
                                            themeInfo.previewBackgroundGradientColor2 = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3) {
                                            themeInfo.previewBackgroundGradientColor3 = iIntValue;
                                        }
                                    }
                                    FileLog.e(th);
                                    if (themeInfo.pathToWallpaper == null && !themeInfo.badWallpaper && !new File(themeInfo.pathToWallpaper).exists()) {
                                        if (this.loadingWallpapers.containsKey(themeInfo)) {
                                            return false;
                                        }
                                        this.loadingWallpapers.put(themeInfo, themeInfo.slug);
                                        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                        tL_inputWallPaperSlug.slug = themeInfo.slug;
                                        getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                        ConnectionsManager.getInstance(themeInfo.account).sendRequest(getwallpaper, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                ChannelColorActivity.ThemeChooser.$r8$lambda$1I8C7W5snQa2CJlZuOOFn1UcJR8(this.f$0, themeInfo, tLObject, tL_error);
                                            }
                                        });
                                        return false;
                                    }
                                    themeInfo.previewParsed = true;
                                    return true;
                                }
                                i5 += i7;
                                i3 += i7;
                            }
                            i4++;
                            z = true;
                        }
                        if (z2 || i == i3) {
                            break;
                            break;
                        }
                        fileInputStream.getChannel().position(i3);
                        i = i3;
                        z = true;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                fileInputStream.close();
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            if (themeInfo.pathToWallpaper == null) {
            }
            themeInfo.previewParsed = true;
            return true;
        }

        public static void $r8$lambda$1I8C7W5snQa2CJlZuOOFn1UcJR8(final ThemeChooser themeChooser, final Theme.ThemeInfo themeInfo, final TLObject tLObject, TLRPC.TL_error tL_error) {
            themeChooser.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChannelColorActivity.ThemeChooser.m1562$r8$lambda$7HvZqeaHo3noElDqTUdJv6LH2g(this.f$0, tLObject, themeInfo);
                }
            });
        }

        public static void m1562$r8$lambda$7HvZqeaHo3noElDqTUdJv6LH2g(ThemeChooser themeChooser, TLObject tLObject, Theme.ThemeInfo themeInfo) {
            themeChooser.getClass();
            if (tLObject instanceof TLRPC.TL_wallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (themeChooser.loadingThemes.containsKey(attachFileName)) {
                    return;
                }
                themeChooser.loadingThemes.put(attachFileName, themeInfo);
                FileLoader.getInstance(themeInfo.account).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            }
            themeInfo.badWallpaper = true;
        }

        private void updateState(boolean z) {
            if (!this.dataLoaded) {
                AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 1.0f, true, z);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 1.0f, true, z);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public ChannelColorActivity setOnApplied(BaseFragment baseFragment) {
        this.bulletinFragment = baseFragment;
        return this;
    }

    private void showBulletin() {
        BaseFragment baseFragment = this.bulletinFragment;
        if (baseFragment != null) {
            if (baseFragment instanceof ChatEditActivity) {
                ((ChatEditActivity) baseFragment).updateColorCell();
            }
            BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(this.isGroup ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated)).show();
            this.bulletinFragment = null;
        }
    }

    public void updateColors(boolean z) {
        this.actionBar.setBackgroundColor(getThemedColor(Theme.key_actionBarDefault));
        this.actionBar.setTitleColor((!this.isGroup || this.selectedProfileColor == -1) ? getThemedColor(Theme.key_actionBarDefaultTitle) : -1);
        this.actionBar.setItemsColor((!this.isGroup || this.selectedProfileColor == -1) ? getThemedColor(Theme.key_actionBarDefaultIcon) : -1, false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSelector), false);
        if (z) {
            return;
        }
        RecyclerListView recyclerListView = this.listView;
        int i = Theme.key_windowBackgroundGray;
        recyclerListView.setBackgroundColor(getThemedColor(i));
        this.adapter.notifyDataSetChanged();
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.updateColors((View) obj);
            }
        });
        this.buttonContainer.setBackgroundColor(getThemedColor(i));
        this.button.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    public boolean hasUnsavedChanged() {
        return (this.currentReplyColor == this.selectedReplyColor && this.currentReplyEmoji == this.selectedReplyEmoji && this.currentProfileColor == this.selectedProfileColor && this.currentProfileEmoji == this.selectedProfileEmoji && DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji) && ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) ? false : true;
    }

    public void updateColors(View view) {
        if (view instanceof EmojiCell) {
            ((EmojiCell) view).updateColors();
            return;
        }
        if (view instanceof TextCell) {
            ((TextCell) view).updateColors();
        } else if (view instanceof PeerColorPicker) {
            ((PeerColorPicker) view).updateColors();
        } else if (view instanceof ThemeChooser) {
            ((ThemeChooser) view).updateColors();
        }
    }

    static class PeerColorPicker extends FrameLayout {
        public final RecyclerListView.SelectionAdapter adapter;
        private final int currentAccount;
        public final LinearLayoutManager layoutManager;
        public final RecyclerListView listView;
        private final Theme.ResourcesProvider resourcesProvider;
        private int selectedPosition;

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (getParent() != null) {
                ViewParent parent = getParent();
                boolean z = true;
                if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                    z = false;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public PeerColorPicker(final Context context, final int i, final Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
                @Override
                public Integer getSelectorColor(int i2) {
                    return 0;
                }
            };
            this.listView = recyclerListView;
            recyclerListView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
            recyclerListView.setClipToPadding(false);
            RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
                @Override
                public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                    return new RecyclerListView.Holder(PeerColorPicker.this.new ColorCell(context));
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    ColorCell colorCell = (ColorCell) viewHolder.itemView;
                    colorCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                    colorCell.setSelected(i2 == PeerColorPicker.this.selectedPosition, false);
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
                    if (peerColors == null || i2 < 0 || i2 >= peerColors.colors.size()) {
                        return;
                    }
                    colorCell.set(peerColors.colors.get(i2));
                }

                @Override
                public int getItemCount() {
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
                    if (peerColors == null) {
                        return 0;
                    }
                    return peerColors.colors.size();
                }
            };
            this.adapter = selectionAdapter;
            recyclerListView.setAdapter(selectionAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.layoutManager = linearLayoutManager;
            linearLayoutManager.setOrientation(0);
            recyclerListView.setLayoutManager(linearLayoutManager);
            addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void setSelected(int i, boolean z) {
            setSelectedPosition(toPosition(i), z);
        }

        public void setSelectedPosition(int i, final boolean z) {
            if (i != this.selectedPosition) {
                this.selectedPosition = i;
                if (!z) {
                    this.layoutManager.scrollToPositionWithOffset(i, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
                }
                AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ChannelColorActivity.PeerColorPicker.$r8$lambda$IwvaYpvJQfgn8AaFp_d_PH6MxOk(this.f$0, z, (View) obj);
                    }
                });
            }
        }

        public static void $r8$lambda$IwvaYpvJQfgn8AaFp_d_PH6MxOk(PeerColorPicker peerColorPicker, boolean z, View view) {
            peerColorPicker.getClass();
            ((ColorCell) view).setSelected(peerColorPicker.listView.getChildAdapterPosition(view) == peerColorPicker.selectedPosition, z);
        }

        public int toPosition(int i) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
            if (peerColors == null) {
                return 0;
            }
            for (int i2 = 0; i2 < peerColors.colors.size(); i2++) {
                if (peerColors.colors.get(i2).id == i) {
                    return i2;
                }
            }
            return 0;
        }

        public void updateColors() {
            final MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
            AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChannelColorActivity.PeerColorPicker.$r8$lambda$ka1CfbERPsIJQcZJJhHCMzL2tvc(this.f$0, peerColors, (View) obj);
                }
            });
        }

        public static void $r8$lambda$ka1CfbERPsIJQcZJJhHCMzL2tvc(PeerColorPicker peerColorPicker, MessagesController.PeerColors peerColors, View view) {
            peerColorPicker.getClass();
            if (view instanceof ColorCell) {
                ColorCell colorCell = (ColorCell) view;
                colorCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, peerColorPicker.resourcesProvider));
                int childAdapterPosition = peerColorPicker.listView.getChildAdapterPosition(view);
                if (peerColors == null || childAdapterPosition < 0 || childAdapterPosition >= peerColors.colors.size()) {
                    return;
                }
                colorCell.set(peerColors.colors.get(childAdapterPosition));
            }
        }

        public int toColorId(int i) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
            if (peerColors == null || i < 0 || i >= peerColors.colors.size()) {
                return 0;
            }
            return peerColors.colors.get(i).id;
        }

        class ColorCell extends View {
            private final Paint backgroundPaint;
            private final ButtonBounce bounce;
            private final Path circlePath;
            private final Path color2Path;
            private boolean hasColor2;
            private boolean hasColor3;
            private final Paint paint1;
            private final Paint paint2;
            private final Paint paint3;
            private boolean selected;
            private final AnimatedFloat selectedT;

            public ColorCell(Context context) {
                super(context);
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.paint1 = new Paint(1);
                this.paint2 = new Paint(1);
                this.paint3 = new Paint(1);
                this.circlePath = new Path();
                this.color2Path = new Path();
                this.bounce = new ButtonBounce(this);
                this.selectedT = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
                paint.setStyle(Paint.Style.STROKE);
            }

            @Override
            public void setBackgroundColor(int i) {
                this.backgroundPaint.setColor(i);
            }

            public void set(MessagesController.PeerColor peerColor) {
                if (!(PeerColorPicker.this.resourcesProvider != null ? PeerColorPicker.this.resourcesProvider.isDark() : Theme.isCurrentThemeDark()) || !peerColor.hasColor2() || peerColor.hasColor3()) {
                    this.paint1.setColor(peerColor.getColor(0, PeerColorPicker.this.resourcesProvider));
                    this.paint2.setColor(peerColor.getColor(1, PeerColorPicker.this.resourcesProvider));
                } else {
                    this.paint1.setColor(peerColor.getColor(1, PeerColorPicker.this.resourcesProvider));
                    this.paint2.setColor(peerColor.getColor(0, PeerColorPicker.this.resourcesProvider));
                }
                this.paint3.setColor(peerColor.getColor(2, PeerColorPicker.this.resourcesProvider));
                this.hasColor2 = peerColor.hasColor2();
                this.hasColor3 = peerColor.hasColor3();
            }

            public void setSelected(boolean z, boolean z2) {
                this.selected = z;
                if (!z2) {
                    this.selectedT.set(z, true);
                }
                invalidate();
            }

            @Override
            protected void onMeasure(int i, int i2) {
                setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                this.circlePath.rewind();
                this.circlePath.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
                this.color2Path.rewind();
                this.color2Path.moveTo(getMeasuredWidth(), 0.0f);
                this.color2Path.lineTo(getMeasuredWidth(), getMeasuredHeight());
                this.color2Path.lineTo(0.0f, getMeasuredHeight());
                this.color2Path.close();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                float scale = this.bounce.getScale(0.05f);
                canvas.scale(scale, scale, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                canvas.save();
                canvas.clipPath(this.circlePath);
                canvas.drawPaint(this.paint1);
                if (this.hasColor2) {
                    canvas.drawPath(this.color2Path, this.paint2);
                }
                canvas.restore();
                if (this.hasColor3) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredWidth() + AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() + AndroidUtilities.dp(12.4f)) / 2.0f);
                    canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.paint3);
                    canvas.restore();
                }
                float f = this.selectedT.set(this.selected);
                if (f > 0.0f) {
                    this.backgroundPaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp(AndroidUtilities.dp(20.0f) + (this.backgroundPaint.getStrokeWidth() * 0.5f), AndroidUtilities.dp(20.0f) - (this.backgroundPaint.getStrokeWidth() * 2.0f), f), this.backgroundPaint);
                }
                canvas.restore();
            }

            @Override
            public void setPressed(boolean z) {
                super.setPressed(z);
                this.bounce.setPressed(z);
            }
        }
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
        final float measuredWidth = f + (this.dayNightItem.getMeasuredWidth() / 2.0f);
        final float measuredHeight = f2 + (this.dayNightItem.getMeasuredHeight() / 2.0f);
        final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        View view = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (!ChannelColorActivity.this.isDark) {
                    canvas2.drawCircle(measuredWidth, measuredHeight, fMax * (1.0f - ChannelColorActivity.this.changeDayNightViewProgress), paint2);
                } else {
                    if (ChannelColorActivity.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, fMax * ChannelColorActivity.this.changeDayNightViewProgress, paint);
                    }
                    canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                ChannelColorActivity.this.dayNightItem.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightView = view;
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ChannelColorActivity.$r8$lambda$hmVvo36VO0QvCdUVJUydBvkeXWs(view2, motionEvent);
            }
        });
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChannelColorActivity.this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChannelColorActivity.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || ChannelColorActivity.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ChannelColorActivity.this.changeDayNightView != null) {
                    if (ChannelColorActivity.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) ChannelColorActivity.this.changeDayNightView.getParent()).removeView(ChannelColorActivity.this.changeDayNightView);
                    }
                    ChannelColorActivity.this.changeDayNightView = null;
                }
                ChannelColorActivity.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelColorActivity.m1554$r8$lambda$5blpapbXzMfWm4pzfC9d_Nu4ck(this.f$0);
            }
        });
    }

    public static void m1554$r8$lambda$5blpapbXzMfWm4pzfC9d_Nu4ck(ChannelColorActivity channelColorActivity) {
        Theme.ResourcesProvider resourcesProvider = channelColorActivity.resourceProvider;
        if (resourcesProvider instanceof ThemeDelegate) {
            ((ThemeDelegate) resourcesProvider).toggle();
        } else {
            channelColorActivity.isDark = !channelColorActivity.isDark;
            channelColorActivity.updateThemeColors();
        }
        channelColorActivity.setForceDark(channelColorActivity.isDark, true);
        channelColorActivity.updateColors(false);
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
        ActionBarMenuItem actionBarMenuItem = this.dayNightItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.invalidate();
        }
    }

    public void updateThemeColors() {
        Theme.ThemeInfo theme;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] defaultColors;
        View viewFindChildAt;
        int i;
        Theme.ThemeAccent accent;
        int i2;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (Theme.getTheme(string) == null || Theme.getTheme(string).isDark()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (Theme.getTheme(string2) == null || !Theme.getTheme(string2).isDark()) {
            string2 = "Dark Blue";
        }
        Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
        if (string.equals(string2)) {
            if (activeTheme.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            if (this.isDark) {
                theme = Theme.getTheme(str3);
            } else {
                theme = Theme.getTheme(str2);
            }
            this.currentColors.clear();
            strArr = new String[1];
            str = theme.assetName;
            if (str != null) {
                themeFileValues = Theme.getThemeFileValues(null, str, strArr);
            } else {
                themeFileValues = Theme.getThemeFileValues(new File(theme.pathToFile), null, strArr);
            }
            defaultColors = Theme.getDefaultColors();
            if (defaultColors != null) {
                for (i2 = 0; i2 < defaultColors.length; i2++) {
                    this.currentColors.put(i2, defaultColors[i2]);
                }
            }
            if (themeFileValues != null) {
                for (i = 0; i < themeFileValues.size(); i++) {
                    this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
                }
                accent = theme.getAccent(false);
                if (accent != null) {
                    accent.fillAccentColors(themeFileValues, this.currentColors);
                }
            }
            this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
            this.backgroundDrawable = PreviewView.getBackgroundDrawable(this.backgroundDrawable, this.currentAccount, this.selectedWallpaper, this.isDark);
            viewFindChildAt = findChildAt(this.messagesPreviewRow);
            if (viewFindChildAt instanceof ThemePreviewMessagesCell) {
                ((ThemePreviewMessagesCell) viewFindChildAt).setOverrideBackground(this.backgroundDrawable);
            }
        }
        str3 = string2;
        str2 = string;
        if (this.isDark) {
            theme = Theme.getTheme(str3);
        } else {
            theme = Theme.getTheme(str2);
        }
        this.currentColors.clear();
        strArr = new String[1];
        str = theme.assetName;
        if (str != null) {
            themeFileValues = Theme.getThemeFileValues(null, str, strArr);
        } else {
            themeFileValues = Theme.getThemeFileValues(new File(theme.pathToFile), null, strArr);
        }
        defaultColors = Theme.getDefaultColors();
        if (defaultColors != null) {
            while (i2 < defaultColors.length) {
                this.currentColors.put(i2, defaultColors[i2]);
            }
        }
        if (themeFileValues != null) {
            while (i < themeFileValues.size()) {
                this.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
            }
            accent = theme.getAccent(false);
            if (accent != null) {
                accent.fillAccentColors(themeFileValues, this.currentColors);
            }
        }
        this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
        this.backgroundDrawable = PreviewView.getBackgroundDrawable(this.backgroundDrawable, this.currentAccount, this.selectedWallpaper, this.isDark);
        viewFindChildAt = findChildAt(this.messagesPreviewRow);
        if (viewFindChildAt instanceof ThemePreviewMessagesCell) {
            ((ThemePreviewMessagesCell) viewFindChildAt).setOverrideBackground(this.backgroundDrawable);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatWasBoostedByUser) {
            if (this.dialogId == ((Long) objArr[2]).longValue()) {
                updateBoostsAndLevels((TL_stories.TL_premium_boostsStatus) objArr[0]);
                return;
            }
            return;
        }
        if (i == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.updateBoostsAndLevels((TL_stories.TL_premium_boostsStatus) obj);
                }
            });
        } else if (i == NotificationCenter.dialogDeleted) {
            if (this.dialogId == ((Long) objArr[0]).longValue()) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public void updateBoostsAndLevels(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            this.boostsStatus = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.currentLevel = i;
            if (chat != null) {
                chat.level = i;
            }
            Adapter adapter = this.adapter;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            updateButton(true);
        }
    }
}
