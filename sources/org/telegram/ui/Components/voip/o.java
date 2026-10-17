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
import org.telegram.ui.Components.n31;
import org.telegram.ui.s50;
public final class o extends q2 {
    public float f31628g0;
    public final ChatObject.Call f31629h0;
    public final l0 f31630i0;
    public final TextPaint f31631j0;
    public final StaticLayout f31632k0;
    public final TextPaint f31633l0;
    public final String m0;
    public final float f31634n0;
    public final StaticLayout f31635o0;
    public final s50 f31636p0;
    public final String f31637q0;
    public final float f31638r0;
    public final t f31639s0;

    public o(t tVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, s50 s50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31639s0 = tVar;
        this.f31629h0 = call;
        this.f31630i0 = l0Var;
        this.f31631j0 = textPaint;
        this.f31632k0 = staticLayout;
        this.f31633l0 = textPaint2;
        this.m0 = str;
        this.f31634n0 = f7;
        this.f31635o0 = staticLayout2;
        this.f31636p0 = s50Var;
        this.f31637q0 = str2;
        this.f31638r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31628g0 = this.f31639s0.f31776w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31639s0;
        TextView textView = tVar.O;
        o oVar = tVar.f31747a;
        invalidate();
        ChatObject.Call call = this.f31629h0;
        if (call != null && call.call.rtmp_stream && tVar.f31781z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f31781z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f31771s0;
        p2 p2Var = this.d;
        if (!z10 && p2Var.getAlpha() != 1.0f) {
            p2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f31778x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f31778x0.getAlpha() == 1.0f) {
                tVar.f31778x0.animate().alpha(0.0f).setDuration(300L).setListener(new n31(this, 9)).start();
            } else if (tVar.f31778x0.getParent() != null) {
                oVar.removeView(tVar.f31778x0);
            }
        }
        int i11 = p2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31775w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f31639s0;
        if (tVar.f31760j0 && view == tVar.f31747a.d) {
            canvas.save();
            float f7 = tVar.f31754e0;
            canvas.scale(f7, f7, tVar.f31756f0, tVar.f31757g0);
            canvas.translate(tVar.f31758h0, tVar.f31759i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f31639s0;
        o oVar = tVar.f31747a;
        ImageView imageView = tVar.f31778x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f31778x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f31778x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f31639s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f31639s0;
        o oVar = tVar.f31747a;
        boolean z11 = tVar.v;
        p2 p2Var = this.d;
        if (z11 && tVar.R && p2Var.rotatedFrameHeight != 0 && p2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f31684a0 = 1;
            } else if (tVar.f31749b) {
                oVar.f31684a0 = 1;
            } else if (this.f31630i0.f31554b) {
                oVar.f31684a0 = 0;
            } else if (tVar.f31775w.presentation) {
                oVar.f31684a0 = 1;
            } else {
                oVar.f31684a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = p2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = p2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f31775w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f31629h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31639s0.requestLayout();
        super.requestLayout();
    }
}
