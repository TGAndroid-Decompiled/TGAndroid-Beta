package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.FillLastLinearLayoutManager;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.AboutPremiumView;
import org.telegram.p009ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.p009ui.Components.Premium.PremiumButtonView;
import org.telegram.p009ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.p009ui.Components.Premium.PremiumGradient;
import org.telegram.p009ui.Components.Premium.PremiumNotAvailableBottomSheet;
import org.telegram.p009ui.Components.Premium.PremiumTierCell;
import org.telegram.p009ui.Components.Premium.StarParticlesView;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.SimpleThemeDescription;
import org.telegram.p009ui.PremiumPreviewFragment;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_help_saveAppLog;
import org.telegram.tgnet.TLRPC$TL_inputAppEvent;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumSubscription;
import org.telegram.tgnet.TLRPC$TL_jsonNull;
import org.telegram.tgnet.TLRPC$TL_jsonObject;
import org.telegram.tgnet.TLRPC$TL_jsonObjectValue;
import org.telegram.tgnet.TLRPC$TL_jsonString;
import org.telegram.tgnet.TLRPC$TL_payments_assignPlayMarketTransaction;
import org.telegram.tgnet.TLRPC$TL_payments_canPurchasePremium;
import org.telegram.tgnet.TLRPC$TL_premiumSubscriptionOption;
import org.telegram.tgnet.TLRPC$Updates;

