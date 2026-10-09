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
    public final int f36008a;
    public final PhotoViewer f36009b;

    public at0(PhotoViewer photoViewer, int i10) {
        this.f36008a = i10;
        this.f36009b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        ju0 ju0Var;
        switch (this.f36008a) {
            case 0:
                PhotoViewer photoViewer3 = this.f36009b;
                if (photoViewer3.f33967l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.v0 v0Var = this.f36009b.f33990o0;
                    if (v0Var == null || !v0Var.t()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.f36009b.f33999p0;
                        if (v0Var2 == null || !v0Var2.t()) {
                            cu0 cu0Var = this.f36009b.T1;
                            if (cu0Var == null || cu0Var.getScrollY() == 0) {
                                kd kdVar = this.f36009b.X0;
                                if (kdVar == null || kdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f33864b9;
                                    PhotoViewer photoViewer5 = this.f36009b;
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
                PhotoViewer photoViewer6 = this.f36009b;
                if (photoViewer6.F2 != null || ((ju0Var = photoViewer6.f33913f0) != null && ju0Var.f30791x)) {
                    if (photoViewer6.f34017r1) {
                        if (!photoViewer6.S7.f32579r) {
                            float o12 = ((float) photoViewer6.o1()) / ((float) this.f36009b.A1());
                            PhotoViewer photoViewer7 = this.f36009b;
                            if (!photoViewer7.B8 && (photoViewer7.f34048u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (o12 >= this.f36009b.S7.getRightProgress()) {
                                    ys0 ys0Var = this.f36009b.S7;
                                    ys0Var.setProgress(ys0Var.getLeftProgress());
                                    this.f36009b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f36009b.A1())));
                                    PhotoViewer photoViewer8 = this.f36009b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.u0();
                                    PhotoViewer photoViewer9 = this.f36009b;
                                    if (!photoViewer9.f34015r && photoViewer9.f33887c2 != 1 && photoViewer9.f34048u4 == 0 && photoViewer9.f33996o6 <= 0) {
                                        photoViewer9.h2();
                                    } else {
                                        photoViewer9.j2();
                                    }
                                    this.f36009b.f33904e0.invalidate();
                                } else {
                                    this.f36009b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f36009b;
                                if (photoViewer10.f33887c2 != 1) {
                                    photoViewer10.S7.setProgress(o12);
                                }
                            }
                            this.f36009b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer6.o1()) / ((float) this.f36009b.A1());
                        if (this.f36009b.f33935h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f36009b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f36009b;
                                ju0 ju0Var2 = photoViewer11.f33913f0;
                                if (ju0Var2 != null && ju0Var2.f30791x) {
                                    f7 = ju0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f36009b;
                                    float f10 = photoViewer12.f33868a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f33890c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f36009b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f36009b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (o13 >= this.f36009b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f36009b;
                                photoViewer14.H2 = false;
                                photoViewer14.h2();
                                this.f36009b.f34010q3.h(0.0f, false);
                                this.f36009b.t2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f36009b.A1())));
                                this.f36009b.f33904e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f36009b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f36009b.S7.getRightProgress() - this.f36009b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f36009b.f34010q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f36009b;
                            if (photoViewer15.f33868a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f33869a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f33889c4.rewindByBackSeek)) {
                                    photoViewer15.f34010q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f36009b.f34010q3.f(f7);
                                org.telegram.ui.Components.gh0 gh0Var = org.telegram.ui.Components.gh0.f26700p0;
                                if (f7 > gh0Var.f26702a0) {
                                    gh0Var.f26702a0 = f7;
                                    ai.o4 o4Var = gh0Var.f26704b0;
                                    if (o4Var != null) {
                                        o4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f36009b.f34019r3.invalidate();
                        if (this.f36009b.f33878b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f36009b;
                            if (elapsedRealtime2 - photoViewer16.f33897d3 >= 1000) {
                                String str = photoViewer16.f33878b3;
                                photoViewer16.f33897d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f36009b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f36009b.C3();
                    }
                }
                vu0 vu0Var = this.f36009b.E2;
                if (vu0Var != null) {
                    vu0.a(vu0Var);
                }
                PhotoViewer photoViewer17 = this.f36009b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f33934h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f36009b;
                if (org.telegram.ui.Components.gh0.f26700p0.P) {
                    org.telegram.ui.Components.gh0.j(false);
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
                Activity activity = photoViewer18.f34082y;
                ci.m6 m6Var = new ci.m6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(m6Var);
                m6Var.f5600b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                m6Var.f5601c = textureView;
                m6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f34076x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f34076x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f34076x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new rt0(2, this, m6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f34076x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f34076x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f34066w3 = (TextureView) m6Var.f5601c;
                if (org.telegram.ui.Components.gh0.x(false, photoViewer18.f34082y, null, m6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.gh0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    tt0 tt0Var = photoViewer18.f34085y2;
                    if (tt0Var != null) {
                        tt0Var.removeView(photoViewer18.B2);
                        photoViewer18.f34085y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f34066w3);
                    photoViewer18.x0(true);
                    photoViewer18.f34066w3.setVisibility(0);
                    return;
                }
                photoViewer18.f34066w3.setVisibility(4);
                tt0 tt0Var2 = photoViewer18.f34085y2;
                if (tt0Var2 != null) {
                    tt0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f34085y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
