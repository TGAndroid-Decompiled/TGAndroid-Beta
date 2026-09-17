package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.ui.Components.k61;
import org.telegram.ui.j60;
public final class o extends q2 {
    public float f31703g0;
    public final ChatObject.Call f31704h0;
    public final l0 f31705i0;
    public final TextPaint f31706j0;
    public final StaticLayout f31707k0;
    public final TextPaint f31708l0;
    public final String m0;
    public final float f31709n0;
    public final StaticLayout f31710o0;
    public final j60 f31711p0;
    public final String f31712q0;
    public final float f31713r0;
    public final t f31714s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, j60 j60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31714s0 = tVar;
        this.f31704h0 = call;
        this.f31705i0 = l0Var;
        this.f31706j0 = textPaint;
        this.f31707k0 = staticLayout;
        this.f31708l0 = textPaint2;
        this.m0 = str;
        this.f31709n0 = f7;
        this.f31710o0 = staticLayout2;
        this.f31711p0 = j60Var;
        this.f31712q0 = str2;
        this.f31713r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31703g0 = this.f31714s0.f31862w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31714s0;
        TextView textView = tVar.O;
        o oVar = tVar.f31832a;
        invalidate();
        ChatObject.Call call = this.f31704h0;
        if (call != null && call.call.rtmp_stream && tVar.f31867z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f31867z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f31857s0;
        p2 p2Var = this.d;
        if (!z10 && p2Var.getAlpha() != 1.0f) {
            p2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f31770e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f31864x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f31864x0.getAlpha() == 1.0f) {
                tVar.f31864x0.animate().alpha(0.0f).setDuration(300L).setListener(new k61(this, 6)).start();
            } else if (tVar.f31864x0.getParent() != null) {
                oVar.removeView(tVar.f31864x0);
            }
        }
        int i11 = p2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31861w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        t tVar = this.f31714s0;
        if (tVar.f31846j0 && view == tVar.f31832a.d) {
            canvas.save();
            float f7 = tVar.f31840e0;
            canvas.scale(f7, f7, tVar.f31842f0, tVar.f31843g0);
            canvas.translate(tVar.f31844h0, tVar.f31845i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f31714s0;
        o oVar = tVar.f31832a;
        ImageView imageView = tVar.f31864x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f31864x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f31864x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f31714s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31714s0;
        o oVar = tVar.f31832a;
        boolean z11 = tVar.v;
        p2 p2Var = this.d;
        if (z11 && tVar.R && p2Var.rotatedFrameHeight != 0 && p2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f31764a0 = 1;
            } else if (tVar.f31834b) {
                oVar.f31764a0 = 1;
            } else if (this.f31705i0.f31625b) {
                oVar.f31764a0 = 0;
            } else if (tVar.f31861w.presentation) {
                oVar.f31764a0 = 1;
            } else {
                oVar.f31764a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = p2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31861w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f31704h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31714s0.requestLayout();
        super.requestLayout();
    }
}
