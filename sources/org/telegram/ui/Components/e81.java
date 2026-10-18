package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class e81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f25878a;

    public e81(View view) {
        this.f25878a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        g81 g81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        h81 h81Var = (h81) this.f25878a;
        ImageReceiver imageReceiver2 = h81Var.Q;
        if (z10) {
            if (h81Var.N != null || h81Var.f26806d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.qt0 qt0Var = h81Var.N;
                if (qt0Var != null) {
                    ArrayList arrayList = qt0Var.v;
                    int indexOf = arrayList.indexOf(qt0Var.c((int) h81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = qt0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.qt0 qt0Var2 = h81Var.N;
                    int i12 = (int) h81Var.O;
                    int videoDuration2 = qt0Var2.getVideoDuration() / 1000;
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
                    h81Var.R = (int) ((min % 5) * bitmapWidth);
                    h81Var.S = (int) ((min / 5) * bitmapHeight);
                    h81Var.T = (int) bitmapWidth;
                    h81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < h81Var.f26806d0.size()) {
                            g81Var = (g81) h81Var.f26806d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = g81Var.f26514a;
                            }
                            if (i13 == h81Var.f26806d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((g81) h81Var.f26806d0.get(i13 + 1)).f26514a;
                            }
                            double d11 = h81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            g81Var = null;
                            break;
                        }
                    }
                    if (g81Var != null) {
                        h81Var.R = g81Var.f26515b;
                        h81Var.S = g81Var.f26516c;
                        h81Var.T = h81Var.f26803b0;
                        h81Var.U = h81Var.f26805c0;
                    } else {
                        return;
                    }
                }
                h81Var.P = z13;
                float f7 = h81Var.T / h81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = h81Var.getLayoutParams();
                if (h81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    h81Var.setVisibility(0);
                    h81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
