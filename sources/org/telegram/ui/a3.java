package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class a3 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.m9 {
    public static final int R = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockVideo H;
    public b3 I;
    public TL_iv.PageBlock J;
    public TLRPC.Document K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public MessageObject.GroupedMessagePosition P;
    public boolean Q;
    public final a70 f36345a;
    public final j4 f36346b;
    public e3 f36347c;
    public e3 d;
    public final ImageReceiver f36348e;
    public final FrameLayout f36349f;
    public final c5.c h;
    public final TextureView f36350n;
    public final RadialProgress2 f36351r;
    public final f1 f36352s;
    public final int v;
    public boolean f36353w;
    public int f36354x;
    public int f36355y;

    public a3(Context context, a70 a70Var, j4 j4Var, int i9) {
        super(context);
        this.f36345a = a70Var;
        this.f36346b = j4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36348e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i9;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f36351r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.G = DownloadController.getInstance(((l4) a70Var).T).generateObserverTag();
        f1 f1Var = new f1(context, a70Var, j4Var, 1);
        this.f36352s = f1Var;
        c5.c cVar = new c5.c(context);
        this.h = cVar;
        cVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f36350n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36349f = frameLayout;
        cVar.addView(textureView, g7.e6.e(-1, -2, 1));
        frameLayout.addView(cVar, g7.e6.e(-1, -1, 17));
        addView(frameLayout, g7.e6.c(-2.0f, -1));
        addView(f1Var, g7.e6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i9 = this.E;
        if (i9 == 0) {
            return 2;
        }
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 2) {
            return 8;
        }
        if (i9 == 3) {
            return 0;
        }
        return 4;
    }

    public final void a() {
        int i9 = ((l4) this.f36345a).T;
        int i10 = this.E;
        ImageReceiver imageReceiver = this.f36348e;
        RadialProgress2 radialProgress2 = this.f36351r;
        if (i10 == 0) {
            this.O = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.L;
            j4 j4Var = this.f36346b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.K), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 40), this.K), "80_80_b", this.K.size, null, j4Var.A, 1);
            } else {
                FileLoader.getInstance(i9).loadFile(this.K, j4Var.A, 1, 1);
            }
            this.E = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i10 == 1) {
            this.O = true;
            if (this.L) {
                imageReceiver.cancelLoadImage();
            } else {
                FileLoader.getInstance(i9).cancelLoadFile(this.K);
            }
            this.E = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 2) {
            imageReceiver.setAllowStartAnimation(true);
            imageReceiver.startAnimation();
            this.E = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, b3 b3Var, boolean z10, boolean z11) {
        boolean z12;
        a70 a70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (a70Var = this.f36345a).f36381w) != null && a70Var.f36382x == this) {
            a0.h hVar = a70Var.f36383y;
            long j10 = pageblockvideo2.video_id;
            b3 a2 = b3.a(videoPlayerHolderBase, this);
            this.I = a2;
            hVar.k(a2, j10);
        }
        this.H = pageblockvideo;
        this.I = b3Var;
        this.J = null;
        this.M = z10;
        j4 j4Var = this.f36346b;
        if (j4Var != null) {
            this.K = i4.a(j4Var.A, pageblockvideo.video_id);
        } else {
            this.K = null;
        }
        if (!MessageObject.isVideoDocument(this.K) && !MessageObject.isGifDocument(this.K)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.L = z12;
        this.f36353w = z11;
        this.f36352s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(b3 b3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        b3 b3Var2 = this.I;
        if (b3Var2 != null && (bitmap2 = b3Var.f36615b) != null && (bitmap3 = b3Var2.f36615b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.I.f36615b = null;
        }
        b3 b3Var3 = this.I;
        if (b3Var3 != null && b3Var.f36615b == null && (bitmap = b3Var3.f36615b) != null) {
            b3Var.f36614a = b3Var3.f36614a;
            b3Var.f36615b = bitmap;
        }
        this.I = b3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f36348e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.Q) {
                this.Q = true;
                imageReceiver.onAttachedToWindow();
                e(false);
            }
        } else if (!this.Q) {
        } else {
            this.Q = false;
            TL_iv.pageBlockVideo pageblockvideo = this.H;
            a70 a70Var = this.f36345a;
            if (pageblockvideo != null && (videoPlayerHolderBase = a70Var.f36381w) != null && a70Var.f36382x == this) {
                a0.h hVar = a70Var.f36383y;
                long j10 = pageblockvideo.video_id;
                b3 a2 = b3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((l4) a70Var).T).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i9 = ((l4) this.f36345a).T;
        String attachFileName = FileLoader.getAttachFileName(this.K);
        File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(this.K);
        boolean z12 = true;
        File pathToAttach2 = FileLoader.getInstance(i9).getPathToAttach(this.K, true);
        if (!pathToAttach.exists() && !pathToAttach2.exists()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f36351r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            if (!this.L) {
                this.E = 3;
            } else {
                this.E = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            b3 b3Var = this.I;
            float f10 = 0.0f;
            if (b3Var != null && b3Var.f36615b != null) {
                this.E = -1;
            } else {
                if (!FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                    if (!this.O && this.N && this.L) {
                        this.E = 1;
                    } else {
                        this.E = 0;
                    }
                } else {
                    this.E = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
                radialProgress2.o(f10, false);
            }
            z12 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f36347c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    public View getChannelCell() {
        return this.f36352s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.H;
    }

    public ImageReceiver getImageView() {
        return this.f36348e;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    public TextureView getTextureView() {
        return this.f36350n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e3 e3Var = this.f36347c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        e3 e3Var = this.f36347c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.H != null) {
            ImageReceiver imageReceiver = this.f36348e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), l4.f39998k1);
            }
            imageReceiver.draw(canvas);
            e3 e3Var = this.f36347c;
            a70 a70Var = this.f36345a;
            int i9 = 0;
            if (e3Var != null) {
                canvas.save();
                canvas.translate(this.f36354x, this.f36355y);
                l4.v(a70Var, canvas, this, 0);
                this.f36347c.draw(canvas, this);
                canvas.restore();
                i9 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f36354x, this.f36355y + this.A);
                l4.v(a70Var, canvas, this, i9);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            l4.u(canvas, a70Var, this.H, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f36351r.draw(canvas);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        e(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.f36347c != null) {
            sb2.append(", ");
            sb2.append(this.f36347c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a3.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f36351r.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.E != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f36351r.o(1.0f, true);
        if (this.L) {
            this.E = 2;
            a();
            return;
        }
        e(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        d();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
