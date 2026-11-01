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
public final class v00 extends FrameLayout {
    public final RectF f31132a;
    public final FragmentContextView f31133b;

    public v00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f31133b = fragmentContextView;
        this.f31132a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f31133b;
        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
        e6 e6Var = fragmentContextView.f24044j0;
        if (fragmentContextView.U == 4 && fragmentContextView.f24042h0) {
            int L = org.telegram.messenger.i0.L(24.0f) + ((int) Math.ceil(e6Var.c()));
            if (L != fragmentContextView.f24040f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f24037d0 = linearGradient;
                fragmentContextView.f24036c0.setShader(linearGradient);
                fragmentContextView.f24040f0 = L;
            }
            org.telegram.messenger.u3 groupCall = fragmentContextView.f24047n.getGroupCall();
            if (k2Var != null && groupCall != null && groupCall.j()) {
                long currentTimeMillis = (groupCall.f18361b.schedule_date * 1000) - k2Var.getConnectionsManager().getCurrentTimeMillis();
                f7 = 1.0f;
                if (currentTimeMillis >= 0) {
                    if (currentTimeMillis < 5000) {
                        f7 = 1.0f - (((float) currentTimeMillis) / 5000.0f);
                    } else {
                        f7 = 0.0f;
                    }
                }
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            } else {
                f7 = 0.0f;
            }
            fragmentContextView.f24038e0.reset();
            fragmentContextView.f24038e0.postTranslate((-fragmentContextView.f24040f0) * 0.7f * f7, 0.0f);
            fragmentContextView.f24037d0.setLocalMatrix(fragmentContextView.f24038e0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.i0.L(10.0f);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            float f10 = measuredWidth;
            float f11 = L2;
            float L3 = org.telegram.messenger.i0.L(28.0f) + L2;
            RectF rectF = this.f31132a;
            rectF.set(f10, f11, measuredWidth + L, L3);
            canvas.save();
            float a2 = fragmentContextView.f24045k0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.i0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), fragmentContextView.f24036c0);
            canvas.translate(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
            e6Var.setBounds(0, 0, org.telegram.messenger.i0.f16172q.x, org.telegram.messenger.i0.L(16.0f));
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gg ggVar;
        org.telegram.messenger.u3 groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f31133b;
        if (fragmentContextView.U == 4 && fragmentContextView.f24042h0 && fragmentContextView.f24045k0 != null) {
            boolean contains = this.f31132a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f24045k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f24045k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    u00 u00Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                    if (k2Var != null && (ggVar = fragmentContextView.f24047n) != null && (groupCall = ggVar.getGroupCall()) != null && groupCall.f18361b != null) {
                        if (fragmentContextView.S0 != 0) {
                            k2Var.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.f18360a);
                        TLRPC.GroupCall groupCall2 = groupCall.f18361b;
                        boolean z10 = !fragmentContextView.f24043i0;
                        fragmentContextView.f24043i0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.S0 = k2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f24046l0) {
                            org.telegram.messenger.i0.r(u00Var);
                            fragmentContextView.f24046l0 = false;
                        }
                        u00Var.run();
                        cc a02 = cc.a0(k2Var);
                        boolean z11 = fragmentContextView.f24043i0;
                        if (z11) {
                            i10 = 2131624192;
                        } else {
                            i10 = 2131624191;
                        }
                        if (z11) {
                            i11 = 2131748790;
                        } else {
                            i11 = 2131748791;
                        }
                        org.telegram.messenger.m5.n(null, i11, a02, i10, 36);
                    }
                }
                fragmentContextView.f24045k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f24045k0.c(false);
            }
        } else {
            dc dcVar = fragmentContextView.f24045k0;
            if (dcVar != null) {
                dcVar.c(false);
            }
        }
        dc dcVar2 = fragmentContextView.f24045k0;
        if ((dcVar2 != null && dcVar2.f25465i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f31133b;
        u8 u8Var = fragmentContextView.f24034b0;
        if (u8Var != null && u8Var.getVisibility() == 0) {
            fragmentContextView.f24034b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31133b.f24044j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
