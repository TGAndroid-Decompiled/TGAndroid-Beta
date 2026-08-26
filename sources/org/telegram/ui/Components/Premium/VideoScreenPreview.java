package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.RoundedBitmapDrawable21;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.play_billing.zzdw;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.aspectj.runtime.reflect.MethodSignatureImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlickerLoadingView$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.Premium.HelloParticles.Drawable.Particle;
import org.telegram.ui.Components.Premium.SpeedLineParticles$Drawable.Particle;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.CellFlickerDrawable.DrawableInterface;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda53;

public final class VideoScreenPreview extends FrameLayout implements PagerHeaderView, NotificationCenter.NotificationCenterDelegate {
    public static final float[] speedScaleVideoTimestamps = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean allowPlay;
    public float aspectRatio;
    public final AnonymousClass1 aspectRatioFrameLayout;
    public final String attachFileName;
    public boolean attached;
    public final CellFlickerDrawable.DrawableInterface cellFlickerDrawable;
    public final int currentAccount;
    public final TLRPC.Document document;
    public File file;
    public boolean firstFrameRendered;
    public final boolean fromTop;
    public HelloParticles.Drawable helloParticlesDrawable;
    public final ImageReceiver imageReceiver;
    public long lastFrameTime;
    public final MethodSignatureImpl matrixParticlesDrawable;
    public PremiumButtonView$$ExternalSyntheticLambda1 nextCheck;
    public final Paint phoneFrame1;
    public final Paint phoneFrame2;
    public boolean play;
    public float progress;
    public float roundRadius;
    public final RoundedBitmapDrawable21 roundedBitmapDrawable;
    public int size;
    public final SpeedLineParticles$Drawable speedLinesDrawable;
    public final StarParticlesView.Drawable starDrawable;
    public final SvgHelper.SvgDrawable svgIcon;
    public final TextureView textureView;
    public final int type;
    public AnonymousClass3 videoPlayerBase;
    public boolean visible;

    public final class AnonymousClass3 extends VideoPlayerHolderBase {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public boolean needRepeat() {
            switch (this.$r8$classId) {
                case 1:
                    return !CollageLayoutView2.this.preview;
                default:
                    return super.needRepeat();
            }
        }

        @Override
        public final void onRenderedFirstFrame() {
            switch (this.$r8$classId) {
                case 0:
                    VideoScreenPreview videoScreenPreview = (VideoScreenPreview) this.this$0;
                    TextureView textureView = videoScreenPreview.textureView;
                    if (textureView != null && !videoScreenPreview.firstFrameRendered) {
                        textureView.setAlpha(0.0f);
                        videoScreenPreview.textureView.animate().alpha(1.0f).setListener(new BaseChartView.AnonymousClass4(this, 9)).setDuration(200L);
                    }
                    break;
                default:
                    CollageLayoutView2.Part part = (CollageLayoutView2.Part) this.this$0;
                    part.textureViewReady = true;
                    CollageLayoutView2.this.invalidate();
                    break;
            }
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            switch (this.$r8$classId) {
                case 0:
                    VideoScreenPreview videoScreenPreview = (VideoScreenPreview) this.this$0;
                    AnonymousClass3 anonymousClass3 = videoScreenPreview.videoPlayerBase;
                    if (anonymousClass3 != null) {
                        if (i == 4) {
                            anonymousClass3.seekTo(0L);
                            videoScreenPreview.videoPlayerBase.play();
                        } else if (i == 1) {
                            anonymousClass3.play();
                        }
                        break;
                    }
                    break;
                default:
                    super.onStateChanged(z, i);
                    break;
            }
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            switch (this.$r8$classId) {
                case 1:
                    AndroidUtilities.runOnUIThread(new RichEditorListView$$ExternalSyntheticLambda53(this, i, i2, i3, 2));
                    break;
                default:
                    super.onVideoSizeChanged(i, i2, i3, f);
                    break;
            }
        }
    }

