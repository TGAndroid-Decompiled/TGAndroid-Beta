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
public final class is0 implements Runnable {
    public final int f38383a;
    public final PhotoViewer f38384b;

    public is0(PhotoViewer photoViewer, int i10) {
        this.f38383a = i10;
        this.f38384b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        qt0 qt0Var;
        switch (this.f38383a) {
            case 0:
                PhotoViewer photoViewer3 = this.f38384b;
                if (photoViewer3.f33646l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.u0 u0Var = this.f38384b.f33669o0;
                    if (u0Var == null || !u0Var.t()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.f38384b.f33678p0;
                        if (u0Var2 == null || !u0Var2.t()) {
                            jt0 jt0Var = this.f38384b.T1;
                            if (jt0Var == null || jt0Var.getScrollY() == 0) {
                                kd kdVar = this.f38384b.X0;
                                if (kdVar == null || kdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f33543b9;
                                    PhotoViewer photoViewer5 = this.f38384b;
                                    if (photoViewer4 != photoViewer5) {
                                        photoViewer5.l3(false, true);
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
                PhotoViewer photoViewer6 = this.f38384b;
                if (photoViewer6.F2 != null || ((qt0Var = photoViewer6.f33591f0) != null && qt0Var.f29277x)) {
                    if (photoViewer6.f33696r1) {
                        if (!photoViewer6.S7.f31059r) {
                            float p12 = ((float) photoViewer6.p1()) / ((float) this.f38384b.B1());
                            PhotoViewer photoViewer7 = this.f38384b;
                            if (!photoViewer7.B8 && (photoViewer7.f33727u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (p12 >= this.f38384b.S7.getRightProgress()) {
                                    gs0 gs0Var = this.f38384b.S7;
                                    gs0Var.setProgress(gs0Var.getLeftProgress());
                                    this.f38384b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f38384b.B1())));
                                    PhotoViewer photoViewer8 = this.f38384b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.v0();
                                    PhotoViewer photoViewer9 = this.f38384b;
                                    if (!photoViewer9.f33694r && photoViewer9.f33566c2 != 1 && photoViewer9.f33727u4 == 0 && photoViewer9.f33675o6 <= 0) {
                                        photoViewer9.j2();
                                    } else {
                                        photoViewer9.l2();
                                    }
                                    this.f38384b.f33582e0.invalidate();
                                } else {
                                    this.f38384b.S7.setProgress(p12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f38384b;
                                if (photoViewer10.f33566c2 != 1) {
                                    photoViewer10.S7.setProgress(p12);
                                }
                            }
                            this.f38384b.E3();
                        }
                    } else {
                        float p13 = ((float) photoViewer6.p1()) / ((float) this.f38384b.B1());
                        if (this.f38384b.f33613h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f38384b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f38384b;
                                qt0 qt0Var2 = photoViewer11.f33591f0;
                                if (qt0Var2 != null && qt0Var2.f29277x) {
                                    f7 = qt0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f38384b;
                                    float f10 = photoViewer12.f33547a3;
                                    if (f10 == 0.0f) {
                                        f10 = p13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f33569c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f38384b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f38384b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (p13 >= this.f38384b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f38384b;
                                photoViewer14.H2 = false;
                                photoViewer14.j2();
                                this.f38384b.f33689q3.h(0.0f, false);
                                this.f38384b.v2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f38384b.B1())));
                                this.f38384b.f33582e0.invalidate();
                            } else {
                                float leftProgress = p13 - this.f38384b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                p13 = leftProgress / (this.f38384b.S7.getRightProgress() - this.f38384b.S7.getLeftProgress());
                                if (p13 > 1.0f) {
                                    p13 = 1.0f;
                                }
                                this.f38384b.f33689q3.h(p13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f38384b;
                            if (photoViewer15.f33547a3 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.f33548a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.f33568c4.rewindByBackSeek)) {
                                    photoViewer15.f33689q3.h(p13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f38384b.f33689q3.f(f7);
                                org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f25313p0;
                                if (f7 > ch0Var.f25315a0) {
                                    ch0Var.f25315a0 = f7;
                                    ci.h3 h3Var = ch0Var.f25317b0;
                                    if (h3Var != null) {
                                        h3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f38384b.f33698r3.invalidate();
                        if (this.f38384b.f33557b3 != null && p13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f38384b;
                            if (elapsedRealtime2 - photoViewer16.f33576d3 >= 1000) {
                                String str = photoViewer16.f33557b3;
                                photoViewer16.f33576d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f38384b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(p13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, p13, 4));
                            }
                        }
                        this.f38384b.E3();
                    }
                }
                cu0 cu0Var = this.f38384b.E2;
                if (cu0Var != null) {
                    cu0.a(cu0Var);
                }
                PhotoViewer photoViewer17 = this.f38384b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f33612h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f38384b;
                if (org.telegram.ui.Components.ch0.f25313p0.P) {
                    org.telegram.ui.Components.ch0.j(false);
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
                Activity activity = photoViewer18.f33761y;
                ah.v vVar = new ah.v(activity, 25);
                ImageReceiver imageReceiver = new ImageReceiver(vVar);
                vVar.f895b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                vVar.f896c = textureView;
                vVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f33755x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f33755x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f33755x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new ah0(26, this, vVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f33755x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f33755x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f33745w3 = (TextureView) vVar.f896c;
                if (org.telegram.ui.Components.ch0.x(false, photoViewer18.f33761y, null, vVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.ch0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    at0 at0Var = photoViewer18.f33764y2;
                    if (at0Var != null) {
                        at0Var.removeView(photoViewer18.B2);
                        photoViewer18.f33764y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f33745w3);
                    photoViewer18.y0(true);
                    photoViewer18.f33745w3.setVisibility(0);
                    return;
                }
                photoViewer18.f33745w3.setVisibility(4);
                at0 at0Var2 = photoViewer18.f33764y2;
                if (at0Var2 != null) {
                    at0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f33764y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
