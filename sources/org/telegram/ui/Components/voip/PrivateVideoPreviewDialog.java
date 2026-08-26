package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.webrtc.RendererCommon;

public abstract class PrivateVideoPreviewDialog extends FrameLayout implements VoIPService.StateListener {
    public boolean cameraReady;
    public int currentPage;
    public int currentTexturePage;
    public boolean isDismissed;
    public boolean micEnabled;
    public final RLottieImageView micIconView;
    public final boolean needScreencast;
    public float pageOffset;
    public final IntroActivity.AnonymousClass4 positiveButton;
    public final VoIPTextureView textureView;
    public final TextView[] titles;
    public final LinearLayout titlesLayout;
    public final ViewPager viewPager;
    public int visibleCameraPage;

    public final class AnonymousClass4 implements RendererCommon.RendererEvents {
        @Override
        public final void onFirstFrameRendered() {
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public final class Adapter extends PagerAdapter {
        public final GroupCallActivity.AnonymousClass47 this$0;

        public Adapter(GroupCallActivity.AnonymousClass47 anonymousClass47) {
            this.this$0 = anonymousClass47;
        }

        @Override
        public final void destroyItem(ViewPager viewPager, Object obj) {
            viewPager.removeView((View) obj);
        }

        @Override
        public final int getCount() {
            return this.this$0.titles.length;
        }

        @Override
        public final Object instantiateItem(ViewPager viewPager, int i) {
            Bitmap bitmapDecodeFile;
            View view;
            GroupCallActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            boolean z = anonymousClass47.needScreencast;
            int i2 = 1;
            if (z && i == 0) {
                FrameLayout frameLayout = new FrameLayout(anonymousClass47.getContext());
                frameLayout.setBackground(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true, 0, false));
                ImageView imageView = new ImageView(anonymousClass47.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.screencast_big);
                frameLayout.addView(imageView, LayoutHelper.createFrame(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                TextView textView = new TextView(anonymousClass47.getContext());
                textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(15.0f, -1, 1, textView);
                frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                view = frameLayout;
            } else {
                ImageView imageView2 = new ImageView(anonymousClass47.getContext());
                imageView2.setTag(Integer.valueOf(i));
                try {
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    StringBuilder sb = new StringBuilder("cthumb");
                    if (i != 0 && (i != 1 || !z)) {
                        i2 = 2;
                    }
                    sb.append(i2);
                    sb.append(".jpg");
                    bitmapDecodeFile = BitmapFactory.decodeFile(new File(filesDirFixed, sb.toString()).getAbsolutePath());
                } catch (Throwable unused) {
                    bitmapDecodeFile = null;
                }
                if (bitmapDecodeFile != null) {
                    imageView2.setImageBitmap(bitmapDecodeFile);
                } else {
                    imageView2.setImageResource(R.drawable.icplaceholder);
                }
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                view = imageView2;
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            viewPager.addView(view, 0);
            return view;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }
    }

    public PrivateVideoPreviewDialog(LaunchActivity launchActivity, boolean z) {
        super(launchActivity);
        this.currentTexturePage = 1;
        this.visibleCameraPage = 1;
        this.needScreencast = z;
        this.titles = new TextView[z ? 3 : 2];
        ViewPager viewPager = new ViewPager(launchActivity);
        this.viewPager = viewPager;
        AndroidUtilities.setViewPagerEdgeEffectColor(viewPager, 2130706432);
        final GroupCallActivity.AnonymousClass47 anonymousClass47 = (GroupCallActivity.AnonymousClass47) this;
        viewPager.setAdapter(new Adapter(anonymousClass47));
        viewPager.setPageMargin(0);
        viewPager.setOffscreenPageLimit(1);
        addView(viewPager, LayoutHelper.createFrame(-1.0f, -1));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public int scrollState = 0;
            public int willSetPage;

            @Override
            public final void onPageScrollStateChanged(int i) {
                this.scrollState = i;
                if (i == 0) {
                    int i2 = this.willSetPage;
                    GroupCallActivity.AnonymousClass47 anonymousClass48 = anonymousClass47;
                    anonymousClass48.currentTexturePage = i2;
                    PrivateVideoPreviewDialog.access$600(anonymousClass48);
                }
            }

            @Override
            public final void onPageScrolled(float f, int i, int i2) {
                GroupCallActivity.AnonymousClass47 anonymousClass48 = anonymousClass47;
                anonymousClass48.currentPage = i;
                anonymousClass48.pageOffset = f;
                anonymousClass48.updateTitlesLayout();
            }

            @Override
            public final void onPageSelected(int i) {
                int i2 = this.scrollState;
                GroupCallActivity.AnonymousClass47 anonymousClass48 = anonymousClass47;
                if (i2 == 0) {
                    if (i <= anonymousClass48.needScreencast) {
                        anonymousClass48.currentTexturePage = 1;
                    } else {
                        anonymousClass48.currentTexturePage = 2;
                    }
                    PrivateVideoPreviewDialog.access$600(anonymousClass48);
                    return;
                }
                if (i <= anonymousClass48.needScreencast) {
                    this.willSetPage = 1;
                } else {
                    this.willSetPage = 2;
                }
            }
        });
        VoIPTextureView voIPTextureView = new VoIPTextureView(launchActivity, false, false, true, false);
        this.textureView = voIPTextureView;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        VoIPTextureView.AnonymousClass1 anonymousClass1 = voIPTextureView.renderer;
        anonymousClass1.setScalingType(scalingType);
        voIPTextureView.scaleType = 1;
        voIPTextureView.clipToTexture = true;
        anonymousClass1.setAlpha(0.0f);
        anonymousClass1.setRotateTextureWithScreen(true);
        anonymousClass1.setUseCameraRotation(true);
        addView(voIPTextureView, LayoutHelper.createFrame(-1.0f, -1));
        ActionBar actionBar = new ActionBar(launchActivity, null);
        actionBar.setBackButtonDrawable(new BackDrawable(false));
        actionBar.setBackgroundColor(0);
        actionBar.setItemsColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false), false);
        actionBar.setOccupyStatusBar(true);
        actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(anonymousClass47, 8));
        addView(actionBar);
        IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(anonymousClass47, getContext());
        this.positiveButton = anonymousClass4;
        anonymousClass4.setMinWidth(AndroidUtilities.dp(64.0f));
        anonymousClass4.setTag(-1);
        anonymousClass4.setTextSize(1, 14.0f);
        int i = Theme.key_voipgroup_nameText;
        anonymousClass4.setTextColor(Theme.getColor(null, i, false));
        anonymousClass4.setGravity(17);
        anonymousClass4.setTypeface(AndroidUtilities.bold());
        anonymousClass4.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(6.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 76);
            anonymousClass4.setForeground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        anonymousClass4.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        GroupCallActivity.AnonymousClass47 anonymousClass48 = (GroupCallActivity.AnonymousClass47) this;
        anonymousClass4.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(anonymousClass48, 11));
        addView(anonymousClass4, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.titlesLayout = linearLayout;
        addView(linearLayout, LayoutHelper.createFrame(-2, 64, 80));
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.titles;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = new TextView(launchActivity);
            this.titles[i2].setTextSize(1, 12.0f);
            this.titles[i2].setTextColor(-1);
            this.titles[i2].setTypeface(AndroidUtilities.bold());
            this.titles[i2].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.titles[i2].setGravity(16);
            this.titles[i2].setSingleLine(true);
            this.titlesLayout.addView(this.titles[i2], LayoutHelper.createLinear(-2, -1));
            if (i2 == 0 && this.needScreencast) {
                this.titles[i2].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i2 == 0 || (i2 == 1 && this.needScreencast)) {
                this.titles[i2].setText(LocaleController.getString(R.string.VoipFrontCamera));
            } else {
                this.titles[i2].setText(LocaleController.getString(R.string.VoipBackCamera));
            }
            this.titles[i2].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(anonymousClass48, i2, 12));
            i2++;
        }
        setAlpha(0.0f);
        setTranslationX(AndroidUtilities.dp(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.textureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
            this.textureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass4());
            sharedInstance.setLocalSink(this.textureView.renderer, false);
        }
        this.viewPager.setCurrentItem(this.needScreencast ? 1 : 0);
        RLottieImageView rLottieImageView = new RLottieImageView(launchActivity);
        this.micIconView = rLottieImageView;
        rLottieImageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(48.0f), ColorUtils.setAlphaComponent(-16777216, 76)));
        int i3 = R.raw.voice_mini;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, SurfaceContainer$$ExternalSyntheticOutline0.m(i3, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.micEnabled = true;
        rLottieDrawable.setCurrentFrame(69, true, false);
        rLottieImageView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(27, anonymousClass48, rLottieDrawable));
        addView(rLottieImageView, LayoutHelper.createFrame(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void access$600(GroupCallActivity.AnonymousClass47 anonymousClass47) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (anonymousClass47.currentTexturePage == anonymousClass47.visibleCameraPage || sharedInstance == null) {
            return;
        }
        boolean zIsFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i = anonymousClass47.currentTexturePage;
        if ((i == 1 && !zIsFrontFaceCamera) || (i == 2 && zIsFrontFaceCamera)) {
            anonymousClass47.saveLastCameraBitmap$2();
            anonymousClass47.cameraReady = false;
            VoIPService.getSharedInstance().switchCamera();
            anonymousClass47.textureView.setAlpha(0.0f);
        }
        anonymousClass47.visibleCameraPage = anonymousClass47.currentTexturePage;
    }

    public final void dismiss(boolean z, boolean z2) {
        if (this.isDismissed) {
            return;
        }
        this.isDismissed = true;
        saveLastCameraBitmap$2();
        GroupCallActivity groupCallActivity = GroupCallActivity.this;
        boolean z3 = groupCallActivity.previewDialog.micEnabled;
        groupCallActivity.previewDialog = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z2) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z, z3);
            }
            if (z && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            groupCallActivity.updateState(true, false);
            groupCallActivity.call.sortParticipants();
            groupCallActivity.applyCallParticipantUpdates(true);
            groupCallActivity.buttonsContainer.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new Tooltip.AnonymousClass1(this, 25));
        invalidate();
    }

    public int getBackgroundColor() {
        return ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_actionBar, false), (int) (getAlpha() * 1.0f * 255.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        VoIPService.StateListener.CC.$default$onAudioSettingsChanged(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (this.cameraReady) {
            return;
        }
        this.cameraReady = true;
        this.textureView.animate().alpha(1.0f).setDuration(250L);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        if (VoIPService.getSharedInstance() != null) {
            this.textureView.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTitlesLayout();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.positiveButton.getLayoutParams();
        if (z) {
            int iDp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = iDp;
            marginLayoutParams.rightMargin = iDp;
        } else {
            int iDp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = iDp2;
            marginLayoutParams.rightMargin = iDp2;
        }
        RLottieImageView rLottieImageView = this.micIconView;
        if (rLottieImageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) rLottieImageView.getLayoutParams();
            if (z) {
                int iDp3 = AndroidUtilities.dp(88.0f);
                marginLayoutParams2.leftMargin = iDp3;
                marginLayoutParams2.rightMargin = iDp3;
            } else {
                int iDp4 = AndroidUtilities.dp(24.0f);
                marginLayoutParams2.leftMargin = iDp4;
                marginLayoutParams2.rightMargin = iDp4;
            }
        }
        super.onMeasure(i, i2);
        measureChildWithMargins(this.titlesLayout, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public final void onStateChanged(int i) {
        VoIPService.StateListener.CC.$default$onStateChanged(this, i);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void saveLastCameraBitmap$2() {
        VoIPTextureView voIPTextureView = this.textureView;
        if (this.cameraReady) {
            try {
                Bitmap bitmap = voIPTextureView.renderer.getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), voIPTextureView.renderer.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                            bitmapCreateBitmap.recycle();
                        }
                        Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.visibleCameraPage + ".jpg")));
                        View viewFindViewWithTag = this.viewPager.findViewWithTag(Integer.valueOf(this.visibleCameraPage - (!this.needScreencast ? 1 : 0)));
                        if (viewFindViewWithTag instanceof ImageView) {
                            ((ImageView) viewFindViewWithTag).setImageBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setBottomPadding(int i) {
        ((FrameLayout.LayoutParams) this.positiveButton.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i;
        ((FrameLayout.LayoutParams) this.titlesLayout.getLayoutParams()).bottomMargin = i;
        ((FrameLayout.LayoutParams) this.micIconView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i;
    }

    public final void updateTitlesLayout() {
        int i = this.currentPage;
        TextView[] textViewArr = this.titles;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.pageOffset;
        }
        for (int i2 = 0; i2 < textViewArr.length; i2++) {
            int i3 = this.currentPage;
            float f = 0.9f;
            float f2 = 0.7f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                if (i2 == i3) {
                    float f3 = this.pageOffset;
                    f2 = 1.0f - (0.3f * f3);
                    f = 1.0f - (f3 * 0.1f);
                } else {
                    float f4 = this.pageOffset;
                    f2 = 0.7f + (0.3f * f4);
                    f = 0.9f + (f4 * 0.1f);
                }
            }
            textViewArr[i2].setAlpha(f2);
            textViewArr[i2].setScaleX(f);
            textViewArr[i2].setScaleY(f);
        }
        this.titlesLayout.setTranslationX(measuredWidth2);
        this.positiveButton.invalidate();
        VoIPTextureView voIPTextureView = this.textureView;
        boolean z = this.needScreencast;
        if (z && this.currentPage == 0 && this.pageOffset <= 0.0f) {
            voIPTextureView.setVisibility(4);
            return;
        }
        voIPTextureView.setVisibility(0);
        if (this.currentPage + (!z ? 1 : 0) == this.currentTexturePage) {
            voIPTextureView.setTranslationX((-this.pageOffset) * getMeasuredWidth());
        } else {
            voIPTextureView.setTranslationX((1.0f - this.pageOffset) * getMeasuredWidth());
        }
    }
}
