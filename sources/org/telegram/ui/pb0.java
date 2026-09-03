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
public final class pb0 extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Cells.l4 B;
    public lb0 C;
    public org.telegram.ui.Cells.z8 D;
    public FrameLayout E;
    public org.telegram.ui.Cells.z9 F;
    public org.telegram.ui.Components.do0 G;
    public lb0 H;
    public org.telegram.ui.Cells.z8 I;
    public TextView J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public final int[] N;
    public final ArrayList O;
    public final int[] P;
    public ob0 Q;
    public org.telegram.ui.ActionBar.d2 R;
    public boolean S;
    public int T;
    public final int f37060a;
    public final long f37061b;
    public org.telegram.ui.Components.uv0 f37062c;
    public org.telegram.ui.Components.uv0 d;
    public TLRPC.TL_chatInviteExported e;
    public mb0 f37063f;
    public org.telegram.ui.Cells.z8 h;
    public org.telegram.ui.Cells.r8 f37064n;
    public nb0 f37065r;
    public TextView f37066s;
    public org.telegram.ui.Cells.z8 v;
    public TextView f37067w;
    public org.telegram.ui.Cells.l4 f37068x;
    public org.telegram.ui.Cells.z8 f37069y;

    public pb0(int i10, long j10) {
        super(null);
        this.K = -3;
        this.M = new ArrayList();
        this.N = new int[]{3600, 86400, 604800};
        this.O = new ArrayList();
        this.P = new int[]{1, 10, 100};
        this.f37060a = i10;
        this.f37061b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f37067w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        while (true) {
            iArr = this.N;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z4 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z4 = true;
            }
            i11 = ai.d(iArr[i11], i11, 1, arrayList);
        }
        if (!z4) {
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
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i12 = 0;
        boolean z4 = false;
        int i13 = 0;
        while (true) {
            iArr = this.P;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z4 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z4 = true;
            }
            i12 = ai.d(iArr[i12], i12, 1, arrayList);
        }
        if (!z4) {
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
        this.f37062c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i10 < iArr.length) {
                i10 = ai.d(iArr[i10], i10, 1, arrayList);
            } else {
                this.f37062c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
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
                this.T = ((Integer) this.M.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.T = 0;
            }
            int i12 = tL_chatInviteExported.usage_limit;
            if (i12 > 0) {
                W(i12);
                this.C.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            mb0 mb0Var = this.f37063f;
            if (mb0Var != null) {
                mb0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                this.f37063f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z4 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.H.getPaint().getFontMetricsInt(), false);
                this.H.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.r8 r8Var = this.f37064n;
            if (r8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z4 = false;
                }
                r8Var.setChecked(z4);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                mb0 mb0Var2 = this.f37063f;
                if (mb0Var2 != null) {
                    mb0Var2.setChecked(false);
                    this.f37063f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.z8 z8Var = this.h;
                if (z8Var != null) {
                    z8Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            nb0 nb0Var = this.f37065r;
            if (nb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                nb0Var.setVisibility(i10);
                this.f37065r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f37065r.f21132b.setClickable(false);
                this.f37065r.f21132b.setFocusable(false);
                this.f37065r.f21132b.setFocusableInTouchMode(false);
                this.f37065r.f21132b.setLongClickable(false);
            }
        }
    }

    public final void Z(boolean z4) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.l4 l4Var = this.B;
        int i13 = 8;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        l4Var.setVisibility(i10);
        org.telegram.ui.Components.uv0 uv0Var = this.f37062c;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        uv0Var.setVisibility(i11);
        lb0 lb0Var = this.C;
        if (z4) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        lb0Var.setVisibility(i12);
        org.telegram.ui.Cells.z8 z8Var = this.D;
        if (z4) {
            i13 = 0;
        }
        z8Var.setVisibility(i13);
    }

    @Override
    public final View createView(Context context) {
        boolean z4;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f37060a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 20));
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.i5(1));
        this.J.setEllipsize(TextUtils.TruncateAt.END);
        this.J.setGravity(17);
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final pb0 f34628b;

            {
                this.f34628b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hb0.onClick(android.view.View):void");
            }
        });
        this.J.setSingleLine();
        if (i11 == 0) {
            this.J.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.J.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.J.setTextSize(1, 14.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        k7.d6.a(this.J);
        this.actionBar.addView(this.J, k7.b6.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        kb0 kb0Var = new kb0(this, context);
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(context, kb0Var, this.resourceProvider, true);
        this.G = do0Var;
        this.actionBar.setAdaptiveBackground(do0Var);
        kh.i4 i4Var = new kh.i4(this, context, 5);
        this.fragmentView = i4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        layoutTransition.setInterpolator(2, mrVar);
        layoutTransition.setInterpolator(0, mrVar);
        layoutTransition.setInterpolator(4, mrVar);
        layoutTransition.setInterpolator(1, mrVar);
        layoutTransition.setInterpolator(3, mrVar);
        kb0Var.setLayoutTransition(layoutTransition);
        kb0Var.setOrientation(1);
        kb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.G.addView(kb0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.f37068x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        kb0Var.addView(this.f37068x);
        org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
        this.d = uv0Var;
        kb0Var.addView(uv0Var);
        TextView textView2 = new TextView(context);
        this.f37067w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f37067w.setGravity(16);
        this.f37067w.setTextSize(1, 16.0f);
        this.f37067w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f37067w.setOnClickListener(new org.telegram.ui.Components.rx0(29, this, context));
        this.d.setCallback(new eb0(this, 2));
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = ai.d(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        kb0Var.addView(this.f37067w, k7.b6.n(-1, 50));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.f37069y = z8Var;
        z8Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        kb0Var.addView(this.f37069y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.B = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        kb0Var.addView(this.B);
        org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
        this.f37062c = uv0Var2;
        uv0Var2.setCallback(new eb0(this, 3));
        X();
        kb0Var.addView(this.f37062c);
        lb0 lb0Var = new lb0(context, 0);
        this.C = lb0Var;
        lb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.C.setGravity(16);
        this.C.setTextSize(1, 16.0f);
        this.C.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.C.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.C.setInputType(2);
        this.C.addTextChangedListener(new jb0(this, 1));
        kb0Var.addView(this.C, k7.b6.n(-1, 50));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.D = z8Var2;
        z8Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        kb0Var.addView(this.D);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37061b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z4 = true;
        } else {
            z4 = false;
        }
        ?? r8Var = new org.telegram.ui.Cells.r8(context);
        this.f37063f = r8Var;
        int i13 = org.telegram.ui.ActionBar.j6.f19881d6;
        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f37063f.setTag(Integer.valueOf(i13));
        this.f37063f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f37063f.setOnClickListener(new nh.a2(7, this, z4));
        kb0Var.addView(this.f37063f, k7.b6.n(-1, 56));
        org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.h = z8Var3;
        if (z4) {
            this.f37063f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            z8Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        kb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
                this.f37064n = r8Var2;
                r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                this.f37064n.setDrawCheckRipple(true);
                this.f37064n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.f37064n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f37064n.setEnabled(false);
                }
                this.f37064n.setOnClickListener(new ib0(0, this, new Runnable[1]));
                kb0Var.addView(this.f37064n, k7.b6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f37066s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f37066s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                nb0 nb0Var = new nb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f37065r = nb0Var;
                nb0Var.f21132b.setInputType(2);
                this.f37065r.f21132b.setRawInputType(2);
                this.f37065r.setBackgroundColor(getThemedColor(i13));
                nb0 nb0Var2 = this.f37065r;
                nb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(nb0Var2, 4);
                org.telegram.ui.Cells.f3 f3Var = nb0Var2.f21132b;
                f3Var.setImeOptions(6);
                f3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.f37065r.addView(this.f37066s, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                nb0 nb0Var3 = this.f37065r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                nb0Var3.getClass();
                ImageView imageView = new ImageView(nb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                nb0Var3.addView(imageView, k7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.f3 f3Var2 = nb0Var3.f21132b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                f3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                kb0Var.addView(this.f37065r, k7.b6.n(-1, 48));
                this.f37065r.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
                this.v = z8Var4;
                if (this.e != null) {
                    z8Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    z8Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new db0(this, 2)));
                }
                kb0Var.addView(this.v, k7.b6.n(-1, -2));
            }
        }
        lb0 lb0Var2 = new lb0(context, 1);
        this.H = lb0Var2;
        lb0Var2.addTextChangedListener(new jb0(this, 0));
        this.H.setCursorVisible(false);
        this.H.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.H.setGravity(16);
        this.H.setHint(LocaleController.getString(R.string.LinkNameHint));
        lb0 lb0Var3 = this.H;
        int i14 = org.telegram.ui.ActionBar.j6.f20256y6;
        lb0Var3.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.H.setLines(1);
        this.H.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.H.setSingleLine();
        lb0 lb0Var4 = this.H;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        lb0Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.H.setTextSize(1, 16.0f);
        kb0Var.addView(this.H, k7.b6.n(-1, 50));
        org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.I = z8Var5;
        z8Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        kb0Var.addView(this.I);
        if (i11 == 1) {
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context);
            this.F = z9Var;
            z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.F.b(LocaleController.getString(R.string.RevokeLink), false);
            this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
            this.F.setOnClickListener(new View.OnClickListener(this) {
                public final pb0 f34628b;

                {
                    this.f34628b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hb0.onClick(android.view.View):void");
                }
            });
            kb0Var.addView(this.F);
        }
        i4Var.addView(this.G, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        int i16 = org.telegram.ui.ActionBar.j6.f19827a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new ph.i3(i4Var, false, new gg.h(5));
        i4Var.addView(this.E, k7.b6.e(-1, -2, 80));
        this.f37068x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f37067w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f37062c.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.C.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        i4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.C.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f37067w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f37067w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.C.setCursorVisible(false);
        Y(this.e);
        i4Var.setClipChildren(false);
        this.G.setClipChildren(false);
        kb0Var.setClipChildren(false);
        return i4Var;
    }

    @Override
    public final void finishFragment() {
        this.G.getLayoutParams().height = this.G.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37068x, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.l4 l4Var = this.f37068x;
        int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(l4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37062c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37067w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37069y, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.f20256y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.f20097p7));
        return arrayList;
    }
}
