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
public final class j20 extends FrameLayout {
    public final RectF f27343a;
    public final FragmentContextView f27344b;

    public j20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27344b = fragmentContextView;
        this.f27343a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f27344b;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        q6 q6Var = fragmentContextView.f23954j0;
        if (fragmentContextView.U == 4 && fragmentContextView.f23952h0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(q6Var.c()));
            if (dp != fragmentContextView.f23950f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f23946d0 = linearGradient;
                fragmentContextView.f23945c0.setShader(linearGradient);
                fragmentContextView.f23950f0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f23957n.getGroupCall();
            if (m2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - m2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f23948e0.reset();
            fragmentContextView.f23948e0.postTranslate((-fragmentContextView.f23950f0) * 0.7f * f7, 0.0f);
            fragmentContextView.f23946d0.setLocalMatrix(fragmentContextView.f23948e0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f27343a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f23955k0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.f23945c0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            q6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            q6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gh ghVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f27344b;
        if (fragmentContextView.U == 4 && fragmentContextView.f23952h0 && fragmentContextView.f23955k0 != null) {
            boolean contains = this.f27343a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f23955k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f23955k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    i20 i20Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                    if (m2Var != null && (ghVar = fragmentContextView.f23957n) != null && (groupCall = ghVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.M0 != 0) {
                            m2Var.getConnectionsManager().cancelRequest(fragmentContextView.M0, true);
                            fragmentContextView.M0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f23953i0;
                        fragmentContextView.f23953i0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.M0 = m2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f23956l0) {
                            AndroidUtilities.cancelRunOnUIThread(i20Var);
                            fragmentContextView.f23956l0 = false;
                        }
                        i20Var.run();
                        zc a02 = zc.a0(m2Var);
                        boolean z11 = fragmentContextView.f23953i0;
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
                        org.telegram.messenger.v0.q(i11, a02, i10, 36);
                    }
                }
                fragmentContextView.f23955k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f23955k0.c(false);
            }
        } else {
            ad adVar = fragmentContextView.f23955k0;
            if (adVar != null) {
                adVar.c(false);
            }
        }
        ad adVar2 = fragmentContextView.f23955k0;
        if ((adVar2 != null && adVar2.f24287i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f27344b;
        m9 m9Var = fragmentContextView.f23943b0;
        if (m9Var != null && m9Var.getVisibility() == 0) {
            fragmentContextView.f23943b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27344b.f23954j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
