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
import org.telegram.ui.Components.i31;
import org.telegram.ui.x50;
public final class o extends t2 {
    public float f34073g0;
    public final ChatObject.Call f34074h0;
    public final l0 f34075i0;
    public final TextPaint f34076j0;
    public final StaticLayout f34077k0;
    public final TextPaint f34078l0;
    public final String m0;
    public final float f34079n0;
    public final StaticLayout f34080o0;
    public final x50 f34081p0;
    public final String f34082q0;
    public final float f34083r0;
    public final t f34084s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, x50 x50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f34084s0 = tVar;
        this.f34074h0 = call;
        this.f34075i0 = l0Var;
        this.f34076j0 = textPaint;
        this.f34077k0 = staticLayout;
        this.f34078l0 = textPaint2;
        this.m0 = str;
        this.f34079n0 = f7;
        this.f34080o0 = staticLayout2;
        this.f34081p0 = x50Var;
        this.f34082q0 = str2;
        this.f34083r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f34073g0 = this.f34084s0.f34208w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f34084s0;
        TextView textView = tVar.O;
        o oVar = tVar.f34179a;
        invalidate();
        ChatObject.Call call = this.f34074h0;
        if (call != null && call.call.rtmp_stream && tVar.f34213z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f34213z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f34203s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f34210x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f34210x0.getAlpha() == 1.0f) {
                tVar.f34210x0.animate().alpha(0.0f).setDuration(300L).setListener(new i31(this, 11)).start();
            } else if (tVar.f34210x0.getParent() != null) {
                oVar.removeView(tVar.f34210x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f34207w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f34084s0;
        if (tVar.f34192j0 && view == tVar.f34179a.d) {
            canvas.save();
            float f7 = tVar.f34186e0;
            canvas.scale(f7, f7, tVar.f34188f0, tVar.f34189g0);
            canvas.translate(tVar.f34190h0, tVar.f34191i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f34084s0;
        o oVar = tVar.f34179a;
        ImageView imageView = tVar.f34210x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f34210x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f34210x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f34084s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f34084s0;
        o oVar = tVar.f34179a;
        boolean z11 = tVar.v;
        s2 s2Var = this.d;
        if (z11 && tVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f34218a0 = 1;
            } else if (tVar.f34181b) {
                oVar.f34218a0 = 1;
            } else if (this.f34075i0.f34008b) {
                oVar.f34218a0 = 0;
            } else if (tVar.f34207w.presentation) {
                oVar.f34218a0 = 1;
            } else {
                oVar.f34218a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f34207w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f34074h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f34084s0.requestLayout();
        super.requestLayout();
    }
}
