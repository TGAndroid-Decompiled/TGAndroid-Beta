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
    public final int f37262a;
    public final PhotoViewer f37263b;

    public gs0(PhotoViewer photoViewer, int i10) {
        this.f37262a = i10;
        this.f37263b = photoViewer;
    }

    @Override
    public final void run() {
        float f10;
        pt0 pt0Var;
        switch (this.f37262a) {
            case 0:
                PhotoViewer photoViewer = this.f37263b;
                if (photoViewer.f34297i3 && photoViewer.M3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f37263b.f34321l0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f37263b.m0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            it0 it0Var = this.f37263b.Q1;
                            if (it0Var == null || it0Var.getScrollY() == 0) {
                                ld ldVar = this.f37263b.U0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.X8;
                                    PhotoViewer photoViewer3 = this.f37263b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.j3(false, true);
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
                PhotoViewer photoViewer4 = this.f37263b;
                if (photoViewer4.C2 != null || ((pt0Var = photoViewer4.f34240c0) != null && pt0Var.f33068x)) {
                    if (photoViewer4.f34348o1) {
                        if (!photoViewer4.O7.f31836r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f37263b.A1());
                            PhotoViewer photoViewer5 = this.f37263b;
                            if (!photoViewer5.f34438x8 && (photoViewer5.f34379r4 != 0 || photoViewer5.N7.getVisibility() == 0)) {
                                if (o12 >= this.f37263b.O7.getRightProgress()) {
                                    es0 es0Var = this.f37263b.O7;
                                    es0Var.setProgress(es0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f37263b;
                                    photoViewer6.C2.K((int) (photoViewer6.O7.getLeftProgress() * ((float) this.f37263b.A1())));
                                    PhotoViewer photoViewer7 = this.f37263b;
                                    photoViewer7.E2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f37263b;
                                    if (!photoViewer8.f34374r && photoViewer8.Z1 != 1 && photoViewer8.f34379r4 == 0 && photoViewer8.f34326l6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f37263b.f34230b0.invalidate();
                                } else {
                                    this.f37263b.O7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f37263b;
                                if (photoViewer9.Z1 != 1) {
                                    photoViewer9.O7.setProgress(o12);
                                }
                            }
                            this.f37263b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f37263b.A1());
                        if (this.f37263b.f34263e5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f37263b.P3) >= 500) {
                                PhotoViewer photoViewer10 = this.f37263b;
                                pt0 pt0Var2 = photoViewer10.f34240c0;
                                if (pt0Var2 != null && pt0Var2.f33068x) {
                                    f10 = pt0Var2.getBufferedPosition();
                                } else if (photoViewer10.N3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.Q);
                                    PhotoViewer photoViewer11 = this.f37263b;
                                    float f11 = photoViewer11.X2;
                                    if (f11 == 0.0f) {
                                        f11 = o13;
                                    }
                                    f10 = fileLoader.getBufferedProgressFromPosition(f11, photoViewer11.Z4[0]);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.f37263b.P3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f37263b;
                        if (!photoViewer12.f34438x8 && photoViewer12.N7.getVisibility() == 0) {
                            if (o13 >= this.f37263b.O7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f37263b;
                                photoViewer13.E2 = false;
                                photoViewer13.g2();
                                this.f37263b.f34341n3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f37263b;
                                photoViewer14.t2((int) (photoViewer14.O7.getLeftProgress() * ((float) this.f37263b.A1())));
                                this.f37263b.f34230b0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f37263b.O7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f37263b.O7.getRightProgress() - this.f37263b.O7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f37263b.f34341n3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f37263b;
                            if (photoViewer15.X2 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.X3;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.Z3.rewindByBackSeek)) {
                                    photoViewer15.f34341n3.h(o13, false);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.f37263b.f34341n3.f(f10);
                                org.telegram.ui.Components.ng0 ng0Var = org.telegram.ui.Components.ng0.m0;
                                if (f10 > ng0Var.X) {
                                    ng0Var.X = f10;
                                    oh.b3 b3Var = ng0Var.Y;
                                    if (b3Var != null) {
                                        b3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f37263b.f34350o3.invalidate();
                        if (this.f37263b.Y2 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f37263b;
                            if (elapsedRealtime2 - photoViewer16.f34223a3 >= 1000) {
                                String str = photoViewer16.Y2;
                                photoViewer16.f34223a3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f37263b.Q4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new d0(str, o13, 4));
                            }
                        }
                        this.f37263b.C3();
                    }
                }
                cu0 cu0Var = this.f37263b.B2;
                if (cu0Var != null) {
                    cu0.a(cu0Var);
                }
                PhotoViewer photoViewer17 = this.f37263b;
                if (photoViewer17.M3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f34262e4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f37263b;
                if (org.telegram.ui.Components.ng0.m0.M) {
                    org.telegram.ui.Components.ng0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    return;
                }
                photoViewer18.I3 = false;
                Bitmap bitmap = photoViewer18.f34452z3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.f34452z3 = null;
                }
                photoViewer18.C3 = true;
                Activity activity = photoViewer18.f34439y;
                ag.l lVar = new ag.l(activity, 28);
                ImageReceiver imageReceiver = new ImageReceiver(lVar);
                lVar.f212b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                lVar.f213c = textureView;
                lVar.addView(textureView);
                try {
                    if (photoViewer18.A2) {
                        Drawable drawable = photoViewer18.f34404u3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.f34452z3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f34404u3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f34404u3.setImageBitmap(photoViewer18.f34452z3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.f34452z3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.f34451z2.getWidth(), photoViewer18.f34451z2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.f34452z3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.f34451z2, createBitmap, new br0(5, this, lVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.f34442y2.getWidth(), photoViewer18.f34442y2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.f34452z3 = createBitmap2;
                        photoViewer18.f34442y2.getBitmap(createBitmap2);
                        if (photoViewer18.f34452z3 != null) {
                            ImageView imageView2 = photoViewer18.f34404u3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f34404u3.setImageBitmap(photoViewer18.f34452z3);
                            }
                            imageReceiver.setImageBitmap(photoViewer18.f34452z3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.f34452z3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.f34452z3 = null;
                    }
                    FileLog.e(th2);
                }
                photoViewer18.G3 = true;
                photoViewer18.f34396t3 = (TextureView) lVar.f213c;
                if (org.telegram.ui.Components.ng0.x(false, photoViewer18.f34439y, null, lVar, photoViewer18.R, photoViewer18.S, photoViewer18.H3)) {
                    org.telegram.ui.Components.ng0.w(photoViewer18);
                }
                photoViewer18.H3 = true;
                if (photoViewer18.A2) {
                    zs0 zs0Var = photoViewer18.f34412v2;
                    if (zs0Var != null) {
                        zs0Var.removeView(photoViewer18.f34442y2);
                        photoViewer18.f34412v2.removeView(photoViewer18.f34451z2);
                    }
                    photoViewer18.C2.U(null);
                    photoViewer18.C2.V(null);
                    photoViewer18.C2.C();
                    photoViewer18.C2.V(photoViewer18.f34396t3);
                    photoViewer18.x0(true);
                    photoViewer18.f34396t3.setVisibility(0);
                    return;
                }
                photoViewer18.f34396t3.setVisibility(4);
                zs0 zs0Var2 = photoViewer18.f34412v2;
                if (zs0Var2 != null) {
                    zs0Var2.removeView(photoViewer18.f34442y2);
                    photoViewer18.f34412v2.removeView(photoViewer18.f34451z2);
                    return;
                }
                return;
        }
    }
}
