package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f28896a;

    public n81(View view) {
        this.f28896a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        p81 p81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        q81 q81Var = (q81) this.f28896a;
        ImageReceiver imageReceiver2 = q81Var.Q;
        if (z10) {
            if (q81Var.N != null || q81Var.f29794d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.rt0 rt0Var = q81Var.N;
                if (rt0Var != null) {
                    ArrayList arrayList = rt0Var.v;
                    int indexOf = arrayList.indexOf(rt0Var.c((int) q81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = rt0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.rt0 rt0Var2 = q81Var.N;
                    int i12 = (int) q81Var.O;
                    int videoDuration2 = rt0Var2.getVideoDuration() / 1000;
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
                    q81Var.R = (int) ((min % 5) * bitmapWidth);
                    q81Var.S = (int) ((min / 5) * bitmapHeight);
                    q81Var.T = (int) bitmapWidth;
                    q81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < q81Var.f29794d0.size()) {
                            p81Var = (p81) q81Var.f29794d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = p81Var.f29470a;
                            }
                            if (i13 == q81Var.f29794d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((p81) q81Var.f29794d0.get(i13 + 1)).f29470a;
                            }
                            double d11 = q81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            p81Var = null;
                            break;
                        }
                    }
                    if (p81Var != null) {
                        q81Var.R = p81Var.f29471b;
                        q81Var.S = p81Var.f29472c;
                        q81Var.T = q81Var.f29791b0;
                        q81Var.U = q81Var.f29793c0;
                    } else {
                        return;
                    }
                }
                q81Var.P = z13;
                float f7 = q81Var.T / q81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = q81Var.getLayoutParams();
                if (q81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    q81Var.setVisibility(0);
                    q81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }
}
