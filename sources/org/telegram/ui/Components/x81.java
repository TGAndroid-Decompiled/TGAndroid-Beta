package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class x81 implements ImageReceiver.ImageReceiverDelegate {
    public final Object f34701a;

    public x81(Object obj) {
        this.f34701a = obj;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        z81 z81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        a91 a91Var = (a91) this.f34701a;
        ImageReceiver imageReceiver2 = a91Var.Q;
        if (z10) {
            if (a91Var.N != null || a91Var.f26471d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.xt0 xt0Var = a91Var.N;
                if (xt0Var != null) {
                    ArrayList arrayList = xt0Var.v;
                    int indexOf = arrayList.indexOf(xt0Var.c((int) a91Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = xt0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.xt0 xt0Var2 = a91Var.N;
                    int i12 = (int) a91Var.O;
                    int videoDuration2 = xt0Var2.getVideoDuration() / 1000;
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
                    a91Var.R = (int) ((min % 5) * bitmapWidth);
                    a91Var.S = (int) ((min / 5) * bitmapHeight);
                    a91Var.T = (int) bitmapWidth;
                    a91Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < a91Var.f26471d0.size()) {
                            z81Var = (z81) a91Var.f26471d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = z81Var.f35292a;
                            }
                            if (i13 == a91Var.f26471d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((z81) a91Var.f26471d0.get(i13 + 1)).f35292a;
                            }
                            double d11 = a91Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            z81Var = null;
                            break;
                        }
                    }
                    if (z81Var != null) {
                        a91Var.R = z81Var.f35293b;
                        a91Var.S = z81Var.f35294c;
                        a91Var.T = a91Var.f26468b0;
                        a91Var.U = a91Var.f26470c0;
                    } else {
                        return;
                    }
                }
                a91Var.P = z13;
                float f7 = a91Var.T / a91Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = a91Var.getLayoutParams();
                if (a91Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    a91Var.setVisibility(0);
                    a91Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }
}
