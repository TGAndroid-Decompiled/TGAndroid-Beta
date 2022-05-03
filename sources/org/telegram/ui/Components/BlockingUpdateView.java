package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.tgnet.TLRPC$TL_help_getAppUpdate;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class BlockingUpdateView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private FrameLayout acceptButton;
    private TextView acceptTextView;
    private int accountNum;
    private TLRPC$TL_help_appUpdate appUpdate;
    private String fileName;
    private int pressCount;
    private AnimatorSet progressAnimation;
    private RadialProgress radialProgress;
    private FrameLayout radialProgressView;
    private ScrollView scrollView;
    private TextView textView;
    Drawable gradientDrawableTop = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.getColor("windowBackgroundWhite"), 0});
    Drawable gradientDrawableBottom = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Theme.getColor("windowBackgroundWhite"), 0});

    public BlockingUpdateView(Context context) {
        super(context);
        setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 21 ? (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density) : 0;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + (i >= 21 ? AndroidUtilities.statusBarHeight : 0)));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAnimation(R.raw.qr_code_logo, 108, 108);
        rLottieImageView.playAnimation();
        rLottieImageView.getAnimatedDrawable().setAutoRepeat(1);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, i2, 0.0f, 0.0f));
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BlockingUpdateView.this.lambda$new$0(view);
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, Theme.getColor("actionBarDefault"));
        this.scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        this.scrollView.setClipToPadding(false);
        addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 27.0f, i2 + 178, 27.0f, 130.0f));
        this.scrollView.addView(frameLayout2);
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(49);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setText(LocaleController.getString("UpdateTelegram", R.string.UpdateTelegram));
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2, 49));
        TextView textView2 = new TextView(context);
        this.textView = textView2;
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.textView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
        this.textView.setTextSize(1, 15.0f);
        this.textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.textView.setGravity(49);
        this.textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        frameLayout2.addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(this, context) {
            CellFlickerDrawable cellFlickerDrawable;

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (this.cellFlickerDrawable == null) {
                    CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
                    this.cellFlickerDrawable = cellFlickerDrawable;
                    cellFlickerDrawable.drawFrame = false;
                    cellFlickerDrawable.repeatProgress = 2.0f;
                }
                this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.cellFlickerDrawable.draw(canvas, rectF, AndroidUtilities.dp(4.0f));
                invalidate();
            }

            @Override
            protected void onMeasure(int i3, int i4) {
                if (View.MeasureSpec.getSize(i3) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i4);
                } else {
                    super.onMeasure(i3, i4);
                }
            }
        };
        this.acceptButton = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.acceptButton.setBackgroundDrawable(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 4.0f));
        this.acceptButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        addView(this.acceptButton, LayoutHelper.createFrame(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
        this.acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BlockingUpdateView.this.lambda$new$1(view);
            }
        });
        TextView textView3 = new TextView(context);
        this.acceptTextView = textView3;
        textView3.setGravity(17);
        this.acceptTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.acceptTextView.setTextColor(-1);
        this.acceptTextView.setTextSize(1, 14.0f);
        this.acceptButton.addView(this.acceptTextView, LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout frameLayout4 = new FrameLayout(context) {
            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                int dp = AndroidUtilities.dp(36.0f);
                int i7 = ((i5 - i3) - dp) / 2;
                int i8 = ((i6 - i4) - dp) / 2;
                BlockingUpdateView.this.radialProgress.setProgressRect(i7, i8, i7 + dp, dp + i8);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                BlockingUpdateView.this.radialProgress.draw(canvas);
            }
        };
        this.radialProgressView = frameLayout4;
        frameLayout4.setWillNotDraw(false);
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setVisibility(4);
        RadialProgress radialProgress = new RadialProgress(this.radialProgressView);
        this.radialProgress = radialProgress;
        radialProgress.setBackground(null, true, false);
        this.radialProgress.setProgressColor(-1);
        this.acceptButton.addView(this.radialProgressView, LayoutHelper.createFrame(36, 36, 17));
    }

    public void lambda$new$0(View view) {
        int i = this.pressCount + 1;
        this.pressCount = i;
        if (i >= 10) {
            setVisibility(8);
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
        }
    }

    public void lambda$new$1(View view) {
        if (checkApkInstallPermissions(getContext())) {
            TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate = this.appUpdate;
            if (tLRPC$TL_help_appUpdate.document instanceof TLRPC$TL_document) {
                if (!openApkInstall((Activity) getContext(), this.appUpdate.document)) {
                    FileLoader.getInstance(this.accountNum).loadFile(this.appUpdate.document, "update", 2, 1);
                    showProgress(true);
                }
            } else if (tLRPC$TL_help_appUpdate.url != null) {
                Browser.openUrl(getContext(), this.appUpdate.url);
            }
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            NotificationCenter.getInstance(this.accountNum).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.accountNum).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.accountNum).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.fileName;
            if (str2 != null && str2.equals(str)) {
                showProgress(false);
                openApkInstall((Activity) getContext(), this.appUpdate.document);
            }
        } else if (i == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.fileName;
            if (str4 != null && str4.equals(str3)) {
                showProgress(false);
            }
        } else if (i == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.fileName;
            if (str6 != null && str6.equals(str5)) {
                this.radialProgress.setProgress(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
            }
        }
    }

    public static boolean checkApkInstallPermissions(Context context) {
        if (Build.VERSION.SDK_INT < 26 || ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
            return true;
        }
        AlertsCreator.createApkRestrictedDialog(context, null).show();
        return false;
    }

    public static boolean openApkInstall(Activity activity, TLRPC$Document tLRPC$Document) {
        boolean z = false;
        try {
            FileLoader.getAttachFileName(tLRPC$Document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$Document, true);
            z = pathToAttach.exists();
            if (z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.getUriForFile(activity, "org.telegram.messenger.beta.provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return z;
    }

    private void showProgress(final boolean z) {
        AnimatorSet animatorSet = this.progressAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.progressAnimation = new AnimatorSet();
        if (z) {
            this.radialProgressView.setVisibility(0);
            this.acceptButton.setEnabled(false);
            this.progressAnimation.playTogether(ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.acceptTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.radialProgressView, View.ALPHA, 1.0f));
        } else {
            this.acceptTextView.setVisibility(0);
            this.acceptButton.setEnabled(true);
            this.progressAnimation.playTogether(ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.radialProgressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.acceptTextView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.acceptTextView, View.ALPHA, 1.0f));
        }
        this.progressAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (BlockingUpdateView.this.progressAnimation != null && BlockingUpdateView.this.progressAnimation.equals(animator)) {
                    if (!z) {
                        BlockingUpdateView.this.radialProgressView.setVisibility(4);
                    } else {
                        BlockingUpdateView.this.acceptTextView.setVisibility(4);
                    }
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (BlockingUpdateView.this.progressAnimation != null && BlockingUpdateView.this.progressAnimation.equals(animator)) {
                    BlockingUpdateView.this.progressAnimation = null;
                }
            }
        });
        this.progressAnimation.setDuration(150L);
        this.progressAnimation.start();
    }

    public void show(int i, TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate, boolean z) {
        this.pressCount = 0;
        this.appUpdate = tLRPC$TL_help_appUpdate;
        this.accountNum = i;
        TLRPC$Document tLRPC$Document = tLRPC$TL_help_appUpdate.document;
        if (tLRPC$Document instanceof TLRPC$TL_document) {
            this.fileName = FileLoader.getAttachFileName(tLRPC$Document);
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tLRPC$TL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tLRPC$TL_help_appUpdate.entities, false, false, false, false);
        this.textView.setText(spannableStringBuilder);
        if (tLRPC$TL_help_appUpdate.document instanceof TLRPC$TL_document) {
            TextView textView = this.acceptTextView;
            textView.setText(LocaleController.getString("Update", R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tLRPC$TL_help_appUpdate.document.size)));
        } else {
            this.acceptTextView.setText(LocaleController.getString("Update", R.string.Update));
        }
        NotificationCenter.getInstance(this.accountNum).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.accountNum).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.accountNum).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        if (z) {
            TLRPC$TL_help_getAppUpdate tLRPC$TL_help_getAppUpdate = new TLRPC$TL_help_getAppUpdate();
            try {
                tLRPC$TL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tLRPC$TL_help_getAppUpdate.source == null) {
                tLRPC$TL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(this.accountNum).sendRequest(tLRPC$TL_help_getAppUpdate, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BlockingUpdateView.this.lambda$show$3(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$show$3(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BlockingUpdateView.this.lambda$show$2(tLObject);
            }
        });
    }

    public void lambda$show$2(TLObject tLObject) {
        if ((tLObject instanceof TLRPC$TL_help_appUpdate) && !((TLRPC$TL_help_appUpdate) tLObject).can_not_skip) {
            setVisibility(8);
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.gradientDrawableTop.setBounds(this.scrollView.getLeft(), this.scrollView.getTop(), this.scrollView.getRight(), this.scrollView.getTop() + AndroidUtilities.dp(16.0f));
        this.gradientDrawableTop.draw(canvas);
        this.gradientDrawableBottom.setBounds(this.scrollView.getLeft(), this.scrollView.getBottom() - AndroidUtilities.dp(18.0f), this.scrollView.getRight(), this.scrollView.getBottom());
        this.gradientDrawableBottom.draw(canvas);
    }
}
