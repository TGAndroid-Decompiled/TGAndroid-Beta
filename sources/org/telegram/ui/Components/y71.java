package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class y71 implements ImageReceiver.ImageReceiverDelegate {
    public final View f30471a;

    public y71(View view) {
        this.f30471a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        a81 a81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        b81 b81Var = (b81) this.f30471a;
        ImageReceiver imageReceiver2 = b81Var.Q;
        if (z10) {
            if (b81Var.N != null || b81Var.f22917d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.iu0 iu0Var = b81Var.N;
                if (iu0Var != null) {
                    ArrayList arrayList = iu0Var.v;
                    int indexOf = arrayList.indexOf(iu0Var.c((int) b81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = iu0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                ceil2 = Math.ceil(videoDuration);
                            } else if (videoDuration <= 250) {
                                ceil2 = Math.ceil(videoDuration / 2.0f);
                            } else if (videoDuration <= 500) {
                                ceil2 = Math.ceil(videoDuration / 4.0f);
                            } else if (videoDuration <= 1000) {
                                ceil2 = Math.ceil(videoDuration / 5.0f);
                            } else {
                                ceil2 = Math.ceil(videoDuration / 10.0f);
                            }
                            i11 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            i11 = 25;
                        }
                    } else {
                        i11 = 0;
                    }
                    float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                    float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                    org.telegram.ui.iu0 iu0Var2 = b81Var.N;
                    int i12 = (int) b81Var.O;
                    int videoDuration2 = iu0Var2.getVideoDuration() / 1000;
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
                    b81Var.R = (int) ((min % 5) * bitmapWidth);
                    b81Var.S = (int) ((min / 5) * bitmapHeight);
                    b81Var.T = (int) bitmapWidth;
                    b81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < b81Var.f22917d0.size()) {
                            a81Var = (a81) b81Var.f22917d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = a81Var.f22583a;
                            }
                            if (i13 == b81Var.f22917d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((a81) b81Var.f22917d0.get(i13 + 1)).f22583a;
                            }
                            double d11 = b81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            a81Var = null;
                            break;
                        }
                    }
                    if (a81Var != null) {
                        b81Var.R = a81Var.f22584b;
                        b81Var.S = a81Var.f22585c;
                        b81Var.T = b81Var.f22914b0;
                        b81Var.U = b81Var.f22916c0;
                    } else {
                        return;
                    }
                }
                b81Var.P = true;
                float f7 = b81Var.T / b81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
                if (b81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    b81Var.setVisibility(0);
                    b81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
