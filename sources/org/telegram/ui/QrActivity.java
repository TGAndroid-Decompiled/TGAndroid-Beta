package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.QrActivity;

public class QrActivity extends BaseFragment {
    private static List<EmojiThemes> cachedThemes;
    private static final ArrayMap<String, int[]> qrColorsMap;
    private BackupImageView avatarImageView;
    private View backgroundView;
    private long chatId;
    private ImageView closeImageView;
    private EmojiThemes currentTheme;
    private Bitmap emojiThemeIcon;
    private final EmojiThemes homeTheme;
    private boolean isCurrentThemeDark;
    private RLottieImageView logoImageView;
    private ValueAnimator patternAlphaAnimator;
    private ValueAnimator patternIntensityAnimator;
    private MotionBackgroundDrawable prevMotionDrawable;
    private int prevSystemUiVisibility;
    private QrView qrView;
    private MotionBackgroundDrawable tempMotionDrawable;
    private FrameLayout themeLayout;
    private ThemeListViewController themesViewController;
    private long userId;
    private final ThemeResourcesProvider resourcesProvider = new ThemeResourcesProvider();
    private final Rect logoRect = new Rect();
    private final ArrayMap<String, Bitmap> emojiThemeDarkIcons = new ArrayMap<>();
    private final int[] prevQrColors = new int[4];
    private MotionBackgroundDrawable currMotionDrawable = new MotionBackgroundDrawable();
    private int selectedPosition = -1;

    public interface OnItemSelectedListener {
        void onItemSelected(EmojiThemes emojiThemes, int i);
    }

    static {
        ArrayMap<String, int[]> arrayMap = new ArrayMap<>();
        qrColorsMap = arrayMap;
        arrayMap.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        arrayMap.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        arrayMap.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        arrayMap.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        arrayMap.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        arrayMap.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        arrayMap.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        arrayMap.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        arrayMap.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        arrayMap.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        arrayMap.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        arrayMap.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        arrayMap.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        arrayMap.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        arrayMap.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        arrayMap.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        arrayMap.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        arrayMap.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
    }

    public QrActivity(Bundle bundle) {
        super(bundle);
        EmojiThemes createHomeQrTheme = EmojiThemes.createHomeQrTheme();
        this.homeTheme = createHomeQrTheme;
        this.currentTheme = createHomeQrTheme;
    }

