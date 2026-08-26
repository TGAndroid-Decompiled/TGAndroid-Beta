package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;

public class ChannelWallpaperActivity extends BaseFragment {
    public static final int VIEW_TYPE_BUTTON = 0;
    public static final int VIEW_TYPE_INFO = 1;
    public static final int VIEW_TYPE_THEMES = 2;
    public Adapter adapter;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    public FrameLayout contentView;
    public int currentLevel;
    public TLRPC.WallPaper currentWallpaper;
    private ActionBarMenuItem dayNightItem;
    public final long dialogId;
    public int galleryRow;
    public TLRPC.WallPaper galleryWallpaper;
    public int infoRow;
    private boolean isChannel;
    public RecyclerListView listView;
    private Utilities.Callback3<TLRPC.WallPaper, TLRPC.WallPaper, TLRPC.WallPaper> onSelectedWallpaperChange;
    public int removeRow;
    public int rowsCount;
    public TLRPC.WallPaper selectedWallpaper;
    private RLottieDrawable sunDrawable;
    public int themesRow;
    public ThemePreviewActivity.DayNightSwitchDelegate toggleThemeDelegate;

    public class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        public void lambda$onCreateViewHolder$0(String str, ChannelColorActivity.ThemeChooser themeChooser, TLRPC.WallPaper wallPaper) {
            ChannelWallpaperActivity.this.selectedWallpaper = new TLRPC.TL_wallPaperNoFile();
            TLRPC.WallPaper wallPaper2 = ChannelWallpaperActivity.this.selectedWallpaper;
            wallPaper2.id = 0L;
            wallPaper2.flags |= 4;
            wallPaper2.settings = new TLRPC.TL_wallPaperSettings();
            ChannelWallpaperActivity.this.selectedWallpaper.settings.emoticon = str;
            themeChooser.setSelectedEmoticon(str, false);
            if (ChannelWallpaperActivity.this.onSelectedWallpaperChange != null) {
                Utilities.Callback3 callback3 = ChannelWallpaperActivity.this.onSelectedWallpaperChange;
                ChannelWallpaperActivity channelWallpaperActivity = ChannelWallpaperActivity.this;
                callback3.run(channelWallpaperActivity.currentWallpaper, channelWallpaperActivity.selectedWallpaper, channelWallpaperActivity.galleryWallpaper);
            }
            ChannelWallpaperActivity.this.updateRows();
            ChannelWallpaperActivity.this.finishFragment();
        }

        public void lambda$onCreateViewHolder$1(ChannelColorActivity.ThemeChooser themeChooser, String str) {
            Bitmap bitmap = null;
            if (str == null) {
                ChannelWallpaperActivity channelWallpaperActivity = ChannelWallpaperActivity.this;
                channelWallpaperActivity.selectedWallpaper = channelWallpaperActivity.galleryWallpaper;
                themeChooser.setSelectedEmoticon(null, false);
                if (ChannelWallpaperActivity.this.onSelectedWallpaperChange != null) {
                    Utilities.Callback3 callback3 = ChannelWallpaperActivity.this.onSelectedWallpaperChange;
                    ChannelWallpaperActivity channelWallpaperActivity2 = ChannelWallpaperActivity.this;
                    callback3.run(channelWallpaperActivity2.currentWallpaper, channelWallpaperActivity2.selectedWallpaper, channelWallpaperActivity2.galleryWallpaper);
                }
                ChannelWallpaperActivity.this.updateRows();
                return;
            }
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(new WallpapersListActivity.EmojiWallpaper(str), bitmap) {
                @Override
                public boolean insideBottomSheet() {
                    return true;
                }
            };
            ChannelWallpaperActivity channelWallpaperActivity3 = ChannelWallpaperActivity.this;
            themePreviewActivity.boostsStatus = channelWallpaperActivity3.boostsStatus;
            themePreviewActivity.setOnSwitchDayNightDelegate(channelWallpaperActivity3.toggleThemeDelegate);
            themePreviewActivity.setResourceProvider(((BaseFragment) ChannelWallpaperActivity.this).resourceProvider);
            themePreviewActivity.setInitialModes(false, false, 0.2f);
            themePreviewActivity.setDialogId(ChannelWallpaperActivity.this.dialogId);
            themePreviewActivity.setDelegate(new WearAuthSheet$$ExternalSyntheticLambda5(this, str, themeChooser, 13));
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.occupyNavigationBar = true;
            ChannelWallpaperActivity.this.showAsSheet(themePreviewActivity, bottomSheetParams);
        }