public class PremiumPreviewFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    BackgroundView backgroundView;
    private FrameLayout buttonContainer;
    private View buttonDivider;
    private FrameLayout contentView;
    private int currentYOffset;
    PremiumFeatureCell dummyCell;
    PremiumTierCell dummyTierCell;
    int featuresEndRow;
    int featuresStartRow;
    private int firstViewHeight;
    private boolean forcePremium;
    final Canvas gradientCanvas;
    final Bitmap gradientTextureBitmap;
    PremiumGradient.GradientTools gradientTools;
    int helpUsRow;
    boolean inc;
    private boolean isDialogVisible;
    boolean isLandscapeMode;
    int lastPaddingRow;
    FillLastLinearLayoutManager layoutManager;
    RecyclerListView listView;
    int paddingRow;
    StarParticlesView particlesView;
    private PremiumButtonView premiumButtonView;
    int privacyRow;
    float progress;
    float progressToFull;
    int rowCount;
    int sectionRow;
    FrameLayout settingsView;
    Shader shader;
    Drawable shadowDrawable;
    private String source;
    private int statusBarHeight;
    int statusRow;
    PremiumGradient.GradientTools tiersGradientTools;
    int totalGradientHeight;
    float totalProgress;
    int totalTiersGradientHeight;
    ArrayList<PremiumFeatureData> premiumFeatures = new ArrayList<>();
    ArrayList<SubscriptionTier> subscriptionTiers = new ArrayList<>();
    int selectedTierIndex = 0;
    Matrix matrix = new Matrix();
    Paint gradientPaint = new Paint(1);

    public static String featureTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            default:
                return null;
        }
    }

    public static void lambda$sentPremiumButtonClick$15(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$sentPremiumBuyCanceled$16(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$sentShowFeaturePreview$17(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$sentShowScreenStat$14(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$updateButtonText$12(View view) {
    }

    @Override
    public boolean isLightStatusBar() {
        return false;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public static int serverStringToFeatureType(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2145993328:
                if (str.equals("animated_userpics")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2080028929:
                if (str.equals("infinite_reactions")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1755514268:
                if (str.equals("voice_to_text")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1425144150:
                if (str.equals("animated_emoji")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1040323278:
                if (str.equals("no_ads")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1023650261:
                if (str.equals("more_upload")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -969043445:
                if (str.equals("emoji_status")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -730864243:
                if (str.equals("profile_badge")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -448825858:
                if (str.equals("faster_download")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -165039170:
                if (str.equals("premium_stickers")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -96210874:
                if (str.equals("double_limits")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1219849581:
                if (str.equals("advanced_chat_management")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1832801148:
                if (str.equals("app_icons")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 7;
            case 1:
                return 4;
            case 2:
                return 8;
            case 3:
                return 11;
            case 4:
                return 3;
            case 5:
                return 1;
            case 6:
                return 12;
            case 7:
                return 6;
            case '\b':
                return 2;
            case '\t':
                return 5;
            case '\n':
                return 0;
            case 11:
                return 9;
            case '\f':
                return 10;
            default:
                return -1;
        }
    }

    public PremiumPreviewFragment setForcePremium() {
        this.forcePremium = true;
        return this;
    }

    public PremiumPreviewFragment(String str) {
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.gradientTextureBitmap = createBitmap;
        this.gradientCanvas = new Canvas(createBitmap);
        this.gradientTools = new PremiumGradient.GradientTools("premiumGradientBackground1", "premiumGradientBackground2", "premiumGradientBackground3", "premiumGradientBackground4");
        PremiumGradient.GradientTools gradientTools = new PremiumGradient.GradientTools("premiumGradient1", "premiumGradient2", null, null);
        this.tiersGradientTools = gradientTools;
        gradientTools.exactly = true;
        gradientTools.f1113x1 = 0.0f;
        gradientTools.f1115y1 = 0.0f;
        gradientTools.f1114x2 = 0.0f;
        gradientTools.f1116y2 = 1.0f;
        gradientTools.f1111cx = 0.0f;
        gradientTools.f1112cy = 0.0f;
        this.source = str;
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public View createView(Context context) {
        this.hasOwnBackground = true;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{Theme.getColor("premiumGradient4"), Theme.getColor("premiumGradient3"), Theme.getColor("premiumGradient2"), Theme.getColor("premiumGradient1"), Theme.getColor("premiumGradient0")}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
        this.shader = linearGradient;
        linearGradient.setLocalMatrix(this.matrix);
        this.gradientPaint.setShader(this.shader);
        this.dummyCell = new PremiumFeatureCell(context);
        this.dummyTierCell = new PremiumTierCell(context);
        this.premiumFeatures.clear();
        fillPremiumFeaturesList(this.premiumFeatures, this.currentAccount);
        final Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(C1072R.C1073drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        if (Build.VERSION.SDK_INT >= 21) {
            this.statusBarHeight = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            boolean iconInterceptedTouch;
            int lastSize;
            boolean listInterceptedTouch;

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                float x = PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.imageView.getX();
                float y = PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageView.getY();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(x, y, PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth() + x, PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredHeight() + y);
                if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.iconInterceptedTouch) && !PremiumPreviewFragment.this.listView.scrollingByUser) {
                    motionEvent.offsetLocation(-x, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.iconInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.iconInterceptedTouch = false;
                    }
                    PremiumPreviewFragment.this.backgroundView.imageView.dispatchTouchEvent(motionEvent);
                    return true;
                }
                float x2 = PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.tierListView.getX();
                float y2 = PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.tierListView.getY();
                rectF.set(x2, y2, PremiumPreviewFragment.this.backgroundView.tierListView.getWidth() + x2, PremiumPreviewFragment.this.backgroundView.tierListView.getHeight() + y2);
                if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.listInterceptedTouch) && !PremiumPreviewFragment.this.listView.scrollingByUser) {
                    motionEvent.offsetLocation(-x2, -y2);
                    if (motionEvent.getAction() == 0) {
                        this.listInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.listInterceptedTouch = false;
                    }
                    PremiumPreviewFragment.this.backgroundView.tierListView.dispatchTouchEvent(motionEvent);
                    if (this.listInterceptedTouch) {
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int i3 = 0;
                if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2)) {
                    PremiumPreviewFragment.this.isLandscapeMode = true;
                } else {
                    PremiumPreviewFragment.this.isLandscapeMode = false;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    PremiumPreviewFragment.this.statusBarHeight = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                }
                PremiumPreviewFragment.this.backgroundView.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                PremiumPreviewFragment.this.particlesView.getLayoutParams().height = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight();
                if (!PremiumPreviewFragment.this.getUserConfig().isPremium() && !PremiumPreviewFragment.this.forcePremium) {
                    i3 = AndroidUtilities.m36dp(68.0f);
                }
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.layoutManager.setAdditionalHeight((premiumPreviewFragment.statusBarHeight + i3) - AndroidUtilities.m36dp(16.0f));
                PremiumPreviewFragment.this.layoutManager.setMinimumLastViewHeight(i3);
                super.onMeasure(i, i2);
                if (this.lastSize != ((getMeasuredHeight() + getMeasuredWidth()) << 16)) {
                    PremiumPreviewFragment.this.updateBackgroundImage();
                }
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientScaleX = PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth() / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientScaleY = PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredHeight() / getMeasuredHeight();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartX = (PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.imageView.getX()) / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartY = (PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageView.getY()) / getMeasuredHeight();
            }

            @Override
            protected void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                PremiumPreviewFragment.this.measureGradient(i, i2);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                PremiumPreviewFragment premiumPreviewFragment;
                StarParticlesView starParticlesView;
                if (!PremiumPreviewFragment.this.isDialogVisible) {
                    PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment2.inc) {
                        float f = premiumPreviewFragment2.progress + 0.016f;
                        premiumPreviewFragment2.progress = f;
                        if (f > 3.0f) {
                            premiumPreviewFragment2.inc = false;
                        }
                    } else {
                        float f2 = premiumPreviewFragment2.progress - 0.016f;
                        premiumPreviewFragment2.progress = f2;
                        if (f2 < 1.0f) {
                            premiumPreviewFragment2.inc = true;
                        }
                    }
                }
                View findViewByPosition = PremiumPreviewFragment.this.listView.getLayoutManager() != null ? PremiumPreviewFragment.this.listView.getLayoutManager().findViewByPosition(0) : null;
                PremiumPreviewFragment.this.currentYOffset = findViewByPosition != null ? findViewByPosition.getBottom() : 0;
                int bottom = ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom() + AndroidUtilities.m36dp(16.0f);
                PremiumPreviewFragment.this.totalProgress = 1.0f - ((premiumPreviewFragment.currentYOffset - bottom) / (PremiumPreviewFragment.this.firstViewHeight - bottom));
                PremiumPreviewFragment premiumPreviewFragment3 = PremiumPreviewFragment.this;
                premiumPreviewFragment3.totalProgress = Utilities.clamp(premiumPreviewFragment3.totalProgress, 1.0f, 0.0f);
                int bottom2 = ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom() + AndroidUtilities.m36dp(16.0f);
                if (PremiumPreviewFragment.this.currentYOffset < bottom2) {
                    PremiumPreviewFragment.this.currentYOffset = bottom2;
                }
                PremiumPreviewFragment premiumPreviewFragment4 = PremiumPreviewFragment.this;
                float f3 = premiumPreviewFragment4.progressToFull;
                premiumPreviewFragment4.progressToFull = 0.0f;
                if (premiumPreviewFragment4.currentYOffset < AndroidUtilities.m36dp(30.0f) + bottom2) {
                    PremiumPreviewFragment.this.progressToFull = ((bottom2 + AndroidUtilities.m36dp(30.0f)) - PremiumPreviewFragment.this.currentYOffset) / AndroidUtilities.m36dp(30.0f);
                }
                PremiumPreviewFragment premiumPreviewFragment5 = PremiumPreviewFragment.this;
                if (premiumPreviewFragment5.isLandscapeMode) {
                    premiumPreviewFragment5.progressToFull = 1.0f;
                    premiumPreviewFragment5.totalProgress = 1.0f;
                }
                if (f3 != premiumPreviewFragment5.progressToFull) {
                    premiumPreviewFragment5.listView.invalidate();
                }
                float max = Math.max((((((((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight() - PremiumPreviewFragment.this.statusBarHeight) - PremiumPreviewFragment.this.backgroundView.titleView.getMeasuredHeight()) / 2.0f) + PremiumPreviewFragment.this.statusBarHeight) - PremiumPreviewFragment.this.backgroundView.getTop()) - PremiumPreviewFragment.this.backgroundView.titleView.getTop(), (PremiumPreviewFragment.this.currentYOffset - ((((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight() + PremiumPreviewFragment.this.backgroundView.getMeasuredHeight()) - PremiumPreviewFragment.this.statusBarHeight)) + AndroidUtilities.m36dp(PremiumPreviewFragment.this.backgroundView.tierListView.getVisibility() == 0 ? 24.0f : 16.0f));
                PremiumPreviewFragment.this.backgroundView.setTranslationY(max);
                PremiumPreviewFragment.this.backgroundView.imageView.setTranslationY(((-max) / 4.0f) + AndroidUtilities.m36dp(16.0f) + AndroidUtilities.m36dp(16.0f));
                PremiumPreviewFragment premiumPreviewFragment6 = PremiumPreviewFragment.this;
                float f4 = premiumPreviewFragment6.totalProgress;
                float f5 = ((1.0f - f4) * 0.4f) + 0.6f;
                float f6 = 1.0f - (f4 > 0.5f ? (f4 - 0.5f) / 0.5f : 0.0f);
                premiumPreviewFragment6.backgroundView.imageView.setScaleX(f5);
                PremiumPreviewFragment.this.backgroundView.imageView.setScaleY(f5);
                PremiumPreviewFragment.this.backgroundView.imageView.setAlpha(f6);
                PremiumPreviewFragment.this.backgroundView.subtitleView.setAlpha(f6);
                PremiumPreviewFragment.this.backgroundView.tierListView.setAlpha(f6);
                PremiumPreviewFragment premiumPreviewFragment7 = PremiumPreviewFragment.this;
                premiumPreviewFragment7.particlesView.setAlpha(1.0f - premiumPreviewFragment7.totalProgress);
                PremiumPreviewFragment.this.particlesView.setTranslationY(((-(starParticlesView.getMeasuredHeight() - PremiumPreviewFragment.this.backgroundView.imageView.getMeasuredWidth())) / 2.0f) + PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageView.getY());
                float m36dp = AndroidUtilities.m36dp(72.0f) - PremiumPreviewFragment.this.backgroundView.titleView.getLeft();
                PremiumPreviewFragment premiumPreviewFragment8 = PremiumPreviewFragment.this;
                float f7 = premiumPreviewFragment8.totalProgress;
                premiumPreviewFragment8.backgroundView.titleView.setTranslationX(m36dp * (1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (f7 > 0.3f ? (f7 - 0.3f) / 0.7f : 0.0f))));
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartX = ((PremiumPreviewFragment.this.backgroundView.getX() + PremiumPreviewFragment.this.backgroundView.imageView.getX()) + ((getMeasuredWidth() * 0.1f) * PremiumPreviewFragment.this.progress)) / getMeasuredWidth();
                PremiumPreviewFragment.this.backgroundView.imageView.mRenderer.gradientStartY = (PremiumPreviewFragment.this.backgroundView.getY() + PremiumPreviewFragment.this.backgroundView.imageView.getY()) / getMeasuredHeight();
                if (!PremiumPreviewFragment.this.isDialogVisible) {
                    invalidate();
                }
                PremiumPreviewFragment.this.gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), (-getMeasuredWidth()) * 0.1f * PremiumPreviewFragment.this.progress, 0.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), PremiumPreviewFragment.this.currentYOffset + AndroidUtilities.m36dp(20.0f), PremiumPreviewFragment.this.gradientTools.paint);
                super.dispatchDraw(canvas);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == PremiumPreviewFragment.this.listView) {
                    canvas.save();
                    canvas.clipRect(0, ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
                    super.drawChild(canvas, view, j);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.contentView = frameLayout;
        frameLayout.setFitsSystemWindows(true);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void onDraw(Canvas canvas) {
                Drawable drawable = PremiumPreviewFragment.this.shadowDrawable;
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                drawable.setBounds((int) ((-rect.left) - (AndroidUtilities.m36dp(16.0f) * premiumPreviewFragment.progressToFull)), (premiumPreviewFragment.currentYOffset - rect.top) - AndroidUtilities.m36dp(16.0f), (int) (getMeasuredWidth() + rect.right + (AndroidUtilities.m36dp(16.0f) * PremiumPreviewFragment.this.progressToFull)), getMeasuredHeight());
                PremiumPreviewFragment.this.shadowDrawable.draw(canvas);
                super.onDraw(canvas);
            }
        };
        this.listView = recyclerListView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, (AndroidUtilities.m36dp(68.0f) + this.statusBarHeight) - AndroidUtilities.m36dp(16.0f), this.listView);
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        this.layoutManager.setFixedLastItemHeight();
        this.listView.setAdapter(new Adapter());
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    int bottom = ((BaseFragment) PremiumPreviewFragment.this).actionBar.getBottom() + AndroidUtilities.m36dp(16.0f);
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.totalProgress > 0.5f) {
                        premiumPreviewFragment.listView.smoothScrollBy(0, premiumPreviewFragment.currentYOffset - bottom);
                    } else {
                        View findViewByPosition = premiumPreviewFragment.listView.getLayoutManager() != null ? PremiumPreviewFragment.this.listView.getLayoutManager().findViewByPosition(0) : null;
                        if (findViewByPosition != null && findViewByPosition.getTop() < 0) {
                            PremiumPreviewFragment.this.listView.smoothScrollBy(0, findViewByPosition.getTop());
                        }
                    }
                }
                PremiumPreviewFragment.this.checkButtonDivider();
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                PremiumPreviewFragment.this.contentView.invalidate();
                PremiumPreviewFragment.this.checkButtonDivider();
            }
        });
        this.backgroundView = new BackgroundView(this, context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        this.particlesView = new StarParticlesView(context);
        this.backgroundView.imageView.setStarParticlesView(this.particlesView);
        this.contentView.addView(this.particlesView, LayoutHelper.createFrame(-1, -2.0f));
        this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-1, -2.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                PremiumPreviewFragment.this.lambda$createView$0(view, i);
            }
        });
        this.contentView.addView(this.listView);
        this.premiumButtonView = new PremiumButtonView(context, false);
        updateButtonText(false);
        this.buttonContainer = new FrameLayout(context);
        View view = new View(context);
        this.buttonDivider = view;
        view.setBackgroundColor(Theme.getColor("divider"));
        this.buttonContainer.addView(this.buttonDivider, LayoutHelper.createFrame(-1, 1.0f));
        this.buttonDivider.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(this.buttonDivider, true, 1.0f, false);
        this.buttonContainer.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.buttonContainer.setBackgroundColor(getThemedColor("dialogBackground"));
        this.contentView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, 68, 80));
        this.fragmentView = this.contentView;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PremiumPreviewFragment.this.finishFragment();
                }
            }
        });
        this.actionBar.setForceSkipTouches(true);
        updateColors();
        updateRows();
        this.backgroundView.imageView.startEnterAnimation(-180, 200L);
        if (this.forcePremium) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PremiumPreviewFragment.this.lambda$createView$1();
                }
            }, 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        sentShowScreenStat(this.source);
        return this.fragmentView;
    }

    public void lambda$createView$0(View view, int i) {
        if (view instanceof PremiumFeatureCell) {
            PremiumFeatureCell premiumFeatureCell = (PremiumFeatureCell) view;
            sentShowFeaturePreview(this.currentAccount, premiumFeatureCell.data.type);
            showDialog(new PremiumFeatureBottomSheet(this, premiumFeatureCell.data.type, false, this.subscriptionTiers.get(this.selectedTierIndex)));
        }
    }

    public void lambda$createView$1() {
        getMediaDataController().loadPremiumPromo(false);
    }

    public static void buyPremium(BaseFragment baseFragment) {
        buyPremium(baseFragment, "settings");
    }

    public static void fillPremiumFeaturesList(ArrayList<PremiumFeatureData> arrayList, int i) {
        final MessagesController messagesController = MessagesController.getInstance(i);
        int i2 = 0;
        arrayList.add(new PremiumFeatureData(0, C1072R.C1073drawable.msg_premium_limits, LocaleController.getString("PremiumPreviewLimits", C1072R.string.PremiumPreviewLimits), LocaleController.formatString("PremiumPreviewLimitsDescription", C1072R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new PremiumFeatureData(1, C1072R.C1073drawable.msg_premium_uploads, LocaleController.getString("PremiumPreviewUploads", C1072R.string.PremiumPreviewUploads), LocaleController.getString("PremiumPreviewUploadsDescription", C1072R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new PremiumFeatureData(2, C1072R.C1073drawable.msg_premium_speed, LocaleController.getString("PremiumPreviewDownloadSpeed", C1072R.string.PremiumPreviewDownloadSpeed), LocaleController.getString("PremiumPreviewDownloadSpeedDescription", C1072R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new PremiumFeatureData(8, C1072R.C1073drawable.msg_premium_voice, LocaleController.getString("PremiumPreviewVoiceToText", C1072R.string.PremiumPreviewVoiceToText), LocaleController.getString("PremiumPreviewVoiceToTextDescription", C1072R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new PremiumFeatureData(3, C1072R.C1073drawable.msg_premium_ads, LocaleController.getString("PremiumPreviewNoAds", C1072R.string.PremiumPreviewNoAds), LocaleController.getString("PremiumPreviewNoAdsDescription", C1072R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new PremiumFeatureData(4, C1072R.C1073drawable.msg_premium_reactions, LocaleController.getString("PremiumPreviewReactions2", C1072R.string.PremiumPreviewReactions2), LocaleController.getString("PremiumPreviewReactions2Description", C1072R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new PremiumFeatureData(5, C1072R.C1073drawable.msg_premium_stickers, LocaleController.getString("PremiumPreviewStickers", C1072R.string.PremiumPreviewStickers), LocaleController.getString("PremiumPreviewStickersDescription", C1072R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new PremiumFeatureData(11, C1072R.C1073drawable.msg_premium_emoji, LocaleController.getString("PremiumPreviewEmoji", C1072R.string.PremiumPreviewEmoji), LocaleController.getString("PremiumPreviewEmojiDescription", C1072R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new PremiumFeatureData(9, C1072R.C1073drawable.msg_premium_tools, LocaleController.getString("PremiumPreviewAdvancedChatManagement", C1072R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString("PremiumPreviewAdvancedChatManagementDescription", C1072R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new PremiumFeatureData(6, C1072R.C1073drawable.msg_premium_badge, LocaleController.getString("PremiumPreviewProfileBadge", C1072R.string.PremiumPreviewProfileBadge), LocaleController.getString("PremiumPreviewProfileBadgeDescription", C1072R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new PremiumFeatureData(7, C1072R.C1073drawable.msg_premium_avatar, LocaleController.getString("PremiumPreviewAnimatedProfiles", C1072R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString("PremiumPreviewAnimatedProfilesDescription", C1072R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new PremiumFeatureData(10, C1072R.C1073drawable.msg_premium_icons, LocaleController.getString("PremiumPreviewAppIcon", C1072R.string.PremiumPreviewAppIcon), LocaleController.getString("PremiumPreviewAppIconDescription", C1072R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new PremiumFeatureData(12, C1072R.C1073drawable.msg_premium_status, LocaleController.getString("PremiumPreviewEmojiStatus", C1072R.string.PremiumPreviewEmojiStatus), LocaleController.getString("PremiumPreviewEmojiStatusDescription", C1072R.string.PremiumPreviewEmojiStatusDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i2 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(arrayList.get(i2).type, -1) == -1) {
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$fillPremiumFeaturesList$2;
                lambda$fillPremiumFeaturesList$2 = PremiumPreviewFragment.lambda$fillPremiumFeaturesList$2(MessagesController.this, (PremiumPreviewFragment.PremiumFeatureData) obj, (PremiumPreviewFragment.PremiumFeatureData) obj2);
                return lambda$fillPremiumFeaturesList$2;
            }
        });
    }

    public static int lambda$fillPremiumFeaturesList$2(MessagesController messagesController, PremiumFeatureData premiumFeatureData, PremiumFeatureData premiumFeatureData2) {
        return messagesController.premiumFeaturesTypesToPosition.get(premiumFeatureData.type, ConnectionsManager.DEFAULT_DATACENTER_ID) - messagesController.premiumFeaturesTypesToPosition.get(premiumFeatureData2.type, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public void updateBackgroundImage() {
        if (this.contentView.getMeasuredWidth() == 0 || this.contentView.getMeasuredHeight() == 0) {
            return;
        }
        this.gradientTools.gradientMatrix(0, 0, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), 0.0f, 0.0f);
        this.gradientCanvas.save();
        this.gradientCanvas.scale(100.0f / this.contentView.getMeasuredWidth(), 100.0f / this.contentView.getMeasuredHeight());
        this.gradientCanvas.drawRect(0.0f, 0.0f, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), this.gradientTools.paint);
        this.gradientCanvas.restore();
        this.backgroundView.imageView.setBackgroundBitmap(this.gradientTextureBitmap);
    }

    public void checkButtonDivider() {
        AndroidUtilities.updateViewVisibilityAnimated(this.buttonDivider, this.listView.canScrollVertically(1), 1.0f, true);
    }

    public static void buyPremium(BaseFragment baseFragment, String str) {
        buyPremium(baseFragment, null, str);
    }

    public static void buyPremium(final BaseFragment baseFragment, final SubscriptionTier subscriptionTier, String str) {
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            baseFragment.showDialog(new PremiumNotAvailableBottomSheet(baseFragment));
            return;
        }
        if (subscriptionTier == null) {
            Iterator<TLRPC$TL_premiumSubscriptionOption> it = baseFragment.getAccountInstance().getMediaDataController().getPremiumPromo().period_options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TLRPC$TL_premiumSubscriptionOption next = it.next();
                if (next.months == 1) {
                    subscriptionTier = new SubscriptionTier(next);
                    break;
                }
            }
        }
        sentPremiumButtonClick();
        if (BuildVars.useInvoiceBilling()) {
            Activity parentActivity = baseFragment.getParentActivity();
            if (parentActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) parentActivity;
                String str2 = subscriptionTier.subscriptionOption.bot_url;
                if (str2 == null) {
                    if (!TextUtils.isEmpty(baseFragment.getMessagesController().premiumBotUsername)) {
                        launchActivity.setNavigateToPremiumBot(true);
                        launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + baseFragment.getMessagesController().premiumBotUsername + "?start=" + str)));
                        return;
                    } else if (TextUtils.isEmpty(baseFragment.getMessagesController().premiumInvoiceSlug)) {
                        return;
                    } else {
                        launchActivity.onNewIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + baseFragment.getMessagesController().premiumInvoiceSlug)));
                        return;
                    }
                }
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.setNavigateToPremiumBot(true);
                }
                Browser.openUrl(launchActivity, subscriptionTier.subscriptionOption.bot_url);
                return;
            }
        }
        ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
        if (productDetails == null || productDetails.getSubscriptionOfferDetails().isEmpty()) {
            return;
        }
        if (subscriptionTier.getGooglePlayProductDetails() == null) {
            subscriptionTier.setGooglePlayProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
        }
        if (subscriptionTier.getOfferDetails() == null) {
            return;
        }
        BillingController.getInstance().queryPurchases("subs", new PurchasesResponseListener() {
            @Override
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                PremiumPreviewFragment.lambda$buyPremium$10(BaseFragment.this, subscriptionTier, billingResult, list);
            }
        });
    }

    public static void lambda$buyPremium$10(final BaseFragment baseFragment, final SubscriptionTier subscriptionTier, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PremiumPreviewFragment.lambda$buyPremium$9(BillingResult.this, baseFragment, list, subscriptionTier);
            }
        });
    }

    public static void lambda$buyPremium$9(BillingResult billingResult, final BaseFragment baseFragment, List list, final SubscriptionTier subscriptionTier) {
        if (billingResult.getResponseCode() == 0) {
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    PremiumPreviewFragment.lambda$buyPremium$3(BaseFragment.this);
                }
            };
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    if (purchase.getProducts().contains(BillingController.PREMIUM_PRODUCT_ID)) {
                        final TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction = new TLRPC$TL_payments_assignPlayMarketTransaction();
                        TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                        tLRPC$TL_payments_assignPlayMarketTransaction.receipt = tLRPC$TL_dataJSON;
                        tLRPC$TL_dataJSON.data = purchase.getOriginalJson();
                        TLRPC$TL_inputStorePaymentPremiumSubscription tLRPC$TL_inputStorePaymentPremiumSubscription = new TLRPC$TL_inputStorePaymentPremiumSubscription();
                        tLRPC$TL_inputStorePaymentPremiumSubscription.restore = true;
                        tLRPC$TL_payments_assignPlayMarketTransaction.purpose = tLRPC$TL_inputStorePaymentPremiumSubscription;
                        baseFragment.getConnectionsManager().sendRequest(tLRPC$TL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                PremiumPreviewFragment.lambda$buyPremium$5(BaseFragment.this, runnable, tLRPC$TL_payments_assignPlayMarketTransaction, tLObject, tLRPC$TL_error);
                            }
                        }, 66);
                        return;
                    }
                }
            }
            BillingController.getInstance().addResultListener(BillingController.PREMIUM_PRODUCT_ID, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    PremiumPreviewFragment.lambda$buyPremium$6(runnable, (BillingResult) obj);
                }
            });
            final TLRPC$TL_payments_canPurchasePremium tLRPC$TL_payments_canPurchasePremium = new TLRPC$TL_payments_canPurchasePremium();
            tLRPC$TL_payments_canPurchasePremium.purpose = new TLRPC$TL_inputStorePaymentPremiumSubscription();
            baseFragment.getConnectionsManager().sendRequest(tLRPC$TL_payments_canPurchasePremium, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PremiumPreviewFragment.lambda$buyPremium$8(BaseFragment.this, subscriptionTier, tLRPC$TL_payments_canPurchasePremium, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public static void lambda$buyPremium$3(BaseFragment baseFragment) {
        if (baseFragment instanceof PremiumPreviewFragment) {
            PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) baseFragment;
            premiumPreviewFragment.setForcePremium();
            premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
            premiumPreviewFragment.listView.smoothScrollToPosition(0);
        } else {
            baseFragment.presentFragment(new PremiumPreviewFragment(null).setForcePremium());
        }
        if (baseFragment.getParentActivity() instanceof LaunchActivity) {
            try {
                baseFragment.getFragmentView().performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            ((LaunchActivity) baseFragment.getParentActivity()).getFireworksOverlay().start();
        }
    }

    public static void lambda$buyPremium$5(final BaseFragment baseFragment, Runnable runnable, final TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Updates) {
            baseFragment.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            runnable.run();
        } else if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PremiumPreviewFragment.lambda$buyPremium$4(BaseFragment.this, tLRPC$TL_error, tLRPC$TL_payments_assignPlayMarketTransaction);
                }
            });
        }
    }

    public static void lambda$buyPremium$4(BaseFragment baseFragment, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction) {
        AlertsCreator.processError(baseFragment.getCurrentAccount(), tLRPC$TL_error, baseFragment, tLRPC$TL_payments_assignPlayMarketTransaction, new Object[0]);
    }

    public static void lambda$buyPremium$6(Runnable runnable, BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            runnable.run();
        }
    }

    public static void lambda$buyPremium$8(final BaseFragment baseFragment, final SubscriptionTier subscriptionTier, final TLRPC$TL_payments_canPurchasePremium tLRPC$TL_payments_canPurchasePremium, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PremiumPreviewFragment.lambda$buyPremium$7(TLObject.this, baseFragment, subscriptionTier, tLRPC$TL_error, tLRPC$TL_payments_canPurchasePremium);
            }
        });
    }

    public static void lambda$buyPremium$7(TLObject tLObject, BaseFragment baseFragment, SubscriptionTier subscriptionTier, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_payments_canPurchasePremium tLRPC$TL_payments_canPurchasePremium) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BillingController.getInstance().launchBillingFlow(baseFragment.getParentActivity(), baseFragment.getAccountInstance(), new TLRPC$TL_inputStorePaymentPremiumSubscription(), Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS).setOfferToken(subscriptionTier.getOfferDetails().getOfferToken()).build()));
        } else {
            AlertsCreator.processError(baseFragment.getCurrentAccount(), tLRPC$TL_error, baseFragment, tLRPC$TL_payments_canPurchasePremium, new Object[0]);
        }
    }

    public static String getPremiumButtonText(int i, SubscriptionTier subscriptionTier) {
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(C1072R.string.SubscribeToPremiumNotAvailable);
        }
        if (subscriptionTier != null) {
            return (BuildVars.useInvoiceBilling() || subscriptionTier.getOfferDetails() != null) ? LocaleController.formatString(C1072R.string.SubscribeToPremium, subscriptionTier.getFormattedPricePerMonth()) : LocaleController.getString(C1072R.string.Loading);
        } else if (BuildVars.useInvoiceBilling()) {
            TLRPC$TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i).getPremiumPromo();
            if (premiumPromo != null) {
                long j = 0;
                Iterator<TLRPC$TL_premiumSubscriptionOption> it = premiumPromo.period_options.iterator();
                String str = "USD";
                while (it.hasNext()) {
                    TLRPC$TL_premiumSubscriptionOption next = it.next();
                    if (next.months == 1) {
                        j = next.amount;
                        str = next.currency;
                    }
                }
                return LocaleController.formatString(C1072R.string.SubscribeToPremium, BillingController.getInstance().formatCurrency(j, str));
            }
            return LocaleController.getString(C1072R.string.SubscribeToPremiumNoPrice);
        } else {
            String str2 = null;
            ProductDetails productDetails = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (productDetails != null) {
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                if (!subscriptionOfferDetails.isEmpty()) {
                    Iterator<ProductDetails.PricingPhase> it2 = subscriptionOfferDetails.get(0).getPricingPhases().getPricingPhaseList().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ProductDetails.PricingPhase next2 = it2.next();
                        if (next2.getBillingPeriod().equals("P1M")) {
                            str2 = next2.getFormattedPrice();
                            break;
                        }
                    }
                }
            }
            return str2 == null ? LocaleController.getString(C1072R.string.Loading) : LocaleController.formatString(C1072R.string.SubscribeToPremium, str2);
        }
    }

    public void measureGradient(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.premiumFeatures.size(); i4++) {
            this.dummyCell.setData(this.premiumFeatures.get(i4), false);
            this.dummyCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            this.premiumFeatures.get(i4).yOffset = i3;
            i3 += this.dummyCell.getMeasuredHeight();
        }
        this.totalGradientHeight = i3;
    }

    private void updateRows() {
        this.rowCount = 0;
        this.sectionRow = -1;
        this.privacyRow = -1;
        int i = 0 + 1;
        this.rowCount = i;
        this.paddingRow = 0;
        this.featuresStartRow = i;
        int size = i + this.premiumFeatures.size();
        this.rowCount = size;
        this.featuresEndRow = size;
        int i2 = size + 1;
        this.rowCount = i2;
        this.statusRow = size;
        this.rowCount = i2 + 1;
        this.lastPaddingRow = i2;
        if (getUserConfig().isPremium() || this.forcePremium) {
            this.buttonContainer.setVisibility(8);
        } else {
            this.buttonContainer.setVisibility(0);
        }
        int m36dp = this.buttonContainer.getVisibility() == 0 ? AndroidUtilities.m36dp(64.0f) : 0;
        this.layoutManager.setAdditionalHeight((this.statusBarHeight + m36dp) - AndroidUtilities.m36dp(16.0f));
        this.layoutManager.setMinimumLastViewHeight(m36dp);
    }

    @Override
    public boolean onFragmentCreate() {
        if (getMessagesController().premiumLocked) {
            return false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.premiumPromoUpdated);
        if (getMediaDataController().getPremiumPromo() != null) {
            Iterator<TLRPC$Document> it = getMediaDataController().getPremiumPromo().videos.iterator();
            while (it.hasNext()) {
                FileLoader.getInstance(this.currentAccount).loadFile(it.next(), getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            updateButtonText(false);
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged || i == NotificationCenter.premiumPromoUpdated) {
            this.backgroundView.updateText();
            this.backgroundView.updatePremiumTiers();
            updateRows();
            this.listView.getAdapter().notifyDataSetChanged();
        }
    }

    private class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = viewGroup.getContext();
            if (i == 1) {
                view = new PremiumFeatureCell(context) {
                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(this.imageView.getLeft(), this.imageView.getTop(), this.imageView.getRight(), this.imageView.getBottom());
                        PremiumPreviewFragment.this.matrix.reset();
                        PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                        premiumPreviewFragment.matrix.postScale(1.0f, premiumPreviewFragment.totalGradientHeight / 100.0f, 0.0f, 0.0f);
                        PremiumPreviewFragment.this.matrix.postTranslate(0.0f, -this.data.yOffset);
                        PremiumPreviewFragment premiumPreviewFragment2 = PremiumPreviewFragment.this;
                        premiumPreviewFragment2.shader.setLocalMatrix(premiumPreviewFragment2.matrix);
                        canvas.drawRoundRect(rectF, AndroidUtilities.m36dp(8.0f), AndroidUtilities.m36dp(8.0f), PremiumPreviewFragment.this.gradientPaint);
                        super.dispatchDraw(canvas);
                    }
                };
            } else if (i == 2) {
                view = new ShadowSectionCell(context, 12, Theme.getColor("windowBackgroundGray"));
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(context, C1072R.C1073drawable.greydivider_bottom, Theme.getColor("windowBackgroundGrayShadow")), 0, 0);
                combinedDrawable.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable);
            } else if (i == 4) {
                view = new AboutPremiumView(context);
            } else if (i == 5) {
                view = new TextInfoPrivacyCell(context);
            } else if (i != 6) {
                view = new View(context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                        if (premiumPreviewFragment.isLandscapeMode) {
                            premiumPreviewFragment.firstViewHeight = (premiumPreviewFragment.statusBarHeight + ((BaseFragment) PremiumPreviewFragment.this).actionBar.getMeasuredHeight()) - AndroidUtilities.m36dp(16.0f);
                        } else {
                            int m36dp = AndroidUtilities.m36dp(300.0f) + PremiumPreviewFragment.this.statusBarHeight;
                            if (PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + AndroidUtilities.m36dp(24.0f) > m36dp) {
                                m36dp = PremiumPreviewFragment.this.backgroundView.getMeasuredHeight() + AndroidUtilities.m36dp(24.0f);
                            }
                            PremiumPreviewFragment.this.firstViewHeight = m36dp;
                        }
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(PremiumPreviewFragment.this.firstViewHeight, 1073741824));
                    }
                };
            } else {
                view = new View(context);
                view.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PremiumPreviewFragment.Adapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemCount() {
            return PremiumPreviewFragment.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            if (i == premiumPreviewFragment.paddingRow) {
                return 0;
            }
            if (i < premiumPreviewFragment.featuresStartRow || i >= premiumPreviewFragment.featuresEndRow) {
                if (i == premiumPreviewFragment.sectionRow) {
                    return 2;
                }
                if (i == premiumPreviewFragment.helpUsRow) {
                    return 4;
                }
                if (i == premiumPreviewFragment.statusRow || i == premiumPreviewFragment.privacyRow) {
                    return 5;
                }
                return i == premiumPreviewFragment.lastPaddingRow ? 6 : 0;
            }
            return 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }
    }

    public static class PremiumFeatureData {
        public final String description;
        public final int icon;
        public final String title;
        public final int type;
        public int yOffset;

        public PremiumFeatureData(int i, int i2, String str, String str2) {
            this.type = i;
            this.icon = i2;
            this.title = str;
            this.description = str2;
        }
    }

    public class BackgroundView extends LinearLayout {
        private final GLIconTextureView imageView;
        private final TextView subtitleView;
        private RecyclerListView tierListView;
        TextView titleView;

        public BackgroundView(Context context) {
            super(context);
            setOrientation(1);
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 0, PremiumPreviewFragment.this, context) {
                final Context val$context;

                {
                    this.val$context = context;
                }

                @Override
                public void onLongPress() {
                    super.onLongPress();
                    PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                    if (premiumPreviewFragment.settingsView == null || BuildVars.DEBUG_PRIVATE_VERSION) {
                        premiumPreviewFragment.settingsView = new FrameLayout(this.val$context);
                        ScrollView scrollView = new ScrollView(this.val$context);
                        scrollView.addView(new GLIconSettingsView(this.val$context, BackgroundView.this.imageView.mRenderer));
                        PremiumPreviewFragment.this.settingsView.addView(scrollView);
                        PremiumPreviewFragment.this.settingsView.setBackgroundColor(Theme.getColor("dialogBackground"));
                        PremiumPreviewFragment.this.contentView.addView(PremiumPreviewFragment.this.settingsView, LayoutHelper.createFrame(-1, -1, 80));
                        ((ViewGroup.MarginLayoutParams) PremiumPreviewFragment.this.settingsView.getLayoutParams()).topMargin = PremiumPreviewFragment.this.currentYOffset;
                        PremiumPreviewFragment.this.settingsView.setTranslationY(AndroidUtilities.m36dp(1000.0f));
                        PremiumPreviewFragment.this.settingsView.animate().translationY(1.0f).setDuration(300L);
                    }
                }
            };
            this.imageView = gLIconTextureView;
            addView(gLIconTextureView, LayoutHelper.createLinear(190, 190, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 22.0f);
            this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleView.setGravity(1);
            addView(this.titleView, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 16, 20, 16, 0));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
            textView2.setGravity(1);
            addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 16, 7, 16, 0));
            RecyclerListView recyclerListView = new RecyclerListView(context, PremiumPreviewFragment.this) {
                Paint paint;

                {
                    Paint paint = new Paint(1);
                    this.paint = paint;
                    paint.setColor(Theme.getColor("dialogBackground"));
                }

                @Override
                public void draw(Canvas canvas) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.m36dp(12.0f), AndroidUtilities.m36dp(12.0f), this.paint);
                    super.draw(canvas);
                }

                @Override
                public void onSizeChanged(int i, int i2, int i3, int i4) {
                    super.onSizeChanged(i, i2, i3, i4);
                    BackgroundView.this.measureGradient(i, i2);
                }
            };
            this.tierListView = recyclerListView;
            recyclerListView.setOverScrollMode(2);
            this.tierListView.setLayoutManager(new LinearLayoutManager(context));
            this.tierListView.setAdapter(new C38963(PremiumPreviewFragment.this, context));
            this.tierListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    PremiumPreviewFragment.BackgroundView.this.lambda$new$0(view, i);
                }
            });
            final Path path = new Path();
            final float[] fArr = new float[8];
            this.tierListView.setSelectorTransformer(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    PremiumPreviewFragment.BackgroundView.this.lambda$new$1(path, fArr, (Canvas) obj);
                }
            });
            addView(this.tierListView, LayoutHelper.createLinear(-1, -2, 12.0f, 16.0f, 12.0f, 0.0f));
            updateText();
            updatePremiumTiers();
        }

        public class C38963 extends RecyclerListView.SelectionAdapter {
            final Context val$context;

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            C38963(PremiumPreviewFragment premiumPreviewFragment, Context context) {
                this.val$context = context;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                final PremiumTierCell premiumTierCell = new PremiumTierCell(this.val$context) {
                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        if (this.discountView.getVisibility() == 0) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(this.discountView.getLeft(), this.discountView.getTop(), this.discountView.getRight(), this.discountView.getBottom());
                            PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0, getMeasuredWidth(), PremiumPreviewFragment.this.totalTiersGradientHeight, 0.0f, -this.tier.yOffset);
                            canvas.drawRoundRect(rectF, AndroidUtilities.m36dp(6.0f), AndroidUtilities.m36dp(6.0f), PremiumPreviewFragment.this.tiersGradientTools.paint);
                        }
                        super.dispatchDraw(canvas);
                    }
                };
                premiumTierCell.setCirclePaintProvider(new GenericProvider() {
                    @Override
                    public final Object provide(Object obj) {
                        Paint lambda$onCreateViewHolder$0;
                        lambda$onCreateViewHolder$0 = PremiumPreviewFragment.BackgroundView.C38963.this.lambda$onCreateViewHolder$0(premiumTierCell, (Void) obj);
                        return lambda$onCreateViewHolder$0;
                    }
                });
                return new RecyclerListView.Holder(premiumTierCell);
            }

            public Paint lambda$onCreateViewHolder$0(PremiumTierCell premiumTierCell, Void r9) {
                PremiumPreviewFragment.this.tiersGradientTools.gradientMatrix(0, 0, premiumTierCell.getMeasuredWidth(), PremiumPreviewFragment.this.totalTiersGradientHeight, 0.0f, -premiumTierCell.getTier().yOffset);
                return PremiumPreviewFragment.this.tiersGradientTools.paint;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) viewHolder.itemView;
                premiumTierCell.bind(PremiumPreviewFragment.this.subscriptionTiers.get(i), i != getItemCount() - 1);
                premiumTierCell.setChecked(PremiumPreviewFragment.this.selectedTierIndex == i, false);
            }

            @Override
            public int getItemCount() {
                return PremiumPreviewFragment.this.subscriptionTiers.size();
            }
        }

        public void lambda$new$0(View view, int i) {
            if (view instanceof PremiumTierCell) {
                PremiumTierCell premiumTierCell = (PremiumTierCell) view;
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.selectedTierIndex = premiumPreviewFragment.subscriptionTiers.indexOf(premiumTierCell.getTier());
                PremiumPreviewFragment.this.updateButtonText(true);
                premiumTierCell.setChecked(true, true);
                for (int i2 = 0; i2 < this.tierListView.getChildCount(); i2++) {
                    View childAt = this.tierListView.getChildAt(i2);
                    if (childAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell2 = (PremiumTierCell) childAt;
                        if (premiumTierCell2.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell2.setChecked(false, true);
                        }
                    }
                }
                for (int i3 = 0; i3 < this.tierListView.getHiddenChildCount(); i3++) {
                    View hiddenChildAt = this.tierListView.getHiddenChildAt(i3);
                    if (hiddenChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell3 = (PremiumTierCell) hiddenChildAt;
                        if (premiumTierCell3.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell3.setChecked(false, true);
                        }
                    }
                }
                for (int i4 = 0; i4 < this.tierListView.getCachedChildCount(); i4++) {
                    View cachedChildAt = this.tierListView.getCachedChildAt(i4);
                    if (cachedChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell4 = (PremiumTierCell) cachedChildAt;
                        if (premiumTierCell4.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell4.setChecked(false, true);
                        }
                    }
                }
                for (int i5 = 0; i5 < this.tierListView.getAttachedScrapChildCount(); i5++) {
                    View attachedScrapChildAt = this.tierListView.getAttachedScrapChildAt(i5);
                    if (attachedScrapChildAt instanceof PremiumTierCell) {
                        PremiumTierCell premiumTierCell5 = (PremiumTierCell) attachedScrapChildAt;
                        if (premiumTierCell5.getTier() != premiumTierCell.getTier()) {
                            premiumTierCell5.setChecked(false, true);
                        }
                    }
                }
            }
        }

        public void lambda$new$1(Path path, float[] fArr, Canvas canvas) {
            View pressedChildView = this.tierListView.getPressedChildView();
            int adapterPosition = pressedChildView == null ? -1 : this.tierListView.getChildViewHolder(pressedChildView).getAdapterPosition();
            path.rewind();
            Rect selectorRect = this.tierListView.getSelectorRect();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
            Arrays.fill(fArr, 0.0f);
            if (adapterPosition == 0) {
                Arrays.fill(fArr, 0, 4, AndroidUtilities.m36dp(12.0f));
            }
            if (adapterPosition == this.tierListView.getAdapter().getItemCount() - 1) {
                Arrays.fill(fArr, 4, 8, AndroidUtilities.m36dp(12.0f));
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
        }

        public void measureGradient(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < PremiumPreviewFragment.this.subscriptionTiers.size(); i4++) {
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.dummyTierCell.bind(premiumPreviewFragment.subscriptionTiers.get(i4), false);
                PremiumPreviewFragment.this.dummyTierCell.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                PremiumPreviewFragment.this.subscriptionTiers.get(i4).yOffset = i3;
                i3 += PremiumPreviewFragment.this.dummyTierCell.getMeasuredHeight();
            }
            PremiumPreviewFragment.this.totalTiersGradientHeight = i3;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void updatePremiumTiers() {
            long j;
            PremiumPreviewFragment.this.subscriptionTiers.clear();
            long j2 = 0;
            if (PremiumPreviewFragment.this.getMediaDataController().getPremiumPromo() != null) {
                Iterator<TLRPC$TL_premiumSubscriptionOption> it = PremiumPreviewFragment.this.getMediaDataController().getPremiumPromo().period_options.iterator();
                j = 0;
                while (it.hasNext()) {
                    SubscriptionTier subscriptionTier = new SubscriptionTier(it.next());
                    PremiumPreviewFragment.this.subscriptionTiers.add(subscriptionTier);
                    if (BuildVars.useInvoiceBilling() && subscriptionTier.getPricePerYear() > j) {
                        j = subscriptionTier.getPricePerYear();
                    }
                }
            } else {
                j = 0;
            }
            if (BuildVars.useInvoiceBilling()) {
                Iterator<SubscriptionTier> it2 = PremiumPreviewFragment.this.subscriptionTiers.iterator();
                while (it2.hasNext()) {
                    it2.next().setPricePerYearRegular(j);
                }
            } else if (BillingController.getInstance().isReady() && BillingController.PREMIUM_PRODUCT_DETAILS != null) {
                Iterator<SubscriptionTier> it3 = PremiumPreviewFragment.this.subscriptionTiers.iterator();
                while (it3.hasNext()) {
                    SubscriptionTier next = it3.next();
                    next.setGooglePlayProductDetails(BillingController.PREMIUM_PRODUCT_DETAILS);
                    if (next.getPricePerYear() > j2) {
                        j2 = next.getPricePerYear();
                    }
                }
                Iterator<SubscriptionTier> it4 = PremiumPreviewFragment.this.subscriptionTiers.iterator();
                while (it4.hasNext()) {
                    it4.next().setPricePerYearRegular(j2);
                }
            }
            int i = 0;
            while (true) {
                if (i >= PremiumPreviewFragment.this.subscriptionTiers.size()) {
                    break;
                } else if (PremiumPreviewFragment.this.subscriptionTiers.get(i).getMonths() == 1) {
                    PremiumPreviewFragment.this.selectedTierIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            PremiumPreviewFragment.this.updateButtonText(false);
            this.tierListView.getAdapter().notifyDataSetChanged();
        }

        public void updateText() {
            this.titleView.setText(LocaleController.getString(PremiumPreviewFragment.this.forcePremium ? C1072R.string.TelegramPremiumSubscribedTitle : C1072R.string.TelegramPremium));
            this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.getString((PremiumPreviewFragment.this.getUserConfig().isPremium() || PremiumPreviewFragment.this.forcePremium) ? C1072R.string.TelegramPremiumSubscribedSubtitle : C1072R.string.TelegramPremiumSubtitle)));
            RecyclerListView recyclerListView = this.tierListView;
            if (!PremiumPreviewFragment.this.getUserConfig().isPremium() && !PremiumPreviewFragment.this.forcePremium) {
                boolean z = BuildVars.IS_BILLING_UNAVAILABLE;
            }
            recyclerListView.setVisibility(8);
        }
    }

    public void updateButtonText(boolean z) {
        PremiumButtonView premiumButtonView = this.premiumButtonView;
        if (premiumButtonView == null) {
            return;
        }
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, this.subscriptionTiers.get(this.selectedTierIndex)), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PremiumPreviewFragment.this.lambda$updateButtonText$11(view);
                }
            }, z);
        } else if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || this.subscriptionTiers.isEmpty() || this.subscriptionTiers.get(this.selectedTierIndex).googlePlayProductDetails == null)) {
            this.premiumButtonView.setButton(LocaleController.getString(C1072R.string.Loading), PremiumPreviewFragment$$ExternalSyntheticLambda2.INSTANCE, z);
            this.premiumButtonView.setFlickerDisabled(true);
        } else if (this.subscriptionTiers.isEmpty()) {
        } else {
            this.premiumButtonView.setButton(getPremiumButtonText(this.currentAccount, this.subscriptionTiers.get(this.selectedTierIndex)), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PremiumPreviewFragment.this.lambda$updateButtonText$13(view);
                }
            }, z);
            this.premiumButtonView.setFlickerDisabled(false);
        }
    }

    public void lambda$updateButtonText$11(View view) {
        buyPremium(this);
    }

    public void lambda$updateButtonText$13(View view) {
        buyPremium(this, this.subscriptionTiers.get(this.selectedTierIndex), "settings");
    }

    @Override
    public void onResume() {
        super.onResume();
        this.backgroundView.imageView.setPaused(false);
        this.backgroundView.imageView.setDialogVisible(false);
        this.particlesView.setPaused(false);
    }

    @Override
    public void onPause() {
        super.onPause();
        this.backgroundView.imageView.setDialogVisible(true);
        this.particlesView.setPaused(true);
    }

    @Override
    public boolean canBeginSlide() {
        return !this.backgroundView.imageView.touched;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                PremiumPreviewFragment.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, "premiumGradient1", "premiumGradient2", "premiumGradient3", "premiumGradient4", "premiumGradientBackground1", "premiumGradientBackground2", "premiumGradientBackground3", "premiumGradientBackground4", "premiumGradientBackgroundOverlay", "premiumStarGradient1", "premiumStarGradient2", "premiumStartSmallStarsColor", "premiumStartSmallStarsColor2");
    }

    public void updateColors() {
        C1133ActionBar c1133ActionBar;
        if (this.backgroundView == null || (c1133ActionBar = this.actionBar) == null) {
            return;
        }
        c1133ActionBar.setItemsColor(Theme.getColor("premiumGradientBackgroundOverlay"), false);
        this.actionBar.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor("premiumGradientBackgroundOverlay"), 60), false);
        this.backgroundView.titleView.setTextColor(Theme.getColor("premiumGradientBackgroundOverlay"));
        this.backgroundView.subtitleView.setTextColor(Theme.getColor("premiumGradientBackgroundOverlay"));
        this.particlesView.drawable.updateColors();
        if (this.backgroundView.imageView.mRenderer != null) {
            this.backgroundView.imageView.mRenderer.updateColors();
        }
        updateBackgroundImage();
    }

    @Override
    public boolean onBackPressed() {
        if (this.settingsView != null) {
            closeSetting();
            return false;
        }
        return super.onBackPressed();
    }

    private void closeSetting() {
        this.settingsView.animate().translationY(AndroidUtilities.m36dp(1000.0f)).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PremiumPreviewFragment.this.contentView.removeView(PremiumPreviewFragment.this.settingsView);
                PremiumPreviewFragment.this.settingsView = null;
                super.onAnimationEnd(animator);
            }
        });
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        updateDialogVisibility(showDialog != null);
        return showDialog;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        updateDialogVisibility(false);
    }

    private void updateDialogVisibility(boolean z) {
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            this.backgroundView.imageView.setDialogVisible(z);
            this.particlesView.setPaused(z);
            this.contentView.invalidate();
        }
    }

    public static void sentShowScreenStat(String str) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC$TL_help_saveAppLog tLRPC$TL_help_saveAppLog = new TLRPC$TL_help_saveAppLog();
        TLRPC$TL_inputAppEvent tLRPC$TL_inputAppEvent = new TLRPC$TL_inputAppEvent();
        tLRPC$TL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tLRPC$TL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC$TL_jsonObject tLRPC$TL_jsonObject = new TLRPC$TL_jsonObject();
        tLRPC$TL_inputAppEvent.data = tLRPC$TL_jsonObject;
        TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = new TLRPC$TL_jsonObjectValue();
        TLRPC$TL_jsonString tLRPC$TL_jsonString = new TLRPC$TL_jsonString();
        tLRPC$TL_jsonString.value = str;
        tLRPC$TL_jsonObjectValue.key = "source";
        tLRPC$TL_jsonObjectValue.value = tLRPC$TL_jsonString;
        tLRPC$TL_jsonObject.value.add(tLRPC$TL_jsonObjectValue);
        tLRPC$TL_help_saveAppLog.events.add(tLRPC$TL_inputAppEvent);
        connectionsManager.sendRequest(tLRPC$TL_help_saveAppLog, PremiumPreviewFragment$$ExternalSyntheticLambda16.INSTANCE);
    }

    public static void sentPremiumButtonClick() {
        TLRPC$TL_help_saveAppLog tLRPC$TL_help_saveAppLog = new TLRPC$TL_help_saveAppLog();
        TLRPC$TL_inputAppEvent tLRPC$TL_inputAppEvent = new TLRPC$TL_inputAppEvent();
        tLRPC$TL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tLRPC$TL_inputAppEvent.type = "premium.promo_screen_accept";
        tLRPC$TL_inputAppEvent.data = new TLRPC$TL_jsonNull();
        tLRPC$TL_help_saveAppLog.events.add(tLRPC$TL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_help_saveAppLog, PremiumPreviewFragment$$ExternalSyntheticLambda13.INSTANCE);
    }

    public static void sentPremiumBuyCanceled() {
        TLRPC$TL_help_saveAppLog tLRPC$TL_help_saveAppLog = new TLRPC$TL_help_saveAppLog();
        TLRPC$TL_inputAppEvent tLRPC$TL_inputAppEvent = new TLRPC$TL_inputAppEvent();
        tLRPC$TL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tLRPC$TL_inputAppEvent.type = "premium.promo_screen_fail";
        tLRPC$TL_inputAppEvent.data = new TLRPC$TL_jsonNull();
        tLRPC$TL_help_saveAppLog.events.add(tLRPC$TL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_help_saveAppLog, PremiumPreviewFragment$$ExternalSyntheticLambda15.INSTANCE);
    }

    public static void sentShowFeaturePreview(int i, int i2) {
        TLRPC$TL_help_saveAppLog tLRPC$TL_help_saveAppLog = new TLRPC$TL_help_saveAppLog();
        TLRPC$TL_inputAppEvent tLRPC$TL_inputAppEvent = new TLRPC$TL_inputAppEvent();
        tLRPC$TL_inputAppEvent.time = ConnectionsManager.getInstance(i).getCurrentTime();
        tLRPC$TL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC$TL_jsonObject tLRPC$TL_jsonObject = new TLRPC$TL_jsonObject();
        tLRPC$TL_inputAppEvent.data = tLRPC$TL_jsonObject;
        TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = new TLRPC$TL_jsonObjectValue();
        TLRPC$TL_jsonString tLRPC$TL_jsonString = new TLRPC$TL_jsonString();
        tLRPC$TL_jsonString.value = featureTypeToServerString(i2);
        tLRPC$TL_jsonObjectValue.key = "item";
        tLRPC$TL_jsonObjectValue.value = tLRPC$TL_jsonString;
        tLRPC$TL_jsonObject.value.add(tLRPC$TL_jsonObjectValue);
        tLRPC$TL_help_saveAppLog.events.add(tLRPC$TL_inputAppEvent);
        tLRPC$TL_inputAppEvent.data = tLRPC$TL_jsonObject;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_help_saveAppLog, PremiumPreviewFragment$$ExternalSyntheticLambda14.INSTANCE);
    }

    public static final class SubscriptionTier {
        private int discount;
        private ProductDetails googlePlayProductDetails;
        private ProductDetails.SubscriptionOfferDetails offerDetails;
        private long pricePerMonth;
        private long pricePerYear;
        private long pricePerYearRegular;
        public final TLRPC$TL_premiumSubscriptionOption subscriptionOption;
        public int yOffset;

        public SubscriptionTier(TLRPC$TL_premiumSubscriptionOption tLRPC$TL_premiumSubscriptionOption) {
            this.subscriptionOption = tLRPC$TL_premiumSubscriptionOption;
        }

        public ProductDetails getGooglePlayProductDetails() {
            return this.googlePlayProductDetails;
        }

        public ProductDetails.SubscriptionOfferDetails getOfferDetails() {
            checkOfferDetails();
            return this.offerDetails;
        }

        public void setGooglePlayProductDetails(ProductDetails productDetails) {
            this.googlePlayProductDetails = productDetails;
        }

        public void setPricePerYearRegular(long j) {
            this.pricePerYearRegular = j;
        }

        public int getMonths() {
            return this.subscriptionOption.months;
        }

        public int getDiscount() {
            if (this.discount == 0) {
                if (getPricePerMonth() == 0) {
                    return 0;
                }
                if (this.pricePerYearRegular != 0) {
                    double pricePerYear = getPricePerYear();
                    double d = this.pricePerYearRegular;
                    Double.isNaN(pricePerYear);
                    Double.isNaN(d);
                    int i = (int) ((1.0d - (pricePerYear / d)) * 100.0d);
                    this.discount = i;
                    if (i == 0) {
                        this.discount = -1;
                    }
                }
            }
            return this.discount;
        }

        public long getPricePerYear() {
            if (this.pricePerYear == 0) {
                long price = getPrice();
                if (price != 0) {
                    double d = price;
                    double d2 = this.subscriptionOption.months;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    this.pricePerYear = (long) ((d / d2) * 12.0d);
                }
            }
            return this.pricePerYear;
        }

        public long getPricePerMonth() {
            if (this.pricePerMonth == 0) {
                long price = getPrice();
                if (price != 0) {
                    this.pricePerMonth = price / this.subscriptionOption.months;
                }
            }
            return this.pricePerMonth;
        }

        public String getFormattedPricePerYearRegular() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(this.pricePerYearRegular, getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(this.pricePerYearRegular, getCurrency(), 6);
        }

        public String getFormattedPricePerYear() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerYear(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerYear(), getCurrency(), 6);
        }

        public String getFormattedPricePerMonth() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency());
            }
            return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPricePerMonth(), getCurrency(), 6);
        }

        public long getPrice() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return this.subscriptionOption.amount;
            }
            if (this.googlePlayProductDetails == null) {
                return 0L;
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            if (subscriptionOfferDetails == null) {
                return 0L;
            }
            return subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceAmountMicros();
        }

        public String getCurrency() {
            if (BuildVars.useInvoiceBilling() || this.subscriptionOption.store_product == null) {
                return this.subscriptionOption.currency;
            }
            if (this.googlePlayProductDetails == null) {
                return "";
            }
            checkOfferDetails();
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = this.offerDetails;
            return subscriptionOfferDetails == null ? "" : subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceCurrencyCode();
        }

        private void checkOfferDetails() {
            ProductDetails productDetails = this.googlePlayProductDetails;
            if (productDetails != null && this.offerDetails == null) {
                for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails : productDetails.getSubscriptionOfferDetails()) {
                    String billingPeriod = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getBillingPeriod();
                    if (getMonths() == 12) {
                        if (billingPeriod.equals("P1Y")) {
                            this.offerDetails = subscriptionOfferDetails;
                            return;
                        }
                    } else if (billingPeriod.equals(String.format(Locale.ROOT, "P%dM", Integer.valueOf(getMonths())))) {
                        this.offerDetails = subscriptionOfferDetails;
                        return;
                    }
                }
            }
        }
    }
}
