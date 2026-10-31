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
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;
import org.telegram.ui.PhotoViewer;
public final class q7 extends FrameLayout {
    public final org.telegram.ui.Components.g9 f22844a;
    public final TextView f22845b;
    public final s5 f22846c;
    public final View d;
    public final ep e;
    public final FrameLayout f22847f;
    public AnimatorSet h;
    public jj f22848n;
    public final t7 f22849r;

    public q7(t7 t7Var, Context context) {
        super(context);
        this.f22849r = t7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22847f = frameLayout;
        addView(frameLayout, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22844a = g9Var;
        g9Var.getImageReceiver().F0 = true;
        g9Var.getImageReceiver().G0 = true;
        frameLayout.addView(g9Var, w7.b6.c(-1.0f, -1));
        s5 s5Var = new s5(context, 1);
        s5Var.f23013b = new RectF();
        this.f22846c = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        frameLayout.addView(s5Var, w7.b6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232546);
        s5Var.addView(imageView, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f22845b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        s5Var.addView(textView, w7.b6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
        ep epVar = new ep(21, context, null);
        this.e = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(1);
        addView(epVar, w7.b6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.e.f25836a.f23919q) {
            org.telegram.ui.Components.g9 g9Var = this.f22844a;
            if (g9Var.getImageReceiver().I() && g9Var.getImageReceiver().f14384h1 == 1.0f && !PhotoViewer.Q1(this.f22848n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f22849r.f23096n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22848n.D3()) {
            accessibilityNodeInfo.setText(cd.L0(2131753962, null));
        } else if (jj.L4(this.f22848n.f16337k)) {
            StringBuilder sb2 = new StringBuilder();
            z20.q(null, 2131753933, sb2, ", ");
            sb2.append(cd.z((int) this.f22848n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(cd.L0(2131753948, null));
        }
        if (this.e.f25836a.f23919q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(jj jjVar) {
        long j10;
        int i10;
        int i11;
        this.f22848n = jjVar;
        this.f22844a.getImageReceiver().O0(!PhotoViewer.Q1(jjVar), false);
        if (!TextUtils.isEmpty(vp.r1(this.f22849r.f23098s).E1(jjVar.f16337k.restriction_reason))) {
            this.f22846c.setVisibility(4);
            this.f22844a.setImageResource(2131232523);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (jj.L4(jjVar.f16337k)) {
            this.f22846c.setVisibility(0);
            this.f22845b.setText(org.telegram.messenger.i0.g0((int) jjVar.L0(), false, false));
            TLRPC.Document F0 = jjVar.F0();
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F0.thumbs, 320, false, null, false);
            if (w9 != w10) {
                photoSize = w10;
            }
            if (w9 != null) {
                if (jjVar.G1 != null) {
                    this.f22844a.k(ic.c(photoSize, F0), "100_100", null, jjVar.G1, jjVar);
                    return;
                } else {
                    this.f22844a.o(ic.c(photoSize, F0), "100_100", ic.c(w9, F0), "b", org.telegram.messenger.w0.f19025b.getResources().getDrawable(2131232523), null, 0, jjVar);
                    return;
                }
            }
            this.f22844a.setImageResource(2131232523);
            return;
        }
        TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !jjVar.f16348n0.isEmpty()) {
            this.f22846c.setVisibility(4);
            TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(jjVar.f16348n0, 50, false, null, false);
            TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(jjVar.f16348n0, 320, false, w11, false);
            if (!jjVar.f16387x0 && !org.telegram.messenger.b6.q(this.f22849r.f23098s).d(jjVar)) {
                BitmapDrawable bitmapDrawable = jjVar.G1;
                if (bitmapDrawable != null) {
                    this.f22844a.o(null, null, null, null, bitmapDrawable, null, 0, jjVar);
                    return;
                } else {
                    this.f22844a.o(null, null, ic.f(w11, jjVar.f16342l0), "b", org.telegram.messenger.w0.f19025b.getResources().getDrawable(2131232523), null, 0, jjVar);
                    return;
                }
            }
            if (w12 != w11) {
                photoSize = w11;
            }
            if (jjVar.G1 != null) {
                ImageReceiver imageReceiver = this.f22844a.getImageReceiver();
                ic f7 = ic.f(w12, jjVar.f16342l0);
                long j11 = 0;
                BitmapDrawable bitmapDrawable2 = jjVar.G1;
                if (w12 != null) {
                    j11 = w12.size;
                }
                long j12 = j11;
                if (jj.Q5(jjVar.f16337k)) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                imageReceiver.r0(f7, "100_100", null, null, bitmapDrawable2, j12, null, jjVar, i11);
                return;
            }
            ImageReceiver imageReceiver2 = this.f22844a.getImageReceiver();
            ic f10 = ic.f(w12, jjVar.f16342l0);
            ic f11 = ic.f(photoSize, jjVar.f16342l0);
            if (w12 != null) {
                j10 = w12.size;
            } else {
                j10 = 0;
            }
            if (jj.Q5(jjVar.f16337k)) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            imageReceiver2.r0(f10, "100_100", f11, "b", null, j10, null, jjVar, i10);
            return;
        }
        this.f22846c.setVisibility(4);
        this.f22844a.setImageResource(2131232523);
    }
}
