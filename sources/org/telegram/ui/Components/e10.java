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

public final class e10 extends FrameLayout {

    public final RectF f27921a;

    public final FragmentContextView f27922b;

    public e10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27922b = fragmentContextView;
        this.f27921a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f27922b;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        i6 i6Var = fragmentContextView.f26378e0;
        if (fragmentContextView.P == 4 && fragmentContextView.f26375c0) {
            int iDp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(i6Var.d()));
            if (iDp != fragmentContextView.f26371a0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.V = linearGradient;
                fragmentContextView.U.setShader(linearGradient);
                fragmentContextView.f26371a0 = iDp;
            }
            ChatObject.Call groupCall = fragmentContextView.f26387n.getGroupCall();
            if (n2Var == null || groupCall == null || !groupCall.isScheduled()) {
                f10 = 0.0f;
            } else {
                long currentTimeMillis = (((long) groupCall.call.schedule_date) * 1000) - n2Var.getConnectionsManager().getCurrentTimeMillis();
                f10 = 1.0f;
                if (currentTimeMillis >= 0) {
                    f10 = currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f;
                }
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.W.reset();
            fragmentContextView.W.postTranslate((-fragmentContextView.f26371a0) * 0.7f * f10, 0.0f);
            fragmentContextView.V.setLocalMatrix(fragmentContextView.W);
            int measuredWidth = (getMeasuredWidth() - iDp) - AndroidUtilities.dp(10.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            float f11 = measuredWidth;
            float f12 = iDp2;
            float fDp = AndroidUtilities.dp(28.0f) + iDp2;
            RectF rectF = this.f27921a;
            rectF.set(f11, f12, measuredWidth + iDp, fDp);
            canvas.save();
            float fA = fragmentContextView.f26380f0.a(0.1f);
            canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, iDp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.U);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            i6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ng ngVar;
        ChatObject.Call groupCall;
        FragmentContextView fragmentContextView = this.f27922b;
        if (fragmentContextView.P == 4 && fragmentContextView.f26375c0 && fragmentContextView.f26380f0 != null) {
            boolean zContains = this.f27921a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f26380f0.c(zContains);
            } else if (motionEvent.getAction() == 2) {
                if (!zContains) {
                    fragmentContextView.f26380f0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (zContains) {
                    d10 d10Var = fragmentContextView.f26382h0;
                    org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                    if (n2Var != null && (ngVar = fragmentContextView.f26387n) != null && (groupCall = ngVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.E0 != 0) {
                            n2Var.getConnectionsManager().cancelRequest(fragmentContextView.E0, true);
                            fragmentContextView.E0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f26376d0;
                        fragmentContextView.f26376d0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.E0 = n2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f26381g0) {
                            AndroidUtilities.cancelRunOnUIThread(d10Var);
                            fragmentContextView.f26381g0 = false;
                        }
                        d10Var.run();
                        mc mcVarA0 = mc.a0(n2Var);
                        boolean z11 = fragmentContextView.f26376d0;
                        org.telegram.messenger.y1.q(z11 ? R.string.LiveStreamWillNotify : R.string.LiveStreamWillNotNotify, mcVarA0, z11 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                }
                fragmentContextView.f26380f0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f26380f0.c(false);
            }
        } else {
            nc ncVar = fragmentContextView.f26380f0;
            if (ncVar != null) {
                ncVar.c(false);
            }
        }
        nc ncVar2 = fragmentContextView.f26380f0;
        return (ncVar2 != null && ncVar2.h) || super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f27922b;
        b9 b9Var = fragmentContextView.T;
        if (b9Var == null || b9Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.T.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f27922b.f26378e0 || super.verifyDrawable(drawable);
    }
}
