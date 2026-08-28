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
import org.telegram.ui.Components.y11;
import org.telegram.ui.o50;
public final class o extends r2 {
    public float f33715c0;
    public final ChatObject.Call f33716d0;
    public final k0 f33717e0;
    public final TextPaint f33718f0;
    public final StaticLayout f33719g0;
    public final TextPaint f33720h0;
    public final String f33721i0;
    public final float f33722j0;
    public final StaticLayout f33723k0;
    public final o50 f33724l0;
    public final String m0;
    public final float f33725n0;
    public final t f33726o0;

    public o(t tVar, Context context, ChatObject.Call call, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, o50 o50Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f33726o0 = tVar;
        this.f33716d0 = call;
        this.f33717e0 = k0Var;
        this.f33718f0 = textPaint;
        this.f33719g0 = staticLayout;
        this.f33720h0 = textPaint2;
        this.f33721i0 = str;
        this.f33722j0 = f10;
        this.f33723k0 = staticLayout2;
        this.f33724l0 = o50Var;
        this.m0 = str2;
        this.f33725n0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f33715c0 = this.f33726o0.f33846s0;
    }

    @Override
    public final void b() {
        int i9;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f33726o0;
        TextView textView = tVar.K;
        o oVar = tVar.f33821a;
        invalidate();
        ChatObject.Call call = this.f33716d0;
        if (call != null && call.call.rtmp_stream && tVar.f33849v0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.f33851w0);
            tVar.f33849v0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f33840o0;
        q2 q2Var = this.d;
        if (!z10 && q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f33777e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f33847t0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f33847t0.getAlpha() == 1.0f) {
                tVar.f33847t0.animate().alpha(0.0f).setDuration(300L).setListener(new y11(this, 9)).start();
            } else if (tVar.f33847t0.getParent() != null) {
                oVar.removeView(tVar.f33847t0);
            }
        }
        int i10 = q2Var.rotatedFrameHeight;
        if (i10 != 0 && (i9 = q2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f33850w) != null) {
            videoParticipant.setAspectRatio(i9, i10, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f33726o0;
        if (tVar.f33831f0 && view == tVar.f33821a.d) {
            canvas.save();
            float f10 = tVar.f33822a0;
            canvas.scale(f10, f10, tVar.f33824b0, tVar.f33826c0);
            canvas.translate(tVar.f33827d0, tVar.f33829e0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f33726o0;
        o oVar = tVar.f33821a;
        ImageView imageView = tVar.f33847t0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f33847t0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f33847t0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f33726o0;
        tVar.M = true;
        tVar.invalidate();
        tVar.M = false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f33726o0;
        o oVar = tVar.f33821a;
        boolean z11 = tVar.v;
        q2 q2Var = this.d;
        if (z11 && tVar.N && q2Var.rotatedFrameHeight != 0 && q2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.T = 1;
            } else if (tVar.f33823b) {
                oVar.T = 1;
            } else if (this.f33717e0.f33598b) {
                oVar.T = 0;
            } else if (tVar.f33850w.presentation) {
                oVar.T = 1;
            } else {
                oVar.T = 2;
            }
            tVar.N = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        int i14 = q2Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = q2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f33850w) != null) {
            videoParticipant.setAspectRatio(i13, i14, this.f33716d0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f33726o0.requestLayout();
        super.requestLayout();
    }
}
