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
    public final int f32175a;
    public final PhotoViewer f32176b;

    public at0(PhotoViewer photoViewer, int i10) {
        this.f32175a = i10;
        this.f32176b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        iu0 iu0Var;
        switch (this.f32175a) {
            case 0:
                PhotoViewer photoViewer = this.f32176b;
                if (photoViewer.f31305l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.v0 v0Var = this.f32176b.f31328o0;
                    if (v0Var == null || !v0Var.t()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32176b.f31337p0;
                        if (v0Var2 == null || !v0Var2.t()) {
                            bu0 bu0Var = this.f32176b.T1;
                            if (bu0Var == null || bu0Var.getScrollY() == 0) {
                                kd kdVar = this.f32176b.X0;
                                if (kdVar == null || kdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f31203b9;
                                    PhotoViewer photoViewer3 = this.f32176b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.i3(false, true);
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
                PhotoViewer photoViewer4 = this.f32176b;
                if (photoViewer4.F2 != null || ((iu0Var = photoViewer4.f31251f0) != null && iu0Var.f22991x)) {
                    if (photoViewer4.f31355r1) {
                        if (!photoViewer4.S7.f24731r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f32176b.A1());
                            PhotoViewer photoViewer5 = this.f32176b;
                            if (!photoViewer5.B8 && (photoViewer5.f31386u4 != 0 || photoViewer5.R7.getVisibility() == 0)) {
                                if (o12 >= this.f32176b.S7.getRightProgress()) {
                                    ys0 ys0Var = this.f32176b.S7;
                                    ys0Var.setProgress(ys0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f32176b;
                                    photoViewer6.F2.K((int) (photoViewer6.S7.getLeftProgress() * ((float) this.f32176b.A1())));
                                    PhotoViewer photoViewer7 = this.f32176b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f32176b;
                                    if (!photoViewer8.f31353r && photoViewer8.f31226c2 != 1 && photoViewer8.f31386u4 == 0 && photoViewer8.f31334o6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f32176b.f31242e0.invalidate();
                                } else {
                                    this.f32176b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f32176b;
                                if (photoViewer9.f31226c2 != 1) {
                                    photoViewer9.S7.setProgress(o12);
                                }
                            }
                            this.f32176b.B3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f32176b.A1());
                        if (this.f32176b.f31273h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f32176b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f32176b;
                                iu0 iu0Var2 = photoViewer10.f31251f0;
                                if (iu0Var2 != null && iu0Var2.f22991x) {
                                    f7 = iu0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f32176b;
                                    float f10 = photoViewer11.f31207a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f31229c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f32176b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f32176b;
                        if (!photoViewer12.B8 && photoViewer12.R7.getVisibility() == 0) {
                            if (o13 >= this.f32176b.S7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f32176b;
                                photoViewer13.H2 = false;
                                photoViewer13.g2();
                                this.f32176b.f31348q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f32176b;
                                photoViewer14.s2((int) (photoViewer14.S7.getLeftProgress() * ((float) this.f32176b.A1())));
                                this.f32176b.f31242e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f32176b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f32176b.S7.getRightProgress() - this.f32176b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f32176b.f31348q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f32176b;
                            if (photoViewer15.f31207a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f31208a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f31228c4.rewindByBackSeek)) {
                                    photoViewer15.f31348q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f32176b.f31348q3.f(f7);
                                org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f27960p0;
                                if (f7 > rg0Var.f27962a0) {
                                    rg0Var.f27962a0 = f7;
                                    ai.n4 n4Var = rg0Var.f27964b0;
                                    if (n4Var != null) {
                                        n4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f32176b.f31357r3.invalidate();
                        if (this.f32176b.f31217b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f32176b;
                            if (elapsedRealtime2 - photoViewer16.f31236d3 >= 1000) {
                                String str = photoViewer16.f31217b3;
                                photoViewer16.f31236d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f32176b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, o13, 4));
                            }
                        }
                        this.f32176b.B3();
                    }
                }
                uu0 uu0Var = this.f32176b.E2;
                if (uu0Var != null) {
                    uu0.a(uu0Var);
                }
                PhotoViewer photoViewer17 = this.f32176b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f31272h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f32176b;
                if (org.telegram.ui.Components.rg0.f27960p0.P) {
                    org.telegram.ui.Components.rg0.j(false);
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
                Activity activity = photoViewer18.f31420y;
                ci.n6 n6Var = new ci.n6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(n6Var);
                n6Var.f5073b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                n6Var.f5074c = textureView;
                n6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f31414x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f31414x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f31414x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new fj0(24, this, n6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f31414x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f31414x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f31404w3 = (TextureView) n6Var.f5074c;
                if (org.telegram.ui.Components.rg0.x(false, photoViewer18.f31420y, null, n6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.rg0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    st0 st0Var = photoViewer18.f31423y2;
                    if (st0Var != null) {
                        st0Var.removeView(photoViewer18.B2);
                        photoViewer18.f31423y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f31404w3);
                    photoViewer18.x0(true);
                    photoViewer18.f31404w3.setVisibility(0);
                    return;
                }
                photoViewer18.f31404w3.setVisibility(4);
                st0 st0Var2 = photoViewer18.f31423y2;
                if (st0Var2 != null) {
                    st0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f31423y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
