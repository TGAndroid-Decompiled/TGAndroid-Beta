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
public final class ns0 implements Runnable {
    public final int f41997a;
    public final PhotoViewer f41998b;

    public ns0(PhotoViewer photoViewer, int i10) {
        this.f41997a = i10;
        this.f41998b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        vt0 vt0Var;
        switch (this.f41997a) {
            case 0:
                PhotoViewer photoViewer3 = this.f41998b;
                if (photoViewer3.f35710l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f41998b.f35733o0;
                    if (w0Var == null || !w0Var.x()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f41998b.f35742p0;
                        if (w0Var2 == null || !w0Var2.x()) {
                            ot0 ot0Var = this.f41998b.T1;
                            if (ot0Var == null || ot0Var.getScrollY() == 0) {
                                ld ldVar = this.f41998b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f35607b9;
                                    PhotoViewer photoViewer5 = this.f41998b;
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
                PhotoViewer photoViewer6 = this.f41998b;
                if (photoViewer6.F2 != null || ((vt0Var = photoViewer6.f35656f0) != null && vt0Var.f30582x)) {
                    if (photoViewer6.f35761r1) {
                        if (!photoViewer6.S7.f27452r) {
                            float p12 = ((float) photoViewer6.p1()) / ((float) this.f41998b.B1());
                            PhotoViewer photoViewer7 = this.f41998b;
                            if (!photoViewer7.B8 && (photoViewer7.f35791u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (p12 >= this.f41998b.S7.getRightProgress()) {
                                    ls0 ls0Var = this.f41998b.S7;
                                    ls0Var.setProgress(ls0Var.getLeftProgress());
                                    this.f41998b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f41998b.B1())));
                                    PhotoViewer photoViewer8 = this.f41998b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.v0();
                                    PhotoViewer photoViewer9 = this.f41998b;
                                    if (!photoViewer9.f35759r && photoViewer9.f35630c2 != 1 && photoViewer9.f35791u4 == 0 && photoViewer9.f35739o6 <= 0) {
                                        photoViewer9.j2();
                                    } else {
                                        photoViewer9.l2();
                                    }
                                    this.f41998b.f35646e0.invalidate();
                                } else {
                                    this.f41998b.S7.setProgress(p12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f41998b;
                                if (photoViewer10.f35630c2 != 1) {
                                    photoViewer10.S7.setProgress(p12);
                                }
                            }
                            this.f41998b.E3();
                        }
                    } else {
                        float p13 = ((float) photoViewer6.p1()) / ((float) this.f41998b.B1());
                        if (this.f41998b.f35677h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f41998b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f41998b;
                                vt0 vt0Var2 = photoViewer11.f35656f0;
                                if (vt0Var2 != null && vt0Var2.f30582x) {
                                    f7 = vt0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f41998b;
                                    float f10 = photoViewer12.f35611a3;
                                    if (f10 == 0.0f) {
                                        f10 = p13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f35633c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f41998b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f41998b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (p13 >= this.f41998b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f41998b;
                                photoViewer14.H2 = false;
                                photoViewer14.j2();
                                this.f41998b.f35754q3.h(0.0f, false);
                                this.f41998b.v2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f41998b.B1())));
                                this.f41998b.f35646e0.invalidate();
                            } else {
                                float leftProgress = p13 - this.f41998b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                p13 = leftProgress / (this.f41998b.S7.getRightProgress() - this.f41998b.S7.getLeftProgress());
                                if (p13 > 1.0f) {
                                    p13 = 1.0f;
                                }
                                this.f41998b.f35754q3.h(p13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f41998b;
                            if (photoViewer15.f35611a3 == 0.0f) {
                                org.telegram.ui.Cells.f1 f1Var = photoViewer15.f35612a4;
                                if (f1Var.rewindCount == 0 || (!f1Var.rewindByBackSeek && !photoViewer15.f35632c4.rewindByBackSeek)) {
                                    photoViewer15.f35754q3.h(p13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f41998b.f35754q3.f(f7);
                                org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f27159p0;
                                if (f7 > ch0Var.f27161a0) {
                                    ch0Var.f27161a0 = f7;
                                    di.h3 h3Var = ch0Var.f27163b0;
                                    if (h3Var != null) {
                                        h3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f41998b.f35763r3.invalidate();
                        if (this.f41998b.f35621b3 != null && p13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f41998b;
                            if (elapsedRealtime2 - photoViewer16.f35640d3 >= 1000) {
                                String str = photoViewer16.f35621b3;
                                photoViewer16.f35640d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f41998b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(p13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, p13, 4));
                            }
                        }
                        this.f41998b.E3();
                    }
                }
                hu0 hu0Var = this.f41998b.E2;
                if (hu0Var != null) {
                    hu0.a(hu0Var);
                }
                PhotoViewer photoViewer17 = this.f41998b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f35676h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f41998b;
                if (org.telegram.ui.Components.ch0.f27159p0.P) {
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
                Activity activity = photoViewer18.f35825y;
                bh.p pVar = new bh.p(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(pVar);
                pVar.f4101b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                pVar.f4102c = textureView;
                pVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f35819x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f35819x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f35819x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new yl0(15, this, pVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f35819x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f35819x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f35809w3 = (TextureView) pVar.f4102c;
                if (org.telegram.ui.Components.ch0.x(false, photoViewer18.f35825y, null, pVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.ch0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    ft0 ft0Var = photoViewer18.f35828y2;
                    if (ft0Var != null) {
                        ft0Var.removeView(photoViewer18.B2);
                        photoViewer18.f35828y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f35809w3);
                    photoViewer18.y0(true);
                    photoViewer18.f35809w3.setVisibility(0);
                    return;
                }
                photoViewer18.f35809w3.setVisibility(4);
                ft0 ft0Var2 = photoViewer18.f35828y2;
                if (ft0Var2 != null) {
                    ft0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f35828y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
