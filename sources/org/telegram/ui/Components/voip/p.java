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
import org.telegram.ui.Components.j91;
import org.telegram.ui.g60;
public final class p extends s2 {
    public float f32203g0;
    public final ChatObject.Call f32204h0;
    public final m0 f32205i0;
    public final TextPaint f32206j0;
    public final StaticLayout f32207k0;
    public final TextPaint f32208l0;
    public final String m0;
    public final float f32209n0;
    public final StaticLayout f32210o0;
    public final g60 f32211p0;
    public final String f32212q0;
    public final float f32213r0;
    public final u f32214s0;

    public p(u uVar, Context context, ChatObject.Call call, m0 m0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, g60 g60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f32214s0 = uVar;
        this.f32204h0 = call;
        this.f32205i0 = m0Var;
        this.f32206j0 = textPaint;
        this.f32207k0 = staticLayout;
        this.f32208l0 = textPaint2;
        this.m0 = str;
        this.f32209n0 = f7;
        this.f32210o0 = staticLayout2;
        this.f32211p0 = g60Var;
        this.f32212q0 = str2;
        this.f32213r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f32203g0 = this.f32214s0.f32346w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f32214s0;
        TextView textView = uVar.O;
        p pVar = uVar.f32316a;
        invalidate();
        ChatObject.Call call = this.f32204h0;
        if (call != null && call.call.rtmp_stream && uVar.f32351z0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.A0);
            uVar.f32351z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = uVar.f32341s0;
        r2 r2Var = this.d;
        if (!z10 && r2Var.getAlpha() != 1.0f) {
            r2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f32282e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.f32348x0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.f32348x0.getAlpha() == 1.0f) {
                uVar.f32348x0.animate().alpha(0.0f).setDuration(300L).setListener(new j91(this, 4)).start();
            } else if (uVar.f32348x0.getParent() != null) {
                pVar.removeView(uVar.f32348x0);
            }
        }
        int i11 = r2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = r2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f32345w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.p.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        u uVar = this.f32214s0;
        if (uVar.f32330j0 && view == uVar.f32316a.d) {
            canvas.save();
            float f7 = uVar.f32324e0;
            canvas.scale(f7, f7, uVar.f32326f0, uVar.f32327g0);
            canvas.translate(uVar.f32328h0, uVar.f32329i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        u uVar = this.f32214s0;
        p pVar = uVar.f32316a;
        ImageView imageView = uVar.f32348x0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.f32348x0.getLayoutParams().width = pVar.d.getMeasuredWidth();
            uVar.f32348x0.getLayoutParams().height = pVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u uVar = this.f32214s0;
        uVar.Q = true;
        uVar.invalidate();
        uVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f32214s0;
        p pVar = uVar.f32316a;
        boolean z11 = uVar.v;
        r2 r2Var = this.d;
        if (z11 && uVar.R && r2Var.rotatedFrameHeight != 0 && r2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.f32276a0 = 1;
            } else if (uVar.f32318b) {
                pVar.f32276a0 = 1;
            } else if (this.f32205i0.f32120b) {
                pVar.f32276a0 = 0;
            } else if (uVar.f32345w.presentation) {
                pVar.f32276a0 = 1;
            } else {
                pVar.f32276a0 = 2;
            }
            uVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = r2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = r2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f32345w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f32204h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f32214s0.requestLayout();
        super.requestLayout();
    }
}
