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
import org.telegram.ui.Components.p31;
import org.telegram.ui.q50;
public final class o extends q2 {
    public float f31588g0;
    public final ChatObject.Call f31589h0;
    public final l0 f31590i0;
    public final TextPaint f31591j0;
    public final StaticLayout f31592k0;
    public final TextPaint f31593l0;
    public final String m0;
    public final float f31594n0;
    public final StaticLayout f31595o0;
    public final q50 f31596p0;
    public final String f31597q0;
    public final float f31598r0;
    public final t f31599s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, q50 q50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31599s0 = tVar;
        this.f31589h0 = call;
        this.f31590i0 = l0Var;
        this.f31591j0 = textPaint;
        this.f31592k0 = staticLayout;
        this.f31593l0 = textPaint2;
        this.m0 = str;
        this.f31594n0 = f7;
        this.f31595o0 = staticLayout2;
        this.f31596p0 = q50Var;
        this.f31597q0 = str2;
        this.f31598r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31588g0 = this.f31599s0.f31736w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31599s0;
        TextView textView = tVar.O;
        o oVar = tVar.f31707a;
        invalidate();
        ChatObject.Call call = this.f31589h0;
        if (call != null && call.call.rtmp_stream && tVar.f31741z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f31741z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f31731s0;
        p2 p2Var = this.d;
        if (!z10 && p2Var.getAlpha() != 1.0f) {
            p2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f31738x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f31738x0.getAlpha() == 1.0f) {
                tVar.f31738x0.animate().alpha(0.0f).setDuration(300L).setListener(new p31(this, 9)).start();
            } else if (tVar.f31738x0.getParent() != null) {
                oVar.removeView(tVar.f31738x0);
            }
        }
        int i11 = p2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31735w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f31599s0;
        if (tVar.f31720j0 && view == tVar.f31707a.d) {
            canvas.save();
            float f7 = tVar.f31714e0;
            canvas.scale(f7, f7, tVar.f31716f0, tVar.f31717g0);
            canvas.translate(tVar.f31718h0, tVar.f31719i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f31599s0;
        o oVar = tVar.f31707a;
        ImageView imageView = tVar.f31738x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f31738x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f31738x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f31599s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31599s0;
        o oVar = tVar.f31707a;
        boolean z11 = tVar.v;
        p2 p2Var = this.d;
        if (z11 && tVar.R && p2Var.rotatedFrameHeight != 0 && p2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f31644a0 = 1;
            } else if (tVar.f31709b) {
                oVar.f31644a0 = 1;
            } else if (this.f31590i0.f31514b) {
                oVar.f31644a0 = 0;
            } else if (tVar.f31735w.presentation) {
                oVar.f31644a0 = 1;
            } else {
                oVar.f31644a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = p2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31735w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f31589h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31599s0.requestLayout();
        super.requestLayout();
    }
}
