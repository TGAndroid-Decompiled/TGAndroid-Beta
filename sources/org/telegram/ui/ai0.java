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
public final class ai0 extends FrameLayout {
    public final int f35794a;
    public final pi0 f35795b;

    public ai0(pi0 pi0Var, Context context, int i10) {
        super(context);
        this.f35794a = i10;
        this.f35795b = pi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f35794a) {
            case 0:
                super.dispatchDraw(canvas);
                pi0 pi0Var = this.f35795b;
                bi0 bi0Var = pi0Var.Z;
                bi0Var.e(canvas);
                ArrayList arrayList = bi0Var.F;
                boolean z10 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i2.o1.i(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.f40661r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.f40662s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.f40662s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.f40662s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.f40662s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.f40662s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    pi0Var.W.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!bi0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                pi0 pi0Var2 = this.f35795b;
                if (pi0Var2.f40581y > 0.0f && pi0Var2.h != null) {
                    pi0Var2.f40565n.reset();
                    float width = getWidth() / pi0Var2.e.getWidth();
                    pi0Var2.f40565n.postScale(width, width);
                    pi0Var2.f40557f.setLocalMatrix(pi0Var2.f40565n);
                    pi0Var2.h.setAlpha((int) (pi0Var2.f40581y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), pi0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f35794a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f35795b.onBackPressed();
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
        ci0 ci0Var;
        int height;
        switch (this.f35794a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                pi0 pi0Var = this.f35795b;
                if (!pi0Var.f40558f0 || pi0Var.f40559g0) {
                    ArrayList arrayList = pi0Var.M;
                    ii0 ii0Var = pi0Var.J;
                    if (pi0Var.E.getWidth() > 0) {
                        pi0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.tl.D(6.0f, pi0Var.V.getWidth() - pi0Var.V.l(), iArr[0])};
                        pi0Var.W.setScaleX(pi0Var.V.getScaleX());
                        pi0Var.W.setScaleY(pi0Var.V.getScaleY());
                        int[] iArr2 = pi0Var.f40566n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ii0Var.getMeasuredHeight() - pi0Var.W.getHeight();
                        if (pi0Var.f40555d0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + pi0Var.d.f12316b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = pi0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (pi0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - pi0Var.d.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (pi0Var.V.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - pi0Var.V.getHeight();
                        }
                        pi0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (ci0Var.getWidth() - pi0Var.W.l())));
                        pi0Var.W.setY(iArr[1]);
                        if (pi0Var.f40564l0) {
                            iArr[0] = iArr[0] - (pi0Var.X - pi0Var.V.l());
                        }
                        ii0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ii0Var.getMeasuredWidth());
                        if (pi0Var.f40558f0) {
                            org.telegram.messenger.tl.t(ii0Var.animate().translationY(((pi0Var.W.getHeight() + iArr[1]) - ii0Var.getMeasuredHeight()) - ii0Var.getTop()), li.m.V, 250L);
                        } else {
                            ii0Var.setY((pi0Var.W.getHeight() + iArr[1]) - ii0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = pi0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - pi0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = pi0Var.Y;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = pi0Var.W.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = pi0Var.f40554c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i2.o1.g(6.0f, (pi0Var.W.l() + iArr[0]) - pi0Var.f40554c0.getMeasuredWidth(), 0));
                            RectF rectF = pi0Var.f40563k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = pi0Var.f40554c0;
                                float max = Math.max(pi0Var.d.f12316b, rectF.top - frameLayout2.getMeasuredWidth());
                                pi0Var.f40552b0 = max;
                                frameLayout2.setY(max);
                                di0 di0Var = pi0Var.f40555d0;
                                if (di0Var != null) {
                                    di0Var.setY(Math.max(pi0Var.d.f12316b, (pi0Var.f40563k0.top - AndroidUtilities.dp(24.0f)) - pi0Var.f40555d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (pi0Var.W.getHeight() + iArr[1]) - ii0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = pi0Var.f40554c0;
                                float max2 = Math.max(pi0Var.d.f12316b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                pi0Var.f40552b0 = max2;
                                frameLayout3.setY(max2);
                                di0 di0Var2 = pi0Var.f40555d0;
                                if (di0Var2 != null) {
                                    di0Var2.setY(Math.max(0.0f, (height2 - di0Var2.getMeasuredHeight()) - pi0Var.f40552b0));
                                }
                            }
                        }
                    }
                    pi0Var.f40558f0 = true;
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
        switch (this.f35794a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                pi0 pi0Var = this.f35795b;
                hh.d.c(pi0Var.f40561i0, pi0Var.E);
                ViewGroup viewGroup = pi0Var.Y;
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
