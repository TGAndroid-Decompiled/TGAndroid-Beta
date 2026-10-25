package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class a20 extends FrameLayout {
    public final RectF f26394a;
    public final FragmentContextView f26395b;

    public a20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f26395b = fragmentContextView;
        this.f26394a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f26395b;
        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
        r6 r6Var = fragmentContextView.f26161j0;
        if (fragmentContextView.U == 4 && fragmentContextView.f26159h0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(r6Var.c()));
            if (dp != fragmentContextView.f26157f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f26154d0 = linearGradient;
                fragmentContextView.f26153c0.setShader(linearGradient);
                fragmentContextView.f26157f0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f26164n.getGroupCall();
            if (r2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - r2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f26155e0.reset();
            fragmentContextView.f26155e0.postTranslate((-fragmentContextView.f26157f0) * 0.7f * f7, 0.0f);
            fragmentContextView.f26154d0.setLocalMatrix(fragmentContextView.f26155e0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f26394a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f26162k0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.f26153c0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            r6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            r6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bh bhVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f26395b;
        if (fragmentContextView.U == 4 && fragmentContextView.f26159h0 && fragmentContextView.f26162k0 != null) {
            boolean contains = this.f26394a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f26162k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f26162k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    z10 z10Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                    if (r2Var != null && (bhVar = fragmentContextView.f26164n) != null && (groupCall = bhVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.S0 != 0) {
                            r2Var.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f26160i0;
                        fragmentContextView.f26160i0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.S0 = r2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f26163l0) {
                            AndroidUtilities.cancelRunOnUIThread(z10Var);
                            fragmentContextView.f26163l0 = false;
                        }
                        z10Var.run();
                        wc b02 = wc.b0(r2Var);
                        boolean z11 = fragmentContextView.f26160i0;
                        if (z11) {
                            i10 = R.raw.silent_unmute;
                        } else {
                            i10 = R.raw.silent_mute;
                        }
                        if (z11) {
                            i11 = R.string.LiveStreamWillNotify;
                        } else {
                            i11 = R.string.LiveStreamWillNotNotify;
                        }
                        org.telegram.messenger.t.q(i11, b02, i10, 36);
                    }
                }
                fragmentContextView.f26162k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f26162k0.c(false);
            }
        } else {
            xc xcVar = fragmentContextView.f26162k0;
            if (xcVar != null) {
                xcVar.c(false);
            }
        }
        xc xcVar2 = fragmentContextView.f26162k0;
        if ((xcVar2 != null && xcVar2.f34687i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f26395b;
        m9 m9Var = fragmentContextView.f26151b0;
        if (m9Var != null && m9Var.getVisibility() == 0) {
            fragmentContextView.f26151b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26395b.f26161j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
