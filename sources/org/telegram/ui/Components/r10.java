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
public final class r10 extends FrameLayout {
    public final RectF f30615a;
    public final FragmentContextView f30616b;

    public r10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f30616b = fragmentContextView;
        this.f30615a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f30616b;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        j6 j6Var = fragmentContextView.f24883f0;
        if (fragmentContextView.Q == 4 && fragmentContextView.f24879d0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(j6Var.d()));
            if (dp != fragmentContextView.f24876b0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.W = linearGradient;
                fragmentContextView.V.setShader(linearGradient);
                fragmentContextView.f24876b0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f24890n.getGroupCall();
            if (p2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - p2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f24874a0.reset();
            fragmentContextView.f24874a0.postTranslate((-fragmentContextView.f24876b0) * 0.7f * f10, 0.0f);
            fragmentContextView.W.setLocalMatrix(fragmentContextView.f24874a0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f11 = measuredWidth;
            float f12 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f30615a;
            rectF.set(f11, f12, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f24884g0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.V);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            j6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            j6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rg rgVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f30616b;
        if (fragmentContextView.Q == 4 && fragmentContextView.f24879d0 && fragmentContextView.f24884g0 != null) {
            boolean contains = this.f30615a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f24884g0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f24884g0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    q10 q10Var = fragmentContextView.f24886i0;
                    org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                    if (p2Var != null && (rgVar = fragmentContextView.f24890n) != null && (groupCall = rgVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.F0 != 0) {
                            p2Var.getConnectionsManager().cancelRequest(fragmentContextView.F0, true);
                            fragmentContextView.F0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z4 = !fragmentContextView.f24881e0;
                        fragmentContextView.f24881e0 = z4;
                        groupCall2.schedule_start_subscribed = z4;
                        togglegroupcallstartsubscription.subscribed = z4;
                        fragmentContextView.F0 = p2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f24885h0) {
                            AndroidUtilities.cancelRunOnUIThread(q10Var);
                            fragmentContextView.f24885h0 = false;
                        }
                        q10Var.run();
                        qc a02 = qc.a0(p2Var);
                        boolean z10 = fragmentContextView.f24881e0;
                        if (z10) {
                            i10 = R.raw.silent_unmute;
                        } else {
                            i10 = R.raw.silent_mute;
                        }
                        if (z10) {
                            i11 = R.string.LiveStreamWillNotify;
                        } else {
                            i11 = R.string.LiveStreamWillNotNotify;
                        }
                        l.d.v(i11, a02, i10, 36);
                    }
                }
                fragmentContextView.f24884g0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f24884g0.c(false);
            }
        } else {
            rc rcVar = fragmentContextView.f24884g0;
            if (rcVar != null) {
                rcVar.c(false);
            }
        }
        rc rcVar2 = fragmentContextView.f24884g0;
        if ((rcVar2 != null && rcVar2.h) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f30616b;
        d9 d9Var = fragmentContextView.U;
        if (d9Var != null && d9Var.getVisibility() == 0) {
            fragmentContextView.U.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30616b.f24883f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
