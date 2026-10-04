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
import org.telegram.ui.Components.a91;
import org.telegram.ui.h60;
public final class p extends t2 {
    public float f32051g0;
    public final ChatObject.Call f32052h0;
    public final m0 f32053i0;
    public final TextPaint f32054j0;
    public final StaticLayout f32055k0;
    public final TextPaint f32056l0;
    public final String m0;
    public final float f32057n0;
    public final StaticLayout f32058o0;
    public final h60 f32059p0;
    public final String f32060q0;
    public final float f32061r0;
    public final u f32062s0;

    public p(u uVar, Context context, ChatObject.Call call, m0 m0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, h60 h60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f32062s0 = uVar;
        this.f32052h0 = call;
        this.f32053i0 = m0Var;
        this.f32054j0 = textPaint;
        this.f32055k0 = staticLayout;
        this.f32056l0 = textPaint2;
        this.m0 = str;
        this.f32057n0 = f7;
        this.f32058o0 = staticLayout2;
        this.f32059p0 = h60Var;
        this.f32060q0 = str2;
        this.f32061r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f32051g0 = this.f32062s0.f32207w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f32062s0;
        TextView textView = uVar.O;
        p pVar = uVar.f32177a;
        invalidate();
        ChatObject.Call call = this.f32052h0;
        if (call != null && call.call.rtmp_stream && uVar.f32212z0) {
            AndroidUtilities.cancelRunOnUIThread(uVar.A0);
            uVar.f32212z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            pVar.animate().cancel();
            pVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = uVar.f32202s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f32167e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = uVar.f32209x0;
        if (imageView != null && imageView.getParent() != null) {
            if (uVar.f32209x0.getAlpha() == 1.0f) {
                uVar.f32209x0.animate().alpha(0.0f).setDuration(300L).setListener(new a91(this, 4)).start();
            } else if (uVar.f32209x0.getParent() != null) {
                pVar.removeView(uVar.f32209x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f32206w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.p.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        u uVar = this.f32062s0;
        if (uVar.f32191j0 && view == uVar.f32177a.d) {
            canvas.save();
            float f7 = uVar.f32185e0;
            canvas.scale(f7, f7, uVar.f32187f0, uVar.f32188g0);
            canvas.translate(uVar.f32189h0, uVar.f32190i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        u uVar = this.f32062s0;
        p pVar = uVar.f32177a;
        ImageView imageView = uVar.f32209x0;
        if (imageView != null && imageView.getParent() != null) {
            uVar.f32209x0.getLayoutParams().width = pVar.d.getMeasuredWidth();
            uVar.f32209x0.getLayoutParams().height = pVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u uVar = this.f32062s0;
        uVar.Q = true;
        uVar.invalidate();
        uVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        u uVar = this.f32062s0;
        p pVar = uVar.f32177a;
        boolean z11 = uVar.v;
        s2 s2Var = this.d;
        if (z11 && uVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (uVar.h) {
                pVar.f32161a0 = 1;
            } else if (uVar.f32179b) {
                pVar.f32161a0 = 1;
            } else if (this.f32053i0.f31982b) {
                pVar.f32161a0 = 0;
            } else if (uVar.f32206w.presentation) {
                pVar.f32161a0 = 1;
            } else {
                pVar.f32161a0 = 2;
            }
            uVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = uVar.f32206w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f32052h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f32062s0.requestLayout();
        super.requestLayout();
    }
}
