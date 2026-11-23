package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class lt0 extends FrameLayout {
    public org.telegram.ui.Components.o9 f49704a;
    public final org.telegram.ui.Cells.r1 f49705b;
    public Drawable f49706c;
    public final Drawable d;
    public final org.telegram.messenger.gj f49707e;
    public final PrivacyControlActivity f49708f;

    public lt0(PrivacyControlActivity privacyControlActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        this.f49708f = privacyControlActivity;
        setWillNotDraw(false);
        setClipToPadding(false);
        this.d = org.telegram.ui.ActionBar.m6.Y0(context, 2131231230, org.telegram.ui.ActionBar.m6.f29345b7);
        setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        i7 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        i10 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
        TLRPC.User c22 = u12.c2(Long.valueOf(org.telegram.messenger.k10.i(i10).e()));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.hd.N0(2131746638, null);
        tL_message.date = ((int) (System.currentTimeMillis() / 1000)) - 3540;
        tL_message.dialog_id = 1L;
        tL_message.flags = 261;
        tL_message.from_id = new TLRPC.TL_peerUser();
        tL_message.f28455id = 1;
        TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
        tL_message.fwd_from = tL_messageFwdHeader;
        tL_messageFwdHeader.from_name = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.out = false;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        i11 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
        tL_peerUser.user_id = org.telegram.messenger.k10.i(i11).e();
        i12 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i12, tL_message, true, false);
        this.f49707e = gjVar;
        gjVar.T = 1L;
        gjVar.S1 = false;
        i13 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
        org.telegram.ui.Cells.r1 r1Var = new org.telegram.ui.Cells.r1(context, i13);
        this.f49705b = r1Var;
        r1Var.setDelegate(new sa.d(19));
        r1Var.f31428f6 = false;
        r1Var.setFullyDraw(true);
        r1Var.y3(gjVar, null, false, false, false, false);
        addView(r1Var, c8.ma.o(-1, -2));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PrivacyControlActivity.w0(this.f49708f);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f49705b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PrivacyControlActivity.w0(this.f49708f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PrivacyControlActivity.w0(this.f49708f);
        org.telegram.ui.Components.o9 o9Var = this.f49704a;
        if (o9Var != null) {
            o9Var.dispose();
            this.f49704a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable t02 = org.telegram.ui.ActionBar.m6.t0();
        if (t02 != null && this.f49706c != t02) {
            org.telegram.ui.Components.o9 o9Var = this.f49704a;
            if (o9Var != null) {
                o9Var.dispose();
                this.f49704a = null;
            }
            this.f49706c = t02;
        }
        Drawable drawable = this.f49706c;
        if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.cb0)) {
            if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / org.telegram.messenger.g0.f24045p;
                    canvas.scale(f10, f10);
                    this.f49706c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f49706c.getIntrinsicWidth(), measuredHeight / this.f49706c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f49706c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f49706c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i7 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f49706c.setBounds(measuredWidth, i7, ceil + measuredWidth, ceil2 + i7);
                }
                this.f49706c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable2 = this.f49706c;
            if (drawable2 instanceof org.telegram.ui.Components.p9) {
                this.f49704a = ((org.telegram.ui.Components.p9) drawable2).c(canvas, this);
            } else {
                drawable2.draw(canvas);
            }
        }
        if ((getParent() instanceof org.telegram.ui.Components.ek0) && ((org.telegram.ui.Components.ek0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.d;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
