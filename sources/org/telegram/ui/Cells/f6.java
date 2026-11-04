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
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class f6 extends z implements cs, org.telegram.ui.ActionBar.z5 {
    public final RectF A0;
    public final wo B0;
    public boolean C0;
    public u10 D0;
    public TLRPC.User E;
    public n10 E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public org.telegram.messenger.d5 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final gc J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public ly0 M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public vg.x0 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public nc W;
    public StaticLayout f29180a0;
    public int f29181b0;
    public int f29182c0;
    public int f29183d0;
    public boolean f29184e0;
    public boolean f29185f;
    public int f29186f0;
    public final int f29187g0;
    public wc0 h;
    public int f29188h0;
    public int f29189i0;
    public StaticLayout f29190j0;
    public boolean[] f29191k0;
    public boolean f29192l0;
    public boolean m0;
    public CharSequence f29193n;
    public final org.telegram.ui.Components.u5 f29194n0;
    public boolean f29195o0;
    public long f29196p0;
    public boolean f29197q0;
    public final ImageReceiver f29198r;
    public int f29199r0;
    public final org.telegram.ui.Components.u8 f29200s;
    public StaticLayout f29201s0;
    public final org.telegram.ui.Components.e5 f29202t0;
    public final org.telegram.ui.Components.e5 f29203u0;
    public final ei.o7 f29204v0;
    public CharSequence f29205w;
    public final RectF f29206w0;
    public final org.telegram.ui.ActionBar.e6 f29207x;
    public ly0 f29208x0;
    public TLRPC.TL_sponsoredPeer f29209y;
    public Paint f29210y0;
    public final gc f29211z0;

    public f6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O = h10.f22829t0;
        this.f29187g0 = org.telegram.messenger.g0.L(19.0f);
        this.f29194n0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        xq xqVar = xq.f40452f;
        this.f29204v0 = new ei.o7(null, false);
        this.f29206w0 = new RectF();
        this.f29211z0 = new gc(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new gc(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = org.telegram.ui.ActionBar.r6.f28515b;
        this.f29207x = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29198r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.f29200s = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        wo woVar = new wo(21, context, e6Var);
        this.B0 = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar);
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), this);
        this.f29202t0 = e5Var;
        e5Var.setCallback(this);
        org.telegram.ui.Components.e5 e5Var2 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), this);
        this.f29203u0 = e5Var2;
        e5Var2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28101p6));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23246i4) {
            invalidate();
        } else if (i3 == hs.i3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i11 = this.O;
            if (user != null) {
                if (this.m0) {
                    requirementtocontactpaidmessages = hp.s1(i11).J2(this.E.f27150id);
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
                    org.telegram.messenger.d5 d5Var = this.H;
                    if (d5Var != null) {
                        if (this.m0 && d5Var.f22157m != null) {
                            requirementtocontactpaidmessages = hp.s1(i11).J2(this.H.f22157m.f27150id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z10 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f29195o0 != z10 || this.f29196p0 != org.telegram.messenger.m5.k(requirementtocontactpaidmessages)) {
                this.f29195o0 = z10;
                this.f29196p0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
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
        this.f29198r.P();
        hs.e().c(this, hs.f23246i4);
        if (this.m0) {
            hs.e().c(this, hs.i3);
        }
        this.f29203u0.a();
        this.f29202t0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29198r.R();
        hs.e().n(this, hs.f23246i4);
        if (this.m0) {
            hs.e().n(this, hs.i3);
        }
        this.f29203u0.b();
        this.f29202t0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f29192l0) {
            sb2.append(", ");
            sb2.append(bd.M0(2131754739, null));
            sb2.append("\n");
        }
        if (this.f29201s0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f29201s0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        wo woVar = this.B0;
        if (woVar.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.f40035a.f31334q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L;
        if (this.E != null || this.F != null || this.G != null || this.H != null) {
            wo woVar = this.B0;
            if (woVar != null) {
                if (bd.f21784a0) {
                    L = (i11 - i3) - org.telegram.messenger.g0.L(42.0f);
                } else {
                    L = org.telegram.messenger.g0.L(42.0f);
                }
                int L2 = org.telegram.messenger.g0.L(36.0f);
                woVar.layout(L, L2, woVar.getMeasuredWidth() + L, woVar.getMeasuredHeight() + L2);
            }
            if (z10) {
                v();
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        wo woVar = this.B0;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.N0) {
            L = org.telegram.messenger.g0.L(56.0f);
        } else {
            L = org.telegram.messenger.g0.L(60.0f) + (this.N ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f29209y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.I0 = z10;
    }

    public void setOnSponsoredOptionsClick(n10 n10Var) {
        this.E0 = n10Var;
    }

    public void setOpenBotButton(boolean z10) {
        int i3;
        int i10;
        if (this.f29197q0 == z10) {
            return;
        }
        if (this.M0 == null) {
            this.M0 = new ly0(bd.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (z10) {
            i3 = org.telegram.messenger.g0.L(30.0f) + ((int) this.M0.f35918c);
        } else {
            i3 = 0;
        }
        boolean z11 = bd.f21784a0;
        if (z11) {
            i10 = i3;
        } else {
            i10 = 0;
        }
        if (z11) {
            i3 = 0;
        }
        setPadding(i10, 0, i3, 0);
        this.f29197q0 = z10;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.O0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f29205w = charSequence;
        y(0);
    }

    @Override
    public final void updateColors() {
        int i3 = this.R0;
        int i10 = org.telegram.ui.ActionBar.r6.f28515b;
        if (i3 != i10) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29203u0 != drawable && this.f29202t0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean z10, boolean z11) {
        wo woVar = this.B0;
        if (woVar == null) {
            return;
        }
        woVar.a(z10, z11);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f29193n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i3 = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.RequirementToContact requirementToContact2 = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z13) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            if (this.m0) {
                requirementToContact2 = hp.s1(i3).J2(this.E.f27150id);
            }
            this.f29195o0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f29196p0 = org.telegram.messenger.m5.k(requirementToContact2);
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
            this.f29195o0 = false;
            this.f29196p0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.d5) {
            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) obj;
            this.H = d5Var;
            this.F = null;
            this.E = null;
            if (this.m0 && d5Var.f22157m != null) {
                requirementToContact = hp.s1(i3).J2(this.H.f22157m.f27150id);
            }
            this.f29195o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f29196p0 = org.telegram.messenger.m5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.f29205w = charSequence2;
        this.f29184e0 = z10;
        this.M = z11;
        y(0);
    }

    public final void y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.y(int):void");
    }

    public final void z(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j10;
        boolean z12 = bd.f21784a0;
        org.telegram.ui.Components.e5 e5Var = this.f29203u0;
        e5Var.f33282a = z12;
        boolean z13 = this.I0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29207x;
        if (z13 && z10) {
            e5Var.g(new xp(org.telegram.ui.ActionBar.k6.f27912f1, org.telegram.ui.ActionBar.k6.f27968i1, 0, 0), z11);
            e5Var.k(null);
        } else if (z13 && user != null && !this.M && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28293z9, e6Var)));
        } else if (this.I0 && chat != null && !this.M && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28293z9, e6Var)));
        } else {
            if (this.I0 && user != null && !this.M) {
                hp.s1(this.O);
                if (hp.B2(user)) {
                    e5Var.g((Drawable) ha.e.d().f14384f, z11);
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28293z9, e6Var)));
                }
            }
            e5Var.g(null, z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28293z9, e6Var)));
        }
        if (user != null) {
            j10 = org.telegram.messenger.m5.c(user);
        } else if (chat != null) {
            j10 = org.telegram.messenger.m5.c(chat);
        } else {
            j10 = 0;
        }
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var2 = this.f29202t0;
        if (i3 != 0 && !this.M) {
            e5Var2.j(j10, z11);
        } else {
            e5Var2.g(null, z11);
        }
        e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28293z9, e6Var)));
    }
}
