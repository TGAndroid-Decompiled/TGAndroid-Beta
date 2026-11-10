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
public final class d21 extends org.telegram.ui.Components.ma {
    public TLRPC.Chat S1;
    public final TLRPC.User T1;
    public final bg.m0 U1;
    public TLObject V1;
    public final FrameLayout W1;
    public final v11 X1;
    public final x11 Y1;
    public final c21 Z1;
    public final c21 f44885a2;
    public final c21 f44886b2;
    public final fi.d f44887c2;
    public org.telegram.ui.Components.m41 d2;
    public Context f44888e2;

    public d21(Context context, TLRPC.Chat chat, TLRPC.User user, bg.m0 m0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2, context, h6Var, true);
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        this.P0 = true;
        this.S1 = chat;
        this.T1 = user;
        this.V1 = user;
        this.U1 = m0Var;
        org.telegram.messenger.p10.i(this.f28669a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, d02, M, null, h6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232737);
        int i10 = org.telegram.ui.ActionBar.m6.P5;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.X1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.R5, h6Var);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, i10, h6Var);
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
        editTextBoldCursor.addTextChangedListener(new w11(this));
        editTextBoldCursor.setHint(org.telegram.messenger.id.M0(2131745757, null));
        frameLayout2.addView((View) editTextBoldCursor, c8.ha.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f28672b;
        int max = Math.max(0, viewGroup.indexOfChild(this.f35902o1));
        float f10 = this.f28705t0 / org.telegram.messenger.g0.f22566p;
        viewGroup.addView(frameLayout, max, c8.ha.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setImageDrawable(new org.telegram.ui.Components.zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        frameLayout3.addView(k9Var, c8.ha.e(130, 130, 17));
        c21 c21Var = new c21(this.f28669a, chat.f26960id, new TLRPC.TL_channelParticipantsAdmins());
        c21Var.f44205e.add(new uu0(this, 17));
        this.Z1 = c21Var;
        c21 c21Var2 = new c21(this.f28669a, chat.f26960id, new TLRPC.TL_channelParticipantsRecent());
        c21Var2.f44205e.add(new uu0(this, 17));
        this.f44885a2 = c21Var2;
        c21 c21Var3 = new c21(this.f28669a, chat.f26960id, new TLRPC.TL_channelParticipantsSearch());
        c21Var3.f44205e.add(new uu0(this, 17));
        this.f44886b2 = c21Var3;
        org.telegram.ui.Components.pj0 pj0Var = this.n1;
        int i11 = this.f28705t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new ay0(this, 3));
        y11 y11Var = new y11(this);
        y11Var.f57079m = false;
        y11Var.C = false;
        y11Var.o(org.telegram.ui.Components.wq.h);
        y11Var.n(350L);
        this.n1.setItemAnimator(y11Var);
        this.n1.addOnLayoutChangeListener(new z11(this));
        this.n1.j(new a21(this));
        this.f28672b.addView(new b21(this, getContext()), c8.ha.e(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), h6Var, true);
        dVar.setRoundRadius(24);
        this.f44887c2 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28150r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.f28672b;
        float f11 = (this.f28705t0 / org.telegram.messenger.g0.f22566p) + 10.0f;
        viewGroup2.addView(dVar, c8.ha.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new qy0(this, 5));
        org.telegram.ui.Components.m41 m41Var = this.d2;
        if (m41Var != null) {
            m41Var.O(false);
        }
        c21Var.b();
        c21Var2.b();
    }

    public static void d1(d21 d21Var) {
        org.telegram.ui.Components.pj0 pj0Var = d21Var.n1;
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
        d21Var.W1.setTranslationY(f10);
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(pj0Var, getContext(), this.f28669a, 0, false, new a5(this, 24), this.I0);
        this.d2 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131754210, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Z1.a();
        this.f44885a2.a();
        this.f44886b2.a();
    }

    public final void e1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f44888e2 = getContext();
        }
        if (this.f44888e2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.S1)) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.qp.s1(this.f28669a).T(this.f44888e2, this.S1.f26960id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.t3.T(this.S1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.S1;
                tL_inputChannel.channel_id = chat.f26960id;
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
            tL_channels_editCreator.user_id = org.telegram.messenger.qp.s1(this.f28669a).q1(user);
            ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_channels_editCreator, new bi.r8(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void f1(boolean z9) {
        int i7;
        int L;
        String str;
        if (org.telegram.messenger.t3.V(this.S1)) {
            i7 = 2131749003;
        } else {
            i7 = 2131748994;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f);
        fi.d dVar = this.f44887c2;
        if (dVar.getWidth() > 0) {
            L = dVar.getWidth();
        } else {
            L = org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.id.M0(i7, null)));
        TLObject tLObject = this.V1;
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
            fi.d dVar = this.f44887c2;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28150r7, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
