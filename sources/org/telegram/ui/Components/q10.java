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
public final class q10 extends FrameLayout {
    public final RectF f27188a;
    public final FragmentContextView f27189b;

    public q10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27189b = fragmentContextView;
        this.f27188a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f27189b;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        m6 m6Var = fragmentContextView.f22055i0;
        if (fragmentContextView.T == 4 && fragmentContextView.f22053g0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(m6Var.d()));
            if (dp != fragmentContextView.f22050e0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f22048c0 = linearGradient;
                fragmentContextView.f22046b0.setShader(linearGradient);
                fragmentContextView.f22050e0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f22059n.getGroupCall();
            if (o2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - o2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f22049d0.reset();
            fragmentContextView.f22049d0.postTranslate((-fragmentContextView.f22050e0) * 0.7f * f7, 0.0f);
            fragmentContextView.f22048c0.setLocalMatrix(fragmentContextView.f22049d0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f27188a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f22056j0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.f22046b0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            m6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            m6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ah ahVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f27189b;
        if (fragmentContextView.T == 4 && fragmentContextView.f22053g0 && fragmentContextView.f22056j0 != null) {
            boolean contains = this.f27188a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f22056j0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f22056j0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    p10 p10Var = fragmentContextView.f22058l0;
                    org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                    if (o2Var != null && (ahVar = fragmentContextView.f22059n) != null && (groupCall = ahVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.I0 != 0) {
                            o2Var.getConnectionsManager().cancelRequest(fragmentContextView.I0, true);
                            fragmentContextView.I0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f22054h0;
                        fragmentContextView.f22054h0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.I0 = o2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f22057k0) {
                            AndroidUtilities.cancelRunOnUIThread(p10Var);
                            fragmentContextView.f22057k0 = false;
                        }
                        p10Var.run();
                        vc a02 = vc.a0(o2Var);
                        boolean z11 = fragmentContextView.f22054h0;
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
                        org.telegram.messenger.w1.o(i11, a02, i10, 36);
                    }
                }
                fragmentContextView.f22056j0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f22056j0.c(false);
            }
        } else {
            wc wcVar = fragmentContextView.f22056j0;
            if (wcVar != null) {
                wcVar.c(false);
            }
        }
        wc wcVar2 = fragmentContextView.f22056j0;
        if ((wcVar2 != null && wcVar2.h) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f27189b;
        i9 i9Var = fragmentContextView.f22044a0;
        if (i9Var != null && i9Var.getVisibility() == 0) {
            fragmentContextView.f22044a0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27189b.f22055i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
