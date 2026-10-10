package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class q81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f30127a;

    public q81(View view) {
        this.f30127a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        s81 s81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        t81 t81Var = (t81) this.f30127a;
        ImageReceiver imageReceiver2 = t81Var.Q;
        if (z10) {
            if (t81Var.N != null || t81Var.f31054d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.ju0 ju0Var = t81Var.N;
                if (ju0Var != null) {
                    ArrayList arrayList = ju0Var.v;
                    int indexOf = arrayList.indexOf(ju0Var.c((int) t81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = ju0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                z13 = true;
                                ceil2 = Math.ceil(videoDuration);
                            } else {
                                z13 = true;
                                if (videoDuration <= 250) {
                                    ceil2 = Math.ceil(videoDuration / 2.0f);
                                } else if (videoDuration <= 500) {
                                    ceil2 = Math.ceil(videoDuration / 4.0f);
                                } else if (videoDuration <= 1000) {
                                    ceil2 = Math.ceil(videoDuration / 5.0f);
                                } else {
                                    ceil2 = Math.ceil(videoDuration / 10.0f);
                                }
                            }
                            i11 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            z13 = true;
                            i11 = 25;
                        }
                    } else {
                        z13 = true;
                        i11 = 0;
                    }
                    float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                    float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                    org.telegram.ui.ju0 ju0Var2 = t81Var.N;
                    int i12 = (int) t81Var.O;
                    int videoDuration2 = ju0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i12)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i12 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i12 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i12 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i12 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i11 - 1);
                    t81Var.R = (int) ((min % 5) * bitmapWidth);
                    t81Var.S = (int) ((min / 5) * bitmapHeight);
                    t81Var.T = (int) bitmapWidth;
                    t81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < t81Var.f31054d0.size()) {
                            s81Var = (s81) t81Var.f31054d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = s81Var.f30709a;
                            }
                            if (i13 == t81Var.f31054d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((s81) t81Var.f31054d0.get(i13 + 1)).f30709a;
                            }
                            double d11 = t81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            s81Var = null;
                            break;
                        }
                    }
                    if (s81Var != null) {
                        t81Var.R = s81Var.f30710b;
                        t81Var.S = s81Var.f30711c;
                        t81Var.T = t81Var.f31051b0;
                        t81Var.U = t81Var.f31053c0;
                    } else {
                        return;
                    }
                }
                t81Var.P = z13;
                float f7 = t81Var.T / t81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = t81Var.getLayoutParams();
                if (t81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    t81Var.setVisibility(0);
                    t81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
