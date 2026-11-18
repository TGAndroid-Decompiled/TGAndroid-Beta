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
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
import org.telegram.ui.PhotoViewer;
public final class n7 extends FrameLayout {
    public final org.telegram.ui.Components.q9 f31127a;
    public final TextView f31128b;
    public final p5 f31129c;
    public final View d;
    public final mp f31130e;
    public final FrameLayout f31131f;
    public AnimatorSet h;
    public fj f31132n;
    public final q7 f31133r;

    public n7(q7 q7Var, Context context) {
        super(context);
        this.f31133r = q7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31131f = frameLayout;
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31127a = q9Var;
        q9Var.getImageReceiver().G0 = true;
        q9Var.getImageReceiver().H0 = true;
        frameLayout.addView(q9Var, c8.ma.c(-1.0f, -1));
        p5 p5Var = new p5(context, 1);
        p5Var.f31218b = new RectF();
        this.f31129c = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(p5Var, c8.ma.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232551);
        p5Var.addView(imageView, c8.ma.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31128b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, c8.ma.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        mp mpVar = new mp(21, context, null);
        this.f31130e = mpVar;
        mpVar.setVisibility(4);
        mpVar.b(-1, org.telegram.ui.ActionBar.n6.Ci, org.telegram.ui.ActionBar.n6.f29524k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(1);
        addView(mpVar, c8.ma.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.f31130e.f37598a.f32838q) {
            org.telegram.ui.Components.q9 q9Var = this.f31127a;
            if (q9Var.getImageReceiver().I() && q9Var.getImageReceiver().f22641i1 == 1.0f && !PhotoViewer.L1(this.f31132n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f31133r.f31296n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f31132n.D3()) {
            accessibilityNodeInfo.setText(gd.M0(2131753960, null));
        } else if (fj.L4(this.f31132n.f23965k)) {
            StringBuilder sb2 = new StringBuilder();
            c0.u(null, 2131753931, sb2, ", ");
            sb2.append(gd.z((int) this.f31132n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(gd.M0(2131753946, null));
        }
        if (this.f31130e.f37598a.f32838q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(fj fjVar) {
        long j3;
        int i7;
        int i10;
        this.f31132n = fjVar;
        this.f31127a.getImageReceiver().O0(!PhotoViewer.L1(fjVar), false);
        if (!TextUtils.isEmpty(org.telegram.messenger.mp.u1(this.f31133r.f31298s).H1(fjVar.f23965k.restriction_reason))) {
            this.f31129c.setVisibility(4);
            this.f31127a.setImageResource(2131232526);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (fj.L4(fjVar.f23965k)) {
            this.f31129c.setVisibility(0);
            this.f31128b.setText(org.telegram.messenger.g0.g0((int) fjVar.L0(), false, false));
            TLRPC.Document F0 = fjVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            if (w10 != w11) {
                photoSize = w11;
            }
            if (w10 != null) {
                if (fjVar.I1 != null) {
                    this.f31127a.k(fc.c(photoSize, F0), "100_100", null, fjVar.I1, fjVar);
                    return;
                } else {
                    this.f31127a.n(fc.c(photoSize, F0), "100_100", fc.c(w10, F0), "b", org.telegram.messenger.t0.f26913b.getResources().getDrawable(2131232526), null, 0, fjVar);
                    return;
                }
            }
            this.f31127a.setImageResource(2131232526);
            return;
        }
        TLRPC.MessageMedia messageMedia = fjVar.f23965k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !fjVar.f23985p0.isEmpty()) {
            this.f31129c.setVisibility(4);
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(fjVar.f23985p0, 50, false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(fjVar.f23985p0, 320, false, w12, false);
            if (!fjVar.f24024z0 && !org.telegram.messenger.a6.q(this.f31133r.f31298s).d(fjVar)) {
                BitmapDrawable bitmapDrawable = fjVar.I1;
                if (bitmapDrawable != null) {
                    this.f31127a.n(null, null, null, null, bitmapDrawable, null, 0, fjVar);
                    return;
                } else {
                    this.f31127a.n(null, null, fc.f(w12, fjVar.f23978n0), "b", org.telegram.messenger.t0.f26913b.getResources().getDrawable(2131232526), null, 0, fjVar);
                    return;
                }
            }
            if (w13 != w12) {
                photoSize = w12;
            }
            if (fjVar.I1 != null) {
                ImageReceiver imageReceiver = this.f31127a.getImageReceiver();
                fc f10 = fc.f(w13, fjVar.f23978n0);
                long j10 = 0;
                BitmapDrawable bitmapDrawable2 = fjVar.I1;
                if (w13 != null) {
                    j10 = w13.size;
                }
                long j11 = j10;
                if (fj.R5(fjVar.f23965k)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j11, null, fjVar, i10);
                return;
            }
            ImageReceiver imageReceiver2 = this.f31127a.getImageReceiver();
            fc f11 = fc.f(w13, fjVar.f23978n0);
            fc f12 = fc.f(photoSize, fjVar.f23978n0);
            if (w13 != null) {
                j3 = w13.size;
            } else {
                j3 = 0;
            }
            if (fj.R5(fjVar.f23965k)) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            imageReceiver2.r0(f11, "100_100", f12, "b", null, j3, null, fjVar, i7);
            return;
        }
        this.f31129c.setVisibility(4);
        this.f31127a.setImageResource(2131232526);
    }
}
