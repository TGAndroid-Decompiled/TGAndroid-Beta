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
public final class s00 extends FrameLayout {
    public final RectF f39446a;
    public final FragmentContextView f39447b;

    public s00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f39447b = fragmentContextView;
        this.f39446a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f39447b;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        m6 m6Var = fragmentContextView.f33067k0;
        if (fragmentContextView.V == 4 && fragmentContextView.f33065i0) {
            int L = org.telegram.messenger.g0.L(24.0f) + ((int) Math.ceil(m6Var.c()));
            if (L != fragmentContextView.f33063g0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f33060e0 = linearGradient;
                fragmentContextView.f33058d0.setShader(linearGradient);
                fragmentContextView.f33063g0 = L;
            }
            org.telegram.messenger.t3 groupCall = fragmentContextView.f33069n.getGroupCall();
            if (g2Var != null && groupCall != null && groupCall.j()) {
                long currentTimeMillis = (groupCall.f27034b.schedule_date * 1000) - g2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f33062f0.reset();
            fragmentContextView.f33062f0.postTranslate((-fragmentContextView.f33063g0) * 0.7f * f10, 0.0f);
            fragmentContextView.f33060e0.setLocalMatrix(fragmentContextView.f33062f0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float f11 = measuredWidth;
            float f12 = L2;
            float L3 = org.telegram.messenger.g0.L(28.0f) + L2;
            RectF rectF = this.f39446a;
            rectF.set(f11, f12, measuredWidth + L, L3);
            canvas.save();
            float a10 = fragmentContextView.f33068l0.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.g0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), fragmentContextView.f33058d0);
            canvas.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            m6Var.setBounds(0, 0, org.telegram.messenger.g0.f24226q.x, org.telegram.messenger.g0.L(16.0f));
            m6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ah ahVar;
        org.telegram.messenger.t3 groupCall;
        int i7;
        int i10;
        FragmentContextView fragmentContextView = this.f39447b;
        if (fragmentContextView.V == 4 && fragmentContextView.f33065i0 && fragmentContextView.f33068l0 != null) {
            boolean contains = this.f39446a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f33068l0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f33068l0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    r00 r00Var = fragmentContextView.f33070n0;
                    org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                    if (g2Var != null && (ahVar = fragmentContextView.f33069n) != null && (groupCall = ahVar.getGroupCall()) != null && groupCall.f27034b != null) {
                        if (fragmentContextView.T0 != 0) {
                            g2Var.getConnectionsManager().cancelRequest(fragmentContextView.T0, true);
                            fragmentContextView.T0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.f27033a);
                        TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                        boolean z10 = !fragmentContextView.f33066j0;
                        fragmentContextView.f33066j0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.T0 = g2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.m0) {
                            org.telegram.messenger.g0.r(r00Var);
                            fragmentContextView.m0 = false;
                        }
                        r00Var.run();
                        kc b02 = kc.b0(g2Var);
                        boolean z11 = fragmentContextView.f33066j0;
                        if (z11) {
                            i7 = 2131624195;
                        } else {
                            i7 = 2131624194;
                        }
                        if (z11) {
                            i10 = 2131748587;
                        } else {
                            i10 = 2131748588;
                        }
                        org.telegram.messenger.f3.n(null, i10, b02, i7, 36);
                    }
                }
                fragmentContextView.f33068l0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f33068l0.c(false);
            }
        } else {
            lc lcVar = fragmentContextView.f33068l0;
            if (lcVar != null) {
                lcVar.c(false);
            }
        }
        lc lcVar2 = fragmentContextView.f33068l0;
        if ((lcVar2 != null && lcVar2.f37109i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f39447b;
        d9 d9Var = fragmentContextView.f33057c0;
        if (d9Var != null && d9Var.getVisibility() == 0) {
            fragmentContextView.f33057c0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f39447b.f33067k0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
