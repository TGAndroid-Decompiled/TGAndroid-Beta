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
import org.telegram.ui.Components.p11;
import org.telegram.ui.r50;
public final class p extends u2 {
    public float f33907c0;
    public final ChatObject.Call f33908d0;
    public final l0 f33909e0;
    public final TextPaint f33910f0;
    public final StaticLayout f33911g0;
    public final TextPaint f33912h0;
    public final String f33913i0;
    public final float f33914j0;
    public final StaticLayout f33915k0;
    public final r50 f33916l0;
    public final String m0;
    public final float f33917n0;
    public final u f33918o0;

    public p(u uVar, Context context, ChatObject.Call call, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f9, StaticLayout staticLayout2, r50 r50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f33918o0 = uVar;
        this.f33908d0 = call;
        this.f33909e0 = l0Var;
        this.f33910f0 = textPaint;
        this.f33911g0 = staticLayout;
        this.f33912h0 = textPaint2;
        this.f33913i0 = str;
        this.f33914j0 = f9;
        this.f33915k0 = staticLayout2;
        this.f33916l0 = r50Var;
        this.m0 = str2;
        this.f33917n0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f33907c0 = this.f33918o0.f34039s0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f33918o0;
        TextView textView = uVar.K;
        p pVar = uVar.f34014a;
        invalidate();
        ChatObject.Call call = this.f33908d0;
        if (call != null && call.call.rtmp_stream && uVar.f34042v0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.f34044w0);
            uVar.f34042v0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = uVar.f34033o0;
        t2 t2Var = this.d;
        if (!z10 && t2Var.getAlpha() != 1.0f) {
            t2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f34057e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.f34040t0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.f34040t0.getAlpha() == 1.0f) {
                uVar.f34040t0.animate().alpha(0.0f).setDuration(300L).setListener(new p11(this, 11)).start();
            } else if (uVar.f34040t0.getParent() != null) {
                pVar.removeView(uVar.f34040t0);
            }
        }
        int i11 = t2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = t2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f34043w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.p.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u uVar = this.f33918o0;
        if (uVar.f34024f0 && view == uVar.f34014a.d) {
            canvas.save();
            float f9 = uVar.f34015a0;
            canvas.scale(f9, f9, uVar.f34017b0, uVar.f34019c0);
            canvas.translate(uVar.f34020d0, uVar.f34022e0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        u uVar = this.f33918o0;
        p pVar = uVar.f34014a;
        ImageView imageView = uVar.f34040t0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.f34040t0.getLayoutParams().width = pVar.d.getMeasuredWidth();
            uVar.f34040t0.getLayoutParams().height = pVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u uVar = this.f33918o0;
        uVar.M = true;
        uVar.invalidate();
        uVar.M = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f33918o0;
        p pVar = uVar.f34014a;
        boolean z11 = uVar.v;
        t2 t2Var = this.d;
        if (z11 && uVar.N && t2Var.rotatedFrameHeight != 0 && t2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.T = 1;
            } else if (uVar.f34016b) {
                pVar.T = 1;
            } else if (this.f33909e0.f33796b) {
                pVar.T = 0;
            } else if (uVar.f34043w.presentation) {
                pVar.T = 1;
            } else {
                pVar.T = 2;
            }
            uVar.N = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = t2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = t2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f34043w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f33908d0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f33918o0.requestLayout();
        super.requestLayout();
    }
}
