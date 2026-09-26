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
import org.telegram.ui.Components.r81;
import org.telegram.ui.d60;
public final class p extends t2 {
    public float f29443g0;
    public final ChatObject.Call f29444h0;
    public final m0 f29445i0;
    public final TextPaint f29446j0;
    public final StaticLayout f29447k0;
    public final TextPaint f29448l0;
    public final String m0;
    public final float f29449n0;
    public final StaticLayout f29450o0;
    public final d60 f29451p0;
    public final String f29452q0;
    public final float f29453r0;
    public final u f29454s0;

    public p(u uVar, Context context, ChatObject.Call call, m0 m0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, d60 d60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f29454s0 = uVar;
        this.f29444h0 = call;
        this.f29445i0 = m0Var;
        this.f29446j0 = textPaint;
        this.f29447k0 = staticLayout;
        this.f29448l0 = textPaint2;
        this.m0 = str;
        this.f29449n0 = f7;
        this.f29450o0 = staticLayout2;
        this.f29451p0 = d60Var;
        this.f29452q0 = str2;
        this.f29453r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f29443g0 = this.f29454s0.f29588w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f29454s0;
        TextView textView = uVar.O;
        p pVar = uVar.f29559a;
        invalidate();
        ChatObject.Call call = this.f29444h0;
        if (call != null && call.call.rtmp_stream && uVar.f29593z0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.A0);
            uVar.f29593z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = uVar.f29583s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.f29590x0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.f29590x0.getAlpha() == 1.0f) {
                uVar.f29590x0.animate().alpha(0.0f).setDuration(300L).setListener(new r81(this, 4)).start();
            } else if (uVar.f29590x0.getParent() != null) {
                pVar.removeView(uVar.f29590x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f29587w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.p.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        u uVar = this.f29454s0;
        if (uVar.f29572j0 && view == uVar.f29559a.d) {
            canvas.save();
            float f7 = uVar.f29566e0;
            canvas.scale(f7, f7, uVar.f29568f0, uVar.f29569g0);
            canvas.translate(uVar.f29570h0, uVar.f29571i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        u uVar = this.f29454s0;
        p pVar = uVar.f29559a;
        ImageView imageView = uVar.f29590x0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.f29590x0.getLayoutParams().width = pVar.d.getMeasuredWidth();
            uVar.f29590x0.getLayoutParams().height = pVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u uVar = this.f29454s0;
        uVar.Q = true;
        uVar.invalidate();
        uVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f29454s0;
        p pVar = uVar.f29559a;
        boolean z11 = uVar.v;
        s2 s2Var = this.d;
        if (z11 && uVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.f29544a0 = 1;
            } else if (uVar.f29561b) {
                pVar.f29544a0 = 1;
            } else if (this.f29445i0.f29378b) {
                pVar.f29544a0 = 0;
            } else if (uVar.f29587w.presentation) {
                pVar.f29544a0 = 1;
            } else {
                pVar.f29544a0 = 2;
            }
            uVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f29587w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f29444h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f29454s0.requestLayout();
        super.requestLayout();
    }
}
