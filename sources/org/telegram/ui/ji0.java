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
public final class ji0 extends FrameLayout {
    public final int f34746a;
    public final yi0 f34747b;

    public ji0(yi0 yi0Var, Context context, int i10) {
        super(context);
        this.f34746a = i10;
        this.f34747b = yi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f34746a) {
            case 0:
                super.dispatchDraw(canvas);
                yi0 yi0Var = this.f34747b;
                ki0 ki0Var = yi0Var.f40222a0;
                ki0Var.e(canvas);
                ArrayList arrayList = ki0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ez ezVar = (ez) hg.k0.g(1, arrayList);
                    ImageReceiver imageReceiver = ezVar.f33366r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (ezVar.f33367s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                ezVar.f33367s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                ezVar.f33367s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (ezVar.f33367s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(ezVar.f33367s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    yi0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!ki0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                yi0 yi0Var2 = this.f34747b;
                hb0 hb0Var = yi0Var2.d;
                if (hb0Var != null) {
                    if (yi0Var2.E == 1.0f && yi0Var2.f40237n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hb0Var.a(z10);
                }
                if (yi0Var2.E > 0.0f && yi0Var2.f40237n != null) {
                    yi0Var2.f40242r.reset();
                    float width = getWidth() / yi0Var2.f40229f.getWidth();
                    yi0Var2.f40242r.postScale(width, width);
                    yi0Var2.h.setLocalMatrix(yi0Var2.f40242r);
                    yi0Var2.f40237n.setAlpha((int) (yi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yi0Var2.f40237n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f34746a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34747b.onBackPressed();
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
        li0 li0Var;
        int height;
        switch (this.f34746a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                yi0 yi0Var = this.f34747b;
                if (!yi0Var.f40231g0 || yi0Var.f40232h0) {
                    ArrayList arrayList = yi0Var.N;
                    ri0 ri0Var = yi0Var.K;
                    if (yi0Var.F.getWidth() > 0) {
                        yi0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.qk.D(6.0f, yi0Var.W.getWidth() - yi0Var.W.l(), iArr[0])};
                        yi0Var.X.setScaleX(yi0Var.W.getScaleX());
                        yi0Var.X.setScaleY(yi0Var.W.getScaleY());
                        int[] iArr2 = yi0Var.f40239o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ri0Var.getMeasuredHeight() - yi0Var.X.getHeight();
                        if (yi0Var.f40228e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + yi0Var.e.f10580b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = yi0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (yi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - yi0Var.e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (yi0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - yi0Var.W.getHeight();
                        }
                        yi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (li0Var.getWidth() - yi0Var.X.l())));
                        yi0Var.X.setY(iArr[1]);
                        if (yi0Var.m0) {
                            iArr[0] = iArr[0] - (yi0Var.Y - yi0Var.W.l());
                        }
                        ri0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ri0Var.getMeasuredWidth());
                        if (yi0Var.f40231g0) {
                            org.telegram.messenger.qk.s(ri0Var.animate().translationY(((yi0Var.X.getHeight() + iArr[1]) - ri0Var.getMeasuredHeight()) - ri0Var.getTop()), ji.n.V, 250L);
                        } else {
                            ri0Var.setY((yi0Var.X.getHeight() + iArr[1]) - ri0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = yi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - yi0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = yi0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = yi0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = yi0Var.f40227d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.l0.b(6.0f, (yi0Var.X.l() + iArr[0]) - yi0Var.f40227d0.getMeasuredWidth(), 0));
                            RectF rectF = yi0Var.f40236l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = yi0Var.f40227d0;
                                float max = Math.max(yi0Var.e.f10580b, rectF.top - frameLayout2.getMeasuredWidth());
                                yi0Var.f40226c0 = max;
                                frameLayout2.setY(max);
                                mi0 mi0Var = yi0Var.f40228e0;
                                if (mi0Var != null) {
                                    mi0Var.setY(Math.max(yi0Var.e.f10580b, (yi0Var.f40236l0.top - AndroidUtilities.dp(24.0f)) - yi0Var.f40228e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (yi0Var.X.getHeight() + iArr[1]) - ri0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = yi0Var.f40227d0;
                                float max2 = Math.max(yi0Var.e.f10580b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                yi0Var.f40226c0 = max2;
                                frameLayout3.setY(max2);
                                mi0 mi0Var2 = yi0Var.f40228e0;
                                if (mi0Var2 != null) {
                                    mi0Var2.setY(Math.max(0.0f, (height2 - mi0Var2.getMeasuredHeight()) - yi0Var.f40226c0));
                                }
                            }
                        }
                    }
                    yi0Var.f40231g0 = true;
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
        switch (this.f34746a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                yi0 yi0Var = this.f34747b;
                gh.d.c(yi0Var.f40234j0, yi0Var.F);
                ViewGroup viewGroup = yi0Var.Z;
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
