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
public final class c20 extends FrameLayout {
    public final RectF f23619a;
    public final FragmentContextView f23620b;

    public c20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f23620b = fragmentContextView;
        this.f23619a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.f23620b;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        r6 r6Var = fragmentContextView.f22866j0;
        if (fragmentContextView.U == 4 && fragmentContextView.f22864h0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(r6Var.c()));
            if (dp != fragmentContextView.f22862f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.f22859d0 = linearGradient;
                fragmentContextView.f22858c0.setShader(linearGradient);
                fragmentContextView.f22862f0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.f22869n.getGroupCall();
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
            fragmentContextView.f22860e0.reset();
            fragmentContextView.f22860e0.postTranslate((-fragmentContextView.f22862f0) * 0.7f * f7, 0.0f);
            fragmentContextView.f22859d0.setLocalMatrix(fragmentContextView.f22860e0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.f23619a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f22867k0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.f22858c0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            r6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            r6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ch chVar;
        ChatObject.Call groupCall;
        int i10;
        int i11;
        FragmentContextView fragmentContextView = this.f23620b;
        if (fragmentContextView.U == 4 && fragmentContextView.f22864h0 && fragmentContextView.f22867k0 != null) {
            boolean contains = this.f23619a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f22867k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f22867k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    b20 b20Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                    if (m2Var != null && (chVar = fragmentContextView.f22869n) != null && (groupCall = chVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.M0 != 0) {
                            m2Var.getConnectionsManager().cancelRequest(fragmentContextView.M0, true);
                            fragmentContextView.M0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.f22865i0;
                        fragmentContextView.f22865i0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.M0 = m2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.f22868l0) {
                            AndroidUtilities.cancelRunOnUIThread(b20Var);
                            fragmentContextView.f22868l0 = false;
                        }
                        b20Var.run();
                        zc a02 = zc.a0(m2Var);
                        boolean z11 = fragmentContextView.f22865i0;
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
                fragmentContextView.f22867k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f22867k0.c(false);
            }
        } else {
            ad adVar = fragmentContextView.f22867k0;
            if (adVar != null) {
                adVar.c(false);
            }
        }
        ad adVar2 = fragmentContextView.f22867k0;
        if ((adVar2 != null && adVar2.f23201i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.f23620b;
        n9 n9Var = fragmentContextView.f22856b0;
        if (n9Var != null && n9Var.getVisibility() == 0) {
            fragmentContextView.f22856b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23620b.f22866j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