    @Override
    public boolean onFragmentCreate() {
        this.userId = this.arguments.getLong("user_id");
        this.chatId = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public View createView(Context context) {
        AvatarDrawable avatarDrawable;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        boolean z;
        String str;
        String str2;
        Bitmap decodeResource;
        TLRPC$Chat chat;
        ImageLocation imageLocation3;
        AvatarDrawable avatarDrawable2;
        ImageLocation imageLocation4;
        this.homeTheme.loadPreviewColors(this.currentAccount);
        this.isCurrentThemeDark = Theme.getActiveTheme().isDark();
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.setItemsColor(-1, false);
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean prevIsPortrait;

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                boolean z2 = size < size2;
                QrActivity.this.avatarImageView.setVisibility(z2 ? 0 : 8);
                super.onMeasure(i, i2);
                if (z2) {
                    QrActivity.this.themeLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    QrActivity.this.qrView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                } else {
                    QrActivity.this.themeLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(256.0f), 1073741824), i2);
                    QrActivity.this.qrView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                }
                if (this.prevIsPortrait != z2) {
                    QrActivity.this.qrView.onSizeChanged(QrActivity.this.qrView.getMeasuredWidth(), QrActivity.this.qrView.getMeasuredHeight(), 0, 0);
                }
                this.prevIsPortrait = z2;
            }

            @Override
            protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                int i5 = 0;
                boolean z3 = getWidth() < getHeight();
                QrActivity.this.backgroundView.layout(0, 0, getWidth(), getHeight());
                if (QrActivity.this.themeLayout.getVisibility() == 0) {
                    i5 = QrActivity.this.themeLayout.getMeasuredHeight();
                }
                int width = z3 ? (getWidth() - QrActivity.this.qrView.getMeasuredWidth()) / 2 : ((getWidth() - QrActivity.this.themeLayout.getMeasuredWidth()) - QrActivity.this.qrView.getMeasuredWidth()) / 2;
                int height = z3 ? ((((getHeight() - i5) - QrActivity.this.qrView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + AndroidUtilities.dp(52.0f) : (getHeight() - QrActivity.this.qrView.getMeasuredHeight()) / 2;
                QrActivity.this.qrView.layout(width, height, QrActivity.this.qrView.getMeasuredWidth() + width, QrActivity.this.qrView.getMeasuredHeight() + height);
                if (z3) {
                    int width2 = (getWidth() - QrActivity.this.avatarImageView.getMeasuredWidth()) / 2;
                    int dp = height - AndroidUtilities.dp(48.0f);
                    QrActivity.this.avatarImageView.layout(width2, dp, QrActivity.this.avatarImageView.getMeasuredWidth() + width2, QrActivity.this.avatarImageView.getMeasuredHeight() + dp);
                }
                if (QrActivity.this.themeLayout.getVisibility() == 0) {
                    if (z3) {
                        int width3 = (getWidth() - QrActivity.this.themeLayout.getMeasuredWidth()) / 2;
                        QrActivity.this.themeLayout.layout(width3, i4 - i5, QrActivity.this.themeLayout.getMeasuredWidth() + width3, i4);
                    } else {
                        int height2 = (getHeight() - QrActivity.this.themeLayout.getMeasuredHeight()) / 2;
                        QrActivity.this.themeLayout.layout(i3 - QrActivity.this.themeLayout.getMeasuredWidth(), height2, i3, QrActivity.this.themeLayout.getMeasuredHeight() + height2);
                    }
                }
                QrActivity.this.logoImageView.layout(QrActivity.this.logoRect.left + width, QrActivity.this.logoRect.top + height, width + QrActivity.this.logoRect.right, height + QrActivity.this.logoRect.bottom);
                int dp2 = AndroidUtilities.dp(z3 ? 14.0f : 17.0f);
                int dp3 = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(z3 ? 10.0f : 5.0f);
                QrActivity.this.closeImageView.layout(dp2, dp3, QrActivity.this.closeImageView.getMeasuredWidth() + dp2, QrActivity.this.closeImageView.getMeasuredHeight() + dp3);
            }
        };
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                if (QrActivity.this.prevMotionDrawable != null) {
                    QrActivity.this.prevMotionDrawable.setBounds(0, 0, getWidth(), getHeight());
                }
                QrActivity.this.currMotionDrawable.setBounds(0, 0, getWidth(), getHeight());
                if (QrActivity.this.prevMotionDrawable != null) {
                    QrActivity.this.prevMotionDrawable.drawBackground(canvas);
                }
                QrActivity.this.currMotionDrawable.drawBackground(canvas);
                if (QrActivity.this.prevMotionDrawable != null) {
                    QrActivity.this.prevMotionDrawable.drawPattern(canvas);
                }
                QrActivity.this.currMotionDrawable.drawPattern(canvas);
                super.onDraw(canvas);
            }
        };
        this.backgroundView = view;
        frameLayout.addView(view);
        if (this.userId != 0) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user != null) {
                str2 = user.username;
                if (str2 == null) {
                    z = true;
                    str = UserObject.getUserName(user);
                    str2 = user.phone;
                } else {
                    str = null;
                    z = false;
                }
                avatarDrawable2 = new AvatarDrawable(user);
                imageLocation3 = ImageLocation.getForUser(user, 1);
                imageLocation4 = ImageLocation.getForUser(user, 0);
            } else {
                imageLocation4 = null;
                str2 = null;
                str = null;
                avatarDrawable2 = null;
                imageLocation3 = null;
                z = false;
            }
            imageLocation2 = imageLocation4;
            avatarDrawable = avatarDrawable2;
            imageLocation = imageLocation3;
        } else {
            if (this.chatId == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) == null) {
                str2 = null;
                str = null;
                imageLocation2 = null;
                imageLocation = null;
                avatarDrawable = null;
            } else {
                str2 = chat.username;
                AvatarDrawable avatarDrawable3 = new AvatarDrawable(chat);
                ImageLocation forChat = ImageLocation.getForChat(chat, 1);
                str = null;
                imageLocation2 = ImageLocation.getForChat(chat, 0);
                avatarDrawable = avatarDrawable3;
                imageLocation = forChat;
            }
            z = false;
        }
        String str3 = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str2;
        QrView qrView = new QrView(context);
        this.qrView = qrView;
        qrView.setColors(-9324972, -13856649, -6636738, -9915042);
        QrView qrView2 = this.qrView;
        if (str != null) {
            str2 = str;
        }
        qrView2.setData(str3, str2, z);
        this.qrView.setCenterChangedListener(new QrView.QrCenterChangedListener() {
            @Override
            public final void onCenterChanged(int i, int i2, int i3, int i4) {
                QrActivity.this.lambda$createView$0(i, i2, i3, i4);
            }
        });
        frameLayout.addView(this.qrView);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.logoImageView = rLottieImageView;
        rLottieImageView.setAutoRepeat(true);
        this.logoImageView.setAnimation(R.raw.qr_code_logo_2, 60, 60);
        this.logoImageView.playAnimation();
        frameLayout.addView(this.logoImageView);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.avatarImageView.setSize(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
        this.avatarImageView.setImage(imageLocation2, "84_84", imageLocation, "50_50", avatarDrawable, null, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.closeImageView = imageView;
        imageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.closeImageView.setImageResource(R.drawable.ic_ab_back);
        this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                QrActivity.this.lambda$createView$1(view2);
            }
        });
        frameLayout.addView(this.closeImageView, LayoutHelper.createFrame(34, 34.0f));
        this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.emojiThemeIcon);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.emojiThemeIcon.getWidth() - decodeResource.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - decodeResource.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        ThemeListViewController themeListViewController = new ThemeListViewController(this, getParentActivity().getWindow()) {
            @Override
            protected void setDarkTheme(boolean z2) {
                super.setDarkTheme(z2);
                QrActivity.this.isCurrentThemeDark = z2;
                QrActivity qrActivity = QrActivity.this;
                qrActivity.onItemSelected(qrActivity.currentTheme, QrActivity.this.selectedPosition, false);
            }
        };
        this.themesViewController = themeListViewController;
        this.themeLayout = themeListViewController.rootLayout;
        themeListViewController.onCreate();
        this.themesViewController.setItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public final void onItemSelected(EmojiThemes emojiThemes, int i) {
                QrActivity.this.lambda$createView$2(emojiThemes, i);
            }
        });
        this.themesViewController.titleView.setText(LocaleController.getString("QrCode", R.string.QrCode));
        this.themesViewController.progressView.setViewType(17);
        this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                QrActivity.this.lambda$createView$3(view2);
            }
        });
        frameLayout.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
        this.currMotionDrawable.setIndeterminateAnimation(true);
        this.fragmentView = frameLayout;
        onItemSelected(this.currentTheme, 0, false);
        List<EmojiThemes> list = cachedThemes;
        if (list == null || list.isEmpty()) {
            ChatThemeController.requestAllChatThemes(new ResultCallback<List<EmojiThemes>>() {
                public void onComplete(List<EmojiThemes> list2) {
                    QrActivity.this.onDataLoaded(list2);
                    List unused = QrActivity.cachedThemes = list2;
                }

                @Override
                public void onError(TLRPC$TL_error tLRPC$TL_error) {
                    Toast.makeText(QrActivity.this.getParentActivity(), tLRPC$TL_error.text, 0).show();
                }
            }, true);
        } else {
            onDataLoaded(cachedThemes);
        }
        this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        applyScreenSettings();
        return this.fragmentView;
    }

    public void lambda$createView$0(int i, int i2, int i3, int i4) {
        this.logoRect.set(i, i2, i3, i4);
        this.qrView.requestLayout();
    }

    public void lambda$createView$1(View view) {
        finishFragment();
    }

    public void lambda$createView$2(EmojiThemes emojiThemes, int i) {
        onItemSelected(emojiThemes, i, true);
    }

    public void lambda$createView$3(View view) {
        this.themesViewController.shareButton.setClickable(false);
        performShare();
    }

    @Override
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onResume() {
        super.onResume();
        applyScreenSettings();
    }

    @Override
    public void onPause() {
        restoreScreenSettings();
        super.onPause();
    }

    @Override
    public void onFragmentDestroy() {
        this.themesViewController.onDestroy();
        this.themesViewController = null;
        this.emojiThemeIcon.recycle();
        this.emojiThemeIcon = null;
        for (int i = 0; i < this.emojiThemeDarkIcons.size(); i++) {
            Bitmap valueAt = this.emojiThemeDarkIcons.valueAt(i);
            if (valueAt != null) {
                valueAt.recycle();
            }
        }
        this.emojiThemeDarkIcons.clear();
        restoreScreenSettings();
        super.onFragmentDestroy();
    }

    private void applyScreenSettings() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1024 | 4);
        }
    }

    private void restoreScreenSettings() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility);
        }
    }

    @Override
    public int getNavigationBarColor() {
        return getThemedColor("windowBackgroundGray");
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    public void onDataLoaded(List<EmojiThemes> list) {
        if (!(list == null || list.isEmpty() || this.themesViewController == null)) {
            int i = 0;
            list.set(0, this.homeTheme);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                EmojiThemes emojiThemes = list.get(i2);
                emojiThemes.loadPreviewColors(this.currentAccount);
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
                boolean z = this.isCurrentThemeDark;
                chatThemeItem.themeIndex = z ? 1 : 0;
                chatThemeItem.icon = getEmojiThemeIcon(emojiThemes, z);
                arrayList.add(chatThemeItem);
            }
            this.themesViewController.adapter.setItems(arrayList);
            while (true) {
                if (i == arrayList.size()) {
                    i = -1;
                    break;
                } else if (((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i)).chatTheme.getEmoticon().equals(this.currentTheme.getEmoticon())) {
                    this.themesViewController.selectedItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i);
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.themesViewController.setSelectedPosition(i);
            }
            this.themesViewController.onDataLoaded();
        }
    }

    public Bitmap getEmojiThemeIcon(EmojiThemes emojiThemes, boolean z) {
        if (!z) {
            return this.emojiThemeIcon;
        }
        Bitmap bitmap = this.emojiThemeDarkIcons.get(emojiThemes.emoji);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            ArrayMap<String, int[]> arrayMap = qrColorsMap;
            int[] iArr = arrayMap.get(emojiThemes.emoji + "n");
            if (iArr != null) {
                if (this.tempMotionDrawable == null) {
                    this.tempMotionDrawable = new MotionBackgroundDrawable(0, 0, 0, 0, true);
                }
                this.tempMotionDrawable.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.tempMotionDrawable.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.tempMotionDrawable.draw(canvas);
            }
            canvas.drawBitmap(this.emojiThemeIcon, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            this.emojiThemeDarkIcons.put(emojiThemes.emoji, bitmap);
        }
        return bitmap;
    }

    private void onPatternLoaded(Bitmap bitmap, int i, boolean z) {
        if (bitmap != null) {
            this.currMotionDrawable.setPatternBitmap(i, bitmap, true);
            ValueAnimator valueAnimator = this.patternIntensityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.patternIntensityAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        QrActivity.this.lambda$onPatternLoaded$4(valueAnimator2);
                    }
                });
                this.patternIntensityAnimator.setDuration(250L);
                this.patternIntensityAnimator.start();
                return;
            }
            this.currMotionDrawable.setPatternAlpha(1.0f);
        }
    }

    public void lambda$onPatternLoaded$4(ValueAnimator valueAnimator) {
        this.currMotionDrawable.setPatternAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onItemSelected(EmojiThemes emojiThemes, int i, boolean z) {
        float f;
        this.selectedPosition = i;
        EmojiThemes emojiThemes2 = this.currentTheme;
        final ?? r0 = this.isCurrentThemeDark;
        this.currentTheme = emojiThemes;
        EmojiThemes.ThemeItem themeItem = emojiThemes.getThemeItem(r0 == true ? 1 : 0);
        ValueAnimator valueAnimator = this.patternAlphaAnimator;
        if (valueAnimator != null) {
            f = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.patternAlphaAnimator.cancel();
        } else {
            f = 1.0f;
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.currMotionDrawable;
        this.prevMotionDrawable = motionBackgroundDrawable;
        motionBackgroundDrawable.setIndeterminateAnimation(false);
        this.prevMotionDrawable.setAlpha(255);
        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable();
        this.currMotionDrawable = motionBackgroundDrawable2;
        motionBackgroundDrawable2.setCallback(this.backgroundView);
        this.currMotionDrawable.setColors(themeItem.patternBgColor, themeItem.patternBgGradientColor1, themeItem.patternBgGradientColor2, themeItem.patternBgGradientColor3);
        this.currMotionDrawable.setParentView(this.backgroundView);
        this.currMotionDrawable.setPatternAlpha(1.0f);
        this.currMotionDrawable.setIndeterminateAnimation(true);
        MotionBackgroundDrawable motionBackgroundDrawable3 = this.prevMotionDrawable;
        if (motionBackgroundDrawable3 != null) {
            this.currMotionDrawable.posAnimationProgress = motionBackgroundDrawable3.posAnimationProgress;
        }
        this.qrView.setPosAnimationProgress(this.currMotionDrawable.posAnimationProgress);
        TLRPC$WallPaper wallpaper = this.currentTheme.getWallpaper(r0);
        if (wallpaper != null) {
            this.currMotionDrawable.setPatternBitmap(wallpaper.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.currentTheme.loadWallpaper(r0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    QrActivity.this.lambda$onItemSelected$5(r0, elapsedRealtime, (Pair) obj);
                }

                @Override
                public void onError(TLRPC$TL_error tLRPC$TL_error) {
                    ResultCallback.CC.$default$onError(this, tLRPC$TL_error);
                }
            });
        } else {
            ChatThemeController.chatThemeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    QrActivity.this.lambda$onItemSelected$7();
                }
            });
        }
        MotionBackgroundDrawable motionBackgroundDrawable4 = this.currMotionDrawable;
        motionBackgroundDrawable4.setPatternColorFilter(motionBackgroundDrawable4.getPatternColor());
        ArrayMap<String, int[]> arrayMap = qrColorsMap;
        StringBuilder sb = new StringBuilder();
        sb.append(emojiThemes.emoji);
        sb.append(r0 != 0 ? "n" : "d");
        final int[] iArr = arrayMap.get(sb.toString());
        if (z) {
            this.currMotionDrawable.setAlpha(255);
            this.currMotionDrawable.setBackgroundAlpha(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.patternAlphaAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    QrActivity.this.lambda$onItemSelected$8(iArr, valueAnimator2);
                }
            });
            this.patternAlphaAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    int[] iArr2 = iArr;
                    if (iArr2 != null) {
                        System.arraycopy(iArr2, 0, QrActivity.this.prevQrColors, 0, 4);
                    }
                    QrActivity.this.prevMotionDrawable = null;
                    QrActivity.this.patternAlphaAnimator = null;
                    QrActivity.this.currMotionDrawable.setBackgroundAlpha(1.0f);
                    QrActivity.this.currMotionDrawable.setPatternAlpha(1.0f);
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                    if (iArr != null) {
                        System.arraycopy(new int[]{ColorUtils.blendARGB(QrActivity.this.prevQrColors[0], iArr[0], floatValue), ColorUtils.blendARGB(QrActivity.this.prevQrColors[1], iArr[1], floatValue), ColorUtils.blendARGB(QrActivity.this.prevQrColors[2], iArr[2], floatValue), ColorUtils.blendARGB(QrActivity.this.prevQrColors[3], iArr[3], floatValue)}, 0, QrActivity.this.prevQrColors, 0, 4);
                    }
                }
            });
            this.patternAlphaAnimator.setDuration((int) (f * 250.0f));
            this.patternAlphaAnimator.start();
        } else {
            if (iArr != null) {
                this.qrView.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
                System.arraycopy(iArr, 0, this.prevQrColors, 0, 4);
            }
            this.prevMotionDrawable = null;
            this.backgroundView.invalidate();
        }
        ActionBarLayout.ThemeAnimationSettings themeAnimationSettings = new ActionBarLayout.ThemeAnimationSettings(null, (this.isCurrentThemeDark ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme()).currentAccentId, this.isCurrentThemeDark, !z);
        themeAnimationSettings.applyTheme = false;
        themeAnimationSettings.onlyTopFragment = true;
        themeAnimationSettings.resourcesProvider = getResourceProvider();
        themeAnimationSettings.duration = (int) (f * 250.0f);
        if (z) {
            this.resourcesProvider.initColors(emojiThemes2, this.isCurrentThemeDark);
        } else {
            this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
        }
        themeAnimationSettings.afterStartDescriptionsAddedRunnable = new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$onItemSelected$9();
            }
        };
        this.parentLayout.animateThemedValues(themeAnimationSettings);
    }

    public void lambda$onItemSelected$5(boolean z, long j, Pair pair) {
        if (pair != null && this.currentTheme.getTlTheme(z ? 1 : 0) != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            if (longValue == this.currentTheme.getTlTheme(z).id && bitmap != null) {
                onPatternLoaded(bitmap, this.currMotionDrawable.getIntensity(), SystemClock.elapsedRealtime() - j > 150);
            }
        }
    }

    public void lambda$onItemSelected$7() {
        final Bitmap bitmap = SvgHelper.getBitmap((int) R.raw.default_pattern, this.backgroundView.getWidth(), this.backgroundView.getHeight(), -16777216);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$onItemSelected$6(bitmap);
            }
        });
    }

    public void lambda$onItemSelected$6(Bitmap bitmap) {
        onPatternLoaded(bitmap, 34, true);
    }

    public void lambda$onItemSelected$8(int[] iArr, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MotionBackgroundDrawable motionBackgroundDrawable = this.prevMotionDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBackgroundAlpha(1.0f);
            this.prevMotionDrawable.setPatternAlpha(1.0f - floatValue);
        }
        this.currMotionDrawable.setBackgroundAlpha(floatValue);
        this.currMotionDrawable.setPatternAlpha(floatValue);
        if (iArr != null) {
            this.qrView.setColors(ColorUtils.blendARGB(this.prevQrColors[0], iArr[0], floatValue), ColorUtils.blendARGB(this.prevQrColors[1], iArr[1], floatValue), ColorUtils.blendARGB(this.prevQrColors[2], iArr[2], floatValue), ColorUtils.blendARGB(this.prevQrColors[3], iArr[3], floatValue));
        }
        this.backgroundView.invalidate();
    }

    public void lambda$onItemSelected$9() {
        this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
    }

    private void performShare() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f = min;
        if ((max * 1.0f) / f > 1.92f) {
            max = (int) (f * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.themeLayout.setVisibility(8);
        this.closeImageView.setVisibility(8);
        this.logoImageView.stopAnimation();
        RLottieDrawable animatedDrawable = this.logoImageView.getAnimatedDrawable();
        int currentFrame = animatedDrawable.getCurrentFrame();
        animatedDrawable.setCurrentFrame(33, false);
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        canvas.setBitmap(null);
        this.themeLayout.setVisibility(0);
        this.closeImageView.setVisibility(0);
        animatedDrawable.setCurrentFrame(currentFrame, false);
        this.logoImageView.playAnimation();
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString("InviteByQRCode", R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$performShare$10();
            }
        }, 500L);
    }

    public void lambda$performShare$10() {
        this.themesViewController.shareButton.setClickable(true);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions = super.getThemeDescriptions();
        themeDescriptions.addAll(this.themesViewController.getThemeDescriptions());
        themeDescriptions.add(new ThemeDescription(this.themesViewController.shareButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                QrActivity.this.lambda$getThemeDescriptions$11();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, "featuredStickers_addButton"));
        themeDescriptions.add(new ThemeDescription(this.themesViewController.shareButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "featuredStickers_addButtonPressed"));
        Iterator<ThemeDescription> it = themeDescriptions.iterator();
        while (it.hasNext()) {
            it.next().resourcesProvider = getResourceProvider();
        }
        return themeDescriptions;
    }

    public void lambda$getThemeDescriptions$11() {
        setNavigationBarColor(getThemedColor("windowBackgroundGray"));
    }

    public class ThemeResourcesProvider implements Theme.ResourcesProvider {
        private HashMap<String, Integer> colors;

        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        }

        @Override
        public int getColorOrDefault(String str) {
            return getColor(str);
        }

        @Override
        public Integer getCurrentColor(String str) {
            Integer color;
            color = getColor(str);
            return color;
        }

        @Override
        public Drawable getDrawable(String str) {
            return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
        }

        @Override
        public Paint getPaint(String str) {
            return Theme.ResourcesProvider.CC.$default$getPaint(this, str);
        }

        @Override
        public boolean hasGradientService() {
            return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
        }

        @Override
        public void setAnimatedColor(String str, int i) {
            Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, str, i);
        }

        private ThemeResourcesProvider() {
        }

        void initColors(EmojiThemes emojiThemes, boolean z) {
            this.colors = emojiThemes.createColors(((BaseFragment) QrActivity.this).currentAccount, z ? 1 : 0);
        }

        @Override
        public Integer getColor(String str) {
            HashMap<String, Integer> hashMap = this.colors;
            if (hashMap != null) {
                return hashMap.get(str);
            }
            return null;
        }
    }

    public static class QrView extends View {
        private Bitmap backgroundBitmap;
        private final Paint bitmapGradientPaint;
        private QrCenterChangedListener centerChangedListener;
        private Bitmap contentBitmap;
        private final MotionBackgroundDrawable gradientDrawable;
        private final BitmapShader gradientShader;
        private boolean isPhone;
        private String link;
        private String username;
        private static final float SHADOW_SIZE = AndroidUtilities.dp(2.0f);
        private static final float RADIUS = AndroidUtilities.dp(20.0f);

        public interface QrCenterChangedListener {
            void onCenterChanged(int i, int i2, int i3, int i4);
        }

        QrView(Context context) {
            super(context);
            MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
            this.gradientDrawable = motionBackgroundDrawable;
            Paint paint = new Paint(1);
            this.bitmapGradientPaint = paint;
            motionBackgroundDrawable.setIndeterminateAnimation(true);
            motionBackgroundDrawable.setParentView(this);
            Bitmap bitmap = motionBackgroundDrawable.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.gradientShader = bitmapShader;
            paint.setShader(bitmapShader);
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (i != i3 || i2 != i4) {
                Bitmap bitmap = this.backgroundBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.backgroundBitmap = null;
                }
                Paint paint = new Paint(1);
                paint.setColor(-1);
                float f = SHADOW_SIZE;
                paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, f, AndroidUtilities.LIGHT_STATUS_BAR_OVERLAY);
                this.backgroundBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.backgroundBitmap);
                RectF rectF = new RectF(f, f, i - f, getHeight() - f);
                float f2 = RADIUS;
                canvas.drawRoundRect(rectF, f2, f2, paint);
                prepareContent(i, i2);
                float max = Math.max((getWidth() * 1.0f) / this.gradientDrawable.getBitmap().getWidth(), (getHeight() * 1.0f) / this.gradientDrawable.getBitmap().getHeight());
                Matrix matrix = new Matrix();
                matrix.setScale(max, max);
                this.gradientShader.setLocalMatrix(matrix);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Bitmap bitmap = this.backgroundBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            Bitmap bitmap2 = this.contentBitmap;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.bitmapGradientPaint);
                this.gradientDrawable.updateAnimation(true);
            }
        }

        void setCenterChangedListener(QrCenterChangedListener qrCenterChangedListener) {
            this.centerChangedListener = qrCenterChangedListener;
        }

        void setData(String str, String str2, boolean z) {
            this.username = str2;
            this.isPhone = z;
            this.link = str;
            prepareContent(getWidth(), getHeight());
            invalidate();
        }

        void setColors(int i, int i2, int i3, int i4) {
            this.gradientDrawable.setColors(i, i2, i3, i4);
            invalidate();
        }

        void setPosAnimationProgress(float f) {
            this.gradientDrawable.posAnimationProgress = f;
        }

        private void prepareContent(int r34, int r35) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.QrActivity.QrView.prepareContent(int, int):void");
        }
    }

    public class ThemeListViewController implements NotificationCenter.NotificationCenterDelegate {
        public final ChatThemeBottomSheet.Adapter adapter;
        private final Drawable backgroundDrawable;
        private final View bottomShadow;
        private View changeDayNightView;
        private ValueAnimator changeDayNightViewAnimator;
        private float changeDayNightViewProgress;
        private final RLottieDrawable darkThemeDrawable;
        private final RLottieImageView darkThemeView;
        private final BaseFragment fragment;
        protected boolean isLightDarkChangeAnimation;
        private OnItemSelectedListener itemSelectedListener;
        private LinearLayoutManager layoutManager;
        private boolean prevIsPortrait;
        public final FlickerLoadingView progressView;
        private final RecyclerListView recyclerView;
        public final FrameLayout rootLayout;
        private final LinearSmoothScroller scroller;
        public ChatThemeBottomSheet.ChatThemeItem selectedItem;
        public final TextView shareButton;
        public final TextView titleView;
        private final View topShadow;
        private final Window window;
        private final Paint backgroundPaint = new Paint(1);
        public int prevSelectedPosition = -1;
        private boolean forceDark = !Theme.getActiveTheme().isDark();

        protected void setDarkTheme(boolean z) {
        }

        public ThemeListViewController(BaseFragment baseFragment, Window window) {
            this.fragment = baseFragment;
            this.window = window;
            Activity parentActivity = baseFragment.getParentActivity();
            this.scroller = new LinearSmoothScroller(this, parentActivity, QrActivity.this) {
                @Override
                public int calculateTimeForScrolling(int i) {
                    return super.calculateTimeForScrolling(i) * 6;
                }
            };
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.backgroundDrawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(baseFragment.getThemedColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
            FrameLayout frameLayout = new FrameLayout(parentActivity, QrActivity.this, baseFragment) {
                private final Rect backgroundPadding;
                final BaseFragment val$fragment;

                {
                    this.val$fragment = baseFragment;
                    Rect rect = new Rect();
                    this.backgroundPadding = rect;
                    ThemeListViewController.this.backgroundPaint.setColor(baseFragment.getThemedColor("windowBackgroundWhite"));
                    ThemeListViewController.this.backgroundDrawable.setCallback(this);
                    ThemeListViewController.this.backgroundDrawable.getPadding(rect);
                    setPadding(0, rect.top + AndroidUtilities.dp(8.0f), 0, rect.bottom);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    Point point = AndroidUtilities.displaySize;
                    boolean z = point.x < point.y;
                    int dp = AndroidUtilities.dp(12.0f);
                    if (z) {
                        ThemeListViewController.this.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                        ThemeListViewController.this.recyclerView.setPadding(dp, 0, dp, 0);
                        ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        ThemeListViewController.this.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        ThemeListViewController.this.recyclerView.setPadding(dp, dp / 2, dp, dp);
                        ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                    if (z) {
                        ThemeListViewController.this.bottomShadow.setVisibility(8);
                        ThemeListViewController.this.topShadow.setVisibility(8);
                    } else {
                        ThemeListViewController.this.bottomShadow.setVisibility(0);
                        ThemeListViewController.this.bottomShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, 80.0f));
                        ThemeListViewController.this.topShadow.setVisibility(0);
                        ThemeListViewController.this.topShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                    }
                    if (ThemeListViewController.this.prevIsPortrait != z) {
                        RecyclerListView recyclerListView = ThemeListViewController.this.recyclerView;
                        ThemeListViewController themeListViewController = ThemeListViewController.this;
                        recyclerListView.setLayoutManager(themeListViewController.layoutManager = themeListViewController.getLayoutManager(z));
                        ThemeListViewController.this.recyclerView.requestLayout();
                        ThemeListViewController themeListViewController2 = ThemeListViewController.this;
                        int i3 = themeListViewController2.prevSelectedPosition;
                        if (i3 != -1) {
                            themeListViewController2.setSelectedPosition(i3);
                        }
                        ThemeListViewController.this.prevIsPortrait = z;
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    if (ThemeListViewController.this.prevIsPortrait) {
                        ThemeListViewController.this.backgroundDrawable.setBounds(-this.backgroundPadding.left, 0, getWidth() + this.backgroundPadding.right, getHeight());
                        ThemeListViewController.this.backgroundDrawable.draw(canvas);
                    } else {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth() + AndroidUtilities.dp(14.0f), getHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), ThemeListViewController.this.backgroundPaint);
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                protected boolean verifyDrawable(Drawable drawable) {
                    return drawable == ThemeListViewController.this.backgroundDrawable || super.verifyDrawable(drawable);
                }
            };
            this.rootLayout = frameLayout;
            TextView textView = new TextView(parentActivity);
            this.titleView = textView;
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setTextColor(baseFragment.getThemedColor("dialogTextBlack"));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
            int themedColor = baseFragment.getThemedColor("featuredStickers_addButton");
            int dp = AndroidUtilities.dp(28.0f);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.sun_outline, "2131558525", dp, dp, false, null);
            this.darkThemeDrawable = rLottieDrawable;
            setForceDark(Theme.getActiveTheme().isDark(), false);
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            RLottieImageView rLottieImageView = new RLottieImageView(parentActivity, QrActivity.this) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    if (QrActivity.this.isCurrentThemeDark) {
                        accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToDayTheme", R.string.AccDescrSwitchToDayTheme));
                    } else {
                        accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToNightTheme", R.string.AccDescrSwitchToNightTheme));
                    }
                }
            };
            this.darkThemeView = rLottieImageView;
            rLottieImageView.setAnimation(rLottieDrawable);
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    QrActivity.ThemeListViewController.this.lambda$new$0(view);
                }
            });
            rLottieImageView.setAlpha(0.0f);
            rLottieImageView.setVisibility(4);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(parentActivity, baseFragment.getResourceProvider());
            this.progressView = flickerLoadingView;
            flickerLoadingView.setVisibility(0);
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
            Point point = AndroidUtilities.displaySize;
            this.prevIsPortrait = point.x < point.y;
            RecyclerListView recyclerListView = new RecyclerListView(parentActivity);
            this.recyclerView = recyclerListView;
            ChatThemeBottomSheet.Adapter adapter = new ChatThemeBottomSheet.Adapter(((BaseFragment) QrActivity.this).currentAccount, QrActivity.this.resourcesProvider, 2);
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            recyclerListView.setClipChildren(false);
            recyclerListView.setClipToPadding(false);
            recyclerListView.setItemAnimator(null);
            recyclerListView.setNestedScrollingEnabled(false);
            LinearLayoutManager layoutManager = getLayoutManager(this.prevIsPortrait);
            this.layoutManager = layoutManager;
            recyclerListView.setLayoutManager(layoutManager);
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    QrActivity.ThemeListViewController.this.onItemClicked(view, i);
                }
            });
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(QrActivity.this) {
                private int yScroll = 0;

                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    this.yScroll += i2;
                    ThemeListViewController.this.topShadow.setAlpha((this.yScroll * 1.0f) / AndroidUtilities.dp(6.0f));
                }
            });
            frameLayout.addView(recyclerListView);
            View view = new View(parentActivity);
            this.topShadow = view;
            view.setAlpha(0.0f);
            view.setBackground(ContextCompat.getDrawable(parentActivity, R.drawable.shadowdown));
            view.setRotation(180.0f);
            frameLayout.addView(view);
            View view2 = new View(parentActivity);
            this.bottomShadow = view2;
            view2.setBackground(ContextCompat.getDrawable(parentActivity, R.drawable.shadowdown));
            frameLayout.addView(view2);
            TextView textView2 = new TextView(parentActivity);
            this.shareButton = textView2;
            textView2.setBackground(Theme.AdaptiveRipple.filledRect(baseFragment.getThemedColor("featuredStickers_addButton"), 6.0f));
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setText(LocaleController.getString("ShareQrCode", R.string.ShareQrCode));
            textView2.setTextColor(baseFragment.getThemedColor("featuredStickers_buttonText"));
            textView2.setTextSize(1, 15.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            frameLayout.addView(textView2);
        }

        public void lambda$new$0(View view) {
            if (this.changeDayNightViewAnimator == null) {
                setupLightDarkTheme(!this.forceDark);
            }
        }

        public void onCreate() {
            ChatThemeController.preloadAllWallpaperThumbs(true);
            ChatThemeController.preloadAllWallpaperThumbs(false);
            ChatThemeController.preloadAllWallpaperImages(true);
            ChatThemeController.preloadAllWallpaperImages(false);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        @SuppressLint({"NotifyDataSetChanged"})
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.adapter.notifyDataSetChanged();
            }
        }

        public void onDestroy() {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        public void setItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
            this.itemSelectedListener = onItemSelectedListener;
        }

        public void onDataLoaded() {
            this.darkThemeView.setAlpha(0.0f);
            this.darkThemeView.animate().alpha(1.0f).setDuration(150L).start();
            this.darkThemeView.setVisibility(0);
            this.progressView.animate().alpha(0.0f).setListener(new HideViewAfterAnimation(this.progressView)).setDuration(150L).start();
            this.recyclerView.setAlpha(0.0f);
            this.recyclerView.animate().alpha(1.0f).setDuration(150L).start();
        }

        public void setSelectedPosition(int i) {
            this.prevSelectedPosition = i;
            this.adapter.setSelectedItem(i);
            if (i > 0 && i < this.adapter.items.size() / 2) {
                i--;
            }
            this.layoutManager.scrollToPositionWithOffset(Math.min(i, this.adapter.items.size() - 1), 0);
        }

        public void onItemClicked(View view, final int i) {
            if (this.adapter.items.get(i) != this.selectedItem && this.changeDayNightView == null) {
                this.isLightDarkChangeAnimation = false;
                this.selectedItem = this.adapter.items.get(i);
                this.adapter.setSelectedItem(i);
                this.rootLayout.postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        QrActivity.ThemeListViewController.this.lambda$onItemClicked$1(i);
                    }
                }, 100L);
                for (int i2 = 0; i2 < this.recyclerView.getChildCount(); i2++) {
                    ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i2);
                    if (themeSmallPreviewView != view) {
                        themeSmallPreviewView.cancelAnimation();
                    }
                }
                if (!this.adapter.items.get(i).chatTheme.showAsDefaultStub) {
                    ((ThemeSmallPreviewView) view).playEmojiAnimation();
                }
                OnItemSelectedListener onItemSelectedListener = this.itemSelectedListener;
                if (onItemSelectedListener != null) {
                    onItemSelectedListener.onItemSelected(this.selectedItem.chatTheme, i);
                }
            }
        }

        public void lambda$onItemClicked$1(int i) {
            int i2;
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            if (layoutManager != null) {
                if (i > this.prevSelectedPosition) {
                    i2 = Math.min(i + 1, this.adapter.items.size() - 1);
                } else {
                    i2 = Math.max(i - 1, 0);
                }
                this.scroller.setTargetPosition(i2);
                layoutManager.startSmoothScroll(this.scroller);
            }
            this.prevSelectedPosition = i;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        private void setupLightDarkTheme(final boolean z) {
            ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            FrameLayout frameLayout = (FrameLayout) this.window.getDecorView();
            final Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
            final Canvas canvas = new Canvas(createBitmap);
            this.darkThemeView.setAlpha(0.0f);
            ((FrameLayout) this.fragment.getParentActivity().getWindow().getDecorView()).draw(canvas);
            frameLayout.draw(canvas);
            this.darkThemeView.setAlpha(1.0f);
            final Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            final Paint paint2 = new Paint(1);
            paint2.setFilterBitmap(true);
            int[] iArr = new int[2];
            this.darkThemeView.getLocationInWindow(iArr);
            final float f = iArr[0];
            final float f2 = iArr[1];
            final float measuredWidth = f + (this.darkThemeView.getMeasuredWidth() / 2.0f);
            final float measuredHeight = f2 + (this.darkThemeView.getMeasuredHeight() / 2.0f);
            final float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
            this.changeDayNightView = new View(this.fragment.getParentActivity()) {
                @Override
                protected void onDraw(Canvas canvas2) {
                    super.onDraw(canvas2);
                    if (z) {
                        if (ThemeListViewController.this.changeDayNightViewProgress > 0.0f) {
                            canvas.drawCircle(measuredWidth, measuredHeight, max * ThemeListViewController.this.changeDayNightViewProgress, paint);
                        }
                        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
                    } else {
                        canvas2.drawCircle(measuredWidth, measuredHeight, max * (1.0f - ThemeListViewController.this.changeDayNightViewProgress), paint2);
                    }
                    canvas2.save();
                    canvas2.translate(f, f2);
                    ThemeListViewController.this.darkThemeView.draw(canvas2);
                    canvas2.restore();
                }
            };
            this.changeDayNightViewProgress = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.changeDayNightViewAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    QrActivity.ThemeListViewController.this.lambda$setupLightDarkTheme$2(valueAnimator2);
                }
            });
            this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ThemeListViewController.this.changeDayNightView != null) {
                        if (ThemeListViewController.this.changeDayNightView.getParent() != null) {
                            ((ViewGroup) ThemeListViewController.this.changeDayNightView.getParent()).removeView(ThemeListViewController.this.changeDayNightView);
                        }
                        ThemeListViewController.this.changeDayNightView = null;
                    }
                    ThemeListViewController.this.changeDayNightViewAnimator = null;
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
                    QrActivity.ThemeListViewController.this.lambda$setupLightDarkTheme$3(z);
                }
            });
        }

        public void lambda$setupLightDarkTheme$2(ValueAnimator valueAnimator) {
            this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.changeDayNightView.invalidate();
        }

        public void lambda$setupLightDarkTheme$3(boolean z) {
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (!(adapter == null || adapter.items == null)) {
                setForceDark(z, true);
                if (this.selectedItem != null) {
                    this.isLightDarkChangeAnimation = true;
                    setDarkTheme(z);
                }
                if (this.adapter.items != null) {
                    for (int i = 0; i < this.adapter.items.size(); i++) {
                        this.adapter.items.get(i).themeIndex = z ? 1 : 0;
                        this.adapter.items.get(i).icon = QrActivity.this.getEmojiThemeIcon(this.adapter.items.get(i).chatTheme, z);
                    }
                    QrActivity.this.tempMotionDrawable = null;
                    this.adapter.notifyDataSetChanged();
                }
            }
        }

        public void setForceDark(boolean z, boolean z2) {
            if (this.forceDark != z) {
                this.forceDark = z;
                int framesCount = z ? this.darkThemeDrawable.getFramesCount() - 1 : 0;
                if (z2) {
                    this.darkThemeDrawable.setCustomEndFrame(framesCount);
                    RLottieImageView rLottieImageView = this.darkThemeView;
                    if (rLottieImageView != null) {
                        rLottieImageView.playAnimation();
                        return;
                    }
                    return;
                }
                this.darkThemeDrawable.setCustomEndFrame(framesCount);
                this.darkThemeDrawable.setCurrentFrame(framesCount, false, true);
                RLottieImageView rLottieImageView2 = this.darkThemeView;
                if (rLottieImageView2 != null) {
                    rLottieImageView2.invalidate();
                }
            }
        }

        public LinearLayoutManager getLayoutManager(boolean z) {
            if (z) {
                return new LinearLayoutManager(this.fragment.getParentActivity(), 0, false);
            }
            return new GridLayoutManager(this.fragment.getParentActivity(), 3, 1, false);
        }

        public void onAnimationStart() {
            List<ChatThemeBottomSheet.ChatThemeItem> list;
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (!(adapter == null || (list = adapter.items) == null)) {
                for (ChatThemeBottomSheet.ChatThemeItem chatThemeItem : list) {
                    chatThemeItem.themeIndex = this.forceDark ? 1 : 0;
                }
            }
            if (!this.isLightDarkChangeAnimation) {
                setItemsAnimationProgress(1.0f);
            }
        }

        public void setItemsAnimationProgress(float f) {
            for (int i = 0; i < this.adapter.getItemCount(); i++) {
                this.adapter.items.get(i).animationProgress = f;
            }
        }

        public void onAnimationEnd() {
            this.isLightDarkChangeAnimation = false;
        }

        public ArrayList<ThemeDescription> getThemeDescriptions() {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
                private boolean isAnimationStarted = false;

                @Override
                public void didSetColor() {
                }

                @Override
                public void onAnimationProgress(float f) {
                    if (f == 0.0f && !this.isAnimationStarted) {
                        ThemeListViewController.this.onAnimationStart();
                        this.isAnimationStarted = true;
                    }
                    ThemeListViewController.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ThemeListViewController.this.fragment.getThemedColor("featuredStickers_addButton"), PorterDuff.Mode.MULTIPLY));
                    ThemeListViewController themeListViewController = ThemeListViewController.this;
                    if (themeListViewController.isLightDarkChangeAnimation) {
                        themeListViewController.setItemsAnimationProgress(f);
                    }
                    if (f == 1.0f && this.isAnimationStarted) {
                        ThemeListViewController themeListViewController2 = ThemeListViewController.this;
                        themeListViewController2.isLightDarkChangeAnimation = false;
                        themeListViewController2.onAnimationEnd();
                        this.isAnimationStarted = false;
                    }
                }
            };
            ArrayList<ThemeDescription> arrayList = new ArrayList<>();
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUND, null, this.backgroundPaint, null, null, "dialogBackground"));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, new Drawable[]{this.backgroundDrawable}, themeDescriptionDelegate, "dialogBackground"));
            arrayList.add(new ThemeDescription(this.titleView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogTextBlack"));
            arrayList.add(new ThemeDescription(this.recyclerView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ThemeSmallPreviewView.class}, null, null, null, "dialogBackgroundGray"));
            Iterator<ThemeDescription> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().resourcesProvider = this.fragment.getResourceProvider();
            }
            return arrayList;
        }
    }
}
