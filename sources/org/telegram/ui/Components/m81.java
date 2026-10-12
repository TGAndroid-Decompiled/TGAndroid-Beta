package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class m81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f27305a;

    public m81(View view) {
        this.f27305a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        o81 o81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        p81 p81Var = (p81) this.f27305a;
        ImageReceiver imageReceiver2 = p81Var.Q;
        if (z10) {
            if (p81Var.N != null || p81Var.f28237d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.pu0 pu0Var = p81Var.N;
                if (pu0Var != null) {
                    ArrayList arrayList = pu0Var.v;
                    int indexOf = arrayList.indexOf(pu0Var.c((int) p81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = pu0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.pu0 pu0Var2 = p81Var.N;
                    int i12 = (int) p81Var.O;
                    int videoDuration2 = pu0Var2.getVideoDuration() / 1000;
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
                    p81Var.R = (int) ((min % 5) * bitmapWidth);
                    p81Var.S = (int) ((min / 5) * bitmapHeight);
                    p81Var.T = (int) bitmapWidth;
                    p81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < p81Var.f28237d0.size()) {
                            o81Var = (o81) p81Var.f28237d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = o81Var.f27908a;
                            }
                            if (i13 == p81Var.f28237d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((o81) p81Var.f28237d0.get(i13 + 1)).f27908a;
                            }
                            double d11 = p81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            o81Var = null;
                            break;
                        }
                    }
                    if (o81Var != null) {
                        p81Var.R = o81Var.f27909b;
                        p81Var.S = o81Var.f27910c;
                        p81Var.T = p81Var.f28234b0;
                        p81Var.U = p81Var.f28236c0;
                    } else {
                        return;
                    }
                }
                p81Var.P = z13;
                float f7 = p81Var.T / p81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = p81Var.getLayoutParams();
                if (p81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    p81Var.setVisibility(0);
                    p81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
