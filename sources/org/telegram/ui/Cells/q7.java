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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;
import org.telegram.ui.PhotoViewer;
public final class q7 extends FrameLayout {
    public final org.telegram.ui.Components.g9 f22845a;
    public final TextView f22846b;
    public final s5 f22847c;
    public final View d;
    public final ep e;
    public final FrameLayout f22848f;
    public AnimatorSet h;
    public kj f22849n;
    public final t7 f22850r;

    public q7(t7 t7Var, Context context) {
        super(context);
        this.f22850r = t7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22848f = frameLayout;
        addView(frameLayout, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22845a = g9Var;
        g9Var.getImageReceiver().F0 = true;
        g9Var.getImageReceiver().G0 = true;
        frameLayout.addView(g9Var, w7.b6.c(-1.0f, -1));
        s5 s5Var = new s5(context, 1);
        s5Var.f23014b = new RectF();
        this.f22847c = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        frameLayout.addView(s5Var, w7.b6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232546);
        s5Var.addView(imageView, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f22846b = textView;
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
        epVar.b(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.f21060k7);
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
        if (!this.e.f25895a.f23920q) {
            org.telegram.ui.Components.g9 g9Var = this.f22845a;
            if (g9Var.getImageReceiver().I() && g9Var.getImageReceiver().f14385h1 == 1.0f && !PhotoViewer.Q1(this.f22849n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f22850r.f23097n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22849n.D3()) {
            accessibilityNodeInfo.setText(dd.L0(2131753962, null));
        } else if (kj.L4(this.f22849n.f16690k)) {
            StringBuilder sb2 = new StringBuilder();
            a30.q(null, 2131753933, sb2, ", ");
            sb2.append(dd.z((int) this.f22849n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(dd.L0(2131753948, null));
        }
        if (this.e.f25895a.f23920q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(kj kjVar) {
        long j10;
        int i10;
        int i11;
        this.f22849n = kjVar;
        this.f22845a.getImageReceiver().O0(!PhotoViewer.Q1(kjVar), false);
        if (!TextUtils.isEmpty(wp.r1(this.f22850r.f23099s).E1(kjVar.f16690k.restriction_reason))) {
            this.f22847c.setVisibility(4);
            this.f22845a.setImageResource(2131232523);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (kj.L4(kjVar.f16690k)) {
            this.f22847c.setVisibility(0);
            this.f22846b.setText(org.telegram.messenger.i0.g0((int) kjVar.L0(), false, false));
            TLRPC.Document F0 = kjVar.F0();
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F0.thumbs, 320, false, null, false);
            if (w9 != w10) {
                photoSize = w10;
            }
            if (w9 != null) {
                if (kjVar.G1 != null) {
                    this.f22845a.k(jc.c(photoSize, F0), "100_100", null, kjVar.G1, kjVar);
                    return;
                } else {
                    this.f22845a.n(jc.c(photoSize, F0), "100_100", jc.c(w9, F0), "b", org.telegram.messenger.w0.f18945b.getResources().getDrawable(2131232523), null, 0, kjVar);
                    return;
                }
            }
            this.f22845a.setImageResource(2131232523);
            return;
        }
        TLRPC.MessageMedia messageMedia = kjVar.f16690k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !kjVar.f16701n0.isEmpty()) {
            this.f22847c.setVisibility(4);
            TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(kjVar.f16701n0, 50, false, null, false);
            TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(kjVar.f16701n0, 320, false, w11, false);
            if (!kjVar.f16740x0 && !org.telegram.messenger.b6.q(this.f22850r.f23099s).d(kjVar)) {
                BitmapDrawable bitmapDrawable = kjVar.G1;
                if (bitmapDrawable != null) {
                    this.f22845a.n(null, null, null, null, bitmapDrawable, null, 0, kjVar);
                    return;
                } else {
                    this.f22845a.n(null, null, jc.f(w11, kjVar.f16695l0), "b", org.telegram.messenger.w0.f18945b.getResources().getDrawable(2131232523), null, 0, kjVar);
                    return;
                }
            }
            if (w12 != w11) {
                photoSize = w11;
            }
            if (kjVar.G1 != null) {
                ImageReceiver imageReceiver = this.f22845a.getImageReceiver();
                jc f7 = jc.f(w12, kjVar.f16695l0);
                long j11 = 0;
                BitmapDrawable bitmapDrawable2 = kjVar.G1;
                if (w12 != null) {
                    j11 = w12.size;
                }
                long j12 = j11;
                if (kj.Q5(kjVar.f16690k)) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                imageReceiver.r0(f7, "100_100", null, null, bitmapDrawable2, j12, null, kjVar, i11);
                return;
            }
            ImageReceiver imageReceiver2 = this.f22845a.getImageReceiver();
            jc f10 = jc.f(w12, kjVar.f16695l0);
            jc f11 = jc.f(photoSize, kjVar.f16695l0);
            if (w12 != null) {
                j10 = w12.size;
            } else {
                j10 = 0;
            }
            if (kj.Q5(kjVar.f16690k)) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            imageReceiver2.r0(f10, "100_100", f11, "b", null, j10, null, kjVar, i10);
            return;
        }
        this.f22847c.setVisibility(4);
        this.f22845a.setImageResource(2131232523);
    }
}
