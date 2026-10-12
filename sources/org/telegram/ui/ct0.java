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
public final class ct0 implements Runnable {
    public final int f36509a;
    public final PhotoViewer f36510b;

    public ct0(PhotoViewer photoViewer, int i10) {
        this.f36509a = i10;
        this.f36510b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        lu0 lu0Var;
        switch (this.f36509a) {
            case 0:
                PhotoViewer photoViewer3 = this.f36510b;
                if (photoViewer3.f33806l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.u0 u0Var = this.f36510b.f33829o0;
                    if (u0Var == null || !u0Var.t()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.f36510b.f33838p0;
                        if (u0Var2 == null || !u0Var2.t()) {
                            eu0 eu0Var = this.f36510b.T1;
                            if (eu0Var == null || eu0Var.getScrollY() == 0) {
                                od odVar = this.f36510b.X0;
                                if (odVar == null || odVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f33703b9;
                                    PhotoViewer photoViewer5 = this.f36510b;
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
                PhotoViewer photoViewer6 = this.f36510b;
                if (photoViewer6.F2 != null || ((lu0Var = photoViewer6.f33752f0) != null && lu0Var.f31513x)) {
                    if (photoViewer6.f33856r1) {
                        if (!photoViewer6.S7.f24881r) {
                            float o12 = ((float) photoViewer6.o1()) / ((float) this.f36510b.A1());
                            PhotoViewer photoViewer7 = this.f36510b;
                            if (!photoViewer7.B8 && (photoViewer7.f33887u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (o12 >= this.f36510b.S7.getRightProgress()) {
                                    at0 at0Var = this.f36510b.S7;
                                    at0Var.setProgress(at0Var.getLeftProgress());
                                    this.f36510b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f36510b.A1())));
                                    PhotoViewer photoViewer8 = this.f36510b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.u0();
                                    PhotoViewer photoViewer9 = this.f36510b;
                                    if (!photoViewer9.f33854r && photoViewer9.f33726c2 != 1 && photoViewer9.f33887u4 == 0 && photoViewer9.f33835o6 <= 0) {
                                        photoViewer9.h2();
                                    } else {
                                        photoViewer9.j2();
                                    }
                                    this.f36510b.f33743e0.invalidate();
                                } else {
                                    this.f36510b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f36510b;
                                if (photoViewer10.f33726c2 != 1) {
                                    photoViewer10.S7.setProgress(o12);
                                }
                            }
                            this.f36510b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer6.o1()) / ((float) this.f36510b.A1());
                        if (this.f36510b.f33774h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f36510b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f36510b;
                                lu0 lu0Var2 = photoViewer11.f33752f0;
                                if (lu0Var2 != null && lu0Var2.f31513x) {
                                    f7 = lu0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f36510b;
                                    float f10 = photoViewer12.f33707a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f33729c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f36510b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f36510b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (o13 >= this.f36510b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f36510b;
                                photoViewer14.H2 = false;
                                photoViewer14.h2();
                                this.f36510b.f33849q3.h(0.0f, false);
                                this.f36510b.t2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f36510b.A1())));
                                this.f36510b.f33743e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f36510b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f36510b.S7.getRightProgress() - this.f36510b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f36510b.f33849q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f36510b;
                            if (photoViewer15.f33707a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f33708a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f33728c4.rewindByBackSeek)) {
                                    photoViewer15.f33849q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f36510b.f33849q3.f(f7);
                                org.telegram.ui.Components.jh0 jh0Var = org.telegram.ui.Components.jh0.f27497p0;
                                if (f7 > jh0Var.f27499a0) {
                                    jh0Var.f27499a0 = f7;
                                    ai.o4 o4Var = jh0Var.f27501b0;
                                    if (o4Var != null) {
                                        o4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f36510b.f33858r3.invalidate();
                        if (this.f36510b.f33717b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f36510b;
                            if (elapsedRealtime2 - photoViewer16.f33736d3 >= 1000) {
                                String str = photoViewer16.f33717b3;
                                photoViewer16.f33736d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f36510b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f36510b.C3();
                    }
                }
                xu0 xu0Var = this.f36510b.E2;
                if (xu0Var != null) {
                    xu0.a(xu0Var);
                }
                PhotoViewer photoViewer17 = this.f36510b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f33773h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f36510b;
                if (org.telegram.ui.Components.jh0.f27497p0.P) {
                    org.telegram.ui.Components.jh0.j(false);
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
                Activity activity = photoViewer18.f33921y;
                ci.m6 m6Var = new ci.m6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(m6Var);
                m6Var.f5598b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                m6Var.f5599c = textureView;
                m6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f33915x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f33915x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f33915x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new du0(0, this, m6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f33915x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f33915x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f33905w3 = (TextureView) m6Var.f5599c;
                if (org.telegram.ui.Components.jh0.x(false, photoViewer18.f33921y, null, m6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.jh0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    ut0 ut0Var = photoViewer18.f33924y2;
                    if (ut0Var != null) {
                        ut0Var.removeView(photoViewer18.B2);
                        photoViewer18.f33924y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f33905w3);
                    photoViewer18.x0(true);
                    photoViewer18.f33905w3.setVisibility(0);
                    return;
                }
                photoViewer18.f33905w3.setVisibility(4);
                ut0 ut0Var2 = photoViewer18.f33924y2;
                if (ut0Var2 != null) {
                    ut0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f33924y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
