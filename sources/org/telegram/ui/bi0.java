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
public final class bi0 extends FrameLayout {
    public final int f36118a;
    public final qi0 f36119b;

    public bi0(qi0 qi0Var, Context context, int i10) {
        super(context);
        this.f36118a = i10;
        this.f36119b = qi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f36118a) {
            case 0:
                super.dispatchDraw(canvas);
                qi0 qi0Var = this.f36119b;
                ci0 ci0Var = qi0Var.Z;
                ci0Var.e(canvas);
                ArrayList arrayList = ci0Var.F;
                boolean z10 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i2.o1.i(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.f40572r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.f40573s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.f40573s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.f40573s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.f40573s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.f40573s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    qi0Var.W.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!ci0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                qi0 qi0Var2 = this.f36119b;
                if (qi0Var2.f40850y > 0.0f && qi0Var2.h != null) {
                    qi0Var2.f40834n.reset();
                    float width = getWidth() / qi0Var2.e.getWidth();
                    qi0Var2.f40834n.postScale(width, width);
                    qi0Var2.f40826f.setLocalMatrix(qi0Var2.f40834n);
                    qi0Var2.h.setAlpha((int) (qi0Var2.f40850y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), qi0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f36118a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36119b.onBackPressed();
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
        di0 di0Var;
        int height;
        switch (this.f36118a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                qi0 qi0Var = this.f36119b;
                if (!qi0Var.f40827f0 || qi0Var.f40828g0) {
                    ArrayList arrayList = qi0Var.M;
                    ji0 ji0Var = qi0Var.J;
                    if (qi0Var.E.getWidth() > 0) {
                        qi0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.sl.D(6.0f, qi0Var.V.getWidth() - qi0Var.V.l(), iArr[0])};
                        qi0Var.W.setScaleX(qi0Var.V.getScaleX());
                        qi0Var.W.setScaleY(qi0Var.V.getScaleY());
                        int[] iArr2 = qi0Var.f40835n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ji0Var.getMeasuredHeight() - qi0Var.W.getHeight();
                        if (qi0Var.f40824d0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + qi0Var.d.f12316b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = qi0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (qi0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - qi0Var.d.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (qi0Var.V.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - qi0Var.V.getHeight();
                        }
                        qi0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (di0Var.getWidth() - qi0Var.W.l())));
                        qi0Var.W.setY(iArr[1]);
                        if (qi0Var.f40833l0) {
                            iArr[0] = iArr[0] - (qi0Var.X - qi0Var.V.l());
                        }
                        ji0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ji0Var.getMeasuredWidth());
                        if (qi0Var.f40827f0) {
                            org.telegram.messenger.sl.t(ji0Var.animate().translationY(((qi0Var.W.getHeight() + iArr[1]) - ji0Var.getMeasuredHeight()) - ji0Var.getTop()), li.m.V, 250L);
                        } else {
                            ji0Var.setY((qi0Var.W.getHeight() + iArr[1]) - ji0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = qi0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - qi0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = qi0Var.Y;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = qi0Var.W.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = qi0Var.f40823c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i2.o1.g(6.0f, (qi0Var.W.l() + iArr[0]) - qi0Var.f40823c0.getMeasuredWidth(), 0));
                            RectF rectF = qi0Var.f40832k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = qi0Var.f40823c0;
                                float max = Math.max(qi0Var.d.f12316b, rectF.top - frameLayout2.getMeasuredWidth());
                                qi0Var.f40821b0 = max;
                                frameLayout2.setY(max);
                                ei0 ei0Var = qi0Var.f40824d0;
                                if (ei0Var != null) {
                                    ei0Var.setY(Math.max(qi0Var.d.f12316b, (qi0Var.f40832k0.top - AndroidUtilities.dp(24.0f)) - qi0Var.f40824d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (qi0Var.W.getHeight() + iArr[1]) - ji0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = qi0Var.f40823c0;
                                float max2 = Math.max(qi0Var.d.f12316b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                qi0Var.f40821b0 = max2;
                                frameLayout3.setY(max2);
                                ei0 ei0Var2 = qi0Var.f40824d0;
                                if (ei0Var2 != null) {
                                    ei0Var2.setY(Math.max(0.0f, (height2 - ei0Var2.getMeasuredHeight()) - qi0Var.f40821b0));
                                }
                            }
                        }
                    }
                    qi0Var.f40827f0 = true;
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
        switch (this.f36118a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                qi0 qi0Var = this.f36119b;
                hh.d.c(qi0Var.f40830i0, qi0Var.E);
                ViewGroup viewGroup = qi0Var.Y;
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
