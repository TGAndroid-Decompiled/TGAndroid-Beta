package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class ug0 extends FrameLayout {
    public final t9 A;
    public final TextView B;
    public final TextView C;
    public final nh.d D;
    public final TextView E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public iq N;
    public iq O;
    public cu P;
    public final iq[] Q;
    public final rg0 R;
    public final org.telegram.ui.fy f33222a;
    public final int f33223b;
    public final u51 f33224c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f33225e;
    public int f33226f;
    public boolean h;
    public final ArrayList f33227n;
    public int f33228r;
    public boolean f33229s;
    public boolean v;
    public String f33230w;
    public final FrameLayout f33231x;
    public final bg.y3 f33232y;

    public ug0(Context context, org.telegram.ui.fy fyVar) {
        super(context);
        this.f33225e = new ArrayList();
        this.f33227n = new ArrayList();
        this.G = -1;
        this.H = 0;
        this.K = -1;
        this.Q = new iq[1];
        this.R = new rg0(this, 1);
        this.f33222a = fyVar;
        int currentAccount = fyVar.getCurrentAccount();
        this.f33223b = currentAccount;
        u51 u51Var = new u51(context, currentAccount, 0, false, new d(this, 18), new cv(this, 11), null, null);
        this.f33224c = u51Var;
        u51Var.j(new hh.l(4, this, fyVar));
        addView(u51Var, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33231x = frameLayout;
        bg.y3 y3Var = new bg.y3(context, 6);
        this.f33232y = y3Var;
        y3Var.setOrientation(1);
        frameLayout.addView(y3Var, i7.f6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        t9 t9Var = new t9(context);
        this.A = t9Var;
        t9Var.setVisibility(8);
        y3Var.addView(t9Var, i7.f6.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        y3Var.addView(textView, i7.f6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.C = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        y3Var.addView(textView2, i7.f6.t(-2, -2, 1, 0, 9, 0, 0));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, null, true);
        this.D = o10;
        y3Var.addView(o10, i7.f6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.E = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        y3Var.addView(textView3, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        u51Var.setHideIfEmpty(false);
        u51Var.setEmptyView(frameLayout);
        u51Var.U1 = true;
        u51Var.V1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.v) {
            boolean isEmpty = TextUtils.isEmpty(this.f33230w);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f33229s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.v = true;
                    int i10 = this.f33223b;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f33230w;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f33225e;
                        if (!arrayList.isEmpty()) {
                            MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f33226f;
                            tL_channels_searchPosts.offset_id = messageObject.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f33227n;
                        if (!arrayList2.isEmpty()) {
                            MessageObject messageObject2 = (MessageObject) j7.l1.i(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f33228r;
                            tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    }
                    if (z10 && (searchPostsFlood = this.d) != null) {
                        tL_channels_searchPosts.flags |= 4;
                        j10 = searchPostsFlood.stars_amount;
                        tL_channels_searchPosts.allow_paid_stars = j10;
                    } else {
                        j10 = 0;
                    }
                    this.G = connectionsManager.sendRequest(tL_channels_searchPosts, new g7(this, messagesController, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                    d();
                    this.f33224c.U2.N(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i10 = this.K;
        int i11 = this.f33223b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.K, true);
            this.K = -1;
        }
        if (!this.I) {
            if (this.M && (!this.f33227n.isEmpty() || !this.f33229s)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.J = z10;
        }
        this.I = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.K = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new a2(this, 9));
    }

    public final void c() {
        this.f33231x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i10 = org.telegram.ui.ActionBar.g6.f23433y6;
        this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        u51 u51Var = this.f33224c;
        u51Var.setAdapter(null);
        u51Var.setAdapter(u51Var.U2);
        if (this.P != null) {
            this.P = null;
            d();
        }
    }

    public final void d() {
        float f9;
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        rg0 rg0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(rg0Var);
        int i10 = this.f33223b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.C;
        TextView textView2 = this.B;
        t9 t9Var = this.A;
        TextView textView3 = this.E;
        nh.d dVar = this.D;
        if (!isPremium) {
            t9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ug0 f32641b;

                {
                    this.f32641b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32641b.f33222a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ug0 ug0Var = this.f32641b;
                            ug0Var.D.setLoading(true);
                            ug0Var.a(true);
                            return;
                        default:
                            ug0 ug0Var2 = this.f32641b;
                            ug0Var2.D.setLoading(true);
                            ug0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f33230w);
        ArrayList arrayList = this.f33227n;
        if (!isEmpty && arrayList.isEmpty() && this.f33229s) {
            if (t9Var.getImageReceiver().getImageDrawable() == null) {
                t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
            }
            t9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.f33230w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.f33230w) && (searchPostsFlood = this.d) != null) {
            f9 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                t9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i11 = this.d.wait_till - currentTime;
                int i12 = i11 / 3600;
                int i13 = i11 - (i12 * 3600);
                int i14 = i13 / 60;
                int i15 = i13 - (i14 * 60);
                dVar.setVisibility(0);
                dVar.g(jh.ia.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.Q), true, true);
                int i16 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                if (i12 > 0) {
                    str = u3.c.d(i12, ":");
                } else {
                    str = "";
                }
                sb2.append(str);
                if (i14 < 10) {
                    valueOf = j7.l1.k(i14, "0");
                } else {
                    valueOf = Integer.valueOf(i14);
                }
                sb2.append(valueOf);
                sb2.append(":");
                if (i15 < 10) {
                    valueOf2 = j7.l1.k(i15, "0");
                } else {
                    valueOf2 = Integer.valueOf(i15);
                }
                sb2.append(valueOf2);
                dVar.f(LocaleController.formatString(i16, sb2.toString()), true);
                dVar.f17496e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final ug0 f32641b;

                    {
                        this.f32641b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f32641b.f33222a.presentFragment(new PremiumPreviewFragment(0, "search"));
                                return;
                            case 1:
                                ug0 ug0Var = this.f32641b;
                                ug0Var.D.setLoading(true);
                                ug0Var.a(true);
                                return;
                            default:
                                ug0 ug0Var2 = this.f32641b;
                                ug0Var2.D.setLoading(true);
                                ug0Var2.a(false);
                                return;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(rg0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        } else {
            f9 = 100.0f;
        }
        if (arrayList.isEmpty() && !this.v && !TextUtils.isEmpty(this.f33230w)) {
            t9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.N == null) {
                iq iqVar = new iq(R.drawable.smiles_tab_search, 0);
                this.N = iqVar;
                iqVar.setScale(0.79f, 0.79f);
            }
            if (this.P == null) {
                this.P = new cu(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false), org.telegram.ui.ActionBar.g6.l1(0.75f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false))), 1);
            }
            spannableStringBuilder.setSpan(this.N, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f33230w, dVar.getTextPaint(), AndroidUtilities.dp(f9), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.P, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.O == null) {
                iq iqVar2 = new iq(R.drawable.msg_mini_forumarrow, 0);
                this.O = iqVar2;
                iqVar2.setScale(1.05f, 1.05f);
            }
            spannableStringBuilder.setSpan(this.O, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.g(spannableStringBuilder, true, true);
            dVar.d.o(false, false, false);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ug0 f32641b;

                {
                    this.f32641b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32641b.f33222a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ug0 ug0Var = this.f32641b;
                            ug0Var.D.setLoading(true);
                            ug0Var.a(true);
                            return;
                        default:
                            ug0 ug0Var2 = this.f32641b;
                            ug0Var2.D.setLoading(true);
                            ug0Var2.a(false);
                            return;
                    }
                }
            });
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
                int i17 = searchPostsFlood2.remains;
                if (i17 < 1) {
                    i17 = searchPostsFlood2.total_daily;
                }
                textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i17));
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        t9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        dVar.setVisibility(8);
        if (this.d != null) {
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
            int i18 = searchPostsFlood3.remains;
            if (i18 < 1) {
                i18 = searchPostsFlood3.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i18));
            return;
        }
        textView3.setVisibility(8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (!this.L) {
            this.L = true;
            MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
            jh.s7.y(this.f33223b, false).p();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.f33232y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23735w).start();
    }
}
