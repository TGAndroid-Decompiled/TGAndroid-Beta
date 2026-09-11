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
public final class ni0 extends FrameLayout {
    public final int f38964a;
    public final cj0 f38965b;

    public ni0(cj0 cj0Var, Context context, int i10) {
        super(context);
        this.f38964a = i10;
        this.f38965b = cj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f38964a) {
            case 0:
                super.dispatchDraw(canvas);
                cj0 cj0Var = this.f38965b;
                oi0 oi0Var = cj0Var.f35128a0;
                oi0Var.e(canvas);
                ArrayList arrayList = oi0Var.F;
                boolean z11 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    fz fzVar = (fz) i2.g.h(1, arrayList);
                    ImageReceiver imageReceiver = fzVar.f36511r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (fzVar.f36512s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                fzVar.f36512s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                fzVar.f36512s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (fzVar.f36512s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(fzVar.f36512s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    cj0Var.X.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!oi0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                cj0 cj0Var2 = this.f38965b;
                kb0 kb0Var = cj0Var2.d;
                if (kb0Var != null) {
                    if (cj0Var2.E == 1.0f && cj0Var2.f35144n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kb0Var.a(z10);
                }
                if (cj0Var2.E > 0.0f && cj0Var2.f35144n != null) {
                    cj0Var2.f35149r.reset();
                    float width = getWidth() / cj0Var2.f35136f.getWidth();
                    cj0Var2.f35149r.postScale(width, width);
                    cj0Var2.h.setLocalMatrix(cj0Var2.f35149r);
                    cj0Var2.f35144n.setAlpha((int) (cj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), cj0Var2.f35144n);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f38964a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38965b.onBackPressed();
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
        pi0 pi0Var;
        int height;
        switch (this.f38964a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                cj0 cj0Var = this.f38965b;
                if (!cj0Var.f35138g0 || cj0Var.f35139h0) {
                    ArrayList arrayList = cj0Var.N;
                    vi0 vi0Var = cj0Var.K;
                    if (cj0Var.F.getWidth() > 0) {
                        cj0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.vl.D(6.0f, cj0Var.W.getWidth() - cj0Var.W.l(), iArr[0])};
                        cj0Var.X.setScaleX(cj0Var.W.getScaleX());
                        cj0Var.X.setScaleY(cj0Var.W.getScaleY());
                        int[] iArr2 = cj0Var.f35146o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = vi0Var.getMeasuredHeight() - cj0Var.X.getHeight();
                        if (cj0Var.f35135e0 != null) {
                            i14 = AndroidUtilities.dp(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int dp = AndroidUtilities.dp(8.0f) + cj0Var.f35134e.f11426b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int dp2 = AndroidUtilities.dp(f7);
                        ViewGroup viewGroup = cj0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = dp2 + measuredHeight;
                        int measuredHeight3 = (cj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - cj0Var.f35134e.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < dp) {
                            iArr[1] = dp + i15;
                        }
                        if (cj0Var.W.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - cj0Var.W.getHeight();
                        }
                        cj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (pi0Var.getWidth() - cj0Var.X.l())));
                        cj0Var.X.setY(iArr[1]);
                        if (cj0Var.m0) {
                            iArr[0] = iArr[0] - (cj0Var.Y - cj0Var.W.l());
                        }
                        vi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - vi0Var.getMeasuredWidth());
                        if (cj0Var.f35138g0) {
                            org.telegram.messenger.vl.q(vi0Var.animate().translationY(((cj0Var.X.getHeight() + iArr[1]) - vi0Var.getMeasuredHeight()) - vi0Var.getTop()), ki.o.V, 250L);
                        } else {
                            vi0Var.setY((cj0Var.X.getHeight() + iArr[1]) - vi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = cj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - cj0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = cj0Var.Z;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -AndroidUtilities.dp(6.0f);
                            } else {
                                height = cj0Var.X.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = cj0Var.f35133d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i2.g.f(6.0f, (cj0Var.X.l() + iArr[0]) - cj0Var.f35133d0.getMeasuredWidth(), 0));
                            RectF rectF = cj0Var.f35143l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = cj0Var.f35133d0;
                                float max = Math.max(cj0Var.f35134e.f11426b, rectF.top - frameLayout2.getMeasuredWidth());
                                cj0Var.f35132c0 = max;
                                frameLayout2.setY(max);
                                qi0 qi0Var = cj0Var.f35135e0;
                                if (qi0Var != null) {
                                    qi0Var.setY(Math.max(cj0Var.f35134e.f11426b, (cj0Var.f35143l0.top - AndroidUtilities.dp(24.0f)) - cj0Var.f35135e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (cj0Var.X.getHeight() + iArr[1]) - vi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = cj0Var.f35133d0;
                                float max2 = Math.max(cj0Var.f35134e.f11426b, height2 - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                cj0Var.f35132c0 = max2;
                                frameLayout3.setY(max2);
                                qi0 qi0Var2 = cj0Var.f35135e0;
                                if (qi0Var2 != null) {
                                    qi0Var2.setY(Math.max(0.0f, (height2 - qi0Var2.getMeasuredHeight()) - cj0Var.f35132c0));
                                }
                            }
                        }
                    }
                    cj0Var.f35138g0 = true;
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
        switch (this.f38964a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                cj0 cj0Var = this.f38965b;
                hh.d.c(cj0Var.f35141j0, cj0Var.F);
                ViewGroup viewGroup = cj0Var.Z;
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
