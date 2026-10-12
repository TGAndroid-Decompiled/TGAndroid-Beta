package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class v81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f31460a;

    public v81(View view) {
        this.f31460a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        x81 x81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        y81 y81Var = (y81) this.f31460a;
        ImageReceiver imageReceiver2 = y81Var.Q;
        if (z10) {
            if (y81Var.N != null || y81Var.f32982d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.lu0 lu0Var = y81Var.N;
                if (lu0Var != null) {
                    ArrayList arrayList = lu0Var.v;
                    int indexOf = arrayList.indexOf(lu0Var.c((int) y81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = lu0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.lu0 lu0Var2 = y81Var.N;
                    int i12 = (int) y81Var.O;
                    int videoDuration2 = lu0Var2.getVideoDuration() / 1000;
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
                    y81Var.R = (int) ((min % 5) * bitmapWidth);
                    y81Var.S = (int) ((min / 5) * bitmapHeight);
                    y81Var.T = (int) bitmapWidth;
                    y81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < y81Var.f32982d0.size()) {
                            x81Var = (x81) y81Var.f32982d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = x81Var.f32677a;
                            }
                            if (i13 == y81Var.f32982d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((x81) y81Var.f32982d0.get(i13 + 1)).f32677a;
                            }
                            double d11 = y81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            x81Var = null;
                            break;
                        }
                    }
                    if (x81Var != null) {
                        y81Var.R = x81Var.f32678b;
                        y81Var.S = x81Var.f32679c;
                        y81Var.T = y81Var.f32979b0;
                        y81Var.U = y81Var.f32981c0;
                    } else {
                        return;
                    }
                }
                y81Var.P = z13;
                float f7 = y81Var.T / y81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = y81Var.getLayoutParams();
                if (y81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    y81Var.setVisibility(0);
                    y81Var.requestLayout();
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
