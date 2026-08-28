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
public final class bb0 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Cells.m4 A;
    public xa0 B;
    public org.telegram.ui.Cells.b9 C;
    public FrameLayout D;
    public org.telegram.ui.Cells.ba E;
    public org.telegram.ui.Components.in0 F;
    public xa0 G;
    public org.telegram.ui.Cells.b9 H;
    public TextView I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final int[] M;
    public final ArrayList N;
    public final int[] O;
    public ab0 P;
    public org.telegram.ui.ActionBar.c2 Q;
    public boolean R;
    public int S;
    public final int f36808a;
    public final long f36809b;
    public org.telegram.ui.Components.bv0 f36810c;
    public org.telegram.ui.Components.bv0 d;
    public TLRPC.TL_chatInviteExported f36811e;
    public ya0 f36812f;
    public org.telegram.ui.Cells.b9 h;
    public org.telegram.ui.Cells.t8 f36813n;
    public za0 f36814r;
    public TextView f36815s;
    public org.telegram.ui.Cells.b9 v;
    public TextView f36816w;
    public org.telegram.ui.Cells.m4 f36817x;
    public org.telegram.ui.Cells.b9 f36818y;

    public bb0(int i9, long j10) {
        super(null);
        this.J = -3;
        this.L = new ArrayList();
        this.M = new int[]{3600, 86400, 604800};
        this.N = new ArrayList();
        this.O = new int[]{1, 10, 100};
        this.f36808a = i9;
        this.f36809b = j10;
    }

    public final void U(int i9) {
        int[] iArr;
        long j10 = i9;
        this.f36816w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i9 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            iArr = this.M;
            if (i10 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i10]) {
                arrayList.add(Integer.valueOf(currentTime));
                i11 = i10;
                z10 = true;
            }
            i10 = j3.r0.e(iArr[i10], i10, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i11 = iArr.length;
        }
        int size = arrayList.size();
        int i12 = size + 1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == size) {
                strArr[i13] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i13] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j11 < 31449600) {
                    strArr[i13] = LocaleController.getInstance().getFormatterScheduleDay().format(j10 * 1000);
                } else {
                    strArr[i13] = LocaleController.getInstance().getFormatterYear().format(j10 * 1000);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    public final void V(int i9) {
        int[] iArr;
        int i10;
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.O;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && i9 <= (i10 = iArr[i11])) {
                if (i9 != i10) {
                    arrayList.add(Integer.valueOf(i9));
                }
                i12 = i11;
                z10 = true;
            }
            i11 = j3.r0.e(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i9));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.f36810c.b(i12, null, strArr);
    }

    public final void W() {
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            int[] iArr = this.O;
            if (i9 < iArr.length) {
                i9 = j3.r0.e(iArr[i9], i9, 1, arrayList);
            } else {
                this.f36810c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void X(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i9;
        this.f36811e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i10 = tL_chatInviteExported.expire_date;
            if (i10 > 0) {
                U(i10);
                this.S = ((Integer) this.L.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.S = 0;
            }
            int i11 = tL_chatInviteExported.usage_limit;
            if (i11 > 0) {
                V(i11);
                this.B.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            ya0 ya0Var = this.f36812f;
            if (ya0Var != null) {
                ya0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                this.f36812f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            Y(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.G.getPaint().getFontMetricsInt(), false);
                this.G.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.t8 t8Var = this.f36813n;
            if (t8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                t8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                ya0 ya0Var2 = this.f36812f;
                if (ya0Var2 != null) {
                    ya0Var2.setChecked(false);
                    this.f36812f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.b9 b9Var = this.h;
                if (b9Var != null) {
                    b9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            za0 za0Var = this.f36814r;
            if (za0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                za0Var.setVisibility(i9);
                this.f36814r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f36814r.f24544b.setClickable(false);
                this.f36814r.f24544b.setFocusable(false);
                this.f36814r.f24544b.setFocusableInTouchMode(false);
                this.f36814r.f24544b.setLongClickable(false);
            }
        }
    }

    public final void Y(boolean z10) {
        int i9;
        int i10;
        int i11;
        org.telegram.ui.Cells.m4 m4Var = this.A;
        int i12 = 8;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        m4Var.setVisibility(i9);
        org.telegram.ui.Components.bv0 bv0Var = this.f36810c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bv0Var.setVisibility(i10);
        xa0 xa0Var = this.B;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        xa0Var.setVisibility(i11);
        org.telegram.ui.Cells.b9 b9Var = this.C;
        if (z10) {
            i12 = 0;
        }
        b9Var.setVisibility(i12);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i9;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f36808a;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 28));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.f5(1));
        this.I.setEllipsize(TextUtils.TruncateAt.END);
        this.I.setGravity(17);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final bb0 f43204b;

            {
                this.f43204b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua0.onClick(android.view.View):void");
            }
        });
        this.I.setSingleLine();
        if (i10 == 0) {
            this.I.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i10 == 1) {
            this.I.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.I.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        g7.g6.a(this.I);
        this.actionBar.addView(this.I, g7.e6.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        wa0 wa0Var = new wa0(this, context);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(context, wa0Var, this.resourceProvider, true);
        this.F = in0Var;
        this.actionBar.setAdaptiveBackground(in0Var);
        fh.x4 x4Var = new fh.x4(this, context, 5);
        this.fragmentView = x4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(4, grVar);
        layoutTransition.setInterpolator(1, grVar);
        layoutTransition.setInterpolator(3, grVar);
        wa0Var.setLayoutTransition(layoutTransition);
        wa0Var.setOrientation(1);
        wa0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.F.addView(wa0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f36817x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        wa0Var.addView(this.f36817x);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, null);
        this.d = bv0Var;
        wa0Var.addView(bv0Var);
        TextView textView2 = new TextView(context);
        this.f36816w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f36816w.setGravity(16);
        this.f36816w.setTextSize(1, 16.0f);
        this.f36816w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f36816w.setOnClickListener(new v80(1, this, context));
        this.d.setCallback(new ra0(this, 2));
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i11 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i11 >= iArr.length) {
                break;
            }
            i11 = j3.r0.e(iArr[i11], i11, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        wa0Var.addView(this.f36816w, g7.e6.n(-1, 50));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.f36818y = b9Var;
        b9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        wa0Var.addView(this.f36818y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.A = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        wa0Var.addView(this.A);
        org.telegram.ui.Components.bv0 bv0Var2 = new org.telegram.ui.Components.bv0(context, null);
        this.f36810c = bv0Var2;
        bv0Var2.setCallback(new ra0(this, 3));
        W();
        wa0Var.addView(this.f36810c);
        xa0 xa0Var = new xa0(context, 0);
        this.B = xa0Var;
        xa0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.B.setGravity(16);
        this.B.setTextSize(1, 16.0f);
        this.B.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.B.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.B.setInputType(2);
        this.B.addTextChangedListener(new va0(this, 1));
        wa0Var.addView(this.B, g7.e6.n(-1, 50));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.C = b9Var2;
        b9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        wa0Var.addView(this.C);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f36809b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? t8Var = new org.telegram.ui.Cells.t8(context);
        this.f36812f = t8Var;
        int i12 = org.telegram.ui.ActionBar.f6.f23001d6;
        t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.f36812f.setTag(Integer.valueOf(i12));
        this.f36812f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f36812f.setOnClickListener(new ih.b2(7, this, z10));
        wa0Var.addView(this.f36812f, g7.e6.n(-1, 56));
        org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.h = b9Var3;
        if (z10) {
            this.f36812f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            b9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        wa0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.f36811e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.f36811e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context);
                this.f36813n = t8Var2;
                t8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                this.f36813n.setDrawCheckRipple(true);
                this.f36813n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.f36811e != null) {
                    this.f36813n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f36813n.setEnabled(false);
                }
                this.f36813n.setOnClickListener(new v80(2, this, new Runnable[1]));
                wa0Var.addView(this.f36813n, g7.e6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f36815s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f36815s.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i9 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i9 = R.string.RequireMonthlyFeePriceHint;
                }
                za0 za0Var = new za0(this, context, LocaleController.getString(i9), this.resourceProvider);
                this.f36814r = za0Var;
                za0Var.f24544b.setInputType(2);
                this.f36814r.f24544b.setRawInputType(2);
                this.f36814r.setBackgroundColor(getThemedColor(i12));
                za0 za0Var2 = this.f36814r;
                za0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(za0Var2, 4);
                org.telegram.ui.Cells.h3 h3Var = za0Var2.f24544b;
                h3Var.setImeOptions(6);
                h3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.f36814r.addView(this.f36815s, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                za0 za0Var3 = this.f36814r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                za0Var3.getClass();
                ImageView imageView = new ImageView(za0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                za0Var3.addView(imageView, g7.e6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.h3 h3Var2 = za0Var3.f24544b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                h3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                wa0Var.addView(this.f36814r, g7.e6.n(-1, 48));
                this.f36814r.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
                this.v = b9Var4;
                if (this.f36811e != null) {
                    b9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    b9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new qa0(this, 2)));
                }
                wa0Var.addView(this.v, g7.e6.n(-1, -2));
            }
        }
        xa0 xa0Var2 = new xa0(context, 1);
        this.G = xa0Var2;
        xa0Var2.addTextChangedListener(new va0(this, 0));
        this.G.setCursorVisible(false);
        this.G.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.G.setGravity(16);
        this.G.setHint(LocaleController.getString(R.string.LinkNameHint));
        xa0 xa0Var3 = this.G;
        int i13 = org.telegram.ui.ActionBar.f6.f23369y6;
        xa0Var3.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        this.G.setLines(1);
        this.G.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.G.setSingleLine();
        xa0 xa0Var4 = this.G;
        int i14 = org.telegram.ui.ActionBar.f6.G6;
        xa0Var4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.G.setTextSize(1, 16.0f);
        wa0Var.addView(this.G, g7.e6.n(-1, 50));
        org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.H = b9Var5;
        b9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        wa0Var.addView(this.H);
        if (i10 == 1) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.E = baVar;
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            this.E.b(LocaleController.getString(R.string.RevokeLink), false);
            this.E.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            this.E.setOnClickListener(new View.OnClickListener(this) {
                public final bb0 f43204b;

                {
                    this.f43204b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua0.onClick(android.view.View):void");
                }
            });
            wa0Var.addView(this.E);
        }
        x4Var.addView(this.F, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        int i15 = org.telegram.ui.ActionBar.f6.f22947a7;
        frameLayout.setBackgroundColor(getThemedColor(i15));
        new kh.b4(x4Var, false, new bg.k(5));
        x4Var.addView(this.D, g7.e6.e(-1, -2, 80));
        this.f36817x.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.f36816w.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.A.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.f36810c.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.G.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        x4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.B.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        this.f36816w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.f36816w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        this.B.setCursorVisible(false);
        X(this.f36811e);
        x4Var.setClipChildren(false);
        this.F.setClipChildren(false);
        wa0Var.setClipChildren(false);
        return x4Var;
    }

    @Override
    public final void finishFragment() {
        this.F.getLayoutParams().height = this.F.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36817x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        org.telegram.ui.Cells.m4 m4Var = this.f36817x;
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(m4Var, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36810c, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36816w, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36818y, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23212p7));
        return arrayList;
    }
}
