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
public final class b3 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.k9 {
    public static final int S = 0;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public final int H;
    public TL_iv.pageBlockVideo I;
    public c3 J;
    public TL_iv.PageBlock K;
    public TLRPC.Document L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public MessageObject.GroupedMessagePosition Q;
    public boolean R;
    public final p70 f32709a;
    public final l4 f32710b;
    public f3 f32711c;
    public f3 d;
    public final ImageReceiver e;
    public final FrameLayout f32712f;
    public final q4 h;
    public final TextureView f32713n;
    public final RadialProgress2 f32714r;
    public final g1 f32715s;
    public final int v;
    public boolean f32716w;
    public int f32717x;
    public int f32718y;

    public b3(Context context, p70 p70Var, l4 l4Var, int i10) {
        super(context);
        this.f32709a = p70Var;
        this.f32710b = l4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f32714r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.H = DownloadController.getInstance(((n4) p70Var).U).generateObserverTag();
        g1 g1Var = new g1(context, p70Var, l4Var, 1);
        this.f32715s = g1Var;
        q4 q4Var = new q4(context);
        this.h = q4Var;
        q4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f32713n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f32712f = frameLayout;
        q4Var.addView(textureView, k7.b6.e(-1, -2, 1));
        frameLayout.addView(q4Var, k7.b6.e(-1, -1, 17));
        addView(frameLayout, k7.b6.c(-2.0f, -1));
        addView(g1Var, k7.b6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        if (i10 == 3) {
            return 0;
        }
        return 4;
    }

    public final void a() {
        int i10 = ((n4) this.f32709a).U;
        int i11 = this.F;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.f32714r;
        if (i11 == 0) {
            this.P = false;
            radialProgress2.o(0.0f, false);
            boolean z4 = this.M;
            l4 l4Var = this.f32710b;
            if (z4) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.L), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 40), this.L), "80_80_b", this.L.size, null, l4Var.B, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.L, l4Var.B, 1, 1);
            }
            this.F = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i11 == 1) {
            this.P = true;
            if (this.M) {
                imageReceiver.cancelLoadImage();
            } else {
                FileLoader.getInstance(i10).cancelLoadFile(this.L);
            }
            this.F = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 2) {
            imageReceiver.setAllowStartAnimation(true);
            imageReceiver.startAnimation();
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, c3 c3Var, boolean z4, boolean z10) {
        boolean z11;
        p70 p70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.I;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (p70Var = this.f32709a).f36987w) != null && p70Var.f36988x == this) {
            a0.h hVar = p70Var.f36989y;
            long j10 = pageblockvideo2.video_id;
            c3 a2 = c3.a(videoPlayerHolderBase, this);
            this.J = a2;
            hVar.k(a2, j10);
        }
        this.I = pageblockvideo;
        this.J = c3Var;
        this.K = null;
        this.N = z4;
        l4 l4Var = this.f32710b;
        if (l4Var != null) {
            this.L = k4.a(l4Var.B, pageblockvideo.video_id);
        } else {
            this.L = null;
        }
        if (!MessageObject.isVideoDocument(this.L) && !MessageObject.isGifDocument(this.L)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.M = z11;
        this.f32716w = z10;
        this.f32715s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(c3 c3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        c3 c3Var2 = this.J;
        if (c3Var2 != null && (bitmap2 = c3Var.f33007b) != null && (bitmap3 = c3Var2.f33007b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.J.f33007b = null;
        }
        c3 c3Var3 = this.J;
        if (c3Var3 != null && c3Var.f33007b == null && (bitmap = c3Var3.f33007b) != null) {
            c3Var.f33006a = c3Var3.f33006a;
            c3Var.f33007b = bitmap;
        }
        this.J = c3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.R) {
                this.R = true;
                imageReceiver.onAttachedToWindow();
                e(false);
            }
        } else if (!this.R) {
        } else {
            this.R = false;
            TL_iv.pageBlockVideo pageblockvideo = this.I;
            p70 p70Var = this.f32709a;
            if (pageblockvideo != null && (videoPlayerHolderBase = p70Var.f36987w) != null && p70Var.f36988x == this) {
                a0.h hVar = p70Var.f36989y;
                long j10 = pageblockvideo.video_id;
                c3 a2 = c3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((n4) p70Var).U).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z4) {
        boolean z10;
        int i10 = ((n4) this.f32709a).U;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.L);
        boolean z11 = true;
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.L, true);
        if (!pathToAttach.exists() && !pathToAttach2.exists()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f32714r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (!this.M) {
                this.F = 3;
            } else {
                this.F = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            c3 c3Var = this.J;
            float f10 = 0.0f;
            if (c3Var != null && c3Var.f33007b != null) {
                this.F = -1;
            } else {
                if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    if (!this.P && this.O && this.M) {
                        this.F = 1;
                    } else {
                        this.F = 0;
                    }
                } else {
                    this.F = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z4);
                radialProgress2.o(f10, false);
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z4);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f32711c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    public View getChannelCell() {
        return this.f32715s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.I;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    public TextureView getTextureView() {
        return this.f32713n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        f3 f3Var = this.f32711c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f3 f3Var = this.f32711c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.I != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), n4.l1);
            }
            imageReceiver.draw(canvas);
            f3 f3Var = this.f32711c;
            p70 p70Var = this.f32709a;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f32717x, this.f32718y);
                n4.v(p70Var, canvas, this, 0);
                this.f32711c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f32717x, this.f32718y + this.B);
                n4.v(p70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            n4.u(canvas, p70Var, this.I, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f32714r.draw(canvas);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        e(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.f32711c != null) {
            sb.append(", ");
            sb.append(this.f32711c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b3.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f32714r.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.F != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f32714r.o(1.0f, true);
        if (this.M) {
            this.F = 2;
            a();
            return;
        }
        e(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
