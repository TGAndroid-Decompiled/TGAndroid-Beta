package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class h00 extends FrameLayout {
    public final RectF f34112a;
    public final FragmentContextView f34113b;

    public h00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f34113b = fragmentContextView;
        this.f34112a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f34113b;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        h6 h6Var = fragmentContextView.f31407j0;
        if (fragmentContextView.U == 4 && fragmentContextView.f31405h0) {
            int L = org.telegram.messenger.g0.L(24.0f) + ((int) Math.ceil(h6Var.c()));
            if (L != fragmentContextView.f31403f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f31399d0 = linearGradient;
                fragmentContextView.f31398c0.setShader(linearGradient);
                fragmentContextView.f31403f0 = L;
            }
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31410n.getGroupCall();
            if (f2Var != null && groupCall != null && groupCall.j()) {
                long currentTimeMillis = (groupCall.f25226b.schedule_date * 1000) - f2Var.getConnectionsManager().getCurrentTimeMillis();
                f10 = 1.0f;
                if (currentTimeMillis >= 0) {
                    if (currentTimeMillis < 5000) {
                        f10 = 1.0f - (((float) currentTimeMillis) / 5000.0f);
                    } else {
                        f10 = 0.0f;
                    }
                }
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            } else {
                f10 = 0.0f;
            }
            fragmentContextView.f31401e0.reset();
            fragmentContextView.f31401e0.postTranslate((-fragmentContextView.f31403f0) * 0.7f * f10, 0.0f);
            fragmentContextView.f31399d0.setLocalMatrix(fragmentContextView.f31401e0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float f11 = measuredWidth;
            float f12 = L2;
            float L3 = org.telegram.messenger.g0.L(28.0f) + L2;
            RectF rectF = this.f34112a;
            rectF.set(f11, f12, measuredWidth + L, L3);
            canvas.save();
            float a10 = fragmentContextView.f31408k0.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.g0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), fragmentContextView.f31398c0);
            canvas.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            h6Var.setBounds(0, 0, org.telegram.messenger.g0.f22567q.x, org.telegram.messenger.g0.L(16.0f));
            h6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jg jgVar;
        org.telegram.messenger.r3 groupCall;
        int i7;
        int i10;
        FragmentContextView fragmentContextView = this.f34113b;
        if (fragmentContextView.U == 4 && fragmentContextView.f31405h0 && fragmentContextView.f31408k0 != null) {
            boolean contains = this.f34112a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f31408k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f31408k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    g00 g00Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                    if (f2Var != null && (jgVar = fragmentContextView.f31410n) != null && (groupCall = jgVar.getGroupCall()) != null && groupCall.f25226b != null) {
                        if (fragmentContextView.S0 != 0) {
                            f2Var.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.f25225a);
                        TLRPC.GroupCall groupCall2 = groupCall.f25226b;
                        boolean z9 = !fragmentContextView.f31406i0;
                        fragmentContextView.f31406i0 = z9;
                        groupCall2.schedule_start_subscribed = z9;
                        togglegroupcallstartsubscription.subscribed = z9;
                        fragmentContextView.S0 = f2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f31409l0) {
                            org.telegram.messenger.g0.r(g00Var);
                            fragmentContextView.f31409l0 = false;
                        }
                        g00Var.run();
                        gc a02 = gc.a0(f2Var);
                        boolean z10 = fragmentContextView.f31406i0;
                        if (z10) {
                            i7 = 2131624194;
                        } else {
                            i7 = 2131624193;
                        }
                        if (z10) {
                            i10 = 2131748780;
                        } else {
                            i10 = 2131748781;
                        }
                        org.telegram.messenger.k5.o(null, i10, a02, i7, 36);
                    }
                }
                fragmentContextView.f31408k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f31408k0.c(false);
            }
        } else {
            hc hcVar = fragmentContextView.f31408k0;
            if (hcVar != null) {
                hcVar.c(false);
            }
        }
        hc hcVar2 = fragmentContextView.f31408k0;
        if ((hcVar2 != null && hcVar2.f34302i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f34113b;
        y8 y8Var = fragmentContextView.f31396b0;
        if (y8Var != null && y8Var.getVisibility() == 0) {
            fragmentContextView.f31396b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34113b.f31407j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
