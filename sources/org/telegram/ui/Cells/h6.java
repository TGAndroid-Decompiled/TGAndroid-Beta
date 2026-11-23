package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xy0;
public final class h6 extends z implements gs, org.telegram.ui.ActionBar.b6 {
    public final RectF A0;
    public final op B0;
    public boolean C0;
    public y10 D0;
    public TLRPC.User E;
    public r10 E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public org.telegram.messenger.f5 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final mc J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public xy0 M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public ug.a1 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public tc W;
    public StaticLayout f30734a0;
    public int f30735b0;
    public int f30736c0;
    public int f30737d0;
    public boolean f30738e0;
    public boolean f30739f;
    public int f30740f0;
    public final int f30741g0;
    public nd0 h;
    public int f30742h0;
    public int f30743i0;
    public StaticLayout f30744j0;
    public boolean[] f30745k0;
    public boolean f30746l0;
    public boolean m0;
    public CharSequence f30747n;
    public final org.telegram.ui.Components.d6 f30748n0;
    public boolean f30749o0;
    public long f30750p0;
    public boolean f30751q0;
    public final ImageReceiver f30752r;
    public int f30753r0;
    public final org.telegram.ui.Components.b9 f30754s;
    public StaticLayout f30755s0;
    public final org.telegram.ui.Components.n5 f30756t0;
    public final org.telegram.ui.Components.n5 f30757u0;
    public final fi.e7 f30758v0;
    public CharSequence f30759w;
    public final RectF f30760w0;
    public final org.telegram.ui.ActionBar.h6 f30761x;
    public xy0 f30762x0;
    public TLRPC.TL_sponsoredPeer f30763y;
    public Paint f30764y0;
    public final mc f30765z0;

