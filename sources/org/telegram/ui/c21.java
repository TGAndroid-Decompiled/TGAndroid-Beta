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
public final class c21 extends org.telegram.ui.Components.na {
    public TLRPC.Chat P1;
    public final TLRPC.User Q1;
    public final bg.m0 R1;
    public TLObject S1;
    public final FrameLayout T1;
    public final u11 U1;
    public final w11 V1;
    public final b21 W1;
    public final b21 X1;
    public final b21 Y1;
    public final fi.d Z1;
    public org.telegram.ui.Components.m41 f44201a2;
    public Context f44202b2;

    public c21(Context context, TLRPC.Chat chat, TLRPC.User user, bg.m0 m0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(2, context, g6Var, true);
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.P0 = true;
        this.P1 = chat;
        this.Q1 = user;
        this.S1 = user;
        this.R1 = m0Var;
        org.telegram.messenger.p10.i(this.f28621a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.l6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, this.I0));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(frameLayout2, d02, M, null, g6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        int i10 = org.telegram.ui.ActionBar.l6.P5;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.U1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, org.telegram.ui.ActionBar.l6.R5, g6Var);
        org.telegram.ui.ActionBar.s6.D(editTextBoldCursor, i10, g6Var);
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
        editTextBoldCursor.addTextChangedListener(new v11(this));
        editTextBoldCursor.setHint(org.telegram.messenger.id.M0(2131745757, null));
        frameLayout2.addView((View) editTextBoldCursor, c8.ha.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f28624b;
        int max = Math.max(0, viewGroup.indexOfChild(this.l1));
        float f10 = this.f28654t0 / org.telegram.messenger.g0.f22562p;
        viewGroup.addView(frameLayout, max, c8.ha.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setImageDrawable(new org.telegram.ui.Components.ah0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        frameLayout3.addView(l9Var, c8.ha.e(130, 130, 17));
        b21 b21Var = new b21(this.f28621a, chat.f26956id, new TLRPC.TL_channelParticipantsAdmins());
        b21Var.f43857e.add(new tu0(this, 17));
        this.W1 = b21Var;
        b21 b21Var2 = new b21(this.f28621a, chat.f26956id, new TLRPC.TL_channelParticipantsRecent());
        b21Var2.f43857e.add(new tu0(this, 17));
        this.X1 = b21Var2;
        b21 b21Var3 = new b21(this.f28621a, chat.f26956id, new TLRPC.TL_channelParticipantsSearch());
        b21Var3.f43857e.add(new tu0(this, 17));
        this.Y1 = b21Var3;
        org.telegram.ui.Components.qj0 qj0Var = this.f36303k1;
        int i11 = this.f28654t0;
        qj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f36303k1.setClipToPadding(false);
        this.f36303k1.setOnItemClickListener(new zx0(this, 3));
        x11 x11Var = new x11(this);
        x11Var.f57083m = false;
        x11Var.C = false;
        x11Var.o(org.telegram.ui.Components.xq.h);
        x11Var.n(350L);
        this.f36303k1.setItemAnimator(x11Var);
        this.f36303k1.addOnLayoutChangeListener(new y11(this));
        this.f36303k1.j(new z11(this));
        this.f28624b.addView(new a21(this, getContext()), c8.ha.e(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), g6Var, true);
        dVar.setRoundRadius(24);
        this.Z1 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28125r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.f28624b;
        float f11 = (this.f28654t0 / org.telegram.messenger.g0.f22562p) + 10.0f;
        viewGroup2.addView(dVar, c8.ha.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new py0(this, 5));
        org.telegram.ui.Components.m41 m41Var = this.f44201a2;
        if (m41Var != null) {
            m41Var.O(false);
        }
        b21Var.b();
        b21Var2.b();
    }

    public static void d1(c21 c21Var) {
        org.telegram.ui.Components.qj0 qj0Var = c21Var.f36303k1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= qj0Var.getChildCount()) {
                break;
            }
            View childAt = qj0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        c21Var.T1.setTranslationY(f10);
    }

    @Override
    public final org.telegram.ui.Components.pj0 L0(org.telegram.ui.Components.qj0 qj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(qj0Var, getContext(), this.f28621a, 0, false, new a5(this, 24), this.I0);
        this.f44201a2 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131754210, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.W1.a();
        this.X1.a();
        this.Y1.a();
    }

    public final void e1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f44202b2 = getContext();
        }
        if (this.f44202b2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.P1)) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.qp.s1(this.f28621a).T(this.f44202b2, this.P1.f26956id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.t3.T(this.P1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.P1;
                tL_inputChannel.channel_id = chat.f26956id;
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
            tL_channels_editCreator.user_id = org.telegram.messenger.qp.s1(this.f28621a).q1(user);
            ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_channels_editCreator, new bi.r8(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void f1(boolean z9) {
        int i7;
        int L;
        String str;
        if (org.telegram.messenger.t3.V(this.P1)) {
            i7 = 2131749003;
        } else {
            i7 = 2131748994;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f);
        fi.d dVar = this.Z1;
        if (dVar.getWidth() > 0) {
            L = dVar.getWidth();
        } else {
            L = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.id.M0(i7, null)));
        TLObject tLObject = this.S1;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.t10.k((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        dVar.i(org.telegram.messenger.id.a0(null, null, i7, TextUtils.ellipsize(str, dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z9, true);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            fi.d dVar = this.Z1;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28125r7, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
