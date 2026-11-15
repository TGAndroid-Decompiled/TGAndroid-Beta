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
import org.telegram.ui.Components.fp;
import org.telegram.ui.PhotoViewer;
public final class l7 extends FrameLayout {
    public final org.telegram.ui.Components.i9 f30646a;
    public final TextView f30647b;
    public final n5 f30648c;
    public final View d;
    public final fp f30649e;
    public final FrameLayout f30650f;
    public AnimatorSet h;
    public gj f30651n;
    public final o7 f30652r;

    public l7(o7 o7Var, Context context) {
        super(context);
        this.f30652r = o7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30650f = frameLayout;
        addView(frameLayout, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30646a = i9Var;
        i9Var.getImageReceiver().G0 = true;
        i9Var.getImageReceiver().H0 = true;
        frameLayout.addView(i9Var, c8.ja.c(-1.0f, -1));
        n5 n5Var = new n5(context, 1);
        n5Var.f30736b = new RectF();
        this.f30648c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(n5Var, c8.ja.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232550);
        n5Var.addView(imageView, c8.ja.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f30647b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, c8.ja.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
        addView(view, c8.ja.c(-1.0f, -1));
        fp fpVar = new fp(21, context, null);
        this.f30649e = fpVar;
        fpVar.setVisibility(4);
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.Ci, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(1);
        addView(fpVar, c8.ja.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.f30649e.f34663a.f32441q) {
            org.telegram.ui.Components.i9 i9Var = this.f30646a;
            if (i9Var.getImageReceiver().I() && i9Var.getImageReceiver().f22278i1 == 1.0f && !PhotoViewer.L1(this.f30651n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f30652r.f30816n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30651n.D3()) {
            accessibilityNodeInfo.setText(hd.M0(2131753962, null));
        } else if (gj.L4(this.f30651n.f23817k)) {
            StringBuilder sb2 = new StringBuilder();
            y0.r(null, 2131753933, sb2, ", ");
            sb2.append(hd.z((int) this.f30651n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(hd.M0(2131753948, null));
        }
        if (this.f30649e.f34663a.f32441q) {
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
        this.f30651n = gjVar;
        this.f30646a.getImageReceiver().O0(!PhotoViewer.L1(gjVar), false);
        if (!TextUtils.isEmpty(np.s1(this.f30652r.f30818s).F1(gjVar.f23817k.restriction_reason))) {
            this.f30648c.setVisibility(4);
            this.f30646a.setImageResource(2131232525);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (gj.L4(gjVar.f23817k)) {
            this.f30648c.setVisibility(0);
            this.f30647b.setText(org.telegram.messenger.g0.g0((int) gjVar.L0(), false, false));
            TLRPC.Document F0 = gjVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            if (w10 != w11) {
                photoSize = w11;
            }
            if (w10 != null) {
                if (gjVar.I1 != null) {
                    this.f30646a.k(gc.c(photoSize, F0), "100_100", null, gjVar.I1, gjVar);
                    return;
                } else {
                    this.f30646a.n(gc.c(photoSize, F0), "100_100", gc.c(w10, F0), "b", org.telegram.messenger.t0.f26600b.getResources().getDrawable(2131232525), null, 0, gjVar);
                    return;
                }
            }
            this.f30646a.setImageResource(2131232525);
            return;
        }
        TLRPC.MessageMedia messageMedia = gjVar.f23817k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !gjVar.f23837p0.isEmpty()) {
            this.f30648c.setVisibility(4);
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(gjVar.f23837p0, 50, false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(gjVar.f23837p0, 320, false, w12, false);
            if (!gjVar.f23876z0 && !org.telegram.messenger.z5.q(this.f30652r.f30818s).d(gjVar)) {
                BitmapDrawable bitmapDrawable = gjVar.I1;
                if (bitmapDrawable != null) {
                    this.f30646a.n(null, null, null, null, bitmapDrawable, null, 0, gjVar);
                    return;
                } else {
                    this.f30646a.n(null, null, gc.f(w12, gjVar.f23830n0), "b", org.telegram.messenger.t0.f26600b.getResources().getDrawable(2131232525), null, 0, gjVar);
                    return;
                }
            }
            if (w13 != w12) {
                photoSize = w12;
            }
            if (gjVar.I1 != null) {
                ImageReceiver imageReceiver = this.f30646a.getImageReceiver();
                gc f10 = gc.f(w13, gjVar.f23830n0);
                long j10 = 0;
                BitmapDrawable bitmapDrawable2 = gjVar.I1;
                if (w13 != null) {
                    j10 = w13.size;
                }
                long j11 = j10;
                if (gj.R5(gjVar.f23817k)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j11, null, gjVar, i10);
                return;
            }
            ImageReceiver imageReceiver2 = this.f30646a.getImageReceiver();
            gc f11 = gc.f(w13, gjVar.f23830n0);
            gc f12 = gc.f(photoSize, gjVar.f23830n0);
            if (w13 != null) {
                j3 = w13.size;
            } else {
                j3 = 0;
            }
            if (gj.R5(gjVar.f23817k)) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            imageReceiver2.r0(f11, "100_100", f12, "b", null, j3, null, gjVar, i7);
            return;
        }
        this.f30648c.setVisibility(4);
        this.f30646a.setImageResource(2131232525);
    }
}
