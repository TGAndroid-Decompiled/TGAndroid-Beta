package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hi0 extends FrameLayout {
    public final int f33861a;
    public final wi0 f33862b;

    public hi0(wi0 wi0Var, Context context, int i10) {
        super(context);
        this.f33861a = i10;
        this.f33862b = wi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f33861a) {
            case 0:
                super.dispatchDraw(canvas);
                wi0 wi0Var = this.f33862b;
                ii0 ii0Var = wi0Var.f38997a0;
                ii0Var.e(canvas);
                ArrayList arrayList = ii0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    cz czVar = (cz) hg.c.h(1, arrayList);
                    ImageReceiver imageReceiver = czVar.f32454r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (czVar.f32455s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                czVar.f32455s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                czVar.f32455s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (czVar.f32455s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(czVar.f32455s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    wi0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!ii0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                wi0 wi0Var2 = this.f33862b;
                fb0 fb0Var = wi0Var2.d;
                if (fb0Var != null) {
                    if (wi0Var2.E == 1.0f && wi0Var2.f39012n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fb0Var.a(z10);
                }
                if (wi0Var2.E > 0.0f && wi0Var2.f39012n != null) {
                    wi0Var2.f39017r.reset();
                    float width = getWidth() / wi0Var2.f39004f.getWidth();
                    wi0Var2.f39017r.postScale(width, width);
                    wi0Var2.h.setLocalMatrix(wi0Var2.f39017r);
                    wi0Var2.f39012n.setAlpha((int) (wi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), wi0Var2.f39012n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f33861a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f33862b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int measuredHeight;
        ji0 ji0Var;
        int height;
        switch (this.f33861a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                wi0 wi0Var = this.f33862b;
                if (!wi0Var.f39006g0 || wi0Var.f39007h0) {
                    ArrayList arrayList = wi0Var.N;
                    pi0 pi0Var = wi0Var.K;
                    if (wi0Var.F.getWidth() > 0) {
                        wi0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.ul.D(6.0f, wi0Var.W.getWidth() - wi0Var.W.l(), iArr[0])};
                        wi0Var.X.setScaleX(wi0Var.W.getScaleX());
                        wi0Var.X.setScaleY(wi0Var.W.getScaleY());
                        int[] iArr2 = wi0Var.f39014o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = pi0Var.getMeasuredHeight() - wi0Var.X.getHeight();
                        if (wi0Var.f39003e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + wi0Var.e.f10577b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = wi0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (wi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - wi0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (wi0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - wi0Var.W.getHeight();
                        }
                        wi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ji0Var.getWidth() - wi0Var.X.l())));
                        wi0Var.X.setY(iArr[1]);
                        if (wi0Var.m0) {
                            iArr[0] = iArr[0] - (wi0Var.Y - wi0Var.W.l());
                        }
                        pi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - pi0Var.getMeasuredWidth());
                        if (wi0Var.f39006g0) {
                            org.telegram.messenger.ul.r(pi0Var.animate().translationY(((wi0Var.X.getHeight() + iArr[1]) - pi0Var.getMeasuredHeight()) - pi0Var.getTop()), ji.n.V, 250L);
                        } else {
                            pi0Var.setY((wi0Var.X.getHeight() + iArr[1]) - pi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = wi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - wi0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = wi0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = wi0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = wi0Var.f39002d0;
                        if (frameLayout != null) {
                            frameLayout.setX(hg.c.f(6.0f, (wi0Var.X.l() + iArr[0]) - wi0Var.f39002d0.getMeasuredWidth(), 0));
                            RectF rectF = wi0Var.f39011l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = wi0Var.f39002d0;
                                float max = Math.max(wi0Var.e.f10577b, rectF.top - frameLayout2.getMeasuredWidth());
                                wi0Var.f39001c0 = max;
                                frameLayout2.setY(max);
                                ki0 ki0Var = wi0Var.f39003e0;
                                if (ki0Var != null) {
                                    ki0Var.setY(Math.max(wi0Var.e.f10577b, (wi0Var.f39011l0.top - AndroidUtilities.dp(24.0f)) - wi0Var.f39003e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (wi0Var.X.getHeight() + iArr[1]) - pi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = wi0Var.f39002d0;
                                float max2 = Math.max(wi0Var.e.f10577b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                wi0Var.f39001c0 = max2;
                                frameLayout3.setY(max2);
                                ki0 ki0Var2 = wi0Var.f39003e0;
                                if (ki0Var2 != null) {
                                    ki0Var2.setY(Math.max(0.0f, (height2 - ki0Var2.getMeasuredHeight()) - wi0Var.f39001c0));
                                }
                            }
                        }
                    }
                    wi0Var.f39006g0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f33861a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                wi0 wi0Var = this.f33862b;
                gh.d.c(wi0Var.f39009j0, wi0Var.F);
                ViewGroup viewGroup = wi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
