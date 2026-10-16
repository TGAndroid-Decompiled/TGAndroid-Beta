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
public final class gt0 implements Runnable {
    public final int f36306a;
    public final PhotoViewer f36307b;

    public gt0(PhotoViewer photoViewer, int i10) {
        this.f36306a = i10;
        this.f36307b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        ou0 ou0Var;
        switch (this.f36306a) {
            case 0:
                PhotoViewer photoViewer3 = this.f36307b;
                if (photoViewer3.f31992l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.u0 u0Var = this.f36307b.f32015o0;
                    if (u0Var == null || !u0Var.t()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.f36307b.f32024p0;
                        if (u0Var2 == null || !u0Var2.t()) {
                            hu0 hu0Var = this.f36307b.T1;
                            if (hu0Var == null || hu0Var.getScrollY() == 0) {
                                qd qdVar = this.f36307b.X0;
                                if (qdVar == null || qdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f31889b9;
                                    PhotoViewer photoViewer5 = this.f36307b;
                                    if (photoViewer4 != photoViewer5) {
                                        photoViewer5.j3(false, true);
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
                PhotoViewer photoViewer6 = this.f36307b;
                if (photoViewer6.F2 != null || ((ou0Var = photoViewer6.f31937f0) != null && ou0Var.f28531x)) {
                    if (photoViewer6.f32042r1) {
                        if (!photoViewer6.S7.f29288r) {
                            float o12 = ((float) photoViewer6.o1()) / ((float) this.f36307b.A1());
                            PhotoViewer photoViewer7 = this.f36307b;
                            if (!photoViewer7.B8 && (photoViewer7.f32073u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (o12 >= this.f36307b.S7.getRightProgress()) {
                                    et0 et0Var = this.f36307b.S7;
                                    et0Var.setProgress(et0Var.getLeftProgress());
                                    this.f36307b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f36307b.A1())));
                                    PhotoViewer photoViewer8 = this.f36307b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.u0();
                                    PhotoViewer photoViewer9 = this.f36307b;
                                    if (!photoViewer9.f32040r && photoViewer9.f31912c2 != 1 && photoViewer9.f32073u4 == 0 && photoViewer9.f32021o6 <= 0) {
                                        photoViewer9.h2();
                                    } else {
                                        photoViewer9.j2();
                                    }
                                    this.f36307b.f31928e0.invalidate();
                                } else {
                                    this.f36307b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f36307b;
                                if (photoViewer10.f31912c2 != 1) {
                                    photoViewer10.S7.setProgress(o12);
                                }
                            }
                            this.f36307b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer6.o1()) / ((float) this.f36307b.A1());
                        if (this.f36307b.f31959h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f36307b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f36307b;
                                ou0 ou0Var2 = photoViewer11.f31937f0;
                                if (ou0Var2 != null && ou0Var2.f28531x) {
                                    f7 = ou0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f36307b;
                                    float f10 = photoViewer12.f31893a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f31915c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f36307b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f36307b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (o13 >= this.f36307b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f36307b;
                                photoViewer14.H2 = false;
                                photoViewer14.h2();
                                this.f36307b.f32035q3.h(0.0f, false);
                                this.f36307b.t2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f36307b.A1())));
                                this.f36307b.f31928e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f36307b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f36307b.S7.getRightProgress() - this.f36307b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f36307b.f32035q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f36307b;
                            if (photoViewer15.f31893a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f31894a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f31914c4.rewindByBackSeek)) {
                                    photoViewer15.f32035q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f36307b.f32035q3.f(f7);
                                org.telegram.ui.Components.fh0 fh0Var = org.telegram.ui.Components.fh0.f24733p0;
                                if (f7 > fh0Var.f24735a0) {
                                    fh0Var.f24735a0 = f7;
                                    bi.d4 d4Var = fh0Var.f24737b0;
                                    if (d4Var != null) {
                                        d4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f36307b.f32044r3.invalidate();
                        if (this.f36307b.f31903b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f36307b;
                            if (elapsedRealtime2 - photoViewer16.f31922d3 >= 1000) {
                                String str = photoViewer16.f31903b3;
                                photoViewer16.f31922d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f36307b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f36307b.C3();
                    }
                }
                av0 av0Var = this.f36307b.E2;
                if (av0Var != null) {
                    av0.a(av0Var);
                }
                PhotoViewer photoViewer17 = this.f36307b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f31958h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f36307b;
                if (org.telegram.ui.Components.fh0.f24733p0.P) {
                    org.telegram.ui.Components.fh0.j(false);
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
                Activity activity = photoViewer18.f32107y;
                ah.v vVar = new ah.v(activity, 26);
                ImageReceiver imageReceiver = new ImageReceiver(vVar);
                vVar.f894b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                vVar.f895c = textureView;
                vVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f32101x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f32101x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f32101x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new rr0(8, this, vVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f32101x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f32101x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f32091w3 = (TextureView) vVar.f895c;
                if (org.telegram.ui.Components.fh0.x(false, photoViewer18.f32107y, null, vVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.fh0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    yt0 yt0Var = photoViewer18.f32110y2;
                    if (yt0Var != null) {
                        yt0Var.removeView(photoViewer18.B2);
                        photoViewer18.f32110y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f32091w3);
                    photoViewer18.x0(true);
                    photoViewer18.f32091w3.setVisibility(0);
                    return;
                }
                photoViewer18.f32091w3.setVisibility(4);
                yt0 yt0Var2 = photoViewer18.f32110y2;
                if (yt0Var2 != null) {
                    yt0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f32110y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
