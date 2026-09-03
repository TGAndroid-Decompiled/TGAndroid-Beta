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
import org.telegram.ui.Components.f91;
import org.telegram.ui.d60;
public final class p extends t2 {
    public float f32247d0;
    public final ChatObject.Call f32248e0;
    public final l0 f32249f0;
    public final TextPaint f32250g0;
    public final StaticLayout f32251h0;
    public final TextPaint f32252i0;
    public final String f32253j0;
    public final float f32254k0;
    public final StaticLayout f32255l0;
    public final d60 m0;
    public final String f32256n0;
    public final float f32257o0;
    public final u f32258p0;

    public p(u uVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, d60 d60Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f32258p0 = uVar;
        this.f32248e0 = call;
        this.f32249f0 = l0Var;
        this.f32250g0 = textPaint;
        this.f32251h0 = staticLayout;
        this.f32252i0 = textPaint2;
        this.f32253j0 = str;
        this.f32254k0 = f10;
        this.f32255l0 = staticLayout2;
        this.m0 = d60Var;
        this.f32256n0 = str2;
        this.f32257o0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f32247d0 = this.f32258p0.f32391t0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f32258p0;
        TextView textView = uVar.L;
        p pVar = uVar.f32365a;
        invalidate();
        ChatObject.Call call = this.f32248e0;
        if (call != null && call.call.rtmp_stream && uVar.f32395w0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.f32397x0);
            uVar.f32395w0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z4 = uVar.f32385p0;
        s2 s2Var = this.d;
        if (!z4 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f32357e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.f32392u0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.f32392u0.getAlpha() == 1.0f) {
                uVar.f32392u0.animate().alpha(0.0f).setDuration(300L).setListener(new f91(this, 2)).start();
            } else if (uVar.f32392u0.getParent() != null) {
                pVar.removeView(uVar.f32392u0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f32394w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.p.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u uVar = this.f32258p0;
        if (uVar.f32376g0 && view == uVar.f32365a.d) {
            canvas.save();
            float f10 = uVar.f32368b0;
            canvas.scale(f10, f10, uVar.f32370c0, uVar.f32371d0);
            canvas.translate(uVar.f32373e0, uVar.f32375f0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        u uVar = this.f32258p0;
        p pVar = uVar.f32365a;
        ImageView imageView = uVar.f32392u0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.f32392u0.getLayoutParams().width = pVar.d.getMeasuredWidth();
            uVar.f32392u0.getLayoutParams().height = pVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u uVar = this.f32258p0;
        uVar.N = true;
        uVar.invalidate();
        uVar.N = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f32258p0;
        p pVar = uVar.f32365a;
        boolean z10 = uVar.v;
        s2 s2Var = this.d;
        if (z10 && uVar.O && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.U = 1;
            } else if (uVar.f32367b) {
                pVar.U = 1;
            } else if (this.f32249f0.f32145b) {
                pVar.U = 0;
            } else if (uVar.f32394w.presentation) {
                pVar.U = 1;
            } else {
                pVar.U = 2;
            }
            uVar.O = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f32394w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f32248e0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f32258p0.requestLayout();
        super.requestLayout();
    }
}
