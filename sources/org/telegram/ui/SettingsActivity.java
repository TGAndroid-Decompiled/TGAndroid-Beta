package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzjg;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SettingsSearchCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.HintsController;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DualCameraView;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotWebViewSheet;

public class SettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate, MainTabsActivity.TabFragmentDelegate, FactorAnimator.Target {
    private static final int ANIMATOR_ID_SEARCH_PAGE_VISIBLE = 0;
    private ArrayList<Integer> accountNumbers;
    private View actionBarBackground;
    private boolean actionBarVisible;
    private ValueAnimator actionBarVisibleAnimator;
    private int additionNavigationBarHeight;
    private final BoolAnimator animatorSearchPageVisible;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private TLRPC.FileLocation avatarBig;
    private FrameLayout avatarContainer;
    private AvatarDrawable avatarDrawable;
    private RadialProgressView avatarProgressView;
    int avatarUploadingRequest;
    private BackupImageView avatarView;
    private FrameLayout cameraBackground;
    private FrameLayout cameraButton;
    private ImageView cameraImageView;
    private SizeNotifierFrameLayout contentView;
    public boolean hasMainTabs;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList<RectF> iBlur3Positions;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean ignoreClearViews;
    private ImageUpdater imageUpdater;
    private UniversalRecyclerView listView;
    private View navigationBar;
    private int navigationBarHeight;
    private ActionBarMenuItem otherItem;
    private String query;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private ProfileActivity.SearchAdapter search;
    private ActionBarMenuItem searchItem;
    private TextView subtitleView;
    private TextView titleView;
    private FrameLayout topView;
    private ImageLocation uploadingImageLocation;
    private TextView versionView;
    private int versionViewPressCount;

    public class AnonymousClass8 extends ShareAlert {
        public AnonymousClass8(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
            super(context, arrayList, str, z, str2, z2);
        }

