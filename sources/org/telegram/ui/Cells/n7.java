package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.op;
import org.telegram.ui.PhotoViewer;
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.q9 f31124a;
    public final TextView f31125b;
    public final p5 f31126c;
    public final View d;
    public final op f31127e;
    public final FrameLayout f31128f;
    public AnimatorSet h;
    public gj f31129n;
    public final q7 f31130r;

    public n7(q7 q7Var, Context context) {
        super(context);
        this.f31130r = q7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31128f = frameLayout;
        addView(frameLayout, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31124a = q9Var;
        q9Var.getImageReceiver().G0 = true;
        q9Var.getImageReceiver().H0 = true;
        frameLayout.addView(q9Var, c8.na.c(-1.0f, -1));
        p5 p5Var = new p5(context, 1);
        p5Var.f31215b = new RectF();
        this.f31126c = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(p5Var, c8.na.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232551);
        p5Var.addView(imageView, c8.na.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31125b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, c8.na.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
        addView(view, c8.na.c(-1.0f, -1));
        op opVar = new op(21, context, null);
        this.f31127e = opVar;
        opVar.setVisibility(4);
        opVar.b(-1, org.telegram.ui.ActionBar.m6.Ci, org.telegram.ui.ActionBar.m6.f29477k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(1);
        addView(opVar, c8.na.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.f31127e.f38291a.f32840q) {
            org.telegram.ui.Components.q9 q9Var = this.f31124a;
            if (q9Var.getImageReceiver().I() && q9Var.getImageReceiver().f22636i1 == 1.0f && !PhotoViewer.L1(this.f31129n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f31130r.f31293n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f31129n.D3()) {
            accessibilityNodeInfo.setText(hd.N0(2131753959, null));
        } else if (gj.L4(this.f31129n.f24177k)) {
            StringBuilder sb2 = new StringBuilder();
            c0.u(null, 2131753930, sb2, ", ");
            sb2.append(hd.z((int) this.f31129n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(hd.N0(2131753945, null));
        }
        if (this.f31127e.f38291a.f32840q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(gj gjVar) {
        long j3;
        int i7;
        int i10;
        this.f31129n = gjVar;
        this.f31124a.getImageReceiver().O0(!PhotoViewer.L1(gjVar), false);
        if (!TextUtils.isEmpty(np.u1(this.f31130r.f31295s).H1(gjVar.f24177k.restriction_reason))) {
            this.f31126c.setVisibility(4);
            this.f31124a.setImageResource(2131232526);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (gj.L4(gjVar.f24177k)) {
            this.f31126c.setVisibility(0);
            this.f31125b.setText(org.telegram.messenger.g0.g0((int) gjVar.L0(), false, false));
            TLRPC.Document F0 = gjVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            if (w10 != w11) {
                photoSize = w11;
            }
            if (w10 != null) {
                if (gjVar.I1 != null) {
                    this.f31124a.k(gc.c(photoSize, F0), "100_100", null, gjVar.I1, gjVar);
                    return;
                } else {
                    this.f31124a.n(gc.c(photoSize, F0), "100_100", gc.c(w10, F0), "b", org.telegram.messenger.t0.f26895b.getResources().getDrawable(2131232526), null, 0, gjVar);
                    return;
                }
            }
            this.f31124a.setImageResource(2131232526);
            return;
        }
        TLRPC.MessageMedia messageMedia = gjVar.f24177k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !gjVar.f24197p0.isEmpty()) {
            this.f31126c.setVisibility(4);
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(gjVar.f24197p0, 50, false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(gjVar.f24197p0, 320, false, w12, false);
            if (!gjVar.f24236z0 && !org.telegram.messenger.a6.q(this.f31130r.f31295s).d(gjVar)) {
                BitmapDrawable bitmapDrawable = gjVar.I1;
                if (bitmapDrawable != null) {
                    this.f31124a.n(null, null, null, null, bitmapDrawable, null, 0, gjVar);
                    return;
                } else {
                    this.f31124a.n(null, null, gc.f(w12, gjVar.f24190n0), "b", org.telegram.messenger.t0.f26895b.getResources().getDrawable(2131232526), null, 0, gjVar);
                    return;
                }
            }
            if (w13 != w12) {
                photoSize = w12;
            }
            if (gjVar.I1 != null) {
                ImageReceiver imageReceiver = this.f31124a.getImageReceiver();
                gc f10 = gc.f(w13, gjVar.f24190n0);
                long j10 = 0;
                BitmapDrawable bitmapDrawable2 = gjVar.I1;
                if (w13 != null) {
                    j10 = w13.size;
                }
                long j11 = j10;
                if (gj.R5(gjVar.f24177k)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j11, null, gjVar, i10);
                return;
            }
            ImageReceiver imageReceiver2 = this.f31124a.getImageReceiver();
            gc f11 = gc.f(w13, gjVar.f24190n0);
            gc f12 = gc.f(photoSize, gjVar.f24190n0);
            if (w13 != null) {
                j3 = w13.size;
            } else {
                j3 = 0;
            }
            if (gj.R5(gjVar.f24177k)) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            imageReceiver2.r0(f11, "100_100", f12, "b", null, j3, null, gjVar, i7);
            return;
        }
        this.f31126c.setVisibility(4);
        this.f31124a.setImageResource(2131232526);
    }
}
