package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
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
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EdgeToEdgeSupportMode;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.QrActivity;

public class QrActivity extends BaseFragment {
    private static List cachedThemes;
    private static boolean firstOpen;
    private static final ArrayMap qrColorsMap;
    private BackupImageView avatarImageView;
    private View backgroundView;
    private long chatId;
    private ImageView closeImageView;
    private MotionBackgroundDrawable currMotionDrawable;
    private EmojiThemes currentTheme;
    private final ArrayMap emojiThemeDarkIcons;
    private Bitmap emojiThemeIcon;
    private final EmojiThemes homeTheme;
    private Insets insets;
    private boolean isCurrentThemeDark;
    private boolean isFragmentViewPortrait;
    private RLottieImageView logoImageView;
    private Bitmap logoOptimal;
    private final Rect logoRect;
    private ValueAnimator patternAlphaAnimator;
    private ValueAnimator patternIntensityAnimator;
    private MotionBackgroundDrawable prevMotionDrawable;
    private int[] prevQrColors;
    private int prevSystemUiVisibility;
    private QrView qrView;
    private final ThemeResourcesProvider resourcesProvider;
    private int selectedPosition;
    private MotionBackgroundDrawable tempMotionDrawable;
    private FrameLayout themeLayout;
    private ThemeListViewController themesViewController;
    private long userId;

    interface OnItemSelectedListener {
        void onItemSelected(EmojiThemes emojiThemes, int i);
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
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
        firstOpen = true;
    }

    public QrActivity(Bundle bundle) {
        super(bundle);
        this.resourcesProvider = new ThemeResourcesProvider();
        EmojiThemes emojiThemesCreateHomeQrTheme = EmojiThemes.createHomeQrTheme(this.currentAccount);
        this.homeTheme = emojiThemesCreateHomeQrTheme;
        this.logoRect = new Rect();
        this.emojiThemeDarkIcons = new ArrayMap();
        this.prevQrColors = null;
        this.currMotionDrawable = new MotionBackgroundDrawable();
        this.currentTheme = emojiThemesCreateHomeQrTheme;
        this.selectedPosition = -1;
        this.insets = Insets.NONE;
    }

