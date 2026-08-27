package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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

public final class b3 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.i9 {
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

    public final d70 f36682a;

    public final k4 f36683b;

    public f3 f36684c;
    public f3 d;

    public final ImageReceiver f36685e;

    public final FrameLayout f36686f;
    public final c5.c h;

    public final TextureView f36687n;

    public final RadialProgress2 f36688r;

    public final g1 f36689s;
    public final int v;

    public boolean f36690w;

    public int f36691x;

    public int f36692y;

    public b3(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.f36682a = d70Var;
        this.f36683b = k4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36685e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f36688r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.G = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        g1 g1Var = new g1(context, d70Var, k4Var, 1);
        this.f36689s = g1Var;
        c5.c cVar = new c5.c(context);
        this.h = cVar;
        cVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f36687n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36686f = frameLayout;
        cVar.addView(textureView, h7.z5.e(-1, -2, 1));
        frameLayout.addView(cVar, h7.z5.e(-1, -1, 17));
        addView(frameLayout, h7.z5.c(-2.0f, -1));
        addView(g1Var, h7.z5.c(-2.0f, -1));
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
        return i10 == 3 ? 0 : 4;
    }

    public final void a() {
        int i10 = ((m4) this.f36682a).T;
        int i11 = this.E;
        ImageReceiver imageReceiver = this.f36685e;
        RadialProgress2 radialProgress2 = this.f36688r;
        if (i11 == 0) {
            this.O = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.L;
            k4 k4Var = this.f36683b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.K), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 40), this.K), "80_80_b", this.K.size, null, k4Var.A, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.K, k4Var.A, 1, 1);
            }
            this.E = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                imageReceiver.setAllowStartAnimation(true);
                imageReceiver.startAnimation();
                this.E = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.O = true;
        if (this.L) {
            imageReceiver.cancelLoadImage();
        } else {
            FileLoader.getInstance(i10).cancelLoadFile(this.K);
        }
        this.E = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, c3 c3Var, boolean z10, boolean z11) {
        d70 d70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.H;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (d70Var = this.f36682a).f37292w) != null && d70Var.f37293x == this) {
            a0.h hVar = d70Var.f37294y;
            long j10 = pageblockvideo2.video_id;
            c3 c3VarA = c3.a(videoPlayerHolderBase, this);
            this.I = c3VarA;
            hVar.k(c3VarA, j10);
        }
        this.H = pageblockvideo;
        this.I = c3Var;
        this.J = null;
        this.M = z10;
        k4 k4Var = this.f36683b;
        if (k4Var != null) {
            this.K = j4.a(k4Var.A, pageblockvideo.video_id);
        } else {
            this.K = null;
        }
        this.L = MessageObject.isVideoDocument(this.K) || MessageObject.isGifDocument(this.K);
        this.f36690w = z11;
        this.f36689s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(c3 c3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        c3 c3Var2 = this.I;
        if (c3Var2 != null && (bitmap2 = c3Var.f36927b) != null && (bitmap3 = c3Var2.f36927b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.I.f36927b = null;
        }
        c3 c3Var3 = this.I;
        if (c3Var3 != null && c3Var.f36927b == null && (bitmap = c3Var3.f36927b) != null) {
            c3Var.f36926a = c3Var3.f36926a;
            c3Var.f36927b = bitmap;
        }
        this.I = c3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f36685e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            imageReceiver.onAttachedToWindow();
            e(false);
            return;
        }
        if (this.Q) {
            this.Q = false;
            TL_iv.pageBlockVideo pageblockvideo = this.H;
            d70 d70Var = this.f36682a;
            if (pageblockvideo != null && (videoPlayerHolderBase = d70Var.f37292w) != null && d70Var.f37293x == this) {
                a0.h hVar = d70Var.f37294y;
                long j10 = pageblockvideo.video_id;
                c3 c3VarA = c3.a(videoPlayerHolderBase, this);
                c(c3VarA);
                hVar.k(c3VarA, j10);
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
        int i10 = ((m4) this.f36682a).T;
        String attachFileName = FileLoader.getAttachFileName(this.K);
        boolean z11 = true;
        boolean z12 = FileLoader.getInstance(i10).getPathToAttach(this.K).exists() || FileLoader.getInstance(i10).getPathToAttach(this.K, true).exists();
        boolean zIsEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f36688r;
        if (zIsEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (this.L) {
                this.E = -1;
            } else {
                this.E = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            c3 c3Var = this.I;
            float fFloatValue = 0.0f;
            if (c3Var == null || c3Var.f36927b == null) {
                if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    this.E = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        fFloatValue = fileProgress.floatValue();
                    }
                } else if (!this.O && this.N && this.L) {
                    this.E = 1;
                } else {
                    this.E = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.o(fFloatValue, false);
            } else {
                this.E = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
            radialProgress2.o(fFloatValue, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f36684c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    public View getChannelCell() {
        return this.f36689s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.H;
    }

    public ImageReceiver getImageView() {
        return this.f36685e;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    public TextureView getTextureView() {
        return this.f36687n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        f3 f3Var = this.f36684c;
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
        f3 f3Var = this.f36684c;
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
        if (this.H == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f36685e;
        if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
            canvas.drawRect(imageReceiver.getDrawRegion(), m4.f40319k1);
        }
        imageReceiver.draw(canvas);
        f3 f3Var = this.f36684c;
        d70 d70Var = this.f36682a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f36691x, this.f36692y);
            m4.v(d70Var, canvas, this, 0);
            this.f36684c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36691x, this.f36692y + this.A);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.H, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.getVisible()) {
            this.f36688r.draw(canvas);
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
        if (this.f36684c != null) {
            sb2.append(", ");
            sb2.append(this.f36684c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int iCeil;
        int i13;
        TL_iv.pageBlockVideo pageblockvideo;
        ImageReceiver imageReceiver;
        int iDp;
        int iDp2;
        int iDp3;
        int iDp4;
        TLRPC.Document document;
        k4 k4Var;
        int iDp5;
        int imageHeight;
        k4 k4Var2;
        boolean z10;
        f3 f3VarQ;
        int i14;
        Layout.Alignment alignmentA;
        f3 f3VarP;
        int iDp6;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i15;
        int i16;
        int i17;
        int iDp7;
        c3 c3Var;
        int size;
        int i18;
        boolean z11;
        float f10;
        float f11;
        float f12;
        int iMax;
        TLRPC.DocumentAttribute documentAttribute;
        int i19;
        int size2 = View.MeasureSpec.getSize(i10);
        int i20 = this.v;
        if (i20 != 1) {
            if (i20 == 2) {
                float f13 = this.P.f19619ph;
                Point point = AndroidUtilities.displaySize;
                iCeil = (int) Math.ceil(f13 * Math.max(point.x, point.y) * 0.5f);
            } else {
                i12 = size2;
                iCeil = 0;
            }
            i13 = ((m4) this.f36682a).T;
            pageblockvideo = this.H;
            imageReceiver = this.f36685e;
            if (pageblockvideo != null) {
                if (i20 == 0 || (i19 = pageblockvideo.level) <= 0) {
                    this.f36691x = AndroidUtilities.dp(18.0f);
                    iDp2 = i12 - AndroidUtilities.dp(36.0f);
                    iDp3 = i12;
                    iDp4 = 0;
                } else {
                    iDp4 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i19 * 14);
                    this.f36691x = iDp4;
                    iDp3 = org.telegram.messenger.rl.u(18.0f, iDp4, i12);
                    iDp2 = iDp3;
                }
                document = this.K;
                k4Var = this.f36683b;
                if (document != null) {
                    iDp6 = AndroidUtilities.dp(48.0f);
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 48);
                    if (i20 == 0) {
                        size = this.K.attributes.size();
                        i18 = 0;
                        while (true) {
                            if (i18 < size) {
                                z11 = false;
                                break;
                            }
                            documentAttribute = this.K.attributes.get(i18);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                iCeil = (int) ((iDp3 / documentAttribute.f22387w) * documentAttribute.h);
                                z11 = true;
                                break;
                            }
                            i18++;
                        }
                        if (closestPhotoSizeWithSize != null) {
                            f10 = closestPhotoSizeWithSize.f22405w;
                        } else {
                            f10 = 100.0f;
                        }
                        if (closestPhotoSizeWithSize != null) {
                            f11 = closestPhotoSizeWithSize.h;
                        } else {
                            f11 = 100.0f;
                        }
                        if (!z11) {
                            iCeil = (int) ((iDp3 / f10) * f11);
                        }
                        if (this.J instanceof TL_iv.pageBlockCover) {
                            iCeil = Math.min(iCeil, iDp3);
                            f12 = 100.0f;
                        } else {
                            Point point2 = AndroidUtilities.displaySize;
                            f12 = 100.0f;
                            iMax = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                            if (iCeil > iMax) {
                                iDp3 = (int) ((iMax / f11) * f10);
                                iDp4 += ((i12 - iDp4) - iDp3) / 2;
                                iCeil = iMax;
                            }
                        }
                        if (iCeil == 0) {
                            iCeil = AndroidUtilities.dp(f12);
                        } else if (iCeil < iDp6) {
                            iCeil = iDp6;
                        }
                    } else {
                        if (i20 != 2) {
                            if ((this.P.flags & 2) == 0) {
                                iDp3 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.P.flags & 8) == 0) {
                                int i21 = iDp3;
                                i15 = iCeil;
                                iCeil -= AndroidUtilities.dp(2.0f);
                                i16 = iDp4;
                                i17 = i21;
                            }
                        }
                        imageReceiver.setQualityThumbDocument(this.K);
                        if (!this.f36690w || i20 == 1 || i20 == 2 || this.H.level > 0) {
                            iDp7 = 0;
                        } else {
                            iDp7 = AndroidUtilities.dp(8.0f);
                        }
                        imageReceiver.setImageCoords(i16, iDp7, i17, iCeil);
                        if (!this.M) {
                            if (this.L) {
                                c3Var = this.I;
                                if (c3Var != null || c3Var.f36927b == null) {
                                    this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                                    File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.K);
                                    File pathToAttach2 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                                    if (!this.N || pathToAttach.exists() || pathToAttach2.exists()) {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                    } else {
                                        imageReceiver.setStrippedLocation(ImageLocation.getForDocument(this.K));
                                        imageReceiver.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                    }
                                } else {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImageBitmap(this.I.f36927b);
                                }
                            } else {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", 0L, null, k4Var != null ? k4Var.A : null, 1);
                            }
                        }
                        imageReceiver.setAspectFit(true);
                        float f14 = iDp6;
                        this.B = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f14, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f14) / 2.0f) + imageReceiver.getImageY());
                        this.C = imageHeight2;
                        int i22 = this.B;
                        this.f36688r.q(i22, imageHeight2, i22 + iDp6, iDp6 + imageHeight2);
                        iDp5 = i15;
                    }
                    i16 = iDp4;
                    i17 = iDp3;
                    i15 = iCeil;
                    imageReceiver.setQualityThumbDocument(this.K);
                    if (this.f36690w) {
                        iDp7 = 0;
                    } else {
                        iDp7 = 0;
                    }
                    imageReceiver.setImageCoords(i16, iDp7, i17, iCeil);
                    if (!this.M) {
                        if (this.L) {
                            c3Var = this.I;
                            if (c3Var != null) {
                                this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                                File pathToAttach3 = FileLoader.getInstance(i13).getPathToAttach(this.K);
                                File pathToAttach4 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                                if (this.N) {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                } else {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                }
                            } else {
                                this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                                File pathToAttach5 = FileLoader.getInstance(i13).getPathToAttach(this.K);
                                File pathToAttach6 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                                if (this.N) {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                } else {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                }
                            }
                        } else {
                            imageReceiver.setStrippedLocation(null);
                            imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", 0L, null, k4Var != null ? k4Var.A : null, 1);
                        }
                    }
                    imageReceiver.setAspectFit(true);
                    float f15 = iDp6;
                    this.B = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f15, 2.0f, imageReceiver.getImageX());
                    int imageHeight3 = (int) (((imageReceiver.getImageHeight() - f15) / 2.0f) + imageReceiver.getImageY());
                    this.C = imageHeight3;
                    int i23 = this.B;
                    this.f36688r.q(i23, imageHeight3, i23 + iDp6, iDp6 + imageHeight3);
                    iDp5 = i15;
                } else {
                    iDp5 = iCeil;
                }
                imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                this.f36692y = imageHeight;
                if (i20 == 0) {
                    TL_iv.pageBlockVideo pageblockvideo2 = this.H;
                    f3VarQ = m4.q(this.f36682a, this, null, pageblockvideo2.caption.text, iDp2, imageHeight, pageblockvideo2, this.f36683b);
                    this.f36684c = f3VarQ;
                    if (f3VarQ != null) {
                        int height = this.f36684c.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.A = height;
                        iDp5 = org.telegram.messenger.y1.C(4.0f, height, iDp5);
                        f3 f3Var = this.f36684c;
                        f3Var.f37923s = this.f36691x;
                        f3Var.v = this.f36692y;
                    }
                    i14 = iDp5;
                    TL_iv.pageBlockVideo pageblockvideo3 = this.H;
                    TL_iv.RichText richText = pageblockvideo3.caption.credit;
                    if (k4Var == null && k4Var.C) {
                        alignmentA = org.telegram.ui.Components.tv0.a();
                    } else {
                        alignmentA = Layout.Alignment.ALIGN_NORMAL;
                    }
                    k4Var2 = k4Var;
                    f3VarP = m4.p(this.f36682a, this, null, richText, iDp2, 0, pageblockvideo3, alignmentA, 0, this.f36683b);
                    this.d = f3VarP;
                    if (f3VarP != null) {
                        iDp5 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i14;
                        f3 f3Var2 = this.d;
                        f3Var2.f37923s = this.f36691x;
                        f3Var2.v = this.f36692y + this.A;
                    } else {
                        iDp5 = i14;
                    }
                } else {
                    k4Var2 = k4Var;
                }
                if (!this.f36690w && i20 == 0 && this.H.level <= 0) {
                    iDp5 += AndroidUtilities.dp(8.0f);
                }
                if ((this.J instanceof TL_iv.pageBlockCover) || k4Var2 == null) {
                    z10 = false;
                } else {
                    ArrayList arrayList = k4Var2.f39590e;
                    if (arrayList.size() <= 1 || !(arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                if (i20 != 2 || z10) {
                    iDp = iDp5;
                } else {
                    iDp = AndroidUtilities.dp(8.0f) + iDp5;
                }
            } else {
                iDp = 1;
            }
            g1 g1Var = this.f36689s;
            g1Var.measure(i10, i11);
            g1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36686f.getLayoutParams();
            layoutParams.leftMargin = (int) imageReceiver.getImageX();
            layoutParams.topMargin = (int) imageReceiver.getImageY();
            layoutParams.width = (int) imageReceiver.getImageWidth();
            layoutParams.height = (int) imageReceiver.getImageHeight();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }
        size2 = ((View) getParent()).getMeasuredWidth();
        iCeil = ((View) getParent()).getMeasuredHeight();
        i12 = size2;
        i13 = ((m4) this.f36682a).T;
        pageblockvideo = this.H;
        imageReceiver = this.f36685e;
        if (pageblockvideo != null) {
            if (i20 == 0) {
                this.f36691x = AndroidUtilities.dp(18.0f);
                iDp2 = i12 - AndroidUtilities.dp(36.0f);
                iDp3 = i12;
                iDp4 = 0;
            } else {
                this.f36691x = AndroidUtilities.dp(18.0f);
                iDp2 = i12 - AndroidUtilities.dp(36.0f);
                iDp3 = i12;
                iDp4 = 0;
            }
            document = this.K;
            k4Var = this.f36683b;
            if (document != null) {
                iDp6 = AndroidUtilities.dp(48.0f);
                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.K.thumbs, 48);
                if (i20 == 0) {
                    size = this.K.attributes.size();
                    i18 = 0;
                    while (true) {
                        if (i18 < size) {
                            z11 = false;
                            break;
                        }
                        documentAttribute = this.K.attributes.get(i18);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            iCeil = (int) ((iDp3 / documentAttribute.f22387w) * documentAttribute.h);
                            z11 = true;
                            break;
                        }
                        i18++;
                    }
                    if (closestPhotoSizeWithSize != null) {
                        f10 = closestPhotoSizeWithSize.f22405w;
                    } else {
                        f10 = 100.0f;
                    }
                    if (closestPhotoSizeWithSize != null) {
                        f11 = closestPhotoSizeWithSize.h;
                    } else {
                        f11 = 100.0f;
                    }
                    if (!z11) {
                        iCeil = (int) ((iDp3 / f10) * f11);
                    }
                    if (this.J instanceof TL_iv.pageBlockCover) {
                        iCeil = Math.min(iCeil, iDp3);
                        f12 = 100.0f;
                    } else {
                        Point point3 = AndroidUtilities.displaySize;
                        f12 = 100.0f;
                        iMax = (int) ((Math.max(point3.x, point3.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                        if (iCeil > iMax) {
                            iDp3 = (int) ((iMax / f11) * f10);
                            iDp4 += ((i12 - iDp4) - iDp3) / 2;
                            iCeil = iMax;
                        }
                    }
                    if (iCeil == 0) {
                        iCeil = AndroidUtilities.dp(f12);
                    } else if (iCeil < iDp6) {
                        iCeil = iDp6;
                    }
                } else {
                    if (i20 != 2) {
                        if ((this.P.flags & 2) == 0) {
                            iDp3 -= AndroidUtilities.dp(2.0f);
                        }
                        if ((this.P.flags & 8) == 0) {
                            int i24 = iDp3;
                            i15 = iCeil;
                            iCeil -= AndroidUtilities.dp(2.0f);
                            i16 = iDp4;
                            i17 = i24;
                        }
                    }
                    imageReceiver.setQualityThumbDocument(this.K);
                    if (this.f36690w) {
                        iDp7 = 0;
                    } else {
                        iDp7 = 0;
                    }
                    imageReceiver.setImageCoords(i16, iDp7, i17, iCeil);
                    if (!this.M) {
                        if (this.L) {
                            c3Var = this.I;
                            if (c3Var != null) {
                                this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                                File pathToAttach7 = FileLoader.getInstance(i13).getPathToAttach(this.K);
                                File pathToAttach8 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                                if (this.N) {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                } else {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                }
                            } else {
                                this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                                File pathToAttach9 = FileLoader.getInstance(i13).getPathToAttach(this.K);
                                File pathToAttach10 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                                if (this.N) {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                } else {
                                    imageReceiver.setStrippedLocation(null);
                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                                }
                            }
                        } else {
                            imageReceiver.setStrippedLocation(null);
                            imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", 0L, null, k4Var != null ? k4Var.A : null, 1);
                        }
                    }
                    imageReceiver.setAspectFit(true);
                    float f16 = iDp6;
                    this.B = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f16, 2.0f, imageReceiver.getImageX());
                    int imageHeight4 = (int) (((imageReceiver.getImageHeight() - f16) / 2.0f) + imageReceiver.getImageY());
                    this.C = imageHeight4;
                    int i25 = this.B;
                    this.f36688r.q(i25, imageHeight4, i25 + iDp6, iDp6 + imageHeight4);
                    iDp5 = i15;
                }
                i16 = iDp4;
                i17 = iDp3;
                i15 = iCeil;
                imageReceiver.setQualityThumbDocument(this.K);
                if (this.f36690w) {
                    iDp7 = 0;
                } else {
                    iDp7 = 0;
                }
                imageReceiver.setImageCoords(i16, iDp7, i17, iCeil);
                if (!this.M) {
                    if (this.L) {
                        c3Var = this.I;
                        if (c3Var != null) {
                            this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                            File pathToAttach11 = FileLoader.getInstance(i13).getPathToAttach(this.K);
                            File pathToAttach12 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                            if (this.N) {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                            } else {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                            }
                        } else {
                            this.N = DownloadController.getInstance(i13).canDownloadMedia(4, this.K.size);
                            File pathToAttach13 = FileLoader.getInstance(i13).getPathToAttach(this.K);
                            File pathToAttach14 = FileLoader.getInstance(i13).getPathToAttach(this.K, true);
                            if (this.N) {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                            } else {
                                imageReceiver.setStrippedLocation(null);
                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.K), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", null, this.K.size, null, k4Var.A, 1);
                            }
                        }
                    } else {
                        imageReceiver.setStrippedLocation(null);
                        imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.K), "80_80_b", 0L, null, k4Var != null ? k4Var.A : null, 1);
                    }
                }
                imageReceiver.setAspectFit(true);
                float f17 = iDp6;
                this.B = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), f17, 2.0f, imageReceiver.getImageX());
                int imageHeight5 = (int) (((imageReceiver.getImageHeight() - f17) / 2.0f) + imageReceiver.getImageY());
                this.C = imageHeight5;
                int i26 = this.B;
                this.f36688r.q(i26, imageHeight5, i26 + iDp6, iDp6 + imageHeight5);
                iDp5 = i15;
            } else {
                iDp5 = iCeil;
            }
            imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f36692y = imageHeight;
            if (i20 == 0) {
                TL_iv.pageBlockVideo pageblockvideo4 = this.H;
                f3VarQ = m4.q(this.f36682a, this, null, pageblockvideo4.caption.text, iDp2, imageHeight, pageblockvideo4, this.f36683b);
                this.f36684c = f3VarQ;
                if (f3VarQ != null) {
                    int height2 = this.f36684c.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.A = height2;
                    iDp5 = org.telegram.messenger.y1.C(4.0f, height2, iDp5);
                    f3 f3Var3 = this.f36684c;
                    f3Var3.f37923s = this.f36691x;
                    f3Var3.v = this.f36692y;
                }
                i14 = iDp5;
                TL_iv.pageBlockVideo pageblockvideo5 = this.H;
                TL_iv.RichText richText2 = pageblockvideo5.caption.credit;
                if (k4Var == null) {
                    alignmentA = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignmentA = Layout.Alignment.ALIGN_NORMAL;
                }
                k4Var2 = k4Var;
                f3VarP = m4.p(this.f36682a, this, null, richText2, iDp2, 0, pageblockvideo5, alignmentA, 0, this.f36683b);
                this.d = f3VarP;
                if (f3VarP != null) {
                    iDp5 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i14;
                    f3 f3Var4 = this.d;
                    f3Var4.f37923s = this.f36691x;
                    f3Var4.v = this.f36692y + this.A;
                } else {
                    iDp5 = i14;
                }
            } else {
                k4Var2 = k4Var;
            }
            if (!this.f36690w) {
                iDp5 += AndroidUtilities.dp(8.0f);
            }
            if (this.J instanceof TL_iv.pageBlockCover) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (i20 != 2) {
                iDp = iDp5;
            } else {
                iDp = iDp5;
            }
        } else {
            iDp = 1;
        }
        g1 g1Var2 = this.f36689s;
        g1Var2.measure(i10, i11);
        g1Var2.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f36686f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver.getImageX();
        layoutParams2.topMargin = (int) imageReceiver.getImageY();
        layoutParams2.width = (int) imageReceiver.getImageWidth();
        layoutParams2.height = (int) imageReceiver.getImageHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f36688r.o(Math.min(1.0f, j10 / j11), true);
        if (this.E != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f36688r.o(1.0f, true);
        if (!this.L) {
            e(true);
        } else {
            this.E = 2;
            a();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        g1 g1Var = this.f36689s;
        int visibility = g1Var.getVisibility();
        k4 k4Var = this.f36683b;
        if (visibility != 0 || y10 <= g1Var.getTranslationY() || y10 >= g1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            if (motionEvent.getAction() == 0 && this.f36685e.isInsideImage(x8, y10)) {
                if (this.E != -1) {
                    int i10 = this.B;
                    if (x8 >= i10 && x8 <= AndroidUtilities.dp(48.0f) + i10) {
                        int i11 = this.C;
                        if (y10 >= i11 && y10 <= AndroidUtilities.dp(48.0f) + i11) {
                            this.F = 1;
                            invalidate();
                        } else if (this.E == 0) {
                            this.F = 1;
                            invalidate();
                        } else {
                            this.D = true;
                        }
                    } else if (this.E == 0) {
                        this.F = 1;
                        invalidate();
                    } else {
                        this.D = true;
                    }
                } else if (this.E == 0) {
                    this.F = 1;
                    invalidate();
                } else {
                    this.D = true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.D) {
                    this.D = false;
                    this.f36682a.d(this.H, k4Var);
                } else if (this.F == 1) {
                    this.F = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.D = false;
            }
            if (!this.D && this.F == 0) {
                if (!m4.l(this.f36682a, this.f36683b, motionEvent, this, this.f36684c, this.f36691x, this.f36692y)) {
                    if (!m4.l(this.f36682a, this.f36683b, motionEvent, this, this.d, this.f36691x, this.f36692y + this.A) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (k4Var != null && k4Var.B != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
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
