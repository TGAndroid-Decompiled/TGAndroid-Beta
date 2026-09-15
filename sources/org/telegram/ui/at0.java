package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class at0 implements Runnable {
    public final int f31948a;
    public final PhotoViewer f31949b;

    public at0(PhotoViewer photoViewer, int i10) {
        this.f31948a = i10;
        this.f31949b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        iu0 iu0Var;
        switch (this.f31948a) {
            case 0:
                PhotoViewer photoViewer = this.f31949b;
                if (photoViewer.f30999l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.v0 v0Var = this.f31949b.f31022o0;
                    if (v0Var == null || !v0Var.t()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.f31949b.f31031p0;
                        if (v0Var2 == null || !v0Var2.t()) {
                            bu0 bu0Var = this.f31949b.T1;
                            if (bu0Var == null || bu0Var.getScrollY() == 0) {
                                jd jdVar = this.f31949b.X0;
                                if (jdVar == null || jdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f30897a9;
                                    PhotoViewer photoViewer3 = this.f31949b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.j3(false, true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer4 = this.f31949b;
                if (photoViewer4.F2 != null || ((iu0Var = photoViewer4.f30945f0) != null && iu0Var.f27330x)) {
                    if (photoViewer4.f31049r1) {
                        if (!photoViewer4.R7.f27597r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f31949b.A1());
                            PhotoViewer photoViewer5 = this.f31949b;
                            if (!photoViewer5.A8 && (photoViewer5.f31080u4 != 0 || photoViewer5.Q7.getVisibility() == 0)) {
                                if (o12 >= this.f31949b.R7.getRightProgress()) {
                                    ys0 ys0Var = this.f31949b.R7;
                                    ys0Var.setProgress(ys0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f31949b;
                                    photoViewer6.F2.K((int) (photoViewer6.R7.getLeftProgress() * ((float) this.f31949b.A1())));
                                    PhotoViewer photoViewer7 = this.f31949b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f31949b;
                                    if (!photoViewer8.f31047r && photoViewer8.f30920c2 != 1 && photoViewer8.f31080u4 == 0 && photoViewer8.f31028o6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f31949b.f30936e0.invalidate();
                                } else {
                                    this.f31949b.R7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f31949b;
                                if (photoViewer9.f30920c2 != 1) {
                                    photoViewer9.R7.setProgress(o12);
                                }
                            }
                            this.f31949b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f31949b.A1());
                        if (this.f31949b.f30967h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f31949b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f31949b;
                                iu0 iu0Var2 = photoViewer10.f30945f0;
                                if (iu0Var2 != null && iu0Var2.f27330x) {
                                    f7 = iu0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f31949b;
                                    float f10 = photoViewer11.f30901a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f30923c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f31949b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f31949b;
                        if (!photoViewer12.A8 && photoViewer12.Q7.getVisibility() == 0) {
                            if (o13 >= this.f31949b.R7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f31949b;
                                photoViewer13.H2 = false;
                                photoViewer13.g2();
                                this.f31949b.f31042q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f31949b;
                                photoViewer14.t2((int) (photoViewer14.R7.getLeftProgress() * ((float) this.f31949b.A1())));
                                this.f31949b.f30936e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f31949b.R7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f31949b.R7.getRightProgress() - this.f31949b.R7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f31949b.f31042q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f31949b;
                            if (photoViewer15.f30901a3 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.f30902a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.f30922c4.rewindByBackSeek)) {
                                    photoViewer15.f31042q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f31949b.f31042q3.f(f7);
                                org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f23638p0;
                                if (f7 > eg0Var.f23640a0) {
                                    eg0Var.f23640a0 = f7;
                                    ai.n4 n4Var = eg0Var.f23642b0;
                                    if (n4Var != null) {
                                        n4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f31949b.f31051r3.invalidate();
                        if (this.f31949b.f30911b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f31949b;
                            if (elapsedRealtime2 - photoViewer16.f30930d3 >= 1000) {
                                String str = photoViewer16.f30911b3;
                                photoViewer16.f30930d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f31949b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, o13, 4));
                            }
                        }
                        this.f31949b.C3();
                    }
                }
                uu0 uu0Var = this.f31949b.E2;
                if (uu0Var != null) {
                    uu0.a(uu0Var);
                }
                PhotoViewer photoViewer17 = this.f31949b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f30966h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f31949b;
                if (org.telegram.ui.Components.eg0.f23638p0.P) {
                    org.telegram.ui.Components.eg0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    return;
                }
                photoViewer18.L3 = false;
                Bitmap bitmap = photoViewer18.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.C3 = null;
                }
                photoViewer18.F3 = true;
                Activity activity = photoViewer18.f31114y;
                ci.n6 n6Var = new ci.n6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(n6Var);
                n6Var.f5069b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                n6Var.f5070c = textureView;
                n6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f31108x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f31108x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f31108x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new ml0(18, this, n6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f31108x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f31108x3.setImageBitmap(photoViewer18.C3);
                            }
                            imageReceiver.setImageBitmap(photoViewer18.C3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.C3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.C3 = null;
                    }
                    FileLog.e(th2);
                }
                photoViewer18.J3 = true;
                photoViewer18.f31098w3 = (TextureView) n6Var.f5070c;
                if (org.telegram.ui.Components.eg0.x(false, photoViewer18.f31114y, null, n6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.eg0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    st0 st0Var = photoViewer18.f31117y2;
                    if (st0Var != null) {
                        st0Var.removeView(photoViewer18.B2);
                        photoViewer18.f31117y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f31098w3);
                    photoViewer18.x0(true);
                    photoViewer18.f31098w3.setVisibility(0);
                    return;
                }
                photoViewer18.f31098w3.setVisibility(4);
                st0 st0Var2 = photoViewer18.f31117y2;
                if (st0Var2 != null) {
                    st0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f31117y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
