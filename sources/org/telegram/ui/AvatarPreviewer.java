package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.TooltipPopup;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility;
import com.android.billingclient.api.zzct;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.wearable.zzy;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.EventBus;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0;
import com.google.firebase.crashlytics.internal.metadata.KeysMap;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0;
import com.google.firebase.events.Subscriber;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.mlkit.common.sdkinternal.zzv;
import com.google.zxing.FormatException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.FormatInformation;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.MinimalEncoder$Edge;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator$TextAlphaSpan;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichEditor;

public final class AvatarPreviewer {
    public static AvatarPreviewer INSTANCE;
    public Object layout;
    public Object view;
    public boolean visible;
    public Object windowManager;

    public final class AnonymousClass1 extends Layout {
        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, Callback callback) {
            super(context, resourcesProvider, callback);
        }
    }

    public interface Callback {
        void onMenuClick(MenuItem menuItem);
    }

    public final class ChatInfoLoadTask extends InfoLoadTask {
        @Override
        public final void load() {
            MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.argument).id, this.classGuid, false);
        }

        @Override
        public final void onReceiveNotification(Object... objArr) {
            boolean z;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.argument).id && (z = this.loading)) {
                if (z) {
                    this.loading = false;
                    this.notificationCenter.removeObserver(this.observer, this.notificationId);
                }
                this.onResult.accept(chatFull);
            }
        }
    }

    public abstract class InfoLoadTask {
        public final TLObject argument;
        public final int classGuid;
        public boolean loading;
        public final int notificationId;
        public AvatarPreviewer$Layout$$ExternalSyntheticLambda2 onResult;
        public final AnonymousClass1 observer = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i, int i2, Object... objArr) {
                InfoLoadTask infoLoadTask = InfoLoadTask.this;
                if (infoLoadTask.loading && i == infoLoadTask.notificationId) {
                    infoLoadTask.onReceiveNotification(objArr);
                }
            }
        };
        public final NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);

        public InfoLoadTask(int i, TLObject tLObject, int i2) {
            this.argument = tLObject;
            this.classGuid = i;
            this.notificationId = i2;
        }

        public abstract void load();

        public abstract void onReceiveNotification(Object... objArr);
    }

    public abstract class Layout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        public static final int $r8$clinit = 0;
        public final ThemePreviewActivity.AnonymousClass13 avatarView;
        public final View blurView;
        public final Callback callback;
        public final ChatActivity.AnonymousClass60 container;
        public final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
        public InfoLoadTask infoLoadTask;
        public final ActionBarPopupWindow.ActionBarPopupWindowLayout menu;
        public MenuItem[] menuItems;
        public AnimatorSet openAnimator;
        public final OvershootInterpolator openInterpolator;
        public boolean preparingBlur;
        public boolean recycled;
        public final Theme.ResourcesProvider resourcesProvider;
        public boolean showing;
        public String videoFileName;

        public Layout(Context context, Theme.ResourcesProvider resourcesProvider, Callback callback) {
            super(context);
            this.openInterpolator = new OvershootInterpolator(1.02f);
            BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
            this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
            new Matrix();
            this.callback = callback;
            this.resourcesProvider = resourcesProvider;
            ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this);
            View view = new View(context);
            this.blurView = view;
            view.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38((AnonymousClass1) this, 9));
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
            ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60((AnonymousClass1) this, context, 3);
            this.container = anonymousClass60;
            addView(anonymousClass60, LayoutHelper.createFrame(-1.0f, -1));
            ThemePreviewActivity.AnonymousClass13 anonymousClass13 = new ThemePreviewActivity.AnonymousClass13(context, resourcesProvider);
            this.avatarView = anonymousClass13;
            float fDp = AndroidUtilities.dp(12.0f);
            RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
            anonymousClass13.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
            anonymousClass13.setElevation(AndroidUtilities.dp(4.0f));
            anonymousClass13.setClipToOutline(true);
            anonymousClass60.addView(anonymousClass13, LayoutHelper.createFrame(0, 0, 1));
            if (Build.VERSION.SDK_INT >= 28) {
                anonymousClass13.setOutlineSpotShadowColor(Integer.MIN_VALUE);
                anonymousClass13.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, resourcesProvider);
            this.menu = actionBarPopupWindowLayout;
            BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceBitmap);
            blurredBackgroundDrawableSource.setColorProvider(null);
            viewPositionWatcher.subscribe(actionBarPopupWindowLayout, this, new RateCallLayout$$ExternalSyntheticLambda1(22, blurredBackgroundDrawableSource, actionBarPopupWindowLayout), false);
            blurredBackgroundDrawableSource.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider));
            blurredBackgroundDrawableSource.setPadding(AndroidUtilities.dp(8.0f));
            blurredBackgroundDrawableSource.boundProps.hasPadding = true;
            blurredBackgroundDrawableSource.setRadius(AndroidUtilities.dp(12.0f));
            actionBarPopupWindowLayout.setBackground(blurredBackgroundDrawableSource);
            anonymousClass60.addView(actionBarPopupWindowLayout, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            ThemePreviewActivity.AnonymousClass13 anonymousClass13 = this.avatarView;
            if (!anonymousClass13.val$drawShadow || TextUtils.isEmpty(this.videoFileName)) {
                return;
            }
            if (i == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.videoFileName)) {
                    ((RadialProgress2) anonymousClass13.gradientPaint).setProgress(1.0f, true);
                }
            } else if (i == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.videoFileName)) {
                ((RadialProgress2) anonymousClass13.gradientPaint).setProgress(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
            }
        }

        @Override
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 111) {
                return super.dispatchKeyEvent(keyEvent);
            }
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
            if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
                return super.dispatchKeyEvent(keyEvent);
            }
            setShowing$1(false);
            return true;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            if (i != 0 && i2 != 0 && this.showing) {
                this.blurView.setBackground(null);
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda3(this, 11));
            }
            Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this);
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.menu;
            if (actionBarPopupWindowLayout != null) {
                actionBarPopupWindowLayout.invalidate();
            }
        }

        public final void setData(Data data) {
            this.menuItems = data.menuItems;
            boolean z = data.videoLocation != null;
            ThemePreviewActivity.AnonymousClass13 anonymousClass13 = this.avatarView;
            anonymousClass13.val$drawShadow = z;
            anonymousClass13.invalidate();
            this.videoFileName = data.videoFileName;
            InfoLoadTask infoLoadTask = this.infoLoadTask;
            if (infoLoadTask != null) {
                if (infoLoadTask.loading) {
                    infoLoadTask.loading = false;
                    infoLoadTask.notificationCenter.removeObserver(infoLoadTask.observer, infoLoadTask.notificationId);
                }
                this.infoLoadTask = null;
            }
            InfoLoadTask infoLoadTask2 = data.infoLoadTask;
            if (infoLoadTask2 != null) {
                this.infoLoadTask = infoLoadTask2;
                AvatarPreviewer$Layout$$ExternalSyntheticLambda2 avatarPreviewer$Layout$$ExternalSyntheticLambda2 = new AvatarPreviewer$Layout$$ExternalSyntheticLambda2(0, this, data);
                if (!infoLoadTask2.loading) {
                    infoLoadTask2.loading = true;
                    infoLoadTask2.onResult = avatarPreviewer$Layout$$ExternalSyntheticLambda2;
                    infoLoadTask2.notificationCenter.addObserver(infoLoadTask2.observer, infoLoadTask2.notificationId);
                    infoLoadTask2.load();
                }
            }
            int i = UserConfig.selectedAccount;
            BackupImageView backupImageView = (BackupImageView) anonymousClass13.gradient;
            backupImageView.getImageReceiver().setCurrentAccount(i);
            backupImageView.getImageReceiver().setImage(data.videoLocation, data.videoFilter, data.imageLocation, null, data.thumbImageLocation, data.thumbImageFilter, data.thumb, 0L, null, data.parentObject, 1);
            backupImageView.onNewImageSet();
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.menu;
            actionBarPopupWindowLayout.linearLayout.removeAllViews();
            int i2 = 0;
            while (true) {
                MenuItem[] menuItemArr = this.menuItems;
                if (i2 >= menuItemArr.length) {
                    setShowing$1(true);
                    return;
                }
                MenuItem menuItem = menuItemArr[i2];
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
                ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(i2 == 0, i2 == this.menuItems.length - 1, actionBarPopupWindowLayout2, menuItem.iconResId, LocaleController.getString(menuItem.labelKey, menuItem.labelResId), false, this.resourcesProvider);
                actionBarMenuSubItemAddItem.setTag(Integer.valueOf(i2));
                actionBarMenuSubItemAddItem.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(11, this, menuItem));
                i2++;
                actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            }
        }

        public final void setShowing$1(final boolean z) {
            final int i = 1;
            final int i2 = 0;
            if (this.showing == z) {
                return;
            }
            this.showing = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(z ? this.openInterpolator : CubicBezierInterpolator.EASE_OUT_QUINT);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AvatarPreviewer.Layout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            AvatarPreviewer.Layout layout = this.f$0;
                            layout.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (!z) {
                                fFloatValue = 1.0f - fFloatValue;
                            }
                            float fClamp = MathUtils.clamp(fFloatValue, 0.0f, 1.0f);
                            float f = (0.3f * fFloatValue) + 0.7f;
                            ChatActivity.AnonymousClass60 anonymousClass60 = layout.container;
                            anonymousClass60.setScaleX(f);
                            anonymousClass60.setScaleY(f);
                            anonymousClass60.setAlpha(fClamp);
                            float f2 = 1.0f - fFloatValue;
                            layout.avatarView.setTranslationY(AndroidUtilities.dp(40.0f) * f2);
                            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = layout.menu;
                            actionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f2);
                            float f3 = (fFloatValue * 0.05f) + 0.95f;
                            actionBarPopupWindowLayout.setScaleX(f3);
                            actionBarPopupWindowLayout.setScaleY(f3);
                            break;
                        default:
                            AvatarPreviewer.Layout layout2 = this.f$0;
                            layout2.getClass();
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (!z) {
                                fFloatValue2 = 1.0f - fFloatValue2;
                            }
                            layout2.blurView.setAlpha(fFloatValue2);
                            layout2.invalidate();
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final AvatarPreviewer.Layout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            AvatarPreviewer.Layout layout = this.f$0;
                            layout.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (!z) {
                                fFloatValue = 1.0f - fFloatValue;
                            }
                            float fClamp = MathUtils.clamp(fFloatValue, 0.0f, 1.0f);
                            float f = (0.3f * fFloatValue) + 0.7f;
                            ChatActivity.AnonymousClass60 anonymousClass60 = layout.container;
                            anonymousClass60.setScaleX(f);
                            anonymousClass60.setScaleY(f);
                            anonymousClass60.setAlpha(fClamp);
                            float f2 = 1.0f - fFloatValue;
                            layout.avatarView.setTranslationY(AndroidUtilities.dp(40.0f) * f2);
                            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = layout.menu;
                            actionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f2);
                            float f3 = (fFloatValue * 0.05f) + 0.95f;
                            actionBarPopupWindowLayout.setScaleX(f3);
                            actionBarPopupWindowLayout.setScaleY(f3);
                            break;
                        default:
                            AvatarPreviewer.Layout layout2 = this.f$0;
                            layout2.getClass();
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (!z) {
                                fFloatValue2 = 1.0f - fFloatValue2;
                            }
                            layout2.blurView.setAlpha(fFloatValue2);
                            layout2.invalidate();
                            break;
                    }
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
            this.openAnimator.addListener(new ChatActivity.AnonymousClass77(4, this, z));
            this.openAnimator.start();
        }
    }

    public final class MenuItem {
        public static final MenuItem[] $VALUES;
        public static final MenuItem MENTION;
        public static final MenuItem OPEN_CHANNEL;
        public static final MenuItem OPEN_GROUP;
        public static final MenuItem OPEN_PROFILE;
        public static final MenuItem SEARCH_MESSAGES;
        public static final MenuItem SEND_MESSAGE;
        public final int iconResId;
        public final String labelKey;
        public final int labelResId;

        static {
            MenuItem menuItem = new MenuItem(0, R.string.OpenProfile, R.drawable.msg_openprofile, "OPEN_PROFILE", "OpenProfile");
            OPEN_PROFILE = menuItem;
            MenuItem menuItem2 = new MenuItem(1, R.string.OpenChannel2, R.drawable.msg_channel, "OPEN_CHANNEL", "OpenChannel2");
            OPEN_CHANNEL = menuItem2;
            int i = R.string.OpenGroup2;
            int i2 = R.drawable.msg_discussion;
            MenuItem menuItem3 = new MenuItem(2, i, i2, "OPEN_GROUP", "OpenGroup2");
            OPEN_GROUP = menuItem3;
            MenuItem menuItem4 = new MenuItem(3, R.string.SendMessage, i2, "SEND_MESSAGE", "SendMessage");
            SEND_MESSAGE = menuItem4;
            MenuItem menuItem5 = new MenuItem(4, R.string.Mention, R.drawable.msg_mention, "MENTION", "Mention");
            MENTION = menuItem5;
            MenuItem menuItem6 = new MenuItem(5, R.string.AvatarPreviewSearchMessages, R.drawable.msg_search, "SEARCH_MESSAGES", "AvatarPreviewSearchMessages");
            SEARCH_MESSAGES = menuItem6;
            $VALUES = new MenuItem[]{menuItem, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6};
        }

        public MenuItem(int i, int i2, int i3, String str, String str2) {
            super(str, i);
            this.labelKey = str2;
            this.labelResId = i2;
            this.iconResId = i3;
        }

        public static MenuItem valueOf(String str) {
            return (MenuItem) Enum.valueOf(MenuItem.class, str);
        }

        public static MenuItem[] values() {
            return (MenuItem[]) $VALUES.clone();
        }
    }

    public final class UserInfoLoadTask extends InfoLoadTask {
        @Override
        public final void load() {
            MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.argument, false, this.classGuid);
        }

        @Override
        public final void onReceiveNotification(Object... objArr) {
            if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.argument).id) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                boolean z = this.loading;
                if (z) {
                    if (z) {
                        this.loading = false;
                        this.notificationCenter.removeObserver(this.observer, this.notificationId);
                    }
                    this.onResult.accept(userFull);
                }
            }
        }
    }

    public AvatarPreviewer(View view) {
        EllipsizeSpanAnimator$TextAlphaSpan[] ellipsizeSpanAnimator$TextAlphaSpanArr = {new EllipsizeSpanAnimator$TextAlphaSpan(), new EllipsizeSpanAnimator$TextAlphaSpan(), new EllipsizeSpanAnimator$TextAlphaSpan()};
        this.view = ellipsizeSpanAnimator$TextAlphaSpanArr;
        this.layout = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.windowManager = animatorSet;
        animatorSet.playTogether(createEllipsizeAnimator(ellipsizeSpanAnimator$TextAlphaSpanArr[0], 0, 255, 0, 300), createEllipsizeAnimator(ellipsizeSpanAnimator$TextAlphaSpanArr[1], 0, 255, 150, 300), createEllipsizeAnimator(ellipsizeSpanAnimator$TextAlphaSpanArr[2], 0, 255, 300, 300), createEllipsizeAnimator(ellipsizeSpanAnimator$TextAlphaSpanArr[0], 255, 0, 1000, 400), createEllipsizeAnimator(ellipsizeSpanAnimator$TextAlphaSpanArr[1], 255, 0, 1000, 400), createEllipsizeAnimator(ellipsizeSpanAnimator$TextAlphaSpanArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new EmojiView.AnonymousClass35(this, view));
    }

    public static void addEdge(MinimalEncoder$Edge[][][] minimalEncoder$EdgeArr, int i, MinimalEncoder$Edge minimalEncoder$Edge) {
        MinimalEncoder$Edge[] minimalEncoder$EdgeArr2 = minimalEncoder$EdgeArr[i + minimalEncoder$Edge.characterLength][minimalEncoder$Edge.charsetEncoderIndex];
        Mode mode = minimalEncoder$Edge.mode;
        int iOrdinal = mode.ordinal();
        char c = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c = 1;
            } else if (iOrdinal == 4) {
                c = 3;
            } else {
                if (iOrdinal != 6) {
                    throw new IllegalStateException("Illegal mode " + mode);
                }
                c = 0;
            }
        }
        MinimalEncoder$Edge minimalEncoder$Edge2 = minimalEncoder$EdgeArr2[c];
        if (minimalEncoder$Edge2 != null) {
            if (minimalEncoder$Edge2.cachedTotalSize <= minimalEncoder$Edge.cachedTotalSize) {
                return;
            }
        }
        minimalEncoder$EdgeArr2[c] = minimalEncoder$Edge;
    }

    public static boolean canEncode(Mode mode, char c) {
        int i;
        int iOrdinal = mode.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if (c < '`') {
                    i = Encoder.ALPHANUMERIC_TABLE[c];
                } else {
                    int[] iArr = Encoder.ALPHANUMERIC_TABLE;
                    i = -1;
                }
                if (i == -1) {
                    return false;
                }
            } else if (iOrdinal != 4) {
                if (iOrdinal != 6) {
                    return false;
                }
                return Encoder.isOnlyDoubleByteKanji(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static AvatarPreviewer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AvatarPreviewer();
        }
        return INSTANCE;
    }

    public static Version getVersion(int i) {
        int iOrdinal = PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility.ordinal(i);
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? Version.getVersionForNumber(40) : Version.getVersionForNumber(26);
        }
        return Version.getVersionForNumber(9);
    }

    public void addEdges(Version version, MinimalEncoder$Edge[][][] minimalEncoder$EdgeArr, int i, MinimalEncoder$Edge minimalEncoder$Edge) {
        int i2;
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) this.windowManager;
        int length = eCIEncoderSet.encoders.length;
        String str = (String) this.view;
        CharsetEncoder[] charsetEncoderArr = eCIEncoderSet.encoders;
        int i3 = eCIEncoderSet.priorityEncoderIndex;
        if (i3 >= 0) {
            char cCharAt = str.charAt(i);
            if (charsetEncoderArr[i3].canEncode("" + cCharAt)) {
                length = i3 + 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            char cCharAt2 = str.charAt(i);
            if (charsetEncoderArr[i5].canEncode("" + cCharAt2)) {
                addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, Mode.BYTE, i, i5, 1, minimalEncoder$Edge, version));
            }
        }
        Mode mode = Mode.KANJI;
        if (canEncode(mode, str.charAt(i))) {
            addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, mode, i, 0, 1, minimalEncoder$Edge, version));
        }
        int length2 = str.length();
        Mode mode2 = Mode.ALPHANUMERIC;
        if (canEncode(mode2, str.charAt(i))) {
            int i6 = i + 1;
            addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, mode2, i, 0, (i6 >= length2 || !canEncode(mode2, str.charAt(i6))) ? 1 : 2, minimalEncoder$Edge, version));
        }
        Mode mode3 = Mode.NUMERIC;
        if (canEncode(mode3, str.charAt(i))) {
            int i7 = i + 1;
            if (i7 >= length2 || !canEncode(mode3, str.charAt(i7))) {
                i2 = 1;
            } else {
                int i8 = i + 2;
                i2 = (i8 >= length2 || !canEncode(mode3, str.charAt(i8))) ? 2 : 3;
            }
            addEdge(minimalEncoder$EdgeArr, i, new MinimalEncoder$Edge(this, mode3, i, 0, i2, minimalEncoder$Edge, version));
        }
    }

    public void addView(View view) {
        ArrayList arrayList = (ArrayList) this.layout;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.windowManager).start();
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    public boolean canBeSpatialized(Format format, AudioAttributes audioAttributes) {
        boolean zEquals = "audio/eac3-joc".equals(format.sampleMimeType);
        int i = format.channelCount;
        if (zEquals && i == 16) {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Util.getAudioTrackChannelConfig(i));
        int i2 = format.sampleRate;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = (Spatializer) this.view;
        if (audioAttributes.audioAttributesV21 == null) {
            audioAttributes.audioAttributesV21 = new zzct(audioAttributes);
        }
        return spatializer.canBeSpatialized((android.media.AudioAttributes) audioAttributes.audioAttributesV21.zza, channelMask.build());
    }

    public int copyBit(int i, int i2, int i3) {
        boolean z = this.visible;
        BitMatrix bitMatrix = (BitMatrix) this.view;
        return z ? bitMatrix.get(i2, i) : bitMatrix.get(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public ValueAnimator createEllipsizeAnimator(EllipsizeSpanAnimator$TextAlphaSpan ellipsizeSpanAnimator$TextAlphaSpan, int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(12, this, ellipsizeSpanAnimator$TextAlphaSpan));
        valueAnimatorOfInt.setDuration(i4);
        valueAnimatorOfInt.setStartDelay(i3);
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
        return valueAnimatorOfInt;
    }

    public Result encodeSpecificVersion(Version version) throws WriterException {
        CharsetEncoder[] charsetEncoderArr;
        int i;
        String str = (String) this.view;
        int length = str.length();
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) this.windowManager;
        int i2 = 1;
        MinimalEncoder$Edge[][][] minimalEncoder$EdgeArr = (MinimalEncoder$Edge[][][]) Array.newInstance((Class<?>) MinimalEncoder$Edge.class, length + 1, eCIEncoderSet.encoders.length, 4);
        addEdges(version, minimalEncoder$EdgeArr, 0, null);
        while (true) {
            charsetEncoderArr = eCIEncoderSet.encoders;
            if (i2 > length) {
                break;
            }
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    MinimalEncoder$Edge minimalEncoder$Edge = minimalEncoder$EdgeArr[i2][i3][i4];
                    if (minimalEncoder$Edge != null && i2 < length) {
                        addEdges(version, minimalEncoder$EdgeArr, i2, minimalEncoder$Edge);
                    }
                }
            }
            i2++;
        }
        int i5 = -1;
        int i6 = -1;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                MinimalEncoder$Edge minimalEncoder$Edge2 = minimalEncoder$EdgeArr[length][i8][i9];
                if (minimalEncoder$Edge2 != null && (i = minimalEncoder$Edge2.cachedTotalSize) < i7) {
                    i5 = i8;
                    i6 = i9;
                    i7 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new Result(this, version, minimalEncoder$EdgeArr[length][i5][i6]);
        }
        throw new WriterException(SurfaceContainer$$ExternalSyntheticOutline0.m("Internal error: failed to encode \"", str, "\""));
    }

    public synchronized void initialize() {
        try {
            if (this.visible) {
                return;
            }
            Boolean enabled = readEnabled();
            this.windowManager = enabled;
            if (enabled == null) {
                ((EventBus) ((Subscriber) this.view)).subscribe(new CrashlyticsCore$$ExternalSyntheticLambda0(14));
            }
            this.visible = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean isEnabled() {
        Boolean bool;
        try {
            initialize();
            bool = (Boolean) this.windowManager;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.layout).firebaseApp.isDataCollectionDefaultEnabled();
    }

    public Boolean readEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        FirebaseApp firebaseApp = ((FirebaseMessaging) this.layout).firebaseApp;
        firebaseApp.checkNotDeleted();
        Context context = firebaseApp.applicationContext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public FormatInformation readFormatInformation() {
        FormatInformation formatInformation = (FormatInformation) this.layout;
        if (formatInformation != null) {
            return formatInformation;
        }
        int iCopyBit = 0;
        int iCopyBit2 = 0;
        for (int i = 0; i < 6; i++) {
            iCopyBit2 = copyBit(i, 8, iCopyBit2);
        }
        int iCopyBit3 = copyBit(8, 7, copyBit(8, 8, copyBit(7, 8, iCopyBit2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iCopyBit3 = copyBit(8, i2, iCopyBit3);
        }
        int i3 = ((BitMatrix) this.view).height;
        int i4 = i3 - 7;
        for (int i5 = i3 - 1; i5 >= i4; i5--) {
            iCopyBit = copyBit(8, i5, iCopyBit);
        }
        for (int i6 = i3 - 8; i6 < i3; i6++) {
            iCopyBit = copyBit(i6, 8, iCopyBit);
        }
        FormatInformation formatInformationDoDecodeFormatInformation = FormatInformation.doDecodeFormatInformation(iCopyBit3, iCopyBit);
        if (formatInformationDoDecodeFormatInformation == null) {
            formatInformationDoDecodeFormatInformation = FormatInformation.doDecodeFormatInformation(iCopyBit3 ^ 21522, iCopyBit ^ 21522);
        }
        this.layout = formatInformationDoDecodeFormatInformation;
        if (formatInformationDoDecodeFormatInformation != null) {
            return formatInformationDoDecodeFormatInformation;
        }
        throw FormatException.getFormatInstance();
    }

    public Version readVersion() {
        Version version = (Version) this.windowManager;
        if (version != null) {
            return version;
        }
        int i = ((BitMatrix) this.view).height;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return Version.getVersionForNumber(i2);
        }
        int i3 = i - 11;
        int iCopyBit = 0;
        int iCopyBit2 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i - 9; i5 >= i3; i5--) {
                iCopyBit2 = copyBit(i5, i4, iCopyBit2);
            }
        }
        Version versionDecodeVersionInformation = Version.decodeVersionInformation(iCopyBit2);
        if (versionDecodeVersionInformation != null && (versionDecodeVersionInformation.versionNumber * 4) + 17 == i) {
            this.windowManager = versionDecodeVersionInformation;
            return versionDecodeVersionInformation;
        }
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                iCopyBit = copyBit(i6, i7, iCopyBit);
            }
        }
        Version versionDecodeVersionInformation2 = Version.decodeVersionInformation(iCopyBit);
        if (versionDecodeVersionInformation2 == null || (versionDecodeVersionInformation2.versionNumber * 4) + 17 != i) {
            throw FormatException.getFormatInstance();
        }
        this.windowManager = versionDecodeVersionInformation2;
        return versionDecodeVersionInformation2;
    }

    public void remask() {
        if (((FormatInformation) this.layout) == null) {
            return;
        }
        int i = PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility.values(8)[((FormatInformation) this.layout).dataMask];
        BitMatrix bitMatrix = (BitMatrix) this.view;
        int i2 = bitMatrix.height;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (ArticleViewer.IBlock.CC._dispatch_isMasked(i, i3, i4)) {
                    bitMatrix.flip(i4, i3);
                }
            }
        }
    }

    public void removeView(View view) {
        ArrayList arrayList = (ArrayList) this.layout;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.windowManager).cancel();
        }
    }

    public boolean setKey(String str, String str2) {
        synchronized (this) {
            try {
                if (!((KeysMap) ((AtomicMarkableReference) this.view).getReference()).setKey(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.view;
                atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                UserMetadata$$ExternalSyntheticLambda0 userMetadata$$ExternalSyntheticLambda0 = new UserMetadata$$ExternalSyntheticLambda0(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.windowManager;
                while (!atomicReference.compareAndSet(null, userMetadata$$ExternalSyntheticLambda0)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((Parser) ((TooltipPopup) this.layout).mContentView).submit(userMetadata$$ExternalSyntheticLambda0);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void show(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, Data data, Callback callback) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.view) != viewGroup) {
            if (this.visible) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) this.layout;
                int i = Layout.$r8$clinit;
                anonymousClass1.setShowing$1(false);
            }
            this.view = viewGroup;
            this.windowManager = (WindowManager) ContextCompat.getSystemService(context, WindowManager.class);
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(context, resourcesProvider, callback);
            this.layout = anonymousClass2;
            WindowVisibilityManager$$ExternalSyntheticLambda0 windowVisibilityManager$$ExternalSyntheticLambda0 = new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 17);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass2, windowVisibilityManager$$ExternalSyntheticLambda0);
        }
        ((AnonymousClass1) this.layout).setData(data);
        if (this.visible) {
            return;
        }
        if (((AnonymousClass1) this.layout).getParent() != null) {
            ((WindowManager) this.windowManager).removeView((AnonymousClass1) this.layout);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.windowManager, (AnonymousClass1) this.layout, layoutParams);
        ((WindowManager) this.windowManager).addView((AnonymousClass1) this.layout, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.visible = true;
    }

    public void submit(Runnable runnable, Executor executor) {
        synchronized (this.view) {
            try {
                if (this.visible) {
                    ((ArrayDeque) this.windowManager).add(new zzv(runnable, executor));
                } else {
                    this.visible = true;
                    zzd(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void wrap(SpannableString spannableString, int i) {
        EllipsizeSpanAnimator$TextAlphaSpan[] ellipsizeSpanAnimator$TextAlphaSpanArr = (EllipsizeSpanAnimator$TextAlphaSpan[]) this.view;
        int i2 = i + 1;
        spannableString.setSpan(ellipsizeSpanAnimator$TextAlphaSpanArr[0], i, i2, 0);
        int i3 = i + 2;
        spannableString.setSpan(ellipsizeSpanAnimator$TextAlphaSpanArr[1], i2, i3, 0);
        spannableString.setSpan(ellipsizeSpanAnimator$TextAlphaSpanArr[2], i3, i + 3, 0);
    }

    public void zzc() {
        synchronized (this.view) {
            try {
                if (((ArrayDeque) this.windowManager).isEmpty()) {
                    this.visible = false;
                    return;
                }
                zzv zzvVar = (zzv) ((ArrayDeque) this.windowManager).remove();
                zzd(zzvVar.zzb, zzvVar.zza);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzd(Runnable runnable, Executor executor) {
        try {
            executor.execute(new zzy(this, runnable, false, 6));
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    public final class Data {
        public final ImageLocation imageLocation;
        public final InfoLoadTask infoLoadTask;
        public final MenuItem[] menuItems;
        public final Object parentObject;
        public final BitmapDrawable thumb;
        public final String thumbImageFilter;
        public final ImageLocation thumbImageLocation;
        public final String videoFileName;
        public final String videoFilter;
        public final ImageLocation videoLocation;

        public Data(ImageLocation imageLocation, ImageLocation imageLocation2, ImageLocation imageLocation3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, MenuItem[] menuItemArr, InfoLoadTask infoLoadTask) {
            this.imageLocation = imageLocation;
            this.thumbImageLocation = imageLocation2;
            this.videoLocation = imageLocation3;
            this.thumbImageFilter = str;
            this.videoFilter = str2;
            this.videoFileName = str3;
            this.thumb = bitmapDrawable;
            this.parentObject = obj;
            this.menuItems = menuItemArr;
            this.infoLoadTask = infoLoadTask;
        }

        public static Data of(TLRPC.User user, int i, MenuItem... menuItemArr) {
            TLRPC.UserProfilePhoto userProfilePhoto;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(user, 0);
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user, 1);
            BitmapDrawable bitmapDrawable = null;
            String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
            if (user != null && (userProfilePhoto = user.photo) != null) {
                bitmapDrawable = userProfilePhoto.strippedBitmap;
            }
            return new Data(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, user, menuItemArr, new UserInfoLoadTask(i, user, NotificationCenter.userInfoDidLoad));
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
            String str = null;
            String str2 = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
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
            if (imageLocation != null && imageLocation.imageType == 2) {
                str = "g";
            }
            return new Data(imageLocation2, forUserOrChat2, imageLocation, str2, str, attachFileName, bitmapDrawable, userFull.user, menuItemArr, null);
        }

        public static Data of(TLRPC.Chat chat, TLRPC.ChatFull chatFull, MenuItem... menuItemArr) {
            ImageLocation forPhoto;
            String attachFileName;
            TLRPC.ChatPhoto chatPhoto;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            String str = null;
            String str2 = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
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
            if (forPhoto != null && forPhoto.imageType == 2) {
                str = "g";
            }
            return new Data(forUserOrChat, forUserOrChat2, forPhoto, str2, str, attachFileName, bitmapDrawable, chat, menuItemArr, null);
        }
    }

    public AvatarPreviewer(TooltipPopup tooltipPopup, boolean z) {
        this.layout = tooltipPopup;
        this.windowManager = new AtomicReference(null);
        this.visible = z;
        this.view = new AtomicMarkableReference(new KeysMap(z ? 8192 : 1024), false);
    }
}
