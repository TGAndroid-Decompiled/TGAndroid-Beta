package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class po0 implements Runnable {
    public final int f48620a;
    public final PhotoViewer f48621b;

    public po0(PhotoViewer photoViewer, int i3) {
        this.f48620a = i3;
        this.f48621b = photoViewer;
    }

    @Override
    public final void run() {
        float f10;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        tp0 tp0Var;
        switch (this.f48620a) {
            case 0:
                PhotoViewer photoViewer3 = this.f48621b;
                if (photoViewer3.f41480m3 && photoViewer3.Q3 && !org.telegram.messenger.t0.f25465x) {
                    org.telegram.ui.ActionBar.q0 q0Var = this.f48621b.f41504p0;
                    if (q0Var == null || !q0Var.x()) {
                        org.telegram.ui.ActionBar.q0 q0Var2 = this.f48621b.f41513q0;
                        if (q0Var2 == null || !q0Var2.x()) {
                            mp0 mp0Var = this.f48621b.U1;
                            if (mp0Var == null || mp0Var.getScrollY() == 0) {
                                yc ycVar = this.f48621b.Y0;
                                if (ycVar == null || ycVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f41370c9;
                                    PhotoViewer photoViewer5 = this.f48621b;
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
                PhotoViewer photoViewer6 = this.f48621b;
                if (photoViewer6.G2 != null || ((tp0Var = photoViewer6.f41429g0) != null && tp0Var.f38729y)) {
                    if (photoViewer6.f41533s1) {
                        if (!photoViewer6.T7.f39908r) {
                            float q12 = ((float) photoViewer6.q1()) / ((float) this.f48621b.C1());
                            PhotoViewer photoViewer7 = this.f48621b;
                            if (!photoViewer7.C8 && (photoViewer7.f41562v4 != 0 || photoViewer7.S7.getVisibility() == 0)) {
                                if (q12 >= this.f48621b.T7.getRightProgress()) {
                                    no0 no0Var = this.f48621b.T7;
                                    no0Var.setProgress(no0Var.getLeftProgress());
                                    this.f48621b.G2.p0((int) (photoViewer2.T7.getLeftProgress() * ((float) this.f48621b.C1())));
                                    PhotoViewer photoViewer8 = this.f48621b;
                                    photoViewer8.I2 = false;
                                    photoViewer8.v0();
                                    PhotoViewer photoViewer9 = this.f48621b;
                                    if (!photoViewer9.f41522r && photoViewer9.f41402d2 != 1 && photoViewer9.f41562v4 == 0 && photoViewer9.f41510p6 <= 0) {
                                        photoViewer9.k2();
                                    } else {
                                        photoViewer9.m2();
                                    }
                                    this.f48621b.f41420f0.invalidate();
                                } else {
                                    this.f48621b.T7.setProgress(q12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f48621b;
                                if (photoViewer10.f41402d2 != 1) {
                                    photoViewer10.T7.setProgress(q12);
                                }
                            }
                            this.f48621b.F3();
                        }
                    } else {
                        float q13 = ((float) photoViewer6.q1()) / ((float) this.f48621b.C1());
                        if (this.f48621b.f41449i5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f48621b.T3) >= 500) {
                                PhotoViewer photoViewer11 = this.f48621b;
                                tp0 tp0Var2 = photoViewer11.f41429g0;
                                if (tp0Var2 != null && tp0Var2.f38729y) {
                                    f10 = tp0Var2.getBufferedPosition();
                                } else if (photoViewer11.R3) {
                                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(photoViewer11.U);
                                    PhotoViewer photoViewer12 = this.f48621b;
                                    float f11 = photoViewer12.f41385b3;
                                    if (f11 == 0.0f) {
                                        f11 = q13;
                                    }
                                    f10 = G.t(photoViewer12.f41405d5[0], f11);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.f48621b.T3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f48621b;
                        if (!photoViewer13.C8 && photoViewer13.S7.getVisibility() == 0) {
                            if (q13 >= this.f48621b.T7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f48621b;
                                photoViewer14.I2 = false;
                                photoViewer14.k2();
                                this.f48621b.f41526r3.h(false, 0.0f);
                                this.f48621b.w2((int) (photoViewer.T7.getLeftProgress() * ((float) this.f48621b.C1())));
                                this.f48621b.f41420f0.invalidate();
                            } else {
                                float leftProgress = q13 - this.f48621b.T7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                q13 = leftProgress / (this.f48621b.T7.getRightProgress() - this.f48621b.T7.getLeftProgress());
                                if (q13 > 1.0f) {
                                    q13 = 1.0f;
                                }
                                this.f48621b.f41526r3.h(false, q13);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f48621b;
                            if (photoViewer15.f41385b3 == 0.0f) {
                                org.telegram.ui.Cells.j1 j1Var = photoViewer15.f41386b4;
                                if (j1Var.rewindCount == 0 || (!j1Var.rewindByBackSeek && !photoViewer15.f41404d4.rewindByBackSeek)) {
                                    photoViewer15.f41526r3.h(false, q13);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.f48621b.f41526r3.f(f10);
                                org.telegram.ui.Components.ie0 ie0Var = org.telegram.ui.Components.ie0.f34683q0;
                                if (f10 > ie0Var.f34687b0) {
                                    ie0Var.f34687b0 = f10;
                                    ei.e3 e3Var = ie0Var.f34689c0;
                                    if (e3Var != null) {
                                        e3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f48621b.f41535s3.invalidate();
                        if (this.f48621b.f41394c3 != null && q13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f48621b;
                            if (elapsedRealtime2 - photoViewer16.f41413e3 >= 1000) {
                                String str = photoViewer16.f41394c3;
                                photoViewer16.f41413e3 = SystemClock.elapsedRealtime();
                                org.telegram.messenger.zi ziVar = this.f48621b.U4;
                                if (ziVar != null) {
                                    ziVar.f26867j3 = Float.valueOf(q13);
                                }
                                Utilities.f21387e.c(new org.telegram.messenger.oe(str, 1, q13));
                            }
                        }
                        this.f48621b.F3();
                    }
                }
                fq0 fq0Var = this.f48621b.F2;
                if (fq0Var != null) {
                    fq0.a(fq0Var);
                }
                PhotoViewer photoViewer17 = this.f48621b;
                if (photoViewer17.Q3) {
                    org.telegram.messenger.g0.i3(photoViewer17.f41448i4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f48621b;
                if (org.telegram.ui.Components.ie0.f34683q0.Q) {
                    org.telegram.ui.Components.ie0.b(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    return;
                }
                photoViewer18.M3 = false;
                Bitmap bitmap = photoViewer18.D3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.D3 = null;
                }
                photoViewer18.G3 = true;
                Activity activity = photoViewer18.E;
                ai.c0 c0Var = new ai.c0(29, (Context) activity, false);
                ImageReceiver imageReceiver = new ImageReceiver(c0Var);
                c0Var.f536b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                c0Var.f537c = textureView;
                c0Var.addView(textureView);
                try {
                    if (photoViewer18.E2) {
                        Drawable drawable = photoViewer18.f41591y3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.D3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f41591y3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f41591y3.setImageBitmap(photoViewer18.D3);
                                }
                                imageReceiver.v0(photoViewer18.D3);
                            }
                        } else {
                            int width = photoViewer18.D2.getWidth();
                            int height = photoViewer18.D2.getHeight();
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap c2 = org.telegram.messenger.sr.c(width, height);
                            photoViewer18.D3 = c2;
                            org.telegram.messenger.g0.A0(photoViewer18.D2, c2, new hk0(9, this, c0Var));
                        }
                    } else {
                        int width2 = photoViewer18.C2.getWidth();
                        int height2 = photoViewer18.C2.getHeight();
                        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.sr.c(width2, height2);
                        photoViewer18.D3 = c10;
                        photoViewer18.C2.getBitmap(c10);
                        if (photoViewer18.D3 != null) {
                            ImageView imageView2 = photoViewer18.f41591y3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f41591y3.setImageBitmap(photoViewer18.D3);
                            }
                            imageReceiver.v0(photoViewer18.D3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.D3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.D3 = null;
                    }
                    org.telegram.messenger.a8.g(th2, true);
                }
                photoViewer18.K3 = true;
                photoViewer18.f41581x3 = (TextureView) c0Var.f537c;
                if (org.telegram.ui.Components.ie0.x(false, photoViewer18.E, null, c0Var, photoViewer18.V, photoViewer18.W, photoViewer18.L3)) {
                    org.telegram.ui.Components.ie0.w(photoViewer18);
                }
                photoViewer18.L3 = true;
                if (photoViewer18.E2) {
                    org.telegram.ui.Components.zd0 zd0Var = photoViewer18.f41599z2;
                    if (zd0Var != null) {
                        zd0Var.removeView(photoViewer18.C2);
                        photoViewer18.f41599z2.removeView(photoViewer18.D2);
                    }
                    photoViewer18.G2.z0(null);
                    photoViewer18.G2.A0(null);
                    photoViewer18.G2.h0();
                    photoViewer18.G2.A0(photoViewer18.f41581x3);
                    photoViewer18.y0(true);
                    photoViewer18.f41581x3.setVisibility(0);
                    return;
                }
                photoViewer18.f41581x3.setVisibility(4);
                org.telegram.ui.Components.zd0 zd0Var2 = photoViewer18.f41599z2;
                if (zd0Var2 != null) {
                    zd0Var2.removeView(photoViewer18.C2);
                    photoViewer18.f41599z2.removeView(photoViewer18.D2);
                    return;
                }
                return;
        }
    }
}
