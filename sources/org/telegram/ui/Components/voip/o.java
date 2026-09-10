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
import org.telegram.ui.Components.zn0;
import org.telegram.ui.j60;
public final class o extends r2 {
    public float f28293g0;
    public final ChatObject.Call f28294h0;
    public final m0 f28295i0;
    public final TextPaint f28296j0;
    public final StaticLayout f28297k0;
    public final TextPaint f28298l0;
    public final String m0;
    public final float f28299n0;
    public final StaticLayout f28300o0;
    public final j60 f28301p0;
    public final String f28302q0;
    public final float f28303r0;
    public final t f28304s0;

    public o(t tVar, Context context, ChatObject.Call call, m0 m0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, j60 j60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f28304s0 = tVar;
        this.f28294h0 = call;
        this.f28295i0 = m0Var;
        this.f28296j0 = textPaint;
        this.f28297k0 = staticLayout;
        this.f28298l0 = textPaint2;
        this.m0 = str;
        this.f28299n0 = f7;
        this.f28300o0 = staticLayout2;
        this.f28301p0 = j60Var;
        this.f28302q0 = str2;
        this.f28303r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f28293g0 = this.f28304s0.f28438w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f28304s0;
        TextView textView = tVar.O;
        o oVar = tVar.f28409a;
        invalidate();
        ChatObject.Call call = this.f28294h0;
        if (call != null && call.call.rtmp_stream && tVar.f28443z0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.A0);
            tVar.f28443z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = tVar.f28433s0;
        q2 q2Var = this.d;
        if (!z10 && q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f28440x0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f28440x0.getAlpha() == 1.0f) {
                tVar.f28440x0.animate().alpha(0.0f).setDuration(300L).setListener(new zn0(this, 23)).start();
            } else if (tVar.f28440x0.getParent() != null) {
                oVar.removeView(tVar.f28440x0);
            }
        }
        int i11 = q2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = q2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f28437w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        t tVar = this.f28304s0;
        if (tVar.f28422j0 && view == tVar.f28409a.d) {
            canvas.save();
            float f7 = tVar.f28416e0;
            canvas.scale(f7, f7, tVar.f28418f0, tVar.f28419g0);
            canvas.translate(tVar.f28420h0, tVar.f28421i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f28304s0;
        o oVar = tVar.f28409a;
        ImageView imageView = tVar.f28440x0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f28440x0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f28440x0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f28304s0;
        tVar.Q = true;
        tVar.invalidate();
        tVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f28304s0;
        o oVar = tVar.f28409a;
        boolean z11 = tVar.v;
        q2 q2Var = this.d;
        if (z11 && tVar.R && q2Var.rotatedFrameHeight != 0 && q2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.f28373a0 = 1;
            } else if (tVar.f28411b) {
                oVar.f28373a0 = 1;
            } else if (this.f28295i0.f28241b) {
                oVar.f28373a0 = 0;
            } else if (tVar.f28437w.presentation) {
                oVar.f28373a0 = 1;
            } else {
                oVar.f28373a0 = 2;
            }
            tVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = q2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = q2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f28437w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f28294h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f28304s0.requestLayout();
        super.requestLayout();
    }
}
