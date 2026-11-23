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
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lp;
import org.telegram.ui.PhotoViewer;
public final class m7 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f31166a;
    public final TextView f31167b;
    public final o5 f31168c;
    public final View d;
    public final lp f31169e;
    public final FrameLayout f31170f;
    public AnimatorSet h;
    public fj f31171n;
    public final p7 f31172r;

    public m7(p7 p7Var, Context context) {
        super(context);
        this.f31172r = p7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31170f = frameLayout;
        addView(frameLayout, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f31166a = p9Var;
        p9Var.getImageReceiver().G0 = true;
        p9Var.getImageReceiver().H0 = true;
        frameLayout.addView(p9Var, c8.na.c(-1.0f, -1));
        o5 o5Var = new o5(context, 1);
        o5Var.f31255b = new RectF();
        this.f31168c = o5Var;
        o5Var.setWillNotDraw(false);
        o5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        frameLayout.addView(o5Var, c8.na.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232554);
        o5Var.addView(imageView, c8.na.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31167b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        o5Var.addView(textView, c8.na.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.na.c(-1.0f, -1));
        lp lpVar = new lp(21, context, null);
        this.f31169e = lpVar;
        lpVar.setVisibility(4);
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.Ci, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(1);
        addView(lpVar, c8.na.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.f31169e.f37189a.f32938q) {
            org.telegram.ui.Components.p9 p9Var = this.f31166a;
            if (p9Var.getImageReceiver().J() && p9Var.getImageReceiver().f22739i1 == 1.0f && !PhotoViewer.L1(this.f31171n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f31172r.f31332n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f31171n.D3()) {
            accessibilityNodeInfo.setText(gd.N0(2131753959, null));
        } else if (fj.L4(this.f31171n.f24073k)) {
            StringBuilder sb2 = new StringBuilder();
            c0.u(null, 2131753930, sb2, ", ");
            sb2.append(gd.z((int) this.f31171n.L0()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(gd.N0(2131753945, null));
        }
        if (this.f31169e.f37189a.f32938q) {
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
        this.f31171n = fjVar;
        this.f31166a.getImageReceiver().P0(!PhotoViewer.L1(fjVar), false);
        if (!TextUtils.isEmpty(mp.u1(this.f31172r.f31334s).H1(fjVar.f24073k.restriction_reason))) {
            this.f31168c.setVisibility(4);
            this.f31166a.setImageResource(2131232529);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (fj.L4(fjVar.f24073k)) {
            this.f31168c.setVisibility(0);
            this.f31167b.setText(org.telegram.messenger.g0.g0((int) fjVar.L0(), false, false));
            TLRPC.Document F0 = fjVar.F0();
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 320, false, null, false);
            if (w10 != w11) {
                photoSize = w11;
            }
            if (w10 != null) {
                if (fjVar.I1 != null) {
                    this.f31166a.k(fc.c(photoSize, F0), "100_100", null, fjVar.I1, fjVar);
                    return;
                } else {
                    this.f31166a.n(fc.c(photoSize, F0), "100_100", fc.c(w10, F0), "b", org.telegram.messenger.t0.f27013b.getResources().getDrawable(2131232529), null, 0, fjVar);
                    return;
                }
            }
            this.f31166a.setImageResource(2131232529);
            return;
        }
        TLRPC.MessageMedia messageMedia = fjVar.f24073k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !fjVar.f24093p0.isEmpty()) {
            this.f31168c.setVisibility(4);
            TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(fjVar.f24093p0, 50, false, null, false);
            TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(fjVar.f24093p0, 320, false, w12, false);
            if (!fjVar.f24132z0 && !org.telegram.messenger.a6.q(this.f31172r.f31334s).d(fjVar)) {
                BitmapDrawable bitmapDrawable = fjVar.I1;
                if (bitmapDrawable != null) {
                    this.f31166a.n(null, null, null, null, bitmapDrawable, null, 0, fjVar);
                    return;
                } else {
                    this.f31166a.n(null, null, fc.f(w12, fjVar.f24086n0), "b", org.telegram.messenger.t0.f27013b.getResources().getDrawable(2131232529), null, 0, fjVar);
                    return;
                }
            }
            if (w13 != w12) {
                photoSize = w12;
            }
            if (fjVar.I1 != null) {
                ImageReceiver imageReceiver = this.f31166a.getImageReceiver();
                fc f10 = fc.f(w13, fjVar.f24086n0);
                long j10 = 0;
                BitmapDrawable bitmapDrawable2 = fjVar.I1;
                if (w13 != null) {
                    j10 = w13.size;
                }
                long j11 = j10;
                if (fj.R5(fjVar.f24073k)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                imageReceiver.s0(f10, "100_100", null, null, bitmapDrawable2, j11, null, fjVar, i10);
                return;
            }
            ImageReceiver imageReceiver2 = this.f31166a.getImageReceiver();
            fc f11 = fc.f(w13, fjVar.f24086n0);
            fc f12 = fc.f(photoSize, fjVar.f24086n0);
            if (w13 != null) {
                j3 = w13.size;
            } else {
                j3 = 0;
            }
            if (fj.R5(fjVar.f24073k)) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            imageReceiver2.s0(f11, "100_100", f12, "b", null, j3, null, fjVar, i7);
            return;
        }
        this.f31168c.setVisibility(4);
        this.f31166a.setImageResource(2131232529);
    }
}
