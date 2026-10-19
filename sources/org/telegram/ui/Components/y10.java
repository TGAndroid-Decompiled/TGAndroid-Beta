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
public final class y10 extends FrameLayout {
    public final RectF f32529a;
    public final FragmentContextView f32530b;

    public y10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f32530b = fragmentContextView;
        this.f32529a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f32530b;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        p6 p6Var = fragmentContextView.f24224j0;
        if (fragmentContextView.U == 4 && fragmentContextView.f24222h0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(p6Var.c()));
            if (dp != fragmentContextView.f24220f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f24217d0 = linearGradient;
                fragmentContextView.f24216c0.setShader(linearGradient);
                fragmentContextView.f24220f0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f24227n.getGroupCall();
            if (n2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - n2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f24218e0.reset();
            fragmentContextView.f24218e0.postTranslate((-fragmentContextView.f24220f0) * 0.7f * f7, 0.0f);
            fragmentContextView.f24217d0.setLocalMatrix(fragmentContextView.f24218e0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f32529a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f24225k0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.f24216c0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            p6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            p6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bh bhVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f32530b;
        if (fragmentContextView.U == 4 && fragmentContextView.f24222h0 && fragmentContextView.f24225k0 != null) {
            boolean contains = this.f32529a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f24225k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f24225k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    x10 x10Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                    if (n2Var != null && (bhVar = fragmentContextView.f24227n) != null && (groupCall = bhVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.M0 != 0) {
                            n2Var.getConnectionsManager().cancelRequest(fragmentContextView.M0, true);
                            fragmentContextView.M0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f24223i0;
                        fragmentContextView.f24223i0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.M0 = n2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f24226l0) {
                            AndroidUtilities.cancelRunOnUIThread(x10Var);
                            fragmentContextView.f24226l0 = false;
                        }
                        x10Var.run();
                        xc a02 = xc.a0(n2Var);
                        boolean z11 = fragmentContextView.f24223i0;
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
                        org.telegram.messenger.g0.q(i11, a02, i10, 36);
                    }
                }
                fragmentContextView.f24225k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f24225k0.c(false);
            }
        } else {
            yc ycVar = fragmentContextView.f24225k0;
            if (ycVar != null) {
                ycVar.c(false);
            }
        }
        yc ycVar2 = fragmentContextView.f24225k0;
        if ((ycVar2 != null && ycVar2.f32600i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f32530b;
        k9 k9Var = fragmentContextView.f24214b0;
        if (k9Var != null && k9Var.getVisibility() == 0) {
            fragmentContextView.f24214b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32530b.f24224j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
