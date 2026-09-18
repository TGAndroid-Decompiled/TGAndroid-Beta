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
    public final int f32915a;
    public final PhotoViewer f32916b;

    public ct0(PhotoViewer photoViewer, int i10) {
        this.f32915a = i10;
        this.f32916b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        ku0 ku0Var;
        switch (this.f32915a) {
            case 0:
                PhotoViewer photoViewer = this.f32916b;
                if (photoViewer.f31017l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f32916b.f31040o0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f32916b.f31049p0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            du0 du0Var = this.f32916b.T1;
                            if (du0Var == null || du0Var.getScrollY() == 0) {
                                ld ldVar = this.f32916b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f30915b9;
                                    PhotoViewer photoViewer3 = this.f32916b;
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
                PhotoViewer photoViewer4 = this.f32916b;
                if (photoViewer4.F2 != null || ((ku0Var = photoViewer4.f30963f0) != null && ku0Var.f27289x)) {
                    if (photoViewer4.f31067r1) {
                        if (!photoViewer4.S7.f27800r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f32916b.A1());
                            PhotoViewer photoViewer5 = this.f32916b;
                            if (!photoViewer5.B8 && (photoViewer5.f31098u4 != 0 || photoViewer5.R7.getVisibility() == 0)) {
                                if (o12 >= this.f32916b.S7.getRightProgress()) {
                                    at0 at0Var = this.f32916b.S7;
                                    at0Var.setProgress(at0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f32916b;
                                    photoViewer6.F2.K((int) (photoViewer6.S7.getLeftProgress() * ((float) this.f32916b.A1())));
                                    PhotoViewer photoViewer7 = this.f32916b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f32916b;
                                    if (!photoViewer8.f31065r && photoViewer8.f30938c2 != 1 && photoViewer8.f31098u4 == 0 && photoViewer8.f31046o6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f32916b.f30954e0.invalidate();
                                } else {
                                    this.f32916b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f32916b;
                                if (photoViewer9.f30938c2 != 1) {
                                    photoViewer9.S7.setProgress(o12);
                                }
                            }
                            this.f32916b.B3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f32916b.A1());
                        if (this.f32916b.f30985h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f32916b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f32916b;
                                ku0 ku0Var2 = photoViewer10.f30963f0;
                                if (ku0Var2 != null && ku0Var2.f27289x) {
                                    f7 = ku0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f32916b;
                                    float f10 = photoViewer11.f30919a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f30941c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f32916b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f32916b;
                        if (!photoViewer12.B8 && photoViewer12.R7.getVisibility() == 0) {
                            if (o13 >= this.f32916b.S7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f32916b;
                                photoViewer13.H2 = false;
                                photoViewer13.g2();
                                this.f32916b.f31060q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f32916b;
                                photoViewer14.s2((int) (photoViewer14.S7.getLeftProgress() * ((float) this.f32916b.A1())));
                                this.f32916b.f30954e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f32916b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f32916b.S7.getRightProgress() - this.f32916b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f32916b.f31060q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f32916b;
                            if (photoViewer15.f30919a3 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.f30920a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.f30940c4.rewindByBackSeek)) {
                                    photoViewer15.f31060q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f32916b.f31060q3.f(f7);
                                org.telegram.ui.Components.fg0 fg0Var = org.telegram.ui.Components.fg0.f23914p0;
                                if (f7 > fg0Var.f23916a0) {
                                    fg0Var.f23916a0 = f7;
                                    ai.n4 n4Var = fg0Var.f23918b0;
                                    if (n4Var != null) {
                                        n4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f32916b.f31069r3.invalidate();
                        if (this.f32916b.f30929b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f32916b;
                            if (elapsedRealtime2 - photoViewer16.f30948d3 >= 1000) {
                                String str = photoViewer16.f30929b3;
                                photoViewer16.f30948d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f32916b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, o13, 4));
                            }
                        }
                        this.f32916b.B3();
                    }
                }
                wu0 wu0Var = this.f32916b.E2;
                if (wu0Var != null) {
                    wu0.a(wu0Var);
                }
                PhotoViewer photoViewer17 = this.f32916b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f30984h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f32916b;
                if (org.telegram.ui.Components.fg0.f23914p0.P) {
                    org.telegram.ui.Components.fg0.j(false);
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
                Activity activity = photoViewer18.f31132y;
                ci.n6 n6Var = new ci.n6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(n6Var);
                n6Var.f5074b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                n6Var.f5075c = textureView;
                n6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f31126x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f31126x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f31126x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new pl0(18, this, n6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f31126x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f31126x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f31116w3 = (TextureView) n6Var.f5075c;
                if (org.telegram.ui.Components.fg0.x(false, photoViewer18.f31132y, null, n6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.fg0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    ut0 ut0Var = photoViewer18.f31135y2;
                    if (ut0Var != null) {
                        ut0Var.removeView(photoViewer18.B2);
                        photoViewer18.f31135y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f31116w3);
                    photoViewer18.x0(true);
                    photoViewer18.f31116w3.setVisibility(0);
                    return;
                }
                photoViewer18.f31116w3.setVisibility(4);
                ut0 ut0Var2 = photoViewer18.f31135y2;
                if (ut0Var2 != null) {
                    ut0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f31135y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
