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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gb0 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Cells.l4 E;
    public cb0 F;
    public org.telegram.ui.Cells.e9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ca I;
    public org.telegram.ui.Components.ap0 J;
    public cb0 K;
    public org.telegram.ui.Cells.e9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public fb0 T;
    public org.telegram.ui.ActionBar.c2 U;
    public boolean V;
    public int W;
    public final int f37522a;
    public final long f37523b;
    public org.telegram.ui.Components.rw0 f37524c;
    public org.telegram.ui.Components.rw0 d;
    public TLRPC.TL_chatInviteExported e;
    public db0 f37525f;
    public org.telegram.ui.Cells.e9 h;
    public org.telegram.ui.Cells.w8 f37526n;
    public eb0 f37527r;
    public TextView f37528s;
    public org.telegram.ui.Cells.e9 v;
    public TextView f37529w;
    public org.telegram.ui.Cells.l4 f37530x;
    public org.telegram.ui.Cells.e9 f37531y;

    public gb0(int i10, long j10) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f37522a = i10;
        this.f37523b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f37529w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.Q;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.gms.internal.play_billing.k3.f(iArr[i11], i11, 1, arrayList);
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
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(1000 * j10);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(1000 * j10);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.S;
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
            i12 = com.google.android.gms.internal.play_billing.k3.f(iArr[i12], i12, 1, arrayList);
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
        this.f37524c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i10 < iArr.length) {
                i10 = com.google.android.gms.internal.play_billing.k3.f(iArr[i10], i10, 1, arrayList);
            } else {
                this.f37524c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i11 = tL_chatInviteExported.expire_date;
            if (i11 > 0) {
                V(i11);
                this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.W = 0;
            }
            int i12 = tL_chatInviteExported.usage_limit;
            if (i12 > 0) {
                W(i12);
                this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            db0 db0Var = this.f37525f;
            if (db0Var != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, db0Var, null);
                this.f37525f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.w8 w8Var = this.f37526n;
            if (w8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                w8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                db0 db0Var2 = this.f37525f;
                if (db0Var2 != null) {
                    db0Var2.setChecked(false);
                    this.f37525f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.e9 e9Var = this.h;
                if (e9Var != null) {
                    e9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            eb0 eb0Var = this.f37527r;
            if (eb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                eb0Var.setVisibility(i10);
                this.f37527r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f37527r.d.setClickable(false);
                this.f37527r.d.setFocusable(false);
                this.f37527r.d.setFocusableInTouchMode(false);
                this.f37527r.d.setLongClickable(false);
            }
        }
    }

    public final void Z(boolean z10) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.l4 l4Var = this.E;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        l4Var.setVisibility(i10);
        org.telegram.ui.Components.rw0 rw0Var = this.f37524c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        rw0Var.setVisibility(i11);
        cb0 cb0Var = this.F;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        cb0Var.setVisibility(i12);
        org.telegram.ui.Cells.e9 e9Var = this.G;
        if (z10) {
            i13 = 0;
        }
        e9Var.setVisibility(i13);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37522a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 6));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.l5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final gb0 f42643b;

            {
                this.f42643b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.va0.onClick(android.view.View):void");
            }
        });
        this.M.setSingleLine();
        if (i11 == 0) {
            this.M.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.M.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        org.telegram.ui.ActionBar.r6.W(this.M, org.telegram.ui.ActionBar.k6.Sh, null);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.b6.a(this.M);
        this.actionBar.addView(this.M, w7.z5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        bb0 bb0Var = new bb0(this, context);
        org.telegram.ui.Components.ap0 ap0Var = new org.telegram.ui.Components.ap0(context, bb0Var, this.resourceProvider, true);
        this.J = ap0Var;
        this.actionBar.setAdaptiveBackground(ap0Var);
        y8 y8Var = new y8(this, context, 4);
        this.fragmentView = y8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        layoutTransition.setInterpolator(2, zrVar);
        layoutTransition.setInterpolator(0, zrVar);
        layoutTransition.setInterpolator(4, zrVar);
        layoutTransition.setInterpolator(1, zrVar);
        layoutTransition.setInterpolator(3, zrVar);
        bb0Var.setLayoutTransition(layoutTransition);
        bb0Var.setOrientation(1);
        bb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(bb0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.f37530x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        bb0Var.addView(this.f37530x);
        org.telegram.ui.Components.rw0 rw0Var = new org.telegram.ui.Components.rw0(context, null);
        this.d = rw0Var;
        bb0Var.addView(rw0Var);
        TextView textView2 = new TextView(context);
        this.f37529w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f37529w.setGravity(16);
        this.f37529w.setTextSize(1, 16.0f);
        this.f37529w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f37529w.setOnClickListener(new org.telegram.ui.Components.c51(25, this, context));
        this.d.setCallback(new xa0(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = com.google.android.gms.internal.play_billing.k3.f(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        bb0Var.addView(this.f37529w, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f37531y = e9Var;
        e9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        bb0Var.addView(this.f37531y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.E = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        bb0Var.addView(this.E);
        org.telegram.ui.Components.rw0 rw0Var2 = new org.telegram.ui.Components.rw0(context, null);
        this.f37524c = rw0Var2;
        rw0Var2.setCallback(new xa0(this, 3));
        X();
        bb0Var.addView(this.f37524c);
        cb0 cb0Var = new cb0(context, 0);
        this.F = cb0Var;
        cb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new ab0(this, 1));
        bb0Var.addView(this.F, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.G = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        bb0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37523b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? w8Var = new org.telegram.ui.Cells.w8(context);
        this.f37525f = w8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i13, w8Var, null);
        this.f37525f.setTag(Integer.valueOf(i13));
        this.f37525f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f37525f.setOnClickListener(new ci.g2(7, this, z10));
        bb0Var.addView(this.f37525f, w7.z5.n(-1, 56));
        org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.h = e9Var3;
        if (z10) {
            this.f37525f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            e9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        bb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context);
                this.f37526n = w8Var2;
                org.telegram.ui.ActionBar.r6.i(i13, w8Var2, null);
                this.f37526n.setDrawCheckRipple(true);
                this.f37526n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.f37526n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f37526n.setEnabled(false);
                }
                this.f37526n.setOnClickListener(new org.telegram.ui.Components.c51(26, this, new Runnable[1]));
                bb0Var.addView(this.f37526n, w7.z5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f37528s = textView3;
                textView3.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.W(this.f37528s, org.telegram.ui.ActionBar.k6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                eb0 eb0Var = new eb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f37527r = eb0Var;
                eb0Var.d.setInputType(2);
                this.f37527r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.r6.i(i13, this.f37527r, getResourceProvider());
                eb0 eb0Var2 = this.f37527r;
                eb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(eb0Var2, 4);
                org.telegram.ui.Cells.f3 f3Var = eb0Var2.d;
                f3Var.setImeOptions(6);
                f3Var.setOnEditorActionListener(new m.t2(gVar, 2));
                this.f37527r.addView(this.f37528s, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                eb0 eb0Var3 = this.f37527r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                eb0Var3.getClass();
                ImageView imageView = new ImageView(eb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                eb0Var3.addView(imageView, w7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.f3 f3Var2 = eb0Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                f3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                bb0Var.addView(this.f37527r, w7.z5.n(-1, 48));
                this.f37527r.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
                this.v = e9Var4;
                if (this.e != null) {
                    e9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new wa0(this, 1)));
                }
                bb0Var.addView(this.v, w7.z5.n(-1, -2));
            }
        }
        cb0 cb0Var2 = new cb0(context, 1);
        this.K = cb0Var2;
        cb0Var2.addTextChangedListener(new ab0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        cb0 cb0Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.F(cb0Var3, i14, null);
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        cb0 cb0Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(cb0Var4, i15, null);
        this.K.setTextSize(1, 16.0f);
        bb0Var.addView(this.K, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.L = e9Var5;
        e9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        bb0Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.I = caVar;
            org.telegram.ui.ActionBar.r6.i(i13, caVar, null);
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            org.telegram.ui.ActionBar.r6.W(this.I.getTextView(), org.telegram.ui.ActionBar.k6.f21405p7, null);
            this.I.setOnClickListener(new View.OnClickListener(this) {
                public final gb0 f42643b;

                {
                    this.f42643b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.va0.onClick(android.view.View):void");
                }
            });
            bb0Var.addView(this.I);
        }
        y8Var.addView(this.J, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i16 = org.telegram.ui.ActionBar.k6.f21126a7;
        org.telegram.ui.ActionBar.r6.i(i16, frameLayout, getResourceProvider());
        new ei.b4(y8Var, false, new ci.e(17));
        y8Var.addView(this.H, w7.z5.e(-1, -2, 80));
        org.telegram.ui.ActionBar.r6.i(i13, this.f37530x, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.d, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.f37529w, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.E, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.f37524c, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.F, null);
        org.telegram.ui.ActionBar.r6.i(i13, this.K, null);
        org.telegram.ui.ActionBar.r6.i(i16, y8Var, null);
        org.telegram.ui.ActionBar.r6.W(this.F, i15, null);
        org.telegram.ui.ActionBar.r6.F(this.F, i14, null);
        org.telegram.ui.ActionBar.r6.W(this.f37529w, i15, null);
        org.telegram.ui.ActionBar.r6.F(this.f37529w, i14, null);
        this.F.setCursorVisible(false);
        Y(this.e);
        y8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        bb0Var.setClipChildren(false);
        return y8Var;
    }

    @Override
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }
}
