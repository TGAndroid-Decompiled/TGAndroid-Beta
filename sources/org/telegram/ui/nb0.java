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
public final class nb0 extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Cells.m4 B;
    public jb0 C;
    public org.telegram.ui.Cells.a9 D;
    public FrameLayout E;
    public org.telegram.ui.Cells.aa F;
    public org.telegram.ui.Components.eo0 G;
    public jb0 H;
    public org.telegram.ui.Cells.a9 I;
    public TextView J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public final int[] N;
    public final ArrayList O;
    public final int[] P;
    public mb0 Q;
    public org.telegram.ui.ActionBar.d2 R;
    public boolean S;
    public int T;
    public final int f36562a;
    public final long f36563b;
    public org.telegram.ui.Components.uv0 f36564c;
    public org.telegram.ui.Components.uv0 d;
    public TLRPC.TL_chatInviteExported e;
    public kb0 f36565f;
    public org.telegram.ui.Cells.a9 h;
    public org.telegram.ui.Cells.s8 f36566n;
    public lb0 f36567r;
    public TextView f36568s;
    public org.telegram.ui.Cells.a9 v;
    public TextView f36569w;
    public org.telegram.ui.Cells.m4 f36570x;
    public org.telegram.ui.Cells.a9 f36571y;

    public nb0(int i10, long j10) {
        super(null);
        this.K = -3;
        this.M = new ArrayList();
        this.N = new int[]{3600, 86400, 604800};
        this.O = new ArrayList();
        this.P = new int[]{1, 10, 100};
        this.f36562a = i10;
        this.f36563b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f36569w.setText(LocaleController.formatDateAudio(j10, false));
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
            i11 = yh.e(iArr[i11], i11, 1, arrayList);
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
            i12 = yh.e(iArr[i12], i12, 1, arrayList);
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
        this.f36564c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i10 < iArr.length) {
                i10 = yh.e(iArr[i10], i10, 1, arrayList);
            } else {
                this.f36564c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
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
            kb0 kb0Var = this.f36565f;
            if (kb0Var != null) {
                kb0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                this.f36565f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z4 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.H.getPaint().getFontMetricsInt(), false);
                this.H.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.s8 s8Var = this.f36566n;
            if (s8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z4 = false;
                }
                s8Var.setChecked(z4);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                kb0 kb0Var2 = this.f36565f;
                if (kb0Var2 != null) {
                    kb0Var2.setChecked(false);
                    this.f36565f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.a9 a9Var = this.h;
                if (a9Var != null) {
                    a9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            lb0 lb0Var = this.f36567r;
            if (lb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                lb0Var.setVisibility(i10);
                this.f36567r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f36567r.f21199b.setClickable(false);
                this.f36567r.f21199b.setFocusable(false);
                this.f36567r.f21199b.setFocusableInTouchMode(false);
                this.f36567r.f21199b.setLongClickable(false);
            }
        }
    }

    public final void Z(boolean z4) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.m4 m4Var = this.B;
        int i13 = 8;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        m4Var.setVisibility(i10);
        org.telegram.ui.Components.uv0 uv0Var = this.f36564c;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        uv0Var.setVisibility(i11);
        jb0 jb0Var = this.C;
        if (z4) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        jb0Var.setVisibility(i12);
        org.telegram.ui.Cells.a9 a9Var = this.D;
        if (z4) {
            i13 = 0;
        }
        a9Var.setVisibility(i13);
    }

    @Override
    public final View createView(Context context) {
        boolean z4;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f36562a;
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
            public final nb0 f34208b;

            {
                this.f34208b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fb0.onClick(android.view.View):void");
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
        ib0 ib0Var = new ib0(this, context);
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0(context, ib0Var, this.resourceProvider, true);
        this.G = eo0Var;
        this.actionBar.setAdaptiveBackground(eo0Var);
        kh.j4 j4Var = new kh.j4(this, context, 5);
        this.fragmentView = j4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        layoutTransition.setInterpolator(2, nrVar);
        layoutTransition.setInterpolator(0, nrVar);
        layoutTransition.setInterpolator(4, nrVar);
        layoutTransition.setInterpolator(1, nrVar);
        layoutTransition.setInterpolator(3, nrVar);
        ib0Var.setLayoutTransition(layoutTransition);
        ib0Var.setOrientation(1);
        ib0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.G.addView(ib0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f36570x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        ib0Var.addView(this.f36570x);
        org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
        this.d = uv0Var;
        ib0Var.addView(uv0Var);
        TextView textView2 = new TextView(context);
        this.f36569w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f36569w.setGravity(16);
        this.f36569w.setTextSize(1, 16.0f);
        this.f36569w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f36569w.setOnClickListener(new org.telegram.ui.Components.rx0(29, this, context));
        this.d.setCallback(new cb0(this, 2));
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = yh.e(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        ib0Var.addView(this.f36569w, k7.b6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.f36571y = a9Var;
        a9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        ib0Var.addView(this.f36571y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.B = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        ib0Var.addView(this.B);
        org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
        this.f36564c = uv0Var2;
        uv0Var2.setCallback(new cb0(this, 3));
        X();
        ib0Var.addView(this.f36564c);
        jb0 jb0Var = new jb0(context, 0);
        this.C = jb0Var;
        jb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.C.setGravity(16);
        this.C.setTextSize(1, 16.0f);
        this.C.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.C.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.C.setInputType(2);
        this.C.addTextChangedListener(new hb0(this, 1));
        ib0Var.addView(this.C, k7.b6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.D = a9Var2;
        a9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        ib0Var.addView(this.D);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f36563b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z4 = true;
        } else {
            z4 = false;
        }
        ?? s8Var = new org.telegram.ui.Cells.s8(context);
        this.f36565f = s8Var;
        int i13 = org.telegram.ui.ActionBar.j6.f19906d6;
        s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f36565f.setTag(Integer.valueOf(i13));
        this.f36565f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f36565f.setOnClickListener(new nh.a2(7, this, z4));
        ib0Var.addView(this.f36565f, k7.b6.n(-1, 56));
        org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.h = a9Var3;
        if (z4) {
            this.f36565f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            a9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        ib0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
                this.f36566n = s8Var2;
                s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                this.f36566n.setDrawCheckRipple(true);
                this.f36566n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.f36566n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f36566n.setEnabled(false);
                }
                this.f36566n.setOnClickListener(new gb0(0, this, new Runnable[1]));
                ib0Var.addView(this.f36566n, k7.b6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f36568s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f36568s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                lb0 lb0Var = new lb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f36567r = lb0Var;
                lb0Var.f21199b.setInputType(2);
                this.f36567r.f21199b.setRawInputType(2);
                this.f36567r.setBackgroundColor(getThemedColor(i13));
                lb0 lb0Var2 = this.f36567r;
                lb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = lb0Var2.f21199b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.f36567r.addView(this.f36568s, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                lb0 lb0Var3 = this.f36567r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                lb0Var3.getClass();
                ImageView imageView = new ImageView(lb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                lb0Var3.addView(imageView, k7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = lb0Var3.f21199b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                ib0Var.addView(this.f36567r, k7.b6.n(-1, 48));
                this.f36567r.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
                this.v = a9Var4;
                if (this.e != null) {
                    a9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    a9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new bb0(this, 2)));
                }
                ib0Var.addView(this.v, k7.b6.n(-1, -2));
            }
        }
        jb0 jb0Var2 = new jb0(context, 1);
        this.H = jb0Var2;
        jb0Var2.addTextChangedListener(new hb0(this, 0));
        this.H.setCursorVisible(false);
        this.H.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.H.setGravity(16);
        this.H.setHint(LocaleController.getString(R.string.LinkNameHint));
        jb0 jb0Var3 = this.H;
        int i14 = org.telegram.ui.ActionBar.j6.f20281y6;
        jb0Var3.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.H.setLines(1);
        this.H.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.H.setSingleLine();
        jb0 jb0Var4 = this.H;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        jb0Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.H.setTextSize(1, 16.0f);
        ib0Var.addView(this.H, k7.b6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.I = a9Var5;
        a9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        ib0Var.addView(this.I);
        if (i11 == 1) {
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.F = aaVar;
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.F.b(LocaleController.getString(R.string.RevokeLink), false);
            this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
            this.F.setOnClickListener(new View.OnClickListener(this) {
                public final nb0 f34208b;

                {
                    this.f34208b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fb0.onClick(android.view.View):void");
                }
            });
            ib0Var.addView(this.F);
        }
        j4Var.addView(this.G, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        int i16 = org.telegram.ui.ActionBar.j6.f19852a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new ph.i3(j4Var, false, new gg.h(5));
        j4Var.addView(this.E, k7.b6.e(-1, -2, 80));
        this.f36570x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f36569w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f36564c.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.C.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.C.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f36569w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f36569w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.C.setCursorVisible(false);
        Y(this.e);
        j4Var.setClipChildren(false);
        this.G.setClipChildren(false);
        ib0Var.setClipChildren(false);
        return j4Var;
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36570x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.m4 m4Var = this.f36570x;
        int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(m4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36564c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36569w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36571y, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.f20122p7));
        return arrayList;
    }
}