        public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
            BulletinFactory.createInviteSentBulletin(SettingsActivity.this.getParentActivity(), SettingsActivity.this.contentView, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC.Dialog) longSparseArray.valueAt(0)).id : 0L, i, getThemedColor(Theme.key_undo_background), getThemedColor(Theme.key_undo_infoColor)).show();
        }

        @Override
        public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            if (z) {
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, longSparseArray, i, 9), 250L);
            }
        }

        @Override
        public void setLastVisible(boolean z) {
        }
    }

    public static class AccountCell extends LinearLayout implements Theme.Colorable {
        private ImageView arrowView;
        private AvatarDrawable avatarDrawable;
        private BackupImageView avatarView;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botDrawable;
        private TextView counterView;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatusDrawable;
        private final Theme.ResourcesProvider resourcesProvider;
        private SimpleTextView textView;

        public static class Factory extends UItem.UItemFactory<AccountCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, int i2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.intValue = i2;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((AccountCell) view).set(uItem.intValue);
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public AccountCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new AccountCell(context, resourcesProvider);
            }
        }

        public AccountCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(15);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            this.botDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.textView, AndroidUtilities.dp(24.0f), 7);
            this.emojiStatusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.textView, AndroidUtilities.dp(24.0f), 7);
            this.textView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                    AccountCell.this.botDrawable.attach();
                    AccountCell.this.emojiStatusDrawable.attach();
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    AccountCell.this.botDrawable.detach();
                    AccountCell.this.emojiStatusDrawable.detach();
                }
            });
            TextView textView = new TextView(context);
            this.counterView = textView;
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            this.counterView.setTextSize(1, 11.0f);
            this.counterView.setTypeface(AndroidUtilities.bold());
            this.counterView.setGravity(17);
            this.counterView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            this.counterView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
            ImageView imageView = new ImageView(context);
            this.arrowView = imageView;
            imageView.setImageResource(R.drawable.msg_arrowright);
            this.arrowView.setScaleType(ImageView.ScaleType.CENTER);
            this.arrowView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
            if (!LocaleController.isRTL) {
                this.textView.setGravity(19);
                addView(this.avatarView, LayoutHelper.createLinear(28, 28, 19, 18, 0, 18, 0));
                addView(this.textView, LayoutHelper.createLinear(0, -1, 1.0f, 119, 0, 0, 18, 0));
                addView(this.counterView, LayoutHelper.createLinear(-2, 20, 0.0f, 16, 0, 0, 0, 0));
                addView(this.arrowView, LayoutHelper.createLinear(24, 24, 0.0f, 21, 0, 0, 12, 0));
                return;
            }
            this.textView.setGravity(21);
            this.arrowView.setScaleX(-1.0f);
            addView(this.arrowView, LayoutHelper.createLinear(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(this.counterView, LayoutHelper.createLinear(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(this.textView, LayoutHelper.createLinear(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(this.avatarView, LayoutHelper.createLinear(28, 28, 21, 18, 0, 18, 0));
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void set(int i) {
            TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
            this.avatarDrawable.setInfo(i, currentUser);
            this.avatarView.getImageReceiver().setCurrentAccount(i);
            this.avatarView.setForUserOrChat(currentUser, this.avatarDrawable);
            this.textView.setText(UserObject.getUserName(currentUser));
            this.botDrawable.setCurrentAccount(i);
            this.emojiStatusDrawable.setCurrentAccount(i);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botDrawable;
            int i2 = Theme.key_profile_verifiedBackground;
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.getColor(i2, this.resourcesProvider)));
            if (currentUser != null) {
                long j = currentUser.bot_verification_icon;
                if (j != 0) {
                    this.botDrawable.set(j, false);
                } else {
                    this.botDrawable.set((Drawable) null, false);
                }
            } else {
                this.botDrawable.set((Drawable) null, false);
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
            this.emojiStatusDrawable.setColor(Integer.valueOf(Theme.getColor(i2, this.resourcesProvider)));
            if (emojiStatusDocumentId != null) {
                this.emojiStatusDrawable.set(emojiStatusDocumentId.longValue(), false);
            } else if (currentUser == null || !currentUser.premium) {
                this.emojiStatusDrawable.set((Drawable) null, false);
            } else {
                this.emojiStatusDrawable.set(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
            }
            this.textView.setLeftDrawable(!this.botDrawable.isEmpty() ? this.botDrawable : null);
            this.textView.setRightDrawable(this.emojiStatusDrawable.isEmpty() ? null : this.emojiStatusDrawable);
            int mainUnreadCount = MessagesStorage.getInstance(i).getMainUnreadCount();
            this.counterView.setVisibility(mainUnreadCount <= 0 ? 8 : 0);
            this.counterView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
        }

        @Override
        public void updateColors() {
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.counterView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
            this.arrowView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.emojiStatusDrawable.setColor(Integer.valueOf(Theme.getColor(Theme.key_profile_verifiedBackground, this.resourcesProvider)));
        }
    }

    public static class SettingCell extends LinearLayout implements Theme.Colorable {
        private final Background iconBackground;
        private final FrameLayout iconLayout;
        private final ImageView iconView;
        private final boolean mini;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleView;
        private final LinearLayout textLayout;
        private final TextView titleView;
        private boolean twoLines;
        private final TextView valueView;

        public static class Background extends Drawable {
            private boolean border;
            private LinearGradient gradient;
            private final Matrix matrix;
            private final Paint paint = new Paint(1);
            private LinearGradient strokeGradient;
            private final Paint strokePaint;

            public Background() {
                Paint paint = new Paint(1);
                this.strokePaint = paint;
                this.matrix = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                this.strokeGradient = linearGradient;
                paint.setShader(linearGradient);
            }

            @Override
            public void draw(Canvas canvas) {
                float fDp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                this.matrix.reset();
                this.matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, fDp, fDp, this.paint);
                if (this.border) {
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    this.strokePaint.setStrokeWidth(fDp2);
                    this.matrix.reset();
                    this.matrix.postTranslate(rectF.left, rectF.top);
                    float f = fDp2 / 2.0f;
                    rectF.inset(f, f);
                    canvas.drawRoundRect(rectF, fDp, fDp, this.strokePaint);
                }
            }

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            public void setColor(int i, int i2) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.gradient = linearGradient;
                this.paint.setShader(linearGradient);
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            public void setDrawBorder(boolean z) {
                this.border = z;
            }
        }

        public static class Factory extends UItem.UItemFactory<SettingCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, int i2, int i3, int i4, CharSequence charSequence) {
                return of(i, i2, i3, i4, charSequence, null, null);
            }

            public static UItem ofBot(TLRPC.TL_attachMenuBot tL_attachMenuBot, int i, int i2, int i3) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                long j = tL_attachMenuBot.bot_id;
                uItemOfFactory.id = (int) (j ^ (j >>> 32));
                uItemOfFactory.object = tL_attachMenuBot;
                uItemOfFactory.iconResId = i3;
                uItemOfFactory.text = tL_attachMenuBot.short_name;
                uItemOfFactory.longValue = (((long) i) & 4294967295L) | (((long) i2) << 32);
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                long j = uItem.longValue;
                ((SettingCell) view).set((int) j, (int) (j >>> 32), uItem.iconResId, uItem.text, uItem.subtext, uItem.textValue);
            }

            public static UItem of(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2) {
                return of(i, i2, i3, i4, charSequence, charSequence2, null);
            }

            @Override
            public SettingCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new SettingCell(context, resourcesProvider);
            }

            public static UItem of(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.iconResId = i4;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                uItemOfFactory.textValue = charSequence3;
                uItemOfFactory.longValue = (((long) i2) & 4294967295L) | (((long) i3) << 32);
                return uItemOfFactory;
            }
        }

        public SettingCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, resourcesProvider, false);
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public void onMeasure(int i, int i2) {
            float f;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            if (this.mini) {
                f = 44.0f;
            } else {
                f = this.twoLines ? 60.0f : 50.0f;
            }
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f), 1073741824));
        }

        public void set(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.iconLayout.setVisibility(i3 != 0 ? 0 : 8);
            this.titleView.setTranslationX(i3 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
            this.subtitleView.setTranslationX(i3 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
            this.iconBackground.setColor(i, i2);
            this.iconView.setImageResource(i3);
            this.titleView.setText(charSequence);
            TextView textView = this.subtitleView;
            boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
            this.twoLines = !zIsEmpty;
            textView.setVisibility(zIsEmpty ? 8 : 0);
            this.subtitleView.setText(charSequence2);
            setValue(charSequence3);
        }

        public void setValue(CharSequence charSequence) {
            this.valueView.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
            this.valueView.setText(charSequence);
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
            this.valueView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, this.resourcesProvider));
            Background background = this.iconBackground;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            background.setDrawBorder(resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark());
        }

        public SettingCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.mini = z;
            setOrientation(0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.iconLayout = frameLayout;
            Background background = new Background();
            this.iconBackground = background;
            frameLayout.setBackground(background);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f), context);
            this.subtitleView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            TextView textViewM2 = Theme.ResourcesProvider.CC.m(linearLayout, textViewM, LayoutHelper.createLinear(-1, -2, 0.0f, 4.0f, 0.0f, 0.0f), context);
            this.valueView = textViewM2;
            textViewM2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                addView(textViewM2, LayoutHelper.createLinear(-2, -2, 16, 20, 0, 0, 0));
                addView(linearLayout, LayoutHelper.createLinear(0, -2, 1.0f, 23, 20, 0, z ? 12 : 18, 0));
                addView(frameLayout, LayoutHelper.createLinear(28, 28, 21, 0, 0, z ? 9 : 18, 0));
            } else {
                addView(frameLayout, LayoutHelper.createLinear(28, 28, 19, z ? 9 : 18, 0, 0, 0));
                addView(linearLayout, LayoutHelper.createLinear(0, -2, 1.0f, 23, z ? 12 : 18, 0, 20, 0));
                addView(textViewM2, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 20, 0));
            }
            updateColors();
        }
    }

    public static class SuggestionCell extends LinearLayout implements Theme.Colorable {
        private ButtonWithCounterView no;
        private final Theme.ResourcesProvider resourcesProvider;
        private LinkSpanDrawable.LinksTextView textView;
        private LinkSpanDrawable.LinksTextView titleView;
        private ButtonWithCounterView yes;

        public static class Factory extends UItem.UItemFactory<SuggestionCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, CharSequence charSequence4, View.OnClickListener onClickListener2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                uItemOfFactory.textValue = charSequence3;
                uItemOfFactory.clickCallback = onClickListener;
                uItemOfFactory.animatedText = charSequence4;
                uItemOfFactory.clickCallback2 = onClickListener2;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((SuggestionCell) view).set(uItem.text, uItem.subtext, uItem.textValue, uItem.clickCallback, uItem.animatedText, uItem.clickCallback2);
            }

            @Override
            public boolean isClickable() {
                return false;
            }

            @Override
            public SuggestionCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new SuggestionCell(context, resourcesProvider);
            }
        }

        public SuggestionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(1);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 15.0f, i, true, resourcesProvider);
            this.titleView = linksTextViewMakeLinkTextView;
            linksTextViewMakeLinkTextView.setGravity(17);
            addView(this.titleView, LayoutHelper.createLinear(-1, -2, 55, 32, 20, 32, 0));
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 13.0f, i, false, resourcesProvider);
            this.textView = linksTextViewMakeLinkTextView2;
            linksTextViewMakeLinkTextView2.setGravity(17);
            addView(this.textView, LayoutHelper.createLinear(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            this.no = zzkg.m(context, resourcesProvider, true);
            this.yes = zzkg.m(context, resourcesProvider, true);
            linearLayout.addView(this.no, LayoutHelper.createLinear(0, 42, 1.0f, 112, 0, 0, 12, 0));
            linearLayout.addView(this.yes, LayoutHelper.createLinear(0, 42, 1.0f, 112, 0, 0, 0, 0));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 24, 18, 24, 16));
        }

        public int[] getColorKeys() {
            return null;
        }

        public void set(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, CharSequence charSequence4, View.OnClickListener onClickListener2) {
            LinkSpanDrawable.LinksTextView linksTextView = this.titleView;
            linksTextView.setText(Emoji.replaceEmoji(charSequence, linksTextView.getPaint().getFontMetricsInt(), false));
            LinkSpanDrawable.LinksTextView linksTextView2 = this.textView;
            linksTextView2.setText(Emoji.replaceEmoji(charSequence2, linksTextView2.getPaint().getFontMetricsInt(), false));
            this.no.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
            this.no.setText(charSequence3);
            this.no.setOnClickListener(onClickListener);
            this.yes.setText(charSequence4);
            this.yes.setOnClickListener(onClickListener2);
        }

        @Override
        public void updateColors() {
            LinkSpanDrawable.LinksTextView linksTextView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            linksTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        }
    }

    public SettingsActivity() {
        this(null);
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        this.iBlur3PositionMainTabs.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.hasMainTabs ? 2 : 1, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    private void checkUi_menuItems() {
        FragmentFloatingButton.setAnimatedVisibility(this.otherItem, 1.0f - this.animatorSearchPageVisible.floatValue);
        FragmentFloatingButton.setAnimatedVisibility(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.hasMainTabs ? 0.0f : 1.0f, 1.0f, this.animatorSearchPageVisible.floatValue));
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        int i = 17;
        int i2 = 4;
        int i3 = 0;
        int i4 = 1;
        if (this.searchItem.isSearchFieldVisible2()) {
            arrayList.add(UItem.asSpace(ActionBar.getCurrentActionBarHeight()));
            this.search.fillItems(arrayList);
            return;
        }
        arrayList.add(UItem.asCustomShadow(this.topView, 188));
        this.accountNumbers.clear();
        for (int i5 = 0; i5 < 4; i5++) {
            if (UserConfig.getInstance(i5).isClientActivated() && this.currentAccount != i5) {
                this.accountNumbers.add(Integer.valueOf(i5));
            }
        }
        Collections.sort(this.accountNumbers, new OAuthSheet$$ExternalSyntheticLambda10(i));
        Set<String> set = getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(SuggestionCell.Factory.of(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new SettingsActivity$$ExternalSyntheticLambda14(this, i3)));
            arrayList.add(UItem.asShadow(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && getUserConfig().getCurrentUser() != null) {
            arrayList.add(SuggestionCell.Factory.of(LocaleController.formatString(R.string.CheckPhoneNumber, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, PhoneFormat.getInstance())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new SettingsActivity$$ExternalSyntheticLambda0(this, i4)), LocaleController.getString(R.string.CheckPhoneNumberNo), new SettingsActivity$$ExternalSyntheticLambda14(this, i4), StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new SettingsActivity$$ExternalSyntheticLambda14(this, 2)));
            arrayList.add(UItem.asShadow(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(SuggestionCell.Factory.of(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new SettingsActivity$$ExternalSyntheticLambda14(this, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new SettingsActivity$$ExternalSyntheticLambda14(this, i2)));
            arrayList.add(UItem.asShadow(null));
        }
        if (this.accountNumbers.size() > 0) {
            zzke.m(R.string.SettingsAccounts, arrayList);
            for (int i6 = 0; i6 < this.accountNumbers.size(); i6++) {
                arrayList.add(AccountCell.Factory.of(i6, this.accountNumbers.get(i6).intValue()));
            }
            arrayList.add(UItem.asShadow(null));
        }
        IconBackgroundColors iconBackgroundColors = IconBackgroundColors.BLUE;
        arrayList.add(SettingCell.Factory.of(1, iconBackgroundColors.top, iconBackgroundColors.bottom, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo)));
        IconBackgroundColors iconBackgroundColors2 = IconBackgroundColors.ORANGE;
        arrayList.add(SettingCell.Factory.of(2, iconBackgroundColors2.top, iconBackgroundColors2.bottom, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo)));
        IconBackgroundColors iconBackgroundColors3 = IconBackgroundColors.GREEN;
        arrayList.add(SettingCell.Factory.of(3, iconBackgroundColors3.top, iconBackgroundColors3.bottom, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo)));
        IconBackgroundColors iconBackgroundColors4 = IconBackgroundColors.RED;
        arrayList.add(SettingCell.Factory.of(5, iconBackgroundColors4.top, iconBackgroundColors4.bottom, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo)));
        IconBackgroundColors iconBackgroundColors5 = IconBackgroundColors.BLUE_DEEP;
        arrayList.add(SettingCell.Factory.of(6, iconBackgroundColors5.top, iconBackgroundColors5.bottom, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo)));
        IconBackgroundColors iconBackgroundColors6 = IconBackgroundColors.BLUE_ALT;
        arrayList.add(SettingCell.Factory.of(7, iconBackgroundColors6.top, iconBackgroundColors6.bottom, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo)));
        IconBackgroundColors iconBackgroundColors7 = IconBackgroundColors.CYAN;
        arrayList.add(SettingCell.Factory.of(8, iconBackgroundColors7.top, iconBackgroundColors7.bottom, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo)));
        IconBackgroundColors iconBackgroundColors8 = IconBackgroundColors.ORANGE_DEEP;
        arrayList.add(SettingCell.Factory.of(9, iconBackgroundColors8.top, iconBackgroundColors8.bottom, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo)));
        IconBackgroundColors iconBackgroundColors9 = IconBackgroundColors.PURPLE;
        arrayList.add(SettingCell.Factory.of(10, iconBackgroundColors9.top, iconBackgroundColors9.bottom, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName()));
        arrayList.add(UItem.asShadow(null));
        if (!getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(SettingCell.Factory.of(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium)));
        }
        CharSequence starsAmount = "";
        if (getMessagesController().starsPurchaseAvailable()) {
            StarsController starsController = StarsController.getInstance(this.currentAccount, false);
            arrayList.add(SettingCell.Factory.of(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!starsController.balanceLoaded || starsController.getBalance().amount <= 0) ? "" : StarsIntroActivity.formatStarsAmount(starsController.getBalance(), 0.85f, ' ')));
        }
        StarsController.getInstance(this.currentAccount, true).getBalance();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (StarsController.getInstance(this.currentAccount, true).balanceLoaded && (StarsController.getInstance(this.currentAccount, true).hasTransactions(0) || StarsController.getInstance(this.currentAccount, true).getBalance().positive()))) {
            StarsController starsController2 = StarsController.getInstance(this.currentAccount, true);
            long j = starsController2.getBalance().amount;
            int i7 = R.drawable.settings_gram_24;
            String string = LocaleController.getString(R.string.MyTON);
            if (starsController2.balanceLoaded && j > 0) {
                starsAmount = StarsIntroActivity.formatStarsAmount(starsController2.getBalance(), 0.85f, ' ');
            }
            arrayList.add(SettingCell.Factory.of(13, -14965523, -15431455, i7, string, null, starsAmount));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = attachMenuBots.bots;
            int size = arrayList3.size();
            int i8 = 0;
            while (i8 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i8);
                i8++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    UItem uItemOfBot = SettingCell.Factory.ofBot(tL_attachMenuBot2, -14965523, -15431455, R.drawable.settings_wallet);
                    uItemOfBot.object = tL_attachMenuBot2;
                    arrayList.add(uItemOfBot);
                }
            }
        }
        if (!getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(SettingCell.Factory.of(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness)));
        }
        if (!getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(SettingCell.Factory.of(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift)));
        }
        if (((UItem) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList)).viewType != 7) {
            arrayList.add(UItem.asShadow(null));
        }
        zzke.m(R.string.SettingsHelp, arrayList);
        IconBackgroundColors iconBackgroundColors10 = IconBackgroundColors.ORANGE;
        arrayList.add(SettingCell.Factory.of(17, iconBackgroundColors10.top, iconBackgroundColors10.bottom, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion)));
        IconBackgroundColors iconBackgroundColors11 = IconBackgroundColors.BLUE_LIGHT;
        arrayList.add(SettingCell.Factory.of(18, iconBackgroundColors11.top, iconBackgroundColors11.bottom, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ)));
        IconBackgroundColors iconBackgroundColors12 = IconBackgroundColors.PURPLE;
        arrayList.add(SettingCell.Factory.of(23, iconBackgroundColors12.top, iconBackgroundColors12.bottom, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures)));
        IconBackgroundColors iconBackgroundColors13 = IconBackgroundColors.GREEN;
        arrayList.add(SettingCell.Factory.of(19, iconBackgroundColors13.top, iconBackgroundColors13.bottom, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy)));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(UItem.asShadow(null));
            zzke.m(R.string.SettingsDebug, arrayList);
            arrayList.add(SettingCell.Factory.of(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs)));
            arrayList.add(SettingCell.Factory.of(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs)));
            arrayList.add(SettingCell.Factory.of(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs)));
        }
        arrayList.add(UItem.asCustomShadow(this.versionView));
    }

    public void lambda$createView$0() {
        this.listView.postOnAnimation(new SettingsActivity$$ExternalSyntheticLambda0(this, 0));
    }

    public void lambda$createView$1() {
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(null);
    }

    public static void lambda$createView$2(DialogInterface dialogInterface) {
    }

    public void lambda$createView$3(View view) {
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        imageUpdater.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new SettingsActivity$$ExternalSyntheticLambda0(this, 3), new SettingsActivity$$ExternalSyntheticLambda4(0), 0);
    }

    public void lambda$createView$4(View view) {
        int i = this.versionViewPressCount + 1;
        this.versionViewPressCount = i;
        if (i >= 2 || BuildVars.DEBUG_PRIVATE_VERSION) {
            openDebugMenu();
            return;
        }
        try {
            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$didUploadPhoto$22(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.avatarUploadingRequest = -1;
        if (tL_error == null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    getMessagesController().putUser(user, false);
                }
            } else {
                getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && this.avatar != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(this.avatar.volume_id);
                sb.append("_");
                String strM = Fragment$$ExternalSyntheticOutline0.m(this.avatar.local_id, "@90_90", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@90_90", sb2), ImageLocation.getForUserOrChat(this.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().updateUserInfo(userFull, false);
            }
            setInfo(user);
        }
        this.avatar = null;
        this.avatarBig = null;
        showAvatarProgress(false, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getUserConfig().saveConfig(true);
    }

    public void lambda$didUploadPhoto$23(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(25, this, tL_error, tLObject, str));
    }

    public void lambda$didUploadPhoto$24(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarView.setImage(ImageLocation.getForLocal(fileLocation), "90_90", this.avatarDrawable, (Object) null);
            showAvatarProgress(true, false);
        } else {
            if (this.avatar == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.avatarUploadingRequest = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new LinkManager$$ExternalSyntheticLambda15(17, this, str));
        }
        this.actionBar.createMenu().requestLayout();
    }

    public void lambda$fillItems$10(View view) {
        getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
    }

    public void lambda$fillItems$11(View view) {
        presentFragment(new TwoStepVerificationSetupActivity(8, null));
    }

    public void lambda$fillItems$12(View view) {
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
    }

    public static int lambda$fillItems$6(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void lambda$fillItems$7(View view) {
        Browser.openUrl(getContext(), getMessagesController().premiumManageSubscriptionUrl);
        getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
    }

    public void lambda$fillItems$8() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
    }

    public void lambda$fillItems$9(View view) {
        presentFragment(new ActionIntroActivity(3));
    }

    public void lambda$onClick$13(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.showAttachMenuBot(LaunchActivity.instance, this.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(this.currentAccount).updateAttachMenuBotsInCache();
    }

    public void lambda$onClick$14(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda5(25, this, tL_attachMenuBot));
    }

    public void lambda$onClick$15(TLRPC.TL_attachMenuBot tL_attachMenuBot, Boolean bool) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new LinkManager$$ExternalSyntheticLambda15(18, this, tL_attachMenuBot), 66);
    }

    public void lambda$onLongClick$16() {
        this.listView.adapter.update(true);
    }

    public void lambda$onLongClick$17(String str) {
        AndroidUtilities.addToClipboard(str);
        BulletinFactory.of(this).createCopyLinkBulletin().show();
    }

    public void lambda$openDebugMenu$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        getMessagesController().loadAppConfig();
    }

    public void lambda$openDebugMenu$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
        tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
        tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
        getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new SettingsActivity$$ExternalSyntheticLambda1(this, 0));
    }

    public static void lambda$openDebugMenu$20(int i, DialogInterface dialogInterface, int i2) {
        int i3 = 2 - i2;
        if (i3 == i) {
            SharedConfig.overrideDevicePerformanceClass(-1);
        } else {
            SharedConfig.overrideDevicePerformanceClass(i3);
        }
    }

    public void lambda$openDebugMenu$21(DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 1;
        int i3 = 0;
        if (i == 0) {
            getUserConfig().syncContacts = true;
            getUserConfig().saveConfig(false);
            getContactsController().forceImportContacts();
            return;
        }
        long j = 0;
        if (i == 1) {
            getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i == 2) {
            getContactsController().resetImportedContacts();
            return;
        }
        if (i == 3) {
            getMessagesController().forceResetDialogs();
            return;
        }
        if (i == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            this.listView.adapter.update(true);
            if (BuildVars.LOGS_ENABLED) {
                zzjg.m(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i == 6) {
            getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController$$ExternalSyntheticOutline0.m(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            HintsController.resetAll();
            SharedPrefsHelper.cleanupAccount(this.currentAccount);
            MessagesController.getEmojiSettings(this.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            MessagesController.getGlobalNotificationsSettings().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            ChatThemeController.getInstance(this.currentAccount).clearCache();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            RestrictedLanguagesSelectActivity.cleanup();
            PersistColorPalette.getInstance(this.currentAccount).cleanup();
            SharedPreferences mainSettings = getMessagesController().getMainSettings();
            SharedPreferences.Editor editorEdit = mainSettings.edit();
            MessagesController$$ExternalSyntheticOutline0.m(editorEdit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
            SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(this.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    editorEdit2.remove(str2);
                }
            }
            editorEdit2.apply();
            return;
        }
        if (i == 7) {
            VoIPHelper.showCallDebugSettings(getParentActivity());
            return;
        }
        if (i == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i == 9) {
            ((LaunchActivity) getParentActivity()).checkAppUpdate(true, null);
            return;
        }
        if (i == 10) {
            getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i == 13) {
            Set<String> set = getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i == 18) {
                zzkt.setActive((LaunchActivity) getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i == 19) {
                getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new SettingsActivity$$ExternalSyntheticLambda1(this, i2));
                return;
            }
            if (i != 20) {
                if (i == 21) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
                    builder.setTitle("Force performance class");
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMeasureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    builder.setItems(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(iMeasureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(iMeasureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(iMeasureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new SettingsActivity$$ExternalSyntheticLambda21(iMeasureDevicePerformanceClass, i3));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    builder.show();
                    return;
                }
                if (i == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i == 23) {
                    boolean zDualAvailableStatic = DualCameraView.dualAvailableStatic(getContext());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !zDualAvailableStatic).apply();
                    Toast.makeText(getParentActivity(), LocaleController.getString(!zDualAvailableStatic ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i3 < ((ActionBarLayout) getParentLayout()).getFragmentStack().size()) {
                        ((ActionBarLayout) getParentLayout()).getFragmentStack().get(i3).clearSheets();
                        i3++;
                    }
                    return;
                }
                if (i == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i == 27) {
                    getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i == 28) {
                    SharedConfig.toggleUseCamera2(this.currentAccount);
                    return;
                }
                if (i == 29) {
                    WeakHashMap weakHashMap = BotBiometry.instances;
                    Context context = ApplicationLoader.applicationContext;
                    if (context != null) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            context.getSharedPreferences("2botbiometry_" + i4, 0).edit().clear().apply();
                        }
                        BotBiometry.instances.clear();
                    }
                    HashMap map = BotLocation.instances;
                    Context context2 = ApplicationLoader.applicationContext;
                    if (context2 != null) {
                        for (int i5 = 0; i5 < 4; i5++) {
                            context2.getSharedPreferences("botlocation_" + i5, 0).edit().clear().apply();
                        }
                        BotLocation.instances.clear();
                    }
                    HashMap map2 = BotDownloads.instances;
                    Context context3 = ApplicationLoader.applicationContext;
                    if (context3 != null) {
                        for (int i6 = 0; i6 < 4; i6++) {
                            context3.getSharedPreferences("botdownloads_" + i6, 0).edit().clear().apply();
                        }
                        BotDownloads.instances.clear();
                    }
                    Context context4 = ApplicationLoader.applicationContext;
                    if (context4 == null) {
                        return;
                    }
                    for (int i7 = 0; i7 < 4; i7++) {
                        context4.getSharedPreferences("botemojistatus_" + i7, 0).edit().clear().apply();
                    }
                    return;
                }
                if (i == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i == 35) {
                    MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
                    return;
                }
                if (i == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                }
                if (i == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                }
                if (i == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                    return;
                }
                if (i == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null) {
                        launchActivity.checkFrameMetrics();
                        return;
                    }
                    return;
                }
                if (i == 40) {
                    SharedPreferences.Editor editorEdit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z;
                    editorEdit3.putBoolean("shadowsInSections", z).apply();
                    return;
                }
                if (i == 41) {
                    SharedPreferences.Editor editorEdit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z2 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z2;
                    editorEdit4.putBoolean("debugViewMetrics", z2).apply();
                    return;
                }
                return;
            }
            int i8 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb = new StringBuilder();
            long j2 = 0;
            long jLongValue = 0;
            long j3 = 0;
            long jLongValue2 = 0;
            long j4 = 0;
            long jLongValue3 = 0;
            long j5 = 0;
            long jLongValue4 = 0;
            while (i3 < i8) {
                long j6 = j;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpu_capacity");
                sb.append("#");
                sb.append(i3);
                sb.append(" ");
                if (sysInfoLong != null) {
                    sb.append("min=");
                    sb.append(sysInfoLong.longValue() / 1000);
                    sb.append(" ");
                    jLongValue += sysInfoLong.longValue() / 1000;
                    j2++;
                }
                if (sysInfoLong2 != null) {
                    sb.append("cur=");
                    sb.append(sysInfoLong2.longValue() / 1000);
                    sb.append(" ");
                    jLongValue2 = (sysInfoLong2.longValue() / 1000) + jLongValue2;
                    j3++;
                }
                if (sysInfoLong3 != null) {
                    sb.append("max=");
                    sb.append(sysInfoLong3.longValue() / 1000);
                    sb.append(" ");
                    jLongValue3 = (sysInfoLong3.longValue() / 1000) + jLongValue3;
                    j4++;
                }
                if (sysInfoLong4 != null) {
                    sb.append("cpc=");
                    sb.append(sysInfoLong4);
                    sb.append(" ");
                    jLongValue4 = sysInfoLong4.longValue() + jLongValue4;
                    j5++;
                }
                sb.append("\n");
                i3++;
                j = j6;
            }
            long j7 = j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.MANUFACTURER);
            sb2.append(", ");
            sb2.append(Build.MODEL);
            sb2.append(" (");
            sb2.append(Build.PRODUCT);
            sb2.append(", ");
            sb2.append(Build.DEVICE);
            sb2.append(")  (android ");
            int i9 = Build.VERSION.SDK_INT;
            sb2.append(i9);
            sb2.append(")\n");
            if (i9 >= 31) {
                sb2.append("SoC: ");
                sb2.append(Build.SOC_MANUFACTURER);
                sb2.append(", ");
                sb2.append(Build.SOC_MODEL);
                sb2.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb2.append("GPU: ");
                sb2.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb2.append(", min=");
                    sb2.append(sysInfoLong5.longValue() / 1000);
                }
                if (sysInfoLong6 != 0) {
                    sb2.append(", mmin=");
                    sb2.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb2.append(", max=");
                    sb2.append(sysInfoLong7.longValue() / 1000);
                }
                sb2.append("\n");
            } else {
                j2 = j2;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb2.append("GLES Version: ");
            sb2.append(deviceConfigurationInfo.getGlEsVersion());
            sb2.append("\nMemory: class=");
            sb2.append(AndroidUtilities.formatFileSize(((long) memoryClass) * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb2.append(", total=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb2.append(", avail=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb2.append(", low?=");
            sb2.append(memoryInfo.lowMemory);
            sb2.append(" (threshold=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb2.append(")\nCurrent class: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb2.append(", measured: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i9 >= 31) {
                sb2.append(", suggest=");
                sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb2.append("\n");
            sb2.append(i8);
            sb2.append(" CPUs");
            if (j2 > j7) {
                sb2.append(", avgMinFreq=");
                sb2.append(jLongValue / j2);
            }
            if (j3 > j7) {
                sb2.append(", avgCurFreq=");
                sb2.append(jLongValue2 / j3);
            }
            if (j4 > j7) {
                sb2.append(", avgMaxFreq=");
                sb2.append(jLongValue3 / j4);
            }
            if (j5 > j7) {
                sb2.append(", avgCapacity=");
                sb2.append(jLongValue4 / j5);
            }
            sb2.append("\n");
            sb2.append((CharSequence) sb);
            listCodecs("video/avc", sb2);
            listCodecs("video/hevc", sb2);
            listCodecs("video/x-vnd.on2.vp8", sb2);
            listCodecs("video/x-vnd.on2.vp9", sb2);
            showDialog(new AnonymousClass8(getParentActivity(), null, sb2.toString(), false, null, false));
        } catch (Exception unused) {
        }
    }

    public void lambda$updateActionBarVisible$5(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBar.getTitlesContainer().setAlpha(fFloatValue);
        this.actionBarBackground.setAlpha(fFloatValue);
    }

    private void listCodecs(String str, StringBuilder sb) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (str2.equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i));
                            break;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb.append("\n");
            sb.append(arrayList.size());
            sb.append("+");
            sb.append(arrayList2.size());
            sb.append(" ");
            sb.append(str.substring(6));
            sb.append(" codecs:\n");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i2)).intValue());
                sb.append("{d} ");
                sb.append(codecInfoAt2.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType.getMaxSupportedInstances());
                sb.append(")");
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (i3 > 0 || !arrayList.isEmpty()) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i3)).intValue());
                sb.append("{e} ");
                sb.append(codecInfoAt3.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType2.getMaxSupportedInstances());
                sb.append(")");
            }
            sb.append("\n");
        } catch (Exception unused) {
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        this.navigationBarHeight = defaultWindowInsets.bottom;
        this.listView.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.top, 0, this.navigationBarHeight + this.additionNavigationBarHeight);
        return WindowInsetsCompat.CONSUMED;
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                WebAppDisclaimerAlert.show(getContext(), new ChatActivity$$ExternalSyntheticLambda240(5, this, tL_attachMenuBot), null, null);
                return;
            }
            LaunchActivity.showAttachMenuBot(LaunchActivity.instance, this.currentAccount, tL_attachMenuBot, null, true);
        }
        if (uItem.instanceOf(AccountCell.Factory.class)) {
            int i2 = uItem.intValue;
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.switchToAccount(i2, true);
                return;
            }
            return;
        }
        if (uItem.instanceOf(SettingsSearchCell.Factory.class)) {
            Object obj2 = uItem.object;
            if (obj2 instanceof ProfileActivity.SearchAdapter.SearchResult) {
                ((ProfileActivity.SearchAdapter.SearchResult) obj2).open(getParentLayout());
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, this.search.faqWebPage, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = uItem.object;
            if (obj3 != null) {
                this.search.addRecent(obj3);
                return;
            }
            return;
        }
        switch (uItem.id) {
            case 1:
                presentSettingFragment(new UserInfoActivity());
                break;
            case 2:
                presentSettingFragment(new ThemeActivity(0));
                break;
            case 3:
                presentSettingFragment(new PrivacySettingsActivity());
                break;
            case 5:
                presentSettingFragment(new NotificationsSettingsActivity());
                break;
            case 6:
                presentSettingFragment(new DataSettingsActivity());
                break;
            case 7:
                presentSettingFragment(new FiltersSetupActivity());
                break;
            case 8:
                presentSettingFragment(new SessionsActivity(0));
                break;
            case 9:
                presentSettingFragment(new LiteModeSettingsActivity());
                break;
            case 10:
                presentSettingFragment(new LanguageSelectActivity());
                break;
            case 11:
                presentSettingFragment(new PremiumPreviewFragment("settings"));
                break;
            case 12:
                presentSettingFragment(new StarsIntroActivity());
                break;
            case 13:
                presentSettingFragment(new TONIntroActivity());
                break;
            case 15:
                presentSettingFragment(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                UserSelectorBottomSheet.open(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                showDialog(AlertsCreator.createSupportAlert(this, this.resourceProvider));
                break;
            case 18:
                Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.sendLogs(getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.sendLogs(getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    Browser.openUrl(getContext(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                } else {
                    AccountFrozenAlert.show(this.currentAccount);
                }
                break;
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        String str;
        Object obj = uItem.object;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            BotWebViewSheet.deleteBot(this.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new SettingsActivity$$ExternalSyntheticLambda0(this, 4));
            return true;
        }
        if (!uItem.instanceOf(SettingsSearchCell.Factory.class)) {
            return false;
        }
        Object obj2 = uItem.object;
        if (obj2 instanceof ProfileActivity.SearchAdapter.SearchResult) {
            str = ((ProfileActivity.SearchAdapter.SearchResult) obj2).link;
        } else {
            str = obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ItemOptions.makeOptions(this, view).add(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new QrActivity$$ExternalSyntheticLambda5(26, this, str)).setScrimViewBackground(this.listView.getClipBackground(view)).show();
        return true;
    }

    public void presentSettingFragment(BaseFragment baseFragment) {
        LaunchActivity launchActivity;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.instance) == null || launchActivity.getRightActionBarLayout() == null) {
            presentFragment(baseFragment);
            return;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) LaunchActivity.instance.getRightActionBarLayout();
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (Theme.ResourcesProvider.CC.m(actionBarLayout, 1) > 0) {
                actionBarLayout.removeFragmentFromStack(actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.closeLastFragment(false, false);
        }
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.noAnimation = true;
        navigationParams.forceRightLayout = true;
        actionBarLayout.presentFragment(navigationParams);
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                return;
            } else {
                this.avatarProgressView.setAlpha(0.0f);
                this.avatarProgressView.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) View.ALPHA, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                SettingsActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (SettingsActivity.this.avatarAnimation == null || SettingsActivity.this.avatarProgressView == null) {
                    return;
                }
                if (!z) {
                    SettingsActivity.this.avatarProgressView.setVisibility(4);
                }
                SettingsActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    private float top() {
        if (this.listView.getChildCount() <= 0) {
            return 0.0f;
        }
        View childAt = this.listView.getChildAt(0);
        if (this.listView.getChildAdapterPosition(childAt) > 0) {
            return 0.0f;
        }
        return Math.max(0.0f, childAt.getY() + childAt.getHeight());
    }

    public void updateActionBarVisible() {
        updateActionBarVisible(false, true);
    }

    @Override
    public final boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return isSwipeBackEnabled(motionEvent);
    }

    @Override
    public void clearViews() {
        if (this.ignoreClearViews) {
            return;
        }
        super.clearViews();
    }

    @Override
    public View createView(Context context) {
        this.contentView = new SizeNotifierFrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && SettingsActivity.this.scrollableViewNoiseSuppressor != null) {
                    SettingsActivity.this.blur3_InvalidateBlur();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (SettingsActivity.this.iBlur3SourceGlassFrosted != null && !SettingsActivity.this.iBlur3SourceGlassFrosted.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording = SettingsActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording.drawColor(SettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            SettingsActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                        }
                        SettingsActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (SettingsActivity.this.iBlur3SourceGlass != null && !SettingsActivity.this.iBlur3SourceGlass.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording2 = SettingsActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording2.drawColor(SettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            SettingsActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                        }
                        SettingsActivity.this.iBlur3SourceGlass.endRecording();
                    }
                    SettingsActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
                SettingsActivity settingsActivity = SettingsActivity.this;
                if (settingsActivity.hasMainTabs) {
                    return;
                }
                AndroidUtilities.drawNavigationBarProtection(canvas, this, settingsActivity.getThemedColor(Theme.key_windowBackgroundWhite), SettingsActivity.this.navigationBarHeight);
            }

            @Override
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || SettingsActivity.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                SettingsActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }

            @Override
            public void updateColors() {
                super.updateColors();
                SettingsActivity.this.updateColors();
            }
        };
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setUseContainerForTitles();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    SettingsActivity.this.finishFragment();
                } else if (i == 2) {
                    SettingsActivity.this.presentSettingFragment(new LogoutActivity());
                }
            }
        });
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search, this.resourceProvider).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                SettingsActivity.this.animatorSearchPageVisible.setValue(false, true);
                SettingsActivity.this.updateActionBarVisible();
                SettingsActivity.this.listView.adapter.update(false);
            }

            @Override
            public void onSearchExpand() {
                SettingsActivity.this.animatorSearchPageVisible.setValue(true, true);
                SettingsActivity.this.search.search(SettingsActivity.this.query = "");
                SettingsActivity.this.updateActionBarVisible();
                SettingsActivity.this.listView.adapter.update(false);
            }

            @Override
            public void onTextChanged(EditText editText) {
                SettingsActivity.this.search.search(SettingsActivity.this.query = editText.getText().toString());
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(1, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.addSubItem(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        ProfileActivity.SearchAdapter searchAdapter = new ProfileActivity.SearchAdapter(this, context) {
            @Override
            public void notifyDataSetChanged() {
                SettingsActivity.this.listView.adapter.update(true);
            }
        };
        this.search = searchAdapter;
        searchAdapter.loadFaqWebPage();
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new LinkManager$$ExternalSyntheticLambda6(this, 26), new SettingsActivity$$ExternalSyntheticLambda24(this), new SettingsActivity$$ExternalSyntheticLambda24(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.adapter.setApplyBackground(false);
        this.listView.setSections();
        this.listView.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.additionNavigationBarHeight);
        this.listView.setClipToPadding(false);
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                SettingsActivity.this.updateActionBarVisible();
                if (SettingsActivity.this.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(SettingsActivity.this.fragmentView);
                }
                if (Build.VERSION.SDK_INT < 31 || SettingsActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                SettingsActivity.this.scrollableViewNoiseSuppressor.onScrolled(i, i2);
                SettingsActivity.this.blur3_InvalidateBlur();
            }
        });
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        Objects.requireNonNull(universalRecyclerView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView2, sizeNotifierFrameLayout, new BoostsActivity$$ExternalSyntheticLambda4(universalRecyclerView2, 4));
        this.listView.addEdgeEffectListener(new SettingsActivity$$ExternalSyntheticLambda0(this, 2));
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        View view = new View(context) {
            private final Paint blurScrimPaint = new Paint(1);

            @Override
            public void onDraw(Canvas canvas) {
                int height = ((BaseFragment) SettingsActivity.this).actionBar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                this.blurScrimPaint.setColor(Theme.getColor(Theme.key_actionBarDefault, ((BaseFragment) SettingsActivity.this).resourceProvider));
                SettingsActivity.this.contentView.drawBlurRect(canvas, 0.0f, rect, this.blurScrimPaint, true);
                if (SettingsActivity.this.getParentLayout() != null) {
                    INavigationLayout parentLayout = SettingsActivity.this.getParentLayout();
                    parentLayout.getClass();
                    ((ActionBarLayout) parentLayout).drawHeaderShadow(canvas, 255, height);
                }
            }
        };
        this.actionBarBackground = view;
        this.contentView.addView(view, LayoutHelper.createFrame(-1, 200, 48));
        this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 55));
        ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.setOpenWithFrontfaceCamera(true);
        ImageUpdater imageUpdater2 = this.imageUpdater;
        imageUpdater2.parentFragment = this;
        imageUpdater2.setDelegate(this);
        this.topView = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.avatarContainer = frameLayout;
        this.topView.addView(frameLayout, LayoutHelper.createFrame(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.avatarContainer.setOnClickListener(new SettingsActivity$$ExternalSyntheticLambda14(this, 5));
        ScaleStateListAnimator.apply(this.avatarContainer);
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.avatarContainer.addView(this.avatarView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context) {
            private Paint paint;

            {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(1426063360);
            }

            @Override
            public void onDraw(Canvas canvas) {
                if (SettingsActivity.this.avatarView != null && SettingsActivity.this.avatarView.getImageReceiver().hasNotThumb()) {
                    this.paint.setAlpha((int) (SettingsActivity.this.avatarView.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, this.paint);
                }
                super.onDraw(canvas);
            }
        };
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(26.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.avatarContainer.addView(this.avatarProgressView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        showAvatarProgress(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.cameraButton = frameLayout2;
        frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(32.0f), getThemedColor(Theme.key_windowBackgroundGray)));
        this.cameraButton.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.cameraBackground = frameLayout3;
        frameLayout3.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(30.0f), getThemedColor(Theme.key_featuredStickers_addButton)));
        ImageView imageView = new ImageView(context);
        this.cameraImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.cameraImageView.setImageResource(R.drawable.filled_premium_camera);
        this.cameraBackground.addView(this.cameraImageView, LayoutHelper.createFrame(22, 22, 17));
        this.cameraButton.addView(this.cameraBackground, LayoutHelper.createFrame(30, 30.0f));
        this.avatarContainer.addView(this.cameraButton, LayoutHelper.createFrame(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(this.cameraButton);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 22.0f);
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setGravity(17);
        this.titleView.setSingleLine();
        TextView textView2 = this.titleView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textViewM = zzkj.m(this.topView, this.titleView, LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.subtitleView = textViewM;
        textViewM.setTextSize(1, 13.0f);
        this.subtitleView.setGravity(17);
        this.subtitleView.setSingleLine();
        this.subtitleView.setEllipsize(truncateAt);
        TextView textViewM2 = zzkj.m(this.topView, this.subtitleView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.versionView = textViewM2;
        textViewM2.setTextSize(1, 14.0f);
        this.versionView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText4));
        this.versionView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.versionView.setGravity(17);
        this.versionView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2, -1));
        this.versionView.setOnClickListener(new SettingsActivity$$ExternalSyntheticLambda14(this, 6));
        this.navigationBar = new View(context);
        updateActionBarVisible(true, false);
        this.listView.adapter.update(false);
        setInfo();
        updateColors();
        checkUi_menuItems();
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        SettingsActivity$$ExternalSyntheticLambda24 settingsActivity$$ExternalSyntheticLambda24 = new SettingsActivity$$ExternalSyntheticLambda24(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(sizeNotifierFrameLayout2, settingsActivity$$ExternalSyntheticLambda24);
        SizeNotifierFrameLayout sizeNotifierFrameLayout3 = this.contentView;
        this.fragmentView = sizeNotifierFrameLayout3;
        return sizeNotifierFrameLayout3;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        if (i == NotificationCenter.starBalanceUpdated) {
            setInfo();
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            if (universalRecyclerView2 != null) {
                universalRecyclerView2.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            setInfo();
        } else {
            if (i != NotificationCenter.newSuggestionsAvailable || (universalRecyclerView = this.listView) == null) {
                return;
            }
            universalRecyclerView.adapter.update(true);
        }
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda50(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public final String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    public String getVersionName() {
        String str;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            int i = packageInfo.versionCode;
            int i2 = i / 10;
            int i3 = i % 10;
            if (i3 == 1 || i3 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else if (ApplicationLoader.isStandaloneBuild()) {
                str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i4 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            return LocaleController.formatString(i4, "v" + packageInfo.versionName + " (" + i2 + ")\n" + str);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.animatorSearchPageVisible.value;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!this.actionBar.isSearchFieldVisible()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        this.actionBar.closeSearchField();
        return false;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_menuItems();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.hasMainTabs = bundle.getBoolean("hasMainTabs", false);
        }
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public void onParentScrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    public void openDebugMenu() {
        int i;
        String str;
        String string;
        int i2;
        String str2;
        char c;
        String string2;
        String str3;
        String str4;
        String string3;
        String str5;
        String str6;
        String str7;
        String str8;
        String string4;
        String str9;
        String str10;
        String str11;
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
        builder.setTitle(LocaleController.getString(R.string.DebugMenu));
        String string5 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string6 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string7 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string8 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                i = R.string.DebugMenuDisableLogs;
                str = "DebugMenuDisableLogs";
            } else {
                i = R.string.DebugMenuEnableLogs;
                str = "DebugMenuEnableLogs";
            }
            string = LocaleController.getString(str, i);
        }
        if (SharedConfig.inappCamera) {
            i2 = R.string.DebugMenuDisableCamera;
            str2 = "DebugMenuDisableCamera";
        } else {
            i2 = R.string.DebugMenuEnableCamera;
            str2 = "DebugMenuEnableCamera";
        }
        String string9 = LocaleController.getString(str2, i2);
        String string10 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string11 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c = 0;
            string2 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            string2 = null;
            c = 0;
        }
        String string12 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects";
        } else {
            str3 = null;
        }
        boolean z = BuildVars.DEBUG_PRIVATE_VERSION;
        String str12 = z ? "Clean app update" : null;
        String str13 = z ? "Reset suggestions" : null;
        String string13 = z ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string14 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string15 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        if (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) {
            str4 = SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode";
        } else {
            str4 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            string3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            string3 = null;
        }
        boolean z2 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str14 = z2 ? "Force remove premium suggestions" : null;
        String str15 = z2 ? "Share device info" : null;
        String str16 = z2 ? "Force performance class" : null;
        if (!z2 || InstantCameraView.allowBigSizeCameraDebug()) {
            str5 = null;
        } else {
            str5 = !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        }
        String string16 = LocaleController.getString(DualCameraView.dualAvailableStatic(getContext()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        if (BuildVars.DEBUG_VERSION) {
            str6 = SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories";
        } else {
            str6 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str7 = SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer";
        } else {
            str7 = null;
        }
        String str17 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str18 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str19 = !SharedConfig.isUsingCamera2(this.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str20 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str21 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (!SharedConfig.canBlurChat() || Build.VERSION.SDK_INT < 31) {
            str8 = null;
        } else {
            str8 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
        }
        String str22 = SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
        String str23 = SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
        String str24 = str19;
        if (Build.VERSION.SDK_INT >= 28) {
            string4 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
        } else {
            string4 = null;
        }
        String str25 = !SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str9 = SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader";
        } else {
            str9 = null;
        }
        String str26 = SharedConfig.frameMetricsEnabled ? "hide frame metrics" : "show frame metrics";
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str10 = SharedConfig.shadowsInSections ? "disable shadows in settings" : "enable shadows in settings";
        } else {
            str10 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str11 = SharedConfig.debugViewMetrics ? "disable debug view metrics" : "enable debug view metrics";
        } else {
            str11 = null;
        }
        CharSequence[] charSequenceArr = new CharSequence[42];
        charSequenceArr[c] = string5;
        charSequenceArr[1] = string6;
        charSequenceArr[2] = string7;
        charSequenceArr[3] = string8;
        charSequenceArr[4] = string;
        charSequenceArr[5] = string9;
        charSequenceArr[6] = string10;
        charSequenceArr[7] = string11;
        charSequenceArr[8] = null;
        charSequenceArr[9] = string2;
        charSequenceArr[10] = string12;
        charSequenceArr[11] = str3;
        charSequenceArr[12] = str12;
        charSequenceArr[13] = str13;
        charSequenceArr[14] = string13;
        charSequenceArr[15] = string14;
        charSequenceArr[16] = string15;
        charSequenceArr[17] = str4;
        charSequenceArr[18] = string3;
        charSequenceArr[19] = str14;
        charSequenceArr[20] = str15;
        charSequenceArr[21] = str16;
        charSequenceArr[22] = str5;
        charSequenceArr[23] = string16;
        charSequenceArr[24] = str6;
        charSequenceArr[25] = str7;
        charSequenceArr[26] = str17;
        charSequenceArr[27] = str18;
        charSequenceArr[28] = str24;
        charSequenceArr[29] = str20;
        charSequenceArr[30] = str21;
        charSequenceArr[31] = str8;
        charSequenceArr[32] = str22;
        charSequenceArr[33] = str23;
        charSequenceArr[34] = string4;
        charSequenceArr[35] = "Reload app config";
        charSequenceArr[36] = str25;
        charSequenceArr[37] = "Make Memory Dump";
        charSequenceArr[38] = str9;
        charSequenceArr[39] = str26;
        charSequenceArr[40] = str10;
        charSequenceArr[41] = str11;
        builder.setItems(charSequenceArr, new DialogsActivity$$ExternalSyntheticLambda99(this, 3));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void setInfo() {
        setInfo(getUserConfig().getCurrentUser());
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public void updateColors() {
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(getThemedColor(i));
        this.actionBar.setItemsColor(getThemedColor(i), false);
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.titleView.setTextColor(getThemedColor(i));
        this.subtitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.searchItem.updateColor();
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        this.navigationBar.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, themedColor), themedColor}));
        this.actionBarBackground.invalidate();
        this.listView.invalidate();
    }

    public SettingsActivity(Bundle bundle) {
        super(bundle);
        this.animatorSearchPageVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 350L, false);
        this.versionViewPressCount = 0;
        this.accountNumbers = new ArrayList<>();
        this.avatarUploadingRequest = -1;
        ArrayList<RectF> arrayList = new ArrayList<>();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
        }
    }

    private void updateActionBarVisible(boolean z, boolean z2) {
        boolean z3;
        if (!this.searchItem.isSearchFieldVisible2()) {
            if (this.listView.getChildCount() > 0) {
                View childAt = this.listView.getChildAt(0);
                z3 = this.listView.getChildAdapterPosition(childAt) > 0 || childAt.getY() + ((float) childAt.getHeight()) < ((float) this.actionBar.getHeight());
            }
        }
        if (this.actionBarVisible != z3 || z) {
            this.actionBarVisible = z3;
            ValueAnimator valueAnimator = this.actionBarVisibleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.actionBarVisibleAnimator = null;
            }
            if (!z2) {
                this.actionBar.getTitlesContainer().setAlpha(z3 ? 1.0f : 0.0f);
                this.actionBarBackground.setAlpha(z3 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z3 ? 1.0f : 0.0f);
            this.actionBarVisibleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 17));
            this.actionBarVisibleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarVisibleAnimator.setDuration(420L);
            this.actionBarVisibleAnimator.start();
        }
    }

    public void setInfo(TLRPC.User user) {
        if (this.avatarView != null && this.avatarUploadingRequest == -1) {
            this.avatarDrawable.setInfo(user);
            this.avatarView.setForUserOrChat(user, this.avatarDrawable);
            this.titleView.setText(UserObject.getUserName(user));
            StringBuilder sb = new StringBuilder();
            if (user != null) {
                sb.append(PhoneFormat.getInstance().format("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb.append(" • @");
                sb.append(publicUsername);
            }
            this.subtitleView.setText(sb);
            this.versionView.setText(getVersionName());
        }
    }
}
