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
public final class gs0 implements Runnable {
    public final int f37404a;
    public final PhotoViewer f37405b;

    public gs0(PhotoViewer photoViewer, int i10) {
        this.f37404a = i10;
        this.f37405b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        ot0 ot0Var;
        switch (this.f37404a) {
            case 0:
                PhotoViewer photoViewer3 = this.f37405b;
                if (photoViewer3.f33336l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.u0 u0Var = this.f37405b.f33359o0;
                    if (u0Var == null || !u0Var.t()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.f37405b.f33368p0;
                        if (u0Var2 == null || !u0Var2.t()) {
                            ht0 ht0Var = this.f37405b.T1;
                            if (ht0Var == null || ht0Var.getScrollY() == 0) {
                                kd kdVar = this.f37405b.X0;
                                if (kdVar == null || kdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f33233b9;
                                    PhotoViewer photoViewer5 = this.f37405b;
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
                PhotoViewer photoViewer6 = this.f37405b;
                if (photoViewer6.F2 != null || ((ot0Var = photoViewer6.f33281f0) != null && ot0Var.f27849x)) {
                    if (photoViewer6.f33386r1) {
                        if (!photoViewer6.S7.f28476r) {
                            float o12 = ((float) photoViewer6.o1()) / ((float) this.f37405b.A1());
                            PhotoViewer photoViewer7 = this.f37405b;
                            if (!photoViewer7.B8 && (photoViewer7.f33417u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (o12 >= this.f37405b.S7.getRightProgress()) {
                                    es0 es0Var = this.f37405b.S7;
                                    es0Var.setProgress(es0Var.getLeftProgress());
                                    this.f37405b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f37405b.A1())));
                                    PhotoViewer photoViewer8 = this.f37405b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.u0();
                                    PhotoViewer photoViewer9 = this.f37405b;
                                    if (!photoViewer9.f33384r && photoViewer9.f33256c2 != 1 && photoViewer9.f33417u4 == 0 && photoViewer9.f33365o6 <= 0) {
                                        photoViewer9.h2();
                                    } else {
                                        photoViewer9.j2();
                                    }
                                    this.f37405b.f33272e0.invalidate();
                                } else {
                                    this.f37405b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f37405b;
                                if (photoViewer10.f33256c2 != 1) {
                                    photoViewer10.S7.setProgress(o12);
                                }
                            }
                            this.f37405b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer6.o1()) / ((float) this.f37405b.A1());
                        if (this.f37405b.f33303h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f37405b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f37405b;
                                ot0 ot0Var2 = photoViewer11.f33281f0;
                                if (ot0Var2 != null && ot0Var2.f27849x) {
                                    f7 = ot0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f37405b;
                                    float f10 = photoViewer12.f33237a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f33259c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f37405b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f37405b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (o13 >= this.f37405b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f37405b;
                                photoViewer14.H2 = false;
                                photoViewer14.h2();
                                this.f37405b.f33379q3.h(0.0f, false);
                                this.f37405b.t2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f37405b.A1())));
                                this.f37405b.f33272e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f37405b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f37405b.S7.getRightProgress() - this.f37405b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f37405b.f33379q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f37405b;
                            if (photoViewer15.f33237a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f33238a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f33258c4.rewindByBackSeek)) {
                                    photoViewer15.f33379q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f37405b.f33379q3.f(f7);
                                org.telegram.ui.Components.zg0 zg0Var = org.telegram.ui.Components.zg0.f32927p0;
                                if (f7 > zg0Var.f32929a0) {
                                    zg0Var.f32929a0 = f7;
                                    ci.i3 i3Var = zg0Var.f32931b0;
                                    if (i3Var != null) {
                                        i3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f37405b.f33388r3.invalidate();
                        if (this.f37405b.f33247b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f37405b;
                            if (elapsedRealtime2 - photoViewer16.f33266d3 >= 1000) {
                                String str = photoViewer16.f33247b3;
                                photoViewer16.f33266d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f37405b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f37405b.C3();
                    }
                }
                au0 au0Var = this.f37405b.E2;
                if (au0Var != null) {
                    au0.a(au0Var);
                }
                PhotoViewer photoViewer17 = this.f37405b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f33302h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f37405b;
                if (org.telegram.ui.Components.zg0.f32927p0.P) {
                    org.telegram.ui.Components.zg0.j(false);
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
                Activity activity = photoViewer18.f33451y;
                ah.v vVar = new ah.v(activity, 26);
                ImageReceiver imageReceiver = new ImageReceiver(vVar);
                vVar.f894b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                vVar.f895c = textureView;
                vVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f33445x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f33445x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f33445x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new xg0(26, this, vVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f33445x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f33445x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f33435w3 = (TextureView) vVar.f895c;
                if (org.telegram.ui.Components.zg0.x(false, photoViewer18.f33451y, null, vVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.zg0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    ys0 ys0Var = photoViewer18.f33454y2;
                    if (ys0Var != null) {
                        ys0Var.removeView(photoViewer18.B2);
                        photoViewer18.f33454y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f33435w3);
                    photoViewer18.x0(true);
                    photoViewer18.f33435w3.setVisibility(0);
                    return;
                }
                photoViewer18.f33435w3.setVisibility(4);
                ys0 ys0Var2 = photoViewer18.f33454y2;
                if (ys0Var2 != null) {
                    ys0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f33454y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
