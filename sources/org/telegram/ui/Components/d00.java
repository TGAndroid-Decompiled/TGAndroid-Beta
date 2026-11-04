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
public final class d00 extends FrameLayout {
    public final RectF f32880a;
    public final FragmentContextView f32881b;

    public d00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f32881b = fragmentContextView;
        this.f32880a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f32881b;
        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
        g6 g6Var = fragmentContextView.f31463k0;
        if (fragmentContextView.V == 4 && fragmentContextView.f31461i0) {
            int L = org.telegram.messenger.g0.L(24.0f) + ((int) Math.ceil(g6Var.c()));
            if (L != fragmentContextView.f31459g0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f31456e0 = linearGradient;
                fragmentContextView.f31454d0.setShader(linearGradient);
                fragmentContextView.f31459g0 = L;
            }
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31465n.getGroupCall();
            if (d2Var != null && groupCall != null && groupCall.j()) {
                long currentTimeMillis = (groupCall.f25049b.schedule_date * 1000) - d2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f31458f0.reset();
            fragmentContextView.f31458f0.postTranslate((-fragmentContextView.f31459g0) * 0.7f * f10, 0.0f);
            fragmentContextView.f31456e0.setLocalMatrix(fragmentContextView.f31458f0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float f11 = measuredWidth;
            float f12 = L2;
            float L3 = org.telegram.messenger.g0.L(28.0f) + L2;
            RectF rectF = this.f32880a;
            rectF.set(f11, f12, measuredWidth + L, L3);
            canvas.save();
            float a10 = fragmentContextView.f31464l0.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.g0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), fragmentContextView.f31454d0);
            canvas.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            g6Var.setBounds(0, 0, org.telegram.messenger.g0.f22608q.x, org.telegram.messenger.g0.L(16.0f));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ig igVar;
        org.telegram.messenger.r3 groupCall;
        int i3;
        int i10;
        FragmentContextView fragmentContextView = this.f32881b;
        if (fragmentContextView.V == 4 && fragmentContextView.f31461i0 && fragmentContextView.f31464l0 != null) {
            boolean contains = this.f32880a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f31464l0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f31464l0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    c00 c00Var = fragmentContextView.f31466n0;
                    org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                    if (d2Var != null && (igVar = fragmentContextView.f31465n) != null && (groupCall = igVar.getGroupCall()) != null && groupCall.f25049b != null) {
                        if (fragmentContextView.T0 != 0) {
                            d2Var.getConnectionsManager().cancelRequest(fragmentContextView.T0, true);
                            fragmentContextView.T0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.f25048a);
                        TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                        boolean z10 = !fragmentContextView.f31462j0;
                        fragmentContextView.f31462j0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.T0 = d2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.m0) {
                            org.telegram.messenger.g0.r(c00Var);
                            fragmentContextView.m0 = false;
                        }
                        c00Var.run();
                        fc a02 = fc.a0(d2Var);
                        boolean z11 = fragmentContextView.f31462j0;
                        if (z11) {
                            i3 = 2131624194;
                        } else {
                            i3 = 2131624193;
                        }
                        if (z11) {
                            i10 = 2131748788;
                        } else {
                            i10 = 2131748789;
                        }
                        org.telegram.messenger.k5.o(null, i10, a02, i3, 36);
                    }
                }
                fragmentContextView.f31464l0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f31464l0.c(false);
            }
        } else {
            gc gcVar = fragmentContextView.f31464l0;
            if (gcVar != null) {
                gcVar.c(false);
            }
        }
        gc gcVar2 = fragmentContextView.f31464l0;
        if ((gcVar2 != null && gcVar2.f34049i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f32881b;
        x8 x8Var = fragmentContextView.f31453c0;
        if (x8Var != null && x8Var.getVisibility() == 0) {
            fragmentContextView.f31453c0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32881b.f31463k0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
