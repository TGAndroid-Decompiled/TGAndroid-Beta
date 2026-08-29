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
public final class b3 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.j9 {
    public static final int R = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public final int G;
    public TL_iv.pageBlockVideo H;
    public c3 I;
    public TL_iv.PageBlock J;
    public TLRPC.Document K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public MessageObject.GroupedMessagePosition P;
    public boolean Q;
    public final d70 f36662a;
    public final k4 f36663b;
    public f3 f36664c;
    public f3 d;
    public final ImageReceiver f36665e;
    public final FrameLayout f36666f;
    public final e5.c h;
    public final TextureView f36667n;
    public final RadialProgress2 f36668r;
    public final g1 f36669s;
    public final int v;
    public boolean f36670w;
    public int f36671x;
    public int f36672y;

    public b3(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.f36662a = d70Var;
        this.f36663b = k4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36665e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f36668r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.G = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        g1 g1Var = new g1(context, d70Var, k4Var, 1);
        this.f36669s = g1Var;
        e5.c cVar = new e5.c(context);
        this.h = cVar;
        cVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f36667n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36666f = frameLayout;
        cVar.addView(textureView, i7.f6.e(-1, -2, 1));
        frameLayout.addView(cVar, i7.f6.e(-1, -1, 17));
        addView(frameLayout, i7.f6.c(-2.0f, -1));
        addView(g1Var, i7.f6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.E;
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
        int i10 = ((m4) this.f36662a).T;
        int i11 = this.E;
        ImageReceiver imageReceiver = this.f36665e;
        RadialProgress2 radialProgress2 = this.f36668r;
        if (i11 == 0) {
            this.O = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.L;
            k4 k4Var = this.f36663b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.K), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 40), this.K), "80_80_b", this.K.size, null, k4Var.A, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.K, k4Var.A, 1, 1);
            }
            this.E = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i11 == 1) {
            this.O = true;
            if (this.L) {
                imageReceiver.cancelLoadImage();
            } else {
                FileLoader.getInstance(i10).cancelLoadFile(this.K);
            }
            this.E = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 2) {
            imageReceiver.setAllowStartAnimation(true);
            imageReceiver.startAnimation();
            this.E = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, c3 c3Var, boolean z10, boolean z11) {
        boolean z12;
        d70 d70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (d70Var = this.f36662a).f37387w) != null && d70Var.f37388x == this) {
            a0.h hVar = d70Var.f37389y;
            long j10 = pageblockvideo2.video_id;
            c3 a2 = c3.a(videoPlayerHolderBase, this);
            this.I = a2;
            hVar.k(a2, j10);
        }
        this.H = pageblockvideo;
        this.I = c3Var;
        this.J = null;
        this.M = z10;
        k4 k4Var = this.f36663b;
        if (k4Var != null) {
            this.K = j4.a(k4Var.A, pageblockvideo.video_id);
        } else {
            this.K = null;
        }
        if (!MessageObject.isVideoDocument(this.K) && !MessageObject.isGifDocument(this.K)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.L = z12;
        this.f36670w = z11;
        this.f36669s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(c3 c3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        c3 c3Var2 = this.I;
        if (c3Var2 != null && (bitmap2 = c3Var.f36978b) != null && (bitmap3 = c3Var2.f36978b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.I.f36978b = null;
        }
        c3 c3Var3 = this.I;
        if (c3Var3 != null && c3Var.f36978b == null && (bitmap = c3Var3.f36978b) != null) {
            c3Var.f36977a = c3Var3.f36977a;
            c3Var.f36978b = bitmap;
        }
        this.I = c3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f36665e;
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
            d70 d70Var = this.f36662a;
            if (pageblockvideo != null && (videoPlayerHolderBase = d70Var.f37387w) != null && d70Var.f37388x == this) {
                a0.h hVar = d70Var.f37389y;
                long j10 = pageblockvideo.video_id;
                c3 a2 = c3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((m4) d70Var).T).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i10 = ((m4) this.f36662a).T;
        String attachFileName = FileLoader.getAttachFileName(this.K);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.K);
        boolean z12 = true;
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.K, true);
        if (!pathToAttach.exists() && !pathToAttach2.exists()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f36668r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (!this.L) {
                this.E = 3;
            } else {
                this.E = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            c3 c3Var = this.I;
            float f9 = 0.0f;
            if (c3Var != null && c3Var.f36978b != null) {
                this.E = -1;
            } else {
                if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    if (!this.O && this.N && this.L) {
                        this.E = 1;
                    } else {
                        this.E = 0;
                    }
                } else {
                    this.E = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f9 = fileProgress.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
                radialProgress2.o(f9, false);
            }
            z12 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
            radialProgress2.o(f9, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f36664c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    public View getChannelCell() {
        return this.f36669s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.H;
    }

    public ImageReceiver getImageView() {
        return this.f36665e;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    public TextureView getTextureView() {
        return this.f36667n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        f3 f3Var = this.f36664c;
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
        f3 f3Var = this.f36664c;
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
        if (this.H != null) {
            ImageReceiver imageReceiver = this.f36665e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), m4.f40376k1);
            }
            imageReceiver.draw(canvas);
            f3 f3Var = this.f36664c;
            d70 d70Var = this.f36662a;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f36671x, this.f36672y);
                m4.v(d70Var, canvas, this, 0);
                this.f36664c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f36671x, this.f36672y + this.A);
                m4.v(d70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            m4.u(canvas, d70Var, this.H, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f36668r.draw(canvas);
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
        if (this.f36664c != null) {
            sb2.append(", ");
            sb2.append(this.f36664c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b3.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f36668r.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.E != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f36668r.o(1.0f, true);
        if (this.L) {
            this.E = 2;
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
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
