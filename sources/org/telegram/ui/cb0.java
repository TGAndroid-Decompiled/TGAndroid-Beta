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
public final class cb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.l4 E;
    public ya0 F;
    public org.telegram.ui.Cells.d9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ba I;
    public org.telegram.ui.Components.wo0 J;
    public ya0 K;
    public org.telegram.ui.Cells.d9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public bb0 T;
    public org.telegram.ui.ActionBar.b2 U;
    public boolean V;
    public int W;
    public final int f35864a;
    public final long f35865b;
    public org.telegram.ui.Components.nw0 f35866c;
    public org.telegram.ui.Components.nw0 d;
    public TLRPC.TL_chatInviteExported e;
    public za0 f35867f;
    public org.telegram.ui.Cells.d9 h;
    public org.telegram.ui.Cells.v8 f35868n;
    public ab0 f35869r;
    public TextView f35870s;
    public org.telegram.ui.Cells.d9 v;
    public TextView f35871w;
    public org.telegram.ui.Cells.l4 f35872x;
    public org.telegram.ui.Cells.d9 f35873y;

    public cb0(int i10, long j10) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.f35864a = i10;
        this.f35865b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f35871w.setText(LocaleController.formatDateAudio(j10, false));
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
        this.f35866c.b(i13, null, strArr);
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
                this.f35866c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
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
            za0 za0Var = this.f35867f;
            if (za0Var != null) {
                za0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                this.f35867f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.v8 v8Var = this.f35868n;
            if (v8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                v8Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                za0 za0Var2 = this.f35867f;
                if (za0Var2 != null) {
                    za0Var2.setChecked(false);
                    this.f35867f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.d9 d9Var = this.h;
                if (d9Var != null) {
                    d9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            ab0 ab0Var = this.f35869r;
            if (ab0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                ab0Var.setVisibility(i10);
                this.f35869r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f35869r.f22398b.setClickable(false);
                this.f35869r.f22398b.setFocusable(false);
                this.f35869r.f22398b.setFocusableInTouchMode(false);
                this.f35869r.f22398b.setLongClickable(false);
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
        org.telegram.ui.Components.nw0 nw0Var = this.f35866c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        nw0Var.setVisibility(i11);
        ya0 ya0Var = this.F;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ya0Var.setVisibility(i12);
        org.telegram.ui.Cells.d9 d9Var = this.G;
        if (z10) {
            i13 = 0;
        }
        d9Var.setVisibility(i13);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f35864a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 6));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.h5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final cb0 f42139b;

            {
                this.f42139b = this;
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
        this.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.b6.a(this.M);
        this.actionBar.addView(this.M, w7.z5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        xa0 xa0Var = new xa0(this, context);
        org.telegram.ui.Components.wo0 wo0Var = new org.telegram.ui.Components.wo0(context, xa0Var, this.resourceProvider, true);
        this.J = wo0Var;
        this.actionBar.setAdaptiveBackground(wo0Var);
        y8 y8Var = new y8(this, context, 4);
        this.fragmentView = y8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        layoutTransition.setInterpolator(2, bsVar);
        layoutTransition.setInterpolator(0, bsVar);
        layoutTransition.setInterpolator(4, bsVar);
        layoutTransition.setInterpolator(1, bsVar);
        layoutTransition.setInterpolator(3, bsVar);
        xa0Var.setLayoutTransition(layoutTransition);
        xa0Var.setOrientation(1);
        xa0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(xa0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.f35872x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        xa0Var.addView(this.f35872x);
        org.telegram.ui.Components.nw0 nw0Var = new org.telegram.ui.Components.nw0(context, null);
        this.d = nw0Var;
        xa0Var.addView(nw0Var);
        TextView textView2 = new TextView(context);
        this.f35871w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f35871w.setGravity(16);
        this.f35871w.setTextSize(1, 16.0f);
        this.f35871w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f35871w.setOnClickListener(new org.telegram.ui.Components.g51(24, this, context));
        this.d.setCallback(new sa0(this, 2));
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
        xa0Var.addView(this.f35871w, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.f35873y = d9Var;
        d9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        xa0Var.addView(this.f35873y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.E = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        xa0Var.addView(this.E);
        org.telegram.ui.Components.nw0 nw0Var2 = new org.telegram.ui.Components.nw0(context, null);
        this.f35866c = nw0Var2;
        nw0Var2.setCallback(new sa0(this, 3));
        X();
        xa0Var.addView(this.f35866c);
        ya0 ya0Var = new ya0(context, 0);
        this.F = ya0Var;
        ya0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new wa0(this, 1));
        xa0Var.addView(this.F, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.G = d9Var2;
        d9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        xa0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f35865b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? v8Var = new org.telegram.ui.Cells.v8(context);
        this.f35867f = v8Var;
        int i13 = org.telegram.ui.ActionBar.h6.f20986d6;
        v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.f35867f.setTag(Integer.valueOf(i13));
        this.f35867f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f35867f.setOnClickListener(new ci.g2(7, this, z10));
        xa0Var.addView(this.f35867f, w7.z5.n(-1, 56));
        org.telegram.ui.Cells.d9 d9Var3 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.h = d9Var3;
        if (z10) {
            this.f35867f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            d9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        xa0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context);
                this.f35868n = v8Var2;
                v8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                this.f35868n.setDrawCheckRipple(true);
                this.f35868n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.f35868n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f35868n.setEnabled(false);
                }
                this.f35868n.setOnClickListener(new org.telegram.ui.Components.g51(25, this, new Runnable[1]));
                xa0Var.addView(this.f35868n, w7.z5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f35870s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f35870s.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                ab0 ab0Var = new ab0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f35869r = ab0Var;
                ab0Var.f22398b.setInputType(2);
                this.f35869r.f22398b.setRawInputType(2);
                this.f35869r.setBackgroundColor(getThemedColor(i13));
                ab0 ab0Var2 = this.f35869r;
                ab0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(ab0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = ab0Var2.f22398b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.t2(gVar, 2));
                this.f35869r.addView(this.f35870s, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                ab0 ab0Var3 = this.f35869r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                ab0Var3.getClass();
                ImageView imageView = new ImageView(ab0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                ab0Var3.addView(imageView, w7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = ab0Var3.f22398b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                xa0Var.addView(this.f35869r, w7.z5.n(-1, 48));
                this.f35869r.setVisibility(8);
                org.telegram.ui.Cells.d9 d9Var4 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
                this.v = d9Var4;
                if (this.e != null) {
                    d9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    d9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new ra0(this, 2)));
                }
                xa0Var.addView(this.v, w7.z5.n(-1, -2));
            }
        }
        ya0 ya0Var2 = new ya0(context, 1);
        this.K = ya0Var2;
        ya0Var2.addTextChangedListener(new wa0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        ya0 ya0Var3 = this.K;
        int i14 = org.telegram.ui.ActionBar.h6.f21374y6;
        ya0Var3.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        ya0 ya0Var4 = this.K;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        ya0Var4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.K.setTextSize(1, 16.0f);
        xa0Var.addView(this.K, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.d9 d9Var5 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.L = d9Var5;
        d9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        xa0Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.I = baVar;
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
            this.I.setOnClickListener(new View.OnClickListener(this) {
                public final cb0 f42139b;

                {
                    this.f42139b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.va0.onClick(android.view.View):void");
                }
            });
            xa0Var.addView(this.I);
        }
        y8Var.addView(this.J, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i16 = org.telegram.ui.ActionBar.h6.f20928a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new ei.b4(y8Var, false, new ci.e(17));
        y8Var.addView(this.H, w7.z5.e(-1, -2, 80));
        this.f35872x.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.f35871w.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.f35866c.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.F.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.f35871w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f35871w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.F.setCursorVisible(false);
        Y(this.e);
        y8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        xa0Var.setClipChildren(false);
        return y8Var;
    }

    @Override
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35872x, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.l4 l4Var = this.f35872x;
        int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(l4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35866c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35871w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35873y, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21374y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21207p7));
        return arrayList;
    }
}
