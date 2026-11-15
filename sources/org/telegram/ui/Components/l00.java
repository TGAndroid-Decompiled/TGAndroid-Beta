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
public final class l00 extends FrameLayout {
    public final RectF f36685a;
    public final FragmentContextView f36686b;

    public l00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f36686b = fragmentContextView;
        this.f36685a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f36686b;
        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
        g6 g6Var = fragmentContextView.f32570k0;
        if (fragmentContextView.V == 4 && fragmentContextView.f32568i0) {
            int L = org.telegram.messenger.g0.L(24.0f) + ((int) Math.ceil(g6Var.c()));
            if (L != fragmentContextView.f32566g0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f32563e0 = linearGradient;
                fragmentContextView.f32561d0.setShader(linearGradient);
                fragmentContextView.f32566g0 = L;
            }
            org.telegram.messenger.r3 groupCall = fragmentContextView.f32572n.getGroupCall();
            if (e2Var != null && groupCall != null && groupCall.j()) {
                long currentTimeMillis = (groupCall.f26208b.schedule_date * 1000) - e2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f32565f0.reset();
            fragmentContextView.f32565f0.postTranslate((-fragmentContextView.f32566g0) * 0.7f * f10, 0.0f);
            fragmentContextView.f32563e0.setLocalMatrix(fragmentContextView.f32565f0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float f11 = measuredWidth;
            float f12 = L2;
            float L3 = org.telegram.messenger.g0.L(28.0f) + L2;
            RectF rectF = this.f36685a;
            rectF.set(f11, f12, measuredWidth + L, L3);
            canvas.save();
            float a10 = fragmentContextView.f32571l0.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.g0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), fragmentContextView.f32561d0);
            canvas.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            g6Var.setBounds(0, 0, org.telegram.messenger.g0.f23609q.x, org.telegram.messenger.g0.L(16.0f));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qg qgVar;
        org.telegram.messenger.r3 groupCall;
        int i7;
        int i10;
        FragmentContextView fragmentContextView = this.f36686b;
        if (fragmentContextView.V == 4 && fragmentContextView.f32568i0 && fragmentContextView.f32571l0 != null) {
            boolean contains = this.f36685a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f32571l0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f32571l0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    k00 k00Var = fragmentContextView.f32573n0;
                    org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                    if (e2Var != null && (qgVar = fragmentContextView.f32572n) != null && (groupCall = qgVar.getGroupCall()) != null && groupCall.f26208b != null) {
                        if (fragmentContextView.T0 != 0) {
                            e2Var.getConnectionsManager().cancelRequest(fragmentContextView.T0, true);
                            fragmentContextView.T0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.f26207a);
                        TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                        boolean z10 = !fragmentContextView.f32569j0;
                        fragmentContextView.f32569j0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.T0 = e2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.m0) {
                            org.telegram.messenger.g0.r(k00Var);
                            fragmentContextView.m0 = false;
                        }
                        k00Var.run();
                        cc a02 = cc.a0(e2Var);
                        boolean z11 = fragmentContextView.f32569j0;
                        if (z11) {
                            i7 = 2131624195;
                        } else {
                            i7 = 2131624194;
                        }
                        if (z11) {
                            i10 = 2131748780;
                        } else {
                            i10 = 2131748781;
                        }
                        org.telegram.messenger.k5.n(null, i10, a02, i7, 36);
                    }
                }
                fragmentContextView.f32571l0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f32571l0.c(false);
            }
        } else {
            dc dcVar = fragmentContextView.f32571l0;
            if (dcVar != null) {
                dcVar.c(false);
            }
        }
        dc dcVar2 = fragmentContextView.f32571l0;
        if ((dcVar2 != null && dcVar2.f33917i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f36686b;
        w8 w8Var = fragmentContextView.f32560c0;
        if (w8Var != null && w8Var.getVisibility() == 0) {
            fragmentContextView.f32560c0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f36686b.f32570k0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
