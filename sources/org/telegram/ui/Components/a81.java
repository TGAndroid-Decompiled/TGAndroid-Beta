package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class a81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f22563a;

    public a81(View view) {
        this.f22563a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        c81 c81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        d81 d81Var = (d81) this.f22563a;
        ImageReceiver imageReceiver2 = d81Var.Q;
        if (z10) {
            if (d81Var.N != null || d81Var.f23591d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.iu0 iu0Var = d81Var.N;
                if (iu0Var != null) {
                    ArrayList arrayList = iu0Var.v;
                    int indexOf = arrayList.indexOf(iu0Var.c((int) d81Var.O));
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
                    org.telegram.ui.iu0 iu0Var2 = d81Var.N;
                    int i12 = (int) d81Var.O;
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
                    d81Var.R = (int) ((min % 5) * bitmapWidth);
                    d81Var.S = (int) ((min / 5) * bitmapHeight);
                    d81Var.T = (int) bitmapWidth;
                    d81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < d81Var.f23591d0.size()) {
                            c81Var = (c81) d81Var.f23591d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = c81Var.f23301a;
                            }
                            if (i13 == d81Var.f23591d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((c81) d81Var.f23591d0.get(i13 + 1)).f23301a;
                            }
                            double d11 = d81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            c81Var = null;
                            break;
                        }
                    }
                    if (c81Var != null) {
                        d81Var.R = c81Var.f23302b;
                        d81Var.S = c81Var.f23303c;
                        d81Var.T = d81Var.f23588b0;
                        d81Var.U = d81Var.f23590c0;
                    } else {
                        return;
                    }
                }
                d81Var.P = true;
                float f7 = d81Var.T / d81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = d81Var.getLayoutParams();
                if (d81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    d81Var.setVisibility(0);
                    d81Var.requestLayout();
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
