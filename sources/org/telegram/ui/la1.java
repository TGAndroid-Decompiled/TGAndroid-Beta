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
public final class la1 extends org.telegram.ui.ActionBar.k2 {
    public un D;
    public int E;
    public e2.f F;
    public long f39135a;
    public long f39136b;
    public long f39137c;
    public org.telegram.ui.Cells.s8 d;
    public EditTextBoldCursor e;
    public ka1 f39138f;
    public org.telegram.ui.Components.g9[] h;
    public String f39139n;
    public boolean f39140r;
    public org.telegram.ui.Components.eq f39141s;
    public org.telegram.ui.Components.bl0 f39142w;
    public TLRPC.TL_forumTopic f39143x;
    public gg.a f39144y;

    public static int b0(la1 la1Var) {
        return la1Var.currentAccount;
    }

    public static la1 e0(long j10, long j11) {
        Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "chat_id");
        k10.putLong("topic_id", j11);
        ?? k2Var = new org.telegram.ui.ActionBar.k2(k10);
        k2Var.h = new org.telegram.ui.Components.g9[2];
        k2Var.f39139n = "";
        k2Var.F = new e2.f(null);
        return k2Var;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.g9[] g9VarArr = this.h;
        if (this.f39143x != null) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751217, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748268, null));
        }
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setActionBarMenuOnItemClick(new ha1(this));
        if (this.f39143x == null) {
            this.actionBar.p().e(1, org.telegram.messenger.cd.L0(2131751753, null));
        } else {
            this.actionBar.p().a(2, 2131231243);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f20872a7;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.uu0 uu0Var = new org.telegram.ui.Components.uu0(context, null);
        this.fragmentView = uu0Var;
        org.telegram.ui.ActionBar.a7.i(i10, uu0Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        uu0Var.addView(linearLayout);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f39143x;
        if (tL_forumTopic != null && tL_forumTopic.f19845id == 1) {
            p4Var.setText(org.telegram.messenger.cd.L0(2131751749, null));
        } else {
            p4Var.setText(org.telegram.messenger.cd.L0(2131751702, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.cd.L0(2131751114, null));
        org.telegram.ui.ActionBar.a7.B(this.e, org.telegram.ui.ActionBar.t6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.a7.V(this.e, org.telegram.ui.ActionBar.t6.Ie, getResourceProvider());
        this.e.setPadding(org.telegram.messenger.i0.L(0.0f), this.e.getPaddingTop(), org.telegram.messenger.i0.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.b6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new n0(this, 17));
        ja1 ja1Var = new ja1(context, 0);
        ja1Var.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f37219b;

            {
                this.f37219b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                la1 la1Var = this.f37219b;
                switch (i11) {
                    case 0:
                        if (la1Var.f39136b == 0 && la1Var.f39143x == null) {
                            gg.a aVar = la1Var.f39144y;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = gg.a.f7492k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f7499i = i13;
                            aVar.h = (int[]) gg.a.f7493l.get(i13);
                            if (org.telegram.ui.ActionBar.t6.I.q()) {
                                aVar.h = new int[]{i0.b.f(0.2f, aVar.h[0], -1), i0.b.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ag.p2(6, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            la1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.s8 s8Var = la1Var.d;
                        s8Var.setChecked(true ^ s8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9VarArr[i11] = g9Var;
            ja1Var.addView(g9Var, w7.b6.e(28, 28, 17));
        }
        frameLayout.addView(ja1Var, w7.b6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(p4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
        Drawable f02 = org.telegram.ui.ActionBar.t6.f0(L, getThemedColor(i12));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.a7.k(linearLayout2, f02, N, null, resourceProvider);
        linearLayout.addView(linearLayout2, w7.b6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39143x;
        if (tL_forumTopic2 != null && tL_forumTopic2.f19845id == 1) {
            ImageView e = org.telegram.messenger.z20.e(context, 2131232143);
            org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.f21141od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ja1Var.addView(e, w7.b6.e(22, 22, 17));
            frameLayout2.addView(new View(context), w7.b6.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.t6.f0(org.telegram.messenger.i0.L(16.0f), getThemedColor(i12));
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
            org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.a7.k(frameLayout3, f03, N2, null, resourceProvider2);
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
            this.d = s8Var;
            s8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.cd.L0(2131751216, null), !this.f39143x.hidden, false, false);
            org.telegram.ui.Cells.s8 s8Var2 = this.d;
            int themedColor = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.ActionBar.a7.R(s8Var2, org.telegram.ui.ActionBar.t6.b0(themedColor, getThemedColor(i13), 16, 16), org.telegram.ui.ActionBar.a7.N(i12), org.telegram.ui.ActionBar.a7.N(i13), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final la1 f37219b;

                {
                    this.f37219b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    la1 la1Var = this.f37219b;
                    switch (i112) {
                        case 0:
                            if (la1Var.f39136b == 0 && la1Var.f39143x == null) {
                                gg.a aVar = la1Var.f39144y;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = gg.a.f7492k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i132 = iArr[aVar.e];
                                aVar.f7499i = i132;
                                aVar.h = (int[]) gg.a.f7493l.get(i132);
                                if (org.telegram.ui.ActionBar.t6.I.q()) {
                                    aVar.h = new int[]{i0.b.f(0.2f, aVar.h[0], -1), i0.b.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ag.p2(6, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                la1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.s8 s8Var3 = la1Var.d;
                            s8Var3.setChecked(true ^ s8Var3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, w7.b6.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, w7.b6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(org.telegram.messenger.cd.L0(2131751215, null));
            frameLayout2.addView(b9Var, w7.b6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            ka1 ka1Var = new ka1(this, this, getParentActivity());
            this.f39138f = ka1Var;
            ka1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f39138f.setClipChildren(false);
            frameLayout2.addView(this.f39138f, w7.b6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.eq d = gg.e.d(this.E, "");
            this.f39144y = (gg.a) d.f25839a;
            this.f39142w = new org.telegram.ui.Components.bl0(context);
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(d, this.f39142w, 0, 0);
            eqVar.f25847x = true;
            this.f39138f.setForumIconDrawable(eqVar);
            this.f39141s = eqVar;
            org.telegram.ui.Components.bl0 bl0Var = this.f39142w;
            org.telegram.ui.Components.g9 g9Var2 = g9VarArr[0];
            ArrayList arrayList = bl0Var.f24830n;
            if (!arrayList.contains(g9Var2)) {
                arrayList.add(g9Var2);
            }
            org.telegram.ui.Components.bl0 bl0Var2 = this.f39142w;
            org.telegram.ui.Components.g9 g9Var3 = g9VarArr[1];
            ArrayList arrayList2 = bl0Var2.f24830n;
            if (!arrayList2.contains(g9Var3)) {
                arrayList2.add(g9Var3);
            }
            g9VarArr[0].setImageDrawable(this.f39141s);
            org.telegram.messenger.i0.Y3(g9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.i0.Y3(g9VarArr[1], false, 1.0f, true, false);
            this.f39144y.d.add(g9VarArr[0]);
            this.f39144y.d.add(g9VarArr[1]);
        }
        linearLayout.addView(frameLayout2, w7.b6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f39143x;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            f0(Long.valueOf(this.f39143x.icon_emoji_id), true);
        } else {
            f0(0L, true);
        }
        return this.fragmentView;
    }

    public final void f0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.g9[] g9VarArr = this.h;
        if (this.f39138f != null && this.f39142w != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f39138f.setSelected(Long.valueOf(longValue));
            if (this.f39136b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().q()) {
                    TLRPC.Document e = org.telegram.ui.Components.f5.e(this.currentAccount, l4.longValue());
                    if (e != null) {
                        org.telegram.ui.Components.cc.a0(this).r(e, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743889, null)), org.telegram.messenger.cd.L0(2131747048, null), new ga1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f39136b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(10, this.currentAccount, longValue);
                    f5Var.setColorFilter(org.telegram.ui.ActionBar.t6.f21256v3);
                    g9VarArr[1].setAnimatedEmojiDrawable(f5Var);
                    g9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(1, null);
                    z70Var.a(this.f39139n);
                    this.f39142w.b(z70Var, false);
                    g9VarArr[1].setImageDrawable(this.f39141s);
                    g9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.g9 g9Var = g9VarArr[0];
                org.telegram.ui.Components.g9 g9Var2 = g9VarArr[1];
                g9VarArr[0] = g9Var2;
                g9VarArr[1] = g9Var;
                org.telegram.messenger.i0.Y3(g9Var2, true, 0.5f, true, true);
                org.telegram.messenger.i0.Y3(g9VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39135a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f39137c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic f7 = getMessagesController().f18891r7.f(-this.f39135a, this.f39137c);
            this.f39143x = f7;
            if (f7 == null) {
                return false;
            }
            this.E = f7.icon_color;
        } else {
            this.E = gg.a.f7492k[Math.abs(Utilities.f14519b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        org.telegram.messenger.i0.J3(this.e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f39140r) {
            removeSelfFromStack();
        }
        this.F.e();
        ka1 ka1Var = this.f39138f;
        if (ka1Var != null) {
            ka1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.d();
        }
    }
}
