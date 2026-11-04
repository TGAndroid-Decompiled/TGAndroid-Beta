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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;
public final class l7 extends FrameLayout {
    public final org.telegram.ui.Components.k9 f29585a;
    public final TextView f29586b;
    public final n5 f29587c;
    public final View d;
    public final wo f29588e;
    public final FrameLayout f29589f;
    public AnimatorSet h;
    public zi f29590n;
    public final o7 f29591r;

    public l7(o7 o7Var, Context context) {
        super(context);
        this.f29591r = o7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29589f = frameLayout;
        addView(frameLayout, mf.c(-1.0f, -1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29585a = k9Var;
        k9Var.getImageReceiver().G0 = true;
        k9Var.getImageReceiver().H0 = true;
        frameLayout.addView(k9Var, mf.c(-1.0f, -1));
        n5 n5Var = new n5(context, 1);
        n5Var.f29675b = new RectF();
        this.f29587c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(n5Var, mf.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232547);
        n5Var.addView(imageView, mf.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f29586b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, mf.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
        wo woVar = new wo(21, context, null);
        this.f29588e = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(1);
        addView(woVar, mf.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.f29588e.f40035a.f31334q) {
            org.telegram.ui.Components.k9 k9Var = this.f29585a;
            if (k9Var.getImageReceiver().I() && k9Var.getImageReceiver().f21249i1 == 1.0f && !PhotoViewer.Q1(this.f29590n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f29591r.f29755n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29590n.E3()) {
            accessibilityNodeInfo.setText(bd.M0(2131753962, null));
        } else if (zi.M4(this.f29590n.f26868k)) {
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
            sb2.append(bd.z((int) this.f29590n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(bd.M0(2131753948, null));
        }
        if (this.f29588e.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(zi ziVar) {
        long j10;
        int i3;
        int i10;
        this.f29590n = ziVar;
        this.f29585a.getImageReceiver().O0(!PhotoViewer.Q1(ziVar), false);
        if (!TextUtils.isEmpty(hp.s1(this.f29591r.f29757s).F1(ziVar.f26868k.restriction_reason))) {
            this.f29587c.setVisibility(4);
            this.f29585a.setImageResource(2131232524);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (zi.M4(ziVar.f26868k)) {
            this.f29587c.setVisibility(0);
            this.f29586b.setText(org.telegram.messenger.g0.g0((int) ziVar.L0(), false, false));
            TLRPC.Document F0 = ziVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            if (w10 != w11) {
                photoSize = w11;
            }
            if (w10 != null) {
                if (ziVar.G1 != null) {
                    this.f29585a.k(ac.c(photoSize, F0), "100_100", null, ziVar.G1, ziVar);
                    return;
                } else {
                    this.f29585a.n(ac.c(photoSize, F0), "100_100", ac.c(w10, F0), "b", org.telegram.messenger.t0.f25457b.getResources().getDrawable(2131232524), null, 0, ziVar);
                    return;
                }
            }
            this.f29585a.setImageResource(2131232524);
            return;
        }
        TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !ziVar.f26878n0.isEmpty()) {
            this.f29587c.setVisibility(4);
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ziVar.f26878n0, 50, false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ziVar.f26878n0, 320, false, w12, false);
            if (!ziVar.f26917x0 && !org.telegram.messenger.z5.q(this.f29591r.f29757s).d(ziVar)) {
                BitmapDrawable bitmapDrawable = ziVar.G1;
                if (bitmapDrawable != null) {
                    this.f29585a.n(null, null, null, null, bitmapDrawable, null, 0, ziVar);
                    return;
                } else {
                    this.f29585a.n(null, null, ac.f(w12, ziVar.f26872l0), "b", org.telegram.messenger.t0.f25457b.getResources().getDrawable(2131232524), null, 0, ziVar);
                    return;
                }
            }
            if (w13 != w12) {
                photoSize = w12;
            }
            if (ziVar.G1 != null) {
                ImageReceiver imageReceiver = this.f29585a.getImageReceiver();
                ac f10 = ac.f(w13, ziVar.f26872l0);
                long j11 = 0;
                BitmapDrawable bitmapDrawable2 = ziVar.G1;
                if (w13 != null) {
                    j11 = w13.size;
                }
                long j12 = j11;
                if (zi.S5(ziVar.f26868k)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j12, null, ziVar, i10);
                return;
            }
            ImageReceiver imageReceiver2 = this.f29585a.getImageReceiver();
            ac f11 = ac.f(w13, ziVar.f26872l0);
            ac f12 = ac.f(photoSize, ziVar.f26872l0);
            if (w13 != null) {
                j10 = w13.size;
            } else {
                j10 = 0;
            }
            if (zi.S5(ziVar.f26868k)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            imageReceiver2.r0(f11, "100_100", f12, "b", null, j10, null, ziVar, i3);
            return;
        }
        this.f29587c.setVisibility(4);
        this.f29585a.setImageResource(2131232524);
    }
}
