package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.HistoryFragment;
import org.webrtc.RendererCommon;

public abstract class PrivateVideoPreviewDialog extends FrameLayout implements VoIPService.StateListener {
    private boolean cameraReady;
    private int currentPage;
    private int currentTexturePage;
    private boolean isDismissed;
    public boolean micEnabled;
    private RLottieImageView micIconView;
    private boolean needScreencast;
    private float outProgress;
    private float pageOffset;
    private final TextView positiveButton;
    private final VoIPTextureView textureView;
    private final TextView[] titles;
    private final LinearLayout titlesLayout;
    private final ViewPager viewPager;
    private int visibleCameraPage;

    public final class AnonymousClass4 implements RendererCommon.RendererEvents {
        @Override
        public final void onFirstFrameRendered() {
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public final class Adapter extends PagerAdapter {
        public Adapter() {
        }

        @Override
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override
        public final int getCount() {
            return PrivateVideoPreviewDialog.this.titles.length;
        }

        @Override
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            Bitmap bitmapDecodeFile;
            View view;
            PrivateVideoPreviewDialog privateVideoPreviewDialog = PrivateVideoPreviewDialog.this;
            int i2 = 1;
            if (privateVideoPreviewDialog.needScreencast && i == 0) {
                FrameLayout frameLayout = new FrameLayout(privateVideoPreviewDialog.getContext());
                frameLayout.setBackground(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true));
                ImageView imageView = new ImageView(privateVideoPreviewDialog.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.screencast_big);
                frameLayout.addView(imageView, LayoutHelper.createFrame(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                TextView textView = new TextView(privateVideoPreviewDialog.getContext());
                textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, -1, 1, 15.0f);
                frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                view = frameLayout;
            } else {
                ImageView imageView2 = new ImageView(privateVideoPreviewDialog.getContext());
                imageView2.setTag(Integer.valueOf(i));
                try {
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    StringBuilder sb = new StringBuilder("cthumb");
                    if (i != 0 && (i != 1 || !privateVideoPreviewDialog.needScreencast)) {
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
            viewGroup.addView(view, 0);
            return view;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }

        @Override
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        @Override
        public final Parcelable saveState() {
            return null;
        }

        @Override
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (dataSetObserver != null) {
                super.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public PrivateVideoPreviewDialog(Context context, boolean z, boolean z2) {
        super(context);
        this.currentTexturePage = 1;
        this.visibleCameraPage = 1;
        this.needScreencast = z2;
        this.titles = new TextView[z2 ? 3 : 2];
        ViewPager viewPager = new ViewPager(context);
        this.viewPager = viewPager;
        AndroidUtilities.setViewPagerEdgeEffectColor(viewPager, 2130706432);
        viewPager.setAdapter(new Adapter());
        viewPager.setPageMargin(0);
        viewPager.setOffscreenPageLimit(1);
        addView(viewPager, LayoutHelper.createFrame(-1, -1.0f));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public int scrollState = 0;
            public int willSetPage;

            @Override
            public final void onPageScrollStateChanged(int i) {
                this.scrollState = i;
                if (i == 0) {
                    int i2 = this.willSetPage;
                    PrivateVideoPreviewDialog privateVideoPreviewDialog = PrivateVideoPreviewDialog.this;
                    privateVideoPreviewDialog.currentTexturePage = i2;
                    PrivateVideoPreviewDialog.access$600(privateVideoPreviewDialog);
                }
            }

            @Override
            public final void onPageScrolled(int i, float f, int i2) {
                PrivateVideoPreviewDialog privateVideoPreviewDialog = PrivateVideoPreviewDialog.this;
                privateVideoPreviewDialog.currentPage = i;
                privateVideoPreviewDialog.pageOffset = f;
                privateVideoPreviewDialog.updateTitlesLayout();
            }

            @Override
            public final void onPageSelected(int i) {
                int i2 = this.scrollState;
                PrivateVideoPreviewDialog privateVideoPreviewDialog = PrivateVideoPreviewDialog.this;
                if (i2 == 0) {
                    if (i <= privateVideoPreviewDialog.needScreencast) {
                        privateVideoPreviewDialog.currentTexturePage = 1;
                    } else {
                        privateVideoPreviewDialog.currentTexturePage = 2;
                    }
                    PrivateVideoPreviewDialog.access$600(privateVideoPreviewDialog);
                    return;
                }
                if (i <= privateVideoPreviewDialog.needScreencast) {
                    this.willSetPage = 1;
                } else {
                    this.willSetPage = 2;
                }
            }
        });
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, false, true, false);
        this.textureView = voIPTextureView;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        VoIPTextureView.AnonymousClass1 anonymousClass1 = voIPTextureView.renderer;
        anonymousClass1.setScalingType(scalingType);
        voIPTextureView.scaleType = 1;
        voIPTextureView.clipToTexture = true;
        anonymousClass1.setAlpha(0.0f);
        anonymousClass1.setRotateTextureWithScreen(true);
        anonymousClass1.setUseCameraRotation(true);
        addView(voIPTextureView, LayoutHelper.createFrame(-1, -1.0f));
        ActionBar actionBar = new ActionBar(context, null);
        actionBar.setBackButtonDrawable(new BackDrawable(false));
        actionBar.setBackgroundColor(0);
        actionBar.setItemsColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false), false);
        actionBar.setOccupyStatusBar(true);
        actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 11));
        addView(actionBar);
        RichTextCell.AnonymousClass1 anonymousClass2 = new RichTextCell.AnonymousClass1(this, getContext());
        this.positiveButton = anonymousClass2;
        anonymousClass2.setMinWidth(AndroidUtilities.dp(64.0f));
        anonymousClass2.setTag(-1);
        anonymousClass2.setTextSize(1, 14.0f);
        int i = Theme.key_voipgroup_nameText;
        anonymousClass2.setTextColor(Theme.getColor(null, i, false));
        anonymousClass2.setGravity(17);
        anonymousClass2.setTypeface(AndroidUtilities.bold());
        anonymousClass2.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(6.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 76);
            anonymousClass2.setForeground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        anonymousClass2.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        anonymousClass2.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 27));
        addView(anonymousClass2, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.titlesLayout = linearLayout;
        addView(linearLayout, LayoutHelper.createFrame(-2, 64, 80));
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.titles;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = new TextView(context);
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
            this.titles[i2].setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i2, 3));
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
        if (z) {
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.micIconView = rLottieImageView;
            rLottieImageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
            this.micIconView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(48.0f), ColorUtils.setAlphaComponent(-16777216, 76)));
            int i3 = R.raw.voice_mini;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, Fragment$$ExternalSyntheticOutline0.m(i3, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
            this.micIconView.setAnimation(rLottieDrawable);
            this.micIconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.micEnabled = true;
            rLottieDrawable.setCurrentFrame(69);
            this.micIconView.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(26, this, rLottieDrawable));
            addView(this.micIconView, LayoutHelper.createFrame(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
        }
    }

    public static void access$600(PrivateVideoPreviewDialog privateVideoPreviewDialog) {
        privateVideoPreviewDialog.getClass();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (privateVideoPreviewDialog.currentTexturePage == privateVideoPreviewDialog.visibleCameraPage || sharedInstance == null) {
            return;
        }
        boolean zIsFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i = privateVideoPreviewDialog.currentTexturePage;
        if ((i == 1 && !zIsFrontFaceCamera) || (i == 2 && zIsFrontFaceCamera)) {
            privateVideoPreviewDialog.saveLastCameraBitmap();
            privateVideoPreviewDialog.cameraReady = false;
            VoIPService.getSharedInstance().switchCamera();
            privateVideoPreviewDialog.textureView.setAlpha(0.0f);
        }
        privateVideoPreviewDialog.visibleCameraPage = privateVideoPreviewDialog.currentTexturePage;
    }

    public void dismiss(boolean z, boolean z2) {
        if (this.isDismissed) {
            return;
        }
        this.isDismissed = true;
        saveLastCameraBitmap();
        onDismiss(z, z2);
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new VoIPWindowView.AnonymousClass1(this, 3));
        invalidate();
    }

    public int getBackgroundColor() {
        return ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_actionBar, false), (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.outProgress, getAlpha(), 255.0f));
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void lambda$new$0$12(View view) {
        if (this.isDismissed) {
            return;
        }
        if (this.currentPage != 0 || !this.needScreencast) {
            dismiss(false, true);
        } else {
            ((Activity) getContext()).startActivityForResult(((MediaProjectionManager) getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
        }
    }

    public final void lambda$new$1(int i, View view) {
        this.viewPager.setCurrentItem(i, true);
    }

    public final void lambda$new$2(RLottieDrawable rLottieDrawable, View view) {
        boolean z = this.micEnabled;
        this.micEnabled = !z;
        if (z) {
            rLottieDrawable.setCurrentFrame(69);
            rLottieDrawable.setCustomEndFrame(99);
        } else {
            rLottieDrawable.setCurrentFrame(36);
            rLottieDrawable.setCustomEndFrame(69);
        }
        rLottieDrawable.start();
    }

    @Override
    public void onAttachedToWindow() {
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
    public void onCameraFirstFrameAvailable() {
        if (this.cameraReady) {
            return;
        }
        this.cameraReady = true;
        this.textureView.animate().alpha(1.0f).setDuration(250L);
    }

    @Override
    public void onCameraSwitch(boolean z) {
        update();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    public abstract void onDismiss(boolean z, boolean z2);

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTitlesLayout();
    }

    @Override
    public void onMeasure(int i, int i2) {
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void saveLastCameraBitmap() {
        if (this.cameraReady) {
            try {
                Bitmap bitmap = this.textureView.renderer.getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.textureView.renderer.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                            bitmapCreateBitmap.recycle();
                        }
                        Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.visibleCameraPage + ".jpg")));
                        View viewFindViewWithTag = this.viewPager.findViewWithTag(Integer.valueOf(this.visibleCameraPage - (1 ^ (this.needScreencast ? 1 : 0))));
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

    public void update() {
        if (VoIPService.getSharedInstance() != null) {
            this.textureView.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    public final void updateTitlesLayout() {
        TextView[] textViewArr = this.titles;
        int i = this.currentPage;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.pageOffset;
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr2 = this.titles;
            if (i2 >= textViewArr2.length) {
                break;
            }
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
            textViewArr2[i2].setAlpha(f2);
            this.titles[i2].setScaleX(f);
            this.titles[i2].setScaleY(f);
            i2++;
        }
        this.titlesLayout.setTranslationX(measuredWidth2);
        this.positiveButton.invalidate();
        if (this.needScreencast && this.currentPage == 0 && this.pageOffset <= 0.0f) {
            this.textureView.setVisibility(4);
            return;
        }
        this.textureView.setVisibility(0);
        if (this.currentPage + (!this.needScreencast ? 1 : 0) == this.currentTexturePage) {
            this.textureView.setTranslationX((-this.pageOffset) * getMeasuredWidth());
        } else {
            this.textureView.setTranslationX((1.0f - this.pageOffset) * getMeasuredWidth());
        }
    }
}
