package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a21 extends org.telegram.ui.Components.ra {
    public TLRPC.Chat T1;
    public final TLRPC.User U1;
    public final ii V1;
    public TLObject W1;
    public final FrameLayout X1;
    public final s11 Y1;
    public final u11 Z1;
    public final z11 f45568a2;
    public final z11 f45569b2;
    public final z11 f45570c2;
    public final hi.e d2;
    public org.telegram.ui.Components.b51 f45571e2;
    public Context f45572f2;

    public a21(Context context, TLRPC.Chat chat, TLRPC.User user, ii iiVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(2, context, i6Var, true);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.Q0 = true;
        this.T1 = chat;
        this.U1 = user;
        this.W1 = user;
        this.V1 = iiVar;
        org.telegram.messenger.i10.i(this.f30223a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, d02, M, null, i6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232742);
        int i10 = org.telegram.ui.ActionBar.n6.P5;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.na.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.Y1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, org.telegram.ui.ActionBar.n6.R5, i6Var);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, i10, i6Var);
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        editTextBoldCursor.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new fa(this, 11));
        editTextBoldCursor.addTextChangedListener(new t11(this));
        editTextBoldCursor.setHint(org.telegram.messenger.gd.N0(2131745561, null));
        frameLayout2.addView((View) editTextBoldCursor, c8.na.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, c8.na.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f30226b;
        int max = Math.max(0, viewGroup.indexOfChild(this.f39247p1));
        float f10 = this.f30261u0 / org.telegram.messenger.g0.f24225p;
        viewGroup.addView(frameLayout, max, c8.na.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setImageDrawable(new org.telegram.ui.Components.nh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        frameLayout3.addView(p9Var, c8.na.e(130, 130, 17));
        z11 z11Var = new z11(this.f30223a, chat.f28492id, new TLRPC.TL_channelParticipantsAdmins());
        z11Var.f54484e.add(new qu0(this, 17));
        this.f45568a2 = z11Var;
        z11 z11Var2 = new z11(this.f30223a, chat.f28492id, new TLRPC.TL_channelParticipantsRecent());
        z11Var2.f54484e.add(new qu0(this, 17));
        this.f45569b2 = z11Var2;
        z11 z11Var3 = new z11(this.f30223a, chat.f28492id, new TLRPC.TL_channelParticipantsSearch());
        z11Var3.f54484e.add(new qu0(this, 17));
        this.f45570c2 = z11Var3;
        org.telegram.ui.Components.ek0 ek0Var = this.f39246o1;
        int i11 = this.f30261u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f39246o1.setClipToPadding(false);
        this.f39246o1.setOnItemClickListener(new xx0(this, 3));
        v11 v11Var = new v11(this);
        v11Var.f59274m = false;
        v11Var.C = false;
        v11Var.o(org.telegram.ui.Components.kr.h);
        v11Var.n(350L);
        this.f39246o1.setItemAnimator(v11Var);
        this.f39246o1.addOnLayoutChangeListener(new w11(this));
        this.f39246o1.j(new x11(this));
        this.f30226b.addView(new y11(this, getContext()), c8.na.e(-1, 68, 87));
        hi.e eVar = new hi.e(getContext(), i6Var, true);
        eVar.setRoundRadius(24);
        this.d2 = eVar;
        eVar.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29711r7, this.J0));
        g1(false);
        ViewGroup viewGroup2 = this.f30226b;
        float f11 = (this.f30261u0 / org.telegram.messenger.g0.f24225p) + 10.0f;
        viewGroup2.addView(eVar, c8.na.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        eVar.setOnClickListener(new ny0(this, 5));
        org.telegram.ui.Components.b51 b51Var = this.f45571e2;
        if (b51Var != null) {
            b51Var.O(false);
        }
        z11Var.b();
        z11Var2.b();
    }

    public static void e1(a21 a21Var) {
        org.telegram.ui.Components.ek0 ek0Var = a21Var.f39246o1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        a21Var.X1.setTranslationY(f10);
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.f30223a, 0, false, new a5(this, 24), this.J0);
        this.f45571e2 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131754207, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f45568a2.a();
        this.f45569b2.a();
        this.f45570c2.a();
    }

    public final void f1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f45572f2 = getContext();
        }
        if (this.f45572f2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.v3.T(this.T1)) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.mp.u1(this.f30223a).T(this.f45572f2, this.T1.f28492id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.v3.T(this.T1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.T1;
                tL_inputChannel.channel_id = chat.f28492id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            if (inputCheckPasswordSRP != null) {
                tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
            } else {
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
            tL_channels_editCreator.user_id = org.telegram.messenger.mp.u1(this.f30223a).s1(user);
            ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_channels_editCreator, new di.m7(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void g1(boolean z10) {
        int i7;
        int L;
        String str;
        if (org.telegram.messenger.v3.V(this.T1)) {
            i7 = 2131748810;
        } else {
            i7 = 2131748801;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f);
        hi.e eVar = this.d2;
        if (eVar.getWidth() > 0) {
            L = eVar.getWidth();
        } else {
            L = org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.g0.L(16.0f)) - eVar.getTextPaint().measureText(org.telegram.messenger.gd.N0(i7, null)));
        TLObject tLObject = this.W1;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.n10.l((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        eVar.i(org.telegram.messenger.gd.a0(null, null, i7, TextUtils.ellipsize(str, eVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            hi.e eVar = this.d2;
            if (eVar != null) {
                eVar.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29711r7, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
