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
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class g6 extends z implements ls, org.telegram.ui.ActionBar.b6 {
    public final wo A0;
    public boolean B0;
    public c20 C0;
    public TLRPC.User D;
    public v10 D0;
    public TLRPC.Chat E;
    public boolean E0;
    public TLRPC.EncryptedChat F;
    public TextPaint F0;
    public org.telegram.messenger.d5 G;
    public TextPaint G0;
    public long H;
    public boolean H0;
    public String I;
    public final ic I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public ny0 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public ug.y0 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public int Q0;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public pc V;
    public StaticLayout W;
    public int f29151a0;
    public int f29152b0;
    public int f29153c0;
    public boolean f29154d0;
    public int f29155e0;
    public boolean f29156f;
    public final int f29157f0;
    public int f29158g0;
    public cd0 h;
    public int f29159h0;
    public StaticLayout f29160i0;
    public boolean[] f29161j0;
    public boolean f29162k0;
    public boolean f29163l0;
    public final org.telegram.ui.Components.w5 m0;
    public CharSequence f29164n;
    public boolean f29165n0;
    public long f29166o0;
    public boolean f29167p0;
    public int f29168q0;
    public final ImageReceiver f29169r;
    public StaticLayout f29170r0;
    public final org.telegram.ui.Components.w8 f29171s;
    public final org.telegram.ui.Components.g5 f29172s0;
    public final org.telegram.ui.Components.g5 f29173t0;
    public final di.o7 f29174u0;
    public final RectF f29175v0;
    public CharSequence f29176w;
    public ny0 f29177w0;
    public final org.telegram.ui.ActionBar.g6 f29178x;
    public Paint f29179x0;
    public TLRPC.TL_sponsoredPeer f29180y;
    public final ic f29181y0;
    public final RectF f29182z0;

    public g6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.N = p10.f24470s0;
        this.f29157f0 = org.telegram.messenger.g0.L(19.0f);
        this.m0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        xq xqVar = xq.f40458f;
        this.f29174u0 = new di.o7(null, false);
        this.f29175v0 = new RectF();
        this.f29181y0 = new ic(this);
        this.f29182z0 = new RectF();
        this.H0 = true;
        this.I0 = new ic(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.Q0 = org.telegram.ui.ActionBar.s6.f28501b;
        this.f29178x = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29169r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.f29171s = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        wo woVar = new wo(21, context, g6Var);
        this.A0 = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar);
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), this);
        this.f29172s0 = g5Var;
        g5Var.setCallback(this);
        org.telegram.ui.Components.g5 g5Var2 = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), this);
        this.f29173t0 = g5Var2;
        g5Var2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28085p6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25018i4) {
            invalidate();
        } else if (i7 == qs.f25017i3) {
            TLRPC.User user = this.D;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i11 = this.N;
            if (user != null) {
                if (this.f29163l0) {
                    requirementtocontactpaidmessages = qp.s1(i11).J2(this.D.f27105id);
                }
            } else {
                TLRPC.Chat chat = this.E;
                if (chat != null) {
                    if (chat.send_paid_messages_stars != 0) {
                        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages2 = new TL_account.requirementToContactPaidMessages();
                        requirementtocontactpaidmessages2.stars_amount = chat.send_paid_messages_stars;
                        requirementtocontactpaidmessages = requirementtocontactpaidmessages2;
                    }
                } else {
                    org.telegram.messenger.d5 d5Var = this.G;
                    if (d5Var != null) {
                        if (this.f29163l0 && d5Var.f21996m != null) {
                            requirementtocontactpaidmessages = qp.s1(i11).J2(this.G.f21996m.f27105id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z9 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f29165n0 != z9 || this.f29166o0 != org.telegram.messenger.m5.k(requirementtocontactpaidmessages)) {
                this.f29165n0 = z9;
                this.f29166o0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.D;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29169r.P();
        qs.e().c(this, qs.f25018i4);
        if (this.f29163l0) {
            qs.e().c(this, qs.f25017i3);
        }
        this.f29173t0.a();
        this.f29172s0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29169r.R();
        qs.e().n(this, qs.f25018i4);
        if (this.f29163l0) {
            qs.e().n(this, qs.f25017i3);
        }
        this.f29173t0.b();
        this.f29172s0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f29162k0) {
            sb2.append(", ");
            sb2.append(id.M0(2131754739, null));
            sb2.append("\n");
        }
        if (this.f29170r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f29170r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        wo woVar = this.A0;
        if (woVar.f40108a.f31268q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.f40108a.f31268q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        if (this.D != null || this.E != null || this.F != null || this.G != null) {
            wo woVar = this.A0;
            if (woVar != null) {
                if (id.f23157a0) {
                    L = (i11 - i7) - org.telegram.messenger.g0.L(42.0f);
                } else {
                    L = org.telegram.messenger.g0.L(42.0f);
                }
                int L2 = org.telegram.messenger.g0.L(36.0f);
                woVar.layout(L, L2, woVar.getMeasuredWidth() + L, woVar.getMeasuredHeight() + L2);
            }
            if (z9) {
                v();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        wo woVar = this.A0;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.M0) {
            L = org.telegram.messenger.g0.L(56.0f);
        } else {
            L = org.telegram.messenger.g0.L(60.0f) + (this.M ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f29180y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z9) {
        this.H0 = z9;
    }

    public void setOnSponsoredOptionsClick(v10 v10Var) {
        this.D0 = v10Var;
    }

    public void setOpenBotButton(boolean z9) {
        int i7;
        int i10;
        if (this.f29167p0 == z9) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new ny0(id.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (z9) {
            i7 = org.telegram.messenger.g0.L(30.0f) + ((int) this.L0.f36541c);
        } else {
            i7 = 0;
        }
        boolean z10 = id.f23157a0;
        if (z10) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (z10) {
            i7 = 0;
        }
        setPadding(i10, 0, i7, 0);
        this.f29167p0 = z9;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z9) {
        this.N0 = z9;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f29176w = charSequence;
        y(0);
    }

    @Override
    public final void updateColors() {
        int i7 = this.Q0;
        int i10 = org.telegram.ui.ActionBar.s6.f28501b;
        if (i7 != i10) {
            this.Q0 = i10;
            try {
                y(0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (this.Q != null && getMeasuredWidth() > 0) {
            v();
        }
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29173t0 != drawable && this.f29172s0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean z9, boolean z10) {
        wo woVar = this.A0;
        if (woVar == null) {
            return;
        }
        woVar.a(z9, z10);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        boolean z11;
        this.f29164n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i7 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.RequirementToContact requirementToContact2 = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z12) {
            this.D = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            if (this.f29163l0) {
                requirementToContact2 = qp.s1(i7).J2(this.D.f27105id);
            }
            this.f29165n0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f29166o0 = org.telegram.messenger.m5.k(requirementToContact2);
            if (this.B0 && this.D.bot_has_main_app) {
                z11 = true;
            } else {
                z11 = false;
            }
            setOpenBotButton(z11);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.D = null;
            this.G = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.f29165n0 = false;
            this.f29166o0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.d5) {
            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) obj;
            this.G = d5Var;
            this.E = null;
            this.D = null;
            if (this.f29163l0 && d5Var.f21996m != null) {
                requirementToContact = qp.s1(i7).J2(this.G.f21996m.f27105id);
            }
            this.f29165n0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f29166o0 = org.telegram.messenger.m5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.f29176w = charSequence2;
        this.f29154d0 = z9;
        this.L = z10;
        y(0);
    }

    public final void y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.y(int):void");
    }

    public final void z(boolean z9, TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        long j3;
        boolean z11 = id.f23157a0;
        org.telegram.ui.Components.g5 g5Var = this.f29173t0;
        g5Var.f33862a = z11;
        boolean z12 = this.H0;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29178x;
        if (z12 && z9) {
            g5Var.g(new xp(org.telegram.ui.ActionBar.l6.f27898f1, org.telegram.ui.ActionBar.l6.f27952i1, 0, 0), z10);
            g5Var.k(null);
        } else if (z12 && user != null && !this.L && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            g5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z10);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
        } else if (this.H0 && chat != null && !this.L && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            g5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z10);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
        } else {
            if (this.H0 && user != null && !this.L) {
                qp.s1(this.N);
                if (qp.B2(user)) {
                    g5Var.g((Drawable) ia.e.d().f15430f, z10);
                    g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
                }
            }
            g5Var.g(null, z10);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
        }
        if (user != null) {
            j3 = org.telegram.messenger.m5.c(user);
        } else if (chat != null) {
            j3 = org.telegram.messenger.m5.c(chat);
        } else {
            j3 = 0;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.g5 g5Var2 = this.f29172s0;
        if (i7 != 0 && !this.L) {
            g5Var2.j(j3, z10);
        } else {
            g5Var2.g(null, z10);
        }
        g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z9, g6Var)));
    }
}
