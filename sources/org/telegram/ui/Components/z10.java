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
public final class z10 extends FrameLayout {
    public final RectF f29565a;
    public final FragmentContextView f29566b;

    public z10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f29566b = fragmentContextView;
        this.f29565a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f29566b;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        n6 n6Var = fragmentContextView.f21130i0;
        if (fragmentContextView.T == 4 && fragmentContextView.f21128g0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(n6Var.d()));
            if (dp != fragmentContextView.f21125e0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f21123c0 = linearGradient;
                fragmentContextView.f21121b0.setShader(linearGradient);
                fragmentContextView.f21125e0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f21134n.getGroupCall();
            if (p2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - p2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.f21124d0.reset();
            fragmentContextView.f21124d0.postTranslate((-fragmentContextView.f21125e0) * 0.7f * f7, 0.0f);
            fragmentContextView.f21123c0.setLocalMatrix(fragmentContextView.f21124d0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f29565a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f21131j0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.f21121b0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            n6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eh ehVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f29566b;
        if (fragmentContextView.T == 4 && fragmentContextView.f21128g0 && fragmentContextView.f21131j0 != null) {
            boolean contains = this.f29565a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f21131j0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f21131j0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    y10 y10Var = fragmentContextView.f21133l0;
                    org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                    if (p2Var != null && (ehVar = fragmentContextView.f21134n) != null && (groupCall = ehVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.I0 != 0) {
                            p2Var.getConnectionsManager().cancelRequest(fragmentContextView.I0, true);
                            fragmentContextView.I0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f21129h0;
                        fragmentContextView.f21129h0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.I0 = p2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f21132k0) {
                            AndroidUtilities.cancelRunOnUIThread(y10Var);
                            fragmentContextView.f21132k0 = false;
                        }
                        y10Var.run();
                        wc a02 = wc.a0(p2Var);
                        boolean z11 = fragmentContextView.f21129h0;
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
                        org.telegram.messenger.a2.o(i11, a02, i10, 36);
                    }
                }
                fragmentContextView.f21131j0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f21131j0.c(false);
            }
        } else {
            xc xcVar = fragmentContextView.f21131j0;
            if (xcVar != null) {
                xcVar.c(false);
            }
        }
        xc xcVar2 = fragmentContextView.f21131j0;
        if ((xcVar2 != null && xcVar2.h) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f29566b;
        j9 j9Var = fragmentContextView.f21119a0;
        if (j9Var != null && j9Var.getVisibility() == 0) {
            fragmentContextView.f21119a0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29566b.f21130i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
