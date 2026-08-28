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
public final class b10 extends FrameLayout {
    public final RectF f26967a;
    public final FragmentContextView f26968b;

    public b10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f26968b = fragmentContextView;
        this.f26967a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f26968b;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        i6 i6Var = fragmentContextView.f26382e0;
        if (fragmentContextView.P == 4 && fragmentContextView.f26379c0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(i6Var.d()));
            if (dp != fragmentContextView.f26375a0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.V = linearGradient;
                fragmentContextView.U.setShader(linearGradient);
                fragmentContextView.f26375a0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f26391n.getGroupCall();
            if (o2Var != null && groupCall != null && groupCall.isScheduled()) {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - o2Var.getConnectionsManager().getCurrentTimeMillis();
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
            fragmentContextView.W.reset();
            fragmentContextView.W.postTranslate((-fragmentContextView.f26375a0) * 0.7f * f10, 0.0f);
            fragmentContextView.V.setLocalMatrix(fragmentContextView.W);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f11 = measuredWidth;
            float f12 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f26967a;
            rectF.set(f11, f12, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f26384f0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.U);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            i6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rg rgVar;
        ChatObject.Call groupCall;
        int i9;
        int i10;
        FragmentContextView fragmentContextView = this.f26968b;
        if (fragmentContextView.P == 4 && fragmentContextView.f26379c0 && fragmentContextView.f26384f0 != null) {
            boolean contains = this.f26967a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f26384f0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f26384f0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    a10 a10Var = fragmentContextView.f26386h0;
                    org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                    if (o2Var != null && (rgVar = fragmentContextView.f26391n) != null && (groupCall = rgVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.E0 != 0) {
                            o2Var.getConnectionsManager().cancelRequest(fragmentContextView.E0, true);
                            fragmentContextView.E0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f26380d0;
                        fragmentContextView.f26380d0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.E0 = o2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f26385g0) {
                            AndroidUtilities.cancelRunOnUIThread(a10Var);
                            fragmentContextView.f26385g0 = false;
                        }
                        a10Var.run();
                        oc a02 = oc.a0(o2Var);
                        boolean z11 = fragmentContextView.f26380d0;
                        if (z11) {
                            i9 = R.raw.silent_unmute;
                        } else {
                            i9 = R.raw.silent_mute;
                        }
                        if (z11) {
                            i10 = R.string.LiveStreamWillNotify;
                        } else {
                            i10 = R.string.LiveStreamWillNotNotify;
                        }
                        org.telegram.messenger.l0.p(i10, a02, i9, 36);
                    }
                }
                fragmentContextView.f26384f0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f26384f0.c(false);
            }
        } else {
            pc pcVar = fragmentContextView.f26384f0;
            if (pcVar != null) {
                pcVar.c(false);
            }
        }
        pc pcVar2 = fragmentContextView.f26384f0;
        if ((pcVar2 != null && pcVar2.h) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f26968b;
        c9 c9Var = fragmentContextView.T;
        if (c9Var != null && c9Var.getVisibility() == 0) {
            fragmentContextView.T.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26968b.f26382e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