    public VideoScreenPreview(Context context, SvgHelper.SvgDrawable svgDrawable, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        int i3;
        super(context);
        Paint paint = new Paint(1);
        this.phoneFrame1 = paint;
        Paint paint2 = new Paint(1);
        this.phoneFrame2 = paint2;
        this.fromTop = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        this.currentAccount = i;
        this.type = i2;
        this.svgIcon = svgDrawable;
        paint.setColor(-16777216);
        paint2.setColor(ColorUtils.blendARGB(0.5f, Theme.getColor(Theme.key_premiumGradient2, resourcesProvider), -16777216));
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i).getPremiumPromo();
        String strFeatureTypeToServerString = PremiumPreviewFragment.featureTypeToServerString(i2);
        if (premiumPromo != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= premiumPromo.video_sections.size()) {
                    i4 = -1;
                    break;
                } else if (premiumPromo.video_sections.get(i4).equals(strFeatureTypeToServerString)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 >= 0) {
                TLRPC.Document document = premiumPromo.videos.get(i4);
                CombinedDrawable combinedDrawable = null;
                for (int i5 = 0; i5 < document.thumbs.size(); i5++) {
                    if (document.thumbs.get(i5) instanceof TLRPC.TL_photoStrippedSize) {
                        this.roundedBitmapDrawable = new RoundedBitmapDrawable21(getResources(), ImageLoader.getStrippedPhotoBitmap(document.thumbs.get(i5).bytes, "b"));
                        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
                        cellFlickerDrawable.repeatProgress = 4.0f;
                        cellFlickerDrawable.progress = 3.5f;
                        cellFlickerDrawable.frameInside = true;
                        SvgHelper.SvgDrawable svgDrawable2 = this.svgIcon;
                        cellFlickerDrawable.parentView = this;
                        this.cellFlickerDrawable = cellFlickerDrawable.new DrawableInterface(svgDrawable2);
                        combinedDrawable = new CombinedDrawable(this.roundedBitmapDrawable, this.cellFlickerDrawable) {
                            @Override
                            public final void setBounds(int i6, int i7, int i8, int i9) {
                                VideoScreenPreview videoScreenPreview = VideoScreenPreview.this;
                                if (videoScreenPreview.fromTop) {
                                    super.setBounds(i6, (int) (i7 - videoScreenPreview.roundRadius), i8, i9);
                                } else {
                                    super.setBounds(i6, i7, i8, (int) (i9 + videoScreenPreview.roundRadius));
                                }
                            }
                        };
                        combinedDrawable.setFullsize(true);
                    }
                }
                this.attachFileName = FileLoader.getAttachFileName(document);
                i3 = 3;
                this.imageReceiver.setImage(null, null, combinedDrawable, null, premiumPromo, 1);
                FileLoader.getInstance(this.currentAccount).loadFile(document, premiumPromo, 3, 0);
                this.document = document;
                Utilities.globalQueue.postRunnable(new ChatActionCell$$ExternalSyntheticLambda8(28, this, document));
            } else {
                i3 = 3;
            }
        } else {
            i3 = 3;
        }
        if (i2 == 1) {
            MethodSignatureImpl methodSignatureImpl = new MethodSignatureImpl();
            this.matrixParticlesDrawable = methodSignatureImpl;
            methodSignatureImpl.modifiers = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = new TextPaint(65);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            textPaint.setTextSize(methodSignatureImpl.modifiers);
            textPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_premiumStartSmallStarsColor2, false), 30));
            textPaint.setTextAlign(Paint.Align.CENTER);
            int i6 = 0;
            while (i6 < 16) {
                int i7 = i6 < 10 ? i6 + 48 : i6 + 55;
                Bitmap[] bitmapArr = (Bitmap[]) methodSignatureImpl.declaringTypeName;
                int i8 = methodSignatureImpl.modifiers;
                bitmapArr[i6] = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(((Bitmap[]) methodSignatureImpl.declaringTypeName)[i6]);
                String string = Character.toString((char) i7);
                int i9 = methodSignatureImpl.modifiers;
                canvas.drawText(string, i9 >> 1, i9, textPaint);
                i6++;
            }
        } else if (i2 == 6 || i2 == 9 || i2 == i3 || i2 == 7 || i2 == 11 || i2 == 4 || i2 == 24 || i2 == 43) {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(40);
            this.starDrawable = drawable;
            drawable.speedScale = 3.0f;
            drawable.type = i2;
            if (i2 == i3 || i2 == 24 || i2 == 43) {
                drawable.size1 = 14;
                drawable.size2 = 18;
                drawable.size3 = 18;
            } else {
                drawable.size1 = 14;
                drawable.size2 = 16;
                drawable.size3 = 15;
            }
            if (i2 == 43) {
                drawable.useRotate = true;
            }
            drawable.k3 = 0.98f;
            drawable.k2 = 0.98f;
            drawable.k1 = 0.98f;
            drawable.speedScale = 4.0f;
            drawable.resourcesProvider = resourcesProvider;
            drawable.colorKey = Theme.key_premiumStartSmallStarsColor2;
            drawable.init();
        } else if (i2 == 2) {
            SpeedLineParticles$Drawable speedLineParticles$Drawable = new SpeedLineParticles$Drawable();
            this.speedLinesDrawable = speedLineParticles$Drawable;
            if (speedLineParticles$Drawable.particles.isEmpty()) {
                for (int i10 = 0; i10 < speedLineParticles$Drawable.count; i10++) {
                    speedLineParticles$Drawable.particles.add(speedLineParticles$Drawable.new Particle());
                }
            }
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_premiumStartSmallStarsColor2, false), 80);
            if (speedLineParticles$Drawable.lastColor != alphaComponent) {
                speedLineParticles$Drawable.lastColor = alphaComponent;
                speedLineParticles$Drawable.paint.setColor(alphaComponent);
            }
        } else if (i2 == 13) {
            HelloParticles.Drawable drawable2 = new HelloParticles.Drawable();
            this.helloParticlesDrawable = drawable2;
            if (drawable2.particles.isEmpty()) {
                for (int i11 = 0; i11 < drawable2.count; i11++) {
                    drawable2.particles.add(drawable2.new Particle());
                }
            }
        } else {
            StarParticlesView.Drawable drawable3 = new StarParticlesView.Drawable(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
            this.starDrawable = drawable3;
            drawable3.resourcesProvider = resourcesProvider;
            drawable3.colorKey = Theme.key_premiumStartSmallStarsColor2;
            drawable3.size1 = 4;
            drawable3.k3 = 0.98f;
            drawable3.k2 = 0.98f;
            drawable3.k1 = 0.98f;
            drawable3.useRotate = true;
            drawable3.speedScale = 4.0f;
            drawable3.checkBounds = true;
            drawable3.checkTime = true;
            drawable3.useBlur = true;
            drawable3.roundEffect = false;
            drawable3.init();
        }
        if (i2 == 1 || i2 == i3 || i2 == 11) {
            this.fromTop = true;
        }
        ?? r2 = new AspectRatioFrameLayout(context) {
            public final Path clipPath = new Path();

            @Override
            public final void dispatchDraw(Canvas canvas2) {
                canvas2.save();
                canvas2.clipPath(this.clipPath);
                super.dispatchDraw(canvas2);
                canvas2.restore();
            }

            @Override
            public final void onMeasure(int i12, int i13) {
                super.onMeasure(i12, i13);
                Path path = this.clipPath;
                path.reset();
                VideoScreenPreview videoScreenPreview = VideoScreenPreview.this;
                if (videoScreenPreview.fromTop) {
                    AndroidUtilities.rectTmp.set(0.0f, -videoScreenPreview.roundRadius, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + videoScreenPreview.roundRadius));
                }
                float fDp = videoScreenPreview.roundRadius - AndroidUtilities.dp(3.0f);
                path.addRoundRect(AndroidUtilities.rectTmp, fDp, fDp, Path.Direction.CW);
            }
        };
        this.aspectRatioFrameLayout = r2;
        r2.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        r2.addView(textureView);
        setWillNotDraw(false);
        addView(r2);
    }

    public final void checkVideo() {
        File file = this.file;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.file;
            if (file2 == null || !file2.exists()) {
                this.aspectRatio = 0.671f;
            } else {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    PremiumButtonView$$ExternalSyntheticLambda1 premiumButtonView$$ExternalSyntheticLambda1 = this.nextCheck;
                    if (premiumButtonView$$ExternalSyntheticLambda1 != null) {
                        AndroidUtilities.cancelRunOnUIThread(premiumButtonView$$ExternalSyntheticLambda1);
                    }
                    PremiumButtonView$$ExternalSyntheticLambda1 premiumButtonView$$ExternalSyntheticLambda2 = new PremiumButtonView$$ExternalSyntheticLambda1(this, 5);
                    this.nextCheck = premiumButtonView$$ExternalSyntheticLambda2;
                    AndroidUtilities.runOnUIThread(premiumButtonView$$ExternalSyntheticLambda2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.file));
                    int i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int i2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.aspectRatio = i / i2;
                } catch (Exception unused) {
                    this.aspectRatio = 0.671f;
                }
            }
            if (this.allowPlay) {
                runVideoPlayer();
            }
        }
        this.nextCheck = null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.attachFileName;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.file = (File) objArr[1];
            checkVideo();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        zzdw[][] zzdwVarArr;
        int i;
        int i2;
        int i3;
        int i4;
        float f5;
        int i5;
        ArrayList arrayList;
        int i6;
        MatrixParticlesDrawable$Particle matrixParticlesDrawable$Particle;
        int iMin;
        int iMax;
        float f6;
        float f7;
        int i7;
        int i8;
        int i9;
        MethodSignatureImpl methodSignatureImpl;
        int i10;
        long j;
        float fClamp;
        zzdw zzdwVar;
        long j2;
        MethodSignatureImpl methodSignatureImpl2;
        float fClamp2;
        int i11;
        StarParticlesView.Drawable drawable = this.starDrawable;
        int i12 = 1;
        MethodSignatureImpl methodSignatureImpl3 = this.matrixParticlesDrawable;
        SpeedLineParticles$Drawable speedLineParticles$Drawable = this.speedLinesDrawable;
        int i13 = 0;
        if (drawable == null && speedLineParticles$Drawable == null && this.helloParticlesDrawable == null && methodSignatureImpl3 == null) {
            f = 0.9f;
            f2 = 2.0f;
            z = true;
        } else {
            float f8 = this.progress;
            if (f8 < 0.5f) {
                float fPow = (float) Math.pow(1.0f - f8, 2.0d);
                canvas.save();
                f = 0.9f;
                canvas.scale(fPow, fPow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (methodSignatureImpl3 == null) {
                    f2 = 2.0f;
                    z = true;
                    if (drawable != null) {
                        drawable.onDraw(canvas);
                    } else if (speedLineParticles$Drawable == null) {
                        HelloParticles.Drawable drawable2 = this.helloParticlesDrawable;
                        if (drawable2 != null) {
                            System.currentTimeMillis();
                            int i14 = 0;
                            while (true) {
                                ArrayList arrayList2 = drawable2.particles;
                                if (i14 >= arrayList2.size()) {
                                    break;
                                }
                                HelloParticles.Drawable.Particle particle = (HelloParticles.Drawable.Particle) arrayList2.get(i14);
                                HelloParticles.Drawable drawable3 = HelloParticles.Drawable.this;
                                float f9 = particle.inProgress;
                                if (f9 != 1.0f) {
                                    float f10 = (drawable3.dt / particle.duration) + f9;
                                    particle.inProgress = f10;
                                    if (f10 > 1.0f) {
                                        particle.inProgress = 1.0f;
                                    }
                                }
                                if (particle.bitmap != null) {
                                    canvas.save();
                                    float fPow2 = 1.0f - (((float) Math.pow(particle.inProgress - 0.5f, 2.0d)) * 4.0f);
                                    float f11 = particle.scale;
                                    HelloParticles.Drawable drawable4 = HelloParticles.Drawable.this;
                                    float fM = AndroidUtilities$$ExternalSyntheticOutline0.m(fPow2, 0.4f, 0.7f, f11 / drawable4.bitmapScale);
                                    canvas.translate(particle.x - (particle.w / 2.0f), particle.y - (particle.h / 2.0f));
                                    canvas.scale(fM, fM, particle.w / 2.0f, particle.h / 2.0f);
                                    Paint paint = drawable4.paint;
                                    paint.setAlpha((int) (particle.alpha * fPow2));
                                    canvas.drawBitmap(particle.bitmap, 0.0f, 0.0f, paint);
                                    canvas.restore();
                                }
                                if (particle.inProgress >= 1.0f) {
                                    particle.genPosition(i14, false);
                                }
                                i14++;
                            }
                        }
                    } else {
                        AnonymousClass3 anonymousClass3 = this.videoPlayerBase;
                        if (anonymousClass3 != null) {
                            float fClamp3 = Utilities.clamp(anonymousClass3.getCurrentPosition() / this.videoPlayerBase.getDuration(), 1.0f, 0.0f);
                            float[] fArr = speedScaleVideoTimestamps;
                            float f12 = 1.0f / 9;
                            int i15 = (int) (fClamp3 / f12);
                            int i16 = i15 + 1;
                            float fM2 = SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(i15, f12, fClamp3, f12);
                            f3 = i16 < 10 ? (fArr[i16] * fM2) + ((1.0f - fM2) * fArr[i15]) : fArr[i15];
                        } else {
                            f3 = 0.2f;
                        }
                        speedLineParticles$Drawable.speedScale = (((1.0f - Utilities.clamp(this.progress / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f3;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i17 = 0;
                        while (true) {
                            ArrayList arrayList3 = speedLineParticles$Drawable.particles;
                            if (i17 >= arrayList3.size()) {
                                break;
                            }
                            SpeedLineParticles$Drawable.Particle particle2 = (SpeedLineParticles$Drawable.Particle) arrayList3.get(i17);
                            SpeedLineParticles$Drawable speedLineParticles$Drawable2 = SpeedLineParticles$Drawable.this;
                            int i18 = i17 * 4;
                            float f13 = particle2.x;
                            float[] fArr2 = speedLineParticles$Drawable2.lines;
                            fArr2[i18] = f13;
                            fArr2[i18 + 1] = particle2.y;
                            fArr2[i18 + 2] = (AndroidUtilities.dp(30.0f) * particle2.vecX) + f13;
                            SpeedLineParticles$Drawable speedLineParticles$Drawable3 = SpeedLineParticles$Drawable.this;
                            speedLineParticles$Drawable3.lines[i18 + 3] = (AndroidUtilities.dp(30.0f) * particle2.vecY) + particle2.y;
                            float fDp = AndroidUtilities.dp(4.0f);
                            float f14 = speedLineParticles$Drawable3.dt;
                            float f15 = (f14 / 660.0f) * fDp * speedLineParticles$Drawable3.speedScale;
                            float f16 = (particle2.vecX * f15) + particle2.x;
                            particle2.x = f16;
                            float f17 = (particle2.vecY * f15) + particle2.y;
                            particle2.y = f17;
                            float f18 = particle2.inProgress;
                            if (f18 != 1.0f) {
                                float f19 = (f14 / 200.0f) + f18;
                                particle2.inProgress = f19;
                                if (f19 > 1.0f) {
                                    particle2.inProgress = 1.0f;
                                }
                            }
                            if (jCurrentTimeMillis > particle2.lifeTime || !speedLineParticles$Drawable.screenRect.contains(f16, f17)) {
                                particle2.genPosition(jCurrentTimeMillis, false);
                            }
                            i17++;
                        }
                        canvas.drawLines(speedLineParticles$Drawable.lines, speedLineParticles$Drawable.paint);
                    }
                } else {
                    Rect rect = (Rect) methodSignatureImpl3.declaringType;
                    int iWidth = rect.width() / methodSignatureImpl3.modifiers;
                    int iHeight = rect.height() / methodSignatureImpl3.modifiers;
                    if (iWidth == 0 || iHeight == 0) {
                        f2 = 2.0f;
                    } else {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) methodSignatureImpl3.returnType;
                        if (arrayListArr != null) {
                            f4 = 150.0f;
                            if (arrayListArr.length != iWidth + 1) {
                            }
                            zzdwVarArr = (zzdw[][]) methodSignatureImpl3.stringCache;
                            i = 300;
                            i2 = 16;
                            if (zzdwVarArr != null) {
                                f2 = 2.0f;
                                if (zzdwVarArr.length == iWidth + 1 || zzdwVarArr[0].length != iHeight + 1) {
                                }
                                f5 = 1.0f;
                                i5 = 0;
                                while (i5 <= iWidth) {
                                    arrayList = ((ArrayList[]) methodSignatureImpl3.returnType)[i5];
                                    i6 = 0;
                                    while (i6 < arrayList.size()) {
                                        matrixParticlesDrawable$Particle = (MatrixParticlesDrawable$Particle) arrayList.get(i6);
                                        if (jCurrentTimeMillis2 - matrixParticlesDrawable$Particle.time > 50) {
                                            i11 = matrixParticlesDrawable$Particle.y + i12;
                                            matrixParticlesDrawable$Particle.y = i11;
                                            matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                            if (i11 - matrixParticlesDrawable$Particle.len >= iHeight) {
                                                if (arrayList.size() == i12) {
                                                    matrixParticlesDrawable$Particle.y = i13;
                                                    matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                                    matrixParticlesDrawable$Particle.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                                } else {
                                                    arrayList.remove(matrixParticlesDrawable$Particle);
                                                    i6--;
                                                }
                                            }
                                            if (matrixParticlesDrawable$Particle.y > matrixParticlesDrawable$Particle.len && i6 == arrayList.size() - i12 && Math.abs(Utilities.fastRandom.nextInt(4)) == 0) {
                                                MatrixParticlesDrawable$Particle matrixParticlesDrawable$Particle2 = new MatrixParticlesDrawable$Particle();
                                                matrixParticlesDrawable$Particle2.y = i13;
                                                matrixParticlesDrawable$Particle2.time = jCurrentTimeMillis2;
                                                matrixParticlesDrawable$Particle2.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                                arrayList.add(matrixParticlesDrawable$Particle2);
                                            }
                                        }
                                        int i19 = i6;
                                        iMin = Math.min(matrixParticlesDrawable$Particle.y, iHeight + 1);
                                        iMax = Math.max(i13, matrixParticlesDrawable$Particle.y - matrixParticlesDrawable$Particle.len);
                                        while (iMax < iMin) {
                                            int i20 = methodSignatureImpl3.modifiers;
                                            f6 = i20 * i5;
                                            f7 = i20 * iMax;
                                            if (((RectF) methodSignatureImpl3.name).contains(f6, f7)) {
                                                i7 = iHeight;
                                                i8 = i5;
                                                i9 = iMax;
                                                methodSignatureImpl = methodSignatureImpl3;
                                                i10 = iWidth;
                                                j = jCurrentTimeMillis2;
                                            } else {
                                                i7 = iHeight;
                                                i8 = i5;
                                                fClamp = Utilities.clamp(((f5 - ((matrixParticlesDrawable$Particle.y - iMax) / (matrixParticlesDrawable$Particle.len - 1))) * 0.8f) + 0.2f, 1.0f, 0.0f);
                                                zzdwVar = ((zzdw[][]) methodSignatureImpl3.stringCache)[i8][iMax];
                                                i9 = iMax;
                                                j2 = zzdwVar.zzb - jCurrentTimeMillis2;
                                                methodSignatureImpl = methodSignatureImpl3;
                                                methodSignatureImpl2 = (MethodSignatureImpl) zzdwVar.zzc;
                                                if (j2 < 150) {
                                                    i10 = iWidth;
                                                    fClamp2 = Utilities.clamp(1.0f - (j2 / f4), 1.0f, 0.0f);
                                                    j = jCurrentTimeMillis2;
                                                    ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fClamp2, fClamp, 255.0f));
                                                    int i21 = zzdwVar.zza;
                                                    Bitmap[] bitmapArr = (Bitmap[]) methodSignatureImpl2.declaringTypeName;
                                                    Bitmap bitmap = bitmapArr[i21];
                                                    Paint paint2 = (Paint) methodSignatureImpl2.parameterTypes;
                                                    canvas.drawBitmap(bitmap, f6, f7, paint2);
                                                    paint2.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                                    canvas.drawBitmap(bitmapArr[zzdwVar.zze], f6, f7, paint2);
                                                    paint2.setAlpha(255);
                                                    if (fClamp2 >= 1.0f) {
                                                        zzdwVar.zza = zzdwVar.zze;
                                                        zzdwVar.zze = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 16);
                                                        zzdwVar.zzb = j + ((long) FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 300)) + 150;
                                                    }
                                                } else {
                                                    i10 = iWidth;
                                                    j = jCurrentTimeMillis2;
                                                    ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) (fClamp * 255.0f));
                                                    canvas.drawBitmap(((Bitmap[]) methodSignatureImpl2.declaringTypeName)[zzdwVar.zza], f6, f7, (Paint) methodSignatureImpl2.parameterTypes);
                                                }
                                                iMax = i9 + 1;
                                                i5 = i8;
                                                iHeight = i7;
                                                methodSignatureImpl3 = methodSignatureImpl;
                                                iWidth = i10;
                                                jCurrentTimeMillis2 = j;
                                                f5 = 1.0f;
                                            }
                                            iMax = i9 + 1;
                                            i5 = i8;
                                            iHeight = i7;
                                            methodSignatureImpl3 = methodSignatureImpl;
                                            iWidth = i10;
                                            jCurrentTimeMillis2 = j;
                                            f5 = 1.0f;
                                        }
                                        i6 = i19 + 1;
                                        i5 = i5;
                                        i12 = 1;
                                        i13 = 0;
                                        f5 = 1.0f;
                                    }
                                    i5++;
                                    iHeight = iHeight;
                                    i12 = 1;
                                    i13 = 0;
                                    f5 = 1.0f;
                                }
                            } else {
                                f2 = 2.0f;
                            }
                            methodSignatureImpl3.stringCache = new zzdw[iWidth + 1][];
                            i3 = 0;
                            while (i3 <= iWidth) {
                                ((zzdw[][]) methodSignatureImpl3.stringCache)[i3] = new zzdw[iHeight + 1];
                                i4 = 0;
                                while (i4 <= iHeight) {
                                    zzdw[][] zzdwVarArr2 = (zzdw[][]) methodSignatureImpl3.stringCache;
                                    zzdw[] zzdwVarArr3 = zzdwVarArr2[i3];
                                    zzdw zzdwVar2 = new zzdw();
                                    zzdwVar2.zzc = methodSignatureImpl3;
                                    zzdwVarArr3[i4] = zzdwVar2;
                                    zzdw zzdwVar3 = zzdwVarArr2[i3][i4];
                                    zzdwVar3.getClass();
                                    zzdwVar3.zza = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, i2);
                                    zzdwVar3.zze = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, i2);
                                    zzdwVar3.zzb = ((long) FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, i)) + jCurrentTimeMillis2 + 150;
                                    i4++;
                                    i2 = 16;
                                    i = 300;
                                }
                                i3++;
                                i2 = 16;
                                i = 300;
                            }
                            f5 = 1.0f;
                            i5 = 0;
                            while (i5 <= iWidth) {
                                arrayList = ((ArrayList[]) methodSignatureImpl3.returnType)[i5];
                                i6 = 0;
                                while (i6 < arrayList.size()) {
                                    matrixParticlesDrawable$Particle = (MatrixParticlesDrawable$Particle) arrayList.get(i6);
                                    if (jCurrentTimeMillis2 - matrixParticlesDrawable$Particle.time > 50) {
                                        i11 = matrixParticlesDrawable$Particle.y + i12;
                                        matrixParticlesDrawable$Particle.y = i11;
                                        matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                        if (i11 - matrixParticlesDrawable$Particle.len >= iHeight) {
                                            if (arrayList.size() == i12) {
                                                matrixParticlesDrawable$Particle.y = i13;
                                                matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                                matrixParticlesDrawable$Particle.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                            } else {
                                                arrayList.remove(matrixParticlesDrawable$Particle);
                                                i6--;
                                            }
                                        }
                                        if (matrixParticlesDrawable$Particle.y > matrixParticlesDrawable$Particle.len) {
                                            MatrixParticlesDrawable$Particle matrixParticlesDrawable$Particle3 = new MatrixParticlesDrawable$Particle();
                                            matrixParticlesDrawable$Particle3.y = i13;
                                            matrixParticlesDrawable$Particle3.time = jCurrentTimeMillis2;
                                            matrixParticlesDrawable$Particle3.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                            arrayList.add(matrixParticlesDrawable$Particle3);
                                        }
                                    }
                                    int i110 = i6;
                                    iMin = Math.min(matrixParticlesDrawable$Particle.y, iHeight + 1);
                                    iMax = Math.max(i13, matrixParticlesDrawable$Particle.y - matrixParticlesDrawable$Particle.len);
                                    while (iMax < iMin) {
                                        int i22 = methodSignatureImpl3.modifiers;
                                        f6 = i22 * i5;
                                        f7 = i22 * iMax;
                                        if (((RectF) methodSignatureImpl3.name).contains(f6, f7)) {
                                            i7 = iHeight;
                                            i8 = i5;
                                            fClamp = Utilities.clamp(((f5 - ((matrixParticlesDrawable$Particle.y - iMax) / (matrixParticlesDrawable$Particle.len - 1))) * 0.8f) + 0.2f, 1.0f, 0.0f);
                                            zzdwVar = ((zzdw[][]) methodSignatureImpl3.stringCache)[i8][iMax];
                                            i9 = iMax;
                                            j2 = zzdwVar.zzb - jCurrentTimeMillis2;
                                            methodSignatureImpl = methodSignatureImpl3;
                                            methodSignatureImpl2 = (MethodSignatureImpl) zzdwVar.zzc;
                                            if (j2 < 150) {
                                                i10 = iWidth;
                                                fClamp2 = Utilities.clamp(1.0f - (j2 / f4), 1.0f, 0.0f);
                                                j = jCurrentTimeMillis2;
                                                ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fClamp2, fClamp, 255.0f));
                                                int i23 = zzdwVar.zza;
                                                Bitmap[] bitmapArr2 = (Bitmap[]) methodSignatureImpl2.declaringTypeName;
                                                Bitmap bitmap2 = bitmapArr2[i23];
                                                Paint paint3 = (Paint) methodSignatureImpl2.parameterTypes;
                                                canvas.drawBitmap(bitmap2, f6, f7, paint3);
                                                paint3.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                                canvas.drawBitmap(bitmapArr2[zzdwVar.zze], f6, f7, paint3);
                                                paint3.setAlpha(255);
                                                if (fClamp2 >= 1.0f) {
                                                    zzdwVar.zza = zzdwVar.zze;
                                                    zzdwVar.zze = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 16);
                                                    zzdwVar.zzb = j + ((long) FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 300)) + 150;
                                                }
                                            } else {
                                                i10 = iWidth;
                                                j = jCurrentTimeMillis2;
                                                ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) (fClamp * 255.0f));
                                                canvas.drawBitmap(((Bitmap[]) methodSignatureImpl2.declaringTypeName)[zzdwVar.zza], f6, f7, (Paint) methodSignatureImpl2.parameterTypes);
                                            }
                                            iMax = i9 + 1;
                                            i5 = i8;
                                            iHeight = i7;
                                            methodSignatureImpl3 = methodSignatureImpl;
                                            iWidth = i10;
                                            jCurrentTimeMillis2 = j;
                                            f5 = 1.0f;
                                        } else {
                                            i7 = iHeight;
                                            i8 = i5;
                                            i9 = iMax;
                                            methodSignatureImpl = methodSignatureImpl3;
                                            i10 = iWidth;
                                            j = jCurrentTimeMillis2;
                                        }
                                        iMax = i9 + 1;
                                        i5 = i8;
                                        iHeight = i7;
                                        methodSignatureImpl3 = methodSignatureImpl;
                                        iWidth = i10;
                                        jCurrentTimeMillis2 = j;
                                        f5 = 1.0f;
                                    }
                                    i6 = i110 + 1;
                                    i5 = i5;
                                    i12 = 1;
                                    i13 = 0;
                                    f5 = 1.0f;
                                }
                                i5++;
                                iHeight = iHeight;
                                i12 = 1;
                                i13 = 0;
                                f5 = 1.0f;
                            }
                        } else {
                            f4 = 150.0f;
                        }
                        methodSignatureImpl3.returnType = new ArrayList[iWidth + 1];
                        for (int i24 = 0; i24 <= iWidth; i24++) {
                            ((ArrayList[]) methodSignatureImpl3.returnType)[i24] = new ArrayList();
                            MatrixParticlesDrawable$Particle matrixParticlesDrawable$Particle4 = new MatrixParticlesDrawable$Particle();
                            matrixParticlesDrawable$Particle4.y = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, iHeight);
                            matrixParticlesDrawable$Particle4.time = jCurrentTimeMillis2;
                            matrixParticlesDrawable$Particle4.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) methodSignatureImpl3.returnType)[i24].add(matrixParticlesDrawable$Particle4);
                        }
                        zzdwVarArr = (zzdw[][]) methodSignatureImpl3.stringCache;
                        i = 300;
                        i2 = 16;
                        if (zzdwVarArr != null) {
                            f2 = 2.0f;
                            if (zzdwVarArr.length == iWidth + 1) {
                            }
                            f5 = 1.0f;
                            i5 = 0;
                            while (i5 <= iWidth) {
                                arrayList = ((ArrayList[]) methodSignatureImpl3.returnType)[i5];
                                i6 = 0;
                                while (i6 < arrayList.size()) {
                                    matrixParticlesDrawable$Particle = (MatrixParticlesDrawable$Particle) arrayList.get(i6);
                                    if (jCurrentTimeMillis2 - matrixParticlesDrawable$Particle.time > 50) {
                                        i11 = matrixParticlesDrawable$Particle.y + i12;
                                        matrixParticlesDrawable$Particle.y = i11;
                                        matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                        if (i11 - matrixParticlesDrawable$Particle.len >= iHeight) {
                                            if (arrayList.size() == i12) {
                                                matrixParticlesDrawable$Particle.y = i13;
                                                matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                                matrixParticlesDrawable$Particle.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                            } else {
                                                arrayList.remove(matrixParticlesDrawable$Particle);
                                                i6--;
                                            }
                                        }
                                        if (matrixParticlesDrawable$Particle.y > matrixParticlesDrawable$Particle.len) {
                                            MatrixParticlesDrawable$Particle matrixParticlesDrawable$Particle5 = new MatrixParticlesDrawable$Particle();
                                            matrixParticlesDrawable$Particle5.y = i13;
                                            matrixParticlesDrawable$Particle5.time = jCurrentTimeMillis2;
                                            matrixParticlesDrawable$Particle5.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                            arrayList.add(matrixParticlesDrawable$Particle5);
                                        }
                                    }
                                    int i111 = i6;
                                    iMin = Math.min(matrixParticlesDrawable$Particle.y, iHeight + 1);
                                    iMax = Math.max(i13, matrixParticlesDrawable$Particle.y - matrixParticlesDrawable$Particle.len);
                                    while (iMax < iMin) {
                                        int i25 = methodSignatureImpl3.modifiers;
                                        f6 = i25 * i5;
                                        f7 = i25 * iMax;
                                        if (((RectF) methodSignatureImpl3.name).contains(f6, f7)) {
                                            i7 = iHeight;
                                            i8 = i5;
                                            fClamp = Utilities.clamp(((f5 - ((matrixParticlesDrawable$Particle.y - iMax) / (matrixParticlesDrawable$Particle.len - 1))) * 0.8f) + 0.2f, 1.0f, 0.0f);
                                            zzdwVar = ((zzdw[][]) methodSignatureImpl3.stringCache)[i8][iMax];
                                            i9 = iMax;
                                            j2 = zzdwVar.zzb - jCurrentTimeMillis2;
                                            methodSignatureImpl = methodSignatureImpl3;
                                            methodSignatureImpl2 = (MethodSignatureImpl) zzdwVar.zzc;
                                            if (j2 < 150) {
                                                i10 = iWidth;
                                                fClamp2 = Utilities.clamp(1.0f - (j2 / f4), 1.0f, 0.0f);
                                                j = jCurrentTimeMillis2;
                                                ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fClamp2, fClamp, 255.0f));
                                                int i26 = zzdwVar.zza;
                                                Bitmap[] bitmapArr3 = (Bitmap[]) methodSignatureImpl2.declaringTypeName;
                                                Bitmap bitmap3 = bitmapArr3[i26];
                                                Paint paint4 = (Paint) methodSignatureImpl2.parameterTypes;
                                                canvas.drawBitmap(bitmap3, f6, f7, paint4);
                                                paint4.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                                canvas.drawBitmap(bitmapArr3[zzdwVar.zze], f6, f7, paint4);
                                                paint4.setAlpha(255);
                                                if (fClamp2 >= 1.0f) {
                                                    zzdwVar.zza = zzdwVar.zze;
                                                    zzdwVar.zze = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 16);
                                                    zzdwVar.zzb = j + ((long) FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 300)) + 150;
                                                }
                                            } else {
                                                i10 = iWidth;
                                                j = jCurrentTimeMillis2;
                                                ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) (fClamp * 255.0f));
                                                canvas.drawBitmap(((Bitmap[]) methodSignatureImpl2.declaringTypeName)[zzdwVar.zza], f6, f7, (Paint) methodSignatureImpl2.parameterTypes);
                                            }
                                            iMax = i9 + 1;
                                            i5 = i8;
                                            iHeight = i7;
                                            methodSignatureImpl3 = methodSignatureImpl;
                                            iWidth = i10;
                                            jCurrentTimeMillis2 = j;
                                            f5 = 1.0f;
                                        } else {
                                            i7 = iHeight;
                                            i8 = i5;
                                            i9 = iMax;
                                            methodSignatureImpl = methodSignatureImpl3;
                                            i10 = iWidth;
                                            j = jCurrentTimeMillis2;
                                        }
                                        iMax = i9 + 1;
                                        i5 = i8;
                                        iHeight = i7;
                                        methodSignatureImpl3 = methodSignatureImpl;
                                        iWidth = i10;
                                        jCurrentTimeMillis2 = j;
                                        f5 = 1.0f;
                                    }
                                    i6 = i111 + 1;
                                    i5 = i5;
                                    i12 = 1;
                                    i13 = 0;
                                    f5 = 1.0f;
                                }
                                i5++;
                                iHeight = iHeight;
                                i12 = 1;
                                i13 = 0;
                                f5 = 1.0f;
                            }
                        } else {
                            f2 = 2.0f;
                        }
                        methodSignatureImpl3.stringCache = new zzdw[iWidth + 1][];
                        i3 = 0;
                        while (i3 <= iWidth) {
                            ((zzdw[][]) methodSignatureImpl3.stringCache)[i3] = new zzdw[iHeight + 1];
                            i4 = 0;
                            while (i4 <= iHeight) {
                                zzdw[][] zzdwVarArr4 = (zzdw[][]) methodSignatureImpl3.stringCache;
                                zzdw[] zzdwVarArr5 = zzdwVarArr4[i3];
                                zzdw zzdwVar4 = new zzdw();
                                zzdwVar4.zzc = methodSignatureImpl3;
                                zzdwVarArr5[i4] = zzdwVar4;
                                zzdw zzdwVar5 = zzdwVarArr4[i3][i4];
                                zzdwVar5.getClass();
                                zzdwVar5.zza = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, i2);
                                zzdwVar5.zze = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, i2);
                                zzdwVar5.zzb = ((long) FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, i)) + jCurrentTimeMillis2 + 150;
                                i4++;
                                i2 = 16;
                                i = 300;
                            }
                            i3++;
                            i2 = 16;
                            i = 300;
                        }
                        f5 = 1.0f;
                        i5 = 0;
                        while (i5 <= iWidth) {
                            arrayList = ((ArrayList[]) methodSignatureImpl3.returnType)[i5];
                            i6 = 0;
                            while (i6 < arrayList.size()) {
                                matrixParticlesDrawable$Particle = (MatrixParticlesDrawable$Particle) arrayList.get(i6);
                                if (jCurrentTimeMillis2 - matrixParticlesDrawable$Particle.time > 50) {
                                    i11 = matrixParticlesDrawable$Particle.y + i12;
                                    matrixParticlesDrawable$Particle.y = i11;
                                    matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                    if (i11 - matrixParticlesDrawable$Particle.len >= iHeight) {
                                        if (arrayList.size() == i12) {
                                            matrixParticlesDrawable$Particle.y = i13;
                                            matrixParticlesDrawable$Particle.time = jCurrentTimeMillis2;
                                            matrixParticlesDrawable$Particle.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                        } else {
                                            arrayList.remove(matrixParticlesDrawable$Particle);
                                            i6--;
                                        }
                                    }
                                    if (matrixParticlesDrawable$Particle.y > matrixParticlesDrawable$Particle.len) {
                                        MatrixParticlesDrawable$Particle matrixParticlesDrawable$Particle6 = new MatrixParticlesDrawable$Particle();
                                        matrixParticlesDrawable$Particle6.y = i13;
                                        matrixParticlesDrawable$Particle6.time = jCurrentTimeMillis2;
                                        matrixParticlesDrawable$Particle6.len = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                                        arrayList.add(matrixParticlesDrawable$Particle6);
                                    }
                                }
                                int i112 = i6;
                                iMin = Math.min(matrixParticlesDrawable$Particle.y, iHeight + 1);
                                iMax = Math.max(i13, matrixParticlesDrawable$Particle.y - matrixParticlesDrawable$Particle.len);
                                while (iMax < iMin) {
                                    int i27 = methodSignatureImpl3.modifiers;
                                    f6 = i27 * i5;
                                    f7 = i27 * iMax;
                                    if (((RectF) methodSignatureImpl3.name).contains(f6, f7)) {
                                        i7 = iHeight;
                                        i8 = i5;
                                        fClamp = Utilities.clamp(((f5 - ((matrixParticlesDrawable$Particle.y - iMax) / (matrixParticlesDrawable$Particle.len - 1))) * 0.8f) + 0.2f, 1.0f, 0.0f);
                                        zzdwVar = ((zzdw[][]) methodSignatureImpl3.stringCache)[i8][iMax];
                                        i9 = iMax;
                                        j2 = zzdwVar.zzb - jCurrentTimeMillis2;
                                        methodSignatureImpl = methodSignatureImpl3;
                                        methodSignatureImpl2 = (MethodSignatureImpl) zzdwVar.zzc;
                                        if (j2 < 150) {
                                            i10 = iWidth;
                                            fClamp2 = Utilities.clamp(1.0f - (j2 / f4), 1.0f, 0.0f);
                                            j = jCurrentTimeMillis2;
                                            ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fClamp2, fClamp, 255.0f));
                                            int i28 = zzdwVar.zza;
                                            Bitmap[] bitmapArr4 = (Bitmap[]) methodSignatureImpl2.declaringTypeName;
                                            Bitmap bitmap4 = bitmapArr4[i28];
                                            Paint paint5 = (Paint) methodSignatureImpl2.parameterTypes;
                                            canvas.drawBitmap(bitmap4, f6, f7, paint5);
                                            paint5.setAlpha((int) (fClamp * fClamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr4[zzdwVar.zze], f6, f7, paint5);
                                            paint5.setAlpha(255);
                                            if (fClamp2 >= 1.0f) {
                                                zzdwVar.zza = zzdwVar.zze;
                                                zzdwVar.zze = FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 16);
                                                zzdwVar.zzb = j + ((long) FlickerLoadingView$$ExternalSyntheticOutline0.m(Utilities.fastRandom, 300)) + 150;
                                            }
                                        } else {
                                            i10 = iWidth;
                                            j = jCurrentTimeMillis2;
                                            ((Paint) methodSignatureImpl2.parameterTypes).setAlpha((int) (fClamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) methodSignatureImpl2.declaringTypeName)[zzdwVar.zza], f6, f7, (Paint) methodSignatureImpl2.parameterTypes);
                                        }
                                        iMax = i9 + 1;
                                        i5 = i8;
                                        iHeight = i7;
                                        methodSignatureImpl3 = methodSignatureImpl;
                                        iWidth = i10;
                                        jCurrentTimeMillis2 = j;
                                        f5 = 1.0f;
                                    } else {
                                        i7 = iHeight;
                                        i8 = i5;
                                        i9 = iMax;
                                        methodSignatureImpl = methodSignatureImpl3;
                                        i10 = iWidth;
                                        j = jCurrentTimeMillis2;
                                    }
                                    iMax = i9 + 1;
                                    i5 = i8;
                                    iHeight = i7;
                                    methodSignatureImpl3 = methodSignatureImpl;
                                    iWidth = i10;
                                    jCurrentTimeMillis2 = j;
                                    f5 = 1.0f;
                                }
                                i6 = i112 + 1;
                                i5 = i5;
                                i12 = 1;
                                i13 = 0;
                                f5 = 1.0f;
                            }
                            i5++;
                            iHeight = iHeight;
                            i12 = 1;
                            i13 = 0;
                            f5 = 1.0f;
                        }
                    }
                    z = true;
                }
                canvas.restore();
                invalidate();
            } else {
                f = 0.9f;
                f2 = 2.0f;
                z = true;
            }
        }
        float fMin = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f);
        float measuredWidth = (getMeasuredWidth() - (0.671f * fMin)) / f2;
        float f20 = 0.0671f * fMin;
        this.roundRadius = f20;
        boolean z2 = this.fromTop;
        if (z2) {
            AndroidUtilities.rectTmp.set(measuredWidth, -f20, getMeasuredWidth() - measuredWidth, fMin);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - fMin, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.roundRadius);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, this.roundRadius + AndroidUtilities.dp(3.0f), this.roundRadius + AndroidUtilities.dp(3.0f), this.phoneFrame2);
        rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f21 = this.roundRadius;
        Paint paint6 = this.phoneFrame1;
        canvas.drawRoundRect(rectF, f21, f21, paint6);
        if (z2) {
            rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, fMin);
        } else {
            rectF.set(measuredWidth, getMeasuredHeight() - fMin, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
        }
        float fDp2 = this.roundRadius - AndroidUtilities.dp(3.0f);
        this.roundRadius = fDp2;
        RoundedBitmapDrawable21 roundedBitmapDrawable21 = this.roundedBitmapDrawable;
        if (roundedBitmapDrawable21 != null && roundedBitmapDrawable21.mCornerRadius != fDp2) {
            if (fDp2 <= 0.05f) {
                z = false;
            }
            Paint paint7 = roundedBitmapDrawable21.mPaint;
            if (z) {
                paint7.setShader(roundedBitmapDrawable21.mBitmapShader);
            } else {
                paint7.setShader(null);
            }
            roundedBitmapDrawable21.mCornerRadius = fDp2;
            roundedBitmapDrawable21.invalidateSelf();
        }
        CellFlickerDrawable.DrawableInterface drawableInterface = this.cellFlickerDrawable;
        if (drawableInterface != null) {
            drawableInterface.radius = this.roundRadius;
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        if (z2) {
            int i29 = (int) this.roundRadius;
            imageReceiver.setRoundRadius(0, 0, i29, i29);
        } else {
            int i30 = (int) this.roundRadius;
            imageReceiver.setRoundRadius(i30, i30, 0, 0);
        }
        if (!this.firstFrameRendered) {
            imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
            imageReceiver.draw(canvas);
        }
        super.dispatchDraw(canvas);
        if (z2) {
            return;
        }
        canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), paint6);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        updateAttachState();
        if (!this.firstFrameRendered) {
            checkVideo();
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        updateAttachState();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        HelloParticles.Drawable drawable = this.helloParticlesDrawable;
        if (drawable != null) {
            HashMap map = drawable.bitmaps;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            map.clear();
            this.helloParticlesDrawable = null;
        }
        AnonymousClass3 anonymousClass3 = this.videoPlayerBase;
        if (anonymousClass3 != null) {
            this.lastFrameTime = anonymousClass3.getCurrentPosition();
            this.videoPlayerBase.release(new GiftSheet$$ExternalSyntheticLambda2(12));
            this.videoPlayerBase = null;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float fMin = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * fMin)) / 2.0f;
        if (this.fromTop) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.roundRadius, getMeasuredWidth() - measuredWidth2, fMin);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - fMin, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.roundRadius);
        }
        if (this.size == measuredWidth) {
            return;
        }
        this.size = measuredWidth;
        MethodSignatureImpl methodSignatureImpl = this.matrixParticlesDrawable;
        int i5 = 0;
        if (methodSignatureImpl != null) {
            ((Rect) methodSignatureImpl.declaringType).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            RectF rectF = (RectF) methodSignatureImpl.name;
            rectF.set(AndroidUtilities.rectTmp);
            rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        }
        StarParticlesView.Drawable drawable = this.starDrawable;
        if (drawable != null) {
            int i6 = this.type;
            if (i6 == 6 || i6 == 9 || i6 == 3 || i6 == 7 || i6 == 24 || i6 == 43 || i6 == 11 || i6 == 4) {
                drawable.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                drawable.rect.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
            } else {
                RectF rectF2 = AndroidUtilities.rectTmp;
                float fWidth = (int) (rectF2.width() * 0.4f);
                drawable.rect.set(rectF2.centerX() - fWidth, rectF2.centerY() - fWidth, rectF2.centerX() + fWidth, rectF2.centerY() + fWidth);
                drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            }
            drawable.resetPositions();
            drawable.excludeRect.set(AndroidUtilities.rectTmp);
            drawable.excludeRect.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        }
        SpeedLineParticles$Drawable speedLineParticles$Drawable = this.speedLinesDrawable;
        if (speedLineParticles$Drawable != null) {
            RectF rectF3 = speedLineParticles$Drawable.rect;
            rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            speedLineParticles$Drawable.screenRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF3.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
            rectF3.offset(0.0f, getMeasuredHeight() * 0.1f);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = speedLineParticles$Drawable.particles;
                if (i7 >= arrayList.size()) {
                    break;
                }
                ((SpeedLineParticles$Drawable.Particle) arrayList.get(i7)).genPosition(jCurrentTimeMillis, true);
                i7++;
            }
        }
        HelloParticles.Drawable drawable2 = this.helloParticlesDrawable;
        if (drawable2 == null) {
            return;
        }
        drawable2.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.helloParticlesDrawable.screenRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.helloParticlesDrawable.rect.inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
        HelloParticles.Drawable drawable3 = this.helloParticlesDrawable;
        drawable3.getClass();
        System.currentTimeMillis();
        while (true) {
            ArrayList arrayList2 = drawable3.particles;
            if (i5 >= arrayList2.size()) {
                return;
            }
            ((HelloParticles.Drawable.Particle) arrayList2.get(i5)).genPosition(i5, true);
            i5++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float fMin = (int) (Math.min(size2, size) * 0.9f);
        float f = size;
        float f2 = (f - (0.671f * fMin)) / 2.0f;
        this.roundRadius = 0.0671f * fMin;
        AnonymousClass1 anonymousClass1 = this.aspectRatioFrameLayout;
        anonymousClass1.invalidateOutline();
        if (this.fromTop) {
            AndroidUtilities.rectTmp.set(f2, 0.0f, f - f2, fMin);
        } else {
            float f3 = size2;
            AndroidUtilities.rectTmp.set(f2, f3 - fMin, f - f2, f3);
        }
        ViewGroup.LayoutParams layoutParams = anonymousClass1.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        anonymousClass1.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) anonymousClass1.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) anonymousClass1.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i, i2);
    }

    public final void runVideoPlayer() {
        Uri uriFromFile;
        int i = this.currentAccount;
        if ((this.file != null || SharedConfig.streamMedia) && this.videoPlayerBase == null) {
            setAspectRatio(this.aspectRatio, 0);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, 0);
            this.videoPlayerBase = anonymousClass3;
            TextureView textureView = this.textureView;
            anonymousClass3.with(textureView);
            File file = this.file;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i);
                    sb.append("&id=");
                    sb.append(this.document.id);
                    sb.append("&hash=");
                    sb.append(this.document.access_hash);
                    sb.append("&dc=");
                    sb.append(this.document.dc_id);
                    sb.append("&size=");
                    sb.append(this.document.size);
                    sb.append("&mime=");
                    sb.append(URLEncoder.encode(this.document.mime_type, "UTF-8"));
                    sb.append("&rid=");
                    sb.append(FileLoader.getInstance(i).getFileReference(MediaDataController.getInstance(i).getPremiumPromo()));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.document), "UTF-8"));
                    sb.append("&reference=");
                    byte[] bArr = this.document.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb.append(Utilities.bytesToHex(bArr));
                    uriFromFile = Uri.parse("tg://" + this.attachFileName + sb.toString());
                } catch (Exception unused) {
                    uriFromFile = null;
                }
            } else {
                uriFromFile = Uri.fromFile(this.file);
            }
            if (uriFromFile == null) {
                return;
            }
            this.videoPlayerBase.preparePlayer(uriFromFile, false, 1.0f);
            if (!this.firstFrameRendered) {
                this.imageReceiver.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.videoPlayerBase.seekTo(this.lastFrameTime + 60);
            this.videoPlayerBase.play();
        }
    }

    @Override
    public void setOffset(float f) {
        boolean z;
        boolean z2 = this.fromTop;
        boolean z3 = false;
        if (f < 0.0f) {
            float measuredWidth = (-f) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z2) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.progress = Math.abs(measuredWidth);
            z = measuredWidth < 1.0f;
            if (measuredWidth < 0.1f) {
                z3 = true;
            }
        } else {
            float measuredWidth2 = (-f) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z2) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z = measuredWidth2 > -1.0f;
            z3 = measuredWidth2 > -0.1f;
            this.progress = Math.abs(measuredWidth2);
        }
        if (z != this.visible) {
            this.visible = z;
            updateAttachState();
        }
        if (z3 != this.allowPlay) {
            this.allowPlay = z3;
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setAllowStartAnimation(z3);
            if (this.allowPlay) {
                imageReceiver.startAnimation();
                runVideoPlayer();
                return;
            }
            AnonymousClass3 anonymousClass3 = this.videoPlayerBase;
            if (anonymousClass3 != null) {
                this.lastFrameTime = anonymousClass3.getCurrentPosition();
                this.videoPlayerBase.release(new GiftSheet$$ExternalSyntheticLambda2(12));
                this.videoPlayerBase = null;
            }
            imageReceiver.stopAnimation();
        }
    }

    public final void updateAttachState() {
        boolean z = this.visible && this.attached;
        if (this.play != z) {
            this.play = z;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (z) {
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }
}