        @Override
        public int getItemCount() {
            return ChannelWallpaperActivity.this.rowsCount;
        }

        @Override
        public int getItemViewType(int i) {
            ChannelWallpaperActivity channelWallpaperActivity = ChannelWallpaperActivity.this;
            if (i == channelWallpaperActivity.galleryRow || i == channelWallpaperActivity.removeRow) {
                return 0;
            }
            return i == channelWallpaperActivity.themesRow ? 2 : 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ChannelWallpaperActivity channelWallpaperActivity = ChannelWallpaperActivity.this;
            if (i == channelWallpaperActivity.galleryRow) {
                ((TextCell) viewHolder.itemView).setTextAndIcon(LocaleController.getString(R.string.ChooseFromGallery2), R.drawable.msg_background, ChannelWallpaperActivity.this.removeRow != -1);
                ((TextCell) viewHolder.itemView).setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                return;
            }
            if (i == channelWallpaperActivity.removeRow) {
                ((TextCell) viewHolder.itemView).setTextAndIcon((CharSequence) LocaleController.getString(R.string.ChannelWallpaperRemove), R.drawable.msg_delete, false);
                TextCell textCell = (TextCell) viewHolder.itemView;
                int i2 = Theme.key_text_RedRegular;
                textCell.setColors(i2, i2);
                return;
            }
            if (i == channelWallpaperActivity.infoRow) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(LocaleController.getString(channelWallpaperActivity.isChannel ? R.string.ChannelWallpaperInfo : R.string.GroupWallpaperInfo));
                ((TextInfoPrivacyCell) viewHolder.itemView).setBackgroundColor(ChannelWallpaperActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
                ((TextInfoPrivacyCell) viewHolder.itemView).setForeground(Theme.getThemedDrawable(ChannelWallpaperActivity.this.getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ((BaseFragment) ChannelWallpaperActivity.this).resourceProvider)));
            } else if (i == channelWallpaperActivity.themesRow) {
                ((ChannelColorActivity.ThemeChooser) viewHolder.itemView).setGalleryWallpaper(channelWallpaperActivity.galleryWallpaper);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            if (i == 0) {
                TextCell textCell = new TextCell(23, ChannelWallpaperActivity.this.getContext(), ((BaseFragment) ChannelWallpaperActivity.this).resourceProvider, false, false);
                textCell.setBackgroundColor(ChannelWallpaperActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                textInfoPrivacyCell = textCell;
            } else if (i == 2) {
                ChannelColorActivity.ThemeChooser themeChooser = new ChannelColorActivity.ThemeChooser(ChannelWallpaperActivity.this.getContext(), true, ((BaseFragment) ChannelWallpaperActivity.this).currentAccount, ((BaseFragment) ChannelWallpaperActivity.this).resourceProvider);
                themeChooser.setSelectedEmoticon(ChatThemeController.getWallpaperEmoticon(ChannelWallpaperActivity.this.selectedWallpaper), false);
                themeChooser.setGalleryWallpaper(ChannelWallpaperActivity.this.galleryWallpaper);
                themeChooser.setOnEmoticonSelected(new OAuthSheet$$ExternalSyntheticLambda1(12, this, themeChooser));
                themeChooser.setBackgroundColor(ChannelWallpaperActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                textInfoPrivacyCell = themeChooser;
            } else {
                textInfoPrivacyCell = new TextInfoPrivacyCell(ChannelWallpaperActivity.this.getContext(), 24, null);
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ChannelColorActivity.ThemeChooser) {
                ((ChannelColorActivity.ThemeChooser) view).setGalleryWallpaper(ChannelWallpaperActivity.this.galleryWallpaper);
            }
            super.onViewAttachedToWindow(viewHolder);
        }
    }

    public ChannelWallpaperActivity(long j, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        super(null);
        this.rowsCount = 0;
        this.galleryRow = -1;
        this.removeRow = -1;
        this.infoRow = -1;
        this.themesRow = -1;
        this.toggleThemeDelegate = new ThemePreviewActivity.DayNightSwitchDelegate() {
            @Override
            public boolean isDark() {
                return ChannelWallpaperActivity.this.isDark();
            }

            @Override
            public boolean supportsAnimation() {
                return false;
            }

            @Override
            public void switchDayNight(boolean z) {
                if (((BaseFragment) ChannelWallpaperActivity.this).resourceProvider instanceof ChannelColorActivity.ThemeDelegate) {
                    ((ChannelColorActivity.ThemeDelegate) ((BaseFragment) ChannelWallpaperActivity.this).resourceProvider).toggle();
                }
                ChannelWallpaperActivity.this.setForceDark(isDark(), false);
                ChannelWallpaperActivity.this.updateColors();
            }
        };
        this.dialogId = j;
        long j2 = -j;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j2));
        if (chat != null) {
            this.isChannel = ChatObject.isChannelAndNotMegaGroup(chat);
            this.currentLevel = chat.level;
        }
        this.boostsStatus = tL_premium_boostsStatus;
        if (tL_premium_boostsStatus == null) {
            MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j, new LinkManager$$ExternalSyntheticLambda24(this, tL_premium_boostsStatus, chat, 1));
        } else {
            this.currentLevel = tL_premium_boostsStatus.level;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j2);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.selectedWallpaper = wallPaper;
            this.currentWallpaper = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.galleryWallpaper = this.selectedWallpaper;
            }
        }
    }

    public void lambda$createView$1(TLRPC.WallPaper wallPaper) {
        this.selectedWallpaper = wallPaper;
        this.currentWallpaper = wallPaper;
        this.galleryWallpaper = wallPaper;
        Utilities.Callback3<TLRPC.WallPaper, TLRPC.WallPaper, TLRPC.WallPaper> callback3 = this.onSelectedWallpaperChange;
        if (callback3 != null) {
            callback3.run(wallPaper, wallPaper, wallPaper);
        }
        finishFragment();
    }

    public void lambda$createView$2(View view, int i) {
        if (i != this.removeRow) {
            if (i == this.galleryRow) {
                ChatThemeBottomSheet.openGalleryForBackground(getParentActivity(), this, this.dialogId, this.resourceProvider, new PollItemMenu$$ExternalSyntheticLambda15(this, 7), this.toggleThemeDelegate, this.boostsStatus);
                return;
            }
            return;
        }
        this.galleryWallpaper = null;
        this.selectedWallpaper = null;
        Utilities.Callback3<TLRPC.WallPaper, TLRPC.WallPaper, TLRPC.WallPaper> callback3 = this.onSelectedWallpaperChange;
        if (callback3 != null) {
            callback3.run(this.currentWallpaper, null, null);
        }
        View viewFindChildAt = findChildAt(this.themesRow);
        if (viewFindChildAt instanceof ChannelColorActivity.ThemeChooser) {
            ((ChannelColorActivity.ThemeChooser) viewFindChildAt).setGalleryWallpaper(this.galleryWallpaper);
        }
        updateRows();
    }

    public void lambda$new$0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, TLRPC.Chat chat, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2) {
        this.boostsStatus = tL_premium_boostsStatus2;
        if (tL_premium_boostsStatus != null) {
            int i = tL_premium_boostsStatus.level;
            this.currentLevel = i;
            if (chat != null) {
                chat.flags |= 1024;
                chat.level = i;
            }
        }
    }

    public static boolean lambda$toggleTheme$3(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$toggleTheme$4() {
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        if (resourcesProvider instanceof ChannelColorActivity.ThemeDelegate) {
            ((ChannelColorActivity.ThemeDelegate) resourcesProvider).toggle();
        }
        setForceDark(isDark(), true);
        updateColors();
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(this.isChannel ? R.string.ChannelWallpaper : R.string.GroupWallpaper));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChannelWallpaperActivity.this.finishFragment();
                } else if (i == 1) {
                    ChannelWallpaperActivity.this.toggleTheme();
                }
            }
        });
        int i = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.sunDrawable = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        if (isDark()) {
            this.sunDrawable.setCurrentFrame(35);
            this.sunDrawable.setCustomEndFrame(36);
        } else {
            this.sunDrawable.setCustomEndFrame(0);
            this.sunDrawable.setCurrentFrame(0);
        }
        this.sunDrawable.beginApplyLayerColors();
        int color = Theme.getColor(Theme.key_chats_menuName, this.resourceProvider);
        this.sunDrawable.setLayerColor("Sunny", color);
        this.sunDrawable.setLayerColor("Path 6", color);
        this.sunDrawable.setLayerColor("Path", color);
        this.sunDrawable.setLayerColor("Path 5", color);
        if (this.resourceProvider instanceof ChannelColorActivity.ThemeDelegate) {
            this.dayNightItem = this.actionBar.createMenu().addItem(1, this.sunDrawable);
        }
        this.contentView = new FrameLayout(context);
        updateRows();
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourceProvider);
        this.listView = recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 9));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        updateColors();
        FrameLayout frameLayout = this.contentView;
        this.fragmentView = frameLayout;
        return frameLayout;
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

    public boolean isDark() {
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        return resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
    }

    public void setForceDark(boolean z, boolean z2) {
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

    public void setOnSelectedWallpaperChange(Utilities.Callback3<TLRPC.WallPaper, TLRPC.WallPaper, TLRPC.WallPaper> callback3) {
        this.onSelectedWallpaperChange = callback3;
    }

    public void setSelectedWallpaper(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        this.selectedWallpaper = wallPaper;
        this.galleryWallpaper = wallPaper2;
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
                if (ChannelWallpaperActivity.this.isDark()) {
                    if (ChannelWallpaperActivity.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, ChannelWallpaperActivity.this.changeDayNightViewProgress * fMax, paint);
                    }
                    canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas2.drawCircle(measuredWidth, measuredHeight, (1.0f - ChannelWallpaperActivity.this.changeDayNightViewProgress) * fMax, paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                ChannelWallpaperActivity.this.dayNightItem.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightView = view;
        view.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(11));
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChannelWallpaperActivity.this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChannelWallpaperActivity.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || ChannelWallpaperActivity.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ChannelWallpaperActivity.this.changeDayNightView != null) {
                    if (ChannelWallpaperActivity.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) ChannelWallpaperActivity.this.changeDayNightView.getParent()).removeView(ChannelWallpaperActivity.this.changeDayNightView);
                    }
                    ChannelWallpaperActivity.this.changeDayNightView = null;
                }
                ChannelWallpaperActivity.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(this, 3));
    }

    public void updateColors() {
        this.actionBar.setBackgroundColor(getThemedColor(Theme.key_actionBarDefault));
        this.actionBar.setTitleColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        this.actionBar.setItemsColor(getThemedColor(Theme.key_actionBarDefaultIcon), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSelector), false);
        this.listView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.adapter.notifyDataSetChanged();
        AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new QrActivity$5$$ExternalSyntheticLambda1(this, 4));
        setNavigationBarColor(getNavigationBarColor());
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
    }

    public void updateRows() {
        this.rowsCount = 1;
        this.galleryRow = 0;
        int i = this.removeRow;
        if (this.galleryWallpaper != null) {
            this.rowsCount = 2;
            this.removeRow = 1;
        } else {
            this.removeRow = -1;
        }
        Adapter adapter = this.adapter;
        if (adapter != null) {
            int i2 = this.removeRow;
            if (i2 != -1 && i == -1) {
                adapter.notifyItemInserted(i2);
            }
            if (this.removeRow == -1 && i != -1) {
                this.adapter.notifyItemRemoved(i);
            }
        }
        int i3 = this.rowsCount;
        this.infoRow = i3;
        this.rowsCount = i3 + 2;
        this.themesRow = i3 + 1;
    }

    public void updateColors(View view) {
        if (view instanceof TextInfoPrivacyCell) {
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
            textInfoPrivacyCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
            textInfoPrivacyCell.setForeground(Theme.getThemedDrawable(getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, this.resourceProvider)));
            return;
        }
        view.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (view instanceof TextCell) {
            ((TextCell) view).updateColors();
        } else if (view instanceof ChannelColorActivity.ThemeChooser) {
            ((ChannelColorActivity.ThemeChooser) view).updateColors();
        }
    }
}
