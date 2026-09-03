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
public final class ls0 implements Runnable {
    public final int f35915a;
    public final PhotoViewer f35916b;

    public ls0(PhotoViewer photoViewer, int i10) {
        this.f35915a = i10;
        this.f35916b = photoViewer;
    }

    @Override
    public final void run() {
        float f10;
        ut0 ut0Var;
        switch (this.f35915a) {
            case 0:
                PhotoViewer photoViewer = this.f35916b;
                if (photoViewer.f31745i3 && photoViewer.M3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f35916b.f31769l0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f35916b.m0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            nt0 nt0Var = this.f35916b.Q1;
                            if (nt0Var == null || nt0Var.getScrollY() == 0) {
                                nd ndVar = this.f35916b.U0;
                                if (ndVar == null || ndVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.X8;
                                    PhotoViewer photoViewer3 = this.f35916b;
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
                PhotoViewer photoViewer4 = this.f35916b;
                if (photoViewer4.C2 != null || ((ut0Var = photoViewer4.f31689c0) != null && ut0Var.f30245x)) {
                    if (photoViewer4.f31796o1) {
                        if (!photoViewer4.O7.f28938r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f35916b.A1());
                            PhotoViewer photoViewer5 = this.f35916b;
                            if (!photoViewer5.f31886x8 && (photoViewer5.f31827r4 != 0 || photoViewer5.N7.getVisibility() == 0)) {
                                if (o12 >= this.f35916b.O7.getRightProgress()) {
                                    js0 js0Var = this.f35916b.O7;
                                    js0Var.setProgress(js0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f35916b;
                                    photoViewer6.C2.K((int) (photoViewer6.O7.getLeftProgress() * ((float) this.f35916b.A1())));
                                    PhotoViewer photoViewer7 = this.f35916b;
                                    photoViewer7.E2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f35916b;
                                    if (!photoViewer8.f31822r && photoViewer8.Z1 != 1 && photoViewer8.f31827r4 == 0 && photoViewer8.f31774l6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f35916b.f31679b0.invalidate();
                                } else {
                                    this.f35916b.O7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f35916b;
                                if (photoViewer9.Z1 != 1) {
                                    photoViewer9.O7.setProgress(o12);
                                }
                            }
                            this.f35916b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f35916b.A1());
                        if (this.f35916b.f31711e5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f35916b.P3) >= 500) {
                                PhotoViewer photoViewer10 = this.f35916b;
                                ut0 ut0Var2 = photoViewer10.f31689c0;
                                if (ut0Var2 != null && ut0Var2.f30245x) {
                                    f10 = ut0Var2.getBufferedPosition();
                                } else if (photoViewer10.N3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.Q);
                                    PhotoViewer photoViewer11 = this.f35916b;
                                    float f11 = photoViewer11.X2;
                                    if (f11 == 0.0f) {
                                        f11 = o13;
                                    }
                                    f10 = fileLoader.getBufferedProgressFromPosition(f11, photoViewer11.Z4[0]);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.f35916b.P3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f35916b;
                        if (!photoViewer12.f31886x8 && photoViewer12.N7.getVisibility() == 0) {
                            if (o13 >= this.f35916b.O7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f35916b;
                                photoViewer13.E2 = false;
                                photoViewer13.g2();
                                this.f35916b.f31789n3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f35916b;
                                photoViewer14.t2((int) (photoViewer14.O7.getLeftProgress() * ((float) this.f35916b.A1())));
                                this.f35916b.f31679b0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f35916b.O7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f35916b.O7.getRightProgress() - this.f35916b.O7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f35916b.f31789n3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f35916b;
                            if (photoViewer15.X2 == 0.0f) {
                                org.telegram.ui.Cells.f1 f1Var = photoViewer15.X3;
                                if (f1Var.rewindCount == 0 || (!f1Var.rewindByBackSeek && !photoViewer15.Z3.rewindByBackSeek)) {
                                    photoViewer15.f31789n3.h(o13, false);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.f35916b.f31789n3.f(f10);
                                org.telegram.ui.Components.mg0 mg0Var = org.telegram.ui.Components.mg0.m0;
                                if (f10 > mg0Var.X) {
                                    mg0Var.X = f10;
                                    nh.a3 a3Var = mg0Var.Y;
                                    if (a3Var != null) {
                                        a3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f35916b.f31798o3.invalidate();
                        if (this.f35916b.Y2 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f35916b;
                            if (elapsedRealtime2 - photoViewer16.f31672a3 >= 1000) {
                                String str = photoViewer16.Y2;
                                photoViewer16.f31672a3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f35916b.Q4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new e0(str, o13, 4));
                            }
                        }
                        this.f35916b.C3();
                    }
                }
                hu0 hu0Var = this.f35916b.B2;
                if (hu0Var != null) {
                    hu0.a(hu0Var);
                }
                PhotoViewer photoViewer17 = this.f35916b;
                if (photoViewer17.M3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f31710e4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f35916b;
                if (org.telegram.ui.Components.mg0.m0.M) {
                    org.telegram.ui.Components.mg0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    return;
                }
                photoViewer18.I3 = false;
                Bitmap bitmap = photoViewer18.f31900z3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.f31900z3 = null;
                }
                photoViewer18.C3 = true;
                Activity activity = photoViewer18.f31887y;
                ah.e eVar = new ah.e(activity, 27);
                ImageReceiver imageReceiver = new ImageReceiver(eVar);
                eVar.f212b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                eVar.f213c = textureView;
                eVar.addView(textureView);
                try {
                    if (photoViewer18.A2) {
                        Drawable drawable = photoViewer18.f31852u3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.f31900z3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f31852u3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f31852u3.setImageBitmap(photoViewer18.f31900z3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.f31900z3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.f31899z2.getWidth(), photoViewer18.f31899z2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.f31900z3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.f31899z2, createBitmap, new gr0(5, this, eVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.f31890y2.getWidth(), photoViewer18.f31890y2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.f31900z3 = createBitmap2;
                        photoViewer18.f31890y2.getBitmap(createBitmap2);
                        if (photoViewer18.f31900z3 != null) {
                            ImageView imageView2 = photoViewer18.f31852u3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f31852u3.setImageBitmap(photoViewer18.f31900z3);
                            }
                            imageReceiver.setImageBitmap(photoViewer18.f31900z3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.f31900z3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.f31900z3 = null;
                    }
                    FileLog.e(th2);
                }
                photoViewer18.G3 = true;
                photoViewer18.f31844t3 = (TextureView) eVar.f213c;
                if (org.telegram.ui.Components.mg0.x(false, photoViewer18.f31887y, null, eVar, photoViewer18.R, photoViewer18.S, photoViewer18.H3)) {
                    org.telegram.ui.Components.mg0.w(photoViewer18);
                }
                photoViewer18.H3 = true;
                if (photoViewer18.A2) {
                    et0 et0Var = photoViewer18.f31860v2;
                    if (et0Var != null) {
                        et0Var.removeView(photoViewer18.f31890y2);
                        photoViewer18.f31860v2.removeView(photoViewer18.f31899z2);
                    }
                    photoViewer18.C2.U(null);
                    photoViewer18.C2.V(null);
                    photoViewer18.C2.C();
                    photoViewer18.C2.V(photoViewer18.f31844t3);
                    photoViewer18.x0(true);
                    photoViewer18.f31844t3.setVisibility(0);
                    return;
                }
                photoViewer18.f31844t3.setVisibility(4);
                et0 et0Var2 = photoViewer18.f31860v2;
                if (et0Var2 != null) {
                    et0Var2.removeView(photoViewer18.f31890y2);
                    photoViewer18.f31860v2.removeView(photoViewer18.f31899z2);
                    return;
                }
                return;
        }
    }
}
