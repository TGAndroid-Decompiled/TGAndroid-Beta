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
import org.telegram.ui.Components.h31;
import org.telegram.ui.v50;
public final class o extends t2 {
    public float f33965g0;
    public final ChatObject.Call f33966h0;
    public final l0 f33967i0;
    public final TextPaint f33968j0;
    public final StaticLayout f33969k0;
    public final TextPaint f33970l0;
    public final String m0;
    public final float f33971n0;
    public final StaticLayout f33972o0;
    public final v50 f33973p0;
    public final String f33974q0;
    public final float f33975r0;
    public final t f33976s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, v50 v50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f33976s0 = tVar;
        this.f33966h0 = call;
        this.f33967i0 = l0Var;
        this.f33968j0 = textPaint;
        this.f33969k0 = staticLayout;
        this.f33970l0 = textPaint2;
        this.m0 = str;
        this.f33971n0 = f7;
        this.f33972o0 = staticLayout2;
        this.f33973p0 = v50Var;
        this.f33974q0 = str2;
        this.f33975r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f33965g0 = this.f33976s0.f34100w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f33976s0;
        TextView textView = tVar.O;
        o oVar = tVar.f34071a;
        invalidate();
        ChatObject.Call call = this.f33966h0;
        if (call != null && call.call.rtmp_stream && tVar.f34105z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f34105z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f34095s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f34102x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f34102x0.getAlpha() == 1.0f) {
                tVar.f34102x0.animate().alpha(0.0f).setDuration(300L).setListener(new h31(this, 11)).start();
            } else if (tVar.f34102x0.getParent() != null) {
                oVar.removeView(tVar.f34102x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f34099w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f33976s0;
        if (tVar.f34084j0 && view == tVar.f34071a.d) {
            canvas.save();
            float f7 = tVar.f34078e0;
            canvas.scale(f7, f7, tVar.f34080f0, tVar.f34081g0);
            canvas.translate(tVar.f34082h0, tVar.f34083i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f33976s0;
        o oVar = tVar.f34071a;
        ImageView imageView = tVar.f34102x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f34102x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f34102x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f33976s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f33976s0;
        o oVar = tVar.f34071a;
        boolean z11 = tVar.v;
        s2 s2Var = this.d;
        if (z11 && tVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f34110a0 = 1;
            } else if (tVar.f34073b) {
                oVar.f34110a0 = 1;
            } else if (this.f33967i0.f33900b) {
                oVar.f34110a0 = 0;
            } else if (tVar.f34099w.presentation) {
                oVar.f34110a0 = 1;
            } else {
                oVar.f34110a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f34099w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f33966h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f33976s0.requestLayout();
        super.requestLayout();
    }
}
