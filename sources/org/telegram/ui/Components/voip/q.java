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
public final class q extends t2 {
    public float f32261g0;
    public final ChatObject.Call f32262h0;
    public final n0 f32263i0;
    public final TextPaint f32264j0;
    public final StaticLayout f32265k0;
    public final TextPaint f32266l0;
    public final String m0;
    public final float f32267n0;
    public final StaticLayout f32268o0;
    public final g60 f32269p0;
    public final String f32270q0;
    public final float f32271r0;
    public final v f32272s0;

    public q(v vVar, Context context, ChatObject.Call call, n0 n0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, g60 g60Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f32272s0 = vVar;
        this.f32262h0 = call;
        this.f32263i0 = n0Var;
        this.f32264j0 = textPaint;
        this.f32265k0 = staticLayout;
        this.f32266l0 = textPaint2;
        this.m0 = str;
        this.f32267n0 = f7;
        this.f32268o0 = staticLayout2;
        this.f32269p0 = g60Var;
        this.f32270q0 = str2;
        this.f32271r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f32261g0 = this.f32272s0.f32404w0;
    }

    @Override
    public final void b() {
        int i10;
        ChatObject.VideoParticipant videoParticipant;
        v vVar = this.f32272s0;
        TextView textView = vVar.O;
        q qVar = vVar.f32374a;
        invalidate();
        ChatObject.Call call = this.f32262h0;
        if (call != null && call.call.rtmp_stream && vVar.f32409z0) {
            AndroidUtilities.cancelRunOnUIThread(vVar.A0);
            vVar.f32409z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            qVar.animate().cancel();
            qVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = vVar.f32399s0;
        s2 s2Var = this.d;
        if (!z10 && s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f32340e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = vVar.f32406x0;
        if (imageView != null && imageView.getParent() != null) {
            if (vVar.f32406x0.getAlpha() == 1.0f) {
                vVar.f32406x0.animate().alpha(0.0f).setDuration(300L).setListener(new j91(this, 4)).start();
            } else if (vVar.f32406x0.getParent() != null) {
                qVar.removeView(vVar.f32406x0);
            }
        }
        int i11 = s2Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = vVar.f32403w) != null) {
            videoParticipant.setAspectRatio(i10, i11, call);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.q.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v vVar = this.f32272s0;
        if (vVar.f32388j0 && view == vVar.f32374a.d) {
            canvas.save();
            float f7 = vVar.f32382e0;
            canvas.scale(f7, f7, vVar.f32384f0, vVar.f32385g0);
            canvas.translate(vVar.f32386h0, vVar.f32387i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        v vVar = this.f32272s0;
        q qVar = vVar.f32374a;
        ImageView imageView = vVar.f32406x0;
        if (imageView != null && imageView.getParent() != null) {
            vVar.f32406x0.getLayoutParams().width = qVar.d.getMeasuredWidth();
            vVar.f32406x0.getLayoutParams().height = qVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        v vVar = this.f32272s0;
        vVar.Q = true;
        vVar.invalidate();
        vVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ChatObject.VideoParticipant videoParticipant;
        v vVar = this.f32272s0;
        q qVar = vVar.f32374a;
        boolean z11 = vVar.v;
        s2 s2Var = this.d;
        if (z11 && vVar.R && s2Var.rotatedFrameHeight != 0 && s2Var.rotatedFrameWidth != 0) {
            if (vVar.h) {
                qVar.f32334a0 = 1;
            } else if (vVar.f32376b) {
                qVar.f32334a0 = 1;
            } else if (this.f32263i0.f32178b) {
                qVar.f32334a0 = 0;
            } else if (vVar.f32403w.presentation) {
                qVar.f32334a0 = 1;
            } else {
                qVar.f32334a0 = 2;
            }
            vVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = s2Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = s2Var.rotatedFrameWidth) != 0 && (videoParticipant = vVar.f32403w) != null) {
            videoParticipant.setAspectRatio(i14, i15, this.f32262h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f32272s0.requestLayout();
        super.requestLayout();
    }
}
