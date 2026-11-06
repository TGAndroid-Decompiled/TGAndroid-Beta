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
public final class a21 extends org.telegram.ui.Components.na {
    public TLRPC.Chat P1;
    public final TLRPC.User Q1;
    public final bg.m0 R1;
    public TLObject S1;
    public final FrameLayout T1;
    public final s11 U1;
    public final u11 V1;
    public final z11 W1;
    public final z11 X1;
    public final z11 Y1;
    public final fi.d Z1;
    public org.telegram.ui.Components.f41 f43527a2;
    public Context f43528b2;

    public a21(Context context, TLRPC.Chat chat, TLRPC.User user, bg.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.P0 = true;
        this.P1 = chat;
        this.Q1 = user;
        this.S1 = user;
        this.R1 = m0Var;
        org.telegram.messenger.p10.i(this.f28612a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.k6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, d02, N, null, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.U1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.R5, f6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, i10, f6Var);
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
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131745758, null));
        frameLayout2.addView((View) editTextBoldCursor, c8.ha.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f28615b;
        int max = Math.max(0, viewGroup.indexOfChild(this.l1));
        float f10 = this.f28645t0 / org.telegram.messenger.g0.f22536p;
        viewGroup.addView(frameLayout, max, c8.ha.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setImageDrawable(new org.telegram.ui.Components.zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        frameLayout3.addView(l9Var, c8.ha.e(130, 130, 17));
        z11 z11Var = new z11(this.f28612a, chat.f26952id, new TLRPC.TL_channelParticipantsAdmins());
        z11Var.f52424e.add(new qu0(this, 17));
        this.W1 = z11Var;
        z11 z11Var2 = new z11(this.f28612a, chat.f26952id, new TLRPC.TL_channelParticipantsRecent());
        z11Var2.f52424e.add(new qu0(this, 17));
        this.X1 = z11Var2;
        z11 z11Var3 = new z11(this.f28612a, chat.f26952id, new TLRPC.TL_channelParticipantsSearch());
        z11Var3.f52424e.add(new qu0(this, 17));
        this.Y1 = z11Var3;
        org.telegram.ui.Components.pj0 pj0Var = this.f36328k1;
        int i11 = this.f28645t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f36328k1.setClipToPadding(false);
        this.f36328k1.setOnItemClickListener(new vx0(this, 3));
        v11 v11Var = new v11(this);
        v11Var.f56954m = false;
        v11Var.C = false;
        v11Var.o(org.telegram.ui.Components.xq.h);
        v11Var.n(350L);
        this.f36328k1.setItemAnimator(v11Var);
        this.f36328k1.addOnLayoutChangeListener(new w11(this));
        this.f36328k1.j(new x11(this));
        this.f28615b.addView(new y11(this, getContext()), c8.ha.e(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), f6Var, true);
        dVar.setRoundRadius(24);
        this.Z1 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28108r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.f28615b;
        float f11 = (this.f28645t0 / org.telegram.messenger.g0.f22536p) + 10.0f;
        viewGroup2.addView(dVar, c8.ha.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new my0(this, 5));
        org.telegram.ui.Components.f41 f41Var = this.f43527a2;
        if (f41Var != null) {
            f41Var.O(false);
        }
        z11Var.b();
        z11Var2.b();
    }

    public static void d1(a21 a21Var) {
        org.telegram.ui.Components.pj0 pj0Var = a21Var.f36328k1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        a21Var.T1.setTranslationY(f10);
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(pj0Var, getContext(), this.f28612a, 0, false, new a5(this, 24), this.I0);
        this.f43527a2 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131754210, null);
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
            this.f43528b2 = getContext();
        }
        if (this.f43528b2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.P1)) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.qp.s1(this.f28612a).T(this.f43528b2, this.P1.f26952id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.t3.T(this.P1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.P1;
                tL_inputChannel.channel_id = chat.f26952id;
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
            tL_channels_editCreator.user_id = org.telegram.messenger.qp.s1(this.f28612a).q1(user);
            ConnectionsManager.getInstance(this.f28612a).sendRequest(tL_channels_editCreator, new bi.r8(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void f1(boolean z9) {
        int i7;
        int L;
        String str;
        if (org.telegram.messenger.t3.V(this.P1)) {
            i7 = 2131749002;
        } else {
            i7 = 2131748993;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f);
        fi.d dVar = this.Z1;
        if (dVar.getWidth() > 0) {
            L = dVar.getWidth();
        } else {
            L = org.telegram.messenger.g0.f22537q.x - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.hd.M0(i7, null)));
        TLObject tLObject = this.S1;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.t10.k((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        dVar.i(org.telegram.messenger.hd.a0(null, null, i7, TextUtils.ellipsize(str, dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z9, true);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            fi.d dVar = this.Z1;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28108r7, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
