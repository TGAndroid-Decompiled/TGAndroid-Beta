package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l81 extends org.telegram.ui.ActionBar.d2 {
    public wm E;
    public int F;
    public g2.g G;
    public long f47218a;
    public long f47219b;
    public long f47220c;
    public org.telegram.ui.Cells.p8 d;
    public EditTextBoldCursor f47221e;
    public k81 f47222f;
    public org.telegram.ui.Components.k9[] h;
    public String f47223n;
    public boolean f47224r;
    public org.telegram.ui.Components.xp f47225s;
    public org.telegram.ui.Components.bk0 f47226w;
    public TLRPC.TL_forumTopic f47227x;
    public rg.a f47228y;

    public static int c0(l81 l81Var) {
        return l81Var.currentAccount;
    }

    public static l81 f0(long j10, long j11) {
        Bundle j12 = a1.g.j(j10, "chat_id");
        j12.putLong("topic_id", j11);
        ?? d2Var = new org.telegram.ui.ActionBar.d2(j12);
        d2Var.h = new org.telegram.ui.Components.k9[2];
        d2Var.f47223n = "";
        d2Var.G = new g2.g((int[]) null);
        return d2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.f47227x != null) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751217, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748259, null));
        }
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new g81(this));
        if (this.f47227x == null) {
            this.actionBar.q().e(1, org.telegram.messenger.bd.M0(2131751753, null));
        } else {
            this.actionBar.q().a(2, 2131231242);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        org.telegram.ui.ActionBar.r6.i(i3, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.qt0 qt0Var = new org.telegram.ui.Components.qt0(context, null);
        this.fragmentView = qt0Var;
        org.telegram.ui.ActionBar.r6.i(i3, qt0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        qt0Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f47227x;
        if (tL_forumTopic != null && tL_forumTopic.f27053id == 1) {
            n4Var.setText(org.telegram.messenger.bd.M0(2131751749, null));
        } else {
            n4Var.setText(org.telegram.messenger.bd.M0(2131751702, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47221e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.bd.M0(2131751114, null));
        org.telegram.ui.ActionBar.r6.B(this.f47221e, org.telegram.ui.ActionBar.k6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.r6.V(this.f47221e, org.telegram.ui.ActionBar.k6.Ie, getResourceProvider());
        this.f47221e.setPadding(org.telegram.messenger.g0.L(0.0f), this.f47221e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.f47221e.getPaddingBottom());
        this.f47221e.setBackground(null);
        this.f47221e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f47221e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f47221e, b8.mf.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f47221e.addTextChangedListener(new n0(this, 17));
        j81 j81Var = new j81(context, 0);
        j81Var.setOnClickListener(new View.OnClickListener(this) {
            public final l81 f44925b;

            {
                this.f44925b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r2;
                l81 l81Var = this.f44925b;
                switch (i10) {
                    case 0:
                        if (l81Var.f47219b == 0 && l81Var.f47227x == null) {
                            rg.a aVar = l81Var.f47228y;
                            int i11 = aVar.f54509e + 1;
                            aVar.f54509e = i11;
                            int[] iArr = rg.a.f54504k;
                            if (i11 > 5) {
                                aVar.f54509e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i12 = iArr[aVar.f54509e];
                            aVar.f54512i = i12;
                            aVar.h = (int[]) rg.a.f54505l.get(i12);
                            if (org.telegram.ui.ActionBar.k6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ci.uc(27, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            l81Var.F = iArr[aVar.f54509e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.p8 p8Var = l81Var.d;
                        p8Var.setChecked(true ^ p8Var.d.h);
                        return;
                }
            }
        });
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9VarArr[i10] = k9Var;
            j81Var.addView(k9Var, b8.mf.e(28, 28, 17));
        }
        frameLayout.addView(j81Var, b8.mf.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        Drawable f02 = org.telegram.ui.ActionBar.k6.f0(L, getThemedColor(i11));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, f02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, b8.mf.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f47227x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f27053id == 1) {
            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232144);
            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.f28088od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            j81Var.addView(e10, b8.mf.e(22, 22, 17));
            frameLayout2.addView(new View(context), b8.mf.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.k6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i11));
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
            org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, f03, N2, null, resourceProvider2);
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.d = p8Var;
            p8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.bd.M0(2131751216, null), !this.f47227x.hidden, false, false);
            org.telegram.ui.Cells.p8 p8Var2 = this.d;
            int themedColor = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.r6.R(p8Var2, org.telegram.ui.ActionBar.k6.b0(themedColor, getThemedColor(i12), 16, 16), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.N(i12), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final l81 f44925b;

                {
                    this.f44925b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102 = r2;
                    l81 l81Var = this.f44925b;
                    switch (i102) {
                        case 0:
                            if (l81Var.f47219b == 0 && l81Var.f47227x == null) {
                                rg.a aVar = l81Var.f47228y;
                                int i112 = aVar.f54509e + 1;
                                aVar.f54509e = i112;
                                int[] iArr = rg.a.f54504k;
                                if (i112 > 5) {
                                    aVar.f54509e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i122 = iArr[aVar.f54509e];
                                aVar.f54512i = i122;
                                aVar.h = (int[]) rg.a.f54505l.get(i122);
                                if (org.telegram.ui.ActionBar.k6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ci.uc(27, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                l81Var.F = iArr[aVar.f54509e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.p8 p8Var3 = l81Var.d;
                            p8Var3.setChecked(true ^ p8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, b8.mf.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, b8.mf.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.bd.M0(2131751215, null));
            frameLayout2.addView(y8Var, b8.mf.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            k81 k81Var = new k81(this, this, getParentActivity());
            this.f47222f = k81Var;
            k81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f47222f.setClipChildren(false);
            frameLayout2.addView(this.f47222f, b8.mf.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.xp d = rg.c.d(this.F, "");
            this.f47228y = (rg.a) d.f40438a;
            this.f47226w = new org.telegram.ui.Components.bk0(context);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(d, this.f47226w, 0, 0);
            xpVar.f40447x = true;
            this.f47222f.setForumIconDrawable(xpVar);
            this.f47225s = xpVar;
            org.telegram.ui.Components.bk0 bk0Var = this.f47226w;
            org.telegram.ui.Components.k9 k9Var2 = k9VarArr[0];
            ArrayList arrayList = bk0Var.f32312n;
            if (!arrayList.contains(k9Var2)) {
                arrayList.add(k9Var2);
            }
            org.telegram.ui.Components.bk0 bk0Var2 = this.f47226w;
            org.telegram.ui.Components.k9 k9Var3 = k9VarArr[1];
            ArrayList arrayList2 = bk0Var2.f32312n;
            if (!arrayList2.contains(k9Var3)) {
                arrayList2.add(k9Var3);
            }
            k9VarArr[0].setImageDrawable(this.f47225s);
            org.telegram.messenger.g0.Z3(k9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Z3(k9VarArr[1], false, 1.0f, true, false);
            this.f47228y.d.add(k9VarArr[0]);
            this.f47228y.d.add(k9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, b8.mf.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f47227x;
        if (tL_forumTopic3 != null) {
            this.f47221e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.f47227x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z10) {
        long longValue;
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.f47222f != null && this.f47226w != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f47222f.setSelected(Long.valueOf(longValue));
            if (this.f47219b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e10 = org.telegram.ui.Components.g5.e(this.currentAccount, l10.longValue());
                    if (e10 != null) {
                        org.telegram.ui.Components.fc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743874, null)), org.telegram.messenger.bd.M0(2131747041, null), new f81(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f47219b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(10, this.currentAccount, longValue);
                    g5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f28211v3);
                    k9VarArr[1].setAnimatedEmojiDrawable(g5Var);
                    k9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(1, null);
                    c70Var.a(this.f47223n);
                    this.f47226w.b(c70Var, false);
                    k9VarArr[1].setImageDrawable(this.f47225s);
                    k9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.k9 k9Var = k9VarArr[0];
                org.telegram.ui.Components.k9 k9Var2 = k9VarArr[1];
                k9VarArr[0] = k9Var2;
                k9VarArr[1] = k9Var;
                org.telegram.messenger.g0.Z3(k9Var2, true, 0.5f, true, true);
                org.telegram.messenger.g0.Z3(k9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f47218a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f47220c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().f23102q7.f(-this.f47218a, this.f47220c);
            this.f47227x = f10;
            if (f10 == null) {
                return false;
            }
            this.F = f10.icon_color;
        } else {
            this.F = rg.a.f54504k[Math.abs(Utilities.f21385b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f47221e.requestFocus();
        org.telegram.messenger.g0.K3(this.f47221e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f47224r) {
            removeSelfFromStack();
        }
        this.G.e();
        k81 k81Var = this.f47222f;
        if (k81Var != null) {
            k81Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.G.d();
        }
    }
}
