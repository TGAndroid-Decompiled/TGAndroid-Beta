package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
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
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
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
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.EmojiThemes;
import org.telegram.p009ui.ActionBar.INavigationLayout;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.AnimatedFloat;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.ChatThemeBottomSheet;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.Easings;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.HideViewAfterAnimation;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.MotionBackgroundDrawable;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.StaticLayoutEx;
import org.telegram.p009ui.Components.ThemeSmallPreviewView;
import org.telegram.p009ui.QrActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_exportedContactToken;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowContacts;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowAll;
import org.telegram.tgnet.TLRPC$WallPaper;

public class QrActivity extends BaseFragment {
    private static List<EmojiThemes> cachedThemes;
    private static boolean firstOpen;
    private static final ArrayMap<String, int[]> qrColorsMap;
    private BackupImageView avatarImageView;
    private View backgroundView;
    private long chatId;
    private ImageView closeImageView;
    private MotionBackgroundDrawable currMotionDrawable;
    private EmojiThemes currentTheme;
    private final ArrayMap<String, Bitmap> emojiThemeDarkIcons;
    private Bitmap emojiThemeIcon;
    private final EmojiThemes homeTheme;
    private boolean isCurrentThemeDark;
    private RLottieImageView logoImageView;
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
        firstOpen = true;
    }

    public QrActivity(Bundle bundle) {
        super(bundle);
        this.resourcesProvider = new ThemeResourcesProvider();
        EmojiThemes createHomeQrTheme = EmojiThemes.createHomeQrTheme();
        this.homeTheme = createHomeQrTheme;
        this.logoRect = new Rect();
        this.emojiThemeDarkIcons = new ArrayMap<>();
        this.prevQrColors = null;
        this.currMotionDrawable = new MotionBackgroundDrawable();
        this.currentTheme = createHomeQrTheme;
        this.selectedPosition = -1;
    }

    @Override
    public boolean onFragmentCreate() {
        this.userId = this.arguments.getLong("user_id");
        this.chatId = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.QrActivity.createView(android.content.Context):android.view.View");
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

    public void lambda$createView$5() {
        this.homeTheme.loadPreviewColors(this.currentAccount);
        this.fragmentView.postDelayed(new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$createView$4();
            }
        }, 17L);
    }

    public void lambda$createView$4() {
        onItemSelected(this.currentTheme, 0, true);
    }

    public void lambda$createView$6() {
        firstOpen = false;
        List<EmojiThemes> list = cachedThemes;
        if (list == null || list.isEmpty()) {
            ChatThemeController.requestAllChatThemes(new ResultCallback<List<EmojiThemes>>() {
                @Override
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
    }

    private boolean phoneIsPublic() {
        char c;
        ArrayList<TLRPC$PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        if (privacyRules == null) {
            return false;
        }
        for (int i = 0; i < privacyRules.size(); i++) {
            TLRPC$PrivacyRule tLRPC$PrivacyRule = privacyRules.get(i);
            if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowAll) {
                c = 0;
                break;
            } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowAll) {
                break;
            } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowContacts) {
                c = 1;
                break;
            }
        }
        c = 2;
        if (c == 2) {
            ArrayList<TLRPC$PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules2 == null || privacyRules2.size() == 0) {
                return true;
            }
            for (int i2 = 0; i2 < privacyRules2.size(); i2++) {
                TLRPC$PrivacyRule tLRPC$PrivacyRule2 = privacyRules2.get(i2);
                if (tLRPC$PrivacyRule2 instanceof TLRPC$TL_privacyValueAllowAll) {
                    return true;
                }
                if ((tLRPC$PrivacyRule2 instanceof TLRPC$TL_privacyValueDisallowAll) || (tLRPC$PrivacyRule2 instanceof TLRPC$TL_privacyValueAllowContacts)) {
                    return false;
                }
            }
        }
        return c == 0 || c == 1;
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | ConnectionsManager.RequestFlagDoNotWaitFloodWait | 4);
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
        if (list == null || list.isEmpty() || this.themesViewController == null) {
            return;
        }
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

    public Bitmap getEmojiThemeIcon(EmojiThemes emojiThemes, boolean z) {
        if (z) {
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
                    this.tempMotionDrawable.setBounds(AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), canvas.getWidth() - AndroidUtilities.m35dp(6.0f), canvas.getHeight() - AndroidUtilities.m35dp(6.0f));
                    this.tempMotionDrawable.draw(canvas);
                }
                canvas.drawBitmap(this.emojiThemeIcon, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                this.emojiThemeDarkIcons.put(emojiThemes.emoji, bitmap);
            }
            return bitmap;
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
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.patternIntensityAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        QrActivity.this.lambda$onPatternLoaded$7(valueAnimator2);
                    }
                });
                this.patternIntensityAnimator.setDuration(250L);
                this.patternIntensityAnimator.start();
                return;
            }
            this.currMotionDrawable.setPatternAlpha(1.0f);
        }
    }

    public void lambda$onPatternLoaded$7(ValueAnimator valueAnimator) {
        this.currMotionDrawable.setPatternAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onItemSelected(EmojiThemes emojiThemes, int i, final boolean z) {
        float f;
        this.selectedPosition = i;
        final EmojiThemes emojiThemes2 = this.currentTheme;
        final boolean z2 = this.isCurrentThemeDark;
        this.currentTheme = emojiThemes;
        EmojiThemes.ThemeItem themeItem = emojiThemes.getThemeItem(z2 ? 1 : 0);
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
        TLRPC$WallPaper wallpaper = this.currentTheme.getWallpaper(z2 ? 1 : 0);
        if (wallpaper != null) {
            this.currMotionDrawable.setPatternBitmap(wallpaper.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.currentTheme.loadWallpaper(z2 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    QrActivity.this.lambda$onItemSelected$8(z2, elapsedRealtime, (Pair) obj);
                }

                @Override
                public void onError(TLRPC$TL_error tLRPC$TL_error) {
                    ResultCallback.CC.$default$onError(this, tLRPC$TL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    QrActivity.this.lambda$onItemSelected$10();
                }
            }, 35L);
        }
        MotionBackgroundDrawable motionBackgroundDrawable4 = this.currMotionDrawable;
        motionBackgroundDrawable4.setPatternColorFilter(motionBackgroundDrawable4.getPatternColor());
        ArrayMap<String, int[]> arrayMap = qrColorsMap;
        StringBuilder sb = new StringBuilder();
        sb.append(emojiThemes.emoji);
        sb.append(z2 ? "n" : "d");
        final int[] iArr = arrayMap.get(sb.toString());
        if (z) {
            if (this.prevQrColors == null) {
                int[] iArr2 = new int[4];
                this.prevQrColors = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.currMotionDrawable.setAlpha(255);
            this.currMotionDrawable.setBackgroundAlpha(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.patternAlphaAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    QrActivity.this.lambda$onItemSelected$11(iArr, valueAnimator2);
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
        final INavigationLayout.ThemeAnimationSettings themeAnimationSettings = new INavigationLayout.ThemeAnimationSettings(null, (this.isCurrentThemeDark ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme()).currentAccentId, this.isCurrentThemeDark, !z);
        themeAnimationSettings.applyTheme = false;
        themeAnimationSettings.onlyTopFragment = true;
        themeAnimationSettings.resourcesProvider = getResourceProvider();
        themeAnimationSettings.duration = (int) (f * 250.0f);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$onItemSelected$13(z, emojiThemes2, themeAnimationSettings);
            }
        });
    }

    public void lambda$onItemSelected$8(boolean z, long j, Pair pair) {
        if (pair == null || this.currentTheme.getTlTheme(z ? 1 : 0) == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        if (longValue != this.currentTheme.getTlTheme(z ? 1 : 0).f977id || bitmap == null) {
            return;
        }
        onPatternLoaded(bitmap, this.currMotionDrawable.getIntensity(), SystemClock.elapsedRealtime() - j > 150);
    }

    public void lambda$onItemSelected$10() {
        final Bitmap bitmap = SvgHelper.getBitmap(C1010R.raw.default_pattern, this.backgroundView.getWidth(), this.backgroundView.getHeight(), -16777216);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$onItemSelected$9(bitmap);
            }
        });
    }

    public void lambda$onItemSelected$9(Bitmap bitmap) {
        onPatternLoaded(bitmap, 34, true);
    }

    public void lambda$onItemSelected$11(int[] iArr, ValueAnimator valueAnimator) {
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

    public void lambda$onItemSelected$13(boolean z, EmojiThemes emojiThemes, INavigationLayout.ThemeAnimationSettings themeAnimationSettings) {
        if (z) {
            this.resourcesProvider.initColors(emojiThemes, this.isCurrentThemeDark);
        } else {
            this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
        }
        themeAnimationSettings.afterStartDescriptionsAddedRunnable = new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$onItemSelected$12();
            }
        };
        this.parentLayout.animateThemedValues(themeAnimationSettings, null);
    }

    public void lambda$onItemSelected$12() {
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
        QrView qrView = this.qrView;
        if (qrView != null) {
            qrView.setForShare(true);
        }
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
        QrView qrView2 = this.qrView;
        if (qrView2 != null) {
            qrView2.setForShare(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString("InviteByQRCode", C1010R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QrActivity.this.lambda$performShare$14();
            }
        }, 500L);
    }

    public void lambda$performShare$14() {
        ThemeListViewController themeListViewController = this.themesViewController;
        if (themeListViewController == null) {
            return;
        }
        themeListViewController.shareButton.setClickable(true);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions = super.getThemeDescriptions();
        themeDescriptions.addAll(this.themesViewController.getThemeDescriptions());
        themeDescriptions.add(new ThemeDescription(this.themesViewController.shareButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                QrActivity.this.lambda$getThemeDescriptions$15();
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

    public void lambda$getThemeDescriptions$15() {
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
        private AnimatedFloat contentBitmapAlpha;
        private Paint crossfadeFromPaint;
        private Paint crossfadeToPaint;
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
        private static final float SHADOW_SIZE = AndroidUtilities.m35dp(2.0f);
        private static final float RADIUS = AndroidUtilities.m35dp(20.0f);

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
            this.radii = new float[8];
            this.firstPrepare = true;
            motionBackgroundDrawable.setIndeterminateAnimation(true);
            motionBackgroundDrawable.setParentView(this);
            Bitmap bitmap = motionBackgroundDrawable.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.gradientShader = bitmapShader;
            Bitmap bitmap2 = motionBackgroundDrawable.getBitmap();
            Shader.TileMode tileMode2 = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
            this.gradientTextShader = bitmapShader2;
            paint.setShader(bitmapShader);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, false) {
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
            this.timerTextDrawable.setTextSize(AndroidUtilities.m35dp(35.0f));
            this.timerTextDrawable.setText(BuildConfig.APP_CENTER_HASH);
            this.crossfadeFromPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.m35dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.crossfadeFromPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.crossfadeToPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.m35dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.crossfadeToPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }

        public void setForShare(boolean z) {
            if (this.hasTimer) {
                if (z) {
                    if (this.shareUsernameLayoutPaint == null) {
                        this.shareUsernameLayoutPaint = new TextPaint(1);
                    }
                    this.shareUsernameLayoutPaint.setShader(this.gradientTextShader);
                    this.shareUsernameLayoutPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    this.shareUsernameLayoutPaint.setTextSize(AndroidUtilities.m35dp(25.0f));
                    String str = this.username;
                    if (str == null) {
                        str = BuildConfig.APP_CENTER_HASH;
                    }
                    this.shareUsernameLayout = StaticLayoutEx.createStaticLayout(Emoji.replaceEmoji(str, this.shareUsernameLayoutPaint.getFontMetricsInt(), AndroidUtilities.m35dp(20.0f), false), this.shareUsernameLayoutPaint, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.m35dp(60.0f), 1);
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
            float f = SHADOW_SIZE;
            paint.setShadowLayer(AndroidUtilities.m35dp(4.0f), 0.0f, f, AndroidUtilities.LIGHT_STATUS_BAR_OVERLAY);
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
                        QrActivity.QrView.this.lambda$onSizeChanged$0(i, i2);
                    }
                });
            }
            float max = Math.max((getWidth() * 1.0f) / this.gradientDrawable.getBitmap().getWidth(), (getHeight() * 1.0f) / this.gradientDrawable.getBitmap().getHeight());
            Matrix matrix = new Matrix();
            matrix.setScale(max, max);
            this.gradientShader.setLocalMatrix(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(max, max);
            matrix2.postTranslate(f2 / 2.0f, getWidth() + AndroidUtilities.m35dp(6.0f));
            this.gradientTextShader.setLocalMatrix(matrix2);
        }

        private void drawLoading(Canvas canvas) {
            float f;
            QrCenterChangedListener qrCenterChangedListener;
            if (this.loadingMatrix != null) {
                int width = (getWidth() - AndroidUtilities.m35dp(60.0f)) / 33;
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
                float f2 = i2;
                float f3 = width2;
                float width4 = ((getWidth() / 2.0f) + f2) - f3;
                float round = ((Math.round(((i - 32) / 4.65f) / f) * width) / 2) * 0.75f;
                canvas.drawCircle(width3, width4, round, this.bitmapGradientPaint);
                QRCodeWriter.drawSideQuads(canvas, f3, f2, this.bitmapGradientPaint, 7.0f, width, 16, i, 0.75f, this.radii, true);
                if (this.logoCenterSet || (qrCenterChangedListener = this.centerChangedListener) == null) {
                    return;
                }
                qrCenterChangedListener.onCenterChanged((int) (width3 - round), (int) (width4 - round), (int) (width3 + round), (int) (width4 + round));
                this.logoCenterSet = true;
            }
        }

        @Override
        protected void onDraw(android.graphics.Canvas r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.QrActivity.QrView.onDraw(android.graphics.Canvas):void");
        }

        void setCenterChangedListener(QrCenterChangedListener qrCenterChangedListener) {
            this.centerChangedListener = qrCenterChangedListener;
        }

        void setData(String str, String str2, boolean z, boolean z2) {
            this.setData = true;
            this.username = str2;
            this.isPhone = z;
            if (z2) {
                TLRPC$TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
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
                    QrActivity.QrView.this.lambda$setData$1(width, height);
                }
            });
            invalidate();
            checkTimerToken();
        }

        public void checkTimerToken() {
            AndroidUtilities.cancelRunOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    QrActivity.QrView.this.checkTimerToken();
                }
            });
            boolean z = this.hasTimer;
            if (z) {
                if (z && this.loadingMatrix == null) {
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(C1010R.raw.qr_matrix, "qr_matrix", AndroidUtilities.m35dp(200.0f), AndroidUtilities.m35dp(200.0f));
                    this.loadingMatrix = rLottieDrawable;
                    rLottieDrawable.setMasterParent(this);
                    this.loadingMatrix.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    this.loadingMatrix.setAutoRepeat(1);
                    this.loadingMatrix.start();
                }
                int i = this.linkExpires;
                String str = BuildConfig.APP_CENTER_HASH;
                if (i == 0 || System.currentTimeMillis() / 1000 >= this.linkExpires) {
                    if (this.linkExpires != 0) {
                        this.link = null;
                        final int width = getWidth();
                        final int height = getHeight();
                        Utilities.themeQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                QrActivity.QrView.this.lambda$checkTimerToken$2(width, height);
                            }
                        });
                        this.timerTextDrawable.setText(BuildConfig.APP_CENTER_HASH);
                    }
                    MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(this.linkExpires == 0 ? 750L : 1750L, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            QrActivity.QrView.this.lambda$checkTimerToken$4((TLRPC$TL_exportedContactToken) obj);
                        }
                    });
                }
                int i2 = this.linkExpires;
                if (i2 > 0 && this.link != null) {
                    long max = Math.max(0L, (i2 - (System.currentTimeMillis() / 1000)) - 1);
                    int i3 = (int) (max % 60);
                    int min = Math.min(99, (int) (max / 60));
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.timerTextDrawable;
                    StringBuilder sb = new StringBuilder();
                    sb.append(min < 10 ? "0" : BuildConfig.APP_CENTER_HASH);
                    sb.append(min);
                    sb.append(":");
                    if (i3 < 10) {
                        str = "0";
                    }
                    sb.append(str);
                    sb.append(i3);
                    animatedTextDrawable.setText(sb.toString(), true, false);
                }
                if (isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            QrActivity.QrView.this.checkTimerToken();
                        }
                    }, 1000L);
                }
            }
        }

        public void lambda$checkTimerToken$4(final TLRPC$TL_exportedContactToken tLRPC$TL_exportedContactToken) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    QrActivity.QrView.this.lambda$checkTimerToken$3(tLRPC$TL_exportedContactToken);
                }
            });
        }

        public void lambda$checkTimerToken$3(TLRPC$TL_exportedContactToken tLRPC$TL_exportedContactToken) {
            if (tLRPC$TL_exportedContactToken == null) {
                return;
            }
            int i = this.linkExpires;
            if (i != 0 && i < tLRPC$TL_exportedContactToken.expires) {
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
            this.linkExpires = tLRPC$TL_exportedContactToken.expires;
            setData(tLRPC$TL_exportedContactToken.url, null, false, true);
        }

        void setColors(int i, int i2, int i3, int i4) {
            this.gradientDrawable.setColors(i, i2, i3, i4);
            invalidate();
        }

        void setPosAnimationProgress(float f) {
            this.gradientDrawable.posAnimationProgress = f;
        }

        public void lambda$setData$1(int r32, int r33) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.QrActivity.QrView.lambda$setData$1(int, int):void");
        }

        public void lambda$prepareContent$5() {
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

        public void lambda$prepareContent$6(Bitmap bitmap, float f, int i, float f2) {
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
            checkTimerToken();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RLottieDrawable rLottieDrawable = this.loadingMatrix;
            if (rLottieDrawable != null) {
                rLottieDrawable.stop();
                this.loadingMatrix.recycle();
                this.loadingMatrix = null;
            }
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
        private boolean forceDark;
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
            Drawable mutate = parentActivity.getResources().getDrawable(C1010R.C1011drawable.sheet_shadow_round).mutate();
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
                    setPadding(0, rect.top + AndroidUtilities.m35dp(8.0f), 0, rect.bottom);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    Point point = AndroidUtilities.displaySize;
                    boolean z = point.x < point.y;
                    int m35dp = AndroidUtilities.m35dp(12.0f);
                    if (z) {
                        ThemeListViewController.this.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                        ThemeListViewController.this.recyclerView.setPadding(m35dp, 0, m35dp, 0);
                        ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        ThemeListViewController.this.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        ThemeListViewController.this.recyclerView.setPadding(m35dp, m35dp / 2, m35dp, m35dp);
                        ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                    if (z) {
                        ThemeListViewController.this.bottomShadow.setVisibility(8);
                        ThemeListViewController.this.topShadow.setVisibility(8);
                    } else {
                        ThemeListViewController.this.bottomShadow.setVisibility(0);
                        ThemeListViewController.this.bottomShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.m35dp(2.0f), 80, 0.0f, 0.0f, 0.0f, 80.0f));
                        ThemeListViewController.this.topShadow.setVisibility(0);
                        ThemeListViewController.this.topShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.m35dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
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
                        rectF.set(0.0f, 0.0f, getWidth() + AndroidUtilities.m35dp(14.0f), getHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(14.0f), ThemeListViewController.this.backgroundPaint);
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
            textView.setPadding(AndroidUtilities.m35dp(21.0f), AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(21.0f), AndroidUtilities.m35dp(8.0f));
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
            int themedColor = baseFragment.getThemedColor("featuredStickers_addButton");
            int m35dp = AndroidUtilities.m35dp(28.0f);
            int i = C1010R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, BuildConfig.APP_CENTER_HASH + i, m35dp, m35dp, false, null);
            this.darkThemeDrawable = rLottieDrawable;
            this.forceDark = Theme.getActiveTheme().isDark() ^ true;
            setForceDark(Theme.getActiveTheme().isDark(), false);
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            RLottieImageView rLottieImageView = new RLottieImageView(parentActivity, QrActivity.this) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    if (QrActivity.this.isCurrentThemeDark) {
                        accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToDayTheme", C1010R.string.AccDescrSwitchToDayTheme));
                    } else {
                        accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToNightTheme", C1010R.string.AccDescrSwitchToNightTheme));
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
                public final void onItemClick(View view, int i2) {
                    QrActivity.ThemeListViewController.this.onItemClicked(view, i2);
                }
            });
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(QrActivity.this) {
                private int yScroll = 0;

                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    super.onScrolled(recyclerView, i2, i3);
                    this.yScroll += i3;
                    ThemeListViewController.this.topShadow.setAlpha((this.yScroll * 1.0f) / AndroidUtilities.m35dp(6.0f));
                }
            });
            frameLayout.addView(recyclerListView);
            View view = new View(parentActivity);
            this.topShadow = view;
            view.setAlpha(0.0f);
            int i2 = C1010R.C1011drawable.shadowdown;
            view.setBackground(ContextCompat.getDrawable(parentActivity, i2));
            view.setRotation(180.0f);
            frameLayout.addView(view);
            View view2 = new View(parentActivity);
            this.bottomShadow = view2;
            view2.setBackground(ContextCompat.getDrawable(parentActivity, i2));
            frameLayout.addView(view2);
            TextView textView2 = new TextView(parentActivity);
            this.shareButton = textView2;
            textView2.setBackground(Theme.AdaptiveRipple.filledRect(baseFragment.getThemedColor("featuredStickers_addButton"), 6.0f));
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setText(LocaleController.getString("ShareQrCode", C1010R.string.ShareQrCode));
            textView2.setTextColor(baseFragment.getThemedColor("featuredStickers_buttonText"));
            textView2.setTextSize(1, 15.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            frameLayout.addView(textView2);
        }

        public void lambda$new$0(View view) {
            if (this.changeDayNightViewAnimator != null) {
                return;
            }
            setupLightDarkTheme(!this.forceDark);
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
            if (this.adapter.items.get(i) == this.selectedItem || this.changeDayNightView != null) {
                return;
            }
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

        public void lambda$onItemClicked$1(int i) {
            int max;
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            if (layoutManager != null) {
                if (i > this.prevSelectedPosition) {
                    max = Math.min(i + 1, this.adapter.items.size() - 1);
                } else {
                    max = Math.max(i - 1, 0);
                }
                this.scroller.setTargetPosition(max);
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
                    this.adapter.items.get(i).themeIndex = z ? 1 : 0;
                    this.adapter.items.get(i).icon = QrActivity.this.getEmojiThemeIcon(this.adapter.items.get(i).chatTheme, z);
                }
                QrActivity.this.tempMotionDrawable = null;
                this.adapter.notifyDataSetChanged();
            }
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
            List<ChatThemeBottomSheet.ChatThemeItem> list;
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (adapter != null && (list = adapter.items) != null) {
                for (ChatThemeBottomSheet.ChatThemeItem chatThemeItem : list) {
                    chatThemeItem.themeIndex = this.forceDark ? 1 : 0;
                }
            }
            if (this.isLightDarkChangeAnimation) {
                return;
            }
            setItemsAnimationProgress(1.0f);
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
