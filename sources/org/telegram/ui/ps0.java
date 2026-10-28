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
public final class ps0 implements Runnable {
    public final int f42500a;
    public final PhotoViewer f42501b;

    public ps0(PhotoViewer photoViewer, int i10) {
        this.f42500a = i10;
        this.f42501b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2;
        xt0 xt0Var;
        switch (this.f42500a) {
            case 0:
                PhotoViewer photoViewer3 = this.f42501b;
                if (photoViewer3.f35734l3 && photoViewer3.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f42501b.f35757o0;
                    if (w0Var == null || !w0Var.x()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f42501b.f35766p0;
                        if (w0Var2 == null || !w0Var2.x()) {
                            qt0 qt0Var = this.f42501b.T1;
                            if (qt0Var == null || qt0Var.getScrollY() == 0) {
                                ld ldVar = this.f42501b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer4 = PhotoViewer.f35631b9;
                                    PhotoViewer photoViewer5 = this.f42501b;
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
                PhotoViewer photoViewer6 = this.f42501b;
                if (photoViewer6.F2 != null || ((xt0Var = photoViewer6.f35680f0) != null && xt0Var.f30914x)) {
                    if (photoViewer6.f35785r1) {
                        if (!photoViewer6.S7.f27766r) {
                            float q12 = ((float) photoViewer6.q1()) / ((float) this.f42501b.C1());
                            PhotoViewer photoViewer7 = this.f42501b;
                            if (!photoViewer7.B8 && (photoViewer7.f35815u4 != 0 || photoViewer7.R7.getVisibility() == 0)) {
                                if (q12 >= this.f42501b.S7.getRightProgress()) {
                                    ns0 ns0Var = this.f42501b.S7;
                                    ns0Var.setProgress(ns0Var.getLeftProgress());
                                    this.f42501b.F2.K((int) (photoViewer2.S7.getLeftProgress() * ((float) this.f42501b.C1())));
                                    PhotoViewer photoViewer8 = this.f42501b;
                                    photoViewer8.H2 = false;
                                    photoViewer8.v0();
                                    PhotoViewer photoViewer9 = this.f42501b;
                                    if (!photoViewer9.f35783r && photoViewer9.f35654c2 != 1 && photoViewer9.f35815u4 == 0 && photoViewer9.f35763o6 <= 0) {
                                        photoViewer9.k2();
                                    } else {
                                        photoViewer9.m2();
                                    }
                                    this.f42501b.f35670e0.invalidate();
                                } else {
                                    this.f42501b.S7.setProgress(q12);
                                }
                            } else {
                                PhotoViewer photoViewer10 = this.f42501b;
                                if (photoViewer10.f35654c2 != 1) {
                                    photoViewer10.S7.setProgress(q12);
                                }
                            }
                            this.f42501b.F3();
                        }
                    } else {
                        float q13 = ((float) photoViewer6.q1()) / ((float) this.f42501b.C1());
                        if (this.f42501b.f35701h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f42501b.S3) >= 500) {
                                PhotoViewer photoViewer11 = this.f42501b;
                                xt0 xt0Var2 = photoViewer11.f35680f0;
                                if (xt0Var2 != null && xt0Var2.f30914x) {
                                    f7 = xt0Var2.getBufferedPosition();
                                } else if (photoViewer11.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer11.T);
                                    PhotoViewer photoViewer12 = this.f42501b;
                                    float f10 = photoViewer12.f35635a3;
                                    if (f10 == 0.0f) {
                                        f10 = q13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer12.f35657c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f42501b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer13 = this.f42501b;
                        if (!photoViewer13.B8 && photoViewer13.R7.getVisibility() == 0) {
                            if (q13 >= this.f42501b.S7.getRightProgress()) {
                                PhotoViewer photoViewer14 = this.f42501b;
                                photoViewer14.H2 = false;
                                photoViewer14.k2();
                                this.f42501b.f35778q3.h(0.0f, false);
                                this.f42501b.w2((int) (photoViewer.S7.getLeftProgress() * ((float) this.f42501b.C1())));
                                this.f42501b.f35670e0.invalidate();
                            } else {
                                float leftProgress = q13 - this.f42501b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                q13 = leftProgress / (this.f42501b.S7.getRightProgress() - this.f42501b.S7.getLeftProgress());
                                if (q13 > 1.0f) {
                                    q13 = 1.0f;
                                }
                                this.f42501b.f35778q3.h(q13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f42501b;
                            if (photoViewer15.f35635a3 == 0.0f) {
                                org.telegram.ui.Cells.f1 f1Var = photoViewer15.f35636a4;
                                if (f1Var.rewindCount == 0 || (!f1Var.rewindByBackSeek && !photoViewer15.f35656c4.rewindByBackSeek)) {
                                    photoViewer15.f35778q3.h(q13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f42501b.f35778q3.f(f7);
                                org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.f27444p0;
                                if (f7 > dh0Var.f27446a0) {
                                    dh0Var.f27446a0 = f7;
                                    di.h3 h3Var = dh0Var.f27448b0;
                                    if (h3Var != null) {
                                        h3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f42501b.f35787r3.invalidate();
                        if (this.f42501b.f35645b3 != null && q13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f42501b;
                            if (elapsedRealtime2 - photoViewer16.f35664d3 >= 1000) {
                                String str = photoViewer16.f35645b3;
                                photoViewer16.f35664d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f42501b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(q13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, q13, 4));
                            }
                        }
                        this.f42501b.F3();
                    }
                }
                ju0 ju0Var = this.f42501b.E2;
                if (ju0Var != null) {
                    ju0.a(ju0Var);
                }
                PhotoViewer photoViewer17 = this.f42501b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f35700h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f42501b;
                if (org.telegram.ui.Components.dh0.f27444p0.P) {
                    org.telegram.ui.Components.dh0.j(false);
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
                Activity activity = photoViewer18.f35849y;
                bh.p pVar = new bh.p(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(pVar);
                pVar.f4101b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                pVar.f4102c = textureView;
                pVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f35843x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f35843x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f35843x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new am0(16, this, pVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f35843x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f35843x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f35833w3 = (TextureView) pVar.f4102c;
                if (org.telegram.ui.Components.dh0.x(false, photoViewer18.f35849y, null, pVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.dh0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    ht0 ht0Var = photoViewer18.f35852y2;
                    if (ht0Var != null) {
                        ht0Var.removeView(photoViewer18.B2);
                        photoViewer18.f35852y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f35833w3);
                    photoViewer18.y0(true);
                    photoViewer18.f35833w3.setVisibility(0);
                    return;
                }
                photoViewer18.f35833w3.setVisibility(4);
                ht0 ht0Var2 = photoViewer18.f35852y2;
                if (ht0Var2 != null) {
                    ht0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f35852y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