    public h6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.O = k10.f24968t0;
        this.f30741g0 = org.telegram.messenger.g0.L(19.0f);
        this.f30748n0 = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        nr nrVar = nr.f37960f;
        this.f30758v0 = new fi.e7(null, false);
        this.f30760w0 = new RectF();
        this.f30765z0 = new mc(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new mc(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = org.telegram.ui.ActionBar.t6.f30069b;
        this.f30761x = h6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30752r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.f30754s = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        op opVar = new op(21, context, h6Var);
        this.B0 = opVar;
        opVar.b(-1, org.telegram.ui.ActionBar.m6.f29381d6, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), this);
        this.f30756t0 = n5Var;
        n5Var.setCallback(this);
        org.telegram.ui.Components.n5 n5Var2 = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), this);
        this.f30757u0 = n5Var2;
        n5Var2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29795z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29601p6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25342l4) {
            invalidate();
        } else if (i7 == ls.f25336k3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i11 = this.O;
            if (user != null) {
                if (this.m0) {
                    requirementtocontactpaidmessages = np.u1(i11).P2(this.E.f28583id);
                }
            } else {
                TLRPC.Chat chat = this.F;
                if (chat != null) {
                    if (chat.send_paid_messages_stars != 0) {
                        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages2 = new TL_account.requirementToContactPaidMessages();
                        requirementtocontactpaidmessages2.stars_amount = chat.send_paid_messages_stars;
                        requirementtocontactpaidmessages = requirementtocontactpaidmessages2;
                    }
                } else {
                    org.telegram.messenger.f5 f5Var = this.H;
                    if (f5Var != null) {
                        if (this.m0 && f5Var.f23870m != null) {
                            requirementtocontactpaidmessages = np.u1(i11).P2(this.H.f23870m.f28583id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z10 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f30749o0 != z10 || this.f30750p0 != org.telegram.messenger.n5.k(requirementtocontactpaidmessages)) {
                this.f30749o0 = z10;
                this.f30750p0 = org.telegram.messenger.n5.k(requirementtocontactpaidmessages);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.F;
    }

    public long getDialogId() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30752r.P();
        ls.e().c(this, ls.f25342l4);
        if (this.m0) {
            ls.e().c(this, ls.f25336k3);
        }
        this.f30757u0.a();
        this.f30756t0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30752r.R();
        ls.e().n(this, ls.f25342l4);
        if (this.m0) {
            ls.e().n(this, ls.f25336k3);
        }
        this.f30757u0.b();
        this.f30756t0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f30746l0) {
            sb2.append(", ");
            sb2.append(hd.N0(2131754738, null));
            sb2.append("\n");
        }
        if (this.f30755s0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f30755s0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        op opVar = this.B0;
        if (opVar.f38320a.f32874q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(opVar.f38320a.f32874q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        if (this.E != null || this.F != null || this.G != null || this.H != null) {
            op opVar = this.B0;
            if (opVar != null) {
                if (hd.f24444a0) {
                    L = (i11 - i7) - org.telegram.messenger.g0.L(42.0f);
                } else {
                    L = org.telegram.messenger.g0.L(42.0f);
                }
                int L2 = org.telegram.messenger.g0.L(36.0f);
                opVar.layout(L, L2, opVar.getMeasuredWidth() + L, opVar.getMeasuredHeight() + L2);
            }
            if (z10) {
                v();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        op opVar = this.B0;
        if (opVar != null) {
            opVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.N0) {
            L = org.telegram.messenger.g0.L(56.0f);
        } else {
            L = org.telegram.messenger.g0.L(60.0f) + (this.N ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f30763y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.I0 = z10;
    }

    public void setOnSponsoredOptionsClick(r10 r10Var) {
        this.E0 = r10Var;
    }

    public void setOpenBotButton(boolean z10) {
        int i7;
        int i10;
        if (this.f30751q0 == z10) {
            return;
        }
        if (this.M0 == null) {
            this.M0 = new xy0(hd.N0(2131753008, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (z10) {
            i7 = org.telegram.messenger.g0.L(30.0f) + ((int) this.M0.f42246c);
        } else {
            i7 = 0;
        }
        boolean z11 = hd.f24444a0;
        if (z11) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (z11) {
            i7 = 0;
        }
        setPadding(i10, 0, i7, 0);
        this.f30751q0 = z10;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.O0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f30759w = charSequence;
        y(0);
    }

    @Override
    public final void updateColors() {
        int i7 = this.R0;
        int i10 = org.telegram.ui.ActionBar.t6.f30069b;
        if (i7 != i10) {
            this.R0 = i10;
            try {
                y(0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (this.R != null && getMeasuredWidth() > 0) {
            v();
        }
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30757u0 != drawable && this.f30756t0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean z10, boolean z11) {
        op opVar = this.B0;
        if (opVar == null) {
            return;
        }
        opVar.a(z10, z11);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f30747n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i7 = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.RequirementToContact requirementToContact2 = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z13) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            if (this.m0) {
                requirementToContact2 = np.u1(i7).P2(this.E.f28583id);
            }
            this.f30749o0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f30750p0 = org.telegram.messenger.n5.k(requirementToContact2);
            if (this.C0 && this.E.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.F = chat;
            this.E = null;
            this.H = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.f30749o0 = false;
            this.f30750p0 = org.telegram.messenger.n5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.f5) {
            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) obj;
            this.H = f5Var;
            this.F = null;
            this.E = null;
            if (this.m0 && f5Var.f23870m != null) {
                requirementToContact = np.u1(i7).P2(this.H.f23870m.f28583id);
            }
            this.f30749o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f30750p0 = org.telegram.messenger.n5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.f30759w = charSequence2;
        this.f30738e0 = z10;
        this.M = z11;
        y(0);
    }

    public final void y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h6.y(int):void");
    }

    public final void z(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j3;
        boolean z12 = hd.f24444a0;
        org.telegram.ui.Components.n5 n5Var = this.f30757u0;
        n5Var.f37773a = z12;
        boolean z13 = this.I0;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30761x;
        if (z13 && z10) {
            n5Var.g(new oq(org.telegram.ui.ActionBar.m6.f29414f1, org.telegram.ui.ActionBar.m6.f29468i1, 0, 0), z11);
            n5Var.k(null);
        } else if (z13 && user != null && !this.M && org.telegram.messenger.n5.f(user.emoji_status) != 0) {
            n5Var.j(org.telegram.messenger.n5.f(user.emoji_status), z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29795z9, h6Var)));
        } else if (this.I0 && chat != null && !this.M && org.telegram.messenger.n5.f(chat.emoji_status) != 0) {
            n5Var.j(org.telegram.messenger.n5.f(chat.emoji_status), z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29795z9, h6Var)));
        } else {
            if (this.I0 && user != null && !this.M) {
                np.u1(this.O);
                if (np.H2(user)) {
                    n5Var.g((Drawable) ia.e.d().f16228f, z11);
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29795z9, h6Var)));
                }
            }
            n5Var.g(null, z11);
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29795z9, h6Var)));
        }
        if (user != null) {
            j3 = org.telegram.messenger.n5.c(user);
        } else if (chat != null) {
            j3 = org.telegram.messenger.n5.c(chat);
        } else {
            j3 = 0;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var2 = this.f30756t0;
        if (i7 != 0 && !this.M) {
            n5Var2.j(j3, z11);
        } else {
            n5Var2.g(null, z11);
        }
        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29795z9, h6Var)));
    }
}
