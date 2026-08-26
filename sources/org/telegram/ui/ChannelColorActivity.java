package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.stripe.android.Stripe;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.WallpapersListActivity;

public class ChannelColorActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public Adapter adapter;
    public Drawable backgroundDrawable;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public BaseFragment bulletinFragment;
    public ButtonWithCounterView button;
    public FrameLayout buttonContainer;
    public PeerColorActivity.AnonymousClass7 changeDayNightView;
    public ValueAnimator changeDayNightViewAnimator;
    public float changeDayNightViewProgress;
    public final SparseIntArray currentColors;
    public int currentLevel;
    public int currentProfileColor;
    public long currentProfileEmoji;
    public int currentReplyColor;
    public long currentReplyEmoji;
    public TLRPC.EmojiStatus currentStatusEmoji;
    public TLRPC.WallPaper currentWallpaper;
    public ActionBarMenuItem dayNightItem;
    public final long dialogId;
    public final Paint dividerPaint;
    public int emptyRow;
    public boolean forceDark;
    public TLRPC.WallPaper galleryWallpaper;
    public boolean isDark;
    public boolean isGroup;
    public RecyclerListView listView;
    public SpannableStringBuilder lock;
    public int messagesPreviewRow;
    public final MessageDrawable msgInDrawable;
    public final MessageDrawable msgInDrawableSelected;
    public final Drawable msgOutCheckReadDrawable;
    public final MessageDrawable msgOutDrawable;
    public final MessageDrawable msgOutDrawableSelected;
    public final Drawable msgOutHalfCheckDrawable;
    public int packEmojiHintRow;
    public int packEmojiRow;
    public int packStickerHintRow;
    public int packStickerRow;
    public Theme.ResourcesProvider parentResourcesProvider;
    public int profileColorGridRow;
    public int profileEmojiRow;
    public int profileHintRow;
    public int profilePreviewRow;
    public int removeProfileColorRow;
    public int replyColorListRow;
    public int replyEmojiRow;
    public int replyHintRow;
    public int rowsCount;
    public AnonymousClass6 selectAnimatedEmojiDialog;
    public int selectedProfileColor;
    public long selectedProfileEmoji;
    public int selectedReplyColor;
    public long selectedReplyEmoji;
    public TLRPC.EmojiStatus selectedStatusEmoji;
    public TLRPC.WallPaper selectedWallpaper;
    public int statusEmojiRow;
    public int statusHintRow;
    public RLottieDrawable sunDrawable;
    public int wallpaperHintRow;
    public int wallpaperRow;
    public int wallpaperThemesRow;

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return ChannelColorActivity.this.rowsCount;
        }

        @Override
        public final int getItemViewType(int i) {
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
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 5 || i == 6;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.StickerSet stickerSet;
            TLRPC.Document document;
            TLRPC.StickerSet stickerSet2;
            int i2 = viewHolder.mItemViewType;
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 1) {
                ProfilePreview profilePreview = (ProfilePreview) view;
                profilePreview.backgroundView.setColor(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.selectedProfileColor, false);
                int i3 = channelColorActivity.selectedProfileColor;
                ProfilePreview.AnonymousClass1 anonymousClass1 = profilePreview.profileView;
                anonymousClass1.setColor(i3, false);
                anonymousClass1.setEmoji(channelColorActivity.selectedProfileEmoji, false, false);
                anonymousClass1.setForum(channelColorActivity.isForum());
                anonymousClass1.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(channelColorActivity.selectedStatusEmoji), false, false);
                anonymousClass1.overrideAvatarColor(channelColorActivity.selectedReplyColor);
                return;
            }
            if (i2 == 3) {
                ((PeerColorPicker) view).setSelected(channelColorActivity.selectedReplyColor, false);
                return;
            }
            if (i2 == 4) {
                ((PeerColorActivity.PeerColorGrid) view).setSelected(channelColorActivity.selectedProfileColor, false);
                return;
            }
            if (i2 == 5) {
                TextCell textCell = (TextCell) view;
                if (i == channelColorActivity.removeProfileColorRow) {
                    textCell.setText(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                    return;
                }
                textCell.setText(LocaleController.getString(channelColorActivity.getWallpaperStrRes()), false);
                int i4 = channelColorActivity.currentLevel;
                int customWallpaperLevelMin = channelColorActivity.getCustomWallpaperLevelMin();
                SimpleTextView simpleTextView = textCell.textView;
                if (i4 >= customWallpaperLevelMin) {
                    simpleTextView.setRightDrawable((Drawable) null);
                    return;
                }
                int customWallpaperLevelMin2 = channelColorActivity.getCustomWallpaperLevelMin();
                if (customWallpaperLevelMin2 <= 0) {
                    simpleTextView.setRightDrawable((Drawable) null);
                    return;
                } else {
                    simpleTextView.setRightDrawable(new PeerColorActivity.LevelLock(customWallpaperLevelMin2, textCell.getContext(), textCell.resourcesProvider, false));
                    simpleTextView.setDrawablePadding(AndroidUtilities.dp(6.0f));
                    return;
                }
            }
            if (i2 != 6) {
                if (i2 != 7) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setFixedSize(0);
                if (i == channelColorActivity.emptyRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText("");
                    return;
                }
                if (i == channelColorActivity.replyHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                    return;
                }
                if (i == channelColorActivity.wallpaperHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity.getWallpaper2InfoStrRes()));
                    return;
                }
                if (i == channelColorActivity.profileHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity.getProfileInfoStrRes()));
                    return;
                }
                if (i == channelColorActivity.statusHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity.getEmojiStatusInfoStrRes()));
                    return;
                }
                if (i == channelColorActivity.packEmojiHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity.getEmojiPackInfoStrRes()));
                    return;
                }
                if (i == channelColorActivity.packStickerHintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(channelColorActivity.getStickerPackInfoStrRes()));
                    return;
                } else {
                    if (i == 0) {
                        textInfoPrivacyCell.setText("");
                        textInfoPrivacyCell.setFixedSize(12);
                        return;
                    }
                    return;
                }
            }
            EmojiCell emojiCell = (EmojiCell) view;
            emojiCell.needDivider = false;
            emojiCell.setWillNotDraw(true);
            int i5 = channelColorActivity.replyEmojiRow;
            SimpleTextView simpleTextView2 = emojiCell.textView;
            if (i == i5) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.selectedReplyColor, true);
                simpleTextView2.setText(LocaleController.getString(R.string.ChannelReplyLogo), false);
                if (channelColorActivity.currentLevel < channelColorActivity.getMessagesController().channelBgIconLevelMin) {
                    emojiCell.setLockLevel(channelColorActivity.getMessagesController().channelBgIconLevelMin);
                } else {
                    emojiCell.setLockLevel(0);
                }
                emojiCell.setEmoji(channelColorActivity.selectedReplyEmoji, false, false);
                return;
            }
            if (i == channelColorActivity.profileEmojiRow) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.selectedProfileColor, false);
                simpleTextView2.setText(LocaleController.getString(R.string.ChannelProfileLogo), false);
                boolean z = channelColorActivity.removeProfileColorRow >= 0;
                emojiCell.needDivider = z;
                emojiCell.setWillNotDraw(!z);
                if (channelColorActivity.currentLevel < channelColorActivity.getProfileIconLevelMin()) {
                    emojiCell.setLockLevel(channelColorActivity.getProfileIconLevelMin());
                } else {
                    emojiCell.setLockLevel(0);
                }
                emojiCell.setEmoji(channelColorActivity.selectedProfileEmoji, false, false);
                return;
            }
            if (i == channelColorActivity.statusEmojiRow) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.selectedProfileColor, false);
                simpleTextView2.setText(LocaleController.getString(channelColorActivity.getEmojiStatusStrRes()), false);
                if (channelColorActivity.currentLevel < channelColorActivity.getEmojiStatusLevelMin()) {
                    emojiCell.setLockLevel(channelColorActivity.getEmojiStatusLevelMin());
                } else {
                    emojiCell.setLockLevel(0);
                }
                emojiCell.setEmoji(DialogObject.getEmojiStatusDocumentId(channelColorActivity.selectedStatusEmoji), DialogObject.isEmojiStatusCollectible(channelColorActivity.selectedStatusEmoji), false);
                return;
            }
            int i6 = channelColorActivity.packEmojiRow;
            long j = channelColorActivity.dialogId;
            if (i == i6) {
                emojiCell.setAdaptiveEmojiColor(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.selectedProfileColor, false);
                simpleTextView2.setText(LocaleController.getString(channelColorActivity.getEmojiPackStrRes()), false);
                if (channelColorActivity.currentLevel < channelColorActivity.getEmojiStickersLevelMin()) {
                    emojiCell.setLockLevel(channelColorActivity.getEmojiStickersLevelMin());
                } else {
                    emojiCell.setLockLevel(0);
                }
                TLRPC.ChatFull chatFull = channelColorActivity.getMessagesController().getChatFull(-j);
                if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                    emojiCell.setEmoji(0L, false, false);
                    return;
                }
                long j2 = stickerSet2.thumb_document_id;
                if (j2 == 0) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = channelColorActivity.getMediaDataController().getGroupStickerSetById(stickerSet2);
                    if (!groupStickerSetById.documents.isEmpty()) {
                        j2 = groupStickerSetById.documents.get(0).id;
                    }
                }
                emojiCell.setEmoji(j2, false, false);
                return;
            }
            if (i == channelColorActivity.packStickerRow) {
                simpleTextView2.setText(LocaleController.getString(channelColorActivity.getStickerPackStrRes()), false);
                emojiCell.setLockLevel(0);
                TLRPC.ChatFull chatFull2 = channelColorActivity.getMessagesController().getChatFull(-j);
                if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                    emojiCell.setEmoji(0L, false, false);
                    return;
                }
                if (stickerSet.thumb_document_id == 0) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById2 = channelColorActivity.getMediaDataController().getGroupStickerSetById(stickerSet);
                    if (groupStickerSetById2.documents.isEmpty()) {
                        document = null;
                    } else {
                        document = groupStickerSetById2.documents.get(0);
                    }
                } else {
                    document = null;
                }
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = emojiCell.imageDrawable;
                if (document == null) {
                    swapAnimatedEmojiDrawable.set((Drawable) null, false);
                    if (emojiCell.offText == null) {
                        emojiCell.offText = new Text(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
                    }
                } else {
                    swapAnimatedEmojiDrawable.set(document, swapAnimatedEmojiDrawable.cacheType, false);
                    emojiCell.offText = null;
                }
                swapAnimatedEmojiDrawable.setParticles(false, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ProfilePreview profilePreview;
            View textCell;
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            if (i == 0) {
                ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).parentLayout, channelColorActivity.getMessagePreviewType(), channelColorActivity.dialogId, ((BaseFragment) channelColorActivity).resourceProvider);
                themePreviewMessagesCell.customAnimation = true;
                themePreviewMessagesCell.setImportantForAccessibility(4);
                themePreviewMessagesCell.fragment = channelColorActivity;
                Drawable backgroundDrawable = PreviewView.getBackgroundDrawable(channelColorActivity.backgroundDrawable, ((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.selectedWallpaper, channelColorActivity.isDark);
                channelColorActivity.backgroundDrawable = backgroundDrawable;
                themePreviewMessagesCell.setOverrideBackground(backgroundDrawable);
                textCell = themePreviewMessagesCell;
            } else if (i == 2) {
                ThemeChooser themeChooser = new ThemeChooser(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider);
                themeChooser.setWithRemovedStub(true);
                String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(channelColorActivity.selectedWallpaper);
                if (wallpaperEmoticon == null && channelColorActivity.selectedWallpaper == null && channelColorActivity.galleryWallpaper != null) {
                    wallpaperEmoticon = "❌";
                }
                themeChooser.setSelectedEmoticon(wallpaperEmoticon, false);
                themeChooser.setGalleryWallpaper(channelColorActivity.galleryWallpaper);
                final int i2 = 0;
                themeChooser.setOnEmoticonSelected(new Utilities.Callback(this) {
                    public final ChannelColorActivity.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i2) {
                            case 0:
                                String str = (String) obj;
                                ChannelColorActivity channelColorActivity2 = ChannelColorActivity.this;
                                if (str == null) {
                                    channelColorActivity2.selectedWallpaper = channelColorActivity2.galleryWallpaper;
                                } else if (str.equals("❌")) {
                                    channelColorActivity2.selectedWallpaper = null;
                                } else {
                                    TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                    channelColorActivity2.selectedWallpaper = tL_wallPaperNoFile;
                                    tL_wallPaperNoFile.id = 0L;
                                    tL_wallPaperNoFile.flags |= 4;
                                    tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                    channelColorActivity2.selectedWallpaper.settings.emoticon = str;
                                }
                                channelColorActivity2.updateButton(true);
                                channelColorActivity2.updateMessagesPreview(true);
                                break;
                            default:
                                ChannelColorActivity.Adapter adapter = this.f$0;
                                adapter.getClass();
                                int iIntValue = ((Integer) obj).intValue();
                                ChannelColorActivity channelColorActivity3 = ChannelColorActivity.this;
                                channelColorActivity3.selectedProfileColor = iIntValue;
                                if (channelColorActivity3.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
                                    channelColorActivity3.selectedStatusEmoji = null;
                                }
                                channelColorActivity3.updateButton(true);
                                channelColorActivity3.updateProfilePreview();
                                channelColorActivity3.updateColors(true);
                                break;
                        }
                    }
                });
                textCell = themeChooser;
            } else if (i == 5) {
                textCell = new TextCell(23, channelColorActivity.getParentActivity(), channelColorActivity.getResourceProvider(), false, false);
            } else if (i == 6) {
                textCell = new EmojiCell(channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider);
            } else if (i == 3) {
                PeerColorPicker peerColorPicker = new PeerColorPicker(((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider);
                peerColorPicker.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(2, this, peerColorPicker));
                textCell = peerColorPicker;
            } else if (i == 4) {
                PeerColorActivity.PeerColorGrid peerColorGrid = new PeerColorActivity.PeerColorGrid(0, ((BaseFragment) channelColorActivity).currentAccount, channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider);
                peerColorGrid.setDivider(false);
                final int i3 = 1;
                peerColorGrid.setOnColorClick(new Utilities.Callback(this) {
                    public final ChannelColorActivity.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i3) {
                            case 0:
                                String str = (String) obj;
                                ChannelColorActivity channelColorActivity2 = ChannelColorActivity.this;
                                if (str == null) {
                                    channelColorActivity2.selectedWallpaper = channelColorActivity2.galleryWallpaper;
                                } else if (str.equals("❌")) {
                                    channelColorActivity2.selectedWallpaper = null;
                                } else {
                                    TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                    channelColorActivity2.selectedWallpaper = tL_wallPaperNoFile;
                                    tL_wallPaperNoFile.id = 0L;
                                    tL_wallPaperNoFile.flags |= 4;
                                    tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                    channelColorActivity2.selectedWallpaper.settings.emoticon = str;
                                }
                                channelColorActivity2.updateButton(true);
                                channelColorActivity2.updateMessagesPreview(true);
                                break;
                            default:
                                ChannelColorActivity.Adapter adapter = this.f$0;
                                adapter.getClass();
                                int iIntValue = ((Integer) obj).intValue();
                                ChannelColorActivity channelColorActivity3 = ChannelColorActivity.this;
                                channelColorActivity3.selectedProfileColor = iIntValue;
                                if (channelColorActivity3.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
                                    channelColorActivity3.selectedStatusEmoji = null;
                                }
                                channelColorActivity3.updateButton(true);
                                channelColorActivity3.updateProfilePreview();
                                channelColorActivity3.updateColors(true);
                                break;
                        }
                    }
                });
                textCell = peerColorGrid;
            } else if (i == 1) {
                profilePreview = channelColorActivity.new ProfilePreview(channelColorActivity.getParentActivity());
                if (channelColorActivity.isGroup) {
                    textCell = profilePreview;
                    profilePreview.setTag(-33024);
                    textCell = profilePreview;
                }
            } else if (i == 8) {
                textCell = new HeaderCell(channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider);
            } else if (i == 9) {
                textCell = new PeerColorActivity.GiftCell(channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider, false);
            } else if (i == 10) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(channelColorActivity.getParentActivity(), ((BaseFragment) channelColorActivity).resourceProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(35);
                textCell = flickerLoadingView;
            } else {
                textCell = new TextInfoPrivacyCell(channelColorActivity.getParentActivity(), 24, null);
            }
            textCell = profilePreview;
            return new RecyclerListView.Holder(textCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            boolean z = view instanceof ProfilePreview;
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            if (!z) {
                if (view instanceof ThemePreviewMessagesCell) {
                    ((ThemePreviewMessagesCell) view).setOverrideBackground(channelColorActivity.backgroundDrawable);
                    return;
                } else {
                    ChannelColorActivity.updateColors(view);
                    return;
                }
            }
            ProfilePreview profilePreview = (ProfilePreview) view;
            TLRPC.EmojiStatus emojiStatus = channelColorActivity.selectedStatusEmoji;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                profilePreview.profileView.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                profilePreview.profileView.setEmoji(((TLRPC.TL_emojiStatusCollectible) channelColorActivity.selectedStatusEmoji).pattern_document_id, true, false);
            } else {
                profilePreview.profileView.setColor(channelColorActivity.selectedProfileColor, false);
                profilePreview.profileView.setEmoji(channelColorActivity.selectedProfileEmoji, false, false);
            }
            profilePreview.profileView.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(channelColorActivity.selectedStatusEmoji), DialogObject.isEmojiStatusCollectible(channelColorActivity.selectedStatusEmoji), false);
            boolean zIsForum = channelColorActivity.isForum();
            ProfilePreview.AnonymousClass1 anonymousClass1 = profilePreview.profileView;
            anonymousClass1.setForum(zIsForum);
            anonymousClass1.overrideAvatarColor(channelColorActivity.selectedReplyColor);
        }
    }

    public final class PeerColorPicker extends FrameLayout {
        public final int currentAccount;
        public final LinearLayoutManager layoutManager;
        public final MessageSeenView.AnonymousClass1 listView;
        public final Theme.ResourcesProvider resourcesProvider;
        public int selectedPosition;

        public final class ColorCell extends View {
            public final Paint backgroundPaint;
            public final ButtonBounce bounce;
            public final Path circlePath;
            public final Path color2Path;
            public boolean hasColor2;
            public boolean hasColor3;
            public final Paint paint1;
            public final Paint paint2;
            public final Paint paint3;
            public boolean selected;
            public final AnimatedFloat selectedT;

            public ColorCell(Activity activity) {
                super(activity);
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                this.paint1 = new Paint(1);
                this.paint2 = new Paint(1);
                this.paint3 = new Paint(1);
                this.circlePath = new Path();
                this.color2Path = new Path();
                this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
                this.selectedT = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
                paint.setStyle(Paint.Style.STROKE);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
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
                    rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
                    canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.paint3);
                    canvas.restore();
                }
                float f = this.selectedT.set(this.selected);
                if (f > 0.0f) {
                    Paint paint = this.backgroundPaint;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), f), paint);
                }
                canvas.restore();
            }

            @Override
            public final void onMeasure(int i, int i2) {
                setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                Path path = this.circlePath;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
                Path path2 = this.color2Path;
                path2.rewind();
                path2.moveTo(getMeasuredWidth(), 0.0f);
                path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                path2.lineTo(0.0f, getMeasuredHeight());
                path2.close();
            }

            public final void set(MessagesController.PeerColor peerColor) {
                PeerColorPicker peerColorPicker = PeerColorPicker.this;
                Theme.ResourcesProvider resourcesProvider = peerColorPicker.resourcesProvider;
                boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                Paint paint = this.paint2;
                Paint paint2 = this.paint1;
                if (zIsDark && peerColor.hasColor2() && !peerColor.hasColor3()) {
                    paint2.setColor(peerColor.getColor(1, peerColorPicker.resourcesProvider));
                    paint.setColor(peerColor.getColor(0, peerColorPicker.resourcesProvider));
                } else {
                    paint2.setColor(peerColor.getColor(0, peerColorPicker.resourcesProvider));
                    paint.setColor(peerColor.getColor(1, peerColorPicker.resourcesProvider));
                }
                this.paint3.setColor(peerColor.getColor(2, peerColorPicker.resourcesProvider));
                this.hasColor2 = peerColor.hasColor2();
                this.hasColor3 = peerColor.hasColor3();
            }

            @Override
            public final void setBackgroundColor(int i) {
                this.backgroundPaint.setColor(i);
            }

            @Override
            public final void setPressed(boolean z) {
                super.setPressed(z);
                this.bounce.setPressed(z);
            }
        }

        public PeerColorPicker(final int i, final Activity activity, final Theme.ResourcesProvider resourcesProvider) {
            super(activity);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(activity, 3, resourcesProvider);
            this.listView = anonymousClass1;
            anonymousClass1.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
            anonymousClass1.setClipToPadding(false);
            anonymousClass1.setAdapter(new RecyclerListView.SelectionAdapter() {
                @Override
                public final int getItemCount() {
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
                    if (peerColors == null) {
                        return 0;
                    }
                    return peerColors.colors.size();
                }

                @Override
                public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    ColorCell colorCell = (ColorCell) viewHolder.itemView;
                    colorCell.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                    boolean z = i2 == PeerColorPicker.this.selectedPosition;
                    colorCell.selected = z;
                    colorCell.selectedT.set(z, true);
                    colorCell.invalidate();
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
                    if (peerColors == null || i2 < 0 || i2 >= peerColors.colors.size()) {
                        return;
                    }
                    colorCell.set(peerColors.colors.get(i2));
                }

                @Override
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                    return new RecyclerListView.Holder(PeerColorPicker.this.new ColorCell(activity));
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            linearLayoutManager.setOrientation(0);
            anonymousClass1.setLayoutManager(linearLayoutManager);
            addView(anonymousClass1, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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

        public final void setSelected(int i, boolean z) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
            int i2 = 0;
            if (peerColors != null) {
                for (int i3 = 0; i3 < peerColors.colors.size(); i3++) {
                    if (peerColors.colors.get(i3).id == i) {
                        i2 = i3;
                        break;
                    }
                }
            }
            if (i2 != this.selectedPosition) {
                this.selectedPosition = i2;
                if (!z) {
                    LinearLayoutManager linearLayoutManager = this.layoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(i2, OKLCH.m$2(56.0f, AndroidUtilities.displaySize.x, 2), linearLayoutManager.mShouldReverseLayout);
                }
                AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda141(1, this, z));
            }
        }
    }

    public final class ProfilePreview extends FrameLayout implements Theme.Colorable {
        public final PeerColorActivity.ColoredActionBar backgroundView;
        public final LinearLayout infoLayout;
        public final AnonymousClass1 profileView;
        public final TextView textInfo1;
        public final TextView textInfo2;
        public final SimpleTextView title;

        public final class AnonymousClass1 extends PeerColorActivity.ProfilePreview {
            public AnonymousClass1(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
                super(i, j, context, resourcesProvider);
            }

            @Override
            public final void setColor(int i, boolean z) {
                super.setColor(i, z);
                ProfilePreview profilePreview = ProfilePreview.this;
                TextView textView = profilePreview.textInfo1;
                if (textView != null) {
                    textView.setTextColor(profilePreview.profileView.subtitleView.getTextColor());
                }
            }
        }

        public ProfilePreview(Activity activity) {
            super(activity);
            PeerColorActivity.ColoredActionBar coloredActionBar = new PeerColorActivity.ColoredActionBar(getContext(), ((BaseFragment) ChannelColorActivity.this).resourceProvider);
            this.backgroundView = coloredActionBar;
            coloredActionBar.setProgressToGradient(1.0f);
            coloredActionBar.ignoreMeasure = true;
            addView(coloredActionBar, LayoutHelper.createFrame(-1, -1, 119));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), ((BaseFragment) ChannelColorActivity.this).currentAccount, ChannelColorActivity.this.dialogId, ((BaseFragment) ChannelColorActivity.this).resourceProvider);
            this.profileView = anonymousClass1;
            boolean z = ChannelColorActivity.this.isGroup;
            addView(anonymousClass1, LayoutHelper.createFrame(-1, z ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z ? 24.0f : 0.0f));
            if (ChannelColorActivity.this instanceof GroupColorActivity) {
                SimpleTextView simpleTextView = new SimpleTextView(getContext());
                this.title = simpleTextView;
                simpleTextView.setGravity(19);
                int i = Theme.key_actionBarDefaultTitle;
                simpleTextView.setTextColor(ChannelColorActivity.this.getThemedColor(i));
                simpleTextView.setTypeface(AndroidUtilities.bold());
                simpleTextView.setText(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
                simpleTextView.setAlpha(0.0f);
                setTitleSize();
                addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
                LinearLayout linearLayout = new LinearLayout(activity);
                this.infoLayout = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.multAlpha(0.065f, -16777216), -16777216));
                linearLayout.setGravity(17);
                linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(activity);
                this.textInfo1 = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(anonymousClass1.subtitleView.getTextColor());
                TextView textView2 = new TextView(activity);
                this.textInfo2 = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor((ChannelColorActivity.this.isGroup && ChannelColorActivity.this.selectedProfileColor == -1) ? ChannelColorActivity.this.getThemedColor(i) : -1);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ChannelColorActivity.this.boostsStatus;
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
                textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                linearLayout.addView(textView);
                linearLayout.addView(textView2, LayoutHelper.createLinear(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                addView(linearLayout, LayoutHelper.createFrame(-1, -2, 80));
            }
        }

        public int[] getColorKeys() {
            return null;
        }

        public final void setTitleSize() {
            float f;
            boolean z = getResources().getConfiguration().orientation == 2;
            int i = (AndroidUtilities.isTablet() || !z) ? 20 : 18;
            SimpleTextView simpleTextView = this.title;
            simpleTextView.setTextSize(i);
            if (AndroidUtilities.isTablet()) {
                f = -2.0f;
            } else {
                f = z ? 4 : 0;
            }
            simpleTextView.setTranslationY(AndroidUtilities.dp(f));
        }

        @Override
        public final void updateColors$1() {
            SimpleTextView simpleTextView = this.title;
            if (simpleTextView != null) {
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                int themedColor = -1;
                simpleTextView.setTextColor((!channelColorActivity.isGroup || channelColorActivity.selectedProfileColor == -1) ? channelColorActivity.getThemedColor(Theme.key_actionBarDefaultTitle) : -1);
                TextView textView = this.textInfo2;
                if (channelColorActivity.isGroup && channelColorActivity.selectedProfileColor == -1) {
                    themedColor = channelColorActivity.getThemedColor(Theme.key_actionBarDefaultTitle);
                }
                textView.setTextColor(themedColor);
            }
        }
    }

    public final class ThemeChooser extends FrameLayout {
        public final AnonymousClass3 adapter;
        public final int currentAccount;
        public String currentEmoticon;
        public boolean dataLoaded;
        public TLRPC.WallPaper fallbackWallpaper;
        public final ArrayList items;
        public final MessageSeenView.AnonymousClass1 listView;
        public final HashMap loadingThemes;
        public final HashMap loadingWallpapers;
        public Utilities.Callback onEmoticonSelected;
        public final FlickerLoadingView progressView;
        public final Theme.ResourcesProvider resourcesProvider;
        public boolean withRemovedStub;

        public final class AnonymousClass4 implements ResultCallback {
            public final int val$currentAccount;

            public AnonymousClass4(int i) {
                this.val$currentAccount = i;
            }

            @Override
            public final void onComplete(Object obj) {
                NotificationCenter.getInstance(this.val$currentAccount).doOnIdle(new ChatActivity$$ExternalSyntheticLambda7(10, this, (List) obj));
            }

            @Override
            public final void onError(Throwable th) {
                ResultCallback.CC.$default$onError(this, th);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                Toast.makeText(ThemeChooser.this.getContext(), tL_error.text, 0).show();
            }
        }

        public ThemeChooser(final int i, Activity activity, final Theme.ResourcesProvider resourcesProvider) {
            super(activity);
            this.items = new ArrayList();
            this.loadingThemes = new HashMap();
            this.loadingWallpapers = new HashMap();
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), resourcesProvider);
            this.progressView = flickerLoadingView;
            flickerLoadingView.setViewType(14);
            flickerLoadingView.setVisibility(0);
            addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
            MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(activity, 4, resourcesProvider);
            this.listView = anonymousClass1;
            anonymousClass1.setClipToPadding(false);
            anonymousClass1.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            linearLayoutManager.setOrientation(0);
            anonymousClass1.setLayoutManager(linearLayoutManager);
            anonymousClass1.setAlpha(0.0f);
            ?? r11 = new RecyclerListView.SelectionAdapter() {

                public final class AnonymousClass1 extends ThemeSmallPreviewView {
                    @Override
                    public final String noThemeString() {
                        return LocaleController.getString(R.string.ChannelNoWallpaper);
                    }

                    @Override
                    public final int noThemeStringTextSize() {
                        return 13;
                    }
                }

                @Override
                public final int getItemCount() {
                    return ThemeChooser.this.items.size();
                }

                @Override
                public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    boolean z;
                    FileInputStream fileInputStream;
                    int iStringKeyToInt;
                    int iIntValue;
                    String[] strArrSplit;
                    ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
                    ThemeChooser themeChooser = ThemeChooser.this;
                    EmojiThemes emojiThemes = ((ChatThemeBottomSheet.ChatThemeItem) themeChooser.items.get(i2)).chatTheme;
                    ArrayList arrayList = themeChooser.items;
                    Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) emojiThemes.items.get(((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i2)).themeIndex)).themeInfo;
                    if (themeInfo == null || themeInfo.pathToFile == null || themeInfo.previewParsed || !new File(themeInfo.pathToFile).exists() || themeInfo.pathToFile == null) {
                        z = true;
                    } else {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(new File(themeInfo.pathToFile));
                            int i3 = 0;
                            boolean z2 = false;
                            while (true) {
                                try {
                                    int i4 = fileInputStream2.read(ThemesHorizontalListCell.bytes);
                                    if (i4 == -1) {
                                        fileInputStream = fileInputStream2;
                                        break;
                                    }
                                    int i5 = i3;
                                    int i6 = 0;
                                    int i7 = 0;
                                    while (true) {
                                        if (i6 >= i4) {
                                            fileInputStream = fileInputStream2;
                                            break;
                                        }
                                        byte[] bArr = ThemesHorizontalListCell.bytes;
                                        if (bArr[i6] == 10) {
                                            int i8 = i6 - i7;
                                            int i9 = i8 + 1;
                                            String str = new String(bArr, i7, i8, "UTF-8");
                                            if (str.startsWith("WLS=")) {
                                                String strSubstring = str.substring(4);
                                                Uri uri = Uri.parse(strSubstring);
                                                themeInfo.slug = uri.getQueryParameter("slug");
                                                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                                StringBuilder sb = new StringBuilder();
                                                fileInputStream = fileInputStream2;
                                                try {
                                                    sb.append(Utilities.MD5(strSubstring));
                                                    sb.append(".wp");
                                                    themeInfo.pathToWallpaper = new File(filesDirFixed, sb.toString()).getAbsolutePath();
                                                    String queryParameter = uri.getQueryParameter("mode");
                                                    if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                                        for (String str2 : strArrSplit) {
                                                            if ("blur".equals(str2)) {
                                                                themeInfo.isBlured = true;
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
                                                } catch (Throwable th) {
                                                    th = th;
                                                    Throwable th2 = th;
                                                    try {
                                                        fileInputStream.close();
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        th2.addSuppressed(th3);
                                                        throw th2;
                                                    }
                                                }
                                            } else {
                                                fileInputStream = fileInputStream2;
                                                if (str.startsWith("WPS")) {
                                                    themeInfo.previewWallpaperOffset = i5 + i9;
                                                    z2 = true;
                                                    break;
                                                }
                                                int iIndexOf = str.indexOf(61);
                                                if (iIndexOf != -1 && ((iStringKeyToInt = OKLCH.stringKeyToInt(str.substring(0, iIndexOf))) == Theme.key_chat_inBubble || iStringKeyToInt == Theme.key_chat_outBubble || iStringKeyToInt == Theme.key_chat_wallpaper || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                                    String strSubstring2 = str.substring(iIndexOf + 1);
                                                    if (strSubstring2.length() <= 0 || strSubstring2.charAt(0) != '#') {
                                                        iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                                    } else {
                                                        try {
                                                            iIntValue = Color.parseColor(strSubstring2);
                                                        } catch (Exception unused3) {
                                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                                        }
                                                    }
                                                    if (iStringKeyToInt == Theme.key_chat_inBubble) {
                                                        themeInfo.previewInColor = iIntValue;
                                                    } else if (iStringKeyToInt == Theme.key_chat_outBubble) {
                                                        themeInfo.previewOutColor = iIntValue;
                                                    } else if (iStringKeyToInt == Theme.key_chat_wallpaper) {
                                                        themeInfo.previewBackgroundColor = iIntValue;
                                                    } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1) {
                                                        themeInfo.previewBackgroundGradientColor1 = iIntValue;
                                                    } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2) {
                                                        themeInfo.previewBackgroundGradientColor2 = iIntValue;
                                                    } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3) {
                                                        themeInfo.previewBackgroundGradientColor3 = iIntValue;
                                                    }
                                                }
                                            }
                                            i7 += i9;
                                            i5 += i9;
                                        } else {
                                            fileInputStream = fileInputStream2;
                                        }
                                        i6++;
                                        fileInputStream2 = fileInputStream;
                                    }
                                    if (z2 || i3 == i5) {
                                        break;
                                        break;
                                    } else {
                                        fileInputStream.getChannel().position(i5);
                                        i3 = i5;
                                        fileInputStream2 = fileInputStream;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileInputStream = fileInputStream2;
                                }
                            }
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            FileLog.e(th5);
                        }
                        if (themeInfo.pathToWallpaper == null || themeInfo.badWallpaper || new File(themeInfo.pathToWallpaper).exists()) {
                            z = true;
                            themeInfo.previewParsed = true;
                        } else {
                            HashMap map = themeChooser.loadingWallpapers;
                            if (!map.containsKey(themeInfo)) {
                                map.put(themeInfo, themeInfo.slug);
                                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = themeInfo.slug;
                                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                ConnectionsManager.getInstance(themeInfo.account).sendRequest(getwallpaper, new ChatActivity$$ExternalSyntheticLambda208(14, themeChooser, themeInfo));
                            }
                            z = true;
                        }
                    }
                    ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i2);
                    themeSmallPreviewView.setEnabled(z);
                    themeSmallPreviewView.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
                    themeSmallPreviewView.setItem(chatThemeItem, 0L, false);
                    themeSmallPreviewView.setSelected(chatThemeItem.isSelected, false);
                    themeSmallPreviewView.setFallbackWallpaper(chatThemeItem.chatTheme.showAsRemovedStub ? null : themeChooser.fallbackWallpaper);
                }

                @Override
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                    return new RecyclerListView.Holder(new AnonymousClass1(i, 3, viewGroup.getContext(), resourcesProvider));
                }

                @Override
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition >= 0) {
                        ThemeChooser themeChooser = ThemeChooser.this;
                        if (adapterPosition >= themeChooser.items.size()) {
                            return;
                        }
                        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) themeChooser.items.get(adapterPosition);
                        ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
                        themeSmallPreviewView.setSelected(chatThemeItem.isSelected, false);
                        themeSmallPreviewView.setFallbackWallpaper(chatThemeItem.chatTheme.showAsRemovedStub ? null : themeChooser.fallbackWallpaper);
                    }
                }
            };
            this.adapter = r11;
            anonymousClass1.setAdapter(r11);
            addView(anonymousClass1, LayoutHelper.createFrame(130.0f, -1));
            anonymousClass1.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 7));
            ChatThemeController chatThemeController = ChatThemeController.getInstance(i);
            chatThemeController.preloadAllWallpaperThumbs(true);
            chatThemeController.preloadAllWallpaperThumbs(false);
            chatThemeController.preloadAllWallpaperImages(true);
            chatThemeController.preloadAllWallpaperImages(false);
            chatThemeController.requestAllChatThemes(new AnonymousClass4(i), true);
            if (this.dataLoaded) {
                AndroidUtilities.updateViewVisibilityAnimated(flickerLoadingView, false, 1.0f, true, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(flickerLoadingView, true, 1.0f, true, false);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
            this.fallbackWallpaper = wallPaper;
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new ChannelColorActivity$ThemeChooser$$ExternalSyntheticLambda0(this, 1));
            if (this.fallbackWallpaper != null) {
                ArrayList arrayList = this.items;
                if ((arrayList.isEmpty() || ((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(0)).chatTheme.showAsDefaultStub) && this.withRemovedStub) {
                    arrayList.add(0, new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createChatThemesRemoved(this.currentAccount)));
                    this.adapter.mObservable.notifyChanged();
                }
            }
        }

        public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
            this.onEmoticonSelected = callback;
        }

        public final void setSelectedEmoticon(String str, boolean z) {
            ArrayList arrayList;
            int childAdapterPosition;
            this.currentEmoticon = str;
            int i = -1;
            int i2 = 0;
            while (true) {
                arrayList = this.items;
                boolean z2 = true;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i2);
                String str2 = this.currentEmoticon;
                EmojiThemes emojiThemes = chatThemeItem.chatTheme;
                if (!TextUtils.equals(str2, (emojiThemes == null || emojiThemes.showAsDefaultStub) ? null : emojiThemes.emoji) && (!TextUtils.isEmpty(str) || !chatThemeItem.chatTheme.showAsDefaultStub)) {
                    z2 = false;
                }
                chatThemeItem.isSelected = z2;
                if (z2) {
                    i = i2;
                }
                i2++;
            }
            MessageSeenView.AnonymousClass1 anonymousClass1 = this.listView;
            if (i >= 0 && !z && (anonymousClass1.getLayoutManager() instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) anonymousClass1.getLayoutManager()).scrollToPositionWithOffset(i, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
            }
            for (int i3 = 0; i3 < anonymousClass1.getChildCount(); i3++) {
                View childAt = anonymousClass1.getChildAt(i3);
                if ((childAt instanceof ThemeSmallPreviewView) && (childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < arrayList.size()) {
                    ((ThemeSmallPreviewView) childAt).setSelected(((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(childAdapterPosition)).isSelected, true);
                }
            }
        }

        public void setWithRemovedStub(boolean z) {
            this.withRemovedStub = z;
        }
    }

    public final class ThemeDelegate implements Theme.ResourcesProvider {
        public ThemeDelegate() {
        }

        @Override
        public final void applyServiceShaderMatrix(float f, float f2, int i, int i2) {
            ArticleViewer.IBlock.CC.$default$applyServiceShaderMatrix(f, f2, i, i2);
        }

        @Override
        public final ColorFilter getAnimatedEmojiColorFilter() {
            return Theme.chat_animatedEmojiTextColorFilter;
        }

        @Override
        public final int getColor(int i) {
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            int iIndexOfKey = channelColorActivity.currentColors.indexOfKey(i);
            if (iIndexOfKey >= 0) {
                return channelColorActivity.currentColors.valueAt(iIndexOfKey);
            }
            Theme.ResourcesProvider resourcesProvider = channelColorActivity.parentResourcesProvider;
            return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
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
            boolean zEquals = str.equals("drawableMsgIn");
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            if (zEquals) {
                return channelColorActivity.msgInDrawable;
            }
            if (str.equals("drawableMsgInSelected")) {
                return channelColorActivity.msgInDrawableSelected;
            }
            if (str.equals("drawableMsgOut")) {
                return channelColorActivity.msgOutDrawable;
            }
            if (str.equals("drawableMsgOutSelected")) {
                return channelColorActivity.msgOutDrawableSelected;
            }
            if (str.equals("drawableMsgOutCheckRead")) {
                channelColorActivity.msgOutCheckReadDrawable.setColorFilter(getColor(Theme.key_chat_outSentCheckRead), PorterDuff.Mode.MULTIPLY);
                return channelColorActivity.msgOutCheckReadDrawable;
            }
            if (str.equals("drawableMsgOutHalfCheck")) {
                channelColorActivity.msgOutHalfCheckDrawable.setColorFilter(getColor(Theme.key_chat_outSentCheckRead), PorterDuff.Mode.MULTIPLY);
                return channelColorActivity.msgOutHalfCheckDrawable;
            }
            Theme.ResourcesProvider resourcesProvider = channelColorActivity.parentResourcesProvider;
            return resourcesProvider != null ? resourcesProvider.getDrawable(str) : (Drawable) Theme.defaultChatDrawables.get(str);
        }

        @Override
        public final Paint getPaint(String str) {
            return str.equals("paintDivider") ? ChannelColorActivity.this.dividerPaint : Theme.getThemePaint(str);
        }

        @Override
        public final boolean hasGradientService() {
            return false;
        }

        @Override
        public final boolean isDark() {
            return ChannelColorActivity.this.isDark;
        }

        @Override
        public final void setAnimatedColor(int i, int i2) {
        }
    }

    public ChannelColorActivity(long j) {
        super(null);
        boolean zIsDark = Theme.currentTheme.isDark();
        this.isDark = zIsDark;
        this.rowsCount = 0;
        this.forceDark = zIsDark;
        this.currentColors = new SparseIntArray();
        Paint paint = new Paint(1);
        this.dividerPaint = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
        this.msgOutCheckReadDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.msgOutHalfCheckDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.dialogId = j;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            this.currentLevel = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j, new ChatActivity$$ExternalSyntheticLambda335(1, this, chat));
        this.resourceProvider = new ThemeDelegate();
        this.msgInDrawable = new MessageDrawable(0, false, false, this.resourceProvider);
        this.msgInDrawableSelected = new MessageDrawable(0, false, true, this.resourceProvider);
        this.msgOutDrawable = new MessageDrawable(0, true, false, this.resourceProvider);
        this.msgOutDrawableSelected = new MessageDrawable(0, true, true, this.resourceProvider);
    }

    public final void buttonClick() {
        int[] iArr;
        long j;
        char c;
        int i;
        TLRPC.TL_channels_updateColor tL_channels_updateColor;
        int i2;
        long j2;
        long j3;
        ?? r9;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper;
        TLRPC.WallPaper wallPaper;
        TLRPC.ChatFull chatFull;
        TLRPC.WallPaper wallPaper2;
        TLRPC.WallPaper wallPaper3;
        int i3 = 1;
        if (this.boostsStatus == null || this.button.loading) {
            return;
        }
        int i4 = this.currentLevel;
        int iMinLevelRequired = minLevelRequired();
        long j4 = this.dialogId;
        if (i4 < iMinLevelRequired) {
            this.button.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j4, this.boostsStatus, new ChannelColorActivity$$ExternalSyntheticLambda0(this, i3));
            return;
        }
        int[] iArr2 = {0};
        final GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = new GiftSheet$$ExternalSyntheticLambda23(this, new boolean[]{false}, new int[]{0}, iArr2, 2);
        long j5 = -j4;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j5));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(this), R.raw.error, 36);
            return;
        }
        this.button.setLoading(true);
        if (this.currentReplyColor == this.selectedReplyColor) {
            j = j4;
            iArr = iArr2;
            if (this.currentReplyEmoji == this.selectedReplyEmoji) {
                i = 4;
                c = 2;
            }
            if (this.currentProfileColor == this.selectedProfileColor || this.currentProfileEmoji != this.selectedProfileEmoji) {
                tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                tL_channels_updateColor.channel = getMessagesController().getInputChannel(j5);
                tL_channels_updateColor.for_profile = true;
                if (chat.profile_color == null) {
                    chat.profile_color = new TLRPC.TL_peerColor();
                    chat.flags2 |= 256;
                }
                i2 = this.selectedProfileColor;
                if (i2 >= 0) {
                    tL_channels_updateColor.flags |= i;
                    tL_channels_updateColor.color = i2;
                    TLRPC.PeerColor peerColor = chat.profile_color;
                    peerColor.flags |= 1;
                    peerColor.color = i2;
                } else {
                    chat.profile_color.flags &= -2;
                }
                j2 = this.selectedProfileEmoji;
                if (j2 != 0) {
                    tL_channels_updateColor.flags |= 1;
                    tL_channels_updateColor.background_emoji_id = j2;
                    TLRPC.PeerColor peerColor2 = chat.profile_color;
                    peerColor2.flags |= 2;
                    peerColor2.background_emoji_id = j2;
                } else {
                    TLRPC.PeerColor peerColor3 = chat.profile_color;
                    peerColor3.flags &= -3;
                    peerColor3.background_emoji_id = 0L;
                }
                iArr[0] = iArr[0] + 1;
                final int i5 = 3;
                getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) {
                    public final ChannelColorActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i5) {
                            case 0:
                                ChannelColorActivity channelColorActivity = this.f$0;
                                channelColorActivity.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            case 1:
                                ChannelColorActivity channelColorActivity2 = this.f$0;
                                channelColorActivity2.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            case 2:
                                ChannelColorActivity channelColorActivity3 = this.f$0;
                                channelColorActivity3.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            default:
                                ChannelColorActivity channelColorActivity4 = this.f$0;
                                channelColorActivity4.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                        }
                    }
                });
            }
            if (ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) {
                j3 = j;
            } else {
                tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                j3 = j;
                tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j3);
                wallPaper = this.selectedWallpaper;
                if (wallPaper != null) {
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                        tL_messages_setChatWallPaper.flags |= 1;
                        wallPaper3 = this.selectedWallpaper;
                        if (wallPaper3 instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                            TLRPC.WallPaper wallPaper4 = this.selectedWallpaper;
                            tL_inputWallPaper.id = wallPaper4.id;
                            tL_inputWallPaper.access_hash = wallPaper4.access_hash;
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                        } else if (wallPaper3 instanceof TLRPC.TL_wallPaperNoFile) {
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                            tL_inputWallPaperNoFile.id = this.selectedWallpaper.id;
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                        }
                    } else {
                        tL_messages_setChatWallPaper.flags |= 1;
                        TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                        tL_inputWallPaperNoFile2.id = 0L;
                        tL_messages_setChatWallPaper.flags |= i;
                        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                        tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                        tL_wallPaperSettings.flags |= 128;
                        tL_wallPaperSettings.emoticon = ChatThemeController.getWallpaperEmoticon(this.selectedWallpaper);
                    }
                }
                final int i6 = 1;
                iArr[0] = iArr[0] + 1;
                getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) {
                    public final ChannelColorActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i6) {
                            case 0:
                                ChannelColorActivity channelColorActivity = this.f$0;
                                channelColorActivity.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            case 1:
                                ChannelColorActivity channelColorActivity2 = this.f$0;
                                channelColorActivity2.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            case 2:
                                ChannelColorActivity channelColorActivity3 = this.f$0;
                                channelColorActivity3.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            default:
                                ChannelColorActivity channelColorActivity4 = this.f$0;
                                channelColorActivity4.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                        }
                    }
                });
                chatFull = getMessagesController().getChatFull(j5);
                ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j3, this.selectedWallpaper);
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
                    int i7 = NotificationCenter.chatInfoDidLoad;
                    Object[] objArr = new Object[i];
                    objArr[0] = chatFull;
                    objArr[1] = 0;
                    Boolean bool = Boolean.FALSE;
                    objArr[c] = bool;
                    objArr[3] = bool;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i7, objArr);
                }
            }
            if (DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji)) {
                r9 = 0;
            } else {
                tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j5);
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
                getMessagesController().updateEmojiStatusUntilUpdate(j3, this.selectedStatusEmoji);
                r9 = 0;
                iArr[0] = iArr[0] + 1;
                final int i8 = 2;
                getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) {
                    public final ChannelColorActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i8) {
                            case 0:
                                ChannelColorActivity channelColorActivity = this.f$0;
                                channelColorActivity.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            case 1:
                                ChannelColorActivity channelColorActivity2 = this.f$0;
                                channelColorActivity2.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            case 2:
                                ChannelColorActivity channelColorActivity3 = this.f$0;
                                channelColorActivity3.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                            default:
                                ChannelColorActivity channelColorActivity4 = this.f$0;
                                channelColorActivity4.getClass();
                                if (tLObject instanceof TLRPC.Updates) {
                                    channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                                break;
                        }
                    }
                });
            }
            if (iArr[r9] == 0) {
                finishFragment();
                this.button.setLoading(r9);
                return;
            }
            getMessagesController().putChat(chat, r9);
            NotificationCenter notificationCenter2 = getNotificationCenter();
            int i9 = NotificationCenter.updateInterfaces;
            Object[] objArr2 = new Object[1];
            objArr2[r9] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
            notificationCenter2.lambda$postNotificationNameOnUIThread$1(i9, objArr2);
        }
        iArr = iArr2;
        j = j4;
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(j5);
        tL_channels_updateColor2.for_profile = false;
        if (chat.color == null) {
            chat.color = new TLRPC.TL_peerColor();
            chat.flags2 |= 128;
        }
        int i10 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i10 | 4;
        int i11 = this.selectedReplyColor;
        tL_channels_updateColor2.color = i11;
        TLRPC.PeerColor peerColor4 = chat.color;
        int i12 = peerColor4.flags;
        c = 2;
        int i13 = i12 | 1;
        peerColor4.flags = i13;
        peerColor4.color = i11;
        i = 4;
        long j6 = this.selectedReplyEmoji;
        if (j6 != 0) {
            tL_channels_updateColor2.flags = i10 | 5;
            tL_channels_updateColor2.background_emoji_id = j6;
            peerColor4.flags = i12 | 3;
            peerColor4.background_emoji_id = j6;
        } else {
            peerColor4.flags = i13 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i14 = 0;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) {
            public final ChannelColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i14) {
                    case 0:
                        ChannelColorActivity channelColorActivity = this.f$0;
                        channelColorActivity.getClass();
                        if (tLObject instanceof TLRPC.Updates) {
                            channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                        break;
                    case 1:
                        ChannelColorActivity channelColorActivity2 = this.f$0;
                        channelColorActivity2.getClass();
                        if (tLObject instanceof TLRPC.Updates) {
                            channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                        break;
                    case 2:
                        ChannelColorActivity channelColorActivity3 = this.f$0;
                        channelColorActivity3.getClass();
                        if (tLObject instanceof TLRPC.Updates) {
                            channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                        break;
                    default:
                        ChannelColorActivity channelColorActivity4 = this.f$0;
                        channelColorActivity4.getClass();
                        if (tLObject instanceof TLRPC.Updates) {
                            channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                        break;
                }
            }
        });
        if (this.currentProfileColor == this.selectedProfileColor) {
            tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
            tL_channels_updateColor.channel = getMessagesController().getInputChannel(j5);
            tL_channels_updateColor.for_profile = true;
            if (chat.profile_color == null) {
                chat.profile_color = new TLRPC.TL_peerColor();
                chat.flags2 |= 256;
            }
            i2 = this.selectedProfileColor;
            if (i2 >= 0) {
                tL_channels_updateColor.flags |= i;
                tL_channels_updateColor.color = i2;
                TLRPC.PeerColor peerColor5 = chat.profile_color;
                peerColor5.flags |= 1;
                peerColor5.color = i2;
            } else {
                chat.profile_color.flags &= -2;
            }
            j2 = this.selectedProfileEmoji;
            if (j2 != 0) {
                tL_channels_updateColor.flags |= 1;
                tL_channels_updateColor.background_emoji_id = j2;
                TLRPC.PeerColor peerColor6 = chat.profile_color;
                peerColor6.flags |= 2;
                peerColor6.background_emoji_id = j2;
            } else {
                TLRPC.PeerColor peerColor7 = chat.profile_color;
                peerColor7.flags &= -3;
                peerColor7.background_emoji_id = 0L;
            }
            iArr[0] = iArr[0] + 1;
            final int i15 = 3;
            getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) {
                public final ChannelColorActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i15) {
                        case 0:
                            ChannelColorActivity channelColorActivity = this.f$0;
                            channelColorActivity.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 1:
                            ChannelColorActivity channelColorActivity2 = this.f$0;
                            channelColorActivity2.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 2:
                            ChannelColorActivity channelColorActivity3 = this.f$0;
                            channelColorActivity3.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        default:
                            ChannelColorActivity channelColorActivity4 = this.f$0;
                            channelColorActivity4.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                    }
                }
            });
        } else {
            tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
            tL_channels_updateColor.channel = getMessagesController().getInputChannel(j5);
            tL_channels_updateColor.for_profile = true;
            if (chat.profile_color == null) {
                chat.profile_color = new TLRPC.TL_peerColor();
                chat.flags2 |= 256;
            }
            i2 = this.selectedProfileColor;
            if (i2 >= 0) {
                tL_channels_updateColor.flags |= i;
                tL_channels_updateColor.color = i2;
                TLRPC.PeerColor peerColor8 = chat.profile_color;
                peerColor8.flags |= 1;
                peerColor8.color = i2;
            } else {
                chat.profile_color.flags &= -2;
            }
            j2 = this.selectedProfileEmoji;
            if (j2 != 0) {
                tL_channels_updateColor.flags |= 1;
                tL_channels_updateColor.background_emoji_id = j2;
                TLRPC.PeerColor peerColor9 = chat.profile_color;
                peerColor9.flags |= 2;
                peerColor9.background_emoji_id = j2;
            } else {
                TLRPC.PeerColor peerColor10 = chat.profile_color;
                peerColor10.flags &= -3;
                peerColor10.background_emoji_id = 0L;
            }
            iArr[0] = iArr[0] + 1;
            final int i16 = 3;
            getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) {
                public final ChannelColorActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i16) {
                        case 0:
                            ChannelColorActivity channelColorActivity = this.f$0;
                            channelColorActivity.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 1:
                            ChannelColorActivity channelColorActivity2 = this.f$0;
                            channelColorActivity2.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 2:
                            ChannelColorActivity channelColorActivity3 = this.f$0;
                            channelColorActivity3.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        default:
                            ChannelColorActivity channelColorActivity4 = this.f$0;
                            channelColorActivity4.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                    }
                }
            });
        }
        if (ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) {
            tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
            j3 = j;
            tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j3);
            wallPaper = this.selectedWallpaper;
            if (wallPaper != null) {
                if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
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
            final int i17 = 1;
            iArr[0] = iArr[0] + 1;
            getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) {
                public final ChannelColorActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i17) {
                        case 0:
                            ChannelColorActivity channelColorActivity = this.f$0;
                            channelColorActivity.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 1:
                            ChannelColorActivity channelColorActivity2 = this.f$0;
                            channelColorActivity2.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 2:
                            ChannelColorActivity channelColorActivity3 = this.f$0;
                            channelColorActivity3.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        default:
                            ChannelColorActivity channelColorActivity4 = this.f$0;
                            channelColorActivity4.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                    }
                }
            });
            chatFull = getMessagesController().getChatFull(j5);
            ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j3, this.selectedWallpaper);
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
                NotificationCenter notificationCenter3 = getNotificationCenter();
                int i18 = NotificationCenter.chatInfoDidLoad;
                Object[] objArr3 = new Object[i];
                objArr3[0] = chatFull;
                objArr3[1] = 0;
                Boolean bool2 = Boolean.FALSE;
                objArr3[c] = bool2;
                objArr3[3] = bool2;
                notificationCenter3.lambda$postNotificationNameOnUIThread$1(i18, objArr3);
            }
        } else {
            j3 = j;
        }
        if (DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji)) {
            tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
            tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j5);
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
            getMessagesController().updateEmojiStatusUntilUpdate(j3, this.selectedStatusEmoji);
            r9 = 0;
            iArr[0] = iArr[0] + 1;
            final int i19 = 2;
            getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) {
                public final ChannelColorActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i19) {
                        case 0:
                            ChannelColorActivity channelColorActivity = this.f$0;
                            channelColorActivity.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 1:
                            ChannelColorActivity channelColorActivity2 = this.f$0;
                            channelColorActivity2.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        case 2:
                            ChannelColorActivity channelColorActivity3 = this.f$0;
                            channelColorActivity3.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                        default:
                            ChannelColorActivity channelColorActivity4 = this.f$0;
                            channelColorActivity4.getClass();
                            if (tLObject instanceof TLRPC.Updates) {
                                channelColorActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            giftSheet$$ExternalSyntheticLambda23.run(tL_error);
                            break;
                    }
                }
            });
        } else {
            r9 = 0;
        }
        if (iArr[r9] == 0) {
            finishFragment();
            this.button.setLoading(r9);
            return;
        }
        getMessagesController().putChat(chat, r9);
        NotificationCenter notificationCenter4 = getNotificationCenter();
        int i20 = NotificationCenter.updateInterfaces;
        Object[] objArr4 = new Object[1];
        objArr4[r9] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
        notificationCenter4.lambda$postNotificationNameOnUIThread$1(i20, objArr4);
    }

    public void createListView() {
        RecyclerListView recyclerListView = new RecyclerListView(getParentActivity(), this.resourceProvider);
        this.listView = recyclerListView;
        recyclerListView.setSections(false);
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j = -this.dialogId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
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
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j);
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
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 20));
        int i = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.sunDrawable = rLottieDrawable;
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        if (this.isDark) {
            rLottieDrawable.setCurrentFrame(35, true, false);
            this.sunDrawable.setCustomEndFrame(36);
        } else {
            rLottieDrawable.setCustomEndFrame(0);
            this.sunDrawable.setCurrentFrame(0, true, false);
        }
        this.sunDrawable.applyingLayerColors = true;
        int color = Theme.getColor(Theme.key_chats_menuName, this.resourceProvider);
        RLottieDrawable rLottieDrawable2 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable2.newColorUpdates, "Sunny", rLottieDrawable2);
        RLottieDrawable rLottieDrawable3 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable3.newColorUpdates, "Path 6", rLottieDrawable3);
        RLottieDrawable rLottieDrawable4 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable4.newColorUpdates, "Path", rLottieDrawable4);
        RLottieDrawable rLottieDrawable5 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable5.newColorUpdates, "Path 5", rLottieDrawable5);
        this.dayNightItem = this.actionBar.createMenu().addItem(1, this.sunDrawable);
        FrameLayout frameLayout = new FrameLayout(context);
        updateRows$2();
        createListView();
        if (!this.isGroup) {
            this.actionBar.setAdaptiveBackground(this.listView);
        }
        RecyclerListView recyclerListView = this.listView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        new GridLayoutManager(3);
        zzku.m(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        int i2 = Theme.key_windowBackgroundGray;
        recyclerListView2.setBackgroundColor(getThemedColor(i2));
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(1, this, chatFull));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourceProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.button.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 29));
        updateButton(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.buttonContainer = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i2));
        this.buttonContainer.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.buttonContainer, LayoutHelper.createFrame(-1, 68, 80));
        setBulletinDelegate(new ChatActivity.AnonymousClass103(this, 2));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.chatWasBoostedByUser;
        long j = this.dialogId;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                updateBoostsAndLevels((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j, new ChannelColorActivity$$ExternalSyntheticLambda0(this, 2));
        } else if (i == NotificationCenter.dialogDeleted && j == ((Long) objArr[0]).longValue()) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final View findChildAt(int i) {
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            this.listView.getClass();
            if (RecyclerView.getChildAdapterPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int getCustomWallpaperLevelMin() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int getEmojiPackInfoStrRes() {
        return 0;
    }

    public int getEmojiPackStrRes() {
        return 0;
    }

    public int getEmojiStatusInfoStrRes() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int getEmojiStatusLevelMin() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int getEmojiStatusStrRes() {
        return R.string.ChannelEmojiStatus;
    }

    public int getEmojiStickersLevelMin() {
        return 0;
    }

    public int getMessagePreviewType() {
        return 3;
    }

    public int getProfileIconLevelMin() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int getProfileInfoStrRes() {
        return R.string.ChannelProfileInfo;
    }

    public int getStickerPackInfoStrRes() {
        return 0;
    }

    public int getStickerPackStrRes() {
        return 0;
    }

    public int getWallpaper2InfoStrRes() {
        return R.string.ChannelWallpaper2Info;
    }

    public int getWallpaperLevelMin() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int getWallpaperStrRes() {
        return R.string.ChannelWallpaper;
    }

    public final boolean hasUnsavedChanged() {
        return (this.currentReplyColor == this.selectedReplyColor && this.currentReplyEmoji == this.selectedReplyEmoji && this.currentProfileColor == this.selectedProfileColor && this.currentProfileEmoji == this.selectedProfileEmoji && DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji) && ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) ? false : true;
    }

    public boolean isForum() {
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !hasUnsavedChanged() || this.currentLevel < minLevelRequired();
    }

    public final void lambda$createView$4(TLRPC.ChatFull chatFull, View view, int i) {
        long j;
        long emojiStatusDocumentId;
        EmojiCell emojiCell;
        boolean z;
        int color;
        int iDp;
        int i2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        if (!(view instanceof EmojiCell)) {
            if (i == this.removeProfileColorRow) {
                this.selectedProfileColor = -1;
                this.selectedProfileEmoji = 0L;
                if (this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.selectedStatusEmoji = null;
                }
                updateProfilePreview();
                updateButton(true);
                updateRows$2();
                updateColors(true);
                return;
            }
            if (i == this.wallpaperRow) {
                Activity parentActivity = getParentActivity();
                final Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
                final DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 11);
                final Stripe stripe = new Stripe(this, 17);
                final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.boostsStatus;
                int i3 = ChatThemeBottomSheet.$r8$clinit;
                final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(parentActivity, this, false, false, false, resourcesProvider);
                chatAttachAlert.drawNavigationBar = true;
                chatAttachAlert.setupPhotoPicker(LocaleController.getString(R.string.ChooseBackground));
                final long j2 = this.dialogId;
                chatAttachAlert.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
                    @Override
                    public final void didPressedButton(int i4, boolean z2, boolean z3, int i5, int i6, long j3, boolean z4, boolean z5, long j4) {
                        ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                        try {
                            HashMap<Object, Object> selectedPhotos = chatAttachAlert2.photoLayout.getSelectedPhotos();
                            if (selectedPhotos.isEmpty()) {
                                return;
                            }
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                            String str = photoEntry.imagePath;
                            if (str == null) {
                                str = photoEntry.path;
                            }
                            if (str != null) {
                                File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                                bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                                WallpapersListActivity.AnonymousClass6 anonymousClass6 = new WallpapersListActivity.AnonymousClass6(false, new WallpapersListActivity.FileWallpaper(file, file, ""), bitmapLoadBitmap, 1);
                                anonymousClass6.boostsStatus = tL_premium_boostsStatus2;
                                anonymousClass6.themeDelegate.parentProvider = resourcesProvider;
                                anonymousClass6.onSwitchDayNightDelegate = stripe;
                                anonymousClass6.isBlurred = false;
                                anonymousClass6.isMotion = false;
                                anonymousClass6.dimAmount = 0.2f;
                                anonymousClass6.setDialogId(j2);
                                anonymousClass6.delegate = new ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(chatAttachAlert2, dialogCell$$ExternalSyntheticLambda6, 0);
                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                bottomSheetParams.transitionFromLeft = true;
                                bottomSheetParams.occupyNavigationBar = true;
                                this.showAsSheet(anonymousClass6, bottomSheetParams);
                                chatAttachAlert2.lambda$showGiftOfferSheet$15();
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }

                    @Override
                    public final void didSelectBot(TLRPC.User user) {
                    }

                    @Override
                    public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                        chatAttachAlert$$ExternalSyntheticLambda7.run();
                    }

                    @Override
                    public final boolean needEnterComment() {
                        return false;
                    }

                    @Override
                    public final void onCameraOpened() {
                    }

                    @Override
                    public final void onWallpaperSelected(Object obj) {
                        WallpapersListActivity.AnonymousClass6 anonymousClass6 = new WallpapersListActivity.AnonymousClass6(true, obj, null, 2);
                        anonymousClass6.boostsStatus = tL_premium_boostsStatus2;
                        anonymousClass6.themeDelegate.parentProvider = resourcesProvider;
                        anonymousClass6.onSwitchDayNightDelegate = stripe;
                        anonymousClass6.setDialogId(j2);
                        anonymousClass6.delegate = new ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(chatAttachAlert, dialogCell$$ExternalSyntheticLambda6, 1);
                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                        bottomSheetParams.transitionFromLeft = true;
                        bottomSheetParams.occupyNavigationBar = true;
                        this.showAsSheet(anonymousClass6, bottomSheetParams);
                    }

                    @Override
                    public final void openAvatarsSearch() {
                    }

                    @Override
                    public final boolean selectItemOnClicking() {
                        System.currentTimeMillis();
                        return true;
                    }

                    @Override
                    public final void sendAudio(ArrayList arrayList, Editable editable, boolean z2, int i4, int i5, long j3, boolean z3, long j4) {
                    }
                };
                chatAttachAlert.setMaxSelectedPhotos(1, false);
                chatAttachAlert.init();
                chatAttachAlert.photoLayout.loadGalleryPhotos();
                chatAttachAlert.show();
                return;
            }
            return;
        }
        int i4 = this.packStickerRow;
        long j3 = this.dialogId;
        if (i == i4) {
            if (chatFull == null) {
                return;
            }
            GroupStickersActivity groupStickersActivity = new GroupStickersActivity(-j3);
            groupStickersActivity.setInfo(chatFull);
            presentFragment(groupStickersActivity);
            return;
        }
        if (i == this.replyEmojiRow) {
            emojiStatusDocumentId = this.selectedReplyEmoji;
        } else {
            if (i != this.profileEmojiRow) {
                if (i == this.statusEmojiRow) {
                    TLRPC.EmojiStatus emojiStatus = this.selectedStatusEmoji;
                    emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
                } else {
                    j = 0;
                }
                if (i == this.packEmojiRow) {
                    int emojiStickersLevelMin = getEmojiStickersLevelMin();
                    tL_premium_boostsStatus = this.boostsStatus;
                    if (tL_premium_boostsStatus == null && tL_premium_boostsStatus.level < emojiStickersLevelMin) {
                        openBoostDialog(29);
                        return;
                    }
                    GroupStickersActivity groupStickersActivity2 = new GroupStickersActivity(-j3, 0);
                    groupStickersActivity2.setInfo(chatFull);
                    presentFragment(groupStickersActivity2);
                    return;
                }
                emojiCell = (EmojiCell) view;
                if (i == this.statusEmojiRow) {
                    z = true;
                } else {
                    z = false;
                }
                final ChannelColorActivity$$ExternalSyntheticLambda12 channelColorActivity$$ExternalSyntheticLambda12 = new ChannelColorActivity$$ExternalSyntheticLambda12(this, i, view);
                if (this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
                    color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourceProvider);
                } else {
                    color = emojiCell.color;
                }
                int i5 = color;
                if (this.selectAnimatedEmojiDialog == null || emojiCell == null) {
                }
                final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
                boolean z2 = ((float) (emojiCell.getHeight() + emojiCell.getTop())) > ((float) this.listView.getMeasuredHeight()) / 2.0f;
                int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = emojiCell.imageDrawable;
                Drawable drawable = swapAnimatedEmojiDrawable.drawables[1];
                if (drawable != null) {
                    if (drawable instanceof AnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable) drawable).removeView(swapAnimatedEmojiDrawable);
                    }
                    swapAnimatedEmojiDrawable.drawables[1] = null;
                }
                swapAnimatedEmojiDrawable.play();
                emojiCell.updateImageBounds();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(swapAnimatedEmojiDrawable.getBounds());
                if (z2) {
                    iDp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin;
                } else {
                    iDp = (-(emojiCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                }
                int i6 = iDp;
                int iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
                if (z) {
                    i2 = z2 ? 10 : 9;
                } else {
                    i2 = z2 ? 5 : 7;
                }
                ?? r0 = new SelectAnimatedEmojiDialog(this, getParentActivity(), Integer.valueOf(iCenterX), i2, getResourceProvider(), z2 ? 24 : 16, i5) {
                    @Override
                    public final long getDialogId() {
                        return ChannelColorActivity.this.dialogId;
                    }

                    @Override
                    public final float getScrimDrawableTranslationY() {
                        return 0.0f;
                    }

                    @Override
                    public final void onEmojiSelected(View view2, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                        channelColorActivity$$ExternalSyntheticLambda12.run(Long.valueOf(l == null ? 0L : l.longValue()), num, tL_starGiftUnique);
                        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                        if (selectAnimatedEmojiDialogWindow != null) {
                            ChannelColorActivity.this.selectAnimatedEmojiDialog = null;
                            selectAnimatedEmojiDialogWindow.dismiss();
                        }
                    }
                };
                r0.useAccentForPlus = true;
                r0.setSelected(j == 0 ? null : Long.valueOf(j));
                r0.setSaveState(3);
                r0.setScrimDrawable(swapAnimatedEmojiDrawable, emojiCell);
                ?? r2 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r0) {
                    @Override
                    public final void dismiss() {
                        super.dismiss();
                        ChannelColorActivity.this.selectAnimatedEmojiDialog = null;
                    }
                };
                this.selectAnimatedEmojiDialog = r2;
                selectAnimatedEmojiDialogWindowArr[0] = r2;
                r2.showAsDropDown(emojiCell, 0, i6, 53);
                selectAnimatedEmojiDialogWindowArr[0].dimBehind();
                return;
            }
            emojiStatusDocumentId = this.selectedProfileEmoji;
        }
        j = emojiStatusDocumentId;
        if (i == this.packEmojiRow) {
            int emojiStickersLevelMin2 = getEmojiStickersLevelMin();
            tL_premium_boostsStatus = this.boostsStatus;
            if (tL_premium_boostsStatus == null) {
            }
            GroupStickersActivity groupStickersActivity3 = new GroupStickersActivity(-j3, 0);
            groupStickersActivity3.setInfo(chatFull);
            presentFragment(groupStickersActivity3);
            return;
        }
        emojiCell = (EmojiCell) view;
        if (i == this.statusEmojiRow) {
            z = true;
        } else {
            z = false;
        }
        final ChannelColorActivity$$ExternalSyntheticLambda12 channelColorActivity$$ExternalSyntheticLambda13 = new ChannelColorActivity$$ExternalSyntheticLambda12(this, i, view);
        if (this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible) {
            color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourceProvider);
        } else {
            color = emojiCell.color;
        }
        int i7 = color;
        if (this.selectAnimatedEmojiDialog == null) {
        }
    }

    public final void lambda$showLimit$13(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int lvl;
        int i;
        int i2;
        if (this.currentReplyColor == this.selectedReplyColor) {
            lvl = 0;
        } else {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(this.selectedReplyColor);
            if (color == null || color.getLvl(this.isGroup) <= this.currentLevel) {
                lvl = 0;
            } else {
                lvl = color.getLvl(this.isGroup);
            }
        }
        if (this.currentProfileColor == this.selectedProfileColor) {
            i = 20;
        } else {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(this.selectedProfileColor) : null;
            if (color2 == null || color2.getLvl(this.isGroup) <= this.currentLevel) {
                i = 20;
            } else {
                lvl = color2.getLvl(this.isGroup);
                i = 24;
            }
        }
        final int i3 = lvl;
        if (this.currentReplyEmoji != this.selectedReplyEmoji && getMessagesController().channelBgIconLevelMin > this.currentLevel) {
            i = 27;
        }
        if (this.currentProfileEmoji != this.selectedProfileEmoji && getProfileIconLevelMin() > this.currentLevel) {
            i = 28;
        }
        if (!DialogObject.emojiStatusesEqual(this.currentStatusEmoji, this.selectedStatusEmoji) && getEmojiStatusLevelMin() > this.currentLevel) {
            i = this.selectedStatusEmoji instanceof TLRPC.TL_emojiStatusCollectible ? 26 : 25;
        }
        if (ChatThemeController.wallpaperEquals(this.currentWallpaper, this.selectedWallpaper)) {
            i2 = i;
        } else {
            i2 = !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.selectedWallpaper)) ? 22 : 23;
        }
        if (getParentActivity() == null || getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getParentActivity(), i2, this.currentAccount, getResourceProvider()) {
            @Override
            public final int channelColorLevelMin() {
                return i3;
            }
        };
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = this.boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        long j = this.dialogId;
        limitReachedBottomSheet.dialogId = j;
        limitReachedBottomSheet.updateRows$7();
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.statisticClickRunnable = new ChatActivity$$ExternalSyntheticLambda7(9, this, chat);
        }
        showDialog(limitReachedBottomSheet);
        this.button.setLoading(false);
    }

    public final void lambda$toggleTheme$17() {
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        if (resourcesProvider instanceof ThemeDelegate) {
            ThemeDelegate themeDelegate = (ThemeDelegate) resourcesProvider;
            ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
            channelColorActivity.isDark = !channelColorActivity.isDark;
            channelColorActivity.updateThemeColors$1();
            ChannelColorActivity.this.updateColors(false);
        } else {
            this.isDark = !this.isDark;
            updateThemeColors$1();
        }
        setForceDark(this.isDark, true);
        updateColors(false);
    }

    public final int minLevelRequired() {
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

    @Override
    public final boolean onBackPressed(boolean z) {
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

    public void openBoostDialog(int i) {
    }

    public final void setForceDark(boolean z, boolean z2) {
        if (this.forceDark == z) {
            return;
        }
        this.forceDark = z;
        if (z2) {
            RLottieDrawable rLottieDrawable = this.sunDrawable;
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.metaData[0] : 0);
            RLottieDrawable rLottieDrawable2 = this.sunDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.start();
                return;
            }
            return;
        }
        int i = z ? this.sunDrawable.metaData[0] - 1 : 0;
        this.sunDrawable.setCurrentFrame(i, false, true);
        this.sunDrawable.setCustomEndFrame(i);
        ActionBarMenuItem actionBarMenuItem = this.dayNightItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.invalidate();
        }
    }

    @Override
    public final void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.parentResourcesProvider = resourcesProvider;
    }

    public final void showUnsavedAlert() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.ChannelColorUnsaved);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        final int i = 0;
        builder.setNegativeButton(LocaleController.getString(R.string.Dismiss), new AlertDialog.OnButtonClickListener(this) {
            public final ChannelColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog2, int i2) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$showUnsavedAlert$14(alertDialog2, i2);
                        break;
                    default:
                        this.f$0.buttonClick();
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
            public final ChannelColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog2, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$showUnsavedAlert$14(alertDialog2, i3);
                        break;
                    default:
                        this.f$0.buttonClick();
                        break;
                }
            }
        });
        showDialog(alertDialog);
        ((TextView) alertDialog.getButton(-2)).setTextColor(getThemedColor(Theme.key_text_RedBold));
    }

    public final void updateBoostsAndLevels(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
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
                adapter.mObservable.notifyChanged();
            }
            updateButton(true);
        }
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
        this.adapter.mObservable.notifyChanged();
        AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new ChannelColorActivity$$ExternalSyntheticLambda0(this, 0));
        this.buttonContainer.setBackgroundColor(getThemedColor(i));
        this.button.updateColors$1();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void updateMessagesPreview(boolean z) {
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
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.selectedWallpaper);
            if (wallpaperEmoticon == null && this.selectedWallpaper == null && this.galleryWallpaper != null) {
                wallpaperEmoticon = "❌";
            }
            themeChooser.setSelectedEmoticon(wallpaperEmoticon, z);
            themeChooser.setGalleryWallpaper(this.galleryWallpaper);
        }
    }

    public final void updateProfilePreview() {
        TLRPC.StickerSet stickerSet;
        TLRPC.Document document;
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
                MessagesController.PeerColor peerColorFromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                profilePreview.profileView.setColor(peerColorFromCollectible, true);
                profilePreview.backgroundView.setColor(peerColorFromCollectible, true);
                profilePreview.profileView.setEmoji(((TLRPC.TL_emojiStatusCollectible) this.selectedStatusEmoji).pattern_document_id, true, true);
            } else {
                ProfilePreview profilePreview2 = (ProfilePreview) viewFindChildAt;
                int i = this.selectedProfileColor;
                profilePreview2.profileView.setColor(i, true);
                profilePreview2.backgroundView.setColor(ChannelColorActivity.this.currentAccount, i, true);
                profilePreview2.profileView.setEmoji(this.selectedProfileEmoji, false, true);
            }
            ProfilePreview profilePreview3 = (ProfilePreview) viewFindChildAt;
            profilePreview3.profileView.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(this.selectedStatusEmoji), false, true);
            profilePreview3.profileView.overrideAvatarColor(this.selectedReplyColor);
            profilePreview3.updateColors$1();
        }
        if (viewFindChildAt2 instanceof PeerColorActivity.PeerColorGrid) {
            ((PeerColorActivity.PeerColorGrid) viewFindChildAt2).setSelected(this.selectedProfileColor, true);
        } else if (viewFindChildAt2 instanceof PeerColorPicker) {
            ((PeerColorPicker) viewFindChildAt2).setSelected(this.selectedReplyColor, true);
        }
        if (viewFindChildAt3 instanceof EmojiCell) {
            EmojiCell emojiCell = (EmojiCell) viewFindChildAt3;
            emojiCell.setAdaptiveEmojiColor(this.currentAccount, this.selectedProfileColor, false);
            emojiCell.setEmoji(this.selectedProfileEmoji, false, true);
        }
        if (viewFindChildAt4 instanceof EmojiCell) {
            TLRPC.EmojiStatus emojiStatus2 = this.selectedStatusEmoji;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((EmojiCell) viewFindChildAt4).setAdaptiveEmojiColor(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((EmojiCell) viewFindChildAt4).setAdaptiveEmojiColor(this.currentAccount, this.selectedProfileColor, false);
            }
            ((EmojiCell) viewFindChildAt4).setEmoji(DialogObject.getEmojiStatusDocumentId(this.selectedStatusEmoji), DialogObject.isEmojiStatusCollectible(this.selectedStatusEmoji), true);
        }
        boolean z = viewFindChildAt5 instanceof EmojiCell;
        long j = this.dialogId;
        if (z) {
            EmojiCell emojiCell2 = (EmojiCell) viewFindChildAt5;
            emojiCell2.setAdaptiveEmojiColor(this.currentAccount, this.selectedProfileColor, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                emojiCell2.setEmoji(0L, false, false);
            } else {
                long j2 = stickerSet2.thumb_document_id;
                if (j2 == 0) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet2);
                    if (!groupStickerSetById.documents.isEmpty()) {
                        j2 = groupStickerSetById.documents.get(0).id;
                    }
                }
                emojiCell2.setEmoji(j2, false, false);
            }
        }
        if (viewFindChildAt6 instanceof EmojiCell) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((EmojiCell) viewFindChildAt6).setEmoji(0L, false, false);
            } else {
                EmojiCell emojiCell3 = (EmojiCell) viewFindChildAt6;
                if (stickerSet.thumb_document_id == 0) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById2 = getMediaDataController().getGroupStickerSetById(stickerSet);
                    if (groupStickerSetById2.documents.isEmpty()) {
                        document = null;
                    } else {
                        document = groupStickerSetById2.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document == null) {
                    emojiCell3.imageDrawable.set((Drawable) null, false);
                    if (emojiCell3.offText == null) {
                        emojiCell3.offText = new Text(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
                    }
                } else {
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = emojiCell3.imageDrawable;
                    swapAnimatedEmojiDrawable.set(document, swapAnimatedEmojiDrawable.cacheType, false);
                    emojiCell3.offText = null;
                }
                emojiCell3.imageDrawable.setParticles(false, false);
            }
        }
        updateRows$2();
    }

    public void updateRows$2() {
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
                adapter.mObservable.notifyItemRangeInserted(10, 1);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        } else {
            int i = this.removeProfileColorRow;
            this.removeProfileColorRow = -1;
            if (i >= 0 && (adapter2 = this.adapter) != null) {
                adapter2.mObservable.notifyItemRangeRemoved(i, 1);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        }
        int i2 = this.rowsCount;
        this.profileHintRow = i2;
        this.statusEmojiRow = i2 + 1;
        this.rowsCount = i2 + 3;
        this.statusHintRow = i2 + 2;
    }

    public final void updateThemeColors$1() {
        Theme.ThemeInfo themeInfo;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] iArr;
        int i;
        Theme.ThemeAccent accent;
        View viewFindChildAt;
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
        this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourceProvider));
        this.backgroundDrawable = PreviewView.getBackgroundDrawable(this.backgroundDrawable, this.currentAccount, this.selectedWallpaper, this.isDark);
        viewFindChildAt = findChildAt(this.messagesPreviewRow);
        if (viewFindChildAt instanceof ThemePreviewMessagesCell) {
            ((ThemePreviewMessagesCell) viewFindChildAt).setOverrideBackground(this.backgroundDrawable);
        }
    }

    public final class EmojiCell extends FrameLayout {
        public int color;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
        public boolean needDivider;
        public Text offText;
        public final Theme.ResourcesProvider resourcesProvider;
        public final SimpleTextView textView;

        public EmojiCell(Activity activity, Theme.ResourcesProvider resourcesProvider) {
            super(activity);
            this.needDivider = false;
            this.resourcesProvider = resourcesProvider;
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 13);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            super.dispatchDraw(canvas);
            updateImageBounds();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(this.color));
            Text text = this.offText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (text != null) {
                canvas2 = canvas;
                text.draw((getMeasuredWidth() - this.offText.getWidth()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider), canvas2);
            } else {
                canvas2 = canvas;
                swapAnimatedEmojiDrawable.draw(canvas2);
            }
            if (this.needDivider) {
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
                if (paint != null) {
                    canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : 0), getMeasuredHeight() - 1, paint);
                }
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageDrawable.attach();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageDrawable.detach();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public final void setAdaptiveEmojiColor(int i, int i2, boolean z) {
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

        public final void setEmoji(long j, boolean z, boolean z2) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
            if (j == 0) {
                swapAnimatedEmojiDrawable.set((Drawable) null, z2);
                if (this.offText == null) {
                    this.offText = new Text(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
                }
            } else {
                swapAnimatedEmojiDrawable.set(j, z2);
                this.offText = null;
            }
            swapAnimatedEmojiDrawable.setParticles(z, z2);
        }

        public final void setLockLevel(int i) {
            SimpleTextView simpleTextView = this.textView;
            if (i <= 0) {
                simpleTextView.setRightDrawable((Drawable) null);
            } else {
                simpleTextView.setRightDrawable(new PeerColorActivity.LevelLock(i, getContext(), this.resourcesProvider, false));
                simpleTextView.setDrawablePadding(AndroidUtilities.dp(6.0f));
            }
        }

        public final void updateImageBounds() {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
            swapAnimatedEmojiDrawable.setBounds((getWidth() - swapAnimatedEmojiDrawable.size) - AndroidUtilities.dp(21.0f), (getHeight() - swapAnimatedEmojiDrawable.size) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + swapAnimatedEmojiDrawable.size) / 2);
        }

        public final void setAdaptiveEmojiColor(MessagesController.PeerColor peerColor) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (peerColor == null) {
                int i = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i, resourcesProvider)) > 0.8f) {
                    this.color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
                    return;
                } else if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i, resourcesProvider)) < 0.2f) {
                    this.color = Theme.multAlpha(0.5f, Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider));
                    return;
                } else {
                    this.color = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.multAlpha(0.7f, PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i, resourcesProvider))));
                    return;
                }
            }
            this.color = peerColor.getColor(0, resourcesProvider);
        }
    }

    public static void updateColors(View view) {
        int iIsDark;
        if (view instanceof EmojiCell) {
            EmojiCell emojiCell = (EmojiCell) view;
            emojiCell.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, emojiCell.resourcesProvider));
            return;
        }
        if (view instanceof TextCell) {
            ((TextCell) view).updateColors();
            return;
        }
        if (view instanceof PeerColorPicker) {
            PeerColorPicker peerColorPicker = (PeerColorPicker) view;
            AndroidUtilities.forEachViews((RecyclerView) peerColorPicker.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda335(2, peerColorPicker, MessagesController.getInstance(peerColorPicker.currentAccount).peerColors));
            return;
        }
        if (!(view instanceof ThemeChooser)) {
            return;
        }
        ThemeChooser themeChooser = (ThemeChooser) view;
        Theme.ResourcesProvider resourcesProvider = themeChooser.resourcesProvider;
        if (resourcesProvider != null) {
            iIsDark = resourcesProvider.isDark();
        } else {
            iIsDark = Theme.currentTheme.isDark();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = themeChooser.items;
            if (i < arrayList.size()) {
                ((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i)).themeIndex = iIsDark;
                i++;
            } else {
                AndroidUtilities.forEachViews((RecyclerView) themeChooser.listView, (Consumer) new ChannelColorActivity$ThemeChooser$$ExternalSyntheticLambda0(themeChooser, 0));
                themeChooser.adapter.mObservable.notifyChanged();
                return;
            }
        }
    }
}
