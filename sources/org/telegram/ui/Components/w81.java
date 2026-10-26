package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w81 implements ImageReceiver.ImageReceiverDelegate {
    public final Object f34390a;

    public w81(Object obj) {
        this.f34390a = obj;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        y81 y81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        z81 z81Var = (z81) this.f34390a;
        ImageReceiver imageReceiver2 = z81Var.Q;
        if (z10) {
            if (z81Var.N != null || z81Var.f35251d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.vt0 vt0Var = z81Var.N;
                if (vt0Var != null) {
                    ArrayList arrayList = vt0Var.v;
                    int indexOf = arrayList.indexOf(vt0Var.c((int) z81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = vt0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.vt0 vt0Var2 = z81Var.N;
                    int i12 = (int) z81Var.O;
                    int videoDuration2 = vt0Var2.getVideoDuration() / 1000;
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
                    z81Var.R = (int) ((min % 5) * bitmapWidth);
                    z81Var.S = (int) ((min / 5) * bitmapHeight);
                    z81Var.T = (int) bitmapWidth;
                    z81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < z81Var.f35251d0.size()) {
                            y81Var = (y81) z81Var.f35251d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = y81Var.f34981a;
                            }
                            if (i13 == z81Var.f35251d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((y81) z81Var.f35251d0.get(i13 + 1)).f34981a;
                            }
                            double d11 = z81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            y81Var = null;
                            break;
                        }
                    }
                    if (y81Var != null) {
                        z81Var.R = y81Var.f34982b;
                        z81Var.S = y81Var.f34983c;
                        z81Var.T = z81Var.f35248b0;
                        z81Var.U = z81Var.f35250c0;
                    } else {
                        return;
                    }
                }
                z81Var.P = z13;
                float f7 = z81Var.T / z81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = z81Var.getLayoutParams();
                if (z81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    z81Var.setVisibility(0);
                    z81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }
}
