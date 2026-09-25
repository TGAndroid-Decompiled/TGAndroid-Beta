package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class x71 implements ImageReceiver.ImageReceiverDelegate {
    public final View f30280a;

    public x71(View view) {
        this.f30280a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        z71 z71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        a81 a81Var = (a81) this.f30280a;
        ImageReceiver imageReceiver2 = a81Var.Q;
        if (z10) {
            if (a81Var.N != null || a81Var.f22621d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.au0 au0Var = a81Var.N;
                if (au0Var != null) {
                    ArrayList arrayList = au0Var.v;
                    int indexOf = arrayList.indexOf(au0Var.c((int) a81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = au0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.au0 au0Var2 = a81Var.N;
                    int i12 = (int) a81Var.O;
                    int videoDuration2 = au0Var2.getVideoDuration() / 1000;
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
                    a81Var.R = (int) ((min % 5) * bitmapWidth);
                    a81Var.S = (int) ((min / 5) * bitmapHeight);
                    a81Var.T = (int) bitmapWidth;
                    a81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < a81Var.f22621d0.size()) {
                            z71Var = (z71) a81Var.f22621d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = z71Var.f30809a;
                            }
                            if (i13 == a81Var.f22621d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((z71) a81Var.f22621d0.get(i13 + 1)).f30809a;
                            }
                            double d11 = a81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            z71Var = null;
                            break;
                        }
                    }
                    if (z71Var != null) {
                        a81Var.R = z71Var.f30810b;
                        a81Var.S = z71Var.f30811c;
                        a81Var.T = a81Var.f22618b0;
                        a81Var.U = a81Var.f22620c0;
                    } else {
                        return;
                    }
                }
                a81Var.P = true;
                float f7 = a81Var.T / a81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
                if (a81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    a81Var.setVisibility(0);
                    a81Var.requestLayout();
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
