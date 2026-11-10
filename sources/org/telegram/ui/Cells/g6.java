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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xp;
public final class g6 extends z implements ls, org.telegram.ui.ActionBar.c6 {
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
    public final hc I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public my0 L0;
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
    public oc V;
    public StaticLayout W;
    public int f29162a0;
    public int f29163b0;
    public int f29164c0;
    public boolean f29165d0;
    public int f29166e0;
    public boolean f29167f;
    public final int f29168f0;
    public int f29169g0;
    public bd0 h;
    public int f29170h0;
    public StaticLayout f29171i0;
    public boolean[] f29172j0;
    public boolean f29173k0;
    public boolean f29174l0;
    public final org.telegram.ui.Components.v5 m0;
    public CharSequence f29175n;
    public boolean f29176n0;
    public long f29177o0;
    public boolean f29178p0;
    public int f29179q0;
    public final ImageReceiver f29180r;
    public StaticLayout f29181r0;
    public final org.telegram.ui.Components.v8 f29182s;
    public final org.telegram.ui.Components.f5 f29183s0;
    public final org.telegram.ui.Components.f5 f29184t0;
    public final di.o7 f29185u0;
    public final RectF f29186v0;
    public CharSequence f29187w;
    public my0 f29188w0;
    public final org.telegram.ui.ActionBar.h6 f29189x;
    public Paint f29190x0;
    public TLRPC.TL_sponsoredPeer f29191y;
    public final hc f29192y0;
    public final RectF f29193z0;

    public g6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.N = p10.f24474s0;
        this.f29168f0 = org.telegram.messenger.g0.L(19.0f);
        this.m0 = new org.telegram.ui.Components.v5(this, 0L, 350L, wq.h);
        wq wqVar = wq.f40046f;
        this.f29185u0 = new di.o7(null, false);
        this.f29186v0 = new RectF();
        this.f29192y0 = new hc(this);
        this.f29193z0 = new RectF();
        this.H0 = true;
        this.I0 = new hc(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.Q0 = org.telegram.ui.ActionBar.t6.f28531b;
        this.f29189x = h6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29180r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.f29182s = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        wo woVar = new wo(21, context, h6Var);
        this.A0 = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar);
        org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(20.0f), this);
        this.f29183s0 = f5Var;
        f5Var.setCallback(this);
        org.telegram.ui.Components.f5 f5Var2 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(20.0f), this);
        this.f29184t0 = f5Var2;
        f5Var2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28110p6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25022i4) {
            invalidate();
        } else if (i7 == qs.f25021i3) {
            TLRPC.User user = this.D;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i11 = this.N;
            if (user != null) {
                if (this.f29174l0) {
                    requirementtocontactpaidmessages = qp.s1(i11).J2(this.D.f27109id);
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
                        if (this.f29174l0 && d5Var.f22000m != null) {
                            requirementtocontactpaidmessages = qp.s1(i11).J2(this.G.f22000m.f27109id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z9 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f29176n0 != z9 || this.f29177o0 != org.telegram.messenger.m5.k(requirementtocontactpaidmessages)) {
                this.f29176n0 = z9;
                this.f29177o0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
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
        this.f29180r.P();
        qs.e().c(this, qs.f25022i4);
        if (this.f29174l0) {
            qs.e().c(this, qs.f25021i3);
        }
        this.f29184t0.a();
        this.f29183s0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29180r.R();
        qs.e().n(this, qs.f25022i4);
        if (this.f29174l0) {
            qs.e().n(this, qs.f25021i3);
        }
        this.f29184t0.b();
        this.f29183s0.b();
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
        if (this.f29173k0) {
            sb2.append(", ");
            sb2.append(id.M0(2131754739, null));
            sb2.append("\n");
        }
        if (this.f29181r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f29181r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        wo woVar = this.A0;
        if (woVar.f40026a.f31279q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.f40026a.f31279q);
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
                if (id.f23161a0) {
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
        this.f29191y = tL_sponsoredPeer;
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
        if (this.f29178p0 == z9) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new my0(id.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (z9) {
            i7 = org.telegram.messenger.g0.L(30.0f) + ((int) this.L0.f36133c);
        } else {
            i7 = 0;
        }
        boolean z10 = id.f23161a0;
        if (z10) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (z10) {
            i7 = 0;
        }
        setPadding(i10, 0, i7, 0);
        this.f29178p0 = z9;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z9) {
        this.N0 = z9;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f29187w = charSequence;
        y(0);
    }

    @Override
    public final void updateColors() {
        int i7 = this.Q0;
        int i10 = org.telegram.ui.ActionBar.t6.f28531b;
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
        if (this.f29184t0 != drawable && this.f29183s0 != drawable && !super.verifyDrawable(drawable)) {
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
        this.f29175n = charSequence;
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
            if (this.f29174l0) {
                requirementToContact2 = qp.s1(i7).J2(this.D.f27109id);
            }
            this.f29176n0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f29177o0 = org.telegram.messenger.m5.k(requirementToContact2);
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
            this.f29176n0 = false;
            this.f29177o0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.d5) {
            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) obj;
            this.G = d5Var;
            this.E = null;
            this.D = null;
            if (this.f29174l0 && d5Var.f22000m != null) {
                requirementToContact = qp.s1(i7).J2(this.G.f22000m.f27109id);
            }
            this.f29176n0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f29177o0 = org.telegram.messenger.m5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.f29187w = charSequence2;
        this.f29165d0 = z9;
        this.L = z10;
        y(0);
    }

    public final void y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.y(int):void");
    }

    public final void z(boolean z9, TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        long j3;
        boolean z11 = id.f23161a0;
        org.telegram.ui.Components.f5 f5Var = this.f29184t0;
        f5Var.f33460a = z11;
        boolean z12 = this.H0;
        org.telegram.ui.ActionBar.h6 h6Var = this.f29189x;
        if (z12 && z9) {
            f5Var.g(new xp(org.telegram.ui.ActionBar.m6.f27923f1, org.telegram.ui.ActionBar.m6.f27977i1, 0, 0), z10);
            f5Var.k(null);
        } else if (z12 && user != null && !this.L && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            f5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z10);
            f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
        } else if (this.H0 && chat != null && !this.L && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            f5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z10);
            f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
        } else {
            if (this.H0 && user != null && !this.L) {
                qp.s1(this.N);
                if (qp.B2(user)) {
                    f5Var.g((Drawable) ia.e.d().f15432f, z10);
                    f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
                }
            }
            f5Var.g(null, z10);
            f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
        }
        if (user != null) {
            j3 = org.telegram.messenger.m5.c(user);
        } else if (chat != null) {
            j3 = org.telegram.messenger.m5.c(chat);
        } else {
            j3 = 0;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.f5 f5Var2 = this.f29183s0;
        if (i7 != 0 && !this.L) {
            f5Var2.j(j3, z10);
        } else {
            f5Var2.g(null, z10);
        }
        f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z9, h6Var)));
    }
}
