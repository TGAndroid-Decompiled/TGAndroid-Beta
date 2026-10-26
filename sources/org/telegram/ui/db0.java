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
public final class db0 extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Cells.q4 E;
    public ya0 F;
    public org.telegram.ui.Cells.i9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ga I;
    public org.telegram.ui.Components.gp0 J;
    public ya0 K;
    public org.telegram.ui.Cells.i9 L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final int[] P;
    public final ArrayList Q;
    public final int[] R;
    public cb0 S;
    public org.telegram.ui.ActionBar.e2 T;
    public boolean U;
    public int V;
    public final int f38815a;
    public final long f38816b;
    public org.telegram.ui.Components.zw0 f38817c;
    public org.telegram.ui.Components.zw0 d;
    public TLRPC.TL_chatInviteExported e;
    public ab0 f38818f;
    public org.telegram.ui.Cells.i9 h;
    public org.telegram.ui.Cells.a9 f38819n;
    public bb0 f38820r;
    public TextView f38821s;
    public org.telegram.ui.Cells.i9 v;
    public TextView f38822w;
    public org.telegram.ui.Cells.q4 f38823x;
    public org.telegram.ui.Cells.i9 f38824y;

    public db0(int i10, long j10) {
        super(null);
        this.M = -3;
        this.O = new ArrayList();
        this.P = new int[]{3600, 86400, 604800};
        this.Q = new ArrayList();
        this.R = new int[]{1, 10, 100};
        this.f38815a = i10;
        this.f38816b = j10;
    }

    public final void W(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f38822w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.P;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = c3.h0.i(iArr[i11], i11, 1, arrayList);
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

    public final void X(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.R;
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
            i12 = c3.h0.i(iArr[i12], i12, 1, arrayList);
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
        this.f38817c.b(i13, null, strArr);
    }

    public final void Y() {
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.R;
            if (i10 < iArr.length) {
                i10 = c3.h0.i(iArr[i10], i10, 1, arrayList);
            } else {
                this.f38817c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public final void Z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        this.e = tL_chatInviteExported;
        if (this.fragmentView != null && tL_chatInviteExported != null) {
            int i11 = tL_chatInviteExported.expire_date;
            if (i11 > 0) {
                W(i11);
                this.V = ((Integer) this.O.get(this.d.getSelectedIndex())).intValue();
            } else {
                this.V = 0;
            }
            int i12 = tL_chatInviteExported.usage_limit;
            if (i12 > 0) {
                X(i12);
                this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
            }
            ab0 ab0Var = this.f38818f;
            if (ab0Var != null) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, ab0Var, null);
                this.f38818f.setChecked(tL_chatInviteExported.request_needed);
            }
            boolean z10 = true;
            a0(!tL_chatInviteExported.request_needed);
            if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
                Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
                this.K.setText(spannableStringBuilder);
            }
            org.telegram.ui.Cells.a9 a9Var = this.f38819n;
            if (a9Var != null) {
                if (tL_chatInviteExported.subscription_pricing == null) {
                    z10 = false;
                }
                a9Var.setChecked(z10);
            }
            if (tL_chatInviteExported.subscription_pricing != null) {
                ab0 ab0Var2 = this.f38818f;
                if (ab0Var2 != null) {
                    ab0Var2.setChecked(false);
                    this.f38818f.setCheckBoxIcon(R.drawable.permission_locked);
                }
                org.telegram.ui.Cells.i9 i9Var = this.h;
                if (i9Var != null) {
                    i9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                }
            }
            bb0 bb0Var = this.f38820r;
            if (bb0Var != null) {
                if (tL_chatInviteExported.subscription_pricing != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                bb0Var.setVisibility(i10);
                this.f38820r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
                this.f38820r.d.setClickable(false);
                this.f38820r.d.setFocusable(false);
                this.f38820r.d.setFocusableInTouchMode(false);
                this.f38820r.d.setLongClickable(false);
            }
        }
    }

    public final void a0(boolean z10) {
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q4 q4Var = this.E;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        q4Var.setVisibility(i10);
        org.telegram.ui.Components.zw0 zw0Var = this.f38817c;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        zw0Var.setVisibility(i11);
        ya0 ya0Var = this.F;
        if (z10) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ya0Var.setVisibility(i12);
        org.telegram.ui.Cells.i9 i9Var = this.G;
        if (z10) {
            i13 = 0;
        }
        i9Var.setVisibility(i13);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.f38815a;
        if (i12 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i12 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 8));
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (i12 == 0) {
            i10 = R.string.Create;
        } else {
            i10 = R.string.Save;
        }
        r5Var.i(LocaleController.getString(i10));
        xa0 xa0Var = new xa0(this, context);
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(context, xa0Var, this.resourceProvider, true);
        this.J = gp0Var;
        gp0Var.setDrawBackground(true);
        this.J.setOverScrollMode(0);
        a9 a9Var = new a9(this, context, 4);
        this.fragmentView = a9Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        layoutTransition.setInterpolator(2, dsVar);
        layoutTransition.setInterpolator(0, dsVar);
        layoutTransition.setInterpolator(4, dsVar);
        layoutTransition.setInterpolator(1, dsVar);
        layoutTransition.setInterpolator(3, dsVar);
        xa0Var.setLayoutTransition(layoutTransition);
        xa0Var.setOrientation(1);
        xa0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(xa0Var);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        this.f38823x = q4Var;
        q4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        xa0Var.addView(this.f38823x);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, null);
        this.d = zw0Var;
        xa0Var.addView(zw0Var);
        TextView textView = new TextView(context);
        this.f38822w = textView;
        textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f38822w.setGravity(16);
        this.f38822w.setTextSize(1, 16.0f);
        this.f38822w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f38822w.setOnClickListener(new org.telegram.ui.Components.k51(25, this, context));
        this.d.setCallback(new ta0(this, 2));
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = c3.h0.i(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        xa0Var.addView(this.f38822w, org.telegram.ui.Components.gb1.r(-1, 50));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.f38824y = i9Var;
        i9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        xa0Var.addView(this.f38824y);
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context);
        this.E = q4Var2;
        q4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        xa0Var.addView(this.E);
        org.telegram.ui.Components.zw0 zw0Var2 = new org.telegram.ui.Components.zw0(context, null);
        this.f38817c = zw0Var2;
        zw0Var2.setCallback(new ta0(this, 3));
        Y();
        xa0Var.addView(this.f38817c);
        ya0 ya0Var = new ya0(context, 0);
        this.F = ya0Var;
        ya0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new za0(this, 0));
        xa0Var.addView(this.F, org.telegram.ui.Components.gb1.r(-1, 50));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.G = i9Var2;
        i9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        xa0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f38816b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.isPublic(chat) && !chat.join_request && !chat.join_to_send) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.f38818f = a9Var2;
        int i14 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.f7.i(i14, a9Var2, null);
        this.f38818f.setTag(Integer.valueOf(i14));
        this.f38818f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f38818f.setOnClickListener(new di.g2(7, this, z10));
        xa0Var.addView(this.f38818f, org.telegram.ui.Components.gb1.r(-1, 56));
        org.telegram.ui.Cells.i9 i9Var3 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.h = i9Var3;
        if (z10) {
            this.f38818f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            i9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        xa0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.f38819n = a9Var3;
                org.telegram.ui.ActionBar.f7.i(i14, a9Var3, null);
                this.f38819n.setDrawCheckRipple(true);
                this.f38819n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.f38819n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f38819n.setEnabled(false);
                }
                this.f38819n.setOnClickListener(new org.telegram.ui.Components.k51(26, this, new Runnable[1]));
                xa0Var.addView(this.f38819n, org.telegram.ui.Components.gb1.r(-1, 48));
                TextView textView2 = new TextView(context);
                this.f38821s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(this.f38821s, org.telegram.ui.ActionBar.y6.A6, null);
                if (getConnectionsManager().isTestBackend()) {
                    i11 = R.string.RequireMonthlyFeePriceHintTest5Minutes;
                } else {
                    i11 = R.string.RequireMonthlyFeePriceHint;
                }
                bb0 bb0Var = new bb0(this, context, LocaleController.getString(i11), this.resourceProvider);
                this.f38820r = bb0Var;
                bb0Var.d.setInputType(2);
                this.f38820r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.f7.i(i14, this.f38820r, getResourceProvider());
                bb0 bb0Var2 = this.f38820r;
                bb0Var2.getClass();
                bb0Var2.d(new org.telegram.ui.Cells.g(bb0Var2, 4));
                this.f38820r.addView(this.f38821s, org.telegram.ui.Components.gb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                bb0 bb0Var3 = this.f38820r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                bb0Var3.getClass();
                ImageView imageView = new ImageView(bb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                bb0Var3.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.e3 e3Var = bb0Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                e3Var.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                xa0Var.addView(this.f38820r, org.telegram.ui.Components.gb1.r(-1, 48));
                this.f38820r.setVisibility(8);
                org.telegram.ui.Cells.i9 i9Var4 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
                this.v = i9Var4;
                if (this.e != null) {
                    i9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    i9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new wa0(this, 0)));
                }
                xa0Var.addView(this.v, org.telegram.ui.Components.gb1.r(-1, -2));
            }
        }
        ya0 ya0Var2 = new ya0(context, 1);
        this.K = ya0Var2;
        ya0Var2.addTextChangedListener(new za0(this, 1));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        ya0 ya0Var3 = this.K;
        int i15 = org.telegram.ui.ActionBar.y6.f23748y6;
        org.telegram.ui.ActionBar.f7.E(ya0Var3, i15, null);
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        ya0 ya0Var4 = this.K;
        int i16 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(ya0Var4, i16, null);
        this.K.setTextSize(1, 16.0f);
        xa0Var.addView(this.K, org.telegram.ui.Components.gb1.r(-1, 50));
        org.telegram.ui.Cells.i9 i9Var5 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.L = i9Var5;
        i9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        xa0Var.addView(this.L);
        if (i12 == 1) {
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
            this.I = gaVar;
            org.telegram.ui.ActionBar.f7.i(i14, gaVar, null);
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            org.telegram.ui.ActionBar.f7.V(this.I.getTextView(), org.telegram.ui.ActionBar.y6.f23581p7, null);
            this.I.setOnClickListener(new x50(this, 6));
            xa0Var.addView(this.I);
        }
        a9Var.addView(this.J, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23299a7, frameLayout, getResourceProvider());
        new fi.z3(a9Var, false, new di.e(17));
        a9Var.addView(this.H, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        org.telegram.ui.ActionBar.f7.i(i14, this.f38823x, null);
        org.telegram.ui.ActionBar.f7.i(i14, this.d, null);
        org.telegram.ui.ActionBar.f7.i(i14, this.f38822w, null);
        org.telegram.ui.ActionBar.f7.i(i14, this.E, null);
        org.telegram.ui.ActionBar.f7.i(i14, this.f38817c, null);
        org.telegram.ui.ActionBar.f7.i(i14, this.F, null);
        org.telegram.ui.ActionBar.f7.i(i14, this.K, null);
        org.telegram.ui.ActionBar.f7.V(this.F, i16, null);
        org.telegram.ui.ActionBar.f7.E(this.F, i15, null);
        org.telegram.ui.ActionBar.f7.V(this.f38822w, i16, null);
        org.telegram.ui.ActionBar.f7.E(this.f38822w, i15, null);
        this.F.setCursorVisible(false);
        Z(this.e);
        a9Var.setClipChildren(false);
        this.J.setClipChildren(false);
        xa0Var.setClipChildren(false);
        return a9Var;
    }

    @Override
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override
    public final org.telegram.ui.Components.gp0 getScrollViewForSimpleGlass() {
        return this.J;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
