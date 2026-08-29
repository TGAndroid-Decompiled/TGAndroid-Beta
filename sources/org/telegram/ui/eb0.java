package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eb0 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Cells.k4 A;
    public ab0 B;
    public org.telegram.ui.Cells.y8 C;
    public FrameLayout D;
    public org.telegram.ui.Cells.y9 E;
    public org.telegram.ui.Components.un0 F;
    public ab0 G;
    public org.telegram.ui.Cells.y8 H;
    public TextView I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final int[] M;
    public final ArrayList N;
    public final int[] O;
    public db0 P;
    public org.telegram.ui.ActionBar.c2 Q;
    public boolean R;
    public int S;
    public final int f37774a;
    public final long f37775b;
    public org.telegram.ui.Components.lv0 f37776c;
    public org.telegram.ui.Components.lv0 d;
    public TLRPC.TL_chatInviteExported f37777e;
    public bb0 f37778f;
    public org.telegram.ui.Cells.y8 h;
    public org.telegram.ui.Cells.q8 f37779n;
    public cb0 f37780r;
    public TextView f37781s;
    public org.telegram.ui.Cells.y8 v;
    public TextView f37782w;
    public org.telegram.ui.Cells.k4 f37783x;
    public org.telegram.ui.Cells.y8 f37784y;

    public eb0(int i10, long j10) {
        super(null);
        this.J = -3;
        this.L = new ArrayList();
        this.M = new int[]{3600, 86400, 604800};
        this.N = new ArrayList();
        this.O = new int[]{1, 10, 100};
        this.f37774a = i10;
        this.f37775b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f37782w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.M;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = th.d(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i14] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j11 < 31449600) {
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(j10 * 1000);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(j10 * 1000);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.O;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = th.d(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.f37776c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.O;
            if (i10 < iArr.length) {
                i10 = th.d(iArr[i10], i10, 1, arrayList);
            } else {
                this.f37776c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.f37777e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i11 = tL_chatInviteExported.expire_date;
            if (i11 > 0) {
                V(i11);
                this.S = ((Integer) this.L.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.S = 0;
            }
            int i12 = tL_chatInviteExported.usage_limit;
            if (i12 > 0) {
                W(i12);
                this.B.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            bb0 bb0Var = this.f37778f;
            if (bb0Var != null) {
                bb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                this.f37778f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.G.getPaint().getFontMetricsInt(), false);
                this.G.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.q8 q8Var = this.f37779n;
            if (q8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                q8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                bb0 bb0Var2 = this.f37778f;
                if (bb0Var2 != null) {
                    bb0Var2.setChecked(false);
                    this.f37778f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.y8 y8Var = this.h;
                if (y8Var != null) {
                    y8Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            cb0 cb0Var = this.f37780r;
            if (cb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                cb0Var.setVisibility(i10);
                this.f37780r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f37780r.f24387b.setClickable(false);
                this.f37780r.f24387b.setFocusable(false);
                this.f37780r.f24387b.setFocusableInTouchMode(false);
                this.f37780r.f24387b.setLongClickable(false);
            }
        }
    }

    public final void Z(boolean z10) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.k4 k4Var = this.A;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        k4Var.setVisibility(i10);
        org.telegram.ui.Components.lv0 lv0Var = this.f37776c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        lv0Var.setVisibility(i11);
        ab0 ab0Var = this.B;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ab0Var.setVisibility(i12);
        org.telegram.ui.Cells.y8 y8Var = this.C;
        if (z10) {
            i13 = 0;
        }
        y8Var.setVisibility(i13);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37774a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 20));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.f5(1));
        this.I.setEllipsize(TextUtils.TruncateAt.END);
        this.I.setGravity(17);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final eb0 f44536b;

            {
                this.f44536b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xa0.onClick(android.view.View):void");
            }
        });
        this.I.setSingleLine();
        if (i11 == 0) {
            this.I.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.I.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        i7.h6.a(this.I);
        this.actionBar.addView(this.I, i7.f6.d(-2, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        za0 za0Var = new za0(this, context);
        org.telegram.ui.Components.un0 un0Var = new org.telegram.ui.Components.un0(context, za0Var, this.resourceProvider, true);
        this.F = un0Var;
        this.actionBar.setAdaptiveBackground(un0Var);
        ih.j4 j4Var = new ih.j4(this, context, 5);
        this.fragmentView = j4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        layoutTransition.setInterpolator(2, jrVar);
        layoutTransition.setInterpolator(0, jrVar);
        layoutTransition.setInterpolator(4, jrVar);
        layoutTransition.setInterpolator(1, jrVar);
        layoutTransition.setInterpolator(3, jrVar);
        za0Var.setLayoutTransition(layoutTransition);
        za0Var.setOrientation(1);
        za0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.F.addView(za0Var);
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        this.f37783x = k4Var;
        k4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        za0Var.addView(this.f37783x);
        org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, null);
        this.d = lv0Var;
        za0Var.addView(lv0Var);
        TextView textView2 = new TextView(context);
        this.f37782w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f37782w.setGravity(16);
        this.f37782w.setTextSize(1, 16.0f);
        this.f37782w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f37782w.setOnClickListener(new t70(2, this, context));
        this.d.setCallback(new ua0(this, 2));
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = th.d(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        za0Var.addView(this.f37782w, i7.f6.n(-1, 50));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.f37784y = y8Var;
        y8Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        za0Var.addView(this.f37784y);
        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context);
        this.A = k4Var2;
        k4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        za0Var.addView(this.A);
        org.telegram.ui.Components.lv0 lv0Var2 = new org.telegram.ui.Components.lv0(context, null);
        this.f37776c = lv0Var2;
        lv0Var2.setCallback(new ua0(this, 3));
        X();
        za0Var.addView(this.f37776c);
        ab0 ab0Var = new ab0(context, 0);
        this.B = ab0Var;
        ab0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.B.setGravity(16);
        this.B.setTextSize(1, 16.0f);
        this.B.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.B.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.B.setInputType(2);
        this.B.addTextChangedListener(new ya0(this, 1));
        za0Var.addView(this.B, i7.f6.n(-1, 50));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.C = y8Var2;
        y8Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        za0Var.addView(this.C);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37775b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? q8Var = new org.telegram.ui.Cells.q8(context);
        this.f37778f = q8Var;
        int i13 = org.telegram.ui.ActionBar.g6.f23062d6;
        q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f37778f.setTag(Integer.valueOf(i13));
        this.f37778f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f37778f.setOnClickListener(new lh.z1(7, this, z10));
        za0Var.addView(this.f37778f, i7.f6.n(-1, 56));
        org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.h = y8Var3;
        if (z10) {
            this.f37778f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            y8Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        za0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.f37777e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.f37777e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context);
                this.f37779n = q8Var2;
                q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                this.f37779n.setDrawCheckRipple(true);
                this.f37779n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.f37777e != null) {
                    this.f37779n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f37779n.setEnabled(false);
                }
                this.f37779n.setOnClickListener(new t70(3, this, new Runnable[1]));
                za0Var.addView(this.f37779n, i7.f6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f37781s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f37781s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                cb0 cb0Var = new cb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f37780r = cb0Var;
                cb0Var.f24387b.setInputType(2);
                this.f37780r.f24387b.setRawInputType(2);
                this.f37780r.setBackgroundColor(getThemedColor(i13));
                cb0 cb0Var2 = this.f37780r;
                cb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(cb0Var2, 4);
                org.telegram.ui.Cells.e3 e3Var = cb0Var2.f24387b;
                e3Var.setImeOptions(6);
                e3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.f37780r.addView(this.f37781s, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                cb0 cb0Var3 = this.f37780r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                cb0Var3.getClass();
                ImageView imageView = new ImageView(cb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                cb0Var3.addView(imageView, i7.f6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.e3 e3Var2 = cb0Var3.f24387b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                e3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                za0Var.addView(this.f37780r, i7.f6.n(-1, 48));
                this.f37780r.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
                this.v = y8Var4;
                if (this.f37777e != null) {
                    y8Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    y8Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new ta0(this, 2)));
                }
                za0Var.addView(this.v, i7.f6.n(-1, -2));
            }
        }
        ab0 ab0Var2 = new ab0(context, 1);
        this.G = ab0Var2;
        ab0Var2.addTextChangedListener(new ya0(this, 0));
        this.G.setCursorVisible(false);
        this.G.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.G.setGravity(16);
        this.G.setHint(LocaleController.getString(R.string.LinkNameHint));
        ab0 ab0Var3 = this.G;
        int i14 = org.telegram.ui.ActionBar.g6.f23433y6;
        ab0Var3.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.G.setLines(1);
        this.G.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.G.setSingleLine();
        ab0 ab0Var4 = this.G;
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        ab0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.G.setTextSize(1, 16.0f);
        za0Var.addView(this.G, i7.f6.n(-1, 50));
        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.H = y8Var5;
        y8Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        za0Var.addView(this.H);
        if (i11 == 1) {
            org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
            this.E = y9Var;
            y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            this.E.b(LocaleController.getString(R.string.RevokeLink), false);
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
            this.E.setOnClickListener(new View.OnClickListener(this) {
                public final eb0 f44536b;

                {
                    this.f44536b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xa0.onClick(android.view.View):void");
                }
            });
            za0Var.addView(this.E);
        }
        j4Var.addView(this.F, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        int i16 = org.telegram.ui.ActionBar.g6.f23009a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new nh.w3(j4Var, false, new eg.h(5));
        j4Var.addView(this.D, i7.f6.e(-1, -2, 80));
        this.f37783x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f37782w.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.A.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f37776c.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.G.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.B.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f37782w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f37782w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.B.setCursorVisible(false);
        Y(this.f37777e);
        j4Var.setClipChildren(false);
        this.F.setClipChildren(false);
        za0Var.setClipChildren(false);
        return j4Var;
    }

    @Override
    public final void finishFragment() {
        this.F.getLayoutParams().height = this.F.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37783x, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.k4 k4Var = this.f37783x;
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(k4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37776c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37782w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37784y, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23279p7));
        return arrayList;
    }
}
