package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jf0 extends FrameLayout {
    public final int f46617a;
    public final vf0 f46618b;

    public jf0(vf0 vf0Var, Context context, int i3) {
        super(context);
        this.f46617a = i3;
        this.f46618b = vf0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f46617a) {
            case 0:
                super.dispatchDraw(canvas);
                vf0 vf0Var = this.f46618b;
                kf0 kf0Var = vf0Var.f50473a0;
                kf0Var.e(canvas);
                ArrayList arrayList = kf0Var.G;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ex exVar = (ex) k2.p1.h(1, arrayList);
                    ImageReceiver imageReceiver = exVar.f45078r;
                    org.telegram.messenger.ac acVar = imageReceiver.f21244g0;
                    if (acVar == null) {
                        acVar = imageReceiver.P;
                    }
                    if (acVar == null) {
                        acVar = imageReceiver.X;
                    }
                    if (acVar != null) {
                        if (exVar.f45079s == null) {
                            TLRPC.Document document = acVar.f21490i;
                            if (document != null) {
                                exVar.f45079s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                exVar.f45079s = org.telegram.messenger.w7.r("tgs", acVar.f21488f);
                            }
                        }
                        if (exVar.f45079s != null) {
                            Float w10 = org.telegram.messenger.zb.D().w(exVar.f45079s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    vf0Var.X.f((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!kf0Var.G.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                vf0 vf0Var2 = this.f46618b;
                if (vf0Var2.E > 0.0f && vf0Var2.h != null) {
                    vf0Var2.f50489n.reset();
                    float width = getWidth() / vf0Var2.f50479e.getWidth();
                    vf0Var2.f50489n.postScale(width, width);
                    vf0Var2.f50481f.setLocalMatrix(vf0Var2.f50489n);
                    vf0Var2.h.setAlpha((int) (vf0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), vf0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f46617a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f46618b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        float f10;
        int measuredHeight;
        lf0 lf0Var;
        int height;
        switch (this.f46617a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                vf0 vf0Var = this.f46618b;
                if (!vf0Var.f50483g0 || vf0Var.f50484h0) {
                    ArrayList arrayList = vf0Var.N;
                    rf0 rf0Var = vf0Var.K;
                    if (vf0Var.F.getWidth() > 0) {
                        vf0Var.W.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, vf0Var.W.getWidth() - vf0Var.W.l(), iArr[0])};
                        vf0Var.X.setScaleX(vf0Var.W.getScaleX());
                        vf0Var.X.setScaleY(vf0Var.W.getScaleY());
                        int[] iArr2 = vf0Var.f50491o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = rf0Var.getMeasuredHeight() - vf0Var.X.getHeight();
                        if (vf0Var.f50480e0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + vf0Var.d.f14496b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = vf0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (vf0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - vf0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (vf0Var.W.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - vf0Var.W.getHeight();
                        }
                        vf0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (lf0Var.getWidth() - vf0Var.X.l())));
                        vf0Var.X.setY(iArr[1]);
                        if (vf0Var.m0) {
                            iArr[0] = iArr[0] - (vf0Var.Y - vf0Var.W.l());
                        }
                        rf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - rf0Var.getMeasuredWidth());
                        if (vf0Var.f50483g0) {
                            org.telegram.messenger.camera.q.l(rf0Var.animate().translationY(((vf0Var.X.getHeight() + iArr[1]) - rf0Var.getMeasuredHeight()) - rf0Var.getTop()), ni.l.V, 250L);
                        } else {
                            rf0Var.setY((vf0Var.X.getHeight() + iArr[1]) - rf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = vf0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - vf0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = vf0Var.Z;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = vf0Var.X.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = vf0Var.f50478d0;
                        if (frameLayout != null) {
                            frameLayout.setX(k2.p1.d(6.0f, (vf0Var.X.l() + iArr[0]) - vf0Var.f50478d0.getMeasuredWidth(), 0));
                            RectF rectF = vf0Var.f50488l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = vf0Var.f50478d0;
                                float max = Math.max(vf0Var.d.f14496b, rectF.top - frameLayout2.getMeasuredWidth());
                                vf0Var.f50477c0 = max;
                                frameLayout2.setY(max);
                                mf0 mf0Var = vf0Var.f50480e0;
                                if (mf0Var != null) {
                                    mf0Var.setY(Math.max(vf0Var.d.f14496b, (vf0Var.f50488l0.top - org.telegram.messenger.g0.L(24.0f)) - vf0Var.f50480e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (vf0Var.X.getHeight() + iArr[1]) - rf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = vf0Var.f50478d0;
                                float max2 = Math.max(vf0Var.d.f14496b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                vf0Var.f50477c0 = max2;
                                frameLayout3.setY(max2);
                                mf0 mf0Var2 = vf0Var.f50480e0;
                                if (mf0Var2 != null) {
                                    mf0Var2.setY(Math.max(0.0f, (height2 - mf0Var2.getMeasuredHeight()) - vf0Var.f50477c0));
                                }
                            }
                        }
                    }
                    vf0Var.f50483g0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f46617a) {
            case 1:
                super.onSizeChanged(i3, i10, i11, i12);
                vf0 vf0Var = this.f46618b;
                jh.d.c(vf0Var.f50486j0, vf0Var.F);
                ViewGroup viewGroup = vf0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }
}
