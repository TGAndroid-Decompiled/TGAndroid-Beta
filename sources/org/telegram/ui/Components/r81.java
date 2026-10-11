package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class r81 implements ImageReceiver.ImageReceiverDelegate {
    public final View f30394a;

    public r81(View view) {
        this.f30394a = view;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        t81 t81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        u81 u81Var = (u81) this.f30394a;
        ImageReceiver imageReceiver2 = u81Var.Q;
        if (z10) {
            if (u81Var.N != null || u81Var.f31340d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.iu0 iu0Var = u81Var.N;
                if (iu0Var != null) {
                    ArrayList arrayList = iu0Var.v;
                    int indexOf = arrayList.indexOf(iu0Var.c((int) u81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = iu0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.iu0 iu0Var2 = u81Var.N;
                    int i12 = (int) u81Var.O;
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
                    u81Var.R = (int) ((min % 5) * bitmapWidth);
                    u81Var.S = (int) ((min / 5) * bitmapHeight);
                    u81Var.T = (int) bitmapWidth;
                    u81Var.U = (int) bitmapHeight;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < u81Var.f31340d0.size()) {
                            t81Var = (t81) u81Var.f31340d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = t81Var.f31054a;
                            }
                            if (i13 == u81Var.f31340d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((t81) u81Var.f31340d0.get(i13 + 1)).f31054a;
                            }
                            double d11 = u81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            t81Var = null;
                            break;
                        }
                    }
                    if (t81Var != null) {
                        u81Var.R = t81Var.f31055b;
                        u81Var.S = t81Var.f31056c;
                        u81Var.T = u81Var.f31337b0;
                        u81Var.U = u81Var.f31339c0;
                    } else {
                        return;
                    }
                }
                u81Var.P = z13;
                float f7 = u81Var.T / u81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = u81Var.getLayoutParams();
                if (u81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    u81Var.setVisibility(0);
                    u81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
