package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class AvatarPreviewer {
    private static AvatarPreviewer INSTANCE;
    private Layout layout;
    private ViewGroup view;
    private boolean visible;
    private WindowManager windowManager;

    public interface Callback {
        void onMenuClick(MenuItem menuItem);
    }

    public static AvatarPreviewer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AvatarPreviewer();
        }
        return INSTANCE;
    }

    public static boolean hasVisibleInstance() {
        AvatarPreviewer avatarPreviewer = INSTANCE;
        return avatarPreviewer != null && avatarPreviewer.visible;
    }

    public static boolean canPreview(Data data) {
        return (data == null || (data.imageLocation == null && data.thumbImageLocation == null)) ? false : true;
    }

    public void show(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, Data data, Callback callback) {
        Objects.requireNonNull(viewGroup);
        Objects.requireNonNull(data);
        Objects.requireNonNull(callback);
        Context context = viewGroup.getContext();
        if (this.view != viewGroup) {
            close();
            this.view = viewGroup;
            this.windowManager = (WindowManager) ContextCompat.getSystemService(context, WindowManager.class);
            Layout layout = new Layout(context, resourcesProvider, callback) {
                @Override
                protected void onHideFinish() {
                    if (AvatarPreviewer.this.visible) {
                        AvatarPreviewer.this.visible = false;
                        if (AvatarPreviewer.this.layout.getParent() != null) {
                            AvatarPreviewer.this.windowManager.removeView(AvatarPreviewer.this.layout);
                        }
                        AvatarPreviewer.this.layout.recycle();
                        AvatarPreviewer.this.layout = null;
                        AvatarPreviewer.this.view.requestDisallowInterceptTouchEvent(false);
                        AvatarPreviewer.this.view = null;
                        AvatarPreviewer.this.windowManager = null;
                    }
                }
            };
            this.layout = layout;
            ViewCompat.setOnApplyWindowInsetsListener(layout, new OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return this.f$0.lambda$show$0(view, windowInsetsCompat);
                }
            });
        }
        this.layout.setData(data);
        if (this.visible) {
            return;
        }
        if (this.layout.getParent() != null) {
            this.windowManager.removeView(this.layout);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.layout, layoutParams);
        this.windowManager.addView(this.layout, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.visible = true;
    }

    public WindowInsetsCompat lambda$show$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        Layout layout = this.layout;
        if (layout == view && layout.container != null) {
            this.layout.container.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public void close() {
        if (this.visible) {
            this.layout.setShowing(false);
        }
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        Layout layout = this.layout;
        if (layout != null) {
            layout.onTouchEvent(motionEvent);
        }
    }

    public static final class MenuItem {
        private static final MenuItem[] $VALUES;
        public static final MenuItem MENTION;
        public static final MenuItem OPEN_GROUP;
        public static final MenuItem SEARCH_MESSAGES;
        public static final MenuItem SEND_MESSAGE;
        private final int iconResId;
        private final String labelKey;
        private final int labelResId;
        public static final MenuItem OPEN_PROFILE = new MenuItem("OPEN_PROFILE", 0, "OpenProfile", R.string.OpenProfile, R.drawable.msg_openprofile);
        public static final MenuItem OPEN_CHANNEL = new MenuItem("OPEN_CHANNEL", 1, "OpenChannel2", R.string.OpenChannel2, R.drawable.msg_channel);

        private static MenuItem[] $values() {
            return new MenuItem[]{OPEN_PROFILE, OPEN_CHANNEL, OPEN_GROUP, SEND_MESSAGE, MENTION, SEARCH_MESSAGES};
        }

        public static MenuItem valueOf(String str) {
            return (MenuItem) Enum.valueOf(MenuItem.class, str);
        }

        public static MenuItem[] values() {
            return (MenuItem[]) $VALUES.clone();
        }

        static {
            int i = R.string.OpenGroup2;
            int i2 = R.drawable.msg_discussion;
            OPEN_GROUP = new MenuItem("OPEN_GROUP", 2, "OpenGroup2", i, i2);
            SEND_MESSAGE = new MenuItem("SEND_MESSAGE", 3, "SendMessage", R.string.SendMessage, i2);
            MENTION = new MenuItem("MENTION", 4, "Mention", R.string.Mention, R.drawable.msg_mention);
            SEARCH_MESSAGES = new MenuItem("SEARCH_MESSAGES", 5, "AvatarPreviewSearchMessages", R.string.AvatarPreviewSearchMessages, R.drawable.msg_search);
            $VALUES = $values();
        }

        private MenuItem(String str, int i, String str2, int i2, int i3) {
            super(str, i);
            this.labelKey = str2;
            this.labelResId = i2;
            this.iconResId = i3;
        }
    }

    public static class Data {
        private final String imageFilter;
        private final ImageLocation imageLocation;
        private final InfoLoadTask infoLoadTask;
        private final MenuItem[] menuItems;
        private final Object parentObject;
        private final BitmapDrawable thumb;
        private final String thumbImageFilter;
        private final ImageLocation thumbImageLocation;
        private final String videoFileName;
        private final String videoFilter;
        private final ImageLocation videoLocation;

        public static Data of(TLRPC.User user, int i, MenuItem... menuItemArr) {
            TLRPC.UserProfilePhoto userProfilePhoto;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(user, 0);
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user, 1);
            BitmapDrawable bitmapDrawable = null;
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            if (user != null && (userProfilePhoto = user.photo) != null) {
                bitmapDrawable = userProfilePhoto.strippedBitmap;
            }
            return new Data(forUserOrChat, forUserOrChat2, null, null, str, null, null, bitmapDrawable, user, menuItemArr, new UserInfoLoadTask(user, i));
        }

        public static Data of(TLRPC.User user, TLRPC.UserFull userFull, MenuItem... menuItemArr) {
            ImageLocation imageLocation;
            String attachFileName;
            TLRPC.UserProfilePhoto userProfilePhoto;
            TLRPC.Photo photo;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(userFull.user, 0);
            if (forUserOrChat == null && (photo = userFull.profile_photo) != null) {
                forUserOrChat = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 500), userFull.profile_photo);
            }
            ImageLocation imageLocation2 = forUserOrChat;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(userFull.user, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
            TLRPC.Photo photo2 = userFull.profile_photo;
            if (photo2 == null || photo2.video_sizes.isEmpty()) {
                imageLocation = null;
                attachFileName = null;
            } else {
                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(userFull.profile_photo.video_sizes, 1000);
                ImageLocation forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, userFull.profile_photo);
                attachFileName = FileLoader.getAttachFileName(closestVideoSizeWithSize);
                imageLocation = forPhoto;
            }
            return new Data(imageLocation2, forUserOrChat2, imageLocation, null, str, (imageLocation == null || imageLocation.imageType != 2) ? null : "g", attachFileName, bitmapDrawable, userFull.user, menuItemArr, null);
        }

        public static Data of(TLRPC.Chat chat, int i, MenuItem... menuItemArr) {
            TLRPC.ChatPhoto chatPhoto;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            BitmapDrawable bitmapDrawable = null;
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            if (chat != null && (chatPhoto = chat.photo) != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            }
            return new Data(forUserOrChat, forUserOrChat2, null, null, str, null, null, bitmapDrawable, chat, menuItemArr, new ChatInfoLoadTask(chat, i));
        }

        public static Data of(TLRPC.Chat chat, TLRPC.ChatFull chatFull, MenuItem... menuItemArr) {
            ImageLocation forPhoto;
            String attachFileName;
            TLRPC.ChatPhoto chatPhoto;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
            TLRPC.Photo photo = chatFull.chat_photo;
            if (photo == null || photo.video_sizes.isEmpty()) {
                forPhoto = null;
                attachFileName = null;
            } else {
                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(chatFull.chat_photo.video_sizes, 1000);
                forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, chatFull.chat_photo);
                attachFileName = FileLoader.getAttachFileName(closestVideoSizeWithSize);
            }
            return new Data(forUserOrChat, forUserOrChat2, forPhoto, null, str, (forPhoto == null || forPhoto.imageType != 2) ? null : "g", attachFileName, bitmapDrawable, chat, menuItemArr, null);
        }

        private Data(ImageLocation imageLocation, ImageLocation imageLocation2, ImageLocation imageLocation3, String str, String str2, String str3, String str4, BitmapDrawable bitmapDrawable, Object obj, MenuItem[] menuItemArr, InfoLoadTask infoLoadTask) {
            this.imageLocation = imageLocation;
            this.thumbImageLocation = imageLocation2;
            this.videoLocation = imageLocation3;
            this.imageFilter = str;
            this.thumbImageFilter = str2;
            this.videoFilter = str3;
            this.videoFileName = str4;
            this.thumb = bitmapDrawable;
            this.parentObject = obj;
            this.menuItems = menuItemArr;
            this.infoLoadTask = infoLoadTask;
        }
    }

    private static class UserInfoLoadTask extends InfoLoadTask {
        public UserInfoLoadTask(TLRPC.User user, int i) {
            super(user, i, NotificationCenter.userInfoDidLoad);
        }

        @Override
        protected void load() {
            MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.argument, false, this.classGuid);
        }

        @Override
        protected void onReceiveNotification(Object... objArr) {
            if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.argument).id) {
                onResult((TLRPC.UserFull) objArr[1]);
            }
        }
    }

    private static class ChatInfoLoadTask extends InfoLoadTask {
        public ChatInfoLoadTask(TLRPC.Chat chat, int i) {
            super(chat, i, NotificationCenter.chatInfoDidLoad);
        }

        @Override
        protected void load() {
            MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.argument).id, this.classGuid, false);
        }

        @Override
        protected void onReceiveNotification(Object... objArr) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull == null || chatFull.id != ((TLRPC.Chat) this.argument).id) {
                return;
            }
            onResult(chatFull);
        }
    }

    private static abstract class InfoLoadTask {
        protected final Object argument;
        protected final int classGuid;
        private boolean loading;
        private final int notificationId;
        private Consumer onResult;
        private final NotificationCenter.NotificationCenterDelegate observer = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public void didReceivedNotification(int i, int i2, Object... objArr) {
                if (InfoLoadTask.this.loading && i == InfoLoadTask.this.notificationId) {
                    InfoLoadTask.this.onReceiveNotification(objArr);
                }
            }
        };
        private final NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);

        protected abstract void load();

        protected abstract void onReceiveNotification(Object... objArr);

        public InfoLoadTask(Object obj, int i, int i2) {
            this.argument = obj;
            this.classGuid = i;
            this.notificationId = i2;
        }

        public final void load(Consumer consumer) {
            if (this.loading) {
                return;
            }
            this.loading = true;
            this.onResult = consumer;
            this.notificationCenter.addObserver(this.observer, this.notificationId);
            load();
        }

        public final void cancel() {
            if (this.loading) {
                this.loading = false;
                this.notificationCenter.removeObserver(this.observer, this.notificationId);
            }
        }

        protected final void onResult(Object obj) {
            if (this.loading) {
                cancel();
                this.onResult.accept(obj);
            }
        }
    }

    static abstract class Layout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        private final AvatarView avatarView;
        private Bitmap blurBitmap;
        private final Matrix blurMatrix;
        private View blurView;
        private final Callback callback;
        private final FrameLayout container;
        private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
        private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
        private InfoLoadTask infoLoadTask;
        private final ActionBarPopupWindow.ActionBarPopupWindowLayout menu;
        private MenuItem[] menuItems;
        private AnimatorSet openAnimator;
        private final Interpolator openInterpolator;
        private boolean preparingBlur;
        private boolean recycled;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean showing;
        private String videoFileName;

        protected abstract void onHideFinish();

        public Layout(Context context, Theme.ResourcesProvider resourcesProvider, Callback callback) {
            super(context);
            this.openInterpolator = new OvershootInterpolator(1.02f);
            BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
            this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
            this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
            this.blurMatrix = new Matrix();
            this.callback = callback;
            this.resourcesProvider = resourcesProvider;
            blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(this), this);
            View view = new View(context);
            this.blurView = view;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$0(view2);
                }
            });
            addView(this.blurView, LayoutHelper.createFrame(-1, -1.0f));
            FrameLayout frameLayout = new FrameLayout(context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                }

                @Override
                protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
                    int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
                    int iMin = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                    int iMin2 = Math.min(AndroidUtilities.dp(60.0f), iMin);
                    Layout.this.menu.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((paddingTop - iMin2) - AndroidUtilities.dp(48.0f), Integer.MIN_VALUE));
                    int iClamp = MathUtils.clamp((paddingTop - Layout.this.menu.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), iMin2, iMin);
                    Layout.this.avatarView.measure(View.MeasureSpec.makeMeasureSpec(iClamp, 1073741824), View.MeasureSpec.makeMeasureSpec(iClamp, 1073741824));
                    int measuredHeight = (((paddingTop - iClamp) - Layout.this.menu.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Layout.this.avatarView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) Layout.this.menu.getLayoutParams();
                    layoutParams.topMargin = AndroidUtilities.dp(8.0f) + measuredHeight;
                    layoutParams2.topMargin = measuredHeight + AndroidUtilities.dp(8.0f) + iClamp + AndroidUtilities.dp(4.0f);
                    layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                    super.onLayout(z, i, i2, i3, i4);
                }
            };
            this.container = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
            AvatarView avatarView = new AvatarView(context, resourcesProvider);
            this.avatarView = avatarView;
            avatarView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(0, AndroidUtilities.dp(12.0f)));
            avatarView.setElevation(AndroidUtilities.dp(4.0f));
            avatarView.setClipToOutline(true);
            frameLayout.addView(avatarView, LayoutHelper.createFrame(0, 0, 1));
            if (Build.VERSION.SDK_INT >= 28) {
                avatarView.setOutlineSpotShadowColor(Integer.MIN_VALUE);
                avatarView.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, R.drawable.popup_fixed_alert, resourcesProvider, 0);
            this.menu = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setBackground(blurredBackgroundDrawableViewFactory.create(actionBarPopupWindowLayout).setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider)).setPadding(AndroidUtilities.dp(8.0f)).setHasPadding(true).setRadius(AndroidUtilities.dp(12.0f)));
            frameLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611));
        }

        public void lambda$new$0(View view) {
            setShowing(false);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (!this.avatarView.getShowProgress() || TextUtils.isEmpty(this.videoFileName)) {
                return;
            }
            if (i == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.videoFileName)) {
                    this.avatarView.setProgress(1.0f);
                }
            } else if (i == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.videoFileName)) {
                this.avatarView.setProgress(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
            }
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
                if (getKeyDispatcherState() == null) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                    setShowing(false);
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            if (i != 0 && i2 != 0 && this.showing) {
                this.blurView.setBackground(null);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.prepareBlurBitmap();
                    }
                });
            }
            checkBitmapMatrix();
        }

        public void prepareBlurBitmap() {
            if (this.preparingBlur) {
                return;
            }
            this.preparingBlur = true;
            ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$prepareBlurBitmap$1((Bitmap) obj, (Bitmap) obj2);
                }
            });
        }

        public void lambda$prepareBlurBitmap$1(Bitmap bitmap, Bitmap bitmap2) {
            this.blurBitmap = bitmap;
            this.blurView.setBackground(new BitmapDrawable(bitmap));
            this.preparingBlur = false;
            this.iBlur3SourceBitmap.setBitmap(bitmap2);
            checkBitmapMatrix();
        }

        private void checkBitmapMatrix() {
            Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this);
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.menu;
            if (actionBarPopupWindowLayout != null) {
                actionBarPopupWindowLayout.invalidate();
            }
        }

        public void setData(final Data data) {
            this.menuItems = data.menuItems;
            this.avatarView.setShowProgress(data.videoLocation != null);
            this.videoFileName = data.videoFileName;
            recycleInfoLoadTask();
            if (data.infoLoadTask != null) {
                InfoLoadTask infoLoadTask = data.infoLoadTask;
                this.infoLoadTask = infoLoadTask;
                infoLoadTask.load(new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        this.f$0.lambda$setData$2(data, obj);
                    }
                });
            }
            this.avatarView.setImage(UserConfig.selectedAccount, data.videoLocation, data.videoFilter, data.imageLocation, data.imageFilter, data.thumbImageLocation, data.thumbImageFilter, data.thumb, data.parentObject);
            this.menu.removeInnerViews();
            int i = 0;
            while (true) {
                MenuItem[] menuItemArr = this.menuItems;
                if (i < menuItemArr.length) {
                    final MenuItem menuItem = menuItemArr[i];
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(i == 0, i == this.menuItems.length - 1, this.menu, menuItem.iconResId, LocaleController.getString(menuItem.labelKey, menuItem.labelResId), false, this.resourcesProvider);
                    actionBarMenuSubItemAddItem.setTag(Integer.valueOf(i));
                    actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$setData$3(menuItem, view);
                        }
                    });
                    i++;
                } else {
                    setShowing(true);
                    return;
                }
            }
        }

        public void lambda$setData$2(Data data, Object obj) {
            if (this.recycled) {
                return;
            }
            if (obj instanceof TLRPC.UserFull) {
                setData(Data.of((TLRPC.User) data.infoLoadTask.argument, (TLRPC.UserFull) obj, data.menuItems));
            } else if (obj instanceof TLRPC.ChatFull) {
                setData(Data.of((TLRPC.Chat) data.infoLoadTask.argument, (TLRPC.ChatFull) obj, data.menuItems));
            }
        }

        public void lambda$setData$3(MenuItem menuItem, View view) {
            setShowing(false);
            this.callback.onMenuClick(menuItem);
        }

        public void setShowing(final boolean z) {
            if (this.showing == z) {
                return;
            }
            this.showing = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(z ? this.openInterpolator : CubicBezierInterpolator.EASE_OUT_QUINT);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$setShowing$4(z, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$setShowing$5(z, valueAnimator);
                }
            });
            AnimatorSet animatorSet = this.openAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.openAnimator = animatorSet2;
            animatorSet2.setDuration(z ? 190L : 150L);
            this.openAnimator.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            this.openAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        return;
                    }
                    Layout.this.setVisibility(4);
                    Layout.this.onHideFinish();
                }
            });
            this.openAnimator.start();
        }

        public void lambda$setShowing$4(boolean z, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (!z) {
                fFloatValue = 1.0f - fFloatValue;
            }
            float fClamp = MathUtils.clamp(fFloatValue, 0.0f, 1.0f);
            float f = (0.3f * fFloatValue) + 0.7f;
            this.container.setScaleX(f);
            this.container.setScaleY(f);
            this.container.setAlpha(fClamp);
            float f2 = 1.0f - fFloatValue;
            this.avatarView.setTranslationY(AndroidUtilities.dp(40.0f) * f2);
            this.menu.setTranslationY((-AndroidUtilities.dp(70.0f)) * f2);
            float f3 = (fFloatValue * 0.05f) + 0.95f;
            this.menu.setScaleX(f3);
            this.menu.setScaleY(f3);
        }

        public void lambda$setShowing$5(boolean z, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (!z) {
                fFloatValue = 1.0f - fFloatValue;
            }
            this.blurView.setAlpha(fFloatValue);
            invalidate();
        }

        public void recycle() {
            this.recycled = true;
            recycleInfoLoadTask();
        }

        private void recycleInfoLoadTask() {
            InfoLoadTask infoLoadTask = this.infoLoadTask;
            if (infoLoadTask != null) {
                infoLoadTask.cancel();
                this.infoLoadTask = null;
            }
        }
    }

    static class AvatarView extends FrameLayout {
        private BackupImageView backupImageView;
        private ValueAnimator progressHideAnimator;
        private ValueAnimator progressShowAnimator;
        private final RadialProgress2 radialProgress;
        private final int radialProgressSize;
        private boolean showProgress;

        public AvatarView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.radialProgressSize = AndroidUtilities.dp(64.0f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.backupImageView = backupImageView;
            backupImageView.setAspectFit(true);
            this.backupImageView.setRoundRadius(AndroidUtilities.dp(12.0f));
            addView(this.backupImageView, LayoutHelper.createFrame(-1, -1.0f));
            RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
            this.radialProgress = radialProgress2;
            radialProgress2.setOverrideAlpha(0.0f);
            radialProgress2.setIcon(10, false, false);
            radialProgress2.setColors(1107296256, 1107296256, -1, -1);
        }

        public void setImage(int i, ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, BitmapDrawable bitmapDrawable, Object obj) {
            this.backupImageView.getImageReceiver().setCurrentAccount(i);
            this.backupImageView.getImageReceiver().setImage(imageLocation, str, imageLocation2, str2, imageLocation3, str3, bitmapDrawable, 0L, null, obj, 1);
            this.backupImageView.onNewImageSet();
        }

        public void setProgress(float f) {
            this.radialProgress.setProgress(f, true);
        }

        public boolean getShowProgress() {
            return this.showProgress;
        }

        public void setShowProgress(boolean z) {
            this.showProgress = z;
            invalidate();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            RadialProgress2 radialProgress2 = this.radialProgress;
            int i5 = this.radialProgressSize;
            radialProgress2.setProgressRect(width - i5, height - i5, width + i5, height + i5);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.showProgress) {
                Drawable drawable = this.backupImageView.getImageReceiver().getDrawable();
                if ((drawable instanceof AnimatedFileDrawable) && ((AnimatedFileDrawable) drawable).getDurationMs() > 0) {
                    ValueAnimator valueAnimator = this.progressShowAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        if (this.radialProgress.getProgress() < 1.0f) {
                            this.radialProgress.setProgress(1.0f, true);
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) this.progressShowAnimator.getAnimatedValue()).floatValue(), 0.0f);
                        this.progressHideAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                AvatarView.this.showProgress = false;
                                AvatarView.this.invalidate();
                            }
                        });
                        this.progressHideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                this.f$0.lambda$dispatchDraw$0(valueAnimator2);
                            }
                        });
                        this.progressHideAnimator.setDuration(250L);
                        this.progressHideAnimator.start();
                    } else {
                        this.showProgress = false;
                    }
                } else if (this.progressShowAnimator == null) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.progressShowAnimator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            this.f$0.lambda$dispatchDraw$1(valueAnimator2);
                        }
                    });
                    this.progressShowAnimator.setStartDelay(250L);
                    this.progressShowAnimator.setDuration(250L);
                    this.progressShowAnimator.start();
                }
                ValueAnimator valueAnimator2 = this.progressHideAnimator;
                if (valueAnimator2 != null) {
                    this.radialProgress.setOverrideAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    this.radialProgress.draw(canvas);
                    return;
                }
                ValueAnimator valueAnimator3 = this.progressShowAnimator;
                if (valueAnimator3 != null) {
                    this.radialProgress.setOverrideAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                    this.radialProgress.draw(canvas);
                }
            }
        }

        public void lambda$dispatchDraw$0(ValueAnimator valueAnimator) {
            invalidate();
        }

        public void lambda$dispatchDraw$1(ValueAnimator valueAnimator) {
            invalidate();
        }
    }
}
