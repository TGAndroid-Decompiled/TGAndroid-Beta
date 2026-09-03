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
import org.telegram.ui.e60;
public final class o extends s2 {
    public float f29782d0;
    public final ChatObject.Call f29783e0;
    public final k0 f29784f0;
    public final TextPaint f29785g0;
    public final StaticLayout f29786h0;
    public final TextPaint f29787i0;
    public final String f29788j0;
    public final float f29789k0;
    public final StaticLayout f29790l0;
    public final e60 m0;
    public final String f29791n0;
    public final float f29792o0;
    public final t f29793p0;

    public o(t tVar, Context context, ChatObject.Call call, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, e60 e60Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f29793p0 = tVar;
        this.f29783e0 = call;
        this.f29784f0 = k0Var;
        this.f29785g0 = textPaint;
        this.f29786h0 = staticLayout;
        this.f29787i0 = textPaint2;
        this.f29788j0 = str;
        this.f29789k0 = f10;
        this.f29790l0 = staticLayout2;
        this.m0 = e60Var;
        this.f29791n0 = str2;
        this.f29792o0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f29782d0 = this.f29793p0.f29916t0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f29793p0;
        TextView textView = tVar.L;
        o oVar = tVar.f29891a;
        invalidate();
        ChatObject.Call call = this.f29783e0;
        if (call != null && call.call.rtmp_stream && tVar.f29920w0) {
            AndroidUtilities.cancelRunOnUIThread(tVar.f29922x0);
            tVar.f29920w0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            oVar.animate().cancel();
            oVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z4 = tVar.f29910p0;
        r2 r2Var = this.d;
        if (!z4 && r2Var.getAlpha() != 1.0f) {
            r2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = tVar.f29917u0;
        if (imageView != null && imageView.getParent() != null) {
            if (tVar.f29917u0.getAlpha() == 1.0f) {
                tVar.f29917u0.animate().alpha(0.0f).setDuration(300L).setListener(new f91(this, 2)).start();
            } else if (tVar.f29917u0.getParent() != null) {
                oVar.removeView(tVar.f29917u0);
            }
        }
        int i11 = r2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = r2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f29919w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.o.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t tVar = this.f29793p0;
        if (tVar.f29901g0 && view == tVar.f29891a.d) {
            canvas.save();
            float f10 = tVar.f29894b0;
            canvas.scale(f10, f10, tVar.f29896c0, tVar.f29897d0);
            canvas.translate(tVar.f29898e0, tVar.f29900f0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        t tVar = this.f29793p0;
        o oVar = tVar.f29891a;
        ImageView imageView = tVar.f29917u0;
        if (imageView != null && imageView.getParent() != null) {
            tVar.f29917u0.getLayoutParams().width = oVar.d.getMeasuredWidth();
            tVar.f29917u0.getLayoutParams().height = oVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t tVar = this.f29793p0;
        tVar.N = true;
        tVar.invalidate();
        tVar.N = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        t tVar = this.f29793p0;
        o oVar = tVar.f29891a;
        boolean z10 = tVar.v;
        r2 r2Var = this.d;
        if (z10 && tVar.O && r2Var.rotatedFrameHeight != 0 && r2Var.rotatedFrameWidth != 0) {
            if (tVar.h) {
                oVar.U = 1;
            } else if (tVar.f29893b) {
                oVar.U = 1;
            } else if (this.f29784f0.f29685b) {
                oVar.U = 0;
            } else if (tVar.f29919w.presentation) {
                oVar.U = 1;
            } else {
                oVar.U = 2;
            }
            tVar.O = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = r2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = r2Var.rotatedFrameWidth) != 0 && (videoParticipant = tVar.f29919w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f29783e0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f29793p0.requestLayout();
        super.requestLayout();
    }
}
