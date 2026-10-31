package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class iq0 implements Runnable {
    public final int f38330a;
    public final PhotoViewer f38331b;

    public iq0(PhotoViewer photoViewer, int i10) {
        this.f38330a = i10;
        this.f38331b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        mr0 mr0Var;
        switch (this.f38330a) {
            case 0:
                PhotoViewer photoViewer3 = this.f38331b;
                if (photoViewer3.f33534l3 && photoViewer3.P3 && !org.telegram.messenger.w0.f19032x) {
                    org.telegram.ui.ActionBar.t0 t0Var = this.f38331b.f33557o0;
                    if (t0Var == null || !t0Var.x()) {
                        org.telegram.ui.ActionBar.t0 t0Var2 = this.f38331b.f33566p0;
                        if (t0Var2 == null || !t0Var2.x()) {
                            fr0 fr0Var = this.f38331b.T1;
                            if (fr0Var == null || fr0Var.getScrollY() == 0) {
                                id idVar = this.f38331b.X0;
                                if (idVar == null || idVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f33431b9;
                                    PhotoViewer photoViewer5 = this.f38331b;
                                    if (photoViewer4 != photoViewer5) {
                                        photoViewer5.m3(false, true);
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
                PhotoViewer photoViewer6 = this.f38331b;
                if (photoViewer6.F2 != null || ((mr0Var = photoViewer6.f33479f0) != null && mr0Var.f31243y)) {
                    if (photoViewer6.f33584r1) {
                        if (!photoViewer6.S7.f26002r) {
                            float q12 = ((float) photoViewer6.q1()) / ((float) this.f38331b.C1());
                            PhotoViewer photoViewer7 = this.f38331b;
                            if (!photoViewer7.B8 && (photoViewer7.f33615u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (q12 >= this.f38331b.S7.getRightProgress()) {
                                    gq0 gq0Var = this.f38331b.S7;
                                    gq0Var.setProgress(gq0Var.getLeftProgress());
                                    this.f38331b.F2.p0((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f38331b.C1())));
                                    PhotoViewer photoViewer8 = this.f38331b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.v0();
                                    PhotoViewer photoViewer9 = this.f38331b;
                                    if (!photoViewer9.f33582r && photoViewer9.f33454c2 != 1 && photoViewer9.f33615u4 == 0 && photoViewer9.f33563o6 <= 0) {
                                        photoViewer9.k2();
                                    } else {
                                        photoViewer9.m2();
                                    }
                                    this.f38331b.f33470e0.invalidate();
                                } else {
                                    this.f38331b.S7.setProgress(q12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f38331b;
                                if (photoViewer10.f33454c2 != 1) {
                                    photoViewer10.S7.setProgress(q12);
                                }
                            }
                            this.f38331b.F3();
                        }
                    } else {
                        float q13 = ((float) photoViewer6.q1()) / ((float) this.f38331b.C1());
                        if (this.f38331b.f33501h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f38331b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f38331b;
                                mr0 mr0Var2 = photoViewer11.f33479f0;
                                if (mr0Var2 != null && mr0Var2.f31243y) {
                                    f7 = mr0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f38331b;
                                    float f10 = photoViewer12.f33435a3;
                                    if (f10 == 0.0f) {
                                        f10 = q13;
                                    }
                                    f7 = G.t(photoViewer12.f33457c5[0], f10);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f38331b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f38331b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (q13 >= this.f38331b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f38331b;
                                photoViewer14.H2 = false;
                                photoViewer14.k2();
                                this.f38331b.f33577q3.h(false, 0.0f);
                                this.f38331b.w2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f38331b.C1())));
                                this.f38331b.f33470e0.invalidate();
                            } else {
                                float leftProgress = q13 - this.f38331b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                q13 = leftProgress / (this.f38331b.S7.getRightProgress() - this.f38331b.S7.getLeftProgress());
                                if (q13 > 1.0f) {
                                    q13 = 1.0f;
                                }
                                this.f38331b.f33577q3.h(false, q13);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f38331b;
                            if (photoViewer15.f33435a3 == 0.0f) {
                                org.telegram.ui.Cells.j1 j1Var = photoViewer15.f33436a4;
                                if (j1Var.rewindCount == 0 || (!j1Var.rewindByBackSeek && !photoViewer15.f33456c4.rewindByBackSeek)) {
                                    photoViewer15.f33577q3.h(false, q13);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f38331b.f33577q3.f(f7);
                                org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.f27345p0;
                                if (f7 > jf0Var.f27347a0) {
                                    jf0Var.f27347a0 = f7;
                                    ih.c cVar = jf0Var.f27349b0;
                                    if (cVar != null) {
                                        cVar.invalidate();
                                    }
                                }
                            }
                        }
                        this.f38331b.f33586r3.invalidate();
                        if (this.f38331b.f33445b3 != null && q13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f38331b;
                            if (elapsedRealtime2 - photoViewer16.f33464d3 >= 1000) {
                                String str = photoViewer16.f33445b3;
                                photoViewer16.f33464d3 = SystemClock.elapsedRealtime();
                                org.telegram.messenger.jj jjVar = this.f38331b.T4;
                                if (jjVar != null) {
                                    jjVar.f16325g3 = Float.valueOf(q13);
                                }
                                Utilities.e.c(new org.telegram.messenger.ue(str, 1, q13));
                            }
                        }
                        this.f38331b.F3();
                    }
                }
                zr0 zr0Var = this.f38331b.E2;
                if (zr0Var != null) {
                    zr0.a(zr0Var);
                }
                PhotoViewer photoViewer17 = this.f38331b;
                if (photoViewer17.P3) {
                    org.telegram.messenger.i0.h3(photoViewer17.f33500h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f38331b;
                if (org.telegram.ui.Components.jf0.f27345p0.P) {
                    org.telegram.ui.Components.jf0.b(false);
                    org.telegram.messenger.i0.h3(this, 250L);
                    return;
                }
                photoViewer18.L3 = false;
                Bitmap bitmap = photoViewer18.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.C3 = null;
                }
                photoViewer18.F3 = true;
                Activity activity = photoViewer18.D;
                fg.i iVar = new fg.i(activity, 26);
                ImageReceiver imageReceiver = new ImageReceiver(iVar);
                iVar.f7077b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                iVar.f7078c = textureView;
                iVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f33643x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f33643x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f33643x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.v0(photoViewer18.C3);
                            }
                        } else {
                            int width = photoViewer18.C2.getWidth();
                            int height = photoViewer18.C2.getHeight();
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap b10 = org.telegram.messenger.js.b(width, height);
                            photoViewer18.C3 = b10;
                            org.telegram.messenger.i0.A0(photoViewer18.C2, b10, new uf0(27, this, iVar));
                        }
                    } else {
                        int width2 = photoViewer18.B2.getWidth();
                        int height2 = photoViewer18.B2.getHeight();
                        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                        Bitmap b11 = org.telegram.messenger.js.b(width2, height2);
                        photoViewer18.C3 = b11;
                        photoViewer18.B2.getBitmap(b11);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f33643x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f33643x3.setImageBitmap(photoViewer18.C3);
                            }
                            imageReceiver.v0(photoViewer18.C3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.C3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.C3 = null;
                    }
                    org.telegram.messenger.f8.g(th2, true);
                }
                photoViewer18.J3 = true;
                photoViewer18.f33633w3 = (TextureView) iVar.f7078c;
                if (org.telegram.ui.Components.jf0.x(false, photoViewer18.D, null, iVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.jf0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    org.telegram.ui.Components.af0 af0Var = photoViewer18.f33652y2;
                    if (af0Var != null) {
                        af0Var.removeView(photoViewer18.B2);
                        photoViewer18.f33652y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.z0(null);
                    photoViewer18.F2.A0(null);
                    photoViewer18.F2.h0();
                    photoViewer18.F2.A0(photoViewer18.f33633w3);
                    photoViewer18.y0(true);
                    photoViewer18.f33633w3.setVisibility(0);
                    return;
                }
                photoViewer18.f33633w3.setVisibility(4);
                org.telegram.ui.Components.af0 af0Var2 = photoViewer18.f33652y2;
                if (af0Var2 != null) {
                    af0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f33652y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
