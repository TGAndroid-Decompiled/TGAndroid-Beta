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
import org.telegram.ui.Components.o91;
import org.telegram.ui.i60;
public final class q extends t2 {
    public float f31883g0;
    public final ChatObject.Call f31884h0;
    public final n0 f31885i0;
    public final TextPaint f31886j0;
    public final StaticLayout f31887k0;
    public final TextPaint f31888l0;
    public final String m0;
    public final float f31889n0;
    public final StaticLayout f31890o0;
    public final i60 f31891p0;
    public final String f31892q0;
    public final float f31893r0;
    public final v f31894s0;

    public q(v vVar, Context context, ChatObject.Call call, n0 n0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, i60 i60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31894s0 = vVar;
        this.f31884h0 = call;
        this.f31885i0 = n0Var;
        this.f31886j0 = textPaint;
        this.f31887k0 = staticLayout;
        this.f31888l0 = textPaint2;
        this.m0 = str;
        this.f31889n0 = f7;
        this.f31890o0 = staticLayout2;
        this.f31891p0 = i60Var;
        this.f31892q0 = str2;
        this.f31893r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31883g0 = this.f31894s0.f32026w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        v vVar = this.f31894s0;
        TextView textView = vVar.O;
        q qVar = vVar.f31996a;
        invalidate();
        ChatObject.Call call = this.f31884h0;
        if (call != null && call.call.rtmp_stream && vVar.f32031z0) {
            AndroidUtilities.cancelRunOnUIThread(vVar.A0);
            vVar.f32031z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            qVar.animate().cancel();
            qVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = vVar.f32021s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f31962e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = vVar.f32028x0;
        if (imageView != null && imageView.getParent() != null) {
            if (vVar.f32028x0.getAlpha() == 1.0f) {
                vVar.f32028x0.animate().alpha(0.0f).setDuration(300L).setListener(new o91(this, 4)).start();
            } else if (vVar.f32028x0.getParent() != null) {
                qVar.removeView(vVar.f32028x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = vVar.f32025w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.q.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v vVar = this.f31894s0;
        if (vVar.f32010j0 && view == vVar.f31996a.d) {
            canvas.save();
            float f7 = vVar.f32004e0;
            canvas.scale(f7, f7, vVar.f32006f0, vVar.f32007g0);
            canvas.translate(vVar.f32008h0, vVar.f32009i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        v vVar = this.f31894s0;
        q qVar = vVar.f31996a;
        ImageView imageView = vVar.f32028x0;
        if (imageView != null && imageView.getParent() != null) {
            vVar.f32028x0.getLayoutParams().width = qVar.d.getMeasuredWidth();
            vVar.f32028x0.getLayoutParams().height = qVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        v vVar = this.f31894s0;
        vVar.Q = true;
        vVar.invalidate();
        vVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        v vVar = this.f31894s0;
        q qVar = vVar.f31996a;
        boolean z11 = vVar.v;
        s2 s2Var = this.d;
        if (z11 && vVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (vVar.h) {
                qVar.f31956a0 = 1;
            } else if (vVar.f31998b) {
                qVar.f31956a0 = 1;
            } else if (this.f31885i0.f31799b) {
                qVar.f31956a0 = 0;
            } else if (vVar.f32025w.presentation) {
                qVar.f31956a0 = 1;
            } else {
                qVar.f31956a0 = 2;
            }
            vVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = vVar.f32025w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f31884h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31894s0.requestLayout();
        super.requestLayout();
    }
}