    @Override
    public boolean onFragmentCreate() {
        this.userId = this.arguments.getLong("user_id");
        this.chatId = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public android.view.View createView(android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.QrActivity.createView(android.content.Context):android.view.View");
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

    public void lambda$createView$3(View view) throws IOException {
        this.themesViewController.shareButton.setClickable(false);
        performShare();
    }

    public void lambda$createView$4(View view) {
        if (getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            openCameraScanActivity(this);
        }
    }

    public void lambda$createView$6() {
        this.homeTheme.loadPreviewColors(this.currentAccount);
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$5();
            }
        }, 17L);
    }

    public void lambda$createView$5() {
        onItemSelected(this.currentTheme, 0, true);
        RLottieDrawable animatedDrawable = this.logoImageView.getAnimatedDrawable();
        if (this.logoOptimal != null || animatedDrawable == null) {
            return;
        }
        this.logoOptimal = Bitmap.createBitmap(animatedDrawable.getIntrinsicWidth(), animatedDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        animatedDrawable.prepareForGenerateCache();
        animatedDrawable.setGeneratingFrame(33);
        animatedDrawable.getNextFrame(this.logoOptimal);
        animatedDrawable.releaseForGenerateCache();
    }

    public void lambda$createView$7() {
        firstOpen = false;
        List list = cachedThemes;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(this.currentAccount).requestAllChatThemes(new ResultCallback() {
                @Override
                public void onError(Throwable th) {
                    ResultCallback.CC.$default$onError(this, th);
                }

                @Override
                public void onComplete(List list2) {
                    QrActivity.this.onDataLoaded(list2);
                    List unused = QrActivity.cachedThemes = list2;
                }

                @Override
                public void onError(TLRPC.TL_error tL_error) {
                    Toast.makeText(QrActivity.this.getParentActivity(), tL_error.text, 0).show();
                }
            }, true);
        } else {
            onDataLoaded(cachedThemes);
        }
    }

    private boolean phoneIsPublic() {
        char c;
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        if (privacyRules == null) {
            return false;
        }
        for (int i = 0; i < privacyRules.size(); i++) {
            TLRPC.PrivacyRule privacyRule = privacyRules.get(i);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                c = 0;
                break;
            }
            if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                break;
            }
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                c = 1;
                break;
            }
        }
        c = 2;
        if (c == 2) {
            ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules2 == null || privacyRules2.size() == 0) {
                return true;
            }
            for (int i2 = 0; i2 < privacyRules2.size(); i2++) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i2);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll) {
                    return true;
                }
                if ((privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                    return false;
                }
            }
        }
        return c == 0 || c == 1;
    }

    @Override
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
            Bitmap bitmap = (Bitmap) this.emojiThemeDarkIcons.valueAt(i);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.emojiThemeDarkIcons.clear();
        restoreScreenSettings();
        super.onFragmentDestroy();
    }

    private void applyScreenSettings() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1028);
        }
    }

    private void restoreScreenSettings() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility);
        }
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    public void onDataLoaded(List list) {
        if (list == null || list.isEmpty() || this.themesViewController == null) {
            return;
        }
        int i = 0;
        list.set(0, this.homeTheme);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            EmojiThemes emojiThemes = (EmojiThemes) list.get(i2);
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
            } else {
                if (ThemeKey.equals(((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i)).chatTheme.getThemeKey(), this.currentTheme.getThemeKey())) {
                    this.themesViewController.selectedItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i);
                    break;
                }
                i++;
            }
        }
        if (i != -1) {
            this.themesViewController.setSelectedPosition(i);
        }
        this.themesViewController.onDataLoaded();
    }

    public Bitmap getEmojiThemeIcon(EmojiThemes emojiThemes, boolean z) {
        if (z) {
            Bitmap bitmapCreateBitmap = (Bitmap) this.emojiThemeDarkIcons.get(emojiThemes.emoji);
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                int[] iArr = (int[]) qrColorsMap.get(emojiThemes.emoji + "n");
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
                this.emojiThemeDarkIcons.put(emojiThemes.emoji, bitmapCreateBitmap);
            }
            return bitmapCreateBitmap;
        }
        return this.emojiThemeIcon;
    }

    private void onPatternLoaded(Bitmap bitmap, int i, boolean z) {
        if (bitmap != null) {
            this.currMotionDrawable.setPatternBitmap(i, bitmap, true);
            ValueAnimator valueAnimator = this.patternIntensityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.patternIntensityAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$onPatternLoaded$8(valueAnimator2);
                    }
                });
                this.patternIntensityAnimator.setDuration(250L);
                this.patternIntensityAnimator.start();
                return;
            }
            this.currMotionDrawable.setPatternAlpha(1.0f);
        }
    }

    public void lambda$onPatternLoaded$8(ValueAnimator valueAnimator) {
        this.currMotionDrawable.setPatternAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onItemSelected(EmojiThemes emojiThemes, int i, final boolean z) {
        float fMax;
        this.selectedPosition = i;
        final EmojiThemes emojiThemes2 = this.currentTheme;
        final boolean z2 = this.isCurrentThemeDark;
        this.currentTheme = emojiThemes;
        EmojiThemes.ThemeItem themeItem = emojiThemes.getThemeItem(z2 ? 1 : 0);
        ValueAnimator valueAnimator = this.patternAlphaAnimator;
        if (valueAnimator != null) {
            fMax = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.patternAlphaAnimator.cancel();
        } else {
            fMax = 1.0f;
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
        TLRPC.WallPaper wallpaper = this.currentTheme.getWallpaper(z2 ? 1 : 0);
        if (wallpaper != null) {
            this.currMotionDrawable.setPatternBitmap(wallpaper.settings.intensity);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.currentTheme.loadWallpaper(z2 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    this.f$0.lambda$onItemSelected$9(z2, jElapsedRealtime, (Pair) obj);
                }

                @Override
                public void onError(Throwable th) {
                    ResultCallback.CC.$default$onError(this, th);
                }

                @Override
                public void onError(TLRPC.TL_error tL_error) {
                    ResultCallback.CC.$default$onError(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemSelected$11();
                }
            }, 35L);
        }
        MotionBackgroundDrawable motionBackgroundDrawable4 = this.currMotionDrawable;
        motionBackgroundDrawable4.setPatternColorFilter(motionBackgroundDrawable4.getPatternColor());
        ArrayMap arrayMap = qrColorsMap;
        StringBuilder sb = new StringBuilder();
        sb.append(emojiThemes.emoji);
        sb.append(z2 ? "n" : "d");
        final int[] iArr = (int[]) arrayMap.get(sb.toString());
        if (z) {
            if (this.prevQrColors == null) {
                int[] iArr2 = new int[4];
                this.prevQrColors = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.currMotionDrawable.setAlpha(255);
            this.currMotionDrawable.setBackgroundAlpha(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.patternAlphaAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$onItemSelected$12(iArr, valueAnimator2);
                }
            });
            this.patternAlphaAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    int[] iArr3 = iArr;
                    if (iArr3 != null) {
                        System.arraycopy(iArr3, 0, QrActivity.this.prevQrColors, 0, 4);
                    }
                    QrActivity.this.prevMotionDrawable = null;
                    QrActivity.this.patternAlphaAnimator = null;
                    QrActivity.this.currMotionDrawable.setBackgroundAlpha(1.0f);
                    QrActivity.this.currMotionDrawable.setPatternAlpha(1.0f);
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    float fFloatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                    if (iArr != null) {
                        System.arraycopy(new int[]{ColorUtils.blendARGB(QrActivity.this.prevQrColors[0], iArr[0], fFloatValue), ColorUtils.blendARGB(QrActivity.this.prevQrColors[1], iArr[1], fFloatValue), ColorUtils.blendARGB(QrActivity.this.prevQrColors[2], iArr[2], fFloatValue), ColorUtils.blendARGB(QrActivity.this.prevQrColors[3], iArr[3], fFloatValue)}, 0, QrActivity.this.prevQrColors, 0, 4);
                    }
                }
            });
            this.patternAlphaAnimator.setDuration((int) (fMax * 250.0f));
            this.patternAlphaAnimator.start();
        } else {
            if (iArr != null) {
                this.qrView.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
                System.arraycopy(iArr, 0, this.prevQrColors, 0, 4);
            }
            this.prevMotionDrawable = null;
            this.backgroundView.invalidate();
        }
        final INavigationLayout.ThemeAnimationSettings themeAnimationSettings = new INavigationLayout.ThemeAnimationSettings(null, (this.isCurrentThemeDark ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme()).currentAccentId, this.isCurrentThemeDark, !z);
        themeAnimationSettings.applyTheme = false;
        themeAnimationSettings.onlyTopFragment = true;
        themeAnimationSettings.resourcesProvider = getResourceProvider();
        themeAnimationSettings.duration = (int) (fMax * 250.0f);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onItemSelected$14(z, emojiThemes2, themeAnimationSettings);
            }
        });
    }

    public void lambda$onItemSelected$9(boolean z, long j, Pair pair) {
        long themeId = this.currentTheme.getThemeId(z ? 1 : 0);
        if (pair == null || themeId == 0) {
            return;
        }
        long jLongValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((WallpaperBitmapHolder) pair.second).bitmap;
        if (jLongValue != themeId || bitmap == null) {
            return;
        }
        onPatternLoaded(bitmap, this.currMotionDrawable.getIntensity(), SystemClock.elapsedRealtime() - j > 150);
    }

    public void lambda$onItemSelected$11() {
        final Bitmap bitmap = SvgHelper.getBitmap(R.raw.default_pattern, this.backgroundView.getWidth(), this.backgroundView.getHeight(), -16777216);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onItemSelected$10(bitmap);
            }
        });
    }

    public void lambda$onItemSelected$10(Bitmap bitmap) {
        onPatternLoaded(bitmap, 34, true);
    }

    public void lambda$onItemSelected$12(int[] iArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MotionBackgroundDrawable motionBackgroundDrawable = this.prevMotionDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBackgroundAlpha(1.0f);
            this.prevMotionDrawable.setPatternAlpha(1.0f - fFloatValue);
        }
        this.currMotionDrawable.setBackgroundAlpha(fFloatValue);
        this.currMotionDrawable.setPatternAlpha(fFloatValue);
        if (iArr != null) {
            this.qrView.setColors(ColorUtils.blendARGB(this.prevQrColors[0], iArr[0], fFloatValue), ColorUtils.blendARGB(this.prevQrColors[1], iArr[1], fFloatValue), ColorUtils.blendARGB(this.prevQrColors[2], iArr[2], fFloatValue), ColorUtils.blendARGB(this.prevQrColors[3], iArr[3], fFloatValue));
        }
        this.backgroundView.invalidate();
    }

    public void lambda$onItemSelected$14(boolean z, EmojiThemes emojiThemes, INavigationLayout.ThemeAnimationSettings themeAnimationSettings) {
        if (z) {
            this.resourcesProvider.initColors(emojiThemes, this.isCurrentThemeDark);
        } else {
            this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
        }
        themeAnimationSettings.afterStartDescriptionsAddedRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onItemSelected$13();
            }
        };
        this.parentLayout.animateThemedValues(themeAnimationSettings, null);
        LinearLayout linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            linearLayout.setBackground(Theme.AdaptiveRipple.createRect(ColorUtils.setAlphaComponent(Theme.AdaptiveRipple.calcRippleColor(getThemedColor(Theme.key_featuredStickers_addButton)), 25), 6.0f));
        }
    }

    public void lambda$onItemSelected$13() {
        this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
    }

    public void performShare() throws IOException {
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        float f = iMin;
        if ((iMax * 1.0f) / f > 1.92f) {
            iMax = (int) (f * 1.92f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.themeLayout.setVisibility(8);
        this.closeImageView.setVisibility(8);
        this.logoImageView.setVisibility(8);
        this.logoImageView.getAnimatedDrawable();
        QrView qrView = this.qrView;
        if (qrView != null) {
            qrView.setForShare(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
        this.fragmentView.layout(0, 0, iMin, iMax);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.logoImageView.getLeft(), this.logoImageView.getTop(), this.logoImageView.getRight(), this.logoImageView.getBottom());
        if (this.logoOptimal != null) {
            canvas.drawBitmap(this.logoOptimal, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.themeLayout.setVisibility(0);
        this.closeImageView.setVisibility(0);
        this.logoImageView.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        QrView qrView2 = this.qrView;
        if (qrView2 != null) {
            qrView2.setForShare(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(bitmapCreateBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performShare$15();
            }
        }, 500L);
    }

    public void lambda$performShare$15() {
        ThemeListViewController themeListViewController = this.themesViewController;
        if (themeListViewController == null) {
            return;
        }
        themeListViewController.shareButton.setClickable(true);
    }

    class AnonymousClass5 implements CameraScanActivity.CameraScanActivityDelegate {
        final int val$currentAccount;
        final BaseFragment val$fragment;

        @Override
        public void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
        }

        @Override
        public String getSubtitleText() {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
        }

        @Override
        public void onDismiss() {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
        }

        @Override
        public boolean processQr(String str, Runnable runnable) {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
        }

        AnonymousClass5(int i, BaseFragment baseFragment) {
            this.val$currentAccount = i;
            this.val$fragment = baseFragment;
        }

        @Override
        public void didFindQr(String str) {
            String strExtractUsername = Browser.extractUsername(str);
            if (!TextUtils.isEmpty(strExtractUsername)) {
                UserNameResolver userNameResolver = MessagesController.getInstance(this.val$currentAccount).getUserNameResolver();
                final BaseFragment baseFragment = this.val$fragment;
                userNameResolver.resolve(strExtractUsername, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        QrActivity.AnonymousClass5.lambda$didFindQr$1(baseFragment, (Long) obj);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    QrActivity.AnonymousClass5.lambda$didFindQr$2();
                }
            });
        }

        public static void lambda$didFindQr$1(BaseFragment baseFragment, Long l) {
            if (baseFragment.isFinished) {
                return;
            }
            if (l == null || l.longValue() == Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        QrActivity.AnonymousClass5.lambda$didFindQr$0();
                    }
                });
            } else {
                baseFragment.presentFragment(ProfileActivity.of(l.longValue()), true);
            }
        }

        public static void lambda$didFindQr$0() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }

        public static void lambda$didFindQr$2() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }
    }

    public static void openCameraScanActivity(BaseFragment baseFragment) {
        CameraScanActivity.showAsSheet(baseFragment, false, 1, (CameraScanActivity.CameraScanActivityDelegate) new AnonymousClass5(baseFragment.getCurrentAccount(), baseFragment));
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                openCameraScanActivity(this);
            } else {
                new AlertDialog.Builder(getParentActivity()).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$onRequestPermissionsResultFragment$16(alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).show();
            }
        }
    }

    public void lambda$onRequestPermissionsResultFragment$16(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions = super.getThemeDescriptions();
        themeDescriptions.addAll(this.themesViewController.getThemeDescriptions());
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$17();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        TextView textView = this.themesViewController.shareButton;
        int i = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i2 = Theme.key_featuredStickers_addButton;
        themeDescriptions.add(new ThemeDescription(textView, i, null, null, null, themeDescriptionDelegate, i2));
        themeDescriptions.add(new ThemeDescription(this.themesViewController.shareButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        if (this.themesViewController.scanButton != null) {
            themeDescriptions.add(new ThemeDescription(this.themesViewController.scanButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, themeDescriptionDelegate, i2));
            themeDescriptions.add(new ThemeDescription(this.themesViewController.scanButtonIcon, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, themeDescriptionDelegate, i2));
        }
        Iterator<ThemeDescription> it = themeDescriptions.iterator();
        while (it.hasNext()) {
            it.next().resourcesProvider = getResourceProvider();
        }
        return themeDescriptions;
    }

    public void lambda$getThemeDescriptions$17() {
        setNavigationBarColor(getThemedColor(Theme.key_windowBackgroundGray));
    }

    private class ThemeResourcesProvider implements Theme.ResourcesProvider {
        private SparseIntArray colors;

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
        public Drawable getDrawable(String str) {
            return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
        }

        @Override
        public Paint getPaint(String str) {
            return Theme.getThemePaint(str);
        }

        @Override
        public boolean hasGradientService() {
            return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
        }

        @Override
        public boolean isDark() {
            return Theme.isCurrentThemeDark();
        }

        @Override
        public void setAnimatedColor(int i, int i2) {
            Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i, i2);
        }

        private ThemeResourcesProvider() {
        }

        void initColors(EmojiThemes emojiThemes, boolean z) {
            this.colors = emojiThemes.createColors(((BaseFragment) QrActivity.this).currentAccount, z ? 1 : 0);
        }

        @Override
        public int getColor(int i) {
            SparseIntArray sparseIntArray = this.colors;
            return sparseIntArray != null ? sparseIntArray.get(i) : Theme.getColor(i);
        }
    }

    static class QrView extends View {
        private Bitmap backgroundBitmap;
        private final Paint bitmapGradientPaint;
        private QrCenterChangedListener centerChangedListener;
        private Runnable checkTimerToken;
        private Bitmap contentBitmap;
        private AnimatedFloat contentBitmapAlpha;
        private Paint crossfadeFromPaint;
        private Paint crossfadeToPaint;
        private final int crossfadeWidthDp;
        private boolean firstPrepare;
        private final MotionBackgroundDrawable gradientDrawable;
        private final BitmapShader gradientShader;
        private final BitmapShader gradientTextShader;
        private Integer hadHeight;
        private String hadLink;
        private String hadUserText;
        private Integer hadWidth;
        private boolean hasTimer;
        private boolean isPhone;
        private String link;
        private int linkExpires;
        private RLottieDrawable loadingMatrix;
        private boolean logoCenterSet;
        private Bitmap oldContentBitmap;
        private float[] radii;
        private boolean setData;
        private StaticLayout shareUsernameLayout;
        private TextPaint shareUsernameLayoutPaint;
        private AnimatedTextView.AnimatedTextDrawable timerTextDrawable;
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
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.contentBitmapAlpha = new AnimatedFloat(1.0f, this, 0L, 2000L, cubicBezierInterpolator);
            this.crossfadeFromPaint = new Paint(1);
            this.crossfadeToPaint = new Paint(1);
            this.crossfadeWidthDp = 120;
            this.radii = new float[8];
            this.checkTimerToken = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$5();
                }
            };
            this.firstPrepare = true;
            motionBackgroundDrawable.setIndeterminateAnimation(true);
            motionBackgroundDrawable.setParentView(this);
            Bitmap bitmap = motionBackgroundDrawable.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.gradientShader = bitmapShader;
            BitmapShader bitmapShader2 = new BitmapShader(motionBackgroundDrawable.getBitmap(), tileMode, tileMode);
            this.gradientTextShader = bitmapShader2;
            paint.setShader(bitmapShader);
            boolean z = false;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(z, true, z) {
                @Override
                public void invalidateSelf() {
                    QrView.this.invalidate();
                }
            };
            this.timerTextDrawable = animatedTextDrawable;
            animatedTextDrawable.setAnimationProperties(0.35f, 0L, 300L, cubicBezierInterpolator);
            this.timerTextDrawable.setCallback(this);
            this.timerTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.timerTextDrawable.getPaint().setShader(bitmapShader2);
            this.timerTextDrawable.setGravity(17);
            this.timerTextDrawable.setTextSize(AndroidUtilities.dp(35.0f));
            this.timerTextDrawable.setText("");
            Paint paint2 = this.crossfadeFromPaint;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
            Paint paint3 = this.crossfadeFromPaint;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.crossfadeToPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
            this.crossfadeToPaint.setXfermode(new PorterDuffXfermode(mode));
        }

        public void setForShare(boolean z) {
            if (this.hasTimer) {
                if (z) {
                    if (this.shareUsernameLayoutPaint == null) {
                        this.shareUsernameLayoutPaint = new TextPaint(1);
                    }
                    this.shareUsernameLayoutPaint.setShader(this.gradientTextShader);
                    this.shareUsernameLayoutPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    this.shareUsernameLayoutPaint.setTextSize(AndroidUtilities.dp(25.0f));
                    String str = this.username;
                    if (str == null) {
                        str = "";
                    }
                    this.shareUsernameLayout = StaticLayoutEx.createStaticLayout(Emoji.replaceEmoji(str, this.shareUsernameLayoutPaint.getFontMetricsInt(), false), this.shareUsernameLayoutPaint, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1);
                    return;
                }
                this.shareUsernameLayout = null;
            }
        }

        @Override
        protected void onSizeChanged(final int i, final int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (i == i3 && i2 == i4) {
                return;
            }
            Bitmap bitmap = this.backgroundBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.backgroundBitmap = null;
            }
            Paint paint = new Paint(1);
            paint.setColor(-1);
            float fDp = AndroidUtilities.dp(4.0f);
            float f = SHADOW_SIZE;
            paint.setShadowLayer(fDp, 0.0f, f, 251658240);
            this.backgroundBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.backgroundBitmap);
            float f2 = i;
            RectF rectF = new RectF(f, f, f2 - f, getHeight() - f);
            float f3 = RADIUS;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            if (this.setData) {
                Utilities.themeQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSizeChanged$0(i, i2);
                    }
                });
            }
            float fMax = Math.max((getWidth() * 1.0f) / this.gradientDrawable.getBitmap().getWidth(), (getHeight() * 1.0f) / this.gradientDrawable.getBitmap().getHeight());
            Matrix matrix = new Matrix();
            matrix.setScale(fMax, fMax);
            this.gradientShader.setLocalMatrix(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(fMax, fMax);
            matrix2.postTranslate(f2 / 2.0f, getWidth() + AndroidUtilities.dp(6.0f));
            this.gradientTextShader.setLocalMatrix(matrix2);
        }

        private void drawLoading(Canvas canvas) {
            QrCenterChangedListener qrCenterChangedListener;
            if (this.loadingMatrix != null) {
                int width = (getWidth() - AndroidUtilities.dp(60.0f)) / 33;
                int i = (width * 33) + 32;
                int width2 = (getWidth() - i) / 2;
                int height = (int) (getHeight() * 0.15f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    height = (int) (getHeight() * 0.09f);
                }
                int i2 = height;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, 255, 31);
                int i3 = width2 + 16;
                int i4 = i2 + 16;
                canvas.drawRect(i3, i4, (getWidth() - width2) - 16, (((getWidth() + i2) - width2) - width2) - 16, this.bitmapGradientPaint);
                canvas.save();
                this.loadingMatrix.setBounds(i3, i4, (getWidth() - width2) - 16, (((getWidth() + i2) - width2) - width2) - 16);
                this.loadingMatrix.draw(canvas);
                canvas.restore();
                canvas.restore();
                float width3 = getWidth() / 2.0f;
                float f = i2;
                float f2 = width2;
                float width4 = ((getWidth() / 2.0f) + f) - f2;
                float fRound = ((Math.round((r9 / 4.65f) / r6) * width) / 2) * 0.75f;
                canvas.drawCircle(width3, width4, fRound, this.bitmapGradientPaint);
                TelegramQRCodeWriter.drawSideQuads(canvas, f2, f, this.bitmapGradientPaint, 7.0f, width, 16, i, 0.75f, this.radii, true);
                if (this.logoCenterSet || (qrCenterChangedListener = this.centerChangedListener) == null) {
                    return;
                }
                qrCenterChangedListener.onCenterChanged((int) (width3 - fRound), (int) (width4 - fRound), (int) (width3 + fRound), (int) (width4 + fRound));
                this.logoCenterSet = true;
            }
        }

        @Override
        protected void onDraw(android.graphics.Canvas r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.QrActivity.QrView.onDraw(android.graphics.Canvas):void");
        }

        void setCenterChangedListener(QrCenterChangedListener qrCenterChangedListener) {
            this.centerChangedListener = qrCenterChangedListener;
        }

        void setData(String str, String str2, boolean z, boolean z2) {
            this.setData = true;
            this.username = str2;
            this.isPhone = z;
            if (z2) {
                TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
                if (cachedContactToken != null) {
                    this.link = cachedContactToken.url;
                    this.linkExpires = cachedContactToken.expires;
                } else {
                    this.link = null;
                }
            } else {
                this.link = str;
            }
            this.hasTimer = z2;
            final int width = getWidth();
            final int height = getHeight();
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setData$1(width, height);
                }
            });
            invalidate();
            this.checkTimerToken.run();
        }

        public void lambda$new$5() {
            AndroidUtilities.cancelRunOnUIThread(this.checkTimerToken);
            boolean z = this.hasTimer;
            if (z) {
                if (z && this.loadingMatrix == null) {
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.qr_matrix, "qr_matrix", AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                    this.loadingMatrix = rLottieDrawable;
                    rLottieDrawable.setMasterParent(this);
                    this.loadingMatrix.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    this.loadingMatrix.setAutoRepeat(1);
                    this.loadingMatrix.start();
                }
                if (this.linkExpires == 0 || System.currentTimeMillis() / 1000 >= this.linkExpires) {
                    if (this.linkExpires != 0) {
                        this.link = null;
                        final int width = getWidth();
                        final int height = getHeight();
                        Utilities.themeQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$new$2(width, height);
                            }
                        });
                        this.timerTextDrawable.setText("");
                    }
                    MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(this.linkExpires == 0 ? 750L : 1750L, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$new$4((TLRPC.TL_exportedContactToken) obj);
                        }
                    });
                }
                int i = this.linkExpires;
                if (i > 0 && this.link != null) {
                    long jMax = Math.max(0L, (i - (System.currentTimeMillis() / 1000)) - 1);
                    int i2 = (int) (jMax % 60);
                    int iMin = Math.min(99, (int) (jMax / 60));
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.timerTextDrawable;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iMin < 10 ? "0" : "");
                    sb.append(iMin);
                    sb.append(":");
                    sb.append(i2 < 10 ? "0" : "");
                    sb.append(i2);
                    animatedTextDrawable.setText(sb.toString(), true, false);
                }
                if (isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(this.checkTimerToken, 1000L);
                }
            }
        }

        public void lambda$new$4(final TLRPC.TL_exportedContactToken tL_exportedContactToken) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$3(tL_exportedContactToken);
                }
            });
        }

        public void lambda$new$3(TLRPC.TL_exportedContactToken tL_exportedContactToken) {
            if (tL_exportedContactToken == null) {
                return;
            }
            int i = this.linkExpires;
            if (i != 0 && i < tL_exportedContactToken.expires) {
                try {
                    Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(100L);
                    }
                } catch (Exception unused) {
                    try {
                        performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                }
            }
            this.linkExpires = tL_exportedContactToken.expires;
            setData(tL_exportedContactToken.url, null, false, true);
        }

        void setColors(int i, int i2, int i3, int i4) {
            this.gradientDrawable.setColors(i, i2, i3, i4);
            invalidate();
        }

        void setPosAnimationProgress(float f) {
            this.gradientDrawable.posAnimationProgress = f;
        }

        public void lambda$setData$1(int r29, int r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.QrActivity.QrView.lambda$setData$1(int, int):void");
        }

        public void lambda$prepareContent$6() {
            this.firstPrepare = false;
            Bitmap bitmap = this.contentBitmap;
            if (bitmap != null) {
                this.contentBitmap = null;
                this.contentBitmapAlpha.set(0.0f, true);
                Bitmap bitmap2 = this.oldContentBitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.oldContentBitmap = bitmap;
                invalidate();
            }
        }

        public void lambda$prepareContent$7(Bitmap bitmap, float f, int i, float f2) {
            Bitmap bitmap2 = this.contentBitmap;
            this.contentBitmap = bitmap.extractAlpha();
            if (!this.firstPrepare) {
                this.contentBitmapAlpha.set(0.0f, true);
            }
            this.firstPrepare = false;
            Bitmap bitmap3 = this.oldContentBitmap;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.oldContentBitmap = bitmap2;
            QrCenterChangedListener qrCenterChangedListener = this.centerChangedListener;
            if (qrCenterChangedListener != null) {
                float f3 = i * 0.5f;
                qrCenterChangedListener.onCenterChanged((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
                this.logoCenterSet = true;
            }
            invalidate();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.checkTimerToken.run();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RLottieDrawable rLottieDrawable = this.loadingMatrix;
            if (rLottieDrawable != null) {
                rLottieDrawable.stop();
                this.loadingMatrix.recycle(false);
                this.loadingMatrix = null;
            }
        }
    }

    class ThemeListViewController implements NotificationCenter.NotificationCenterDelegate {
        public final ChatThemeBottomSheet.Adapter adapter;
        private final Drawable backgroundDrawable;
        private final View bottomShadow;
        private View changeDayNightView;
        private ValueAnimator changeDayNightViewAnimator;
        private float changeDayNightViewProgress;
        private final RLottieDrawable darkThemeDrawable;
        private final RLottieImageView darkThemeView;
        private boolean forceDark;
        private final BaseFragment fragment;
        protected boolean isLightDarkChangeAnimation;
        private OnItemSelectedListener itemSelectedListener;
        private LinearLayoutManager layoutManager;
        private boolean prevIsPortrait;
        public final FlickerLoadingView progressView;
        private final RecyclerListView recyclerView;
        public final FrameLayout rootLayout;
        public final TextView scanButton;
        public final ImageView scanButtonIcon;
        public final LinearLayout scanButtonWrap;
        private final LinearSmoothScroller scroller;
        public ChatThemeBottomSheet.ChatThemeItem selectedItem;
        public final TextView shareButton;
        public final TextView titleView;
        private final View topShadow;
        private final Window window;
        private final Paint backgroundPaint = new Paint(1);
        public int prevSelectedPosition = -1;

        public ThemeListViewController(BaseFragment baseFragment, Window window) {
            this.fragment = baseFragment;
            this.window = window;
            Activity parentActivity = baseFragment.getParentActivity();
            this.scroller = new LinearSmoothScroller(parentActivity) {
                @Override
                protected int calculateTimeForScrolling(int i) {
                    return super.calculateTimeForScrolling(i) * 6;
                }
            };
            Drawable drawableMutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.backgroundDrawable = drawableMutate;
            int themedColor = baseFragment.getThemedColor(Theme.key_dialogBackground);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            FrameLayout frameLayout = new FrameLayout(parentActivity, QrActivity.this, baseFragment) {
                private final Rect backgroundPadding;
                final BaseFragment val$fragment;
                final QrActivity val$this$0;

                {
                    this.val$fragment = baseFragment;
                    Rect rect = new Rect();
                    this.backgroundPadding = rect;
                    ThemeListViewController.this.backgroundPaint.setColor(baseFragment.getThemedColor(Theme.key_windowBackgroundWhite));
                    ThemeListViewController.this.backgroundDrawable.setCallback(this);
                    ThemeListViewController.this.backgroundDrawable.getPadding(rect);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    boolean z = QrActivity.this.isFragmentViewPortrait;
                    int iDp = AndroidUtilities.dp(12.0f);
                    if (z) {
                        ThemeListViewController.this.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                        ThemeListViewController.this.recyclerView.setPadding(iDp, 0, iDp, 0);
                        ThemeListViewController themeListViewController = ThemeListViewController.this;
                        if (themeListViewController.scanButtonWrap != null) {
                            themeListViewController.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                            ThemeListViewController.this.scanButtonWrap.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                        } else {
                            themeListViewController.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                        }
                    } else {
                        ThemeListViewController.this.recyclerView.setPadding(iDp, iDp / 2, iDp, iDp);
                        ThemeListViewController themeListViewController2 = ThemeListViewController.this;
                        if (themeListViewController2.scanButtonWrap != null) {
                            themeListViewController2.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                            ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                            ThemeListViewController.this.scanButtonWrap.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                        } else {
                            themeListViewController2.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                            ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                        }
                    }
                    if (z) {
                        ThemeListViewController.this.bottomShadow.setVisibility(8);
                        ThemeListViewController.this.topShadow.setVisibility(8);
                    } else {
                        ThemeListViewController themeListViewController3 = ThemeListViewController.this;
                        int i3 = themeListViewController3.shareButton != null ? 136 : 80;
                        themeListViewController3.bottomShadow.setVisibility(0);
                        ThemeListViewController.this.bottomShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i3));
                        ThemeListViewController.this.topShadow.setVisibility(0);
                        ThemeListViewController.this.topShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                    }
                    if (ThemeListViewController.this.prevIsPortrait != z) {
                        RecyclerListView recyclerListView = ThemeListViewController.this.recyclerView;
                        ThemeListViewController themeListViewController4 = ThemeListViewController.this;
                        recyclerListView.setLayoutManager(themeListViewController4.layoutManager = themeListViewController4.getLayoutManager(z));
                        ThemeListViewController.this.recyclerView.requestLayout();
                        ThemeListViewController themeListViewController5 = ThemeListViewController.this;
                        int i4 = themeListViewController5.prevSelectedPosition;
                        if (i4 != -1) {
                            themeListViewController5.setSelectedPosition(i4);
                        }
                        ThemeListViewController.this.prevIsPortrait = z;
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    if (ThemeListViewController.this.prevIsPortrait) {
                        Drawable drawable = ThemeListViewController.this.backgroundDrawable;
                        Rect rect = this.backgroundPadding;
                        drawable.setBounds(-rect.left, -rect.top, getWidth() + this.backgroundPadding.right, getHeight() + this.backgroundPadding.bottom);
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
            textView.setTextColor(baseFragment.getThemedColor(Theme.key_dialogTextBlack));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
            int i = Theme.key_featuredStickers_addButton;
            int themedColor2 = baseFragment.getThemedColor(i);
            int iDp = AndroidUtilities.dp(28.0f);
            int i2 = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, iDp, iDp, false, null);
            this.darkThemeDrawable = rLottieDrawable;
            this.forceDark = Theme.getActiveTheme().isDark() ^ true;
            setForceDark(Theme.getActiveTheme().isDark(), false);
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
            RLottieImageView rLottieImageView = new RLottieImageView(parentActivity) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    if (QrActivity.this.isCurrentThemeDark) {
                        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
                    } else {
                        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
                    }
                }
            };
            this.darkThemeView = rLottieImageView;
            rLottieImageView.setAnimation(rLottieDrawable);
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            rLottieImageView.setAlpha(0.0f);
            rLottieImageView.setVisibility(4);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(parentActivity, baseFragment.getResourceProvider());
            this.progressView = flickerLoadingView;
            flickerLoadingView.setVisibility(0);
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
            this.prevIsPortrait = true;
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
                public final void onItemClick(View view, int i3) {
                    this.f$0.onItemClicked(view, i3);
                }
            });
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                private int yScroll = 0;

                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    super.onScrolled(recyclerView, i3, i4);
                    this.yScroll += i4;
                    ThemeListViewController.this.topShadow.setAlpha((this.yScroll * 1.0f) / AndroidUtilities.dp(6.0f));
                }
            });
            frameLayout.addView(recyclerListView);
            View view = new View(parentActivity);
            this.topShadow = view;
            view.setAlpha(0.0f);
            int i3 = R.drawable.shadowdown;
            view.setBackground(ContextCompat.getDrawable(parentActivity, i3));
            view.setRotation(180.0f);
            frameLayout.addView(view);
            View view2 = new View(parentActivity);
            this.bottomShadow = view2;
            view2.setBackground(ContextCompat.getDrawable(parentActivity, i3));
            frameLayout.addView(view2);
            TextView textView2 = new TextView(parentActivity);
            this.shareButton = textView2;
            textView2.setBackground(Theme.AdaptiveRipple.filledRect(baseFragment.getThemedColor(i), 24.0f));
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            textView2.setGravity(17);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setText(LocaleController.getString(R.string.ShareQrCode));
            textView2.setTextColor(baseFragment.getThemedColor(Theme.key_featuredStickers_buttonText));
            textView2.setTextSize(1, 15.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2);
            if (UserConfig.getInstance(((BaseFragment) QrActivity.this).currentAccount).getClientUserId() == QrActivity.this.userId) {
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.scanButtonWrap = linearLayout;
                linearLayout.setBackground(Theme.AdaptiveRipple.createRect(ColorUtils.setAlphaComponent(Theme.AdaptiveRipple.calcRippleColor(baseFragment.getThemedColor(i)), 25), 24.0f));
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                ImageView imageView = new ImageView(parentActivity);
                this.scanButtonIcon = imageView;
                imageView.setLayoutParams(LayoutHelper.createLinear(24, 24, 17, 0, 0, 10, 0));
                imageView.setImageResource(R.drawable.profile_qr_scan_24);
                imageView.setColorFilter(new PorterDuffColorFilter(baseFragment.getThemedColor(i), mode));
                linearLayout.addView(imageView);
                TextView textView3 = new TextView(parentActivity);
                this.scanButton = textView3;
                textView3.setEllipsize(truncateAt);
                textView3.setGravity(17);
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setText(LocaleController.getString(R.string.ScanQrCode));
                textView3.setTextColor(baseFragment.getThemedColor(i));
                textView3.setTextSize(1, 15.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                linearLayout.addView(textView3);
                frameLayout.addView(linearLayout);
                return;
            }
            this.scanButtonWrap = null;
            this.scanButtonIcon = null;
            this.scanButton = null;
        }

        public void lambda$new$0(View view) {
            if (this.changeDayNightViewAnimator != null) {
                return;
            }
            setupLightDarkTheme(!this.forceDark);
        }

        public void onCreate() {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(((BaseFragment) QrActivity.this).currentAccount);
            chatThemeController.preloadAllWallpaperThumbs(true);
            chatThemeController.preloadAllWallpaperThumbs(false);
            chatThemeController.preloadAllWallpaperImages(true);
            chatThemeController.preloadAllWallpaperImages(false);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
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

        protected void onItemClicked(View view, final int i) {
            if (this.adapter.items.get(i) == this.selectedItem || this.changeDayNightView != null) {
                return;
            }
            this.isLightDarkChangeAnimation = false;
            this.selectedItem = (ChatThemeBottomSheet.ChatThemeItem) this.adapter.items.get(i);
            this.adapter.setSelectedItem(i);
            this.rootLayout.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemClicked$1(i);
                }
            }, 100L);
            for (int i2 = 0; i2 < this.recyclerView.getChildCount(); i2++) {
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i2);
                if (themeSmallPreviewView != view) {
                    themeSmallPreviewView.cancelAnimation();
                }
            }
            if (!((ChatThemeBottomSheet.ChatThemeItem) this.adapter.items.get(i)).chatTheme.showAsDefaultStub) {
                ((ThemeSmallPreviewView) view).playEmojiAnimation();
            }
            OnItemSelectedListener onItemSelectedListener = this.itemSelectedListener;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(this.selectedItem.chatTheme, i);
            }
        }

        public void lambda$onItemClicked$1(int i) {
            int iMax;
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            if (layoutManager != null) {
                if (!this.prevIsPortrait) {
                    iMax = i;
                } else if (i > this.prevSelectedPosition) {
                    iMax = Math.min(i + 1, this.adapter.items.size() - 1);
                } else {
                    iMax = Math.max(i - 1, 0);
                }
                this.scroller.setTargetPosition(iMax);
                layoutManager.startSmoothScroll(this.scroller);
            }
            this.prevSelectedPosition = i;
        }

        private void setupLightDarkTheme(final boolean z) {
            ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            FrameLayout frameLayout = (FrameLayout) this.fragment.getParentActivity().getWindow().getDecorView();
            FrameLayout frameLayout2 = (FrameLayout) this.window.getDecorView();
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmapCreateBitmap);
            this.darkThemeView.setAlpha(0.0f);
            frameLayout.draw(canvas);
            frameLayout2.draw(canvas);
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
            final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
            this.changeDayNightView = new View(this.fragment.getParentActivity()) {
                @Override
                protected void onDraw(Canvas canvas2) {
                    super.onDraw(canvas2);
                    if (!z) {
                        canvas2.drawCircle(measuredWidth, measuredHeight, fMax * (1.0f - ThemeListViewController.this.changeDayNightViewProgress), paint2);
                    } else {
                        if (ThemeListViewController.this.changeDayNightViewProgress > 0.0f) {
                            canvas.drawCircle(measuredWidth, measuredHeight, fMax * ThemeListViewController.this.changeDayNightViewProgress, paint);
                        }
                        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                    }
                    canvas2.save();
                    canvas2.translate(f, f2);
                    ThemeListViewController.this.darkThemeView.draw(canvas2);
                    canvas2.restore();
                }
            };
            this.changeDayNightViewProgress = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.changeDayNightViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$setupLightDarkTheme$2(valueAnimator2);
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
            frameLayout2.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setupLightDarkTheme$3(z);
                }
            });
        }

        public void lambda$setupLightDarkTheme$2(ValueAnimator valueAnimator) {
            this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.changeDayNightView.invalidate();
        }

        public void lambda$setupLightDarkTheme$3(boolean z) {
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (adapter == null || adapter.items == null) {
                return;
            }
            setForceDark(z, true);
            if (this.selectedItem != null) {
                this.isLightDarkChangeAnimation = true;
                setDarkTheme(z);
            }
            if (this.adapter.items != null) {
                for (int i = 0; i < this.adapter.items.size(); i++) {
                    ((ChatThemeBottomSheet.ChatThemeItem) this.adapter.items.get(i)).themeIndex = z ? 1 : 0;
                    ((ChatThemeBottomSheet.ChatThemeItem) this.adapter.items.get(i)).icon = QrActivity.this.getEmojiThemeIcon(((ChatThemeBottomSheet.ChatThemeItem) this.adapter.items.get(i)).chatTheme, z);
                }
                QrActivity.this.tempMotionDrawable = null;
                this.adapter.notifyDataSetChanged();
            }
        }

        protected void setDarkTheme(boolean z) {
            QrActivity.this.isCurrentThemeDark = z;
            QrActivity qrActivity = QrActivity.this;
            qrActivity.onItemSelected(qrActivity.currentTheme, QrActivity.this.selectedPosition, false);
        }

        public void setForceDark(boolean z, boolean z2) {
            if (this.forceDark == z) {
                return;
            }
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

        public LinearLayoutManager getLayoutManager(boolean z) {
            if (z) {
                return new LinearLayoutManager(this.fragment.getParentActivity(), 0, false);
            }
            return new GridLayoutManager(this.fragment.getParentActivity(), 3, 1, false);
        }

        public void onAnimationStart() {
            List list;
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (adapter != null && (list = adapter.items) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ChatThemeBottomSheet.ChatThemeItem) it.next()).themeIndex = this.forceDark ? 1 : 0;
                }
            }
            if (this.isLightDarkChangeAnimation) {
                return;
            }
            setItemsAnimationProgress(1.0f);
        }

        public void setItemsAnimationProgress(float f) {
            for (int i = 0; i < this.adapter.getItemCount(); i++) {
                ((ChatThemeBottomSheet.ChatThemeItem) this.adapter.items.get(i)).animationProgress = f;
            }
        }

        public void onAnimationEnd() {
            this.isLightDarkChangeAnimation = false;
        }

        public ArrayList getThemeDescriptions() {
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
                    ThemeListViewController.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ThemeListViewController.this.fragment.getThemedColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN));
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
            ArrayList arrayList = new ArrayList();
            int i = ThemeDescription.FLAG_BACKGROUND;
            Paint paint = this.backgroundPaint;
            int i2 = Theme.key_dialogBackground;
            arrayList.add(new ThemeDescription(null, i, null, paint, null, null, i2));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, new Drawable[]{this.backgroundDrawable}, themeDescriptionDelegate, i2));
            arrayList.add(new ThemeDescription(this.titleView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_dialogTextBlack));
            arrayList.add(new ThemeDescription(this.recyclerView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ThemeSmallPreviewView.class}, null, null, null, Theme.key_dialogBackgroundGray));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ThemeDescription) it.next()).resourcesProvider = this.fragment.getResourceProvider();
            }
            return arrayList;
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.insets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        this.fragmentView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }
}
