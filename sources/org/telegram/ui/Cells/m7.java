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
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;
public final class m7 extends FrameLayout {
    public final org.telegram.ui.Components.l9 f29557a;
    public final TextView f29558b;
    public final n5 f29559c;
    public final View d;
    public final wo f29560e;
    public final FrameLayout f29561f;
    public AnimatorSet h;
    public ij f29562n;
    public final p7 f29563r;

    public m7(p7 p7Var, Context context) {
        super(context);
        this.f29563r = p7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29561f = frameLayout;
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29557a = l9Var;
        l9Var.getImageReceiver().F0 = true;
        l9Var.getImageReceiver().G0 = true;
        frameLayout.addView(l9Var, c8.ha.c(-1.0f, -1));
        n5 n5Var = new n5(context, 1);
        n5Var.f29615b = new RectF();
        this.f29559c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(n5Var, c8.ha.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232549);
        n5Var.addView(imageView, c8.ha.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f29558b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, c8.ha.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
        wo woVar = new wo(21, context, null);
        this.f29560e = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.f27979k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(1);
        addView(woVar, c8.ha.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.f29560e.f40058a.f31259q) {
            org.telegram.ui.Components.l9 l9Var = this.f29557a;
            if (l9Var.getImageReceiver().I() && l9Var.getImageReceiver().f21194h1 == 1.0f && !PhotoViewer.L1(this.f29562n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f29563r.f29739n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29562n.E3()) {
            accessibilityNodeInfo.setText(hd.M0(2131753962, null));
        } else if (ij.M4(this.f29562n.f23244k)) {
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
            sb2.append(hd.z((int) this.f29562n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(hd.M0(2131753948, null));
        }
        if (this.f29560e.f40058a.f31259q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(ij ijVar) {
        long j3;
        int i7;
        int i10;
        this.f29562n = ijVar;
        this.f29557a.getImageReceiver().O0(!PhotoViewer.L1(ijVar), false);
        if (!TextUtils.isEmpty(qp.s1(this.f29563r.f29741s).F1(ijVar.f23244k.restriction_reason))) {
            this.f29559c.setVisibility(4);
            this.f29557a.setImageResource(2131232524);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (ij.M4(ijVar.f23244k)) {
            this.f29559c.setVisibility(0);
            this.f29558b.setText(org.telegram.messenger.g0.g0((int) ijVar.L0(), false, false));
            TLRPC.Document F0 = ijVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            if (w10 != w11) {
                photoSize = w11;
            }
            if (w10 != null) {
                if (ijVar.G1 != null) {
                    this.f29557a.k(hc.c(photoSize, F0), "100_100", null, ijVar.G1, ijVar);
                    return;
                } else {
                    this.f29557a.n(hc.c(photoSize, F0), "100_100", hc.c(w10, F0), "b", org.telegram.messenger.t0.f25563b.getResources().getDrawable(2131232524), null, 0, ijVar);
                    return;
                }
            }
            this.f29557a.setImageResource(2131232524);
            return;
        }
        TLRPC.MessageMedia messageMedia = ijVar.f23244k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !ijVar.f23255n0.isEmpty()) {
            this.f29559c.setVisibility(4);
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ijVar.f23255n0, 50, false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ijVar.f23255n0, 320, false, w12, false);
            if (!ijVar.f23293x0 && !org.telegram.messenger.z5.q(this.f29563r.f29741s).d(ijVar)) {
                BitmapDrawable bitmapDrawable = ijVar.G1;
                if (bitmapDrawable != null) {
                    this.f29557a.n(null, null, null, null, bitmapDrawable, null, 0, ijVar);
                    return;
                } else {
                    this.f29557a.n(null, null, hc.f(w12, ijVar.f23249l0), "b", org.telegram.messenger.t0.f25563b.getResources().getDrawable(2131232524), null, 0, ijVar);
                    return;
                }
            }
            if (w13 != w12) {
                photoSize = w12;
            }
            if (ijVar.G1 != null) {
                ImageReceiver imageReceiver = this.f29557a.getImageReceiver();
                hc f10 = hc.f(w13, ijVar.f23249l0);
                long j10 = 0;
                BitmapDrawable bitmapDrawable2 = ijVar.G1;
                if (w13 != null) {
                    j10 = w13.size;
                }
                long j11 = j10;
                if (ij.S5(ijVar.f23244k)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                imageReceiver.r0(f10, "100_100", null, null, bitmapDrawable2, j11, null, ijVar, i10);
                return;
            }
            ImageReceiver imageReceiver2 = this.f29557a.getImageReceiver();
            hc f11 = hc.f(w13, ijVar.f23249l0);
            hc f12 = hc.f(photoSize, ijVar.f23249l0);
            if (w13 != null) {
                j3 = w13.size;
            } else {
                j3 = 0;
            }
            if (ij.S5(ijVar.f23244k)) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            imageReceiver2.r0(f11, "100_100", f12, "b", null, j3, null, ijVar, i7);
            return;
        }
        this.f29559c.setVisibility(4);
        this.f29557a.setImageResource(2131232524);
    }
}
