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
    public float f31589g0;
    public final ChatObject.Call f31590h0;
    public final l0 f31591i0;
    public final TextPaint f31592j0;
    public final StaticLayout f31593k0;
    public final TextPaint f31594l0;
    public final String m0;
    public final float f31595n0;
    public final StaticLayout f31596o0;
    public final q50 f31597p0;
    public final String f31598q0;
    public final float f31599r0;
    public final t f31600s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, q50 q50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31600s0 = tVar;
        this.f31590h0 = call;
        this.f31591i0 = l0Var;
        this.f31592j0 = textPaint;
        this.f31593k0 = staticLayout;
        this.f31594l0 = textPaint2;
        this.m0 = str;
        this.f31595n0 = f7;
        this.f31596o0 = staticLayout2;
        this.f31597p0 = q50Var;
        this.f31598q0 = str2;
        this.f31599r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31589g0 = this.f31600s0.f31737w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31600s0;
        TextView textView = tVar.O;
        o oVar = tVar.f31708a;
        invalidate();
        ChatObject.Call call = this.f31590h0;
        if (call != null && call.call.rtmp_stream && tVar.f31742z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f31742z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f31732s0;
        p2 p2Var = this.d;
        if (!z10 && p2Var.getAlpha() != 1.0f) {
            p2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f31739x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f31739x0.getAlpha() == 1.0f) {
                tVar.f31739x0.animate().alpha(0.0f).setDuration(300L).setListener(new p31(this, 9)).start();
            } else if (tVar.f31739x0.getParent() != null) {
                oVar.removeView(tVar.f31739x0);
            }
        }
        int i11 = p2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31736w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f31600s0;
        if (tVar.f31721j0 && view == tVar.f31708a.d) {
            canvas.save();
            float f7 = tVar.f31715e0;
            canvas.scale(f7, f7, tVar.f31717f0, tVar.f31718g0);
            canvas.translate(tVar.f31719h0, tVar.f31720i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f31600s0;
        o oVar = tVar.f31708a;
        ImageView imageView = tVar.f31739x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f31739x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f31739x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f31600s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31600s0;
        o oVar = tVar.f31708a;
        boolean z11 = tVar.v;
        p2 p2Var = this.d;
        if (z11 && tVar.R && p2Var.rotatedFrameHeight != 0 && p2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f31645a0 = 1;
            } else if (tVar.f31710b) {
                oVar.f31645a0 = 1;
            } else if (this.f31591i0.f31515b) {
                oVar.f31645a0 = 0;
            } else if (tVar.f31736w.presentation) {
                oVar.f31645a0 = 1;
            } else {
                oVar.f31645a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = p2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31736w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f31590h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31600s0.requestLayout();
        super.requestLayout();
    }
}
