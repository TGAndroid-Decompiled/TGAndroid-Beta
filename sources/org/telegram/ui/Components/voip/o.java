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
import org.telegram.ui.Components.u61;
import org.telegram.ui.n60;
public final class o extends r2 {
    public float f30354g0;
    public final ChatObject.Call f30355h0;
    public final l0 f30356i0;
    public final TextPaint f30357j0;
    public final StaticLayout f30358k0;
    public final TextPaint f30359l0;
    public final String m0;
    public final float f30360n0;
    public final StaticLayout f30361o0;
    public final n60 f30362p0;
    public final String f30363q0;
    public final float f30364r0;
    public final t f30365s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, n60 n60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f30365s0 = tVar;
        this.f30355h0 = call;
        this.f30356i0 = l0Var;
        this.f30357j0 = textPaint;
        this.f30358k0 = staticLayout;
        this.f30359l0 = textPaint2;
        this.m0 = str;
        this.f30360n0 = f7;
        this.f30361o0 = staticLayout2;
        this.f30362p0 = n60Var;
        this.f30363q0 = str2;
        this.f30364r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f30354g0 = this.f30365s0.f30505w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f30365s0;
        TextView textView = tVar.O;
        o oVar = tVar.f30476a;
        invalidate();
        ChatObject.Call call = this.f30355h0;
        if (call != null && call.call.rtmp_stream && tVar.f30510z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f30510z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f30500s0;
        q2 q2Var = this.d;
        if (!z10 && q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f30507x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f30507x0.getAlpha() == 1.0f) {
                tVar.f30507x0.animate().alpha(0.0f).setDuration(300L).setListener(new u61(this, 7)).start();
            } else if (tVar.f30507x0.getParent() != null) {
                oVar.removeView(tVar.f30507x0);
            }
        }
        int i11 = q2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = q2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f30504w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f30365s0;
        if (tVar.f30489j0 && view == tVar.f30476a.d) {
            canvas.save();
            float f7 = tVar.f30483e0;
            canvas.scale(f7, f7, tVar.f30485f0, tVar.f30486g0);
            canvas.translate(tVar.f30487h0, tVar.f30488i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f30365s0;
        o oVar = tVar.f30476a;
        ImageView imageView = tVar.f30507x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f30507x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f30507x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f30365s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f30365s0;
        o oVar = tVar.f30476a;
        boolean z11 = tVar.v;
        q2 q2Var = this.d;
        if (z11 && tVar.R && q2Var.rotatedFrameHeight != 0 && q2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f30421a0 = 1;
            } else if (tVar.f30478b) {
                oVar.f30421a0 = 1;
            } else if (this.f30356i0.f30281b) {
                oVar.f30421a0 = 0;
            } else if (tVar.f30504w.presentation) {
                oVar.f30421a0 = 1;
            } else {
                oVar.f30421a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = q2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = q2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f30504w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f30355h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f30365s0.requestLayout();
        super.requestLayout();
    }
}
