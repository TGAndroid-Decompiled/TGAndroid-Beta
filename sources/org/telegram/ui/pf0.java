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
public final class pf0 extends FrameLayout {
    public final int f48824a;
    public final bg0 f48825b;

    public pf0(bg0 bg0Var, Context context, int i7) {
        super(context);
        this.f48824a = i7;
        this.f48825b = bg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f48824a) {
            case 0:
                super.dispatchDraw(canvas);
                bg0 bg0Var = this.f48825b;
                qf0 qf0Var = bg0Var.Z;
                qf0Var.e(canvas);
                ArrayList arrayList = qf0Var.F;
                boolean z9 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    hx hxVar = (hx) jg.g.i(1, arrayList);
                    ImageReceiver imageReceiver = hxVar.f46511r;
                    org.telegram.messenger.hc hcVar = imageReceiver.f21189f0;
                    if (hcVar == null) {
                        hcVar = imageReceiver.O;
                    }
                    if (hcVar == null) {
                        hcVar = imageReceiver.W;
                    }
                    if (hcVar != null) {
                        if (hxVar.f46512s == null) {
                            TLRPC.Document document = hcVar.f22858i;
                            if (document != null) {
                                hxVar.f46512s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                hxVar.f46512s = org.telegram.messenger.w7.r("tgs", hcVar.f22856f);
                            }
                        }
                        if (hxVar.f46512s != null) {
                            Float w10 = org.telegram.messenger.gc.D().w(hxVar.f46512s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    bg0Var.W.f((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!qf0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                bg0 bg0Var2 = this.f48825b;
                if (bg0Var2.D > 0.0f && bg0Var2.h != null) {
                    bg0Var2.f44317n.reset();
                    float width = getWidth() / bg0Var2.f44307e.getWidth();
                    bg0Var2.f44317n.postScale(width, width);
                    bg0Var2.f44309f.setLocalMatrix(bg0Var2.f44317n);
                    bg0Var2.h.setAlpha((int) (bg0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), bg0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f48824a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f48825b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        int measuredHeight;
        rf0 rf0Var;
        int height;
        switch (this.f48824a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                bg0 bg0Var = this.f48825b;
                if (!bg0Var.f44310f0 || bg0Var.f44311g0) {
                    ArrayList arrayList = bg0Var.M;
                    xf0 xf0Var = bg0Var.J;
                    if (bg0Var.E.getWidth() > 0) {
                        bg0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, bg0Var.V.getWidth() - bg0Var.V.l(), iArr[0])};
                        bg0Var.W.setScaleX(bg0Var.V.getScaleX());
                        bg0Var.W.setScaleY(bg0Var.V.getScaleY());
                        int[] iArr2 = bg0Var.f44318n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = xf0Var.getMeasuredHeight() - bg0Var.W.getHeight();
                        if (bg0Var.f44306d0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + bg0Var.d.f15118b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = bg0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (bg0Var.F.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - bg0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (bg0Var.V.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - bg0Var.V.getHeight();
                        }
                        bg0Var.W.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (rf0Var.getWidth() - bg0Var.W.l())));
                        bg0Var.W.setY(iArr[1]);
                        if (bg0Var.f44316l0) {
                            iArr[0] = iArr[0] - (bg0Var.X - bg0Var.V.l());
                        }
                        xf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - xf0Var.getMeasuredWidth());
                        if (bg0Var.f44310f0) {
                            org.telegram.messenger.camera.q.l(xf0Var.animate().translationY(((bg0Var.W.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight()) - xf0Var.getTop()), mi.l.V, 250L);
                        } else {
                            xf0Var.setY((bg0Var.W.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = bg0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - bg0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = bg0Var.Y;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = bg0Var.W.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = bg0Var.f44305c0;
                        if (frameLayout != null) {
                            frameLayout.setX(jg.g.e(6.0f, (bg0Var.W.l() + iArr[0]) - bg0Var.f44305c0.getMeasuredWidth(), 0));
                            RectF rectF = bg0Var.f44315k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = bg0Var.f44305c0;
                                float max = Math.max(bg0Var.d.f15118b, rectF.top - frameLayout2.getMeasuredWidth());
                                bg0Var.f44303b0 = max;
                                frameLayout2.setY(max);
                                sf0 sf0Var = bg0Var.f44306d0;
                                if (sf0Var != null) {
                                    sf0Var.setY(Math.max(bg0Var.d.f15118b, (bg0Var.f44315k0.top - org.telegram.messenger.g0.L(24.0f)) - bg0Var.f44306d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (bg0Var.W.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = bg0Var.f44305c0;
                                float max2 = Math.max(bg0Var.d.f15118b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                bg0Var.f44303b0 = max2;
                                frameLayout3.setY(max2);
                                sf0 sf0Var2 = bg0Var.f44306d0;
                                if (sf0Var2 != null) {
                                    sf0Var2.setY(Math.max(0.0f, (height2 - sf0Var2.getMeasuredHeight()) - bg0Var.f44303b0));
                                }
                            }
                        }
                    }
                    bg0Var.f44310f0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f48824a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                bg0 bg0Var = this.f48825b;
                ih.d.c(bg0Var.f44313i0, bg0Var.E);
                ViewGroup viewGroup = bg0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
