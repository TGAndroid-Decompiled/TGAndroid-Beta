package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class g81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f26533a;

    public g81(View view) {
        this.f26533a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        i81 i81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        j81 j81Var = (j81) this.f26533a;
        ImageReceiver imageReceiver2 = j81Var.Q;
        if (z10) {
            if (j81Var.N != null || j81Var.f27437d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.ot0 ot0Var = j81Var.N;
                if (ot0Var != null) {
                    ArrayList arrayList = ot0Var.v;
                    int indexOf = arrayList.indexOf(ot0Var.c((int) j81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = ot0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.ot0 ot0Var2 = j81Var.N;
                    int i12 = (int) j81Var.O;
                    int videoDuration2 = ot0Var2.getVideoDuration() / 1000;
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
                    j81Var.R = (int) ((min % 5) * bitmapWidth);
                    j81Var.S = (int) ((min / 5) * bitmapHeight);
                    j81Var.T = (int) bitmapWidth;
                    j81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < j81Var.f27437d0.size()) {
                            i81Var = (i81) j81Var.f27437d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = i81Var.f27192a;
                            }
                            if (i13 == j81Var.f27437d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((i81) j81Var.f27437d0.get(i13 + 1)).f27192a;
                            }
                            double d11 = j81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            i81Var = null;
                            break;
                        }
                    }
                    if (i81Var != null) {
                        j81Var.R = i81Var.f27193b;
                        j81Var.S = i81Var.f27194c;
                        j81Var.T = j81Var.f27434b0;
                        j81Var.U = j81Var.f27436c0;
                    } else {
                        return;
                    }
                }
                j81Var.P = z13;
                float f7 = j81Var.T / j81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = j81Var.getLayoutParams();
                if (j81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    j81Var.setVisibility(0);
                    j81Var.requestLayout();
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
