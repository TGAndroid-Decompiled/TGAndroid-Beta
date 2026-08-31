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
public final class ob0 extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Cells.m4 B;
    public kb0 C;
    public org.telegram.ui.Cells.a9 D;
    public FrameLayout E;
    public org.telegram.ui.Cells.aa F;
    public org.telegram.ui.Components.fo0 G;
    public kb0 H;
    public org.telegram.ui.Cells.a9 I;
    public TextView J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public final int[] N;
    public final ArrayList O;
    public final int[] P;
    public nb0 Q;
    public org.telegram.ui.ActionBar.d2 R;
    public boolean S;
    public int T;
    public final int f39703a;
    public final long f39704b;
    public org.telegram.ui.Components.vv0 f39705c;
    public org.telegram.ui.Components.vv0 d;
    public TLRPC.TL_chatInviteExported f39706e;
    public lb0 f39707f;
    public org.telegram.ui.Cells.a9 h;
    public org.telegram.ui.Cells.s8 f39708n;
    public mb0 f39709r;
    public TextView f39710s;
    public org.telegram.ui.Cells.a9 v;
    public TextView f39711w;
    public org.telegram.ui.Cells.m4 f39712x;
    public org.telegram.ui.Cells.a9 f39713y;

    public ob0(int i10, long j10) {
        super(null);
        this.K = -3;
        this.M = new ArrayList();
        this.N = new int[]{3600, 86400, 604800};
        this.O = new ArrayList();
        this.P = new int[]{1, 10, 100};
        this.f39703a = i10;
        this.f39704b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f39711w.setText(LocaleController.formatDateAudio(j10, false));
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
            i11 = yh.d(iArr[i11], i11, 1, arrayList);
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
            i12 = yh.d(iArr[i12], i12, 1, arrayList);
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
        this.f39705c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i10 < iArr.length) {
                i10 = yh.d(iArr[i10], i10, 1, arrayList);
            } else {
                this.f39705c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.f39706e = tL_chatInviteExported;
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
            lb0 lb0Var = this.f39707f;
            if (lb0Var != null) {
                lb0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                this.f39707f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z4 = true;
            Z(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.H.getPaint().getFontMetricsInt(), false);
                this.H.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.s8 s8Var = this.f39708n;
            if (s8Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z4 = false;
                }
                s8Var.setChecked(z4);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                lb0 lb0Var2 = this.f39707f;
                if (lb0Var2 != null) {
                    lb0Var2.setChecked(false);
                    this.f39707f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.a9 a9Var = this.h;
                if (a9Var != null) {
                    a9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            mb0 mb0Var = this.f39709r;
            if (mb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                mb0Var.setVisibility(i10);
                this.f39709r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f39709r.f22955b.setClickable(false);
                this.f39709r.f22955b.setFocusable(false);
                this.f39709r.f22955b.setFocusableInTouchMode(false);
                this.f39709r.f22955b.setLongClickable(false);
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
        org.telegram.ui.Components.vv0 vv0Var = this.f39705c;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        vv0Var.setVisibility(i11);
        kb0 kb0Var = this.C;
        if (z4) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        kb0Var.setVisibility(i12);
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
        int i11 = this.f39703a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 20));
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.j5(1));
        this.J.setEllipsize(TextUtils.TruncateAt.END);
        this.J.setGravity(17);
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final ob0 f37149b;

            {
                this.f37149b = this;
            }

            @Override
            public final void onClick(android.view.View r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb0.onClick(android.view.View):void");
            }
        });
        this.J.setSingleLine();
        if (i11 == 0) {
            this.J.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.J.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.J.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        this.J.setTextSize(1, 14.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        k7.e6.a(this.J);
        this.actionBar.addView(this.J, k7.c6.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        jb0 jb0Var = new jb0(this, context);
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context, jb0Var, this.resourceProvider, true);
        this.G = fo0Var;
        this.actionBar.setAdaptiveBackground(fo0Var);
        lh.j4 j4Var = new lh.j4(this, context, 5);
        this.fragmentView = j4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        layoutTransition.setInterpolator(2, prVar);
        layoutTransition.setInterpolator(0, prVar);
        layoutTransition.setInterpolator(4, prVar);
        layoutTransition.setInterpolator(1, prVar);
        layoutTransition.setInterpolator(3, prVar);
        jb0Var.setLayoutTransition(layoutTransition);
        jb0Var.setOrientation(1);
        jb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.G.addView(jb0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f39712x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        jb0Var.addView(this.f39712x);
        org.telegram.ui.Components.vv0 vv0Var = new org.telegram.ui.Components.vv0(context, null);
        this.d = vv0Var;
        jb0Var.addView(vv0Var);
        TextView textView2 = new TextView(context);
        this.f39711w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f39711w.setGravity(16);
        this.f39711w.setTextSize(1, 16.0f);
        this.f39711w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f39711w.setOnClickListener(new org.telegram.ui.Components.sx0(29, this, context));
        this.d.setCallback(new db0(this, 2));
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i12 >= iArr.length) {
                break;
            }
            i12 = yh.d(iArr[i12], i12, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        jb0Var.addView(this.f39711w, k7.c6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.f39713y = a9Var;
        a9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        jb0Var.addView(this.f39713y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.B = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        jb0Var.addView(this.B);
        org.telegram.ui.Components.vv0 vv0Var2 = new org.telegram.ui.Components.vv0(context, null);
        this.f39705c = vv0Var2;
        vv0Var2.setCallback(new db0(this, 3));
        X();
        jb0Var.addView(this.f39705c);
        kb0 kb0Var = new kb0(context, 0);
        this.C = kb0Var;
        kb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.C.setGravity(16);
        this.C.setTextSize(1, 16.0f);
        this.C.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.C.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.C.setInputType(2);
        this.C.addTextChangedListener(new ib0(this, 1));
        jb0Var.addView(this.C, k7.c6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.D = a9Var2;
        a9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        jb0Var.addView(this.D);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f39704b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z4 = true;
        } else {
            z4 = false;
        }
        ?? s8Var = new org.telegram.ui.Cells.s8(context);
        this.f39707f = s8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f21659d6;
        s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.f39707f.setTag(Integer.valueOf(i13));
        this.f39707f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f39707f.setOnClickListener(new oh.b2(7, this, z4));
        jb0Var.addView(this.f39707f, k7.c6.n(-1, 56));
        org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.h = a9Var3;
        if (z4) {
            this.f39707f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            a9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        jb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.f39706e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.f39706e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
                this.f39708n = s8Var2;
                s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                this.f39708n.setDrawCheckRipple(true);
                this.f39708n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.f39706e != null) {
                    this.f39708n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f39708n.setEnabled(false);
                }
                this.f39708n.setOnClickListener(new hb0(0, this, new Runnable[1]));
                jb0Var.addView(this.f39708n, k7.c6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f39710s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f39710s.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A6, false));
                if (getConnectionsManager().isTestBackend()) {
                    i10 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i10 = R.string.RequireMonthlyFeePriceHint;
                }
                mb0 mb0Var = new mb0(this, context, LocaleController.getString(i10), this.resourceProvider);
                this.f39709r = mb0Var;
                mb0Var.f22955b.setInputType(2);
                this.f39709r.f22955b.setRawInputType(2);
                this.f39709r.setBackgroundColor(getThemedColor(i13));
                mb0 mb0Var2 = this.f39709r;
                mb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = mb0Var2.f22955b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.t2(gVar, 2));
                this.f39709r.addView(this.f39710s, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                mb0 mb0Var3 = this.f39709r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                mb0Var3.getClass();
                ImageView imageView = new ImageView(mb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                mb0Var3.addView(imageView, k7.c6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = mb0Var3.f22955b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                jb0Var.addView(this.f39709r, k7.c6.n(-1, 48));
                this.f39709r.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
                this.v = a9Var4;
                if (this.f39706e != null) {
                    a9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    a9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new cb0(this, 2)));
                }
                jb0Var.addView(this.v, k7.c6.n(-1, -2));
            }
        }
        kb0 kb0Var2 = new kb0(context, 1);
        this.H = kb0Var2;
        kb0Var2.addTextChangedListener(new ib0(this, 0));
        this.H.setCursorVisible(false);
        this.H.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.H.setGravity(16);
        this.H.setHint(LocaleController.getString(R.string.LinkNameHint));
        kb0 kb0Var3 = this.H;
        int i14 = org.telegram.ui.ActionBar.k6.f22036y6;
        kb0Var3.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.H.setLines(1);
        this.H.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.H.setSingleLine();
        kb0 kb0Var4 = this.H;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        kb0Var4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.H.setTextSize(1, 16.0f);
        jb0Var.addView(this.H, k7.c6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.I = a9Var5;
        a9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        jb0Var.addView(this.I);
        if (i11 == 1) {
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.F = aaVar;
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            this.F.b(LocaleController.getString(R.string.RevokeLink), false);
            this.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
            this.F.setOnClickListener(new View.OnClickListener(this) {
                public final ob0 f37149b;

                {
                    this.f37149b = this;
                }

                @Override
                public final void onClick(android.view.View r19) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb0.onClick(android.view.View):void");
                }
            });
            jb0Var.addView(this.F);
        }
        j4Var.addView(this.G, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        int i16 = org.telegram.ui.ActionBar.k6.f21605a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        new qh.i3(j4Var, false, new hg.h(5));
        j4Var.addView(this.E, k7.c6.e(-1, -2, 80));
        this.f39712x.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.f39711w.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.f39705c.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.C.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.C.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.f39711w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.f39711w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.C.setCursorVisible(false);
        Y(this.f39706e);
        j4Var.setClipChildren(false);
        this.G.setClipChildren(false);
        jb0Var.setClipChildren(false);
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
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39712x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.m4 m4Var = this.f39712x;
        int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(m4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39705c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39711w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39713y, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21876p7));
        return arrayList;
    }
}
